.class public final enum Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Binder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder$DelegationMethod;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
        "Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

.field private static final CACHED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

.field private static final NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final PRIVILEGED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 16
    .line 17
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;

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
    const-string v1, "cached"

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
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->CACHED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    const-string v1, "privileged"

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
    move-result-object v1

    .line 57
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 58
    .line 59
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 64
    .line 65
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->PRIVILEGED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
    const-string v1, "fallbackToDefault"

    .line 68
    .line 69
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 78
    .line 79
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 84
    .line 85
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 86
    .line 87
    const-string v1, "nullIfImpossible"

    .line 88
    .line 89
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 98
    .line 99
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 104
    .line 105
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 106
    .line 107
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;

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
            "Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;",
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
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class p5, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-interface {p0, p5}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_5

    .line 16
    .line 17
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const-class p3, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz p0, :cond_3

    .line 24
    .line 25
    sget-object p0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->FALLBACK_TO_DEFAULT:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 26
    .line 27
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p4, p0}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeDominant(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p4, p0}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeSuper(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :goto_0
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p0, p2}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;->withCheckedCompatibilityTo(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    new-instance p2, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 75
    .line 76
    new-instance p4, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder$DelegationMethod;

    .line 77
    .line 78
    sget-object p5, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->CACHED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 79
    .line 80
    invoke-interface {p1, p5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 81
    .line 82
    .line 83
    move-result-object p5

    .line 84
    invoke-interface {p5, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p5

    .line 88
    check-cast p5, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p5

    .line 94
    sget-object p6, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->PRIVILEGED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 95
    .line 96
    invoke-interface {p1, p6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-direct {p4, p0, p5, p1}, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder$DelegationMethod;-><init>(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;ZZ)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p2, p4}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 114
    .line 115
    .line 116
    return-object p2

    .line 117
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 118
    .line 119
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {p0, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_2

    .line 134
    .line 135
    new-instance p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 136
    .line 137
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 138
    .line 139
    invoke-direct {p0, p1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_2
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_3
    sget-object p0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod$Binder;->NULL_IF_IMPOSSIBLE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 147
    .line 148
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-interface {p0, p3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_4

    .line 163
    .line 164
    new-instance p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 165
    .line 166
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 167
    .line 168
    invoke-direct {p0, p1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 169
    .line 170
    .line 171
    return-object p0

    .line 172
    :cond_4
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Illegal;

    .line 173
    .line 174
    return-object p0

    .line 175
    :cond_5
    const-string p0, "Cannot assign Method type to "

    .line 176
    .line 177
    invoke-static {p3, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const/4 p0, 0x0

    .line 181
    return-object p0
.end method

.method public getHandledType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lnet/bytebuddy/implementation/bind/annotation/SuperMethod;

    .line 2
    .line 3
    return-object p0
.end method
