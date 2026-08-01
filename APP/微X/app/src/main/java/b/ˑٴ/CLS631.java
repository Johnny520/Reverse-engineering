// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class CLS631 extends CLS140 {
    public final HashMap FLD560;
    public final int FLD561;
    public final Pattern FLD562;
    public final Pattern FLD563;
    public final Pattern FLD564;

    // 此方法包含解密的字符串
    public CLS631(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD562 = Pattern.compile(CLS27.MTH882("txtbombpattern1"));
        this.FLD564 = Pattern.compile(CLS27.MTH882("txtbombpattern2"));
        this.FLD563 = Pattern.compile(CLS27.MTH882("punctuationpattern"));
        this.FLD560 = new HashMap();
        this.FLD561 = 900000;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.sqldb.insert", ((CLS35)new CLS671(this, 0)));
        ʾᵢ0.MTH828("a.msgitem", ((CLS35)new CLS671(this, 1)));
        ʾᵢ0.MTH833("isBomb", ((CLS37)new CLS821(((CLS140)this), 1)));
        ʾᵢ0.MTH828("on_sysmsg_link", ((CLS35)new CLS671(this, 2)));
    }
}

