package p001;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ۟.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0276k1 implements InterfaceC0483z9<C0223g4> {

    /* JADX INFO: renamed from: ۥ */
    public final CharSequence f897;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f898;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f1615;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final InterfaceC0236h3<CharSequence, Integer, C0364q7<Integer, Integer>> f1616;

    /* JADX INFO: renamed from: ۟.k1$a */
    public static final class a implements Iterator<C0223g4>, InterfaceC0321n4 {

        /* JADX INFO: renamed from: ۥ */
        public int f899 = -1;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f900;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1617;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public C0223g4 f1618;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public int f1619;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            int i = C0276k1.this.f898;
            int length = C0276k1.this.f897.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.f900 = i;
                this.f1617 = i;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f899 == -1) {
                m878();
            }
            return this.f899 == 1;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final C0223g4 next() {
            if (this.f899 == -1) {
                m878();
            }
            if (this.f899 == 0) {
                throw new NoSuchElementException();
            }
            C0223g4 c0223g4 = this.f1618;
            C0237h4.m1088("null cannot be cast to non-null type kotlin.ranges.IntRange", c0223g4);
            this.f1618 = null;
            this.f899 = -1;
            return c0223g4;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m878() {
            C0223g4 c0223g4;
            int i = this.f1617;
            if (i < 0) {
                this.f899 = 0;
                this.f1618 = null;
                return;
            }
            C0276k1 c0276k1 = C0276k1.this;
            int i2 = c0276k1.f1615;
            if (i2 > 0) {
                int i3 = this.f1619 + 1;
                this.f1619 = i3;
                if (i3 < i2) {
                    if (i > c0276k1.f897.length()) {
                        c0223g4 = new C0223g4(this.f900, C0432va.m1254(C0276k1.this.f897));
                    } else {
                        C0276k1 c0276k12 = C0276k1.this;
                        C0364q7<Integer, Integer> c0364q7Mo863 = c0276k12.f1616.mo863(c0276k12.f897, Integer.valueOf(this.f1617));
                        if (c0364q7Mo863 == null) {
                            c0223g4 = new C0223g4(this.f900, C0432va.m1254(C0276k1.this.f897));
                        } else {
                            int iIntValue = c0364q7Mo863.f1045.intValue();
                            int iIntValue2 = c0364q7Mo863.f1046.intValue();
                            this.f1618 = iIntValue <= Integer.MIN_VALUE ? C0223g4.f1471 : new C0223g4(this.f900, iIntValue - 1);
                            int i4 = iIntValue + iIntValue2;
                            this.f900 = i4;
                            this.f1617 = i4 + (iIntValue2 == 0 ? 1 : 0);
                        }
                    }
                    this.f1618 = c0223g4;
                    this.f1617 = -1;
                }
            }
            this.f899 = 1;
        }
    }

    public C0276k1(CharSequence charSequence, int i, int i2, C0419ua c0419ua) {
        C0237h4.m1090("input", charSequence);
        this.f897 = charSequence;
        this.f898 = i;
        this.f1615 = i2;
        this.f1616 = c0419ua;
    }

    @Override // p001.InterfaceC0483z9
    public final Iterator<C0223g4> iterator() {
        return new a();
    }
}
