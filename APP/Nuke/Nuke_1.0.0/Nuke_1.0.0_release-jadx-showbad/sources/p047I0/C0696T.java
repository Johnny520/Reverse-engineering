package p047I0;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p000A.C0039U;
import p007B0.C0171D;
import p027E4.C0330q;
import p051J.C0810b;
import p051J.C0829u;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p115X0.C1647v;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: I0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0696T implements InterfaceC2160t {

    /* JADX INFO: renamed from: d */
    public final View f2224d;

    /* JADX INFO: renamed from: e */
    public final C1647v f2225e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2160t f2226f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f2227g = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0696T(View view, C1647v c1647v, InterfaceC2160t interfaceC2160t) {
        this.f2224d = view;
        this.f2225e = c1647v;
        this.f2226f = interfaceC2160t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1201a(C0829u c0829u, AbstractC1178c abstractC1178c) {
        C0694S c0694s;
        if (abstractC1178c instanceof C0694S) {
            c0694s = (C0694S) abstractC1178c;
            int i5 = c0694s.f2221i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0694s.f2221i = i5 - Integer.MIN_VALUE;
            } else {
                c0694s = new C0694S(this, abstractC1178c);
            }
        }
        Object obj = c0694s.f2219g;
        int i6 = c0694s.f2221i;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            C0171D c0171d = new C0171D(3, c0829u, this);
            C0039U c0039u = new C0039U(this, (InterfaceC1046d) null, 1);
            c0694s.f2221i = 1;
            if (AbstractC2162v.m3982d(new C0810b(c0171d, this.f2227g, c0039u, (InterfaceC1046d) null), c0694s) == EnumC1152a.f3788d) {
                return;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        throw new C0330q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        return this.f2226f.mo1202f();
    }
}
