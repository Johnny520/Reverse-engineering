package p000A;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p034S.AbstractC0324d;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: A.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0004e {

    /* JADX INFO: renamed from: a */
    public static final C0003d f9a = null;

    static {
        f9a = new C0003d();
    }

    /* JADX INFO: renamed from: a */
    public static C0010k m15a(Context r21, C0005f r22) {
        PackageManager r1 = r21.getPackageManager();
        Resources r2 = r21.getResources();
        String r3 = r22.f10a;
        ProviderInfo r5 = r1.resolveContentProvider(r3, 0);
        if (r5 == null) goto L81;
        String r6 = r5.packageName;
        String r7 = r22.f11b;
        if (r6.equals(r7) == false) goto L79;
        Signature[] r12 = r1.getPackageInfo(r5.packageName, 64).signatures;
        ArrayList r32 = new ArrayList();
        int r62 = r12.length;
        int r72 = 0;
    L7:
        if (r72 >= r62) goto L9;
        r32.add(r12[r72].toByteArray());
        r72 = r72 + 1;
        goto L7
    L9:
        C0003d r13 = f9a;
        Collections.sort(r32, r13);
        List r63 = r22.f13d;
        if (r63 != null) goto L13;
        r63 = AbstractC1083b.m2573i(r2, 0);
    L13:
        int r23 = 0;
    L14:
        Cursor r8 = null;
        if (r23 >= r63.size()) goto L26;
        ArrayList r73 = new ArrayList((Collection) r63.get(r23));
        Collections.sort(r73, r13);
        if (r32.size() != r73.size()) goto L24;
        int r9 = 0;
    L21:
        if (r9 >= r32.size()) goto L28;
        if (Arrays.equals((byte[]) r32.get(r9), (byte[]) r73.get(r9)) == false) goto L24;
        r9 = r9 + 1;
    L28:
        if (r5 == null) goto L30;
        String r24 = r5.authority;
        ArrayList r33 = new ArrayList();
        Uri r52 = new Uri.Builder().scheme("content").authority(r24).build();
        Uri r25 = new Uri.Builder().scheme("content").authority(r24).appendPath("file").build();
        ContentProviderClient r64 = r21.getContentResolver().acquireUnstableContentProviderClient(r52);
        String[] r11 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};     // Catch: Throwable -> L46
        String[] r132 = {r22.f12c};     // Catch: Throwable -> L46
        if (r64 != null) goto L83;
    L37:
        if (r8 != null) goto L39;
    L67:
        if (r8 == null) goto L69;
        r8.close();
    L69:
        if (r64 == null) goto L72;
        r64.close();
    L72:
        return new C0010k(0, (C0011l[]) r33.toArray(new C0011l[0]));
    L39:
        if (r8.getCount() <= 0) goto L67;
        int r02 = r8.getColumnIndex("result_code");     // Catch: Throwable -> L46
        r33 = new ArrayList();     // Catch: Throwable -> L46
        int r74 = r8.getColumnIndex("_id");     // Catch: Throwable -> L46
        int r92 = r8.getColumnIndex("file_id");     // Catch: Throwable -> L46
        int r10 = r8.getColumnIndex("font_ttc_index");     // Catch: Throwable -> L46
        int r112 = r8.getColumnIndex("font_weight");     // Catch: Throwable -> L46
        int r122 = r8.getColumnIndex("font_italic");     // Catch: Throwable -> L46
    L41:
        if (r8.moveToNext() == false) goto L67;
        if (r02 == (-1)) goto L48;
        int r20 = r8.getInt(r02);     // Catch: Throwable -> L46
    L49:
        if (r10 == (-1)) goto L51;
        int r17 = r8.getInt(r10);     // Catch: Throwable -> L46
    L52:
        if (r92 != (-1)) goto L55;
        Uri r14 = ContentUris.withAppendedId(r52, r8.getLong(r74));     // Catch: Throwable -> L46
    L54:
        Uri r16 = r14;
        if (r112 == (-1)) goto L59;
        int r142 = r8.getInt(r112);     // Catch: Throwable -> L46
    L58:
        int r18 = r142;
        if (r122 != (-1)) goto L62;
    L64:
        boolean r19 = false;
    L65:
        r33.add(new C0011l(r16, r17, r18, r19, r20));     // Catch: Throwable -> L46
        goto L41
    L62:
        if (r8.getInt(r122) != 1) goto L64;
        r19 = true;
        goto L65
    L59:
        r142 = 400;
        goto L58
    L55:
        r14 = ContentUris.withAppendedId(r25, r8.getLong(r92));     // Catch: Throwable -> L46
        goto L54
    L51:
        r17 = 0;
        goto L52
    L48:
        r20 = 0;
        goto L49
    L83:
        r8 = r64.query(r52, r11, "query = ?", r132, null, null);     // Catch: RemoteException -> L82 Throwable -> L46
    L46:
        th = move-exception;
        if (r8 == null) goto L75;
        r8.close();
    L75:
        if (r64 == null) goto L77;
        r64.close();
    L77:
        throw th;
    L30:
        return new C0010k(1, null);
    L24:
        r23 = r23 + 1;
        goto L14
    L26:
        r5 = null;
        goto L28
    L79:
        throw new PackageManager.NameNotFoundException("Found content provider " + r3 + ", but package was not " + r7);
    L81:
        throw new PackageManager.NameNotFoundException(AbstractC0324d.m725h("No package found for authority: ", r3));
    }
}
