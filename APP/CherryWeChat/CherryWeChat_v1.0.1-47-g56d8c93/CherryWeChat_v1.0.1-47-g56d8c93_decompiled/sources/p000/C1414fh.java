package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: fh */
/* JADX INFO: loaded from: classes.dex */
public final class C1414fh extends C1027Xw {

    /* JADX INFO: renamed from: e */
    public final HashMap f4996e = new HashMap();

    @Override // p000.C1027Xw
    /* JADX INFO: renamed from: a */
    public final C0898Uw mo1943a(Object obj) {
        return (C0898Uw) this.f4996e.get(obj);
    }

    @Override // p000.C1027Xw
    /* JADX INFO: renamed from: b */
    public final Object mo1944b(Object obj) {
        Object objMo1944b = super.mo1944b(obj);
        this.f4996e.remove(obj);
        return objMo1944b;
    }
}
