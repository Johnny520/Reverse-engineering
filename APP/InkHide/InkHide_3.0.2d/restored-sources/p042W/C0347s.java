package p042W;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import p037T.AbstractC0274y;
import p037T.C0260k;
import p037T.C0261l;
import p039U.InterfaceC0290b;
import p049a0.C0367a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0347s extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f787a;

    /* JADX INFO: renamed from: b */
    public final Object f788b;

    /* JADX INFO: renamed from: c */
    public final Object f789c;

    /* JADX INFO: renamed from: d */
    public final Object f790d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0347s(C0261l c0261l, AbstractC0274y abstractC0274y, Type type) {
        this.f787a = 0;
        this.f788b = c0261l;
        this.f789c = abstractC0274y;
        this.f790d = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        switch (this.f787a) {
            case 0:
                return ((AbstractC0274y) this.f789c).mo476a(c0493b);
            default:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v = c0493b.mo584v();
                Enum r02 = (Enum) ((HashMap) this.f788b).get(strMo584v);
                return r02 == null ? (Enum) ((HashMap) this.f789c).get(strMo584v) : r02;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        switch (this.f787a) {
            case 0:
                Type type = (Type) this.f790d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                AbstractC0274y abstractC0274y = (AbstractC0274y) this.f789c;
                if (type2 != type) {
                    AbstractC0274y abstractC0274yM481d = ((C0261l) this.f788b).m481d(new C0367a(type2));
                    if (abstractC0274yM481d instanceof AbstractC0343o) {
                        AbstractC0274y abstractC0274y2 = abstractC0274y;
                        while (abstractC0274y2 instanceof C0260k) {
                            AbstractC0274y abstractC0274y3 = ((C0260k) abstractC0274y2).f611a;
                            if (abstractC0274y3 == null) {
                                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                            }
                            if (abstractC0274y3 != abstractC0274y2) {
                                abstractC0274y2 = abstractC0274y3;
                            } else if (abstractC0274y2 instanceof AbstractC0343o) {
                            }
                        }
                        if (abstractC0274y2 instanceof AbstractC0343o) {
                        }
                    } else {
                        abstractC0274y = abstractC0274yM481d;
                    }
                }
                abstractC0274y.mo477b(c0494c, obj);
                return;
            default:
                Enum r6 = (Enum) obj;
                c0494c.mo596p(r6 == null ? null : (String) ((HashMap) this.f790d).get(r6));
                return;
        }
    }

    public C0347s(Class cls) {
        this.f787a = 1;
        this.f788b = new HashMap();
        this.f789c = new HashMap();
        this.f790d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new C0351w(cls))) {
                Enum r4 = (Enum) field.get(null);
                String strName = r4.name();
                String string = r4.toString();
                InterfaceC0290b interfaceC0290b = (InterfaceC0290b) field.getAnnotation(InterfaceC0290b.class);
                if (interfaceC0290b != null) {
                    strName = interfaceC0290b.value();
                    for (String str : interfaceC0290b.alternate()) {
                        ((HashMap) this.f788b).put(str, r4);
                    }
                }
                ((HashMap) this.f788b).put(strName, r4);
                ((HashMap) this.f789c).put(string, r4);
                ((HashMap) this.f790d).put(r4, strName);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
