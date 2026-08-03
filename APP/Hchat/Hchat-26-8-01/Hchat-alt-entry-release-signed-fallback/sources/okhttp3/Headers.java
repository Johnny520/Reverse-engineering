package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Headers implements java.lang.Iterable<sf.e>, hg.a {
    public static final okhttp3.Headers.Companion Companion = null;
    private final java.lang.String[] namesAndValues;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final java.util.List<java.lang.String> namesAndValues;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.namesAndValues = r0
                return
        }

        public final okhttp3.Headers.Builder add(java.lang.String r4) {
                r3 = this;
                r4.getClass()
                r0 = 6
                r1 = 58
                r2 = 0
                int r0 = og.m.q0(r4, r1, r2, r0)
                r1 = -1
                if (r0 == r1) goto L24
                java.lang.String r1 = r4.substring(r2, r0)
                java.lang.CharSequence r1 = og.m.R0(r1)
                java.lang.String r1 = r1.toString()
                int r0 = r0 + 1
                java.lang.String r4 = r4.substring(r0)
                r3.add(r1, r4)
                return r3
            L24:
                java.lang.String r0 = "Unexpected header: "
                java.lang.String r4 = r0.concat(r4)
                j8.o.q(r4)
                r4 = 0
                return r4
        }

        public final okhttp3.Headers.Builder add(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                okhttp3.Headers.Companion.access$checkValue(r0, r3, r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        public final okhttp3.Headers.Builder add(java.lang.String r4, java.time.Instant r5) {
                r3 = this;
                r4.getClass()
                r5.getClass()
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                r3.add(r4, r0)
                return r3
        }

        public final okhttp3.Headers.Builder add(java.lang.String r1, java.util.Date r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                java.lang.String r2 = okhttp3.internal.http.DatesKt.toHttpDateString(r2)
                r0.add(r1, r2)
                return r0
        }

        public final okhttp3.Headers.Builder addAll(okhttp3.Headers r5) {
                r4 = this;
                r5.getClass()
                int r0 = r5.size()
                r1 = 0
            L8:
                if (r1 >= r0) goto L18
                java.lang.String r2 = r5.name(r1)
                java.lang.String r3 = r5.value(r1)
                r4.addLenient$okhttp(r2, r3)
                int r1 = r1 + 1
                goto L8
            L18:
                return r4
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String r6) {
                r5 = this;
                r6.getClass()
                r0 = 4
                r1 = 58
                r2 = 1
                int r0 = og.m.q0(r6, r1, r2, r0)
                r3 = -1
                r4 = 0
                if (r0 == r3) goto L1c
                java.lang.String r1 = r6.substring(r4, r0)
                int r0 = r0 + r2
                java.lang.String r6 = r6.substring(r0)
                r5.addLenient$okhttp(r1, r6)
                return r5
            L1c:
                char r0 = r6.charAt(r4)
                java.lang.String r3 = ""
                if (r0 != r1) goto L2c
                java.lang.String r6 = r6.substring(r2)
                r5.addLenient$okhttp(r3, r6)
                return r5
            L2c:
                r5.addLenient$okhttp(r3, r6)
                return r5
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.namesAndValues
                java.lang.CharSequence r3 = og.m.R0(r3)
                java.lang.String r3 = r3.toString()
                r2.add(r3)
                return r1
        }

        public final okhttp3.Headers.Builder addUnsafeNonAscii(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        public final okhttp3.Headers build() {
                r3 = this;
                okhttp3.Headers r0 = new okhttp3.Headers
                java.util.List<java.lang.String> r1 = r3.namesAndValues
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        public final java.lang.String get(java.lang.String r4) {
                r3 = this;
                r4.getClass()
                java.util.List<java.lang.String> r0 = r3.namesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = oh.h.A(r0, r1, r2)
                if (r1 > r0) goto L31
            L13:
                java.util.List<java.lang.String> r2 = r3.namesAndValues
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r4.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2c
                java.util.List<java.lang.String> r4 = r3.namesAndValues
                int r0 = r0 + 1
                java.lang.Object r4 = r4.get(r0)
                java.lang.String r4 = (java.lang.String) r4
                return r4
            L2c:
                if (r0 == r1) goto L31
                int r0 = r0 + (-2)
                goto L13
            L31:
                r4 = 0
                return r4
        }

        public final java.util.List<java.lang.String> getNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                return r0
        }

        public final okhttp3.Headers.Builder removeAll(java.lang.String r3) {
                r2 = this;
                r3.getClass()
                r0 = 0
            L4:
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                int r1 = r1.size()
                if (r0 >= r1) goto L29
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r3.equalsIgnoreCase(r1)
                if (r1 == 0) goto L26
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r2.namesAndValues
                r1.remove(r0)
                int r0 = r0 + (-2)
            L26:
                int r0 = r0 + 2
                goto L4
            L29:
                return r2
        }

        public final okhttp3.Headers.Builder set(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r0, r2)
                okhttp3.Headers.Companion.access$checkValue(r0, r3, r2)
                r1.removeAll(r2)
                r1.addLenient$okhttp(r2, r3)
                return r1
        }

        public final okhttp3.Headers.Builder set(java.lang.String r4, java.time.Instant r5) {
                r3 = this;
                r4.getClass()
                r5.getClass()
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                okhttp3.Headers$Builder r4 = r3.set(r4, r0)
                return r4
        }

        public final okhttp3.Headers.Builder set(java.lang.String r1, java.util.Date r2) {
                r0 = this;
                r1.getClass()
                r2.getClass()
                java.lang.String r2 = okhttp3.internal.http.DatesKt.toHttpDateString(r2)
                r0.set(r1, r2)
                return r0
        }
    }

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

        public static final /* synthetic */ void access$checkName(okhttp3.Headers.Companion r0, java.lang.String r1) {
                r0.checkName(r1)
                return
        }

        public static final /* synthetic */ void access$checkValue(okhttp3.Headers.Companion r0, java.lang.String r1, java.lang.String r2) {
                r0.checkValue(r1, r2)
                return
        }

        public static final /* synthetic */ java.lang.String access$get(okhttp3.Headers.Companion r0, java.lang.String[] r1, java.lang.String r2) {
                java.lang.String r0 = r0.get(r1, r2)
                return r0
        }

        private final void checkName(java.lang.String r5) {
                r4 = this;
                int r0 = r5.length()
                if (r0 <= 0) goto L32
                int r0 = r5.length()
                r1 = 0
            Lb:
                if (r1 >= r0) goto L31
                char r2 = r5.charAt(r1)
                r3 = 33
                if (r3 > r2) goto L1c
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 >= r3) goto L1c
                int r1 = r1 + 1
                goto Lb
            L1c:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5}
                java.lang.String r0 = "Unexpected char %#04x at %d in header name: %s"
                java.lang.String r5 = okhttp3.internal.Util.format(r0, r5)
                j8.o.q(r5)
            L31:
                return
            L32:
                java.lang.String r5 = "name is empty"
                j8.o.t(r5)
                return
        }

        private final void checkValue(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                int r0 = r5.length()
                r1 = 0
            L5:
                if (r1 >= r0) goto L55
                char r2 = r5.charAt(r1)
                r3 = 9
                if (r2 == r3) goto L52
                r3 = 32
                if (r3 > r2) goto L18
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 >= r3) goto L18
                goto L52
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r6}
                java.lang.String r2 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = okhttp3.internal.Util.format(r2, r1)
                r0.append(r1)
                boolean r6 = okhttp3.internal.Util.isSensitiveHeader(r6)
                if (r6 == 0) goto L3b
                java.lang.String r5 = ""
                goto L41
            L3b:
                java.lang.String r6 = ": "
                java.lang.String r5 = r6.concat(r5)
            L41:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
            L52:
                int r1 = r1 + 1
                goto L5
            L55:
                return
        }

        private final java.lang.String get(java.lang.String[] r4, java.lang.String r5) {
                r3 = this;
                int r0 = r4.length
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = oh.h.A(r0, r1, r2)
                if (r1 > r0) goto L1d
            Lb:
                r2 = r4[r0]
                boolean r2 = og.t.X(r5, r2)
                if (r2 == 0) goto L18
                int r0 = r0 + 1
                r4 = r4[r0]
                return r4
            L18:
                if (r0 == r1) goto L1d
                int r0 = r0 + (-2)
                goto Lb
            L1d:
                r4 = 0
                return r4
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m66deprecated_of(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                r1.getClass()
                okhttp3.Headers r1 = r0.of(r1)
                return r1
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m67deprecated_of(java.lang.String... r2) {
                r1 = this;
                r2.getClass()
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                okhttp3.Headers r2 = r1.of(r2)
                return r2
        }

        public final okhttp3.Headers of(java.util.Map<java.lang.String, java.lang.String> r5) {
                r4 = this;
                r5.getClass()
                int r0 = r5.size()
                int r0 = r0 * 2
                java.lang.String[] r0 = new java.lang.String[r0]
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
                r1 = 0
            L14:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L4b
                java.lang.Object r2 = r5.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.CharSequence r3 = og.m.R0(r3)
                java.lang.String r3 = r3.toString()
                java.lang.CharSequence r2 = og.m.R0(r2)
                java.lang.String r2 = r2.toString()
                r4.checkName(r3)
                r4.checkValue(r2, r3)
                r0[r1] = r3
                int r3 = r1 + 1
                r0[r3] = r2
                int r1 = r1 + 2
                goto L14
            L4b:
                okhttp3.Headers r5 = new okhttp3.Headers
                r1 = 0
                r5.<init>(r0, r1)
                return r5
        }

        public final okhttp3.Headers of(java.lang.String... r6) {
                r5 = this;
                r6.getClass()
                int r0 = r6.length
                r1 = 2
                int r0 = r0 % r1
                if (r0 != 0) goto L4c
                java.lang.Object r6 = r6.clone()
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                r2 = 0
                r3 = r2
            L11:
                if (r3 >= r0) goto L2b
                r4 = r6[r3]
                if (r4 == 0) goto L24
                java.lang.CharSequence r4 = og.m.R0(r4)
                java.lang.String r4 = r4.toString()
                r6[r3] = r4
                int r3 = r3 + 1
                goto L11
            L24:
                java.lang.String r6 = "Headers cannot be null"
                j8.o.t(r6)
            L29:
                r6 = 0
                return r6
            L2b:
                int r0 = r6.length
                int r0 = r0 + (-1)
                int r0 = oh.h.A(r2, r0, r1)
                if (r0 < 0) goto L45
            L34:
                r1 = r6[r2]
                int r3 = r2 + 1
                r3 = r6[r3]
                r5.checkName(r1)
                r5.checkValue(r3, r1)
                if (r2 == r0) goto L45
                int r2 = r2 + 2
                goto L34
            L45:
                okhttp3.Headers r0 = new okhttp3.Headers
                r1 = 0
                r0.<init>(r6, r1)
                return r0
            L4c:
                java.lang.String r6 = "Expected alternating header names and values"
                j8.o.t(r6)
                goto L29
        }
    }

    static {
            okhttp3.Headers$Companion r0 = new okhttp3.Headers$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Headers.Companion = r0
            return
    }

    private Headers(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.namesAndValues = r1
            return
    }

    public /* synthetic */ Headers(java.lang.String[] r1, gg.g r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final okhttp3.Headers of(java.util.Map<java.lang.String, java.lang.String> r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    public static final okhttp3.Headers of(java.lang.String... r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r1 = r0.of(r1)
            return r1
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m65deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public final long byteCount() {
            r6 = this;
            java.lang.String[] r0 = r6.namesAndValues
            int r1 = r0.length
            int r1 = r1 * 2
            long r1 = (long) r1
            int r0 = r0.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            java.lang.String[] r4 = r6.namesAndValues
            r4 = r4[r3]
            int r4 = r4.length()
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.Headers
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r1.namesAndValues
            okhttp3.Headers r2 = (okhttp3.Headers) r2
            java.lang.String[] r2 = r2.namesAndValues
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final java.lang.String get(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            java.lang.String[] r1 = r2.namesAndValues
            java.lang.String r3 = okhttp3.Headers.Companion.access$get(r0, r1, r3)
            return r3
    }

    public final java.util.Date getDate(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = r0.get(r1)
            if (r1 == 0) goto Le
            java.util.Date r1 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r1)
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final java.time.Instant getInstant(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.Date r1 = r0.getDate(r1)
            if (r1 == 0) goto Le
            java.time.Instant r1 = r1.toInstant()
            return r1
        Le:
            r1 = 0
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<sf.e> iterator() {
            r6 = this;
            int r0 = r6.size()
            sf.e[] r1 = new sf.e[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = r6.name(r2)
            java.lang.String r4 = r6.value(r2)
            sf.e r5 = new sf.e
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            gg.b r0 = new gg.b
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String name(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    public final java.util.Set<java.lang.String> names() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r1.getClass()
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1b
            java.lang.String r3 = r4.name(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lf
        L1b:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r0.getClass()
            return r0
    }

    public final okhttp3.Headers.Builder newBuilder() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.List r1 = r0.getNamesAndValues$okhttp()
            java.lang.String[] r2 = r3.namesAndValues
            r1.getClass()
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            r1.addAll(r2)
            return r0
    }

    public final int size() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r1.getClass()
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L36
            java.lang.String r3 = r6.name(r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r4, r3, r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L2c
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            r0.put(r3, r4)
        L2c:
            java.lang.String r3 = r6.value(r2)
            r4.add(r3)
            int r2 = r2 + 1
            goto Lf
        L36:
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = r6.name(r2)
            java.lang.String r4 = r6.value(r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = okhttp3.internal.Util.isSensitiveHeader(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String value(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    public final java.util.List<java.lang.String> values(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L9:
            if (r2 >= r0) goto L27
            java.lang.String r3 = r4.name(r2)
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L24
            if (r1 != 0) goto L1d
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 2
            r1.<init>(r3)
        L1d:
            java.lang.String r3 = r4.value(r2)
            r1.add(r3)
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            if (r1 == 0) goto L31
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r5.getClass()
            return r5
        L31:
            tf.t r5 = tf.t.f13167g
            return r5
    }
}
