.class public final enum Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Super;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Binder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
        "Lnet/bytebuddy/implementation/bind/annotation/Super;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

.field private static final PROXY_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final STRATEGY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 16
    .line 17
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/Super;

    .line 18
    .line 19
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "strategy"

    .line 28
    .line 29
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 38
    .line 39
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 44
    .line 45
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->STRATEGY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    const-string v1, "proxyType"

    .line 48
    .line 49
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 58
    .line 59
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->PROXY_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/implementation/bind/annotation/Super;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            "Lnet/bytebuddy/implementation/Implementation$Target;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            ")",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 p5, 0x0

    .line 10
    if-nez p0, :cond_3

    .line 11
    .line 12
    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_3

    .line 21
    .line 22
    sget-object p0, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->PROXY_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 23
    .line 24
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-class p6, Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    invoke-interface {p0, p6}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    invoke-static {p0}, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator$ForType;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p4}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 41
    .line 42
    .line 43
    move-result-object p6

    .line 44
    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p0, p6, p3}, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder$TypeLocator;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-nez p3, :cond_2

    .line 57
    .line 58
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_1

    .line 63
    .line 64
    invoke-interface {p4}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2, p0}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    new-instance p2, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 76
    .line 77
    sget-object p3, Lnet/bytebuddy/implementation/bind/annotation/Super$Binder;->STRATEGY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 78
    .line 79
    invoke-interface {p1, p3}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    const-class p5, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 84
    .line 85
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    check-cast p3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 90
    .line 91
    const-class p5, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;

    .line 92
    .line 93
    invoke-interface {p3, p5}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    check-cast p3, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;

    .line 98
    .line 99
    invoke-virtual {p3, p0, p4, p1}, Lnet/bytebuddy/implementation/bind/annotation/Super$Instantiation;->proxyFor(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-direct {p2, p0}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 104
    .line 105
    .line 106
    return-object p2

    .line 107
    :cond_1
    :goto_0
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;

    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_2
    const-string p1, "Cannot extend final type as @Super proxy: "

    .line 111
    .line 112
    invoke-static {p1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object p5

    .line 120
    :cond_3
    const-string p0, " uses the @Super annotation on an invalid type"

    .line 121
    .line 122
    invoke-static {p3, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object p5
.end method

.method public getHandledType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/implementation/bind/annotation/Super;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lnet/bytebuddy/implementation/bind/annotation/Super;

    .line 2
    .line 3
    return-object p0
.end method
