package yyds;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛷᛴᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1545 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f7847;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7848;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f7849;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Comparable f7850;

    public /* synthetic */ C1545(Comparable comparable, Object obj, int i) {
        this.f7848 = i;
        this.f7850 = comparable;
        this.f7847 = obj;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final void m3201() {
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private final void m3202() {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1545 m3203(Context context, Uri uri, C1889 c1889) {
        return new C1545(uri, new C0299(ComponentCallbacks2C0040.m249(context).f381.m4645().m3224(), c1889, ComponentCallbacks2C0040.m249(context).f384, context.getContentResolver()), 1);
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        int i = this.f7848;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r6
  0x0033: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #7 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m3204() throws Throwable {
        Cursor cursor;
        SecurityException e;
        Cursor cursorM3676;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM3464;
        C0299 c0299 = (C0299) this.f7847;
        ContentResolver contentResolver = (ContentResolver) c0299.f1576;
        Uri uri = (Uri) this.f7850;
        Cursor cursor2 = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorM3676 = ((C1889) c0299.f1577).m3676(uri);
                    } catch (SecurityException e2) {
                        e = e2;
                        cursorM3676 = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorM3676 != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                        }
                        if (inputStreamOpenInputStream == null) {
                        }
                        if (iM3464 != -1) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SecurityException e3) {
                e = e3;
            }
            if (cursorM3676 != null) {
                try {
                } catch (SecurityException e4) {
                    e = e4;
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    }
                    if (cursorM3676 != null) {
                    }
                    string = null;
                    if (TextUtils.isEmpty(string)) {
                    }
                    if (inputStreamOpenInputStream == null) {
                    }
                    if (iM3464 != -1) {
                    }
                }
                if (cursorM3676.moveToFirst()) {
                    string = cursorM3676.getString(0);
                    cursorM3676.close();
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
                                iM3464 = AbstractC1741.m3464((ArrayList) c0299.f1574, inputStreamOpenInputStream2, (C2267) c0299.f1573);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (IOException | NullPointerException e6) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e6);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                iM3464 = -1;
                                if (iM3464 != -1) {
                                }
                            }
                        } catch (Throwable th2) {
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th2;
                        }
                    } else {
                        iM3464 = -1;
                    }
                    return iM3464 != -1 ? new C2509(inputStreamOpenInputStream, iM3464) : inputStreamOpenInputStream;
                }
            }
            if (cursorM3676 != null) {
                cursorM3676.close();
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
            }
            if (inputStreamOpenInputStream == null) {
            }
            if (iM3464 != -1) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        switch (this.f7848) {
            case 0:
                return ((InterfaceC0790) this.f7847).mo1779();
            default:
                return InputStream.class;
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        switch (this.f7848) {
            case 0:
                Object obj = this.f7849;
                if (obj != null) {
                    try {
                        ((InterfaceC0790) this.f7847).mo1781(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f7849;
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

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        switch (this.f7848) {
        }
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) throws Throwable {
        switch (this.f7848) {
            case 0:
                try {
                    Object objMo1780 = ((InterfaceC0790) this.f7847).mo1780((File) this.f7850);
                    this.f7849 = objMo1780;
                    interfaceC0306.mo546(objMo1780);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    interfaceC0306.mo567(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM3204 = m3204();
                    this.f7849 = inputStreamM3204;
                    interfaceC0306.mo546(inputStreamM3204);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    interfaceC0306.mo567(e2);
                }
                break;
        }
    }
}
