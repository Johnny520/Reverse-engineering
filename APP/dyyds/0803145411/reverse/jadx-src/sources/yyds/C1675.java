package yyds;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: yyds.ᛷᲇᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1675 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final String[] f8535 = {"_data"};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f8536;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0822 f8537;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC0894 f8538;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f8539;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public volatile boolean f8540;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public volatile InterfaceC0724 f8541;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Class f8542;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f8543;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Uri f8544;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0894 f8545;

    public C1675(Context context, InterfaceC0894 interfaceC0894, InterfaceC0894 interfaceC08942, Uri uri, int i, int i2, C0822 c0822, Class cls) {
        this.f8543 = context.getApplicationContext();
        this.f8545 = interfaceC0894;
        this.f8538 = interfaceC08942;
        this.f8544 = uri;
        this.f8539 = i;
        this.f8536 = i2;
        this.f8537 = c0822;
        this.f8542 = cls;
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        this.f8540 = true;
        InterfaceC0724 interfaceC0724 = this.f8541;
        if (interfaceC0724 != null) {
            interfaceC0724.cancel();
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        return this.f8542;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        InterfaceC0724 interfaceC0724 = this.f8541;
        if (interfaceC0724 != null) {
            interfaceC0724.mo512();
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0724 m3418() throws Throwable {
        C1199 c1199Mo940;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Uri uri = this.f8544;
        Cursor cursor = null;
        C0822 c0822 = this.f8537;
        int i = this.f8536;
        int i2 = this.f8539;
        if (zIsExternalStorageLegacy) {
            try {
                Cursor cursorQuery = this.f8543.getContentResolver().query(uri, f8535, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            c1199Mo940 = this.f8545.mo940(file, i2, i, c0822);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            c1199Mo940 = this.f8538.mo940(uri, i2, i, c0822);
        }
        if (c1199Mo940 != null) {
            return c1199Mo940.f5473;
        }
        return null;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) throws Throwable {
        try {
            InterfaceC0724 interfaceC0724M3418 = m3418();
            if (interfaceC0724M3418 == null) {
                interfaceC0306.mo567(new IllegalArgumentException("Failed to build fetcher for: " + this.f8544));
            } else {
                this.f8541 = interfaceC0724M3418;
                if (this.f8540) {
                    cancel();
                } else {
                    interfaceC0724M3418.mo514(enumC0296, interfaceC0306);
                }
            }
        } catch (FileNotFoundException e) {
            interfaceC0306.mo567(e);
        }
    }
}
