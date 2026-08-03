package ca;

import ac.AbstractC0063p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.C2399h;
import p000a.AbstractC0000a;
import p010aa.C0039g;
import p011ab.C0042b;
import p015b0.C0154t;
import p036c9.C0425c2;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p136j8.C2090a;
import p230p8.C3358j;
import p230p8.C3363o;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;

/* JADX INFO: renamed from: ca.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0518f extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C0517e0 f1595e;

    /* JADX INFO: renamed from: f */
    public C0519f0 f1596f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "message_forward";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("message_forward", "转发", "从消息、收藏和朋友圈菜单使用转发功能", "enhance"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C3363o c3363o = new C3363o(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C0518f.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 7));
        this.f1595e = new C0517e0(c3742g, c3363o, new C0042b(2, this, AbstractC0921a.m2246i(C0518f.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 5));
        this.f1596f = new C0519f0(c3742g, c3363o, new C0154t(this, 3), new C0042b(2, this, AbstractC0921a.m2246i(C0518f.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 6));
        m1533k();
        m7752i(C1085e.class, new C2399h(this, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1533k() {
        final int i9 = 0;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: ca.e

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0518f f1575h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1575h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                int i10;
                int i11;
                int i12;
                int i13;
                boolean z9;
                boolean z10;
                switch (i9) {
                    case 0:
                        C0517e0 c0517e0 = this.f1575h.f1595e;
                        boolean z11 = false;
                        if (c0517e0 != null) {
                            synchronized (c0517e0) {
                                try {
                                    List listM2775k0 = AbstractC1089i.m2775k0(c0517e0.f1579a, c0517e0.f1581c);
                                    List listM2773j0 = AbstractC1089i.m2773j0(c0517e0.f1579a, c0517e0.f1581c);
                                    if (listM2775k0.isEmpty()) {
                                        i10 = 0;
                                    } else {
                                        Iterator it = listM2775k0.iterator();
                                        i10 = 0;
                                        while (it.hasNext()) {
                                            if (c0517e0.m1521d((Method) it.next(), new C0515d0(c0517e0, 1)) && (i10 = i10 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (listM2773j0.isEmpty()) {
                                        i11 = 0;
                                    } else {
                                        Iterator it2 = listM2773j0.iterator();
                                        i11 = 0;
                                        while (it2.hasNext()) {
                                            if (c0517e0.m1521d((Method) it2.next(), new C0515d0(c0517e0, 0)) && (i11 = i11 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i10 <= 0) {
                                        c0517e0.f1581c.invoke("转发菜单创建Hook未安装", null);
                                    }
                                    if (i11 <= 0) {
                                        c0517e0.f1581c.invoke("转发菜单点击Hook未安装", null);
                                    }
                                    Method methodM396F = AbstractC0063p.m396F(c0517e0.f1579a, c0517e0.f1581c);
                                    Method methodM395E = AbstractC0063p.m395E(c0517e0.f1579a, c0517e0.f1581c);
                                    Method methodM397G = methodM395E != null ? AbstractC0063p.m397G(c0517e0.f1579a, methodM395E, c0517e0.f1581c) : null;
                                    boolean z12 = (methodM396F == null || methodM397G == null || !c0517e0.m1521d(methodM396F, new C0515d0(c0517e0, 4))) ? false : true;
                                    boolean z13 = (methodM395E == null || methodM397G == null || !c0517e0.m1521d(methodM395E, new C0425c2(c0517e0, 1, methodM397G))) ? false : true;
                                    if (!z12) {
                                        c0517e0.f1581c.invoke("多选转发朋友圈菜单创建Hook未安装", null);
                                    }
                                    if (!z13) {
                                        c0517e0.f1581c.invoke("多选转发朋友圈菜单点击Hook未安装", null);
                                    }
                                    ArrayList arrayListM5152g = C2090a.m5152g(c0517e0.f1579a, false, c0517e0.f1581c);
                                    if (arrayListM5152g.isEmpty()) {
                                        i12 = 0;
                                    } else {
                                        Iterator it3 = arrayListM5152g.iterator();
                                        i12 = 0;
                                        while (it3.hasNext()) {
                                            if (c0517e0.m1521d((Method) it3.next(), new C0515d0(c0517e0, 3)) && (i12 = i12 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    ArrayList arrayListM5151f = C2090a.m5151f(c0517e0.f1579a, false, c0517e0.f1581c);
                                    if (arrayListM5151f.isEmpty()) {
                                        i13 = 0;
                                    } else {
                                        Iterator it4 = arrayListM5151f.iterator();
                                        i13 = 0;
                                        while (it4.hasNext()) {
                                            if (c0517e0.m1521d((Method) it4.next(), new C0515d0(c0517e0, 2)) && (i13 = i13 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i12 <= 0) {
                                        c0517e0.f1581c.invoke("收藏转发菜单创建Hook未安装", null);
                                    }
                                    if (i13 <= 0) {
                                        c0517e0.f1581c.invoke("收藏转发菜单点击Hook未安装", null);
                                    }
                                    z9 = i10 > 0 && i11 > 0 && z12 && z13 && i12 > 0 && i13 > 0;
                                } finally {
                                }
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C0519f0 c0519f0 = this.f1575h.f1596f;
                        if (c0519f0 != null) {
                            z10 = C3358j.f10833a.m7111d(c0519f0.f1597a, c0519f0.f1598b, c0519f0.f1600d);
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }, "message_forward", "转发", null);
        final int i10 = 1;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: ca.e

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0518f f1575h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1575h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                int i102;
                int i11;
                int i12;
                int i13;
                boolean z9;
                boolean z10;
                switch (i10) {
                    case 0:
                        C0517e0 c0517e0 = this.f1575h.f1595e;
                        boolean z11 = false;
                        if (c0517e0 != null) {
                            synchronized (c0517e0) {
                                try {
                                    List listM2775k0 = AbstractC1089i.m2775k0(c0517e0.f1579a, c0517e0.f1581c);
                                    List listM2773j0 = AbstractC1089i.m2773j0(c0517e0.f1579a, c0517e0.f1581c);
                                    if (listM2775k0.isEmpty()) {
                                        i102 = 0;
                                    } else {
                                        Iterator it = listM2775k0.iterator();
                                        i102 = 0;
                                        while (it.hasNext()) {
                                            if (c0517e0.m1521d((Method) it.next(), new C0515d0(c0517e0, 1)) && (i102 = i102 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (listM2773j0.isEmpty()) {
                                        i11 = 0;
                                    } else {
                                        Iterator it2 = listM2773j0.iterator();
                                        i11 = 0;
                                        while (it2.hasNext()) {
                                            if (c0517e0.m1521d((Method) it2.next(), new C0515d0(c0517e0, 0)) && (i11 = i11 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i102 <= 0) {
                                        c0517e0.f1581c.invoke("转发菜单创建Hook未安装", null);
                                    }
                                    if (i11 <= 0) {
                                        c0517e0.f1581c.invoke("转发菜单点击Hook未安装", null);
                                    }
                                    Method methodM396F = AbstractC0063p.m396F(c0517e0.f1579a, c0517e0.f1581c);
                                    Method methodM395E = AbstractC0063p.m395E(c0517e0.f1579a, c0517e0.f1581c);
                                    Method methodM397G = methodM395E != null ? AbstractC0063p.m397G(c0517e0.f1579a, methodM395E, c0517e0.f1581c) : null;
                                    boolean z12 = (methodM396F == null || methodM397G == null || !c0517e0.m1521d(methodM396F, new C0515d0(c0517e0, 4))) ? false : true;
                                    boolean z13 = (methodM395E == null || methodM397G == null || !c0517e0.m1521d(methodM395E, new C0425c2(c0517e0, 1, methodM397G))) ? false : true;
                                    if (!z12) {
                                        c0517e0.f1581c.invoke("多选转发朋友圈菜单创建Hook未安装", null);
                                    }
                                    if (!z13) {
                                        c0517e0.f1581c.invoke("多选转发朋友圈菜单点击Hook未安装", null);
                                    }
                                    ArrayList arrayListM5152g = C2090a.m5152g(c0517e0.f1579a, false, c0517e0.f1581c);
                                    if (arrayListM5152g.isEmpty()) {
                                        i12 = 0;
                                    } else {
                                        Iterator it3 = arrayListM5152g.iterator();
                                        i12 = 0;
                                        while (it3.hasNext()) {
                                            if (c0517e0.m1521d((Method) it3.next(), new C0515d0(c0517e0, 3)) && (i12 = i12 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    ArrayList arrayListM5151f = C2090a.m5151f(c0517e0.f1579a, false, c0517e0.f1581c);
                                    if (arrayListM5151f.isEmpty()) {
                                        i13 = 0;
                                    } else {
                                        Iterator it4 = arrayListM5151f.iterator();
                                        i13 = 0;
                                        while (it4.hasNext()) {
                                            if (c0517e0.m1521d((Method) it4.next(), new C0515d0(c0517e0, 2)) && (i13 = i13 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i12 <= 0) {
                                        c0517e0.f1581c.invoke("收藏转发菜单创建Hook未安装", null);
                                    }
                                    if (i13 <= 0) {
                                        c0517e0.f1581c.invoke("收藏转发菜单点击Hook未安装", null);
                                    }
                                    z9 = i102 > 0 && i11 > 0 && z12 && z13 && i12 > 0 && i13 > 0;
                                } finally {
                                }
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C0519f0 c0519f0 = this.f1575h.f1596f;
                        if (c0519f0 != null) {
                            z10 = C3358j.f10833a.m7111d(c0519f0.f1597a, c0519f0.f1598b, c0519f0.f1600d);
                        }
                        return Boolean.valueOf(z10);
                }
            }
        }, "message_forward_sns", "朋友圈转发", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "转发";
    }
}
