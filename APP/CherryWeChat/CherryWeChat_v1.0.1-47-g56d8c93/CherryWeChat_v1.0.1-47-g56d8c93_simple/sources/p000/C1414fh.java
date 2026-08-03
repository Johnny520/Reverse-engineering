package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: fh */
/* JADX INFO: loaded from: classes.dex */
public final class C1414fh extends C1027Xw {

    /* JADX INFO: renamed from: e */
    public final HashMap f4996e;

    public C1414fh() {
        this.f4996e = new HashMap();
    }

    @Override // p000.C1027Xw
    /* JADX INFO: renamed from: a */
    public final C0898Uw mo1943a(Object r2) {
        return (C0898Uw) this.f4996e.get(r2);
    }

    @Override // p000.C1027Xw
    /* JADX INFO: renamed from: b */
    public final Object mo1944b(Object r3) {
        Object r0 = super.mo1944b(r3);
        this.f4996e.remove(r3);
        return r0;
    }
}
