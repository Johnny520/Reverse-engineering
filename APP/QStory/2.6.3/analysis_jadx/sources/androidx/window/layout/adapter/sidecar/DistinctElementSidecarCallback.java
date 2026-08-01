package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4395;
import p136.AbstractC7516;
import p136.C7523;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SidecarInterface.SidecarCallback f7749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7523 f7750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public SidecarDeviceState f7752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7753 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final WeakHashMap f7751 = new WeakHashMap();

    public DistinctElementSidecarCallback(C7523 c7523, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f7750 = c7523;
        this.f7749 = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (p136.AbstractC7516.m12735(r2) == p136.AbstractC7516.m12735(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.f7753
            monitor-enter(r0)
            飘花落叶言子兰哲楪苏世.飘花落叶言子楪苏世哲兰 r1 = r3.f7750     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f7752     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = kotlin.jvm.internal.AbstractC4395.m8907(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = p136.AbstractC7516.m12735(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = p136.AbstractC7516.m12735(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L2e
        L25:
            r3.f7752 = r4     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.f7749
            r3.onDeviceStateChanged(r4)
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f7753) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f7751.get(iBinder);
                this.f7750.getClass();
                if (AbstractC4395.m8907(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo) ? true : (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : C7523.m12739(AbstractC7516.m12734(sidecarWindowLayoutInfo2), AbstractC7516.m12734(sidecarWindowLayoutInfo))) {
                    return;
                }
                this.f7751.put(iBinder, sidecarWindowLayoutInfo);
                this.f7749.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
