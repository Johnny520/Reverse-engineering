package p118X3;

import p117X2.AbstractC1665j;
import p117X2.C1675t;

/* JADX INFO: renamed from: X3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1711u {

    /* JADX INFO: renamed from: d */
    public static final C1675t f5877d = new C1675t("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e */
    public static final C1675t f5878e = new C1675t(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f5879a;

    /* JADX INFO: renamed from: b */
    public final String f5880b;

    /* JADX INFO: renamed from: c */
    public final String[] f5881c;

    public C1711u(String str, String str2, String str3, String[] strArr) {
        AbstractC1665j.m2985e(str, "mediaType");
        AbstractC1665j.m2985e(strArr, "parameterNamesAndValues");
        this.f5879a = str;
        this.f5880b = str2;
        this.f5881c = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1711u) && AbstractC1665j.m2981a(((C1711u) obj).f5879a, this.f5879a);
    }

    public final int hashCode() {
        return this.f5879a.hashCode();
    }

    public final String toString() {
        return this.f5879a;
    }
}
