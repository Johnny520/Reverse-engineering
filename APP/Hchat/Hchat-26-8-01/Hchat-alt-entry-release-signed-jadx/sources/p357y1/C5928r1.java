package p357y1;

import p028c1.C0372b;
import p085fg.InterfaceC1220a;
import p177m2.InterfaceC2759c;
import wf.InterfaceC5560f;

/* JADX INFO: renamed from: y1.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5928r1 implements InterfaceC5560f, InterfaceC5901k2, InterfaceC2759c {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C5928r1 f24041g = new C5928r1();

    /* JADX INFO: renamed from: h */
    public static final C5928r1 f24042h = new C5928r1();

    /* JADX INFO: renamed from: i */
    public static final C5925q2 f24043i = new C5925q2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5901k2
    /* JADX INFO: renamed from: a */
    public InterfaceC1220a mo10617a(AbstractC5858a abstractC5858a) {
        ViewOnAttachStateChangeListenerC5893i2 viewOnAttachStateChangeListenerC5893i2 = new ViewOnAttachStateChangeListenerC5893i2(abstractC5858a, 0);
        abstractC5858a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC5893i2);
        return new C0372b(abstractC5858a, 10, viewOnAttachStateChangeListenerC5893i2);
    }
}
