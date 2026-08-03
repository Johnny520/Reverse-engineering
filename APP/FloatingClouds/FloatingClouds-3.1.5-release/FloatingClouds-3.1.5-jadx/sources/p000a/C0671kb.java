package p000a;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a.kb */
/* JADX INFO: loaded from: classes.dex */
public final class C0671kb {

    /* JADX INFO: renamed from: a */
    public final C0652jb f2505a;

    /* JADX INFO: renamed from: b */
    public final char[] f2506b;

    /* JADX INFO: renamed from: c */
    public final a f2507c = new a(1024);

    /* JADX INFO: renamed from: d */
    public final Typeface f2508d;

    /* JADX INFO: renamed from: a.kb$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final SparseArray<a> f2509a;

        /* JADX INFO: renamed from: b */
        public C0359Tf f2510b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m1542a(C0359Tf c0359Tf, int i, int i2) {
            int iM971a = c0359Tf.m971a(i);
            SparseArray<a> sparseArray = this.f2509a;
            a aVar = sparseArray == null ? null : sparseArray.get(iM971a);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(c0359Tf.m971a(i), aVar);
            }
            if (i2 > i) {
                aVar.m1542a(c0359Tf, i + 1, i2);
            } else {
                aVar.f2510b = c0359Tf;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i) {
            this.f2509a = new SparseArray<>(i);
        }
    }

    public C0671kb(Typeface typeface, C0652jb c0652jb) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f2508d = typeface;
        this.f2505a = c0652jb;
        int iM849a = c0652jb.m849a(6);
        if (iM849a != 0) {
            int i5 = iM849a + c0652jb.f1102a;
            i = ((ByteBuffer) c0652jb.f1105d).getInt(((ByteBuffer) c0652jb.f1105d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f2506b = new char[i * 2];
        int iM849a2 = c0652jb.m849a(6);
        if (iM849a2 != 0) {
            int i6 = iM849a2 + c0652jb.f1102a;
            i2 = ((ByteBuffer) c0652jb.f1105d).getInt(((ByteBuffer) c0652jb.f1105d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C0359Tf c0359Tf = new C0359Tf(this, i7);
            C0633ib c0633ibM972b = c0359Tf.m972b();
            int iM849a3 = c0633ibM972b.m849a(4);
            Character.toChars(iM849a3 != 0 ? ((ByteBuffer) c0633ibM972b.f1105d).getInt(iM849a3 + c0633ibM972b.f1102a) : 0, this.f2506b, i7 * 2);
            C0633ib c0633ibM972b2 = c0359Tf.m972b();
            int iM849a4 = c0633ibM972b2.m849a(16);
            if (iM849a4 != 0) {
                int i8 = iM849a4 + c0633ibM972b2.f1102a;
                i3 = ((ByteBuffer) c0633ibM972b2.f1105d).getInt(((ByteBuffer) c0633ibM972b2.f1105d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            C0726n9.m1663f("invalid metadata codepoint length", i3 > 0);
            C0633ib c0633ibM972b3 = c0359Tf.m972b();
            int iM849a5 = c0633ibM972b3.m849a(16);
            if (iM849a5 != 0) {
                int i9 = iM849a5 + c0633ibM972b3.f1102a;
                i4 = ((ByteBuffer) c0633ibM972b3.f1105d).getInt(((ByteBuffer) c0633ibM972b3.f1105d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            this.f2507c.m1542a(c0359Tf, 0, i4 - 1);
        }
    }
}
