package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: uj */
/* JADX INFO: loaded from: classes.dex */
public final class C0784uj extends o10 {

    /* JADX INFO: renamed from: e */
    public final HashMap f4731e = new HashMap();

    @Override // p000.o10
    /* JADX INFO: renamed from: a */
    public final l10 mo1983a(Object obj) {
        return (l10) this.f4731e.get(obj);
    }

    @Override // p000.o10
    /* JADX INFO: renamed from: b */
    public final Object mo1984b(Object obj) {
        Object objMo1984b = super.mo1984b(obj);
        this.f4731e.remove(obj);
        return objMo1984b;
    }
}
