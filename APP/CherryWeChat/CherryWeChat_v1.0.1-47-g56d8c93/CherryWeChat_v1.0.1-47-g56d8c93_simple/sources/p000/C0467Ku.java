package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: Ku */
/* JADX INFO: loaded from: classes.dex */
public final class C0467Ku implements InterfaceC2541tc {

    /* JADX INFO: renamed from: k */
    public static final String[] f1513k = null;

    /* JADX INFO: renamed from: a */
    public final Context f1514a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1189as f1515b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1189as f1516c;

    /* JADX INFO: renamed from: d */
    public final Uri f1517d;

    /* JADX INFO: renamed from: e */
    public final int f1518e;

    /* JADX INFO: renamed from: f */
    public final int f1519f;

    /* JADX INFO: renamed from: g */
    public final C2644vt f1520g;

    /* JADX INFO: renamed from: h */
    public final Class f1521h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f1522i;

    /* JADX INFO: renamed from: j */
    public volatile InterfaceC2541tc f1523j;

    static {
        f1513k = new String[]{"_data"};
    }

    public C0467Ku(Context r1, InterfaceC1189as r2, InterfaceC1189as r3, Uri r4, int r5, int r6, C2644vt r7, Class r8) {
        this.f1514a = r1.getApplicationContext();
        this.f1515b = r2;
        this.f1516c = r3;
        this.f1517d = r4;
        this.f1518e = r5;
        this.f1519f = r6;
        this.f1520g = r7;
        this.f1521h = r8;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return this.f1521h;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2541tc m913b() {
        boolean r0 = AbstractC0688Q.m1416t();
        Cursor r1 = null;
        Context r2 = this.f1514a;
        C2644vt r3 = this.f1520g;
        int r4 = this.f1519f;
        int r5 = this.f1518e;
        if (r0 == false) goto L23;
        Uri r7 = this.f1517d;
        Cursor r22 = r2.getContentResolver().query(r7, f1513k, null, null, null);     // Catch: Throwable -> L19
        if (r22 == null) goto L18;
    L13:
        th = th;
        r1 = r22;
    L20:
        if (r1 == null) goto L22;
        r1.close();
    L22:
        throw th;
    L8:
        if (r22.moveToFirst() == false) goto L18;
        String r02 = r22.getString(r22.getColumnIndexOrThrow("_data"));     // Catch: Throwable -> L13
        if (TextUtils.isEmpty(r02) == true) goto L16;
        File r6 = new File(r02);     // Catch: Throwable -> L13
        r22.close();
        C1108Zr r03 = this.f1515b.mo995b(r6, r5, r4, r3);
    L32:
        if (r03 != null) goto L34;
        return null;
    L34:
        return r03.f3503c;
    L16:
        throw new FileNotFoundException("File path was empty in media store for: " + r7);     // Catch: Throwable -> L13
    L18:
        throw new FileNotFoundException("Failed to media store entry for: " + r7);     // Catch: Throwable -> L13
    L19:
        th = th;
        goto L20
    L23:
        Uri r04 = this.f1517d;
        boolean r62 = AbstractC0628Oj.m1227H(r04);
        InterfaceC1189as r72 = this.f1516c;
        if (r62 == false) goto L29;
        if (r04.getPathSegments().contains("picker") == false) goto L29;
        r03 = r72.mo995b(r04, r5, r4, r3);
    L29:
        if (r2.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) goto L31;
        r04 = AbstractC0688Q.m1407k(r04);
    L31:
        r03 = r72.mo995b(r04, r5, r4, r3);
        goto L32
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        InterfaceC2541tc r0 = this.f1523j;
        if (r0 == null) goto L6;
        r0.mo914c();
        return;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f1522i = true;
        InterfaceC2541tc r0 = this.f1523j;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r3, InterfaceC2498sc r4) {
        InterfaceC2541tc r1 = m913b();     // Catch: FileNotFoundException -> L7
        if (r1 != null) goto L9;
        r4.mo635b(new IllegalArgumentException("Failed to build fetcher for: " + this.f1517d));     // Catch: FileNotFoundException -> L7
        return;
    L9:
        this.f1523j = r1;     // Catch: FileNotFoundException -> L7
        if (this.f1522i == false) goto L13;
        cancel();     // Catch: FileNotFoundException -> L7
        return;
    L13:
        r1.mo915d(r3, r4);     // Catch: FileNotFoundException -> L7
        return;
    L7:
        e = move-exception;
        r4.mo635b(e);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}
