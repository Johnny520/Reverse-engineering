.class public abstract Lnet/bytebuddy/asm/ClassVisitorFactory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;,
        Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DELEGATE:Ljava/lang/String; = "delegate"

.field private static final LABELS:Ljava/lang/String; = "labels"

.field private static final WRAP:Ljava/lang/String; = "wrap"


# instance fields
.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toMethodVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toAttributeWrapper(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$300(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toConvertedParameter(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/asm/ClassVisitorFactory;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static of(Ljava/lang/Class;)Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;)",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p0, v0}, Lnet/bytebuddy/asm/ClassVisitorFactory;->of(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static of(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)Lnet/bytebuddy/asm/ClassVisitorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;",
            "Lnet/bytebuddy/ByteBuddy;",
            ")",
            "Lnet/bytebuddy/asm/ClassVisitorFactory<",
            "TS;>;"
        }
    .end annotation

    .line 17
    new-instance v0, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/asm/ClassVisitorFactory$CreateClassVisitorFactory;-><init>(Ljava/lang/Class;Lnet/bytebuddy/ByteBuddy;)V

    invoke-static {v0}, Lnet/bytebuddy/asm/ClassVisitorFactory;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/ClassVisitorFactory;

    return-object p0
.end method

.method private static toAttributeWrapper(Lnet/bytebuddy/dynamic/DynamicType$Builder;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-object v0, v2, v3

    .line 8
    .line 9
    sget-object v4, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    aput-object v4, v2, v5

    .line 13
    .line 14
    const-string v4, "delegate"

    .line 15
    .line 16
    invoke-interface {p0, v4, p2, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-array v2, v5, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 21
    .line 22
    aput-object v0, v2, v3

    .line 23
    .line 24
    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-array v2, v5, [Ljava/lang/reflect/Type;

    .line 29
    .line 30
    aput-object p2, v2, v3

    .line 31
    .line 32
    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-class v2, Ljava/lang/String;

    .line 37
    .line 38
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {p1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v6}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onSuper()Lnet/bytebuddy/implementation/MethodCall;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 55
    .line 56
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 57
    .line 58
    invoke-virtual {v8, v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    new-instance v9, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    .line 63
    .line 64
    const-string v10, "type"

    .line 65
    .line 66
    invoke-virtual {p2, v10}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    invoke-direct {v9, v10}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-interface {v9}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    new-array v10, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 82
    .line 83
    aput-object v8, v10, v3

    .line 84
    .line 85
    aput-object v9, v10, v5

    .line 86
    .line 87
    invoke-direct {v7, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v7, v2}, Lnet/bytebuddy/implementation/MethodCall;->with(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/MethodCall;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {v4}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-interface {v6, v3}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v2, v6}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {p0, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    new-array v1, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 111
    .line 112
    aput-object v0, v1, v3

    .line 113
    .line 114
    sget-object v0, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 115
    .line 116
    aput-object v0, v1, v5

    .line 117
    .line 118
    const-string v0, "attribute"

    .line 119
    .line 120
    invoke-interface {p0, v0, p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-array v0, v5, [Ljava/lang/reflect/Type;

    .line 125
    .line 126
    aput-object p2, v0, v3

    .line 127
    .line 128
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 133
    .line 134
    new-instance v1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;

    .line 135
    .line 136
    invoke-direct {v1, p1, p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 137
    .line 138
    .line 139
    new-array p1, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 140
    .line 141
    aput-object v1, p1, v3

    .line 142
    .line 143
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p0, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isProtected()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-class p1, Ljava/lang/UnsupportedOperationException;

    .line 159
    .line 160
    invoke-static {p1}, Lnet/bytebuddy/implementation/ExceptionMethod;->throwing(Ljava/lang/Class;)Lnet/bytebuddy/implementation/Implementation;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string p1, "isUnknown"

    .line 169
    .line 170
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    invoke-interface {p0, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const/4 p3, 0x0

    .line 179
    invoke-virtual {p2, p1, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {p1}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string p1, "isCodeAttribute"

    .line 196
    .line 197
    invoke-static {p1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 198
    .line 199
    .line 200
    move-result-object p4

    .line 201
    invoke-interface {p0, p4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p2, p1, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-static {p1}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Method;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1, v4}, Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;->onField(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0
.end method

.method private static toConvertedParameter(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/Class;Ljava/lang/String;IZ)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "IZ)",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 13
    .line 14
    :goto_0
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 15
    .line 16
    invoke-virtual {v2, p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p2}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {p0, p2}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lnet/bytebuddy/description/method/MethodList;

    .line 33
    .line 34
    invoke-interface {p0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 39
    .line 40
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 p2, 0x3

    .line 45
    new-array p2, p2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    aput-object p4, p2, v2

    .line 49
    .line 50
    const/4 p4, 0x1

    .line 51
    aput-object p3, p2, p4

    .line 52
    .line 53
    const/4 p3, 0x2

    .line 54
    aput-object p0, p2, p3

    .line 55
    .line 56
    invoke-direct {v1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v1, p1}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method private static toMethodVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 20
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p9

    move-object/from16 v3, p10

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    .line 1
    const-string v6, "labels"

    invoke-static {v6}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    move-result-object v7

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    const-class v9, Ljava/util/HashMap;

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v10

    invoke-static {v10}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v10

    .line 2
    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    .line 3
    invoke-interface {v9}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    move-result-object v9

    .line 4
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Lnet/bytebuddy/matcher/ElementMatchers;->takesArguments(I)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v13

    invoke-interface {v11, v13}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v11

    invoke-interface {v9, v11}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/method/MethodList;

    .line 5
    invoke-interface {v9}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 6
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v9

    const/4 v11, 0x3

    new-array v11, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v10, v11, v12

    sget-object v10, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    const/4 v13, 0x1

    aput-object v10, v11, v13

    const/4 v10, 0x2

    aput-object v9, v11, v10

    invoke-direct {v8, v11}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 7
    const-class v9, Ljava/util/Map;

    invoke-interface {v7, v8, v9}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsValue(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)Lnet/bytebuddy/implementation/Implementation$Composable;

    move-result-object v19

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    .line 8
    invoke-static/range {v14 .. v19}, Lnet/bytebuddy/asm/ClassVisitorFactory;->toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    move-result-object v7

    .line 9
    const-class v8, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 10
    sget-object v11, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    new-array v14, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    aput-object v11, v14, v12

    sget-object v15, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    aput-object v15, v14, v13

    .line 11
    invoke-interface {v7, v6, v9, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    move-result-object v7

    new-array v9, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v9, v12

    .line 12
    const-string v14, "label"

    invoke-interface {v7, v14, v1, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v7

    new-array v9, v13, [Ljava/lang/reflect/Type;

    aput-object v0, v9, v12

    .line 13
    invoke-interface {v7, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v7

    new-instance v9, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v14, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;

    invoke-direct {v14, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;-><init>(Ljava/lang/Class;)V

    new-array v15, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v14, v15, v12

    invoke-direct {v9, v15}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 14
    invoke-interface {v7, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    .line 15
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v9

    new-array v14, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v14, v12

    invoke-interface {v7, v6, v9, v14}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDefinition;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    .line 16
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v7

    new-array v9, v13, [Lnet/bytebuddy/description/type/TypeDefinition;

    aput-object v7, v9, v12

    invoke-interface {v6, v9}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;

    invoke-direct {v9, v0, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelArrayTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v14, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v9, v14, v12

    invoke-direct {v7, v14}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 17
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v6

    new-array v7, v13, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v11, v7, v12

    .line 18
    const-string v9, "frames"

    invoke-interface {v6, v9, v8, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    new-array v7, v13, [Ljava/lang/reflect/Type;

    aput-object v8, v7, v12

    .line 19
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;

    invoke-direct {v9, v0, v1}, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v0, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v9, v0, v12

    invoke-direct {v7, v0}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 20
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    :cond_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    .line 21
    new-array v0, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    aput-object v1, v0, v12

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v1, v0, v13

    .line 22
    const-string v1, "handle"

    invoke-interface {v7, v1, v3, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v2, v1, v12

    .line 23
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v6, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;

    invoke-direct {v6, v2, v3}, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v7, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v6, v7, v12

    invoke-direct {v1, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 24
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    :cond_1
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 25
    new-array v0, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    sget-object v1, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    aput-object v1, v0, v12

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    aput-object v1, v0, v13

    .line 26
    const-string v1, "constantDyanmic"

    invoke-interface {v7, v1, v5, v0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v4, v1, v12

    .line 27
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v6, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;

    invoke-direct {v6, v4, v5, v2, v3}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    new-array v7, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v6, v7, v12

    invoke-direct {v1, v7}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 28
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v7

    .line 29
    :cond_2
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    sget-object v1, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    new-array v6, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v6, v12

    aput-object v1, v6, v13

    .line 30
    const-string v9, "constant"

    const-class v11, Ljava/lang/Object;

    invoke-interface {v7, v9, v11, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v6

    new-array v7, v13, [Ljava/lang/reflect/Type;

    aput-object v11, v7, v12

    .line 31
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v9, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;

    move-object/from16 p3, p7

    move-object/from16 p4, p8

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p0, v9

    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    move-object/from16 v2, p0

    new-array v3, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v2, v3, v12

    invoke-direct {v7, v3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 32
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v2

    new-array v3, v10, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    aput-object v0, v3, v12

    aput-object v1, v3, v13

    .line 33
    const-string v0, "constants"

    invoke-interface {v2, v0, v8, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    move-result-object v0

    new-array v1, v13, [Ljava/lang/reflect/Type;

    aput-object v8, v1, v12

    .line 34
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    move-result-object v0

    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Simple;

    new-instance v2, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;

    invoke-direct {v2}, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;-><init>()V

    new-array v3, v13, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    aput-object v2, v3, v12

    invoke-direct {v1, v3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 35
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    move-result-object v0

    return-object v0
.end method

.method private static toVisitorBuilder(Lnet/bytebuddy/ByteBuddy;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder;
    .locals 8
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/ByteBuddy;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/implementation/Implementation;",
            ")",
            "Lnet/bytebuddy/dynamic/DynamicType$Builder<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v2, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v0, v2, v3

    .line 14
    .line 15
    sget-object v4, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    aput-object v4, v2, v5

    .line 19
    .line 20
    const-string v4, "delegate"

    .line 21
    .line 22
    invoke-interface {p0, v4, p2, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineField(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/dynamic/DynamicType$Builder$FieldDefinition$Optional$Valuable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v2, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 27
    .line 28
    new-array v6, v5, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 29
    .line 30
    aput-object v2, v6, v3

    .line 31
    .line 32
    invoke-interface {p0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineConstructor([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-array v6, v5, [Ljava/lang/reflect/Type;

    .line 37
    .line 38
    aput-object p2, v6, v3

    .line 39
    .line 40
    invoke-interface {p0, v6}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v6}, Lnet/bytebuddy/implementation/MethodCall;->invoke(Ljava/lang/reflect/Constructor;)Lnet/bytebuddy/implementation/MethodCall$WithoutSpecifiedTarget;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    sget v7, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 59
    .line 60
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/MethodCall;->with([Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v4}, Lnet/bytebuddy/implementation/FieldAccessor;->ofField(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$OwnerTypeLocatable;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {v4, v3}, Lnet/bytebuddy/implementation/FieldAccessor$PropertyConfigurable;->setsArgumentAt(I)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v6, v4}, Lnet/bytebuddy/implementation/MethodCall;->andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v4, p5}, Lnet/bytebuddy/implementation/Implementation$Composable;->andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;

    .line 85
    .line 86
    .line 87
    move-result-object p5

    .line 88
    invoke-interface {p0, p5}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object p5, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 93
    .line 94
    new-array v4, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 95
    .line 96
    aput-object v2, v4, v3

    .line 97
    .line 98
    aput-object p5, v4, v5

    .line 99
    .line 100
    const-string v2, "wrap"

    .line 101
    .line 102
    invoke-interface {p0, v2, p1, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-array p1, v5, [Ljava/lang/reflect/Type;

    .line 107
    .line 108
    aput-object p2, p1, v3

    .line 109
    .line 110
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance p1, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 115
    .line 116
    new-instance v2, Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;

    .line 117
    .line 118
    invoke-direct {v2, p2}, Lnet/bytebuddy/asm/ClassVisitorFactory$NullCheckedConstruction;-><init>(Ljava/lang/Class;)V

    .line 119
    .line 120
    .line 121
    new-array p2, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 122
    .line 123
    aput-object v2, p2, v3

    .line 124
    .line 125
    invoke-direct {p1, p2}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-eqz p3, :cond_1

    .line 133
    .line 134
    if-nez p4, :cond_0

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    new-array p1, v1, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 138
    .line 139
    aput-object v0, p1, v3

    .line 140
    .line 141
    aput-object p5, p1, v5

    .line 142
    .line 143
    const-string p2, "typePath"

    .line 144
    .line 145
    invoke-interface {p0, p2, p4, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    new-array p1, v5, [Ljava/lang/reflect/Type;

    .line 150
    .line 151
    aput-object p3, p1, v3

    .line 152
    .line 153
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;->withParameters([Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ExceptionDefinition;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    new-instance p1, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 158
    .line 159
    new-instance p2, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;

    .line 160
    .line 161
    invoke-direct {p2, p3, p4}, Lnet/bytebuddy/asm/ClassVisitorFactory$TypePathTranslator;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 162
    .line 163
    .line 164
    new-array p3, v5, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 165
    .line 166
    aput-object p2, p3, v3

    .line 167
    .line 168
    invoke-direct {p1, p3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 169
    .line 170
    .line 171
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public getType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory;->type:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public abstract unwrap(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;"
        }
    .end annotation
.end method

.method public abstract wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            ")TT;"
        }
    .end annotation
.end method
