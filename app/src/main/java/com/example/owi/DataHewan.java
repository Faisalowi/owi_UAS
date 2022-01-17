package com.example.owi;

import android.content.Context;

import com.example.owi.jenis.Anjing;
import com.example.owi.jenis.Hewan;
import com.example.owi.jenis.KuraKura;
import com.example.owi.jenis.Ular;

import java.util.ArrayList;
import java.util.List;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<KuraKura> initDataKuraKura(Context ctx) {
        List<KuraKura> kurakuras = new ArrayList<>();
        kurakuras.add(new KuraKura("Aldabra", "Pulau Aldabra",
                ctx.getString(R.string.des_aldabra), R.drawable.aldabra));
        kurakuras.add(new KuraKura("Asian", "Asia",
                ctx.getString(R.string.des_asian), R.drawable.asian));
        kurakuras.add(new KuraKura("Indian", "Indian",
                ctx.getString(R.string.des_indian), R.drawable.indian));
        return kurakuras;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",ctx.getString(R.string.des_bulldog)
                , R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",ctx.getString(R.string.des_husky)
                , R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",ctx.getString(R.string.des_kintamani)
                , R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",ctx.getString(R.string.des_samoyed)
                , R.drawable.dog_samoyed));
        return anjings;
    }

    private static List<Ular> iniDataUlar(Context ctx) {
        List<Ular> Ulars = new ArrayList<>();
        Ulars.add(new Ular(ctx.getString(R.string.piton), "Asia dan Eropa", ctx.getString(R.string.des_piton), R.drawable.piton));
        Ulars.add(new Ular(ctx.getString(R.string.mamba), "Afrika", ctx.getString(R.string.des_mamba), R.drawable.mamba));
        Ulars.add(new Ular(ctx.getString(R.string.kobra), "Asia", ctx.getString(R.string.des_kobra), R.drawable.cobra)
        );;
        return Ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKuraKura(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(iniDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
