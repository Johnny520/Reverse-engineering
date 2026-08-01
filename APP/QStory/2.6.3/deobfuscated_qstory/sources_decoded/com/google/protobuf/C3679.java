package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3679 extends AbstractC3694 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f11475 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f11476;

    static {
        try {
            f11476 = AbstractC3726.f11548.m8019(GeneratedMessage.ExtendableMessage.class.getDeclaredField("extensions"));
        } catch (Throwable th) {
            C8791.m14473("Unable to lookup extension field offset", th);
        }
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7885(Object obj) {
        mo7888(obj).m7914();
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7886(InterfaceC3441 interfaceC3441) {
        return interfaceC3441 instanceof GeneratedMessage.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C3680 mo7887(Object obj) {
        C3680 c3680Mo7888 = mo7888(obj);
        if (!c3680Mo7888.f11479) {
            return c3680Mo7888;
        }
        C3680 c3680Clone = c3680Mo7888.clone();
        AbstractC3726.m7994(f11476, obj, c3680Clone);
        return c3680Clone;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3680 mo7888(Object obj) {
        return (C3680) AbstractC3726.f11548.m8018(obj, f11476);
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7889(C3697 c3697, InterfaceC3441 interfaceC3441, int i) {
        return (C3578) ((C3693) c3697).f11493.get(new C3577(((InterfaceC3453) interfaceC3441).getDescriptorForType(), i));
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo7890(Map.Entry entry) {
        return ((C3657) entry.getKey()).f11355.getNumber();
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7891(InterfaceC3359 interfaceC3359, Object obj, C3697 c3697, C3680 c3680) {
        C3578 c3578 = (C3578) obj;
        C3697 c36972 = C3697.f11501;
        c3680.m7913(c3578.f11206, new C3383(c3578.f11205, c3697, interfaceC3359.mo7428()));
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo7892(Object obj, InterfaceC3359 interfaceC3359, Object obj2, C3697 c3697, C3680 c3680, Object obj3, AbstractC3710 abstractC3710) {
        Object objM7923;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3578 c3578 = (C3578) obj2;
        C3657 c3657 = c3578.f11206;
        InterfaceC3453 interfaceC3453 = c3578.f11205;
        int number = c3657.f11355.getNumber();
        Object objValueOf = null;
        if (!c3657.mo7806() || !c3657.isPacked()) {
            if (c3657.mo7807() != WireFormat$FieldType.ENUM) {
                switch (AbstractC3695.f11497[c3657.mo7807().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(interfaceC3359.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(interfaceC3359.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(interfaceC3359.mo7417());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(interfaceC3359.mo7435());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(interfaceC3359.mo7426());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(interfaceC3359.mo7434());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(interfaceC3359.mo7451());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(interfaceC3359.mo7452());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(interfaceC3359.mo7448());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(interfaceC3359.mo7416());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(interfaceC3359.mo7443());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(interfaceC3359.mo7440());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(interfaceC3359.mo7424());
                        break;
                    case 14:
                        C5925.m11311("Shouldn't reach here.");
                        return null;
                    case 15:
                        objValueOf = interfaceC3359.mo7428();
                        break;
                    case 16:
                        objValueOf = interfaceC3359.mo7422();
                        break;
                    case 17:
                        objValueOf = interfaceC3359.mo7421(interfaceC3453.getClass(), c3697);
                        break;
                    case 18:
                        objValueOf = interfaceC3359.mo7453(interfaceC3453.getClass(), c3697);
                        break;
                }
            } else {
                int iMo7426 = interfaceC3359.mo7426();
                objValueOf = c3657.m7865().mo7346(iMo7426);
                if (objValueOf == null) {
                    return AbstractC3341.m7367(obj, number, iMo7426, obj3, abstractC3710);
                }
            }
            if (c3657.mo7806()) {
                c3680.m7910(c3657, objValueOf);
                return obj3;
            }
            int i = AbstractC3695.f11497[c3657.mo7807().ordinal()];
            if ((i == 17 || i == 18) && (objM7923 = c3680.m7923(c3657)) != null) {
                objValueOf = ((InterfaceC3441) objM7923).toBuilder().mergeFrom((InterfaceC3441) objValueOf).buildPartial();
            }
            c3680.m7913(c3657, objValueOf);
            return obj3;
        }
        switch (AbstractC3695.f11497[c3657.mo7807().ordinal()]) {
            case 1:
                arrayList = new ArrayList();
                interfaceC3359.mo7418(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 2:
                arrayList = new ArrayList();
                interfaceC3359.mo7427(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 3:
                arrayList = new ArrayList();
                interfaceC3359.mo7445(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 4:
                arrayList = new ArrayList();
                interfaceC3359.mo7447(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 5:
                arrayList = new ArrayList();
                interfaceC3359.mo7438(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 6:
                arrayList = new ArrayList();
                interfaceC3359.mo7414(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 7:
                arrayList = new ArrayList();
                interfaceC3359.mo7439(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 8:
                arrayList = new ArrayList();
                interfaceC3359.mo7423(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 9:
                arrayList = new ArrayList();
                interfaceC3359.mo7449(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 10:
                arrayList = new ArrayList();
                interfaceC3359.mo7433(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 11:
                arrayList = new ArrayList();
                interfaceC3359.mo7446(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 12:
                arrayList = new ArrayList();
                interfaceC3359.mo7436(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 13:
                arrayList = new ArrayList();
                interfaceC3359.mo7432(arrayList);
                arrayList2 = arrayList;
                c3680.m7913(c3657, arrayList2);
                return obj3;
            case 14:
                ArrayList arrayList3 = new ArrayList();
                interfaceC3359.mo7437(arrayList3);
                arrayList2 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    C3664 c3664Mo7346 = c3657.m7865().mo7346(iIntValue);
                    if (c3664Mo7346 != null) {
                        arrayList2.add(c3664Mo7346);
                    } else {
                        obj3 = AbstractC3341.m7367(obj, number, iIntValue, obj3, abstractC3710);
                    }
                }
                c3680.m7913(c3657, arrayList2);
                return obj3;
            default:
                C4211.m8605(c3657.mo7807(), "Type cannot be packed: ");
                return null;
        }
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo7893(ByteString byteString, Object obj, C3697 c3697, C3680 c3680) {
        C3578 c3578 = (C3578) obj;
        InterfaceC3453 interfaceC3453 = c3578.f11205;
        interfaceC3453.newBuilderForType().buildPartial();
        C3697 c36972 = C3697.f11501;
        c3680.m7913(c3578.f11206, new C3383(interfaceC3453, c3697, byteString));
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7894(C3427 c3427, Map.Entry entry) {
        AbstractC3462 abstractC3462 = (AbstractC3462) c3427.f11089;
        C3657 c3657 = (C3657) entry.getKey();
        boolean zMo7806 = c3657.mo7806();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
        if (!zMo7806) {
            switch (AbstractC3695.f11497[c3657.mo7807().ordinal()]) {
                case 1:
                    c3427.m7560(descriptorProtos$FieldDescriptorProto.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c3427.m7557(((Float) entry.getValue()).floatValue(), descriptorProtos$FieldDescriptorProto.getNumber());
                    break;
                case 3:
                    c3427.m7547(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c3427.m7537(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c3427.m7555(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c3427.m7552(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c3427.m7561(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c3427.m7562(descriptorProtos$FieldDescriptorProto.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c3427.m7538(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c3427.m7548(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c3427.m7549(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c3427.m7540(descriptorProtos$FieldDescriptorProto.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c3427.m7539(descriptorProtos$FieldDescriptorProto.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c3427.m7555(descriptorProtos$FieldDescriptorProto.getNumber(), ((C3664) entry.getValue()).f11386.getNumber());
                    break;
                case 15:
                    c3427.m7563(descriptorProtos$FieldDescriptorProto.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    abstractC3462.mo7657(descriptorProtos$FieldDescriptorProto.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    int number = descriptorProtos$FieldDescriptorProto.getNumber();
                    InterfaceC3441 interfaceC3441 = (InterfaceC3441) entry.getValue();
                    abstractC3462.mo7655(number, 3);
                    interfaceC3441.writeTo(abstractC3462);
                    abstractC3462.mo7655(number, 4);
                    break;
                case 18:
                    abstractC3462.mo7649(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC3441) entry.getValue());
                    break;
            }
        }
        int i = 0;
        switch (AbstractC3695.f11497[c3657.mo7807().ordinal()]) {
            case 1:
                AbstractC3341.m7369(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 2:
                AbstractC3341.m7365(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 3:
                AbstractC3341.m7364(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 4:
                AbstractC3341.m7353(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 5:
                AbstractC3341.m7363(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 6:
                AbstractC3341.m7361(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 7:
                AbstractC3341.m7362(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 8:
                AbstractC3341.m7371(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 9:
                AbstractC3341.m7354(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 10:
                AbstractC3341.m7351(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 11:
                AbstractC3341.m7350(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 12:
                AbstractC3341.m7349(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 13:
                AbstractC3341.m7348(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427, c3657.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((C3664) it.next()).f11386.getNumber()));
                }
                AbstractC3341.m7363(descriptorProtos$FieldDescriptorProto.getNumber(), arrayList, c3427, c3657.isPacked());
                break;
            case 15:
                AbstractC3341.m7372(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427);
                break;
            case 16:
                AbstractC3341.m7347(descriptorProtos$FieldDescriptorProto.getNumber(), (List) entry.getValue(), c3427);
                break;
            case 17:
                int number2 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list2 = (List) entry.getValue();
                Class cls = AbstractC3341.f10967;
                if (list2 != null && !list2.isEmpty()) {
                    while (i < list2.size()) {
                        InterfaceC3441 interfaceC34412 = (InterfaceC3441) list2.get(i);
                        abstractC3462.mo7655(number2, 3);
                        interfaceC34412.writeTo(abstractC3462);
                        abstractC3462.mo7655(number2, 4);
                        i++;
                    }
                    break;
                }
                break;
            case 18:
                int number3 = descriptorProtos$FieldDescriptorProto.getNumber();
                List list3 = (List) entry.getValue();
                Class cls2 = AbstractC3341.f10967;
                if (list3 != null && !list3.isEmpty()) {
                    while (i < list3.size()) {
                        abstractC3462.mo7649(number3, (InterfaceC3441) list3.get(i));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
