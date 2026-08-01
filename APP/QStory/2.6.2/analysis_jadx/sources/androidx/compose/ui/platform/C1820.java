package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1820 implements InterfaceC1873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f5298;

    public C1820(Context context) {
        this.f5298 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3443(String str) {
        try {
            this.f5298.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(AbstractC6136.m11558(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "Can't open ", str), e);
        }
    }
}
