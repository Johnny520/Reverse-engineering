package Yue;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4185 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Set<InterfaceC6551> f726 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public volatile Context f727;

    /* JADX INFO: renamed from: ۥ */
    public final void m1139(@InterfaceC6399 InterfaceC6551 interfaceC6551) {
        C5499.m17103(interfaceC6551, "listener");
        Context context = this.f727;
        if (context != null) {
            interfaceC6551.mo1013(context);
        }
        this.f726.add(interfaceC6551);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1140() {
        this.f727 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12052(@InterfaceC6399 Context context) {
        C5499.m17103(context, "context");
        this.f727 = context;
        Iterator<InterfaceC6551> it = this.f726.iterator();
        while (it.hasNext()) {
            it.next().mo1013(context);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Context m12053() {
        return this.f727;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m12054(@InterfaceC6399 InterfaceC6551 interfaceC6551) {
        C5499.m17103(interfaceC6551, "listener");
        this.f726.remove(interfaceC6551);
    }
}
