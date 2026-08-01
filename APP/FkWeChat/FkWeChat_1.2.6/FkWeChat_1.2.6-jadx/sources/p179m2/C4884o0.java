package p179m2;

import android.view.Choreographer;
import androidx.compose.runtime.InterfaceC0625y1;
import ec.C2164o;
import ec.InterfaceC2156m;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: m2.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4884o0 implements InterfaceC0625y1 {

    /* JADX INFO: renamed from: q */
    public final Choreographer f14582q;

    /* JADX INFO: renamed from: r */
    public final C4874m0 f14583r;

    /* JADX INFO: renamed from: m2.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4874m0 f14584r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Choreographer.FrameCallback f14585s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4874m0 c4874m0, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14584r = c4874m0;
            this.f14585s = frameCallback;
        }

        /* JADX INFO: renamed from: a */
        public final void m19528a(Throwable th) {
            this.f14584r.m19500X0(this.f14585s);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19528a((Throwable) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m2.o0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Choreographer.FrameCallback f14587s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f14587s = frameCallback;
        }

        /* JADX INFO: renamed from: a */
        public final void m19529a(Throwable th) {
            C4884o0.this.m19527a().removeFrameCallback(this.f14587s);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19529a((Throwable) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m2.o0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC2156m f14588q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4884o0 f14589r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0184l f14590s;

        public c(InterfaceC2156m interfaceC2156m, C4884o0 c4884o0, InterfaceC0184l interfaceC0184l) {
            this.f14588q = interfaceC2156m;
            this.f14589r = c4884o0;
            this.f14590s = interfaceC0184l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM18798b;
            InterfaceC2156m interfaceC2156m = this.f14588q;
            InterfaceC0184l interfaceC0184l = this.f14590s;
            try {
                C4712s.a aVar = C4712s.f13928r;
                objM18798b = C4712s.m18798b(interfaceC0184l.mo27m(Long.valueOf(j10)));
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            interfaceC2156m.resumeWith(objM18798b);
        }
    }

    public C4884o0(Choreographer choreographer, C4874m0 c4874m0) {
        this.f14582q = choreographer;
        this.f14583r = c4874m0;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public /* bridge */ InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2456c(this, cVar);
    }

    @Override // androidx.compose.runtime.InterfaceC0625y1
    /* JADX INFO: renamed from: W */
    public Object mo1650W(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        C4874m0 c4874m0 = this.f14583r;
        if (c4874m0 == null) {
            InterfaceC5980j.b bVarMo1654h = interfaceC5976f.getContext().mo1654h(InterfaceC5977g.f18915n);
            c4874m0 = bVarMo1654h instanceof C4874m0 ? (C4874m0) bVarMo1654h : null;
        }
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        c cVar = new c(c2164o, this, interfaceC0184l);
        if (c4874m0 == null || !AbstractC1061t.m3842c(c4874m0.m19494R0(), m19527a())) {
            m19527a().postFrameCallback(cVar);
            c2164o.mo7830B(new b(cVar));
        } else {
            c4874m0.m19499W0(cVar);
            c2164o.mo7830B(new a(c4874m0, cVar));
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w;
    }

    /* JADX INFO: renamed from: a */
    public final Choreographer m19527a() {
        return this.f14582q;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC0625y1.a.m2457d(this, interfaceC5980j);
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public /* bridge */ InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2455b(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public /* bridge */ Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC0625y1.a.m2454a(this, obj, interfaceC0188p);
    }
}
