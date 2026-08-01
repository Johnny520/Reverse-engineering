package p202o;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import p010a9.InterfaceC0184l;
import p071f0.AbstractC2221a;
import p073f2.AbstractC2278y0;
import p073f2.InterfaceC2254m0;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: o.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5600i {

    /* JADX INFO: renamed from: o.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0184l f17521a;

        public a(InterfaceC0184l interfaceC0184l) {
            this.f17521a = interfaceC0184l;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            Object objM8015c = AbstractC2221a.m8015c(interfaceC2254m0, this.f17521a, interfaceC5976f);
            return objM8015c == AbstractC6325c.m24992g() ? objM8015c : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m22710a(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return AbstractC2278y0.m8290c(interfaceC4507m, C5601j.f17522a, new a(interfaceC0184l));
    }
}
