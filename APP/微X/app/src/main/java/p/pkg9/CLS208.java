// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.io.IOException;
import p.pkg10.CLS66;

public final class CLS208 extends CLS204 {
    public CLS208(String s) {
        super(s);
    }

    @Override  // p.pkg9.CLS204
    public final Object clone() {
        return (CLS208)((CLS204)this).super.MTH1018();
    }

    @Override  // p.pkg9.CLS204
    public final CLS204 MTH1018() {
        return (CLS208)((CLS204)this).super.MTH1018();
    }

    @Override  // p.pkg9.CLS204
    public final void MTH971(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        appendable0.append("<![CDATA[").append(((CLS190)this).MTH984("#cdata"));
    }

    @Override  // p.pkg9.CLS204
    public final void MTH978(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        try {
            appendable0.append("]]>");
        }
        catch(IOException iOException0) {
            throw new CLS66(iOException0);
        }
    }

    @Override  // p.pkg9.CLS204
    public final String MTH979() {
        return "#cdata";
    }

    @Override  // p.pkg9.CLS204
    public final CLS57 MTH985() {
        return (CLS208)((CLS204)this).super.MTH1018();
    }
}

