package p156kb;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import p003a2.C0014a;
import p064ea.C0850b;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1651k0;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p258r8.C3744i;

/* JADX INFO: renamed from: kb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public static final C0014a f7837e = new C0014a(24);

    /* JADX INFO: renamed from: f */
    public static volatile boolean f7838f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "status_text_limit";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("status_text_limit", "解除状态词长度限制", "允许个人状态词超过 10 个字", "entertainment"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        C0014a c0014a = f7837e;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        if (classLoader == null || f7838f) {
            return;
        }
        synchronized (c0014a) {
            if (f7838f) {
                return;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2", classLoader);
            if (clsLoadClass == null) {
                AbstractC1184v0.m3203m("[Hchat:StatusTextLimit] 未找到状态词编辑页类");
                f7838f = true;
                return;
            }
            List<Constructor<?>> listDeclaredConstructors = KavaReflector.declaredConstructors(clsLoadClass);
            if (listDeclaredConstructors.isEmpty()) {
                AbstractC1184v0.m3203m("[Hchat:StatusTextLimit] 未找到状态词编辑页构造方法");
                f7838f = true;
                return;
            }
            Iterator<T> it = listDeclaredConstructors.iterator();
            while (it.hasNext()) {
                C3744i.f12154b.m7763b((Constructor) it.next(), new C0850b(context, 4, false));
            }
            f7838f = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "解除状态词长度限制";
    }
}
