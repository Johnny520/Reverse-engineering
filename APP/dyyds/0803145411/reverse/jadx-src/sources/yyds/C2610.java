package yyds;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: yyds.ᲈᛲᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2610 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2693 f12815;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2693 f12816;

    static {
        int i = Build.VERSION.SDK_INT;
        f12815 = (i >= 36 ? new C1193() : i >= 35 ? new C1459() : i >= 34 ? new C0018() : i >= 31 ? new C0021() : new C1370()).mo1889().f13242.mo4693().f13242.mo3673().f13242.mo3674();
    }

    public C2610(C2693 c2693) {
        this.f12816 = c2693;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2610)) {
            return false;
        }
        C2610 c2610 = (C2610) obj;
        return mo4546() == c2610.mo4546() && mo3671() == c2610.mo3671() && Objects.equals(mo4551(), c2610.mo4551()) && Objects.equals(mo3672(), c2610.mo3672()) && Objects.equals(mo4694(), c2610.mo4694());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo4546()), Boolean.valueOf(mo3671()), mo4551(), mo3672(), mo4694());
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public boolean mo3671() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public C1870 mo2800(int i) {
        return C1870.f9412;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public C2693 mo3450(int i, int i2, int i3, int i4) {
        return f12815;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public C1870 mo3672() {
        return C1870.f9412;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public List<Rect> mo1062(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2693 mo4693() {
        return this.f12816;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public void mo4545(int i) {
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public boolean mo4546() {
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public void mo4547(C1870[] c1870Arr) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public C2693 mo3673() {
        return this.f12816;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public void mo4548(C0100 c0100) {
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C0515 mo4694() {
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public void mo4549(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ */
    public void mo4550(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public void mo2802(View view) {
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public void mo1063() {
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public C1870 mo4551() {
        return C1870.f9412;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public void mo4552(C2693 c2693) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public C2693 mo3674() {
        return this.f12816;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public boolean mo2803(int i) {
        return true;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public List<Rect> mo1064(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo4430(View view) {
    }
}
