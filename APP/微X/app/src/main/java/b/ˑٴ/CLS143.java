// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ⁱᵔ.CLS481;

public final class CLS143 implements View.OnCreateContextMenuListener {
    public final View.OnCreateContextMenuListener FLD1524;
    public final CLS167 FLD1525;

    public CLS143(View.OnCreateContextMenuListener view$OnCreateContextMenuListener0, CLS167 ᵔʾ0) {
        this.FLD1524 = view$OnCreateContextMenuListener0;
        this.FLD1525 = ᵔʾ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        CLS167 ᵔʾ0 = this.FLD1525;
        this.FLD1524.onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
        if(!CLS481.MTH6698() && view0 != null) {
            try {
                Object object0 = view0.getTag();
                if(object0 != null) {
                    int v = CLS166.MTH3181(object0, "position");
                    Object object1 = CLS166.MTH3195(CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("forwardMenuField2")), "getItem", new Object[]{v});
                    CLS21.FLD76.MTH835("a.chat.menu.oncreate2", new Object[]{30000, contextMenu0, v, object1, ᵔʾ0.FLD1585, 1});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

