package p057K3;

import java.util.ArrayList;
import p000A.C0065i;
import p007B0.C0173F;
import p014C1.C0240b;
import p029F0.C0363A;
import p033F4.C0454a;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p118X3.C1714x;
import p118X3.C1715y;
import p149d3.AbstractC1976d;
import p213o2.C2785n;
import p213o2.C2786o;

/* JADX INFO: renamed from: K3.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0898f {

    /* JADX INFO: renamed from: a */
    public static volatile C0894b f2788a;

    /* JADX INFO: renamed from: b */
    public static final C0240b f2789b;

    /* JADX INFO: renamed from: c */
    public static final C0887m f2790c;

    static {
        String strConcat = AbstractC1976d.m3637e0("https://www.guang233.com/") ? "https://guang233.com/" : "https://www.guang233.com/";
        if (!strConcat.endsWith("/")) {
            strConcat = strConcat.concat("/");
        }
        C2786o c2786o = new C2786o();
        c2786o.f8810i = false;
        C2785n c2785nM4976a = c2786o.m4976a();
        C1714x c1714x = new C1714x();
        c1714x.f5895c.add(new C0893a(new C0363A(2)));
        C1715y c1715y = new C1715y(c1714x);
        C0173F c0173f = new C0173F(2);
        c0173f.m248c(strConcat);
        c0173f.f612e = c1715y;
        ((ArrayList) c0173f.f614g).add(new C0454a(c2785nM4976a));
        f2789b = c0173f.m249d();
        f2790c = AbstractC0797o.m1396u(new C0065i(19));
    }
}
