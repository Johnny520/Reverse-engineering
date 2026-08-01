// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʿ;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

public class CLS370 {
    public static void MTH5070(AutoCloseable autoCloseable0) {
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

    public static boolean MTH5071(Context context0, Uri uri0) {
        String s = CLS370.MTH5077(context0, uri0);
        return !"vnd.android.document/directory".equals(s) && !TextUtils.isEmpty(s);
    }

    public static long MTH5072(Context context0, Uri uri0, String s, long v) {
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
            CLS370.MTH5070(cursor0);
        }
    }

    public static String MTH5073(Context context0, Uri uri0) {
        return CLS370.MTH5074(context0, uri0, "_display_name", null);
    }

    public static String MTH5074(Context context0, Uri uri0, String s, String s1) {
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
            CLS370.MTH5070(cursor0);
        }
    }

    public static boolean MTH5075(Context context0, Uri uri0) {
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
            CLS370.MTH5070(cursor0);
        }
    }

    public static int MTH5076(Context context0, Uri uri0, String s, int v) {
        return (int)CLS370.MTH5072(context0, uri0, s, ((long)v));
    }

    public static String MTH5077(Context context0, Uri uri0) {
        return CLS370.MTH5074(context0, uri0, "mime_type", null);
    }

    public static boolean MTH5078(Context context0, Uri uri0) {
        return "vnd.android.document/directory".equals(CLS370.MTH5077(context0, uri0));
    }

    public static long MTH5079(Context context0, Uri uri0) {
        return CLS370.MTH5072(context0, uri0, "last_modified", 0L);
    }

    public static boolean MTH5080(Context context0, Uri uri0) {
        return context0.checkCallingOrSelfUriPermission(uri0, 1) == 0 ? !TextUtils.isEmpty(CLS370.MTH5077(context0, uri0)) : false;
    }

    public static String MTH5081(Context context0, Uri uri0) {
        String s = CLS370.MTH5077(context0, uri0);
        return "vnd.android.document/directory".equals(s) ? null : s;
    }

    public static boolean MTH5082(Context context0, Uri uri0) {
        if(context0.checkCallingOrSelfUriPermission(uri0, 2) != 0) {
            return false;
        }
        String s = CLS370.MTH5077(context0, uri0);
        int v = CLS370.MTH5076(context0, uri0, "flags", 0);
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if((v & 4) != 0) {
            return true;
        }
        return !"vnd.android.document/directory".equals(s) || (v & 8) == 0 ? !TextUtils.isEmpty(s) && (v & 2) != 0 : true;
    }
}

