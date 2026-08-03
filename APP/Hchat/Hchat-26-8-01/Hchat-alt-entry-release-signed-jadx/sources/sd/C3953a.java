package sd;

import p233pd.AbstractC3409t;
import p233pd.EnumC3400k;
import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: sd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3953a extends AbstractC3409t {

    /* JADX INFO: renamed from: o */
    public final int f12957o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3953a(int i9) {
        super(EnumC3400k.f10974Z, 0);
        this.f12957o = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3953a c3953a = new C3953a(this.f12957o);
        m8681P(c3953a);
        return c3953a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9265i(m8692k(), " -> ", AbstractC5792m.m10487d(this.f12957o), m8679M());
    }
}
