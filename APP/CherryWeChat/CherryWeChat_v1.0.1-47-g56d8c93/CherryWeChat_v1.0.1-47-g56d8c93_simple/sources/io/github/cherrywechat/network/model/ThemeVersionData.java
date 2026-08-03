package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeVersionData {
    public static final Companion Companion = null;
    private final String createdAt;
    private final String fileExt;
    private final String fileName;
    private final long fileSize;

    /* JADX INFO: renamed from: id */
    private final String f5575id;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeVersionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ThemeVersionData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        long r5 = 0;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r7, 63, null);
    }

    public static /* synthetic */ ThemeVersionData copy$default(ThemeVersionData r0, String r1, String r2, String r3, String r4, long r5, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.f5575id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.versionName;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.fileName;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.fileExt;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.fileSize;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.createdAt;
    L20:
        String r92 = r7;
        long r72 = r5;
        String r52 = r3;
        String r6 = r4;
        return r0.copy(r1, r2, r52, r6, r72, r92);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeVersionData r5, InterfaceC0962Wa r6, InterfaceC0126Cx r7) {
        if (r6.m1845g() == false) goto L6;
    L7:
        String r72 = r5.f5575id;
        r6.m1842d();
    L9:
        if (r6.m1845g() == false) goto L12;
    L13:
        String r73 = r5.versionName;
        r6.m1842d();
    L15:
        if (r6.m1845g() == false) goto L18;
    L19:
        String r74 = r5.fileName;
        r6.m1842d();
    L21:
        if (r6.m1845g() == false) goto L24;
    L25:
        String r75 = r5.fileExt;
        r6.m1842d();
    L27:
        if (r6.m1845g() == false) goto L30;
    L31:
        long r1 = r5.fileSize;
        r6.m1841c();
    L33:
        if (r6.m1845g() == false) goto L36;
    L37:
        String r52 = r5.createdAt;
        r6.m1842d();
        return;
    L36:
        if (AbstractC0585Nj.m1134a(r5.createdAt, "") == false) goto L37;
        return;
    L30:
        if (r5.fileSize == 0) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r5.fileExt, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r5.fileName, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r5.versionName, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r5.f5575id, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.f5575id;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.fileExt;
    }

    public final long component5() {
        return this.fileSize;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final ThemeVersionData copy(String r9, String r10, String r11, String r12, long r13, String r15) {
        return new ThemeVersionData(r9, r10, r11, r12, r13, r15);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ThemeVersionData) == true) goto L8;
        return false;
    L8:
        ThemeVersionData r82 = (ThemeVersionData) r8;
        if (AbstractC0585Nj.m1134a(this.f5575id, r82.f5575id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.versionName, r82.versionName) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.fileName, r82.fileName) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.fileExt, r82.fileExt) == true) goto L21;
        return false;
    L21:
        if (this.fileSize == r82.fileSize) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.createdAt, r82.createdAt) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFileExt() {
        return this.fileExt;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.f5575id;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int r0 = this.f5575id.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.versionName, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.fileName, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.fileExt, r03, 31);
        int r2 = (Long.hashCode(this.fileSize) + r04) * 31;
        return this.createdAt.hashCode() + r2;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("ThemeVersionData(id=");
        r0.append(this.f5575id);
        r0.append(", versionName=");
        r0.append(this.versionName);
        r0.append(", fileName=");
        r0.append(this.fileName);
        r0.append(", fileExt=");
        r0.append(this.fileExt);
        r0.append(", fileSize=");
        r0.append(this.fileSize);
        r0.append(", createdAt=");
        return AbstractC2374ph.m4815l(r0, this.createdAt, ')');
    }

    public /* synthetic */ ThemeVersionData(int r2, String r3, String r4, String r5, String r6, long r7, String r9, AbstractC0298Gx r10) {
        if ((r2 & 1) != 0) goto L5;
        this.f5575id = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.versionName = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.fileName = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.fileExt = "";
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.fileSize = 0;
    L23:
        if ((r2 & 32) != 0) goto L26;
        this.createdAt = "";
        return;
    L26:
        this.createdAt = r9;
        return;
    L21:
        this.fileSize = r7;
        goto L23
    L17:
        this.fileExt = r6;
        goto L19
    L13:
        this.fileName = r5;
        goto L15
    L9:
        this.versionName = r4;
        goto L11
    L5:
        this.f5575id = r3;
        goto L7
    }

    public ThemeVersionData(String r1, String r2, String r3, String r4, long r5, String r7) {
        this.f5575id = r1;
        this.versionName = r2;
        this.fileName = r3;
        this.fileExt = r4;
        this.fileSize = r5;
        this.createdAt = r7;
    }

    public /* synthetic */ ThemeVersionData(String r2, String r3, String r4, String r5, long r6, String r8, int r9, AbstractC0621Oc r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        String r92 = "";
    L20:
        long r7 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r7, r92);
        return;
    L21:
        r92 = r8;
        goto L20
    }
}
