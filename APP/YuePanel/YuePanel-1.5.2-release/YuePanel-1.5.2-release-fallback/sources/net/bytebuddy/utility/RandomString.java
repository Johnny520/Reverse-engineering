package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public class RandomString {
    public static final int DEFAULT_LENGTH = 8;
    private static final int KEY_BITS = 0;
    private static final char[] SYMBOL = null;
    private final int length;
    private final java.util.Random random;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 48
        L7:
            r2 = 57
            if (r1 > r2) goto L12
            r0.append(r1)
            int r1 = r1 + 1
            char r1 = (char) r1
            goto L7
        L12:
            r1 = 97
        L14:
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 > r2) goto L1f
            r0.append(r1)
            int r1 = r1 + 1
            char r1 = (char) r1
            goto L14
        L1f:
            r1 = 65
        L21:
            r2 = 90
            if (r1 > r2) goto L2c
            r0.append(r1)
            int r1 = r1 + 1
            char r1 = (char) r1
            goto L21
        L2c:
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            net.bytebuddy.utility.RandomString.SYMBOL = r0
            int r1 = r0.length
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            int r0 = r0.length
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 != r1) goto L46
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            int r1 = r1 - r0
            net.bytebuddy.utility.RandomString.KEY_BITS = r1
            return
    }

    public RandomString() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public RandomString(int r2) {
            r1 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public RandomString(int r1, java.util.Random r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto La
            r0.length = r1
            r0.random = r2
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "A random string's length cannot be zero or negative"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String hashOf(int r8) {
            int r0 = net.bytebuddy.utility.RandomString.KEY_BITS
            r1 = 32
            int r2 = r1 / r0
            int r0 = r1 % r0
            r3 = 0
            if (r0 != 0) goto Ld
            r0 = r3
            goto Le
        Ld:
            r0 = 1
        Le:
            int r2 = r2 + r0
            char[] r0 = new char[r2]
        L11:
            if (r3 >= r2) goto L28
            char[] r4 = net.bytebuddy.utility.RandomString.SYMBOL
            int r5 = net.bytebuddy.utility.RandomString.KEY_BITS
            int r6 = r3 * r5
            int r6 = r8 >>> r6
            r7 = -1
            int r5 = 32 - r5
            int r5 = r7 >>> r5
            r5 = r5 & r6
            char r4 = r4[r5]
            r0[r3] = r4
            int r3 = r3 + 1
            goto L11
        L28:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public static java.lang.String hashOf(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L11
        L4:
            java.lang.Class r0 = r1.getClass()
            int r0 = r0.hashCode()
            int r1 = java.lang.System.identityHashCode(r1)
            r1 = r1 ^ r0
        L11:
            java.lang.String r1 = hashOf(r1)
            return r1
    }

    public static java.lang.String make() {
            r0 = 8
            java.lang.String r0 = make(r0)
            return r0
    }

    public static java.lang.String make(int r1) {
            net.bytebuddy.utility.RandomString r0 = new net.bytebuddy.utility.RandomString
            r0.<init>(r1)
            java.lang.String r1 = r0.nextString()
            return r1
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Random value is used on each invocation.", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
    public java.lang.String nextString() {
            r5 = this;
            int r0 = r5.length
            char[] r0 = new char[r0]
            r1 = 0
        L5:
            int r2 = r5.length
            if (r1 >= r2) goto L19
            char[] r2 = net.bytebuddy.utility.RandomString.SYMBOL
            java.util.Random r3 = r5.random
            int r4 = r2.length
            int r3 = r3.nextInt(r4)
            char r2 = r2[r3]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        L19:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }
}
