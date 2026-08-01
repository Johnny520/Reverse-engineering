package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: NumberEncodeValueMatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004R\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "", "()V", "value", "", "(Ljava/lang/Number;)V", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "type", "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V", "<set-?>", "getType", "()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "getValue", "()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "byteValue", "", "doubleValue", "", "floatValue", "", "intValue", "", "longValue", "", "shortValue", "", "number", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class NumberEncodeValueMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion Companion = null;
    private /* synthetic */ org.luckypray.dexkit.query.enums.NumberEncodeValueType type;
    private /* synthetic */ org.luckypray.dexkit.query.base.INumberEncodeValue value;

    /* JADX INFO: compiled from: NumberEncodeValueMatcher.kt */
    @kotlin.Metadata(m114d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "value", "", "createByte", "", "createDouble", "", "createFloat", "", "createInt", "", "createLong", "", "createShort", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(java.lang.Number r2) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.value(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.byteValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.doubleValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.floatValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.intValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.longValue(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.shortValue(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion = r0
            return
    }

    public NumberEncodeValueMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public NumberEncodeValueMatcher(java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.value(r2)
            return
    }

    private NumberEncodeValueMatcher(org.luckypray.dexkit.query.base.INumberEncodeValue r1, org.luckypray.dexkit.query.enums.NumberEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.create()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.create(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createByte(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createDouble(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createFloat(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createInt(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createLong(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.createShort(r1)
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher byteValue(byte r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueByte r2 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ByteValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher doubleValue(double r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r2 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.DoubleValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher floatValue(float r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r2 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.FloatValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.enums.NumberEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = r1.type
            return r0
    }

    public final org.luckypray.dexkit.query.base.INumberEncodeValue getValue() {
            r1 = this;
            org.luckypray.dexkit.query.base.INumberEncodeValue r0 = r1.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher intValue(int r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueInt r2 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.IntValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher longValue(long r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueLong r2 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.LongValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher shortValue(short r4) {
            r3 = this;
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            org.luckypray.dexkit.query.matchers.EncodeValueShort r2 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r2.<init>(r4)
            org.luckypray.dexkit.query.base.INumberEncodeValue r2 = (org.luckypray.dexkit.query.base.INumberEncodeValue) r2
            r3.value = r2
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ShortValue
            r3.type = r2
            r0 = r3
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher value(java.lang.Number r5) {
            r4 = this;
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            r1 = 0
            boolean r2 = r5 instanceof java.lang.Byte
            if (r2 == 0) goto L16
            byte r2 = r5.byteValue()
            r4.byteValue(r2)
            goto L51
        L16:
            boolean r2 = r5 instanceof java.lang.Short
            if (r2 == 0) goto L22
            short r2 = r5.shortValue()
            r4.shortValue(r2)
            goto L51
        L22:
            boolean r2 = r5 instanceof java.lang.Integer
            if (r2 == 0) goto L2e
            int r2 = r5.intValue()
            r4.intValue(r2)
            goto L51
        L2e:
            boolean r2 = r5 instanceof java.lang.Long
            if (r2 == 0) goto L3a
            long r2 = r5.longValue()
            r4.longValue(r2)
            goto L51
        L3a:
            boolean r2 = r5 instanceof java.lang.Float
            if (r2 == 0) goto L46
            float r2 = r5.floatValue()
            r4.floatValue(r2)
            goto L51
        L46:
            boolean r2 = r5 instanceof java.lang.Double
            if (r2 == 0) goto L51
            double r2 = r5.doubleValue()
            r4.doubleValue(r2)
        L51:
            r0 = r4
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = (org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher) r0
            return r0
    }
}
