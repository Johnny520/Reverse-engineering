package Yue;

import android.content.UriMatcher;
import android.net.Uri;

/* JADX INFO: renamed from: Yue.ۥۣۣۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8137 {
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC6749<Uri> m4161(@InterfaceC6391 final UriMatcher uriMatcher) {
        return new InterfaceC6749() { // from class: Yue.ۥۣۣۢ۟
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C8137.m26770(uriMatcher, (Uri) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m26770(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
