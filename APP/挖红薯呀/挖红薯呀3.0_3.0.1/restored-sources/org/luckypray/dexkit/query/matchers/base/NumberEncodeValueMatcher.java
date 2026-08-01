package org.luckypray.dexkit.query.matchers.base;

import org.luckypray.dexkit.query.base.INumberEncodeValue;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.EncodeValueByte;
import org.luckypray.dexkit.query.matchers.EncodeValueDouble;
import org.luckypray.dexkit.query.matchers.EncodeValueFloat;
import org.luckypray.dexkit.query.matchers.EncodeValueInt;
import org.luckypray.dexkit.query.matchers.EncodeValueLong;
import org.luckypray.dexkit.query.matchers.EncodeValueShort;
import p000.AbstractC0619pl;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberEncodeValueMatcher {
    public static final Companion Companion = new Companion(null);
    private /* synthetic */ NumberEncodeValueType type;
    private /* synthetic */ INumberEncodeValue value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NumberEncodeValueMatcher(Number number) {
        number.getClass();
        value(number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher create() {
        return Companion.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createByte(byte b) {
        return Companion.createByte(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createDouble(double d) {
        return Companion.createDouble(d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createFloat(float f) {
        return Companion.createFloat(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createInt(int i) {
        return Companion.createInt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createLong(long j) {
        return Companion.createLong(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final NumberEncodeValueMatcher createShort(short s) {
        return Companion.createShort(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher byteValue(byte b) {
        this.value = new EncodeValueByte(b);
        this.type = NumberEncodeValueType.ByteValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher doubleValue(double d) {
        this.value = new EncodeValueDouble(d);
        this.type = NumberEncodeValueType.DoubleValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher floatValue(float f) {
        this.value = new EncodeValueFloat(f);
        this.type = NumberEncodeValueType.FloatValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final INumberEncodeValue getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher intValue(int i) {
        this.value = new EncodeValueInt(i);
        this.type = NumberEncodeValueType.IntValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher longValue(long j) {
        this.value = new EncodeValueLong(j);
        this.type = NumberEncodeValueType.LongValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher shortValue(short s) {
        this.value = new EncodeValueShort(s);
        this.type = NumberEncodeValueType.ShortValue;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final NumberEncodeValueMatcher value(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            byteValue(number.byteValue());
            return this;
        }
        if (number instanceof Short) {
            shortValue(number.shortValue());
            return this;
        }
        if (number instanceof Integer) {
            intValue(number.intValue());
            return this;
        }
        if (number instanceof Long) {
            longValue(number.longValue());
            return this;
        }
        if (number instanceof Float) {
            floatValue(number.floatValue());
            return this;
        }
        if (number instanceof Double) {
            doubleValue(number.doubleValue());
        }
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher create(Number number) {
            number.getClass();
            return new NumberEncodeValueMatcher().value(number);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createByte(byte b) {
            return new NumberEncodeValueMatcher().byteValue(b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createDouble(double d) {
            return new NumberEncodeValueMatcher().doubleValue(d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createFloat(float f) {
            return new NumberEncodeValueMatcher().floatValue(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createInt(int i) {
            return new NumberEncodeValueMatcher().intValue(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createLong(long j) {
            return new NumberEncodeValueMatcher().longValue(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final NumberEncodeValueMatcher createShort(short s) {
            return new NumberEncodeValueMatcher().shortValue(s);
        }

        private Companion() {
        }

        public final NumberEncodeValueMatcher create() {
            return new NumberEncodeValueMatcher();
        }
    }

    public static final NumberEncodeValueMatcher create(Number number) {
        return Companion.create(number);
    }

    public NumberEncodeValueMatcher() {
    }

    private NumberEncodeValueMatcher(INumberEncodeValue iNumberEncodeValue, NumberEncodeValueType numberEncodeValueType) {
        this.value = iNumberEncodeValue;
        this.type = numberEncodeValueType;
    }
}
