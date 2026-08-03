package p157kd;

import bf.AbstractC0310b;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p082fd.AbstractC1213j;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p215od.C3132e;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4323s;
import p302ud.C4325u;

/* JADX INFO: renamed from: kd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2388b {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2844b f7844f = AbstractC2846d.m6274b(C2388b.class);

    /* JADX INFO: renamed from: g */
    public static final Charset f7845g = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a */
    public final Path f7846a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7847b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f7848c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f7849d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f7850e = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2388b(Path path) {
        this.f7846a = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2388b m5709a(C4325u c4325u) {
        C0257g c0257g = c4325u.f14435a;
        c0257g.getClass();
        Path absolutePath = ((File) c0257g.f738g.get(0)).toPath().toAbsolutePath();
        InterfaceC2844b interfaceC2844b = AbstractC0310b.f883a;
        String string = absolutePath.getFileName().toString();
        int iLastIndexOf = string.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            string = string.substring(0, iLastIndexOf);
        }
        Path pathResolve = absolutePath.getParent().resolve(string.concat(".jobf"));
        if (c4325u.f14435a.f733S != 4) {
            f7844f.mo6270x(pathResolve, "Deobfuscation map file set to: {}");
        }
        return new C2388b(pathResolve);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5710b(C4325u c4325u) {
        for (C4323s c4323s : c4325u.f14450p) {
            ArrayList arrayList = c4323s.f14429n;
            C3132e c3132e = c4323s.f14427l;
            if (arrayList.isEmpty()) {
                boolean z9 = c3132e == c4323s.f14431p ? false : !Objects.equals(c3132e.f10158a, r2.f10158a);
                HashMap map = this.f7847b;
                if (z9) {
                    map.put(c3132e.f10159b, c4323s.f14431p.f10159b);
                } else {
                    if (c3132e != c4323s.f14431p ? !c3132e.f10160c.equals(r2.f10160c) : false) {
                        map.put(c3132e.f10159b, c4323s.f14431p.f10160c);
                    }
                }
            }
        }
        for (C4309e c4309e : c4325u.f14448n) {
            C3128a c3128a = c4309e.f14373m;
            if (c3128a.m6649n()) {
                this.f7848c.put(c3128a.m6651q(), c3128a.m6646k());
            }
            for (C4311g c4311g : c4309e.f14381u) {
                C3130c c3130c = c4311g.f14390l;
                if (c3130c.m6655b()) {
                    this.f7849d.put(AbstractC0255e.m1033v(c3130c.f10146g.m6651q(), ".", c3130c.f10147h, ":", AbstractC1213j.m3333b(c3130c.f10148i)), c4311g.f14390l.f10149j);
                }
            }
            Iterator it = c4309e.f14380t.iterator();
            while (it.hasNext()) {
                C3131d c3131d = ((C4322r) it.next()).f14410k;
                if (!c3131d.f10150g.equals(c3131d.f10157n)) {
                    this.f7850e.put(c3131d.f10155l, c3131d.f10157n);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5711c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f7847b.entrySet()) {
            arrayList.add(String.format("p %s = %s", entry.getKey(), entry.getValue()));
        }
        for (Map.Entry entry2 : this.f7848c.entrySet()) {
            arrayList.add(String.format("c %s = %s", entry2.getKey(), entry2.getValue()));
        }
        for (Map.Entry entry3 : this.f7849d.entrySet()) {
            arrayList.add(String.format("f %s = %s", entry3.getKey(), entry3.getValue()));
        }
        for (Map.Entry entry4 : this.f7850e.entrySet()) {
            arrayList.add(String.format("m %s = %s", entry4.getKey(), entry4.getValue()));
        }
        Collections.sort(arrayList);
        boolean zIsEmpty = arrayList.isEmpty();
        InterfaceC2844b interfaceC2844b = f7844f;
        if (zIsEmpty) {
            if (interfaceC2844b.mo6250d()) {
                interfaceC2844b.mo6258l("Deobfuscation map is empty, not saving it");
            }
        } else {
            OpenOption[] openOptionArr = {StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
            Path path = this.f7846a;
            Files.write(path, arrayList, f7845g, openOptionArr);
            interfaceC2844b.mo6247a(path, "Deobfuscation map file saved as: {}");
        }
    }
}
