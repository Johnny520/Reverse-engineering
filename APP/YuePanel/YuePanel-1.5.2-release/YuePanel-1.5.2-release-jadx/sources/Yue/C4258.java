package Yue;

import android.database.Cursor;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4258 {
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m1222(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getBlob(i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Double m1223(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Float m12290(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Integer m12291(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Long m12292(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Short m12293(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String m12294(@InterfaceC6399 Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }
}
