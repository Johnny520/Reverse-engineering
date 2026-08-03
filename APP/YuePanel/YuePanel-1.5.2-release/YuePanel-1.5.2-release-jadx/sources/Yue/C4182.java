package Yue;

import android.content.ContentValues;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4182 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final ContentValues m1138(@InterfaceC6399 C6599<String, ? extends Object>... c6599Arr) {
        ContentValues contentValues = new ContentValues(c6599Arr.length);
        for (C6599<String, ? extends Object> c6599 : c6599Arr) {
            String strM3062 = c6599.m3062();
            Object objM3063 = c6599.m3063();
            if (objM3063 == null) {
                contentValues.putNull(strM3062);
            } else if (objM3063 instanceof String) {
                contentValues.put(strM3062, (String) objM3063);
            } else if (objM3063 instanceof Integer) {
                contentValues.put(strM3062, (Integer) objM3063);
            } else if (objM3063 instanceof Long) {
                contentValues.put(strM3062, (Long) objM3063);
            } else if (objM3063 instanceof Boolean) {
                contentValues.put(strM3062, (Boolean) objM3063);
            } else if (objM3063 instanceof Float) {
                contentValues.put(strM3062, (Float) objM3063);
            } else if (objM3063 instanceof Double) {
                contentValues.put(strM3062, (Double) objM3063);
            } else if (objM3063 instanceof byte[]) {
                contentValues.put(strM3062, (byte[]) objM3063);
            } else if (objM3063 instanceof Byte) {
                contentValues.put(strM3062, (Byte) objM3063);
            } else {
                if (!(objM3063 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objM3063.getClass().getCanonicalName() + " for key \"" + strM3062 + C8039.f3212);
                }
                contentValues.put(strM3062, (Short) objM3063);
            }
        }
        return contentValues;
    }
}
