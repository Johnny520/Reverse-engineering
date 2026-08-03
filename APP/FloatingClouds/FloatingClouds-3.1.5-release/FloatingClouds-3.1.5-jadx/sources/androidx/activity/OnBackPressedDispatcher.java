package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import p000a.AbstractC0373Ub;
import p000a.AbstractC0553e7;
import p000a.C0094F1;
import p000a.C0309R1;
import p000a.C0380V0;
import p000a.C0391Vb;
import p000a.C0409Wb;
import p000a.C0413Wf;
import p000a.C0427Xb;
import p000a.C0631i9;
import p000a.InterfaceC0064D7;
import p000a.InterfaceC0185K2;
import p000a.InterfaceC0819s7;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    public final Runnable f3609a;

    /* JADX INFO: renamed from: b */
    public final C0094F1<AbstractC0373Ub> f3610b;

    /* JADX INFO: renamed from: c */
    public AbstractC0373Ub f3611c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f3612d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f3613e;

    /* JADX INFO: renamed from: f */
    public boolean f3614f;

    /* JADX INFO: renamed from: g */
    public boolean f3615g;

    @Metadata(m3302d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3303d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/g;", "La/K2;", "activity_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
    public final class LifecycleOnBackPressedCancellable implements InterfaceC1118g, InterfaceC0185K2 {

        /* JADX INFO: renamed from: a */
        public final AbstractC1116e f3616a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0553e7.a f3617b;

        /* JADX INFO: renamed from: c */
        public C0975c f3618c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f3619d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC1116e abstractC1116e, AbstractC0553e7.a aVar) {
            C0631i9.m1482e(aVar, "onBackPressedCallback");
            this.f3619d = onBackPressedDispatcher;
            this.f3616a = abstractC1116e;
            this.f3617b = aVar;
            abstractC1116e.mo2592a(this);
        }

        @Override // androidx.lifecycle.InterfaceC1118g
        /* JADX INFO: renamed from: a */
        public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
            if (aVar != AbstractC1116e.a.ON_START) {
                if (aVar != AbstractC1116e.a.ON_STOP) {
                    if (aVar == AbstractC1116e.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    C0975c c0975c = this.f3618c;
                    if (c0975c != null) {
                        c0975c.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f3619d;
            onBackPressedDispatcher.getClass();
            AbstractC0553e7.a aVar2 = this.f3617b;
            C0631i9.m1482e(aVar2, "onBackPressedCallback");
            onBackPressedDispatcher.f3610b.addLast(aVar2);
            C0975c c0975c2 = new C0975c(onBackPressedDispatcher, aVar2);
            aVar2.f1396b.add(c0975c2);
            onBackPressedDispatcher.m2285d();
            aVar2.f1397c = new C0427Xb(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
            this.f3618c = c0975c2;
        }

        @Override // p000a.InterfaceC0185K2
        public final void cancel() {
            this.f3616a.mo2594c(this);
            this.f3617b.f1396b.remove(this);
            C0975c c0975c = this.f3618c;
            if (c0975c != null) {
                c0975c.cancel();
            }
            this.f3618c = null;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public static final class C0973a {

        /* JADX INFO: renamed from: a */
        public static final C0973a f3620a = new C0973a();

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m2286a(InterfaceC0819s7<C0413Wf> interfaceC0819s7) {
            C0631i9.m1482e(interfaceC0819s7, "onBackInvoked");
            return new C0380V0(1, interfaceC0819s7);
        }

        /* JADX INFO: renamed from: b */
        public final void m2287b(Object obj, int i, Object obj2) {
            C0631i9.m1482e(obj, "dispatcher");
            C0631i9.m1482e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: c */
        public final void m2288c(Object obj, Object obj2) {
            C0631i9.m1482e(obj, "dispatcher");
            C0631i9.m1482e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$b */
    public static final class C0974b {

        /* JADX INFO: renamed from: a */
        public static final C0974b f3621a = new C0974b();

        /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$b$a */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0064D7<C0309R1, C0413Wf> f3622a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC0064D7<C0309R1, C0413Wf> f3623b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC0819s7<C0413Wf> f3624c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC0819s7<C0413Wf> f3625d;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.D7<? super a.R1, a.Wf> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.D7<? super a.R1, a.Wf> */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC0064D7<? super C0309R1, C0413Wf> interfaceC0064D7, InterfaceC0064D7<? super C0309R1, C0413Wf> interfaceC0064D72, InterfaceC0819s7<C0413Wf> interfaceC0819s7, InterfaceC0819s7<C0413Wf> interfaceC0819s72) {
                this.f3622a = interfaceC0064D7;
                this.f3623b = interfaceC0064D72;
                this.f3624c = interfaceC0819s7;
                this.f3625d = interfaceC0819s72;
            }

            public final void onBackCancelled() {
                this.f3625d.mo31a();
            }

            public final void onBackInvoked() {
                this.f3624c.mo31a();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                C0631i9.m1482e(backEvent, "backEvent");
                this.f3623b.mo53f(new C0309R1(backEvent));
            }

            public final void onBackStarted(BackEvent backEvent) {
                C0631i9.m1482e(backEvent, "backEvent");
                this.f3622a.mo53f(new C0309R1(backEvent));
            }
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m2289a(InterfaceC0064D7<? super C0309R1, C0413Wf> interfaceC0064D7, InterfaceC0064D7<? super C0309R1, C0413Wf> interfaceC0064D72, InterfaceC0819s7<C0413Wf> interfaceC0819s7, InterfaceC0819s7<C0413Wf> interfaceC0819s72) {
            C0631i9.m1482e(interfaceC0064D7, "onBackStarted");
            C0631i9.m1482e(interfaceC0064D72, "onBackProgressed");
            C0631i9.m1482e(interfaceC0819s7, "onBackInvoked");
            C0631i9.m1482e(interfaceC0819s72, "onBackCancelled");
            return new a(interfaceC0064D7, interfaceC0064D72, interfaceC0819s7, interfaceC0819s72);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$c */
    public final class C0975c implements InterfaceC0185K2 {

        /* JADX INFO: renamed from: a */
        public final AbstractC0553e7.a f3626a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ OnBackPressedDispatcher f3627b;

        public C0975c(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0553e7.a aVar) {
            C0631i9.m1482e(aVar, "onBackPressedCallback");
            this.f3627b = onBackPressedDispatcher;
            this.f3626a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a.S7, a.s7] */
        @Override // p000a.InterfaceC0185K2
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f3627b;
            C0094F1<AbstractC0373Ub> c0094f1 = onBackPressedDispatcher.f3610b;
            AbstractC0553e7.a aVar = this.f3626a;
            c0094f1.remove(aVar);
            if (C0631i9.m1478a(onBackPressedDispatcher.f3611c, aVar)) {
                aVar.mo998a();
                onBackPressedDispatcher.f3611c = null;
            }
            aVar.f1396b.remove(this);
            ?? r0 = aVar.f1397c;
            if (r0 != 0) {
                r0.mo31a();
            }
            aVar.f1397c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnBackPressedDispatcher(Runnable runnable) {
        this.f3609a = runnable;
        this.f3610b = new C0094F1<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f3612d = i >= 34 ? C0974b.f3621a.m2289a(new C0391Vb(this, 0), new C0391Vb(this, 1), new C0409Wb(this, 0), new C0409Wb(this, 1)) : C0973a.f3620a.m2286a(new C0409Wb(this, 2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2282a(InterfaceC0935y9 interfaceC0935y9, AbstractC0553e7.a aVar) {
        C0631i9.m1482e(aVar, "onBackPressedCallback");
        AbstractC1116e lifecycle = interfaceC0935y9.getLifecycle();
        if (lifecycle.mo2593b() == AbstractC1116e.b.f4672a) {
            return;
        }
        aVar.f1396b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, aVar));
        m2285d();
        aVar.f1397c = new C0427Xb(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m2283b() {
        AbstractC0373Ub abstractC0373UbPrevious;
        AbstractC0373Ub abstractC0373Ub = this.f3611c;
        if (abstractC0373Ub == null) {
            C0094F1<AbstractC0373Ub> c0094f1 = this.f3610b;
            c0094f1.getClass();
            ListIterator<AbstractC0373Ub> listIterator = c0094f1.listIterator(c0094f1.f305c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0373UbPrevious = null;
                    break;
                } else {
                    abstractC0373UbPrevious = listIterator.previous();
                    if (abstractC0373UbPrevious.f1395a) {
                        break;
                    }
                }
            }
            abstractC0373Ub = abstractC0373UbPrevious;
        }
        this.f3611c = null;
        if (abstractC0373Ub != null) {
            abstractC0373Ub.mo999b();
            return;
        }
        Runnable runnable = this.f3609a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2284c(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3613e;
        OnBackInvokedCallback onBackInvokedCallback = this.f3612d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0973a c0973a = C0973a.f3620a;
        if (z && !this.f3614f) {
            c0973a.m2287b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3614f = true;
        } else {
            if (z || !this.f3614f) {
                return;
            }
            c0973a.m2288c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3614f = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2285d() {
        boolean z = this.f3615g;
        boolean z2 = false;
        C0094F1<AbstractC0373Ub> c0094f1 = this.f3610b;
        if (c0094f1 == null || !c0094f1.isEmpty()) {
            Iterator<AbstractC0373Ub> it = c0094f1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f1395a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f3615g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m2284c(z2);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}
