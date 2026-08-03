package p255r4;

import bsh.C0353j;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3664c0 extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final EnumC3662b0 f11901k;

    /* JADX INFO: renamed from: l */
    public final AbstractC3688o0 f11902l;

    /* JADX INFO: renamed from: m */
    public final AbstractC3660a0 f11903m;

    /* JADX INFO: renamed from: n */
    public final int f11904n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3664c0(EnumC3662b0 enumC3662b0, AbstractC3688o0 abstractC3688o0, AbstractC3660a0 abstractC3660a0, AbstractC3660a0 abstractC3660a02, int i9) {
        super(4, 12);
        if (enumC3662b0 == null) {
            C0353j.m1305c("type == null");
            throw null;
        }
        if (abstractC3660a0 == null) {
            C0353j.m1305c("firstItem == null");
            throw null;
        }
        if (abstractC3660a02 == null) {
            C0353j.m1305c("lastItem == null");
            throw null;
        }
        if (i9 <= 0) {
            C2104o.m5294t("itemCount <= 0");
            throw null;
        }
        this.f11901k = enumC3662b0;
        this.f11902l = abstractC3688o0;
        this.f11903m = abstractC3660a0;
        this.f11904n = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m7646n(AbstractC3688o0[] abstractC3688o0Arr, C3680k0 c3680k0) {
        if (abstractC3688o0Arr == null) {
            C0353j.m1305c("sections == null");
            return;
        }
        if (c3680k0.f11956f.size() != 0) {
            C2104o.m5294t("mapSection.items().size() != 0");
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC3688o0 abstractC3688o0 : abstractC3688o0Arr) {
            int i9 = 0;
            EnumC3662b0 enumC3662b0 = null;
            AbstractC3660a0 abstractC3660a0 = null;
            AbstractC3660a0 abstractC3660a02 = null;
            for (AbstractC3660a0 abstractC3660a03 : abstractC3688o0.mo7652c()) {
                EnumC3662b0 enumC3662b0Mo7639b = abstractC3660a03.mo7639b();
                if (enumC3662b0Mo7639b != enumC3662b0) {
                    if (i9 != 0) {
                        arrayList.add(new C3664c0(enumC3662b0, abstractC3688o0, abstractC3660a0, abstractC3660a02, i9));
                    }
                    i9 = 0;
                    abstractC3660a0 = abstractC3660a03;
                    enumC3662b0 = enumC3662b0Mo7639b;
                }
                i9++;
                abstractC3660a02 = abstractC3660a03;
            }
            if (i9 != 0) {
                arrayList.add(new C3664c0(enumC3662b0, abstractC3688o0, abstractC3660a0, abstractC3660a02, i9));
            } else if (abstractC3688o0 == c3680k0) {
                arrayList.add(new C3664c0(c3680k0));
            }
        }
        c3680k0.m7678k(new C3702v0(EnumC3662b0.f11889s, arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11877D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        EnumC3662b0 enumC3662b0 = this.f11901k;
        int i9 = enumC3662b0.f11897g;
        AbstractC3660a0 abstractC3660a0 = this.f11903m;
        AbstractC3688o0 abstractC3688o0 = this.f11902l;
        int iM7696b = abstractC3660a0 == null ? abstractC3688o0.m7696b() : abstractC3688o0.mo7674a(abstractC3660a0);
        boolean zM10829d = c6090d.m10829d();
        int i10 = this.f11904n;
        if (zM10829d) {
            c6090d.m10827b(0, m7682g() + ' ' + enumC3662b0.f11898h + " map");
            StringBuilder sb2 = new StringBuilder("  type:   ");
            sb2.append(AbstractC0000a.m46X0(i9));
            sb2.append(" // ");
            sb2.append(enumC3662b0.toString());
            c6090d.m10827b(2, sb2.toString());
            c6090d.m10827b(2, "  unused: 0");
            c6090d.m10827b(4, "  size:   ".concat(AbstractC0000a.m48Y0(i10)));
            c6090d.m10827b(4, "  offset: ".concat(AbstractC0000a.m48Y0(iM7696b)));
        }
        c6090d.m10836l(i9);
        c6090d.m10836l(0);
        c6090d.m10835k(i10);
        c6090d.m10835k(iM7696b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C3664c0.class.getName());
        sb2.append('{');
        sb2.append(this.f11902l.toString());
        sb2.append(' ');
        return AbstractC0921a.m2254q(sb2, this.f11901k.f11899i, '}');
    }

    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
    }

    public C3664c0(C3680k0 c3680k0) {
        super(4, 12);
        if (c3680k0 != null) {
            this.f11901k = EnumC3662b0.f11889s;
            this.f11902l = c3680k0;
            this.f11903m = null;
            this.f11904n = 1;
            return;
        }
        C0353j.m1305c("section == null");
        throw null;
    }
}
