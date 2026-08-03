package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Options extends tf.f implements java.util.RandomAccess {
    public static final okio.Options.Companion Companion = null;
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final void buildTrieRecursive(long r20, okio.Buffer r22, int r23, java.util.List<? extends okio.ByteString> r24, int r25, int r26, java.util.List<java.lang.Integer> r27) {
                r19 = this;
                r0 = r19
                r9 = r22
                r10 = r23
                r5 = r24
                r1 = r25
                r11 = r26
                r8 = r27
                java.lang.String r2 = "Failed requirement."
                if (r1 >= r11) goto L19f
                r3 = r1
            L13:
                if (r3 >= r11) goto L28
                java.lang.Object r4 = r5.get(r3)
                okio.ByteString r4 = (okio.ByteString) r4
                int r4 = r4.size()
                if (r4 < r10) goto L24
                int r3 = r3 + 1
                goto L13
            L24:
                j8.o.t(r2)
                return
            L28:
                java.lang.Object r2 = r24.get(r25)
                okio.ByteString r2 = (okio.ByteString) r2
                int r3 = r11 + (-1)
                java.lang.Object r3 = r5.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                int r4 = r2.size()
                if (r10 != r4) goto L52
                java.lang.Object r2 = r8.get(r1)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                int r1 = r1 + 1
                java.lang.Object r4 = r5.get(r1)
                okio.ByteString r4 = (okio.ByteString) r4
                r6 = r1
                r1 = r2
                r2 = r4
                goto L54
            L52:
                r6 = r1
                r1 = -1
            L54:
                byte r4 = r2.getByte(r10)
                byte r7 = r3.getByte(r10)
                r13 = 2
                if (r4 == r7) goto L119
                int r2 = r6 + 1
                r3 = 1
            L62:
                if (r2 >= r11) goto L81
                int r4 = r2 + (-1)
                java.lang.Object r4 = r5.get(r4)
                okio.ByteString r4 = (okio.ByteString) r4
                byte r4 = r4.getByte(r10)
                java.lang.Object r7 = r5.get(r2)
                okio.ByteString r7 = (okio.ByteString) r7
                byte r7 = r7.getByte(r10)
                if (r4 == r7) goto L7e
                int r3 = r3 + 1
            L7e:
                int r2 = r2 + 1
                goto L62
            L81:
                long r14 = r0.getIntCount(r9)
                long r14 = r20 + r14
                r16 = -1
                long r12 = (long) r13
                long r14 = r14 + r12
                int r2 = r3 * 2
                long r12 = (long) r2
                long r14 = r14 + r12
                r9.writeInt(r3)
                r9.writeInt(r1)
                r1 = r6
            L96:
                if (r1 >= r11) goto Lba
                java.lang.Object r2 = r5.get(r1)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r10)
                if (r1 == r6) goto Lb2
                int r3 = r1 + (-1)
                java.lang.Object r3 = r5.get(r3)
                okio.ByteString r3 = (okio.ByteString) r3
                byte r3 = r3.getByte(r10)
                if (r2 == r3) goto Lb7
            Lb2:
                r2 = r2 & 255(0xff, float:3.57E-43)
                r9.writeInt(r2)
            Lb7:
                int r1 = r1 + 1
                goto L96
            Lba:
                okio.Buffer r3 = new okio.Buffer
                r3.<init>()
            Lbf:
                if (r6 >= r11) goto L115
                java.lang.Object r1 = r5.get(r6)
                okio.ByteString r1 = (okio.ByteString) r1
                byte r1 = r1.getByte(r10)
                int r2 = r6 + 1
                r4 = r2
            Lce:
                if (r4 >= r11) goto Le1
                java.lang.Object r7 = r5.get(r4)
                okio.ByteString r7 = (okio.ByteString) r7
                byte r7 = r7.getByte(r10)
                if (r1 == r7) goto Lde
                r7 = r4
                goto Le2
            Lde:
                int r4 = r4 + 1
                goto Lce
            Le1:
                r7 = r11
            Le2:
                if (r2 != r7) goto L101
                int r1 = r10 + 1
                java.lang.Object r2 = r5.get(r6)
                okio.ByteString r2 = (okio.ByteString) r2
                int r2 = r2.size()
                if (r1 != r2) goto L101
                java.lang.Object r1 = r8.get(r6)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r9.writeInt(r1)
                r1 = r14
                goto L112
            L101:
                long r1 = r0.getIntCount(r3)
                long r1 = r1 + r14
                int r1 = (int) r1
                int r1 = r1 * (-1)
                r9.writeInt(r1)
                int r4 = r10 + 1
                r1 = r14
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            L112:
                r14 = r1
                r6 = r7
                goto Lbf
            L115:
                r9.writeAll(r3)
                return
            L119:
                r16 = -1
                int r4 = r2.size()
                int r7 = r3.size()
                int r4 = java.lang.Math.min(r4, r7)
                r7 = 0
                r12 = r10
            L129:
                if (r12 >= r4) goto L13a
                byte r14 = r2.getByte(r12)
                byte r15 = r3.getByte(r12)
                if (r14 != r15) goto L13a
                int r7 = r7 + 1
                int r12 = r12 + 1
                goto L129
            L13a:
                long r3 = r0.getIntCount(r9)
                long r3 = r20 + r3
                long r12 = (long) r13
                long r3 = r3 + r12
                long r12 = (long) r7
                long r3 = r3 + r12
                r12 = 1
                long r3 = r3 + r12
                int r12 = -r7
                r9.writeInt(r12)
                r9.writeInt(r1)
                int r1 = r10 + r7
            L150:
                if (r10 >= r1) goto L15e
                byte r7 = r2.getByte(r10)
                r7 = r7 & 255(0xff, float:3.57E-43)
                r9.writeInt(r7)
                int r10 = r10 + 1
                goto L150
            L15e:
                int r2 = r6 + 1
                if (r2 != r11) goto L182
                java.lang.Object r2 = r5.get(r6)
                okio.ByteString r2 = (okio.ByteString) r2
                int r2 = r2.size()
                if (r1 != r2) goto L17c
                java.lang.Object r1 = r8.get(r6)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r9.writeInt(r1)
                return
            L17c:
                java.lang.String r1 = "Check failed."
                j8.o.A(r1)
                return
            L182:
                r17 = r3
                r4 = r1
                r1 = r17
                okio.Buffer r3 = new okio.Buffer
                r3.<init>()
                long r12 = r0.getIntCount(r3)
                long r12 = r12 + r1
                int r7 = (int) r12
                int r7 = r7 * (-1)
                r9.writeInt(r7)
                r7 = r11
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                r9.writeAll(r3)
                return
            L19f:
                j8.o.t(r2)
                return
        }

        public static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion r9, long r10, okio.Buffer r12, int r13, java.util.List r14, int r15, int r16, java.util.List r17, int r18, java.lang.Object r19) {
                r0 = r18 & 1
                if (r0 == 0) goto L6
                r10 = 0
            L6:
                r1 = r10
                r10 = r18 & 4
                r11 = 0
                if (r10 == 0) goto Le
                r4 = r11
                goto Lf
            Le:
                r4 = r13
            Lf:
                r10 = r18 & 16
                if (r10 == 0) goto L15
                r6 = r11
                goto L16
            L15:
                r6 = r15
            L16:
                r10 = r18 & 32
                if (r10 == 0) goto L25
                int r10 = r14.size()
                r7 = r10
            L1f:
                r0 = r9
                r3 = r12
                r5 = r14
                r8 = r17
                goto L28
            L25:
                r7 = r16
                goto L1f
            L28:
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                return
        }

        private final long getIntCount(okio.Buffer r5) {
                r4 = this;
                long r0 = r5.size()
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }

        public final okio.Options of(okio.ByteString... r17) {
                r16 = this;
                r0 = r17
                r0.getClass()
                int r1 = r0.length
                r2 = 0
                r3 = -1
                r4 = 0
                if (r1 != 0) goto L17
                okio.Options r0 = new okio.Options
                okio.ByteString[] r1 = new okio.ByteString[r4]
                int[] r3 = new int[]{r4, r3}
                r0.<init>(r1, r3, r2)
                return r0
            L17:
                java.util.ArrayList r10 = new java.util.ArrayList
                tf.j r1 = new tf.j
                r1.<init>(r0, r4)
                r10.<init>(r1)
                tf.q.f1(r10)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r5 = r0.length
                r1.<init>(r5)
                int r5 = r0.length
                r6 = r4
            L2c:
                if (r6 >= r5) goto L3a
                r7 = r0[r6]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                r1.add(r7)
                int r6 = r6 + 1
                goto L2c
            L3a:
                java.lang.Integer[] r3 = new java.lang.Integer[r4]
                java.lang.Object[] r1 = r1.toArray(r3)
                java.lang.Integer[] r1 = (java.lang.Integer[]) r1
                int r3 = r1.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
                java.util.ArrayList r13 = a.a.C0(r1)
                int r1 = r0.length
                r3 = r4
                r5 = r3
            L4e:
                if (r3 >= r1) goto L63
                r6 = r0[r3]
                int r7 = r5 + 1
                int r6 = a.a.p(r10, r6)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r13.set(r6, r5)
                int r3 = r3 + 1
                r5 = r7
                goto L4e
            L63:
                java.lang.Object r1 = r10.get(r4)
                okio.ByteString r1 = (okio.ByteString) r1
                int r1 = r1.size()
                if (r1 <= 0) goto Lfa
                r1 = r4
            L70:
                int r3 = r10.size()
                if (r1 >= r3) goto Lc4
                java.lang.Object r3 = r10.get(r1)
                okio.ByteString r3 = (okio.ByteString) r3
                int r5 = r1 + 1
                r6 = r5
            L7f:
                int r7 = r10.size()
                if (r6 >= r7) goto Lc2
                java.lang.Object r7 = r10.get(r6)
                okio.ByteString r7 = (okio.ByteString) r7
                boolean r8 = r7.startsWith(r3)
                if (r8 == 0) goto Lc2
                int r8 = r7.size()
                int r9 = r3.size()
                if (r8 == r9) goto Lbb
                java.lang.Object r7 = r13.get(r6)
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.Object r8 = r13.get(r1)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                if (r7 <= r8) goto Lb8
                r10.remove(r6)
                r13.remove(r6)
                goto L7f
            Lb8:
                int r6 = r6 + 1
                goto L7f
            Lbb:
                java.lang.String r0 = "duplicate option: "
                j8.o.z(r7, r0)
                r0 = 0
                return r0
            Lc2:
                r1 = r5
                goto L70
            Lc4:
                okio.Buffer r8 = new okio.Buffer
                r8.<init>()
                r14 = 53
                r15 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r5 = r16
                buildTrieRecursive$default(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                long r6 = r5.getIntCount(r8)
                int r1 = (int) r6
                int[] r1 = new int[r1]
            Ldd:
                boolean r3 = r8.exhausted()
                if (r3 != 0) goto Led
                int r3 = r4 + 1
                int r6 = r8.readInt()
                r1[r4] = r6
                r4 = r3
                goto Ldd
            Led:
                okio.Options r3 = new okio.Options
                int r4 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                okio.ByteString[] r0 = (okio.ByteString[]) r0
                r3.<init>(r0, r1, r2)
                return r3
            Lfa:
                r5 = r16
                java.lang.String r0 = "the empty byte string is not a supported option"
                j8.o.t(r0)
                r0 = 0
                return r0
        }
    }

    static {
            okio.Options$Companion r0 = new okio.Options$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Options.Companion = r0
            return
    }

    private Options(okio.ByteString[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.byteStrings = r1
            r0.trie = r2
            return
    }

    public /* synthetic */ Options(okio.ByteString[] r1, int[] r2, gg.g r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final okio.Options of(okio.ByteString... r1) {
            okio.Options$Companion r0 = okio.Options.Companion
            okio.Options r1 = r0.of(r1)
            return r1
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public /* bridge */ boolean contains(okio.ByteString r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            okio.ByteString r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.List
    public okio.ByteString get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r2 = r0[r2]
            return r2
    }

    public final okio.ByteString[] getByteStrings$okio() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            return r0
    }

    @Override // tf.a
    public int getSize() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            int r0 = r0.length
            return r0
    }

    public final int[] getTrie$okio() {
            r1 = this;
            int[] r0 = r1.trie
            return r0
    }

    @Override // tf.f, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.indexOf(r2)
            return r2
    }

    public /* bridge */ int indexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    @Override // tf.f, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            okio.ByteString r2 = (okio.ByteString) r2
            int r2 = r1.lastIndexOf(r2)
            return r2
    }

    public /* bridge */ int lastIndexOf(okio.ByteString r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }
}
