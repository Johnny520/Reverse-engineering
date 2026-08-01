package p251;

import androidx.appcompat.widget.C0137;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3066;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8182 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC8176 f22547;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22548;

    public /* synthetic */ RunnableC8182(SharedPreferencesC8176 sharedPreferencesC8176, int i) {
        this.f22548 = i;
        this.f22547 = sharedPreferencesC8176;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22548) {
            case 0:
                AbstractC3056.m6724(this.f22547);
                return;
            default:
                SharedPreferencesC8176 sharedPreferencesC8176 = this.f22547;
                synchronized (sharedPreferencesC8176) {
                    try {
                        synchronized (sharedPreferencesC8176.f22535) {
                            sharedPreferencesC8176.f22534 = true;
                            sharedPreferencesC8176.f22535.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC3056.m6694(sharedPreferencesC8176) && sharedPreferencesC8176.f22525 == 0) {
                            AbstractC3056.m6695(sharedPreferencesC8176);
                        }
                        if (sharedPreferencesC8176.f22538 == null) {
                            sharedPreferencesC8176.f22538 = new C0137(SharedPreferencesC8176.f22512);
                        }
                        if (sharedPreferencesC8176.f22517 == 0) {
                            sharedPreferencesC8176.f22517 = 12;
                        }
                        if (sharedPreferencesC8176.f22529) {
                            AbstractC3056.m6676(sharedPreferencesC8176);
                            AbstractC3066.m6855(sharedPreferencesC8176, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
