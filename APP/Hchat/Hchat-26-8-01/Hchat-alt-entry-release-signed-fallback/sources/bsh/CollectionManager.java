package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionManager {
    private static final bsh.CollectionManager manager = null;
    private static final int[] unicodeBlockStarts = null;



    static {
            bsh.CollectionManager r0 = new bsh.CollectionManager
            r0.<init>()
            bsh.CollectionManager.manager = r0
            r0 = 281(0x119, float:3.94E-43)
            int[] r0 = new int[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 58, 65, 91, 97, 123, 129, 256, 384, 592, 688, 768, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, 2048, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, 4352, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, 56320, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, 131072, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576} // fill-array
            bsh.CollectionManager.unicodeBlockStarts = r0
            return
    }

    public CollectionManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int a(int r0, int r1) {
            int r0 = lambda$getBshIterator$0(r0, r1)
            return r0
    }

    private java.util.Iterator<java.lang.Object> arrayIt(java.lang.Object r2) {
            r1 = this;
            bsh.CollectionManager$2 r0 = new bsh.CollectionManager$2
            r0.<init>(r1, r2)
            return r0
    }

    private <T> java.util.Iterator<T> emptyIt() {
            r1 = this;
            bsh.CollectionManager$1 r0 = new bsh.CollectionManager$1
            r0.<init>(r1)
            return r0
    }

    public static synchronized bsh.CollectionManager getCollectionManager() {
            java.lang.Class<bsh.CollectionManager> r0 = bsh.CollectionManager.class
            monitor-enter(r0)
            bsh.CollectionManager r1 = bsh.CollectionManager.manager     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static /* synthetic */ int lambda$getBshIterator$0(int r0, int r1) {
            int r0 = r0 - r1
            return r0
    }

    private java.util.stream.Stream<java.lang.String> reflectNames(java.lang.Object r6) {
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            boolean r1 = r6 instanceof java.lang.Class
            if (r1 == 0) goto Lb
            r0 = r6
            java.lang.Class r0 = (java.lang.Class) r0
        Lb:
            boolean r1 = r6 instanceof bsh.ClassIdentifier
            if (r1 == 0) goto L15
            bsh.ClassIdentifier r6 = (bsh.ClassIdentifier) r6
            java.lang.Class r0 = r6.getTargetClass()
        L15:
            boolean r6 = bsh.Reflect.isGeneratedClass(r0)
            java.lang.String r1 = "}"
            if (r6 == 0) goto L6e
            java.lang.String r6 = bsh.StringUtil.classString(r0)
            java.util.stream.Stream r6 = java.util.stream.Stream.of(r6)
            bsh.Variable[] r2 = bsh.Reflect.getDeclaredVariables(r0)
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            bsh.b r3 = new bsh.b
            r4 = 4
            r3.<init>(r4)
            java.util.stream.Stream r2 = r2.map(r3)
            bsh.b r3 = new bsh.b
            r4 = 5
            r3.<init>(r4)
            java.util.stream.Stream r2 = r2.map(r3)
            bsh.BshMethod[] r0 = bsh.Reflect.getDeclaredMethods(r0)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            bsh.b r3 = new bsh.b
            r4 = 6
            r3.<init>(r4)
            java.util.stream.Stream r0 = r0.map(r3)
            bsh.b r3 = new bsh.b
            r4 = 5
            r3.<init>(r4)
            java.util.stream.Stream r0 = r0.map(r3)
            java.util.stream.Stream r0 = java.util.stream.Stream.concat(r2, r0)
            java.util.stream.Stream r6 = java.util.stream.Stream.concat(r6, r0)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r1)
            java.util.stream.Stream r6 = java.util.stream.Stream.concat(r6, r0)
            return r6
        L6e:
            java.lang.String r6 = bsh.StringUtil.classString(r0)
            java.util.stream.Stream r6 = java.util.stream.Stream.of(r6)
            java.lang.reflect.Field[] r2 = r0.getFields()
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            bsh.b r3 = new bsh.b
            r4 = 7
            r3.<init>(r4)
            java.util.stream.Stream r2 = r2.map(r3)
            bsh.b r3 = new bsh.b
            r4 = 5
            r3.<init>(r4)
            java.util.stream.Stream r2 = r2.map(r3)
            java.lang.reflect.Method[] r0 = r0.getMethods()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            bsh.b r3 = new bsh.b
            r4 = 8
            r3.<init>(r4)
            java.util.stream.Stream r0 = r0.map(r3)
            bsh.b r3 = new bsh.b
            r4 = 5
            r3.<init>(r4)
            java.util.stream.Stream r0 = r0.map(r3)
            java.util.stream.Stream r0 = java.util.stream.Stream.concat(r2, r0)
            java.util.stream.Stream r6 = java.util.stream.Stream.concat(r6, r0)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r1)
            java.util.stream.Stream r6 = java.util.stream.Stream.concat(r6, r0)
            return r6
    }

    public java.util.Iterator<java.lang.Object> getBshIterator(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            char[] r1 = r1.toCharArray()
            java.util.Iterator r1 = r0.arrayIt(r1)
            return r1
    }

    public java.util.Iterator<java.lang.String> getBshIterator(java.lang.Character r7) {
            r6 = this;
            char r7 = r7.charValue()
            int[] r0 = bsh.CollectionManager.unicodeBlockStarts
            int r1 = r0.length
            r2 = 33
            r3 = 0
            r4 = r3
        Lb:
            if (r3 >= r1) goto L16
            r5 = r0[r3]
            if (r2 > r7) goto L16
            int r3 = r3 + 1
            r4 = r2
            r2 = r5
            goto Lb
        L16:
            java.util.stream.IntStream r7 = java.util.stream.IntStream.rangeClosed(r4, r7)
            java.util.stream.Stream r7 = r7.boxed()
            bsh.b r0 = new bsh.b
            r1 = 9
            r0.<init>(r1)
            java.util.stream.Stream r7 = r7.map(r0)
            bsh.b r0 = new bsh.b
            r1 = 10
            r0.<init>(r1)
            java.util.stream.Stream r7 = r7.map(r0)
            java.util.Iterator r7 = r7.iterator()
            return r7
    }

    public <T> java.util.Iterator<T> getBshIterator(java.lang.Iterable<T> r1) {
            r0 = this;
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    public java.util.Iterator<java.lang.Integer> getBshIterator(java.lang.Number r3) {
            r2 = this;
            int r3 = r3.intValue()
            if (r3 != 0) goto Lb
            java.util.Iterator r3 = r2.emptyIt()
            return r3
        Lb:
            r0 = 0
            if (r3 <= 0) goto L17
            java.util.stream.IntStream r3 = java.util.stream.IntStream.rangeClosed(r0, r3)
            java.util.PrimitiveIterator$OfInt r3 = r3.iterator()
            return r3
        L17:
            java.util.stream.IntStream r0 = java.util.stream.IntStream.rangeClosed(r3, r0)
            bsh.g r1 = new bsh.g
            r1.<init>(r3)
            java.util.stream.IntStream r3 = r0.map(r1)
            java.util.PrimitiveIterator$OfInt r3 = r3.iterator()
            return r3
    }

    public java.util.Iterator<?> getBshIterator(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            java.util.Iterator r2 = r1.emptyIt()
            return r2
        L7:
            boolean r0 = r2 instanceof bsh.Primitive
            if (r0 == 0) goto L14
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L14:
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L23
            java.util.Iterator r2 = r1.arrayIt(r2)
            return r2
        L23:
            boolean r0 = r2 instanceof java.lang.Iterable
            if (r0 == 0) goto L2e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L2e:
            boolean r0 = r2 instanceof java.util.Iterator
            if (r0 == 0) goto L39
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L39:
            boolean r0 = r2 instanceof java.util.Enumeration
            if (r0 == 0) goto L44
            java.util.Enumeration r2 = (java.util.Enumeration) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L44:
            boolean r0 = r2 instanceof java.lang.CharSequence
            if (r0 == 0) goto L4f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L4f:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L5a
            java.lang.Number r2 = (java.lang.Number) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L5a:
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 == 0) goto L65
            java.lang.Character r2 = (java.lang.Character) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L65:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L70
            java.lang.String r2 = (java.lang.String) r2
            java.util.Iterator r2 = r1.getBshIterator(r2)
            return r2
        L70:
            java.util.stream.Stream r2 = r1.reflectNames(r2)
            java.util.Iterator r2 = r2.iterator()
            return r2
    }

    public java.util.Iterator<java.lang.Object> getBshIterator(java.lang.String r1) {
            r0 = this;
            char[] r1 = r1.toCharArray()
            java.util.Iterator r1 = r0.arrayIt(r1)
            return r1
    }

    public <T> java.util.Iterator<T> getBshIterator(java.util.Enumeration<T> r1) {
            r0 = this;
            java.util.ArrayList r1 = java.util.Collections.list(r1)
            java.util.Iterator r1 = r1.iterator()
            return r1
    }

    public <T> java.util.Iterator<T> getBshIterator(java.util.Iterator<T> r1) {
            r0 = this;
            return r1
    }

    public <T> java.util.Iterator<T> getBshIterator(T[] r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.Iterator r1 = r1.iterator()
            return r1
    }
}
