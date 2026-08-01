package p000A;

import androidx.compose.p134ui.input.pointer.PointerInputEventHandler;
import p007B0.InterfaceC0169B;
import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: A.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0043W implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0092v0 f186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0920W f187b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0043W(InterfaceC0092v0 interfaceC0092v0, C0920W c0920w) {
        this.f186a = interfaceC0092v0;
        this.f187b = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p134ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC0169B interfaceC0169B, InterfaceC1046d interfaceC1046d) {
        Object objM3982d = AbstractC2162v.m3982d(new C0041V(interfaceC0169B, this.f186a, this.f187b, null), interfaceC1046d);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }
}
