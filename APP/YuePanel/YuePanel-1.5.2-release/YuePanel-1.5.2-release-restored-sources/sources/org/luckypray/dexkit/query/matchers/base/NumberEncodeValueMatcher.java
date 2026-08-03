package org.luckypray.dexkit.query.matchers.base;

import Yue.C4335;
import Yue.C5499;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.EncodeValueByte;
import org.luckypray.dexkit.query.matchers.EncodeValueDouble;
import org.luckypray.dexkit.query.matchers.EncodeValueFloat;
import org.luckypray.dexkit.query.matchers.EncodeValueInt;
import org.luckypray.dexkit.query.matchers.EncodeValueLong;
import org.luckypray.dexkit.query.matchers.EncodeValueShort;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004R\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "", "()V", "value", "", "(Ljava/lang/Number;)V", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "type", "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V", "<set-?>", "getType", "()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "getValue", "()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "byteValue", "", "doubleValue", "", "floatValue", "", "intValue", "", "longValue", "", "shortValue", "", "number", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class NumberEncodeValueMatcher {

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);
    private /* synthetic */ NumberEncodeValueType type;
    private /* synthetic */ INumberEncodeValue value;

    @InterfaceC6211(m2698d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¨\u0006\u0013"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;", "", "()V", "create", "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;", "value", "", "createByte", "", "createDouble", "", "createFloat", "", "createInt", "", "createLong", "", "createShort", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.matchers.base.NumberEncodeValueMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher create() {
            return new NumberEncodeValueMatcher();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createByte(byte b) {
            return new NumberEncodeValueMatcher().byteValue(b);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createDouble(double d) {
            return new NumberEncodeValueMatcher().doubleValue(d);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createFloat(float f) {
            return new NumberEncodeValueMatcher().floatValue(f);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createInt(int i) {
            return new NumberEncodeValueMatcher().intValue(i);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createLong(long j) {
            return new NumberEncodeValueMatcher().longValue(j);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher createShort(short s) {
            return new NumberEncodeValueMatcher().shortValue(s);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC6399
        @InterfaceC5578
        public final NumberEncodeValueMatcher create(@InterfaceC6399 Number number) {
            C5499.m17103(number, "value");
            return new NumberEncodeValueMatcher().value(number);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NumberEncodeValueMatcher() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher create() {
        return Companion.create();
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createByte(byte b) {
        return Companion.createByte(b);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createDouble(double d) {
        return Companion.createDouble(d);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createFloat(float f) {
        return Companion.createFloat(f);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createInt(int i) {
        return Companion.createInt(i);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createLong(long j) {
        return Companion.createLong(j);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher createShort(short s) {
        return Companion.createShort(s);
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher byteValue(byte b) {
        this.value = new EncodeValueByte(b);
        this.type = NumberEncodeValueType.ByteValue;
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher doubleValue(double d) {
        this.value = new EncodeValueDouble(d);
        this.type = NumberEncodeValueType.DoubleValue;
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher floatValue(float f) {
        this.value = new EncodeValueFloat(f);
        this.type = NumberEncodeValueType.FloatValue;
        return this;
    }

    @InterfaceC6489
    public final NumberEncodeValueType getType() {
        return this.type;
    }

    @InterfaceC6489
    public final INumberEncodeValue getValue() {
        return this.value;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher intValue(int i) {
        this.value = new EncodeValueInt(i);
        this.type = NumberEncodeValueType.IntValue;
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher longValue(long j) {
        this.value = new EncodeValueLong(j);
        this.type = NumberEncodeValueType.LongValue;
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher shortValue(short s) {
        this.value = new EncodeValueShort(s);
        this.type = NumberEncodeValueType.ShortValue;
        return this;
    }

    @InterfaceC6399
    public final NumberEncodeValueMatcher value(@InterfaceC6399 Number number) {
        C5499.m17103(number, "number");
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NumberEncodeValueMatcher(@InterfaceC6399 Number number) {
        C5499.m17103(number, "value");
        value(number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5578
    public static final NumberEncodeValueMatcher create(@InterfaceC6399 Number number) {
        return Companion.create(number);
    }

    private NumberEncodeValueMatcher(INumberEncodeValue iNumberEncodeValue, NumberEncodeValueType numberEncodeValueType) {
        this.value = iNumberEncodeValue;
        this.type = numberEncodeValueType;
    }
}
