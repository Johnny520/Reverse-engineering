package bsh;

import bsh.Types;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.function.IntSupplier;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshArray {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshArray() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object castArray(Class<?> cls, Class<?> cls2, Object obj) {
        int i9 = 0;
        if (Collection.class.isAssignableFrom(cls)) {
            if (List.class.isAssignableFrom(cls) || Queue.class == cls) {
                if (cls.isAssignableFrom(ArrayList.class)) {
                    return new ArrayList(Arrays.asList((Object[]) Types.castObject(obj, Object.class, 0)));
                }
                if (cls.isAssignableFrom(LinkedList.class)) {
                    return new LinkedList(Arrays.asList((Object[]) Types.castObject(obj, Object.class, 0)));
                }
            } else {
                if (cls.isAssignableFrom(ArrayDeque.class)) {
                    return new ArrayDeque(Arrays.asList((Object[]) Types.castObject(obj, Object.class, 0)));
                }
                if (cls.isAssignableFrom(LinkedHashSet.class)) {
                    return new LinkedHashSet(Arrays.asList((Object[]) Types.castObject(obj, Object.class, 0)));
                }
            }
        }
        Class<?> clsArrayElementType = Types.arrayElementType(cls2);
        if (Map.class.isAssignableFrom(cls)) {
            if (Map.Entry.class.isAssignableFrom(clsArrayElementType)) {
                return mapOfEntries((Map.Entry[]) obj);
            }
            if (cls.isAssignableFrom(LinkedHashMap.class)) {
                int length = Array.getLength(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap((int) Math.ceil((((double) length) + 0.0d) / 2.0d));
                while (i9 < length) {
                    int i10 = i9 + 1;
                    linkedHashMap.put(Array.get(obj, i9), i10 < length ? Array.get(obj, i10) : null);
                    i9 += 2;
                }
                return linkedHashMap;
            }
        }
        int[] iArrDimensions = dimensions(obj);
        final int i11 = iArrDimensions[0];
        if (i11 == 0) {
            return Array.newInstance(cls, iArrDimensions);
        }
        Class<?> clsCommonType = commonType(clsArrayElementType, obj, new IntSupplier() { // from class: bsh.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return BshArray.lambda$castArray$0(i11);
            }
        });
        if (!Map.Entry.class.isAssignableFrom(cls)) {
            Class<?> clsArrayElementType2 = Types.arrayElementType(cls);
            Object objNewInstance = Array.newInstance(clsArrayElementType2, iArrDimensions);
            copy(clsArrayElementType2, objNewInstance, obj);
            return objNewInstance;
        }
        if (Map.Entry.class.isAssignableFrom(clsCommonType)) {
            if (Types.MapEntry.class != clsCommonType) {
                return obj;
            }
            Map.Entry[] entryArr = new Map.Entry[Array.getLength(obj)];
            copy(Map.Entry.class, entryArr, obj);
            return entryArr;
        }
        if (i11 == 1) {
            return new Types.MapEntry(Array.get(obj, 0), null);
        }
        if (i11 == 2) {
            return new Types.MapEntry(Array.get(obj, 0), Array.get(obj, 1));
        }
        Map.Entry[] entryArr2 = new Map.Entry[(int) Math.ceil((((double) i11) + 0.0d) / 2.0d)];
        int i12 = 0;
        while (i9 < i11) {
            int i13 = i12 + 1;
            int i14 = i9 + 1;
            entryArr2[i12] = new Types.MapEntry(Array.get(obj, i9), i14 < i11 ? Array.get(obj, i14) : null);
            i9 += 2;
            i12 = i13;
        }
        return entryArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> commonType(Class<?> cls, Object obj, IntSupplier intSupplier) {
        if (Object.class == cls) {
            int asInt = intSupplier.getAsInt();
            Class<?> commonType = null;
            for (int i9 = 0; i9 < asInt; i9++) {
                commonType = Types.getCommonType(commonType, Types.getType(Array.get(obj, 0)));
                if (Object.class == commonType) {
                    break;
                }
            }
            if (commonType != null && commonType != cls) {
                return commonType;
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object concat(Object obj, Object obj2) throws UtilEvalError {
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (Types.arrayDimensions(cls) == Types.arrayDimensions(cls2)) {
            Class<?> commonType = Types.getCommonType(Types.arrayElementType(cls), Types.arrayElementType(cls2));
            int[] iArrDimensions = dimensions(obj);
            iArrDimensions[0] = Array.getLength(obj2) + Array.getLength(obj);
            Object objNewInstance = Array.newInstance(commonType, iArrDimensions);
            copy(commonType, objNewInstance, obj, obj2);
            return objNewInstance;
        }
        throw new UtilEvalError("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + StringUtil.typeString(obj) + " with array of type " + StringUtil.typeString(obj2) + ".");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void copy(Class<?> cls, Object obj, Object... objArr) {
        int i9;
        int i10;
        int length = Array.getLength(objArr[0]);
        int length2 = objArr.length > 1 ? Array.getLength(obj) : length;
        if (Types.arrayDimensions(obj.getClass()) != 1) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length2) {
                if (length < length2 && i12 == length && (i9 = i13 + 1) < objArr.length) {
                    length = Array.getLength(objArr[i9]);
                    i12 = 0;
                    i13 = i9;
                }
                int i14 = i12 + 1;
                Object obj2 = Array.get(objArr[i13], i12);
                if (obj2 == null) {
                    Array.set(obj, i11, null);
                } else {
                    Object objNewInstance = Array.get(obj, i11);
                    if (Array.getLength(obj2) != Array.getLength(objNewInstance)) {
                        objNewInstance = Array.newInstance(cls, dimensions(obj2));
                        Array.set(obj, i11, objNewInstance);
                    }
                    copy(cls, objNewInstance, obj2);
                }
                i11++;
                i12 = i14;
            }
            return;
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length2; i17++) {
            int i18 = i16 + 1;
            Object objUnwrap = Array.get(objArr[i15], i16);
            try {
                objUnwrap = Primitive.unwrap(Types.castObject(objUnwrap, cls, 0));
            } catch (UtilEvalError unused) {
            }
            if (Byte.TYPE == cls) {
                Array.setByte(obj, i17, ((Byte) objUnwrap).byteValue());
            } else if (Short.TYPE == cls) {
                Array.setShort(obj, i17, ((Short) objUnwrap).shortValue());
            } else if (Integer.TYPE == cls) {
                Array.setInt(obj, i17, ((Integer) objUnwrap).intValue());
            } else if (Long.TYPE == cls) {
                Array.setLong(obj, i17, ((Long) objUnwrap).longValue());
            } else if (Float.TYPE == cls) {
                Array.setFloat(obj, i17, ((Float) objUnwrap).floatValue());
            } else if (Double.TYPE == cls) {
                Array.setDouble(obj, i17, ((Double) objUnwrap).doubleValue());
            } else if (Character.TYPE == cls) {
                Array.setChar(obj, i17, ((Character) objUnwrap).charValue());
            } else if (Boolean.TYPE == cls) {
                Array.setBoolean(obj, i17, ((Boolean) objUnwrap).booleanValue());
            } else {
                Array.set(obj, i17, objUnwrap);
            }
            if (length >= length2 || i18 != length || (i10 = i15 + 1) >= objArr.length) {
                i16 = i18;
            } else {
                length = Array.getLength(objArr[i10]);
                i15 = i10;
                i16 = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] dimensions(Object obj) {
        int iArrayDimensions = Types.arrayDimensions(obj.getClass());
        int[] iArr = new int[iArrayDimensions];
        if (iArrayDimensions != 0) {
            int length = Array.getLength(obj);
            iArr[0] = length;
            if (length != 0) {
                for (int i9 = 1; i9 < iArrayDimensions; i9++) {
                    obj = Array.get(obj, 0);
                    if (obj == null) {
                        break;
                    }
                    iArr[i9] = Array.getLength(obj);
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getIndex(Object obj, int i9) throws UtilTargetError {
        Interpreter.debug("getIndex: ", obj, ", index=", Integer.valueOf(i9));
        try {
            return obj instanceof List ? ((List) obj).get(i9) : Primitive.wrap(Array.get(obj, i9), Types.arrayElementType(obj.getClass()));
        } catch (IndexOutOfBoundsException e6) {
            throw new UtilTargetError(AbstractC3199a.m6837j(i9, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Map<?, ?> mapOfEntries(Map.Entry<?, ?>... entryArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(entryArr.length);
        for (Map.Entry<?, ?> entry : entryArr) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object repeat(List<Object> list, int i9) {
        if (i9 < 1) {
            return list instanceof Queue ? new LinkedList() : new ArrayList(0);
        }
        List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        if (i9 != 1) {
            while (true) {
                int i10 = i9 - 1;
                if (i9 <= 1) {
                    break;
                }
                linkedList.addAll(list);
                i9 = i10;
            }
        }
        return linkedList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setIndex(Object obj, int i9, Object obj2) throws UtilTargetError {
        try {
            Object objUnwrap = Primitive.unwrap(obj2);
            if (obj instanceof List) {
                ((List) obj).set(i9, objUnwrap);
            } else {
                Array.set(obj, i9, objUnwrap);
            }
        } catch (IllegalArgumentException e6) {
            throw new UtilTargetError(new ArrayStoreException(e6.getMessage()));
        } catch (IndexOutOfBoundsException e7) {
            throw new UtilTargetError(AbstractC3199a.m6837j(i9, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object slice(Object obj, int i9, int i10, int i11) {
        Class<?> clsArrayElementType = Types.arrayElementType(obj.getClass());
        int length = Array.getLength(obj);
        if (i10 > length) {
            i10 = length;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int i12 = i10 - i9;
        if (i12 <= 0) {
            return Array.newInstance(clsArrayElementType, 0);
        }
        if (i11 == 0 || i11 == 1) {
            Object objNewInstance = Array.newInstance(clsArrayElementType, i12);
            System.arraycopy(obj, i9, objNewInstance, 0, i12);
            return objNewInstance;
        }
        int iCeil = (int) Math.ceil((((double) i12) + 0.0d) / ((double) Math.abs(i11)));
        Object[] objArr = new Object[iCeil];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 % i11 == 0) {
                int i15 = i13 + 1;
                objArr[i13] = Array.get(obj, i11 < 0 ? (i12 - 1) - i14 : i14 + i9);
                i13 = i15;
            }
        }
        Object objNewInstance2 = Array.newInstance(clsArrayElementType, iCeil);
        copy(clsArrayElementType, objNewInstance2, objArr);
        return objNewInstance2;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class SteppedSubList extends AbstractList<Object> implements RandomAccess {
        private final List<Object> parent;
        private final List<Integer> steps;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SteppedSubList(List<Object> list, List<Integer> list2) {
            this.parent = list;
            this.steps = list2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public void add(int i9, Object obj) {
            int size = size();
            List<Integer> list = this.steps;
            int iIntValue = i9 == size ? list.get(i9 - 1).intValue() + 1 : list.get(i9).intValue();
            this.parent.add(iIntValue, obj);
            int i10 = i9;
            while (true) {
                int size2 = size();
                List<Integer> list2 = this.steps;
                if (i10 >= size2) {
                    list2.add(i9, Integer.valueOf(iIntValue));
                    return;
                } else {
                    list2.set(i10, Integer.valueOf(list2.get(i10).intValue() + 1));
                    i10++;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i9, Collection<? extends Object> collection) {
            Iterator<? extends Object> it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                add(i10 + i9, it.next());
                i10++;
            }
            return i10 > 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public Object get(int i9) {
            return this.parent.get(this.steps.get(i9).intValue());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<Object> iterator() {
            return listIterator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i9) {
            final ListIterator listIterator = new ArrayList(this.steps).listIterator(i9);
            return new ListIterator<Object>() { // from class: bsh.BshArray.SteppedSubList.1
                int lastIndex = 0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public void add(Object obj) {
                    SteppedSubList.this.add(this.lastIndex, obj);
                    listIterator.add((Integer) SteppedSubList.this.steps.get(this.lastIndex));
                    this.lastIndex = -1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasNext();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasPrevious();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator, java.util.Iterator
                public Object next() {
                    listIterator.next();
                    int iPreviousIndex = previousIndex();
                    this.lastIndex = iPreviousIndex;
                    return SteppedSubList.this.get(iPreviousIndex);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public int nextIndex() {
                    return listIterator.nextIndex();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public Object previous() {
                    listIterator.previous();
                    int iNextIndex = nextIndex();
                    this.lastIndex = iNextIndex;
                    return SteppedSubList.this.get(iNextIndex);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public int previousIndex() {
                    return listIterator.previousIndex();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    SteppedSubList.this.remove(this.lastIndex);
                    listIterator.remove();
                    this.lastIndex = -1;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.ListIterator
                public void set(Object obj) {
                    SteppedSubList.this.set(this.lastIndex, obj);
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i9) {
            int iIntValue = this.steps.get(i9).intValue();
            int i10 = i9 + 1;
            while (true) {
                int size = size();
                List<Integer> list = this.steps;
                if (i10 >= size) {
                    list.remove(i9);
                    return this.parent.remove(iIntValue);
                }
                list.set(i10, Integer.valueOf(list.get(i10).intValue() - 1));
                i10++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public Object set(int i9, Object obj) {
            return this.parent.set(this.steps.get(i9).intValue(), obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.steps.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.AbstractList, java.util.List
        public List<Object> subList(int i9, int i10) {
            return new SteppedSubList(this.parent, this.steps.subList(i9, i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends Object> collection) {
            return addAll(this.steps.size(), collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$castArray$0(int i9) {
        return i9;
    }

    public static Object repeat(Object obj, int i9) {
        Class<?> clsArrayElementType = Types.arrayElementType(obj.getClass());
        if (i9 < 1) {
            return Array.newInstance(clsArrayElementType, 0);
        }
        int[] iArrDimensions = dimensions(obj);
        int i10 = iArrDimensions[0];
        int i11 = i9 * i10;
        iArrDimensions[0] = i11;
        Object objNewInstance = Array.newInstance(clsArrayElementType, iArrDimensions);
        for (int i12 = 0; i12 < i11; i12 += i10) {
            System.arraycopy(obj, 0, objNewInstance, i12, i10);
        }
        return objNewInstance;
    }

    public static Object slice(List<Object> list, int i9, int i10, int i11) {
        int size = list.size();
        if (i10 > size) {
            i10 = size;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int i12 = i10 - i9;
        if (i12 <= 0) {
            return list.subList(0, 0);
        }
        if (i11 != 0 && i11 != 1) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < i12; i13++) {
                if (i13 % i11 == 0) {
                    arrayList.add(Integer.valueOf(i11 < 0 ? (i12 - 1) - i13 : i13 + i9));
                }
            }
            return new SteppedSubList(list, arrayList);
        }
        return list.subList(i9, i10);
    }

    public static Object concat(List<?> list, List<?> list2) {
        List arrayList;
        if (list instanceof Queue) {
            arrayList = new LinkedList(list);
        } else {
            arrayList = new ArrayList(list);
        }
        arrayList.addAll(list2);
        return arrayList;
    }
}
