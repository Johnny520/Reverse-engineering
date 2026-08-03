package p000;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.util.AbstractC2030b;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: H5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307H5 implements InterfaceC2819zw, InterfaceC2123k0 {

    /* JADX INFO: renamed from: a */
    public final int f1020a;

    /* JADX INFO: renamed from: b */
    public final Object f1021b;

    public /* synthetic */ C0307H5(int i, Object obj) {
        this.f1021b = obj;
        this.f1020a = i;
    }

    /* JADX INFO: renamed from: a */
    public HashMap m657a(Map map, ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m658b(iLogger, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public Object m658b(ILogger iLogger, Object obj) {
        Object objM659c;
        HashSet hashSet = (HashSet) this.f1021b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC2030b.f7215a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return AbstractC2030b.m4174a((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (hashSet.contains(obj)) {
                iLogger.mo3680e(EnumC1657a2.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            hashSet.add(obj);
            try {
                if (hashSet.size() > this.f1020a) {
                    hashSet.remove(obj);
                    iLogger.mo3680e(EnumC1657a2.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        Object[] objArr = (Object[]) obj;
                        objM659c = new ArrayList();
                        int length2 = objArr.length;
                        while (i < length2) {
                            objM659c.add(m658b(iLogger, objArr[i]));
                            i++;
                        }
                    } else if (obj instanceof Collection) {
                        objM659c = new ArrayList();
                        Iterator it = ((Collection) obj).iterator();
                        while (it.hasNext()) {
                            objM659c.add(m658b(iLogger, it.next()));
                        }
                    } else if (obj instanceof Map) {
                        objM659c = m657a((Map) obj, iLogger);
                    } else {
                        objM659c = m659c(iLogger, obj);
                        if (objM659c.isEmpty()) {
                            objM659c = obj.toString();
                        }
                    }
                    hashSet.remove(obj);
                    return objM659c;
                } catch (Exception e) {
                    iLogger.mo3683r(EnumC1657a2.INFO, "Not serializing object due to throwing sub-path.", e);
                    hashSet.remove(obj);
                    return null;
                }
            } catch (Throwable th) {
                hashSet.remove(obj);
                throw th;
            }
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: c */
    public HashMap m659c(ILogger iLogger, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m658b(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.mo3680e(EnumC1657a2.INFO, AbstractC2374ph.m4814k("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw interfaceC2389pw, C2644vt c2644vt) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC2389pw.get()).compress((Bitmap.CompressFormat) this.f1021b, this.f1020a, byteArrayOutputStream);
        interfaceC2389pw.mo118e();
        return new C0304H2(byteArrayOutputStream.toByteArray());
    }

    @Override // p000.InterfaceC2123k0
    public boolean perform(View view, AbstractC1241c0 abstractC1241c0) {
        ((BottomSheetBehavior) this.f1021b).m2430B(this.f1020a);
        return true;
    }

    public C0307H5(int i, boolean z) {
        switch (i) {
            case 3:
                this.f1020a = 1;
                this.f1021b = Collections.singletonList(null);
                break;
            default:
                this.f1021b = Bitmap.CompressFormat.JPEG;
                this.f1020a = 100;
                break;
        }
    }

    public C0307H5(int i) {
        this.f1021b = new HashSet();
        this.f1020a = i;
    }

    public C0307H5(ArrayList arrayList) {
        this.f1020a = 0;
        this.f1021b = arrayList;
    }
}
