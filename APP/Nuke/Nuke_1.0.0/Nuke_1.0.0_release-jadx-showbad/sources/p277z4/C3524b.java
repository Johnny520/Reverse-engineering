package p277z4;

import p001A0.C0102b;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1976d;
import p271y4.AbstractC3501c;

/* JADX INFO: renamed from: z4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3524b {

    /* JADX INFO: renamed from: a */
    public final String f10981a;

    /* JADX INFO: renamed from: b */
    public final String f10982b;

    /* JADX INFO: renamed from: c */
    public final String f10983c;

    /* JADX INFO: renamed from: d */
    public final C0887m f10984d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3524b(String str) {
        AbstractC1665j.m2985e(str, "descriptor");
        this.f10984d = AbstractC0797o.m1396u(new C0102b(20, this));
        int iM3635c0 = AbstractC1976d.m3635c0(str, "->", 0, 6);
        int iM3635c02 = AbstractC1976d.m3635c0(str, ":", iM3635c0 + 1, 4);
        if (iM3635c0 == -1 || iM3635c02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM3635c0);
        AbstractC1665j.m2984d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f10981a = AbstractC3501c.m5755c(strSubstring);
        String strSubstring2 = str.substring(iM3635c0 + 2, iM3635c02);
        AbstractC1665j.m2984d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f10982b = strSubstring2;
        String strSubstring3 = str.substring(iM3635c02 + 1);
        AbstractC1665j.m2984d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
        this.f10983c = AbstractC3501c.m5755c(strSubstring3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3524b)) {
            return false;
        }
        C3524b c3524b = (C3524b) obj;
        return AbstractC1665j.m2981a(this.f10981a, c3524b.f10981a) && AbstractC1665j.m2981a(this.f10982b, c3524b.f10982b) && AbstractC1665j.m2981a(this.f10983c, c3524b.f10983c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10983c.hashCode() + (this.f10982b.hashCode() * 31) + (this.f10981a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = AbstractC3501c.m5757e(this.f10981a) + "->" + this.f10982b + ":" + ((String) this.f10984d.getValue());
        AbstractC1665j.m2984d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
