// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

public final class CLS202 extends CLS190 {
    public CLS202(String s) {
        this.FLD376 = s;
    }

    @Override  // p.pkg9.CLS57
    public final Object clone() {
        return (CLS202)((CLS57)this).super.MTH985();
    }

    @Override  // p.pkg9.CLS57
    public final String toString() {
        return ((CLS57)this).MTH983();
    }

    @Override  // p.pkg9.CLS57
    public final void MTH971(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
        if(ﾞˈ$ٴʼ0.FLD405 && this.FLD375 == 0 && (this.FLD373 instanceof CLS192 && ((CLS192)this.FLD373).FLD388.FLD173)) {
            CLS57.MTH965(appendable0, v, ﾞˈ$ٴʼ0);
        }
        appendable0.append("<!--").append(((CLS190)this).MTH984("#comment")).append("-->");
    }

    @Override  // p.pkg9.CLS57
    public final void MTH978(Appendable appendable0, int v, CLS62 ﾞˈ$ٴʼ0) {
    }

    @Override  // p.pkg9.CLS57
    public final String MTH979() {
        return "#comment";
    }

    @Override  // p.pkg9.CLS57
    public final CLS57 MTH985() {
        return (CLS202)((CLS57)this).super.MTH985();
    }
}

