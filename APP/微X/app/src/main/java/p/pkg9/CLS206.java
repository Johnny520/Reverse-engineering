// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import p.pkg6.CLS36;
import p.pkg7.CLS39;

public final class CLS206 extends CLS190 {
    public CLS206(String s, String s1, String s2) {
        CLS39.MTH871(s);
        CLS39.MTH871(s1);
        CLS39.MTH871(s2);
        ((CLS190)this).MTH1005("name", s);
        ((CLS190)this).MTH1005("publicId", s1);
        ((CLS190)this).MTH1005("systemId", s2);
        if(this.MTH1074("publicId")) {
            ((CLS190)this).MTH1005("pubSysKey", "PUBLIC");
            return;
        }
        if(this.MTH1074("systemId")) {
            ((CLS190)this).MTH1005("pubSysKey", "SYSTEM");
        }
    }

    public final boolean MTH1074(String s) {
        return !CLS36.MTH851(((CLS190)this).MTH984(s));
    }

    @Override  // p.pkg9.CLS57
    public final void MTH971(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        if(this.FLD375 > 0 && ﾞˈ$ٴʼ0.FLD405) {
            appendable0.append('\n');
        }
        appendable0.append((ﾞˈ$ٴʼ0.FLD407 != 1 || this.MTH1074("publicId") || this.MTH1074("systemId") ? "<!DOCTYPE" : "<!doctype"));
        if(this.MTH1074("name")) {
            appendable0.append(" ").append(((CLS190)this).MTH984("name"));
        }
        if(this.MTH1074("pubSysKey")) {
            appendable0.append(" ").append(((CLS190)this).MTH984("pubSysKey"));
        }
        if(this.MTH1074("publicId")) {
            appendable0.append(" \"").append(((CLS190)this).MTH984("publicId")).append('\"');
        }
        if(this.MTH1074("systemId")) {
            appendable0.append(" \"").append(((CLS190)this).MTH984("systemId")).append('\"');
        }
        appendable0.append('>');
    }

    @Override  // p.pkg9.CLS57
    public final void MTH978(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
    }

    @Override  // p.pkg9.CLS57
    public final String MTH979() {
        return "#doctype";
    }
}

