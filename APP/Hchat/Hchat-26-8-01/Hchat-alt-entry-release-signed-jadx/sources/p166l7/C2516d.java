package p166l7;

import be.C0293m;
import java.util.Iterator;
import p209o7.C3069c;
import p209o7.C3075i;
import p209o7.C3076j;
import p229p7.C3337g;
import p257r7.AbstractC3721k;
import p257r7.AbstractC3729s;
import p273s7.C3933b;
import p273s7.C3934c;
import p363y7.AbstractC5999a;
import p379z7.AbstractC6117m;
import p379z7.C6111g;
import p379z7.C6112h;

/* JADX INFO: renamed from: l7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2516d extends AbstractC6117m {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8143i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2516d(Iterator it, int i9) {
        super(it);
        this.f8143i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.AbstractC6117m
    /* JADX INFO: renamed from: b */
    public final Iterator mo5912b(Object obj) {
        int size;
        switch (this.f8143i) {
            case 0:
                C3076j c3076j = (C3076j) obj;
                C2518f c2518f = (C2518f) c3076j.m5553u(C2518f.class);
                if (c2518f == null) {
                    return C6112h.f24664g;
                }
                Iterator it = c3076j.f9949m.f9926k.iterator();
                int i9 = -1;
                while (it.hasNext()) {
                    C3933b c3933b = ((C2525m) it.next()).f8159o;
                    C3069c c3069c = c3933b.f12915n;
                    if (((C3934c) c3069c).f9927l == AbstractC3721k.f12090p) {
                        C3934c c3934c = (C3934c) c3069c;
                        int size2 = c3934c.f9926k.size();
                        size = -1;
                        for (int i10 = 0; i10 < size2; i10++) {
                            int iMo7729N = ((AbstractC3721k) c3934c.m6524Q(i10)).mo7729N();
                            if (iMo7729N > size) {
                                size = iMo7729N;
                            }
                        }
                    } else {
                        size = c3933b.f9926k.size() - 1;
                    }
                    if (size > i9) {
                        i9 = size;
                    }
                }
                return new C3075i(i9, (((C3337g) c3076j.f9948l.f8138m).f10739r.get() << 16) | (c2518f.mo5913U() << 24), c2518f);
            case 1:
                return new C2516d(((C2518f) obj).f8147q.f9934m.f9926k.iterator(), 0);
            case 2:
                return ((C2524l) obj).m5927W(null);
            default:
                AbstractC3729s abstractC3729s = (AbstractC3729s) obj;
                abstractC3729s.mo7736W();
                Iterator itM10744g = AbstractC5999a.m10744g(abstractC3729s.f12105p);
                return !itM10744g.hasNext() ? C6112h.f24664g : new C6111g(itM10744g, new C0293m(C2518f.class, 2, null));
        }
    }
}
