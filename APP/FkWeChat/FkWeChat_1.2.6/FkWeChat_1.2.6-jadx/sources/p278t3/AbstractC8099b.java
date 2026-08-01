package p278t3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import p172l8.C4711r;

/* JADX INFO: renamed from: t3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8099b {
    /* JADX INFO: renamed from: a */
    public static final Bundle m31314a(C4711r... c4711rArr) {
        Bundle bundle = new Bundle(c4711rArr.length);
        for (C4711r c4711r : c4711rArr) {
            String str = (String) c4711r.m18792a();
            Object objM18793b = c4711r.m18793b();
            if (objM18793b == null) {
                bundle.putString(str, null);
            } else if (objM18793b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM18793b).booleanValue());
            } else if (objM18793b instanceof Byte) {
                bundle.putByte(str, ((Number) objM18793b).byteValue());
            } else if (objM18793b instanceof Character) {
                bundle.putChar(str, ((Character) objM18793b).charValue());
            } else if (objM18793b instanceof Double) {
                bundle.putDouble(str, ((Number) objM18793b).doubleValue());
            } else if (objM18793b instanceof Float) {
                bundle.putFloat(str, ((Number) objM18793b).floatValue());
            } else if (objM18793b instanceof Integer) {
                bundle.putInt(str, ((Number) objM18793b).intValue());
            } else if (objM18793b instanceof Long) {
                bundle.putLong(str, ((Number) objM18793b).longValue());
            } else if (objM18793b instanceof Short) {
                bundle.putShort(str, ((Number) objM18793b).shortValue());
            } else if (objM18793b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM18793b);
            } else if (objM18793b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM18793b);
            } else if (objM18793b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM18793b);
            } else if (objM18793b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM18793b);
            } else if (objM18793b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM18793b);
            } else if (objM18793b instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM18793b);
            } else if (objM18793b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM18793b);
            } else if (objM18793b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM18793b);
            } else if (objM18793b instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM18793b);
            } else if (objM18793b instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM18793b);
            } else if (objM18793b instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM18793b);
            } else if (objM18793b instanceof Object[]) {
                Class<?> componentType = objM18793b.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objM18793b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objM18793b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM18793b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objM18793b);
                }
            } else if (objM18793b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM18793b);
            } else if (objM18793b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM18793b);
            } else if (objM18793b instanceof Size) {
                C8098a.m31312a(bundle, str, (Size) objM18793b);
            } else {
                if (!(objM18793b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM18793b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                C8098a.m31313b(bundle, str, (SizeF) objM18793b);
            }
        }
        return bundle;
    }
}
