package lb;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import ke.C2399h;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p108ha.C1651k0;
import p126ia.C2026t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: lb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2549k extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C2547i f8280e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "swipe_quote";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("swipe_quote", "滑动手势", "左滑引用，右滑或长按菜单复读消息", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f8280e = new C2547i(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C2549k.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 10));
        m6000k();
        m7752i(C1085e.class, new C2399h(this, 22));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m6000k() {
        final int i9 = 0;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: lb.j

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2549k f8279h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8279h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                boolean z9;
                boolean z10;
                switch (i9) {
                    case 0:
                        C2547i c2547i = this.f8279h.f8280e;
                        boolean z11 = false;
                        if (c2547i != null) {
                            synchronized (c2547i) {
                                z9 = c2547i.m5992n() && c2547i.m5994p() && c2547i.m5993o() && c2547i.m5995q();
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C2547i c2547i2 = this.f8279h.f8280e;
                        boolean z12 = false;
                        if (c2547i2 != null) {
                            synchronized (c2547i2) {
                                try {
                                    List listM2775k0 = AbstractC1089i.m2775k0(c2547i2.f8252a, c2547i2.f8253b);
                                    List listM2773j0 = AbstractC1089i.m2773j0(c2547i2.f8252a, c2547i2.f8253b);
                                    Iterator it = listM2775k0.iterator();
                                    int i10 = 0;
                                    while (it.hasNext()) {
                                        if (c2547i2.m5991m((Method) it.next(), true)) {
                                            i10++;
                                        }
                                    }
                                    Iterator it2 = listM2773j0.iterator();
                                    int i11 = 0;
                                    while (it2.hasNext()) {
                                        if (c2547i2.m5991m((Method) it2.next(), false)) {
                                            i11++;
                                        }
                                    }
                                    if (i10 <= 0 || i11 <= 0) {
                                        c2547i2.f8253b.invoke("长按复读菜单Hook未安装", null);
                                    }
                                    z10 = i10 > 0 && i11 > 0;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            if (z10) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "swipe_quote", "滑动手势", null);
        final int i10 = 1;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: lb.j

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2549k f8279h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8279h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                boolean z9;
                boolean z10;
                switch (i10) {
                    case 0:
                        C2547i c2547i = this.f8279h.f8280e;
                        boolean z11 = false;
                        if (c2547i != null) {
                            synchronized (c2547i) {
                                z9 = c2547i.m5992n() && c2547i.m5994p() && c2547i.m5993o() && c2547i.m5995q();
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C2547i c2547i2 = this.f8279h.f8280e;
                        boolean z12 = false;
                        if (c2547i2 != null) {
                            synchronized (c2547i2) {
                                try {
                                    List listM2775k0 = AbstractC1089i.m2775k0(c2547i2.f8252a, c2547i2.f8253b);
                                    List listM2773j0 = AbstractC1089i.m2773j0(c2547i2.f8252a, c2547i2.f8253b);
                                    Iterator it = listM2775k0.iterator();
                                    int i102 = 0;
                                    while (it.hasNext()) {
                                        if (c2547i2.m5991m((Method) it.next(), true)) {
                                            i102++;
                                        }
                                    }
                                    Iterator it2 = listM2773j0.iterator();
                                    int i11 = 0;
                                    while (it2.hasNext()) {
                                        if (c2547i2.m5991m((Method) it2.next(), false)) {
                                            i11++;
                                        }
                                    }
                                    if (i102 <= 0 || i11 <= 0) {
                                        c2547i2.f8253b.invoke("长按复读菜单Hook未安装", null);
                                    }
                                    z10 = i102 > 0 && i11 > 0;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            if (z10) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "swipe_quote:repeat_menu", "长按菜单复读", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "滑动手势";
    }
}
