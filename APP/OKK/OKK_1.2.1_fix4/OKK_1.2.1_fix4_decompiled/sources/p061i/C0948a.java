package p061i;

import java.util.HashMap;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0948a extends C0953f {

    /* JADX INFO: renamed from: e */
    public final HashMap f3365e = new HashMap();

    @Override // p061i.C0953f
    /* JADX INFO: renamed from: a */
    public final C0950c mo2281a(Object obj) {
        return (C0950c) this.f3365e.get(obj);
    }

    @Override // p061i.C0953f
    /* JADX INFO: renamed from: b */
    public final Object mo2282b(Object obj) {
        Object objMo2282b = super.mo2282b(obj);
        this.f3365e.remove(obj);
        return objMo2282b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2283c(Object obj, Object obj2) {
        C0950c c0950cMo2281a = mo2281a(obj);
        if (c0950cMo2281a != null) {
            return c0950cMo2281a.f3370b;
        }
        HashMap map = this.f3365e;
        C0950c c0950c = new C0950c(obj, obj2);
        this.f3379d++;
        C0950c c0950c2 = this.f3377b;
        if (c0950c2 == null) {
            this.f3376a = c0950c;
            this.f3377b = c0950c;
        } else {
            c0950c2.f3371c = c0950c;
            c0950c.f3372d = c0950c2;
            this.f3377b = c0950c;
        }
        map.put(obj, c0950c);
        return null;
    }
}
