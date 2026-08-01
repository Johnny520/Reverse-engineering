package p076P;

import p112W2.InterfaceC1603e;
import p117X2.C1663h;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: P.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1057C extends C1663h implements InterfaceC1603e {

    /* JADX INFO: renamed from: k */
    public static final C1057C f3299k = new C1057C(2, AbstractC1784a.class, "min", "min(II)I", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
