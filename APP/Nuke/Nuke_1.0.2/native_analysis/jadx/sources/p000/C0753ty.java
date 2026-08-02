package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ty */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753ty {

    /* JADX INFO: renamed from: a */
    public final boolean f10996a = true;

    /* JADX INFO: renamed from: b */
    public String[] f10997b;

    /* JADX INFO: renamed from: c */
    public String[] f10998c;

    /* JADX INFO: renamed from: d */
    public boolean f10999d;

    /* JADX INFO: renamed from: a */
    public final C0790uy m5446a() {
        return new C0790uy(this.f10996a, this.f10999d, this.f10997b, this.f10998c);
    }

    /* JADX INFO: renamed from: b */
    public final void m5447b(C0591ps... c0591psArr) {
        boolean z = this.f10996a;
        if (!z) {
            C0676s.m4651j("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c0591psArr.length);
        for (C0591ps c0591ps : c0591psArr) {
            arrayList.add(c0591ps.f8548a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            C0676s.m4651j("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f10997b = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C0676s.m4651j("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5448c(s23... s23VarArr) {
        boolean z = this.f10996a;
        if (!z) {
            C0676s.m4651j("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(s23VarArr.length);
        for (s23 s23Var : s23VarArr) {
            arrayList.add(s23Var.f9888h);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            C0676s.m4651j("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f10998c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C0676s.m4651j("At least one TLS version is required");
        }
    }
}
