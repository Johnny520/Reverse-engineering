package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: Ku */
/* JADX INFO: loaded from: classes.dex */
public final class C0467Ku implements InterfaceC2541tc {

    /* JADX INFO: renamed from: k */
    public static final String[] f1513k = {"_data"};

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

    public C0467Ku(Context context, InterfaceC1189as interfaceC1189as, InterfaceC1189as interfaceC1189as2, Uri uri, int i, int i2, C2644vt c2644vt, Class cls) {
        this.f1514a = context.getApplicationContext();
        this.f1515b = interfaceC1189as;
        this.f1516c = interfaceC1189as2;
        this.f1517d = uri;
        this.f1518e = i;
        this.f1519f = i2;
        this.f1520g = c2644vt;
        this.f1521h = cls;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return this.f1521h;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2541tc m913b() throws Throwable {
        C1108Zr c1108ZrMo995b;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f1514a;
        C2644vt c2644vt = this.f1520g;
        int i = this.f1519f;
        int i2 = this.f1518e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f1517d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f1513k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c1108ZrMo995b = this.f1515b.mo995b(file, i2, i, c2644vt);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f1517d;
            boolean zM1227H = AbstractC0628Oj.m1227H(requireOriginal);
            InterfaceC1189as interfaceC1189as = this.f1516c;
            if (zM1227H && requireOriginal.getPathSegments().contains("picker")) {
                c1108ZrMo995b = interfaceC1189as.mo995b(requireOriginal, i2, i, c2644vt);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                c1108ZrMo995b = interfaceC1189as.mo995b(requireOriginal, i2, i, c2644vt);
            }
        }
        if (c1108ZrMo995b != null) {
            return c1108ZrMo995b.f3503c;
        }
        return null;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        InterfaceC2541tc interfaceC2541tc = this.f1523j;
        if (interfaceC2541tc != null) {
            interfaceC2541tc.mo914c();
        }
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f1522i = true;
        InterfaceC2541tc interfaceC2541tc = this.f1523j;
        if (interfaceC2541tc != null) {
            interfaceC2541tc.cancel();
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) throws Throwable {
        try {
            InterfaceC2541tc interfaceC2541tcM913b = m913b();
            if (interfaceC2541tcM913b == null) {
                interfaceC2498sc.mo635b(new IllegalArgumentException("Failed to build fetcher for: " + this.f1517d));
            } else {
                this.f1523j = interfaceC2541tcM913b;
                if (this.f1522i) {
                    cancel();
                } else {
                    interfaceC2541tcM913b.mo915d(enumC2688wu, interfaceC2498sc);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC2498sc.mo635b(e);
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 1;
    }
}
