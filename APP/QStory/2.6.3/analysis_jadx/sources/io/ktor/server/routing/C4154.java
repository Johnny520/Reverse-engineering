package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import io.ktor.server.application.C4056;
import io.ktor.server.application.InterfaceC4055;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4154 extends C4056 implements InterfaceC4168 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4154 f12578;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ArrayList f12579;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C4056 f12580;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f12581;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC3055 f12582;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4154(C4154 c4154, AbstractC3055 abstractC3055, boolean z, InterfaceC4055 interfaceC4055) {
        super(z, interfaceC4055);
        abstractC3055.getClass();
        interfaceC4055.getClass();
        this.f12578 = c4154;
        this.f12582 = abstractC3055;
        this.f12581 = new ArrayList();
        this.f12579 = new ArrayList();
    }

    public final String toString() {
        C4154 c4154 = this.f12578;
        String string = c4154 != null ? c4154.toString() : null;
        AbstractC3055 abstractC3055 = this.f12582;
        if (string == null) {
            if (abstractC3055 instanceof C4143) {
                return "/";
            }
            return "/" + abstractC3055;
        }
        if (abstractC3055 instanceof C4143) {
            return AbstractC5144.m10159(string, '/') ? string : string.concat("/");
        }
        if (AbstractC5144.m10159(string, '/')) {
            return string + abstractC3055;
        }
        return string + '/' + abstractC3055;
    }

    @Override // io.ktor.util.pipeline.AbstractC4195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8535() {
        m8537();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4154 m8536(AbstractC3055 abstractC3055) {
        Object next;
        ArrayList arrayList = this.f12581;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4395.m8907(((C4154) next).f12582, abstractC3055)) {
                break;
            }
        }
        C4154 c4154 = (C4154) next;
        if (c4154 != null) {
            return c4154;
        }
        C4154 c41542 = new C4154(this, abstractC3055, this.f12340, this.f12341);
        arrayList.add(c41542);
        return c41542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m8537() {
        this.f12580 = null;
        Iterator it = this.f12581.iterator();
        while (it.hasNext()) {
            ((C4154) it.next()).m8537();
        }
    }
}
