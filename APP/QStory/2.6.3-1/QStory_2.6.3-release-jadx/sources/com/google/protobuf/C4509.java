package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4509 extends AbstractC4526 {
    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo8444(Object obj) {
        ((GeneratedMessageLite.AbstractC4138) obj).extensions.m8473();
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo8445(InterfaceC4273 interfaceC4273) {
        return interfaceC4273 instanceof GeneratedMessageLite.AbstractC4138;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4512 mo8446(Object obj) {
        return ((GeneratedMessageLite.AbstractC4138) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4512 mo8447(Object obj) {
        return ((GeneratedMessageLite.AbstractC4138) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo8448(C4529 c4529, InterfaceC4273 interfaceC4273, int i) {
        return c4529.m8507(i, interfaceC4273);
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo8449(Map.Entry entry) {
        return ((C4434) entry.getKey()).f11584;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo8450(InterfaceC4191 interfaceC4191, Object obj, C4529 c4529, C4512 c4512) {
        C4435 c4435 = (C4435) obj;
        c4512.m8472(c4435.f11587, interfaceC4191.mo8012(c4435.f11588.getClass(), c4529));
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo8451(Object obj, InterfaceC4191 interfaceC4191, Object obj2, C4529 c4529, C4512 c4512, Object obj3, AbstractC4542 abstractC4542) {
        Object objM8482;
        ArrayList arrayList;
        C4435 c4435 = (C4435) obj2;
        C4434 c4434 = c4435.f11587;
        InterfaceC4273 interfaceC4273 = c4435.f11588;
        int i = c4434.f11584;
        WireFormat$FieldType wireFormat$FieldType = c4434.f11585;
        Object objValueOf = null;
        if (c4434.f11583 && c4434.f11582) {
            switch (AbstractC4510.f11819[wireFormat$FieldType.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7977(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7986(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC4191.mo8004(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC4191.mo8006(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7997(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7973(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7998(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7982(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC4191.mo8008(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7992(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC4191.mo8005(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7995(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7991(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC4191.mo7996(arrayList);
                    obj3 = AbstractC4173.m7937(obj, i, arrayList, c4434.f11586, obj3, abstractC4542);
                    break;
                default:
                    C5043.m9164(c4434.f11585, "Type cannot be packed: ");
                    return null;
            }
            c4512.m8472(c4434, arrayList);
            return obj3;
        }
        if (wireFormat$FieldType != WireFormat$FieldType.ENUM) {
            switch (AbstractC4510.f11819[wireFormat$FieldType.ordinal()]) {
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
                    if (!c4434.f11583) {
                        Object objM84822 = c4512.m8482(c4434);
                        if (objM84822 instanceof GeneratedMessageLite) {
                            C4204 c4204 = C4204.f11363;
                            c4204.getClass();
                            InterfaceC4177 interfaceC4177M8039 = c4204.m8039(objM84822.getClass());
                            if (!((GeneratedMessageLite) objM84822).isMutable()) {
                                Object objNewInstance = interfaceC4177M8039.newInstance();
                                interfaceC4177M8039.mo7955(objNewInstance, objM84822);
                                c4512.m8472(c4434, objNewInstance);
                                objM84822 = objNewInstance;
                            }
                            interfaceC4191.mo8013(objM84822, interfaceC4177M8039, c4529);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC4191.mo7980(interfaceC4273.getClass(), c4529);
                    break;
                case 18:
                    if (!c4434.f11583) {
                        Object objM84823 = c4512.m8482(c4434);
                        if (objM84823 instanceof GeneratedMessageLite) {
                            C4204 c42042 = C4204.f11363;
                            c42042.getClass();
                            InterfaceC4177 interfaceC4177M80392 = c42042.m8039(objM84823.getClass());
                            if (!((GeneratedMessageLite) objM84823).isMutable()) {
                                Object objNewInstance2 = interfaceC4177M80392.newInstance();
                                interfaceC4177M80392.mo7955(objNewInstance2, objM84823);
                                c4512.m8472(c4434, objNewInstance2);
                                objM84823 = objNewInstance2;
                            }
                            interfaceC4191.mo7989(objM84823, interfaceC4177M80392, c4529);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC4191.mo8012(interfaceC4273.getClass(), c4529);
                    break;
            }
        } else {
            int iMo7985 = interfaceC4191.mo7985();
            if (c4434.f11586.mo7905(iMo7985) == null) {
                return AbstractC4173.m7926(obj, i, iMo7985, obj3, abstractC4542);
            }
            objValueOf = Integer.valueOf(iMo7985);
        }
        if (c4434.f11583) {
            c4512.m8469(c4434, objValueOf);
            return obj3;
        }
        int i2 = AbstractC4510.f11819[c4434.f11585.ordinal()];
        if ((i2 == 17 || i2 == 18) && (objM8482 = c4512.m8482(c4434)) != null) {
            objValueOf = ((InterfaceC4273) objM8482).toBuilder().mergeFrom((InterfaceC4273) objValueOf).buildPartial();
        }
        c4512.m8472(c4434, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo8452(ByteString byteString, Object obj, C4529 c4529, C4512 c4512) {
        C4435 c4435 = (C4435) obj;
        InterfaceC4282 interfaceC4282NewBuilderForType = c4435.f11588.newBuilderForType();
        AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
        interfaceC4282NewBuilderForType.mergeFrom(abstractC4306NewCodedInput, c4529);
        c4512.m8472(c4435.f11587, interfaceC4282NewBuilderForType.buildPartial());
        abstractC4306NewCodedInput.mo8271(0);
    }

    @Override // com.google.protobuf.AbstractC4526
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo8453(C4259 c4259, Map.Entry entry) {
        C4434 c4434 = (C4434) entry.getKey();
        boolean z = c4434.f11583;
        WireFormat$FieldType wireFormat$FieldType = c4434.f11585;
        boolean z2 = c4434.f11582;
        int i = c4434.f11584;
        if (!z) {
            switch (AbstractC4510.f11819[wireFormat$FieldType.ordinal()]) {
                case 1:
                    c4259.m8119(i, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c4259.m8116(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 3:
                    c4259.m8106(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c4259.m8096(i, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c4259.m8114(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c4259.m8111(i, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c4259.m8120(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c4259.m8121(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c4259.m8097(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c4259.m8107(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c4259.m8108(i, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c4259.m8099(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c4259.m8098(i, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c4259.m8114(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    c4259.m8122(i, (ByteString) entry.getValue());
                    break;
                case 16:
                    ((AbstractC4294) c4259.f11434).mo8216(i, (String) entry.getValue());
                    break;
                case 17:
                    c4259.m8113(i, entry.getValue(), C4204.f11363.m8039(entry.getValue().getClass()));
                    break;
                case 18:
                    c4259.m8109(i, entry.getValue(), C4204.f11363.m8039(entry.getValue().getClass()));
                    break;
            }
        }
        switch (AbstractC4510.f11819[wireFormat$FieldType.ordinal()]) {
            case 1:
                AbstractC4173.m7928(i, (List) entry.getValue(), c4259, z2);
                break;
            case 2:
                AbstractC4173.m7924(i, (List) entry.getValue(), c4259, z2);
                break;
            case 3:
                AbstractC4173.m7923(i, (List) entry.getValue(), c4259, z2);
                break;
            case 4:
                AbstractC4173.m7912(i, (List) entry.getValue(), c4259, z2);
                break;
            case 5:
                AbstractC4173.m7922(i, (List) entry.getValue(), c4259, z2);
                break;
            case 6:
                AbstractC4173.m7920(i, (List) entry.getValue(), c4259, z2);
                break;
            case 7:
                AbstractC4173.m7921(i, (List) entry.getValue(), c4259, z2);
                break;
            case 8:
                AbstractC4173.m7930(i, (List) entry.getValue(), c4259, z2);
                break;
            case 9:
                AbstractC4173.m7913(i, (List) entry.getValue(), c4259, z2);
                break;
            case 10:
                AbstractC4173.m7910(i, (List) entry.getValue(), c4259, z2);
                break;
            case 11:
                AbstractC4173.m7909(i, (List) entry.getValue(), c4259, z2);
                break;
            case 12:
                AbstractC4173.m7908(i, (List) entry.getValue(), c4259, z2);
                break;
            case 13:
                AbstractC4173.m7907(i, (List) entry.getValue(), c4259, z2);
                break;
            case 14:
                AbstractC4173.m7922(i, (List) entry.getValue(), c4259, z2);
                break;
            case 15:
                AbstractC4173.m7931(i, (List) entry.getValue(), c4259);
                break;
            case 16:
                AbstractC4173.m7906(i, (List) entry.getValue(), c4259);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC4173.m7925(i, (List) entry.getValue(), c4259, C4204.f11363.m8039(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC4173.m7911(i, (List) entry.getValue(), c4259, C4204.f11363.m8039(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
