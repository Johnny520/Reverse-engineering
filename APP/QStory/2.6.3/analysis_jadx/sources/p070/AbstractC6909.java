package p070;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p007.C6157;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6909 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12185(ProtoBuf$Type protoBuf$Type, C6157 c6157) {
        protoBuf$Type.getClass();
        c6157.getClass();
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            return protoBuf$Type.getFlexibleUpperBound();
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            return c6157.m11557(protoBuf$Type.getFlexibleUpperBoundId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12186(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6157 c6157) {
        c6157.getClass();
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            return c6157.m11557(protoBuf$TypeAlias.getExpandedTypeId());
        }
        C5925.m11311("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m12187(ProtoBuf$Property protoBuf$Property, C6157 c6157) {
        protoBuf$Property.getClass();
        c6157.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4345.m8822(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6157.m11557(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m12188(ProtoBuf$Function protoBuf$Function, C6157 c6157) {
        protoBuf$Function.getClass();
        c6157.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4345.m8822(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6157.m11557(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m12189(ProtoBuf$Class protoBuf$Class, C6157 c6157) {
        protoBuf$Class.getClass();
        c6157.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Class.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Class.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4345.m8822(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6157.m11557(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12190(ProtoBuf$Type protoBuf$Type, C6157 c6157) {
        protoBuf$Type.getClass();
        c6157.getClass();
        if (protoBuf$Type.hasAbbreviatedType()) {
            return protoBuf$Type.getAbbreviatedType();
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            return c6157.m11557(protoBuf$Type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12191(ProtoBuf$Type.Argument argument, C6157 c6157) {
        c6157.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return c6157.m11557(argument.getTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final List m12192(ProtoBuf$Class protoBuf$Class, C6157 c6157) {
        protoBuf$Class.getClass();
        c6157.getClass();
        List<ProtoBuf$Type> supertypeList = protoBuf$Class.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = protoBuf$Class.getSupertypeIdList();
            supertypeIdList.getClass();
            supertypeList = new ArrayList<>(AbstractC4345.m8822(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                num.getClass();
                supertypeList.add(c6157.m11557(num.intValue()));
            }
        }
        return supertypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List m12193(ProtoBuf$TypeParameter protoBuf$TypeParameter, C6157 c6157) {
        protoBuf$TypeParameter.getClass();
        c6157.getClass();
        List<ProtoBuf$Type> upperBoundList = protoBuf$TypeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = protoBuf$TypeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            upperBoundList = new ArrayList<>(AbstractC4345.m8822(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                num.getClass();
                upperBoundList.add(c6157.m11557(num.intValue()));
            }
        }
        return upperBoundList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12194(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6157 c6157) {
        c6157.getClass();
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            return protoBuf$ValueParameter.getVarargElementType();
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            return c6157.m11557(protoBuf$ValueParameter.getVarargElementTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12195(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6157 c6157) {
        c6157.getClass();
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            type.getClass();
            return type;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            return c6157.m11557(protoBuf$ValueParameter.getTypeId());
        }
        C5925.m11311("No type in ProtoBuf.ValueParameter");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12196(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6157 c6157) {
        c6157.getClass();
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            return c6157.m11557(protoBuf$TypeAlias.getUnderlyingTypeId());
        }
        C5925.m11311("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12197(ProtoBuf$Type protoBuf$Type, C6157 c6157) {
        protoBuf$Type.getClass();
        c6157.getClass();
        if (protoBuf$Type.hasOuterType()) {
            return protoBuf$Type.getOuterType();
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            return c6157.m11557(protoBuf$Type.getOuterTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12198(ProtoBuf$Class protoBuf$Class, C6157 c6157) {
        protoBuf$Class.getClass();
        c6157.getClass();
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            return protoBuf$Class.getInlineClassUnderlyingType();
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            return c6157.m11557(protoBuf$Class.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12199(ProtoBuf$Function protoBuf$Function, C6157 c6157) {
        protoBuf$Function.getClass();
        c6157.getClass();
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            return c6157.m11557(protoBuf$Function.getReturnTypeId());
        }
        C5925.m11311("No returnType in ProtoBuf.Function");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12200(ProtoBuf$Property protoBuf$Property, C6157 c6157) {
        protoBuf$Property.getClass();
        c6157.getClass();
        if (protoBuf$Property.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Property.hasReturnTypeId()) {
            return c6157.m11557(protoBuf$Property.getReturnTypeId());
        }
        C5925.m11311("No returnType in ProtoBuf.Property");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12201(ProtoBuf$Function protoBuf$Function, C6157 c6157) {
        protoBuf$Function.getClass();
        c6157.getClass();
        if (protoBuf$Function.hasReceiverType()) {
            return protoBuf$Function.getReceiverType();
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            return c6157.m11557(protoBuf$Function.getReceiverTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12202(ProtoBuf$Property protoBuf$Property, C6157 c6157) {
        protoBuf$Property.getClass();
        c6157.getClass();
        if (protoBuf$Property.hasReceiverType()) {
            return protoBuf$Property.getReceiverType();
        }
        if (protoBuf$Property.hasReceiverTypeId()) {
            return c6157.m11557(protoBuf$Property.getReceiverTypeId());
        }
        return null;
    }
}
