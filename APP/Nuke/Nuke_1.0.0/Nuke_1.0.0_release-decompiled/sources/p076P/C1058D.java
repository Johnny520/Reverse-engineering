package p076P;

import p112W2.InterfaceC1603e;
import p117X2.C1663h;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: P.D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1058D extends C1663h implements InterfaceC1603e {

    /* JADX INFO: renamed from: k */
    public static final C1058D f3300k = new C1058D(2, AbstractC1784a.class, "min", "min(II)I", 1);

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
