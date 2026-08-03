package p308v1;

import p136j8.C2104o;

/* JADX INFO: renamed from: v1.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4401j1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4407l1 f14664a;

    /* JADX INFO: renamed from: b */
    public C4400j0 f14665b;

    /* JADX INFO: renamed from: c */
    public final C4398i1 f14666c = new C4398i1(this, 2);

    /* JADX INFO: renamed from: d */
    public final C4398i1 f14667d = new C4398i1(this, 0);

    /* JADX INFO: renamed from: e */
    public final C4398i1 f14668e = new C4398i1(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4401j1(InterfaceC4407l1 interfaceC4407l1) {
        this.f14664a = interfaceC4407l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C4400j0 m8855a() {
        C4400j0 c4400j0 = this.f14665b;
        if (c4400j0 != null) {
            return c4400j0;
        }
        C2104o.m5294t("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
