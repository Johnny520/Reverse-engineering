package p267s1;

import android.view.MotionEvent;
import gg.AbstractC1416l;
import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: s1.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3920z extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12871g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3884a0 f12872h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3920z(C3884a0 c3884a0, int i9) {
        super(1);
        this.f12871g = i9;
        this.f12872h = c3884a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f12871g) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                C3886b0 c3886b0 = this.f12872h.f12741a;
                if (c3886b0 != null) {
                    c3886b0.invoke(motionEvent);
                    return C3967n.f12976a;
                }
                AbstractC1416l.m3831g("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                C3886b0 c3886b02 = this.f12872h.f12741a;
                if (c3886b02 != null) {
                    c3886b02.invoke(motionEvent2);
                    return C3967n.f12976a;
                }
                AbstractC1416l.m3831g("onTouchEvent");
                throw null;
        }
    }
}
