package p255r4;

import bsh.C0353j;
import p073f4.C1064a;
import p136j8.C2104o;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3682l0 extends AbstractC3660a0 implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f11966g;

    /* JADX INFO: renamed from: h */
    public int f11967h;

    /* JADX INFO: renamed from: i */
    public C3680k0 f11968i;

    /* JADX INFO: renamed from: j */
    public int f11969j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3682l0(int i9, int i10) {
        if (i9 <= 0 || ((i9 - 1) & i9) != 0) {
            C2104o.m5294t("invalid alignment");
            throw null;
        }
        if (i10 < -1) {
            C2104o.m5294t("writeSize < -1");
            throw null;
        }
        this.f11966g = i9;
        this.f11967h = i10;
        this.f11968i = null;
        this.f11969j = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: c */
    public final int mo7644c() {
        int i9 = this.f11967h;
        if (i9 >= 0) {
            return i9;
        }
        C2104o.m5297w("writeSize is unknown");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC3682l0 abstractC3682l0 = (AbstractC3682l0) obj;
        if (this == abstractC3682l0) {
            return 0;
        }
        EnumC3662b0 enumC3662b0Mo7639b = mo7639b();
        EnumC3662b0 enumC3662b0Mo7639b2 = abstractC3682l0.mo7639b();
        return enumC3662b0Mo7639b != enumC3662b0Mo7639b2 ? enumC3662b0Mo7639b.compareTo(enumC3662b0Mo7639b2) : mo7640e(abstractC3682l0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: d */
    public final void mo7645d(C3689p c3689p, C6090d c6090d) {
        c6090d.m10826a(this.f11966g);
        try {
            if (this.f11967h < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            int iM7681f = m7681f();
            if (c6090d.f24596c == iM7681f) {
                mo7643m(c3689p, c6090d);
                return;
            }
            throw new C1064a("expected cursor " + iM7681f + "; actual value: " + c6090d.f24596c, null);
        } catch (RuntimeException e6) {
            throw C1064a.m2686b("...while writing " + this, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int mo7640e(AbstractC3682l0 abstractC3682l0) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC3682l0 abstractC3682l0 = (AbstractC3682l0) obj;
        return mo7639b() == abstractC3682l0.mo7639b() && mo7640e(abstractC3682l0) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m7681f() {
        int i9 = this.f11969j;
        if (i9 < 0) {
            C0353j.m1309g("offset not yet known");
            return 0;
        }
        C3680k0 c3680k0 = this.f11968i;
        if (i9 < 0) {
            c3680k0.getClass();
            C2104o.m5294t("relative < 0");
            return 0;
        }
        int i10 = c3680k0.f11997d;
        if (i10 >= 0) {
            return i10 + i9;
        }
        C0353j.m1309g("fileOffset not yet set");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m7682g() {
        return "[" + Integer.toHexString(m7681f()) + ']';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m7683i(C3680k0 c3680k0, int i9) {
        if (i9 < 0) {
            C2104o.m5294t("offset < 0");
            return 0;
        }
        if (this.f11968i != null) {
            C0353j.m1309g("already written");
            return 0;
        }
        int i10 = this.f11966g - 1;
        int i11 = (i9 + i10) & (~i10);
        this.f11968i = c3680k0;
        this.f11969j = i11;
        mo7641j(c3680k0, i11);
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7684k(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("writeSize < 0");
        } else if (this.f11967h < 0) {
            this.f11967h = i9;
        } else {
            C2104o.m5297w("writeSize already set");
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract String mo7642l();

    /* JADX INFO: renamed from: m */
    public abstract void mo7643m(C3689p c3689p, C6090d c6090d);

    /* JADX INFO: renamed from: j */
    public void mo7641j(C3680k0 c3680k0, int i9) {
    }
}
