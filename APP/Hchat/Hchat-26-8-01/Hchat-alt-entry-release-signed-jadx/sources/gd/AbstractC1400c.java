package gd;

import ac.AbstractC0063p;
import ac.C0058k;
import af.C0081d;
import af.C0084g;
import bf.AbstractC0310b;
import id.C2041a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p003a2.C0014a;
import p014b.C0126e;
import p105h6.C1614f;
import p105h6.C1615g;
import p215od.C3128a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;

/* JADX INFO: renamed from: gd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1400c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f4655a = AbstractC2846d.m6274b(AbstractC1400c.class);

    /* JADX INFO: renamed from: b */
    public static final C1614f f4656b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1615g c1615gM423p = AbstractC0063p.m423p();
        c1615gM423p.f5303c = 6;
        c1615gM423p.f5309i = false;
        f4656b = c1615gM423p.m4133a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m3804a(C4325u c4325u) {
        C2041a c2041a = new C2041a();
        ArrayList<C4309e> arrayList = c4325u.f14448n;
        c2041a.f6881a = new ArrayList(arrayList.size());
        for (C4309e c4309e : arrayList) {
            C3128a c3128a = c4309e.f14373m;
            C0126e c0126e = new C0126e(14, false);
            c3128a.f10138g.mo7350l();
            c3128a.m6642f();
            c4309e.m8656a0().f14373m.m6643g();
            if (c3128a.m6650o()) {
                String str = c4309e.m8656a0().f14373m.f10141j;
            }
            List<C4311g> list = c4309e.f14381u;
            if (!list.isEmpty()) {
                c0126e.f332h = new ArrayList(list.size());
                for (C4311g c4311g : list) {
                    C0014a c0014a = new C0014a(20);
                    String str2 = c4311g.f14390l.f10147h;
                    ((ArrayList) c0126e.f332h).add(c0014a);
                }
            }
            List<C4322r> list2 = c4309e.f14380t;
            if (!list2.isEmpty()) {
                c0126e.f333i = new ArrayList(list2.size());
                for (C4322r c4322r : list2) {
                    C0014a c0014a2 = new C0014a(21);
                    String str3 = c4322r.f14410k.f10154k;
                    Long.toHexString(c4322r.f14415p ? 0L : ((C0058k) c4322r.f14413n.f56i).f176h);
                    ((ArrayList) c0126e.f333i).add(c0014a2);
                }
            }
            c2041a.f6881a.add(c0126e);
        }
        File file = new File(c4325u.f14435a.f740i.getAbsoluteFile(), "mapping.json");
        InterfaceC2844b interfaceC2844b = AbstractC0310b.f883a;
        AbstractC0310b.m1229c(file.getParentFile());
        try {
            FileWriter fileWriter = new FileWriter(file);
            try {
                C1614f c1614f = f4656b;
                c1614f.getClass();
                try {
                    c1614f.m4132d(c2041a, C2041a.class, c1614f.m4131c(fileWriter));
                    f4655a.mo6247a(file.getAbsolutePath(), "Save mappings to {}");
                    fileWriter.close();
                } catch (IOException e6) {
                    throw new C0081d(e6);
                }
            } finally {
            }
        } catch (Exception e7) {
            throw new C0084g("Failed to save mapping json", e7);
        }
    }
}
