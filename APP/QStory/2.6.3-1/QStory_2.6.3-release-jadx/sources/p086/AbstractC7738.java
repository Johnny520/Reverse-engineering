package p086;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p023.C6986;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7738 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12744(ProtoBuf$Type protoBuf$Type, C6986 c6986) {
        protoBuf$Type.getClass();
        c6986.getClass();
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            return protoBuf$Type.getFlexibleUpperBound();
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            return c6986.m12116(protoBuf$Type.getFlexibleUpperBoundId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12745(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6986 c6986) {
        c6986.getClass();
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            return c6986.m12116(protoBuf$TypeAlias.getExpandedTypeId());
        }
        C6755.m11870("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m12746(ProtoBuf$Property protoBuf$Property, C6986 c6986) {
        protoBuf$Property.getClass();
        c6986.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC5177.m9381(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6986.m12116(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m12747(ProtoBuf$Function protoBuf$Function, C6986 c6986) {
        protoBuf$Function.getClass();
        c6986.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC5177.m9381(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6986.m12116(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m12748(ProtoBuf$Class protoBuf$Class, C6986 c6986) {
        protoBuf$Class.getClass();
        c6986.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Class.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Class.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC5177.m9381(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6986.m12116(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12749(ProtoBuf$Type protoBuf$Type, C6986 c6986) {
        protoBuf$Type.getClass();
        c6986.getClass();
        if (protoBuf$Type.hasAbbreviatedType()) {
            return protoBuf$Type.getAbbreviatedType();
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            return c6986.m12116(protoBuf$Type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12750(ProtoBuf$Type.Argument argument, C6986 c6986) {
        c6986.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return c6986.m12116(argument.getTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final List m12751(ProtoBuf$Class protoBuf$Class, C6986 c6986) {
        protoBuf$Class.getClass();
        c6986.getClass();
        List<ProtoBuf$Type> supertypeList = protoBuf$Class.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = protoBuf$Class.getSupertypeIdList();
            supertypeIdList.getClass();
            supertypeList = new ArrayList<>(AbstractC5177.m9381(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                num.getClass();
                supertypeList.add(c6986.m12116(num.intValue()));
            }
        }
        return supertypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List m12752(ProtoBuf$TypeParameter protoBuf$TypeParameter, C6986 c6986) {
        protoBuf$TypeParameter.getClass();
        c6986.getClass();
        List<ProtoBuf$Type> upperBoundList = protoBuf$TypeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = protoBuf$TypeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            upperBoundList = new ArrayList<>(AbstractC5177.m9381(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                num.getClass();
                upperBoundList.add(c6986.m12116(num.intValue()));
            }
        }
        return upperBoundList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12753(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6986 c6986) {
        c6986.getClass();
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            return protoBuf$ValueParameter.getVarargElementType();
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            return c6986.m12116(protoBuf$ValueParameter.getVarargElementTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12754(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6986 c6986) {
        c6986.getClass();
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            type.getClass();
            return type;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            return c6986.m12116(protoBuf$ValueParameter.getTypeId());
        }
        C6755.m11870("No type in ProtoBuf.ValueParameter");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12755(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6986 c6986) {
        c6986.getClass();
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            return c6986.m12116(protoBuf$TypeAlias.getUnderlyingTypeId());
        }
        C6755.m11870("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12756(ProtoBuf$Type protoBuf$Type, C6986 c6986) {
        protoBuf$Type.getClass();
        c6986.getClass();
        if (protoBuf$Type.hasOuterType()) {
            return protoBuf$Type.getOuterType();
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            return c6986.m12116(protoBuf$Type.getOuterTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12757(ProtoBuf$Class protoBuf$Class, C6986 c6986) {
        protoBuf$Class.getClass();
        c6986.getClass();
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            return protoBuf$Class.getInlineClassUnderlyingType();
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            return c6986.m12116(protoBuf$Class.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12758(ProtoBuf$Function protoBuf$Function, C6986 c6986) {
        protoBuf$Function.getClass();
        c6986.getClass();
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            return c6986.m12116(protoBuf$Function.getReturnTypeId());
        }
        C6755.m11870("No returnType in ProtoBuf.Function");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12759(ProtoBuf$Property protoBuf$Property, C6986 c6986) {
        protoBuf$Property.getClass();
        c6986.getClass();
        if (protoBuf$Property.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Property.hasReturnTypeId()) {
            return c6986.m12116(protoBuf$Property.getReturnTypeId());
        }
        C6755.m11870("No returnType in ProtoBuf.Property");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12760(ProtoBuf$Function protoBuf$Function, C6986 c6986) {
        protoBuf$Function.getClass();
        c6986.getClass();
        if (protoBuf$Function.hasReceiverType()) {
            return protoBuf$Function.getReceiverType();
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            return c6986.m12116(protoBuf$Function.getReceiverTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12761(ProtoBuf$Property protoBuf$Property, C6986 c6986) {
        protoBuf$Property.getClass();
        c6986.getClass();
        if (protoBuf$Property.hasReceiverType()) {
            return protoBuf$Property.getReceiverType();
        }
        if (protoBuf$Property.hasReceiverTypeId()) {
            return c6986.m12116(protoBuf$Property.getReceiverTypeId());
        }
        return null;
    }
}
