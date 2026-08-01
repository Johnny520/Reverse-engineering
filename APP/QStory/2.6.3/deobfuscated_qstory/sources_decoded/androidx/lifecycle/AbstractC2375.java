package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0053;
import java.util.Map;
import p183.C7762;
import p183.C7764;
import p183.C7765;
import p191.C7805;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f6998 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile Object f6999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile Object f7000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7001;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7005;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7006;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f7007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7004 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7762 f7003 = new C7762();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7002 = 0;

    public AbstractC2375() {
        Object obj = f6998;
        this.f6999 = obj;
        this.f7000 = obj;
        this.f7006 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4492(String str) {
        C7805.m13169().f21275.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C5925.m11311(AbstractC0053.m158("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4493(InterfaceC2370 interfaceC2370) {
        Object obj;
        m4492("observeForever");
        C2376 c2376 = new C2376(this, interfaceC2370);
        C7762 c7762 = this.f7003;
        C7765 c7765Mo13116 = c7762.mo13116(interfaceC2370);
        if (c7765Mo13116 != null) {
            obj = c7765Mo13116.f21059;
        } else {
            C7765 c7765 = new C7765(interfaceC2370, c2376);
            c7762.f21051++;
            C7765 c77652 = c7762.f21052;
            if (c77652 == null) {
                c7762.f21054 = c7765;
                c7762.f21052 = c7765;
            } else {
                c77652.f21060 = c7765;
                c7765.f21058 = c77652;
                c7762.f21052 = c7765;
            }
            obj = null;
        }
        if (((C2376) obj) != null) {
            return;
        }
        c2376.m4495(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4494(C2376 c2376) {
        if (this.f7005) {
            this.f7007 = true;
            return;
        }
        this.f7005 = true;
        do {
            this.f7007 = false;
            if (c2376 != null) {
                if (c2376.f7010) {
                    int i = c2376.f7009;
                    int i2 = this.f7006;
                    if (i < i2) {
                        c2376.f7009 = i2;
                        c2376.f7011.mo4464(this.f7000);
                    }
                }
                c2376 = null;
            } else {
                C7762 c7762 = this.f7003;
                c7762.getClass();
                C7764 c7764 = new C7764(c7762);
                c7762.f21053.put(c7764, Boolean.FALSE);
                while (c7764.hasNext()) {
                    C2376 c23762 = (C2376) ((Map.Entry) c7764.next()).getValue();
                    if (c23762.f7010) {
                        int i3 = c23762.f7009;
                        int i4 = this.f7006;
                        if (i3 < i4) {
                            c23762.f7009 = i4;
                            c23762.f7011.mo4464(this.f7000);
                        }
                    }
                    if (this.f7007) {
                        break;
                    }
                }
            }
        } while (this.f7007);
        this.f7005 = false;
    }
}
