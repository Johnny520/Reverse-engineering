.class public Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final CHARSET:Ljava/lang/String; = "ISO-8859-1"


# instance fields
.field private final serialization:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;->serialization:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static of(Ljava/io/Serializable;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 3
    .param p0    # Ljava/io/Serializable;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/io/ObjectOutputStream;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;

    .line 23
    .line 24
    const-string v2, "ISO-8859-1"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v1, v0}, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V

    .line 38
    .line 39
    .line 40
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 41
    :goto_0
    const-string v1, "Cannot serialize "

    .line 42
    .line 43
    invoke-static {v1, p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 11

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    const-class v1, Ljava/io/ByteArrayInputStream;

    .line 4
    .line 5
    const-class v2, Ljava/io/ObjectInputStream;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 9
    .line 10
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 27
    .line 28
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;->serialization:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v7, p0}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 34
    .line 35
    const-string v8, "ISO-8859-1"

    .line 36
    .line 37
    invoke-direct {p0, v8}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v8, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 41
    .line 42
    const-string v9, "getBytes"

    .line 43
    .line 44
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v0, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v8, v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v8, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    .line 60
    .line 61
    const-class v9, [B

    .line 62
    .line 63
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v1, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v8, v1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v8, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    .line 79
    .line 80
    const-class v9, Ljava/io/InputStream;

    .line 81
    .line 82
    filled-new-array {v9}, [Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v2, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-direct {v8, v9}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v9, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 98
    .line 99
    const-string v10, "readObject"

    .line 100
    .line 101
    invoke-virtual {v2, v10, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-direct {v9, v2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const/16 v9, 0xa

    .line 113
    .line 114
    new-array v9, v9, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    aput-object v5, v9, v10

    .line 118
    .line 119
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 120
    .line 121
    const/4 v10, 0x1

    .line 122
    aput-object v5, v9, v10

    .line 123
    .line 124
    const/4 v10, 0x2

    .line 125
    aput-object v6, v9, v10

    .line 126
    .line 127
    const/4 v6, 0x3

    .line 128
    aput-object v5, v9, v6

    .line 129
    .line 130
    const/4 v5, 0x4

    .line 131
    aput-object v7, v9, v5

    .line 132
    .line 133
    const/4 v5, 0x5

    .line 134
    aput-object p0, v9, v5

    .line 135
    .line 136
    const/4 p0, 0x6

    .line 137
    aput-object v0, v9, p0

    .line 138
    .line 139
    const/4 p0, 0x7

    .line 140
    aput-object v1, v9, p0

    .line 141
    .line 142
    const/16 p0, 0x8

    .line 143
    .line 144
    aput-object v8, v9, p0

    .line 145
    .line 146
    const/16 p0, 0x9

    .line 147
    .line 148
    aput-object v2, v9, p0

    .line 149
    .line 150
    invoke-direct {v4, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 154
    .line 155
    .line 156
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    return-object p0

    .line 158
    :catch_0
    move-exception p0

    .line 159
    const-string p1, "Could not locate Java API method"

    .line 160
    .line 161
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    return-object v3
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;->serialization:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;->serialization:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/SerializedConstant;->serialization:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
