package yyds;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛱᛴᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0112 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ContentResolver f788;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f789;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f790;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Uri f791;

    public AbstractC0112(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f788 = contentResolver;
        this.f791 = uri;
        this.f789 = z;
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public abstract Object mo416(ContentResolver contentResolver, Uri uri);

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo512() {
        Object obj = this.f790;
        if (obj != null) {
            try {
                mo418(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public abstract void mo418(Object obj);

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int mo513() {
        return 1;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        try {
            Object objMo416 = mo416(this.f788, this.f791);
            this.f790 = objMo416;
            interfaceC0306.mo546(objMo416);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC0306.mo567(e);
        }
    }
}
