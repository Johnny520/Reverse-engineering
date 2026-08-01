package okhttp3;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016J\u001b\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0!J\b\u0010#\u001a\u00020\u0003H\u0016J\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u0012\u001a\u00020\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006("}, m115d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "size", "", "()I", "byteCount", "", "equals", "", "other", "", "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "hashCode", "iterator", "", "index", "names", "", "newBuilder", "Lokhttp3/Headers$Builder;", "-deprecated_size", "toMultimap", "", "", "toString", "value", "values", "Builder", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Headers implements java.lang.Iterable<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final okhttp3.Headers.Companion Companion = null;
    private final java.lang.String[] namesAndValues;

    /* JADX INFO: compiled from: Headers.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m115d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        private final java.util.List<java.lang.String> namesAndValues;

        public Builder() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                java.util.List r0 = (java.util.List) r0
                r2.namesAndValues = r0
                return
        }

        public final okhttp3.Headers.Builder add(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r8
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                r2 = r9
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r6 = 6
                r7 = 0
                r3 = 58
                r4 = 0
                r5 = 0
                int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
                r3 = -1
                if (r2 == r3) goto L1b
                r3 = 1
                goto L1c
            L1b:
                r3 = r4
            L1c:
                if (r3 == 0) goto L44
                java.lang.String r3 = r9.substring(r4, r2)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                int r4 = r2 + 1
                java.lang.String r4 = r9.substring(r4)
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                r0.add(r3, r4)
                r0 = r8
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
            L44:
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Unexpected header: "
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r9)
                java.lang.String r3 = r4.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public final okhttp3.Headers.Builder add(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r2, r4)
                okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkValue(r2, r5, r4)
                r0.addLenient$okhttp(r4, r5)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder add(java.lang.String r6, java.time.Instant r7) {
                r5 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r5
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                java.util.Date r2 = new java.util.Date
                long r3 = r7.toEpochMilli()
                r2.<init>(r3)
                r0.add(r6, r2)
                r0 = r5
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder add(java.lang.String r4, java.util.Date r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                java.lang.String r2 = okhttp3.internal.http.DatesKt.toHttpDateString(r5)
                r0.add(r4, r2)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder addAll(okhttp3.Headers r7) {
                r6 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r6
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                r2 = 0
                int r3 = r7.size()
            Le:
                if (r2 >= r3) goto L1e
                java.lang.String r4 = r7.name(r2)
                java.lang.String r5 = r7.value(r2)
                r0.addLenient$okhttp(r4, r5)
                int r2 = r2 + 1
                goto Le
            L1e:
                r0 = r6
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "line"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r8
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                r2 = r9
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r6 = 4
                r7 = 0
                r3 = 58
                r4 = 1
                r5 = 0
                int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
                r3 = -1
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r2 == r3) goto L32
                java.lang.String r3 = r9.substring(r5, r2)
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                int r5 = r2 + 1
                java.lang.String r5 = r9.substring(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
                r0.addLenient$okhttp(r3, r5)
                goto L4b
            L32:
                char r3 = r9.charAt(r5)
                r5 = 58
                java.lang.String r6 = ""
                if (r3 != r5) goto L48
                r3 = 1
                java.lang.String r3 = r9.substring(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r0.addLenient$okhttp(r6, r3)
                goto L4b
            L48:
                r0.addLenient$okhttp(r6, r9)
            L4b:
                r0 = r8
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder addLenient$okhttp(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = r4
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                java.util.List<java.lang.String> r2 = r0.namesAndValues
                r2.add(r5)
                java.util.List<java.lang.String> r2 = r0.namesAndValues
                r3 = r6
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                r2.add(r3)
                r0 = r4
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder addUnsafeNonAscii(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r2, r4)
                r0.addLenient$okhttp(r4, r5)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers build() {
                r5 = this;
                okhttp3.Headers r0 = new okhttp3.Headers
                java.util.List<java.lang.String> r1 = r5.namesAndValues
                java.util.Collection r1 = (java.util.Collection) r1
                r2 = 0
                r3 = r1
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r1 = r3.toArray(r4)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        public final java.lang.String get(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.List<java.lang.String> r0 = r4.namesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = r0
                r2 = 0
                r3 = -2
                int r0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r0, r2, r3)
                if (r0 > r1) goto L35
            L16:
                java.util.List<java.lang.String> r2 = r4.namesAndValues
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                boolean r2 = kotlin.text.StringsKt.equals(r5, r2, r3)
                if (r2 == 0) goto L30
                java.util.List<java.lang.String> r0 = r4.namesAndValues
                int r2 = r1 + 1
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L30:
                if (r1 == r0) goto L35
                int r1 = r1 + (-2)
                goto L16
            L35:
                r0 = 0
                return r0
        }

        public final java.util.List<java.lang.String> getNamesAndValues$okhttp() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.namesAndValues
                return r0
        }

        public final okhttp3.Headers.Builder removeAll(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = r5
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                r2 = 0
            La:
                java.util.List<java.lang.String> r3 = r0.namesAndValues
                int r3 = r3.size()
                if (r2 >= r3) goto L30
                java.util.List<java.lang.String> r3 = r0.namesAndValues
                java.lang.Object r3 = r3.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = kotlin.text.StringsKt.equals(r6, r3, r4)
                if (r3 == 0) goto L2d
                java.util.List<java.lang.String> r3 = r0.namesAndValues
                r3.remove(r2)
                java.util.List<java.lang.String> r3 = r0.namesAndValues
                r3.remove(r2)
                int r2 = r2 + (-2)
            L2d:
                int r2 = r2 + 2
                goto La
            L30:
                r0 = r5
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder set(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkName(r2, r4)
                okhttp3.Headers$Companion r2 = okhttp3.Headers.Companion
                okhttp3.Headers.Companion.access$checkValue(r2, r5, r4)
                r0.removeAll(r4)
                r0.addLenient$okhttp(r4, r5)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }

        public final okhttp3.Headers.Builder set(java.lang.String r6, java.time.Instant r7) {
                r5 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = r5
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                java.util.Date r2 = new java.util.Date
                long r3 = r7.toEpochMilli()
                r2.<init>(r3)
                okhttp3.Headers$Builder r2 = r0.set(r6, r2)
                return r2
        }

        public final okhttp3.Headers.Builder set(java.lang.String r4, java.util.Date r5) {
                r3 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                r1 = 0
                java.lang.String r2 = okhttp3.internal.http.DatesKt.toHttpDateString(r5)
                r0.set(r4, r2)
                r0 = r3
                okhttp3.Headers$Builder r0 = (okhttp3.Headers.Builder) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: Headers.kt */
    @kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, m115d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public static final /* synthetic */ void access$checkName(okhttp3.Headers.Companion r0, java.lang.String r1) {
                r0.checkName(r1)
                return
        }

        public static final /* synthetic */ void access$checkValue(okhttp3.Headers.Companion r0, java.lang.String r1, java.lang.String r2) {
                r0.checkValue(r1, r2)
                return
        }

        public static final /* synthetic */ java.lang.String access$get(okhttp3.Headers.Companion r1, java.lang.String[] r2, java.lang.String r3) {
                java.lang.String r0 = r1.get(r2, r3)
                return r0
        }

        private final void checkName(java.lang.String r7) {
                r6 = this;
                r0 = r7
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto Ld
                r0 = r1
                goto Le
            Ld:
                r0 = r2
            Le:
                if (r0 == 0) goto L49
                r0 = 0
                int r3 = r7.length()
            L15:
                if (r0 >= r3) goto L48
                char r4 = r7.charAt(r0)
                r5 = 33
                if (r5 > r4) goto L25
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L25
                r5 = r1
                goto L26
            L25:
                r5 = r2
            L26:
                if (r5 == 0) goto L2b
                int r0 = r0 + 1
                goto L15
            L2b:
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r7}
                java.lang.String r3 = "Unexpected char %#04x at %d in header name: %s"
                java.lang.String r1 = okhttp3.internal.Util.format(r3, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L48:
                return
            L49:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "name is empty"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private final void checkValue(java.lang.String r7, java.lang.String r8) {
                r6 = this;
                r0 = 0
                int r1 = r7.length()
            L5:
                if (r0 >= r1) goto L6f
                char r2 = r7.charAt(r0)
                r3 = 9
                r4 = 1
                if (r2 == r3) goto L20
                r3 = 32
                r5 = 0
                if (r3 > r2) goto L1b
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 >= r3) goto L1b
                r3 = r4
                goto L1c
            L1b:
                r3 = r5
            L1c:
                if (r3 == 0) goto L1f
                goto L20
            L1f:
                r4 = r5
            L20:
                if (r4 != 0) goto L6c
                r1 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r8}
                java.lang.String r5 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r4 = okhttp3.internal.Util.format(r5, r4)
                java.lang.StringBuilder r3 = r3.append(r4)
                boolean r4 = okhttp3.internal.Util.isSensitiveHeader(r8)
                if (r4 == 0) goto L47
                java.lang.String r4 = ""
                goto L5a
            L47:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = ": "
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r7)
                java.lang.String r4 = r4.toString()
            L5a:
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r1 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r3.<init>(r1)
                throw r3
            L6c:
                int r0 = r0 + 1
                goto L5
            L6f:
                return
        }

        private final java.lang.String get(java.lang.String[] r5, java.lang.String r6) {
                r4 = this;
                int r0 = r5.length
                int r0 = r0 + (-2)
                r1 = r0
                r2 = 0
                r3 = -2
                int r0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r0, r2, r3)
                if (r0 > r1) goto L1f
            Lc:
                r2 = r5[r1]
                r3 = 1
                boolean r2 = kotlin.text.StringsKt.equals(r6, r2, r3)
                if (r2 == 0) goto L1a
                int r0 = r1 + 1
                r0 = r5[r0]
                return r0
            L1a:
                if (r1 == r0) goto L1f
                int r1 = r1 + (-2)
                goto Lc
            L1f:
                r0 = 0
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @kotlin.ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m10282deprecated_of(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Headers r0 = r1.m141of(r2)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "function name changed", replaceWith = @kotlin.ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final okhttp3.Headers m10283deprecated_of(java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                int r0 = r2.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r0 = (java.lang.String[]) r0
                okhttp3.Headers r0 = r1.m142of(r0)
                return r0
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okhttp3.Headers m141of(java.util.Map<java.lang.String, java.lang.String> r9) {
                r8 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                int r0 = r9.size()
                int r0 = r0 * 2
                java.lang.String[] r0 = new java.lang.String[r0]
                r1 = 0
                java.util.Set r2 = r9.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L16:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r5 = r5.toString()
                r6 = r3
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
                java.lang.String r6 = r6.toString()
                r8.checkName(r5)
                r8.checkValue(r6, r5)
                r0[r1] = r5
                int r7 = r1 + 1
                r0[r7] = r6
                int r1 = r1 + 2
                goto L16
            L54:
                okhttp3.Headers r2 = new okhttp3.Headers
                r3 = 0
                r2.<init>(r0, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        /* JADX INFO: renamed from: of */
        public final okhttp3.Headers m142of(java.lang.String... r8) {
                r7 = this;
                java.lang.String r0 = "namesAndValues"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r0 = r8.length
                r1 = 2
                int r0 = r0 % r1
                r2 = 0
                r3 = 1
                if (r0 != 0) goto Le
                r0 = r3
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L65
                java.lang.Object r0 = r8.clone()
                java.lang.String[] r0 = (java.lang.String[]) r0
                r4 = 0
                int r5 = r0.length
            L19:
                if (r4 >= r5) goto L43
                r6 = r0[r4]
                if (r6 == 0) goto L21
                r6 = r3
                goto L22
            L21:
                r6 = r2
            L22:
                if (r6 == 0) goto L35
                r6 = r0[r4]
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
                java.lang.String r6 = r6.toString()
                r0[r4] = r6
                int r4 = r4 + 1
                goto L19
            L35:
                r1 = 0
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Headers cannot be null"
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L43:
                int r3 = r0.length
                int r3 = r3 + (-1)
                r4 = 0
                int r1 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r2, r3, r1)
                if (r4 > r1) goto L5e
            L4d:
                r2 = r0[r4]
                int r3 = r4 + 1
                r3 = r0[r3]
                r7.checkName(r2)
                r7.checkValue(r3, r2)
                if (r4 == r1) goto L5e
                int r4 = r4 + 2
                goto L4d
            L5e:
                okhttp3.Headers r1 = new okhttp3.Headers
                r2 = 0
                r1.<init>(r0, r2)
                return r1
            L65:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected alternating header names and values"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
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

    public /* synthetic */ Headers(java.lang.String[] r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okhttp3.Headers m139of(java.util.Map<java.lang.String, java.lang.String> r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r0 = r0.m141of(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: of */
    public static final okhttp3.Headers m140of(java.lang.String... r1) {
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            okhttp3.Headers r0 = r0.m142of(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m10281deprecated_size() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    public final long byteCount() {
            r6 = this;
            java.lang.String[] r0 = r6.namesAndValues
            int r0 = r0.length
            int r0 = r0 * 2
            long r0 = (long) r0
            r2 = 0
            java.lang.String[] r3 = r6.namesAndValues
            int r3 = r3.length
        La:
            if (r2 >= r3) goto L19
            java.lang.String[] r4 = r6.namesAndValues
            r4 = r4[r2]
            int r4 = r4.length()
            long r4 = (long) r4
            long r0 = r0 + r4
            int r2 = r2 + 1
            goto La
        L19:
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Headers
            if (r0 == 0) goto L13
            java.lang.String[] r0 = r2.namesAndValues
            r1 = r3
            okhttp3.Headers r1 = (okhttp3.Headers) r1
            java.lang.String[] r1 = r1.namesAndValues
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public final java.lang.String get(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Headers$Companion r0 = okhttp3.Headers.Companion
            java.lang.String[] r1 = r2.namesAndValues
            java.lang.String r0 = okhttp3.Headers.Companion.access$get(r0, r1, r3)
            return r0
    }

    public final java.util.Date getDate(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r1.get(r2)
            if (r0 == 0) goto L10
            java.util.Date r0 = okhttp3.internal.http.DatesKt.toHttpDateOrNull(r0)
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final java.time.Instant getInstant(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Date r0 = r2.getDate(r3)
            if (r0 == 0) goto L10
            java.time.Instant r1 = r0.toInstant()
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.namesAndValues
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> iterator() {
            r5 = this;
            int r0 = r5.size()
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1a
            java.lang.String r3 = r5.name(r2)
            java.lang.String r4 = r5.value(r2)
            kotlin.Pair r3 = kotlin.TuplesKt.m122to(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L1a:
            java.util.Iterator r0 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r1)
            return r0
    }

    public final java.lang.String name(int r3) {
            r2 = this;
            java.lang.String[] r0 = r2.namesAndValues
            int r1 = r3 * 2
            r0 = r0[r1]
            return r0
    }

    public final java.util.Set<java.lang.String> names() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r1 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r1)
            r0.<init>(r1)
            r1 = 0
            int r2 = r4.size()
        L10:
            if (r1 >= r2) goto L1c
            java.lang.String r3 = r4.name(r1)
            r0.add(r3)
            int r1 = r1 + 1
            goto L10
        L1c:
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r2 = "unmodifiableSet(result)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final okhttp3.Headers.Builder newBuilder() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.List r1 = r0.getNamesAndValues$okhttp()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r2 = r3.namesAndValues
            kotlin.collections.CollectionsKt.addAll(r1, r2)
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
            r7 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r1 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r1)
            r0.<init>(r1)
            r1 = 0
            int r2 = r7.size()
        L10:
            if (r1 >= r2) goto L47
            java.lang.String r3 = r7.name(r1)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L3d
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
            r4 = r5
            java.util.List r4 = (java.util.List) r4
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r3, r4)
        L3d:
            java.lang.String r5 = r7.value(r1)
            r4.add(r5)
            int r1 = r1 + 1
            goto L10
        L47:
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = 0
            int r4 = r8.size()
        Lc:
            if (r3 >= r4) goto L33
            java.lang.String r5 = r8.name(r3)
            java.lang.String r6 = r8.value(r3)
            r1.append(r5)
            java.lang.String r7 = ": "
            r1.append(r7)
            boolean r7 = okhttp3.internal.Util.isSensitiveHeader(r5)
            if (r7 == 0) goto L27
            java.lang.String r7 = "██"
            goto L28
        L27:
            r7 = r6
        L28:
            r1.append(r7)
            java.lang.String r7 = "\n"
            r1.append(r7)
            int r3 = r3 + 1
            goto Lc
        L33:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String value(int r3) {
            r2 = this;
            java.lang.String[] r0 = r2.namesAndValues
            int r1 = r3 * 2
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }

    public final java.util.List<java.lang.String> values(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r5.size()
        Lb:
            if (r1 >= r2) goto L2d
            java.lang.String r3 = r5.name(r1)
            r4 = 1
            boolean r3 = kotlin.text.StringsKt.equals(r6, r3, r4)
            if (r3 == 0) goto L2a
            if (r0 != 0) goto L23
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            r0 = r3
            java.util.List r0 = (java.util.List) r0
        L23:
            java.lang.String r3 = r5.value(r1)
            r0.add(r3)
        L2a:
            int r1 = r1 + 1
            goto Lb
        L2d:
            if (r0 == 0) goto L39
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r2 = "{\n      Collections.unmodifiableList(result)\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L3d
        L39:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L3d:
            return r1
    }
}
