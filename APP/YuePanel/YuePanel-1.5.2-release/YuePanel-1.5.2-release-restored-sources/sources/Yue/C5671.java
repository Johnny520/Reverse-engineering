package Yue;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public final class C5671 implements Comparable<C5671> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f13971 = 255;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f13973;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f13974;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f13975;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f13976;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0835 f13970 = new C0835(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C5671 f13972 = C5672.m2361();

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۧۨ$ۥ */
    public static final class C0835 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۦۧۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0835(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0835() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5671(int i, int i2, int i3) {
        this.f13973 = i;
        this.f13974 = i2;
        this.f13975 = i3;
        this.f13976 = m17578(i, i2, i3);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        C5671 c5671 = obj instanceof C5671 ? (C5671) obj : null;
        return c5671 != null && this.f13976 == c5671.f13976;
    }

    public int hashCode() {
        return this.f13976;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:int:IGET), (wrap:char:SGET), (wrap:int:IGET), (wrap:char:SGET), (wrap:int:IGET) */
    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13973);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13974);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13975);
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC6399 C5671 c5671) {
        C5499.m17103(c5671, "other");
        return this.f13976 - c5671.f13976;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m17573() {
        return this.f13973;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m17574() {
        return this.f13974;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m17575() {
        return this.f13975;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m17576(int i, int i2) {
        int i3 = this.f13973;
        return i3 > i || (i3 == i && this.f13974 >= i2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m17577(int i, int i2, int i3) {
        int i4;
        int i5 = this.f13973;
        return i5 > i || (i5 == i && ((i4 = this.f13974) > i2 || (i4 == i2 && this.f13975 >= i3)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int m17578(int i, int i2, int i3) {
        if (new C5458(0, 255).m16971(i) && new C5458(0, 255).m16971(i2) && new C5458(0, 255).m16971(i3)) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i3).toString());
    }

    public C5671(int i, int i2) {
        this(i, i2, 0);
    }
}
