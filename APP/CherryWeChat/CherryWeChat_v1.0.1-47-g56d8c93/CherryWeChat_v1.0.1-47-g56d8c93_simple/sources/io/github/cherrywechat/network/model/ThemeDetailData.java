package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0452Kf;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeDetailData {
    public static final Companion Companion = null;
    private final String author;
    private final String description;
    private final String details;
    private final String name;
    private final double price;
    private final List<String> screenshots;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeDetailData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ThemeDetailData() {
        String r1 = null;
        String r2 = null;
        double r3 = 0.0d;
        String r5 = null;
        String r6 = null;
        List r7 = null;
        this(r1, r2, r3, r5, r6, r7, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeDetailData copy$default(ThemeDetailData r0, String r1, String r2, double r3, String r5, String r6, List r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.author;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.price;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.details;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = r0.description;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.screenshots;
    L20:
        List r92 = r7;
        String r72 = r5;
        double r52 = r3;
        String r32 = r1;
        String r4 = r2;
        return r0.copy(r32, r4, r52, r72, r6, r92);
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getScreenshots$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeDetailData r5, InterfaceC0962Wa r6, InterfaceC0126Cx r7) {
        if (r6.m1845g() == false) goto L6;
    L7:
        String r72 = r5.name;
        r6.m1842d();
    L9:
        if (r6.m1845g() == false) goto L12;
    L13:
        String r73 = r5.author;
        r6.m1842d();
    L15:
        if (r6.m1845g() == false) goto L18;
    L19:
        TolerantDoubleSerializer r74 = TolerantDoubleSerializer.INSTANCE;
        double r1 = r5.price;
        r6.m1839a();
    L21:
        if (r6.m1845g() == false) goto L24;
    L25:
        String r75 = r5.details;
        r6.m1842d();
    L27:
        if (r6.m1845g() == false) goto L30;
    L31:
        String r76 = r5.description;
        r6.m1842d();
    L33:
        if (r6.m1845g() == false) goto L36;
    L37:
        ScreenshotsSerializer r77 = ScreenshotsSerializer.INSTANCE;
        List<String> r52 = r5.screenshots;
        r6.m1839a();
        return;
    L36:
        if (AbstractC0585Nj.m1134a(r5.screenshots, C0452Kf.f1484a) == false) goto L37;
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r5.description, "") == true) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r5.details, "") == true) goto L27;
    L18:
        if (Double.compare(r5.price, 0.0d) == 0) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r5.author, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r5.name, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.author;
    }

    public final double component3() {
        return this.price;
    }

    public final String component4() {
        return this.details;
    }

    public final String component5() {
        return this.description;
    }

    public final List<String> component6() {
        return this.screenshots;
    }

    public final ThemeDetailData copy(String r9, String r10, double r11, String r13, String r14, List<String> r15) {
        return new ThemeDetailData(r9, r10, r11, r13, r14, r15);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ThemeDetailData) == true) goto L8;
        return false;
    L8:
        ThemeDetailData r82 = (ThemeDetailData) r8;
        if (AbstractC0585Nj.m1134a(this.name, r82.name) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.author, r82.author) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.price, r82.price) == 0) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.details, r82.details) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.description, r82.description) == true) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.screenshots, r82.screenshots) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getName() {
        return this.name;
    }

    public final double getPrice() {
        return this.price;
    }

    public final List<String> getScreenshots() {
        return this.screenshots;
    }

    public int hashCode() {
        int r0 = this.name.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.author, r0, 31);
        int r2 = (Double.hashCode(this.price) + r02) * 31;
        int r03 = AbstractC2374ph.m4810g(this.details, r2, 31);
        int r04 = AbstractC2374ph.m4810g(this.description, r03, 31);
        return this.screenshots.hashCode() + r04;
    }

    public String toString() {
        return "ThemeDetailData(name=" + this.name + ", author=" + this.author + ", price=" + this.price + ", details=" + this.details + ", description=" + this.description + ", screenshots=" + this.screenshots + ')';
    }

    public /* synthetic */ ThemeDetailData(int r2, String r3, String r4, double r5, String r7, String r8, List r9, AbstractC0298Gx r10) {
        if ((r2 & 1) != 0) goto L5;
        this.name = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.author = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.price = 0.0d;
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.details = "";
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.description = "";
    L23:
        if ((r2 & 32) != 0) goto L26;
        this.screenshots = C0452Kf.f1484a;
        return;
    L26:
        this.screenshots = r9;
        return;
    L21:
        this.description = r8;
        goto L23
    L17:
        this.details = r7;
        goto L19
    L13:
        this.price = r5;
        goto L15
    L9:
        this.author = r4;
        goto L11
    L5:
        this.name = r3;
        goto L7
    }

    public ThemeDetailData(String r1, String r2, double r3, String r5, String r6, List<String> r7) {
        this.name = r1;
        this.author = r2;
        this.price = r3;
        this.details = r5;
        this.description = r6;
        this.screenshots = r7;
    }

    public /* synthetic */ ThemeDetailData(String r2, String r3, double r4, String r6, String r7, List r8, int r9, AbstractC0621Oc r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r9 & 32) == 0) goto L20;
        r8 = C0452Kf.f1484a;
    L20:
        List r92 = r8;
        String r82 = r7;
        double r5 = r4;
        String r42 = r3;
        String r32 = r2;
        this(r32, r42, r5, r6, r82, r92);
    }
}
