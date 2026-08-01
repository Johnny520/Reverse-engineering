// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class CLS477 implements AdapterView.OnItemClickListener {
    public final int FLD4688;
    public final Object FLD4689;
    public final Dialog[] FLD4690;
    public final boolean FLD4691;
    public final Object FLD4692;
    public final Object FLD4693;

    public CLS477(boolean z, Dialog[] arr_dialog, Object object0, Object object1, Object object2, int v) {
        this.FLD4688 = v;
        this.FLD4691 = z;
        this.FLD4690 = arr_dialog;
        this.FLD4692 = object0;
        this.FLD4689 = object1;
        this.FLD4693 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        boolean z = this.FLD4691;
        Object object0 = this.FLD4693;
        Object object1 = this.FLD4689;
        Object object2 = this.FLD4692;
        Dialog[] arr_dialog = this.FLD4690;
        if(this.FLD4688 == 0) {
            CLS7 יᐧ0 = (CLS7)object2;
            CLS369 ﾞᵎ0 = (CLS369)object1;
            LinkedHashMap linkedHashMap0 = (LinkedHashMap)object0;
            if(z) {
                try {
                    Dialog dialog0 = arr_dialog[0];
                    if(dialog0 != null) {
                        dialog0.dismiss();
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
            if(יᐧ0 != null) {
                try {
                    יᐧ0.MTH784(linkedHashMap0.get(((String)ﾞᵎ0.getItem(v))));
                    return;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            return;
        }
        if(z) {
            arr_dialog[0].dismiss();
        }
        ((int[])object2)[0] = v;
        if(v != -1) {
            CLS78 ˊﾞ0 = (CLS78)((CLS366)object0).getItem(v);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(ˊﾞ0);
            if(((CLS2)object1) != null) {
                ((CLS2)object1).MTH773("", "", arrayList0);
            }
        }
        else if(((CLS2)object1) != null) {
            ((CLS2)object1).MTH773(null, null, null);
        }
    }
}

