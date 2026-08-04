package yyds;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛷᲁᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1655 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static volatile WeakReference f8450 = null;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static int f8453 = 1;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean f8454 = true;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0469 f8451 = new C0469(20);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f8456 = (int) ((35.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final String[] f8449 = {"com.bytedance.sdk.openadsdk.stub.activity", "com.mobile.auth.gatewayauth", "com.google.android.gms.ads"};

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int f8455 = -1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final int f8452 = -1;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final int f8447 = -1;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final boolean f8448 = true;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Context m3376() {
        WeakReference weakReference = f8450;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }
}
