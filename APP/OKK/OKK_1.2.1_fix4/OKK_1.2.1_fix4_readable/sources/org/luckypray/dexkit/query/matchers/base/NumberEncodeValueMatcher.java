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
    public static final Companion Companion = new Companion(null);
    private /* synthetic */ NumberEncodeValueType type;
    private /* synthetic */ INumberEncodeValue value;

    public static final class Companion {
        private Companion() {
        }

        public final NumberEncodeValueMatcher create() {
            return new NumberEncodeValueMatcher();
        }

        public final NumberEncodeValueMatcher createByte(byte b2) {
            return new NumberEncodeValueMatcher().byteValue(b2);
        }

        public final NumberEncodeValueMatcher createDouble(double d2) {
            return new NumberEncodeValueMatcher().doubleValue(d2);
        }

        public final NumberEncodeValueMatcher createFloat(float f2) {
            return new NumberEncodeValueMatcher().floatValue(f2);
        }

        public final NumberEncodeValueMatcher createInt(int i2) {
            return new NumberEncodeValueMatcher().intValue(i2);
        }

        public final NumberEncodeValueMatcher createLong(long j2) {
            return new NumberEncodeValueMatcher().longValue(j2);
        }

        public final NumberEncodeValueMatcher createShort(short s2) {
            return new NumberEncodeValueMatcher().shortValue(s2);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final NumberEncodeValueMatcher create(Number number) {
            AbstractC0307g.m703e(number, "value");
            return new NumberEncodeValueMatcher().value(number);
        }
    }

    public NumberEncodeValueMatcher() {
    }

    public static final NumberEncodeValueMatcher create() {
        return Companion.create();
    }

    public static final NumberEncodeValueMatcher createByte(byte b2) {
        return Companion.createByte(b2);
    }

    public static final NumberEncodeValueMatcher createDouble(double d2) {
        return Companion.createDouble(d2);
    }

    public static final NumberEncodeValueMatcher createFloat(float f2) {
        return Companion.createFloat(f2);
    }

    public static final NumberEncodeValueMatcher createInt(int i2) {
        return Companion.createInt(i2);
    }

    public static final NumberEncodeValueMatcher createLong(long j2) {
        return Companion.createLong(j2);
    }

    public static final NumberEncodeValueMatcher createShort(short s2) {
        return Companion.createShort(s2);
    }

    public final NumberEncodeValueMatcher byteValue(byte b2) {
        this.value = new EncodeValueByte(b2);
        this.type = NumberEncodeValueType.ByteValue;
        return this;
    }

    public final NumberEncodeValueMatcher doubleValue(double d2) {
        this.value = new EncodeValueDouble(d2);
        this.type = NumberEncodeValueType.DoubleValue;
        return this;
    }

    public final NumberEncodeValueMatcher floatValue(float f2) {
        this.value = new EncodeValueFloat(f2);
        this.type = NumberEncodeValueType.FloatValue;
        return this;
    }

    public final NumberEncodeValueType getType() {
        return this.type;
    }

    public final INumberEncodeValue getValue() {
        return this.value;
    }

    public final NumberEncodeValueMatcher intValue(int i2) {
        this.value = new EncodeValueInt(i2);
        this.type = NumberEncodeValueType.IntValue;
        return this;
    }

    public final NumberEncodeValueMatcher longValue(long j2) {
        this.value = new EncodeValueLong(j2);
        this.type = NumberEncodeValueType.LongValue;
        return this;
    }

    public final NumberEncodeValueMatcher shortValue(short s2) {
        this.value = new EncodeValueShort(s2);
        this.type = NumberEncodeValueType.ShortValue;
        return this;
    }

    public final NumberEncodeValueMatcher value(Number number) {
        AbstractC0307g.m703e(number, "number");
        if (number instanceof Byte) {
            byteValue(number.byteValue());
        } else if (number instanceof Short) {
            shortValue(number.shortValue());
        } else if (number instanceof Integer) {
            intValue(number.intValue());
        } else if (number instanceof Long) {
            longValue(number.longValue());
        } else if (number instanceof Float) {
            floatValue(number.floatValue());
        } else if (number instanceof Double) {
            doubleValue(number.doubleValue());
        }
        return this;
    }

    public NumberEncodeValueMatcher(Number number) {
        AbstractC0307g.m703e(number, "value");
        value(number);
    }

    public static final NumberEncodeValueMatcher create(Number number) {
        return Companion.create(number);
    }

    private NumberEncodeValueMatcher(INumberEncodeValue iNumberEncodeValue, NumberEncodeValueType numberEncodeValueType) {
        this.value = iNumberEncodeValue;
        this.type = numberEncodeValueType;
    }
}
