package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeConfig {
    public static final Companion Companion = null;
    private final String author;
    private final boolean autoDarkTheme;
    private final String description;
    private final boolean isFullBg;
    private final String name;
    private final String version;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ThemeConfig() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        boolean r5 = false;
        boolean r6 = false;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ ThemeConfig copy$default(ThemeConfig r0, String r1, String r2, String r3, String r4, boolean r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.author;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.version;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.description;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.isFullBg;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.autoDarkTheme;
    L20:
        boolean r72 = r5;
        boolean r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r0.copy(r1, r2, r52, r62, r72, r82);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeConfig r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.name;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.author;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.version;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        String r35 = r1.description;
        r2.m1842d();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        boolean r36 = r1.isFullBg;
        r2.m1840b();
    L33:
        if (r2.m1845g() == false) goto L36;
    L37:
        boolean r12 = r1.autoDarkTheme;
        r2.m1840b();
        return;
    L36:
        if (r1.autoDarkTheme != true) goto L37;
        return;
    L30:
        if (r1.isFullBg == false) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r1.description, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r1.version, "1.0") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.author, "未知作者") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.name, "未知主题") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isFullBg;
    }

    public final boolean component6() {
        return this.autoDarkTheme;
    }

    public final ThemeConfig copy(String r8, String r9, String r10, String r11, boolean r12, boolean r13) {
        return new ThemeConfig(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ThemeConfig) == true) goto L8;
        return false;
    L8:
        ThemeConfig r52 = (ThemeConfig) r5;
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.author, r52.author) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.version, r52.version) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.description, r52.description) == true) goto L21;
        return false;
    L21:
        if (this.isFullBg == r52.isFullBg) goto L24;
        return false;
    L24:
        if (this.autoDarkTheme == r52.autoDarkTheme) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final boolean getAutoDarkTheme() {
        return this.autoDarkTheme;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int r0 = this.name.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.author, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.version, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.description, r03, 31);
        int r2 = (Boolean.hashCode(this.isFullBg) + r04) * 31;
        return Boolean.hashCode(this.autoDarkTheme) + r2;
    }

    public final boolean isFullBg() {
        return this.isFullBg;
    }

    public String toString() {
        return "ThemeConfig(name=" + this.name + ", author=" + this.author + ", version=" + this.version + ", description=" + this.description + ", isFullBg=" + this.isFullBg + ", autoDarkTheme=" + this.autoDarkTheme + ')';
    }

    public /* synthetic */ ThemeConfig(int r1, String r2, String r3, String r4, String r5, boolean r6, boolean r7, AbstractC0298Gx r8) {
        if ((r1 & 1) != 0) goto L5;
        r2 = "未知主题";
    L5:
        this.name = r2;
        if ((r1 & 2) != 0) goto L8;
        this.author = "未知作者";
    L10:
        if ((r1 & 4) != 0) goto L12;
        this.version = "1.0";
    L14:
        if ((r1 & 8) != 0) goto L16;
        this.description = "";
    L18:
        if ((r1 & 16) != 0) goto L20;
        this.isFullBg = false;
    L22:
        if ((r1 & 32) != 0) goto L25;
        this.autoDarkTheme = true;
        return;
    L25:
        this.autoDarkTheme = r7;
        return;
    L20:
        this.isFullBg = r6;
        goto L22
    L16:
        this.description = r5;
        goto L18
    L12:
        this.version = r4;
        goto L14
    L8:
        this.author = r3;
        goto L10
    }

    public ThemeConfig(String r1, String r2, String r3, String r4, boolean r5, boolean r6) {
        this.name = r1;
        this.author = r2;
        this.version = r3;
        this.description = r4;
        this.isFullBg = r5;
        this.autoDarkTheme = r6;
    }

    public /* synthetic */ ThemeConfig(String r1, String r2, String r3, String r4, boolean r5, boolean r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = "未知主题";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = "未知作者";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = "1.0";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = false;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = true;
    L20:
        boolean r72 = r5;
        boolean r82 = r6;
        String r52 = r3;
        String r62 = r4;
        this(r1, r2, r52, r62, r72, r82);
    }
}
