package a;

/* JADX INFO: loaded from: classes.dex */
public final class Qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Vg f234a = null;
    public static final a.Qg.a b = null;

    public class a extends android.util.Property<android.view.View, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                a.Vg r0 = a.Qg.f234a
                float r2 = r0.a(r2)
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public final void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                a.Vg r0 = a.Qg.f234a
                r0.b(r2, r3)
                return
        }
    }

    public class b extends android.util.Property<android.view.View, android.graphics.Rect> {
        @Override // android.util.Property
        public final android.graphics.Rect get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r1 = r1.getClipBounds()
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r2 = (android.graphics.Rect) r2
                r1.setClipBounds(r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            a.Wg r0 = new a.Wg
            r0.<init>()
            a.Qg.f234a = r0
            goto L15
        Le:
            a.Vg r0 = new a.Vg
            r0.<init>()
            a.Qg.f234a = r0
        L15:
            a.Qg$a r0 = new a.Qg$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "translationAlpha"
            r0.<init>(r1, r2)
            a.Qg.b = r0
            a.Qg$b r0 = new a.Qg$b
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r2 = "clipBounds"
            r0.<init>(r1, r2)
            return
    }

    public static void a(android.view.View r6, int r7, int r8, int r9, int r10) {
            a.Vg r0 = a.Qg.f234a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.f(r1, r2, r3, r4, r5)
            return
    }

    public static void b(android.view.View r1, int r2) {
            a.Vg r0 = a.Qg.f234a
            r0.c(r1, r2)
            return
    }
}
