package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends f1.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.x f3105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3106b;

    public p0() {
            r2 = this;
            r2.<init>()
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f3106b = r0
            return
    }

    @Override // f1.s
    public final void a(float r6, long r7, f1.h r9) {
            r5 = this;
            java.lang.Object r0 = r9.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            androidx.lifecycle.x r1 = r5.f3105a
            r2 = 0
            if (r1 == 0) goto L11
            long r3 = r5.f3106b
            boolean r3 = e1.e.a(r3, r7)
            if (r3 != 0) goto L3a
        L11:
            boolean r1 = e1.e.c(r7)
            if (r1 == 0) goto L22
            r5.f3105a = r2
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.f3106b = r7
            r1 = r2
            goto L3a
        L22:
            androidx.lifecycle.x r1 = r5.f3105a
            if (r1 != 0) goto L30
            androidx.lifecycle.x r1 = new androidx.lifecycle.x
            r3 = 10
            r4 = 0
            r1.<init>(r3, r4)
            r5.f3105a = r1
        L30:
            android.graphics.Shader r3 = r5.b(r7)
            r1.f310h = r3
            r5.f3105a = r1
            r5.f3106b = r7
        L3a:
            int r7 = r0.getColor()
            long r7 = f1.c0.c(r7)
            long r3 = f1.w.f3126b
            boolean r7 = f1.w.c(r7, r3)
            if (r7 != 0) goto L4d
            r9.w(r3)
        L4d:
            java.lang.Object r7 = r9.f3059j
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            if (r1 == 0) goto L58
            java.lang.Object r8 = r1.f310h
            android.graphics.Shader r8 = (android.graphics.Shader) r8
            goto L59
        L58:
            r8 = r2
        L59:
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L69
            if (r1 == 0) goto L66
            java.lang.Object r7 = r1.f310h
            r2 = r7
            android.graphics.Shader r2 = (android.graphics.Shader) r2
        L66:
            r9.z(r2)
        L69:
            int r7 = r0.getAlpha()
            float r7 = (float) r7
            r8 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r8
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 != 0) goto L76
            return
        L76:
            r9.u(r6)
            return
    }

    public abstract android.graphics.Shader b(long r1);
}
