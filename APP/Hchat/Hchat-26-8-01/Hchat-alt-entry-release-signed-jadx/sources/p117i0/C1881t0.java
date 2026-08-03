package p117i0;

import p085fg.InterfaceC1231l;
import p322w0.AbstractC4662m;
import p322w0.C4654e;
import p322w0.C4659j;

/* JADX INFO: renamed from: i0.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1881t0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6251g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f6252h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1881t0(InterfaceC1231l interfaceC1231l, int i9) {
        this.f6251g = i9;
        this.f6252h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        long j3;
        switch (this.f6251g) {
            case 0:
                return this.f6252h.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                C4659j c4659j = (C4659j) obj;
                synchronized (AbstractC4662m.f15512c) {
                    j3 = AbstractC4662m.f15514e;
                    AbstractC4662m.f15514e = ((long) 1) + j3;
                }
                return new C4654e(j3, c4659j, this.f6252h);
        }
    }
}
