package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: Mh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0540Mh {

    /* JADX INFO: renamed from: a */
    public static final C0161Dp f1756a = new C0161Dp(2);

    /* JADX INFO: renamed from: b */
    public static final C0454Kh f1757b = new C0454Kh(0);

    /* JADX INFO: renamed from: a */
    public static C0307H5 m1036a(Context context, List list) {
        String str;
        Typeface typefaceM1709c;
        AbstractC0628Oj.m1239c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C0583Nh c0583Nh = (C0583Nh) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM1709c = AbstractC0871UB.m1709c((str = c0583Nh.f1887e))) == null || AbstractC0871UB.m1710d(typefaceM1709c) == null) {
                    ProviderInfo providerInfoM1037b = m1037b(context.getPackageManager(), c0583Nh, context.getResources());
                    if (providerInfoM1037b == null) {
                        return new C0307H5(3, false);
                    }
                    arrayList.add(m1038c(context, c0583Nh, providerInfoM1037b.authority));
                } else {
                    arrayList.add(new C1098Zh[]{new C1098Zh(str, c0583Nh.f1888f)});
                }
            }
            return new C0307H5(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m1037b(PackageManager packageManager, C0583Nh c0583Nh, Resources resources) {
        C0454Kh c0454Kh = f1757b;
        C0161Dp c0161Dp = f1756a;
        AbstractC0628Oj.m1239c("FontProvider.getProvider");
        try {
            List listM2536O = c0583Nh.f1886d;
            String str = c0583Nh.f1883a;
            String str2 = c0583Nh.f1884b;
            if (listM2536O == null) {
                listM2536O = AbstractC1293cr.m2536O(resources, 0);
            }
            C0497Lh c0497Lh = new C0497Lh();
            c0497Lh.f1625a = str;
            c0497Lh.f1626b = str2;
            c0497Lh.f1627c = listM2536O;
            ProviderInfo providerInfo = (ProviderInfo) c0161Dp.m307f(c0497Lh);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c0454Kh);
            for (int i = 0; i < listM2536O.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM2536O.get(i));
                Collections.sort(arrayList2, c0454Kh);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    c0161Dp.m311j(c0497Lh, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static C1098Zh[] m1038c(Context context, C0583Nh c0583Nh, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri uriWithAppendedId;
        AbstractC0628Oj.m1239c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0628Oj.m1239c("ContentQueryWrapper.query");
                try {
                    try {
                        String[] strArr2 = {c0583Nh.f1885c};
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentProviderClient3 = contentProviderClientAcquireUnstableContentProviderClient;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                } else {
                                    contentProviderClient3 = contentProviderClientAcquireUnstableContentProviderClient;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                }
                                arrayList2.add(new C1098Zh(uriWithAppendedId, i2, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient3;
                            }
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        return (C1098Zh[]) arrayList.toArray(new C1098Zh[0]);
                    } catch (Throwable th) {
                        th = th;
                        contentProviderClient = context;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient != 0) {
                            contentProviderClient.close();
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            }
        } finally {
            Trace.endSection();
        }
    }
}
