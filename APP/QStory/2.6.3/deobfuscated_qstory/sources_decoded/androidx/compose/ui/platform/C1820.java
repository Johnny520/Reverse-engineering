package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1820 implements InterfaceC1873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f5299;

    public C1820(Context context) {
        this.f5299 = context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3453(String str) {
        try {
            this.f5299.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(AbstractC6183.m11590(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "Can't open ", str), e);
        }
    }
}
