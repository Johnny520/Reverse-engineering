package com.google.protobuf;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4489 extends AbstractC4490 implements Comparable, InterfaceC4513 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C4499 f11686 = new C4499(1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final WireFormat$FieldType[] f11687 = WireFormat$FieldType.values();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Object f11688;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC4490 f11689;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4426 f11690;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C4495 f11691;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Descriptors$FieldDescriptor$Type f11692;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11693;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$FieldOptions f11694;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11695;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile C4497 f11696;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC4490 f11697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4495 f11698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11699;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$FieldDescriptorProto f11700;

    static {
        if (Descriptors$FieldDescriptor$Type.types.length == DescriptorProtos$FieldDescriptorProto.Type.values().length) {
            return;
        }
        C3466.m5899("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
    }

    public C4489(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, C4488 c4488, C4495 c4495, int i, boolean z) throws Descriptors$DescriptorValidationException {
        this.f11699 = i;
        this.f11700 = descriptorProtos$FieldDescriptorProto;
        this.f11693 = AbstractC4424.m8356(c4488, c4495, descriptorProtos$FieldDescriptorProto.getName());
        if (descriptorProtos$FieldDescriptorProto.hasType()) {
            this.f11692 = Descriptors$FieldDescriptor$Type.valueOf(descriptorProtos$FieldDescriptorProto.getType());
        }
        this.f11695 = descriptorProtos$FieldDescriptorProto.getProto3Optional();
        AbstractC4503 abstractC4503 = null;
        if (descriptorProtos$FieldDescriptorProto.getNumber() <= 0) {
            throw new Descriptors$DescriptorValidationException(this, "Field numbers must be positive integers.");
        }
        if (z) {
            if (!descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.");
            }
            this.f11691 = null;
            if (c4495 != null) {
                this.f11698 = c4495;
                this.f11697 = c4495;
            } else {
                this.f11698 = null;
                Charset charset = AbstractC4234.f11404;
                this.f11697 = c4488;
            }
            if (descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.");
            }
            this.f11690 = null;
        } else {
            if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            this.f11691 = c4495;
            if (!descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                this.f11690 = null;
                Charset charset2 = AbstractC4234.f11404;
                c4495.getClass();
                this.f11697 = c4495;
            } else {
                if (descriptorProtos$FieldDescriptorProto.getOneofIndex() < 0 || descriptorProtos$FieldDescriptorProto.getOneofIndex() >= c4495.f11723.getOneofDeclCount()) {
                    throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + c4495.f11723.getName());
                }
                C4426 c4426 = (C4426) Collections.unmodifiableList(Arrays.asList(c4495.f11715)).get(descriptorProtos$FieldDescriptorProto.getOneofIndex());
                this.f11690 = c4426;
                c4426.f11574++;
                Charset charset3 = AbstractC4234.f11404;
                this.f11697 = c4426;
            }
            this.f11698 = null;
        }
        c4488.f11681.m8430(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C4497 m8409(C4489 c4489, Object obj) {
        if (c4489.m8416() == Descriptors$FieldDescriptor$Type.ENUM) {
            boolean zMo8365 = c4489.mo8365();
            C4497 c4497 = C4497.f11733;
            if (zMo8365) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((C4496) it.next()).m8438().getDebugRedact()) {
                        return c4497;
                    }
                }
            } else if (((C4496) obj).m8438().getDebugRedact()) {
                return c4497;
            }
        } else if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            if (c4489.mo8365()) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    for (Map.Entry entry : ((InterfaceC4285) it2.next()).getAllFields().entrySet()) {
                        C4497 c4497M8409 = m8409((C4489) entry.getKey(), entry.getValue());
                        if (c4497M8409.f11737) {
                            return c4497M8409;
                        }
                    }
                }
            } else {
                for (Map.Entry entry2 : ((InterfaceC4285) obj).getAllFields().entrySet()) {
                    C4497 c4497M84092 = m8409((C4489) entry2.getKey(), entry2.getValue());
                    if (c4497M84092.f11737) {
                        return c4497M84092;
                    }
                }
            }
        }
        return C4497.f11735;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m8410(C4489 c4489) {
        AbstractC4490 abstractC4490 = c4489.f11697;
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        AbstractC4503 abstractC4503 = null;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            AbstractC4490 abstractC4490M8427 = abstractC4490.mo8361().f11681.m8427(descriptorProtos$FieldDescriptorProto.getExtendee(), c4489, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, false);
            if (!(abstractC4490M8427 instanceof C4495)) {
                throw new Descriptors$DescriptorValidationException(c4489, "\"" + descriptorProtos$FieldDescriptorProto.getExtendee() + "\" is not a message type.");
            }
            C4495 c4495 = (C4495) abstractC4490M8427;
            c4489.f11691 = c4495;
            int number = descriptorProtos$FieldDescriptorProto.getNumber();
            int iBinarySearch = Arrays.binarySearch(c4495.f11713, number);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            if (iBinarySearch < 0 || number >= c4495.f11712[iBinarySearch]) {
                throw new Descriptors$DescriptorValidationException(c4489, "\"" + c4489.f11691.f11718 + "\" does not declare " + descriptorProtos$FieldDescriptorProto.getNumber() + " as an extension number.");
            }
        }
        if (descriptorProtos$FieldDescriptorProto.hasTypeName()) {
            AbstractC4490 abstractC4490M84272 = abstractC4490.mo8361().f11681.m8427(descriptorProtos$FieldDescriptorProto.getTypeName(), c4489, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_ENUM || descriptorProtos$FieldDescriptorProto.hasDefaultValue());
            if (!descriptorProtos$FieldDescriptorProto.hasType()) {
                if (abstractC4490M84272 instanceof C4495) {
                    c4489.f11692 = Descriptors$FieldDescriptor$Type.MESSAGE;
                } else {
                    if (!(abstractC4490M84272 instanceof C4498)) {
                        throw new Descriptors$DescriptorValidationException(c4489, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a type.");
                    }
                    c4489.f11692 = Descriptors$FieldDescriptor$Type.ENUM;
                }
            }
            if (c4489.f11692.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (!(abstractC4490M84272 instanceof C4495)) {
                    throw new Descriptors$DescriptorValidationException(c4489, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a message type.");
                }
                c4489.f11689 = abstractC4490M84272;
                if (descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
                    throw new Descriptors$DescriptorValidationException(c4489, "Messages can't have default values.");
                }
            } else {
                if (c4489.f11692.getJavaType() != Descriptors$FieldDescriptor$JavaType.ENUM) {
                    throw new Descriptors$DescriptorValidationException(c4489, "Field with primitive type has type_name.");
                }
                if (!(abstractC4490M84272 instanceof C4498)) {
                    throw new Descriptors$DescriptorValidationException(c4489, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not an enum type.");
                }
                c4489.f11689 = abstractC4490M84272;
            }
        } else if (c4489.f11692.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE || c4489.f11692.getJavaType() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            throw new Descriptors$DescriptorValidationException(c4489, "Field with message or enum type missing type_name.");
        }
        if (descriptorProtos$FieldDescriptorProto.getOptions().getPacked() && !c4489.m8414()) {
            throw new Descriptors$DescriptorValidationException(c4489, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (!descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
            if (c4489.mo8365()) {
                c4489.f11688 = Collections.EMPTY_LIST;
                return;
            }
            int iOrdinal = c4489.f11692.getJavaType().ordinal();
            if (iOrdinal == 7) {
                c4489.f11688 = c4489.m8424().f11739[0];
                return;
            } else if (iOrdinal != 8) {
                c4489.f11688 = c4489.f11692.getJavaType().defaultDefault;
                return;
            } else {
                c4489.f11688 = null;
                return;
            }
        }
        if (c4489.mo8365()) {
            throw new Descriptors$DescriptorValidationException(c4489, "Repeated fields cannot have default values.");
        }
        try {
            switch (c4489.f11692.ordinal()) {
                case 0:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c4489.f11688 = Double.valueOf(Double.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c4489.f11688 = Double.valueOf(Double.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c4489.f11688 = Double.valueOf(Double.NaN);
                        return;
                    } else {
                        c4489.f11688 = Double.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 1:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c4489.f11688 = Float.valueOf(Float.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c4489.f11688 = Float.valueOf(Float.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c4489.f11688 = Float.valueOf(Float.NaN);
                        return;
                    } else {
                        c4489.f11688 = Float.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 2:
                case 15:
                case 17:
                    c4489.f11688 = Long.valueOf(AbstractC4552.m8540(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, true));
                    return;
                case 3:
                case 5:
                    c4489.f11688 = Long.valueOf(AbstractC4552.m8540(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, true));
                    return;
                case 4:
                case 14:
                case 16:
                    c4489.f11688 = Integer.valueOf((int) AbstractC4552.m8540(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, false));
                    return;
                case 6:
                case 12:
                    c4489.f11688 = Integer.valueOf((int) AbstractC4552.m8540(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, false));
                    return;
                case 7:
                    c4489.f11688 = Boolean.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    return;
                case 8:
                    c4489.f11688 = descriptorProtos$FieldDescriptorProto.getDefaultValue();
                    return;
                case 9:
                case 10:
                    throw new Descriptors$DescriptorValidationException(c4489, "Message type had default value.");
                case 11:
                    try {
                        c4489.f11688 = AbstractC4552.m8539(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    } catch (TextFormat$InvalidEscapeSequenceException e) {
                        throw new Descriptors$DescriptorValidationException(c4489, "Couldn't parse default value: " + e.getMessage(), e);
                    }
                case 13:
                    if (c4489.m8424().f11738) {
                        return;
                    }
                    C4496 c4496M8442 = c4489.m8424().m8442(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    c4489.f11688 = c4496M8442;
                    if (c4496M8442 != null) {
                        return;
                    }
                    throw new Descriptors$DescriptorValidationException(c4489, "Unknown enum default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"');
                default:
                    return;
            }
        } catch (NumberFormatException e2) {
            throw new Descriptors$DescriptorValidationException(c4489, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
        }
        throw new Descriptors$DescriptorValidationException(c4489, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4489 c4489 = (C4489) obj;
        if (c4489.f11691 == this.f11691) {
            return this.f11700.getNumber() - c4489.f11700.getNumber();
        }
        C6755.m11869("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC4513
    public final int getNumber() {
        return this.f11700.getNumber();
    }

    @Override // com.google.protobuf.InterfaceC4513
    public final boolean isPacked() {
        if (m8414()) {
            return m8425().getRepeatedFieldEncoding().equals(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        return false;
    }

    public final String toString() {
        return this.f11693;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final WireFormat$JavaType mo8363() {
        return mo8366().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m8411() {
        if (m8416() != Descriptors$FieldDescriptor$Type.STRING) {
            return false;
        }
        if (this.f11691.f11723.getOptions().getMapEntry() || ((JavaFeaturesProto$JavaFeatures) m8425().getExtension(AbstractC4217.f11388)).getUtf8Validation().equals(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY)) {
            return true;
        }
        return m8425().getUtf8Validation().equals(DescriptorProtos$FeatureSet.Utf8Validation.VERIFY);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m8412() {
        AbstractC4490 abstractC4490 = this.f11697;
        if (Collections.unmodifiableList(Arrays.asList(abstractC4490.mo8361().f11683)).isEmpty() && abstractC4490.mo8361().f11684.getOptionDependencyCount() == 0) {
            return m8416() == Descriptors$FieldDescriptor$Type.ENUM && m8424().m8425().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        if (m8416() == Descriptors$FieldDescriptor$Type.ENUM) {
            return ((JavaFeaturesProto$JavaFeatures) m8425().getExtension(AbstractC4217.f11388)).getLegacyClosedEnum() || m8424().m8425().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m8413() {
        return m8425().getFieldPresence() == DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m8414() {
        return mo8365() && mo8366().isPackable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m8415() {
        return this.f11700.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_OPTIONAL && m8425().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4490 mo8358() {
        return this.f11697;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo8359() {
        return this.f11700.getName();
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo8360() {
        return this.f11693;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4488 mo8361() {
        return this.f11697.mo8361();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$Type m8416() {
        AbstractC4490 abstractC4490;
        C4495 c4495;
        return (this.f11692 != Descriptors$FieldDescriptor$Type.MESSAGE || ((abstractC4490 = this.f11689) != null && ((C4495) abstractC4490).f11723.getOptions().getMapEntry()) || (((c4495 = this.f11691) != null && c4495.f11723.getOptions().getMapEntry()) || this.f11701 == null || m8425().getMessageEncoding() != DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED)) ? this.f11692 : Descriptors$FieldDescriptor$Type.GROUP;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4495 m8417() {
        if (m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return (C4495) this.f11689;
        }
        C6755.m11867(AbstractC0900.m718("This field is not of message type. (", this.f11693, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m8418() {
        return m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && mo8365() && m8417().f11723.getOptions().getMapEntry();
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo8364(Object obj) {
        return obj instanceof InterfaceC4273;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m8419() {
        if (mo8365()) {
            return false;
        }
        return this.f11695 || m8416() == Descriptors$FieldDescriptor$Type.MESSAGE || m8416() == Descriptors$FieldDescriptor$Type.GROUP || this.f11700.hasExtendee() || this.f11690 != null || m8425().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.IMPLICIT;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo8420() throws Descriptors$DescriptorValidationException {
        C4495 c4495 = this.f11691;
        if (c4495 != null && c4495.f11723.getOptions().getMessageSetWireFormat() && this.f11700.hasExtendee()) {
            if (m8413() || mo8365() || m8416() != Descriptors$FieldDescriptor$Type.MESSAGE) {
                throw new Descriptors$DescriptorValidationException(this, "Extensions of MessageSets may not be required or repeated messages.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4495 m8421() {
        if (this.f11700.hasExtendee()) {
            return this.f11698;
        }
        C6755.m11867(AbstractC0900.m718("This field is not an extension. (", this.f11693, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$JavaType m8422() {
        return m8416().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object m8423() {
        if (m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return this.f11688;
        }
        C6755.m11867("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4498 m8424() {
        if (m8422() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            return (C4498) this.f11689;
        }
        C6755.m11867(AbstractC0900.m718("This field is not of enum type. (", this.f11693, ")"));
        return null;
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final DescriptorProtos$FeatureSet mo8408() {
        DescriptorProtos$FeatureSet.C4105 c4105NewBuilder;
        AbstractC4490 abstractC4490 = this.f11697;
        if (abstractC4490.mo8361().m8407().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = this.f11700;
        if (descriptorProtos$FieldDescriptorProto.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REQUIRED) {
            c4105NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c4105NewBuilder.setFieldPresence(DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED);
        } else {
            c4105NewBuilder = null;
        }
        if (descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_GROUP) {
            if (c4105NewBuilder == null) {
                c4105NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c4105NewBuilder.setMessageEncoding(DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED);
        }
        if (abstractC4490.mo8361().m8407() == DescriptorProtos$Edition.EDITION_PROTO2 && descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c4105NewBuilder == null) {
                c4105NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c4105NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        if (abstractC4490.mo8361().m8407() == DescriptorProtos$Edition.EDITION_PROTO3 && descriptorProtos$FieldDescriptorProto.getOptions().hasPacked() && !descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c4105NewBuilder == null) {
                c4105NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c4105NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.EXPANDED);
        }
        return c4105NewBuilder != null ? c4105NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8365() {
        return this.f11700.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REPEATED;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final WireFormat$FieldType mo8366() {
        return f11687[m8416().ordinal()];
    }

    @Override // com.google.protobuf.AbstractC4490
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC4285 mo8362() {
        return this.f11700;
    }

    @Override // com.google.protobuf.InterfaceC4513
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo8367(Object obj, Object obj2) {
        ((InterfaceC4286) obj).mergeFrom((InterfaceC4285) obj2);
    }
}
