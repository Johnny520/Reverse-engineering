package p313v9;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import p081fa.InterfaceC2378f;
import p185m8.AbstractC5114x;
import p313v9.AbstractC8864e0;

/* JADX INFO: renamed from: v9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8875m extends AbstractC8864e0 implements InterfaceC2378f {

    /* JADX INFO: renamed from: b */
    public final Type f29448b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8864e0 f29449c;

    /* JADX INFO: renamed from: d */
    public final Collection f29450d;

    /* JADX INFO: renamed from: e */
    public final boolean f29451e;

    public C8875m(Type type) {
        AbstractC8864e0 abstractC8864e0M34024a;
        type.getClass();
        this.f29448b = type;
        Type typeMo34021U = mo34021U();
        if (!(typeMo34021U instanceof GenericArrayType)) {
            if (typeMo34021U instanceof Class) {
                Class cls = (Class) typeMo34021U;
                if (cls.isArray()) {
                    AbstractC8864e0.a aVar = AbstractC8864e0.f29430a;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    abstractC8864e0M34024a = aVar.m34024a(componentType);
                }
            }
            StringBuilder sb2 = new StringBuilder("Not an array type (");
            sb2.append(mo34021U().getClass());
            Type typeMo34021U2 = mo34021U();
            sb2.append("): ");
            sb2.append(typeMo34021U2);
            throw new IllegalArgumentException(sb2.toString());
        }
        AbstractC8864e0.a aVar2 = AbstractC8864e0.f29430a;
        Type genericComponentType = ((GenericArrayType) typeMo34021U).getGenericComponentType();
        genericComponentType.getClass();
        abstractC8864e0M34024a = aVar2.m34024a(genericComponentType);
        this.f29449c = abstractC8864e0M34024a;
        this.f29450d = AbstractC5114x.m20800o();
    }

    @Override // p313v9.AbstractC8864e0
    /* JADX INFO: renamed from: U */
    public Type mo34021U() {
        return this.f29448b;
    }

    @Override // p081fa.InterfaceC2378f
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC8864e0 mo8607q() {
        return this.f29449c;
    }

    @Override // p081fa.InterfaceC2375d
    public Collection getAnnotations() {
        return this.f29450d;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return this.f29451e;
    }
}
