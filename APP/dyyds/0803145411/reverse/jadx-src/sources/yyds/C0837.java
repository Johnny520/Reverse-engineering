package yyds;

import java.io.Closeable;

/* JADX INFO: renamed from: yyds.ᛴᛴᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0837 implements Closeable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final long f3846;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1605 f3847;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final C0837 f3848;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AbstractC0379 f3849;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f3850;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final long f3851;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final boolean f3852;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final InterfaceC1414 f3853;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2126 f3854;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final C0837 f3855;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final C0837 f3856;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2295 f3857;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2098 f3858;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final C2115 f3859;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f3860;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final EnumC0940 f3861;

    public C0837(C2098 c2098, EnumC0940 enumC0940, String str, int i, C2126 c2126, C1605 c1605, AbstractC0379 abstractC0379, InterfaceC2295 interfaceC2295, C0837 c0837, C0837 c08372, C0837 c08373, long j, long j2, C2115 c2115, InterfaceC1414 interfaceC1414) {
        this.f3858 = c2098;
        this.f3861 = enumC0940;
        this.f3850 = str;
        this.f3860 = i;
        this.f3854 = c2126;
        this.f3847 = c1605;
        this.f3849 = abstractC0379;
        this.f3857 = interfaceC2295;
        this.f3855 = c0837;
        this.f3856 = c08372;
        this.f3848 = c08373;
        this.f3846 = j;
        this.f3851 = j2;
        this.f3859 = c2115;
        this.f3853 = interfaceC1414;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f3852 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3849.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f3861 + ", code=" + this.f3860 + ", message=" + this.f3850 + ", url=" + this.f3858.f10389 + '}';
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2294 m1918() {
        C2294 c2294 = new C2294();
        c2294.f11271 = -1;
        c2294.f11267 = AbstractC0379.f1953;
        c2294.f11265 = InterfaceC1414.f6696;
        c2294.f11264 = this.f3858;
        c2294.f11266 = this.f3861;
        c2294.f11271 = this.f3860;
        c2294.f11273 = this.f3850;
        c2294.f11263 = this.f3854;
        c2294.f11272 = AbstractC0797.m1839(this.f3847);
        c2294.f11267 = this.f3849;
        c2294.f11260 = this.f3857;
        c2294.f11262 = this.f3855;
        c2294.f11270 = this.f3856;
        c2294.f11268 = this.f3848;
        c2294.f11269 = this.f3846;
        c2294.f11261 = this.f3851;
        c2294.f11259 = this.f3859;
        c2294.f11265 = this.f3853;
        return c2294;
    }
}
