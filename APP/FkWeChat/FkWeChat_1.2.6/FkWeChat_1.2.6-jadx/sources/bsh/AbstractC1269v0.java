package bsh;

import bsh.AbstractC1273v4;
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

/* JADX INFO: renamed from: bsh.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1269v0 {
    /* JADX INFO: renamed from: b */
    public static Object m5110b(Class cls, Class cls2, Object obj) {
        int i10 = 0;
        if (Collection.class.isAssignableFrom(cls)) {
            if (List.class.isAssignableFrom(cls) || Queue.class == cls) {
                if (cls.isAssignableFrom(ArrayList.class)) {
                    return new ArrayList(Arrays.asList((Object[]) AbstractC1273v4.m5138h(obj, Object.class, 0)));
                }
                if (cls.isAssignableFrom(LinkedList.class)) {
                    return new LinkedList(Arrays.asList((Object[]) AbstractC1273v4.m5138h(obj, Object.class, 0)));
                }
            } else {
                if (cls.isAssignableFrom(ArrayDeque.class)) {
                    return new ArrayDeque(Arrays.asList((Object[]) AbstractC1273v4.m5138h(obj, Object.class, 0)));
                }
                if (cls.isAssignableFrom(LinkedHashSet.class)) {
                    return new LinkedHashSet(Arrays.asList((Object[]) AbstractC1273v4.m5138h(obj, Object.class, 0)));
                }
            }
        }
        Class clsM5133c = AbstractC1273v4.m5133c(cls2);
        if (Map.class.isAssignableFrom(cls)) {
            if (Map.Entry.class.isAssignableFrom(clsM5133c)) {
                return m5117i((Map.Entry[]) obj);
            }
            if (cls.isAssignableFrom(LinkedHashMap.class)) {
                int length = Array.getLength(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap((int) Math.ceil((((double) length) + 0.0d) / 2.0d));
                while (i10 < length) {
                    int i11 = i10 + 1;
                    linkedHashMap.put(Array.get(obj, i10), i11 < length ? Array.get(obj, i11) : null);
                    i10 += 2;
                }
                return linkedHashMap;
            }
        }
        int[] iArrM5115g = m5115g(obj);
        final int i12 = iArrM5115g[0];
        if (i12 == 0) {
            return Array.newInstance((Class<?>) cls, iArrM5115g);
        }
        Class clsM5111c = m5111c(clsM5133c, obj, new IntSupplier() { // from class: bsh.u0
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return AbstractC1269v0.m5109a(i12);
            }
        });
        if (!Map.Entry.class.isAssignableFrom(cls)) {
            Class clsM5133c2 = AbstractC1273v4.m5133c(cls);
            Object objNewInstance = Array.newInstance((Class<?>) clsM5133c2, iArrM5115g);
            m5114f(clsM5133c2, objNewInstance, obj);
            return objNewInstance;
        }
        if (Map.Entry.class.isAssignableFrom(clsM5111c)) {
            if (AbstractC1273v4.b.class != clsM5111c) {
                return obj;
            }
            Map.Entry[] entryArr = new Map.Entry[Array.getLength(obj)];
            m5114f(Map.Entry.class, entryArr, obj);
            return entryArr;
        }
        if (i12 == 1) {
            return new AbstractC1273v4.b(Array.get(obj, 0), null);
        }
        if (i12 == 2) {
            return new AbstractC1273v4.b(Array.get(obj, 0), Array.get(obj, 1));
        }
        Map.Entry[] entryArr2 = new Map.Entry[(int) Math.ceil((((double) i12) + 0.0d) / 2.0d)];
        int i13 = 0;
        while (i10 < i12) {
            int i14 = i13 + 1;
            int i15 = i10 + 1;
            entryArr2[i13] = new AbstractC1273v4.b(Array.get(obj, i10), i15 < i12 ? Array.get(obj, i15) : null);
            i10 += 2;
            i13 = i14;
        }
        return entryArr2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m5111c(Class cls, Object obj, IntSupplier intSupplier) {
        if (Object.class == cls) {
            int asInt = intSupplier.getAsInt();
            Class clsM5140j = null;
            for (int i10 = 0; i10 < asInt; i10++) {
                clsM5140j = AbstractC1273v4.m5140j(clsM5140j, AbstractC1273v4.m5141k(Array.get(obj, 0)));
                if (Object.class == clsM5140j) {
                    break;
                }
            }
            if (clsM5140j != null && clsM5140j != cls) {
                return clsM5140j;
            }
        }
        return cls;
    }

    /* JADX INFO: renamed from: d */
    public static Object m5112d(Object obj, Object obj2) throws C1279w4 {
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (AbstractC1273v4.m5132b(cls) == AbstractC1273v4.m5132b(cls2)) {
            Class clsM5140j = AbstractC1273v4.m5140j(AbstractC1273v4.m5133c(cls), AbstractC1273v4.m5133c(cls2));
            int[] iArrM5115g = m5115g(obj);
            iArrM5115g[0] = Array.getLength(obj) + Array.getLength(obj2);
            Object objNewInstance = Array.newInstance((Class<?>) clsM5140j, iArrM5115g);
            m5114f(clsM5140j, objNewInstance, obj, obj2);
            return objNewInstance;
        }
        throw new C1279w4("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + AbstractC1225n4.m4982u(obj) + " with array of type " + AbstractC1225n4.m4982u(obj2) + ".");
    }

    /* JADX INFO: renamed from: e */
    public static Object m5113e(List list, List list2) {
        List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        linkedList.addAll(list2);
        return linkedList;
    }

    /* JADX INFO: renamed from: f */
    public static void m5114f(Class cls, Object obj, Object... objArr) {
        int i10;
        int i11;
        int length = Array.getLength(objArr[0]);
        int length2 = objArr.length > 1 ? Array.getLength(obj) : length;
        if (AbstractC1273v4.m5132b(obj.getClass()) != 1) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < length2) {
                if (length < length2 && i13 == length && (i10 = i14 + 1) < objArr.length) {
                    length = Array.getLength(objArr[i10]);
                    i13 = 0;
                    i14 = i10;
                }
                int i15 = i13 + 1;
                Object obj2 = Array.get(objArr[i14], i13);
                if (obj2 == null) {
                    Array.set(obj, i12, null);
                } else {
                    Object objNewInstance = Array.get(obj, i12);
                    if (Array.getLength(obj2) != Array.getLength(objNewInstance)) {
                        objNewInstance = Array.newInstance((Class<?>) cls, m5115g(obj2));
                        Array.set(obj, i12, objNewInstance);
                    }
                    m5114f(cls, objNewInstance, obj2);
                }
                i12++;
                i13 = i15;
            }
            return;
        }
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length2; i18++) {
            int i19 = i17 + 1;
            Object objUnwrap = Array.get(objArr[i16], i17);
            try {
                objUnwrap = Primitive.unwrap(AbstractC1273v4.m5138h(objUnwrap, cls, 0));
            } catch (C1279w4 unused) {
            }
            if (Byte.TYPE == cls) {
                Array.setByte(obj, i18, ((Byte) objUnwrap).byteValue());
            } else if (Short.TYPE == cls) {
                Array.setShort(obj, i18, ((Short) objUnwrap).shortValue());
            } else if (Integer.TYPE == cls) {
                Array.setInt(obj, i18, ((Integer) objUnwrap).intValue());
            } else if (Long.TYPE == cls) {
                Array.setLong(obj, i18, ((Long) objUnwrap).longValue());
            } else if (Float.TYPE == cls) {
                Array.setFloat(obj, i18, ((Float) objUnwrap).floatValue());
            } else if (Double.TYPE == cls) {
                Array.setDouble(obj, i18, ((Double) objUnwrap).doubleValue());
            } else if (Character.TYPE == cls) {
                Array.setChar(obj, i18, ((Character) objUnwrap).charValue());
            } else if (Boolean.TYPE == cls) {
                Array.setBoolean(obj, i18, ((Boolean) objUnwrap).booleanValue());
            } else {
                Array.set(obj, i18, objUnwrap);
            }
            if (length >= length2 || i19 != length || (i11 = i16 + 1) >= objArr.length) {
                i17 = i19;
            } else {
                length = Array.getLength(objArr[i11]);
                i16 = i11;
                i17 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static int[] m5115g(Object obj) {
        int iM5132b = AbstractC1273v4.m5132b(obj.getClass());
        int[] iArr = new int[iM5132b];
        if (iM5132b != 0) {
            int length = Array.getLength(obj);
            iArr[0] = length;
            if (length != 0) {
                for (int i10 = 1; i10 < iM5132b; i10++) {
                    obj = Array.get(obj, 0);
                    if (obj == null) {
                        break;
                    }
                    iArr[i10] = Array.getLength(obj);
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Object m5116h(Object obj, int i10) throws C1285x4 {
        RunnableC1205k2.m4462e("getIndex: ", obj, ", index=", Integer.valueOf(i10));
        try {
            return obj instanceof List ? ((List) obj).get(i10) : Primitive.wrap(Array.get(obj, i10), (Class<?>) AbstractC1273v4.m5133c(obj.getClass()));
        } catch (IndexOutOfBoundsException e10) {
            throw new C1285x4("Index " + i10 + " out-of-bounds for length " + (obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Map m5117i(Map.Entry... entryArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(entryArr.length);
        for (Map.Entry entry : entryArr) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    public static Object m5118j(Object obj, int i10) {
        Class clsM5133c = AbstractC1273v4.m5133c(obj.getClass());
        if (i10 < 1) {
            return Array.newInstance((Class<?>) clsM5133c, 0);
        }
        int[] iArrM5115g = m5115g(obj);
        int i11 = iArrM5115g[0];
        int i12 = i10 * i11;
        iArrM5115g[0] = i12;
        Object objNewInstance = Array.newInstance((Class<?>) clsM5133c, iArrM5115g);
        for (int i13 = 0; i13 < i12; i13 += i11) {
            System.arraycopy(obj, 0, objNewInstance, i13, i11);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: k */
    public static Object m5119k(List list, int i10) {
        if (i10 < 1) {
            return list instanceof Queue ? new LinkedList() : new ArrayList(0);
        }
        List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        if (i10 != 1) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 1) {
                    break;
                }
                linkedList.addAll(list);
                i10 = i11;
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: l */
    public static void m5120l(Object obj, int i10, Object obj2) throws C1285x4 {
        try {
            Object objUnwrap = Primitive.unwrap(obj2);
            if (obj instanceof List) {
                ((List) obj).set(i10, objUnwrap);
            } else {
                Array.set(obj, i10, objUnwrap);
            }
        } catch (IllegalArgumentException e10) {
            throw new C1285x4(new ArrayStoreException(e10.getMessage()));
        } catch (IndexOutOfBoundsException e11) {
            throw new C1285x4("Index " + i10 + " out-of-bounds for length " + (obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e11);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Object m5121m(Object obj, int i10, int i11, int i12) {
        Class clsM5133c = AbstractC1273v4.m5133c(obj.getClass());
        int length = Array.getLength(obj);
        if (i11 > length) {
            i11 = length;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int i13 = i11 - i10;
        if (i13 <= 0) {
            return Array.newInstance((Class<?>) clsM5133c, 0);
        }
        if (i12 == 0 || i12 == 1) {
            Object objNewInstance = Array.newInstance((Class<?>) clsM5133c, i13);
            System.arraycopy(obj, i10, objNewInstance, 0, i13);
            return objNewInstance;
        }
        int iCeil = (int) Math.ceil((((double) i13) + 0.0d) / ((double) Math.abs(i12)));
        Object[] objArr = new Object[iCeil];
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            if (i15 % i12 == 0) {
                int i16 = i14 + 1;
                objArr[i14] = Array.get(obj, i12 < 0 ? (i13 - 1) - i15 : i15 + i10);
                i14 = i16;
            }
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) clsM5133c, iCeil);
        m5114f(clsM5133c, objNewInstance2, objArr);
        return objNewInstance2;
    }

    /* JADX INFO: renamed from: n */
    public static Object m5122n(List list, int i10, int i11, int i12) {
        int size = list.size();
        if (i11 > size) {
            i11 = size;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int i13 = i11 - i10;
        if (i13 <= 0) {
            return list.subList(0, 0);
        }
        if (i12 == 0 || i12 == 1) {
            return list.subList(i10, i11);
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 % i12 == 0) {
                arrayList.add(Integer.valueOf(i12 < 0 ? (i13 - 1) - i14 : i14 + i10));
            }
        }
        return new a(list, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m5109a(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: bsh.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractList implements RandomAccess {

        /* JADX INFO: renamed from: q */
        public final List f3841q;

        /* JADX INFO: renamed from: r */
        public final List f3842r;

        /* JADX INFO: renamed from: bsh.v0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class C10071a implements ListIterator {

            /* JADX INFO: renamed from: q */
            public int f3843q = 0;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ ListIterator f3844r;

            public C10071a(ListIterator listIterator) {
                this.f3844r = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a.this.add(this.f3843q, obj);
                this.f3844r.add((Integer) a.this.f3842r.get(this.f3843q));
                this.f3843q = -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f3844r.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f3844r.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                this.f3844r.next();
                int iPreviousIndex = previousIndex();
                this.f3843q = iPreviousIndex;
                return a.this.get(iPreviousIndex);
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f3844r.nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                this.f3844r.previous();
                int iNextIndex = nextIndex();
                this.f3843q = iNextIndex;
                return a.this.get(iNextIndex);
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f3844r.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a.this.remove(this.f3843q);
                this.f3844r.remove();
                this.f3843q = -1;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a.this.set(this.f3843q, obj);
            }
        }

        public a(List list, List list2) {
            this.f3841q = list;
            this.f3842r = list2;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            int size = size();
            List list = this.f3842r;
            int iIntValue = i10 == size ? ((Integer) list.get(i10 - 1)).intValue() + 1 : ((Integer) list.get(i10)).intValue();
            this.f3841q.add(iIntValue, obj);
            int i11 = i10;
            while (true) {
                int size2 = size();
                List list2 = this.f3842r;
                if (i11 >= size2) {
                    list2.add(i10, Integer.valueOf(iIntValue));
                    return;
                } else {
                    list2.set(i11, Integer.valueOf(((Integer) list2.get(i11)).intValue() + 1));
                    i11++;
                }
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection collection) {
            Iterator it = collection.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                add(i11 + i10, it.next());
                i11++;
            }
            return i11 > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f3841q.get(((Integer) this.f3842r.get(i10)).intValue());
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new C10071a(new ArrayList(this.f3842r).listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            int iIntValue = ((Integer) this.f3842r.get(i10)).intValue();
            int i11 = i10 + 1;
            while (true) {
                int size = size();
                List list = this.f3842r;
                if (i11 >= size) {
                    list.remove(i10);
                    return this.f3841q.remove(iIntValue);
                }
                list.set(i11, Integer.valueOf(((Integer) list.get(i11)).intValue() - 1));
                i11++;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            return this.f3841q.set(((Integer) this.f3842r.get(i10)).intValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3842r.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            return new a(this.f3841q, this.f3842r.subList(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            return addAll(this.f3842r.size(), collection);
        }
    }
}
