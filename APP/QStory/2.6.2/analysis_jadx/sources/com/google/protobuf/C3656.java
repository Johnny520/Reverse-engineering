package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3656 extends AbstractC3657 implements Comparable, InterfaceC3680 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C3666 f11336 = new C3666(1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final WireFormat$FieldType[] f11337 = WireFormat$FieldType.values();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Object f11338;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public AbstractC3657 f11339;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C3593 f11340;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public C3662 f11341;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Descriptors$FieldDescriptor$Type f11342;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f11343;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile DescriptorProtos$FieldOptions f11344;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f11345;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public volatile C3664 f11346;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC3657 f11347;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3662 f11348;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final DescriptorProtos$FieldDescriptorProto f11350;

    static {
        if (Descriptors$FieldDescriptor$Type.types.length == DescriptorProtos$FieldDescriptorProto.Type.values().length) {
            return;
        }
        C2632.m5294("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
    }

    public C3656(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto, C3655 c3655, C3662 c3662, int i, boolean z) throws Descriptors$DescriptorValidationException {
        this.f11349 = i;
        this.f11350 = descriptorProtos$FieldDescriptorProto;
        this.f11343 = AbstractC3591.m7810(c3655, c3662, descriptorProtos$FieldDescriptorProto.getName());
        if (descriptorProtos$FieldDescriptorProto.hasType()) {
            this.f11342 = Descriptors$FieldDescriptor$Type.valueOf(descriptorProtos$FieldDescriptorProto.getType());
        }
        this.f11345 = descriptorProtos$FieldDescriptorProto.getProto3Optional();
        AbstractC3670 abstractC3670 = null;
        if (descriptorProtos$FieldDescriptorProto.getNumber() <= 0) {
            throw new Descriptors$DescriptorValidationException(this, "Field numbers must be positive integers.");
        }
        if (z) {
            if (!descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.");
            }
            this.f11341 = null;
            if (c3662 != null) {
                this.f11348 = c3662;
                this.f11347 = c3662;
            } else {
                this.f11348 = null;
                Charset charset = AbstractC3401.f11054;
                this.f11347 = c3655;
            }
            if (descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.");
            }
            this.f11340 = null;
        } else {
            if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
                throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            this.f11341 = c3662;
            if (!descriptorProtos$FieldDescriptorProto.hasOneofIndex()) {
                this.f11340 = null;
                Charset charset2 = AbstractC3401.f11054;
                c3662.getClass();
                this.f11347 = c3662;
            } else {
                if (descriptorProtos$FieldDescriptorProto.getOneofIndex() < 0 || descriptorProtos$FieldDescriptorProto.getOneofIndex() >= c3662.f11373.getOneofDeclCount()) {
                    throw new Descriptors$DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + c3662.f11373.getName());
                }
                C3593 c3593 = (C3593) Collections.unmodifiableList(Arrays.asList(c3662.f11365)).get(descriptorProtos$FieldDescriptorProto.getOneofIndex());
                this.f11340 = c3593;
                c3593.f11224++;
                Charset charset3 = AbstractC3401.f11054;
                this.f11347 = c3593;
            }
            this.f11348 = null;
        }
        c3655.f11331.m7884(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C3664 m7863(C3656 c3656, Object obj) {
        if (c3656.m7870() == Descriptors$FieldDescriptor$Type.ENUM) {
            boolean zMo7819 = c3656.mo7819();
            C3664 c3664 = C3664.f11383;
            if (zMo7819) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((C3663) it.next()).m7892().getDebugRedact()) {
                        return c3664;
                    }
                }
            } else if (((C3663) obj).m7892().getDebugRedact()) {
                return c3664;
            }
        } else if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            if (c3656.mo7819()) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    for (Map.Entry entry : ((InterfaceC3452) it2.next()).getAllFields().entrySet()) {
                        C3664 c3664M7863 = m7863((C3656) entry.getKey(), entry.getValue());
                        if (c3664M7863.f11387) {
                            return c3664M7863;
                        }
                    }
                }
            } else {
                for (Map.Entry entry2 : ((InterfaceC3452) obj).getAllFields().entrySet()) {
                    C3664 c3664M78632 = m7863((C3656) entry2.getKey(), entry2.getValue());
                    if (c3664M78632.f11387) {
                        return c3664M78632;
                    }
                }
            }
        }
        return C3664.f11385;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m7864(C3656 c3656) {
        AbstractC3657 abstractC3657 = c3656.f11347;
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
        AbstractC3670 abstractC3670 = null;
        if (descriptorProtos$FieldDescriptorProto.hasExtendee()) {
            AbstractC3657 abstractC3657M7881 = abstractC3657.mo7815().f11331.m7881(descriptorProtos$FieldDescriptorProto.getExtendee(), c3656, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, false);
            if (!(abstractC3657M7881 instanceof C3662)) {
                throw new Descriptors$DescriptorValidationException(c3656, "\"" + descriptorProtos$FieldDescriptorProto.getExtendee() + "\" is not a message type.");
            }
            C3662 c3662 = (C3662) abstractC3657M7881;
            c3656.f11341 = c3662;
            int number = descriptorProtos$FieldDescriptorProto.getNumber();
            int iBinarySearch = Arrays.binarySearch(c3662.f11363, number);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            if (iBinarySearch < 0 || number >= c3662.f11362[iBinarySearch]) {
                throw new Descriptors$DescriptorValidationException(c3656, "\"" + c3656.f11341.f11368 + "\" does not declare " + descriptorProtos$FieldDescriptorProto.getNumber() + " as an extension number.");
            }
        }
        if (descriptorProtos$FieldDescriptorProto.hasTypeName()) {
            AbstractC3657 abstractC3657M78812 = abstractC3657.mo7815().f11331.m7881(descriptorProtos$FieldDescriptorProto.getTypeName(), c3656, Descriptors$FileDescriptorTables$SearchFilter.TYPES_ONLY, descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_ENUM || descriptorProtos$FieldDescriptorProto.hasDefaultValue());
            if (!descriptorProtos$FieldDescriptorProto.hasType()) {
                if (abstractC3657M78812 instanceof C3662) {
                    c3656.f11342 = Descriptors$FieldDescriptor$Type.MESSAGE;
                } else {
                    if (!(abstractC3657M78812 instanceof C3665)) {
                        throw new Descriptors$DescriptorValidationException(c3656, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a type.");
                    }
                    c3656.f11342 = Descriptors$FieldDescriptor$Type.ENUM;
                }
            }
            if (c3656.f11342.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (!(abstractC3657M78812 instanceof C3662)) {
                    throw new Descriptors$DescriptorValidationException(c3656, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not a message type.");
                }
                c3656.f11339 = abstractC3657M78812;
                if (descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
                    throw new Descriptors$DescriptorValidationException(c3656, "Messages can't have default values.");
                }
            } else {
                if (c3656.f11342.getJavaType() != Descriptors$FieldDescriptor$JavaType.ENUM) {
                    throw new Descriptors$DescriptorValidationException(c3656, "Field with primitive type has type_name.");
                }
                if (!(abstractC3657M78812 instanceof C3665)) {
                    throw new Descriptors$DescriptorValidationException(c3656, "\"" + descriptorProtos$FieldDescriptorProto.getTypeName() + "\" is not an enum type.");
                }
                c3656.f11339 = abstractC3657M78812;
            }
        } else if (c3656.f11342.getJavaType() == Descriptors$FieldDescriptor$JavaType.MESSAGE || c3656.f11342.getJavaType() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            throw new Descriptors$DescriptorValidationException(c3656, "Field with message or enum type missing type_name.");
        }
        if (descriptorProtos$FieldDescriptorProto.getOptions().getPacked() && !c3656.m7868()) {
            throw new Descriptors$DescriptorValidationException(c3656, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (!descriptorProtos$FieldDescriptorProto.hasDefaultValue()) {
            if (c3656.mo7819()) {
                c3656.f11338 = Collections.EMPTY_LIST;
                return;
            }
            int iOrdinal = c3656.f11342.getJavaType().ordinal();
            if (iOrdinal == 7) {
                c3656.f11338 = c3656.m7878().f11389[0];
                return;
            } else if (iOrdinal != 8) {
                c3656.f11338 = c3656.f11342.getJavaType().defaultDefault;
                return;
            } else {
                c3656.f11338 = null;
                return;
            }
        }
        if (c3656.mo7819()) {
            throw new Descriptors$DescriptorValidationException(c3656, "Repeated fields cannot have default values.");
        }
        try {
            switch (c3656.f11342.ordinal()) {
                case 0:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c3656.f11338 = Double.valueOf(Double.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c3656.f11338 = Double.valueOf(Double.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c3656.f11338 = Double.valueOf(Double.NaN);
                        return;
                    } else {
                        c3656.f11338 = Double.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 1:
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("inf")) {
                        c3656.f11338 = Float.valueOf(Float.POSITIVE_INFINITY);
                        return;
                    }
                    if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("-inf")) {
                        c3656.f11338 = Float.valueOf(Float.NEGATIVE_INFINITY);
                        return;
                    } else if (descriptorProtos$FieldDescriptorProto.getDefaultValue().equals("nan")) {
                        c3656.f11338 = Float.valueOf(Float.NaN);
                        return;
                    } else {
                        c3656.f11338 = Float.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    }
                case 2:
                case 15:
                case 17:
                    c3656.f11338 = Long.valueOf(AbstractC3719.m7994(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, true));
                    return;
                case 3:
                case 5:
                    c3656.f11338 = Long.valueOf(AbstractC3719.m7994(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, true));
                    return;
                case 4:
                case 14:
                case 16:
                    c3656.f11338 = Integer.valueOf((int) AbstractC3719.m7994(descriptorProtos$FieldDescriptorProto.getDefaultValue(), true, false));
                    return;
                case 6:
                case 12:
                    c3656.f11338 = Integer.valueOf((int) AbstractC3719.m7994(descriptorProtos$FieldDescriptorProto.getDefaultValue(), false, false));
                    return;
                case 7:
                    c3656.f11338 = Boolean.valueOf(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    return;
                case 8:
                    c3656.f11338 = descriptorProtos$FieldDescriptorProto.getDefaultValue();
                    return;
                case 9:
                case 10:
                    throw new Descriptors$DescriptorValidationException(c3656, "Message type had default value.");
                case 11:
                    try {
                        c3656.f11338 = AbstractC3719.m7993(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                        return;
                    } catch (TextFormat$InvalidEscapeSequenceException e) {
                        throw new Descriptors$DescriptorValidationException(c3656, "Couldn't parse default value: " + e.getMessage(), e);
                    }
                case 13:
                    if (c3656.m7878().f11388) {
                        return;
                    }
                    C3663 c3663M7896 = c3656.m7878().m7896(descriptorProtos$FieldDescriptorProto.getDefaultValue());
                    c3656.f11338 = c3663M7896;
                    if (c3663M7896 != null) {
                        return;
                    }
                    throw new Descriptors$DescriptorValidationException(c3656, "Unknown enum default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"');
                default:
                    return;
            }
        } catch (NumberFormatException e2) {
            throw new Descriptors$DescriptorValidationException(c3656, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
        }
        throw new Descriptors$DescriptorValidationException(c3656, "Could not parse default value: \"" + descriptorProtos$FieldDescriptorProto.getDefaultValue() + '\"', e2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3656 c3656 = (C3656) obj;
        if (c3656.f11341 == this.f11341) {
            return this.f11350.getNumber() - c3656.f11350.getNumber();
        }
        C5919.m11249("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3680
    public final int getNumber() {
        return this.f11350.getNumber();
    }

    @Override // com.google.protobuf.InterfaceC3680
    public final boolean isPacked() {
        if (m7868()) {
            return m7879().getRepeatedFieldEncoding().equals(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        return false;
    }

    public final String toString() {
        return this.f11343;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final WireFormat$JavaType mo7817() {
        return mo7820().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m7865() {
        if (m7870() != Descriptors$FieldDescriptor$Type.STRING) {
            return false;
        }
        if (this.f11341.f11373.getOptions().getMapEntry() || ((JavaFeaturesProto$JavaFeatures) m7879().getExtension(AbstractC3384.f11038)).getUtf8Validation().equals(JavaFeaturesProto$JavaFeatures.Utf8Validation.VERIFY)) {
            return true;
        }
        return m7879().getUtf8Validation().equals(DescriptorProtos$FeatureSet.Utf8Validation.VERIFY);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m7866() {
        AbstractC3657 abstractC3657 = this.f11347;
        if (Collections.unmodifiableList(Arrays.asList(abstractC3657.mo7815().f11333)).isEmpty() && abstractC3657.mo7815().f11334.getOptionDependencyCount() == 0) {
            return m7870() == Descriptors$FieldDescriptor$Type.ENUM && m7878().m7879().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        if (m7870() == Descriptors$FieldDescriptor$Type.ENUM) {
            return ((JavaFeaturesProto$JavaFeatures) m7879().getExtension(AbstractC3384.f11038)).getLegacyClosedEnum() || m7878().m7879().getEnumType() == DescriptorProtos$FeatureSet.EnumType.CLOSED;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m7867() {
        return m7879().getFieldPresence() == DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final boolean m7868() {
        return mo7819() && mo7820().isPackable();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m7869() {
        return this.f11350.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_OPTIONAL && m7879().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC3657 mo7812() {
        return this.f11347;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final String mo7813() {
        return this.f11350.getName();
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo7814() {
        return this.f11343;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3655 mo7815() {
        return this.f11347.mo7815();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$Type m7870() {
        AbstractC3657 abstractC3657;
        C3662 c3662;
        return (this.f11342 != Descriptors$FieldDescriptor$Type.MESSAGE || ((abstractC3657 = this.f11339) != null && ((C3662) abstractC3657).f11373.getOptions().getMapEntry()) || (((c3662 = this.f11341) != null && c3662.f11373.getOptions().getMapEntry()) || this.f11351 == null || m7879().getMessageEncoding() != DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED)) ? this.f11342 : Descriptors$FieldDescriptor$Type.GROUP;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3662 m7871() {
        if (m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return (C3662) this.f11339;
        }
        C5919.m11247(AbstractC0053.m156("This field is not of message type. (", this.f11343, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m7872() {
        return m7870() == Descriptors$FieldDescriptor$Type.MESSAGE && mo7819() && m7871().f11373.getOptions().getMapEntry();
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo7818(Object obj) {
        return obj instanceof InterfaceC3440;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m7873() {
        if (mo7819()) {
            return false;
        }
        return this.f11345 || m7870() == Descriptors$FieldDescriptor$Type.MESSAGE || m7870() == Descriptors$FieldDescriptor$Type.GROUP || this.f11350.hasExtendee() || this.f11340 != null || m7879().getFieldPresence() != DescriptorProtos$FeatureSet.FieldPresence.IMPLICIT;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo7874() throws Descriptors$DescriptorValidationException {
        C3662 c3662 = this.f11341;
        if (c3662 != null && c3662.f11373.getOptions().getMessageSetWireFormat() && this.f11350.hasExtendee()) {
            if (m7867() || mo7819() || m7870() != Descriptors$FieldDescriptor$Type.MESSAGE) {
                throw new Descriptors$DescriptorValidationException(this, "Extensions of MessageSets may not be required or repeated messages.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3662 m7875() {
        if (this.f11350.hasExtendee()) {
            return this.f11348;
        }
        C5919.m11247(AbstractC0053.m156("This field is not an extension. (", this.f11343, ")"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Descriptors$FieldDescriptor$JavaType m7876() {
        return m7870().getJavaType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object m7877() {
        if (m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
            return this.f11338;
        }
        C5919.m11247("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3665 m7878() {
        if (m7876() == Descriptors$FieldDescriptor$JavaType.ENUM) {
            return (C3665) this.f11339;
        }
        C5919.m11247(AbstractC0053.m156("This field is not of enum type. (", this.f11343, ")"));
        return null;
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final DescriptorProtos$FeatureSet mo7862() {
        DescriptorProtos$FeatureSet.C3272 c3272NewBuilder;
        AbstractC3657 abstractC3657 = this.f11347;
        if (abstractC3657.mo7815().m7861().getNumber() >= DescriptorProtos$Edition.EDITION_2023.getNumber()) {
            return DescriptorProtos$FeatureSet.getDefaultInstance();
        }
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = this.f11350;
        if (descriptorProtos$FieldDescriptorProto.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REQUIRED) {
            c3272NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            c3272NewBuilder.setFieldPresence(DescriptorProtos$FeatureSet.FieldPresence.LEGACY_REQUIRED);
        } else {
            c3272NewBuilder = null;
        }
        if (descriptorProtos$FieldDescriptorProto.getType() == DescriptorProtos$FieldDescriptorProto.Type.TYPE_GROUP) {
            if (c3272NewBuilder == null) {
                c3272NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3272NewBuilder.setMessageEncoding(DescriptorProtos$FeatureSet.MessageEncoding.DELIMITED);
        }
        if (abstractC3657.mo7815().m7861() == DescriptorProtos$Edition.EDITION_PROTO2 && descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c3272NewBuilder == null) {
                c3272NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3272NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.PACKED);
        }
        if (abstractC3657.mo7815().m7861() == DescriptorProtos$Edition.EDITION_PROTO3 && descriptorProtos$FieldDescriptorProto.getOptions().hasPacked() && !descriptorProtos$FieldDescriptorProto.getOptions().getPacked()) {
            if (c3272NewBuilder == null) {
                c3272NewBuilder = DescriptorProtos$FeatureSet.newBuilder();
            }
            c3272NewBuilder.setRepeatedFieldEncoding(DescriptorProtos$FeatureSet.RepeatedFieldEncoding.EXPANDED);
        }
        return c3272NewBuilder != null ? c3272NewBuilder.build() : DescriptorProtos$FeatureSet.getDefaultInstance();
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7819() {
        return this.f11350.getLabel() == DescriptorProtos$FieldDescriptorProto.Label.LABEL_REPEATED;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final WireFormat$FieldType mo7820() {
        return f11337[m7870().ordinal()];
    }

    @Override // com.google.protobuf.AbstractC3657
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InterfaceC3452 mo7816() {
        return this.f11350;
    }

    @Override // com.google.protobuf.InterfaceC3680
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo7821(Object obj, Object obj2) {
        ((InterfaceC3453) obj).mergeFrom((InterfaceC3452) obj2);
    }
}
