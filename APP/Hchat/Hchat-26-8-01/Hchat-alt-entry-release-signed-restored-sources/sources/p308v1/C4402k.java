package p308v1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: v1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4402k extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14669g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4405l[] f14670h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4402k(C4405l[] c4405lArr, int i9) {
        super(2);
        this.f14669g = i9;
        this.f14670h = c4405lArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14669g) {
            case 0:
                return Float.valueOf(AbstractC4434w.m8880d((AbstractC4374a1) obj, true, this.f14670h, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC4434w.m8880d((AbstractC4374a1) obj, false, this.f14670h, ((Number) obj2).floatValue()));
        }
    }
}
