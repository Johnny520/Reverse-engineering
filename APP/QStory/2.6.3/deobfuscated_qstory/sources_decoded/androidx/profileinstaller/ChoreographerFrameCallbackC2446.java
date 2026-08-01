package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.app.RunnableC0100;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Random;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC2446 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7130 = 0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f7130;
        Object obj = this.f7129;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0100((Context) obj, 1), new Random().nextInt(Math.max(DescriptorProtos$Edition.EDITION_2023_VALUE, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ ChoreographerFrameCallbackC2446(Runnable runnable) {
        this.f7129 = runnable;
    }
}
