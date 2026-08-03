package p119i2;

import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p307v0.C4362b;
import p307v0.InterfaceC4370j;

/* JADX INFO: renamed from: i2.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1919c0 implements InterfaceC4370j {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1235p f6468g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f6469h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1919c0(InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l) {
        this.f6468g = interfaceC1235p;
        this.f6469h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4370j
    /* JADX INFO: renamed from: d */
    public final Object mo4774d(C4362b c4362b, Object obj) {
        return this.f6468g.invoke(c4362b, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4370j
    /* JADX INFO: renamed from: e */
    public final Object mo4775e(Object obj) {
        return this.f6469h.invoke(obj);
    }
}
