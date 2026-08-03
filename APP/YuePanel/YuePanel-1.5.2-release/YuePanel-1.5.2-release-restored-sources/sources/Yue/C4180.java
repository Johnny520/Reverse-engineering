package Yue;

import android.content.ContentProvider;
import android.content.Context;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4180 {
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Context m1135(@InterfaceC6391 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
