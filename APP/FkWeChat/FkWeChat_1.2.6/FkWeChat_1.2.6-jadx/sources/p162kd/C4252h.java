package p162kd;

import android.view.View;
import cd.C1517b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p053dd.C1951c;
import p068ed.AbstractC2212a;
import p068ed.InterfaceC2214c;
import ye.C9797a;

/* JADX INFO: renamed from: kd.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C4252h extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Class f12436e;

    /* JADX INFO: renamed from: f */
    public Method f12437f;

    /* JADX INFO: renamed from: g */
    public Field f12438g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m16740o(InterfaceC5154i interfaceC5154i) {
        try {
            Integer num = (Integer) interfaceC5154i.getArgs()[1];
            num.intValue();
            InterfaceC2214c.m7976a((View) this.f12438g.get(interfaceC5154i.getArgs()[0]), new C1951c(AbstractC5161p.callMethod(interfaceC5154i.getThisObject(), "getItem", num)));
        } catch (Throwable th) {
            m7965a("处理消息项异常", th);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f12436e = C1517b.findClass().pkg("com.tencent.mm.ui.chatting.adapter").usingStrings("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[").get();
        this.f12437f = C1517b.findMethod().inClass(this.f12436e).params(null, "int").usingStrings("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[").get();
        Field field = C1517b.findField().modifiers(1).inClass(C1517b.findClass().pkg("androidx.recyclerview.widget").matcher(new Consumer() { // from class: kd.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C9797a) obj).m38114r("itemView may not be null").m38114r("[changeScrap]", "[attachedScrap]");
            }
        }).get().getName()).type("android.view.View").get();
        this.f12438g = field;
        return (this.f12437f == null || field == null) ? false : true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(this.f12437f, new InterfaceC5156k() { // from class: kd.f
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f12435a.m16740o(interfaceC5154i);
            }
        });
    }
}
