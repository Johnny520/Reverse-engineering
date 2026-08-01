package p244;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C3804;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p247.C8884;
import p247.C8885;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8867 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f22541;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Comparable f22542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f22543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22544;

    public /* synthetic */ C8867(Comparable comparable, Object obj, int i) {
        this.f22544 = i;
        this.f22542 = comparable;
        this.f22543 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8867 m14082(Context context, Uri uri, C8885 c8885) {
        return new C8867(uri, new C8884(ComponentCallbacks2C3890.m7327(context).f10118.m7444().m7436(), c8885, ComponentCallbacks2C3890.m7327(context).f10114, context.getContentResolver()), 1);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        int i = this.f22544;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) throws Throwable {
        Object objOpen;
        switch (this.f22544) {
            case 0:
                try {
                    C8847 c8847 = (C8847) this.f22543;
                    File file = (File) this.f22542;
                    switch (c8847.f22489) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f22541 = objOpen;
                    interfaceC3795.mo6994(objOpen);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    interfaceC3795.mo6995(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamM14084 = m14084();
                    this.f22541 = inputStreamM14084;
                    interfaceC3795.mo6994(inputStreamM14084);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    interfaceC3795.mo6995(e2);
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        switch (this.f22544) {
        }
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        switch (this.f22544) {
            case 0:
                Object obj = this.f22541;
                if (obj != null) {
                    try {
                        switch (((C8847) this.f22543).f22489) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f22541;
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

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        switch (this.f22544) {
            case 0:
                return ((C8847) this.f22543).m14064();
            default:
                return InputStream.class;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0028: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputStream m14084() throws Throwable {
        Cursor cursorM14105;
        ?? r6;
        String string;
        InputStream inputStreamOpenInputStream;
        int iM6876;
        C8884 c8884 = (C8884) this.f22543;
        ContentResolver contentResolver = c8884.f22574;
        Uri uri = (Uri) this.f22542;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorM14105 = c8884.f22576.m14105(uri);
            } catch (Throwable th) {
                th = th;
                r5 = r6;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SecurityException e) {
            e = e;
            cursorM14105 = null;
        } catch (Throwable th2) {
            th = th2;
            if (r5 != 0) {
            }
            throw th;
        }
        if (cursorM14105 != null) {
            try {
            } catch (SecurityException e2) {
                e = e2;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursorM14105 != null) {
                }
                string = null;
                if (TextUtils.isEmpty(string)) {
                }
                if (inputStreamOpenInputStream != null) {
                }
                if (iM6876 != -1) {
                }
            }
            if (cursorM14105.moveToFirst()) {
                string = cursorM14105.getString(0);
                cursorM14105.close();
                if (TextUtils.isEmpty(string)) {
                    inputStreamOpenInputStream = null;
                } else {
                    File file = new File(string);
                    if (file.exists() && 0 < file.length()) {
                        Uri uriFromFile = Uri.fromFile(file);
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                        } catch (NullPointerException e3) {
                            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e3));
                        }
                    }
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        try {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iM6876 = AbstractC3738.m6876(c8884.f22573, inputStreamOpenInputStream2, c8884.f22575);
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th3) {
                            if (0 != 0) {
                                try {
                                    r5.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th3;
                        }
                    } catch (IOException | NullPointerException e4) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                        }
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                inputStreamOpenInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        iM6876 = -1;
                    }
                } else {
                    iM6876 = -1;
                }
                return iM6876 != -1 ? new C3804(inputStreamOpenInputStream, iM6876) : inputStreamOpenInputStream;
            }
        }
        if (cursorM14105 != null) {
            cursorM14105.close();
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
        }
        if (inputStreamOpenInputStream != null) {
        }
        if (iM6876 != -1) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m14081() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    private final void m14083() {
    }
}
