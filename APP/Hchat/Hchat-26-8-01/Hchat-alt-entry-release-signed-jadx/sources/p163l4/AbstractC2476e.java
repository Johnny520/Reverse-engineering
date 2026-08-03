package p163l4;

import bsh.C0353j;
import p104h4.C1607u;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4477z;

/* JADX INFO: renamed from: l4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2476e implements InterfaceC2472a {

    /* JADX INFO: renamed from: a */
    public final C4453d0 f8107a;

    /* JADX INFO: renamed from: b */
    public final int f8108b;

    /* JADX INFO: renamed from: c */
    public final C4477z f8109c;

    /* JADX INFO: renamed from: d */
    public final C1607u f8110d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2476e(C4453d0 c4453d0, int i9, C4477z c4477z, C1607u c1607u) {
        if (c4453d0 == null) {
            C0353j.m1305c("definingClass == null");
            throw null;
        }
        if (c1607u == null) {
            C0353j.m1305c("attributes == null");
            throw null;
        }
        this.f8107a = c4453d0;
        this.f8108b = i9;
        this.f8109c = c4477z;
        this.f8110d = c1607u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: b */
    public final C4453d0 mo4876b() {
        return this.f8107a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: c */
    public final int mo4877c() {
        return this.f8108b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: d */
    public final C4477z mo4878d() {
        return this.f8109c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    /* JADX INFO: renamed from: e */
    public final C4451c0 mo4879e() {
        return this.f8109c.f14828h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    public final C1607u getAttributes() {
        return this.f8110d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p163l4.InterfaceC2472a
    public final C4451c0 getName() {
        return this.f8109c.f14827g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(getClass().getName());
        sb2.append('{');
        sb2.append(this.f8109c.mo4901a());
        sb2.append('}');
        return sb2.toString();
    }
}
