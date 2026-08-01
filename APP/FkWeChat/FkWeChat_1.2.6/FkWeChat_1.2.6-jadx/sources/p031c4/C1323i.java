package p031c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C0647f;
import p044d4.C1873a;

/* JADX INFO: renamed from: c4.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1323i {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f3959d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f3960a;

    /* JADX INFO: renamed from: b */
    public final C0647f f3961b;

    /* JADX INFO: renamed from: c */
    public volatile int f3962c = 0;

    public C1323i(C0647f c0647f, int i10) {
        this.f3961b = c0647f;
        this.f3960a = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m5313a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceM2576g = this.f3961b.m2576g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM2576g);
        canvas.drawText(this.f3961b.m2572c(), this.f3960a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m5314b(int i10) {
        return m5319g().m6639h(i10);
    }

    /* JADX INFO: renamed from: c */
    public int m5315c() {
        return m5319g().m6640i();
    }

    /* JADX INFO: renamed from: d */
    public int m5316d() {
        return this.f3962c & 3;
    }

    /* JADX INFO: renamed from: e */
    public int m5317e() {
        return m5319g().m6642k();
    }

    /* JADX INFO: renamed from: f */
    public int m5318f() {
        return m5319g().m6643l();
    }

    /* JADX INFO: renamed from: g */
    public final C1873a m5319g() {
        ThreadLocal threadLocal = f3959d;
        C1873a c1873a = (C1873a) threadLocal.get();
        if (c1873a == null) {
            c1873a = new C1873a();
            threadLocal.set(c1873a);
        }
        this.f3961b.m2573d().m6650j(c1873a, this.f3960a);
        return c1873a;
    }

    /* JADX INFO: renamed from: h */
    public short m5320h() {
        return m5319g().m6644m();
    }

    /* JADX INFO: renamed from: i */
    public int m5321i() {
        return m5319g().m6645n();
    }

    /* JADX INFO: renamed from: j */
    public boolean m5322j() {
        return m5319g().m6641j();
    }

    /* JADX INFO: renamed from: k */
    public boolean m5323k() {
        return (this.f3962c & 4) > 0;
    }

    /* JADX INFO: renamed from: l */
    public void m5324l(boolean z10) {
        int iM5316d = m5316d();
        if (z10) {
            this.f3962c = iM5316d | 4;
        } else {
            this.f3962c = iM5316d;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5325m(boolean z10) {
        int i10 = this.f3962c & 4;
        this.f3962c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m5318f()));
        sb2.append(", codepoints:");
        int iM5315c = m5315c();
        for (int i10 = 0; i10 < iM5315c; i10++) {
            sb2.append(Integer.toHexString(m5314b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
