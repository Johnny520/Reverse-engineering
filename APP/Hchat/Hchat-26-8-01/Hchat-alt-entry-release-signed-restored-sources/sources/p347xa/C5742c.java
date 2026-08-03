package p347xa;

import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p036c9.C0425c2;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p274s8.C3944d;

/* JADX INFO: renamed from: xa.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5742c extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C5752m f23389e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "quick_contact_edit";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("quick_contact_edit", "快捷设置备注和标签", "长按私聊会话或好友朋友圈头像快速修改备注和标签", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        boolean zM10446e;
        Method methodFindMethodRecursive;
        c3742g.getClass();
        C5752m c5752m = new C5752m(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C5742c.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 28));
        this.f23389e = c5752m;
        synchronized (c5752m) {
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.sns.ui.SnsHeader", c3742g.f12145c);
            zM10446e = (clsLoadClass == null || (methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "setAvatarOnClickListener", View.OnClickListener.class)) == null) ? false : c5752m.m10446e(methodFindMethodRecursive, new C5750k(c5752m, 2));
        }
        if (!(zM10446e)) {
            m7750e("好友朋友圈头像长按 Hook 未安装", null);
        }
        m10440k();
        m7752i(C1085e.class, new C3465a(this, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m10440k() {
        final int i9 = 0;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: xa.b

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C5742c f23388h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f23388h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                boolean z9;
                int i10;
                int i11;
                boolean z10;
                switch (i9) {
                    case 0:
                        C5752m c5752m = this.f23388h.f23389e;
                        boolean z11 = false;
                        if (c5752m != null) {
                            synchronized (c5752m) {
                                try {
                                    Method methodM10439d = C5740a.f23386a.m10439d(c5752m.f23413a, c5752m.f23414b);
                                    z9 = methodM10439d != null && c5752m.m10446e(methodM10439d, new C5750k(c5752m, 0));
                                    if (!z9) {
                                        c5752m.f23414b.invoke("快捷设置备注和标签菜单创建 Hook 未安装", null);
                                    }
                                } finally {
                                }
                                break;
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C5752m c5752m2 = this.f23388h.f23389e;
                        boolean z12 = false;
                        if (c5752m2 != null) {
                            synchronized (c5752m2) {
                                try {
                                    C5754o c5754oM10454e = C5753n.f23422a.m10454e(c5752m2.f23413a, c5752m2.f23414b);
                                    List list = c5754oM10454e.f23423a;
                                    if (list.isEmpty()) {
                                        i10 = 0;
                                    } else {
                                        Iterator it = list.iterator();
                                        i10 = 0;
                                        while (it.hasNext()) {
                                            if (c5752m2.m10446e((Method) it.next(), new C5750k(c5752m2, 3)) && (i10 = i10 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    ArrayList<Method> arrayList = c5754oM10454e.f23424b;
                                    if (arrayList.isEmpty()) {
                                        i11 = 0;
                                    } else {
                                        i11 = 0;
                                        for (Method method : arrayList) {
                                            if (c5752m2.m10446e(method, new C0425c2(c5752m2, 15, method)) && (i11 = i11 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i10 <= 0) {
                                        c5752m2.f23414b.invoke("朋友圈头像菜单创建 Hook 未安装", null);
                                    }
                                    if (i11 <= 0) {
                                        c5752m2.f23414b.invoke("朋友圈头像菜单点击 Hook 未安装", null);
                                    }
                                    z10 = i10 > 0 && i11 > 0;
                                } finally {
                                }
                            }
                            if (z10) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "quick_contact_edit", "快捷设置备注和标签", null);
        final int i10 = 1;
        C3740e.m7759f(12, new InterfaceC1220a(this) { // from class: xa.b

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C5742c f23388h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f23388h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                boolean z9;
                int i102;
                int i11;
                boolean z10;
                switch (i10) {
                    case 0:
                        C5752m c5752m = this.f23388h.f23389e;
                        boolean z11 = false;
                        if (c5752m != null) {
                            synchronized (c5752m) {
                                try {
                                    Method methodM10439d = C5740a.f23386a.m10439d(c5752m.f23413a, c5752m.f23414b);
                                    z9 = methodM10439d != null && c5752m.m10446e(methodM10439d, new C5750k(c5752m, 0));
                                    if (!z9) {
                                        c5752m.f23414b.invoke("快捷设置备注和标签菜单创建 Hook 未安装", null);
                                    }
                                } finally {
                                }
                                break;
                            }
                            if (z9) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C5752m c5752m2 = this.f23388h.f23389e;
                        boolean z12 = false;
                        if (c5752m2 != null) {
                            synchronized (c5752m2) {
                                try {
                                    C5754o c5754oM10454e = C5753n.f23422a.m10454e(c5752m2.f23413a, c5752m2.f23414b);
                                    List list = c5754oM10454e.f23423a;
                                    if (list.isEmpty()) {
                                        i102 = 0;
                                    } else {
                                        Iterator it = list.iterator();
                                        i102 = 0;
                                        while (it.hasNext()) {
                                            if (c5752m2.m10446e((Method) it.next(), new C5750k(c5752m2, 3)) && (i102 = i102 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    ArrayList<Method> arrayList = c5754oM10454e.f23424b;
                                    if (arrayList.isEmpty()) {
                                        i11 = 0;
                                    } else {
                                        i11 = 0;
                                        for (Method method : arrayList) {
                                            if (c5752m2.m10446e(method, new C0425c2(c5752m2, 15, method)) && (i11 = i11 + 1) < 0) {
                                                AbstractC0000a.m30P0();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i102 <= 0) {
                                        c5752m2.f23414b.invoke("朋友圈头像菜单创建 Hook 未安装", null);
                                    }
                                    if (i11 <= 0) {
                                        c5752m2.f23414b.invoke("朋友圈头像菜单点击 Hook 未安装", null);
                                    }
                                    z10 = i102 > 0 && i11 > 0;
                                } finally {
                                }
                            }
                            if (z10) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "quick_contact_edit:sns_avatar_menu", "快捷设置备注和标签朋友圈头像菜单", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "快捷设置备注和标签";
    }
}
