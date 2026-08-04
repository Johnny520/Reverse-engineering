package yyds;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛴᛷᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0887 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final String[] f4066 = {"_data"};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f4067;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4068;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f4069;

    public /* synthetic */ C0887(Object obj, int i, Object obj2) {
        this.f4068 = i;
        this.f4069 = obj;
        this.f4067 = obj2;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private final void m1981() {
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    private final void m1982() {
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final void m1983() {
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private final void m1984() {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m1985() {
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        int i = this.f4068;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        switch (this.f4068) {
            case 0:
                return File.class;
            case 1:
                return ((InterfaceC2504) this.f4067).mo605();
            default:
                return InputStream.class;
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        switch (this.f4068) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.f4067).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        switch (this.f4068) {
        }
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        int i = this.f4068;
        Object obj = this.f4069;
        switch (i) {
            case 0:
                ContentResolver contentResolver = ((Context) obj).getContentResolver();
                Uri uri = (Uri) this.f4067;
                Cursor cursorQuery = contentResolver.query(uri, f4066, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0306.mo546(new File(string));
                    return;
                }
                interfaceC0306.mo567(new FileNotFoundException("Failed to find file path for: " + uri));
                return;
            case 1:
                interfaceC0306.mo546(((InterfaceC2504) this.f4067).mo604((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamM3830 = C1985.m3830((String) obj);
                    this.f4067 = byteArrayInputStreamM3830;
                    interfaceC0306.mo546(byteArrayInputStreamM3830);
                    return;
                } catch (IllegalArgumentException e) {
                    interfaceC0306.mo567(e);
                    return;
                }
        }
    }

    public C0887(String str, C1985 c1985) {
        this.f4068 = 2;
        this.f4069 = str;
    }
}
