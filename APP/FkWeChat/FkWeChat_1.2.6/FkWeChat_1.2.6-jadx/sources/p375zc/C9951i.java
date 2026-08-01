package p375zc;

import okhttp3.internal.http2.Http2;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: zc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9951i {

    /* JADX INFO: renamed from: a */
    public final boolean f33519a;

    /* JADX INFO: renamed from: b */
    public final boolean f33520b;

    /* JADX INFO: renamed from: c */
    public final boolean f33521c;

    /* JADX INFO: renamed from: d */
    public final boolean f33522d;

    /* JADX INFO: renamed from: e */
    public final boolean f33523e;

    /* JADX INFO: renamed from: f */
    public final boolean f33524f;

    /* JADX INFO: renamed from: g */
    public final String f33525g;

    /* JADX INFO: renamed from: h */
    public final boolean f33526h;

    /* JADX INFO: renamed from: i */
    public final boolean f33527i;

    /* JADX INFO: renamed from: j */
    public final String f33528j;

    /* JADX INFO: renamed from: k */
    public final boolean f33529k;

    /* JADX INFO: renamed from: l */
    public final boolean f33530l;

    /* JADX INFO: renamed from: m */
    public final boolean f33531m;

    /* JADX INFO: renamed from: n */
    public final boolean f33532n;

    /* JADX INFO: renamed from: o */
    public final boolean f33533o;

    /* JADX INFO: renamed from: p */
    public EnumC9935a f33534p;

    public /* synthetic */ C9951i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, InterfaceC9942d0 interfaceC9942d0, boolean z20, boolean z21, boolean z22, EnumC9935a enumC9935a, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : interfaceC9942d0, (i10 & 8192) != 0 ? false : z20, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & 65536) != 0 ? EnumC9935a.f33474s : enumC9935a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38548a() {
        return this.f33533o;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38549b() {
        return this.f33529k;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38550c() {
        return this.f33522d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m38551d() {
        return this.f33532n;
    }

    /* JADX INFO: renamed from: e */
    public final String m38552e() {
        return this.f33528j;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC9935a m38553f() {
        return this.f33534p;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m38554g() {
        return this.f33526h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m38555h() {
        return this.f33531m;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m38556i() {
        return this.f33519a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m38557j() {
        return this.f33524f;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m38558k() {
        return this.f33520b;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC9942d0 m38559l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m38560m() {
        return this.f33523e;
    }

    /* JADX INFO: renamed from: n */
    public final String m38561n() {
        return this.f33525g;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m38562o() {
        return this.f33530l;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m38563p() {
        return this.f33527i;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m38564q() {
        return this.f33521c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f33519a + ", ignoreUnknownKeys=" + this.f33520b + ", isLenient=" + this.f33521c + ", allowStructuredMapKeys=" + this.f33522d + ", prettyPrint=" + this.f33523e + ", explicitNulls=" + this.f33524f + ", prettyPrintIndent='" + this.f33525g + "', coerceInputValues=" + this.f33526h + ", useArrayPolymorphism=" + this.f33527i + ", classDiscriminator='" + this.f33528j + "', allowSpecialFloatingPointValues=" + this.f33529k + ", useAlternativeNames=" + this.f33530l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f33531m + ", allowTrailingComma=" + this.f33532n + ", allowComments=" + this.f33533o + ", classDiscriminatorMode=" + this.f33534p + ')';
    }

    public C9951i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, InterfaceC9942d0 interfaceC9942d0, boolean z20, boolean z21, boolean z22, EnumC9935a enumC9935a) {
        str.getClass();
        str2.getClass();
        enumC9935a.getClass();
        this.f33519a = z10;
        this.f33520b = z11;
        this.f33521c = z12;
        this.f33522d = z13;
        this.f33523e = z14;
        this.f33524f = z15;
        this.f33525g = str;
        this.f33526h = z16;
        this.f33527i = z17;
        this.f33528j = str2;
        this.f33529k = z18;
        this.f33530l = z19;
        this.f33531m = z20;
        this.f33532n = z21;
        this.f33533o = z22;
        this.f33534p = enumC9935a;
    }
}
