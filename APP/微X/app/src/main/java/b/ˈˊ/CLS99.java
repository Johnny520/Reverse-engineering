// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS500;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class CLS99 {
    public boolean FLD489;
    public boolean FLD490;
    public String FLD491;
    public final SimpleDateFormat FLD492;
    public long FLD493;
    public String FLD494;
    public boolean FLD495;
    public final ArrayList FLD496;
    public boolean FLD497;
    public final SimpleDateFormat FLD498;
    public final ArrayList FLD499;
    public boolean FLD500;
    public int FLD501;

    // 此方法包含解密的字符串
    public CLS99() {
        this.FLD497 = false;
        this.FLD495 = false;
        this.FLD494 = Long.toHexString(System.currentTimeMillis());
        this.FLD496 = new ArrayList();
        this.FLD499 = new ArrayList();
        this.FLD492 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.FLD498 = new SimpleDateFormat("yyyy-MM-dd");
    }

    public abstract boolean MTH1929();

    public abstract void MTH1930(Activity arg1);

    public abstract boolean MTH1931();

    public final void MTH1932(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.FLD499.add(s);
    }

    // 此方法包含解密的字符串
    public JSONObject MTH1933() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("id", this.FLD494);
            jSONObject0.put("enable", this.FLD500);
            jSONObject0.put("repeat", this.FLD489);
            jSONObject0.put("type", this.FLD501);
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: this.FLD496) {
                jSONArray0.put(((String)object0));
            }
            jSONObject0.put("days", jSONArray0);
            JSONArray jSONArray1 = new JSONArray();
            for(Object object1: this.FLD499) {
                jSONArray1.put(((String)object1));
            }
            jSONObject0.put("dates", jSONArray1);
            jSONObject0.put("name", this.FLD491);
            if(this.FLD493 != 0L) {
                jSONObject0.put("x", this.FLD493);
                return jSONObject0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    public abstract String MTH1934();

    // 此方法包含解密的字符串
    public void MTH1935(JSONObject jSONObject0) {
        try {
            if(jSONObject0.has("id")) {
                this.FLD494 = jSONObject0.getString("id");
            }
            if(jSONObject0.has("enable")) {
                this.FLD500 = jSONObject0.getBoolean("enable");
            }
            if(jSONObject0.has("repeat")) {
                this.FLD489 = jSONObject0.getBoolean("repeat");
            }
            if(jSONObject0.has("type")) {
                this.FLD501 = jSONObject0.getInt("type");
            }
            if(jSONObject0.has("days")) {
                JSONArray jSONArray0 = jSONObject0.getJSONArray("days");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    String s = jSONArray0.getString(v);
                    if(!TextUtils.isEmpty(s)) {
                        this.FLD496.add(s);
                    }
                }
            }
            if(jSONObject0.has("dates")) {
                JSONArray jSONArray1 = jSONObject0.getJSONArray("dates");
                for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                    this.MTH1932(jSONArray1.getString(v1));
                }
            }
            if(jSONObject0.has("name")) {
                this.FLD491 = jSONObject0.getString("name");
            }
            if(jSONObject0.has("x")) {
                this.FLD493 = jSONObject0.getLong("x");
            }
            this.FLD490 = false;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public abstract void MTH1936();

    // 此方法包含解密的字符串
    public final ArrayList MTH1937() {
        int v9;
        Long long0;
        int v6;
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD500) {
            return arrayList0;
        }
        long v = System.currentTimeMillis();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        int v1 = calendar0.get(7);
        Date date0 = calendar0.getTime();
        if(this.FLD489) {
            for(Object object0: this.FLD496) {
                String[] arr_s = ((String)object0).split(" ");
                Calendar calendar1 = Calendar.getInstance();
                calendar1.setTime(date0);
                int v2 = Integer.parseInt(arr_s[0].substring(1));
                SimpleDateFormat simpleDateFormat0 = this.FLD498;
                if(v2 == 8) {
                    if(arr_s.length == 2) {
                        long v3 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s[1]);
                        if(v >= v3) {
                            calendar1.add(7, 1);
                            v3 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s[1]);
                        }
                        arrayList0.add(v3);
                    }
                    else if(arr_s.length > 2) {
                        if(CLS500.FLD4928.MTH6895("st_r_di")) {
                            String[] arr_s1 = arr_s[2].split("_");
                            if(arr_s1.length > 3 && "t".equals(arr_s1[3])) {
                                long v4 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s1[0]);
                                long v5 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s1[1]);
                                v6 = v1;
                                long v7 = ((long)Integer.parseInt(arr_s1[2])) * 60000L;
                                if(v < v4) {
                                    long0 = v4;
                                }
                                else if(v < v5) {
                                    long v8 = ((long)(((int)Math.floor((v - v4) / v7)))) * v7 + v4 + v7;
                                    if(v8 > v5) {
                                        calendar1.add(7, 1);
                                        v8 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s1[0]);
                                    }
                                    long0 = v8;
                                }
                                else {
                                    calendar1.add(7, 1);
                                    long0 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s1[0]);
                                }
                                arrayList0.add(long0);
                            }
                        }
                        else {
                            v6 = v1;
                        }
                        v9 = v6;
                        goto label_64;
                    }
                    v9 = v1;
                }
                else {
                    v9 = v1;
                    if(v9 == v2) {
                        long v10 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s[1]);
                        if(v >= v10) {
                            calendar1.add(7, 7);
                            v10 = this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s[1]);
                        }
                        arrayList0.add(v10);
                    }
                    else {
                        if(v9 > v2) {
                            v2 += 7;
                        }
                        calendar1.add(7, v2 - v9);
                        arrayList0.add(this.MTH1939(simpleDateFormat0.format(calendar1.getTime()) + " " + arr_s[1]));
                    }
                }
            label_64:
                v1 = v9;
            }
            return arrayList0;
        }
        for(Object object1: this.FLD499) {
            String s = (String)object1;
            try {
                long v11 = this.MTH1939(s);
                if(v > v11) {
                    continue;
                }
                arrayList0.add(v11);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return arrayList0;
    }

    public abstract void MTH1938(Activity arg1);

    public final long MTH1939(String s) {
        try {
            return this.FLD492.parse(s).getTime();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 0L;
        }
    }
}

