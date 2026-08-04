package yyds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: yyds.ᲈᛴᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2640 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C2640 f13018;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2640 f13019;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean f13020;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f13021;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String[] f13022;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String[] f13023;

    static {
        C1248 c1248 = C1248.f5720;
        C1248 c12482 = C1248.f5727;
        C1248 c12483 = C1248.f5718;
        C1248 c12484 = C1248.f5725;
        C1248 c12485 = C1248.f5713;
        C1248 c12486 = C1248.f5715;
        C1248 c12487 = C1248.f5719;
        C1248 c12488 = C1248.f5722;
        C1248 c12489 = C1248.f5729;
        List listM4854 = AbstractC2725.m4854(c1248, c12482, c12483, c12484, c12485, c12486, c12487, c12488, c12489);
        List listM48542 = AbstractC2725.m4854(c1248, c12482, c12483, c12484, c12485, c12486, c12487, c12488, c12489, C1248.f5726, C1248.f5724, C1248.f5714, C1248.f5716, C1248.f5730, C1248.f5723, C1248.f5717);
        C2731 c2731 = new C2731();
        C1248[] c1248Arr = (C1248[]) listM4854.toArray(new C1248[0]);
        c2731.m4865((C1248[]) Arrays.copyOf(c1248Arr, c1248Arr.length));
        EnumC2365 enumC2365 = EnumC2365.TLS_1_3;
        EnumC2365 enumC23652 = EnumC2365.TLS_1_2;
        c2731.m4866(enumC2365, enumC23652);
        c2731.f13429 = true;
        c2731.m4864();
        C2731 c27312 = new C2731();
        C1248[] c1248Arr2 = (C1248[]) listM48542.toArray(new C1248[0]);
        c27312.m4865((C1248[]) Arrays.copyOf(c1248Arr2, c1248Arr2.length));
        c27312.m4866(enumC2365, enumC23652);
        c27312.f13429 = true;
        f13018 = c27312.m4864();
        C2731 c27313 = new C2731();
        C1248[] c1248Arr3 = (C1248[]) listM48542.toArray(new C1248[0]);
        c27313.m4865((C1248[]) Arrays.copyOf(c1248Arr3, c1248Arr3.length));
        c27313.m4866(enumC2365, enumC23652, EnumC2365.TLS_1_1, EnumC2365.TLS_1_0);
        c27313.f13429 = true;
        c27313.m4864();
        f13019 = new C2640(false, false, null, null);
    }

    public C2640(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f13020 = z;
        this.f13021 = z2;
        this.f13022 = strArr;
        this.f13023 = strArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2640)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2640 c2640 = (C2640) obj;
        boolean z = c2640.f13020;
        boolean z2 = this.f13020;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f13022, c2640.f13022) && Arrays.equals(this.f13023, c2640.f13023) && this.f13021 == c2640.f13021;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f13020) {
            return 17;
        }
        String[] strArr = this.f13022;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f13023;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f13021 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f13020) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m4746(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m4747(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0897.m1986(sb, this.f13021, ')');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4745(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        String[] strArr = this.f13022;
        if (strArr != null) {
            enabledCipherSuites = AbstractC1429.m2915(strArr, enabledCipherSuites, C1248.f5728);
        }
        String[] strArr2 = this.f13023;
        String[] strArrM2915 = strArr2 != null ? AbstractC1429.m2915(sSLSocket.getEnabledProtocols(), strArr2, C2055.f10194) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C1300 c1300 = C1248.f5728;
        byte[] bArr = AbstractC1429.f6782;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c1300.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.f13020;
        if (!z2) {
            C0188.m798("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C0188.m798("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(strArrM2915, strArrM2915.length);
        if (!z2) {
            C0188.m798("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C0188.m798("At least one TLS version is required");
            return;
        }
        C2640 c2640 = new C2640(z2, this.f13021, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c2640.m4747() != null) {
            sSLSocket.setEnabledProtocols(c2640.f13023);
        }
        if (c2640.m4746() != null) {
            sSLSocket.setEnabledCipherSuites(c2640.f13022);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList m4746() {
        String[] strArr = this.f13022;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C1248.f5721.m1860(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList m4747() {
        String[] strArr = this.f13023;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0797.m1813(str));
        }
        return arrayList;
    }
}
