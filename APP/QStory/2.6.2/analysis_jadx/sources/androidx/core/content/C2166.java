package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.core.content.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2166 extends BroadcastReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5443 f6428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6553 f6429;

    public C2166(C5443 c5443, InterfaceC6553 interfaceC6553) {
        this.f6429 = interfaceC6553;
        this.f6428 = c5443;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            this.f6429.invoke(this, intent);
        } catch (Throwable th) {
            C5443 c5443 = this.f6428;
            if (c5443 == null) {
                throw th;
            }
            c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
            this.f6428 = null;
        }
    }
}
