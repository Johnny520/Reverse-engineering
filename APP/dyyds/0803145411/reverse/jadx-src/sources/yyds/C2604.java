package yyds;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: yyds.ᲈᛲᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2604 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0078 f12804 = new C0078(new C0824(12));

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4681(Context context, String str) {
        AbstractC2328.m4341(-768614035260270L);
        if (context == null || AbstractC0473.m1313(str)) {
            return;
        }
        ((Handler) f12804.getValue()).post(new RunnableC2696(context, 11, str));
    }
}
