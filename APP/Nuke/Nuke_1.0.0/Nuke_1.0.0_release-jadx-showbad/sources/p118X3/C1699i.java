package p118X3;

import java.util.ArrayList;
import java.util.Arrays;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1699i {

    /* JADX INFO: renamed from: a */
    public boolean f5825a = true;

    /* JADX INFO: renamed from: b */
    public String[] f5826b;

    /* JADX INFO: renamed from: c */
    public String[] f5827c;

    /* JADX INFO: renamed from: d */
    public boolean f5828d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1700j m3012a() {
        return new C1700j(this.f5825a, this.f5828d, this.f5826b, this.f5827c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3013b(C1698h... c1698hArr) {
        AbstractC1665j.m2985e(c1698hArr, "cipherSuites");
        if (!this.f5825a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c1698hArr.length);
        for (C1698h c1698h : c1698hArr) {
            arrayList.add(c1698h.f5824a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m3014c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3014c(String... strArr) {
        AbstractC1665j.m2985e(strArr, "cipherSuites");
        if (!this.f5825a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        this.f5826b = (String[]) objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3015d(EnumC1689K... enumC1689KArr) {
        if (!this.f5825a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(enumC1689KArr.length);
        for (EnumC1689K enumC1689K : enumC1689KArr) {
            arrayList.add(enumC1689K.f5773d);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m3016e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3016e(String... strArr) {
        AbstractC1665j.m2985e(strArr, "tlsVersions");
        if (!this.f5825a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        this.f5827c = (String[]) objArrCopyOf;
    }
}
