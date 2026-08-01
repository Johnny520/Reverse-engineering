.class public abstract Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;,
        Lnet/bytebuddy/implementation/InvocationHandlerAdapter$AssignerConfigurable;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final CACHED:Z = true

.field private static final DROPPING:Z = false

.field private static final INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private static final PRIVILEGED:Z = true

.field private static final RETURNING:Z = true

.field private static final UNCACHED:Z = false

.field private static final UNPRIVILEGED:Z = false


# instance fields
.field protected final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final cached:Z

.field protected final fieldName:Ljava/lang/String;

.field protected final privileged:Z

.field protected final returning:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ljava/lang/reflect/InvocationHandler;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    return-object v0
.end method

.method private argumentValuesOf(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v1, 0x1

    .line 23
    move v2, v1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 37
    .line 38
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v6, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 47
    .line 48
    const-class v7, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 55
    .line 56
    invoke-interface {v6, v3, v7, v8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/4 v7, 0x2

    .line 61
    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    aput-object v5, v7, v8

    .line 65
    .line 66
    aput-object v6, v7, v1

    .line 67
    .line 68
    invoke-direct {v4, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    add-int/2addr v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    return-object v0
.end method

.method public static of(Ljava/lang/reflect/InvocationHandler;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "invocationHandler$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->of(Ljava/lang/reflect/InvocationHandler;Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static of(Ljava/lang/reflect/InvocationHandler;Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 7

    .line 24
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;

    const/4 v4, 0x1

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v6, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForInstance;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Ljava/lang/reflect/InvocationHandler;)V

    return-object v0
.end method

.method public static toField(Ljava/lang/String;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 1

    .line 14
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy$Factory;

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static toField(Ljava/lang/String;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)Lnet/bytebuddy/implementation/InvocationHandlerAdapter;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move-object v6, p1

    .line 10
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter$ForField;-><init>(Ljava/lang/String;ZZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Factory;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_4

    .line 14
    .line 15
    iget-boolean v1, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 24
    .line 25
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->ofPrivileged(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 35
    .line 36
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 41
    .line 42
    invoke-static/range {p5 .. p5}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-boolean v5, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-interface {v1}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;->cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const-class v6, Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->forType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->argumentValuesOf(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v5, v7}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayFactory;->withValues(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    :goto_1
    sget-object v7, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->INVOCATION_HANDLER_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 94
    .line 95
    invoke-interface {v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isAbstract()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-interface {v7, v8}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Lnet/bytebuddy/description/method/MethodList;

    .line 108
    .line 109
    invoke-interface {v7}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, Lnet/bytebuddy/description/method/MethodDescription;

    .line 114
    .line 115
    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    iget-boolean v8, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 120
    .line 121
    const/4 v9, 0x1

    .line 122
    const/4 v10, 0x0

    .line 123
    const/4 v11, 0x2

    .line 124
    if-eqz v8, :cond_3

    .line 125
    .line 126
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 127
    .line 128
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 129
    .line 130
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    sget-object v13, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 139
    .line 140
    invoke-interface {p0, v6, v12, v13}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    new-array v12, v11, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 153
    .line 154
    aput-object p0, v12, v10

    .line 155
    .line 156
    aput-object v6, v12, v9

    .line 157
    .line 158
    invoke-direct {v8, v12}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 163
    .line 164
    :goto_2
    const/4 p0, 0x7

    .line 165
    new-array p0, p0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 166
    .line 167
    aput-object p4, p0, v10

    .line 168
    .line 169
    aput-object v3, p0, v9

    .line 170
    .line 171
    aput-object v4, p0, v11

    .line 172
    .line 173
    const/4 v3, 0x3

    .line 174
    aput-object v1, p0, v3

    .line 175
    .line 176
    const/4 v1, 0x4

    .line 177
    aput-object v5, p0, v1

    .line 178
    .line 179
    const/4 v1, 0x5

    .line 180
    aput-object v7, p0, v1

    .line 181
    .line 182
    const/4 v1, 0x6

    .line 183
    aput-object v8, p0, v1

    .line 184
    .line 185
    invoke-direct {v2, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v1, p2

    .line 189
    .line 190
    invoke-virtual {v2, p1, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 195
    .line 196
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-direct {v1, p0, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_4
    const-string p0, "It is not possible to apply an invocation handler onto the static method or constructor "

    .line 209
    .line 210
    invoke-static {p0, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const/4 p0, 0x0

    .line 218
    return-object p0
.end method

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
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 39
    .line 40
    if-eq v2, v3, :cond_5

    .line 41
    .line 42
    return v1

    .line 43
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_6

    .line 52
    .line 53
    return v1

    .line 54
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 55
    .line 56
    iget-object p1, p1, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_7

    .line 63
    .line 64
    return v1

    .line 65
    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->fieldName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->cached:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->privileged:Z

    .line 23
    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean v2, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->returning:Z

    .line 27
    .line 28
    add-int/2addr v0, v2

    .line 29
    mul-int/2addr v0, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvocationHandlerAdapter;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public abstract withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/Implementation;
.end method

.method public abstract withPrivilegedLookup()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$AssignerConfigurable;
.end method

.method public abstract withoutMethodCache()Lnet/bytebuddy/implementation/InvocationHandlerAdapter$WithoutPrivilegeConfiguration;
.end method
