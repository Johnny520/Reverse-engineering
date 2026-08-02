package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends b12 {

    /* JADX INFO: renamed from: l */
    public final cp2 f12479l;

    /* JADX INFO: renamed from: m */
    public final hx2 f12480m;

    public wf0(String str, int i) {
        super(str, null, i);
        this.f12479l = cp2.f1664g;
        this.f12480m = new hx2(new vf0(i, str, this));
    }

    @Override // p000.b12, p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return this.f12479l;
    }

    @Override // p000.b12
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yo2)) {
            return false;
        }
        yo2 yo2Var = (yo2) obj;
        return yo2Var.mo251c() == cp2.f1664g && this.f513a.equals(yo2Var.mo250b()) && t11.m5086l(AbstractC0738tl.m5314m(this), AbstractC0738tl.m5314m(yo2Var));
    }

    @Override // p000.b12
    public final int hashCode() {
        int iHashCode = this.f513a.hashCode();
        C0717t2 c0717t2 = new C0717t2(this);
        int iHashCode2 = 1;
        while (c0717t2.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c0717t2.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p000.b12, p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        return ((yo2[]) this.f12480m.getValue())[i];
    }

    @Override // p000.b12
    public final String toString() {
        return AbstractC0142du.m1165u0(new ky0(2, this), ", ", this.f513a.concat("("), ")", null, 56);
    }
}
