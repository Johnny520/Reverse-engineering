package androidx.lifecycle;

import androidx.collection.C1083;
import androidx.collection.C1091;
import java.util.ArrayDeque;
import p130.InterfaceC8162;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3244 implements InterfaceC8162 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f7393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f7394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f7396;

    public C3244(int i) {
        switch (i) {
            case 1:
                this.f7396 = true;
                this.f7393 = new C1083();
                break;
            default:
                this.f7396 = true;
                this.f7393 = new ArrayDeque();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5074() {
        C1083 c1083 = (C1083) this.f7393;
        Object[] objArr = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof C1091) {
                                C1091 c1091 = (C1091) obj;
                                Object[] objArr2 = c1091.f1350;
                                int i4 = c1091.f1349;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c1083.m1314();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m5075() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f7393;
        if (this.f7395) {
            return;
        }
        try {
            this.f7395 = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.f7394 || !this.f7396)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f7395 = false;
        }
    }
}
