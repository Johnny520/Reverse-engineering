package p111W1;

import com.bumptech.glide.load.data.C1940j;
import java.util.ArrayDeque;
import p000A.C0066i0;
import p078P1.C1146h;
import p078P1.C1147i;
import p107V1.C1508g;
import p107V1.C1515n;
import p107V1.C1516o;
import p107V1.C1517p;
import p107V1.InterfaceC1518q;

/* JADX INFO: renamed from: W1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1595a implements InterfaceC1518q {

    /* JADX INFO: renamed from: b */
    public static final C1146h f5522b = C1146h.m2200a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a */
    public final C0066i0 f5523a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1595a(C0066i0 c0066i0) {
        this.f5523a = c0066i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2773a(Object obj) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        C1508g c1508g = (C1508g) obj;
        C0066i0 c0066i0 = this.f5523a;
        if (c0066i0 != null) {
            C1515n c1515n = (C1515n) c0066i0.f297e;
            C1516o c1516oM2787a = C1516o.m2787a(c1508g);
            Object objM4447a = c1515n.m4447a(c1516oM2787a);
            ArrayDeque arrayDeque = C1516o.f5267b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c1516oM2787a);
            }
            C1508g c1508g2 = (C1508g) objM4447a;
            if (c1508g2 == null) {
                c1515n.m4448d(C1516o.m2787a(c1508g), c1508g);
            } else {
                c1508g = c1508g2;
            }
        }
        return new C1517p(c1508g, new C1940j(c1508g, ((Integer) c1147i.m2201c(f5522b)).intValue()));
    }
}
