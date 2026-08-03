package p059e3;

import ac.AbstractC0063p;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p023b8.C0205c;
import p069f.C0956r;

/* JADX INFO: renamed from: e3.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0821b {

    /* JADX INFO: renamed from: a */
    public static final C0956r f2462a = new C0956r(2);

    /* JADX INFO: renamed from: b */
    public static final C0205c f2463b = new C0205c(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0016a m2066a(Context context, List list) {
        AbstractC0000a.m80o("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                C0822c c0822c = (C0822c) list.get(i9);
                ProviderInfo providerInfoM2067b = m2067b(context.getPackageManager(), c0822c, context.getResources());
                if (providerInfoM2067b == null) {
                    return new C0016a();
                }
                arrayList.add(m2068c(context, c0822c, providerInfoM2067b.authority));
            }
            return new C0016a(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ProviderInfo m2067b(PackageManager packageManager, C0822c c0822c, Resources resources) {
        C0205c c0205c = f2463b;
        C0956r c0956r = f2462a;
        AbstractC0000a.m80o("FontProvider.getProvider");
        try {
            List listM400J = c0822c.f2467d;
            String str = c0822c.f2464a;
            String str2 = c0822c.f2465b;
            if (listM400J == null) {
                listM400J = AbstractC0063p.m400J(resources, 0);
            }
            C0820a c0820a = new C0820a();
            c0820a.f2459a = str;
            c0820a.f2460b = str2;
            c0820a.f2461c = listM400J;
            ProviderInfo providerInfo = (ProviderInfo) c0956r.m2351a(c0820a);
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
            Collections.sort(arrayList, c0205c);
            for (int i9 = 0; i9 < listM400J.size(); i9++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM400J.get(i9));
                Collections.sort(arrayList2, c0205c);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    c0956r.m2352b(c0820a, providerInfoResolveContentProvider);
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
    public static C0823d[] m2068c(Context context, C0822c c0822c, String str) {
        AbstractC0000a.m80o("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0000a.m80o("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c0822c.f2466c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e6) {
                            Log.w("FontsProvider", "Unable to query the content provider", e6);
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
                            int i9 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C0823d(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i9));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (C0823d[]) arrayList.toArray(new C0823d[0]);
                } finally {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } finally {
        }
    }
}
