package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final java.lang.Class<? extends java.lang.Object>[] f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f939a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashMap c;
    public final java.util.LinkedHashMap d;
    public final androidx.savedstate.a.b e;

    public static final class a {
        public static androidx.lifecycle.m a(android.os.Bundle r5, android.os.Bundle r6) {
                if (r5 != 0) goto L36
                if (r6 != 0) goto La
                androidx.lifecycle.m r5 = new androidx.lifecycle.m
                r5.<init>()
                return r5
            La:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r0 = r6.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "key"
                a.C0193i9.d(r1, r2)
                java.lang.Object r2 = r6.get(r1)
                r5.put(r1, r2)
                goto L17
            L30:
                androidx.lifecycle.m r6 = new androidx.lifecycle.m
                r6.<init>(r5)
                return r6
            L36:
                java.lang.String r6 = "keys"
                java.util.ArrayList r6 = r5.getParcelableArrayList(r6)
                java.lang.String r0 = "values"
                java.util.ArrayList r5 = r5.getParcelableArrayList(r0)
                if (r6 == 0) goto L77
                if (r5 == 0) goto L77
                int r0 = r6.size()
                int r1 = r5.size()
                if (r0 != r1) goto L77
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                int r1 = r6.size()
                r2 = 0
            L5a:
                if (r2 >= r1) goto L71
                java.lang.Object r3 = r6.get(r2)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                a.C0193i9.c(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r5.get(r2)
                r0.put(r3, r4)
                int r2 = r2 + 1
                goto L5a
            L71:
                androidx.lifecycle.m r5 = new androidx.lifecycle.m
                r5.<init>(r0)
                return r5
            L77:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Invalid bundle passed as restored state"
                r5.<init>(r6)
                throw r5
        }
    }

    static {
            java.lang.Class<android.util.Size> r28 = android.util.Size.class
            java.lang.Class<android.util.SizeF> r29 = android.util.SizeF.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<boolean[]> r2 = boolean[].class
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Class<double[]> r4 = double[].class
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class<int[]> r6 = int[].class
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class<long[]> r8 = long[].class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
            java.lang.Class<android.os.Binder> r11 = android.os.Binder.class
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            java.lang.Class r13 = java.lang.Byte.TYPE
            java.lang.Class<byte[]> r14 = byte[].class
            java.lang.Class r15 = java.lang.Character.TYPE
            java.lang.Class<char[]> r16 = char[].class
            java.lang.Class<java.lang.CharSequence> r17 = java.lang.CharSequence.class
            java.lang.Class<java.lang.CharSequence[]> r18 = java.lang.CharSequence[].class
            java.lang.Class<java.util.ArrayList> r19 = java.util.ArrayList.class
            java.lang.Class r20 = java.lang.Float.TYPE
            java.lang.Class<float[]> r21 = float[].class
            java.lang.Class<android.os.Parcelable> r22 = android.os.Parcelable.class
            java.lang.Class<android.os.Parcelable[]> r23 = android.os.Parcelable[].class
            java.lang.Class<java.io.Serializable> r24 = java.io.Serializable.class
            java.lang.Class r25 = java.lang.Short.TYPE
            java.lang.Class<short[]> r26 = short[].class
            java.lang.Class<android.util.SparseArray> r27 = android.util.SparseArray.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            androidx.lifecycle.m.f = r0
            return
    }

    public m() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.f939a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.d = r0
            a.B3 r0 = new a.B3
            r1 = 3
            r0.<init>(r1, r2)
            r2.e = r0
            return
    }

    public m(java.util.HashMap r4) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.f939a = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.b = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.c = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.d = r1
            a.B3 r1 = new a.B3
            r2 = 3
            r1.<init>(r2, r3)
            r3.e = r1
            r0.putAll(r4)
            return
    }

    public static android.os.Bundle a(androidx.lifecycle.m r10) {
            java.lang.String r0 = "this$0"
            a.C0193i9.e(r10, r0)
            java.util.LinkedHashMap r0 = r10.b
            java.util.Map r0 = a.C0067ba.H(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            java.util.LinkedHashMap r2 = r10.f939a
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L91
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.a$b r1 = (androidx.savedstate.a.b) r1
            android.os.Bundle r1 = r1.a()
            java.lang.String r6 = "key"
            a.C0193i9.e(r5, r6)
            if (r1 != 0) goto L3b
            goto L4c
        L3b:
            java.lang.Class<? extends java.lang.Object>[] r6 = androidx.lifecycle.m.f
        L3d:
            r7 = 29
            if (r4 >= r7) goto L74
            r7 = r6[r4]
            a.C0193i9.b(r7)
            boolean r7 = r7.isInstance(r1)
            if (r7 == 0) goto L71
        L4c:
            java.util.LinkedHashMap r4 = r10.c
            java.lang.Object r4 = r4.get(r5)
            boolean r6 = r4 instanceof a.Bb
            if (r6 == 0) goto L59
            r3 = r4
            a.Bb r3 = (a.Bb) r3
        L59:
            if (r3 == 0) goto L5f
            r3.g(r1)
            goto L62
        L5f:
            r2.put(r5, r1)
        L62:
            java.util.LinkedHashMap r1 = r10.d
            java.lang.Object r1 = r1.get(r5)
            a.Cb r1 = (a.Cb) r1
            if (r1 != 0) goto L6d
            goto L13
        L6d:
            r1.a()
            goto L13
        L71:
            int r4 = r4 + 1
            goto L3d
        L74:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't put value with type "
            r0.<init>(r2)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " into saved state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L91:
            java.util.Set r10 = r2.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r5 = r0.size()
            r1.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        Lab:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lc2
            java.lang.Object r5 = r10.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.add(r5)
            java.lang.Object r5 = r2.get(r5)
            r1.add(r5)
            goto Lab
        Lc2:
            a.mc r10 = new a.mc
            java.lang.String r2 = "keys"
            r10.<init>(r2, r0)
            a.mc r0 = new a.mc
            java.lang.String r2 = "values"
            r0.<init>(r2, r1)
            a.mc[] r10 = new a.C0267mc[]{r10, r0}
            android.os.Bundle r0 = new android.os.Bundle
            r1 = 2
            r0.<init>(r1)
        Lda:
            if (r4 >= r1) goto L299
            r2 = r10[r4]
            A r5 = r2.f578a
            java.lang.String r5 = (java.lang.String) r5
            B r2 = r2.b
            if (r2 != 0) goto Leb
            r0.putString(r5, r3)
            goto L270
        Leb:
            boolean r6 = r2 instanceof java.lang.Boolean
            if (r6 == 0) goto Lfa
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.putBoolean(r5, r2)
            goto L270
        Lfa:
            boolean r6 = r2 instanceof java.lang.Byte
            if (r6 == 0) goto L109
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            r0.putByte(r5, r2)
            goto L270
        L109:
            boolean r6 = r2 instanceof java.lang.Character
            if (r6 == 0) goto L118
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r0.putChar(r5, r2)
            goto L270
        L118:
            boolean r6 = r2 instanceof java.lang.Double
            if (r6 == 0) goto L127
            java.lang.Number r2 = (java.lang.Number) r2
            double r6 = r2.doubleValue()
            r0.putDouble(r5, r6)
            goto L270
        L127:
            boolean r6 = r2 instanceof java.lang.Float
            if (r6 == 0) goto L136
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r0.putFloat(r5, r2)
            goto L270
        L136:
            boolean r6 = r2 instanceof java.lang.Integer
            if (r6 == 0) goto L145
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.putInt(r5, r2)
            goto L270
        L145:
            boolean r6 = r2 instanceof java.lang.Long
            if (r6 == 0) goto L154
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            r0.putLong(r5, r6)
            goto L270
        L154:
            boolean r6 = r2 instanceof java.lang.Short
            if (r6 == 0) goto L163
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            r0.putShort(r5, r2)
            goto L270
        L163:
            boolean r6 = r2 instanceof android.os.Bundle
            if (r6 == 0) goto L16e
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0.putBundle(r5, r2)
            goto L270
        L16e:
            boolean r6 = r2 instanceof java.lang.CharSequence
            if (r6 == 0) goto L179
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.putCharSequence(r5, r2)
            goto L270
        L179:
            boolean r6 = r2 instanceof android.os.Parcelable
            if (r6 == 0) goto L184
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putParcelable(r5, r2)
            goto L270
        L184:
            boolean r6 = r2 instanceof boolean[]
            if (r6 == 0) goto L18f
            boolean[] r2 = (boolean[]) r2
            r0.putBooleanArray(r5, r2)
            goto L270
        L18f:
            boolean r6 = r2 instanceof byte[]
            if (r6 == 0) goto L19a
            byte[] r2 = (byte[]) r2
            r0.putByteArray(r5, r2)
            goto L270
        L19a:
            boolean r6 = r2 instanceof char[]
            if (r6 == 0) goto L1a5
            char[] r2 = (char[]) r2
            r0.putCharArray(r5, r2)
            goto L270
        L1a5:
            boolean r6 = r2 instanceof double[]
            if (r6 == 0) goto L1b0
            double[] r2 = (double[]) r2
            r0.putDoubleArray(r5, r2)
            goto L270
        L1b0:
            boolean r6 = r2 instanceof float[]
            if (r6 == 0) goto L1bb
            float[] r2 = (float[]) r2
            r0.putFloatArray(r5, r2)
            goto L270
        L1bb:
            boolean r6 = r2 instanceof int[]
            if (r6 == 0) goto L1c6
            int[] r2 = (int[]) r2
            r0.putIntArray(r5, r2)
            goto L270
        L1c6:
            boolean r6 = r2 instanceof long[]
            if (r6 == 0) goto L1d1
            long[] r2 = (long[]) r2
            r0.putLongArray(r5, r2)
            goto L270
        L1d1:
            boolean r6 = r2 instanceof short[]
            if (r6 == 0) goto L1dc
            short[] r2 = (short[]) r2
            r0.putShortArray(r5, r2)
            goto L270
        L1dc:
            boolean r6 = r2 instanceof java.lang.Object[]
            r7 = 34
            java.lang.String r8 = " for key \""
            if (r6 == 0) goto L249
            java.lang.Class r6 = r2.getClass()
            java.lang.Class r6 = r6.getComponentType()
            a.C0193i9.b(r6)
            java.lang.Class<android.os.Parcelable> r9 = android.os.Parcelable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L1fe
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r0.putParcelableArray(r5, r2)
            goto L270
        L1fe:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L20c
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.putStringArray(r5, r2)
            goto L270
        L20c:
            java.lang.Class<java.lang.CharSequence> r9 = java.lang.CharSequence.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L21a
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r0.putCharSequenceArray(r5, r2)
            goto L270
        L21a:
            java.lang.Class<java.io.Serializable> r9 = java.io.Serializable.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 == 0) goto L228
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r5, r2)
            goto L270
        L228:
            java.lang.String r10 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value array type "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L249:
            boolean r6 = r2 instanceof java.io.Serializable
            if (r6 == 0) goto L253
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r5, r2)
            goto L270
        L253:
            boolean r6 = r2 instanceof android.os.IBinder
            if (r6 == 0) goto L25d
            android.os.IBinder r2 = (android.os.IBinder) r2
            r0.putBinder(r5, r2)
            goto L270
        L25d:
            boolean r6 = r2 instanceof android.util.Size
            if (r6 == 0) goto L267
            android.util.Size r2 = (android.util.Size) r2
            a.C0490z2.a(r0, r5, r2)
            goto L270
        L267:
            boolean r6 = r2 instanceof android.util.SizeF
            if (r6 == 0) goto L274
            android.util.SizeF r2 = (android.util.SizeF) r2
            a.C0490z2.b(r0, r5, r2)
        L270:
            int r4 = r4 + 1
            goto Lda
        L274:
            java.lang.Class r10 = r2.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal value type "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r8)
            r1.append(r5)
            r1.append(r7)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L299:
            return r0
    }
}
