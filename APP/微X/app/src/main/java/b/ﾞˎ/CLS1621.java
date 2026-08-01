// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS67;
import b.ⁱᵔ.CLS481;
import java.lang.ref.WeakReference;

public final class CLS1621 implements CLS18 {
    public interface CLS538 {
        void MTH7258(long arg1);
    }

    public boolean FLD5232;
    public boolean FLD5233;
    public boolean FLD5234;
    public final WeakReference FLD5235;
    public boolean FLD5236;
    public View FLD5237;
    public CLS1626 FLD5238;
    public String FLD5239;
    public int FLD5240;
    public long FLD5241;
    public CLS538 FLD5242;

    public CLS1621(Activity activity0) {
        this.FLD5240 = 0;
        this.FLD5241 = 0L;
        this.FLD5233 = false;
        this.FLD5234 = true;
        this.FLD5232 = true;
        this.FLD5236 = true;
        this.FLD5235 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5238 == null ? this.FLD5239 : this.FLD5238.getText();
    }

    public final String MTH7261() {
        ContentValues contentValues0 = CLS481.MTH6696(this.FLD5241);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = (int)contentValues0.getAsInteger("hours");
        int v1 = (int)contentValues0.getAsInteger("minutes");
        int v2 = (int)contentValues0.getAsInteger("seconds");
        int v3 = (int)contentValues0.getAsInteger("milliseconds");
        if(v != 0) {
            stringBuilder0.append(v);
            stringBuilder0.append(CLS27.MTH889("hour"));
            stringBuilder0.append(", ");
        }
        if(v1 != 0) {
            stringBuilder0.append(v1);
            stringBuilder0.append(CLS27.MTH889("minute"));
            stringBuilder0.append(", ");
        }
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append(CLS27.MTH889("second"));
            stringBuilder0.append(", ");
        }
        if(v3 != 0) {
            stringBuilder0.append(v3);
            stringBuilder0.append(CLS27.MTH889("millisecond"));
            stringBuilder0.append(", ");
        }
        if(v == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
            stringBuilder0.append(0);
            return stringBuilder0.toString();
        }
        stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf(","));
        return stringBuilder0.toString();
    }

    public final void MTH7262() {
        this.FLD5236 = false;
    }

    public final void MTH7263() {
        this.FLD5232 = false;
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
    }

    public final void MTH7265(CLS538 ˎᵢ$ˆٴ0) {
        this.FLD5242 = ˎᵢ$ˆٴ0;
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5238.MTH799();
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        this.FLD5239 = s;
        CLS1626 ـﹳ0 = this.FLD5238;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH800(s);
        }
    }

    public final void MTH7268(long v) {
        this.FLD5241 = v;
        CLS1626 ـﹳ0 = this.FLD5238;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH798(this.MTH7261());
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5240 = v;
        CLS1626 ـﹳ0 = this.FLD5238;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH801(v);
        }
        View view0 = this.FLD5237;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5237 = view0;
        view0.setVisibility(this.FLD5240);
    }

    public final void MTH7271() {
        this.FLD5234 = false;
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5238 == null) {
            Activity activity0 = (Activity)this.FLD5235.get();
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH7324(new CLS67(this, activity0, ـﹳ0, 4));
            ـﹳ0.MTH800(this.FLD5239);
            ـﹳ0.MTH798(this.MTH7261());
            ـﹳ0.MTH801(this.FLD5240);
            if(this.FLD5233) {
                ـﹳ0.FLD5301 = true;
            }
            this.FLD5238 = ـﹳ0;
        }
        return this.FLD5238.MTH803();
    }
}

