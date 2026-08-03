package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4368 implements InterfaceC7326<C5458> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final CharSequence f842;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f843;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f8935;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<CharSequence, Integer, C6599<Integer, Integer>> f8936;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨۢ$ۥ */
    public static final class C0391 implements Iterator<C5458>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f8937 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f8938;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f8939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6489
        public C5458 f8940;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f8941;

        public C0391() {
            int iM21675 = C7007.m21675(C4368.this.f843, 0, C4368.this.f842.length());
            this.f8938 = iM21675;
            this.f8939 = iM21675;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void m1326() {
            C6599 c6599;
            if (this.f8939 < 0) {
                this.f8937 = 0;
                this.f8940 = null;
                return;
            }
            if (C4368.this.f8935 > 0) {
                int i = this.f8941 + 1;
                this.f8941 = i;
                if (i >= C4368.this.f8935) {
                    this.f8940 = new C5458(this.f8938, C7628.m24048(C4368.this.f842));
                    this.f8939 = -1;
                } else if (this.f8939 <= C4368.this.f842.length() && (c6599 = (C6599) C4368.this.f8936.invoke(C4368.this.f842, Integer.valueOf(this.f8939))) != null) {
                    int iIntValue = ((Number) c6599.m3062()).intValue();
                    int iIntValue2 = ((Number) c6599.m3063()).intValue();
                    this.f8940 = C7007.m21793(this.f8938, iIntValue);
                    int i2 = iIntValue + iIntValue2;
                    this.f8938 = i2;
                    this.f8939 = i2 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f8940 = new C5458(this.f8938, C7628.m24048(C4368.this.f842));
                    this.f8939 = -1;
                }
            }
            this.f8937 = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8937 == -1) {
                m1326();
            }
            return this.f8937 == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m1327() {
            return this.f8941;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m12629() {
            return this.f8938;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C5458 m12630() {
            return this.f8940;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int m12631() {
            return this.f8939;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m12632() {
            return this.f8937;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5458 next() {
            if (this.f8937 == -1) {
                m1326();
            }
            if (this.f8937 == 0) {
                throw new NoSuchElementException();
            }
            C5458 c5458 = this.f8940;
            C5499.m17101(c5458, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f8940 = null;
            this.f8937 = -1;
            return c5458;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m12634(int i) {
            this.f8941 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m12635(int i) {
            this.f8938 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m12636(@InterfaceC6489 C5458 c5458) {
            this.f8940 = c5458;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m12637(int i) {
            this.f8939 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m12638(int i) {
            this.f8937 = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.CharSequence, ? super java.lang.Integer, Yue.ۥۣۡۦ۠<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4368(@InterfaceC6399 CharSequence charSequence, int i, int i2, @InterfaceC6399 InterfaceC5138<? super CharSequence, ? super Integer, C6599<Integer, Integer>> interfaceC5138) {
        C5499.m17103(charSequence, "input");
        C5499.m17103(interfaceC5138, "getNextMatch");
        this.f842 = charSequence;
        this.f843 = i;
        this.f8935 = i2;
        this.f8936 = interfaceC5138;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<C5458> iterator() {
        return new C0391();
    }
}
