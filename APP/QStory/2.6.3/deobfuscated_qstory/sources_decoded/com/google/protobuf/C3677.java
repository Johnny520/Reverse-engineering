package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3677 extends AbstractC3694 {
    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo7885(Object obj) {
        ((GeneratedMessageLite.AbstractC3306) obj).extensions.m7914();
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7886(InterfaceC3441 interfaceC3441) {
        return interfaceC3441 instanceof GeneratedMessageLite.AbstractC3306;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3680 mo7887(Object obj) {
        return ((GeneratedMessageLite.AbstractC3306) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3680 mo7888(Object obj) {
        return ((GeneratedMessageLite.AbstractC3306) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo7889(C3697 c3697, InterfaceC3441 interfaceC3441, int i) {
        return c3697.m7948(i, interfaceC3441);
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo7890(Map.Entry entry) {
        return ((C3602) entry.getKey()).f11239;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo7891(InterfaceC3359 interfaceC3359, Object obj, C3697 c3697, C3680 c3680) {
        C3603 c3603 = (C3603) obj;
        c3680.m7913(c3603.f11242, interfaceC3359.mo7453(c3603.f11243.getClass(), c3697));
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo7892(Object obj, InterfaceC3359 interfaceC3359, Object obj2, C3697 c3697, C3680 c3680, Object obj3, AbstractC3710 abstractC3710) {
        Object objM7923;
        ArrayList arrayList;
        C3603 c3603 = (C3603) obj2;
        C3602 c3602 = c3603.f11242;
        InterfaceC3441 interfaceC3441 = c3603.f11243;
        int i = c3602.f11239;
        WireFormat$FieldType wireFormat$FieldType = c3602.f11240;
        Object objValueOf = null;
        if (c3602.f11238 && c3602.f11237) {
            switch (AbstractC3678.f11474[wireFormat$FieldType.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7418(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7427(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7445(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7447(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7438(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7414(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7439(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7423(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7449(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7433(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7446(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7436(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7432(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC3359.mo7437(arrayList);
                    obj3 = AbstractC3341.m7378(obj, i, arrayList, c3602.f11241, obj3, abstractC3710);
                    break;
                default:
                    C4211.m8605(c3602.f11240, "Type cannot be packed: ");
                    return null;
            }
            c3680.m7913(c3602, arrayList);
            return obj3;
        }
        if (wireFormat$FieldType != WireFormat$FieldType.ENUM) {
            switch (AbstractC3678.f11474[wireFormat$FieldType.ordinal()]) {
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
                    if (!c3602.f11238) {
                        Object objM79232 = c3680.m7923(c3602);
                        if (objM79232 instanceof GeneratedMessageLite) {
                            C3372 c3372 = C3372.f11018;
                            c3372.getClass();
                            InterfaceC3345 interfaceC3345M7480 = c3372.m7480(objM79232.getClass());
                            if (!((GeneratedMessageLite) objM79232).isMutable()) {
                                Object objNewInstance = interfaceC3345M7480.newInstance();
                                interfaceC3345M7480.mo7396(objNewInstance, objM79232);
                                c3680.m7913(c3602, objNewInstance);
                                objM79232 = objNewInstance;
                            }
                            interfaceC3359.mo7454(objM79232, interfaceC3345M7480, c3697);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC3359.mo7421(interfaceC3441.getClass(), c3697);
                    break;
                case 18:
                    if (!c3602.f11238) {
                        Object objM79233 = c3680.m7923(c3602);
                        if (objM79233 instanceof GeneratedMessageLite) {
                            C3372 c33722 = C3372.f11018;
                            c33722.getClass();
                            InterfaceC3345 interfaceC3345M74802 = c33722.m7480(objM79233.getClass());
                            if (!((GeneratedMessageLite) objM79233).isMutable()) {
                                Object objNewInstance2 = interfaceC3345M74802.newInstance();
                                interfaceC3345M74802.mo7396(objNewInstance2, objM79233);
                                c3680.m7913(c3602, objNewInstance2);
                                objM79233 = objNewInstance2;
                            }
                            interfaceC3359.mo7430(objM79233, interfaceC3345M74802, c3697);
                            return obj3;
                        }
                    }
                    objValueOf = interfaceC3359.mo7453(interfaceC3441.getClass(), c3697);
                    break;
            }
        } else {
            int iMo7426 = interfaceC3359.mo7426();
            if (c3602.f11241.mo7346(iMo7426) == null) {
                return AbstractC3341.m7367(obj, i, iMo7426, obj3, abstractC3710);
            }
            objValueOf = Integer.valueOf(iMo7426);
        }
        if (c3602.f11238) {
            c3680.m7910(c3602, objValueOf);
            return obj3;
        }
        int i2 = AbstractC3678.f11474[c3602.f11240.ordinal()];
        if ((i2 == 17 || i2 == 18) && (objM7923 = c3680.m7923(c3602)) != null) {
            objValueOf = ((InterfaceC3441) objM7923).toBuilder().mergeFrom((InterfaceC3441) objValueOf).buildPartial();
        }
        c3680.m7913(c3602, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo7893(ByteString byteString, Object obj, C3697 c3697, C3680 c3680) {
        C3603 c3603 = (C3603) obj;
        InterfaceC3450 interfaceC3450NewBuilderForType = c3603.f11243.newBuilderForType();
        AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
        interfaceC3450NewBuilderForType.mergeFrom(abstractC3474NewCodedInput, c3697);
        c3680.m7913(c3603.f11242, interfaceC3450NewBuilderForType.buildPartial());
        abstractC3474NewCodedInput.mo7712(0);
    }

    @Override // com.google.protobuf.AbstractC3694
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void mo7894(C3427 c3427, Map.Entry entry) {
        C3602 c3602 = (C3602) entry.getKey();
        boolean z = c3602.f11238;
        WireFormat$FieldType wireFormat$FieldType = c3602.f11240;
        boolean z2 = c3602.f11237;
        int i = c3602.f11239;
        if (!z) {
            switch (AbstractC3678.f11474[wireFormat$FieldType.ordinal()]) {
                case 1:
                    c3427.m7560(i, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    c3427.m7557(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 3:
                    c3427.m7547(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    c3427.m7537(i, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    c3427.m7555(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    c3427.m7552(i, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    c3427.m7561(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    c3427.m7562(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    c3427.m7538(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    c3427.m7548(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    c3427.m7549(i, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    c3427.m7540(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    c3427.m7539(i, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    c3427.m7555(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    c3427.m7563(i, (ByteString) entry.getValue());
                    break;
                case 16:
                    ((AbstractC3462) c3427.f11089).mo7657(i, (String) entry.getValue());
                    break;
                case 17:
                    c3427.m7554(i, entry.getValue(), C3372.f11018.m7480(entry.getValue().getClass()));
                    break;
                case 18:
                    c3427.m7550(i, entry.getValue(), C3372.f11018.m7480(entry.getValue().getClass()));
                    break;
            }
        }
        switch (AbstractC3678.f11474[wireFormat$FieldType.ordinal()]) {
            case 1:
                AbstractC3341.m7369(i, (List) entry.getValue(), c3427, z2);
                break;
            case 2:
                AbstractC3341.m7365(i, (List) entry.getValue(), c3427, z2);
                break;
            case 3:
                AbstractC3341.m7364(i, (List) entry.getValue(), c3427, z2);
                break;
            case 4:
                AbstractC3341.m7353(i, (List) entry.getValue(), c3427, z2);
                break;
            case 5:
                AbstractC3341.m7363(i, (List) entry.getValue(), c3427, z2);
                break;
            case 6:
                AbstractC3341.m7361(i, (List) entry.getValue(), c3427, z2);
                break;
            case 7:
                AbstractC3341.m7362(i, (List) entry.getValue(), c3427, z2);
                break;
            case 8:
                AbstractC3341.m7371(i, (List) entry.getValue(), c3427, z2);
                break;
            case 9:
                AbstractC3341.m7354(i, (List) entry.getValue(), c3427, z2);
                break;
            case 10:
                AbstractC3341.m7351(i, (List) entry.getValue(), c3427, z2);
                break;
            case 11:
                AbstractC3341.m7350(i, (List) entry.getValue(), c3427, z2);
                break;
            case 12:
                AbstractC3341.m7349(i, (List) entry.getValue(), c3427, z2);
                break;
            case 13:
                AbstractC3341.m7348(i, (List) entry.getValue(), c3427, z2);
                break;
            case 14:
                AbstractC3341.m7363(i, (List) entry.getValue(), c3427, z2);
                break;
            case 15:
                AbstractC3341.m7372(i, (List) entry.getValue(), c3427);
                break;
            case 16:
                AbstractC3341.m7347(i, (List) entry.getValue(), c3427);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    AbstractC3341.m7366(i, (List) entry.getValue(), c3427, C3372.f11018.m7480(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    AbstractC3341.m7352(i, (List) entry.getValue(), c3427, C3372.f11018.m7480(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
