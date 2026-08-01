package p057K3;

import java.util.ArrayList;
import p000A.C0065i;
import p007B0.C0173F;
import p014C1.C0240b;
import p033F4.C0454a;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p118X3.C1714x;
import p118X3.C1715y;
import p213o2.C2786o;

/* JADX INFO: renamed from: K3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0896d {

    /* JADX INFO: renamed from: a */
    public static final C0240b f2786a;

    /* JADX INFO: renamed from: b */
    public static final C0887m f2787b;

    static {
        C0173F c0173f = new C0173F(2);
        c0173f.m248c("https://api.github.com/");
        c0173f.f612e = new C1715y(new C1714x());
        C2786o c2786o = new C2786o();
        c2786o.f8810i = false;
        ((ArrayList) c0173f.f614g).add(new C0454a(c2786o.m4976a()));
        f2786a = c0173f.m249d();
        f2787b = AbstractC0797o.m1396u(new C0065i(18));
    }
}
