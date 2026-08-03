package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC0412
@Yue.InterfaceC5336(19)
public class C6495 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final int f22835 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final int f22836 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final int f22837 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<Yue.C4203> f22838 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f22839;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7555 f22840;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public volatile int f22841;

    /* JADX INFO: renamed from: Yue.ۥۢۢۤۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6496 {
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C6495.f22838 = r0
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C6495(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r2, @Yue.InterfaceC3281(from = 0) int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f22841 = r0
            r1.f22840 = r2
            r1.f22839 = r3
            return
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            int r1 = r4.m23989()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            int r1 = r4.m23985()
            r2 = 0
        L26:
            if (r2 >= r1) goto L3b
            int r3 = r4.m23984(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            int r2 = r2 + 1
            goto L26
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m23983(@Yue.InterfaceC4410 android.graphics.Canvas r10, float r11, float r12, @Yue.InterfaceC4410 android.graphics.Paint r13) {
            r9 = this;
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = r9.f22840
            android.graphics.Typeface r0 = r0.m29042()
            android.graphics.Typeface r1 = r13.getTypeface()
            r13.setTypeface(r0)
            int r0 = r9.f22839
            int r4 = r0 * 2
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = r9.f22840
            char[] r3 = r0.m29038()
            r5 = 2
            r2 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r2.drawText(r3, r4, r5, r6, r7, r8)
            r13.setTypeface(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m23984(int r2) {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            int r2 = r0.m16376(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m23985() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            int r0 = r0.m16379()
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public short m23986() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            short r0 = r0.m16382()
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m23987() {
            r1 = this;
            int r0 = r1.f22841
            r0 = r0 & 3
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m23988() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            short r0 = r0.m16384()
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m23989() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            int r0 = r0.m16385()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.C4203 m23990() {
            r3 = this;
            java.lang.ThreadLocal<Yue.ۥۡۡ۠ۥ> r0 = Yue.C6495.f22838
            java.lang.Object r1 = r0.get()
            Yue.ۥۡۡ۠ۥ r1 = (Yue.C4203) r1
            if (r1 != 0) goto L12
            Yue.ۥۡۡ۠ۥ r1 = new Yue.ۥۡۡ۠ۥ
            r1.<init>()
            r0.set(r1)
        L12:
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = r3.f22840
            Yue.ۥۡۡ۠ۦ r0 = r0.m29039()
            int r2 = r3.f22839
            r0.m16408(r1, r2)
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public short m23991() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            short r0 = r0.m16386()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.graphics.Typeface m23992() {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = r1.f22840
            android.graphics.Typeface r0 = r0.m29042()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m23993() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            short r0 = r0.m16387()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m23994() {
            r1 = this;
            Yue.ۥۡۡ۠ۥ r0 = r1.m23990()
            boolean r0 = r0.m16383()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m23995() {
            r1 = this;
            int r0 = r1.f22841
            r0 = r0 & 4
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m23996() {
            r1 = this;
            boolean r0 = r1.m23995()
            if (r0 == 0) goto La
            r0 = 4
            r1.f22841 = r0
            goto Ld
        La:
            r0 = 0
            r1.f22841 = r0
        Ld:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m23997(boolean r2) {
            r1 = this;
            int r0 = r1.m23987()
            if (r2 == 0) goto Lb
            r2 = r0 | 4
            r1.f22841 = r2
            goto Ld
        Lb:
            r1.f22841 = r0
        Ld:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m23998(boolean r2) {
            r1 = this;
            int r0 = r1.f22841
            r0 = r0 & 4
            if (r2 == 0) goto L9
            r2 = r0 | 2
            goto Lb
        L9:
            r2 = r0 | 1
        Lb:
            r1.f22841 = r2
            return
    }
}
