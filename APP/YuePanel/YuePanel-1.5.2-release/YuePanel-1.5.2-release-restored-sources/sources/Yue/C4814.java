package Yue;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4814 extends ContentProvider {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f10836 = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String f10837 = "root-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f10838 = "files-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f10839 = "cache-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String f10840 = "external-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f10841 = "external-files-path";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final String f10842 = "external-cache-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f10843 = "external-media-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String f10844 = "name";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String f10845 = "path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String f10846 = "displayName";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final Object f10849;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC5225("mLock")
    public String f10850;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5225("mLock")
    @InterfaceC6490
    public InterfaceC0498 f10851;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f10852;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String[] f10835 = {"_display_name", "_size"};

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final File f10847 = new File("/");

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC5225("sCache")
    public static final HashMap<String, InterfaceC0498> f10848 = new HashMap<>();

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ */
    @InterfaceC7113(21)
    public static class C0497 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static File[] m1725(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ۟ */
    public interface InterfaceC0498 {
        /* JADX INFO: renamed from: ۥ */
        File mo1726(Uri uri);

        /* JADX INFO: renamed from: ۥ۟ */
        Uri mo1727(File file);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C4815 implements InterfaceC0498 {

        /* JADX INFO: renamed from: ۥ */
        public final String f1133;

        /* JADX INFO: renamed from: ۥ۟ */
        public final HashMap<String, File> f1134 = new HashMap<>();

        public C4815(String str) {
            this.f1133 = str;
        }

        @Override // Yue.C4814.InterfaceC0498
        /* JADX INFO: renamed from: ۥ */
        public File mo1726(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f1134.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m14618(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // Yue.C4814.InterfaceC0498
        /* JADX INFO: renamed from: ۥ۟ */
        public Uri mo1727(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f1134.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (m14618(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f1133).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m14617(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f1134.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m14618(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
            String strM14615 = C4814.m14615(str);
            String strM146152 = C4814.m14615(str2);
            if (!strM14615.equals(strM146152)) {
                if (!strM14615.startsWith(strM146152 + '/')) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4814() {
        this(0);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static File m1724(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object[] m14607(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String[] m14608(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static XmlResourceParser m14609(Context context, String str, @InterfaceC6490 ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(f10836, i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f10836);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static InterfaceC0498 m14610(Context context, String str, int i) {
        InterfaceC0498 interfaceC0498M14614;
        HashMap<String, InterfaceC0498> map = f10848;
        synchronized (map) {
            try {
                interfaceC0498M14614 = map.get(str);
                if (interfaceC0498M14614 == null) {
                    try {
                        try {
                            interfaceC0498M14614 = m14614(context, str, i);
                            map.put(str, interfaceC0498M14614);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0498M14614;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Uri m14611(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6391 File file) {
        return m14610(context, str, 0).mo1727(file);
    }

    @InterfaceC6391
    @SuppressLint({"StreamFiles"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Uri m14612(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6391 File file, @InterfaceC6391 String str2) {
        return m14611(context, str, file).buildUpon().appendQueryParameter(f10846, str2).build();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m14613(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static InterfaceC0498 m14614(Context context, String str, int i) throws XmlPullParserException, IOException {
        C4815 c4815 = new C4815(str);
        XmlResourceParser xmlResourceParserM14609 = m14609(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = xmlResourceParserM14609.next();
            if (next == 1) {
                return c4815;
            }
            if (next == 2) {
                String name = xmlResourceParserM14609.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserM14609.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserM14609.getAttributeValue(null, "path");
                if (f10837.equals(name)) {
                    externalStorageDirectory = f10847;
                } else if (f10838.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (f10839.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (f10840.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (f10841.equals(name)) {
                    File[] fileArrM12067 = C4187.m12067(context, null);
                    if (fileArrM12067.length > 0) {
                        externalStorageDirectory = fileArrM12067[0];
                    }
                } else if (f10842.equals(name)) {
                    File[] fileArrM12066 = C4187.m12066(context);
                    if (fileArrM12066.length > 0) {
                        externalStorageDirectory = fileArrM12066[0];
                    }
                } else if (f10843.equals(name)) {
                    File[] fileArrM1725 = C0497.m1725(context);
                    if (fileArrM1725.length > 0) {
                        externalStorageDirectory = fileArrM1725[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c4815.m14617(attributeValue, m1724(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m14615(@InterfaceC6391 String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    @InterfaceC3647
    public void attachInfo(@InterfaceC6391 Context context, @InterfaceC6391 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f10849) {
            this.f10850 = str;
        }
        HashMap<String, InterfaceC0498> map = f10848;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@InterfaceC6391 Uri uri, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr) {
        return m14616().mo1726(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @InterfaceC6490
    public String getType(@InterfaceC6391 Uri uri) {
        File fileMo1726 = m14616().mo1726(uri);
        int iLastIndexOf = fileMo1726.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return C5375.f13186;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo1726.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : C5375.f13186;
    }

    @Override // android.content.ContentProvider
    @InterfaceC6490
    public String getTypeAnonymous(@InterfaceC6391 Uri uri) {
        return C5375.f13186;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@InterfaceC6391 Uri uri, @InterfaceC6391 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@InterfaceC6391 Uri uri, @InterfaceC6391 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(m14616().mo1726(uri), m14613(str));
    }

    @Override // android.content.ContentProvider
    @InterfaceC6391
    public Cursor query(@InterfaceC6391 Uri uri, @InterfaceC6490 String[] strArr, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr2, @InterfaceC6490 String str2) {
        int i;
        File fileMo1726 = m14616().mo1726(uri);
        String queryParameter = uri.getQueryParameter(f10846);
        if (strArr == null) {
            strArr = f10835;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileMo1726.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileMo1726.length());
            }
            i2 = i;
        }
        String[] strArrM14608 = m14608(strArr3, i2);
        Object[] objArrM14607 = m14607(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrM14608, 1);
        matrixCursor.addRow(objArrM14607);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@InterfaceC6391 Uri uri, @InterfaceC6391 ContentValues contentValues, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final InterfaceC0498 m14616() {
        InterfaceC0498 interfaceC0498;
        synchronized (this.f10849) {
            try {
                C6499.m20593(this.f10850, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f10851 == null) {
                    this.f10851 = m14610(getContext(), this.f10850, this.f10852);
                }
                interfaceC0498 = this.f10851;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0498;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4814(@InterfaceC8570 int i) {
        this.f10849 = new Object();
        this.f10852 = i;
    }
}
