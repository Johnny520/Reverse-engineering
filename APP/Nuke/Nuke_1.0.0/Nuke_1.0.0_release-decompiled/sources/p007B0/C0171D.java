package p007B0;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import me.dartcv.nuke.BuildConfig;
import p001A0.C0102b;
import p002A1.AbstractC0142o;
import p002A1.C0147t;
import p002A1.EnumC0141n;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p041H0.C0562G0;
import p041H0.C0564I;
import p047I0.C0660A0;
import p047I0.C0685N;
import p047I0.C0696T;
import p047I0.C0706Y;
import p047I0.C0711a0;
import p047I0.C0742k1;
import p047I0.C0745l1;
import p047I0.C0752o;
import p047I0.ChoreographerFrameCallbackC0708Z;
import p047I0.ComponentCallbacks2C0687O;
import p047I0.ComponentCallbacks2C0689P;
import p051J.C0829u;
import p051J.InputConnectionC0830v;
import p056K2.C0891q;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p115X0.C1647v;
import p115X0.InputConnectionC1639n;
import p117X2.AbstractC1666k;
import p136b0.C1843e;
import p153e1.C2014j;
import p169h0.InterfaceC2207p;
import p176i1.C2293i;
import p176i1.C2310z;
import p176i1.InterfaceC2282C;
import p197m.C2516A;
import p211o0.C2739N;
import p211o0.C2756o;

/* JADX INFO: renamed from: B0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0171D extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f606e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f607f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0171D(int i5, Object obj, Object obj2) {
        super(1);
        this.f606e = i5;
        this.f607f = obj;
        this.f608g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        InputConnectionC0830v inputConnectionC0830v;
        switch (this.f606e) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                C0174G c0174g = (C0174G) this.f608g;
                if (motionEvent.getActionMasked() == 0) {
                    ((C0173F) this.f607f).f613f = ((Boolean) ((C0175H) c0174g.m261e()).mo1h(motionEvent)).booleanValue() ? EnumC0170C.f603e : EnumC0170C.f604f;
                } else {
                    ((C0175H) c0174g.m261e()).mo1h(motionEvent);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                Context context = (Context) this.f607f;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0687O componentCallbacks2C0687O = (ComponentCallbacks2C0687O) this.f608g;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0687O);
                return new C0685N(0, context, componentCallbacks2C0687O);
            case 2:
                Context context2 = (Context) this.f607f;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0689P componentCallbacks2C0689P = (ComponentCallbacks2C0689P) this.f608g;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0689P);
                return new C0685N(1, context2, componentCallbacks2C0689P);
            case 3:
                return new C0660A0((C0829u) this.f607f, new C0102b(5, (C0696T) this.f608g));
            case 4:
                C0660A0 c0660a0 = (C0660A0) this.f607f;
                synchronized (c0660a0.f2093c) {
                    try {
                        c0660a0.f2095e = true;
                        C1483e c1483e = c0660a0.f2094d;
                        Object[] objArr = c1483e.f5181d;
                        int i5 = c1483e.f5183f;
                        for (int i6 = 0; i6 < i5; i6++) {
                            InputConnectionC1639n inputConnectionC1639n = (InputConnectionC1639n) ((C0562G0) objArr[i6]).get();
                            if (inputConnectionC1639n != null && (inputConnectionC0830v = inputConnectionC1639n.f5635b) != null) {
                                inputConnectionC1639n.m2940a(inputConnectionC0830v);
                                inputConnectionC1639n.f5635b = null;
                            }
                        }
                        c0660a0.f2094d.m2758g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1647v c1647v = ((C0696T) this.f608g).f2225e;
                c1647v.f5654b.set(null);
                c1647v.f5653a.mo1417g();
                return C0891q.f2780a;
            case 5:
                C0706Y c0706y = (C0706Y) this.f607f;
                ChoreographerFrameCallbackC0708Z choreographerFrameCallbackC0708Z = (ChoreographerFrameCallbackC0708Z) this.f608g;
                synchronized (c0706y.f2237h) {
                    c0706y.f2239j.remove(choreographerFrameCallbackC0708Z);
                }
                return C0891q.f2780a;
            case 6:
                ((Choreographer) ((C0711a0) this.f607f).f2252e).removeFrameCallback((ChoreographerFrameCallbackC0708Z) this.f608g);
                return C0891q.f2780a;
            case 7:
                C0752o c0752o = (C0752o) obj;
                InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f608g;
                C0745l1 c0745l1 = (C0745l1) this.f607f;
                if (!c0745l1.f2329f) {
                    AbstractC0142o lifecycle = c0752o.f2337a.getLifecycle();
                    c0745l1.f2331h = interfaceC1603e;
                    if (c0745l1.f2330g == null) {
                        c0745l1.f2330g = lifecycle;
                        lifecycle.mo184a(c0745l1);
                    } else if (((C0147t) lifecycle).f541c.compareTo(EnumC0141n.f533f) >= 0) {
                        c0745l1.f2328e.m2646B(new C1843e(1330788943, true, new C0742k1(c0745l1, interfaceC1603e, 1)));
                    }
                }
                return C0891q.f2780a;
            case 8:
                ((C0564I) this.f607f).m821d0(((InterfaceC2207p) obj).mo4021c((InterfaceC2207p) this.f608g));
                return C0891q.f2780a;
            case 9:
                C2310z c2310z = (C2310z) this.f607f;
                c2310z.setPositionProvider((InterfaceC2282C) this.f608g);
                c2310z.m4142n();
                return new C2293i();
            case 10:
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) this.f607f;
                float fM2507g = ((C2516A) this.f608g).f8037c.m2507g();
                abstractC0389a0.getClass();
                long j5 = 0;
                AbstractC0389a0.m657a(abstractC0389a0, abstractC0391b0);
                abstractC0391b0.mo666i0(C2014j.m3702c((j5 & 4294967295L) | (j5 << 32), abstractC0391b0.f1210h), fM2507g, null);
                return C0891q.f2780a;
            case 11:
                AbstractC0389a0.m662n((AbstractC0389a0) obj, (AbstractC0391b0) this.f607f, ((C2756o) this.f608g).f8750r);
                return C0891q.f2780a;
            default:
                AbstractC0389a0.m662n((AbstractC0389a0) obj, (AbstractC0391b0) this.f607f, ((C2739N) this.f608g).f8709C);
                return C0891q.f2780a;
        }
    }
}
