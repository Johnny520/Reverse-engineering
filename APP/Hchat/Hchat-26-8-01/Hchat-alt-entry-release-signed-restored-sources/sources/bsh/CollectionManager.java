package bsh;

import bsh.org.objectweb.asm.Opcodes;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import okio.Utf8;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CollectionManager {
    private static final CollectionManager manager = new CollectionManager();
    private static final int[] unicodeBlockStarts = {48, 58, 65, 91, 97, 123, 129, Opcodes.ACC_NATIVE, 384, 592, 688, 768, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, Opcodes.ACC_STRICT, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, 4352, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, Utf8.LOG_SURROGATE_HEADER, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, Opcodes.ACC_DEPRECATED, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Iterator<Object> arrayIt(Object obj) {
        return new Iterator<Object>(obj) { // from class: bsh.CollectionManager.2
            private int index = 0;
            private final int length;
            final /* synthetic */ Object val$array;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            {
                this.val$array = obj;
                this.length = Array.getLength(obj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < this.length;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.Iterator
            public Object next() {
                try {
                    Object obj2 = this.val$array;
                    int i9 = this.index;
                    this.index = i9 + 1;
                    return Array.get(obj2, i9);
                } catch (Throwable th2) {
                    C2104o.m5287l(th2.getMessage());
                    return null;
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private <T> Iterator<T> emptyIt() {
        return new Iterator<T>() { // from class: bsh.CollectionManager.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.Iterator
            public T next() {
                return null;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized CollectionManager getCollectionManager() {
        return manager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getBshIterator$0(int i9, int i10) {
        return i9 - i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Stream<String> reflectNames(Object obj) {
        Class<?> targetClass = obj.getClass();
        if (obj instanceof Class) {
            targetClass = (Class) obj;
        }
        if (obj instanceof ClassIdentifier) {
            targetClass = ((ClassIdentifier) obj).getTargetClass();
        }
        return Reflect.isGeneratedClass(targetClass) ? Stream.concat(Stream.concat(Stream.of(StringUtil.classString(targetClass)), Stream.concat(Stream.of((Object[]) Reflect.getDeclaredVariables(targetClass)).map(new C0342b(4)).map(new C0342b(5)), Stream.of((Object[]) Reflect.getDeclaredMethods(targetClass)).map(new C0342b(6)).map(new C0342b(5)))), Stream.of("}")) : Stream.concat(Stream.concat(Stream.of(StringUtil.classString(targetClass)), Stream.concat(Stream.of((Object[]) targetClass.getFields()).map(new C0342b(7)).map(new C0342b(5)), Stream.of((Object[]) targetClass.getMethods()).map(new C0342b(8)).map(new C0342b(5)))), Stream.of("}"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Iterator<?> getBshIterator(Object obj) {
        return obj == null ? emptyIt() : obj instanceof Primitive ? getBshIterator(Primitive.unwrap(obj)) : obj.getClass().isArray() ? arrayIt(obj) : obj instanceof Iterable ? getBshIterator((Iterable) obj) : obj instanceof Iterator ? getBshIterator((Iterator) obj) : obj instanceof Enumeration ? getBshIterator((Enumeration) obj) : obj instanceof CharSequence ? getBshIterator((CharSequence) obj) : obj instanceof Number ? getBshIterator((Number) obj) : obj instanceof Character ? getBshIterator((Character) obj) : obj instanceof String ? getBshIterator((String) obj) : reflectNames(obj).iterator();
    }

    public <T> Iterator<T> getBshIterator(Enumeration<T> enumeration) {
        return Collections.list(enumeration).iterator();
    }

    public <T> Iterator<T> getBshIterator(Iterable<T> iterable) {
        return iterable.iterator();
    }

    public Iterator<Object> getBshIterator(CharSequence charSequence) {
        return arrayIt(charSequence.toString().toCharArray());
    }

    public Iterator<Object> getBshIterator(String str) {
        return arrayIt(str.toCharArray());
    }

    public <T> Iterator<T> getBshIterator(T[] tArr) {
        return Arrays.asList(tArr).iterator();
    }

    public Iterator<Integer> getBshIterator(Number number) {
        final int iIntValue = number.intValue();
        if (iIntValue == 0) {
            return emptyIt();
        }
        if (iIntValue > 0) {
            return IntStream.rangeClosed(0, iIntValue).iterator();
        }
        return IntStream.rangeClosed(iIntValue, 0).map(new IntUnaryOperator() { // from class: bsh.g
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i9) {
                return CollectionManager.lambda$getBshIterator$0(iIntValue, i9);
            }
        }).iterator();
    }

    public Iterator<String> getBshIterator(Character ch2) {
        char cCharValue = ch2.charValue();
        int[] iArr = unicodeBlockStarts;
        int length = iArr.length;
        int i9 = 33;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            if (i9 > cCharValue) {
                break;
            }
            i10++;
            i11 = i9;
            i9 = i12;
        }
        return IntStream.rangeClosed(i11, cCharValue).boxed().map(new C0342b(9)).map(new C0342b(10)).iterator();
    }

    public <T> Iterator<T> getBshIterator(Iterator<T> it) {
        return it;
    }
}
