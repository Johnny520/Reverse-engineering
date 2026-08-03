package Yue;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: Yue.ۥۣۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class C8135 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final File m4158(@InterfaceC6399 Uri uri) {
        if (!C5499.m17094(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Uri m4159(@InterfaceC6399 File file) {
        return Uri.fromFile(file);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Uri m26769(@InterfaceC6399 String str) {
        return Uri.parse(str);
    }
}
