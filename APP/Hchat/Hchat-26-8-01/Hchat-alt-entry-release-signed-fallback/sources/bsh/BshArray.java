package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshArray {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class SteppedSubList extends java.util.AbstractList<java.lang.Object> implements java.util.RandomAccess {
        private final java.util.List<java.lang.Object> parent;
        private final java.util.List<java.lang.Integer> steps;


        public SteppedSubList(java.util.List<java.lang.Object> r1, java.util.List<java.lang.Integer> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.steps = r2
                return
        }

        public static /* bridge */ /* synthetic */ java.util.List a(bsh.BshArray.SteppedSubList r0) {
                java.util.List<java.lang.Integer> r0 = r0.steps
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int r4, java.lang.Object r5) {
                r3 = this;
                int r0 = r3.size()
                java.util.List<java.lang.Integer> r1 = r3.steps
                if (r4 != r0) goto L17
                int r0 = r4 + (-1)
                java.lang.Object r0 = r1.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r0 = r0 + 1
                goto L21
            L17:
                java.lang.Object r0 = r1.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
            L21:
                java.util.List<java.lang.Object> r1 = r3.parent
                r1.add(r0, r5)
                r5 = r4
            L27:
                int r1 = r3.size()
                java.util.List<java.lang.Integer> r2 = r3.steps
                if (r5 >= r1) goto L45
                java.lang.Object r1 = r2.get(r5)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                int r1 = r1 + 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.set(r5, r1)
                int r5 = r5 + 1
                goto L27
            L45:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r2.add(r4, r5)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int r5, java.util.Collection<? extends java.lang.Object> r6) {
                r4 = this;
                java.util.Iterator r6 = r6.iterator()
                r0 = 0
                r1 = r0
            L6:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L18
                java.lang.Object r2 = r6.next()
                int r3 = r1 + 1
                int r1 = r1 + r5
                r4.add(r1, r2)
                r1 = r3
                goto L6
            L18:
                if (r1 <= 0) goto L1c
                r5 = 1
                return r5
            L1c:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(java.util.Collection<? extends java.lang.Object> r2) {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.steps
                int r0 = r0.size()
                boolean r2 = r1.addAll(r0, r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object get(int r3) {
                r2 = this;
                java.util.List<java.lang.Object> r0 = r2.parent
                java.util.List<java.lang.Integer> r1 = r2.steps
                java.lang.Object r3 = r1.get(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<java.lang.Object> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<java.lang.Object> listIterator(int r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<java.lang.Integer> r1 = r2.steps
                r0.<init>(r1)
                java.util.ListIterator r3 = r0.listIterator(r3)
                bsh.BshArray$SteppedSubList$1 r0 = new bsh.BshArray$SteppedSubList$1
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object remove(int r5) {
                r4 = this;
                java.util.List<java.lang.Integer> r0 = r4.steps
                java.lang.Object r0 = r0.get(r5)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                int r1 = r5 + 1
            Le:
                int r2 = r4.size()
                java.util.List<java.lang.Integer> r3 = r4.steps
                if (r1 >= r2) goto L2c
                java.lang.Object r2 = r3.get(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                int r2 = r2 + (-1)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.set(r1, r2)
                int r1 = r1 + 1
                goto Le
            L2c:
                r3.remove(r5)
                java.util.List<java.lang.Object> r5 = r4.parent
                java.lang.Object r5 = r5.remove(r0)
                return r5
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Object set(int r3, java.lang.Object r4) {
                r2 = this;
                java.util.List<java.lang.Object> r0 = r2.parent
                java.util.List<java.lang.Integer> r1 = r2.steps
                java.lang.Object r3 = r1.get(r3)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                java.lang.Object r3 = r0.set(r3, r4)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.steps
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<java.lang.Object> subList(int r4, int r5) {
                r3 = this;
                bsh.BshArray$SteppedSubList r0 = new bsh.BshArray$SteppedSubList
                java.util.List<java.lang.Object> r1 = r3.parent
                java.util.List<java.lang.Integer> r2 = r3.steps
                java.util.List r4 = r2.subList(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }
    }

    private BshArray() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ int a(int r0) {
            int r0 = lambda$castArray$0(r0)
            return r0
    }

    public static java.lang.Object castArray(java.lang.Class<?> r10, java.lang.Class<?> r11, java.lang.Object r12) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r10)
            r1 = 0
            if (r0 == 0) goto L78
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r0.isAssignableFrom(r10)
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 != 0) goto L48
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            if (r0 != r10) goto L18
            goto L48
        L18:
            java.lang.Class<java.util.ArrayDeque> r0 = java.util.ArrayDeque.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L30
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            java.lang.Object r11 = bsh.Types.castObject(r12, r2, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.util.List r11 = java.util.Arrays.asList(r11)
            r10.<init>(r11)
            return r10
        L30:
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L78
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            java.lang.Object r11 = bsh.Types.castObject(r12, r2, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.util.List r11 = java.util.Arrays.asList(r11)
            r10.<init>(r11)
            return r10
        L48:
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L60
            java.util.ArrayList r10 = new java.util.ArrayList
            java.lang.Object r11 = bsh.Types.castObject(r12, r2, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.util.List r11 = java.util.Arrays.asList(r11)
            r10.<init>(r11)
            return r10
        L60:
            java.lang.Class<java.util.LinkedList> r0 = java.util.LinkedList.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L78
            java.util.LinkedList r10 = new java.util.LinkedList
            java.lang.Object r11 = bsh.Types.castObject(r12, r2, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.util.List r11 = java.util.Arrays.asList(r11)
            r10.<init>(r11)
            return r10
        L78:
            java.lang.Class r11 = bsh.Types.arrayElementType(r11)
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r10)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = 0
            r6 = 0
            java.lang.Class<java.util.Map$Entry> r7 = java.util.Map.Entry.class
            if (r0 == 0) goto Lc8
            boolean r0 = r7.isAssignableFrom(r11)
            if (r0 == 0) goto L98
            java.util.Map$Entry[] r12 = (java.util.Map.Entry[]) r12
            java.util.Map r10 = mapOfEntries(r12)
            return r10
        L98:
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto Lc8
            int r10 = java.lang.reflect.Array.getLength(r12)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            double r7 = (double) r10
            double r7 = r7 + r4
            double r7 = r7 / r2
            double r2 = java.lang.Math.ceil(r7)
            int r0 = (int) r2
            r11.<init>(r0)
        Lb1:
            if (r1 >= r10) goto Lc7
            java.lang.Object r0 = java.lang.reflect.Array.get(r12, r1)
            int r2 = r1 + 1
            if (r2 >= r10) goto Lc0
            java.lang.Object r2 = java.lang.reflect.Array.get(r12, r2)
            goto Lc1
        Lc0:
            r2 = r6
        Lc1:
            r11.put(r0, r2)
            int r1 = r1 + 2
            goto Lb1
        Lc7:
            return r11
        Lc8:
            int[] r0 = dimensions(r12)
            r8 = r0[r1]
            if (r8 != 0) goto Ld5
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r0)
            return r10
        Ld5:
            bsh.c r9 = new bsh.c
            r9.<init>(r8)
            java.lang.Class r11 = commonType(r11, r12, r9)
            boolean r9 = r7.isAssignableFrom(r10)
            if (r9 == 0) goto L144
            boolean r10 = r7.isAssignableFrom(r11)
            if (r10 == 0) goto Lfd
            java.lang.Class<bsh.Types$MapEntry> r10 = bsh.Types.MapEntry.class
            if (r10 == r11) goto Lef
            return r12
        Lef:
            int r10 = java.lang.reflect.Array.getLength(r12)
            java.util.Map$Entry[] r10 = new java.util.Map.Entry[r10]
            java.lang.Object[] r11 = new java.lang.Object[]{r12}
            copy(r7, r10, r11)
            return r10
        Lfd:
            r10 = 1
            if (r8 != r10) goto L10a
            bsh.Types$MapEntry r10 = new bsh.Types$MapEntry
            java.lang.Object r11 = java.lang.reflect.Array.get(r12, r1)
            r10.<init>(r11, r6)
            return r10
        L10a:
            r11 = 2
            if (r8 != r11) goto L11b
            bsh.Types$MapEntry r11 = new bsh.Types$MapEntry
            java.lang.Object r0 = java.lang.reflect.Array.get(r12, r1)
            java.lang.Object r10 = java.lang.reflect.Array.get(r12, r10)
            r11.<init>(r0, r10)
            return r11
        L11b:
            double r10 = (double) r8
            double r10 = r10 + r4
            double r10 = r10 / r2
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            java.util.Map$Entry[] r10 = new java.util.Map.Entry[r10]
            r11 = r1
        L126:
            if (r1 >= r8) goto L143
            int r0 = r11 + 1
            bsh.Types$MapEntry r2 = new bsh.Types$MapEntry
            java.lang.Object r3 = java.lang.reflect.Array.get(r12, r1)
            int r4 = r1 + 1
            if (r4 >= r8) goto L139
            java.lang.Object r4 = java.lang.reflect.Array.get(r12, r4)
            goto L13a
        L139:
            r4 = r6
        L13a:
            r2.<init>(r3, r4)
            r10[r11] = r2
            int r1 = r1 + 2
            r11 = r0
            goto L126
        L143:
            return r10
        L144:
            java.lang.Class r10 = bsh.Types.arrayElementType(r10)
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r10, r0)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            copy(r10, r11, r12)
            return r11
    }

    public static java.lang.Class<?> commonType(java.lang.Class<?> r5, java.lang.Object r6, java.util.function.IntSupplier r7) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r0 == r5) goto L5
            goto L25
        L5:
            int r7 = r7.getAsInt()
            r1 = 0
            r2 = 0
            r3 = r1
        Lc:
            if (r3 >= r7) goto L20
            java.lang.Object r4 = java.lang.reflect.Array.get(r6, r1)
            java.lang.Class r4 = bsh.Types.getType(r4)
            java.lang.Class r2 = bsh.Types.getCommonType(r2, r4)
            if (r0 != r2) goto L1d
            goto L20
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            if (r2 == 0) goto L25
            if (r2 == r5) goto L25
            return r2
        L25:
            return r5
    }

    public static java.lang.Object concat(java.lang.Object r4, java.lang.Object r5) {
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            int r2 = bsh.Types.arrayDimensions(r0)
            int r3 = bsh.Types.arrayDimensions(r1)
            if (r2 != r3) goto L3a
            java.lang.Class r0 = bsh.Types.arrayElementType(r0)
            java.lang.Class r1 = bsh.Types.arrayElementType(r1)
            java.lang.Class r0 = bsh.Types.getCommonType(r0, r1)
            int[] r1 = dimensions(r4)
            int r2 = java.lang.reflect.Array.getLength(r4)
            int r3 = java.lang.reflect.Array.getLength(r5)
            int r3 = r3 + r2
            r2 = 0
            r1[r2] = r3
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            copy(r0, r1, r4)
            return r1
        L3a:
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.String r4 = bsh.StringUtil.typeString(r4)
            java.lang.String r5 = bsh.StringUtil.typeString(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " with array of type "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.lang.Object concat(java.util.List<?> r1, java.util.List<?> r2) {
            boolean r0 = r1 instanceof java.util.Queue
            if (r0 == 0) goto La
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r1)
            goto Lf
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        Lf:
            r0.addAll(r2)
            return r0
    }

    private static void copy(java.lang.Class<?> r10, java.lang.Object r11, java.lang.Object... r12) {
            r0 = 0
            r1 = r12[r0]
            int r1 = java.lang.reflect.Array.getLength(r1)
            int r2 = r12.length
            r3 = 1
            if (r2 <= r3) goto L10
            int r2 = java.lang.reflect.Array.getLength(r11)
            goto L11
        L10:
            r2 = r1
        L11:
            java.lang.Class r4 = r11.getClass()
            int r4 = bsh.Types.arrayDimensions(r4)
            if (r4 != r3) goto Lba
            r3 = r0
            r4 = r3
            r5 = r4
        L1e:
            if (r3 >= r2) goto L103
            r6 = r12[r4]
            int r7 = r5 + 1
            java.lang.Object r5 = java.lang.reflect.Array.get(r6, r5)
            java.lang.Object r6 = bsh.Types.castObject(r5, r10, r0)     // Catch: bsh.UtilEvalError -> L30
            java.lang.Object r5 = bsh.Primitive.unwrap(r6)     // Catch: bsh.UtilEvalError -> L30
        L30:
            java.lang.Class r6 = java.lang.Byte.TYPE
            if (r6 != r10) goto L3e
            java.lang.Byte r5 = (java.lang.Byte) r5
            byte r5 = r5.byteValue()
            java.lang.reflect.Array.setByte(r11, r3, r5)
            goto La3
        L3e:
            java.lang.Class r6 = java.lang.Short.TYPE
            if (r6 != r10) goto L4c
            java.lang.Short r5 = (java.lang.Short) r5
            short r5 = r5.shortValue()
            java.lang.reflect.Array.setShort(r11, r3, r5)
            goto La3
        L4c:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r6 != r10) goto L5a
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.reflect.Array.setInt(r11, r3, r5)
            goto La3
        L5a:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r6 != r10) goto L68
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.reflect.Array.setLong(r11, r3, r5)
            goto La3
        L68:
            java.lang.Class r6 = java.lang.Float.TYPE
            if (r6 != r10) goto L76
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            java.lang.reflect.Array.setFloat(r11, r3, r5)
            goto La3
        L76:
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r6 != r10) goto L84
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            java.lang.reflect.Array.setDouble(r11, r3, r5)
            goto La3
        L84:
            java.lang.Class r6 = java.lang.Character.TYPE
            if (r6 != r10) goto L92
            java.lang.Character r5 = (java.lang.Character) r5
            char r5 = r5.charValue()
            java.lang.reflect.Array.setChar(r11, r3, r5)
            goto La3
        L92:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            if (r6 != r10) goto La0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.reflect.Array.setBoolean(r11, r3, r5)
            goto La3
        La0:
            java.lang.reflect.Array.set(r11, r3, r5)
        La3:
            if (r1 >= r2) goto Lb5
            if (r7 != r1) goto Lb5
            int r5 = r4 + 1
            int r6 = r12.length
            if (r5 >= r6) goto Lb5
            r1 = r12[r5]
            int r1 = java.lang.reflect.Array.getLength(r1)
            r4 = r5
            r5 = r0
            goto Lb6
        Lb5:
            r5 = r7
        Lb6:
            int r3 = r3 + 1
            goto L1e
        Lba:
            r3 = r0
            r4 = r3
            r5 = r4
        Lbd:
            if (r3 >= r2) goto L103
            if (r1 >= r2) goto Ld0
            if (r4 != r1) goto Ld0
            int r6 = r5 + 1
            int r7 = r12.length
            if (r6 >= r7) goto Ld0
            r1 = r12[r6]
            int r1 = java.lang.reflect.Array.getLength(r1)
            r4 = r0
            r5 = r6
        Ld0:
            r6 = r12[r5]
            int r7 = r4 + 1
            java.lang.Object r4 = java.lang.reflect.Array.get(r6, r4)
            if (r4 != 0) goto Ldf
            r4 = 0
            java.lang.reflect.Array.set(r11, r3, r4)
            goto Lff
        Ldf:
            java.lang.Object r6 = java.lang.reflect.Array.get(r11, r3)
            int r8 = java.lang.reflect.Array.getLength(r4)
            int r9 = java.lang.reflect.Array.getLength(r6)
            if (r8 == r9) goto Lf8
            int[] r6 = dimensions(r4)
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r10, r6)
            java.lang.reflect.Array.set(r11, r3, r6)
        Lf8:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            copy(r10, r6, r4)
        Lff:
            int r3 = r3 + 1
            r4 = r7
            goto Lbd
        L103:
            return
    }

    public static int[] dimensions(java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()
            int r0 = bsh.Types.arrayDimensions(r0)
            int[] r1 = new int[r0]
            if (r0 == 0) goto L28
            int r2 = java.lang.reflect.Array.getLength(r5)
            r3 = 0
            r1[r3] = r2
            if (r2 != 0) goto L16
            goto L28
        L16:
            r2 = 1
        L17:
            if (r2 >= r0) goto L28
            java.lang.Object r5 = java.lang.reflect.Array.get(r5, r3)
            if (r5 == 0) goto L28
            int r4 = java.lang.reflect.Array.getLength(r5)
            r1[r2] = r4
            int r2 = r2 + 1
            goto L17
        L28:
            return r1
    }

    public static java.lang.Object getIndex(java.lang.Object r4, int r5) {
            java.lang.String r0 = ", index="
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "getIndex: "
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4, r0, r1}
            bsh.Interpreter.debug(r0)
            boolean r0 = r4 instanceof java.util.List     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            if (r0 == 0) goto L1d
            r0 = r4
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            java.lang.Object r4 = r0.get(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            return r4
        L1b:
            r0 = move-exception
            goto L2e
        L1d:
            java.lang.Object r0 = java.lang.reflect.Array.get(r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            java.lang.Class r1 = bsh.Types.arrayElementType(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            java.lang.Object r4 = bsh.Primitive.wrap(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1b
            return r4
        L2e:
            boolean r1 = r4 instanceof java.util.List
            if (r1 == 0) goto L39
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            goto L3d
        L39:
            int r4 = java.lang.reflect.Array.getLength(r4)
        L3d:
            bsh.UtilTargetError r1 = new bsh.UtilTargetError
            java.lang.String r2 = "Index "
            java.lang.String r3 = " out-of-bounds for length "
            java.lang.String r4 = p.a.j(r5, r2, r3, r4)
            r1.<init>(r4, r0)
            throw r1
    }

    private static /* synthetic */ int lambda$castArray$0(int r0) {
            return r0
    }

    private static java.util.Map<?, ?> mapOfEntries(java.util.Map.Entry<?, ?>... r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto L8
        L1a:
            return r0
    }

    public static java.lang.Object repeat(java.lang.Object r4, int r5) {
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = bsh.Types.arrayElementType(r0)
            r1 = 1
            r2 = 0
            if (r5 >= r1) goto L11
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r0, r2)
            return r4
        L11:
            int[] r1 = dimensions(r4)
            r3 = r1[r2]
            int r5 = r5 * r3
            r1[r2] = r5
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r1 = r2
        L1f:
            if (r1 >= r5) goto L26
            java.lang.System.arraycopy(r4, r2, r0, r1, r3)
            int r1 = r1 + r3
            goto L1f
        L26:
            return r0
    }

    public static java.lang.Object repeat(java.util.List<java.lang.Object> r3, int r4) {
            r0 = 1
            if (r4 >= r0) goto L14
            boolean r3 = r3 instanceof java.util.Queue
            if (r3 == 0) goto Ld
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            return r3
        Ld:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 0
            r3.<init>(r4)
            return r3
        L14:
            boolean r1 = r3 instanceof java.util.Queue
            if (r1 == 0) goto L1e
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r3)
            goto L23
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L23:
            if (r4 != r0) goto L26
            goto L2f
        L26:
            int r2 = r4 + (-1)
            if (r4 <= r0) goto L2f
            r1.addAll(r3)
            r4 = r2
            goto L26
        L2f:
            return r1
    }

    public static void setIndex(java.lang.Object r3, int r4, java.lang.Object r5) {
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)     // Catch: java.lang.IndexOutOfBoundsException -> Lf java.lang.IllegalArgumentException -> L32
            boolean r0 = r3 instanceof java.util.List     // Catch: java.lang.IndexOutOfBoundsException -> Lf java.lang.IllegalArgumentException -> L32
            if (r0 == 0) goto L11
            r0 = r3
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.IndexOutOfBoundsException -> Lf java.lang.IllegalArgumentException -> L32
            r0.set(r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> Lf java.lang.IllegalArgumentException -> L32
            return
        Lf:
            r5 = move-exception
            goto L15
        L11:
            java.lang.reflect.Array.set(r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> Lf java.lang.IllegalArgumentException -> L32
            return
        L15:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L20
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            goto L24
        L20:
            int r3 = java.lang.reflect.Array.getLength(r3)
        L24:
            bsh.UtilTargetError r0 = new bsh.UtilTargetError
            java.lang.String r1 = "Index "
            java.lang.String r2 = " out-of-bounds for length "
            java.lang.String r3 = p.a.j(r4, r1, r2, r3)
            r0.<init>(r3, r5)
            throw r0
        L32:
            r3 = move-exception
            bsh.UtilTargetError r4 = new bsh.UtilTargetError
            java.lang.ArrayStoreException r5 = new java.lang.ArrayStoreException
            java.lang.String r3 = r3.getMessage()
            r5.<init>(r3)
            r4.<init>(r5)
            throw r4
    }

    public static java.lang.Object slice(java.lang.Object r7, int r8, int r9, int r10) {
            java.lang.Class r0 = r7.getClass()
            java.lang.Class r0 = bsh.Types.arrayElementType(r0)
            int r1 = java.lang.reflect.Array.getLength(r7)
            if (r9 <= r1) goto Lf
            r9 = r1
        Lf:
            r1 = 0
            if (r8 >= 0) goto L13
            r8 = r1
        L13:
            int r9 = r9 - r8
            if (r9 > 0) goto L1b
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r0, r1)
            return r7
        L1b:
            if (r10 == 0) goto L59
            r2 = 1
            if (r10 != r2) goto L21
            goto L59
        L21:
            r2 = 0
            double r4 = (double) r9
            double r4 = r4 + r2
            int r2 = java.lang.Math.abs(r10)
            double r2 = (double) r2
            double r4 = r4 / r2
            double r2 = java.lang.Math.ceil(r4)
            int r2 = (int) r2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = r1
        L33:
            if (r1 >= r9) goto L4d
            int r5 = r1 % r10
            if (r5 != 0) goto L4a
            int r5 = r4 + 1
            if (r10 >= 0) goto L41
            int r6 = r9 + (-1)
            int r6 = r6 - r1
            goto L43
        L41:
            int r6 = r1 + r8
        L43:
            java.lang.Object r6 = java.lang.reflect.Array.get(r7, r6)
            r3[r4] = r6
            r4 = r5
        L4a:
            int r1 = r1 + 1
            goto L33
        L4d:
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            copy(r0, r7, r8)
            return r7
        L59:
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r0, r9)
            java.lang.System.arraycopy(r7, r8, r10, r1, r9)
            return r10
    }

    public static java.lang.Object slice(java.util.List<java.lang.Object> r3, int r4, int r5, int r6) {
            int r0 = r3.size()
            if (r5 <= r0) goto L7
            r5 = r0
        L7:
            r0 = 0
            if (r4 >= 0) goto Lb
            r4 = r0
        Lb:
            int r1 = r5 - r4
            if (r1 > 0) goto L14
            java.util.List r3 = r3.subList(r0, r0)
            return r3
        L14:
            if (r6 == 0) goto L3d
            r2 = 1
            if (r6 != r2) goto L1a
            goto L3d
        L1a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1f:
            if (r0 >= r1) goto L37
            int r2 = r0 % r6
            if (r2 != 0) goto L34
            if (r6 >= 0) goto L2b
            int r2 = r1 + (-1)
            int r2 = r2 - r0
            goto L2d
        L2b:
            int r2 = r0 + r4
        L2d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
        L34:
            int r0 = r0 + 1
            goto L1f
        L37:
            bsh.BshArray$SteppedSubList r4 = new bsh.BshArray$SteppedSubList
            r4.<init>(r3, r5)
            return r4
        L3d:
            java.util.List r3 = r3.subList(r4, r5)
            return r3
    }
}
