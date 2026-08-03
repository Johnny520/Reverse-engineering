package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ax */
/* JADX INFO: loaded from: classes.dex */
public final class C1194ax {

    /* JADX INFO: renamed from: f */
    public static final Class[] f4091f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4092a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4093b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f4094c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f4095d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1474gx f4096e;

    public C1194ax(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4092a = linkedHashMap;
        this.f4093b = new LinkedHashMap();
        this.f4094c = new LinkedHashMap();
        this.f4095d = new LinkedHashMap();
        this.f4096e = new C0361Ia(3, this);
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2308a(C1194ax c1194ax) {
        Map mapSingletonMap;
        LinkedHashMap linkedHashMap = c1194ax.f4092a;
        LinkedHashMap linkedHashMap2 = c1194ax.f4093b;
        int size = linkedHashMap2.size();
        if (size == 0) {
            mapSingletonMap = C0495Lf.f1620a;
        } else if (size != 1) {
            mapSingletonMap = new LinkedHashMap(linkedHashMap2);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        Iterator it = mapSingletonMap.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C0208Et[] c0208EtArr = {new C0208Et("keys", arrayList), new C0208Et("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    C0208Et c0208Et = c0208EtArr[i];
                    String str2 = (String) c0208Et.f613a;
                    Object obj = c0208Et.f614b;
                    if (obj == null) {
                        bundle.putString(str2, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str2, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str2, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str2, (Size) obj);
                    } else {
                        if (!(obj instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        bundle.putSizeF(str2, (SizeF) obj);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Bundle bundleSaveState = ((InterfaceC1474gx) entry2.getValue()).saveState();
            if (bundleSaveState != null) {
                while (i < 29) {
                    if (!f4091f[i].isInstance(bundleSaveState)) {
                        i++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleSaveState.getClass() + " into saved state");
            }
            Object obj2 = c1194ax.f4094c.get(str3);
            C2600us c2600us = obj2 instanceof C2600us ? (C2600us) obj2 : null;
            if (c2600us != null) {
                c2600us.m5115d(bundleSaveState);
            } else {
                linkedHashMap.put(str3, bundleSaveState);
            }
            InterfaceC0035As interfaceC0035As = (InterfaceC0035As) c1194ax.f4095d.get(str3);
            if (interfaceC0035As != null) {
                ((C1115Zy) interfaceC0035As).m2031D(bundleSaveState);
            }
        }
    }

    public C1194ax() {
        this.f4092a = new LinkedHashMap();
        this.f4093b = new LinkedHashMap();
        this.f4094c = new LinkedHashMap();
        this.f4095d = new LinkedHashMap();
        this.f4096e = new C0361Ia(3, this);
    }
}
