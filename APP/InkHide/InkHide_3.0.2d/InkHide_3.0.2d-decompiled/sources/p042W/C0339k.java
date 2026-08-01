package p042W;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.C0265p;
import p041V.InterfaceC0323p;
import p051b0.C0492a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0339k extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final C0347s f756a;

    /* JADX INFO: renamed from: b */
    public final C0347s f757b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0323p f758c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0331c f759d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0339k(C0331c c0331c, C0261l c0261l, Type type, AbstractC0274y abstractC0274y, Type type2, AbstractC0274y abstractC0274y2, InterfaceC0323p interfaceC0323p) {
        this.f759d = c0331c;
        this.f756a = new C0347s(c0261l, abstractC0274y, type);
        this.f757b = new C0347s(c0261l, abstractC0274y2, type2);
        this.f758c = interfaceC0323p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        int iMo585x = c0493b.mo585x();
        if (iMo585x == 9) {
            c0493b.mo583t();
            return null;
        }
        Map map = (Map) this.f758c.mo143n();
        C0347s c0347s = this.f757b;
        C0347s c0347s2 = this.f756a;
        AbstractC0274y abstractC0274y = (AbstractC0274y) c0347s.f789c;
        AbstractC0274y abstractC0274y2 = (AbstractC0274y) c0347s2.f789c;
        if (iMo585x == 1) {
            c0493b.mo571a();
            while (c0493b.mo577k()) {
                c0493b.mo571a();
                Object objMo476a = abstractC0274y2.mo476a(c0493b);
                if (map.put(objMo476a, abstractC0274y.mo476a(c0493b)) != null) {
                    throw new C0265p("duplicate key: " + objMo476a);
                }
                c0493b.mo573e();
            }
            c0493b.mo573e();
            return map;
        }
        c0493b.mo572b();
        while (c0493b.mo577k()) {
            C0492a.f1545a.getClass();
            C0492a.m939a(c0493b);
            Object objMo476a2 = abstractC0274y2.mo476a(c0493b);
            if (map.put(objMo476a2, abstractC0274y.mo476a(c0493b)) != null) {
                throw new C0265p("duplicate key: " + objMo476a2);
            }
        }
        c0493b.mo574f();
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c0494c.mo591i();
            return;
        }
        this.f759d.getClass();
        C0347s c0347s = this.f757b;
        c0494c.mo587c();
        for (Map.Entry entry : map.entrySet()) {
            c0494c.mo590g(String.valueOf(entry.getKey()));
            c0347s.mo477b(c0494c, entry.getValue());
        }
        c0494c.mo589f();
    }
}
