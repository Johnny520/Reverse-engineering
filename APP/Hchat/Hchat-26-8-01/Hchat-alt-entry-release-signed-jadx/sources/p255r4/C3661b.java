package p255r4;

import bsh.C0353j;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import p000a.AbstractC0000a;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p282t4.C4114a;
import p282t4.C4115b;
import p282t4.C4117d;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3661b extends AbstractC3682l0 {

    /* JADX INFO: renamed from: k */
    public final C4115b f11872k;

    /* JADX INFO: renamed from: l */
    public final C3659a[] f11873l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C3661b(C4115b c4115b, C3689p c3689p) {
        try {
            TreeMap treeMap = c4115b.f13617h;
            super(4, (treeMap.size() * 4) + 4);
            this.f11872k = c4115b;
            this.f11873l = new C3659a[treeMap.size()];
            Iterator it = Collections.unmodifiableCollection(treeMap.values()).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                this.f11873l[i9] = new C3659a(c3689p, (C4114a) it.next());
                i9++;
            }
        } catch (NullPointerException unused) {
            C0353j.m1305c("list == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: a */
    public final void mo7638a(C3689p c3689p) {
        C3680k0 c3680k0 = c3689p.f12013o;
        C3659a[] c3659aArr = this.f11873l;
        int length = c3659aArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            c3659aArr[i9] = (C3659a) c3680k0.m7679l(c3659aArr[i9]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3660a0
    /* JADX INFO: renamed from: b */
    public final EnumC3662b0 mo7639b() {
        return EnumC3662b0.f11892v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: e */
    public final int mo7640e(AbstractC3682l0 abstractC3682l0) {
        return this.f11872k.compareTo(((C3661b) abstractC3682l0).f11872k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11872k.f13617h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: j */
    public final void mo7641j(C3680k0 c3680k0, int i9) {
        Arrays.sort(this.f11873l, C3659a.f11868n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: l */
    public final String mo7642l() {
        return this.f11872k.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3682l0
    /* JADX INFO: renamed from: m */
    public final void mo7643m(C3689p c3689p, C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        C3659a[] c3659aArr = this.f11873l;
        int length = c3659aArr.length;
        if (zM10829d) {
            c6090d.m10827b(0, m7682g().concat(" annotation set"));
            c6090d.m10827b(4, "  size: ".concat(AbstractC0000a.m48Y0(length)));
        }
        c6090d.m10835k(length);
        for (int i9 = 0; i9 < length; i9++) {
            int iM7681f = c3659aArr[i9].m7681f();
            if (zM10829d) {
                c6090d.m10827b(4, "  entries[" + Integer.toHexString(i9) + "]: " + AbstractC0000a.m48Y0(iM7681f));
                C3659a c3659a = c3659aArr[i9];
                c3659a.getClass();
                C4114a c4114a = c3659a.f11869k;
                c6090d.m10827b(0, "    visibility: ".concat(AbstractC3199a.m6830c(c4114a.f13614i)));
                c6090d.m10827b(0, "    type: " + c4114a.f13613h.f14784g.mo4901a());
                for (C4117d c4117d : Collections.unmodifiableCollection(c4114a.f13615j.values())) {
                    c6090d.m10827b(0, "    " + c4117d.f13619g.mo4901a() + ": " + C3315t.m7008q(c4117d.f13620h));
                }
            }
            c6090d.m10835k(iM7681f);
        }
    }
}
