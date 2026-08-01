package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p031c4.AbstractC1322h;
import p031c4.C1323i;
import p044d4.C1874b;
import p278t3.AbstractC8105h;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647f {

    /* JADX INFO: renamed from: a */
    public final C1874b f1920a;

    /* JADX INFO: renamed from: b */
    public final char[] f1921b;

    /* JADX INFO: renamed from: c */
    public final a f1922c = new a(1024);

    /* JADX INFO: renamed from: d */
    public final Typeface f1923d;

    public C0647f(Typeface typeface, C1874b c1874b) {
        this.f1923d = typeface;
        this.f1920a = c1874b;
        this.f1921b = new char[c1874b.m6651k() * 2];
        m2571a(c1874b);
    }

    /* JADX INFO: renamed from: b */
    public static C0647f m2570b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            AbstractC8105h.m31324a("EmojiCompat.MetadataRepo.create");
            return new C0647f(typeface, AbstractC1322h.m5306b(byteBuffer));
        } finally {
            AbstractC8105h.m31325b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2571a(C1874b c1874b) {
        int iM6651k = c1874b.m6651k();
        for (int i10 = 0; i10 < iM6651k; i10++) {
            C1323i c1323i = new C1323i(this, i10);
            Character.toChars(c1323i.m5318f(), this.f1921b, i10 * 2);
            m2577h(c1323i);
        }
    }

    /* JADX INFO: renamed from: c */
    public char[] m2572c() {
        return this.f1921b;
    }

    /* JADX INFO: renamed from: d */
    public C1874b m2573d() {
        return this.f1920a;
    }

    /* JADX INFO: renamed from: e */
    public int m2574e() {
        return this.f1920a.m6652l();
    }

    /* JADX INFO: renamed from: f */
    public a m2575f() {
        return this.f1922c;
    }

    /* JADX INFO: renamed from: g */
    public Typeface m2576g() {
        return this.f1923d;
    }

    /* JADX INFO: renamed from: h */
    public void m2577h(C1323i c1323i) {
        AbstractC9170c.m35615d(c1323i, "emoji metadata cannot be null");
        AbstractC9170c.m35612a(c1323i.m5315c() > 0, "invalid metadata codepoint length");
        this.f1922c.m2580c(c1323i, 0, c1323i.m5315c() - 1);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final SparseArray f1924a;

        /* JADX INFO: renamed from: b */
        public C1323i f1925b;

        public a(int i10) {
            this.f1924a = new SparseArray(i10);
        }

        /* JADX INFO: renamed from: a */
        public a m2578a(int i10) {
            SparseArray sparseArray = this.f1924a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        /* JADX INFO: renamed from: b */
        public final C1323i m2579b() {
            return this.f1925b;
        }

        /* JADX INFO: renamed from: c */
        public void m2580c(C1323i c1323i, int i10, int i11) {
            a aVarM2578a = m2578a(c1323i.m5314b(i10));
            if (aVarM2578a == null) {
                aVarM2578a = new a();
                this.f1924a.put(c1323i.m5314b(i10), aVarM2578a);
            }
            if (i11 > i10) {
                aVarM2578a.m2580c(c1323i, i10 + 1, i11);
            } else {
                aVarM2578a.f1925b = c1323i;
            }
        }

        public a() {
            this(1);
        }
    }
}
