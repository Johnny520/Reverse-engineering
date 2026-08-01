package p200nb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p376zd.C10010p0;

/* JADX INFO: renamed from: nb.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5540e extends AbstractC5535a {

    /* JADX INFO: renamed from: q */
    public AbstractC5538c f17318q;

    public AbstractC5540e(AbstractC5538c abstractC5538c) {
        abstractC5538c.getClass();
        this.f17318q = abstractC5538c;
    }

    @Override // p200nb.AbstractC5535a
    /* JADX INFO: renamed from: a */
    public final AbstractC5538c mo22557a() {
        return this.f17318q;
    }

    @Override // p200nb.AbstractC5535a
    /* JADX INFO: renamed from: l */
    public final void mo22559l(String str, Object obj) {
        str.getClass();
        obj.getClass();
        int iM22604f = mo9576c().m22604f(str);
        int iMo22566a = this.f17318q.mo22566a();
        if (iMo22566a == 0) {
            AbstractC5538c abstractC5538c = this.f17318q;
            if (abstractC5538c instanceof C5544i) {
                this.f17318q = new C5550o(obj, iM22604f);
                return;
            } else {
                C10010p0.m38820a(m22570o(abstractC5538c, 0, "EmptyArrayMap"));
                return;
            }
        }
        if (iMo22566a == 1) {
            AbstractC5538c abstractC5538c2 = this.f17318q;
            try {
                abstractC5538c2.getClass();
                C5550o c5550o = (C5550o) abstractC5538c2;
                if (c5550o.m22583e() == iM22604f) {
                    this.f17318q = new C5550o(obj, iM22604f);
                    return;
                } else {
                    C5539d c5539d = new C5539d();
                    c5539d.mo22567c(c5550o.m22583e(), c5550o.m22584l());
                    this.f17318q = c5539d;
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(m22570o(abstractC5538c2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.f17318q.mo22567c(iM22604f, obj);
    }

    /* JADX INFO: renamed from: o */
    public final String m22570o(AbstractC5538c abstractC5538c, int i10, String str) {
        Object next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder("Type: ");
        sb3.append(abstractC5538c.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map mapM22601b = mo9576c().m22601b();
        sb4.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(abstractC5538c, 10));
        int i11 = 0;
        for (Object obj : abstractC5538c) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC5114x.m20810y();
            }
            Iterator it = mapM22601b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: ".concat(sb4.toString()));
        sb2.append('\n');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5540e() {
        C5544i c5544i = C5544i.f17331q;
        c5544i.getClass();
        this(c5544i);
    }
}
