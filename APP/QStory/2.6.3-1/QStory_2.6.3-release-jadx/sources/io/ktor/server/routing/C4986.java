package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import io.ktor.server.application.C4888;
import io.ktor.server.application.InterfaceC4887;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4986 extends C4888 implements InterfaceC5000 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C4986 f12923;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ArrayList f12924;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C4888 f12925;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final ArrayList f12926;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC3887 f12927;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4986(C4986 c4986, AbstractC3887 abstractC3887, boolean z, InterfaceC4887 interfaceC4887) {
        super(z, interfaceC4887);
        abstractC3887.getClass();
        interfaceC4887.getClass();
        this.f12923 = c4986;
        this.f12927 = abstractC3887;
        this.f12926 = new ArrayList();
        this.f12924 = new ArrayList();
    }

    public final String toString() {
        C4986 c4986 = this.f12923;
        String string = c4986 != null ? c4986.toString() : null;
        AbstractC3887 abstractC3887 = this.f12927;
        if (string == null) {
            if (abstractC3887 instanceof C4975) {
                return "/";
            }
            return "/" + abstractC3887;
        }
        if (abstractC3887 instanceof C4975) {
            return AbstractC5976.m10718(string, '/') ? string : string.concat("/");
        }
        if (AbstractC5976.m10718(string, '/')) {
            return string + abstractC3887;
        }
        return string + '/' + abstractC3887;
    }

    @Override // io.ktor.util.pipeline.AbstractC5027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo9094() {
        m9096();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4986 m9095(AbstractC3887 abstractC3887) {
        Object next;
        ArrayList arrayList = this.f12926;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(((C4986) next).f12927, abstractC3887)) {
                break;
            }
        }
        C4986 c4986 = (C4986) next;
        if (c4986 != null) {
            return c4986;
        }
        C4986 c49862 = new C4986(this, abstractC3887, this.f12685, this.f12686);
        arrayList.add(c49862);
        return c49862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m9096() {
        this.f12925 = null;
        Iterator it = this.f12926.iterator();
        while (it.hasNext()) {
            ((C4986) it.next()).m9096();
        }
    }
}
