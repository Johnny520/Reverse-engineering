package p042W;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import p022L.AbstractC0174d;
import p037T.C0265p;
import p041V.InterfaceC0323p;
import p045Y.AbstractC0357c;
import p051b0.C0493b;

/* JADX INFO: renamed from: W.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0344p extends AbstractC0343o {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0323p f778b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0344p(InterfaceC0323p interfaceC0323p, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f778b = interfaceC0323p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: c */
    public final Object mo602c() {
        return this.f778b.mo143n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: e */
    public final void mo604e(Object obj, C0493b c0493b, C0342n c0342n) throws IllegalAccessException {
        Object objMo476a = c0342n.f772h.mo476a(c0493b);
        if (objMo476a == null && c0342n.f775k) {
            return;
        }
        Field field = c0342n.f766b;
        if (c0342n.f776l) {
            throw new C0265p(AbstractC0174d.m352h("Cannot set value of 'static final' ", AbstractC0357c.m615d(field, false)));
        }
        field.set(obj, objMo476a);
    }

    @Override // p042W.AbstractC0343o
    /* JADX INFO: renamed from: d */
    public final Object mo603d(Object obj) {
        return obj;
    }
}
