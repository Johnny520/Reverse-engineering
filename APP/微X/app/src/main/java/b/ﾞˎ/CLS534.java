// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Spinner;
import b.ⁱᵔ.CLS522;
import java.util.ArrayList;

public final class CLS534 {
    public interface CLS533 {
        void MTH7225(int arg1, String arg2);
    }

    public final Spinner FLD5193;
    public int FLD5194;
    public final ArrayList FLD5195;
    public final CLS532 FLD5196;
    public int FLD5197;

    public CLS534(Activity activity0) {
        public final class CLS532 extends ArrayAdapter {
            public CLS532(Context context0, ArrayList arrayList0) {
                super(context0, 0x1090009, arrayList0);
            }

            @Override  // android.widget.ArrayAdapter
            public final View getView(int v, View view0, ViewGroup viewGroup0) {
                View view1 = super.getView(v, view0, viewGroup0);
                ((CheckedTextView)view1).setTextSize(2, 16.0f);
                if(CLS522.MTH7114()) {
                    ((CheckedTextView)view1).setTextColor(CLS522.MTH7109());
                }
                return view1;
            }
        }

        this.FLD5197 = 0;
        this.FLD5194 = 0;
        Spinner spinner0 = new Spinner(activity0);
        this.FLD5193 = spinner0;
        ArrayList arrayList0 = new ArrayList();
        this.FLD5195 = arrayList0;
        CLS532 ˈˈ$ˆٴ0 = new CLS532(activity0, arrayList0);
        this.FLD5196 = ˈˈ$ˆٴ0;
        ˈˈ$ˆٴ0.setDropDownViewResource(0x1090009);
        spinner0.setAdapter(ˈˈ$ˆٴ0);
    }

    public final void MTH7227(int v) {
        if(this.FLD5197 == 0) {
            this.FLD5197 = 1;
        }
        if(v >= this.FLD5195.size()) {
            return;
        }
        this.FLD5194 = v;
        this.FLD5193.setSelection(v, true);
        this.FLD5196.notifyDataSetChanged();
    }

    public final void MTH7228(String s) {
        ArrayList arrayList0 = this.FLD5195;
        if(!arrayList0.contains(s)) {
            return;
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            if(((String)arrayList0.get(v)).equals(s)) {
                this.MTH7227(v);
                return;
            }
        }
    }
}

