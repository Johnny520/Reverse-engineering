package p153;

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
import androidx.collection.C0268;
import androidx.compose.foundation.lazy.layout.C0707;
import com.google.android.flexbox.C3079;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.AbstractC6087;
import p161.AbstractC7641;
import p164.AbstractC7662;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7599 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0268 f20614 = new C0268(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0707 f20613 = new C0707(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7601[] m12796(Context context, C7598 c7598, String str) {
        AbstractC6087.m11401("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC6087.m11401("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c7598.f20609};
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
                            arrayList2.add(new C7601(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, c7598.f20606, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (C7601[]) arrayList.toArray(new C7601[0]);
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ProviderInfo m12797(PackageManager packageManager, C7598 c7598, Resources resources) {
        C0707 c0707 = f20613;
        C0268 c0268 = f20614;
        AbstractC6087.m11401("FontProvider.getProvider");
        try {
            List listM12876 = c7598.f20608;
            String str = c7598.f20611;
            String str2 = c7598.f20610;
            if (listM12876 == null) {
                listM12876 = AbstractC7641.m12876(resources, 0);
            }
            C7600 c7600 = new C7600();
            c7600.f20617 = str;
            c7600.f20616 = str2;
            c7600.f20615 = listM12876;
            ProviderInfo providerInfo = (ProviderInfo) c0268.m831(c7600);
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
            Collections.sort(arrayList, c0707);
            for (int i = 0; i < listM12876.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM12876.get(i));
                Collections.sort(arrayList2, c0707);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    c0268.m830(c7600, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3079 m12798(Context context, List list) {
        String str;
        Typeface typefaceM12904;
        AbstractC6087.m11401("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C7598 c7598 = (C7598) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM12904 = AbstractC7662.m12904((str = c7598.f20607))) == null || AbstractC7662.m12903(typefaceM12904) == null) {
                    ProviderInfo providerInfoM12797 = m12797(context.getPackageManager(), c7598, context.getResources());
                    if (providerInfoM12797 == null) {
                        C3079 c3079 = new C3079();
                        c3079.f9898 = 1;
                        c3079.f9897 = Collections.singletonList(null);
                        return c3079;
                    }
                    arrayList.add(m12796(context, c7598, providerInfoM12797.authority));
                } else {
                    arrayList.add(new C7601[]{new C7601(str, c7598.f20606)});
                }
            }
            C3079 c30792 = new C3079();
            c30792.f9898 = 0;
            c30792.f9897 = arrayList;
            return c30792;
        } finally {
            Trace.endSection();
        }
    }
}
