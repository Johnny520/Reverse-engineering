package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0036i {

    /* JADX INFO: renamed from: a */
    public final String f233a;

    /* JADX INFO: renamed from: b */
    public final String f234b;

    /* JADX INFO: renamed from: c */
    public final String f235c;

    /* JADX INFO: renamed from: d */
    public final String f236d;

    /* JADX INFO: renamed from: e */
    public final String f237e;

    /* JADX INFO: renamed from: f */
    public final List f238f;

    /* JADX INFO: renamed from: g */
    public final List f239g;

    /* JADX INFO: renamed from: h */
    public final String f240h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0036i(String str, String str2, String str3, String str4, String str5, List list, List list2, String str6) {
        this.f233a = str;
        this.f234b = str2;
        this.f235c = str3;
        this.f236d = str4;
        this.f237e = str5;
        this.f238f = list;
        this.f239g = list2;
        this.f240h = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0036i)) {
            return false;
        }
        C0036i c0036i = (C0036i) obj;
        return AbstractC0223g.m414a(this.f233a, c0036i.f233a) && AbstractC0223g.m414a(this.f234b, c0036i.f234b) && AbstractC0223g.m414a(this.f235c, c0036i.f235c) && AbstractC0223g.m414a(this.f236d, c0036i.f236d) && AbstractC0223g.m414a(this.f237e, c0036i.f237e) && AbstractC0223g.m414a(this.f238f, c0036i.f238f) && AbstractC0223g.m414a(this.f239g, c0036i.f239g) && AbstractC0223g.m414a(this.f240h, c0036i.f240h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f240h.hashCode() + AbstractC0174d.m349e(this.f239g, AbstractC0174d.m349e(this.f238f, AbstractC0174d.m347c(this.f237e, AbstractC0174d.m347c(this.f236d, AbstractC0174d.m347c(this.f235c, AbstractC0174d.m347c(this.f234b, this.f233a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("HookPoint(mvvmFragmentClassName=");
        sb.append(this.f233a);
        sb.append(", addressLiveListClassName=");
        sb.append(this.f234b);
        sb.append(", liveListSubmitMethodName=");
        sb.append(this.f235c);
        sb.append(", liveListGetterName=");
        sb.append(this.f236d);
        sb.append(", adapterGetterName=");
        sb.append(this.f237e);
        sb.append(", mvvmAdapterClassNames=");
        sb.append(this.f238f);
        sb.append(", mvvmItemClassNames=");
        sb.append(this.f239g);
        sb.append(", refreshSubmitMethodName=");
        return AbstractC0174d.m356l(sb, this.f240h, ")");
    }
}
