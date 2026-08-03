package Yue;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7198 {
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T m3492(@InterfaceC6399 SQLiteDatabase sQLiteDatabase, boolean z, @InterfaceC6399 InterfaceC5124<? super SQLiteDatabase, ? extends T> interfaceC5124) {
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = interfaceC5124.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return tInvoke;
        } finally {
            C5437.m16930(1);
            sQLiteDatabase.endTransaction();
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Object m3493(SQLiteDatabase sQLiteDatabase, boolean z, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = interfaceC5124.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            C5437.m16930(1);
            sQLiteDatabase.endTransaction();
            C5437.m16929(1);
        }
    }
}
