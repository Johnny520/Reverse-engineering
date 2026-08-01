package com.google.android.material.datepicker;

import androidx.window.area.AbstractC3400;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C6573;
import p386.AbstractC9791;
import p386.C9790;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3976 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f10719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f10720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10721;

    public /* synthetic */ RunnableC3976(Object obj, long j, int i) {
        this.f10721 = i;
        this.f10720 = obj;
        this.f10719 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10721) {
            case 0:
                AbstractC3975 abstractC3975 = (AbstractC3975) this.f10720;
                abstractC3975.f10718.setError(String.format(abstractC3975.f10711, AbstractC3400.m5646(this.f10719).replace(' ', (char) 160)));
                abstractC3975.mo7696();
                return;
            default:
                C9790 c9790 = (C9790) this.f10720;
                long j = this.f10719;
                synchronized (c9790.f25519) {
                    if (c9790.f25515.get()) {
                        return;
                    }
                    if (c9790.f25520 != 0) {
                        return;
                    }
                    if (c9790.f25517 != j) {
                        return;
                    }
                    c9790.f25514 = null;
                    if (c9790.f25518) {
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = AbstractC9791.f25523;
                    String str = c9790.f25512;
                    C6573 c6573 = c9790.f25511;
                    str.getClass();
                    c6573.getClass();
                    if (AbstractC9791.f25523.remove(str, c6573) && !c9790.f25515.get()) {
                        boolean zM15134 = c9790.m15134();
                        AbstractC9791.m15136(c9790.f25512, c9790.f25511);
                        if (zM15134) {
                            c9790.f25516.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
