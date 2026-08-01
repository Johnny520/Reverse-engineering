package p313v9;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2381i;
import p081fa.InterfaceC2382j;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5692c;
import p313v9.AbstractC8864e0;

/* JADX INFO: renamed from: v9.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8881s extends AbstractC8864e0 implements InterfaceC2382j {

    /* JADX INFO: renamed from: b */
    public final Type f29462b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2381i f29463c;

    public C8881s(Type type) {
        InterfaceC2381i c8879q;
        type.getClass();
        this.f29462b = type;
        Type typeMo34021U = mo34021U();
        if (typeMo34021U instanceof Class) {
            c8879q = new C8879q((Class) typeMo34021U);
        } else if (typeMo34021U instanceof TypeVariable) {
            c8879q = new C8866f0((TypeVariable) typeMo34021U);
        } else {
            if (!(typeMo34021U instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeMo34021U.getClass() + "): " + typeMo34021U);
            }
            Type rawType = ((ParameterizedType) typeMo34021U).getRawType();
            rawType.getClass();
            c8879q = new C8879q((Class) rawType);
        }
        this.f29463c = c8879q;
    }

    @Override // p081fa.InterfaceC2382j
    /* JADX INFO: renamed from: A */
    public boolean mo8625A() {
        Type typeMo34021U = mo34021U();
        if (typeMo34021U instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeMo34021U).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p081fa.InterfaceC2382j
    /* JADX INFO: renamed from: B */
    public String mo8626B() {
        throw new UnsupportedOperationException("Type not found: " + mo34021U());
    }

    @Override // p081fa.InterfaceC2382j
    /* JADX INFO: renamed from: I */
    public List mo8627I() {
        List listM34032h = AbstractC8865f.m34032h(mo34021U());
        AbstractC8864e0.a aVar = AbstractC8864e0.f29430a;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM34032h, 10));
        Iterator it = listM34032h.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.m34024a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p313v9.AbstractC8864e0
    /* JADX INFO: renamed from: U */
    public Type mo34021U() {
        return this.f29462b;
    }

    @Override // p313v9.AbstractC8864e0, p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public InterfaceC2369a mo8603b(C5692c c5692c) {
        c5692c.getClass();
        return null;
    }

    @Override // p081fa.InterfaceC2382j
    /* JADX INFO: renamed from: e */
    public InterfaceC2381i mo8628e() {
        return this.f29463c;
    }

    @Override // p081fa.InterfaceC2375d
    public Collection getAnnotations() {
        return AbstractC5114x.m20800o();
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    @Override // p081fa.InterfaceC2382j
    /* JADX INFO: renamed from: s */
    public String mo8629s() {
        return mo34021U().toString();
    }
}
