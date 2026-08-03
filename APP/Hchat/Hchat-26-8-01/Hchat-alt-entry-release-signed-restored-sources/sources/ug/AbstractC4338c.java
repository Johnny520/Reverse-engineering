package ug;

import gg.AbstractC1428x;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p162l3.C2463q;
import p352xf.EnumC5799a;
import vg.AbstractC4552a;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: ug.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4338c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5557c[] f14499a = new InterfaceC5557c[0];

    /* JADX INFO: renamed from: b */
    public static final C2463q f14500b = new C2463q("NULL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m8793a(InterfaceC5561g interfaceC5561g, Object obj, Object obj2, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        Object objInvoke;
        Object objM8993l = AbstractC4552a.m8993l(interfaceC5561g, obj2);
        try {
            C4350o c4350o = new C4350o(interfaceC5557c, interfaceC5561g);
            if (interfaceC1235p == null) {
                objInvoke = AbstractC1184v0.m3190Q(interfaceC1235p, obj, c4350o);
            } else {
                AbstractC1428x.m3838c(2, interfaceC1235p);
                objInvoke = interfaceC1235p.invoke(obj, c4350o);
            }
            AbstractC4552a.m8988g(interfaceC5561g, objM8993l);
            if (objInvoke == EnumC5799a.f23547g) {
                interfaceC5557c.getClass();
            }
            return objInvoke;
        } catch (Throwable th2) {
            AbstractC4552a.m8988g(interfaceC5561g, objM8993l);
            throw th2;
        }
    }
}
