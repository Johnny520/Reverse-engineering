package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0158 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.accessibility.AccessibilityRecord f385;

    @java.lang.Deprecated
    public C0158(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.view.accessibility.AccessibilityRecord r1 = (android.view.accessibility.AccessibilityRecord) r1
            r0.f385 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m866(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollX()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m867(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollY()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Yue.C0158 m868() {
            Yue.ۥ۟۟ۦۢ r0 = new Yue.ۥ۟۟ۦۢ
            android.view.accessibility.AccessibilityRecord r1 = android.view.accessibility.AccessibilityRecord.obtain()
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static Yue.C0158 m869(Yue.C0158 r1) {
            Yue.ۥ۟۟ۦۢ r0 = new Yue.ۥ۟۟ۦۢ
            android.view.accessibility.AccessibilityRecord r1 = r1.f385
            android.view.accessibility.AccessibilityRecord r1 = android.view.accessibility.AccessibilityRecord.obtain(r1)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m870(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollX(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static void m871(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollY(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m872(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityRecord r0, @Yue.InterfaceC4544 android.view.View r1, int r2) {
            r0.setSource(r1, r2)
            return
    }

    @java.lang.Deprecated
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof Yue.C0158
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟۟ۦۢ r4 = (Yue.C0158) r4
            android.view.accessibility.AccessibilityRecord r1 = r3.f385
            if (r1 != 0) goto L17
            android.view.accessibility.AccessibilityRecord r4 = r4.f385
            if (r4 != 0) goto L15
            goto L16
        L15:
            r0 = r2
        L16:
            return r0
        L17:
            android.view.accessibility.AccessibilityRecord r4 = r4.f385
            boolean r4 = r1.equals(r4)
            return r4
    }

    @java.lang.Deprecated
    public int hashCode() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m873() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getAddedCount()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.CharSequence m874() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            java.lang.CharSequence r0 = r0.getBeforeText()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.CharSequence m875() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            java.lang.CharSequence r0 = r0.getClassName()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.CharSequence m876() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m877() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getCurrentItemIndex()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m878() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getFromIndex()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object m879() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m880() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getItemCount()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m881() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = m866(r0)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m882() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = m867(r0)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public android.os.Parcelable m883() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            android.os.Parcelable r0 = r0.getParcelableData()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m884() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getRemovedCount()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m885() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getScrollX()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m886() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getScrollY()
            return r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C0140 m887() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.getSource()
            Yue.ۥ۟۟ۥۧ r0 = Yue.C0140.m625(r0)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.util.List<java.lang.CharSequence> m888() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            java.util.List r0 = r0.getText()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m889() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getToIndex()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m890() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            int r0 = r0.getWindowId()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m891() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            boolean r0 = r0.isChecked()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m892() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            boolean r0 = r0.isEnabled()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m893() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            boolean r0 = r0.isFullScreen()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m894() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            boolean r0 = r0.isPassword()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m895() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            boolean r0 = r0.isScrollable()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m896() {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.recycle()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m897(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setAddedCount(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m898(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setBeforeText(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m899(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setChecked(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m900(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setClassName(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m901(java.lang.CharSequence r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setContentDescription(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m902(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setCurrentItemIndex(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m903(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setEnabled(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m904(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setFromIndex(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m905(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setFullScreen(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m906(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setItemCount(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m907(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            m870(r0, r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m908(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            m871(r0, r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m909(android.os.Parcelable r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setParcelableData(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m910(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setPassword(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m911(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setRemovedCount(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m912(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setScrollX(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m913(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setScrollY(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m914(boolean r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setScrollable(r2)
            return
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m915(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setSource(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m916(android.view.View r2, int r3) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            m872(r0, r2, r3)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m917(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityRecord r0 = r1.f385
            r0.setToIndex(r2)
            return
    }
}
