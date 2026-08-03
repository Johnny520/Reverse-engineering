package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.INumberEncodeValue;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.EncodeValueByte;
import org.luckypray.dexkit.query.matchers.EncodeValueDouble;
import org.luckypray.dexkit.query.matchers.EncodeValueFloat;
import org.luckypray.dexkit.query.matchers.EncodeValueInt;
import org.luckypray.dexkit.query.matchers.EncodeValueLong;
import org.luckypray.dexkit.query.matchers.EncodeValueShort;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class NumberEncodeValueMatcher {
    public static final Companion Companion = null;
    private /* synthetic */ NumberEncodeValueType type;
    private /* synthetic */ INumberEncodeValue value;

    public static final class Companion {
        private Companion() {
        }

        public final NumberEncodeValueMatcher create() {
            return new NumberEncodeValueMatcher();
        }

        public final NumberEncodeValueMatcher createByte(byte r2) {
            return new NumberEncodeValueMatcher().byteValue(r2);
        }

        public final NumberEncodeValueMatcher createDouble(double r2) {
            return new NumberEncodeValueMatcher().doubleValue(r2);
        }

        public final NumberEncodeValueMatcher createFloat(float r2) {
            return new NumberEncodeValueMatcher().floatValue(r2);
        }

        public final NumberEncodeValueMatcher createInt(int r2) {
            return new NumberEncodeValueMatcher().intValue(r2);
        }

        public final NumberEncodeValueMatcher createLong(long r2) {
            return new NumberEncodeValueMatcher().longValue(r2);
        }

        public final NumberEncodeValueMatcher createShort(short r2) {
            return new NumberEncodeValueMatcher().shortValue(r2);
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final NumberEncodeValueMatcher create(Number r2) {
            AbstractC0307g.m703e(r2, "value");
            return new NumberEncodeValueMatcher().value(r2);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public NumberEncodeValueMatcher() {
    }

    public static final NumberEncodeValueMatcher create() {
        return Companion.create();
    }

    public static final NumberEncodeValueMatcher createByte(byte r1) {
        return Companion.createByte(r1);
    }

    public static final NumberEncodeValueMatcher createDouble(double r1) {
        return Companion.createDouble(r1);
    }

    public static final NumberEncodeValueMatcher createFloat(float r1) {
        return Companion.createFloat(r1);
    }

    public static final NumberEncodeValueMatcher createInt(int r1) {
        return Companion.createInt(r1);
    }

    public static final NumberEncodeValueMatcher createLong(long r1) {
        return Companion.createLong(r1);
    }

    public static final NumberEncodeValueMatcher createShort(short r1) {
        return Companion.createShort(r1);
    }

    public final NumberEncodeValueMatcher byteValue(byte r2) {
        this.value = new EncodeValueByte(r2);
        this.type = NumberEncodeValueType.ByteValue;
        return this;
    }

    public final NumberEncodeValueMatcher doubleValue(double r2) {
        this.value = new EncodeValueDouble(r2);
        this.type = NumberEncodeValueType.DoubleValue;
        return this;
    }

    public final NumberEncodeValueMatcher floatValue(float r2) {
        this.value = new EncodeValueFloat(r2);
        this.type = NumberEncodeValueType.FloatValue;
        return this;
    }

    public final NumberEncodeValueType getType() {
        return this.type;
    }

    public final INumberEncodeValue getValue() {
        return this.value;
    }

    public final NumberEncodeValueMatcher intValue(int r2) {
        this.value = new EncodeValueInt(r2);
        this.type = NumberEncodeValueType.IntValue;
        return this;
    }

    public final NumberEncodeValueMatcher longValue(long r2) {
        this.value = new EncodeValueLong(r2);
        this.type = NumberEncodeValueType.LongValue;
        return this;
    }

    public final NumberEncodeValueMatcher shortValue(short r2) {
        this.value = new EncodeValueShort(r2);
        this.type = NumberEncodeValueType.ShortValue;
        return this;
    }

    public final NumberEncodeValueMatcher value(Number r3) {
        AbstractC0307g.m703e(r3, "number");
        if ((r3 instanceof Byte) == false) goto L6;
        byteValue(r3.byteValue());
    L20:
        return this;
    L6:
        if ((r3 instanceof Short) == false) goto L9;
        shortValue(r3.shortValue());
        goto L20
    L9:
        if ((r3 instanceof Integer) == false) goto L12;
        intValue(r3.intValue());
        goto L20
    L12:
        if ((r3 instanceof Long) == false) goto L15;
        longValue(r3.longValue());
        goto L20
    L15:
        if ((r3 instanceof Float) == false) goto L18;
        floatValue(r3.floatValue());
        goto L20
    L18:
        if ((r3 instanceof Double) == false) goto L20;
        doubleValue(r3.doubleValue());
        goto L20
    }

    public NumberEncodeValueMatcher(Number r2) {
        AbstractC0307g.m703e(r2, "value");
        value(r2);
    }

    public static final NumberEncodeValueMatcher create(Number r1) {
        return Companion.create(r1);
    }

    private NumberEncodeValueMatcher(INumberEncodeValue r1, NumberEncodeValueType r2) {
        this.value = r1;
        this.type = r2;
    }
}
