// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;

public final class CLS98 {
    public final ContextMenu FLD414;
    public final Object FLD415;

    public CLS98(Object object0) {
        if(!CLS182.MTH3470(4101562462665233205L)) {
            this.FLD415 = object0;
            return;
        }
        this.FLD414 = (ContextMenu)object0;
    }

    public final MenuItem MTH1770(int v, int v1, String s, String s1, int v2) {
        Object object1;
        if(TextUtils.isEmpty(s1)) {
            return this.MTH1773(s, v, v1);
        }
        int v3 = Integer.parseInt(s1);
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            return contextMenu0.add(v, v1, 0, s);
        }
        Object object0 = this.FLD415;
        if(object0 != null) {
            try {
                if(CLS27.MTH890(CLS370.MTH5289(0x38EBAD032B3CD335L))) {
                    object1 = CLS166.MTH3195(object0, CLS27.MTH897(CLS370.MTH5289(0x38EBAD122B3CD335L)), new Object[]{v, v1, 0, s, v3});
                }
                else {
                    object1 = CLS27.MTH890(CLS370.MTH5289(4101562243621901109L)) ? CLS166.MTH3195(object0, CLS27.MTH897(CLS370.MTH5289(0x38EBAD322B3CD335L)), new Object[]{v1, v2, s, v3, Boolean.FALSE}) : CLS166.MTH3195(object0, CLS27.MTH892(CLS370.MTH5289(4101562939406603061L), CLS370.MTH5289(4101563003831112501L)), new Object[]{v, v1, s, v3});
                }
                return (MenuItem)object1;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return this.MTH1773(s, v, v1);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final MenuItem MTH1771(int v) {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            return contextMenu0.getItem(v);
        }
        return this.FLD415 == null ? null : ((MenuItem)CLS166.MTH3195(this.FLD415, "getItem", new Object[]{v}));
    }

    // 此方法包含解密的字符串
    public final void MTH1772(int v, String s) {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            contextMenu0.add(0, v, 0, s);
            return;
        }
        Object object0 = this.FLD415;
        if(object0 != null) {
            MenuItem menuItem0 = (MenuItem)CLS166.MTH3195(object0, CLS27.MTH897("recordSightMethod2"), new Object[]{v, s});
        }
    }

    // 此方法包含解密的字符串
    public final MenuItem MTH1773(String s, int v, int v1) {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            return contextMenu0.add(v, v1, 0, s);
        }
        return this.FLD415 == null ? null : ((MenuItem)CLS166.MTH3195(this.FLD415, "add", new Object[]{v, v1, 0, s}));
    }

    // 此方法包含解密的字符串
    public final MenuItem MTH1774(int v) {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            return contextMenu0.findItem(v);
        }
        return this.FLD415 == null ? null : ((MenuItem)CLS166.MTH3195(this.FLD415, "findItem", new Object[]{v}));
    }

    // 此方法包含解密的字符串
    public final int MTH1775() {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            return contextMenu0.size();
        }
        return this.FLD415 == null ? 0 : ((int)(((Integer)CLS166.MTH3195(this.FLD415, "size", new Object[0]))));
    }

    // 此方法包含解密的字符串
    public final void MTH1776(int v) {
        ContextMenu contextMenu0 = this.FLD414;
        if(contextMenu0 != null) {
            contextMenu0.removeItem(v);
            return;
        }
        Object object0 = this.FLD415;
        if(object0 != null) {
            CLS166.MTH3195(object0, "removeItem", new Object[]{v});
        }
    }
}

