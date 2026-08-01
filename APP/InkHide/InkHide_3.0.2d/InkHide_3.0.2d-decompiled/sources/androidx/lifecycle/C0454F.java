package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.C0372c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p009E0.C0103c;
import p011F0.AbstractC0134v;
import p011F0.C0132t;
import p024M.InterfaceC0189c;
import p027N0.AbstractC0223g;
import p091u.AbstractC1011a;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0454F {

    /* JADX INFO: renamed from: f */
    public static final Class[] f1470f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f1471a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f1472b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f1473c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f1474d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0189c f1475e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0454F(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1471a = linkedHashMap;
        this.f1472b = new LinkedHashMap();
        this.f1473c = new LinkedHashMap();
        this.f1474d = new LinkedHashMap();
        this.f1475e = new C0372c(1, this);
        linkedHashMap.putAll(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Bundle m908a(C0454F c0454f) {
        Map mapSingletonMap;
        String str;
        AbstractC0223g.m418e(c0454f, "this$0");
        LinkedHashMap linkedHashMap = c0454f.f1472b;
        AbstractC0223g.m418e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = C0132t.f427a;
        } else if (size != 1) {
            mapSingletonMap = AbstractC0134v.m299d0(linkedHashMap);
        } else {
            AbstractC0223g.m418e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            AbstractC0223g.m417d(mapSingletonMap, "with(...)");
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = c0454f.f1471a;
            int i2 = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : setKeySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap2.get(str2));
                }
                C0103c[] c0103cArr = {new C0103c("keys", arrayList), new C0103c("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i2 < 2) {
                    C0103c c0103c = c0103cArr[i2];
                    String str3 = (String) c0103c.f394a;
                    Object obj = c0103c.f395b;
                    if (obj == null) {
                        bundle.putString(str3, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str3, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str3, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str3, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str3, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str3, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str3, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str3, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str3, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str3, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str3, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str3, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str3, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str3, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str3, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str3, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str3, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str3, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str3, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str3, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        AbstractC0223g.m415b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str3, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str3, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str3, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str3 + '\"');
                            }
                            bundle.putSerializable(str3, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str3, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str3, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        AbstractC1011a.m2212a(bundle, str3, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str3 + '\"');
                        }
                        AbstractC1011a.m2213b(bundle, str3, (SizeF) obj);
                    }
                    i2++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            str = (String) entry2.getKey();
            Bundle bundleMo392a = ((InterfaceC0189c) entry2.getValue()).mo392a();
            AbstractC0223g.m418e(str, "key");
            if (bundleMo392a != null) {
                Class[] clsArr = f1470f;
                while (i2 < 29) {
                    Class cls = clsArr[i2];
                    AbstractC0223g.m415b(cls);
                    if (!cls.isInstance(bundleMo392a)) {
                        i2++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleMo392a.getClass() + " into saved state");
            }
            Object obj2 = c0454f.f1473c.get(str);
            C0489x c0489x = obj2 instanceof C0489x ? (C0489x) obj2 : null;
            if (c0489x != null) {
                c0489x.m937a(bundleMo392a);
            } else {
                linkedHashMap2.put(str, bundleMo392a);
            }
        } while (c0454f.f1474d.get(str) == null);
        throw new ClassCastException();
    }

    public C0454F() {
        this.f1471a = new LinkedHashMap();
        this.f1472b = new LinkedHashMap();
        this.f1473c = new LinkedHashMap();
        this.f1474d = new LinkedHashMap();
        this.f1475e = new C0372c(1, this);
    }
}
