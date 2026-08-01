package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.application.C4055;
import io.ktor.server.application.InterfaceC4054;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4153 extends C4055 implements InterfaceC4167 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4153 f12574;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ArrayList f12575;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C4055 f12576;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f12577;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC3932 f12578;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4153(C4153 c4153, AbstractC3932 abstractC3932, boolean z, InterfaceC4054 interfaceC4054) {
        super(z, interfaceC4054);
        abstractC3932.getClass();
        interfaceC4054.getClass();
        this.f12574 = c4153;
        this.f12578 = abstractC3932;
        this.f12577 = new ArrayList();
        this.f12575 = new ArrayList();
    }

    public final String toString() {
        C4153 c4153 = this.f12574;
        String string = c4153 != null ? c4153.toString() : null;
        AbstractC3932 abstractC3932 = this.f12578;
        if (string == null) {
            if (abstractC3932 instanceof C4142) {
                return "/";
            }
            return "/" + abstractC3932;
        }
        if (abstractC3932 instanceof C4142) {
            return AbstractC5143.m10155(string, '/') ? string : string.concat("/");
        }
        if (AbstractC5143.m10155(string, '/')) {
            return string + abstractC3932;
        }
        return string + '/' + abstractC3932;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8545() {
        m8546();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m8546() {
        this.f12576 = null;
        Iterator it = this.f12577.iterator();
        while (it.hasNext()) {
            ((C4153) it.next()).m8546();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4153 m8547(AbstractC3932 abstractC3932) {
        Object next;
        ArrayList arrayList = this.f12577;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4394.m8917(((C4153) next).f12578, abstractC3932)) {
                break;
            }
        }
        C4153 c4153 = (C4153) next;
        if (c4153 != null) {
            return c4153;
        }
        C4153 c41532 = new C4153(this, abstractC3932, this.f12336, this.f12337);
        arrayList.add(c41532);
        return c41532;
    }
}
