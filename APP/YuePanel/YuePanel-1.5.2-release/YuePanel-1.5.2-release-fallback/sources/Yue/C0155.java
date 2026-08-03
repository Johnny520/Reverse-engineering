package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0155 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f382 = -1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final java.lang.Object f383;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ$ۥ, reason: contains not printable characters */
    public static class C0156 extends android.view.accessibility.AccessibilityNodeProvider {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0155 f384;

        public C0156(Yue.C0155 r1) {
                r0 = this;
                r0.<init>()
                r0.f384 = r1
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
                r1 = this;
                Yue.ۥ۟۟ۦۡ r0 = r1.f384
                Yue.ۥ۟۟ۥۧ r2 = r0.mo861(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.m792()
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String r4, int r5) {
                r3 = this;
                Yue.ۥ۟۟ۦۡ r0 = r3.f384
                java.util.List r4 = r0.m862(r4, r5)
                if (r4 != 0) goto La
                r4 = 0
                return r4
            La:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                int r0 = r4.size()
                r1 = 0
            L14:
                if (r1 >= r0) goto L26
                java.lang.Object r2 = r4.get(r1)
                Yue.ۥ۟۟ۥۧ r2 = (Yue.C0140) r2
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.m792()
                r5.add(r2)
                int r1 = r1 + 1
                goto L14
            L26:
                return r5
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
                r1 = this;
                Yue.ۥ۟۟ۦۡ r0 = r1.f384
                Yue.ۥ۟۟ۥۧ r2 = r0.mo863(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.m792()
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                Yue.ۥ۟۟ۦۡ r0 = r1.f384
                boolean r2 = r0.mo865(r2, r3, r4)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C0157 extends Yue.C0155.C0156 {
        public C0157(Yue.C0155 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int r2, android.view.accessibility.AccessibilityNodeInfo r3, java.lang.String r4, android.os.Bundle r5) {
                r1 = this;
                Yue.ۥ۟۟ۦۡ r0 = r1.f384
                Yue.ۥ۟۟ۥۧ r3 = Yue.C0140.m624(r3)
                r0.m860(r2, r3, r4, r5)
                return
        }
    }

    public C0155() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟۟ۦۡ$ۥ۟ r0 = new Yue.ۥ۟۟ۦۡ$ۥ۟
            r0.<init>(r1)
            r1.f383 = r0
            return
    }

    public C0155(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f383 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m860(int r1, @Yue.InterfaceC4410 Yue.C0140 r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C0140 mo861(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.List<Yue.C0140> m862(@Yue.InterfaceC4410 java.lang.String r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C0140 mo863(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Object m864() {
            r1 = this;
            java.lang.Object r0 = r1.f383
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo865(int r1, int r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
