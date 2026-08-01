package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Message;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3818 implements Handler.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9786;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9786) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC3821) message.obj).recycle();
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    throw AbstractC0900.m719(message.obj);
                }
                if (i != 1) {
                    return false;
                }
                throw AbstractC0900.m719(message.obj);
        }
    }
}
