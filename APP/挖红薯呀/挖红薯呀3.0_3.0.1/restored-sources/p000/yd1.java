package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class yd1 {

    /* JADX INFO: renamed from: b */
    public static final be1 f7612b;

    /* JADX INFO: renamed from: a */
    public final be1 f7613a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        f7612b = (i >= 36 ? new od1() : i >= 35 ? new nd1() : i >= 34 ? new md1() : i >= 31 ? new ld1() : new kd1()).mo1693b().f503a.mo4063a().f503a.mo3498b().f503a.mo3499c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yd1(be1 be1Var) {
        this.f7613a = be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public be1 mo4063a() {
        return this.f7613a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public be1 mo3498b() {
        return this.f7613a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public be1 mo3499c() {
        return this.f7613a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public List<Rect> mo3219e(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd1)) {
            return false;
        }
        yd1 yd1Var = (yd1) obj;
        return mo3226p() == yd1Var.mo3226p() && mo3501o() == yd1Var.mo3501o() && Objects.equals(mo3223k(), yd1Var.mo3223k()) && Objects.equals(mo3500j(), yd1Var.mo3500j()) && Objects.equals(mo4064g(), yd1Var.mo4064g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3220f(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C0362jo mo4064g() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public i20 mo3221h(int i) {
        return i20.f2403e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo3226p()), Boolean.valueOf(mo3501o()), mo3223k(), mo3500j(), mo4064g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public i20 mo3222i(int i) {
        if ((i & 8) == 0) {
            return i20.f2403e;
        }
        C0921xc.m5131l("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public i20 mo3500j() {
        return i20.f2403e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public i20 mo3223k() {
        return i20.f2403e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public be1 mo4196n(int i, int i2, int i3, int i4) {
        return f7612b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public boolean mo3501o() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public boolean mo3226p() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public boolean mo4317q(int i) {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void mo3225m() {
    }

    /* JADX INFO: renamed from: d */
    public void mo4316d(View view) {
    }

    /* JADX INFO: renamed from: l */
    public void mo3224l(View view) {
    }

    /* JADX INFO: renamed from: r */
    public void mo3227r(C0438lo c0438lo) {
    }

    /* JADX INFO: renamed from: s */
    public void mo3228s(i20[] i20VarArr) {
    }

    /* JADX INFO: renamed from: t */
    public void mo3229t(be1 be1Var) {
    }

    /* JADX INFO: renamed from: u */
    public void mo3230u(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void mo3231v(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: w */
    public void mo3232w(Rect[][] rectArr) {
    }
}
