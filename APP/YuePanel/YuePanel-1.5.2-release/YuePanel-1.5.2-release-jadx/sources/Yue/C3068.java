package Yue;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3068 {

    /* JADX INFO: renamed from: ۥ */
    public final AccessibilityRecord f59;

    @Deprecated
    public C3068(Object obj) {
        this.f59 = (AccessibilityRecord) obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m6165(@InterfaceC6391 AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m6166(@InterfaceC6391 AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static C3068 m6167() {
        return new C3068(AccessibilityRecord.obtain());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static C3068 m6168(C3068 c3068) {
        return new C3068(AccessibilityRecord.obtain(c3068.f59));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static void m6169(@InterfaceC6391 AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static void m6170(@InterfaceC6391 AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m6171(@InterfaceC6391 AccessibilityRecord accessibilityRecord, @InterfaceC6490 View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3068)) {
            return false;
        }
        C3068 c3068 = (C3068) obj;
        AccessibilityRecord accessibilityRecord = this.f59;
        return accessibilityRecord == null ? c3068.f59 == null : accessibilityRecord.equals(c3068.f59);
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f59;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public int m145() {
        return this.f59.getAddedCount();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public CharSequence m146() {
        return this.f59.getBeforeText();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public CharSequence m6172() {
        return this.f59.getClassName();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public CharSequence m6173() {
        return this.f59.getContentDescription();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m6174() {
        return this.f59.getCurrentItemIndex();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m6175() {
        return this.f59.getFromIndex();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object m6176() {
        return this.f59;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m6177() {
        return this.f59.getItemCount();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m6178() {
        return m6165(this.f59);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m6179() {
        return m6166(this.f59);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Parcelable m6180() {
        return this.f59.getParcelableData();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m6181() {
        return this.f59.getRemovedCount();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m6182() {
        return this.f59.getScrollX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m6183() {
        return this.f59.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C3055 m6184() {
        return C3055.m5951(this.f59.getSource());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public List<CharSequence> m6185() {
        return this.f59.getText();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m6186() {
        return this.f59.getToIndex();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m6187() {
        return this.f59.getWindowId();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m6188() {
        return this.f59.isChecked();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m6189() {
        return this.f59.isEnabled();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m6190() {
        return this.f59.isFullScreen();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m6191() {
        return this.f59.isPassword();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m6192() {
        return this.f59.isScrollable();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m6193() {
        this.f59.recycle();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m6194(int i) {
        this.f59.setAddedCount(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m6195(CharSequence charSequence) {
        this.f59.setBeforeText(charSequence);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m6196(boolean z) {
        this.f59.setChecked(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m6197(CharSequence charSequence) {
        this.f59.setClassName(charSequence);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m6198(CharSequence charSequence) {
        this.f59.setContentDescription(charSequence);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m6199(int i) {
        this.f59.setCurrentItemIndex(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m6200(boolean z) {
        this.f59.setEnabled(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m6201(int i) {
        this.f59.setFromIndex(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m6202(boolean z) {
        this.f59.setFullScreen(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m6203(int i) {
        this.f59.setItemCount(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m6204(int i) {
        m6169(this.f59, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m6205(int i) {
        m6170(this.f59, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m6206(Parcelable parcelable) {
        this.f59.setParcelableData(parcelable);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m6207(boolean z) {
        this.f59.setPassword(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m6208(int i) {
        this.f59.setRemovedCount(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m6209(int i) {
        this.f59.setScrollX(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m6210(int i) {
        this.f59.setScrollY(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m6211(boolean z) {
        this.f59.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6212(View view) {
        this.f59.setSource(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m6213(View view, int i) {
        m6171(this.f59, view, i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m6214(int i) {
        this.f59.setToIndex(i);
    }
}
