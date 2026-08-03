package Yue;

import Yue.C5058;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5043 {

    /* JADX INFO: renamed from: ۥ */
    public static final Comparator<byte[]> f1221 = new Comparator() { // from class: Yue.ۥ۠ۢۥۥ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C5043.m15552((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ */
    public interface InterfaceC0621 {
        /* JADX INFO: renamed from: ۥ */
        static InterfaceC0621 m1857(Context context, Uri uri) {
            return new C5044(context, uri);
        }

        void close();

        /* JADX INFO: renamed from: ۥ۟ */
        Cursor mo1858(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ۟ */
    public static class C0622 implements InterfaceC0621 {

        /* JADX INFO: renamed from: ۥ */
        public final ContentProviderClient f1222;

        public C0622(Context context, Uri uri) {
            this.f1222 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // Yue.C5043.InterfaceC0621
        public void close() {
            ContentProviderClient contentProviderClient = this.f1222;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }

        @Override // Yue.C5043.InterfaceC0621
        /* JADX INFO: renamed from: ۥ۟ */
        public Cursor mo1858(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f1222;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C5044 implements InterfaceC0621 {

        /* JADX INFO: renamed from: ۥ */
        public final ContentProviderClient f1223;

        public C5044(Context context, Uri uri) {
            this.f1223 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // Yue.C5043.InterfaceC0621
        public void close() {
            ContentProviderClient contentProviderClient = this.f1223;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // Yue.C5043.InterfaceC0621
        /* JADX INFO: renamed from: ۥ۟ */
        public Cursor mo1858(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f1223;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static List<byte[]> m1856(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m15548(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static List<List<byte[]>> m15549(C5045 c5045, Resources resources) {
        return c5045.m1860() != null ? c5045.m1860() : C5053.m15564(resources, c5045.m15554());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C5058.C0628 m15550(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, @InterfaceC6490 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM15551 = m15551(context.getPackageManager(), c5045, context.getResources());
        return providerInfoM15551 == null ? C5058.C0628.m1878(1, null) : C5058.C0628.m1878(0, m15553(context, c5045, providerInfoM15551.authority, cancellationSignal));
    }

    @InterfaceC8392
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ProviderInfo m15551(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 C5045 c5045, @InterfaceC6490 Resources resources) throws PackageManager.NameNotFoundException {
        String strM15557 = c5045.m15557();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM15557, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM15557);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c5045.m15558())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM15557 + ", but package was not " + c5045.m15558());
        }
        List<byte[]> listM1856 = m1856(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM1856, f1221);
        List<List<byte[]>> listM15549 = m15549(c5045, resources);
        for (int i = 0; i < listM15549.size(); i++) {
            ArrayList arrayList = new ArrayList(listM15549.get(i));
            Collections.sort(arrayList, f1221);
            if (m15548(listM1856, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m15552(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @InterfaceC6391
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5058.C5059[] m15553(Context context, C5045 c5045, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList;
        Uri uriWithAppendedId;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC0621 interfaceC0621M1857 = InterfaceC0621.m1857(context, uriBuild);
        Cursor cursorMo1858 = null;
        try {
            cursorMo1858 = interfaceC0621M1857.mo1858(uriBuild, new String[]{"_id", C5058.C0627.f1243, C5058.C0627.f1244, C5058.C0627.f11982, C5058.C0627.f11983, C5058.C0627.f11984, C5058.C0627.f11985}, "query = ?", new String[]{c5045.m15559()}, null, cancellationSignal);
            if (cursorMo1858 != null && cursorMo1858.getCount() > 0) {
                int columnIndex = cursorMo1858.getColumnIndex(C5058.C0627.f11985);
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = cursorMo1858.getColumnIndex("_id");
                int columnIndex3 = cursorMo1858.getColumnIndex(C5058.C0627.f1243);
                int columnIndex4 = cursorMo1858.getColumnIndex(C5058.C0627.f1244);
                int columnIndex5 = cursorMo1858.getColumnIndex(C5058.C0627.f11983);
                int columnIndex6 = cursorMo1858.getColumnIndex(C5058.C0627.f11984);
                while (cursorMo1858.moveToNext()) {
                    int i = columnIndex != -1 ? cursorMo1858.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursorMo1858.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorMo1858.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorMo1858.getLong(columnIndex3));
                    }
                    int i3 = columnIndex5 != -1 ? cursorMo1858.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursorMo1858.getInt(columnIndex6) != 1) {
                            z = false;
                        }
                    }
                    C5058.C5059 c5059M1880 = C5058.C5059.m1880(uriWithAppendedId, i2, i3, z, i);
                    arrayList3 = arrayList;
                    arrayList3.add(c5059M1880);
                }
                arrayList2 = arrayList3;
            }
            if (cursorMo1858 != null) {
                cursorMo1858.close();
            }
            interfaceC0621M1857.close();
            return (C5058.C5059[]) arrayList2.toArray(new C5058.C5059[0]);
        } catch (Throwable th) {
            if (cursorMo1858 != null) {
                cursorMo1858.close();
            }
            interfaceC0621M1857.close();
            throw th;
        }
    }
}
