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
    public static final Class[] f4091f = null;

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

    static {
        f4091f = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    }

    public C1194ax(HashMap r4) {
        LinkedHashMap r0 = new LinkedHashMap();
        this.f4092a = r0;
        this.f4093b = new LinkedHashMap();
        this.f4094c = new LinkedHashMap();
        this.f4095d = new LinkedHashMap();
        this.f4096e = new C0361Ia(3, this);
        r0.putAll(r4);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m2308a(C1194ax r10) {
        LinkedHashMap r0 = r10.f4092a;
        LinkedHashMap r1 = r10.f4093b;
        int r2 = r1.size();
        if (r2 != 0) goto L5;
        Map r22 = C0495Lf.f1620a;
    L9:
        Iterator r12 = r22.entrySet().iterator();
    L10:
        C2600us r3 = null;
        int r4 = 0;
        if (r12.hasNext() == false) goto L32;
        Map.Entry r23 = (Map.Entry) r12.next();
        String r5 = (String) r23.getKey();
        Bundle r24 = ((InterfaceC1474gx) r23.getValue()).saveState();
        if (r24 != null) goto L16;
    L19:
        Object r42 = r10.f4094c.get(r5);
        if ((r42 instanceof C2600us) == false) goto L22;
        r3 = (C2600us) r42;
    L22:
        if (r3 == null) goto L24;
        r3.m5115d(r24);
    L25:
        InterfaceC0035As r32 = (InterfaceC0035As) r10.f4095d.get(r5);
        if (r32 == null) goto L10;
        ((C1115Zy) r32).m2031D(r24);
        goto L10
    L24:
        r0.put(r5, r24);
    L16:
        if (r4 >= 29) goto L31;
        if (f4091f[r4].isInstance(r24) == true) goto L19;
        r4 = r4 + 1;
        goto L16
    L31:
        throw new IllegalArgumentException("Can't put value with type " + r24.getClass() + " into saved state");
    L32:
        Set r102 = r0.keySet();
        ArrayList r13 = new ArrayList(r102.size());
        ArrayList r25 = new ArrayList(r13.size());
        Iterator r103 = r102.iterator();
    L34:
        if (r103.hasNext() == false) goto L36;
        String r52 = (String) r103.next();
        r13.add(r52);
        r25.add(r0.get(r52));
        goto L34
    L36:
        C0208Et[] r104 = {new C0208Et("keys", r13), new C0208Et("values", r25)};
        Bundle r02 = new Bundle(2);
    L37:
        if (r4 >= 2) goto L129;
        C0208Et r26 = r104[r4];
        String r53 = (String) r26.f613a;
        Object r27 = r26.f614b;
        if (r27 != null) goto L42;
        r02.putString(r53, null);
    L126:
        r4 = r4 + 1;
        goto L37
    L42:
        if ((r27 instanceof Boolean) == false) goto L45;
        r02.putBoolean(r53, ((Boolean) r27).booleanValue());
        goto L126
    L45:
        if ((r27 instanceof Byte) == false) goto L48;
        r02.putByte(r53, ((Number) r27).byteValue());
        goto L126
    L48:
        if ((r27 instanceof Character) == false) goto L51;
        r02.putChar(r53, ((Character) r27).charValue());
        goto L126
    L51:
        if ((r27 instanceof Double) == false) goto L54;
        r02.putDouble(r53, ((Number) r27).doubleValue());
        goto L126
    L54:
        if ((r27 instanceof Float) == false) goto L57;
        r02.putFloat(r53, ((Number) r27).floatValue());
        goto L126
    L57:
        if ((r27 instanceof Integer) == false) goto L60;
        r02.putInt(r53, ((Number) r27).intValue());
        goto L126
    L60:
        if ((r27 instanceof Long) == false) goto L63;
        r02.putLong(r53, ((Number) r27).longValue());
        goto L126
    L63:
        if ((r27 instanceof Short) == false) goto L66;
        r02.putShort(r53, ((Number) r27).shortValue());
        goto L126
    L66:
        if ((r27 instanceof Bundle) == false) goto L69;
        r02.putBundle(r53, (Bundle) r27);
        goto L126
    L69:
        if ((r27 instanceof CharSequence) == false) goto L72;
        r02.putCharSequence(r53, (CharSequence) r27);
        goto L126
    L72:
        if ((r27 instanceof Parcelable) == false) goto L75;
        r02.putParcelable(r53, (Parcelable) r27);
        goto L126
    L75:
        if ((r27 instanceof boolean[]) == false) goto L78;
        r02.putBooleanArray(r53, (boolean[]) r27);
        goto L126
    L78:
        if ((r27 instanceof byte[]) == false) goto L81;
        r02.putByteArray(r53, (byte[]) r27);
        goto L126
    L81:
        if ((r27 instanceof char[]) == false) goto L84;
        r02.putCharArray(r53, (char[]) r27);
        goto L126
    L84:
        if ((r27 instanceof double[]) == false) goto L87;
        r02.putDoubleArray(r53, (double[]) r27);
        goto L126
    L87:
        if ((r27 instanceof float[]) == false) goto L90;
        r02.putFloatArray(r53, (float[]) r27);
        goto L126
    L90:
        if ((r27 instanceof int[]) == false) goto L93;
        r02.putIntArray(r53, (int[]) r27);
        goto L126
    L93:
        if ((r27 instanceof long[]) == false) goto L96;
        r02.putLongArray(r53, (long[]) r27);
        goto L126
    L96:
        if ((r27 instanceof short[]) == false) goto L99;
        r02.putShortArray(r53, (short[]) r27);
        goto L126
    L99:
        if ((r27 instanceof Object[]) == false) goto L115;
        Class<?> r6 = r27.getClass().getComponentType();
        if (Parcelable.class.isAssignableFrom(r6) == false) goto L104;
        r02.putParcelableArray(r53, (Parcelable[]) r27);
        goto L126
    L104:
        if (String.class.isAssignableFrom(r6) == false) goto L107;
        r02.putStringArray(r53, (String[]) r27);
        goto L126
    L107:
        if (CharSequence.class.isAssignableFrom(r6) == false) goto L110;
        r02.putCharSequenceArray(r53, (CharSequence[]) r27);
        goto L126
    L110:
        if (Serializable.class.isAssignableFrom(r6) == false) goto L113;
        r02.putSerializable(r53, (Serializable) r27);
        goto L126
    L113:
        throw new IllegalArgumentException("Illegal value array type " + r6.getCanonicalName() + " for key \"" + r53 + '\"');
    L115:
        if ((r27 instanceof Serializable) == false) goto L118;
        r02.putSerializable(r53, (Serializable) r27);
        goto L126
    L118:
        if ((r27 instanceof IBinder) == false) goto L121;
        r02.putBinder(r53, (IBinder) r27);
        goto L126
    L121:
        if ((r27 instanceof Size) == false) goto L124;
        r02.putSize(r53, (Size) r27);
        goto L126
    L124:
        if ((r27 instanceof SizeF) == false) goto L128;
        r02.putSizeF(r53, (SizeF) r27);
        goto L126
    L128:
        throw new IllegalArgumentException("Illegal value type " + r27.getClass().getCanonicalName() + " for key \"" + r53 + '\"');
    L129:
        return r02;
    L5:
        if (r2 == 1) goto L7;
        r22 = new LinkedHashMap(r1);
        goto L9
    L7:
        Map.Entry r14 = (Map.Entry) r1.entrySet().iterator().next();
        r22 = Collections.singletonMap(r14.getKey(), r14.getValue());
        goto L9
    }

    public C1194ax() {
        this.f4092a = new LinkedHashMap();
        this.f4093b = new LinkedHashMap();
        this.f4094c = new LinkedHashMap();
        this.f4095d = new LinkedHashMap();
        this.f4096e = new C0361Ia(3, this);
    }
}
