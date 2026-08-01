package androidx.lifecycle;

import android.os.Looper;
import androidx.activity.AbstractC0053;
import java.util.Map;
import p183.C7761;
import p183.C7763;
import p183.C7764;
import p191.C7804;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f6997 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile Object f6998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile Object f6999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7000;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f7005;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f7006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f7003 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7761 f7002 = new C7761();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7001 = 0;

    public AbstractC2375() {
        Object obj = f6997;
        this.f6998 = obj;
        this.f6999 = obj;
        this.f7005 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4482(String str) {
        C7804.m13141().f21278.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C5919.m11250(AbstractC0053.m156("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4483(InterfaceC2370 interfaceC2370) {
        Object obj;
        m4482("observeForever");
        C2376 c2376 = new C2376(this, interfaceC2370);
        C7761 c7761 = this.f7002;
        C7764 c7764Mo13088 = c7761.mo13088(interfaceC2370);
        if (c7764Mo13088 != null) {
            obj = c7764Mo13088.f21062;
        } else {
            C7764 c7764 = new C7764(interfaceC2370, c2376);
            c7761.f21054++;
            C7764 c77642 = c7761.f21055;
            if (c77642 == null) {
                c7761.f21057 = c7764;
                c7761.f21055 = c7764;
            } else {
                c77642.f21063 = c7764;
                c7764.f21061 = c77642;
                c7761.f21055 = c7764;
            }
            obj = null;
        }
        if (((C2376) obj) != null) {
            return;
        }
        c2376.m4485(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4484(C2376 c2376) {
        if (this.f7004) {
            this.f7006 = true;
            return;
        }
        this.f7004 = true;
        do {
            this.f7006 = false;
            if (c2376 != null) {
                if (c2376.f7009) {
                    int i = c2376.f7008;
                    int i2 = this.f7005;
                    if (i < i2) {
                        c2376.f7008 = i2;
                        c2376.f7010.mo4454(this.f6999);
                    }
                }
                c2376 = null;
            } else {
                C7761 c7761 = this.f7002;
                c7761.getClass();
                C7763 c7763 = new C7763(c7761);
                c7761.f21056.put(c7763, Boolean.FALSE);
                while (c7763.hasNext()) {
                    C2376 c23762 = (C2376) ((Map.Entry) c7763.next()).getValue();
                    if (c23762.f7009) {
                        int i3 = c23762.f7008;
                        int i4 = this.f7005;
                        if (i3 < i4) {
                            c23762.f7008 = i4;
                            c23762.f7010.mo4454(this.f6999);
                        }
                    }
                    if (this.f7006) {
                        break;
                    }
                }
            }
        } while (this.f7006);
        this.f7004 = false;
    }
}
