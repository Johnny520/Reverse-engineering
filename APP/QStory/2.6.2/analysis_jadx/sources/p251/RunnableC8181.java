package p251;

import androidx.appcompat.widget.C0137;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8181 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC8175 f22548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22549;

    public /* synthetic */ RunnableC8181(SharedPreferencesC8175 sharedPreferencesC8175, int i) {
        this.f22549 = i;
        this.f22548 = sharedPreferencesC8175;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22549) {
            case 0:
                AbstractC3056.m6705(this.f22548);
                return;
            default:
                SharedPreferencesC8175 sharedPreferencesC8175 = this.f22548;
                synchronized (sharedPreferencesC8175) {
                    try {
                        synchronized (sharedPreferencesC8175.f22536) {
                            sharedPreferencesC8175.f22535 = true;
                            sharedPreferencesC8175.f22536.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC3056.m6670(sharedPreferencesC8175) && sharedPreferencesC8175.f22526 == 0) {
                            AbstractC3056.m6671(sharedPreferencesC8175);
                        }
                        if (sharedPreferencesC8175.f22539 == null) {
                            sharedPreferencesC8175.f22539 = new C0137(SharedPreferencesC8175.f22513);
                        }
                        if (sharedPreferencesC8175.f22518 == 0) {
                            sharedPreferencesC8175.f22518 = 12;
                        }
                        if (sharedPreferencesC8175.f22530) {
                            AbstractC3056.m6717(sharedPreferencesC8175);
                            AbstractC3054.m6610(sharedPreferencesC8175, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
