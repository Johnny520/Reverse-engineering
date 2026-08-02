package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements f40 {
    public final /* synthetic */ int h;
    public final Comparable i;
    public final Object j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ti0(Comparable comparable, Object obj, int i) {
        this.h = i;
        this.i = comparable;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ti0 d(Context context, Uri uri, l23 l23Var) {
        return new ti0(uri, new kj1(a.a(context).j.a().e(), l23Var, a.a(context).k, context.getContentResolver()), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        switch (this.h) {
            case 0:
                return ((ui0) this.j).a();
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        switch (this.h) {
            case 0:
                Object obj = this.k;
                if (obj != null) {
                    try {
                        ((ui0) this.j).o(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.k;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) throws Throwable {
        switch (this.h) {
            case 0:
                try {
                    Object objM = ((ui0) this.j).m((File) this.i);
                    this.k = objM;
                    e40Var.h(objM);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    e40Var.d(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamH = h();
                    this.k = inputStreamH;
                    e40Var.h(inputStreamH);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    e40Var.d(e2);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void cancel() {
        int i = this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        switch (this.h) {
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0038 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r6
  0x0033: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #8 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream h() throws Throwable {
        ?? r6;
        SecurityException e;
        Cursor cursorA;
        String string;
        InputStream inputStreamOpenInputStream;
        int iE;
        kj1 kj1Var = (kj1) this.j;
        ContentResolver contentResolver = (ContentResolver) kj1Var.l;
        Uri uri = (Uri) this.i;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorA = ((l23) kj1Var.j).a(uri);
                    } catch (SecurityException e2) {
                        e = e2;
                        cursorA = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                        }
                        if (inputStreamOpenInputStream == null) {
                        }
                        if (iE == -1) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SecurityException e3) {
                e = e3;
            }
            if (cursorA != null) {
                try {
                } catch (SecurityException e4) {
                    e = e4;
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    }
                    if (cursorA != null) {
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                    if (inputStreamOpenInputStream == null) {
                    }
                    if (iE == -1) {
                    }
                }
                if (cursorA.moveToFirst()) {
                    string = cursorA.getString(0);
                    cursorA.close();
                    if (TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e5) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e5));
                            }
                        }
                    } else {
                        inputStreamOpenInputStream = null;
                    }
                    if (inputStreamOpenInputStream == null) {
                        try {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iE = se.E((ArrayList) kj1Var.i, inputStreamOpenInputStream2, (td1) kj1Var.k);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th2;
                            }
                        } catch (IOException | NullPointerException e6) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e6);
                            }
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            iE = -1;
                        }
                    } else {
                        iE = -1;
                    }
                    return iE == -1 ? new oh0(inputStreamOpenInputStream, iE) : inputStreamOpenInputStream;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
            }
            if (inputStreamOpenInputStream == null) {
            }
            if (iE == -1) {
            }
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
