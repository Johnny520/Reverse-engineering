package androidx.activity;

import androidx.fragment.app.C0443u;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0482q, InterfaceC0370a {

    /* JADX INFO: renamed from: a */
    public final C0486u f873a;

    /* JADX INFO: renamed from: b */
    public final C0443u f874b;

    /* JADX INFO: renamed from: c */
    public C0377h f875c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0378i f876d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0378i c0378i, C0486u c0486u, C0443u c0443u) {
        this.f876d = c0378i;
        this.f873a = c0486u;
        this.f874b = c0443u;
        c0486u.m927a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m == EnumC0478m.ON_START) {
            C0378i c0378i = this.f876d;
            ArrayDeque arrayDeque = c0378i.f908b;
            C0443u c0443u = this.f874b;
            arrayDeque.add(c0443u);
            C0377h c0377h = new C0377h(c0378i, c0443u);
            c0443u.f1414b.add(c0377h);
            this.f875c = c0377h;
            return;
        }
        if (enumC0478m != EnumC0478m.ON_STOP) {
            if (enumC0478m == EnumC0478m.ON_DESTROY) {
                cancel();
            }
        } else {
            C0377h c0377h2 = this.f875c;
            if (c0377h2 != null) {
                c0377h2.cancel();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.InterfaceC0370a
    public final void cancel() {
        this.f873a.m932f(this);
        this.f874b.f1414b.remove(this);
        C0377h c0377h = this.f875c;
        if (c0377h != null) {
            c0377h.cancel();
            this.f875c = null;
        }
    }
}
