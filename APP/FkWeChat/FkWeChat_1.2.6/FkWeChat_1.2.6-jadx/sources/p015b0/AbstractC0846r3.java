package p015b0;

import android.view.InputDevice;
import android.view.KeyEvent;
import p010a9.InterfaceC0184l;
import p042d2.AbstractC1858c;
import p042d2.AbstractC1859d;
import p042d2.AbstractC1861f;
import p042d2.AbstractC1864i;
import p042d2.C1857b;
import p165l1.InterfaceC4507m;
import p179m2.InterfaceC4939z2;
import p235q1.C6203g;
import p235q1.InterfaceC6217n;

/* JADX INFO: renamed from: b0.r3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846r3 {

    /* JADX INFO: renamed from: b0.r3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC6217n f2686q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C0831p2 f2687r;

        public a(InterfaceC6217n interfaceC6217n, C0831p2 c0831p2) {
            this.f2686q = interfaceC6217n;
            this.f2687r = c0831p2;
        }

        /* JADX INFO: renamed from: a */
        public final Boolean m3181a(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zMo24455s = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && AbstractC1858c.m6601e(AbstractC1859d.m6606b(keyEvent), AbstractC1858c.f5187a.m6602a()) && keyEvent.getSource() != 257) {
                if (AbstractC0846r3.m3180c(keyEvent, 19)) {
                    zMo24455s = this.f2686q.mo24455s(C6203g.f19254b.m24385h());
                } else if (AbstractC0846r3.m3180c(keyEvent, 20)) {
                    zMo24455s = this.f2686q.mo24455s(C6203g.f19254b.m24378a());
                } else if (AbstractC0846r3.m3180c(keyEvent, 21)) {
                    zMo24455s = this.f2686q.mo24455s(C6203g.f19254b.m24381d());
                } else if (AbstractC0846r3.m3180c(keyEvent, 22)) {
                    zMo24455s = this.f2686q.mo24455s(C6203g.f19254b.m24384g());
                } else if (AbstractC0846r3.m3180c(keyEvent, 23)) {
                    InterfaceC4939z2 interfaceC4939z2M3118l = this.f2687r.m3118l();
                    if (interfaceC4939z2M3118l != null) {
                        interfaceC4939z2M3118l.mo19522b();
                    }
                    zMo24455s = true;
                }
            }
            return Boolean.valueOf(zMo24455s);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m3181a(((C1857b) obj).m6596f());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m3179b(InterfaceC4507m interfaceC4507m, C0831p2 c0831p2, InterfaceC6217n interfaceC6217n) {
        return AbstractC1861f.m6614b(interfaceC4507m, new a(interfaceC6217n, c0831p2));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3180c(KeyEvent keyEvent, int i10) {
        return AbstractC1864i.m6620b(AbstractC1859d.m6605a(keyEvent)) == i10;
    }
}
