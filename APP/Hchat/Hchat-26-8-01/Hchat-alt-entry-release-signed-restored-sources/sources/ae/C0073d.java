package ae;

import be.C0300r;
import bsh.classpath.BshClassPath;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import p000a.AbstractC0000a;
import p023b8.AbstractC0212j;
import p025bc.C0257g;
import p025bc.C0264n;
import p068eh.AbstractC0921a;
import p081fc.C1199b;
import p215od.C3128a;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3499c;
import p246qd.C3503g;
import p246qd.C3515s;
import p247qe.EnumC3529l;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;

/* JADX INFO: renamed from: ae.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0073d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.a.y(ud.r, ud.a, boolean):java.util.ArrayList, ae.f.a(ud.r, od.a):boolean, ae.f.toString():java.lang.String, ae.h.toString():java.lang.String, b8.f.b():int, b8.f.f():int, bc.g.<init>():void, bc.k.e():void, bsh.classpath.BshClassPath.searchJarFSForClasses(java.net.URL):java.lang.String[], bsh.classpath.BshClassPath.searchJrtFSForClasses(java.net.URL):java.lang.String[], com.alibaba.fastjson2.writer.ObjectWriterProvider.getObjectWriterModule(java.lang.reflect.Type, java.lang.Class):com.alibaba.fastjson2.writer.ObjectWriter, g4.a.i(ud.r):void] */
    public /* synthetic */ C0073d(int i9) {
        this.f230a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z9 = true;
        switch (this.f230a) {
            case 0:
                return ((C3128a) obj).f10139h;
            case 1:
                return AbstractC0921a.m2249l(((C0077h) obj).f243g, "#");
            case 2:
                return ((AbstractC0212j) obj).iterator();
            case 3:
                return new C1199b((C0257g) obj);
            case 4:
                return ((List) obj).stream();
            case 5:
                throw AbstractC0921a.m2247j(obj);
            case 6:
                return ((File) obj).toPath();
            case 7:
                return ((C0264n) obj).f782a.f14410k.f10157n;
            case 8:
                return new ArrayList();
            case 9:
                return ((C0300r) obj).f866a;
            case 10:
                return ((C0300r) obj).f866a;
            case 11:
                return 1;
            case 12:
                return ((C4311g) ((Map.Entry) obj).getKey()).f14390l;
            case 13:
                return ((C3515s) obj).m7400d();
            case 14:
                return Boolean.valueOf(((EnumC3529l) obj).m7434b());
            case 15:
                EnumC3529l enumC3529l = (EnumC3529l) obj;
                if (!enumC3529l.m7434b() && !enumC3529l.m7435c() && enumC3529l != EnumC3529l.f11485k) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 16:
                return new ArrayList();
            case 17:
                C3503g c3503g = AbstractC3506j.f11385b;
                return new C3499c((String) obj, Collections.EMPTY_LIST);
            case 18:
                return ((AbstractC3508l) obj).mo7387X();
            case 19:
                return ((AbstractC3508l) obj).mo7374H();
            case 20:
                return ((Path) obj).toString();
            case 21:
                return BshClassPath.canonicalizeClassName((String) obj);
            case 22:
                return ((C4305a) obj).f14353n.stream();
            case 23:
                C4320p c4320pM57c0 = AbstractC0000a.m57c0(((C0075f) obj).f234c);
                Objects.requireNonNull(c4320pM57c0);
                return c4320pM57c0.f14397l;
            case 24:
                return ((C0075f) obj).f235d.stream();
            case 25:
                return new ArrayList();
            case 26:
                return ((C0075f) obj).f234c;
            case 27:
                return ((C4305a) obj).f14352m;
            case 28:
                return ((C4305a) obj).f14353n;
            default:
                return ((Field) obj).getDeclaringClass();
        }
    }
}
