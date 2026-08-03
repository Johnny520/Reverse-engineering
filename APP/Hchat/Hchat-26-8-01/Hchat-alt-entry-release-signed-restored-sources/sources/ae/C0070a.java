package ae;

import java.util.function.ToIntFunction;
import ke.C2403l;
import p066ed.C0909b;
import p067ef.C0918c;
import p199nd.AbstractC2963b0;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: ae.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0070a implements ToIntFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bc.k.e():void, be.b.S(ud.r, p4.t):void, be.b.X(ud.e):void, be.f.g(ud.r):void, ce.d.accept(java.lang.Object):void, ce.l.g(ud.r):void, ce.l.n(java.util.LinkedHashSet, ud.r):void, com.alibaba.fastjson2.writer.ObjectWriterProvider.getObjectWriterModule(java.lang.reflect.Type, java.lang.Class):com.alibaba.fastjson2.writer.ObjectWriter, e9.a.c(java.io.InputStream, long):java.lang.Object, ed.c.f():void, fc.a.<init>(java.lang.String, java.util.Map, java.util.Map):void, fd.a.a(fc.f, boolean):void, ke.c.p(hb.r):boolean, qd.s.<clinit>():void] */
    public /* synthetic */ C0070a(int i9) {
        this.f227a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C4320p c4320p;
        switch (this.f227a) {
            case 0:
                return ((C0075f) obj).f233b;
            case 1:
                return ((AbstractC2963b0) obj).f9752i;
            case 2:
                return ((C0075f) obj).f235d.size();
            case 3:
                return ((C4305a) obj).f14351l.size();
            case 4:
                return ((StackTraceElement) obj).getLineNumber();
            case 5:
                C3514r c3514r = (C3514r) obj;
                if (c3514r == null || (c4320p = c3514r.f11420j) == null) {
                    return -1;
                }
                return c4320p.f14399n;
            case 6:
                return ((Integer) obj).intValue();
            case 7:
                return ((C0918c) obj).f2873a;
            case 8:
                return ((C0909b) obj).f2829d.size();
            case 9:
                return ((AbstractC2963b0) obj).f9752i;
            case 10:
                return ((Integer) obj).intValue();
            case 11:
                return ((C2403l) obj).f7877d;
            case 12:
                return ((C3515s) obj).f11442g;
            case 13:
                return ((C3515s) obj).f11443h;
            case 14:
                return ((C4309e) obj).f14380t.size();
            default:
                return ((C4322r) obj).f14414o;
        }
    }
}
