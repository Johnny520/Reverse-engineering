package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.C1224a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000a.C0023B3;
import p000a.C0031Bb;
import p000a.C0499ba;
import p000a.C0631i9;
import p000a.C0710mc;
import p000a.C0947z2;
import p000a.InterfaceC0050Cb;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1128m {

    /* JADX INFO: renamed from: f */
    public static final Class<? extends Object>[] f4701f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4702a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4703b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f4704c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f4705d;

    /* JADX INFO: renamed from: e */
    public final C1224a.b f4706e;

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C1128m m2609a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1128m();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    C0631i9.m1481d(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new C1128m(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C0631i9.m1480c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new C1128m(linkedHashMap);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1128m(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4702a = linkedHashMap;
        this.f4703b = new LinkedHashMap();
        this.f4704c = new LinkedHashMap();
        this.f4705d = new LinkedHashMap();
        this.f4706e = new C0023B3(3, this);
        linkedHashMap.putAll(map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static Bundle m2608a(C1128m c1128m) {
        C0631i9.m1482e(c1128m, "this$0");
        Iterator it = C0499ba.m1232H(c1128m.f4703b).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = c1128m.f4702a;
            int i = 0;
            if (!zHasNext) {
                Set<String> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                C0710mc[] c0710mcArr = {new C0710mc("keys", arrayList), new C0710mc("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                while (i < 2) {
                    C0710mc c0710mc = c0710mcArr[i];
                    String str2 = (String) c0710mc.f2680a;
                    B b = c0710mc.f2681b;
                    if (b == 0) {
                        bundle.putString(str2, null);
                    } else if (b instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) b).booleanValue());
                    } else if (b instanceof Byte) {
                        bundle.putByte(str2, ((Number) b).byteValue());
                    } else if (b instanceof Character) {
                        bundle.putChar(str2, ((Character) b).charValue());
                    } else if (b instanceof Double) {
                        bundle.putDouble(str2, ((Number) b).doubleValue());
                    } else if (b instanceof Float) {
                        bundle.putFloat(str2, ((Number) b).floatValue());
                    } else if (b instanceof Integer) {
                        bundle.putInt(str2, ((Number) b).intValue());
                    } else if (b instanceof Long) {
                        bundle.putLong(str2, ((Number) b).longValue());
                    } else if (b instanceof Short) {
                        bundle.putShort(str2, ((Number) b).shortValue());
                    } else if (b instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) b);
                    } else if (b instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) b);
                    } else if (b instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) b);
                    } else if (b instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) b);
                    } else if (b instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) b);
                    } else if (b instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) b);
                    } else if (b instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) b);
                    } else if (b instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) b);
                    } else if (b instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) b);
                    } else if (b instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) b);
                    } else if (b instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) b);
                    } else if (b instanceof Object[]) {
                        Class<?> componentType = b.getClass().getComponentType();
                        C0631i9.m1479b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) b);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) b);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) b);
                        } else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                            }
                            bundle.putSerializable(str2, (Serializable) b);
                        }
                    } else if (b instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) b);
                    } else if (b instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) b);
                    } else if (b instanceof Size) {
                        C0947z2.m2236a(bundle, str2, (Size) b);
                    } else {
                        if (!(b instanceof SizeF)) {
                            throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                        C0947z2.m2237b(bundle, str2, (SizeF) b);
                    }
                    i++;
                }
                return bundle;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            Bundle bundleMo57a = ((C1224a.b) entry.getValue()).mo57a();
            C0631i9.m1482e(str3, "key");
            if (bundleMo57a != null) {
                Class<? extends Object>[] clsArr = f4701f;
                while (i < 29) {
                    Class<? extends Object> cls = clsArr[i];
                    C0631i9.m1479b(cls);
                    if (!cls.isInstance(bundleMo57a)) {
                        i++;
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + bundleMo57a.getClass() + " into saved state");
            }
            Object obj = c1128m.f4704c.get(str3);
            C0031Bb c0031Bb = obj instanceof C0031Bb ? (C0031Bb) obj : null;
            if (c0031Bb != null) {
                c0031Bb.m92g(bundleMo57a);
            } else {
                linkedHashMap.put(str3, bundleMo57a);
            }
            InterfaceC0050Cb interfaceC0050Cb = (InterfaceC0050Cb) c1128m.f4705d.get(str3);
            if (interfaceC0050Cb != null) {
                interfaceC0050Cb.m127a();
            }
        }
    }

    public C1128m() {
        this.f4702a = new LinkedHashMap();
        this.f4703b = new LinkedHashMap();
        this.f4704c = new LinkedHashMap();
        this.f4705d = new LinkedHashMap();
        this.f4706e = new C0023B3(3, this);
    }
}
