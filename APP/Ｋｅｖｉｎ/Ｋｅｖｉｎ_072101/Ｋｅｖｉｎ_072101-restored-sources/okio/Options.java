package okio;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m115d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class Options extends kotlin.collections.AbstractList<okio.ByteString> implements java.util.RandomAccess {
    public static final okio.Options.Companion Companion = null;
    private final okio.ByteString[] byteStrings;
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m115d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final void buildTrieRecursive(long r25, okio.Buffer r27, int r28, java.util.List<? extends okio.ByteString> r29, int r30, int r31, java.util.List<java.lang.Integer> r32) {
                r24 = this;
                r9 = r24
                r10 = r27
                r11 = r28
                r12 = r29
                r13 = r31
                r14 = r32
                r0 = 0
                r1 = 1
                r15 = r30
                if (r15 >= r13) goto L14
                r2 = r1
                goto L15
            L14:
                r2 = r0
            L15:
                java.lang.String r3 = "Failed requirement."
                if (r2 == 0) goto L279
                r2 = r30
            L1b:
                if (r2 >= r13) goto L3b
                java.lang.Object r4 = r12.get(r2)
                okio.ByteString r4 = (okio.ByteString) r4
                int r4 = r4.size()
                if (r4 < r11) goto L2b
                r4 = r1
                goto L2c
            L2b:
                r4 = r0
            L2c:
                if (r4 == 0) goto L31
                int r2 = r2 + 1
                goto L1b
            L31:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            L3b:
                r2 = r30
                java.lang.Object r3 = r12.get(r2)
                okio.ByteString r3 = (okio.ByteString) r3
                int r4 = r13 + (-1)
                java.lang.Object r4 = r12.get(r4)
                r8 = r4
                okio.ByteString r8 = (okio.ByteString) r8
                r4 = -1
                int r5 = r3.size()
                if (r11 != r5) goto L6a
                java.lang.Object r5 = r14.get(r2)
                java.lang.Number r5 = (java.lang.Number) r5
                int r4 = r5.intValue()
                int r2 = r2 + 1
                java.lang.Object r5 = r12.get(r2)
                r3 = r5
                okio.ByteString r3 = (okio.ByteString) r3
                r7 = r2
                r6 = r3
                r5 = r4
                goto L6d
            L6a:
                r7 = r2
                r6 = r3
                r5 = r4
            L6d:
                byte r2 = r6.getByte(r11)
                byte r3 = r8.getByte(r11)
                r4 = 2
                if (r2 == r3) goto L19f
                r0 = 1
                int r1 = r7 + 1
                r3 = r0
            L7c:
                if (r1 >= r13) goto L9b
                int r0 = r1 + (-1)
                java.lang.Object r0 = r12.get(r0)
                okio.ByteString r0 = (okio.ByteString) r0
                byte r0 = r0.getByte(r11)
                java.lang.Object r2 = r12.get(r1)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r11)
                if (r0 == r2) goto L98
                int r3 = r3 + 1
            L98:
                int r1 = r1 + 1
                goto L7c
            L9b:
                long r0 = r9.getIntCount(r10)
                long r0 = r25 + r0
                r16 = r8
                long r8 = (long) r4
                long r0 = r0 + r8
                int r2 = r3 * 2
                long r8 = (long) r2
                long r17 = r0 + r8
                r10.writeInt(r3)
                r10.writeInt(r5)
                r0 = r7
            Lb1:
                if (r0 >= r13) goto Ld8
                java.lang.Object r1 = r12.get(r0)
                okio.ByteString r1 = (okio.ByteString) r1
                byte r1 = r1.getByte(r11)
                if (r0 == r7) goto Lcd
                int r2 = r0 + (-1)
                java.lang.Object r2 = r12.get(r2)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r11)
                if (r1 == r2) goto Ld5
            Lcd:
                r2 = 255(0xff, float:3.57E-43)
                r4 = r1
                r8 = 0
                r2 = r2 & r4
                r10.writeInt(r2)
            Ld5:
                int r0 = r0 + 1
                goto Lb1
            Ld8:
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r9 = r0
                r0 = r7
                r8 = r0
            Le0:
                if (r8 >= r13) goto L17f
                java.lang.Object r0 = r12.get(r8)
                okio.ByteString r0 = (okio.ByteString) r0
                byte r4 = r0.getByte(r11)
                r0 = r31
                int r1 = r8 + 1
            Lf0:
                if (r1 >= r13) goto L103
                java.lang.Object r2 = r12.get(r1)
                okio.ByteString r2 = (okio.ByteString) r2
                byte r2 = r2.getByte(r11)
                if (r4 == r2) goto L100
                r0 = r1
                goto L104
            L100:
                int r1 = r1 + 1
                goto Lf0
            L103:
                r1 = r0
            L104:
                int r0 = r8 + 1
                if (r0 != r1) goto L134
                int r0 = r11 + 1
                java.lang.Object r2 = r12.get(r8)
                okio.ByteString r2 = (okio.ByteString) r2
                int r2 = r2.size()
                if (r0 != r2) goto L134
                java.lang.Object r0 = r14.get(r8)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                r15 = r24
                r20 = r1
                r21 = r3
                r22 = r4
                r14 = r5
                r19 = r6
                r12 = r7
                r23 = r16
                r16 = r8
                goto L16d
            L134:
                r2 = r24
                long r19 = r2.getIntCount(r9)
                r21 = r1
                long r0 = r17 + r19
                int r0 = (int) r0
                int r0 = r0 * (-1)
                r10.writeInt(r0)
                int r19 = r11 + 1
                r0 = r24
                r15 = r2
                r20 = r21
                r1 = r17
                r21 = r3
                r3 = r9
                r22 = r4
                r4 = r19
                r14 = r5
                r5 = r29
                r19 = r6
                r6 = r8
                r12 = r7
                r7 = r20
                r23 = r16
                r16 = r8
                r8 = r32
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
            L16d:
                r8 = r20
                r15 = r30
                r7 = r12
                r5 = r14
                r6 = r19
                r3 = r21
                r16 = r23
                r12 = r29
                r14 = r32
                goto Le0
            L17f:
                r15 = r24
                r21 = r3
                r14 = r5
                r19 = r6
                r12 = r7
                r23 = r16
                r16 = r8
                r0 = r9
                okio.Source r0 = (okio.Source) r0
                r10.writeAll(r0)
                r20 = r12
                r18 = r14
                r22 = r19
                r21 = r23
                r12 = r29
                r14 = r32
                goto L278
            L19f:
                r14 = r5
                r19 = r6
                r12 = r7
                r23 = r8
                r15 = r9
                r2 = 0
                r3 = r28
                int r5 = r19.size()
                int r6 = r23.size()
                int r5 = java.lang.Math.min(r5, r6)
                r9 = r2
            L1b6:
                if (r3 >= r5) goto L1d0
                r8 = r19
                byte r2 = r8.getByte(r3)
                r7 = r23
                byte r6 = r7.getByte(r3)
                if (r2 != r6) goto L1cf
                int r9 = r9 + 1
                int r3 = r3 + 1
                r23 = r7
                r19 = r8
                goto L1b6
            L1cf:
                goto L1d4
            L1d0:
                r8 = r19
                r7 = r23
            L1d4:
                long r2 = r15.getIntCount(r10)
                long r2 = r25 + r2
                long r4 = (long) r4
                long r2 = r2 + r4
                long r4 = (long) r9
                long r2 = r2 + r4
                r4 = 1
                long r16 = r2 + r4
                int r2 = -r9
                r10.writeInt(r2)
                r10.writeInt(r14)
                r2 = r28
                int r3 = r11 + r9
            L1ed:
                if (r2 >= r3) goto L1fd
                byte r4 = r8.getByte(r2)
                r5 = 255(0xff, float:3.57E-43)
                r6 = 0
                r4 = r4 & r5
                r10.writeInt(r4)
                int r2 = r2 + 1
                goto L1ed
            L1fd:
                int r2 = r12 + 1
                if (r2 != r13) goto L239
                int r2 = r11 + r9
                r6 = r12
                r12 = r29
                java.lang.Object r3 = r12.get(r6)
                okio.ByteString r3 = (okio.ByteString) r3
                int r3 = r3.size()
                if (r2 != r3) goto L213
                r0 = r1
            L213:
                if (r0 == 0) goto L22d
                r18 = r14
                r14 = r32
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.writeInt(r0)
                r20 = r6
                r21 = r7
                r22 = r8
                goto L278
            L22d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L239:
                r6 = r12
                r18 = r14
                r12 = r29
                r14 = r32
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                r5 = r0
                long r0 = r15.getIntCount(r5)
                long r0 = r16 + r0
                int r0 = (int) r0
                int r0 = r0 * (-1)
                r10.writeInt(r0)
                int r4 = r11 + r9
                r0 = r24
                r1 = r16
                r3 = r5
                r19 = r5
                r5 = r29
                r20 = r6
                r21 = r7
                r7 = r31
                r22 = r8
                r8 = r32
                r0.buildTrieRecursive(r1, r3, r4, r5, r6, r7, r8)
                r0 = r19
                okio.Source r0 = (okio.Source) r0
                r10.writeAll(r0)
            L278:
                return
            L279:
                r15 = r9
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
        }

        static /* synthetic */ void buildTrieRecursive$default(okio.Options.Companion r11, long r12, okio.Buffer r14, int r15, java.util.List r16, int r17, int r18, java.util.List r19, int r20, java.lang.Object r21) {
                r0 = r20 & 1
                if (r0 == 0) goto L8
                r0 = 0
                r3 = r0
                goto L9
            L8:
                r3 = r12
            L9:
                r0 = r20 & 4
                r1 = 0
                if (r0 == 0) goto L10
                r6 = r1
                goto L11
            L10:
                r6 = r15
            L11:
                r0 = r20 & 16
                if (r0 == 0) goto L17
                r8 = r1
                goto L19
            L17:
                r8 = r17
            L19:
                r0 = r20 & 32
                if (r0 == 0) goto L23
                int r0 = r16.size()
                r9 = r0
                goto L25
            L23:
                r9 = r18
            L25:
                r2 = r11
                r5 = r14
                r7 = r16
                r10 = r19
                r2.buildTrieRecursive(r3, r5, r6, r7, r8, r9, r10)
                return
        }

        private final long getIntCount(okio.Buffer r5) {
                r4 = this;
                long r0 = r5.size()
                r2 = 4
                long r2 = (long) r2
                long r0 = r0 / r2
                return r0
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okio.Options m150of(okio.ByteString... r22) {
                r21 = this;
                r0 = r22
                java.lang.String r1 = "byteStrings"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r1 = r0.length
                r2 = 0
                r3 = 1
                if (r1 != 0) goto Le
                r1 = r3
                goto Lf
            Le:
                r1 = r2
            Lf:
                r4 = 0
                r5 = -1
                if (r1 == 0) goto L1f
                okio.Options r1 = new okio.Options
                okio.ByteString[] r3 = new okio.ByteString[r2]
                int[] r2 = new int[]{r2, r5}
                r1.<init>(r3, r2, r4)
                return r1
            L1f:
                java.util.List r1 = kotlin.collections.ArraysKt.toMutableList(r22)
                kotlin.collections.CollectionsKt.sort(r1)
                r6 = r22
                r7 = 0
                java.util.ArrayList r8 = new java.util.ArrayList
                int r9 = r6.length
                r8.<init>(r9)
                java.util.Collection r8 = (java.util.Collection) r8
                r9 = r6
                r10 = 0
                int r11 = r9.length
                r12 = r2
            L35:
                if (r12 >= r11) goto L46
                r13 = r9[r12]
                r14 = r13
                r15 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
                r8.add(r14)
                int r12 = r12 + 1
                goto L35
            L46:
                r5 = r8
                java.util.List r5 = (java.util.List) r5
                java.util.Collection r5 = (java.util.Collection) r5
                r6 = 0
                r7 = r5
                java.lang.Integer[] r8 = new java.lang.Integer[r2]
                java.lang.Object[] r5 = r7.toArray(r8)
                java.lang.Integer[] r5 = (java.lang.Integer[]) r5
                int r6 = r5.length
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
                java.util.List r15 = kotlin.collections.CollectionsKt.mutableListOf(r5)
                r11 = r22
                r12 = 0
                r5 = 0
                int r13 = r11.length
                r14 = r2
            L67:
                if (r14 >= r13) goto L8e
                r16 = r11[r14]
                int r17 = r5 + 1
                r18 = r5
                r19 = r16
                r20 = 0
                r6 = r19
                java.lang.Comparable r6 = (java.lang.Comparable) r6
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r1
                int r5 = kotlin.collections.CollectionsKt.binarySearch$default(r5, r6, r7, r8, r9, r10)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
                r15.set(r5, r6)
                int r14 = r14 + 1
                r5 = r17
                goto L67
            L8e:
                java.lang.Object r5 = r1.get(r2)
                okio.ByteString r5 = (okio.ByteString) r5
                int r5 = r5.size()
                if (r5 <= 0) goto L9d
                r5 = r3
                goto L9e
            L9d:
                r5 = r2
            L9e:
                if (r5 == 0) goto L15a
                r5 = 0
                r14 = r5
            La2:
                int r5 = r1.size()
                if (r14 >= r5) goto L114
                java.lang.Object r5 = r1.get(r14)
                okio.ByteString r5 = (okio.ByteString) r5
                int r6 = r14 + 1
            Lb0:
                int r7 = r1.size()
                if (r6 >= r7) goto L110
                java.lang.Object r7 = r1.get(r6)
                okio.ByteString r7 = (okio.ByteString) r7
                boolean r8 = r7.startsWith(r5)
                if (r8 == 0) goto L110
                int r8 = r7.size()
                int r9 = r5.size()
                if (r8 == r9) goto Lce
                r8 = r3
                goto Lcf
            Lce:
                r8 = r2
            Lcf:
                if (r8 == 0) goto Lf2
                java.lang.Object r8 = r15.get(r6)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Object r9 = r15.get(r14)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r8 <= r9) goto Lee
                r1.remove(r6)
                r15.remove(r6)
                goto Lb0
            Lee:
                int r6 = r6 + 1
                goto Lb0
            Lf2:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "duplicate option: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
            L110:
                int r14 = r14 + 1
                goto La2
            L114:
                okio.Buffer r2 = new okio.Buffer
                r2.<init>()
                r3 = 53
                r16 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r5 = r21
                r8 = r2
                r10 = r1
                r13 = r15
                r17 = r14
                r14 = r3
                r3 = r15
                r15 = r16
                buildTrieRecursive$default(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                long r6 = r5.getIntCount(r2)
                int r6 = (int) r6
                int[] r6 = new int[r6]
                r7 = 0
            L138:
                boolean r8 = r2.exhausted()
                if (r8 != 0) goto L148
                int r8 = r7 + 1
                int r9 = r2.readInt()
                r6[r7] = r9
                r7 = r8
                goto L138
            L148:
                okio.Options r8 = new okio.Options
                int r9 = r0.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r0, r9)
                java.lang.String r10 = "copyOf(this, size)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
                okio.ByteString[] r9 = (okio.ByteString[]) r9
                r8.<init>(r9, r6, r4)
                return r8
            L15a:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "the empty byte string is not a supported option"
                java.lang.String r4 = r4.toString()
                r2.<init>(r4)
                throw r2
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

    public /* synthetic */ Options(okio.ByteString[] r1, int[] r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okio.Options m149of(okio.ByteString... r1) {
            okio.Options$Companion r0 = okio.Options.Companion
            okio.Options r0 = r0.m150of(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            okio.ByteString r0 = (okio.ByteString) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public /* bridge */ boolean contains(okio.ByteString r2) {
            r1 = this;
            boolean r0 = super.contains(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            okio.ByteString r0 = r1.get(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public okio.ByteString get(int r2) {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            r0 = r0[r2]
            return r0
    }

    public final okio.ByteString[] getByteStrings$okio() {
            r1 = this;
            okio.ByteString[] r0 = r1.byteStrings
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
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

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            okio.ByteString r0 = (okio.ByteString) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public /* bridge */ int indexOf(okio.ByteString r2) {
            r1 = this;
            int r0 = super.indexOf(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.ByteString
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            okio.ByteString r0 = (okio.ByteString) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }

    public /* bridge */ int lastIndexOf(okio.ByteString r2) {
            r1 = this;
            int r0 = super.lastIndexOf(r2)
            return r0
    }
}
