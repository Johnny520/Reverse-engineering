package p233q;

import java.util.List;
import p010a9.InterfaceC0189q;
import p080f9.AbstractC2368o;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p219p.EnumC5898w0;
import p263s.AbstractC6635e;
import p332x.AbstractC9242c1;
import p332x.AbstractC9244d0;
import p332x.InterfaceC9241c0;
import p332x.InterfaceC9269n;
import p332x.InterfaceC9288w0;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6085g {

    /* JADX INFO: renamed from: q.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC6092n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9242c1 f19089a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0189q f19090b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9288w0 f19091c;

        public a(AbstractC9242c1 abstractC9242c1, InterfaceC0189q interfaceC0189q, InterfaceC9288w0 interfaceC9288w0) {
            this.f19089a = abstractC9242c1;
            this.f19090b = interfaceC0189q;
            this.f19091c = interfaceC9288w0;
        }

        @Override // p233q.InterfaceC6092n
        /* JADX INFO: renamed from: a */
        public float mo24209a(float f10, float f11) {
            int iM36000K = this.f19089a.m36000K() + this.f19089a.m36002M();
            if (iM36000K == 0) {
                return 0.0f;
            }
            AbstractC9242c1 abstractC9242c1 = this.f19089a;
            int iM35990A = f10 < 0.0f ? abstractC9242c1.m35990A() + 1 : abstractC9242c1.m35990A();
            int iM8578e = AbstractC2368o.m8578e(Math.abs((AbstractC2368o.m8586m(this.f19091c.mo36128a(iM35990A, AbstractC2368o.m8586m(((int) (f11 / iM36000K)) + iM35990A, 0, this.f19089a.mo35999J()), f10, this.f19089a.m36000K(), this.f19089a.m36002M()), 0, this.f19089a.mo35999J()) - iM35990A) * iM36000K) - iM36000K, 0);
            return iM8578e == 0 ? iM8578e : iM8578e * Math.signum(f10);
        }

        @Override // p233q.InterfaceC6092n
        /* JADX INFO: renamed from: b */
        public float mo24210b(float f10) {
            C4711r c4711rM24220e = m24220e(this.f19089a.m35994E().mo35975q(), f10);
            float fFloatValue = ((Number) c4711rM24220e.m18792a()).floatValue();
            float fFloatValue2 = ((Number) c4711rM24220e.m18793b()).floatValue();
            float fFloatValue3 = ((Number) this.f19090b.mo236e(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
            if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                AbstractC6635e.m26320c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
            }
            if (m24219d(fFloatValue3)) {
                return fFloatValue3;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC9241c0 m24218c() {
            return this.f19089a.m35994E();
        }

        /* JADX INFO: renamed from: d */
        public final boolean m24219d(float f10) {
            return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
        }

        /* JADX INFO: renamed from: e */
        public final C4711r m24220e(InterfaceC6093o interfaceC6093o, float f10) {
            float f11;
            List listMo35971j = m24218c().mo35971j();
            AbstractC9242c1 abstractC9242c1 = this.f19089a;
            int size = listMo35971j.size();
            int i10 = 0;
            float f12 = Float.NEGATIVE_INFINITY;
            float f13 = Float.POSITIVE_INFINITY;
            while (true) {
                f11 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                InterfaceC9269n interfaceC9269n = (InterfaceC9269n) listMo35971j.get(i10);
                float fM24247a = AbstractC6094p.m24247a(AbstractC9244d0.m36042a(m24218c()), m24218c().mo35968g(), m24218c().mo35965c(), m24218c().mo35972k(), interfaceC9269n.getOffset(), interfaceC9269n.getIndex(), interfaceC6093o, abstractC9242c1.mo35999J());
                if (fM24247a <= 0.0f && fM24247a > f12) {
                    f12 = fM24247a;
                }
                if (fM24247a >= 0.0f && fM24247a < f13) {
                    f13 = fM24247a;
                }
                i10++;
            }
            if (f12 == Float.NEGATIVE_INFINITY) {
                f12 = f13;
            }
            if (f13 == Float.POSITIVE_INFINITY) {
                f13 = f12;
            }
            if (!this.f19089a.mo2980e()) {
                if (AbstractC6085g.m24217e(this.f19089a, f10)) {
                    f12 = 0.0f;
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                }
            }
            if (this.f19089a.mo2978b()) {
                f11 = f12;
            } else if (!AbstractC6085g.m24217e(this.f19089a, f10)) {
                f13 = 0.0f;
            }
            return AbstractC4717x.m18815a(Float.valueOf(f11), Float.valueOf(f13));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6092n m24213a(AbstractC9242c1 abstractC9242c1, InterfaceC9288w0 interfaceC9288w0, InterfaceC0189q interfaceC0189q) {
        return new a(abstractC9242c1, interfaceC0189q, interfaceC9288w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m24215c(p332x.AbstractC9242c1 r5, p121i3.EnumC3191u r6, float r7, float r8, float r9, float r10) {
        /*
            boolean r0 = m24217e(r5, r8)
            x.c0 r1 = r5.m35994E()
            p.w0 r1 = r1.mo35967f()
            p.w0 r2 = p219p.EnumC5898w0.f18786q
            if (r1 != r2) goto L11
            goto L1b
        L11:
            i3.u r1 = p121i3.EnumC3191u.f8484q
            if (r6 != r1) goto L16
            goto L1b
        L16:
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            x.c0 r6 = r5.m35994E()
            int r6 = r6.mo35972k()
            r1 = 0
            if (r6 != 0) goto L28
            r2 = r1
            goto L2e
        L28:
            float r2 = m24216d(r5)
            float r6 = (float) r6
            float r2 = r2 / r6
        L2e:
            int r6 = (int) r2
            float r6 = (float) r6
            float r6 = r2 - r6
            i3.e r3 = r5.m36038z()
            int r8 = p233q.AbstractC6084f.m24207c(r3, r8)
            q.d$a r3 = p233q.AbstractC6082d.f19083a
            int r4 = r3.m24199a()
            boolean r4 = p233q.AbstractC6082d.m24198e(r8, r4)
            if (r4 == 0) goto L71
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L51
            if (r0 == 0) goto L86
            goto L7b
        L51:
            float r6 = java.lang.Math.abs(r2)
            float r5 = r5.m36005P()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L64
            if (r0 == 0) goto L7b
            goto L86
        L64:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L7b
            goto L86
        L71:
            int r5 = r3.m24200b()
            boolean r5 = p233q.AbstractC6082d.m24198e(r8, r5)
            if (r5 == 0) goto L7c
        L7b:
            return r10
        L7c:
            int r5 = r3.m24201c()
            boolean r5 = p233q.AbstractC6082d.m24198e(r8, r5)
            if (r5 == 0) goto L87
        L86:
            return r9
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p233q.AbstractC6085g.m24215c(x.c1, i3.u, float, float, float, float):float");
    }

    /* JADX INFO: renamed from: d */
    public static final float m24216d(AbstractC9242c1 abstractC9242c1) {
        return abstractC9242c1.m35994E().mo35967f() == EnumC5898w0.f18787r ? Float.intBitsToFloat((int) (abstractC9242c1.m36011V() >> 32)) : Float.intBitsToFloat((int) (abstractC9242c1.m36011V() & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m24217e(AbstractC9242c1 abstractC9242c1, float f10) {
        boolean zMo35970i = abstractC9242c1.m35994E().mo35970i();
        boolean z10 = (abstractC9242c1.m36013X() ? -f10 : m24216d(abstractC9242c1)) > 0.0f;
        return (z10 && zMo35970i) || !(z10 || zMo35970i);
    }
}
