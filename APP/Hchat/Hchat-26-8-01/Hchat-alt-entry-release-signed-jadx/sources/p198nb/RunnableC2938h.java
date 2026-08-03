package p198nb;

import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p210o8.C3086j;

/* JADX INFO: renamed from: nb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2938h implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9634g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2954w f9635h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2942k f9636i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9637j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f9638k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2938h(C2954w c2954w, C2942k c2942k, int i9, long j3) {
        this.f9635h = c2954w;
        this.f9636i = c2942k;
        this.f9637j = i9;
        this.f9638k = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C2944m c2944mM6355r;
        switch (this.f9634g) {
            case 0:
                C2954w c2954w = this.f9635h;
                C2942k c2942k = this.f9636i;
                long j3 = this.f9638k;
                int i9 = this.f9637j;
                if (c2954w.m6361f(c2942k, j3)) {
                    C3086j c3086jTasks = WeChatApis.tasks();
                    if (c3086jTasks != null) {
                        c3086jTasks.m6553d(new RunnableC2938h(c2954w, c2942k, i9, j3));
                    } else {
                        c2954w.f9677d.remove(c2942k.f9647a);
                        AbstractC1184v0.m3203m("[Hchat:TextSpeech] 等待语音文件失败: 任务 API 未就绪");
                    }
                    break;
                }
                break;
            default:
                C2954w c2954w2 = this.f9635h;
                C2942k c2942k2 = this.f9636i;
                int i10 = this.f9637j;
                long j4 = this.f9638k;
                try {
                    c2944mM6355r = C2954w.m6355r(c2942k2, i10);
                } catch (Throwable th2) {
                    c2942k2.f9656j = "resolveError=".concat(C2954w.m6351h(th2.getClass().getName() + ":" + th2.getMessage()));
                    c2944mM6355r = null;
                }
                c2954w2.f9675b.post(new RunnableC2936g(c2954w2, c2942k2, j4, c2944mM6355r, i10));
                break;
        }
    }

    public /* synthetic */ RunnableC2938h(C2954w c2954w, C2942k c2942k, long j3, int i9) {
        this.f9635h = c2954w;
        this.f9636i = c2942k;
        this.f9638k = j3;
        this.f9637j = i9;
    }
}
