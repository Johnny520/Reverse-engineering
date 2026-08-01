package p000;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0258i3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f373c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0258i3(Context context, String str, int i) {
        this.f371a = i;
        this.f372b = context;
        this.f373c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f371a;
        String str = this.f373c;
        Context context = this.f372b;
        switch (i) {
            case 0:
                try {
                    Thread.sleep(3000L);
                    AbstractC0309l3.m745a(context, str);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 1:
                try {
                    Toast.makeText(context, str, 0).show();
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 2:
                try {
                    Toast.makeText(context, str, 0).show();
                } catch (Throwable unused4) {
                    return;
                }
                break;
            default:
                try {
                    Toast.makeText(context, str, 0).show();
                } catch (Throwable unused5) {
                    return;
                }
                break;
        }
    }
}
