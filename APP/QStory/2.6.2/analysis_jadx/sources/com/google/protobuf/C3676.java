package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3676 extends AbstractC3693 {
    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo7898(Object obj) {
        ((GeneratedMessageLite.AbstractC3305) obj).extensions.m7927();
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7899(InterfaceC3440 interfaceC3440) {
        return interfaceC3440 instanceof GeneratedMessageLite.AbstractC3305;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3679 mo7900(Object obj) {
        return ((GeneratedMessageLite.AbstractC3305) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3679 mo7901(Object obj) {
        return ((GeneratedMessageLite.AbstractC3305) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo7902(C3696 c3696, InterfaceC3440 interfaceC3440, int i) {
        return c3696.m7961(i, interfaceC3440);
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo7903(Map.Entry entry) {
        return ((C3601) entry.getKey()).f11234;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7904(InterfaceC3358 interfaceC3358, Object obj, C3696 c3696, C3679 c3679) {
        C3602 c3602 = (C3602) obj;
        c3679.m7926(c3602.f11237, interfaceC3358.mo7466(c3602.f11238.getClass(), c3696));
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo7905(Object obj, InterfaceC3358 interfaceC3358, Object obj2, C3696 c3696, C3679 c3679, Object obj3, AbstractC3709 abstractC3709) {
        Object objM7936;
        ArrayList arrayList;
        C3602 c3602 = (C3602) obj2;
        C3601 c3601 = c3602.f11237;
        InterfaceC3440 interfaceC3440 = c3602.f11238;
        int i = c3601.f11234;
        WireFormat$FieldType wireFormat$FieldType = c3601.f11235;
        Object objValueOf = null;
        if (c3601.f11233 && c3601.f11232) {
            switch (AbstractC3677.f11469[wireFormat$FieldType.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7431(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7440(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7458(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7460(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7451(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7427(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7452(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7436(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7462(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7446(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7459(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7449(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7445(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC3358.mo7450(arrayList);
                    obj3 = AbstractC3340.m7391(obj, i, arrayList, c3601.f11236, obj3, abstractC3709);
                    break;
                default:
                    C4210.m8615(c3601.f11235, "Type cannot be packed: ");
                    return null;
            }
            c3679.m7926(c3601, arrayList);
            return obj3;
        }
        if (wireFormat$FieldType != WireFormat$FieldType.ENUM) {
            switch (AbstractC3677.f11469[wireFormat$FieldType.ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC3358.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC3358.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC3358.mo7430());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC3358.mo7448());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC3358.mo7439());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC3358.mo7447());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC3358.mo7464());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC3358.mo7465());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC3358.mo7461());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC3358.mo7429());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC3358.mo7456());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC3358.mo7453());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC3358.mo7437());
                    break;
                case 14:
                    C5919.m11250("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = interfaceC3358.mo7441();
                    break;
                case 16:
                    objValueOf = interfaceC3358.mo7435();
                    break;
                case 17:
                    if (!c3601.f11233) {
                        Object objM79362 = c3679.m7936(c3601);
                        if (objM79362 instanceof GeneratedMessageLite) {
                            C3371 c3371 = C3371.f11013;
                            c3371.getClass();
                            InterfaceC3344 interfaceC3344M7493 = c3371.m7493(objM79362.getClass());
                            if (!((GeneratedMessageLite) objM79362).isMutable()) {
                                Object objNewInstance = interfaceC3344M7493.newInstance();
                                interfaceC3344M7493.mo7409(objNewInstance, objM79362);
                                c3679.m7926(c3601, objNewInstance);
                                objM79362 = objNewInstance;
                            }
                            interfaceC3358.mo7467(objM79362, interfaceC3344M7493, c3696);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC3358.mo7434(interfaceC3440.getClass(), c3696);
                    break;
                case 18:
                    if (!c3601.f11233) {
                        Object objM79363 = c3679.m7936(c3601);
                        if (objM79363 instanceof GeneratedMessageLite) {
                            C3371 c33712 = C3371.f11013;
                            c33712.getClass();
                            InterfaceC3344 interfaceC3344M74932 = c33712.m7493(objM79363.getClass());
                            if (!((GeneratedMessageLite) objM79363).isMutable()) {
                                Object objNewInstance2 = interfaceC3344M74932.newInstance();
                                interfaceC3344M74932.mo7409(objNewInstance2, objM79363);
                                c3679.m7926(c3601, objNewInstance2);
                                objM79363 = objNewInstance2;
                            }
                            interfaceC3358.mo7443(objM79363, interfaceC3344M74932, c3696);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC3358.mo7466(interfaceC3440.getClass(), c3696);
                    break;
            }
        } else {
            int iMo7439 = interfaceC3358.mo7439();
            if (c3601.f11236.mo7359(iMo7439) == null) {
                return AbstractC3340.m7380(obj, i, iMo7439, obj3, abstractC3709);
            }
            objValueOf = Integer.valueOf(iMo7439);
        }
        if (c3601.f11233) {
            c3679.m7923(c3601, objValueOf);
            return obj3;
        }
        int i2 = AbstractC3677.f11469[c3601.f11235.ordinal()];
        if ((i2 == 17 || i2 == 18) && (objM7936 = c3679.m7936(c3601)) != null) {
            objValueOf = ((InterfaceC3440) objM7936).toBuilder().mergeFrom((InterfaceC3440) objValueOf).buildPartial();
        }
        c3679.m7926(c3601, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo7906(ByteString byteString, Object obj, C3696 c3696, C3679 c3679) {
        C3602 c3602 = (C3602) obj;
        InterfaceC3449 interfaceC3449NewBuilderForType = c3602.f11238.newBuilderForType();
        AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
        interfaceC3449NewBuilderForType.mergeFrom(abstractC3473NewCodedInput, c3696);
        c3679.m7926(c3602.f11237, interfaceC3449NewBuilderForType.buildPartial());
        abstractC3473NewCodedInput.mo7725(0);
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo7907(C3426 c3426, Map.Entry entry) {
        C3601 c3601 = (C3601) entry.getKey();
        boolean z = c3601.f11233;
        WireFormat$FieldType wireFormat$FieldType = c3601.f11235;
        boolean z2 = c3601.f11232;
        int i = c3601.f11234;
        if (!z) {
            switch (AbstractC3677.f11469[wireFormat$FieldType.ordinal()]) {
                case 1:
                    c3426.m7573(i, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c3426.m7570(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 3:
                    c3426.m7560(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c3426.m7550(i, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c3426.m7568(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c3426.m7565(i, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c3426.m7574(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c3426.m7575(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c3426.m7551(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c3426.m7561(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c3426.m7562(i, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c3426.m7553(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c3426.m7552(i, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c3426.m7568(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    c3426.m7576(i, (ByteString) entry.getValue());
                    break;
                case 16:
                    ((AbstractC3461) c3426.f11084).mo7670(i, (String) entry.getValue());
                    break;
                case 17:
                    c3426.m7567(i, entry.getValue(), C3371.f11013.m7493(entry.getValue().getClass()));
                    break;
                case 18:
                    c3426.m7563(i, entry.getValue(), C3371.f11013.m7493(entry.getValue().getClass()));
                    break;
            }
        }
        switch (AbstractC3677.f11469[wireFormat$FieldType.ordinal()]) {
            case 1:
                AbstractC3340.m7382(i, (List) entry.getValue(), c3426, z2);
                break;
            case 2:
                AbstractC3340.m7378(i, (List) entry.getValue(), c3426, z2);
                break;
            case 3:
                AbstractC3340.m7377(i, (List) entry.getValue(), c3426, z2);
                break;
            case 4:
                AbstractC3340.m7366(i, (List) entry.getValue(), c3426, z2);
                break;
            case 5:
                AbstractC3340.m7376(i, (List) entry.getValue(), c3426, z2);
                break;
            case 6:
                AbstractC3340.m7374(i, (List) entry.getValue(), c3426, z2);
                break;
            case 7:
                AbstractC3340.m7375(i, (List) entry.getValue(), c3426, z2);
                break;
            case 8:
                AbstractC3340.m7384(i, (List) entry.getValue(), c3426, z2);
                break;
            case 9:
                AbstractC3340.m7367(i, (List) entry.getValue(), c3426, z2);
                break;
            case 10:
                AbstractC3340.m7364(i, (List) entry.getValue(), c3426, z2);
                break;
            case 11:
                AbstractC3340.m7363(i, (List) entry.getValue(), c3426, z2);
                break;
            case 12:
                AbstractC3340.m7362(i, (List) entry.getValue(), c3426, z2);
                break;
            case 13:
                AbstractC3340.m7361(i, (List) entry.getValue(), c3426, z2);
                break;
            case 14:
                AbstractC3340.m7376(i, (List) entry.getValue(), c3426, z2);
                break;
            case 15:
                AbstractC3340.m7385(i, (List) entry.getValue(), c3426);
                break;
            case 16:
                AbstractC3340.m7360(i, (List) entry.getValue(), c3426);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC3340.m7379(i, (List) entry.getValue(), c3426, C3371.f11013.m7493(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC3340.m7365(i, (List) entry.getValue(), c3426, C3371.f11013.m7493(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
