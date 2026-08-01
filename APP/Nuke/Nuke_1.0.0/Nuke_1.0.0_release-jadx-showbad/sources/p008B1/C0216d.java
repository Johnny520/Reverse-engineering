package p008B1;

import java.util.Map;
import me.dartcv.nuke.BuildConfig;
import p002A1.InterfaceC0145r;
import p095T.InterfaceC1315H;
import p117X2.C1675t;
import p139c.C1880c;
import p152e0.C1997d;
import p152e0.C2002i;
import p158f0.C2085q;
import p186k.C2408E;
import p197m.C2559s;

/* JADX INFO: renamed from: B1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0216d implements InterfaceC1315H {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f761c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f762d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0216d(Object obj, Object obj2, Object obj3, int i5) {
        this.f759a = i5;
        this.f760b = obj;
        this.f761c = obj2;
        this.f762d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1315H
    /* JADX INFO: renamed from: a */
    public final void mo17a() {
        switch (this.f759a) {
            case 0:
                ((InterfaceC0145r) this.f760b).getLifecycle().mo185b((C0215c) this.f761c);
                C1880c c1880c = (C1880c) ((C1675t) this.f762d).f5710e;
                if (c1880c != null) {
                    c1880c.m3371a();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1997d c1997d = (C1997d) this.f760b;
                C2408E c2408e = c1997d.f6715e;
                Object obj = this.f761c;
                Object objM4276k = c2408e.m4276k(obj);
                C2002i c2002i = (C2002i) this.f762d;
                if (objM4276k == c2002i) {
                    Map map = c1997d.f6714d;
                    Map mapMo1276b = c2002i.mo1276b();
                    if (!mapMo1276b.isEmpty()) {
                        map.put(obj, mapMo1276b);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            default:
                C2085q c2085q = (C2085q) this.f760b;
                Object obj2 = this.f761c;
                c2085q.remove(obj2);
                ((C2559s) this.f762d).f8174c.m4276k(obj2);
                break;
        }
    }
}
