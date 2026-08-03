package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004R\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "", "()V", "value", "", "(Ljava/lang/Number;)V", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "type", "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V", "<set-?>", "getType", "()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "getValue", "()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "byteValue", "", "doubleValue", "", "floatValue", "", "intValue", "", "longValue", "", "shortValue", "", "number", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NumberEncodeValueMatcher {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion Companion = null;
    private /* synthetic */ org.luckypray.dexkit.query.enums.NumberEncodeValueType type;
    private /* synthetic */ org.luckypray.dexkit.query.base.INumberEncodeValue value;

    @Yue.InterfaceC4201(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "value", "", "createByte", "", "createDouble", "", "createFloat", "", "createInt", "", "createLong", "", "createShort", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(@Yue.InterfaceC4418 java.lang.Number r2) {
                r1 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.value(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.byteValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.doubleValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.floatValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.intValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.longValue(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r2) {
                r1 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r2 = r0.shortValue(r2)
                return r2
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

    public NumberEncodeValueMatcher(@Yue.InterfaceC4418 java.lang.Number r2) {
            r1 = this;
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
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

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.create()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(@Yue.InterfaceC4418 java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.create(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createByte(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createDouble(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createFloat(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createInt(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createLong(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createShort(r1)
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueByte r0 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ByteValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r0 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.DoubleValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r0 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.FloatValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.enums.NumberEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = r1.type
            return r0
    }

    @Yue.InterfaceC4543
    public final org.luckypray.dexkit.query.base.INumberEncodeValue getValue() {
            r1 = this;
            org.luckypray.dexkit.query.base.INumberEncodeValue r0 = r1.value
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueInt r0 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.IntValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueLong r0 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.LongValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueShort r0 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ShortValue
            r1.type = r2
            return r1
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher value(@Yue.InterfaceC4418 java.lang.Number r3) {
            r2 = this;
            java.lang.String r0 = "number"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto L11
            byte r3 = r3.byteValue()
            r2.byteValue(r3)
            goto L4c
        L11:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1d
            short r3 = r3.shortValue()
            r2.shortValue(r3)
            goto L4c
        L1d:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L29
            int r3 = r3.intValue()
            r2.intValue(r3)
            goto L4c
        L29:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L35
            long r0 = r3.longValue()
            r2.longValue(r0)
            goto L4c
        L35:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L41
            float r3 = r3.floatValue()
            r2.floatValue(r3)
            goto L4c
        L41:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4c
            double r0 = r3.doubleValue()
            r2.doubleValue(r0)
        L4c:
            return r2
    }
}
