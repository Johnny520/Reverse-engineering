package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: wj */
/* JADX INFO: loaded from: classes.dex */
public final class C0858wj extends v10 {

    /* JADX INFO: renamed from: e */
    public final HashMap f5100e = new HashMap();

    @Override // p000.v10
    /* JADX INFO: renamed from: a */
    public final s10 mo2531a(Object obj) {
        return (s10) this.f5100e.get(obj);
    }

    @Override // p000.v10
    /* JADX INFO: renamed from: b */
    public final Object mo2532b(Object obj) {
        Object objMo2532b = super.mo2532b(obj);
        this.f5100e.remove(obj);
        return objMo2532b;
    }
}
