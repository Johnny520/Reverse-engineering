package p001A0;

import java.util.List;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: A0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0005E {

    /* JADX INFO: renamed from: a */
    public final Object f36a;

    /* JADX INFO: renamed from: b */
    public final Object f37b;

    /* JADX INFO: renamed from: c */
    public final Object f38c;

    /* JADX INFO: renamed from: d */
    public final Object f39d;

    /* JADX INFO: renamed from: e */
    public final Object f40e;

    /* JADX INFO: renamed from: f */
    public final Object f41f;

    /* JADX INFO: renamed from: g */
    public final Object f42g;

    /* JADX INFO: renamed from: h */
    public final Object f43h;

    /* JADX INFO: renamed from: i */
    public final Object f44i;

    /* JADX INFO: renamed from: j */
    public final Object f45j;

    /* JADX INFO: renamed from: k */
    public final int f46k;

    /* JADX INFO: renamed from: l */
    public final String f47l;

    /* JADX INFO: renamed from: m */
    public final long f48m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0005E(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i2, String str, long j2) {
        this.f36a = list;
        this.f37b = list2;
        this.f38c = list3;
        this.f39d = list4;
        this.f40e = list5;
        this.f41f = list6;
        this.f42g = list7;
        this.f43h = list8;
        this.f44i = list9;
        this.f45j = list10;
        this.f46k = i2;
        this.f47l = str;
        this.f48m = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005E)) {
            return false;
        }
        C0005E c0005e = (C0005E) obj;
        return this.f36a.equals(c0005e.f36a) && this.f37b.equals(c0005e.f37b) && this.f38c.equals(c0005e.f38c) && this.f39d.equals(c0005e.f39d) && this.f40e.equals(c0005e.f40e) && this.f41f.equals(c0005e.f41f) && this.f42g.equals(c0005e.f42g) && this.f43h.equals(c0005e.f43h) && this.f44i.equals(c0005e.f44i) && this.f45j.equals(c0005e.f45j) && this.f46k == c0005e.f46k && this.f47l.equals(c0005e.f47l) && this.f48m == c0005e.f48m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f48m) + AbstractC0174d.m347c(this.f47l, AbstractC0174d.m345a(this.f46k, AbstractC0174d.m346b(this.f45j, AbstractC0174d.m346b(this.f44i, AbstractC0174d.m346b(this.f43h, AbstractC0174d.m346b(this.f42g, AbstractC0174d.m346b(this.f41f, AbstractC0174d.m346b(this.f40e, AbstractC0174d.m346b(this.f39d, AbstractC0174d.m346b(this.f38c, AbstractC0174d.m346b(this.f37b, this.f36a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedQuickAddHookPoint(conversationLongClickClassNames=" + this.f36a + ", conversationMenuCallbackClassNames=" + this.f37b + ", popupClassNames=" + this.f38c + ", popupCreateSpecs=" + this.f39d + ", popupBuildSpecs=" + this.f40e + ", popupClickHandlerClassNames=" + this.f41f + ", popupAdapterClassNames=" + this.f42g + ", contactMenuCallbackClassNames=" + this.f43h + ", addressMenuCreateClassNames=" + this.f44i + ", addressMenuClickClassNames=" + this.f45j + ", versionCode=" + this.f46k + ", versionName=" + this.f47l + ", updatedAt=" + this.f48m + ")";
    }
}
