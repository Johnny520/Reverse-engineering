package p273s9;

import gb.AbstractC2706r0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6057z0;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7224l0 extends AbstractC7220j0 implements InterfaceC6057z0 {

    /* JADX INFO: renamed from: C */
    public AbstractC2706r0 f23995C;

    /* JADX INFO: renamed from: D */
    public final InterfaceC6057z0 f23996D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7224l0(InterfaceC6055y0 interfaceC6055y0, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, boolean z11, boolean z12, InterfaceC5986b.a aVar, InterfaceC6057z0 interfaceC6057z0, InterfaceC6003g1 interfaceC6003g1) {
        super(enumC5996e0, abstractC6043u, interfaceC6055y0, interfaceC6333h, C5695f.m23029m("<get-" + interfaceC6055y0.getName() + ">"), z10, z11, z12, aVar, interfaceC6003g1);
        if (interfaceC6055y0 == null) {
            m28554N(0);
        }
        if (interfaceC6333h == null) {
            m28554N(1);
        }
        if (enumC5996e0 == null) {
            m28554N(2);
        }
        if (abstractC6043u == null) {
            m28554N(3);
        }
        if (aVar == null) {
            m28554N(4);
        }
        if (interfaceC6003g1 == null) {
            m28554N(5);
        }
        this.f23996D = interfaceC6057z0 != null ? interfaceC6057z0 : this;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28554N(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo24038i(this, obj);
    }

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6057z0 mo12664a() {
        InterfaceC6057z0 interfaceC6057z0 = this.f23996D;
        if (interfaceC6057z0 == null) {
            m28554N(8);
        }
        return interfaceC6057z0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m28556V0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            abstractC2706r0 = mo24109F0().getType();
        }
        this.f23995C = abstractC2706r0;
    }

    @Override // p229p9.InterfaceC6056z, p229p9.InterfaceC5986b, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        Collection collectionM28507Q0 = super.m28507Q0(true);
        if (collectionM28507Q0 == null) {
            m28554N(6);
        }
        return collectionM28507Q0;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        return this.f23995C;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: m */
    public List mo12680m() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28554N(7);
        }
        return list;
    }
}
