package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3678 extends AbstractC3693 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f11470 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f11471;

    static {
        try {
            f11471 = AbstractC3725.f11543.m8032(GeneratedMessage.ExtendableMessage.class.getDeclaredField("extensions"));
        } catch (Throwable th) {
            C8796.m14449("Unable to lookup extension field offset", th);
        }
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7898(Object obj) {
        mo7901(obj).m7927();
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7899(InterfaceC3440 interfaceC3440) {
        return interfaceC3440 instanceof GeneratedMessage.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C3679 mo7900(Object obj) {
        C3679 c3679Mo7901 = mo7901(obj);
        if (!c3679Mo7901.f11474) {
            return c3679Mo7901;
        }
        C3679 c3679Clone = c3679Mo7901.clone();
        AbstractC3725.m8007(f11471, obj, c3679Clone);
        return c3679Clone;
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3679 mo7901(Object obj) {
        return (C3679) AbstractC3725.f11543.m8031(obj, f11471);
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7902(C3696 c3696, InterfaceC3440 interfaceC3440, int i) {
        return (C3577) ((C3692) c3696).f11488.get(new C3576(((InterfaceC3452) interfaceC3440).getDescriptorForType(), i));
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7903(Map.Entry entry) {
        return ((C3656) entry.getKey()).f11350.getNumber();
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7904(InterfaceC3358 interfaceC3358, Object obj, C3696 c3696, C3679 c3679) {
        C3577 c3577 = (C3577) obj;
        C3696 c36962 = C3696.f11496;
        c3679.m7926(c3577.f11201, new C3382(c3577.f11200, c3696, interfaceC3358.mo7441()));
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo7905(Object obj, InterfaceC3358 interfaceC3358, Object obj2, C3696 c3696, C3679 c3679, Object obj3, AbstractC3709 abstractC3709) {
        Object objM7936;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3577 c3577 = (C3577) obj2;
        C3656 c3656 = c3577.f11201;
        InterfaceC3452 interfaceC3452 = c3577.f11200;
        int number = c3656.f11350.getNumber();
        Object objValueOf = null;
        if (!c3656.mo7819() || !c3656.isPacked()) {
            if (c3656.mo7820() != WireFormat$FieldType.ENUM) {
                switch (AbstractC3694.f11492[c3656.mo7820().ordinal()]) {
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
                        objValueOf = interfaceC3358.mo7434(interfaceC3452.getClass(), c3696);
                        break;
                    case 18:
                        objValueOf = interfaceC3358.mo7466(interfaceC3452.getClass(), c3696);
                        break;
                }
            } else {
                int iMo7439 = interfaceC3358.mo7439();
                objValueOf = c3656.m7878().mo7359(iMo7439);
                if (objValueOf == null) {
                    return AbstractC3340.m7380(obj, number, iMo7439, obj3, abstractC3709);
                }
            }
            if (c3656.mo7819()) {
                c3679.m7923(c3656, objValueOf);
                return obj3;
            }
            int i = AbstractC3694.f11492[c3656.mo7820().ordinal()];
            if ((i == 17 || i == 18) && (objM7936 = c3679.m7936(c3656)) != null) {
                objValueOf = ((InterfaceC3440) objM7936).toBuilder().mergeFrom((InterfaceC3440) objValueOf).buildPartial();
            }
            c3679.m7926(c3656, objValueOf);
            return obj3;
        }
        switch (AbstractC3694.f11492[c3656.mo7820().ordinal()]) {
            case 1:
                arrayList = new ArrayList();
                interfaceC3358.mo7431(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 2:
                arrayList = new ArrayList();
                interfaceC3358.mo7440(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 3:
                arrayList = new ArrayList();
                interfaceC3358.mo7458(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 4:
                arrayList = new ArrayList();
                interfaceC3358.mo7460(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 5:
                arrayList = new ArrayList();
                interfaceC3358.mo7451(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 6:
                arrayList = new ArrayList();
                interfaceC3358.mo7427(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 7:
                arrayList = new ArrayList();
                interfaceC3358.mo7452(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 8:
                arrayList = new ArrayList();
                interfaceC3358.mo7436(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 9:
                arrayList = new ArrayList();
                interfaceC3358.mo7462(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 10:
                arrayList = new ArrayList();
                interfaceC3358.mo7446(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 11:
                arrayList = new ArrayList();
                interfaceC3358.mo7459(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 12:
                arrayList = new ArrayList();
                interfaceC3358.mo7449(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 13:
                arrayList = new ArrayList();
                interfaceC3358.mo7445(arrayList);
                arrayList2 = arrayList;
                c3679.m7926(c3656, arrayList2);
                return obj3;
            case 14:
                ArrayList arrayList3 = new ArrayList();
                interfaceC3358.mo7450(arrayList3);
                arrayList2 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    C3663 c3663Mo7359 = c3656.m7878().mo7359(iIntValue);
                    if (c3663Mo7359 != null) {
                        arrayList2.add(c3663Mo7359);
                    } else {
                        obj3 = AbstractC3340.m7380(obj, number, iIntValue, obj3, abstractC3709);
                    }
                }
                c3679.m7926(c3656, arrayList2);
                return obj3;
            default:
                C4210.m8615(c3656.mo7820(), "Type cannot be packed: ");
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7906(ByteString byteString, Object obj, C3696 c3696, C3679 c3679) {
        C3577 c3577 = (C3577) obj;
        InterfaceC3452 interfaceC3452 = c3577.f11200;
        interfaceC3452.newBuilderForType().buildPartial();
        C3696 c36962 = C3696.f11496;
        c3679.m7926(c3577.f11201, new C3382(interfaceC3452, c3696, byteString));
    }

    @Override // com.google.protobuf.AbstractC3693
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7907(C3426 c3426, Map.Entry entry) {
        AbstractC3461 abstractC3461 = (AbstractC3461) c3426.f11084;
        C3656 c3656 = (C3656) entry.getKey();
        boolean zMo7819 = c3656.mo7819();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
        if (!zMo7819) {
            switch (AbstractC3694.f11492[c3656.mo7820().ordinal()]) {
                case 1:
                    c3426.m7573(descriptorProtos$FieldDescriptorProto.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c3426.m7570(((Float) entry.getValue()).floatValue(), descriptorProtos$FieldDescriptorProto.getNumber());
                    break;
                case 3:
                    c3426.m7560(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c3426.m7550(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c3426.m7568(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c3426.m7565(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c3426.m7574(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c3426.m7575(descriptorProtos$FieldDescriptorProto.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c3426.m7551(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c3426.m7561(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c3426.m7562(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c3426.m7553(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c3426.m7552(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c3426.m7568(descriptorProtos$FieldDescriptorProto.getNumber(), ((C3663) entry.getValue()).f11381.getNumber());
                    break;
                case 15:
                    c3426.m7576(descriptorProtos$FieldDescriptorProto.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    abstractC3461.mo7670(descriptorProtos$FieldDescriptorProto.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    int number = descriptorProtos$FieldDescriptorProto.getNumber();
                    InterfaceC3440 interfaceC3440 = (InterfaceC3440) entry.getValue();
                    abstractC3461.mo7668(number, 3);
                    interfaceC3440.writeTo(abstractC3461);
                    abstractC3461.mo7668(number, 4);
                    break;
                case 18:
                    abstractC3461.mo7662(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC3440) entry.getValue());
                    break;
            }
        }
        int i = 0;
        switch (AbstractC3694.f11492[c3656.mo7820().ordinal()]) {
            case 1:
                AbstractC3340.m7382(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 2:
                AbstractC3340.m7378(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 3:
                AbstractC3340.m7377(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 4:
                AbstractC3340.m7366(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 5:
                AbstractC3340.m7376(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 6:
                AbstractC3340.m7374(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 7:
                AbstractC3340.m7375(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 8:
                AbstractC3340.m7384(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 9:
                AbstractC3340.m7367(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 10:
                AbstractC3340.m7364(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 11:
                AbstractC3340.m7363(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 12:
                AbstractC3340.m7362(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 13:
                AbstractC3340.m7361(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426, c3656.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C3663) it.next()).f11381.getNumber()));
                }
                AbstractC3340.m7376(descriptorProtos$FieldDescriptorProto.getNumber(), arrayList, c3426, c3656.isPacked());
                break;
            case 15:
                AbstractC3340.m7385(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426);
                break;
            case 16:
                AbstractC3340.m7360(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3426);
                break;
            case 17:
                int number2 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list2 = (List) entry.getValue();
                Class cls = AbstractC3340.f10962;
                if (list2 != null && !list2.isEmpty()) {
                    while (i < list2.size()) {
                        InterfaceC3440 interfaceC34402 = (InterfaceC3440) list2.get(i);
                        abstractC3461.mo7668(number2, 3);
                        interfaceC34402.writeTo(abstractC3461);
                        abstractC3461.mo7668(number2, 4);
                        i++;
                    }
                    break;
                }
                break;
            case 18:
                int number3 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list3 = (List) entry.getValue();
                Class cls2 = AbstractC3340.f10962;
                if (list3 != null && !list3.isEmpty()) {
                    while (i < list3.size()) {
                        abstractC3461.mo7662(number3, (InterfaceC3440) list3.get(i));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
