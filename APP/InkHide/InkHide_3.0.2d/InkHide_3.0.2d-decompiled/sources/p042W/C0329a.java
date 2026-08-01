package p042W;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p041V.AbstractC0311d;
import p046Z.C0358a;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0329a implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f732a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [W.x.<clinit>():void] */
    public /* synthetic */ C0329a(int i2) {
        this.f732a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        switch (this.f732a) {
            case 0:
                Type type = c0367a.f861b;
                boolean z2 = type instanceof GenericArrayType;
                if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C0330b(c0261l, c0261l.m481d(new C0367a(genericComponentType)), AbstractC0311d.m545g(genericComponentType));
            case 1:
                if (c0367a.f860a == Date.class) {
                    return new C0332d();
                }
                return null;
            case 2:
                Class superclass = c0367a.f860a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new C0347s(superclass);
            case 3:
                if (c0367a.f860a == java.sql.Date.class) {
                    return new C0358a(0);
                }
                return null;
            case 4:
                if (c0367a.f860a == Time.class) {
                    return new C0358a(1);
                }
                return null;
            default:
                if (c0367a.f860a != Timestamp.class) {
                    return null;
                }
                c0261l.getClass();
                return new C0358a(c0261l.m481d(new C0367a(Date.class)));
        }
    }
}
