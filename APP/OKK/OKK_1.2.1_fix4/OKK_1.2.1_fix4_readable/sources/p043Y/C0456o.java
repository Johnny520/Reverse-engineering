package p043Y;

import java.util.ArrayList;
import p063j.C0957b;

/* JADX INFO: renamed from: Y.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0456o extends AbstractC0455n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0957b f1031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0457p f1032b;

    public C0456o(ViewTreeObserverOnPreDrawListenerC0457p viewTreeObserverOnPreDrawListenerC0457p, C0957b c0957b) {
        this.f1032b = viewTreeObserverOnPreDrawListenerC0457p;
        this.f1031a = c0957b;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m abstractC0454m) {
        ((ArrayList) this.f1031a.getOrDefault(this.f1032b.f1034b, null)).remove(abstractC0454m);
        abstractC0454m.mo1062x(this);
    }
}
