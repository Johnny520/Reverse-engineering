package p255r4;

import bsh.C0353j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import p073f4.C1064a;
import p281t3.AbstractC4106c;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3680k0 extends AbstractC3688o0 {

    /* JADX INFO: renamed from: j */
    public static final C3683m f11955j = new C3683m(2);

    /* JADX INFO: renamed from: f */
    public final ArrayList f11956f;

    /* JADX INFO: renamed from: g */
    public final HashMap f11957g;

    /* JADX INFO: renamed from: h */
    public final int f11958h;

    /* JADX INFO: renamed from: i */
    public int f11959i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3680k0(String str, C3689p c3689p, int i9, int i10) {
        super(str, c3689p, i9);
        this.f11956f = new ArrayList(100);
        this.f11957g = new HashMap(100);
        this.f11958h = i10;
        this.f11959i = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: a */
    public final int mo7674a(AbstractC3660a0 abstractC3660a0) {
        return ((AbstractC3682l0) abstractC3660a0).m7681f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: c */
    public final Collection mo7652c() {
        return this.f11956f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: e */
    public final void mo7675e() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f11956f;
            int size = arrayList.size();
            if (i9 >= size) {
                return;
            }
            while (i9 < size) {
                ((AbstractC3682l0) arrayList.get(i9)).mo7638a(this.f11995b);
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: h */
    public final int mo7676h() {
        m7698f();
        return this.f11959i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: j */
    public final void mo7677j(C6090d c6090d) {
        boolean zM10829d = c6090d.m10829d();
        boolean z9 = true;
        int iMo7644c = 0;
        for (AbstractC3682l0 abstractC3682l0 : this.f11956f) {
            if (zM10829d) {
                if (z9) {
                    z9 = false;
                } else {
                    c6090d.m10827b(0, "\n");
                }
            }
            int i9 = abstractC3682l0.f11966g - 1;
            int i10 = (~i9) & (iMo7644c + i9);
            if (iMo7644c != i10) {
                c6090d.m10839o(i10 - iMo7644c);
                iMo7644c = i10;
            }
            abstractC3682l0.mo7645d(this.f11995b, c6090d);
            iMo7644c += abstractC3682l0.mo7644c();
        }
        if (iMo7644c == this.f11959i) {
            return;
        }
        C0353j.m1309g("output size mismatch");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7678k(AbstractC3682l0 abstractC3682l0) {
        m7699g();
        try {
            if (abstractC3682l0.f11966g > this.f11996c) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f11956f.add(abstractC3682l0);
        } catch (NullPointerException unused) {
            C0353j.m1305c("item == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final synchronized AbstractC3682l0 m7679l(AbstractC3682l0 abstractC3682l0) {
        m7699g();
        AbstractC3682l0 abstractC3682l02 = (AbstractC3682l0) this.f11957g.get(abstractC3682l0);
        if (abstractC3682l02 != null) {
            return abstractC3682l02;
        }
        m7678k(abstractC3682l0);
        this.f11957g.put(abstractC3682l0, abstractC3682l0);
        return abstractC3682l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7680m() {
        m7698f();
        int iM8279b = AbstractC4106c.m8279b(this.f11958h);
        ArrayList arrayList = this.f11956f;
        if (iM8279b == 1) {
            Collections.sort(arrayList, f11955j);
        } else if (iM8279b == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo7644c = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3682l0 abstractC3682l0 = (AbstractC3682l0) arrayList.get(i9);
            try {
                int iM7683i = abstractC3682l0.m7683i(this, iMo7644c);
                if (iM7683i < iMo7644c) {
                    throw new RuntimeException("bogus place() result for " + abstractC3682l0);
                }
                iMo7644c = abstractC3682l0.mo7644c() + iM7683i;
            } catch (RuntimeException e6) {
                throw C1064a.m2686b("...while placing " + abstractC3682l0, e6);
            }
        }
        this.f11959i = iMo7644c;
    }
}
