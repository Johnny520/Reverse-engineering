package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements f40 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10784h;

    /* JADX INFO: renamed from: i */
    public final Comparable f10785i;

    /* JADX INFO: renamed from: j */
    public final Object f10786j;

    /* JADX INFO: renamed from: k */
    public Object f10787k;

    public /* synthetic */ ti0(Comparable comparable, Object obj, int i) {
        this.f10784h = i;
        this.f10785i = comparable;
        this.f10786j = obj;
    }

    /* JADX INFO: renamed from: d */
    public static ti0 m5269d(Context context, Uri uri, l23 l23Var) {
        return new ti0(uri, new kj1(ComponentCallbacks2C0099a.m868a(context).f1645j.m5748a().m5645e(), l23Var, ComponentCallbacks2C0099a.m868a(context).f1646k, context.getContentResolver()), 1);
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        switch (this.f10784h) {
            case 0:
                return ((ui0) this.f10786j).mo1322a();
            default:
                return InputStream.class;
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        switch (this.f10784h) {
            case 0:
                Object obj = this.f10787k;
                if (obj != null) {
                    try {
                        ((ui0) this.f10786j).mo1329o(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f10787k;
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

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) throws Throwable {
        switch (this.f10784h) {
            case 0:
                try {
                    Object objMo1327m = ((ui0) this.f10786j).mo1327m((File) this.f10785i);
                    this.f10787k = objMo1327m;
                    e40Var.mo636h(objMo1327m);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    e40Var.mo635d(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM5272h = m5272h();
                    this.f10787k = inputStreamM5272h;
                    e40Var.mo636h(inputStreamM5272h);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    e40Var.mo635d(e2);
                }
                break;
        }
    }

    @Override // p000.f40
    public final void cancel() {
        int i = this.f10784h;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        switch (this.f10784h) {
        }
        return 1;
    }

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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m5272h() throws Throwable {
        ?? r6;
        SecurityException e;
        Cursor cursorM2787a;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM4816E;
        kj1 kj1Var = (kj1) this.f10786j;
        ContentResolver contentResolver = (ContentResolver) kj1Var.f5597l;
        Uri uri = (Uri) this.f10785i;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorM2787a = ((l23) kj1Var.f5595j).m2787a(uri);
                    } catch (SecurityException e2) {
                        e = e2;
                        cursorM2787a = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorM2787a != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                        }
                        if (inputStreamOpenInputStream == null) {
                        }
                        if (iM4816E == -1) {
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
            if (cursorM2787a != null) {
                try {
                } catch (SecurityException e4) {
                    e = e4;
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    }
                    if (cursorM2787a != null) {
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                    if (inputStreamOpenInputStream == null) {
                    }
                    if (iM4816E == -1) {
                    }
                }
                if (cursorM2787a.moveToFirst()) {
                    string = cursorM2787a.getString(0);
                    cursorM2787a.close();
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
                                iM4816E = AbstractC0691se.m4816E((ArrayList) kj1Var.f5594i, inputStreamOpenInputStream2, (td1) kj1Var.f5596k);
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
                            iM4816E = -1;
                        }
                    } else {
                        iM4816E = -1;
                    }
                    return iM4816E == -1 ? new oh0(inputStreamOpenInputStream, iM4816E) : inputStreamOpenInputStream;
                }
            }
            if (cursorM2787a != null) {
                cursorM2787a.close();
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
            }
            if (inputStreamOpenInputStream == null) {
            }
            if (iM4816E == -1) {
            }
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m5270f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m5271g() {
    }
}
