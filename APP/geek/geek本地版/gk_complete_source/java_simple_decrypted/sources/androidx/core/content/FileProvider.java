package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.fd;
import defpackage.yj;
import defpackage.zj;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] b = null;
    public static final File c = null;
    public static final HashMap d = null;
    public zj a;

    static {
        b = new String[]{"_display_name", "_size"};
        c = new File("/");
        d = new HashMap();
    }

    public FileProvider() {
    }

    public static zj a(Context r7, String r8) {
        zj r0 = new zj();
        ProviderInfo r1 = r7.getPackageManager().resolveContentProvider(r8, 128);
        if (r1 == null) goto L54;
        XmlResourceParser r82 = r1.loadXmlMetaData(r7.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (r82 == null) goto L52;
    L6:
        int r12 = r82.next();
        if (r12 == 1) goto L50;
        if (r12 != 2) goto L6;
        String r13 = r82.getName();
        File r3 = null;
        String r2 = r82.getAttributeValue(null, "name");
        String r4 = r82.getAttributeValue(null, "path");
        if ("root-path".equals(r13) == false) goto L14;
        r3 = c;
    L37:
        if (r3 == null) goto L6;
        String r14 = new String[]{r4}[0];
        if (r14 == null) goto L42;
        r3 = new File(r3, r14);
    L42:
        if (TextUtils.isEmpty(r2) == true) goto L49;
        r0.a.put(r2, r3.getCanonicalFile());
    L45:
        e = move-exception;
        throw new IllegalArgumentException("Failed to resolve canonical path for " + r3, e);
    L49:
        throw new IllegalArgumentException("Name must not be empty");
    L14:
        if ("files-path".equals(r13) == false) goto L17;
        r3 = r7.getFilesDir();
        goto L37
    L17:
        if ("cache-path".equals(r13) == false) goto L20;
        r3 = r7.getCacheDir();
        goto L37
    L20:
        if ("external-path".equals(r13) == false) goto L23;
        r3 = Environment.getExternalStorageDirectory();
        goto L37
    L23:
        if ("external-files-path".equals(r13) == false) goto L28;
        File[] r15 = fd.b(r7, null);
        if (r15.length <= 0) goto L37;
        r3 = r15[0];
        goto L37
    L28:
        if ("external-cache-path".equals(r13) == false) goto L33;
        File[] r16 = fd.a(r7);
        if (r16.length <= 0) goto L37;
        r3 = r16[0];
        goto L37
    L33:
        if ("external-media-path".equals(r13) == false) goto L37;
        File[] r17 = yj.a(r7);
        if (r17.length <= 0) goto L37;
        r3 = r17[0];
        goto L37
    L50:
        return r0;
    L52:
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    L54:
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + r8);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context r3, ProviderInfo r4) {
        super.attachInfo(r3, r4);
        if (r4.exported == true) goto L34;
        if (r4.grantUriPermissions == false) goto L32;
        String r42 = r4.authority.split(";")[0];
        HashMap r0 = d;
        monitor-enter(r0);
        r0.remove(r42);     // Catch: Throwable -> L28
        monitor-exit(r0);     // Catch: Throwable -> L28
        monitor-enter(r0);
        zj r1 = (zj) r0.get(r42);     // Catch: Throwable -> L15
        if (r1 == null) goto L38;
    L23:
        monitor-exit(r0);     // Catch: Throwable -> L15
        this.a = r1;
        return;
    L38:
        r1 = a(r3, r42);     // Catch: Throwable -> L15 XmlPullParserException -> L17 IOException -> L20
        r0.put(r42, r1);     // Catch: Throwable -> L15
        goto L23
    L20:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L15
    L17:
        e = move-exception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L28:
        th = move-exception;
        throw th;
    L32:
        throw new SecurityException("Provider must grant uri permissions");
    L34:
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        return this.a.a(r1).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r3) {
        File r32 = this.a.a(r3);
        int r0 = r32.getName().lastIndexOf(46);
        if (r0 < 0) goto L7;
        String r33 = r32.getName().substring(r0 + 1);
        String r34 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r33);
        if (r34 == null) goto L9;
        return r34;
    L9:
        return "application/octet-stream";
    L7:
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri r3, String r4) {
        File r32 = this.a.a(r3);
        if ("r".equals(r4) == false) goto L6;
        int r42 = 268435456;
    L23:
        return ParcelFileDescriptor.open(r32, r42);
    L6:
        if ("w".equals(r4) == false) goto L8;
    L21:
        r42 = 738197504;
        goto L23
    L8:
        if ("wt".equals(r4) == true) goto L21;
        if ("wa".equals(r4) == false) goto L14;
        r42 = 704643072;
        goto L23
    L14:
        if ("rw".equals(r4) == false) goto L17;
        r42 = 939524096;
        goto L23
    L17:
        if ("rwt".equals(r4) == false) goto L20;
        r42 = 1006632960;
        goto L23
    L20:
        throw new IllegalArgumentException("Invalid mode: " + r4);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r8, String[] r9, String r10, String[] r11, String r12) {
        File r102 = this.a.a(r8);
        String r82 = r8.getQueryParameter("displayName");
        if (r9 != null) goto L5;
        r9 = b;
    L5:
        String[] r112 = new String[r9.length];
        Object[] r122 = new Object[r9.length];
        int r0 = r9.length;
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= r0) goto L19;
        String r4 = r9[r2];
        if ("_display_name".equals(r4) == false) goto L16;
        r112[r3] = "_display_name";
        int r42 = r3 + 1;
        if (r82 != null) goto L12;
        String r5 = r102.getName();
    L13:
        r122[r3] = r5;
    L14:
        r3 = r42;
    L18:
        r2 = r2 + 1;
        goto L6
    L12:
        r5 = r82;
        goto L13
    L16:
        if ("_size".equals(r4) == false) goto L18;
        r112[r3] = "_size";
        r42 = r3 + 1;
        r122[r3] = Long.valueOf(r102.length());
        goto L14
    L19:
        String[] r83 = new String[r3];
        System.arraycopy(r112, 0, r83, 0, r3);
        Object[] r92 = new Object[r3];
        System.arraycopy(r122, 0, r92, 0, r3);
        MatrixCursor r103 = new MatrixCursor(r83, 1);
        r103.addRow(r92);
        return r103;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        throw new UnsupportedOperationException("No external updates");
    }
}
