package p073f2;

import android.view.MotionEvent;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p165l1.InterfaceC4507m;
import p167l3.AbstractC4609b;

/* JADX INFO: renamed from: f2.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2258o0 {

    /* JADX INFO: renamed from: f2.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC4609b f6211r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4609b abstractC4609b) {
            super(1);
            this.f6211r = abstractC4609b;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            int actionMasked = motionEvent.getActionMasked();
            AbstractC4609b abstractC4609b = this.f6211r;
            switch (actionMasked) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = abstractC4609b.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = abstractC4609b.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m8207a(InterfaceC4507m interfaceC4507m, AbstractC4609b abstractC4609b) {
        C2256n0 c2256n0 = new C2256n0();
        c2256n0.m8196n(new a(abstractC4609b));
        C2270u0 c2270u0 = new C2270u0();
        c2256n0.m8197p(c2270u0);
        abstractC4609b.setOnRequestDisallowInterceptTouchEvent$ui(c2270u0);
        return interfaceC4507m.mo17445i(c2256n0);
    }
}
