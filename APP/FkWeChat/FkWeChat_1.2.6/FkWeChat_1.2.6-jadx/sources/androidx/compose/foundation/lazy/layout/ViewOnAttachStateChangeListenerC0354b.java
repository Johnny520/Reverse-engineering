package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p152k3.AbstractC3948b;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0354b implements InterfaceC0381h2, InterfaceC0389j2, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: x */
    public static final a f999x = new a(null);

    /* JADX INFO: renamed from: y */
    public static final int f1000y = 8;

    /* JADX INFO: renamed from: z */
    public static long f1001z;

    /* JADX INFO: renamed from: q */
    public final View f1002q;

    /* JADX INFO: renamed from: s */
    public boolean f1004s;

    /* JADX INFO: renamed from: v */
    public boolean f1007v;

    /* JADX INFO: renamed from: w */
    public long f1008w;

    /* JADX INFO: renamed from: r */
    public final PriorityQueue f1003r = new PriorityQueue(11, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ViewOnAttachStateChangeListenerC0354b.m1111d((C0393k2) obj, (C0393k2) obj2);
        }
    });

    /* JADX INFO: renamed from: t */
    public final Choreographer f1005t = Choreographer.getInstance();

    /* JADX INFO: renamed from: u */
    public final b f1006u = new b();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0377g2 {

        /* JADX INFO: renamed from: a */
        public boolean f1009a;

        /* JADX INFO: renamed from: b */
        public long f1010b;

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0377g2
        /* JADX INFO: renamed from: a */
        public long mo1120a() {
            if (this.f1009a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.f1010b - System.nanoTime());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m1121b() {
            return this.f1009a;
        }

        /* JADX INFO: renamed from: c */
        public final void m1122c(boolean z10) {
            this.f1009a = z10;
        }

        /* JADX INFO: renamed from: d */
        public final void m1123d(long j10) {
            this.f1010b = j10;
        }
    }

    public ViewOnAttachStateChangeListenerC0354b(View view) {
        this.f1002q = view;
        f999x.m1119b(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m1111d(C0393k2 c0393k2, C0393k2 c0393k22) {
        return AbstractC1061t.m3843d(c0393k22.m1264c(), c0393k2.m1264c());
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0389j2
    /* JADX INFO: renamed from: b */
    public void mo1114b(InterfaceC0373f2 interfaceC0373f2) {
        this.f1003r.add(new C0393k2(C0393k2.f1134c.m1267b(), interfaceC0373f2));
        m1117h();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0389j2
    /* JADX INFO: renamed from: c */
    public void mo1115c(InterfaceC0373f2 interfaceC0373f2) {
        this.f1003r.add(new C0393k2(C0393k2.f1134c.m1266a(), interfaceC0373f2));
        m1117h();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f1007v) {
            this.f1008w = j10;
            this.f1002q.post(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1116g() {
        long jMo1120a = this.f1006u.mo1120a();
        AbstractC3948b.m15652a("compose:lazy:prefetch:available_time_nanos", jMo1120a);
        boolean z10 = true;
        if (jMo1120a > 0) {
            Object objPeek = this.f1003r.peek();
            objPeek.getClass();
            if (!((C0393k2) objPeek).m1265d().mo1173d(this.f1006u)) {
                this.f1003r.poll();
                z10 = false;
            }
            this.f1006u.m1122c(false);
        }
        return z10;
    }

    /* JADX INFO: renamed from: h */
    public final void m1117h() {
        if (this.f1004s) {
            return;
        }
        this.f1004s = true;
        this.f1002q.post(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1007v = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1007v = false;
        this.f1002q.removeCallbacks(this);
        this.f1005t.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1003r.isEmpty() || !this.f1004s || !this.f1007v || this.f1002q.getWindowVisibility() != 0) {
            this.f1004s = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f1002q.getDrawingTime());
        this.f1006u.m1122c(System.nanoTime() > (((long) 2) * f1001z) + nanos);
        this.f1006u.m1123d(Math.max(this.f1008w, nanos) + f1001z);
        boolean zM1116g = false;
        while (!this.f1003r.isEmpty() && !zM1116g) {
            if (this.f1006u.m1121b()) {
                Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    zM1116g = m1116g();
                } finally {
                    Trace.endSection();
                }
            } else {
                zM1116g = m1116g();
            }
        }
        if (zM1116g) {
            this.f1005t.postFrameCallback(this);
        } else {
            this.f1004s = false;
        }
        AbstractC3948b.m15652a("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1119b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0354b.m1112e()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0354b.m1113f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.ViewOnAttachStateChangeListenerC0354b.a.m1119b(android.view.View):void");
        }

        public a() {
        }
    }
}
