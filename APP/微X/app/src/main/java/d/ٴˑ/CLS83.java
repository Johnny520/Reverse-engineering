// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.Spinner;
import d.ˑʽ.CLS43;
import java.util.ArrayList;

public final class CLS83 {
    public interface CLS81 {
        void MTH921(String arg1);
    }

    public final CLS82 FLD423;
    public final Spinner FLD424;
    public int FLD425;
    public final ArrayList FLD426;

    public CLS83(Activity activity0) {
        public final class CLS82 extends ArrayAdapter {
            public CLS82(Context context0, ArrayList arrayList0) {
                super(context0, 0x1090009, arrayList0);
            }

            @Override  // android.widget.ArrayAdapter
            public final View getView(int v, View view0, ViewGroup viewGroup0) {
                View view1 = super.getView(v, view0, viewGroup0);
                ((CheckedTextView)view1).setTextSize(2, 16.0f);
                if(CLS43.MTH639()) {
                    ((CheckedTextView)view1).setTextColor(CLS43.MTH646());
                }
                return view1;
            }
        }

        this.FLD425 = 0;
        Spinner spinner0 = new Spinner(activity0);
        this.FLD424 = spinner0;
        ArrayList arrayList0 = new ArrayList();
        this.FLD426 = arrayList0;
        CLS82 ˈˈ$ᐧי0 = new CLS82(activity0, arrayList0);
        this.FLD423 = ˈˈ$ᐧי0;
        ˈˈ$ᐧי0.setDropDownViewResource(0x1090009);
        spinner0.setAdapter(ˈˈ$ᐧי0);
    }
}

