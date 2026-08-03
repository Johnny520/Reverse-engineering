package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C8833;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3262
@InterfaceC7113(19)
public class C8033 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final int f23865 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final int f23866 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final int f23867 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final ThreadLocal<C6212> f23868 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ */
    public final int f3208;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C8833 f3209;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public volatile int f23869 = 0;

    /* JADX INFO: renamed from: Yue.ۥۢۢۤۥ$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1411 {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C8033(@InterfaceC6391 C8833 c8833, @InterfaceC5459(from = 0) int i) {
        this.f3209 = c8833;
        this.f3208 = i;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m25400()));
        sb.append(", codepoints:");
        int iM25396 = m25396();
        for (int i = 0; i < iM25396; i++) {
            sb.append(Integer.toHexString(m4051(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4050(@InterfaceC6391 Canvas canvas, float f, float f2, @InterfaceC6391 Paint paint) {
        Typeface typefaceM29703 = this.f3209.m29703();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM29703);
        canvas.drawText(this.f3209.m29699(), this.f3208 * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m4051(int i) {
        return m25401().m19131(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m25396() {
        return m25401().m19134();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public short m25397() {
        return m25401().m19137();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m25398() {
        return this.f23869 & 3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m25399() {
        return m25401().m19139();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m25400() {
        return m25401().m19140();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C6212 m25401() {
        ThreadLocal<C6212> threadLocal = f23868;
        C6212 c6212 = threadLocal.get();
        if (c6212 == null) {
            c6212 = new C6212();
            threadLocal.set(c6212);
        }
        this.f3209.m29700().m19163(c6212, this.f3208);
        return c6212;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public short m25402() {
        return m25401().m19141();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Typeface m25403() {
        return this.f3209.m29703();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m25404() {
        return m25401().m19142();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m25405() {
        return m25401().m19138();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m25406() {
        return (this.f23869 & 4) > 0;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m25407() {
        if (m25406()) {
            this.f23869 = 4;
        } else {
            this.f23869 = 0;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m25408(boolean z) {
        int iM25398 = m25398();
        if (z) {
            this.f23869 = iM25398 | 4;
        } else {
            this.f23869 = iM25398;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m25409(boolean z) {
        int i = this.f23869 & 4;
        this.f23869 = z ? i | 2 : i | 1;
    }
}
