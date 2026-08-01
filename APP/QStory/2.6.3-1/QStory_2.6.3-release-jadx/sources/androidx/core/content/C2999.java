package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.core.content.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2999 extends BroadcastReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6276 f6774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7383 f6775;

    public C2999(C6276 c6276, InterfaceC7383 interfaceC7383) {
        this.f6775 = interfaceC7383;
        this.f6774 = c6276;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            this.f6775.invoke(this, intent);
        } catch (Throwable th) {
            C6276 c6276 = this.f6774;
            if (c6276 == null) {
                throw th;
            }
            c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
            this.f6774 = null;
        }
    }
}
