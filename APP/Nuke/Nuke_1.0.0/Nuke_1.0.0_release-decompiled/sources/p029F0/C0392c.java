package p029F0;

import p112W2.InterfaceC1603e;
import p117X2.C1663h;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: F0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0392c extends C1663h implements InterfaceC1603e {

    /* JADX INFO: renamed from: k */
    public static final C0392c f1211k = new C0392c(2, AbstractC1784a.class, "max", "max(II)I", 1);

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
