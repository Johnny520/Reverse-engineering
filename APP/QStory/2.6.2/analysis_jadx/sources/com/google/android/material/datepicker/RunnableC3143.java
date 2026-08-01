package com.google.android.material.datepicker;

import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.ConcurrentHashMap;
import org.luckypray.dexkit.C5742;
import p367.AbstractC8953;
import p367.C8952;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3143 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f10369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f10370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10371;

    public /* synthetic */ RunnableC3143(Object obj, long j, int i) {
        this.f10371 = i;
        this.f10370 = obj;
        this.f10369 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10371) {
            case 0:
                AbstractC3142 abstractC3142 = (AbstractC3142) this.f10370;
                abstractC3142.f10368.setError(String.format(abstractC3142.f10361, AbstractC3056.m6686(this.f10369).replace(' ', (char) 160)));
                abstractC3142.mo7150();
                return;
            default:
                C8952 c8952 = (C8952) this.f10370;
                long j = this.f10369;
                synchronized (c8952.f25173) {
                    if (c8952.f25169.get()) {
                        return;
                    }
                    if (c8952.f25174 != 0) {
                        return;
                    }
                    if (c8952.f25171 != j) {
                        return;
                    }
                    c8952.f25168 = null;
                    if (c8952.f25172) {
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = AbstractC8953.f25177;
                    String str = c8952.f25166;
                    C5742 c5742 = c8952.f25165;
                    str.getClass();
                    c5742.getClass();
                    if (AbstractC8953.f25177.remove(str, c5742) && !c8952.f25169.get()) {
                        boolean zM14543 = c8952.m14543();
                        AbstractC8953.m14545(c8952.f25166, c8952.f25165);
                        if (zM14543) {
                            c8952.f25170.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
