.class public final enum Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Binder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/annotation/TargetMethodAnnotationDrivenBinder$ParameterBinder<",
        "Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

.field private static final BOOTSTRAP_NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final BOOTSTRAP_OWNER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final BOOTSTRAP_PARAMETER_TYPES:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final BOOTSTRAP_RETURN_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final BOOTSTRAP_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

.field private static final INVOKEDYNAMIC:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 16
    .line 17
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;

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
    const-string v1, "name"

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
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 46
    .line 47
    const-string v1, "bootstrapType"

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
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 66
    .line 67
    const-string v1, "bootstrapOwner"

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
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_OWNER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 86
    .line 87
    const-string v1, "bootstrapName"

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
    move-result-object v1

    .line 97
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 98
    .line 99
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 104
    .line 105
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 106
    .line 107
    const-string v1, "bootstrapReturnType"

    .line 108
    .line 109
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 118
    .line 119
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 124
    .line 125
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_RETURN_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 126
    .line 127
    const-string v1, "bootstrapParameterTypes"

    .line 128
    .line 129
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 138
    .line 139
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 144
    .line 145
    sput-object v1, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_PARAMETER_TYPES:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 146
    .line 147
    const-string v1, "invokedynamic"

    .line 148
    .line 149
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 158
    .line 159
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 164
    .line 165
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->INVOKEDYNAMIC:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 166
    .line 167
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;",
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
    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_OWNER:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    sget-object v2, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->INVOKEDYNAMIC:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 16
    .line 17
    invoke-interface {p1, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-class v3, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const-class v3, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    const-class v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 38
    .line 39
    const-class v6, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 40
    .line 41
    const-class v7, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    new-instance v2, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 46
    .line 47
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;

    .line 48
    .line 49
    sget-object v9, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    invoke-interface {p1, v9}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-interface {v9, v7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    check-cast v9, Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    const/4 v11, 0x0

    .line 70
    new-array v11, v11, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 71
    .line 72
    invoke-static {v10, v11}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    new-instance v11, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 77
    .line 78
    sget-object v12, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 79
    .line 80
    invoke-interface {p1, v12}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-interface {v12, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 89
    .line 90
    invoke-interface {v6, v5}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 95
    .line 96
    invoke-interface {v0, v4}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_0

    .line 101
    .line 102
    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_0
    sget-object v4, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 107
    .line 108
    invoke-interface {p1, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-interface {v4, v7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/lang/String;

    .line 117
    .line 118
    sget-object v6, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_RETURN_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 119
    .line 120
    invoke-interface {p1, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-interface {v6, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 129
    .line 130
    sget-object v6, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_PARAMETER_TYPES:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 131
    .line 132
    invoke-interface {p1, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-interface {p0, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    move-object/from16 p5, p0

    .line 147
    .line 148
    move-object/from16 p2, v0

    .line 149
    .line 150
    move-object/from16 p4, v1

    .line 151
    .line 152
    move-object/from16 p3, v4

    .line 153
    .line 154
    move-object p1, v5

    .line 155
    move-object p0, v11

    .line 156
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 160
    .line 161
    invoke-direct {v8, v9, v10, p0, v0}, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v2, v8}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 165
    .line 166
    .line 167
    return-object v2

    .line 168
    :cond_1
    new-instance v2, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;

    .line 169
    .line 170
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;

    .line 171
    .line 172
    new-instance v9, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 173
    .line 174
    sget-object v10, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 175
    .line 176
    invoke-interface {p1, v10}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-interface {v10, v7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, Ljava/lang/String;

    .line 185
    .line 186
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-interface {v11}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    new-instance v12, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 195
    .line 196
    sget-object v13, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 197
    .line 198
    invoke-interface {p1, v13}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    invoke-interface {v13, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 207
    .line 208
    invoke-interface {v6, v5}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    check-cast v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 213
    .line 214
    invoke-interface {v0, v4}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_2

    .line 219
    .line 220
    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :cond_2
    sget-object v4, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_NAME:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 225
    .line 226
    invoke-interface {p1, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-interface {v4, v7}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    check-cast v4, Ljava/lang/String;

    .line 235
    .line 236
    sget-object v6, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_RETURN_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 237
    .line 238
    invoke-interface {p1, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-interface {v6, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 247
    .line 248
    sget-object v6, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant$Binder;->BOOTSTRAP_PARAMETER_TYPES:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 249
    .line 250
    invoke-interface {p1, v6}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-interface {p0, v3}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    check-cast p0, [Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    move-object/from16 p5, p0

    .line 265
    .line 266
    move-object/from16 p2, v0

    .line 267
    .line 268
    move-object/from16 p4, v1

    .line 269
    .line 270
    move-object/from16 p3, v4

    .line 271
    .line 272
    move-object p1, v5

    .line 273
    move-object p0, v12

    .line 274
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 278
    .line 279
    invoke-direct {v9, v10, v11, p0, v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v8, v9}, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;-><init>(Lnet/bytebuddy/utility/JavaConstant;)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v2, v8}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding$Anonymous;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 286
    .line 287
    .line 288
    return-object v2
.end method

.method public getHandledType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lnet/bytebuddy/implementation/bind/annotation/DynamicConstant;

    .line 2
    .line 3
    return-object p0
.end method
