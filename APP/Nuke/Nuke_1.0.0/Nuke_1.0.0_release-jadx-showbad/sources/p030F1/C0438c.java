package p030F1;

import java.util.LinkedHashSet;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p135b.C1836x;
import p178i3.C2318C;

/* JADX INFO: renamed from: F1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0438c {

    /* JADX INFO: renamed from: a */
    public final C1836x f1314a;

    /* JADX INFO: renamed from: b */
    public final C0443h f1315b = new C0443h();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f1316c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f1317d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0438c(C1836x c1836x) {
        this.f1314a = c1836x;
        new LinkedHashSet();
        this.f1316c = new LinkedHashSet();
        this.f1317d = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m699a(C0438c c0438c, AbstractC0440e abstractC0440e) {
        c0438c.getClass();
        AbstractC1665j.m2985e(abstractC0440e, "handler");
        if (c0438c.f1316c.add(abstractC0440e)) {
            C0443h c0443h = c0438c.f1315b;
            c0443h.getClass();
            if (abstractC0440e.f1320c == null) {
                c0443h.f1329e.addFirst(abstractC0440e);
                abstractC0440e.f1320c = c0438c;
                c0443h.m712b();
            } else {
                throw new IllegalArgumentException(("Handler '" + abstractC0440e + "' is already registered with a dispatcher").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m700b(AbstractC0442g abstractC0442g) {
        if (this.f1317d.add(abstractC0442g)) {
            this.f1315b.m711a(this, abstractC0442g, -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m701c(C0447l c0447l, int i5) {
        if (i5 != 1 && i5 != 0) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Unsupported priority value: ", i5).toString());
        }
        if (this.f1317d.add(c0447l)) {
            this.f1315b.m711a(this, c0447l, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m702d(AbstractC0442g abstractC0442g, C0437b c0437b) {
        C0443h c0443h = this.f1315b;
        c0443h.getClass();
        if (c0443h.f1331g != 0) {
            return;
        }
        AbstractC0440e abstractC0440eM713c = c0443h.m713c(-1);
        c0443h.f1330f = abstractC0440eM713c;
        c0443h.f1331g = -1;
        c0443h.f1332h = abstractC0442g;
        if (c0437b != null) {
            if (abstractC0440eM713c != null) {
                abstractC0440eM713c.mo706d(c0437b);
            }
            C2318C c2318c = c0443h.f1325a;
            C0445j c0445j = new C0445j(c0437b);
            c2318c.getClass();
            c2318c.m4147g(null, c0445j);
        }
    }
}
