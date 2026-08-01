// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;

public final class CLS691 extends CLS140 {
    public final int FLD782;

    public CLS691(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD782 = 900000;
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.sqldb.insert", ((CLS35)new CLS717(this, 0)));
        ʾᵢ0.MTH828("a.sqldb.insert", ((CLS35)new CLS717(this, 1)));
        ʾᵢ0.MTH828("resendcheck", ((CLS35)new CLS762(12)));
        ʾᵢ0.MTH833("onincomingdata", ((CLS37)new CLS821(((CLS140)this), 3)));
        ʾᵢ0.MTH828("oncreate_chatroom", ((CLS35)new CLS762(13)));
        ʾᵢ0.MTH828("on_add_chatroom_member", ((CLS35)new CLS762(14)));
        ʾᵢ0.MTH828("oncreate_chatroom_err", ((CLS35)new CLS762(15)));
        ʾᵢ0.MTH828("onreceive_verify_user", ((CLS35)new CLS762(16)));
        ʾᵢ0.MTH828("on_TransferPlaceOrderClass", ((CLS35)new CLS762(17)));
        ʾᵢ0.MTH833("isZombie", ((CLS37)new CLS787(28)));
    }
}

