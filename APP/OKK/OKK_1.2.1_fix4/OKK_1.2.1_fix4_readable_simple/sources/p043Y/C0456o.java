package p043Y;

import android.view.ViewGroup;
import java.util.ArrayList;
import p063j.C0957b;

/* JADX INFO: renamed from: Y.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0456o extends AbstractC0455n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0957b f1031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0457p f1032b;

    public C0456o(ViewTreeObserverOnPreDrawListenerC0457p r1, C0957b r2) {
        this.f1032b = r1;
        this.f1031a = r2;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r4) {
        ViewGroup r02 = this.f1032b.f1034b;
        ((ArrayList) this.f1031a.getOrDefault(r02, null)).remove(r4);
        r4.mo1062x(this);
    }
}
