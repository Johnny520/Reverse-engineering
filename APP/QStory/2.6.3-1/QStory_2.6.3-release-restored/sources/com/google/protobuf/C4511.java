package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4511 extends AbstractC4526 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f11820 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f11821;

    static {
        try {
            f11821 = AbstractC4558.f11893.m8578(GeneratedMessage.ExtendableMessage.class.getDeclaredField("extensions"));
        } catch (Throwable th) {
            C9620.m15032("Unable to lookup extension field offset", th);
        }
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo8444(Object obj) {
        mo8447(obj).m8473();
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8445(InterfaceC4273 interfaceC4273) {
        return interfaceC4273 instanceof GeneratedMessage.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4512 mo8446(Object obj) {
        C4512 c4512Mo8447 = mo8447(obj);
        if (!c4512Mo8447.f11824) {
            return c4512Mo8447;
        }
        C4512 c4512Clone = c4512Mo8447.clone();
        AbstractC4558.m8553(f11821, obj, c4512Clone);
        return c4512Clone;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4512 mo8447(Object obj) {
        return (C4512) AbstractC4558.f11893.m8577(obj, f11821);
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8448(C4529 c4529, InterfaceC4273 interfaceC4273, int i) {
        return (C4410) ((C4525) c4529).f11838.get(new C4409(((InterfaceC4285) interfaceC4273).getDescriptorForType(), i));
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo8449(Map.Entry entry) {
        return ((C4489) entry.getKey()).f11700.getNumber();
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo8450(InterfaceC4191 interfaceC4191, Object obj, C4529 c4529, C4512 c4512) {
        C4410 c4410 = (C4410) obj;
        C4529 c45292 = C4529.f11846;
        c4512.m8472(c4410.f11551, new C4215(c4410.f11550, c4529, interfaceC4191.mo7987()));
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo8451(Object obj, InterfaceC4191 interfaceC4191, Object obj2, C4529 c4529, C4512 c4512, Object obj3, AbstractC4542 abstractC4542) {
        Object objM8482;
        ArrayList arrayList;
        ArrayList arrayList2;
        C4410 c4410 = (C4410) obj2;
        C4489 c4489 = c4410.f11551;
        InterfaceC4285 interfaceC4285 = c4410.f11550;
        int number = c4489.f11700.getNumber();
        Object objValueOf = null;
        if (!c4489.mo8365() || !c4489.isPacked()) {
            if (c4489.mo8366() != WireFormat$FieldType.ENUM) {
                switch (AbstractC4527.f11842[c4489.mo8366().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(interfaceC4191.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(interfaceC4191.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(interfaceC4191.mo7976());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(interfaceC4191.mo7994());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(interfaceC4191.mo7985());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(interfaceC4191.mo7993());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(interfaceC4191.mo8010());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(interfaceC4191.mo8011());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(interfaceC4191.mo8007());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(interfaceC4191.mo7975());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(interfaceC4191.mo8002());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(interfaceC4191.mo7999());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(interfaceC4191.mo7983());
                        break;
                    case 14:
                        C6755.m11870("Shouldn't reach here.");
                        return null;
                    case 15:
                        objValueOf = interfaceC4191.mo7987();
                        break;
                    case 16:
                        objValueOf = interfaceC4191.mo7981();
                        break;
                    case 17:
                        objValueOf = interfaceC4191.mo7980(interfaceC4285.getClass(), c4529);
                        break;
                    case 18:
                        objValueOf = interfaceC4191.mo8012(interfaceC4285.getClass(), c4529);
                        break;
                }
            } else {
                int iMo7985 = interfaceC4191.mo7985();
                objValueOf = c4489.m8424().mo7905(iMo7985);
                if (objValueOf == null) {
                    return AbstractC4173.m7926(obj, number, iMo7985, obj3, abstractC4542);
                }
            }
            if (c4489.mo8365()) {
                c4512.m8469(c4489, objValueOf);
                return obj3;
            }
            int i = AbstractC4527.f11842[c4489.mo8366().ordinal()];
            if ((i == 17 || i == 18) && (objM8482 = c4512.m8482(c4489)) != null) {
                objValueOf = ((InterfaceC4273) objM8482).toBuilder().mergeFrom((InterfaceC4273) objValueOf).buildPartial();
            }
            c4512.m8472(c4489, objValueOf);
            return obj3;
        }
        switch (AbstractC4527.f11842[c4489.mo8366().ordinal()]) {
            case 1:
                arrayList = new ArrayList();
                interfaceC4191.mo7977(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 2:
                arrayList = new ArrayList();
                interfaceC4191.mo7986(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 3:
                arrayList = new ArrayList();
                interfaceC4191.mo8004(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 4:
                arrayList = new ArrayList();
                interfaceC4191.mo8006(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 5:
                arrayList = new ArrayList();
                interfaceC4191.mo7997(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 6:
                arrayList = new ArrayList();
                interfaceC4191.mo7973(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 7:
                arrayList = new ArrayList();
                interfaceC4191.mo7998(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 8:
                arrayList = new ArrayList();
                interfaceC4191.mo7982(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 9:
                arrayList = new ArrayList();
                interfaceC4191.mo8008(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 10:
                arrayList = new ArrayList();
                interfaceC4191.mo7992(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 11:
                arrayList = new ArrayList();
                interfaceC4191.mo8005(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 12:
                arrayList = new ArrayList();
                interfaceC4191.mo7995(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 13:
                arrayList = new ArrayList();
                interfaceC4191.mo7991(arrayList);
                arrayList2 = arrayList;
                c4512.m8472(c4489, arrayList2);
                return obj3;
            case 14:
                ArrayList arrayList3 = new ArrayList();
                interfaceC4191.mo7996(arrayList3);
                arrayList2 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    C4496 c4496Mo7905 = c4489.m8424().mo7905(iIntValue);
                    if (c4496Mo7905 != null) {
                        arrayList2.add(c4496Mo7905);
                    } else {
                        obj3 = AbstractC4173.m7926(obj, number, iIntValue, obj3, abstractC4542);
                    }
                }
                c4512.m8472(c4489, arrayList2);
                return obj3;
            default:
                C5043.m9164(c4489.mo8366(), "Type cannot be packed: ");
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo8452(ByteString byteString, Object obj, C4529 c4529, C4512 c4512) {
        C4410 c4410 = (C4410) obj;
        InterfaceC4285 interfaceC4285 = c4410.f11550;
        interfaceC4285.newBuilderForType().buildPartial();
        C4529 c45292 = C4529.f11846;
        c4512.m8472(c4410.f11551, new C4215(interfaceC4285, c4529, byteString));
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo8453(C4259 c4259, Map.Entry entry) {
        AbstractC4294 abstractC4294 = (AbstractC4294) c4259.f11434;
        C4489 c4489 = (C4489) entry.getKey();
        boolean zMo8365 = c4489.mo8365();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        if (!zMo8365) {
            switch (AbstractC4527.f11842[c4489.mo8366().ordinal()]) {
                case 1:
                    c4259.m8119(descriptorProtos$FieldDescriptorProto.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c4259.m8116(((Float) entry.getValue()).floatValue(), descriptorProtos$FieldDescriptorProto.getNumber());
                    break;
                case 3:
                    c4259.m8106(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c4259.m8096(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c4259.m8114(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c4259.m8111(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c4259.m8120(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c4259.m8121(descriptorProtos$FieldDescriptorProto.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c4259.m8097(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c4259.m8107(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c4259.m8108(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c4259.m8099(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c4259.m8098(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c4259.m8114(descriptorProtos$FieldDescriptorProto.getNumber(), ((C4496) entry.getValue()).f11731.getNumber());
                    break;
                case 15:
                    c4259.m8122(descriptorProtos$FieldDescriptorProto.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    abstractC4294.mo8216(descriptorProtos$FieldDescriptorProto.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    int number = descriptorProtos$FieldDescriptorProto.getNumber();
                    InterfaceC4273 interfaceC4273 = (InterfaceC4273) entry.getValue();
                    abstractC4294.mo8214(number, 3);
                    interfaceC4273.writeTo(abstractC4294);
                    abstractC4294.mo8214(number, 4);
                    break;
                case 18:
                    abstractC4294.mo8208(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC4273) entry.getValue());
                    break;
            }
        }
        int i = 0;
        switch (AbstractC4527.f11842[c4489.mo8366().ordinal()]) {
            case 1:
                AbstractC4173.m7928(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 2:
                AbstractC4173.m7924(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 3:
                AbstractC4173.m7923(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 4:
                AbstractC4173.m7912(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 5:
                AbstractC4173.m7922(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 6:
                AbstractC4173.m7920(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 7:
                AbstractC4173.m7921(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 8:
                AbstractC4173.m7930(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 9:
                AbstractC4173.m7913(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 10:
                AbstractC4173.m7910(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 11:
                AbstractC4173.m7909(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 12:
                AbstractC4173.m7908(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 13:
                AbstractC4173.m7907(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259, c4489.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C4496) it.next()).f11731.getNumber()));
                }
                AbstractC4173.m7922(descriptorProtos$FieldDescriptorProto.getNumber(), arrayList, c4259, c4489.isPacked());
                break;
            case 15:
                AbstractC4173.m7931(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259);
                break;
            case 16:
                AbstractC4173.m7906(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c4259);
                break;
            case 17:
                int number2 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list2 = (List) entry.getValue();
                Class cls = AbstractC4173.f11312;
                if (list2 != null && !list2.isEmpty()) {
                    while (i < list2.size()) {
                        InterfaceC4273 interfaceC42732 = (InterfaceC4273) list2.get(i);
                        abstractC4294.mo8214(number2, 3);
                        interfaceC42732.writeTo(abstractC4294);
                        abstractC4294.mo8214(number2, 4);
                        i++;
                    }
                    break;
                }
                break;
            case 18:
                int number3 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list3 = (List) entry.getValue();
                Class cls2 = AbstractC4173.f11312;
                if (list3 != null && !list3.isEmpty()) {
                    while (i < list3.size()) {
                        abstractC4294.mo8208(number3, (InterfaceC4273) list3.get(i));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
