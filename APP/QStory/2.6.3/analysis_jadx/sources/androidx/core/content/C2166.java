package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.core.content.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2166 extends BroadcastReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5444 f6429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6554 f6430;

    public C2166(C5444 c5444, InterfaceC6554 interfaceC6554) {
        this.f6430 = interfaceC6554;
        this.f6429 = c5444;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            this.f6430.invoke(this, intent);
        } catch (Throwable th) {
            C5444 c5444 = this.f6429;
            if (c5444 == null) {
                throw th;
            }
            c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(th)));
            this.f6429 = null;
        }
    }
}
