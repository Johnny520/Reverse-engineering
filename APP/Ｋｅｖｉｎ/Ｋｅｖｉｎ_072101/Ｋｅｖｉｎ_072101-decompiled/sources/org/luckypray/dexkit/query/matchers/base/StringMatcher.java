package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: StringMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B#\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R$\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "value", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "(Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;Z)V", "<set-?>", "getIgnoreCase", "()Z", "setIgnoreCase", "(Z)V", "getMatchType", "()Lorg/luckypray/dexkit/query/enums/StringMatchType;", "setMatchType", "(Lorg/luckypray/dexkit/query/enums/StringMatchType;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class StringMatcher extends org.luckypray.dexkit.query.base.BaseQuery implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion Companion = null;
    private boolean ignoreCase;
    private org.luckypray.dexkit.query.enums.StringMatchType matchType;
    private java.lang.String value;

    /* JADX INFO: compiled from: StringMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/StringMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/StringMatcher;", "value", "", "matchType", "Lorg/luckypray/dexkit/query/enums/StringMatchType;", "ignoreCase", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        public static /* synthetic */ org.luckypray.dexkit.query.matchers.base.StringMatcher create$default(org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion r0, java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, java.lang.Object r5) {
                r5 = r4 & 2
                if (r5 == 0) goto L6
                org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto Lb
                r3 = 0
            Lb:
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r5 = 6
                r6 = 0
                r3 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = create$default(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
                r7 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = create$default(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "matchType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher
                r0.<init>(r2, r3, r4)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion = r0
            return
    }

    public StringMatcher() {
            r1 = this;
            r1.<init>()
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            r1.matchType = r0
            return
    }

    public StringMatcher(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public StringMatcher(java.lang.String r8, org.luckypray.dexkit.query.enums.StringMatchType r9) {
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public StringMatcher(java.lang.String r2, org.luckypray.dexkit.query.enums.StringMatchType r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            r1.matchType = r0
            r1.value = r2
            r1.matchType = r3
            r1.ignoreCase = r4
            return
    }

    public /* synthetic */ StringMatcher(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.<init>(r1, r2, r3)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.StringMatcher create(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            org.luckypray.dexkit.query.matchers.base.StringMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.StringMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = r0.create(r1, r2, r3)
            return r0
    }

    public final boolean getIgnoreCase() {
            r1 = this;
            boolean r0 = r1.ignoreCase
            return r0
    }

    public final org.luckypray.dexkit.query.enums.StringMatchType getMatchType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.StringMatchType r0 = r1.matchType
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher ignoreCase(boolean r3) {
            r2 = this;
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            r1 = 0
            r2.ignoreCase = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r5) {
            r4 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r4.value
            if (r0 == 0) goto L40
            java.lang.String r0 = r4.value
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L25
            org.luckypray.dexkit.query.enums.StringMatchType r0 = r4.matchType
            org.luckypray.dexkit.query.enums.StringMatchType r1 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            if (r0 == r1) goto L25
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            r4.matchType = r0
        L25:
            org.luckypray.dexkit.schema.-StringMatcher$Companion r0 = org.luckypray.dexkit.schema.StringMatcher.Companion
            java.lang.String r1 = r4.value
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r5.createString(r1)
            org.luckypray.dexkit.query.enums.StringMatchType r2 = r4.matchType
            byte r2 = r2.getValue()
            boolean r3 = r4.ignoreCase
            int r0 = r0.createStringMatcher(r5, r1, r2, r3)
            r5.finish(r0)
            return r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "value must not be null"
            r0.<init>(r1)
            throw r0
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher matchType(org.luckypray.dexkit.query.enums.StringMatchType r3) {
            r2 = this;
            java.lang.String r0 = "matchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            r1 = 0
            r2.matchType = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            return r0
    }

    public final /* synthetic */ void setIgnoreCase(boolean r1) {
            r0 = this;
            r0.ignoreCase = r1
            return
    }

    public final /* synthetic */ void setMatchType(org.luckypray.dexkit.query.enums.StringMatchType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.matchType = r2
            return
    }

    public final /* synthetic */ void setValue(java.lang.String r1) {
            r0 = this;
            r0.value = r1
            return
    }

    public final org.luckypray.dexkit.query.matchers.base.StringMatcher value(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            r1 = 0
            r2.value = r3
            r0 = r2
            org.luckypray.dexkit.query.matchers.base.StringMatcher r0 = (org.luckypray.dexkit.query.matchers.base.StringMatcher) r0
            return r0
    }
}
