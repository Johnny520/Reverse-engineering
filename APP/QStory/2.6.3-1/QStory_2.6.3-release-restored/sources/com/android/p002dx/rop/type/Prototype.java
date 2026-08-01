package com.android.p002dx.rop.type;

import bsh.C3466;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Prototype implements Comparable<Prototype> {
    private static final ConcurrentMap<String, Prototype> internTable = new ConcurrentHashMap(10000, 0.75f);
    private final String descriptor;
    private StdTypeList parameterFrameTypes;
    private final StdTypeList parameterTypes;
    private final Type returnType;

    private Prototype(String str, Type type, StdTypeList stdTypeList) {
        if (str == null) {
            C3466.m5903("descriptor == null");
            throw null;
        }
        if (type == null) {
            C3466.m5903("returnType == null");
            throw null;
        }
        if (stdTypeList == null) {
            C3466.m5903("parameterTypes == null");
            throw null;
        }
        this.descriptor = str;
        this.returnType = type;
        this.parameterTypes = stdTypeList;
        this.parameterFrameTypes = null;
    }

    public static void clearInternTable() {
        internTable.clear();
    }

    public static Prototype fromDescriptor(String str) {
        int i;
        Prototype prototype = internTable.get(str);
        if (prototype != null) {
            return prototype;
        }
        Type[] typeArrMakeParameterArray = makeParameterArray(str);
        int i2 = 0;
        int i3 = 1;
        while (true) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                Type typeInternReturnType = Type.internReturnType(str.substring(i3 + 1));
                StdTypeList stdTypeList = new StdTypeList(i2);
                for (int i4 = 0; i4 < i2; i4++) {
                    stdTypeList.set(i4, typeArrMakeParameterArray[i4]);
                }
                return new Prototype(str, typeInternReturnType, stdTypeList);
            }
            int i5 = i3;
            while (cCharAt == '[') {
                i5++;
                cCharAt = str.charAt(i5);
            }
            if (cCharAt == 'L') {
                int iIndexOf = str.indexOf(59, i5);
                if (iIndexOf == -1) {
                    C6755.m11869("bad descriptor");
                    return null;
                }
                i = iIndexOf + 1;
            } else {
                i = i5 + 1;
            }
            typeArrMakeParameterArray[i2] = Type.intern(str.substring(i3, i));
            i2++;
            i3 = i;
        }
    }

    public static Prototype intern(String str) {
        if (str != null) {
            Prototype prototype = internTable.get(str);
            return prototype != null ? prototype : putIntern(fromDescriptor(str));
        }
        C3466.m5903("descriptor == null");
        return null;
    }

    public static Prototype internInts(Type type, int i) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('I');
        }
        sb.append(')');
        sb.append(type.getDescriptor());
        return intern(sb.toString());
    }

    private static Type[] makeParameterArray(String str) {
        int length = str.length();
        int i = 0;
        if (str.charAt(0) != '(') {
            C6755.m11869("bad descriptor");
            return null;
        }
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                i = i3;
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i3++;
        }
        if (i == 0 || i == length - 1) {
            C6755.m11869("bad descriptor");
            return null;
        }
        if (str.indexOf(41, i + 1) == -1) {
            return new Type[i2];
        }
        C6755.m11869("bad descriptor");
        return null;
    }

    private static Prototype putIntern(Prototype prototype) {
        Prototype prototypePutIfAbsent = internTable.putIfAbsent(prototype.getDescriptor(), prototype);
        return prototypePutIfAbsent != null ? prototypePutIfAbsent : prototype;
    }

    @Override // java.lang.Comparable
    public int compareTo(Prototype prototype) {
        if (this == prototype) {
            return 0;
        }
        int iCompareTo2 = this.returnType.compareTo(prototype.returnType);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int size = this.parameterTypes.size();
        int size2 = prototype.parameterTypes.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo22 = this.parameterTypes.get(i).compareTo(prototype.parameterTypes.get(i));
            if (iCompareTo22 != 0) {
                return iCompareTo22;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Prototype) {
            return this.descriptor.equals(((Prototype) obj).descriptor);
        }
        return false;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public StdTypeList getParameterFrameTypes() {
        if (this.parameterFrameTypes == null) {
            int size = this.parameterTypes.size();
            StdTypeList stdTypeList = new StdTypeList(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                Type type = this.parameterTypes.get(i);
                if (type.isIntlike()) {
                    type = Type.INT;
                    z = true;
                }
                stdTypeList.set(i, type);
            }
            if (!z) {
                stdTypeList = this.parameterTypes;
            }
            this.parameterFrameTypes = stdTypeList;
        }
        return this.parameterFrameTypes;
    }

    public StdTypeList getParameterTypes() {
        return this.parameterTypes;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public int hashCode() {
        return this.descriptor.hashCode();
    }

    public String toString() {
        return this.descriptor;
    }

    public Prototype withFirstParameter(Type type) {
        String str = "(" + type.getDescriptor() + this.descriptor.substring(1);
        StdTypeList stdTypeListWithFirst = this.parameterTypes.withFirst(type);
        stdTypeListWithFirst.setImmutable();
        return putIntern(new Prototype(str, this.returnType, stdTypeListWithFirst));
    }

    public static Prototype intern(String str, Type type, boolean z, boolean z2) {
        Prototype prototypeIntern = intern(str);
        if (z) {
            return prototypeIntern;
        }
        if (z2) {
            type = type.asUninitialized(Integer.MAX_VALUE);
        }
        return prototypeIntern.withFirstParameter(type);
    }
}
