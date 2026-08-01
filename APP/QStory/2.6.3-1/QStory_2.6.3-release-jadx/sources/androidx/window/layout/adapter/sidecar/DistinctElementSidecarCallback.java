package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5227;
import p152.AbstractC8345;
import p152.C8352;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SidecarInterface.SidecarCallback f8094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8352 f8095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public SidecarDeviceState f8097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f8098 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final WeakHashMap f8096 = new WeakHashMap();

    public DistinctElementSidecarCallback(C8352 c8352, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f8095 = c8352;
        this.f8094 = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (p152.AbstractC8345.m13294(r2) == p152.AbstractC8345.m13294(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f8098) {
            try {
                C8352 c8352 = this.f8095;
                SidecarDeviceState sidecarDeviceState2 = this.f8097;
                c8352.getClass();
                if (!AbstractC5227.m9466(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f8097 = sidecarDeviceState;
                    this.f8094.onDeviceStateChanged(sidecarDeviceState);
                }
            } finally {
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f8098) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f8096.get(iBinder);
                this.f8095.getClass();
                if (AbstractC5227.m9466(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo) ? true : (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : C8352.m13298(AbstractC8345.m13293(sidecarWindowLayoutInfo2), AbstractC8345.m13293(sidecarWindowLayoutInfo))) {
                    return;
                }
                this.f8096.put(iBinder, sidecarWindowLayoutInfo);
                this.f8094.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
