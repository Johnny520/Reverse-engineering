package af;

import af.C0328a;
import af.C0330c;
import af.C0333f;
import af.C0335h;
import af.C0338k;
import cf.C1529c;
import cf.C1530c0;
import cf.C1531d;
import cf.C1533e;
import cf.C1539h;
import cf.C1543j;
import cf.C1545k;
import cf.C1547l;
import cf.C1548m;
import cf.C1549n;
import cf.C1550o;
import cf.C1551p;
import cf.C1552q;
import cf.C1553r;
import cf.C1554s;
import cf.C1556u;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import org.luckypray.dexkit.DexKitBridge;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p215oc.C5729x;
import p322w5.AbstractC9187b;
import p347xe.EnumC9490a;

/* JADX INFO: renamed from: af.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0331d {

    /* JADX INFO: renamed from: c */
    public static final a f843c = new a(null);

    /* JADX INFO: renamed from: a */
    public final Object f844a;

    /* JADX INFO: renamed from: b */
    public final EnumC9490a f845b;

    /* JADX INFO: renamed from: af.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f847a;

        static {
            int[] iArr = new int[EnumC9490a.values().length];
            try {
                iArr[EnumC9490a.ByteValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9490a.ShortValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9490a.IntValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9490a.LongValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9490a.FloatValue.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9490a.DoubleValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC9490a.TypeValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC9490a.MethodValue.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC9490a.EnumValue.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC9490a.ArrayValue.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC9490a.AnnotationValue.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC9490a.StringValue.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC9490a.NullValue.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f847a = iArr;
        }
    }

    public C0331d(Object obj, EnumC9490a enumC9490a) {
        this.f844a = obj;
        this.f845b = enumC9490a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        switch (b.f847a[this.f845b.ordinal()]) {
            case 7:
                Object obj = this.f844a;
                obj.getClass();
                sb2.append(((C0333f) obj).m1024l());
                break;
            case 8:
                Object obj2 = this.f844a;
                obj2.getClass();
                C0338k c0338k = (C0338k) obj2;
                sb2.append(c0338k.m1071m());
                sb2.append(" ");
                sb2.append(c0338k.m1065g());
                sb2.append(".");
                sb2.append(c0338k.m1068j());
                sb2.append("(");
                sb2.append(AbstractC5081g0.m20585s0(c0338k.m1070l(), ", ", null, null, 0, null, null, 62, null));
                sb2.append(")");
                break;
            case 9:
                Object obj3 = this.f844a;
                obj3.getClass();
                C0335h c0335h = (C0335h) obj3;
                sb2.append(c0335h.m1047k());
                sb2.append(".");
                sb2.append(c0335h.m1045i());
                break;
            case 10:
                sb2.append("{");
                Object obj4 = this.f844a;
                obj4.getClass();
                sb2.append(AbstractC5081g0.m20585s0(((C0330c) obj4).m1008c(), ", ", null, null, 0, null, null, 62, null));
                sb2.append("}");
                break;
            case Opcodes.FCONST_0 /* 11 */:
                Object obj5 = this.f844a;
                obj5.getClass();
                sb2.append(((C0328a) obj5).toString());
                break;
            case Opcodes.FCONST_1 /* 12 */:
                sb2.append("\"");
                sb2.append(this.f844a);
                sb2.append("\"");
                break;
            case Opcodes.FCONST_2 /* 13 */:
                sb2.append("null");
                break;
            default:
                sb2.append(this.f844a);
                break;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: af.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: af.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public /* synthetic */ class C10041a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f846a;

            static {
                int[] iArr = new int[EnumC9490a.values().length];
                try {
                    iArr[EnumC9490a.ByteValue.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC9490a.ShortValue.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC9490a.CharValue.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC9490a.IntValue.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC9490a.LongValue.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC9490a.FloatValue.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC9490a.DoubleValue.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC9490a.StringValue.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC9490a.TypeValue.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC9490a.MethodValue.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC9490a.EnumValue.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC9490a.ArrayValue.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC9490a.AnnotationValue.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC9490a.NullValue.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC9490a.BoolValue.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                f846a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0331d m1010a(Object obj, EnumC9490a enumC9490a) {
            obj.getClass();
            enumC9490a.getClass();
            return new C0331d(obj, enumC9490a, null);
        }

        /* JADX INFO: renamed from: b */
        public final C0331d m1011b(DexKitBridge dexKitBridge, C1531d c1531d) {
            Object objValueOf;
            dexKitBridge.getClass();
            c1531d.getClass();
            EnumC9490a enumC9490aM36984a = EnumC9490a.f32229r.m36984a(c1531d.m5997n());
            switch (C10041a.f846a[enumC9490aM36984a.ordinal()]) {
                case 1:
                    AbstractC9187b abstractC9187bM5998o = c1531d.m5998o(new C1545k());
                    abstractC9187bM5998o.getClass();
                    objValueOf = Byte.valueOf(((C1545k) abstractC9187bM5998o).m6088l());
                    break;
                case 2:
                    AbstractC9187b abstractC9187bM5998o2 = c1531d.m5998o(new C1553r());
                    abstractC9187bM5998o2.getClass();
                    objValueOf = Short.valueOf(((C1553r) abstractC9187bM5998o2).m6116l());
                    break;
                case 3:
                    AbstractC9187b abstractC9187bM5998o3 = c1531d.m5998o(new C1547l());
                    abstractC9187bM5998o3.getClass();
                    objValueOf = Short.valueOf(((C1547l) abstractC9187bM5998o3).m6099l());
                    break;
                case 4:
                    AbstractC9187b abstractC9187bM5998o4 = c1531d.m5998o(new C1550o());
                    abstractC9187bM5998o4.getClass();
                    objValueOf = Integer.valueOf(((C1550o) abstractC9187bM5998o4).m6108l());
                    break;
                case 5:
                    AbstractC9187b abstractC9187bM5998o5 = c1531d.m5998o(new C1551p());
                    abstractC9187bM5998o5.getClass();
                    objValueOf = Long.valueOf(((C1551p) abstractC9187bM5998o5).m6112l());
                    break;
                case 6:
                    AbstractC9187b abstractC9187bM5998o6 = c1531d.m5998o(new C1549n());
                    abstractC9187bM5998o6.getClass();
                    objValueOf = Float.valueOf(((C1549n) abstractC9187bM5998o6).m6104l());
                    break;
                case 7:
                    AbstractC9187b abstractC9187bM5998o7 = c1531d.m5998o(new C1548m());
                    abstractC9187bM5998o7.getClass();
                    objValueOf = Double.valueOf(((C1548m) abstractC9187bM5998o7).m6100l());
                    break;
                case 8:
                    AbstractC9187b abstractC9187bM5998o8 = c1531d.m5998o(new C1554s());
                    abstractC9187bM5998o8.getClass();
                    objValueOf = ((C1554s) abstractC9187bM5998o8).m6120l();
                    objValueOf.getClass();
                    break;
                case 9:
                    C0333f.a aVar = C0333f.f848q;
                    AbstractC9187b abstractC9187bM5998o9 = c1531d.m5998o(new C1539h());
                    abstractC9187bM5998o9.getClass();
                    objValueOf = aVar.m1027a(dexKitBridge, (C1539h) abstractC9187bM5998o9);
                    break;
                case 10:
                    C0338k.a aVar2 = C0338k.f913u;
                    AbstractC9187b abstractC9187bM5998o10 = c1531d.m5998o(new C1530c0());
                    abstractC9187bM5998o10.getClass();
                    objValueOf = aVar2.m1073a(dexKitBridge, (C1530c0) abstractC9187bM5998o10);
                    break;
                case Opcodes.FCONST_0 /* 11 */:
                    C0335h.a aVar3 = C0335h.f880n;
                    AbstractC9187b abstractC9187bM5998o11 = c1531d.m5998o(new C1556u());
                    abstractC9187bM5998o11.getClass();
                    objValueOf = aVar3.m1049a(dexKitBridge, (C1556u) abstractC9187bM5998o11);
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    C0330c.a aVar4 = C0330c.f840e;
                    AbstractC9187b abstractC9187bM5998o12 = c1531d.m5998o(new C1529c());
                    abstractC9187bM5998o12.getClass();
                    objValueOf = aVar4.m1009a(dexKitBridge, (C1529c) abstractC9187bM5998o12);
                    break;
                case Opcodes.FCONST_2 /* 13 */:
                    C0328a.a aVar5 = C0328a.f830i;
                    AbstractC9187b abstractC9187bM5998o13 = c1531d.m5998o(new C1533e());
                    abstractC9187bM5998o13.getClass();
                    objValueOf = aVar5.m1005a(dexKitBridge, (C1533e) abstractC9187bM5998o13);
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    AbstractC9187b abstractC9187bM5998o14 = c1531d.m5998o(new C1552q());
                    abstractC9187bM5998o14.getClass();
                    objValueOf = (C1552q) abstractC9187bM5998o14;
                    break;
                case 15:
                    AbstractC9187b abstractC9187bM5998o15 = c1531d.m5998o(new C1543j());
                    abstractC9187bM5998o15.getClass();
                    objValueOf = Boolean.valueOf(((C1543j) abstractC9187bM5998o15).m6082l());
                    break;
                default:
                    C5729x.m23182a();
                    return null;
            }
            return new C0331d(objValueOf, enumC9490aM36984a, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0331d(Object obj, EnumC9490a enumC9490a, AbstractC1043k abstractC1043k) {
        this(obj, enumC9490a);
    }
}
