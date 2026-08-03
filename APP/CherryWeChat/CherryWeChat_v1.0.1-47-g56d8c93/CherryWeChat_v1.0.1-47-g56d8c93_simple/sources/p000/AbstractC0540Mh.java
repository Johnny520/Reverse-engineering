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
    public static final C0161Dp f1756a = null;

    /* JADX INFO: renamed from: b */
    public static final C0454Kh f1757b = null;

    static {
        f1756a = new C0161Dp(2);
        f1757b = new C0454Kh(0);
    }

    /* JADX INFO: renamed from: a */
    public static C0307H5 m1036a(Context r5, List r6) {
        AbstractC0628Oj.m1239c("FontProvider.getFontFamilyResult");
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L23
        int r1 = 0;
    L5:
        if (r1 >= r6.size()) goto L20;
        C0583Nh r2 = (C0583Nh) r6.get(r1);     // Catch: Throwable -> L23
        if (Build.VERSION.SDK_INT < 31) goto L13;
        String r3 = r2.f1887e;     // Catch: Throwable -> L23
        Typeface r4 = AbstractC0871UB.m1709c(r3);     // Catch: Throwable -> L23
        if (r4 == null) goto L13;
        if (AbstractC0871UB.m1710d(r4) == null) goto L13;
        r0.add(new C1098Zh[]{new C1098Zh(r3, r2.f1888f)});     // Catch: Throwable -> L23
    L19:
        r1 = r1 + 1;     // Catch: Throwable -> L23
    L13:
        ProviderInfo r32 = m1037b(r5.getPackageManager(), r2, r5.getResources());     // Catch: Throwable -> L23
        if (r32 == null) goto L15;
        r0.add(m1038c(r5, r2, r32.authority));     // Catch: Throwable -> L23
        goto L19
    L15:
        C0307H5 r52 = new C0307H5(3, false);     // Catch: Throwable -> L23
        Trace.endSection();
        return r52;
    L20:
        C0307H5 r53 = new C0307H5(r0);     // Catch: Throwable -> L23
        Trace.endSection();
        return r53;
    L23:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m1037b(PackageManager r9, C0583Nh r10, Resources r11) {
        C0454Kh r0 = f1757b;
        C0161Dp r1 = f1756a;
        AbstractC0628Oj.m1239c("FontProvider.getProvider");
        List r4 = r10.f1886d;     // Catch: Throwable -> L41
        String r5 = r10.f1883a;
        String r102 = r10.f1884b;
        if (r4 != null) goto L8;
        r4 = AbstractC1293cr.m2536O(r11, 0);     // Catch: Throwable -> L41
    L8:
        C0497Lh r112 = new C0497Lh();     // Catch: Throwable -> L41
        r112.f1625a = r5;     // Catch: Throwable -> L41
        r112.f1626b = r102;     // Catch: Throwable -> L41
        r112.f1627c = r4;     // Catch: Throwable -> L41
        ProviderInfo r7 = (ProviderInfo) r1.m307f(r112);     // Catch: Throwable -> L41
        if (r7 == null) goto L12;
        Trace.endSection();
        return r7;
    L12:
        ProviderInfo r72 = r9.resolveContentProvider(r5, 0);     // Catch: Throwable -> L41
        if (r72 == null) goto L40;
        if (r72.packageName.equals(r102) == false) goto L38;
        Signature[] r92 = r9.getPackageInfo(r72.packageName, 64).signatures;     // Catch: Throwable -> L41
        ArrayList r103 = new ArrayList();     // Catch: Throwable -> L41
        int r2 = r92.length;     // Catch: Throwable -> L41
        int r3 = 0;
    L17:
        if (r3 >= r2) goto L19;
        r103.add(r92[r3].toByteArray());     // Catch: Throwable -> L41
        r3 = r3 + 1;     // Catch: Throwable -> L41
        goto L17
    L19:
        Collections.sort(r103, r0);     // Catch: Throwable -> L41
        int r93 = 0;
    L21:
        if (r93 >= r4.size()) goto L35;
        ArrayList r22 = new ArrayList((Collection) r4.get(r93));     // Catch: Throwable -> L41
        Collections.sort(r22, r0);     // Catch: Throwable -> L41
        if (r103.size() != r22.size()) goto L30;
        int r32 = 0;
    L27:
        if (r32 >= r103.size()) goto L32;
        if (Arrays.equals((byte[]) r103.get(r32), (byte[]) r22.get(r32)) == false) goto L30;
        r32 = r32 + 1;     // Catch: Throwable -> L41
        goto L27
    L32:
        r1.m311j(r112, r72);     // Catch: Throwable -> L41
        Trace.endSection();
        return r72;
    L30:
        r93 = r93 + 1;     // Catch: Throwable -> L41
        goto L21
    L35:
        Trace.endSection();
        return null;
    L38:
        throw new PackageManager.NameNotFoundException("Found content provider " + r5 + ", but package was not " + r102);     // Catch: Throwable -> L41
    L40:
        throw new PackageManager.NameNotFoundException("No package found for authority: " + r5);     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static C1098Zh[] m1038c(Context r18, C0583Nh r19, String r20) {
        AbstractC0628Oj.m1239c("FontProvider.query");
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L65
        Uri r5 = new Uri.Builder().scheme("content").authority(r20).build();     // Catch: Throwable -> L65
        Uri r0 = new Uri.Builder().scheme("content").authority(r20).appendPath("file").build();     // Catch: Throwable -> L65
        ContentProviderClient r4 = r18.getContentResolver().acquireUnstableContentProviderClient(r5);     // Catch: Throwable -> L65
        Cursor r1 = null;
        String[] r6 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};     // Catch: Throwable -> L24
        AbstractC0628Oj.m1239c("ContentQueryWrapper.query");     // Catch: Throwable -> L24
        String[] r8 = {r19.f1885c};     // Catch: Throwable -> L12
        if (r4 != null) goto L72;
    L14:
        Trace.endSection();     // Catch: Throwable -> L24
        if (r1 != null) goto L17;
    L50:
        ContentProviderClient r182 = r4;
    L51:
        if (r1 == null) goto L53;
        r1.close();     // Catch: Throwable -> L65
    L53:
        if (r182 == null) goto L55;
        r182.close();     // Catch: Throwable -> L65
    L55:
        C1098Zh[] r02 = (C1098Zh[]) r2.toArray(new C1098Zh[0]);     // Catch: Throwable -> L65
        Trace.endSection();
        return r02;
    L17:
        if (r1.getCount() <= 0) goto L50;
        int r22 = r1.getColumnIndex("result_code");     // Catch: Throwable -> L24
        ArrayList r62 = new ArrayList();     // Catch: Throwable -> L24
        int r7 = r1.getColumnIndex("_id");     // Catch: Throwable -> L24
        int r82 = r1.getColumnIndex("file_id");     // Catch: Throwable -> L24
        int r9 = r1.getColumnIndex("font_ttc_index");     // Catch: Throwable -> L24
        int r10 = r1.getColumnIndex("font_weight");     // Catch: Throwable -> L24
        int r11 = r1.getColumnIndex("font_italic");     // Catch: Throwable -> L24
    L19:
        if (r1.moveToNext() == false) goto L49;
        if (r22 == (-1)) goto L26;
        int r17 = r1.getInt(r22);     // Catch: Throwable -> L24
    L27:
        if (r9 != (-1)) goto L29;
        int r14 = 0;
    L31:
        if (r82 != (-1)) goto L37;
        ContentProviderClient r183 = r4;
        Uri r3 = ContentUris.withAppendedId(r5, r1.getLong(r7));     // Catch: Throwable -> L35
    L34:
        Uri r13 = r3;
        if (r10 == (-1)) goto L41;
        int r32 = r1.getInt(r10);     // Catch: Throwable -> L35
    L40:
        int r15 = r32;
        if (r11 != (-1)) goto L44;
    L46:
        boolean r16 = false;
    L47:
        r62.add(new C1098Zh(r13, r14, r15, r16, r17));     // Catch: Throwable -> L35
        r4 = r183;
        goto L19
    L44:
        if (r1.getInt(r11) != 1) goto L46;
        r16 = true;
        goto L47
    L41:
        r32 = 400;
        goto L40
    L37:
        r183 = r4;
        r3 = ContentUris.withAppendedId(r0, r1.getLong(r82));     // Catch: Throwable -> L35
        goto L34
    L29:
        r14 = r1.getInt(r9);     // Catch: Throwable -> L24
        goto L31
    L26:
        r17 = 0;
        goto L27
    L49:
        r182 = r4;
        r2 = r62;
        goto L51
    L72:
        r1 = r4.query(r5, r6, "query = ?", r8, null, null);     // Catch: Throwable -> L12 RemoteException -> L68
    L35:
        th = th;
        ContentProviderClient r184 = r18;
    L60:
        if (r1 == null) goto L62;
        r1.close();     // Catch: Throwable -> L65
    L62:
        if (r184 == 0) goto L64;
        r184.close();     // Catch: Throwable -> L65
    L64:
        throw th;     // Catch: Throwable -> L65
    L12:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L24:
        th = th;
        r184 = r4;
    L65:
        th = move-exception;
        Trace.endSection();
        throw th;
    }
}
