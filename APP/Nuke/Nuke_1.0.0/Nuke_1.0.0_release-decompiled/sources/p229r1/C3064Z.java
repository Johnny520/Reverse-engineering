package p229r1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.Z */
/* JADX INFO: loaded from: classes.dex */
public class C3064Z {

    /* JADX INFO: renamed from: b */
    public static final C3070c0 f9775b;

    /* JADX INFO: renamed from: a */
    public final C3070c0 f9776a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f9775b = (i5 >= 36 ? new C3054O() : i5 >= 35 ? new C3053N() : i5 >= 34 ? new C3052M() : i5 >= 31 ? new C3051L() : i5 >= 30 ? new C3050K() : i5 >= 29 ? new C3048I() : new C3047H()).mo5322b().f9782a.mo5384a().f9782a.mo5379b().f9782a.mo5380c();
    }

    public C3064Z(C3070c0 c3070c0) {
        this.f9776a = c3070c0;
    }

    /* JADX INFO: renamed from: a */
    public C3070c0 mo5384a() {
        return this.f9776a;
    }

    /* JADX INFO: renamed from: b */
    public C3070c0 mo5379b() {
        return this.f9776a;
    }

    /* JADX INFO: renamed from: c */
    public C3070c0 mo5380c() {
        return this.f9776a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3064Z)) {
            return false;
        }
        C3064Z c3064z = (C3064Z) obj;
        return mo5373t() == c3064z.mo5373t() && mo5382s() == c3064z.mo5382s() && Objects.equals(mo5369n(), c3064z.mo5369n()) && Objects.equals(mo5381l(), c3064z.mo5381l()) && Objects.equals(mo5385h(), c3064z.mo5385h());
    }

    /* JADX INFO: renamed from: f */
    public List<Rect> mo5365f(int i5) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public List<Rect> mo5366g(int i5) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: h */
    public C3071d mo5385h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo5373t()), Boolean.valueOf(mo5382s()), mo5369n(), mo5381l(), mo5385h());
    }

    /* JADX INFO: renamed from: i */
    public C2688b mo5367i(int i5) {
        return C2688b.f8571e;
    }

    /* JADX INFO: renamed from: j */
    public C2688b mo5368j(int i5) {
        if ((i5 & 8) == 0) {
            return C2688b.f8571e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* JADX INFO: renamed from: k */
    public C2688b mo5386k() {
        return mo5369n();
    }

    /* JADX INFO: renamed from: l */
    public C2688b mo5381l() {
        return C2688b.f8571e;
    }

    /* JADX INFO: renamed from: m */
    public C2688b mo5387m() {
        return mo5369n();
    }

    /* JADX INFO: renamed from: n */
    public C2688b mo5369n() {
        return C2688b.f8571e;
    }

    /* JADX INFO: renamed from: o */
    public C2688b mo5388o() {
        return mo5369n();
    }

    /* JADX INFO: renamed from: r */
    public C3070c0 mo5372r(int i5, int i6, int i7, int i8) {
        return f9775b;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo5382s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo5373t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo5374u(int i5) {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void mo5371q() {
    }

    /* JADX INFO: renamed from: A */
    public void mo5358A(int i5) {
    }

    /* JADX INFO: renamed from: B */
    public void mo5359B(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: C */
    public void mo5360C(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: d */
    public void mo5363d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo5364e(C3070c0 c3070c0) {
    }

    /* JADX INFO: renamed from: p */
    public void mo5370p(View view) {
    }

    /* JADX INFO: renamed from: v */
    public void mo5375v(C3075f c3075f) {
    }

    /* JADX INFO: renamed from: w */
    public void mo5376w(C2688b[] c2688bArr) {
    }

    /* JADX INFO: renamed from: x */
    public void mo5377x(C2688b c2688b) {
    }

    /* JADX INFO: renamed from: y */
    public void mo5378y(C3070c0 c3070c0) {
    }

    /* JADX INFO: renamed from: z */
    public void mo5383z(C2688b c2688b) {
    }
}
