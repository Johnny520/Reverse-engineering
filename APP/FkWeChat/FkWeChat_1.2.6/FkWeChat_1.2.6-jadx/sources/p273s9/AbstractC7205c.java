package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2706r0;
import gb.C2663f2;
import gb.EnumC2691m2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p012ab.C0212i;
import p213oa.C5695f;
import p213oa.C5697h;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6047v0;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7205c extends AbstractC7225m implements InterfaceC5988b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7205c(InterfaceC6333h interfaceC6333h, C5695f c5695f) {
        super(interfaceC6333h, c5695f);
        if (interfaceC6333h == null) {
            m28453N(1);
        }
        if (c5695f == null) {
            m28453N(2);
        }
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m28453N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return false;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo24033b(this, obj);
    }

    @Override // p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: c */
    public InterfaceC5988b1 mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28453N(3);
        }
        if (!c2663f2.m9390k()) {
            AbstractC2706r0 abstractC2706r0M9393p = mo7443b() instanceof InterfaceC5995e ? c2663f2.m9393p(getType(), EnumC2691m2.f7044w) : c2663f2.m9393p(getType(), EnumC2691m2.f7042u);
            if (abstractC2706r0M9393p == null) {
                return null;
            }
            if (abstractC2706r0M9393p != getType()) {
                return new C7228n0(mo7443b(), new C0212i(abstractC2706r0M9393p), getAnnotations());
            }
        }
        return this;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m28453N(8);
        }
        return set;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        return getType();
    }

    @Override // p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = AbstractC6040t.f18987f;
        if (abstractC6043u == null) {
            m28453N(9);
        }
        return abstractC6043u;
    }

    @Override // p229p9.InterfaceC6028p
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = InterfaceC6003g1.f18958a;
        if (interfaceC6003g1 == null) {
            m28453N(11);
        }
        return interfaceC6003g1;
    }

    @Override // p229p9.InterfaceC6036r1
    public AbstractC2706r0 getType() {
        AbstractC2706r0 type = getValue().getType();
        if (type == null) {
            m28453N(6);
        }
        return type;
    }

    @Override // p229p9.InterfaceC5983a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28453N(5);
        }
        return list;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: k0 */
    public InterfaceC5988b1 mo12679k0() {
        return null;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: m */
    public List mo12680m() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            m28453N(7);
        }
        return list;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: q0 */
    public InterfaceC5988b1 mo12682q0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7205c(InterfaceC6333h interfaceC6333h) {
        super(interfaceC6333h, C5697h.f17923i);
        if (interfaceC6333h == null) {
            m28453N(0);
        }
    }

    @Override // p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6047v0 mo12664a() {
        return this;
    }
}
