// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Spinner;
import java.util.ArrayList;
import t.ˆʿ.CLS46;

public final class CLS177 {
    public interface CLS176 {
        void MTH2442(String arg1);
    }

    public final Spinner FLD1257;
    public int FLD1258;
    public final ArrayList FLD1259;
    public final CLS175 FLD1260;
    public int FLD1261;

    public CLS177(Activity activity0) {
        public final class CLS175 extends ArrayAdapter {
            public CLS175(Context context0, ArrayList arrayList0) {
                super(context0, 0x1090009, arrayList0);
            }

            @Override  // android.widget.ArrayAdapter
            public final View getView(int v, View view0, ViewGroup viewGroup0) {
                View view1 = super.getView(v, view0, viewGroup0);
                ((CheckedTextView)view1).setTextSize(2, 16.0f);
                if(CLS46.MTH1455()) {
                    ((CheckedTextView)view1).setTextColor(CLS46.MTH1452());
                }
                return view1;
            }
        }

        this.FLD1261 = 0;
        this.FLD1258 = 0;
        Spinner spinner0 = new Spinner(activity0);
        this.FLD1257 = spinner0;
        ArrayList arrayList0 = new ArrayList();
        this.FLD1259 = arrayList0;
        CLS175 ᐧˉ$ˆٴ0 = new CLS175(activity0, arrayList0);
        this.FLD1260 = ᐧˉ$ˆٴ0;
        ᐧˉ$ˆٴ0.setDropDownViewResource(0x1090009);
        spinner0.setAdapter(ᐧˉ$ˆٴ0);
    }

    public final void MTH2444(int v) {
        if(this.FLD1261 == 0) {
            this.FLD1261 = 1;
        }
        if(v >= this.FLD1259.size()) {
            return;
        }
        this.FLD1258 = v;
        this.FLD1257.setSelection(v, true);
        this.FLD1260.notifyDataSetChanged();
    }

    public final void MTH2445(String s) {
        ArrayList arrayList0 = this.FLD1259;
        if(!arrayList0.contains(s)) {
            return;
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            if(((String)arrayList0.get(v)).equals(s)) {
                this.MTH2444(v);
                return;
            }
        }
    }
}

