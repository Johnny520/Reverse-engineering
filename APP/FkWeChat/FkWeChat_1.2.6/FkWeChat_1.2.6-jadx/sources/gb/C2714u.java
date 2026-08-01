package gb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p082fb.InterfaceC2412n;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6012j1;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: gb.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2714u extends AbstractC2644b {

    /* JADX INFO: renamed from: d */
    public final InterfaceC5995e f7104d;

    /* JADX INFO: renamed from: e */
    public final List f7105e;

    /* JADX INFO: renamed from: f */
    public final Collection f7106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2714u(InterfaceC5995e interfaceC5995e, List list, Collection collection, InterfaceC2412n interfaceC2412n) {
        super(interfaceC2412n);
        if (interfaceC5995e == null) {
            m9620I(0);
        }
        if (list == null) {
            m9620I(1);
        }
        if (collection == null) {
            m9620I(2);
        }
        if (interfaceC2412n == null) {
            m9620I(3);
        }
        this.f7104d = interfaceC5995e;
        this.f7105e = Collections.unmodifiableList(new ArrayList(list));
        this.f7106f = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: I */
    private static /* synthetic */ void m9620I(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // gb.AbstractC2717v, gb.InterfaceC2716u1
    /* JADX INFO: renamed from: J */
    public InterfaceC5995e mo5602u() {
        InterfaceC5995e interfaceC5995e = this.f7104d;
        if (interfaceC5995e == null) {
            m9620I(5);
        }
        return interfaceC5995e;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: d */
    public List mo5600d() {
        List list = this.f7105e;
        if (list == null) {
            m9620I(4);
        }
        return list;
    }

    @Override // gb.AbstractC2699p
    /* JADX INFO: renamed from: p */
    public Collection mo5601p() {
        Collection collection = this.f7106f;
        if (collection == null) {
            m9620I(6);
        }
        return collection;
    }

    public String toString() {
        return AbstractC7259i.m28760m(this.f7104d).m23005a();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: v */
    public boolean mo5603v() {
        return true;
    }

    @Override // gb.AbstractC2699p
    /* JADX INFO: renamed from: w */
    public InterfaceC6012j1 mo5604w() {
        InterfaceC6012j1.a aVar = InterfaceC6012j1.a.f18963a;
        if (aVar == null) {
            m9620I(7);
        }
        return aVar;
    }
}
