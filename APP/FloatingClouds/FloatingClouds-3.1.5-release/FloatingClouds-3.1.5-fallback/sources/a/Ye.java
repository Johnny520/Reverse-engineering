package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f362a;
    public final a.Ye.a b;
    public float c;
    public boolean d;
    public final java.lang.ref.WeakReference<a.Ye.b> e;
    public a.Ve f;

    public class a extends a.AbstractC0040a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Ye f363a;

        public a(a.Ye r1) {
                r0 = this;
                r0.<init>()
                r0.f363a = r1
                return
        }

        @Override // a.AbstractC0040a2
        public final void d(int r2) {
                r1 = this;
                r2 = 1
                a.Ye r0 = r1.f363a
                r0.d = r2
                java.lang.ref.WeakReference<a.Ye$b> r2 = r0.e
                java.lang.Object r2 = r2.get()
                a.Ye$b r2 = (a.Ye.b) r2
                if (r2 == 0) goto L12
                r2.a()
            L12:
                return
        }

        @Override // a.AbstractC0040a2
        public final void e(android.graphics.Typeface r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L3
                goto L15
            L3:
                r1 = 1
                a.Ye r2 = r0.f363a
                r2.d = r1
                java.lang.ref.WeakReference<a.Ye$b> r1 = r2.e
                java.lang.Object r1 = r1.get()
                a.Ye$b r1 = (a.Ye.b) r1
                if (r1 == 0) goto L15
                r1.a()
            L15:
                return
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] r1);
    }

    public Ye(com.google.android.material.chip.a r3) {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r2.f362a = r0
            a.Ye$a r0 = new a.Ye$a
            r0.<init>(r2)
            r2.b = r0
            r2.d = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.e = r0
            return
    }

    public final float a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 != 0) goto L7
            float r4 = r3.c
            return r4
        L7:
            android.text.TextPaint r0 = r3.f362a
            r1 = 0
            if (r4 != 0) goto Le
            r2 = 0
            goto L16
        Le:
            int r2 = r4.length()
            float r2 = r0.measureText(r4, r1, r2)
        L16:
            r3.c = r2
            if (r4 != 0) goto L1b
            goto L24
        L1b:
            android.graphics.Paint$FontMetrics r4 = r0.getFontMetrics()
            float r4 = r4.ascent
            java.lang.Math.abs(r4)
        L24:
            r3.d = r1
            float r4 = r3.c
            return r4
    }
}
