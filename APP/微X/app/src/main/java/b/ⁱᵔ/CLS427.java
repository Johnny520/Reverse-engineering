// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS427 implements AdapterView.OnItemLongClickListener {
    public final int FLD4117;
    public final CLS1626 FLD4118;
    public final Activity FLD4119;
    public final CLS335 FLD4120;
    public final ArrayList FLD4121;

    public CLS427(CLS335 ˑٴ0, Activity activity0, ArrayList arrayList0, CLS1626 ـﹳ0, int v) {
        this.FLD4117 = v;
        this.FLD4120 = ˑٴ0;
        this.FLD4119 = activity0;
        this.FLD4121 = arrayList0;
        this.FLD4118 = ـﹳ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD4119;
        CLS1626 ـﹳ0 = this.FLD4118;
        ArrayList arrayList0 = this.FLD4121;
        CLS335 ˑٴ0 = this.FLD4120;
        if(this.FLD4117 == 0) {
            CLS523.MTH7142(activity0, ((CLS11)new CLS1388(((ContentValues)ˑٴ0.getItem(v)), arrayList0, ـﹳ0, ˑٴ0)));
            return true;
        }
        CLS523.MTH7142(activity0, ((CLS11)new CLS1563(((ContentValues)ˑٴ0.getItem(v)), arrayList0, ـﹳ0, ˑٴ0)));
        return true;
    }
}

