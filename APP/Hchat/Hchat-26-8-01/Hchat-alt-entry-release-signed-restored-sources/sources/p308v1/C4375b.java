package p308v1;

import gg.C1414j;
import p085fg.InterfaceC1235p;
import p129ig.AbstractC2043a;

/* JADX INFO: renamed from: v1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4375b extends C1414j implements InterfaceC1235p {

    /* JADX INFO: renamed from: n */
    public static final C4375b f14584n = new C4375b(2, AbstractC2043a.class, "max", "max(II)I", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
