package p036c9;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: c9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0414a {

    /* JADX INFO: renamed from: a */
    public final String f1179a;

    /* JADX INFO: renamed from: b */
    public final String f1180b;

    /* JADX INFO: renamed from: c */
    public final String f1181c;

    /* JADX INFO: renamed from: d */
    public final int f1182d;

    /* JADX INFO: renamed from: e */
    public final List f1183e;

    /* JADX INFO: renamed from: f */
    public final List f1184f;

    /* JADX INFO: renamed from: g */
    public final boolean f1185g;

    /* JADX INFO: renamed from: h */
    public final String f1186h;

    /* JADX INFO: renamed from: i */
    public final boolean f1187i;

    /* JADX INFO: renamed from: j */
    public final boolean f1188j;

    /* JADX INFO: renamed from: k */
    public final boolean f1189k;

    /* JADX INFO: renamed from: l */
    public final boolean f1190l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0414a(String str, String str2, String str3, int i9, List list, List list2, boolean z9, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str4.getClass();
        this.f1179a = str;
        this.f1180b = str2;
        this.f1181c = str3;
        this.f1182d = i9;
        this.f1183e = list;
        this.f1184f = list2;
        this.f1185g = z9;
        this.f1186h = str4;
        this.f1187i = z10;
        this.f1188j = z11;
        this.f1189k = z12;
        this.f1190l = z13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0414a m1401a(C0414a c0414a, String str, String str2, String str3, int i9, List list, List list2, boolean z9, String str4, boolean z10, boolean z11, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            str = c0414a.f1179a;
        }
        String str5 = str;
        if ((i10 & 2) != 0) {
            str2 = c0414a.f1180b;
        }
        String str6 = str2;
        String str7 = (i10 & 4) != 0 ? c0414a.f1181c : str3;
        int i11 = (i10 & 8) != 0 ? c0414a.f1182d : i9;
        List list3 = (i10 & 16) != 0 ? c0414a.f1183e : list;
        List list4 = (i10 & 32) != 0 ? c0414a.f1184f : list2;
        boolean z13 = (i10 & 64) != 0 ? c0414a.f1185g : z9;
        String str8 = (i10 & 128) != 0 ? c0414a.f1186h : str4;
        boolean z14 = (i10 & Opcodes.ACC_NATIVE) != 0 ? c0414a.f1187i : z10;
        boolean z15 = (i10 & Opcodes.ACC_INTERFACE) != 0 ? c0414a.f1188j : z11;
        boolean z16 = c0414a.f1189k;
        boolean z17 = (i10 & Opcodes.ACC_STRICT) != 0 ? c0414a.f1190l : z12;
        c0414a.getClass();
        str5.getClass();
        str6.getClass();
        list3.getClass();
        list4.getClass();
        str8.getClass();
        return new C0414a(str5, str6, str7, i11, list3, list4, z13, str8, z14, z15, z16, z17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0414a)) {
            return false;
        }
        C0414a c0414a = (C0414a) obj;
        return AbstractC1416l.m3825a(this.f1179a, c0414a.f1179a) && AbstractC1416l.m3825a(this.f1180b, c0414a.f1180b) && AbstractC1416l.m3825a(this.f1181c, c0414a.f1181c) && this.f1182d == c0414a.f1182d && AbstractC1416l.m3825a(this.f1183e, c0414a.f1183e) && AbstractC1416l.m3825a(this.f1184f, c0414a.f1184f) && this.f1185g == c0414a.f1185g && AbstractC1416l.m3825a(this.f1186h, c0414a.f1186h) && this.f1187i == c0414a.f1187i && this.f1188j == c0414a.f1188j && this.f1189k == c0414a.f1189k && this.f1190l == c0414a.f1190l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(this.f1179a.hashCode() * 31, 31, this.f1180b);
        String str = this.f1181c;
        return Boolean.hashCode(this.f1190l) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f1184f, AbstractC2091b.m5158e(this.f1183e, AbstractC0921a.m2242e(this.f1182d, (iM2244g + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.f1185g), 31, this.f1186h), 31, this.f1187i), 31, this.f1188j), 31, this.f1189k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ConversationGroup(id=", this.f1179a, ", name=", this.f1180b, ", parentId=");
        sbM1027p.append(this.f1181c);
        sbM1027p.append(", order=");
        sbM1027p.append(this.f1182d);
        sbM1027p.append(", conversationIds=");
        sbM1027p.append(this.f1183e);
        sbM1027p.append(", pinnedConversationIds=");
        sbM1027p.append(this.f1184f);
        sbM1027p.append(", pinned=");
        sbM1027p.append(this.f1185g);
        sbM1027p.append(", avatarPath=");
        sbM1027p.append(this.f1186h);
        sbM1027p.append(", showUnreadCount=");
        AbstractC3199a.m6851x(sbM1027p, this.f1187i, ", previewLatestMessage=", this.f1188j, ", roundAvatar=");
        sbM1027p.append(this.f1189k);
        sbM1027p.append(", showEmpty=");
        sbM1027p.append(this.f1190l);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
