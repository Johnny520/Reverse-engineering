.class public Lnet/bytebuddy/utility/JavaConstant$Dynamic;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/utility/JavaConstant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Dynamic"
.end annotation


# static fields
.field public static final DEFAULT_NAME:Ljava/lang/String; = "_"


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field private final bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

.field private final name:Ljava/lang/String;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public static bootstrap(Ljava/lang/String;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 146
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {p0, v0, p2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static varargs bootstrap(Ljava/lang/String;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 145
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap(Ljava/lang/String;Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static bootstrap(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 144
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {p0, v0, p2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static varargs bootstrap(Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0

    .line 148
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static bootstrap(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    const-string v0, "."

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeList$Explicit;->of(Ljava/util/List;)Lnet/bytebuddy/description/type/TypeList;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {p1, v2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstantBootstrap(Ljava/util/List;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    new-instance p2, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 58
    .line 59
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_1
    new-instance v2, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 79
    .line 80
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 90
    .line 91
    :goto_2
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p2, p0, v1, v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    return-object p2

    .line 126
    :cond_3
    const-string p0, "Not a valid bootstrap method "

    .line 127
    .line 128
    const-string v0, " for "

    .line 129
    .line 130
    invoke-static {p0, p1, v0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_4
    const-string p1, "Not a valid field name: "

    .line 135
    .line 136
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v1
.end method

.method public static varargs bootstrap(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0

    .line 147
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static ofArrayVarHandle(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant;"
        }
    .end annotation

    .line 100
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofArrayVarHandle(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofArrayVarHandle(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 12

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 8
    .line 9
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 10
    .line 11
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 16
    .line 17
    sget-object v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 18
    .line 19
    sget-object v5, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 20
    .line 21
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 30
    .line 31
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v6, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-class v8, Ljava/lang/Class;

    .line 42
    .line 43
    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    const/4 v10, 0x4

    .line 52
    new-array v10, v10, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    aput-object v1, v10, v11

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aput-object v6, v10, v1

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    aput-object v9, v10, v1

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    aput-object v8, v10, v1

    .line 65
    .line 66
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    const-string v6, "arrayVarHandle"

    .line 71
    .line 72
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string v1, "_"

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v3, p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_0
    const-string v0, "Not an array type: "

    .line 90
    .line 91
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return-object p0
.end method

.method public static ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/ConstantDynamic;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getDescriptor()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x9

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    move v2, v3

    .line 24
    :goto_0
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getDimensions()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-ge v2, v4, :cond_0

    .line 29
    .line 30
    const/16 v4, 0x5b

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getElementType()Lnet/bytebuddy/jar/asm/Type;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/16 v2, 0x2f

    .line 47
    .line 48
    const/16 v4, 0x2e

    .line 49
    .line 50
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {p0, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethodArgumentCount()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethodArgumentCount()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-ge v3, v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethodArgument(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {p0, v2}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofAsm(Lnet/bytebuddy/pool/TypePool;Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_2
    new-instance v2, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 112
    .line 113
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ConstantDynamic;->getBootstrapMethod()Lnet/bytebuddy/jar/asm/Handle;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/Handle;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v2, v3, v0, p0, v1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    return-object v2
.end method

.method public static ofEnumeration(Ljava/lang/Enum;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Enum<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant;"
        }
    .end annotation

    .line 72
    new-instance v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 11

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getValue()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v2, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 12
    .line 13
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 14
    .line 15
    sget-object v4, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 16
    .line 17
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-class v5, Ljava/lang/Enum;

    .line 22
    .line 23
    invoke-static {v5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    sget-object v5, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 28
    .line 29
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-class v7, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-class v8, Ljava/lang/Class;

    .line 40
    .line 41
    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const/4 v9, 0x3

    .line 46
    new-array v9, v9, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    aput-object v5, v9, v10

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    aput-object v7, v9, v5

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    aput-object v8, v9, v5

    .line 56
    .line 57
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-string v5, "enumConstant"

    .line 62
    .line 63
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 67
    .line 68
    invoke-direct {v0, v1, p0, v2, v3}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public static ofField(Ljava/lang/reflect/Field;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 1

    .line 203
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static ofField(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :goto_0
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 65
    .line 66
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 79
    .line 80
    sget-object v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 81
    .line 82
    sget-object v6, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 83
    .line 84
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const-class v7, Ljava/lang/Object;

    .line 89
    .line 90
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    const/4 v7, 0x2

    .line 95
    const/4 v9, 0x1

    .line 96
    const/4 v10, 0x0

    .line 97
    const/4 v11, 0x3

    .line 98
    const-class v12, Ljava/lang/String;

    .line 99
    .line 100
    const-class v13, Ljava/lang/Class;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    sget-object v14, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 105
    .line 106
    invoke-virtual {v14}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    invoke-static {v12}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    new-array v11, v11, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 119
    .line 120
    aput-object v14, v11, v10

    .line 121
    .line 122
    aput-object v12, v11, v9

    .line 123
    .line 124
    aput-object v13, v11, v7

    .line 125
    .line 126
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    :goto_1
    move-object v9, v7

    .line 131
    goto :goto_2

    .line 132
    :cond_1
    sget-object v14, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 133
    .line 134
    invoke-virtual {v14}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    invoke-static {v12}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    move/from16 v16, v7

    .line 151
    .line 152
    const/4 v7, 0x4

    .line 153
    new-array v7, v7, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 154
    .line 155
    aput-object v14, v7, v10

    .line 156
    .line 157
    aput-object v12, v7, v9

    .line 158
    .line 159
    aput-object v15, v7, v16

    .line 160
    .line 161
    aput-object v13, v7, v11

    .line 162
    .line 163
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    goto :goto_1

    .line 168
    :goto_2
    const-string v7, "getStaticFinal"

    .line 169
    .line 170
    invoke-direct/range {v4 .. v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    if-eqz v0, :cond_2

    .line 174
    .line 175
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_2
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_3
    invoke-direct {v1, v2, v3, v4, v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :cond_3
    const-string v0, "Field must be static and final: "

    .line 195
    .line 196
    move-object/from16 v1, p0

    .line 197
    .line 198
    invoke-static {v1, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const/4 v0, 0x0

    .line 202
    return-object v0
.end method

.method public static ofInvocation(Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 371
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofInvocation(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ofInvocation(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 370
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofInvocation(Ljava/lang/reflect/Constructor;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static ofInvocation(Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 369
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-static {v0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofInvocation(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ofInvocation(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0

    .line 373
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofInvocation(Ljava/lang/reflect/Method;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static ofInvocation(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant$Dynamic;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p1, "Bootstrap method is no constructor or non-void static factory: "

    .line 22
    .line 23
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    :goto_0
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;->isVarArgs()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const-string v2, " to "

    .line 32
    .line 33
    const-string v3, "Cannot assign "

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v6, v5

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    move v6, v4

    .line 63
    :goto_2
    add-int/2addr v0, v6

    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    add-int/2addr v6, v5

    .line 69
    if-gt v0, v6, :cond_d

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_6

    .line 85
    .line 86
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move v6, v5

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    :goto_3
    move v6, v4

    .line 96
    :goto_4
    add-int/2addr v0, v6

    .line 97
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-ne v0, v6, :cond_d

    .line 102
    .line 103
    :goto_5
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_8

    .line 108
    .line 109
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_7
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v0, v6}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_7

    .line 137
    :cond_8
    :goto_6
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_7
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;->isVarArgs()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_9

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    sub-int/2addr v6, v5

    .line 160
    invoke-interface {v0, v4, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    sub-int/2addr v7, v8

    .line 173
    add-int/2addr v7, v5

    .line 174
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    sub-int/2addr v8, v5

    .line 179
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 184
    .line 185
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v7, v0}, Ljava/util/Collections;->nCopies(ILjava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v6, v0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_8
    new-instance v6, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    add-int/2addr v7, v5

    .line 213
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-eqz v8, :cond_b

    .line 232
    .line 233
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-static {v8}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-interface {v8}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    check-cast v10, Lnet/bytebuddy/description/type/TypeDescription;

    .line 250
    .line 251
    invoke-interface {v9, v10}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-eqz v9, :cond_a

    .line 256
    .line 257
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_a
    invoke-static {v3, p1, v2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-object v1

    .line 265
    :cond_b
    new-instance p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 266
    .line 267
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_c

    .line 272
    .line 273
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    goto :goto_a

    .line 278
    :cond_c
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    :goto_a
    new-instance v7, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 287
    .line 288
    sget-object v8, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 289
    .line 290
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 291
    .line 292
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    const-class v0, Ljava/lang/Object;

    .line 297
    .line 298
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 303
    .line 304
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    const-class v2, Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const-class v3, Ljava/lang/Class;

    .line 315
    .line 316
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    sget-object v10, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 321
    .line 322
    invoke-virtual {v10}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const/4 v12, 0x5

    .line 335
    new-array v12, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 336
    .line 337
    aput-object v1, v12, v4

    .line 338
    .line 339
    aput-object v2, v12, v5

    .line 340
    .line 341
    const/4 v1, 0x2

    .line 342
    aput-object v3, v12, v1

    .line 343
    .line 344
    const/4 v1, 0x3

    .line 345
    aput-object v10, v12, v1

    .line 346
    .line 347
    const/4 v1, 0x4

    .line 348
    aput-object v0, v12, v1

    .line 349
    .line 350
    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v12

    .line 354
    const-string v10, "invoke"

    .line 355
    .line 356
    invoke-direct/range {v7 .. v12}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 357
    .line 358
    .line 359
    const-string v0, "_"

    .line 360
    .line 361
    invoke-direct {p1, v0, p0, v7, v6}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 362
    .line 363
    .line 364
    return-object p1

    .line 365
    :cond_d
    invoke-static {v3, p1, v2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    return-object v1
.end method

.method public static varargs ofInvocation(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;[Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 0

    .line 372
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofInvocation(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    move-result-object p0

    return-object p0
.end method

.method public static ofNullConstant()Lnet/bytebuddy/utility/JavaConstant$Dynamic;
    .locals 11

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 10
    .line 11
    sget-object v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 12
    .line 13
    sget-object v5, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 14
    .line 15
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 24
    .line 25
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v6, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v6}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-class v8, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    const/4 v9, 0x3

    .line 42
    new-array v9, v9, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    aput-object v1, v9, v10

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    aput-object v6, v9, v1

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    aput-object v8, v9, v1

    .line 52
    .line 53
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const-string v6, "nullConstant"

    .line 58
    .line 59
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 63
    .line 64
    const-string v4, "_"

    .line 65
    .line 66
    invoke-direct {v0, v4, v2, v3, v1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public static ofPrimitiveType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant;"
        }
    .end annotation

    .line 87
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofPrimitiveType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofPrimitiveType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 11

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 8
    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-class v1, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 20
    .line 21
    sget-object v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 22
    .line 23
    sget-object v5, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 24
    .line 25
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    sget-object v6, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 34
    .line 35
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-class v8, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v9, 0x3

    .line 50
    new-array v9, v9, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    aput-object v6, v9, v10

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    aput-object v8, v9, v6

    .line 57
    .line 58
    const/4 v6, 0x2

    .line 59
    aput-object v1, v9, v6

    .line 60
    .line 61
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    const-string v6, "primitiveClass"

    .line 66
    .line 67
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 71
    .line 72
    invoke-direct {v0, p0, v2, v3, v1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    const-string v0, "Not a primitive type: "

    .line 77
    .line 78
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    return-object p0
.end method

.method public static ofVarHandle(Ljava/lang/reflect/Field;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1

    .line 123
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    invoke-direct {v0, p0}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofVarHandle(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofVarHandle(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 16

    .line 1
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lnet/bytebuddy/utility/JavaType;->VAR_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 8
    .line 9
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    new-instance v4, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 14
    .line 15
    sget-object v5, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->INVOKE_STATIC:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 16
    .line 17
    sget-object v6, Lnet/bytebuddy/utility/JavaType;->CONSTANT_BOOTSTRAPS:Lnet/bytebuddy/utility/JavaType;

    .line 18
    .line 19
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    const-string v7, "staticFieldVarHandle"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v7, "fieldVarHandle"

    .line 33
    .line 34
    :goto_0
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    sget-object v2, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 39
    .line 40
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-class v9, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const-class v10, Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    const/4 v13, 0x5

    .line 65
    new-array v13, v13, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    const/4 v14, 0x0

    .line 68
    aput-object v2, v13, v14

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    aput-object v9, v13, v2

    .line 72
    .line 73
    const/4 v15, 0x2

    .line 74
    aput-object v11, v13, v15

    .line 75
    .line 76
    const/4 v9, 0x3

    .line 77
    aput-object v12, v13, v9

    .line 78
    .line 79
    const/4 v9, 0x4

    .line 80
    aput-object v10, v13, v9

    .line 81
    .line 82
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-direct/range {v4 .. v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface/range {p0 .. p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-interface {v6}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v6}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    new-array v7, v15, [Lnet/bytebuddy/utility/JavaConstant;

    .line 110
    .line 111
    aput-object v5, v7, v14

    .line 112
    .line 113
    aput-object v6, v7, v2

    .line 114
    .line 115
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-direct {v0, v1, v3, v4, v2}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    return-object v0
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/utility/JavaConstant$Visitor;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/utility/JavaConstant$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lnet/bytebuddy/utility/JavaConstant$Visitor;->onDynamic(Lnet/bytebuddy/utility/JavaConstant$Dynamic;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 20
    .line 21
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v0

    .line 32
    :cond_2
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 33
    .line 34
    iget-object v2, p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    return v0

    .line 43
    :cond_3
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 44
    .line 45
    iget-object v2, p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    return v0

    .line 54
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 55
    .line 56
    iget-object p1, p1, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_5
    :goto_0
    return v0
.end method

.method public getArguments()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBootstrap()Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 17
    .line 18
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/List;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v2

    .line 31
    return p0
.end method

.method public toDescription()Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->toArray(I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    array-length v2, v0

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lnet/bytebuddy/utility/JavaConstant;

    .line 24
    .line 25
    invoke-interface {v2}, Lnet/bytebuddy/utility/JavaConstant;->toDescription()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    aput-object v2, v0, v1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v1, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 35
    .line 36
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 37
    .line 38
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC_KIND:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    .line 39
    .line 40
    iget-object v4, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 41
    .line 42
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getHandleType()Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->getIdentifier()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 51
    .line 52
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v5}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    invoke-interface {v3, v4, v5}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;->valueOf(IZ)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget-object v4, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 65
    .line 66
    iget-object v5, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 67
    .line 68
    invoke-virtual {v5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v4, v5}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->ofDescriptor(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iget-object v6, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 81
    .line 82
    invoke-virtual {v6}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-object v7, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 87
    .line 88
    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getDescriptor()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-interface {v2, v3, v5, v6, v7}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 101
    .line 102
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {v4, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->ofDescriptor(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {v1, v2, v3, p0, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->ofCanonical(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

.method public toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;-><init>(Lnet/bytebuddy/utility/JavaConstant;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 7
    .line 8
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "::"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 25
    .line 26
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x28

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "_"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    const-string v1, ""

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->name:Ljava/lang/String;

    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x2f

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->arguments:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/4 v2, 0x1

    .line 68
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Lnet/bytebuddy/utility/JavaConstant;

    .line 79
    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    const/16 v4, 0x2c

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const/16 v1, 0x29

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 103
    .line 104
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method public withType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/utility/JavaConstant;"
        }
    .end annotation

    .line 97
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->withType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public withType(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getBootstrap()Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "<init>"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0, p1}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->asBoxed()Lnet/bytebuddy/description/type/TypeDescription;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/type/TypeDescription;->isInHierarchyWith(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    :goto_0
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 56
    .line 57
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getBootstrap()Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getArguments()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, v1, p1, v2, p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, " is not compatible with bootstrapped type "

    .line 82
    .line 83
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_2
    const-string p0, "Constant value cannot represent void"

    .line 92
    .line 93
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v1
.end method
