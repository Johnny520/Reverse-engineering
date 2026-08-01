package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.y1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1288y1 {

    /* JADX INFO: renamed from: a */
    public static final C1288y1 f3876a = new C1288y1();

    /* JADX INFO: renamed from: b */
    public static final int[] f3877b = {48, 58, 65, 91, 97, Opcodes.LSHR, Opcodes.LOR, 256, 384, 592, 688, 768, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, 2048, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, 4352, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, 56320, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, 131072, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576};

    /* JADX INFO: renamed from: bsh.y1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements Iterator {
        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return null;
        }
    }

    /* JADX INFO: renamed from: bsh.y1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements Iterator {

        /* JADX INFO: renamed from: q */
        public int f3879q = 0;

        /* JADX INFO: renamed from: r */
        public final int f3880r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Object f3881s;

        public b(Object obj) {
            this.f3881s = obj;
            this.f3880r = Array.getLength(obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3879q < this.f3880r;
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                Object obj = this.f3881s;
                int i10 = this.f3879q;
                this.f3879q = i10 + 1;
                return Array.get(obj, i10);
            } catch (Throwable th) {
                throw new NoSuchElementException(th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m5207a(int i10, int i11) {
        return i10 - i11;
    }

    /* JADX INFO: renamed from: l */
    public static synchronized C1288y1 m5208l() {
        return f3876a;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m5209b(Object obj) {
        return new b(obj);
    }

    /* JADX INFO: renamed from: c */
    public final Iterator m5210c() {
        return new a();
    }

    /* JADX INFO: renamed from: d */
    public Iterator m5211d(CharSequence charSequence) {
        return m5209b(charSequence.toString().toCharArray());
    }

    /* JADX INFO: renamed from: e */
    public Iterator m5212e(Character ch) {
        char cCharValue = ch.charValue();
        int[] iArr = f3877b;
        int length = iArr.length;
        int i10 = 33;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            if (i10 > cCharValue) {
                break;
            }
            i11++;
            i12 = i10;
            i10 = i13;
        }
        return IntStream.rangeClosed(i12, cCharValue).boxed().map(new Function() { // from class: bsh.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Character.toChars(((Integer) obj).intValue());
            }
        }).map(new Function() { // from class: bsh.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((char[]) obj);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: f */
    public Iterator m5213f(Iterable iterable) {
        return iterable.iterator();
    }

    /* JADX INFO: renamed from: g */
    public Iterator m5214g(Number number) {
        final int iIntValue = number.intValue();
        return iIntValue == 0 ? m5210c() : iIntValue > 0 ? IntStream.rangeClosed(0, iIntValue).iterator() : IntStream.rangeClosed(iIntValue, 0).map(new IntUnaryOperator() { // from class: bsh.x1
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return C1288y1.m5207a(iIntValue, i10);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: h */
    public Iterator m5215h(Object obj) {
        return obj == null ? m5210c() : obj instanceof Primitive ? m5215h(Primitive.unwrap(obj)) : obj.getClass().isArray() ? m5209b(obj) : obj instanceof Iterable ? m5213f((Iterable) obj) : obj instanceof Iterator ? m5218k((Iterator) obj) : obj instanceof Enumeration ? m5217j((Enumeration) obj) : obj instanceof CharSequence ? m5211d((CharSequence) obj) : obj instanceof Number ? m5214g((Number) obj) : obj instanceof Character ? m5212e((Character) obj) : obj instanceof String ? m5216i((String) obj) : m5219m(obj).iterator();
    }

    /* JADX INFO: renamed from: i */
    public Iterator m5216i(String str) {
        return m5209b(str.toCharArray());
    }

    /* JADX INFO: renamed from: j */
    public Iterator m5217j(Enumeration enumeration) {
        return Collections.list(enumeration).iterator();
    }

    /* JADX INFO: renamed from: m */
    public final Stream m5219m(Object obj) {
        Class clsM4994a = obj.getClass();
        if (obj instanceof Class) {
            clsM4994a = (Class) obj;
        }
        if (obj instanceof C1228o1) {
            clsM4994a = ((C1228o1) obj).m4994a();
        }
        final String str = "    ";
        return AbstractC1143c4.m4174i0(clsM4994a) ? Stream.concat(Stream.concat(Stream.of(AbstractC1225n4.m4966e(clsM4994a)), Stream.concat(Stream.of((Object[]) AbstractC1143c4.m4205y(clsM4994a)).map(new Function() { // from class: bsh.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return AbstractC1225n4.m4985x((C1291y4) obj2);
            }
        }).map(new Function() { // from class: bsh.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return str.concat((String) obj2);
            }
        }), Stream.of((Object[]) AbstractC1143c4.m4203x(clsM4994a)).map(new Function() { // from class: bsh.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return AbstractC1225n4.m4975n((C1168e1) obj2);
            }
        }).map(new Function() { // from class: bsh.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return str.concat((String) obj2);
            }
        }))), Stream.of("}")) : Stream.concat(Stream.concat(Stream.of(AbstractC1225n4.m4966e(clsM4994a)), Stream.concat(Stream.of((Object[]) clsM4994a.getFields()).map(new Function() { // from class: bsh.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return AbstractC1225n4.m4986y((Field) obj2);
            }
        }).map(new Function() { // from class: bsh.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return str.concat((String) obj2);
            }
        }), Stream.of((Object[]) clsM4994a.getMethods()).map(new Function() { // from class: bsh.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return AbstractC1225n4.m4980s((Method) obj2);
            }
        }).map(new Function() { // from class: bsh.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return str.concat((String) obj2);
            }
        }))), Stream.of("}"));
    }

    /* JADX INFO: renamed from: k */
    public Iterator m5218k(Iterator it) {
        return it;
    }
}
