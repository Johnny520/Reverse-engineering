package p180m3;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: m3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4952m {

    /* JADX INFO: renamed from: a */
    public final boolean f15040a;

    /* JADX INFO: renamed from: b */
    public final boolean f15041b;

    /* JADX INFO: renamed from: c */
    public final EnumC4962w f15042c;

    /* JADX INFO: renamed from: d */
    public final boolean f15043d;

    /* JADX INFO: renamed from: e */
    public final boolean f15044e;

    /* JADX INFO: renamed from: f */
    public final String f15045f;

    public /* synthetic */ C4952m(boolean z10, boolean z11, EnumC4962w enumC4962w, boolean z12, boolean z13, String str, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? EnumC4962w.f15096q : enumC4962w, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13, (i10 & 32) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20008a() {
        return this.f15044e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20009b() {
        return this.f15040a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20010c() {
        return this.f15041b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC4962w m20011d() {
        return this.f15042c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20012e() {
        return this.f15043d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4952m)) {
            return false;
        }
        C4952m c4952m = (C4952m) obj;
        return this.f15040a == c4952m.f15040a && this.f15041b == c4952m.f15041b && this.f15042c == c4952m.f15042c && this.f15043d == c4952m.f15043d && this.f15044e == c4952m.f15044e;
    }

    /* JADX INFO: renamed from: f */
    public final String m20013f() {
        return this.f15045f;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f15040a) * 31) + Boolean.hashCode(this.f15041b)) * 31) + this.f15042c.hashCode()) * 31) + Boolean.hashCode(this.f15043d)) * 31) + Boolean.hashCode(this.f15044e);
    }

    public C4952m(boolean z10, boolean z11, EnumC4962w enumC4962w, boolean z12, boolean z13, String str) {
        this.f15040a = z10;
        this.f15041b = z11;
        this.f15042c = enumC4962w;
        this.f15043d = z12;
        this.f15044e = z13;
        this.f15045f = str;
    }

    public /* synthetic */ C4952m(boolean z10, boolean z11, boolean z12, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public C4952m(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, EnumC4962w.f15096q, z12, true, null, 32, null);
    }
}
