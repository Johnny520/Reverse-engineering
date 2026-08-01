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
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: qv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0666qv {

    /* JADX INFO: renamed from: a */
    public static final fc0 f5223a = new fc0(2);

    /* JADX INFO: renamed from: b */
    public static final C0272h6 f5224b = new C0272h6(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0012, B:8:0x001f, B:10:0x0025, B:13:0x002c, B:15:0x0038, B:20:0x0042, B:22:0x0048, B:29:0x0080, B:23:0x0057, B:25:0x0065, B:28:0x0077, B:30:0x0083), top: B:36:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0012, B:8:0x001f, B:10:0x0025, B:13:0x002c, B:15:0x0038, B:20:0x0042, B:22:0x0048, B:29:0x0080, B:23:0x0057, B:25:0x0065, B:28:0x0077, B:30:0x0083), top: B:36:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0070bw m3333a(Context context, List list) {
        ProviderInfo providerInfoM3334b;
        Typeface typefaceCreate;
        g60.m1208g("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C0703rv c0703rv = (C0703rv) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = c0703rv.f5559e;
                    jo0 jo0Var = w91.f7050a;
                    if (str == null || str.isEmpty()) {
                        typefaceCreate = null;
                        if (typefaceCreate != null || w91.m4927b(typefaceCreate) == null) {
                            providerInfoM3334b = m3334b(context.getPackageManager(), c0703rv, context.getResources());
                            if (providerInfoM3334b != null) {
                                C0070bw c0070bw = new C0070bw();
                                c0070bw.f594d = 1;
                                c0070bw.f595e = Collections.singletonList(null);
                                return c0070bw;
                            }
                            arrayList.add(m3335c(context, c0703rv, providerInfoM3334b.authority));
                        } else {
                            arrayList.add(new C0107cw[]{new C0107cw(str, c0703rv.f5560f)});
                        }
                    } else {
                        typefaceCreate = Typeface.create(str, 0);
                        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                        }
                        if (typefaceCreate != null) {
                            providerInfoM3334b = m3334b(context.getPackageManager(), c0703rv, context.getResources());
                            if (providerInfoM3334b != null) {
                            }
                        }
                    }
                }
            }
            C0070bw c0070bw2 = new C0070bw();
            c0070bw2.f594d = 0;
            c0070bw2.f595e = arrayList;
            return c0070bw2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ProviderInfo m3334b(PackageManager packageManager, C0703rv c0703rv, Resources resources) {
        C0272h6 c0272h6 = f5224b;
        fc0 fc0Var = f5223a;
        g60.m1208g("FontProvider.getProvider");
        try {
            List listM2784x = c0703rv.f5558d;
            String str = c0703rv.f5555a;
            String str2 = c0703rv.f5556b;
            if (listM2784x == null) {
                listM2784x = o30.m2784x(resources, 0);
            }
            C0629pv c0629pv = new C0629pv();
            c0629pv.f4969a = str;
            c0629pv.f4970b = str2;
            c0629pv.f4971c = listM2784x;
            ProviderInfo providerInfo = (ProviderInfo) fc0Var.m1078a(c0629pv);
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
            Collections.sort(arrayList, c0272h6);
            for (int i = 0; i < listM2784x.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM2784x.get(i));
                Collections.sort(arrayList2, c0272h6);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    fc0Var.m1079b(c0629pv, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0107cw[] m3335c(Context context, C0703rv c0703rv, String str) {
        g60.m1208g("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                g60.m1208g("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c0703rv.f5557c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C0107cw(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, c0703rv.f5560f, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (C0107cw[]) arrayList.toArray(new C0107cw[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
