package p083Q1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.C1938h;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import me.dartcv.nuke.BuildConfig;
import p107V1.C1527z;

/* JADX INFO: renamed from: Q1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1173b implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3856d;

    /* JADX INFO: renamed from: e */
    public final Comparable f3857e;

    /* JADX INFO: renamed from: f */
    public final Object f3858f;

    /* JADX INFO: renamed from: g */
    public Object f3859g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1173b(Comparable comparable, Object obj, int i5) {
        this.f3856d = i5;
        this.f3857e = comparable;
        this.f3858f = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1173b m2218e(Context context, Uri uri, InterfaceC1174c interfaceC1174c) {
        return new C1173b(uri, new C1175d(ComponentCallbacks2C1921c.m3413a(context).f6516f.m3586a().m3591e(), interfaceC1174c, ComponentCallbacks2C1921c.m3413a(context).f6517g, context.getContentResolver()), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f3856d) {
            case 0:
                return InputStream.class;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C1527z) this.f3858f).getClass();
                return InputStream.class;
            default:
                return ((C1527z) this.f3858f).m2793b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        switch (this.f3856d) {
            case 0:
                InputStream inputStream = (InputStream) this.f3859g;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                try {
                    ((ByteArrayInputStream) this.f3859g).close();
                } catch (IOException unused2) {
                    return;
                }
                break;
            default:
                Object obj = this.f3859g;
                if (obj != null) {
                    try {
                        switch (((C1527z) this.f3858f).f5296d) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        switch (this.f3856d) {
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        int i5 = this.f3856d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) throws Throwable {
        Object objOpen;
        switch (this.f3856d) {
            case 0:
                try {
                    InputStream inputStreamM2226i = m2226i();
                    this.f3859g = inputStreamM2226i;
                    interfaceC1933c.mo43l(inputStreamM2226i);
                } catch (FileNotFoundException e5) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e5);
                    }
                    interfaceC1933c.mo36e(e5);
                    return;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                try {
                    ByteArrayInputStream byteArrayInputStreamM2792a = C1527z.m2792a((String) this.f3857e);
                    this.f3859g = byteArrayInputStreamM2792a;
                    interfaceC1933c.mo43l(byteArrayInputStreamM2792a);
                } catch (IllegalArgumentException e6) {
                    interfaceC1933c.mo36e(e6);
                }
                break;
            default:
                try {
                    C1527z c1527z = (C1527z) this.f3858f;
                    File file = (File) this.f3857e;
                    switch (c1527z.f5296d) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f3859g = objOpen;
                    interfaceC1933c.mo43l(objOpen);
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e7);
                    }
                    interfaceC1933c.mo36e(e7);
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0034 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m2226i() throws Throwable {
        Cursor cursorMo2217a;
        ?? r7;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM3432m;
        C1175d c1175d = (C1175d) this.f3858f;
        ContentResolver contentResolver = c1175d.f3862c;
        Uri uri = (Uri) this.f3857e;
        ?? r6 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorMo2217a = c1175d.f3860a.mo2217a(uri);
            } catch (Throwable th) {
                th = th;
                r6 = r7;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (SecurityException e5) {
            e = e5;
            cursorMo2217a = null;
        } catch (Throwable th2) {
            th = th2;
            if (r6 != 0) {
            }
            throw th;
        }
        if (cursorMo2217a != null) {
            try {
            } catch (SecurityException e6) {
                e = e6;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursorMo2217a != null) {
                }
                string = null;
                if (TextUtils.isEmpty(string)) {
                }
                if (inputStreamOpenInputStream != null) {
                }
                if (iM3432m != -1) {
                }
            }
            if (cursorMo2217a.moveToFirst()) {
                string = cursorMo2217a.getString(0);
                cursorMo2217a.close();
                if (TextUtils.isEmpty(string)) {
                    inputStreamOpenInputStream = null;
                } else {
                    File file = new File(string);
                    if (file.exists() && 0 < file.length()) {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                        } catch (NullPointerException e7) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e7));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        try {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM3432m = AbstractC1922d.m3432m(c1175d.f3863d, inputStreamOpenInputStream2, c1175d.f3861b);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                try {
                                    r6.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | NullPointerException e8) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e8);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                inputStreamOpenInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        iM3432m = -1;
                    }
                } else {
                    iM3432m = -1;
                }
                return iM3432m != -1 ? new C1938h(inputStreamOpenInputStream, iM3432m) : inputStreamOpenInputStream;
            }
        }
        if (cursorMo2217a != null) {
            cursorMo2217a.close();
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
        }
        if (inputStreamOpenInputStream != null) {
        }
        if (iM3432m != -1) {
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m2219f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2220g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m2221h() {
    }
}
