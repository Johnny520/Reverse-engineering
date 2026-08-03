package p255r4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3702v0 extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final EnumC3662b0 f12035k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f12036l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C3702v0(EnumC3662b0 enumC3662b0, ArrayList arrayList) {
        int iM7706n = m7706n(arrayList);
        AbstractC3682l0 abstractC3682l0 = (AbstractC3682l0) arrayList.get(0);
        super(iM7706n, m7706n(arrayList) + (abstractC3682l0.mo7644c() * arrayList.size()));
        if (enumC3662b0 == null) {
            C0353j.m1305c("itemType == null");
            throw null;
        }
        this.f12036l = arrayList;
        this.f12035k = enumC3662b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m7706n(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC3682l0) arrayList.get(0)).f11966g);
        } catch (IndexOutOfBoundsException unused) {
            C2104o.m5294t("items.size() == 0");
            return 0;
        } catch (NullPointerException unused2) {
            C0353j.m1305c("items == null");
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        Iterator it = this.f12036l.iterator();
        while (it.hasNext()) {
            ((AbstractC3682l0) it.next()).mo7638a(c3689p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return this.f12035k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        int iM7683i = i9 + this.f11966g;
        boolean z9 = true;
        int i10 = -1;
        int i11 = -1;
        for (AbstractC3682l0 abstractC3682l0 : this.f12036l) {
            int iMo7644c = abstractC3682l0.mo7644c();
            int i12 = abstractC3682l0.f11966g;
            if (z9) {
                z9 = false;
                i10 = iMo7644c;
                i11 = i12;
            } else if (iMo7644c != i10) {
                C2104o.m5297w("item size mismatch");
                return;
            } else if (i12 != i11) {
                C2104o.m5297w("item alignment mismatch");
                return;
            }
            iM7683i = abstractC3682l0.m7683i(c3680k0, iM7683i) + iMo7644c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{");
        boolean z9 = true;
        for (AbstractC3682l0 abstractC3682l0 : this.f12036l) {
            if (z9) {
                z9 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(abstractC3682l0.mo7642l());
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        ArrayList arrayList = this.f12036l;
        int size = arrayList.size();
        if (c6090d.m10829d()) {
            c6090d.m10827b(0, m7682g() + " " + this.f12035k.f11899i);
            c6090d.m10827b(4, "  size: ".concat(AbstractC0000a.m48Y0(size)));
        }
        c6090d.m10835k(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3682l0) it.next()).mo7645d(c3689p, c6090d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(C3702v0.class.getName());
        sb2.append(this.f12036l);
        return sb2.toString();
    }
}
