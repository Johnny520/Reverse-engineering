package p166l2;

import android.view.View;
import p003a2.InterfaceC0024a;
import p004a3.AbstractC0042h;
import p004a3.InterfaceC0040g;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p017b2.InterfaceC0932b;
import p018b3.C0982v0;
import p072f1.InterfaceC2226e;
import p073f2.InterfaceC2228a0;
import p073f2.InterfaceC2266s0;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p135j2.AbstractC3545l1;
import p151k2.C3939f;
import p178m1.AbstractC4803o;
import p178m1.C4804p;
import p178m1.InterfaceC4796h;
import p179m2.InterfaceC4822b3;
import p179m2.InterfaceC4850h1;
import p179m2.InterfaceC4853i;
import p179m2.InterfaceC4855i1;
import p179m2.InterfaceC4862j3;
import p179m2.InterfaceC4887o3;
import p179m2.InterfaceC4939z2;
import p204o1.InterfaceC5622d;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p235q1.InterfaceC6223q;
import p265s1.InterfaceC7064d2;
import p277t2.C8060a0;
import p291u2.C8495c;
import p305v1.C8761c;

/* JADX INFO: renamed from: l2.q1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4580q1 extends InterfaceC2266s0 {

    /* JADX INFO: renamed from: k */
    public static final a f13460k = a.f13461a;

    /* JADX INFO: renamed from: l2.q1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f13461a = new a();

        /* JADX INFO: renamed from: b */
        public static boolean f13462b;

        /* JADX INFO: renamed from: a */
        public final boolean m18189a() {
            return f13462b;
        }
    }

    /* JADX INFO: renamed from: l2.q1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: b */
        void mo17915b();
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ void m18160O(InterfaceC4580q1 interfaceC4580q1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: measureAndLayout");
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        interfaceC4580q1.mo18177c(z10);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ void m18161R(InterfaceC4580q1 interfaceC4580q1, C4554j0 c4554j0, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: onRequestRelayout");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        interfaceC4580q1.mo18173M(c4554j0, z10, z11);
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m18162l(InterfaceC4580q1 interfaceC4580q1, C4554j0 c4554j0, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: onRequestMeasure");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        interfaceC4580q1.mo18184u(c4554j0, z10, z11, z12);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ void m18163r(InterfaceC4580q1 interfaceC4580q1, C4554j0 c4554j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        interfaceC4580q1.mo18178k(c4554j0, z10);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ InterfaceC4577p1 m18164v(InterfaceC4580q1 interfaceC4580q1, InterfaceC0188p interfaceC0188p, InterfaceC0173a interfaceC0173a, C8761c c8761c, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: createLayer");
            return null;
        }
        if ((i10 & 4) != 0) {
            c8761c = null;
        }
        return interfaceC4580q1.mo18169I(interfaceC0188p, interfaceC0173a, c8761c);
    }

    /* JADX INFO: renamed from: A */
    void mo18165A(C4554j0 c4554j0);

    /* JADX INFO: renamed from: C */
    void mo18166C(C4554j0 c4554j0);

    /* JADX INFO: renamed from: D */
    void mo18167D(C4554j0 c4554j0);

    /* JADX INFO: renamed from: E */
    void mo18168E(C4554j0 c4554j0);

    /* JADX INFO: renamed from: I */
    InterfaceC4577p1 mo18169I(InterfaceC0188p interfaceC0188p, InterfaceC0173a interfaceC0173a, C8761c c8761c);

    /* JADX INFO: renamed from: J */
    void mo18170J();

    /* JADX INFO: renamed from: K */
    Object mo18171K(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: L */
    void mo18172L();

    /* JADX INFO: renamed from: M */
    void mo18173M(C4554j0 c4554j0, boolean z10, boolean z11);

    /* JADX INFO: renamed from: N */
    void mo18174N(C4554j0 c4554j0, int i10);

    /* JADX INFO: renamed from: Q */
    void mo18175Q(InterfaceC0173a interfaceC0173a);

    /* JADX INFO: renamed from: S */
    void mo18176S(C4554j0 c4554j0);

    /* JADX INFO: renamed from: c */
    void mo18177c(boolean z10);

    InterfaceC4853i getAccessibilityManager();

    InterfaceC4796h getAutofill();

    AbstractC4803o getAutofillManager();

    C4804p getAutofillTree();

    InterfaceC4850h1 getClipboard();

    InterfaceC4855i1 getClipboardManager();

    InterfaceC5980j getCoroutineContext();

    InterfaceC3175e getDensity();

    InterfaceC5622d getDragAndDropManager();

    InterfaceC6223q getFocusOwner();

    AbstractC0042h.b getFontFamilyResolver();

    InterfaceC0040g getFontLoader();

    InterfaceC7064d2 getGraphicsContext();

    InterfaceC0024a getHapticFeedBack();

    InterfaceC0932b getInputModeManager();

    EnumC3191u getLayoutDirection();

    C3939f getModifierLocalManager();

    InterfaceC4574o1 getOutOfFrameExecutor();

    AbstractC3545l1.a getPlacementScope();

    InterfaceC2228a0 getPointerIconService();

    C8495c getRectManager();

    InterfaceC2226e getRetainedValuesStore();

    C4554j0 getRoot();

    C8060a0 getSemanticsOwner();

    C4562l0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    C4586s1 getSnapshotObserver();

    InterfaceC4939z2 getSoftwareKeyboardController();

    C0982v0 getTextInputService();

    InterfaceC4822b3 getTextToolbar();

    InterfaceC4862j3 getViewConfiguration();

    InterfaceC4887o3 getWindowInfo();

    /* JADX INFO: renamed from: k */
    void mo18178k(C4554j0 c4554j0, boolean z10);

    /* JADX INFO: renamed from: n */
    long mo18179n(long j10);

    /* JADX INFO: renamed from: o */
    long mo18180o(long j10);

    /* JADX INFO: renamed from: p */
    void mo18181p(C4554j0 c4554j0, int i10);

    /* JADX INFO: renamed from: s */
    void mo18182s(float f10);

    void setShowLayoutBounds(boolean z10);

    /* JADX INFO: renamed from: t */
    void mo18183t(View view);

    /* JADX INFO: renamed from: u */
    void mo18184u(C4554j0 c4554j0, boolean z10, boolean z11, boolean z12);

    /* JADX INFO: renamed from: w */
    void mo18185w(C4554j0 c4554j0);

    /* JADX INFO: renamed from: x */
    void mo18186x(long j10);

    /* JADX INFO: renamed from: y */
    void mo18187y(C4554j0 c4554j0, long j10);

    /* JADX INFO: renamed from: z */
    void mo18188z(C4554j0 c4554j0);
}
