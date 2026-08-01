package p098g9;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: g9.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2564r implements TypeVariable, Type {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2561o f6828q;

    public C2564r(InterfaceC2561o interfaceC2561o) {
        interfaceC2561o.getClass();
        this.f6828q = interfaceC2561o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return AbstractC1061t.m3842c(getName(), typeVariable.getName()) && AbstractC1061t.m3842c(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f6828q.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2567u.m9095c((InterfaceC2560n) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.f6828q + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f6828q.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
