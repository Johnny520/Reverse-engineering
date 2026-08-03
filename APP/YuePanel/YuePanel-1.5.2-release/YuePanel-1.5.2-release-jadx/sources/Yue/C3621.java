package Yue;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3621 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Bundle m674() {
        return new Bundle(0);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Bundle m675(@InterfaceC6399 C6599<String, ? extends Object>... c6599Arr) {
        Bundle bundle = new Bundle(c6599Arr.length);
        for (C6599<String, ? extends Object> c6599 : c6599Arr) {
            String strM3062 = c6599.m3062();
            Object objM3063 = c6599.m3063();
            if (objM3063 == null) {
                bundle.putString(strM3062, null);
            } else if (objM3063 instanceof Boolean) {
                bundle.putBoolean(strM3062, ((Boolean) objM3063).booleanValue());
            } else if (objM3063 instanceof Byte) {
                bundle.putByte(strM3062, ((Number) objM3063).byteValue());
            } else if (objM3063 instanceof Character) {
                bundle.putChar(strM3062, ((Character) objM3063).charValue());
            } else if (objM3063 instanceof Double) {
                bundle.putDouble(strM3062, ((Number) objM3063).doubleValue());
            } else if (objM3063 instanceof Float) {
                bundle.putFloat(strM3062, ((Number) objM3063).floatValue());
            } else if (objM3063 instanceof Integer) {
                bundle.putInt(strM3062, ((Number) objM3063).intValue());
            } else if (objM3063 instanceof Long) {
                bundle.putLong(strM3062, ((Number) objM3063).longValue());
            } else if (objM3063 instanceof Short) {
                bundle.putShort(strM3062, ((Number) objM3063).shortValue());
            } else if (objM3063 instanceof Bundle) {
                bundle.putBundle(strM3062, (Bundle) objM3063);
            } else if (objM3063 instanceof CharSequence) {
                bundle.putCharSequence(strM3062, (CharSequence) objM3063);
            } else if (objM3063 instanceof Parcelable) {
                bundle.putParcelable(strM3062, (Parcelable) objM3063);
            } else if (objM3063 instanceof boolean[]) {
                bundle.putBooleanArray(strM3062, (boolean[]) objM3063);
            } else if (objM3063 instanceof byte[]) {
                bundle.putByteArray(strM3062, (byte[]) objM3063);
            } else if (objM3063 instanceof char[]) {
                bundle.putCharArray(strM3062, (char[]) objM3063);
            } else if (objM3063 instanceof double[]) {
                bundle.putDoubleArray(strM3062, (double[]) objM3063);
            } else if (objM3063 instanceof float[]) {
                bundle.putFloatArray(strM3062, (float[]) objM3063);
            } else if (objM3063 instanceof int[]) {
                bundle.putIntArray(strM3062, (int[]) objM3063);
            } else if (objM3063 instanceof long[]) {
                bundle.putLongArray(strM3062, (long[]) objM3063);
            } else if (objM3063 instanceof short[]) {
                bundle.putShortArray(strM3062, (short[]) objM3063);
            } else if (objM3063 instanceof Object[]) {
                Class<?> componentType = objM3063.getClass().getComponentType();
                C5499.m17100(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C5499.m17101(objM3063, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strM3062, (Parcelable[]) objM3063);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C5499.m17101(objM3063, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strM3062, (String[]) objM3063);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C5499.m17101(objM3063, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strM3062, (CharSequence[]) objM3063);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strM3062 + C8039.f3212);
                    }
                    bundle.putSerializable(strM3062, (Serializable) objM3063);
                }
            } else if (objM3063 instanceof Serializable) {
                bundle.putSerializable(strM3062, (Serializable) objM3063);
            } else if (objM3063 instanceof IBinder) {
                bundle.putBinder(strM3062, (IBinder) objM3063);
            } else if (objM3063 instanceof Size) {
                C3618.m666(bundle, strM3062, (Size) objM3063);
            } else {
                if (!(objM3063 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM3063.getClass().getCanonicalName() + " for key \"" + strM3062 + C8039.f3212);
                }
                C3618.m667(bundle, strM3062, (SizeF) objM3063);
            }
        }
        return bundle;
    }
}
