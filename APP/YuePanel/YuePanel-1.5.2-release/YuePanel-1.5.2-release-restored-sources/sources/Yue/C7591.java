package Yue;

import Yue.C7148;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۢ۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7591 extends AbstractC3017<C7589<?>> {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2956 = AtomicReferenceFieldUpdater.newUpdater(C7591.class, Object.class, "_state");

    @InterfaceC6399
    volatile /* synthetic */ Object _state = null;

    /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)Z */
    @Override // Yue.AbstractC3017
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo79(@InterfaceC6399 C7589<?> c7589) {
        if (this._state != null) {
            return false;
        }
        this._state = C7590.f2954;
        return true;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Object m23762(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        if (!C3008.m74(f2956, this, C7590.f2954, c3666)) {
            C7148.C1189 c1189 = C7148.f21560;
            c3666.resumeWith(C7148.m3438(C8107.f3222));
        }
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)[LYue/ۥ۟ۧۤۢ; */
    @Override // Yue.AbstractC3017
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceC4199<C8107>[] mo80(@InterfaceC6399 C7589<?> c7589) {
        this._state = null;
        return C3016.f36;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23764() {
        while (true) {
            Object obj = this._state;
            if (obj == null || obj == C7590.f2955) {
                return;
            }
            if (obj == C7590.f2954) {
                if (C3008.m74(f2956, this, obj, C7590.f2955)) {
                    return;
                }
            } else if (C3008.m74(f2956, this, obj, C7590.f2954)) {
                C7148.C1189 c1189 = C7148.f21560;
                ((C3666) obj).resumeWith(C7148.m3438(C8107.f3222));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m23765() {
        Object andSet = f2956.getAndSet(this, C7590.f2954);
        C5499.m17100(andSet);
        return andSet == C7590.f2955;
    }
}
