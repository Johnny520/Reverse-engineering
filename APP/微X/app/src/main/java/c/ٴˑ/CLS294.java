// Decompiled by JEB v5.42.0.202606242140

package c.ٴˑ;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

public class CLS294 {
    public static boolean MTH4338(Context context0, Uri uri0) {
        if(context0.checkCallingOrSelfUriPermission(uri0, 2) != 0) {
            return false;
        }
        String s = CLS294.MTH4349(context0, uri0);
        int v = CLS294.MTH4342(context0, uri0, "flags", 0);
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if((v & 4) != 0) {
            return true;
        }
        return !"vnd.android.document/directory".equals(s) || (v & 8) == 0 ? !TextUtils.isEmpty(s) && (v & 2) != 0 : true;
    }

    public static long MTH4339(Context context0, Uri uri0, String s, long v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{s}, null, null, null);
            return cursor0.moveToFirst() && !cursor0.isNull(0) ? cursor0.getLong(0) : v;
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
            return v;
        }
        finally {
            CLS294.MTH4346(cursor0);
        }
    }

    public static String MTH4340(Context context0, Uri uri0) {
        return CLS294.MTH4345(context0, uri0, "_display_name", null);
    }

    public static boolean MTH4341(Context context0, Uri uri0) {
        return context0.checkCallingOrSelfUriPermission(uri0, 1) == 0 ? !TextUtils.isEmpty(CLS294.MTH4349(context0, uri0)) : false;
    }

    public static int MTH4342(Context context0, Uri uri0, String s, int v) {
        return (int)CLS294.MTH4339(context0, uri0, s, ((long)v));
    }

    public static boolean MTH4343(Context context0, Uri uri0) {
        String s = CLS294.MTH4349(context0, uri0);
        return !"vnd.android.document/directory".equals(s) && !TextUtils.isEmpty(s);
    }

    public static long MTH4344(Context context0, Uri uri0) {
        return CLS294.MTH4339(context0, uri0, "last_modified", 0L);
    }

    public static String MTH4345(Context context0, Uri uri0, String s, String s1) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{s}, null, null, null);
            return cursor0.moveToFirst() && !cursor0.isNull(0) ? cursor0.getString(0) : s1;
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
            return s1;
        }
        finally {
            CLS294.MTH4346(cursor0);
        }
    }

    public static void MTH4346(AutoCloseable autoCloseable0) {
        if(autoCloseable0 != null) {
            try {
                autoCloseable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static String MTH4347(Context context0, Uri uri0) {
        String s = CLS294.MTH4349(context0, uri0);
        return "vnd.android.document/directory".equals(s) ? null : s;
    }

    public static boolean MTH4348(Context context0, Uri uri0) {
        return "vnd.android.document/directory".equals(CLS294.MTH4349(context0, uri0));
    }

    public static String MTH4349(Context context0, Uri uri0) {
        return CLS294.MTH4345(context0, uri0, "mime_type", null);
    }

    public static boolean MTH4350(Context context0, Uri uri0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        boolean z = true;
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
            if(cursor0.getCount() <= 0) {
                z = false;
            }
            return z;
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
            return false;
        }
        finally {
            CLS294.MTH4346(cursor0);
        }
    }
}

