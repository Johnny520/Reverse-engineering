package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7807 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f30093 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30094 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f30095 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f30096 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f30097 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f30098 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f30099 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30100 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f30101 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f30102 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f30103 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f30104 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f30105 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f30106 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f30107 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f30108 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f30109 = 4096;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f30110 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f30111 = 16384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f30112 = 7;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7807.InterfaceC7809 f30113;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.recyclerview.widget.C7807.C7808 f30114;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ, reason: contains not printable characters */
    public static class C7808 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f30115;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f30116;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30117;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30118;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f30119;

        public C7808() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f30115 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m30330(int r2) {
                r1 = this;
                int r0 = r1.f30115
                r2 = r2 | r0
                r1.f30115 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m30331() {
                r4 = this;
                int r0 = r4.f30115
                r1 = r0 & 7
                r2 = 0
                if (r1 == 0) goto L13
                int r1 = r4.f30118
                int r3 = r4.f30116
                int r1 = r4.m30332(r1, r3)
                r0 = r0 & r1
                if (r0 != 0) goto L13
                return r2
            L13:
                int r0 = r4.f30115
                r1 = r0 & 112(0x70, float:1.57E-43)
                if (r1 == 0) goto L27
                int r1 = r4.f30118
                int r3 = r4.f30117
                int r1 = r4.m30332(r1, r3)
                int r1 = r1 << 4
                r0 = r0 & r1
                if (r0 != 0) goto L27
                return r2
            L27:
                int r0 = r4.f30115
                r1 = r0 & 1792(0x700, float:2.511E-42)
                if (r1 == 0) goto L3b
                int r1 = r4.f30119
                int r3 = r4.f30116
                int r1 = r4.m30332(r1, r3)
                int r1 = r1 << 8
                r0 = r0 & r1
                if (r0 != 0) goto L3b
                return r2
            L3b:
                int r0 = r4.f30115
                r1 = r0 & 28672(0x7000, float:4.0178E-41)
                if (r1 == 0) goto L4f
                int r1 = r4.f30119
                int r3 = r4.f30117
                int r1 = r4.m30332(r1, r3)
                int r1 = r1 << 12
                r0 = r0 & r1
                if (r0 != 0) goto L4f
                return r2
            L4f:
                r0 = 1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30332(int r1, int r2) {
                r0 = this;
                if (r1 <= r2) goto L4
                r1 = 1
                return r1
            L4:
                if (r1 != r2) goto L8
                r1 = 2
                return r1
            L8:
                r1 = 4
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30333() {
                r1 = this;
                r0 = 0
                r1.f30115 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30334(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.f30116 = r1
                r0.f30117 = r2
                r0.f30118 = r3
                r0.f30119 = r4
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC7809 {
        /* JADX INFO: renamed from: ۥ */
        android.view.View mo29765(int r1);

        /* JADX INFO: renamed from: ۥ۟ */
        int mo29766(android.view.View r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo29767();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        int mo29768();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        int mo29769(android.view.View r1);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟۟, reason: contains not printable characters */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7810 {
    }

    public C7807(androidx.recyclerview.widget.C7807.InterfaceC7809 r1) {
            r0 = this;
            r0.<init>()
            r0.f30113 = r1
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r1 = new androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ
            r1.<init>()
            r0.f30114 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.View m30328(int r9, int r10, int r11, int r12) {
            r8 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r0 = r8.f30113
            int r0 = r0.mo29767()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r1 = r8.f30113
            int r1 = r1.mo29768()
            if (r10 <= r9) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = -1
        L11:
            r3 = 0
        L12:
            if (r9 == r10) goto L57
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r4 = r8.f30113
            android.view.View r4 = r4.mo29765(r9)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r5 = r8.f30113
            int r5 = r5.mo29766(r4)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r6 = r8.f30113
            int r6 = r6.mo29769(r4)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r7 = r8.f30114
            r7.m30334(r0, r1, r5, r6)
            if (r11 == 0) goto L40
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            r5.m30333()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            r5.m30330(r11)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            boolean r5 = r5.m30331()
            if (r5 == 0) goto L40
            return r4
        L40:
            if (r12 == 0) goto L55
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            r5.m30333()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            r5.m30330(r12)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r5 = r8.f30114
            boolean r5 = r5.m30331()
            if (r5 == 0) goto L55
            r3 = r4
        L55:
            int r9 = r9 + r2
            goto L12
        L57:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m30329(android.view.View r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r0 = r5.f30114
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r1 = r5.f30113
            int r1 = r1.mo29767()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r2 = r5.f30113
            int r2 = r2.mo29768()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r3 = r5.f30113
            int r3 = r3.mo29766(r6)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ۟ r4 = r5.f30113
            int r6 = r4.mo29769(r6)
            r0.m30334(r1, r2, r3, r6)
            if (r7 == 0) goto L30
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r6 = r5.f30114
            r6.m30333()
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r6 = r5.f30114
            r6.m30330(r7)
            androidx.recyclerview.widget.ۥ۟۟۠ۨ$ۥ r6 = r5.f30114
            boolean r6 = r6.m30331()
            return r6
        L30:
            r6 = 0
            return r6
    }
}
