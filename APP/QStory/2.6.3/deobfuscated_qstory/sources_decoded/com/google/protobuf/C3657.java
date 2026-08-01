package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3657 extends AbstractC3658 implements Comparable, InterfaceC3681 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C3667 f11341 = new C3667(1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final WireFormat$FieldType[] f11342 = WireFormat$FieldType.values();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Object f11343;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC3658 f11344;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C3594 f11345;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C3663 f11346;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Descriptors$FieldDescriptor$Type f11347;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11348;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$FieldOptions f11349;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11350;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile C3665 f11351;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC3658 f11352;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3663 f11353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$FieldDescriptorProto f11355;

    static {
        if (Descriptors$FieldDescriptor$Type.types.length == DescriptorProtos$FieldDescriptorProto.Type.values().length) {
            return;
        }
        C2633.m5339("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
    }

    public C3657(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, C3656 c3656, C3663 c3663, int i, boolean z) throws Descriptors$DescriptorValidationException {
        this.f11354 = i;
        this.f11355 = descriptorProtos$FieldDescriptorProto;
        this.f11348 = AbstractC3592.m7797(c3656, c3663, descriptorProtos$FieldDescriptorProto.getName());
        if (descriptorProtos$FieldDescriptorProto.hasType()) {
            this.f11347 = Descriptors$FieldDescriptor$Type.valueOf(descriptorProtos$FieldDescriptorProto.getType());
        }
        this.f11350 = descriptorProtos$FieldDescriptorProto.getProto3Optional();
        AbstractC3671 abstractC3671 = null;
        if (descriptorProtos$FieldDescriptorProto.getNumber() <= 0) {
            throw new Descriptors$DescriptorValidationException(this, "Field numbers must be positive integers.");
        }
        if (z) {
            if (!descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.");
            }
            this.f11346 = null;
            if (c3663 != null) {
                this.f11353 = c3663;
                this.f11352 = c3663;
            } else {
                this.f11353 = null;
                Charset charset = AbstractC3402.f11059;
                this.f11352 = c3656;
            }
            if (descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.");
            }
            this.f11345 = null;
        } else {
            if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            this.f11346 = c3663;
            if (!descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                this.f11345 = null;
                Charset charset2 = AbstractC3402.f11059;
                c3663.getClass();
                this.f11352 = c3663;
            } else {
                if (descriptorProtos$FieldDescriptorProto.getOneofIndex() < 0 || descriptorProtos$FieldDescriptorProto.getOneofIndex() >= c3663.f11378.getOneofDeclCount()) {
                    throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + c3663.f11378.getName());
                }
                C3594 c3594 = (C3594) Collections.unmodifiableList(Arrays.asList(c3663.f11370)).get(descriptorProtos$FieldDescriptorProto.getOneofIndex());
                this.f11345 = c3594;
                c3594.f11229++;
                Charset charset3 = AbstractC3402.f11059;
                this.f11352 = c3594;
            }
            this.f11353 = null;
        }
        c3656.f11336.m7871(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C3665 m7850(C3657 c3657, Object obj) {
        if (c3657.m7857() == Descriptors$FieldDescriptor$Type.ENUM) {
            boolean zMo7806 = c3657.mo7806();
            C3665 c3665 = C3665.f11388;
            if (zMo7806) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((C3664) it.next()).m7879().getDebugRedact()) {
                        return c3665;
                    }
                }
            } else if (((C3664) obj).m7879().getDebugRedact()) {
                return c3665;
            }
        } else if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            if (c3657.mo7806()) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    for (Map.Entry entry : ((InterfaceC3453) it2.next()).getAllFields().entrySet()) {
                        C3665 c3665M7850 = m7850((C3657) entry.getKey(), entry.getValue());
                        if (c3665M7850.f11392) {
                            return c3665M7850;
                        }
                    }
                }
            } else {
                for (Map.Entry entry2 : ((InterfaceC3453) obj).getAllFields().entrySet()) {
                    C3665 c3665M78502 = m7850((C3657) entry2.getKey(), entry2.getValue());
                    if (c3665M78502.f11392) {
                        return c3665M78502;
                    }
                }
            }
        }
        return C3665.f11390;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7851(C3657 c3657) {
        AbstractC3658 abstractC3658 = c3657.f11352;
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
        AbstractC3671 abstractC3671 = null;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            AbstractC3658 abstractC3658M7868 = abstractC3658.mo7802().f11336.m7868(descriptorProtos$FieldDescriptorProto.getExtendee(), c3657, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, false);
            if (!(abstractC3658M7868 instanceof C3663)) {
                throw new Descriptors$DescriptorValidationException(c3657, "\"" + descriptorProtos$FieldDescriptorProto.getExtendee() + "\" is not a message type.");
            }
            C3663 c3663 = (C3663) abstractC3658M7868;
            c3657.f11346 = c3663;
            int number = descriptorProtos$FieldDescriptorProto.getNumber();
            int iBinarySearch = Arrays.binarySearch(c3663.f11368, number);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            if (iBinarySearch < 0 || number >= c3663.f11367[iBinarySearch]) {
                throw new Descriptors$DescriptorValidationException(c3657, "\"" + c3657.f11346.f11373 + "\" does not declare " + descriptorProtos$FieldDescriptorProto.getNumber() + " as an extension number.");
            }
        }
        if (descriptorProtos$FieldDescriptorProto.hasTypeName()) {
            AbstractC3658 abstractC3658M78682 = abstractC3658.mo7802().f11336.m7868(descriptorProtos$FieldDescriptorProto.getTypeName(), c3657, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_ENUM || descriptorProtos$FieldDescriptorProto.hasDefaultValue());
            if (!descriptorProtos$FieldDescriptorProto.hasType()) {
                if (abstractC3658M78682 instanceof C3663) {
                    c3657.f11347 = Descriptors$FieldDescriptor$Type.MESSAGE;
                } else {
                    if (!(abstractC3658M78682 instanceof C3666)) {
                        throw new Descriptors$DescriptorValidationException(c3657, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a type.");
                    }
                    c3657.f11347 = Descriptors$FieldDescriptor$Type.ENUM;
                }
            }
            if (c3657.f11347.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (!(abstractC3658M78682 instanceof C3663)) {
                    throw new Descriptors$DescriptorValidationException(c3657, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a message type.");
                }
                c3657.f11344 = abstractC3658M78682;
                if (descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
                    throw new Descriptors$DescriptorValidationException(c3657, "Messages can't have default values.");
                }
            } else {
                if (c3657.f11347.getJavaType() != Descriptors$FieldDescriptor$JavaType.ENUM) {
                    throw new Descriptors$DescriptorValidationException(c3657, "Field with primitive type has type_name.");
                }
                if (!(abstractC3658M78682 instanceof C3666)) {
                    throw new Descriptors$DescriptorValidationException(c3657, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not an enum type.");
                }
                c3657.f11344 = abstractC3658M78682;
            }
        } else if (c3657.f11347.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE || c3657.f11347.getJavaType() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            throw new Descriptors$DescriptorValidationException(c3657, "Field with message or enum type missing type_name.");
        }
        if (descriptorProtos$FieldDescriptorProto.getOptions().getPacked() && !c3657.m7855()) {
            throw new Descriptors$DescriptorValidationException(c3657, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (!descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
            if (c3657.mo7806()) {
                c3657.f11343 = Collections.EMPTY_LIST;
                return;
            }
            int iOrdinal = c3657.f11347.getJavaType().ordinal();
            if (iOrdinal == 7) {
                c3657.f11343 = c3657.m7865().f11394[0];
                return;
            } else if (iOrdinal != 8) {
                c3657.f11343 = c3657.f11347.getJavaType().defaultDefault;
                return;
            } else {
                c3657.f11343 = null;
                return;
            }
        }
        if (c3657.mo7806()) {
            throw new Descriptors$DescriptorValidationException(c3657, "Repeated fields cannot have default values.");
        }
        try {
            switch (c3657.f11347.ordinal()) {
                case 0:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c3657.f11343 = Double.valueOf(Double.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c3657.f11343 = Double.valueOf(Double.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c3657.f11343 = Double.valueOf(Double.NaN);
                        return;
                    } else {
                        c3657.f11343 = Double.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 1:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c3657.f11343 = Float.valueOf(Float.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c3657.f11343 = Float.valueOf(Float.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c3657.f11343 = Float.valueOf(Float.NaN);
                        return;
                    } else {
                        c3657.f11343 = Float.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 2:
                case 15:
                case 17:
                    c3657.f11343 = Long.valueOf(AbstractC3720.m7981(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, true));
                    return;
                case 3:
                case 5:
                    c3657.f11343 = Long.valueOf(AbstractC3720.m7981(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, true));
                    return;
                case 4:
                case 14:
                case 16:
                    c3657.f11343 = Integer.valueOf((int) AbstractC3720.m7981(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, false));
                    return;
                case 6:
                case 12:
                    c3657.f11343 = Integer.valueOf((int) AbstractC3720.m7981(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, false));
                    return;
                case 7:
                    c3657.f11343 = Boolean.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    return;
                case 8:
                    c3657.f11343 = descriptorProtos$FieldDescriptorProto.getDefaultValue();
                    return;
                case 9:
                case 10:
                    throw new Descriptors$DescriptorValidationException(c3657, "Message type had default value.");
                case 11:
                    try {
                        c3657.f11343 = AbstractC3720.m7980(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    } catch (TextFormat$InvalidEscapeSequenceException e) {
                        throw new Descriptors$DescriptorValidationException(c3657, "Couldn't parse default value: " + e.getMessage(), e);
                    }
                case 13:
                    if (c3657.m7865().f11393) {
                        return;
                    }
                    C3664 c3664M7883 = c3657.m7865().m7883(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    c3657.f11343 = c3664M7883;
                    if (c3664M7883 != null) {
                        return;
                    }
                    throw new Descriptors$DescriptorValidationException(c3657, "Unknown enum default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"');
                default:
                    return;
            }
        } catch (NumberFormatException e2) {
            throw new Descriptors$DescriptorValidationException(c3657, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
        }
        throw new Descriptors$DescriptorValidationException(c3657, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3657 c3657 = (C3657) obj;
        if (c3657.f11346 == this.f11346) {
            return this.f11355.getNumber() - c3657.f11355.getNumber();
        }
        C5925.m11310("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3681
    public final int getNumber() {
        return this.f11355.getNumber();
    }

    @Override // com.google.protobuf.InterfaceC3681
    public final boolean isPacked() {
        if (m7855()) {
            return m7866().getRepeatedFieldEncoding().equals(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        return false;
    }

    public final String toString() {
        return this.f11348;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final WireFormat$JavaType mo7804() {
        return mo7807().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m7852() {
        if (m7857() != Descriptors$FieldDescriptor$Type.STRING) {
            return false;
        }
        if (this.f11346.f11378.getOptions().getMapEntry() || ((JavaFeaturesProto$JavaFeatures) m7866().getExtension(AbstractC3385.f11043)).getUtf8Validation().equals(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY)) {
            return true;
        }
        return m7866().getUtf8Validation().equals(DescriptorProtos$FeatureSet.Utf8Validation.VERIFY);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m7853() {
        AbstractC3658 abstractC3658 = this.f11352;
        if (Collections.unmodifiableList(Arrays.asList(abstractC3658.mo7802().f11338)).isEmpty() && abstractC3658.mo7802().f11339.getOptionDependencyCount() == 0) {
            return m7857() == Descriptors$FieldDescriptor$Type.ENUM && m7865().m7866().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        if (m7857() == Descriptors$FieldDescriptor$Type.ENUM) {
            return ((JavaFeaturesProto$JavaFeatures) m7866().getExtension(AbstractC3385.f11043)).getLegacyClosedEnum() || m7865().m7866().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m7854() {
        return m7866().getFieldPresence() == DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m7855() {
        return mo7806() && mo7807().isPackable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m7856() {
        return this.f11355.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_OPTIONAL && m7866().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3658 mo7799() {
        return this.f11352;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7800() {
        return this.f11355.getName();
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7801() {
        return this.f11348;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7802() {
        return this.f11352.mo7802();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$Type m7857() {
        AbstractC3658 abstractC3658;
        C3663 c3663;
        return (this.f11347 != Descriptors$FieldDescriptor$Type.MESSAGE || ((abstractC3658 = this.f11344) != null && ((C3663) abstractC3658).f11378.getOptions().getMapEntry()) || (((c3663 = this.f11346) != null && c3663.f11378.getOptions().getMapEntry()) || this.f11356 == null || m7866().getMessageEncoding() != DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED)) ? this.f11347 : Descriptors$FieldDescriptor$Type.GROUP;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3663 m7858() {
        if (m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return (C3663) this.f11344;
        }
        C5925.m11308(AbstractC0053.m158("This field is not of message type. (", this.f11348, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m7859() {
        return m7857() == Descriptors$FieldDescriptor$Type.MESSAGE && mo7806() && m7858().f11378.getOptions().getMapEntry();
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo7805(Object obj) {
        return obj instanceof InterfaceC3441;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m7860() {
        if (mo7806()) {
            return false;
        }
        return this.f11350 || m7857() == Descriptors$FieldDescriptor$Type.MESSAGE || m7857() == Descriptors$FieldDescriptor$Type.GROUP || this.f11355.hasExtendee() || this.f11345 != null || m7866().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.IMPLICIT;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7861() throws Descriptors$DescriptorValidationException {
        C3663 c3663 = this.f11346;
        if (c3663 != null && c3663.f11378.getOptions().getMessageSetWireFormat() && this.f11355.hasExtendee()) {
            if (m7854() || mo7806() || m7857() != Descriptors$FieldDescriptor$Type.MESSAGE) {
                throw new Descriptors$DescriptorValidationException(this, "Extensions of MessageSets may not be required or repeated messages.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3663 m7862() {
        if (this.f11355.hasExtendee()) {
            return this.f11353;
        }
        C5925.m11308(AbstractC0053.m158("This field is not an extension. (", this.f11348, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$JavaType m7863() {
        return m7857().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object m7864() {
        if (m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return this.f11343;
        }
        C5925.m11308("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3666 m7865() {
        if (m7863() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            return (C3666) this.f11344;
        }
        C5925.m11308(AbstractC0053.m158("This field is not of enum type. (", this.f11348, ")"));
        return null;
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final DescriptorProtos$FeatureSet mo7849() {
        DescriptorProtos$FeatureSet.C3273 c3273NewBuilder;
        AbstractC3658 abstractC3658 = this.f11352;
        if (abstractC3658.mo7802().m7848().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = this.f11355;
        if (descriptorProtos$FieldDescriptorProto.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REQUIRED) {
            c3273NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c3273NewBuilder.setFieldPresence(DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED);
        } else {
            c3273NewBuilder = null;
        }
        if (descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_GROUP) {
            if (c3273NewBuilder == null) {
                c3273NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3273NewBuilder.setMessageEncoding(DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED);
        }
        if (abstractC3658.mo7802().m7848() == DescriptorProtos$Edition.EDITION_PROTO2 && descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c3273NewBuilder == null) {
                c3273NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3273NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        if (abstractC3658.mo7802().m7848() == DescriptorProtos$Edition.EDITION_PROTO3 && descriptorProtos$FieldDescriptorProto.getOptions().hasPacked() && !descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c3273NewBuilder == null) {
                c3273NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3273NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.EXPANDED);
        }
        return c3273NewBuilder != null ? c3273NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7806() {
        return this.f11355.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REPEATED;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final WireFormat$FieldType mo7807() {
        return f11342[m7857().ordinal()];
    }

    @Override // com.google.protobuf.AbstractC3658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3453 mo7803() {
        return this.f11355;
    }

    @Override // com.google.protobuf.InterfaceC3681
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7808(Object obj, Object obj2) {
        ((InterfaceC3454) obj).mergeFrom((InterfaceC3453) obj2);
    }
}
