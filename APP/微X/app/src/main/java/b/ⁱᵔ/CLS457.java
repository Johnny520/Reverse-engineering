// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS369;

public final class CLS457 implements AdapterView.OnItemClickListener {
    public final int FLD4479;
    public final String[] FLD4480;
    public final CLS369 FLD4481;

    public CLS457(CLS369 ﾞᵎ0, String[] arr_s, int v) {
        this.FLD4479 = v;
        this.FLD4481 = ﾞᵎ0;
        this.FLD4480 = arr_s;
        super();
    }

    public CLS457(String[] arr_s, CLS369 ﾞᵎ0) {
        this.FLD4479 = 0;
        super();
        this.FLD4480 = arr_s;
        this.FLD4481 = ﾞᵎ0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        String[] arr_s = this.FLD4480;
        CLS369 ﾞᵎ0 = this.FLD4481;
        switch(this.FLD4479) {
            case 0: {
                arr_s[0] = (String)ﾞᵎ0.getItem(v);
                return;
            }
            case 1: {
                try {
                    String s1 = (String)ﾞᵎ0.getItem(v);
                    ﾞᵎ0.FLD3463 = s1;
                    arr_s[0] = s1;
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                try {
                    String s2 = (String)ﾞᵎ0.getItem(v);
                    ﾞᵎ0.FLD3463 = s2;
                    arr_s[0] = s2;
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 3: {
                try {
                    String s3 = (String)ﾞᵎ0.getItem(v);
                    ﾞᵎ0.FLD3463 = s3;
                    arr_s[0] = s3;
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            default: {
                try {
                    String s = (String)ﾞᵎ0.getItem(v);
                    ﾞᵎ0.FLD3463 = s;
                    arr_s[0] = s;
                    ﾞᵎ0.notifyDataSetChanged();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

