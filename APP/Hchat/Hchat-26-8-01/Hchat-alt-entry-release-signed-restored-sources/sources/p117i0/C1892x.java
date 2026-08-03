package p117i0;

import ca.C0524k;
import p020b5.C0184c;
import p069f.C0925b0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p131j0.C2046b;
import p266s0.C3875e;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4666q;
import p322w0.AbstractC4671v;
import p322w0.AbstractC4672w;
import p322w0.InterfaceC4670u;

/* JADX INFO: renamed from: i0.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1892x extends AbstractC4671v implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: h */
    public final InterfaceC1220a f6284h;

    /* JADX INFO: renamed from: i */
    public final C1823e f6285i;

    /* JADX INFO: renamed from: j */
    public C1889w f6286j = new C1889w(AbstractC4662m.m9129j().mo9109g());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1892x(InterfaceC1220a interfaceC1220a, C1823e c1823e) {
        this.f6284h = interfaceC1220a;
        this.f6285i = c1823e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f6286j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: c */
    public final void mo4486c(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        this.f6286j = (C1889w) abstractC4672w;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, IGET, CONST]}, finally: {[IGET, IGET, CONST, AGET, CHECK_CAST, INVOKE, ARITH, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1889w m4652g(C1889w c1889w, AbstractC4655f abstractC4655f, boolean z9, InterfaceC1220a interfaceC1220a) {
        C2046b c2046bM4633o;
        C1889w c1889w2;
        C1823e c1823e;
        int i9;
        if (c1889w.m4650c(this, abstractC4655f)) {
            if (z9) {
                c2046bM4633o = AbstractC1874r.m4633o();
                Object[] objArr = c2046bM4633o.f6891g;
                int i10 = c2046bM4633o.f6893i;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((C1832g0) objArr[i11]).m4491b();
                }
                try {
                    C0925b0 c0925b0 = c1889w.f6269e;
                    C0184c c0184c = AbstractC1850k2.f6153a;
                    C3875e c3875e = (C3875e) c0184c.m818o();
                    if (c3875e == null) {
                        c3875e = new C3875e();
                        c0184c.m797O(c3875e);
                    }
                    int i12 = c3875e.f12724a;
                    Object[] objArr2 = c0925b0.f2895b;
                    int[] iArr = c0925b0.f2896c;
                    long[] jArr = c0925b0.f2894a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j3 = jArr[i13];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j3 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        i9 = i14;
                                        InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr2[i17];
                                        c3875e.f12724a = i12 + iArr[i17];
                                        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655f.mo9095e();
                                        if (interfaceC1231lMo9095e != null) {
                                            interfaceC1231lMo9095e.invoke(interfaceC4670u);
                                        }
                                    } else {
                                        i9 = i14;
                                    }
                                    j3 >>= i9;
                                    i16++;
                                    i14 = i9;
                                }
                                if (i15 != i14) {
                                    break;
                                }
                                if (i13 == length) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    c3875e.f12724a = i12;
                    Object[] objArr3 = c2046bM4633o.f6891g;
                    int i18 = c2046bM4633o.f6893i;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((C1832g0) objArr3[i19]).m4490a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c1889w;
        }
        C0925b0 c0925b02 = new C0925b0();
        C0184c c0184c2 = AbstractC1850k2.f6153a;
        C3875e c3875e2 = (C3875e) c0184c2.m818o();
        if (c3875e2 == null) {
            c3875e2 = new C3875e();
            c0184c2.m797O(c3875e2);
        }
        int i20 = c3875e2.f12724a;
        c2046bM4633o = AbstractC1874r.m4633o();
        Object[] objArr4 = c2046bM4633o.f6891g;
        int i21 = c2046bM4633o.f6893i;
        for (int i22 = 0; i22 < i21; i22++) {
            ((C1832g0) objArr4[i22]).m4491b();
        }
        try {
            c3875e2.f12724a = i20 + 1;
            Object objM9153j = AbstractC4666q.m9153j(new C0524k(this, c3875e2, c0925b02, i20, 3), interfaceC1220a);
            c3875e2.f12724a = i20;
            Object[] objArr5 = c2046bM4633o.f6891g;
            int i23 = c2046bM4633o.f6893i;
            for (int i24 = 0; i24 < i23; i24++) {
                ((C1832g0) objArr5[i24]).m4490a();
            }
            Object obj = AbstractC4662m.f15512c;
            synchronized (obj) {
                try {
                    AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
                    Object obj2 = c1889w.f6270f;
                    if (obj2 == C1889w.f6266h || (c1823e = this.f6285i) == null || !c1823e.m4460b(objM9153j, obj2)) {
                        C1889w c1889w3 = this.f6286j;
                        synchronized (obj) {
                            AbstractC4672w abstractC4672wM9132m = AbstractC4662m.m9132m(c1889w3, this);
                            abstractC4672wM9132m.mo4494a(c1889w3);
                            abstractC4672wM9132m.f15550a = abstractC4655fM9129j.mo9109g();
                            c1889w2 = (C1889w) abstractC4672wM9132m;
                            c1889w2.f6269e = c0925b02;
                            c1889w2.f6271g = c1889w2.m4651d(this, abstractC4655fM9129j);
                            c1889w2.f6270f = objM9153j;
                        }
                        return c1889w2;
                    }
                    c1889w.f6269e = c0925b02;
                    c1889w.f6271g = c1889w.m4651d(this, abstractC4655fM9129j);
                    c1889w2 = c1889w;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            C3875e c3875e3 = (C3875e) AbstractC1850k2.f6153a.m818o();
            if (c3875e3 == null || c3875e3.f12724a != 0) {
                return c1889w2;
            }
            AbstractC4662m.m9129j().mo9089m();
            synchronized (obj) {
                AbstractC4655f abstractC4655fM9129j2 = AbstractC4662m.m9129j();
                c1889w2.f6267c = abstractC4655fM9129j2.mo9109g();
                c1889w2.f6268d = abstractC4655fM9129j2.mo9097h();
                return c1889w2;
            }
        } finally {
            Object[] objArr6 = c2046bM4633o.f6891g;
            int i25 = c2046bM4633o.f6893i;
            for (int i26 = 0; i26 < i25; i26++) {
                ((C1832g0) objArr6[i26]).m4490a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        InterfaceC1231l interfaceC1231lMo9095e = AbstractC4662m.m9129j().mo9095e();
        if (interfaceC1231lMo9095e != null) {
            interfaceC1231lMo9095e.invoke(this);
        }
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        return m4652g((C1889w) AbstractC4662m.m9128i(this.f6286j, abstractC4655fM9129j), abstractC4655fM9129j, true, this.f6284h).f6270f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C1889w m4653h() {
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        return m4652g((C1889w) AbstractC4662m.m9128i(this.f6286j, abstractC4655fM9129j), abstractC4655fM9129j, false, this.f6284h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        C1889w c1889w = (C1889w) AbstractC4662m.m9127h(this.f6286j);
        sb2.append(c1889w.m4650c(this, AbstractC4662m.m9129j()) ? String.valueOf(c1889w.f6270f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
