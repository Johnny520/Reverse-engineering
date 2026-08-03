package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;
    private final byte[] typePathContainer;
    private final int typePathOffset;

    public TypePath(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.typePathContainer = r1
            r0.typePathOffset = r2
            return
    }

    public static bsh.org.objectweb.asm.TypePath fromString(java.lang.String r8) {
            if (r8 == 0) goto L79
            int r0 = r8.length()
            if (r0 != 0) goto La
            goto L79
        La:
            int r0 = r8.length()
            bsh.org.objectweb.asm.ByteVector r1 = new bsh.org.objectweb.asm.ByteVector
            r1.<init>(r0)
            r2 = 0
            r1.putByte(r2)
            r3 = r2
        L18:
            r4 = 2
            if (r3 >= r0) goto L6b
            int r5 = r3 + 1
            char r3 = r8.charAt(r3)
            r6 = 91
            if (r3 != r6) goto L29
            r1.put11(r2, r2)
            goto L39
        L29:
            r6 = 46
            if (r3 != r6) goto L32
            r3 = 1
            r1.put11(r3, r2)
            goto L39
        L32:
            r6 = 42
            if (r3 != r6) goto L3b
            r1.put11(r4, r2)
        L39:
            r3 = r5
            goto L18
        L3b:
            r4 = 48
            if (r3 < r4) goto L67
            r6 = 57
            if (r3 > r6) goto L67
            int r3 = r3 + (-48)
        L45:
            if (r5 >= r0) goto L62
            int r7 = r5 + 1
            char r5 = r8.charAt(r5)
            if (r5 < r4) goto L57
            if (r5 > r6) goto L57
            int r3 = r3 * 10
            int r3 = r3 + r5
            int r3 = r3 - r4
            r5 = r7
            goto L45
        L57:
            r4 = 59
            if (r5 != r4) goto L5d
            r5 = r7
            goto L62
        L5d:
            j8.o.o()
        L60:
            r8 = 0
            return r8
        L62:
            r4 = 3
            r1.put11(r4, r3)
            goto L39
        L67:
            j8.o.o()
            goto L60
        L6b:
            byte[] r8 = r1.data
            int r0 = r1.length
            int r0 = r0 / r4
            byte r0 = (byte) r0
            r8[r2] = r0
            bsh.org.objectweb.asm.TypePath r0 = new bsh.org.objectweb.asm.TypePath
            r0.<init>(r8, r2)
            return r0
        L79:
            r8 = 0
            return r8
    }

    public static void put(bsh.org.objectweb.asm.TypePath r2, bsh.org.objectweb.asm.ByteVector r3) {
            if (r2 != 0) goto L7
            r2 = 0
            r3.putByte(r2)
            return
        L7:
            byte[] r0 = r2.typePathContainer
            int r2 = r2.typePathOffset
            r1 = r0[r2]
            int r1 = r1 * 2
            int r1 = r1 + 1
            r3.putByteArray(r0, r2, r1)
            return
    }

    public int getLength() {
            r2 = this;
            byte[] r0 = r2.typePathContainer
            int r1 = r2.typePathOffset
            r0 = r0[r1]
            return r0
    }

    public int getStep(int r5) {
            r4 = this;
            byte[] r0 = r4.typePathContainer
            int r1 = r4.typePathOffset
            r2 = 2
            r3 = 1
            int r5 = p.a.g(r5, r2, r1, r3)
            r5 = r0[r5]
            return r5
    }

    public int getStepArgument(int r4) {
            r3 = this;
            byte[] r0 = r3.typePathContainer
            int r1 = r3.typePathOffset
            r2 = 2
            int r4 = p.a.g(r4, r2, r1, r2)
            r4 = r0[r4]
            return r4
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.getLength()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 2
            r1.<init>(r2)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L44
            int r3 = r5.getStep(r2)
            if (r3 == 0) goto L3c
            r4 = 1
            if (r3 == r4) goto L36
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 3
            if (r3 != r4) goto L2a
            int r3 = r5.getStepArgument(r2)
            r1.append(r3)
            r3 = 59
            r1.append(r3)
            goto L41
        L2a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L30:
            r3 = 42
            r1.append(r3)
            goto L41
        L36:
            r3 = 46
            r1.append(r3)
            goto L41
        L3c:
            r3 = 91
            r1.append(r3)
        L41:
            int r2 = r2 + 1
            goto Lc
        L44:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
