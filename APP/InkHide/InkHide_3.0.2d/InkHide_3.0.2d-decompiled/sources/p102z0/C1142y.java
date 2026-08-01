package p102z0;

import java.util.ArrayList;
import java.util.List;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;

/* JADX INFO: renamed from: z0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1142y {

    /* JADX INFO: renamed from: a */
    public final String f3868a;

    /* JADX INFO: renamed from: b */
    public final String f3869b;

    /* JADX INFO: renamed from: c */
    public final String f3870c;

    /* JADX INFO: renamed from: d */
    public final String f3871d;

    /* JADX INFO: renamed from: e */
    public final String f3872e;

    /* JADX INFO: renamed from: f */
    public final String f3873f;

    /* JADX INFO: renamed from: g */
    public final String f3874g;

    /* JADX INFO: renamed from: h */
    public final String f3875h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1142y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f3868a = str;
        this.f3869b = str2;
        this.f3870c = str3;
        this.f3871d = str4;
        this.f3872e = str5;
        this.f3873f = str6;
        this.f3874g = str7;
        this.f3875h = str8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m2526a(InterfaceC0204l interfaceC0204l) {
        String string;
        List<String> listM252Z = AbstractC0120h.m252Z(new String[]{this.f3871d, this.f3872e, this.f3869b, this.f3868a});
        ArrayList arrayList = new ArrayList();
        for (String str : listM252Z) {
            String str2 = null;
            if (str != null && (string = AbstractC0299i.m507C0(str).toString()) != null && ((Boolean) interfaceC0204l.mo8c(string)).booleanValue()) {
                str2 = string;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return (String) AbstractC0123k.m268j0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142y)) {
            return false;
        }
        C1142y c1142y = (C1142y) obj;
        return AbstractC0223g.m414a(this.f3868a, c1142y.f3868a) && AbstractC0223g.m414a(this.f3869b, c1142y.f3869b) && AbstractC0223g.m414a(this.f3870c, c1142y.f3870c) && AbstractC0223g.m414a(this.f3871d, c1142y.f3871d) && AbstractC0223g.m414a(this.f3872e, c1142y.f3872e) && AbstractC0223g.m414a(this.f3873f, c1142y.f3873f) && AbstractC0223g.m414a(this.f3874g, c1142y.f3874g) && AbstractC0223g.m414a(this.f3875h, c1142y.f3875h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f3868a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3869b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3870c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3871d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3872e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3873f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f3874g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f3875h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(username=");
        sb.append(this.f3868a);
        sb.append(", alias=");
        sb.append(this.f3869b);
        sb.append(", encryptUsername=");
        sb.append(this.f3870c);
        sb.append(", conRemark=");
        sb.append(this.f3871d);
        sb.append(", nickname=");
        sb.append(this.f3872e);
        sb.append(", pyInitial=");
        sb.append(this.f3873f);
        sb.append(", quanPin=");
        sb.append(this.f3874g);
        sb.append(", avatarUrl=");
        return AbstractC0174d.m356l(sb, this.f3875h, ")");
    }
}
