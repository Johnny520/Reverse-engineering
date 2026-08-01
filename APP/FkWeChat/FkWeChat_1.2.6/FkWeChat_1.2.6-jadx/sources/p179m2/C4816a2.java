package p179m2;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import p010a9.InterfaceC0184l;
import p029c2.AbstractC1309b;
import p029c2.AbstractC1311d;
import p029c2.InterfaceC1310c;
import p235q1.C6203g;

/* JADX INFO: renamed from: m2.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4816a2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f14342a;

    /* JADX INFO: renamed from: b */
    public int f14343b = AbstractC1311d.f3928a.m5278a();

    /* JADX INFO: renamed from: c */
    public boolean f14344c;

    /* JADX INFO: renamed from: d */
    public final GestureDetector f14345d;

    public C4816a2(Context context, InterfaceC0184l interfaceC0184l) {
        this.f14342a = interfaceC0184l;
        this.f14345d = new GestureDetector(context, new a());
    }

    /* JADX INFO: renamed from: c */
    public final void m19285c() {
        this.f14343b = AbstractC1311d.f3928a.m5278a();
        this.f14344c = true;
    }

    /* JADX INFO: renamed from: d */
    public final int m19286d() {
        return this.f14343b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19287e(InterfaceC1310c interfaceC1310c, boolean z10) {
        MotionEvent motionEventM5271b = AbstractC1309b.m5271b(interfaceC1310c);
        int action = motionEventM5271b.getAction();
        if (action == 0) {
            this.f14343b = interfaceC1310c.mo5267a();
            this.f14344c = false;
        } else if ((action == 1 || action == 2) && z10) {
            m19285c();
        }
        return this.f14345d.onTouchEvent(motionEventM5271b);
    }

    /* JADX INFO: renamed from: m2.a2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements GestureDetector.OnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (C4816a2.this.f14344c) {
                return true;
            }
            int iM19286d = C4816a2.this.m19286d();
            AbstractC1311d.a aVar = AbstractC1311d.f3928a;
            if (AbstractC1311d.m5277e(iM19286d, aVar.m5279b())) {
                if (Math.abs(f10) > Math.abs(f11)) {
                    C4816a2.this.f14342a.mo27m(C6203g.m24371i(f10 > 0.0f ? C6203g.f19254b.m24382e() : C6203g.f19254b.m24383f()));
                }
            } else if (AbstractC1311d.m5277e(C4816a2.this.m19286d(), aVar.m5280c()) && Math.abs(f11) > Math.abs(f10)) {
                C4816a2.this.f14342a.mo27m(C6203g.m24371i(f11 > 0.0f ? C6203g.f19254b.m24382e() : C6203g.f19254b.m24383f()));
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }
}
