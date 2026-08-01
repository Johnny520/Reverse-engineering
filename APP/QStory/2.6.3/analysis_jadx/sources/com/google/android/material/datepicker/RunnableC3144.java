package com.google.android.material.datepicker;

import androidx.window.area.AbstractC2567;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C5743;
import p370.AbstractC8962;
import p370.C8961;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3144 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f10374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f10375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10376;

    public /* synthetic */ RunnableC3144(Object obj, long j, int i) {
        this.f10376 = i;
        this.f10375 = obj;
        this.f10374 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10376) {
            case 0:
                AbstractC3143 abstractC3143 = (AbstractC3143) this.f10375;
                abstractC3143.f10373.setError(String.format(abstractC3143.f10366, AbstractC2567.m5086(this.f10374).replace(' ', (char) 160)));
                abstractC3143.mo7137();
                return;
            default:
                C8961 c8961 = (C8961) this.f10375;
                long j = this.f10374;
                synchronized (c8961.f25174) {
                    if (c8961.f25170.get()) {
                        return;
                    }
                    if (c8961.f25175 != 0) {
                        return;
                    }
                    if (c8961.f25172 != j) {
                        return;
                    }
                    c8961.f25169 = null;
                    if (c8961.f25173) {
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = AbstractC8962.f25178;
                    String str = c8961.f25167;
                    C5743 c5743 = c8961.f25166;
                    str.getClass();
                    c5743.getClass();
                    if (AbstractC8962.f25178.remove(str, c5743) && !c8961.f25170.get()) {
                        boolean zM14575 = c8961.m14575();
                        AbstractC8962.m14577(c8961.f25167, c8961.f25166);
                        if (zM14575) {
                            c8961.f25171.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
