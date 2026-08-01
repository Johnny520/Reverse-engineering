package bsh;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.p218ws.WebSocketProtocol;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.p3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1236p3 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: C */
    public static final long[] f3738C = {0, 0, -1, -1};

    /* JADX INFO: renamed from: D */
    public static final long[] f3739D = {-2, -1, -1, -1};

    /* JADX INFO: renamed from: E */
    public static final long[] f3740E = {2301339413881290750L, -16384, 4294967295L, 432345564227567616L};

    /* JADX INFO: renamed from: F */
    public static final long[] f3741F = {0, 0, 0, -36028797027352577L};

    /* JADX INFO: renamed from: G */
    public static final long[] f3742G = {0, -1, -1, -1};

    /* JADX INFO: renamed from: H */
    public static final long[] f3743H = {-1, -1, WebSocketProtocol.PAYLOAD_SHORT_MAX, 0};

    /* JADX INFO: renamed from: I */
    public static final long[] f3744I = {-1, -1, 0, 0};

    /* JADX INFO: renamed from: J */
    public static final long[] f3745J = {70368744177663L, 0, 0, 0};

    /* JADX INFO: renamed from: K */
    public static final String[] f3746K = {_UrlKt.FRAGMENT_ENCODE_SET, null, null, null, null, null, null, null, null, null, null, "abstract", "boolean", "break", "class", "byte", "case", "catch", "char", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "switch", "synchronized", "transient", "throw", "throws", "true", "try", "void", "volatile", "while", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "@gt", "<", "@lt", "!", "~", "==", "<=", "@lteq", ">=", "@gteq", "!=", "||", "@or", "&&", "@and", "++", "--", "+", "-", "*", "/", "&", "@bitwise_and", "|", "@bitwise_or", "^", "@bitwise_xor", "%", "@mod", "**", "@pow", "<<", "@left_shift", ">>", "@right_shift", ">>>", "@right_unsigned_shift", "+=", "-=", "*=", "/=", "&=", "@and_assign", "|=", "@or_assign", "^=", "@xor_assign", "%=", "@mod_assign", "**=", "@pow_assign", "<<=", "@left_shift_assign", ">>=", "@right_shift_assign", ">>>=", "@right_unsigned_shift_assign", "->", "<=>", "??=", "??", "?:", "?", ":", "::", "...", "?.", "default:"};

    /* JADX INFO: renamed from: L */
    public static final int[] f3747L = {2, 4, 6, 7, 65, 66, 68, 44, 45, 50, 51, 54, 55, 64, 69, 24, 25, 27, 57, 59, 62, 16, 29, 30, 32, 9, 10, 12, 18, 19, 22, 34, 35, 38, 46, 47, 22, 60, 61, 16, 71, 72, 74, 20, 21, 48, 49, 52, 53};

    /* JADX INFO: renamed from: M */
    public static final String[] f3748M = {"DEFAULT"};

    /* JADX INFO: renamed from: N */
    public static final int[] f3749N = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: O */
    public static final long[] f3750O = {4611686018427385857L, -1564, 67108863};

    /* JADX INFO: renamed from: P */
    public static final long[] f3751P = {2046, 0, 0};

    /* JADX INFO: renamed from: Q */
    public static final long[] f3752Q = {1792, 0, 0};

    /* JADX INFO: renamed from: R */
    public static final long[] f3753R = {0, 0, 0};

    /* JADX INFO: renamed from: A */
    public StringBuilder f3754A;

    /* JADX INFO: renamed from: B */
    public int f3755B;

    /* JADX INFO: renamed from: s */
    public int f3758s;

    /* JADX INFO: renamed from: t */
    public int f3759t;

    /* JADX INFO: renamed from: u */
    public int f3760u;

    /* JADX INFO: renamed from: v */
    public int f3761v;

    /* JADX INFO: renamed from: w */
    public C1253s2 f3762w;

    /* JADX INFO: renamed from: z */
    public final StringBuilder f3765z;

    /* JADX INFO: renamed from: q */
    public int f3756q = 0;

    /* JADX INFO: renamed from: r */
    public int f3757r = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f3763x = new int[75];

    /* JADX INFO: renamed from: y */
    public final int[] f3764y = new int[Opcodes.FCMPG];

    public C1236p3(C1253s2 c1253s2) {
        StringBuilder sb2 = new StringBuilder();
        this.f3765z = sb2;
        this.f3754A = sb2;
        this.f3762w = c1253s2;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5001e(int i10, int i11, int i12, long j10, long j11) {
        return i10 == 0 && (f3738C[i12] & j11) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5002f(int i10, int i11, int i12, long j10, long j11) {
        return i10 != 0 ? (f3739D[i11] & j10) != 0 : (f3738C[i12] & j11) != 0;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m5003g(int i10, int i11, int i12, long j10, long j11) {
        return i10 != 0 ? i10 != 51 ? i10 != 61 ? i10 != 48 ? i10 != 49 ? (f3740E[i11] & j10) != 0 : (f3743H[i12] & j11) != 0 : (f3742G[i12] & j11) != 0 : (f3745J[i12] & j11) != 0 : (f3744I[i12] & j11) != 0 : (f3741F[i12] & j11) != 0;
    }

    /* JADX INFO: renamed from: A */
    public final int m5004A(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(20, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'a' ? m5019P(21, 0L, 0L, j12) : m5005B(j12, 16384L);
        } catch (IOException unused) {
            m5021R(21, 0L, 0L, j12);
            return 22;
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m5005B(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(21, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 's' ? m5019P(22, 0L, 0L, j12) : m5006C(j12, 16384L);
        } catch (IOException unused) {
            m5021R(22, 0L, 0L, j12);
            return 23;
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m5006C(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(22, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 's' ? m5019P(23, 0L, 0L, j12) : m5007D(j12, 16384L);
        } catch (IOException unused) {
            m5021R(23, 0L, 0L, j12);
            return 24;
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m5007D(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(23, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'i' ? m5019P(24, 0L, 0L, j12) : m5008E(j12, 16384L);
        } catch (IOException unused) {
            m5021R(24, 0L, 0L, j12);
            return 25;
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m5008E(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(24, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'g' ? m5019P(25, 0L, 0L, j12) : m5009F(j12, 16384L);
        } catch (IOException unused) {
            m5021R(25, 0L, 0L, j12);
            return 26;
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m5009F(long j10, long j11) {
        long j12 = j11 & j10;
        if (j12 == 0) {
            return m5019P(25, 0L, 0L, j10);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return (cM5087v == 'n' && (16384 & j12) != 0) ? m5020Q(27, Opcodes.D2I) : m5019P(26, 0L, 0L, j12);
        } catch (IOException unused) {
            m5021R(26, 0L, 0L, j12);
            return 27;
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m5010G(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(0, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v != '.') {
                if (cM5087v == 'i') {
                    return m5011H(j16, 1443421272758288384L, j17, 360657406096572416L, j18, 20480L);
                }
                if (cM5087v == 'l') {
                    return m5011H(j16, 576465150484152320L, j17, 0L, j18, 0L);
                }
                if (cM5087v != 'w') {
                    if (cM5087v != 'y') {
                        if (cM5087v != '=') {
                            if (cM5087v == '>') {
                                if ((j17 & FieldInfo.DISABLE_REFERENCE_DETECT) != 0) {
                                    this.f3761v = Opcodes.LSHL;
                                    this.f3760u = 2;
                                } else if ((JSONWriter.MASK_PRETTY_FORMAT & j18) != 0) {
                                    return m5020Q(2, 144);
                                }
                                return m5011H(j16, 0L, j17, 0L, j18, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
                            }
                            if (cM5087v == 'e') {
                                return m5011H(j16, JSONWriter.MASK_WRITE_ENUMS_USING_NAME, j17, FieldInfo.JIT, j18, 1024L);
                            }
                            if (cM5087v == 'f') {
                                return m5011H(j16, 2097152L, j17, 0L, j18, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                            }
                            switch (cM5087v) {
                                case Opcodes.LADD /* 97 */:
                                    return m5011H(j16, 9570149208440832L, j17, 0L, j18, 0L);
                                case 'b':
                                    return m5011H(j16, 70368744177664L, j17, 0L, j18, 0L);
                                case 'c':
                                    return m5011H(j16, 8796093022208L, j17, 0L, j18, 0L);
                                default:
                                    switch (cM5087v) {
                                        case 'n':
                                            return m5011H(j16, 4504150190063616L, j17, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, j18, 1L);
                                        case 'o':
                                            return m5011H(j16, 316660422545408L, j17, 5629499534213120L, j18, 336L);
                                        case Opcodes.IREM /* 112 */:
                                            return m5011H(j16, 51539607552L, j17, 0L, j18, 0L);
                                        default:
                                            switch (cM5087v) {
                                                case 'r':
                                                    if ((2147483648L & j16) != 0) {
                                                        return m5018O(2, 31, 42);
                                                    }
                                                    if ((JSONWriter.MASK_WRITE_LONG_AS_STRING & j17) != 0) {
                                                        this.f3761v = 98;
                                                        this.f3760u = 2;
                                                    }
                                                    return m5011H(j16, 55169095435288576L, j17, 0L, j18, 4L);
                                                case 's':
                                                    return m5011H(j16, 68736321536L, j17, 0L, j18, 0L);
                                                case Opcodes.INEG /* 116 */:
                                                    if ((137438953472L & j16) != 0) {
                                                        this.f3761v = 37;
                                                        this.f3760u = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY & j17) != 0) {
                                                        this.f3761v = 86;
                                                        this.f3760u = 2;
                                                    } else if ((JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j17) != 0) {
                                                        this.f3761v = 88;
                                                        this.f3760u = 2;
                                                    }
                                                    return m5011H(j16, 142116240130048L, j17, 2684354560L, j18, 0L);
                                                case Opcodes.LNEG /* 117 */:
                                                    return m5011H(j16, 72057594079870976L, j17, 0L, j18, 0L);
                                            }
                                    }
                            }
                        }
                        if ((128 & j18) != 0) {
                            return m5020Q(2, Opcodes.I2D);
                        }
                        if ((512 & j18) != 0) {
                            return m5020Q(2, 137);
                        }
                        if ((JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j18) != 0) {
                            return m5020Q(2, Opcodes.F2I);
                        }
                        if ((JSONWriter.MASK_REFERENCE_DETECTION & j18) != 0) {
                            return m5020Q(2, Opcodes.I2B);
                        }
                    } else if ((FieldInfo.DISABLE_REFERENCE_DETECT & j16) != 0) {
                        return m5018O(2, 57, 42);
                    }
                } else if ((2199023255552L & j16) != 0) {
                    return m5018O(2, 41, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY & j18) != 0) {
                return m5020Q(2, Opcodes.DCMPL);
            }
            return m5019P(1, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(1, j16, j17, j18);
            return 2;
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m5011H(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(1, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v != '=') {
                if (cM5087v == '_') {
                    return m5012I(j16, 0L, j17, 0L, j18, 4L);
                }
                if (cM5087v == 'i') {
                    return m5012I(j16, 1126999418470400L, j17, 0L, j18, 0L);
                }
                switch (cM5087v) {
                    case Opcodes.LADD /* 97 */:
                        return m5012I(j16, 576460754184577024L, j17, 0L, j18, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                    case 'b':
                        return m5012I(j16, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY, j17, 0L, j18, 0L);
                    case 'c':
                        return m5012I(j16, 4503599627501568L, j17, 0L, j18, 0L);
                    case 'd':
                        if ((FieldInfo.DISABLE_ARRAY_MAPPING & j16) != 0) {
                            return m5018O(3, 58, 42);
                        }
                        if ((JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL & j17) != 0) {
                            this.f3761v = 100;
                            this.f3760u = 3;
                        } else if ((FieldInfo.RAW_VALUE_MASK & j17) != 0) {
                            this.f3761v = 114;
                            this.f3760u = 3;
                        }
                        return m5012I(j16, 0L, j17, 0L, j18, 65L);
                    case 'e':
                        return (JSONWriter.MASK_IGNORE_ERROR_GETTER & j16) != 0 ? m5018O(3, 15, 42) : (JSONWriter.MASK_PRETTY_FORMAT & j16) != 0 ? m5018O(3, 16, 42) : (JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO & j16) != 0 ? m5018O(3, 24, 42) : (FieldInfo.READ_ONLY & j16) != 0 ? m5018O(3, 56, 42) : m5012I(j16, 274945015808L, j17, 2684354560L, j18, 0L);
                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                        return m5012I(j16, 0L, j17, FieldInfo.JIT, j18, 1024L);
                    case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                        return (549755813888L & j16) != 0 ? m5018O(3, 39, 42) : m5012I(j16, 0L, j17, 360287970189639680L, j18, 20480L);
                    default:
                        switch (cM5087v) {
                            case 'k':
                                return m5012I(j16, 8796093022208L, j17, 0L, j18, 0L);
                            case Opcodes.IDIV /* 108 */:
                                return (4398046511104L & j16) != 0 ? m5018O(3, 42, 42) : m5012I(j16, 1152991890530897920L, j17, 0L, j18, 0L);
                            case Opcodes.LDIV /* 109 */:
                                if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j16) != 0) {
                                    return m5018O(3, 25, 42);
                                }
                                break;
                            case 'n':
                                return m5012I(j16, FieldInfo.DISABLE_SMART_MATCH, j17, 0L, j18, 0L);
                            case 'o':
                                return (JSONWriter.MASK_IGNORE_NON_FIELD_GETTER & j16) != 0 ? m5018O(3, 32, 42) : m5012I(j16, 54043229888184320L, j17, 0L, j18, 0L);
                            default:
                                switch (cM5087v) {
                                    case 'r':
                                        return (262144 & j16) != 0 ? m5018O(3, 18, 42) : m5012I(j16, FieldInfo.VALUE_MASK, j17, 0L, j18, 16L);
                                    case 's':
                                        return m5012I(j16, 134758400L, j17, 0L, j18, 0L);
                                    case Opcodes.INEG /* 116 */:
                                        return m5012I(j16, 2850002859722752L, j17, 369435906932736L, j18, 0L);
                                    case Opcodes.LNEG /* 117 */:
                                        return m5012I(j16, 140737488355328L, j17, 0L, j18, 0L);
                                    case Opcodes.FNEG /* 118 */:
                                        return m5012I(j16, 17592186044416L, j17, 0L, j18, 0L);
                                    case Opcodes.DNEG /* 119 */:
                                        if ((FieldInfo.FIELD_MASK & j17) != 0) {
                                            this.f3761v = Opcodes.INEG;
                                            this.f3760u = 3;
                                        }
                                        return m5012I(j16, 0L, j17, 0L, j18, 256L);
                                }
                        }
                        break;
                }
            } else if ((JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j18) != 0) {
                return m5020Q(3, 141);
            }
            return m5019P(2, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(2, j16, j17, j18);
            return 3;
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m5012I(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(2, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            switch (cM5087v) {
                case Opcodes.SWAP /* 95 */:
                    return m5013J(j16, 0L, j17, 0L, j18, 337L);
                case Opcodes.LADD /* 97 */:
                    return m5013J(j16, 26456998543360L, j17, 0L, j18, 4L);
                case 'c':
                    return m5013J(j16, 3377699720527872L, j17, 0L, j18, 0L);
                case 'e':
                    return (JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING & j16) != 0 ? m5018O(4, 27, 42) : (FieldInfo.DISABLE_JSONB & j16) != 0 ? m5018O(4, 60, 42) : m5013J(j16, 35201551962112L, j17, 0L, j18, 0L);
                case Opcodes.IMUL /* 104 */:
                    return (JSONWriter.MASK_REFERENCE_DETECTION & j16) != 0 ? m5018O(4, 17, 42) : m5013J(j16, FieldInfo.FIELD_MASK, j17, 360287970189639680L, j18, 20480L);
                case Opcodes.LMUL /* 105 */:
                    return m5013J(j16, 633318698647552L, j17, 0L, j18, 0L);
                case 'k':
                    if ((JSONWriter.MASK_WRITE_ENUMS_USING_NAME & j16) != 0) {
                        return m5018O(4, 13, 42);
                    }
                    break;
                case Opcodes.IDIV /* 108 */:
                    if ((JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN & j16) != 0) {
                        this.f3761v = 28;
                        this.f3760u = 4;
                    }
                    return m5013J(j16, 545259520L, j17, 0L, j18, 0L);
                case 'n':
                    return m5013J(j16, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j17, 0L, j18, 0L);
                case Opcodes.LREM /* 113 */:
                    if ((536870912 & j17) != 0) {
                        return m5020Q(4, 93);
                    }
                    if ((2147483648L & j17) != 0) {
                        return m5020Q(4, 95);
                    }
                    break;
                case 'r':
                    return m5013J(j16, 141046726002688L, j17, 0L, j18, 0L);
                case 's':
                    return (16384 & j16) != 0 ? m5018O(4, 14, 42) : m5013J(j16, FieldInfo.DISABLE_SMART_MATCH, j17, 0L, j18, 0L);
                case Opcodes.INEG /* 116 */:
                    return (JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN & j16) != 0 ? m5018O(4, 19, 42) : (JSONWriter.MASK_ESCAPE_NONE_ASCII & j16) != 0 ? m5018O(4, 30, 42) : (FieldInfo.VALUE_MASK & j16) != 0 ? m5018O(4, 48, 42) : m5013J(j16, FieldInfo.DISABLE_AUTO_TYPE, j17, FieldInfo.JIT, j18, 1024L);
                case Opcodes.LNEG /* 117 */:
                    return m5013J(j16, 2097152L, j17, 0L, j18, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                case Opcodes.FNEG /* 118 */:
                    return m5013J(j16, JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME, j17, 0L, j18, 0L);
                case Opcodes.DNEG /* 119 */:
                    if ((FieldInfo.JIT & j16) != 0) {
                        this.f3761v = 54;
                        this.f3760u = 4;
                    }
                    return m5013J(j16, FieldInfo.DISABLE_UNSAFE, j17, 369435906932736L, j18, 0L);
            }
            return m5019P(3, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(3, j16, j17, j18);
            return 4;
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m5013J(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(3, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            switch (cM5087v) {
                case Opcodes.SWAP /* 95 */:
                    return m5014K(j16, 0L, j17, FieldInfo.JIT, j18, 1024L);
                case Opcodes.LADD /* 97 */:
                    return m5014K(j16, 6144L, j17, 0L, j18, 337L);
                case 'c':
                    return (70368744177664L & j16) != 0 ? m5018O(5, 46, 42) : (FieldInfo.UNWRAPPED_MASK & j16) != 0 ? m5018O(5, 49, 42) : m5014K(j16, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j17, 0L, j18, 0L);
                case 'd':
                    return m5014K(j16, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j17, 0L, j18, 0L);
                case 'e':
                    if ((JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY & j16) != 0) {
                        return m5018O(5, 23, 42);
                    }
                    if ((JSONWriter.MASK_NOT_WRITE_NUMBER_CLASS_NAME & j16) != 0) {
                        return m5018O(5, 40, 42);
                    }
                    break;
                case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                    return m5014K(j16, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j17, 0L, j18, 0L);
                case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                    return m5014K(j16, 8796093022208L, j17, 0L, j18, 0L);
                case Opcodes.IMUL /* 104 */:
                    if ((FieldInfo.READ_USING_MASK & j16) != 0) {
                        return m5018O(5, 51, 42);
                    }
                    break;
                case Opcodes.LMUL /* 105 */:
                    return m5014K(j16, 585467951558164480L, j17, 369435906932736L, j18, 0L);
                case Opcodes.IDIV /* 108 */:
                    return m5014K(j16, 538968064L, j17, 0L, j18, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                case Opcodes.LDIV /* 109 */:
                    return m5014K(j16, JSONWriter.MASK_WRITE_LONG_AS_STRING, j17, 0L, j18, 0L);
                case 'n':
                    return (140737488355328L & j16) != 0 ? m5018O(5, 47, 42) : m5014K(j16, 68720525312L, j17, 0L, j18, 0L);
                case 'r':
                    return m5014K(j16, FieldInfo.FIELD_MASK, j17, 0L, j18, 0L);
                case 's':
                    return (FieldInfo.DISABLE_UNSAFE & j16) != 0 ? m5018O(5, 55, 42) : m5014K(j16, 0L, j17, 0L, j18, 4L);
                case Opcodes.INEG /* 116 */:
                    return (JSONWriter.MASK_BROWSER_SECURE & j16) != 0 ? m5018O(5, 35, 42) : m5014K(j16, 1143492092887040L, j17, 360287970189639680L, j18, 20480L);
            }
            return m5019P(4, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(4, j16, j17, j18);
            return 5;
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m5014K(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(4, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v == '_') {
                return m5015L(j16, 0L, j17, 360287970189639680L, j18, 20480L);
            }
            if (cM5087v == 'a') {
                return m5015L(j16, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j17, 0L, j18, 0L);
            }
            if (cM5087v == 'c') {
                return m5015L(j16, 68719478784L, j17, 0L, j18, 0L);
            }
            if (cM5087v == 'l') {
                return m5015L(j16, FieldInfo.DISABLE_AUTO_TYPE, j17, 0L, j18, 0L);
            }
            if (cM5087v != 'y') {
                if (cM5087v == 'e') {
                    return (8796093022208L & j16) != 0 ? m5018O(6, 43, 42) : (17592186044416L & j16) != 0 ? m5018O(6, 44, 42) : m5015L(j16, 9007216434610176L, j17, 0L, j18, 0L);
                }
                if (cM5087v == 'f') {
                    return m5015L(j16, FieldInfo.RAW_VALUE_MASK, j17, 0L, j18, 0L);
                }
                if (cM5087v != 'n') {
                    if (cM5087v == 'o') {
                        return m5015L(j16, FieldInfo.FIELD_MASK, j17, 0L, j18, 0L);
                    }
                    switch (cM5087v) {
                        case 's':
                            return (JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY & j16) != 0 ? m5018O(6, 26, 42) : m5015L(j16, 0L, j17, 18383834416414720L, j18, 1365L);
                        case Opcodes.INEG /* 116 */:
                            if ((2097152 & j16) != 0) {
                                this.f3761v = 21;
                                this.f3760u = 6;
                            }
                            return m5015L(j16, JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING, j17, 0L, j18, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                        case Opcodes.LNEG /* 117 */:
                            return m5015L(j16, JSONWriter.MASK_USE_SINGLE_QUOTES, j17, 0L, j18, 0L);
                    }
                }
                if ((JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j16) != 0) {
                    return m5018O(6, 12, 42);
                }
            } else if ((536870912 & j16) != 0) {
                return m5018O(6, 29, 42);
            }
            return m5019P(5, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(5, j16, j17, j18);
            return 6;
        }
    }

    /* JADX INFO: renamed from: L */
    public final int m5015L(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(5, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v != ':') {
                if (cM5087v == 'c') {
                    return m5016M(j16, JSONWriter.MASK_UNQUOTE_FIELD_NAME, j17, 0L, j18, 0L);
                }
                if (cM5087v == 'e') {
                    return (JSONWriter.MASK_USE_SINGLE_QUOTES & j16) != 0 ? m5018O(7, 20, 42) : (FieldInfo.DISABLE_AUTO_TYPE & j16) != 0 ? m5018O(7, 59, 42) : m5016M(j16, 35253091565568L, j17, 369435906932736L, j18, 0L);
                }
                if (cM5087v == 'n') {
                    return m5016M(j16, 13510816061980672L, j17, 0L, j18, 0L);
                }
                if (cM5087v != 'p') {
                    if (cM5087v == 'h') {
                        return m5016M(j16, 0L, j17, FieldInfo.JIT, j18, 1024L);
                    }
                    if (cM5087v == 'i') {
                        return m5016M(j16, 0L, j17, 0L, j18, 4L);
                    }
                    switch (cM5087v) {
                        case 's':
                            return m5016M(j16, 0L, j17, FieldInfo.READ_ONLY, j18, 4433L);
                        case Opcodes.INEG /* 116 */:
                            if ((JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME & j16) != 0) {
                                return m5018O(7, 11, 42);
                            }
                            break;
                        case Opcodes.LNEG /* 117 */:
                            return m5016M(j16, 0L, j17, FieldInfo.DISABLE_ARRAY_MAPPING, j18, 16384L);
                    }
                } else if ((FieldInfo.RAW_VALUE_MASK & j16) != 0) {
                    return m5018O(7, 50, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE & j18) != 0) {
                return m5020Q(7, Opcodes.IFEQ);
            }
            return m5019P(6, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(6, j16, j17, j18);
            return 7;
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m5016M(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(6, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v == '_') {
                return m5017N(j16, 0L, j17, 369435906932736L, j18, 0L);
            }
            if (cM5087v == 't') {
                return (FieldInfo.DISABLE_SMART_MATCH & j16) != 0 ? m5018O(8, 53, 42) : m5017N(j16, JSONWriter.MASK_WRITE_LONG_AS_STRING, j17, 0L, j18, 0L);
            }
            if (cM5087v != 'd') {
                if (cM5087v != 'e') {
                    if (cM5087v == 'n') {
                        return m5017N(j16, 0L, j17, FieldInfo.DISABLE_ARRAY_MAPPING, j18, 16384L);
                    }
                    if (cM5087v == 'o') {
                        return m5017N(j16, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, j17, 0L, j18, 0L);
                    }
                    switch (cM5087v) {
                        case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                            return m5017N(j16, 0L, j17, 0L, j18, 4L);
                        case Opcodes.IMUL /* 104 */:
                            return m5017N(j16, 0L, j17, FieldInfo.READ_ONLY, j18, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
                        case Opcodes.LMUL /* 105 */:
                            return m5017N(j16, FieldInfo.FIELD_MASK, j17, FieldInfo.JIT, j18, 1361L);
                    }
                }
                if ((JSONWriter.MASK_UNQUOTE_FIELD_NAME & j16) != 0) {
                    return m5018O(8, 38, 42);
                }
            } else if ((JSONWriter.MASK_WRITE_FLOAT_SPECIAL_AS_STRING & j16) != 0) {
                return m5018O(8, 45, 42);
            }
            return m5019P(7, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(7, j16, j17, j18);
            return 8;
        }
    }

    /* JADX INFO: renamed from: N */
    public final int m5017N(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(7, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v == 'a') {
                return m5032n(j16, 0L, j17, 17592186044416L, j18, 0L);
            }
            if (cM5087v == 'i') {
                return m5032n(j16, 0L, j17, FieldInfo.READ_ONLY, j18, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
            }
            if (cM5087v == 's') {
                return (JSONWriter.MASK_WRITE_LONG_AS_STRING & j16) != 0 ? m5018O(9, 34, 42) : m5032n(j16, 0L, j17, FieldInfo.DISABLE_ARRAY_MAPPING, j18, 16384L);
            }
            if (cM5087v == 'x') {
                return m5032n(j16, 0L, j17, FieldInfo.VALUE_MASK, j18, 0L);
            }
            if (cM5087v == 'z') {
                return m5032n(j16, FieldInfo.FIELD_MASK, j17, 0L, j18, 0L);
            }
            if (cM5087v == 'f') {
                return (JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL & j16) != 0 ? m5018O(9, 36, 42) : m5032n(j16, 0L, j17, FieldInfo.JIT, j18, 1024L);
            }
            if (cM5087v == 'g') {
                return m5032n(j16, 0L, j17, 0L, j18, 337L);
            }
            if (cM5087v != 'n') {
                if (cM5087v == 'o') {
                    return m5032n(j16, 0L, j17, 70368744177664L, j18, 0L);
                }
            } else if ((4 & j18) != 0) {
                return m5020Q(9, Opcodes.IXOR);
            }
            return m5019P(8, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(8, j16, j17, j18);
            return 9;
        }
    }

    /* JADX INFO: renamed from: O */
    public final int m5018O(int i10, int i11, int i12) {
        this.f3761v = i11;
        this.f3760u = i10;
        try {
            this.f3755B = this.f3762w.m5087v();
            return m5030l(i12, i10 + 1);
        } catch (IOException unused) {
            return i10 + 1;
        }
    }

    /* JADX INFO: renamed from: P */
    public final int m5019P(int i10, long j10, long j11, long j12) {
        return m5030l(m5021R(i10, j10, j11, j12), i10 + 1);
    }

    /* JADX INFO: renamed from: Q */
    public final int m5020Q(int i10, int i11) {
        this.f3761v = i11;
        this.f3760u = i10;
        return i10 + 1;
    }

    /* JADX INFO: renamed from: R */
    public final int m5021R(int i10, long j10, long j11, long j12) {
        switch (i10) {
            case 0:
                if ((9007199531565056L & j11) != 0 || (j12 & 66048) != 0) {
                    return 75;
                }
                if ((JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN & j11) != 0 || (j12 & JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY) != 0) {
                    return 18;
                }
                if ((j11 & 4611690416473899008L) != 0) {
                    return 64;
                }
                if ((2305843009213691904L & j10) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    return (j10 & 62) != 0 ? 0 : -1;
                }
                this.f3761v = 72;
                return 42;
            case 1:
                if ((2305843000611174400L & j10) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    if ((j11 & FieldInfo.DISABLE_SMART_MATCH) == 0 && (j12 & 512) == 0) {
                        return (j10 & 8602517504L) != 0 ? 42 : -1;
                    }
                    return 75;
                }
                if (this.f3760u != 1) {
                    this.f3761v = 72;
                    this.f3760u = 1;
                }
                return 42;
            case 2:
                if ((144117801563455488L & j10) != 0) {
                    return 42;
                }
                if ((j10 & 2161725199056107520L) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    return -1;
                }
                if (this.f3760u != 2) {
                    this.f3761v = 72;
                    this.f3760u = 2;
                }
                return 42;
            case 3:
                if ((360292922337624064L & j10) != 0) {
                    return 42;
                }
                if ((j10 & 1801432551596390400L) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    return -1;
                }
                if (this.f3760u != 3) {
                    this.f3761v = 72;
                    this.f3760u = 3;
                }
                return 42;
            case 4:
                if ((1207246177125949440L & j10) != 0) {
                    return 42;
                }
                if ((j10 & 594186374470440960L) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    return -1;
                }
                if (this.f3760u != 4) {
                    this.f3761v = 72;
                    this.f3760u = 4;
                }
                return 42;
            case 5:
                if ((591159385127917568L & j10) == 0 && (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) == 0) {
                    return (j10 & 39055786898358272L) != 0 ? 42 : -1;
                }
                this.f3761v = 72;
                this.f3760u = 5;
                return 42;
            case 6:
                if ((26388885147648L & j10) != 0 || (j12 & JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE) != 0) {
                    return 42;
                }
                if ((j10 & 591132996242769920L) == 0) {
                    return -1;
                }
                if (this.f3760u != 6) {
                    this.f3761v = 72;
                    this.f3760u = 6;
                }
                return 42;
            case 7:
                if ((577586652211316736L & j10) != 0) {
                    return 42;
                }
                if ((j10 & 13546344031453184L) == 0) {
                    return -1;
                }
                this.f3761v = 72;
                this.f3760u = 7;
                return 42;
            case 8:
                if ((9042658504736768L & j10) != 0) {
                    return 42;
                }
                if ((j10 & 4503685526716416L) == 0) {
                    return -1;
                }
                this.f3761v = 72;
                this.f3760u = 8;
                return 42;
            case 9:
                if ((j10 & FieldInfo.FIELD_MASK) == 0) {
                    return (j10 & 85899345920L) != 0 ? 42 : -1;
                }
                this.f3761v = 72;
                this.f3760u = 9;
                return 42;
            case 10:
                if ((j10 & FieldInfo.FIELD_MASK) == 0) {
                    return -1;
                }
                if (this.f3760u != 10) {
                    this.f3761v = 72;
                    this.f3760u = 10;
                }
                return 42;
            case Opcodes.FCONST_0 /* 11 */:
                return (j10 & FieldInfo.FIELD_MASK) != 0 ? 42 : -1;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5022a(C1253s2 c1253s2) {
        this.f3758s = 0;
        this.f3760u = 0;
        this.f3756q = this.f3757r;
        this.f3762w = c1253s2;
        m5023b();
    }

    /* JADX INFO: renamed from: b */
    public final void m5023b() {
        this.f3759t = -2147483647;
        int i10 = 75;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            this.f3763x[i11] = Integer.MIN_VALUE;
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: c */
    public C1261t4 m5024c() {
        int i10;
        int i11;
        boolean z10;
        String str;
        String strM4031i = _UrlKt.FRAGMENT_ENCODE_SET;
        String strM4031i2 = null;
        C1261t4 c1261t4 = null;
        while (true) {
            int i12 = 0;
            try {
                this.f3755B = this.f3762w.m5082q();
                this.f3761v = Integer.MAX_VALUE;
                this.f3760u = 0;
                int iM5031m = m5031m();
                if (this.f3761v == Integer.MAX_VALUE) {
                    int iM4030h = this.f3762w.m4030h();
                    int iM4029g = this.f3762w.m4029g();
                    try {
                        this.f3762w.m5087v();
                        this.f3762w.m4023a(1);
                        i10 = iM4030h;
                        z10 = false;
                        i11 = iM4029g;
                    } catch (IOException unused) {
                        strM4031i2 = iM5031m <= 1 ? _UrlKt.FRAGMENT_ENCODE_SET : this.f3762w.m4031i();
                        int i13 = this.f3755B;
                        if (i13 == 10 || i13 == 13) {
                            iM4030h++;
                        } else {
                            i12 = iM4029g + 1;
                        }
                        i10 = iM4030h;
                        i11 = i12;
                        z10 = true;
                    }
                    if (z10) {
                        str = strM4031i2;
                    } else {
                        this.f3762w.m4023a(1);
                        if (iM5031m > 1) {
                            strM4031i = this.f3762w.m4031i();
                        }
                        str = strM4031i;
                    }
                    throw new C1267u4(z10, this.f3756q, i10, i11, str, this.f3755B, 0);
                }
                int i14 = this.f3760u;
                if (i14 + 1 < iM5031m) {
                    this.f3762w.m4023a((iM5031m - i14) - 1);
                }
                long[] jArr = f3750O;
                int i15 = this.f3761v;
                if ((jArr[i15 >> 6] & (1 << (i15 & 63))) != 0) {
                    C1261t4 c1261t4M5029k = m5029k();
                    c1261t4M5029k.f3822x = c1261t4;
                    return c1261t4M5029k;
                }
                if (((1 << (i15 & 63)) & f3752Q[i15 >> 6]) != 0) {
                    C1261t4 c1261t4M5029k2 = m5029k();
                    if (c1261t4 != null) {
                        c1261t4M5029k2.f3822x = c1261t4;
                        c1261t4.f3821w = c1261t4M5029k2;
                    }
                    c1261t4 = c1261t4M5029k2;
                }
            } catch (Exception unused2) {
                this.f3761v = 0;
                this.f3760u = -1;
                C1261t4 c1261t4M5029k3 = m5029k();
                c1261t4M5029k3.f3822x = c1261t4;
                return c1261t4M5029k3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5025d(int i10, int i11) {
        while (true) {
            int[] iArr = this.f3764y;
            int i12 = this.f3758s;
            this.f3758s = i12 + 1;
            iArr[i12] = f3747L[i10];
            int i13 = i10 + 1;
            if (i10 == i11) {
                return;
            } else {
                i10 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5026h(int i10) {
        int[] iArr = this.f3763x;
        int i11 = iArr[i10];
        int i12 = this.f3759t;
        if (i11 != i12) {
            int[] iArr2 = this.f3764y;
            int i13 = this.f3758s;
            this.f3758s = i13 + 1;
            iArr2[i13] = i10;
            iArr[i10] = i12;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5027i(int i10, int i11) {
        while (true) {
            m5026h(f3747L[i10]);
            int i12 = i10 + 1;
            if (i10 == i11) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5028j(int i10, int i11) {
        m5026h(i10);
        m5026h(i11);
    }

    /* JADX INFO: renamed from: k */
    public C1261t4 m5029k() {
        String strM4031i = f3746K[this.f3761v];
        if (strM4031i == null) {
            strM4031i = this.f3762w.m4031i();
        }
        int iM4026d = this.f3762w.m4026d();
        int iM4025c = this.f3762w.m4025c();
        int iM4030h = this.f3762w.m4030h();
        int iM4029g = this.f3762w.m4029g();
        C1261t4 c1261t4M5096a = C1261t4.m5096a(this.f3761v);
        c1261t4M5096a.f3815q = this.f3761v;
        c1261t4M5096a.f3820v = strM4031i;
        c1261t4M5096a.f3816r = iM4026d;
        c1261t4M5096a.f3818t = iM4030h;
        c1261t4M5096a.f3817s = iM4025c;
        c1261t4M5096a.f3819u = iM4029g;
        return c1261t4M5096a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x058e A[PHI: r4
  0x058e: PHI (r4v17 int) = 
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v16 int)
  (r4v27 int)
  (r4v16 int)
  (r4v33 int)
  (r4v16 int)
  (r4v16 int)
 binds: [B:346:0x0579, B:394:0x0643, B:393:0x063a, B:391:0x062f, B:392:0x0631, B:388:0x061c, B:389:0x061e, B:383:0x0608, B:385:0x060c, B:380:0x05f8, B:381:0x05fa, B:378:0x05e7, B:356:0x0598, B:352:0x058a, B:349:0x0583, B:348:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x08a9 A[LOOP:3: B:444:0x0755->B:551:0x08a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0885 A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5030l(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.C1236p3.m5030l(int, int):int");
    }

    /* JADX INFO: renamed from: m */
    public final int m5031m() {
        int i10 = this.f3755B;
        if (i10 == 9) {
            return m5018O(0, 2, 0);
        }
        if (i10 == 10) {
            return m5018O(0, 5, 0);
        }
        if (i10 == 12) {
            return m5018O(0, 4, 0);
        }
        if (i10 == 13) {
            return m5018O(0, 3, 0);
        }
        if (i10 == 32) {
            return m5018O(0, 1, 0);
        }
        if (i10 == 33) {
            this.f3761v = 89;
            return m5042x(0L, JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, 0L);
        }
        if (i10 == 37) {
            this.f3761v = Opcodes.LREM;
            return m5042x(0L, 0L, 32L);
        }
        if (i10 == 38) {
            this.f3761v = 107;
            return m5042x(0L, -9223372002495037440L, 0L);
        }
        if (i10 == 93) {
            return m5020Q(0, 80);
        }
        if (i10 == 94) {
            this.f3761v = 111;
            return m5042x(0L, 0L, 8L);
        }
        if (i10 == 118) {
            return m5042x(864691128455135232L, 0L, 0L);
        }
        if (i10 == 119) {
            return m5042x(FieldInfo.DISABLE_JSONB, 0L, 0L);
        }
        switch (i10) {
            case 40:
                return m5020Q(0, 75);
            case 41:
                return m5020Q(0, 76);
            case 42:
                this.f3761v = Opcodes.LMUL;
                return m5042x(0L, 2308094809027379200L, 128L);
            case 43:
                this.f3761v = HttpStatusCodesKt.HTTP_EARLY_HINTS;
                return m5042x(0L, 576460889742376960L, 0L);
            case 44:
                return m5020Q(0, 82);
            case 45:
                this.f3761v = Opcodes.IMUL;
                return m5042x(0L, 1152921779484753920L, JSONWriter.MASK_IGNORE_ERROR_GETTER);
            case Opcodes.IALOAD /* 46 */:
                this.f3761v = 83;
                return m5042x(0L, 0L, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY);
            case 47:
                this.f3761v = 106;
                return m5042x(0L, FieldInfo.RECORD, 0L);
            case 91:
                return m5020Q(0, 79);
            case Opcodes.LMUL /* 105 */:
                return m5042x(541165879296L, 0L, 0L);
            case Opcodes.IDIV /* 108 */:
                return m5042x(549755813888L, 0L, 0L);
            case 110:
                return m5042x(7696581394432L, 0L, 0L);
            case Opcodes.IREM /* 112 */:
                return m5042x(131941395333120L, 0L, 0L);
            case Opcodes.LSHR /* 123 */:
                return m5020Q(0, 77);
            case Opcodes.IUSHR /* 124 */:
                this.f3761v = Opcodes.LDIV;
                return m5042x(0L, 8589934592L, 2L);
            case Opcodes.LUSHR /* 125 */:
                return m5020Q(0, 78);
            case 126:
                return m5020Q(0, 90);
            default:
                switch (i10) {
                    case Opcodes.ASTORE /* 58 */:
                        this.f3761v = Opcodes.FCMPL;
                        return m5042x(0L, 0L, JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY);
                    case 59:
                        return m5020Q(0, 81);
                    case 60:
                        this.f3761v = 87;
                        return m5042x(0L, 9007199523176448L, 66048L);
                    case 61:
                        this.f3761v = 84;
                        return m5042x(0L, JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING, 0L);
                    case 62:
                        this.f3761v = 85;
                        return m5042x(0L, 180143986168561664L, 10240L);
                    case 63:
                        this.f3761v = Opcodes.LCMP;
                        return m5042x(0L, 0L, 17694720L);
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        return m5042x(0L, 384301392744939520L, 21845L);
                    default:
                        switch (i10) {
                            case Opcodes.LADD /* 97 */:
                                return m5042x(JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME, 0L, 0L);
                            case 98:
                                return m5042x(45056L, 0L, 0L);
                            case 99:
                                return m5042x(2048000L, 0L, 0L);
                            case 100:
                                return m5042x(14680064L, 0L, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                            case 101:
                                return m5042x(117440512L, 0L, 0L);
                            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                return m5042x(4160749568L, 0L, 0L);
                            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                return m5042x(JSONWriter.MASK_IGNORE_NON_FIELD_GETTER, 0L, 0L);
                            default:
                                switch (i10) {
                                    case 114:
                                        return m5042x(140737488355328L, 0L, 0L);
                                    case 115:
                                        return m5042x(8725724278030336L, 0L, 0L);
                                    case Opcodes.INEG /* 116 */:
                                        return m5042x(279223176896970752L, 0L, 0L);
                                    default:
                                        return m5030l(1, 0);
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m5032n(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(8, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v == 'e') {
                return m5033o(j16, FieldInfo.FIELD_MASK, j17, 0L, j18, 0L);
            }
            if (cM5087v == 'f') {
                return m5033o(j16, 0L, j17, FieldInfo.READ_ONLY, j18, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
            }
            if (cM5087v == 'i') {
                return m5033o(j16, 0L, j17, FieldInfo.DISABLE_ARRAY_MAPPING, j18, 16384L);
            }
            if (cM5087v != 'r') {
                if (cM5087v == 't') {
                    if ((FieldInfo.JIT & j17) != 0) {
                        this.f3761v = Opcodes.FNEG;
                        this.f3760u = 10;
                    }
                    return m5033o(j16, 0L, j17, 0L, j18, 1024L);
                }
                if (cM5087v == 'n') {
                    return (1 & j18) != 0 ? m5020Q(10, 128) : (16 & j18) != 0 ? m5020Q(10, Opcodes.IINC) : (64 & j18) != 0 ? m5020Q(10, Opcodes.I2F) : (256 & j18) != 0 ? m5020Q(10, Opcodes.L2I) : m5033o(j16, 0L, j17, 17592186044416L, j18, 0L);
                }
                if (cM5087v == 'o') {
                    return m5033o(j16, 0L, j17, FieldInfo.VALUE_MASK, j18, 0L);
                }
            } else if ((70368744177664L & j17) != 0) {
                return m5020Q(10, 110);
            }
            return m5019P(9, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(9, j16, j17, j18);
            return 10;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m5033o(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j11 & j10;
        long j17 = j13 & j12;
        long j18 = j15 & j14;
        if ((j16 | j17 | j18) == 0) {
            return m5019P(9, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v == '_') {
                return m5034p(j16, 0L, j17, 0L, j18, 1024L);
            }
            if (cM5087v != 'd') {
                if (cM5087v == 'g') {
                    return m5034p(j16, 0L, j17, FieldInfo.DISABLE_ARRAY_MAPPING, j18, 16384L);
                }
                if (cM5087v != 'r') {
                    if (cM5087v == 't') {
                        if ((FieldInfo.READ_ONLY & j17) != 0) {
                            this.f3761v = Opcodes.ISHL;
                            this.f3760u = 11;
                        }
                        return m5034p(j16, 0L, j17, 0L, j18, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
                    }
                } else if ((FieldInfo.VALUE_MASK & j17) != 0) {
                    return m5020Q(11, Opcodes.IREM);
                }
            } else {
                if ((FieldInfo.FIELD_MASK & j16) != 0) {
                    return m5018O(11, 52, 42);
                }
                if ((17592186044416L & j17) != 0) {
                    return m5020Q(11, Opcodes.IDIV);
                }
            }
            return m5019P(10, j16, j17, j18);
        } catch (IOException unused) {
            m5021R(10, j16, j17, j18);
            return 11;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m5034p(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j13 & j12;
        long j17 = j15 & j14;
        if (((j11 & j10) | j16 | j17) == 0) {
            return m5019P(10, j10, j12, j14);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != '_' ? cM5087v != 'a' ? cM5087v != 'n' ? m5019P(11, 0L, j16, j17) : m5035q(j16, FieldInfo.DISABLE_ARRAY_MAPPING, j17, 16384L) : m5035q(j16, 0L, j17, 1024L) : m5035q(j16, 0L, j17, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
        } catch (IOException unused) {
            m5021R(11, 0L, j16, j17);
            return 12;
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m5035q(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(11, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'a' ? cM5087v != 'e' ? cM5087v != 's' ? m5019P(12, 0L, j14, j15) : m5036r(j14, 0L, j15, 1024L) : m5036r(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L) : m5036r(j14, 0L, j15, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
        } catch (IOException unused) {
            m5021R(12, 0L, j14, j15);
            return 13;
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m5036r(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(12, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'd' ? cM5087v != 's' ? m5019P(13, 0L, j14, j15) : m5037s(j14, 0L, j15, 5120L) : m5037s(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L);
        } catch (IOException unused) {
            m5021R(13, 0L, j14, j15);
            return 14;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m5037s(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(13, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != '_' ? cM5087v != 'i' ? cM5087v != 's' ? m5019P(14, 0L, j14, j15) : m5038t(j14, 0L, j15, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) : m5038t(j14, 0L, j15, 1024L) : m5038t(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L);
        } catch (IOException unused) {
            m5021R(14, 0L, j14, j15);
            return 15;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m5038t(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(14, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'g' ? cM5087v != 'i' ? cM5087v != 's' ? m5019P(15, 0L, j14, j15) : m5039u(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L) : m5039u(j14, 0L, j15, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE) : m5039u(j14, 0L, j15, 1024L);
        } catch (IOException unused) {
            m5021R(15, 0L, j14, j15);
            return 16;
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m5039u(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(15, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'g' ? cM5087v != 'h' ? (cM5087v == 'n' && (1024 & j15) != 0) ? m5020Q(17, 138) : m5019P(16, 0L, j14, j15) : m5040v(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L) : m5040v(j14, 0L, j15, JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE);
        } catch (IOException unused) {
            m5021R(16, 0L, j14, j15);
            return 17;
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m5040v(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(16, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'i' ? (cM5087v == 'n' && (JSONWriter.MASK_NOT_WRITE_DEFAULT_VALUE & j15) != 0) ? m5020Q(18, Opcodes.F2L) : m5019P(17, 0L, j14, j15) : m5041w(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L);
        } catch (IOException unused) {
            m5021R(17, 0L, j14, j15);
            return 18;
        }
    }

    /* JADX INFO: renamed from: w */
    public final int m5041w(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(17, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != 'f' ? m5019P(18, 0L, j14, j15) : m5043y(j14, FieldInfo.DISABLE_ARRAY_MAPPING, j15, 16384L);
        } catch (IOException unused) {
            m5021R(18, 0L, j14, j15);
            return 19;
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m5042x(long j10, long j11, long j12) {
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v != '&') {
                if (cM5087v != ':') {
                    if (cM5087v == 'r') {
                        return m5010G(j10, 225232757926666240L, j11, 360287970189639680L, j12, 20480L);
                    }
                    if (cM5087v != '|') {
                        if (cM5087v == '*') {
                            if ((j11 & FieldInfo.READ_USING_MASK) != 0) {
                                this.f3761v = 115;
                                this.f3760u = 1;
                            }
                            return m5010G(j10, 0L, j11, 0L, j12, 128L);
                        }
                        if (cM5087v != '+') {
                            if (cM5087v != '-') {
                                if (cM5087v == '.') {
                                    return (j12 & JSONWriter.MASK_WRITE_NULL_NUMBER_AS_ZERO) != 0 ? m5020Q(1, Opcodes.DCMPG) : m5010G(j10, 0L, j11, 0L, j12, JSONWriter.MASK_WRITE_NULL_STRING_AS_EMPTY);
                                }
                                if (cM5087v == 'a') {
                                    return m5010G(j10, 9895739064320L, j11, JSONWriter.MASK_WRITE_ENUM_USING_ORDINAL, j12, 1L);
                                }
                                if (cM5087v == 'b') {
                                    return m5010G(j10, JSONWriter.MASK_NOT_WRITE_HASHMAP_ARRAY_LIST_CLASS_NAME, j11, 369435906932736L, j12, 0L);
                                }
                                if (cM5087v == 't') {
                                    return m5010G(j10, 1688849860263936L, j11, 0L, j12, 0L);
                                }
                                if (cM5087v == 'u') {
                                    return m5010G(j10, 74766790688768L, j11, 0L, j12, 0L);
                                }
                                switch (cM5087v) {
                                    case '<':
                                        if ((j11 & FieldInfo.DISABLE_SMART_MATCH) != 0) {
                                            this.f3761v = Opcodes.LNEG;
                                            this.f3760u = 1;
                                        }
                                        return m5010G(j10, 0L, j11, 0L, j12, 512L);
                                    case '=':
                                        if ((j11 & JSONWriter.MASK_WRITE_NON_STRING_KEY_AS_STRING) != 0) {
                                            return m5020Q(1, 91);
                                        }
                                        if ((j11 & JSONWriter.MASK_WRITE_PAIR_AS_JAVA_BEAN) != 0) {
                                            this.f3761v = 92;
                                            this.f3760u = 1;
                                        } else {
                                            if ((j11 & JSONWriter.MASK_ESCAPE_NONE_ASCII) != 0) {
                                                return m5020Q(1, 94);
                                            }
                                            if ((j11 & JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) != 0) {
                                                return m5020Q(1, 96);
                                            }
                                            if ((j11 & FieldInfo.DISABLE_AUTO_TYPE) != 0) {
                                                return m5020Q(1, Opcodes.LSHR);
                                            }
                                            if ((j11 & FieldInfo.DISABLE_JSONB) != 0) {
                                                return m5020Q(1, Opcodes.IUSHR);
                                            }
                                            if ((j11 & FieldInfo.BACKR_REFERENCE) != 0) {
                                                return m5020Q(1, Opcodes.LUSHR);
                                            }
                                            if ((j11 & FieldInfo.RECORD) != 0) {
                                                return m5020Q(1, 126);
                                            }
                                            if ((j11 & Long.MIN_VALUE) != 0) {
                                                return m5020Q(1, 127);
                                            }
                                            if ((j12 & 2) != 0) {
                                                return m5020Q(1, Opcodes.LOR);
                                            }
                                            if ((j12 & 8) != 0) {
                                                return m5020Q(1, Opcodes.LXOR);
                                            }
                                            if ((j12 & 32) != 0) {
                                                return m5020Q(1, Opcodes.I2L);
                                            }
                                        }
                                        return m5010G(j10, 0L, j11, 0L, j12, JSONWriter.MASK_PRETTY_FORMAT);
                                    case '>':
                                        if ((j11 & FieldInfo.DISABLE_UNSAFE) != 0) {
                                            this.f3761v = Opcodes.DNEG;
                                            this.f3760u = 1;
                                        } else if ((j12 & JSONWriter.MASK_IGNORE_ERROR_GETTER) != 0) {
                                            return m5020Q(1, Opcodes.D2L);
                                        }
                                        return m5010G(j10, 0L, j11, FieldInfo.DISABLE_REFERENCE_DETECT, j12, 10240L);
                                    case '?':
                                        if ((j12 & 262144) != 0) {
                                            this.f3761v = Opcodes.I2C;
                                            this.f3760u = 1;
                                        }
                                        return m5010G(j10, 0L, j11, 0L, j12, JSONWriter.MASK_REFERENCE_DETECTION);
                                    default:
                                        switch (cM5087v) {
                                            case 'e':
                                                return m5010G(j10, 142936513708032L, j11, 0L, j12, JSONWriter.MASK_WRITE_NULL_BOOLEAN_AS_FALSE);
                                            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                                if ((j10 & 8589934592L) != 0) {
                                                    return m5018O(1, 33, 42);
                                                }
                                                break;
                                            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                                return m5010G(j10, 0L, j11, 2151677952L, j12, 0L);
                                            case Opcodes.IMUL /* 104 */:
                                                return m5010G(j10, 1207246175112265728L, j11, 0L, j12, 0L);
                                            case Opcodes.LMUL /* 105 */:
                                                return m5010G(j10, 805306368L, j11, 0L, j12, 0L);
                                            default:
                                                switch (cM5087v) {
                                                    case Opcodes.IDIV /* 108 */:
                                                        return m5010G(j10, 1090535424L, j11, 18014399063130112L, j12, 1024L);
                                                    case Opcodes.LDIV /* 109 */:
                                                        return m5010G(j10, 51539607552L, j11, FieldInfo.RAW_VALUE_MASK, j12, 64L);
                                                    case 'n':
                                                        return m5010G(j10, 481069891584L, j11, 0L, j12, 0L);
                                                    case 'o':
                                                        if ((j10 & JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY) != 0) {
                                                            this.f3761v = 22;
                                                            this.f3760u = 1;
                                                        }
                                                        return m5010G(j10, 864691684663365632L, j11, JSONWriter.MASK_WRITE_LONG_AS_STRING, j12, 4L);
                                                    case Opcodes.IREM /* 112 */:
                                                        return m5010G(j10, 0L, j11, FieldInfo.FIELD_MASK, j12, 256L);
                                                    default:
                                                        switch (cM5087v) {
                                                            case Opcodes.DNEG /* 119 */:
                                                                return m5010G(j10, FieldInfo.READ_USING_MASK, j11, 0L, j12, 0L);
                                                            case Opcodes.ISHL /* 120 */:
                                                                return m5010G(j10, JSONWriter.MASK_NOT_WRITE_EMPTY_ARRAY, j11, 0L, j12, 16L);
                                                            case Opcodes.LSHL /* 121 */:
                                                                return m5010G(j10, 4503599627403264L, j11, 0L, j12, 0L);
                                                        }
                                                }
                                        }
                                        break;
                                }
                            } else if ((j11 & JSONWriter.MASK_UNQUOTE_FIELD_NAME) != 0) {
                                return m5020Q(1, HttpStatusCodesKt.HTTP_PROCESSING);
                            }
                        } else if ((j11 & 137438953472L) != 0) {
                            return m5020Q(1, 101);
                        }
                    } else if ((j11 & 8589934592L) != 0) {
                        return m5020Q(1, 97);
                    }
                } else {
                    if ((j12 & JSONWriter.MASK_WRITE_BIG_DECIMAL_AS_PLAIN) != 0) {
                        return m5020Q(1, Opcodes.I2S);
                    }
                    if ((j12 & JSONWriter.MASK_WRITE_NULL_LIST_AS_EMPTY) != 0) {
                        return m5020Q(1, Opcodes.FCMPG);
                    }
                }
            } else if ((j11 & JSONWriter.MASK_BROWSER_SECURE) != 0) {
                return m5020Q(1, 99);
            }
            return m5019P(0, j10, j11, j12);
        } catch (IOException unused) {
            m5021R(0, j10, j11, j12);
            return 1;
        }
    }

    /* JADX INFO: renamed from: y */
    public final int m5043y(long j10, long j11, long j12, long j13) {
        long j14 = j11 & j10;
        long j15 = j13 & j12;
        if ((j14 | j15) == 0) {
            return m5019P(18, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            if (cM5087v != 't') {
                return m5019P(19, 0L, j14, j15);
            }
            if ((FieldInfo.DISABLE_ARRAY_MAPPING & j14) != 0) {
                this.f3761v = Opcodes.ISHR;
                this.f3760u = 20;
            }
            return m5044z(j14, 0L, j15, 16384L);
        } catch (IOException unused) {
            m5021R(19, 0L, j14, j15);
            return 20;
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m5044z(long j10, long j11, long j12, long j13) {
        long j14 = j13 & j12;
        if (((j11 & j10) | j14) == 0) {
            return m5019P(19, 0L, j10, j12);
        }
        try {
            char cM5087v = this.f3762w.m5087v();
            this.f3755B = cM5087v;
            return cM5087v != '_' ? m5019P(20, 0L, 0L, j14) : m5004A(j14, 16384L);
        } catch (IOException unused) {
            m5021R(20, 0L, 0L, j14);
            return 21;
        }
    }
}
