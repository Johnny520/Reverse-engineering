package org.luckypray.dexkit.query.matchers.base;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class NumberEncodeValueMatcher {
    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion Companion = null;
    private /* synthetic */ org.luckypray.dexkit.query.enums.NumberEncodeValueType type;
    private /* synthetic */ org.luckypray.dexkit.query.base.INumberEncodeValue value;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(java.lang.Number r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.value(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.byteValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.doubleValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.floatValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.intValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.longValue(r1)
                return r0
        }

        public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r1) {
                r0 = this;
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = new org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher
                r0.<init>()
                org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.shortValue(r1)
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

    public NumberEncodeValueMatcher(java.lang.Number r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.value(r1)
            return
    }

    private NumberEncodeValueMatcher(org.luckypray.dexkit.query.base.INumberEncodeValue r1, org.luckypray.dexkit.query.enums.NumberEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create() {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r0 = r0.create()
            return r0
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher create(java.lang.Number r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createByte(byte r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createByte(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createDouble(double r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createDouble(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createFloat(float r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createFloat(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createInt(int r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createInt(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createLong(long r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createLong(r1)
            return r1
    }

    public static final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher createShort(short r1) {
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher$Companion r0 = org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion
            org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher r1 = r0.createShort(r1)
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher byteValue(byte r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueByte r0 = new org.luckypray.dexkit.query.matchers.EncodeValueByte
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ByteValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher doubleValue(double r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueDouble r0 = new org.luckypray.dexkit.query.matchers.EncodeValueDouble
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.DoubleValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher floatValue(float r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueFloat r0 = new org.luckypray.dexkit.query.matchers.EncodeValueFloat
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.FloatValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.enums.NumberEncodeValueType getType() {
            r0 = this;
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = r0.type
            return r0
    }

    public final org.luckypray.dexkit.query.base.INumberEncodeValue getValue() {
            r0 = this;
            org.luckypray.dexkit.query.base.INumberEncodeValue r0 = r0.value
            return r0
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher intValue(int r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueInt r0 = new org.luckypray.dexkit.query.matchers.EncodeValueInt
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.IntValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher longValue(long r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueLong r0 = new org.luckypray.dexkit.query.matchers.EncodeValueLong
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.LongValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher shortValue(short r2) {
            r1 = this;
            org.luckypray.dexkit.query.matchers.EncodeValueShort r0 = new org.luckypray.dexkit.query.matchers.EncodeValueShort
            r0.<init>(r2)
            r1.value = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ShortValue
            r1.type = r2
            return r1
    }

    public final org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher value(java.lang.Number r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof java.lang.Byte
            if (r0 == 0) goto Lf
            byte r3 = r3.byteValue()
            r2.byteValue(r3)
            return r2
        Lf:
            boolean r0 = r3 instanceof java.lang.Short
            if (r0 == 0) goto L1b
            short r3 = r3.shortValue()
            r2.shortValue(r3)
            return r2
        L1b:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L27
            int r3 = r3.intValue()
            r2.intValue(r3)
            return r2
        L27:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L33
            long r0 = r3.longValue()
            r2.longValue(r0)
            return r2
        L33:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L3f
            float r3 = r3.floatValue()
            r2.floatValue(r3)
            return r2
        L3f:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L4a
            double r0 = r3.doubleValue()
            r2.doubleValue(r0)
        L4a:
            return r2
    }
}
