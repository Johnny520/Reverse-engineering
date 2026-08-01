// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import d.ᐧי.CLS113;
import java.util.HashSet;

public final class CLS30 implements AdapterView.OnItemClickListener {
    public final HashSet FLD141;
    public final CLS113 FLD142;

    public CLS30(CLS113 ᵎʻ0, HashSet hashSet0) {
        this.FLD142 = ᵎʻ0;
        this.FLD141 = hashSet0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        boolean z = this.FLD142.MTH1131(v);
        this.FLD142.MTH1133(v, !z);
        this.FLD142.notifyDataSetChanged();
        String s = ((ContentValues)this.FLD142.getItem(v)).getAsString("key");
        boolean z1 = this.FLD142.MTH1131(v);
        HashSet hashSet0 = this.FLD141;
        if(z1) {
            hashSet0.add(s);
            return;
        }
        hashSet0.remove(s);
    }
}

