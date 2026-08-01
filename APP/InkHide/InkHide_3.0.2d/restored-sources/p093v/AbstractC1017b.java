package p093v;

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
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p022L.AbstractC0174d;
import p061e.C0531g;
import p083q.AbstractC0788b;

/* JADX INFO: renamed from: v.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1017b {

    /* JADX INFO: renamed from: a */
    public static final C1016a f3613a = new C1016a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0531g m2219a(Context context, C1018c c1018c) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c1018c.f3614a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC0174d.m352h("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = c1018c.f3615b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C1016a c1016a = f3613a;
        Collections.sort(arrayList, c1016a);
        List listM1460d = c1018c.f3617d;
        if (listM1460d == null) {
            listM1460d = AbstractC0788b.m1460d(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i2 >= listM1460d.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM1460d.get(i2));
            Collections.sort(arrayList2, c1016a);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C0531g(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {c1018c.f3616c};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e2) {
                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new C1023h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return new C0531g(0, (C1023h[]) arrayList3.toArray(new C1023h[0]));
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }
}
