package Yue;

import Yue.C7148;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3503<T> {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f340 = AtomicIntegerFieldUpdater.newUpdater(C3503.class, "notCompletedCount");

    @InterfaceC6399
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC4360<T>[] f341;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ */
    public final class C0157 extends AbstractC5556 {

        @InterfaceC6399
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC3665<List<? extends T>> f5857;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public InterfaceC4433 f5858;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۟ۨ۟<? super java.util.List<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0157(@InterfaceC6399 InterfaceC3665<? super List<? extends T>> interfaceC3665) {
            this.f5857 = interfaceC3665;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            mo9329(th);
            return C8107.f3222;
        }

        @Override // Yue.AbstractC4052
        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public void mo9329(@InterfaceC6489 Throwable th) {
            if (th != null) {
                Object objMo10018 = this.f5857.mo10018(th);
                if (objMo10018 != null) {
                    this.f5857.mo10022(objMo10018);
                    C3503<T>.C0158 c0158M9330 = m9330();
                    if (c0158M9330 != null) {
                        c0158M9330.m9334();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3503.f340.decrementAndGet(C3503.this) == 0) {
                InterfaceC3665<List<? extends T>> interfaceC3665 = this.f5857;
                InterfaceC4360[] interfaceC4360Arr = C3503.this.f341;
                ArrayList arrayList = new ArrayList(interfaceC4360Arr.length);
                for (InterfaceC4360 interfaceC4360 : interfaceC4360Arr) {
                    arrayList.add(interfaceC4360.mo11466());
                }
                C7148.C1189 c1189 = C7148.f21560;
                interfaceC3665.resumeWith(C7148.m3438(arrayList));
            }
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public final C3503<T>.C0158 m9330() {
            return (C0158) this._disposer;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public final InterfaceC4433 m9331() {
            InterfaceC4433 interfaceC4433 = this.f5858;
            if (interfaceC4433 != null) {
                return interfaceC4433;
            }
            C5499.m17132("handle");
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
        public final void m9332(@InterfaceC6489 C3503<T>.C0158 c0158) {
            this._disposer = c0158;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
        public final void m9333(@InterfaceC6399 InterfaceC4433 interfaceC4433) {
            this.f5858 = interfaceC4433;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۤ$ۥ۟ */
    public final class C0158 extends AbstractC3661 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C3503<T>.C0157[] f5860;

        public C0158(@InterfaceC6399 C3503<T>.C0157[] c0157Arr) {
            this.f5860 = c0157Arr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ C8107 invoke(Throwable th) {
            mo5758(th);
            return C8107.f3222;
        }

        @InterfaceC6399
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f5860 + ']';
        }

        @Override // Yue.AbstractC3662
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo5758(@InterfaceC6489 Throwable th) {
            m9334();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m9334() {
            for (C3503<T>.C0157 c0157 : this.f5860) {
                c0157.m9331().mo5757();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۨۧۥ<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C3503(@InterfaceC6399 InterfaceC4360<? extends T>[] interfaceC4360Arr) {
        this.f341 = interfaceC4360Arr;
        this.notCompletedCount = interfaceC4360Arr.length;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final Object m562(@InterfaceC6399 InterfaceC4199<? super List<? extends T>> interfaceC4199) {
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        int length = this.f341.length;
        C0157[] c0157Arr = new C0157[length];
        for (int i = 0; i < length; i++) {
            InterfaceC4360 interfaceC4360 = this.f341[i];
            interfaceC4360.start();
            C0157 c0157 = new C0157(c3666);
            c0157.m9333(interfaceC4360.mo17160(c0157));
            C8107 c8107 = C8107.f3222;
            c0157Arr[i] = c0157;
        }
        C3503<T>.C0158 c0158 = new C0158(c0157Arr);
        for (int i2 = 0; i2 < length; i2++) {
            c0157Arr[i2].m9332(c0158);
        }
        if (c3666.mo10013()) {
            c0158.m9334();
        } else {
            c3666.mo10021(c0158);
        }
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }
}
