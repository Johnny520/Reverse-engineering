package p025bc;

import ae.C0070a;
import ae.C0073d;
import ae.C0074e;
import ae.C0076g;
import af.C0081d;
import af.C0084g;
import be.AbstractC0269a;
import be.AbstractC0283h;
import be.C0280f0;
import be.C0294m0;
import bf.AbstractC0310b;
import com.alibaba.fastjson2.writer.C0640b;
import java.io.Closeable;
import java.io.File;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lc.InterfaceC2550a;
import me.C2833a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.EnumC3002d;
import p007a7.C0019b;
import p012ah.C0086a;
import p014b.C0126e;
import p025bc.C0260j;
import p038ce.C0561n;
import p052dd.AbstractC0770a;
import p052dd.C0771b;
import p053df.C0775c;
import p053df.C0779g;
import p063e9.C0830a;
import p066ed.C0910c;
import p082fd.C1211h;
import p084ff.C1216b;
import p084ff.C1217c;
import p136j8.C2104o;
import p157kd.C2387a;
import p162l3.C2469w;
import p170le.C2556d;
import p174m.C2571a;
import p215od.C3128a;
import p245qc.C3493c;
import p246qd.AbstractC3506j;
import p289te.C4147a;
import p289te.C4148b;
import p301uc.InterfaceC4304b;
import p302ud.C4306b;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4323s;
import p302ud.C4324t;
import p302ud.C4325u;
import p303ue.C4326a;
import p332wb.AbstractC4855en;
import p349xc.InterfaceC5770a;
import p349xc.InterfaceC5771b;
import p349xc.InterfaceC5773d;
import p351xe.AbstractC5798s;
import p351xe.C5791l;
import ve.AbstractC4549a;
import ve.C4550b;

/* JADX INFO: renamed from: bc.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261k implements Closeable {

    /* JADX INFO: renamed from: s */
    public static final InterfaceC2844b f763s = AbstractC2846d.m6274b(C0261k.class);

    /* JADX INFO: renamed from: g */
    public final C0257g f764g;

    /* JADX INFO: renamed from: j */
    public final C2571a f767j;

    /* JADX INFO: renamed from: k */
    public C4325u f768k;

    /* JADX INFO: renamed from: l */
    public ArrayList f769l;

    /* JADX INFO: renamed from: i */
    public final ArrayList f766i = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ArrayList f771n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ArrayList f772o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final HashMap f773p = new HashMap();

    /* JADX INFO: renamed from: q */
    public final ArrayList f774q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final C4326a f775r = new C4326a();

    /* JADX INFO: renamed from: h */
    public final C4147a f765h = new C4147a(this);

    /* JADX INFO: renamed from: m */
    public final C0267q f770m = new C0267q(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0261k(C0257g c0257g) {
        this.f764g = c0257g;
        this.f767j = new C2571a(new C0126e(c0257g.f725K, 29, EnumSet.noneOf(EnumC3002d.class)), 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1038a(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Closeable closeable = (Closeable) it.next();
                try {
                    closeable.close();
                } catch (Exception e6) {
                    f763s.mo6265s(closeable, "Fail to close '{}'", e6);
                }
            }
        } finally {
            arrayList.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized C0262l m1039b(C4309e c4309e) {
        C0262l c0262l;
        try {
            c0262l = c4309e.f14370E;
            if (c0262l == null) {
                c0262l = c4309e.m8659d0() ? new C0262l(c4309e, m1039b(c4309e.f14384x)) : new C0262l(c4309e, this);
                c4309e.f14370E = c0262l;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0262l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized C0264n m1040c(C4322r c4322r) {
        C0264n c0264n;
        c0264n = c4322r.f14409I;
        if (c0264n == null) {
            m1039b(c4322r.f14411l);
            c0264n = new C0264n(c4322r);
            c4322r.f14409I = c0264n;
        }
        return c0264n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1042g();
        m1038a(this.f766i);
        m1038a(this.f771n);
        m1038a(this.f772o);
        m1038a(this.f774q);
        C0257g c0257g = this.f764g;
        c0257g.f724J.getClass();
        Path pathResolve = AbstractC4549a.f15008a.resolve("tmp");
        InterfaceC2844b interfaceC2844b = AbstractC0310b.f883a;
        if (pathResolve != null) {
            AbstractC0310b.m1229c(pathResolve.toFile());
        }
        if (Files.exists(pathResolve, new LinkOption[0])) {
            try {
                AbstractC0310b.m1228b(pathResolve, false);
            } catch (Exception e6) {
                AbstractC0310b.f883a.mo6260n(pathResolve.toAbsolutePath(), "Failed to delete dir: {}", e6);
            }
        }
        c0257g.close();
        if (Files.isDirectory(AbstractC0310b.f884b, new LinkOption[0])) {
            Path path = AbstractC0310b.f884b;
            try {
                AbstractC0310b.m1228b(path, true);
            } catch (Exception e7) {
                throw new C0084g("Failed to clear directory ".concat(String.valueOf(path)), e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1041e() {
        int i9;
        List list;
        C0265o c0265o;
        C0775c c0775c;
        String str;
        int iLastIndexOf;
        String strSubstring;
        File file;
        m1042g();
        InterfaceC2844b interfaceC2844b = AbstractC0258h.f758a;
        C0257g c0257g = this.f764g;
        ArrayList<File> arrayList = c0257g.f738g;
        if (arrayList.isEmpty() && this.f771n.isEmpty()) {
            throw new C0081d("Please specify input file");
        }
        for (File file2 : arrayList) {
            if (!file2.exists()) {
                throw new C0081d(AbstractC4855en.m9263g("File not found ", file2.getAbsolutePath()));
            }
        }
        File file3 = c0257g.f739h;
        File file4 = c0257g.f740i;
        File file5 = c0257g.f741j;
        int i10 = 46;
        int i11 = 0;
        if (file3 == null) {
            if (file4 != null) {
                file = file4;
            } else if (file5 != null) {
                file = file5;
            } else {
                ArrayList arrayList2 = c0257g.f738g;
                if (arrayList2.isEmpty()) {
                    strSubstring = "jadx-output";
                } else {
                    String name = ((File) arrayList2.get(0)).getName();
                    int iLastIndexOf2 = name.lastIndexOf(46);
                    strSubstring = iLastIndexOf2 != -1 ? name.substring(0, iLastIndexOf2) : name.concat("-jadx-output");
                }
                interfaceC2844b.mo6247a(strSubstring, "output directory: {}");
                file = new File(strSubstring);
            }
            c0257g.f739h = file;
        }
        if (file4 == null) {
            c0257g.f740i = new File(c0257g.f739h, "sources");
        }
        if (file5 == null) {
            c0257g.f741j = new File(c0257g.f739h, "resources");
        }
        AbstractC0258h.m1037a(c0257g.f739h, "Output");
        AbstractC0258h.m1037a(c0257g.f740i, "Source output");
        AbstractC0258h.m1037a(c0257g.f741j, "Resources output");
        if (interfaceC2844b.mo6250d()) {
            interfaceC2844b.mo6270x(c0257g, "Effective jadx args: {}");
        }
        f763s.mo6248b();
        this.f764g.f724J.getClass();
        Path pathResolve = AbstractC4549a.f15008a.resolve("tmp");
        InterfaceC2844b interfaceC2844b2 = AbstractC0310b.f883a;
        if (pathResolve != null) {
            AbstractC0310b.m1229c(pathResolve.toFile());
        }
        synchronized (AbstractC0310b.class) {
            if (pathResolve != null) {
                try {
                    AbstractC0310b.m1229c(pathResolve.toFile());
                    Path pathCreateTempDirectory = Files.createTempDirectory(pathResolve, "jadx-instance-", new FileAttribute[0]);
                    AbstractC0310b.f884b = pathCreateTempDirectory;
                    pathCreateTempDirectory.toFile().deleteOnExit();
                } catch (Exception e6) {
                    throw new C0084g("Failed to update temp root directory", e6);
                }
            } else {
                Path pathCreateTempDirectory2 = Files.createTempDirectory(pathResolve, "jadx-instance-", new FileAttribute[0]);
                AbstractC0310b.f884b = pathCreateTempDirectory2;
                pathCreateTempDirectory2.toFile().deleteOnExit();
            }
        }
        C4147a c4147a = this.f765h;
        this.f764g.getClass();
        c4147a.f13670e.put("java-input", "java-input");
        C4147a c4147a2 = this.f765h;
        InterfaceC4304b interfaceC4304b = this.f764g.f729O;
        c4147a2.f13668c.clear();
        String strM1988b = AbstractC0770a.m1988b();
        strM1988b.startsWith("r");
        strM1988b.equals("dev");
        Iterator it = interfaceC4304b.mo2844j().iterator();
        while (true) {
            int i12 = 20;
            if (it.hasNext()) {
                C4148b c4148b = new C4148b(c4147a2.f13666a, (C1217c) it.next());
                HashSet hashSet = c4147a2.f13667b;
                c4148b.m8344a();
                if (!hashSet.contains("dex-input")) {
                    c4148b.f13674i.getClass();
                    C4147a.f13665g.mo6270x(c4148b, "Loading plugin: {}");
                    if (!c4147a2.f13668c.add(c4148b)) {
                        C2104o.m5294t(AbstractC0255e.m1021j("Duplicate plugin id: ", String.valueOf(c4148b), ", class ", String.valueOf(C1217c.class)));
                        return;
                    }
                    c4147a2.f13671f.forEach(new C0076g(c4148b, i12));
                }
            } else {
                synchronized (c4147a2) {
                    Map map = (Map) c4147a2.f13668c.stream().collect(Collectors.groupingBy(new C2833a(13)));
                    ArrayList arrayList3 = new ArrayList(map.size());
                    i9 = 3;
                    map.forEach(new C0280f0(c4147a2, i9, arrayList3));
                    c4147a2.f13669d.clear();
                    c4147a2.f13669d.addAll(arrayList3);
                }
                InterfaceC2844b interfaceC2844b3 = f763s;
                if (interfaceC2844b3.mo6250d()) {
                    interfaceC2844b3.mo6270x(this.f765h.f13669d, "Resolved plugins: {}");
                }
                C4147a c4147a3 = this.f765h;
                TreeSet<C4148b> treeSet = c4147a3.f13669d;
                C2469w c2469w = new C2469w(28);
                C4550b c4550b = c4147a3.f13666a.f764g.f724J;
                Iterator it2 = treeSet.iterator();
                while (true) {
                    int i13 = 1;
                    if (!it2.hasNext()) {
                        for (C4148b c4148b2 : treeSet) {
                            C1211h c1211h = c4148b2.f13678m;
                            if (c1211h != null) {
                                c4148b2.m8344a();
                                List listUnmodifiableList = Collections.unmodifiableList((ArrayList) c1211h.f4072h);
                                if (listUnmodifiableList == null) {
                                    C2104o.m5294t("Null option descriptions in plugin id: dex-input");
                                    return;
                                }
                                listUnmodifiableList.forEach(new C0074e(27));
                            }
                        }
                        InterfaceC2844b interfaceC2844b4 = f763s;
                        int i14 = 5;
                        if (interfaceC2844b4.mo6250d()) {
                            List list2 = (List) this.f773p.values().stream().flatMap(new C0073d(4)).map(new C0073d(i14)).collect(Collectors.toList());
                            interfaceC2844b4.mo6271y(Integer.valueOf(list2.size()), "Loaded custom passes: {} {}", list2);
                        }
                        ArrayList arrayList4 = this.f766i;
                        arrayList4.clear();
                        List<Path> listM10509c = AbstractC5798s.m10509c(this.f764g.f738g, new C0073d(6));
                        InterfaceC2844b interfaceC2844b5 = AbstractC0310b.f883a;
                        ArrayList arrayList5 = new ArrayList(listM10509c.size());
                        for (Path path : listM10509c) {
                            if (Files.isDirectory(path, new LinkOption[0])) {
                                try {
                                    Stream<Path> streamWalk = Files.walk(path, FileVisitOption.FOLLOW_LINKS);
                                    try {
                                        streamWalk.filter(new C0019b(21)).forEach(new C0294m0(i13, arrayList5));
                                        streamWalk.close();
                                    } catch (Throwable th2) {
                                        if (streamWalk != null) {
                                            try {
                                                streamWalk.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Exception e7) {
                                    AbstractC0310b.f883a.mo6260n(path, "Failed to list files in directory: {}", e7);
                                }
                            } else {
                                arrayList5.add(path);
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        for (C4148b c4148b3 : this.f765h.f13669d) {
                            Iterator it3 = c4148b3.f13677l.iterator();
                            while (it3.hasNext()) {
                                try {
                                    InterfaceC2550a interfaceC2550aM3353a = ((C1216b) it3.next()).m3353a(arrayList5);
                                    if (!interfaceC2550aM3353a.isEmpty()) {
                                        arrayList4.add(interfaceC2550aM3353a);
                                    }
                                } catch (Exception e10) {
                                    interfaceC2844b4.mo6265s(c4148b3, "Failed to load code for plugin: {}", e10);
                                }
                            }
                        }
                        arrayList4.addAll(this.f771n);
                        if (interfaceC2844b4.mo6250d()) {
                            interfaceC2844b4.mo6271y(Integer.valueOf(arrayList4.size()), "Loaded using {} inputs plugin in {} ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        }
                        C4325u c4325u = new C4325u(this);
                        this.f768k = c4325u;
                        C0257g c0257g2 = c4325u.f14435a;
                        c0257g2.getClass();
                        if (!c0257g2.f718D.isEmpty()) {
                            C2387a c2387a = c0257g2.f715A;
                            c2387a.getClass();
                            c2387a.f7843e = c0257g2.f756y;
                        }
                        C4325u c4325u2 = this.f768k;
                        ArrayList arrayList6 = this.f766i;
                        c4325u2.getClass();
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            ((InterfaceC2550a) it4.next()).mo3354n(new C4324t(c4325u2, i13));
                        }
                        C4325u c4325u3 = this.f768k;
                        C0267q c0267q = this.f770m;
                        synchronized (this) {
                            if (this.f769l != null) {
                                list = this.f769l;
                            } else {
                                C4325u c4325u4 = this.f768k;
                                if (c4325u4 == null) {
                                    list = Collections.EMPTY_LIST;
                                } else {
                                    this.f769l = this.f770m.m1048b(c4325u4);
                                    list = this.f769l;
                                }
                            }
                        }
                        c4325u3.getClass();
                        Iterator it5 = list.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                c0265o = (C0265o) it5.next();
                                if (c0265o.f784b == EnumC0266p.ARSC) {
                                    break;
                                }
                            } else {
                                c0265o = null;
                                break;
                            }
                        }
                        if (c0265o == null) {
                            C4325u.f14434v.mo6258l("'resources.arsc' or 'resources.pb' file not found");
                        } else {
                            try {
                                C0779g c0779g = (C0779g) C0267q.m1047a(c0265o, new C0830a(c0267q, 10, c0265o));
                                if (c0779g != null) {
                                    c4325u3.m8713d(c0779g.f2347e);
                                    c4325u3.m8720k(c0779g, list);
                                    synchronized (c4325u3) {
                                        c0775c = c4325u3.f14455u;
                                        if (c0775c == null) {
                                            c0775c = new C0775c(c4325u3.f14435a.f725K);
                                            c4325u3.f14455u = c0775c;
                                        }
                                    }
                                    c0775c.m2001d(c0779g);
                                }
                            } catch (Exception e11) {
                                C4325u.f14434v.mo6251e("Failed to parse 'resources.pb'/'.arsc' file", e11);
                            }
                        }
                        C4325u c4325u5 = this.f768k;
                        ArrayList arrayList7 = c4325u5.f14450p;
                        int size = c4325u5.f14448n.size();
                        HashMap map2 = c4325u5.f14446l;
                        int i15 = 15;
                        if (size != map2.size()) {
                            ((Map) c4325u5.f14448n.stream().collect(Collectors.groupingBy(new C2833a(i15)))).entrySet().stream().filter(new C4306b(2)).forEach(new C4324t(c4325u5, i11));
                        }
                        ArrayList arrayList8 = new ArrayList(map2.values());
                        c4325u5.f14448n = arrayList8;
                        C4325u.f14434v.mo6272z(Integer.valueOf(c4325u5.f14448n.size()), Integer.valueOf(arrayList8.stream().mapToInt(new C0070a(14)).sum()), Integer.valueOf(c4325u5.f14448n.stream().flatMap(new C2833a(17)).mapToInt(new C0070a(i15)).sum()));
                        c4325u5.f14448n.sort(Comparator.comparing(new C2833a(18)));
                        if (c4325u5.f14435a.f753v) {
                            ArrayList<C4309e> arrayList9 = new ArrayList();
                            for (C4309e c4309e : c4325u5.f14448n) {
                                if (c4309e.f14373m.m6650o()) {
                                    arrayList9.add(c4309e);
                                }
                            }
                            ArrayList arrayList10 = new ArrayList();
                            for (C4309e c4309e2 : arrayList9) {
                                C3128a c3128a = c4309e2.f14373m;
                                C3128a c3128a2 = c3128a.f10142k;
                                C4309e c4309eM8715f = c4325u5.m8715f(c3128a2);
                                if (c4309eM8715f == null && c3128a2 != null && (iLastIndexOf = (str = c3128a2.f10141j).lastIndexOf(i10)) > 0 && iLastIndexOf != str.length() - 1) {
                                    String strSubstring2 = str.substring(iLastIndexOf + 1);
                                    C4309e c4309eM8715f2 = c4325u5.m8715f(C3128a.m6637e(c4325u5, AbstractC3506j.m7360x(str.substring(0, iLastIndexOf))));
                                    if (c4309eM8715f2 != null && c4309eM8715f2.m8669n0(strSubstring2) != null) {
                                        c3128a.m6652r(c4309eM8715f2.f14371k, c3128a.f10138g, true);
                                        c3128a.f10142k = c4309eM8715f2.f14373m;
                                        c4309eM8715f = c4309eM8715f2;
                                    }
                                }
                                if (c4309eM8715f == null) {
                                    arrayList10.add(c4309e2);
                                    C3128a c3128a3 = c4309e2.f14373m;
                                    c3128a3.m6652r(c4309e2.f14371k, c3128a3.f10138g, false);
                                    c3128a3.f10142k = null;
                                    c4309e2.f14384x = c4309e2;
                                } else {
                                    if (c4309eM8715f.f14382v.isEmpty()) {
                                        c4309eM8715f.f14382v = new ArrayList(5);
                                    }
                                    c4309eM8715f.f14382v.add(c4309e2);
                                    c4309e2.f14384x = c4309eM8715f;
                                }
                                i10 = 46;
                            }
                            Iterator it6 = arrayList10.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = ((C4309e) it6.next()).f14382v.iterator();
                                while (it7.hasNext()) {
                                    C3128a c3128a4 = ((C4309e) it7.next()).f14373m;
                                    c3128a4.m6652r(c4325u5, c3128a4.f10138g, c3128a4.m6650o());
                                }
                            }
                            Iterator it8 = arrayList7.iterator();
                            while (it8.hasNext()) {
                                ((C4323s) it8.next()).f14430o.removeIf(new C4306b(i9));
                            }
                        }
                        Collections.sort(arrayList7);
                        C4325u c4325u6 = this.f768k;
                        c4325u6.getClass();
                        try {
                            if (c4325u6.f14453s == null) {
                                C0910c c0910c = new C0910c(c4325u6);
                                if (c4325u6.f14435a.f730P) {
                                    c0910c.m2217f();
                                }
                                c0910c.m2212a(c4325u6.f14448n);
                                c0910c.m2216e();
                                c4325u6.f14453s = c0910c;
                            }
                            C4325u c4325u7 = this.f768k;
                            HashMap map3 = this.f773p;
                            C0257g c0257g3 = c4325u7.f14435a;
                            EnumC0252b enumC0252b = c0257g3.f719E;
                            if (enumC0252b != EnumC0252b.f705i && enumC0252b != EnumC0252b.f704h) {
                                new C5791l(c4325u7.f14451q).m10482b((List) map3.get(InterfaceC5773d.f23504a), new C2833a(19));
                                new C5791l(c4325u7.f14452r.f2324a).m10482b((List) map3.get(InterfaceC5771b.f23502a), new C2833a(20));
                                ArrayList arrayList11 = c0257g3.f726L;
                                if (!arrayList11.isEmpty()) {
                                    C2556d c2556d = new C2556d(new HashSet(arrayList11), i13);
                                    c4325u7.f14451q.removeIf(c2556d);
                                    c4325u7.f14452r.f2324a.removeIf(c2556d);
                                }
                            }
                            C4325u c4325u8 = this.f768k;
                            c4325u8.getClass();
                            InterfaceC2844b interfaceC2844b6 = C4325u.f14434v;
                            boolean zMo6250d = interfaceC2844b6.mo6250d();
                            for (AbstractC0269a abstractC0269a : c4325u8.f14451q) {
                                AbstractC5798s.m10507a();
                                long jCurrentTimeMillis2 = zMo6250d ? System.currentTimeMillis() : 0L;
                                try {
                                    abstractC0269a.mo1052f(c4325u8);
                                } catch (Exception e12) {
                                    interfaceC2844b6.mo6260n(abstractC0269a.getClass().getSimpleName(), "Visitor init failed: {}", e12);
                                }
                                for (C4309e c4309e3 : c4325u8.f14448n) {
                                    if (!c4309e3.m8659d0()) {
                                        AbstractC0283h.m1162h0(abstractC0269a, c4309e3);
                                    }
                                }
                                if (zMo6250d) {
                                    interfaceC2844b6.mo6271y(abstractC0269a, "Prepare pass: '{}' - {}ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                }
                            }
                            C4325u c4325u9 = this.f768k;
                            for (AbstractC0269a abstractC0269a2 : c4325u9.f14452r.f2324a) {
                                try {
                                    abstractC0269a2.mo1052f(c4325u9);
                                } catch (Exception e13) {
                                    C0771b.f2322b.mo6260n(abstractC0269a2.getClass().getSimpleName(), "Visitor init failed: {}", e13);
                                }
                            }
                            f763s.mo6258l("Load finished");
                            List list3 = (List) this.f773p.get(InterfaceC5770a.f23501a);
                            if (list3 != null) {
                                Iterator it9 = list3.iterator();
                                if (it9.hasNext()) {
                                    it9.next().getClass();
                                    C0086a.m445d();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e14) {
                            throw new C0084g("Error loading jadx class set", e14);
                        }
                    }
                    C4148b c4148b4 = (C4148b) it2.next();
                    try {
                        if (c4148b4.f13676k == null) {
                            c4148b4.f13676k = c2469w;
                        }
                        Thread threadCurrentThread = Thread.currentThread();
                        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
                        threadCurrentThread.setContextClassLoader(c4148b4.f13675j);
                        try {
                            final C1217c c1217c = c4148b4.f13673h;
                            C1211h c1211h2 = c1217c.f4081a;
                            C0261k c0261k = c4148b4.f13672g;
                            try {
                                Objects.requireNonNull(c1211h2);
                                c4148b4.f13678m = c1211h2;
                                c1211h2.m3325c(c0261k.f764g.f727M);
                                c4148b4.f13677l.add(new Object() { // from class: ff.b
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    /* JADX INFO: renamed from: a */
                                    public final InterfaceC2550a m3353a(ArrayList arrayList12) {
                                        C1215a c1215a = c1217c.f4082b;
                                        c1215a.getClass();
                                        List list4 = (List) arrayList12.stream().map(new C0640b(23)).map(new C0260j(c1215a, 10)).filter(new C0561n(7)).flatMap(new C0073d(4)).peek(new C0074e(20)).collect(Collectors.toList());
                                        return list4.isEmpty() ? C3493c.f11355g : new C1218d(list4);
                                    }
                                });
                                c1217c.f4082b.f4079b = c0261k.f767j;
                                c4148b4.f13679n = true;
                                threadCurrentThread.setContextClassLoader(contextClassLoader);
                            } catch (Exception e15) {
                                c4148b4.m8344a();
                                throw new C0084g("Failed to apply options for plugin: dex-input", e15);
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setContextClassLoader(contextClassLoader);
                            throw th4;
                        }
                    } catch (Exception e16) {
                        InterfaceC2844b interfaceC2844b7 = C4147a.f13665g;
                        c4148b4.m8344a();
                        interfaceC2844b7.mo6260n("dex-input", "Failed to init plugin: {}", e16);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1042g() {
        for (C4148b c4148b : this.f765h.f13669d) {
            try {
                if (c4148b.f13679n) {
                    Objects.requireNonNull(c4148b.f13673h);
                    Thread threadCurrentThread = Thread.currentThread();
                    ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
                    threadCurrentThread.setContextClassLoader(c4148b.f13675j);
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
            } catch (Exception e6) {
                InterfaceC2844b interfaceC2844b = C4147a.f13665g;
                c4148b.m8344a();
                interfaceC2844b.mo6265s("dex-input", "Failed to unload plugin: {}", e6);
            }
        }
        this.f768k = null;
        this.f769l = null;
        C2571a c2571a = this.f775r.f14456a;
        synchronized (c2571a) {
            ((IdentityHashMap) c2571a.f8339h).clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9263g("jadx decompiler ", AbstractC0770a.m1988b());
    }
}
