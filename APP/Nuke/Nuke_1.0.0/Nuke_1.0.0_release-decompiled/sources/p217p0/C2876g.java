package p217p0;

import p211o0.C2762u;

/* JADX INFO: renamed from: p0.g */
/* JADX INFO: loaded from: classes.dex */
public class C2876g {

    /* JADX INFO: renamed from: a */
    public final AbstractC2872c f9099a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2872c f9100b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2872c f9101c;

    /* JADX INFO: renamed from: d */
    public final float[] f9102d;

    public C2876g(AbstractC2872c abstractC2872c, AbstractC2872c abstractC2872c2, AbstractC2872c abstractC2872c3, float[] fArr) {
        this.f9099a = abstractC2872c;
        this.f9100b = abstractC2872c2;
        this.f9101c = abstractC2872c3;
        this.f9102d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo5080a(long j5) {
        float fM4926h = C2762u.m4926h(j5);
        float fM4925g = C2762u.m4925g(j5);
        float fM4923e = C2762u.m4923e(j5);
        float fM4922d = C2762u.m4922d(j5);
        AbstractC2872c abstractC2872c = this.f9100b;
        long jMo5073d = abstractC2872c.mo5073d(fM4926h, fM4925g, fM4923e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5073d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5073d & 4294967295L));
        float fMo5074e = abstractC2872c.mo5074e(fM4926h, fM4925g, fM4923e);
        float[] fArr = this.f9102d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo5074e *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f5 = fIntBitsToFloat2;
        return this.f9101c.mo5075f(f2, f5, fMo5074e, fM4922d, this.f9099a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2876g(p217p0.AbstractC2872c r9, p217p0.AbstractC2872c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f9069b
            long r2 = p217p0.AbstractC2871b.f9063a
            boolean r0 = p217p0.AbstractC2871b.m5068a(r0, r2)
            if (r0 == 0) goto Lf
            p0.c r0 = p217p0.AbstractC2879j.m5081a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f9069b
            boolean r1 = p217p0.AbstractC2871b.m5068a(r4, r2)
            if (r1 == 0) goto L1d
            p0.c r1 = p217p0.AbstractC2879j.m5081a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f9069b
            boolean r11 = p217p0.AbstractC2871b.m5068a(r5, r2)
            long r5 = r10.f9069b
            boolean r2 = p217p0.AbstractC2871b.m5068a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            p0.q r9 = (p217p0.C2886q) r9
            p0.s r9 = r9.f9123d
            float[] r3 = p217p0.AbstractC2879j.f9108e
            if (r11 == 0) goto L47
            float[] r11 = r9.m5089a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.m5089a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p217p0.C2876g.<init>(p0.c, p0.c, int):void");
    }
}
