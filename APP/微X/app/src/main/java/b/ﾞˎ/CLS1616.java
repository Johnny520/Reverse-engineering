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

public final class CLS1616 implements CLS18 {
    public interface CLS524 {
        void MTH7175(long arg1, long arg2);
    }

    public long FLD5137;
    public final WeakReference FLD5138;
    public View FLD5139;
    public CLS1626 FLD5140;
    public String FLD5141;
    public int FLD5142;
    public long FLD5143;
    public CLS524 FLD5144;

    public CLS1616(Activity activity0) {
        this.FLD5142 = 0;
        this.FLD5143 = 0L;
        this.FLD5137 = 0L;
        this.FLD5138 = new WeakReference(activity0);
    }

    @Override  // b.ʻˑ.CLS18
    public final String getText() {
        return this.FLD5140 == null ? this.FLD5141 : this.FLD5140.getText();
    }

    public static String MTH7178(long v) {
        ContentValues contentValues0 = CLS481.MTH6696(v);
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = (int)contentValues0.getAsInteger("hours");
        int v2 = (int)contentValues0.getAsInteger("minutes");
        if(v1 != 0) {
            stringBuilder0.append(v1);
            stringBuilder0.append(CLS27.MTH889("hour"));
            stringBuilder0.append(", ");
        }
        if(v2 != 0) {
            stringBuilder0.append(v2);
            stringBuilder0.append(CLS27.MTH889("minute"));
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(contentValues0.getAsInteger("seconds"));
        stringBuilder0.append(CLS27.MTH889("second"));
        return stringBuilder0.toString();
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH798(String s) {
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH799() {
        this.FLD5140.MTH799();
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH800(String s) {
        this.FLD5141 = s;
        CLS1626 ـﹳ0 = this.FLD5140;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH800(s);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH801(int v) {
        this.FLD5142 = v;
        CLS1626 ـﹳ0 = this.FLD5140;
        if(ـﹳ0 != null) {
            ـﹳ0.MTH801(v);
        }
        View view0 = this.FLD5139;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // b.ʻˑ.CLS18
    public final void MTH802(View view0) {
        this.FLD5139 = view0;
        view0.setVisibility(this.FLD5142);
    }

    public final String MTH7184() {
        return "[" + CLS1616.MTH7178(this.FLD5143) + " , " + CLS1616.MTH7178(this.FLD5137) + "]";
    }

    @Override  // b.ʻˑ.CLS18
    public final View MTH803() {
        if(this.FLD5140 == null) {
            Activity activity0 = (Activity)this.FLD5138.get();
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH7324(new CLS67(this, activity0, ـﹳ0, 5));
            ـﹳ0.MTH800(this.FLD5141);
            ـﹳ0.MTH798(this.MTH7184());
            ـﹳ0.MTH801(this.FLD5142);
            this.FLD5140 = ـﹳ0;
        }
        return this.FLD5140.MTH803();
    }
}

