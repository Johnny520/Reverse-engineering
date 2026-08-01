// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import p.pkg6.CLS36;

public class CLS204 extends CLS190 {
    public CLS204(String s) {
        this.FLD376 = s;
    }

    @Override  // p.pkg9.CLS57
    public Object clone() {
        return this.MTH1018();
    }

    @Override  // p.pkg9.CLS57
    public final String toString() {
        return ((CLS57)this).MTH983();
    }

    public CLS204 MTH1018() {
        return (CLS204)((CLS57)this).super.MTH985();
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg9.CLS57
    public void MTH971(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        boolean z6;
        boolean z3;
        boolean z2;
        CLS57 ʼˉ0 = this.FLD373;
        CLS192 יٴ0 = ʼˉ0 instanceof CLS192 ? ((CLS192)ʼˉ0) : null;
        boolean z = true;
        boolean z1 = false;
        if(ﾞˈ$ٴʼ0.FLD405) {
            if(ʼˉ0 instanceof CLS192) {
                CLS192 יٴ1 = (CLS192)ʼˉ0;
                int v1 = 0;
                while(true) {
                    if(יٴ1.FLD388.FLD186) {
                        z2 = true;
                        goto label_15;
                    }
                    יٴ1 = (CLS192)יٴ1.FLD373;
                    ++v1;
                    if(v1 >= 6 || יٴ1 == null) {
                        break;
                    }
                }
            }
            z2 = false;
        label_15:
            z3 = z2 ? false : true;
        }
        else {
            z3 = false;
        }
        if(z3) {
            boolean z4 = this.FLD375 == 0 && יٴ0 != null && יٴ0.FLD388.FLD185 || this.FLD373 instanceof CLS207;
            boolean z5 = ((CLS57)this).MTH972() == null && יٴ0 != null && יٴ0.FLD388.FLD185;
            CLS57 ʼˉ1 = ((CLS57)this).MTH972();
            if((!(ʼˉ1 instanceof CLS192) || !((CLS192)ʼˉ1).MTH1043(ﾞˈ$ٴʼ0)) && (!(ʼˉ1 instanceof CLS204) || !CLS36.MTH851(((CLS190)(((CLS204)ʼˉ1))).MTH984("#text")))) {
                z = false;
            }
            if(z && CLS36.MTH851(((CLS190)this).MTH984("#text"))) {
                return;
            }
            if(this.FLD375 == 0 && יٴ0 != null && יٴ0.FLD388.FLD173 && !CLS36.MTH851(((CLS190)this).MTH984("#text"))) {
                CLS57.MTH965(appendable0, v, ﾞˈ$ٴʼ0);
            }
            z6 = z4;
            z1 = z5;
        }
        else {
            z6 = false;
        }
        CLS60.MTH1029(appendable0, ((CLS190)this).MTH984("#text"), ﾞˈ$ٴʼ0, false, z3, z6, z1);
    }

    @Override  // p.pkg9.CLS57
    public void MTH978(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
    }

    @Override  // p.pkg9.CLS57
    public String MTH979() [...] // 潜在的解密器

    @Override  // p.pkg9.CLS57
    public CLS57 MTH985() {
        return this.MTH1018();
    }
}

