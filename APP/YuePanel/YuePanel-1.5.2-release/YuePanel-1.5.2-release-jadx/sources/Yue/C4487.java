package Yue;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(19)
public class C4487 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f920 = "DocumentFile";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f921 = 512;

    /* JADX INFO: renamed from: ۥ */
    public static boolean m1410(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m13060(context, uri));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m1411(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strM13060 = m13060(context, uri);
        int iM13067 = m13067(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strM13060)) {
            return false;
        }
        if ((iM13067 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strM13060) || (iM13067 & 8) == 0) {
            return (TextUtils.isEmpty(strM13060) || (iM13067 & 2) == 0) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13056(@InterfaceC6490 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m13057(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            m13056(cursorQuery);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m13058(Context context, Uri uri) {
        return m13068(context, uri, "flags", 0L);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m13059(Context context, Uri uri) {
        return m13069(context, uri, "_display_name", null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String m13060(Context context, Uri uri) {
        return m13069(context, uri, "mime_type", null);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m13061(Context context, Uri uri) {
        String strM13060 = m13060(context, uri);
        if ("vnd.android.document/directory".equals(strM13060)) {
            return null;
        }
        return strM13060;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m13062(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m13060(context, uri));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m13063(Context context, Uri uri) {
        String strM13060 = m13060(context, uri);
        return ("vnd.android.document/directory".equals(strM13060) || TextUtils.isEmpty(strM13060)) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m13064(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (m13058(context, uri) & 512) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static long m13065(Context context, Uri uri) {
        return m13068(context, uri, "last_modified", 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static long m13066(Context context, Uri uri) {
        return m13068(context, uri, "_size", 0L);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m13067(Context context, Uri uri, String str, int i) {
        return (int) m13068(context, uri, str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static long m13068(Context context, Uri uri, String str, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            m13056(cursorQuery);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m13069(Context context, Uri uri, String str, @InterfaceC6490 String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            m13056(cursorQuery);
        }
    }
}
