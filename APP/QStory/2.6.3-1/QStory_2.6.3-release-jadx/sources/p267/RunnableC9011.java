package p267;

import androidx.appcompat.widget.C0984;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9011 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SharedPreferencesC9005 f22892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22893;

    public /* synthetic */ RunnableC9011(SharedPreferencesC9005 sharedPreferencesC9005, int i) {
        this.f22893 = i;
        this.f22892 = sharedPreferencesC9005;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22893) {
            case 0:
                AbstractC3888.m7284(this.f22892);
                return;
            default:
                SharedPreferencesC9005 sharedPreferencesC9005 = this.f22892;
                synchronized (sharedPreferencesC9005) {
                    try {
                        synchronized (sharedPreferencesC9005.f22880) {
                            sharedPreferencesC9005.f22879 = true;
                            sharedPreferencesC9005.f22880.notify();
                            break;
                        }
                        System.nanoTime();
                        if (!AbstractC3888.m7254(sharedPreferencesC9005) && sharedPreferencesC9005.f22870 == 0) {
                            AbstractC3888.m7255(sharedPreferencesC9005);
                        }
                        if (sharedPreferencesC9005.f22883 == null) {
                            sharedPreferencesC9005.f22883 = new C0984(SharedPreferencesC9005.f22857);
                        }
                        if (sharedPreferencesC9005.f22862 == 0) {
                            sharedPreferencesC9005.f22862 = 12;
                        }
                        if (sharedPreferencesC9005.f22874) {
                            AbstractC3888.m7236(sharedPreferencesC9005);
                            AbstractC3898.m7415(sharedPreferencesC9005, "rewrite data");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
