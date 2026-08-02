package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: ct */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105ct {

    /* JADX INFO: renamed from: a */
    public final String f1714a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1715b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final HashSet f1716c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final ArrayList f1717d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f1718e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f1719f = new ArrayList();

    public C0105ct(String str) {
        this.f1714a = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m885a(C0105ct c0105ct, String str, p31 p31Var) {
        c0105ct.getClass();
        if (c0105ct.f1716c.add(str)) {
            c0105ct.f1715b.add(str);
            c0105ct.f1717d.add(p31Var);
            c0105ct.f1718e.add(be0.f819h);
            c0105ct.f1719f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + c0105ct.f1714a).toString());
    }
}
