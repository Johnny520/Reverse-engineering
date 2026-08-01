// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import d.ˑʽ.CLS34;
import d.יʻ.CLS69;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;

public final class CLS179 implements CLS125 {
    public interface CLS78 {
    }

    public String FLD375;
    public View FLD376;
    public long FLD377;
    public final WeakReference FLD378;
    public int FLD379;
    public CLS188 FLD380;
    public CLS78 FLD381;

    public CLS179(Activity activity0) {
        this.FLD379 = 0;
        this.FLD377 = 0L;
        this.FLD378 = new WeakReference(activity0);
    }

    @Override  // d.ⁱٴ.CLS125
    public final String getText() {
        return this.FLD380 == null ? this.FLD375 : this.FLD380.getText();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1177(int v) {
        this.FLD379 = v;
        CLS188 ᴵʾ0 = this.FLD380;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1177(v);
        }
        View view0 = this.FLD376;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1178() {
        this.FLD380.MTH1178();
    }

    public final String MTH875() {
        ContentValues contentValues0 = CLS34.MTH571(this.FLD377);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = (int)contentValues0.getAsInteger("hours");
        int v1 = (int)contentValues0.getAsInteger("minutes");
        int v2 = (int)contentValues0.getAsInteger("seconds");
        int v3 = (int)contentValues0.getAsInteger("milliseconds");
        if(v != 0) {
            stringBuilder0.append(v);
            stringBuilder0.append(CLS69.MTH795("hour"));
            stringBuilder0.append(", ");
        }
        if(v1 != 0) {
            stringBuilder0.append(v1);
            stringBuilder0.append(CLS69.MTH795("minute"));
            stringBuilder0.append(", ");
        }
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append(CLS69.MTH795("second"));
            stringBuilder0.append(", ");
        }
        if(v3 != 0) {
            stringBuilder0.append(v3);
            stringBuilder0.append(CLS69.MTH795("millisecond"));
            stringBuilder0.append(", ");
        }
        if(v == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
            stringBuilder0.append(0);
            return stringBuilder0.toString();
        }
        stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf(","));
        return stringBuilder0.toString();
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1179(String s) {
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1180(View view0) {
        this.FLD376 = view0;
        view0.setVisibility(this.FLD379);
    }

    @Override  // d.ⁱٴ.CLS125
    public final void MTH1181(String s) {
        this.FLD375 = s;
        CLS188 ᴵʾ0 = this.FLD380;
        if(ᴵʾ0 != null) {
            ᴵʾ0.MTH1181(s);
        }
    }

    @Override  // d.ⁱٴ.CLS125
    public final View MTH1182() {
        if(this.FLD380 == null) {
            Activity activity0 = (Activity)this.FLD378.get();
            CLS188 ᴵʾ0 = new CLS188(activity0);
            ᴵʾ0.MTH1000(new CLS95(((CLS125)this), activity0, ᴵʾ0, 3));
            ᴵʾ0.MTH1181(this.FLD375);
            ᴵʾ0.MTH1179(this.MTH875());
            ᴵʾ0.MTH1177(this.FLD379);
            this.FLD380 = ᴵʾ0;
        }
        return this.FLD380.MTH1182();
    }
}

