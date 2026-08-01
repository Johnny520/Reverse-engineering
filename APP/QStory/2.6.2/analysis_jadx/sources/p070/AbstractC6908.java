package p070;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import p015.C6230;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6908 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12157(ProtoBuf$Type protoBuf$Type, C6230 c6230) {
        protoBuf$Type.getClass();
        c6230.getClass();
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            return protoBuf$Type.getFlexibleUpperBound();
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            return c6230.m11685(protoBuf$Type.getFlexibleUpperBoundId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12158(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6230 c6230) {
        c6230.getClass();
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            expandedType.getClass();
            return expandedType;
        }
        if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            return c6230.m11685(protoBuf$TypeAlias.getExpandedTypeId());
        }
        C5919.m11250("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List m12159(ProtoBuf$Property protoBuf$Property, C6230 c6230) {
        protoBuf$Property.getClass();
        c6230.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Property.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4344.m8832(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6230.m11685(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m12160(ProtoBuf$Function protoBuf$Function, C6230 c6230) {
        protoBuf$Function.getClass();
        c6230.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Function.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4344.m8832(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6230.m11685(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List m12161(ProtoBuf$Class protoBuf$Class, C6230 c6230) {
        protoBuf$Class.getClass();
        c6230.getClass();
        List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Class.getContextReceiverTypeList();
        if (contextReceiverTypeList.isEmpty()) {
            contextReceiverTypeList = null;
        }
        if (contextReceiverTypeList == null) {
            List<Integer> contextReceiverTypeIdList = protoBuf$Class.getContextReceiverTypeIdList();
            contextReceiverTypeIdList.getClass();
            contextReceiverTypeList = new ArrayList<>(AbstractC4344.m8832(contextReceiverTypeIdList, 10));
            for (Integer num : contextReceiverTypeIdList) {
                num.getClass();
                contextReceiverTypeList.add(c6230.m11685(num.intValue()));
            }
        }
        return contextReceiverTypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12162(ProtoBuf$Type protoBuf$Type, C6230 c6230) {
        protoBuf$Type.getClass();
        c6230.getClass();
        if (protoBuf$Type.hasAbbreviatedType()) {
            return protoBuf$Type.getAbbreviatedType();
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            return c6230.m11685(protoBuf$Type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final ProtoBuf$Type m12163(ProtoBuf$Type.Argument argument, C6230 c6230) {
        c6230.getClass();
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return c6230.m11685(argument.getTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final List m12164(ProtoBuf$Class protoBuf$Class, C6230 c6230) {
        protoBuf$Class.getClass();
        c6230.getClass();
        List<ProtoBuf$Type> supertypeList = protoBuf$Class.getSupertypeList();
        if (supertypeList.isEmpty()) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = protoBuf$Class.getSupertypeIdList();
            supertypeIdList.getClass();
            supertypeList = new ArrayList<>(AbstractC4344.m8832(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                num.getClass();
                supertypeList.add(c6230.m11685(num.intValue()));
            }
        }
        return supertypeList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List m12165(ProtoBuf$TypeParameter protoBuf$TypeParameter, C6230 c6230) {
        protoBuf$TypeParameter.getClass();
        c6230.getClass();
        List<ProtoBuf$Type> upperBoundList = protoBuf$TypeParameter.getUpperBoundList();
        if (upperBoundList.isEmpty()) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = protoBuf$TypeParameter.getUpperBoundIdList();
            upperBoundIdList.getClass();
            upperBoundList = new ArrayList<>(AbstractC4344.m8832(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                num.getClass();
                upperBoundList.add(c6230.m11685(num.intValue()));
            }
        }
        return upperBoundList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12166(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6230 c6230) {
        c6230.getClass();
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            return protoBuf$ValueParameter.getVarargElementType();
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            return c6230.m11685(protoBuf$ValueParameter.getVarargElementTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12167(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6230 c6230) {
        c6230.getClass();
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            type.getClass();
            return type;
        }
        if (protoBuf$ValueParameter.hasTypeId()) {
            return c6230.m11685(protoBuf$ValueParameter.getTypeId());
        }
        C5919.m11250("No type in ProtoBuf.ValueParameter");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12168(ProtoBuf$TypeAlias protoBuf$TypeAlias, C6230 c6230) {
        c6230.getClass();
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            underlyingType.getClass();
            return underlyingType;
        }
        if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            return c6230.m11685(protoBuf$TypeAlias.getUnderlyingTypeId());
        }
        C5919.m11250("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12169(ProtoBuf$Type protoBuf$Type, C6230 c6230) {
        protoBuf$Type.getClass();
        c6230.getClass();
        if (protoBuf$Type.hasOuterType()) {
            return protoBuf$Type.getOuterType();
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            return c6230.m11685(protoBuf$Type.getOuterTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12170(ProtoBuf$Class protoBuf$Class, C6230 c6230) {
        protoBuf$Class.getClass();
        c6230.getClass();
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            return protoBuf$Class.getInlineClassUnderlyingType();
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            return c6230.m11685(protoBuf$Class.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ProtoBuf$Type m12171(ProtoBuf$Function protoBuf$Function, C6230 c6230) {
        protoBuf$Function.getClass();
        c6230.getClass();
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Function.hasReturnTypeId()) {
            return c6230.m11685(protoBuf$Function.getReturnTypeId());
        }
        C5919.m11250("No returnType in ProtoBuf.Function");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12172(ProtoBuf$Property protoBuf$Property, C6230 c6230) {
        protoBuf$Property.getClass();
        c6230.getClass();
        if (protoBuf$Property.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Property.getReturnType();
            returnType.getClass();
            return returnType;
        }
        if (protoBuf$Property.hasReturnTypeId()) {
            return c6230.m11685(protoBuf$Property.getReturnTypeId());
        }
        C5919.m11250("No returnType in ProtoBuf.Property");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ProtoBuf$Type m12173(ProtoBuf$Function protoBuf$Function, C6230 c6230) {
        protoBuf$Function.getClass();
        c6230.getClass();
        if (protoBuf$Function.hasReceiverType()) {
            return protoBuf$Function.getReceiverType();
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            return c6230.m11685(protoBuf$Function.getReceiverTypeId());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ProtoBuf$Type m12174(ProtoBuf$Property protoBuf$Property, C6230 c6230) {
        protoBuf$Property.getClass();
        c6230.getClass();
        if (protoBuf$Property.hasReceiverType()) {
            return protoBuf$Property.getReceiverType();
        }
        if (protoBuf$Property.hasReceiverTypeId()) {
            return c6230.m11685(protoBuf$Property.getReceiverTypeId());
        }
        return null;
    }
}
