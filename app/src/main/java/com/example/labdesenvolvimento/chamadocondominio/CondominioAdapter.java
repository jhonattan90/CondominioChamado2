package com.example.labdesenvolvimento.chamadocondominio;

/**
 * Created by Lab. Desenvolvimento on 13/04/2017.
 */

public class CondominioAdapter extends ArrayAdapter<Condominio>  {
    private List<Condominio> condominios;
    private int layout;

    public CondominioAdapter(Context context, int resource, List<Condominio> condominios){
        super(context,resource,condominios);
        this.condominios = condominios;
        layout = resource;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent){
        View localView = contentView;

        if(localView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            localView = inflater.inflate(layout,null);
        }

        Condominio clube = condominios.get(position);

        if(condominios != null){
            TextView textID = (TextView) localView.findViewById(R.id.textID);
            TextView textMorador = (TextView) localView.findViewById(R.id.textNome);
            TextView textApartamento = (TextView) localView.findViewById(R.id.textCidade);
            TextView textBloco = (TextView) localView.findViewById(R.id.textAno);

            if(textID != null){
                textID.setText(String.valueOf(condominio.getID()));
            }
            if(textMorador != null){
                textMorador.setText(morador.getMorador());
            }
            if(textApartamento != null){
                textApartamento.setText(morador.getMorador());
            }
            if(textBloco != null){
                textBloco.setText(String.valueOf(morador.getBloco()));
            }
        }
        return localView;
    }
}
