package a;

/* JADX INFO: loaded from: classes.dex */
public final class Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<a.Jg> f155a;
    public long b;
    public android.view.animation.BaseInterpolator c;
    public a.C0282n9 d;
    public boolean e;
    public final a.Kg.a f;

    public class a extends a.C0282n9 {
        public boolean b;
        public int c;
        public final /* synthetic */ a.Kg d;

        public a(a.Kg r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r1 = 0
                r0.b = r1
                r0.c = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r3 = this;
                int r0 = r3.c
                int r0 = r0 + 1
                r3.c = r0
                a.Kg r1 = r3.d
                java.util.ArrayList<a.Jg> r2 = r1.f155a
                int r2 = r2.size()
                if (r0 != r2) goto L1e
                a.n9 r0 = r1.d
                if (r0 == 0) goto L17
                r0.a()
            L17:
                r0 = 0
                r3.c = r0
                r3.b = r0
                r1.e = r0
            L1e:
                return
        }

        @Override // a.C0282n9, a.Lg
        public final void c() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L5
                goto L11
            L5:
                r0 = 1
                r1.b = r0
                a.Kg r0 = r1.d
                a.n9 r0 = r0.d
                if (r0 == 0) goto L11
                r0.c()
            L11:
                return
        }
    }

    public Kg() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.b = r0
            a.Kg$a r0 = new a.Kg$a
            r0.<init>(r2)
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f155a = r0
            return
    }

    public final void a() {
            r2 = this;
            boolean r0 = r2.e
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<a.Jg> r0 = r2.f155a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            a.Jg r1 = (a.Jg) r1
            r1.b()
            goto Lb
        L1b:
            r0 = 0
            r2.e = r0
            return
    }

    public final void b() {
            r6 = this;
            boolean r0 = r6.e
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<a.Jg> r0 = r6.f155a
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            a.Jg r1 = (a.Jg) r1
            long r2 = r6.b
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L22
            r1.c(r2)
        L22:
            android.view.animation.BaseInterpolator r2 = r6.c
            if (r2 == 0) goto L37
            java.lang.ref.WeakReference<android.view.View> r3 = r1.f145a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L37
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setInterpolator(r2)
        L37:
            a.n9 r2 = r6.d
            if (r2 == 0) goto L40
            a.Kg$a r2 = r6.f
            r1.d(r2)
        L40:
            java.lang.ref.WeakReference<android.view.View> r1 = r1.f145a
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lb
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.start()
            goto Lb
        L52:
            r0 = 1
            r6.e = r0
            return
    }
}
