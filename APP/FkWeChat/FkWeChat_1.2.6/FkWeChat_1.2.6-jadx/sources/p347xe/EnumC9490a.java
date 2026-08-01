package p347xe;

import p024b9.AbstractC1043k;
import p172l8.C4718y;
import p376zd.C9993h;

/* JADX INFO: renamed from: xe.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9490a {
    ByteValue((byte) 1),
    ShortValue((byte) 2),
    CharValue((byte) 3),
    IntValue((byte) 4),
    LongValue((byte) 5),
    FloatValue((byte) 6),
    DoubleValue((byte) 7),
    StringValue((byte) 8),
    TypeValue((byte) 9),
    MethodValue((byte) 10),
    EnumValue((byte) 11),
    ArrayValue((byte) 12),
    AnnotationValue((byte) 13),
    NullValue((byte) 14),
    BoolValue((byte) 15);


    /* JADX INFO: renamed from: r */
    public static final a f32229r = new a(null);

    /* JADX INFO: renamed from: q */
    public final byte f32238q;

    EnumC9490a(byte b10) {
        this.f32238q = b10;
    }

    /* JADX INFO: renamed from: xe.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC9490a m36984a(byte b10) {
            if (b10 == 1) {
                return EnumC9490a.ByteValue;
            }
            if (b10 == 2) {
                return EnumC9490a.ShortValue;
            }
            if (b10 == 3) {
                return EnumC9490a.CharValue;
            }
            if (b10 == 4) {
                return EnumC9490a.IntValue;
            }
            if (b10 == 5) {
                return EnumC9490a.LongValue;
            }
            if (b10 == 6) {
                return EnumC9490a.FloatValue;
            }
            if (b10 == 7) {
                return EnumC9490a.DoubleValue;
            }
            if (b10 == 8) {
                return EnumC9490a.StringValue;
            }
            if (b10 == 9) {
                return EnumC9490a.TypeValue;
            }
            if (b10 == 10) {
                return EnumC9490a.MethodValue;
            }
            if (b10 == 11) {
                return EnumC9490a.EnumValue;
            }
            if (b10 == 12) {
                return EnumC9490a.ArrayValue;
            }
            if (b10 == 13) {
                return EnumC9490a.AnnotationValue;
            }
            if (b10 == 14) {
                return EnumC9490a.NullValue;
            }
            if (b10 == 15) {
                return EnumC9490a.BoolValue;
            }
            C9993h.m38666a("Unknown AnnotationEncodeValueType: ", C4718y.m18821j(b10));
            return null;
        }

        public a() {
        }
    }
}
