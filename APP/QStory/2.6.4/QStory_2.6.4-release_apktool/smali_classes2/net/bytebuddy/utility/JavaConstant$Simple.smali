.class public abstract Lnet/bytebuddy/utility/JavaConstant$Simple;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/JavaConstant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Simple"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/utility/JavaConstant;"
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

.field protected static final CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

.field protected static final DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

.field protected static final DIRECT_METHOD_HANDLE_DESC_KIND:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

.field protected static final DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

.field protected static final METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

.field protected static final METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;


# instance fields
.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
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
    sput-boolean v1, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;

    .line 39
    .line 40
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 41
    .line 42
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 51
    .line 52
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 53
    .line 54
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 55
    .line 56
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 65
    .line 66
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 67
    .line 68
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 69
    .line 70
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 79
    .line 80
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 81
    .line 82
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 83
    .line 84
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 93
    .line 94
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 95
    .line 96
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    .line 97
    .line 98
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    .line 107
    .line 108
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC_KIND:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind;

    .line 109
    .line 110
    const-class v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 111
    .line 112
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 121
    .line 122
    sput-object v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 123
    .line 124
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    return-void
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
    sget-boolean v0, Lnet/bytebuddy/utility/JavaConstant$Simple;->ACCESS_CONTROLLER:Z

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

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTypeDescription;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const-string v0, "A primitive type cannot be represented as a type constant: "

    .line 14
    .line 15
    invoke-static {v0, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static ofAsm(Lnet/bytebuddy/pool/TypePool;Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;-><init>(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p1, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance p0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;-><init>(Ljava/lang/Long;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of v0, p1, Ljava/lang/Float;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    new-instance p0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;-><init>(Ljava/lang/Float;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance p0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Double;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;-><init>(Ljava/lang/Double;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    instance-of v0, p1, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    new-instance p0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;

    .line 54
    .line 55
    check-cast p1, Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_4
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/Type;

    .line 62
    .line 63
    if-eqz v0, :cond_8

    .line 64
    .line 65
    check-cast p1, Lnet/bytebuddy/jar/asm/Type;

    .line 66
    .line 67
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/16 v1, 0xb

    .line 72
    .line 73
    if-ne v0, v1, :cond_5

    .line 74
    .line 75
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/Type;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/16 v1, 0x9

    .line 85
    .line 86
    if-ne v0, v1, :cond_7

    .line 87
    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    :goto_0
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDimensions()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-ge v1, v2, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p0, p1}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :cond_7
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p0, p1}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {p0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :cond_8
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/Handle;

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    check-cast p1, Lnet/bytebuddy/jar/asm/Handle;

    .line 149
    .line 150
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/Handle;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :cond_9
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 156
    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    check-cast p1, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 160
    .line 161
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;->ofAsm(Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/jar/asm/ConstantDynamic;)Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :cond_a
    const-string p0, "Not an ASM constant: "

    .line 167
    .line 168
    invoke-static {p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 p0, 0x0

    .line 176
    return-object p0
.end method

.method public static ofDescription(Ljava/lang/Object;Ljava/lang/ClassLoader;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 684
    invoke-static {p1}, Lnet/bytebuddy/dynamic/ClassFileLocator$ForClassLoader;->of(Ljava/lang/ClassLoader;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofDescription(Ljava/lang/Object;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 0

    .line 683
    invoke-static {p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution;->of(Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/pool/TypePool;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method

.method public static ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;-><init>(Ljava/lang/Integer;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    instance-of v2, v0, Ljava/lang/Long;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;-><init>(Ljava/lang/Long;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    instance-of v2, v0, Ljava/lang/Float;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Float;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;-><init>(Ljava/lang/Float;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    instance-of v2, v0, Ljava/lang/Double;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/Double;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;-><init>(Ljava/lang/Double;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_3
    instance-of v2, v0, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    new-instance v1, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;

    .line 58
    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_4
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 66
    .line 67
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/16 v4, 0x2e

    .line 72
    .line 73
    const/16 v5, 0x2f

    .line 74
    .line 75
    const/16 v6, 0x9

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-ne v2, v6, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_0

    .line 102
    :cond_5
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_0
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_6
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 120
    .line 121
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    const/4 v7, 0x0

    .line 126
    if-eqz v3, :cond_a

    .line 127
    .line 128
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->parameterArray(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    array-length v8, v2

    .line 135
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    array-length v8, v2

    .line 139
    :goto_1
    if-ge v7, v8, :cond_8

    .line 140
    .line 141
    aget-object v9, v2, v7

    .line 142
    .line 143
    sget-object v10, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 144
    .line 145
    invoke-interface {v10, v9}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-static {v9}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-ne v10, v6, :cond_7

    .line 158
    .line 159
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v9, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    invoke-virtual {v9}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    :goto_2
    invoke-interface {v1, v9}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-interface {v9}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v7, v7, 0x1

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 187
    .line 188
    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 189
    .line 190
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->returnType(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-ne v2, v6, :cond_9

    .line 207
    .line 208
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    goto :goto_3

    .line 217
    :cond_9
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :goto_3
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {v0, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    return-object v0

    .line 234
    :cond_a
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 235
    .line 236
    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_f

    .line 241
    .line 242
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 243
    .line 244
    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;->invocationType(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-interface {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->parameterArray(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    new-instance v13, Ljava/util/ArrayList;

    .line 253
    .line 254
    array-length v3, v2

    .line 255
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 256
    .line 257
    .line 258
    array-length v3, v2

    .line 259
    :goto_4
    if-ge v7, v3, :cond_c

    .line 260
    .line 261
    aget-object v8, v2, v7

    .line 262
    .line 263
    sget-object v9, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 264
    .line 265
    invoke-interface {v9, v8}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-ne v9, v6, :cond_b

    .line 278
    .line 279
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-virtual {v8, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    goto :goto_5

    .line 288
    :cond_b
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    :goto_5
    invoke-interface {v1, v8}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-interface {v8}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    add-int/lit8 v7, v7, 0x1

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_c
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 307
    .line 308
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_TYPE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;

    .line 309
    .line 310
    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;

    .line 311
    .line 312
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodHandleDesc;->invocationType(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    invoke-interface {v3, v7}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfMethodTypeDesc;->returnType(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-interface {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    new-instance v8, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 329
    .line 330
    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 331
    .line 332
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->of(I)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->owner(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    invoke-interface {v2, v10}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-interface {v1, v2}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface {v2}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->methodName(Ljava/lang/Object;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    const/16 v2, 0x8

    .line 373
    .line 374
    if-ne v0, v2, :cond_d

    .line 375
    .line 376
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 377
    .line 378
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    :goto_6
    move-object v12, v0

    .line 383
    goto :goto_8

    .line 384
    :cond_d
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-ne v0, v6, :cond_e

    .line 389
    .line 390
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    goto :goto_7

    .line 399
    :cond_e
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :goto_7
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    goto :goto_6

    .line 412
    :goto_8
    invoke-direct/range {v8 .. v13}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 413
    .line 414
    .line 415
    return-object v8

    .line 416
    :cond_f
    sget-object v2, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 417
    .line 418
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher;->isInstance(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-eqz v8, :cond_15

    .line 423
    .line 424
    invoke-interface {v2, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-interface {v3, v2}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->lookupDescriptor(Ljava/lang/Object;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    new-instance v13, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    array-length v3, v3

    .line 443
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    array-length v8, v3

    .line 451
    move v9, v7

    .line 452
    :goto_9
    if-ge v9, v8, :cond_11

    .line 453
    .line 454
    aget-object v10, v3, v9

    .line 455
    .line 456
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-ne v11, v6, :cond_10

    .line 461
    .line 462
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    invoke-virtual {v10, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    goto :goto_a

    .line 471
    :cond_10
    invoke-virtual {v10}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    :goto_a
    invoke-interface {v1, v10}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 476
    .line 477
    .line 478
    move-result-object v10

    .line 479
    invoke-interface {v10}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 480
    .line 481
    .line 482
    move-result-object v10

    .line 483
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    add-int/lit8 v9, v9, 0x1

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_11
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 490
    .line 491
    invoke-interface {v3, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapArgs(Ljava/lang/Object;)[Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    new-instance v14, Ljava/util/ArrayList;

    .line 496
    .line 497
    array-length v8, v3

    .line 498
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 499
    .line 500
    .line 501
    array-length v8, v3

    .line 502
    :goto_b
    if-ge v7, v8, :cond_12

    .line 503
    .line 504
    aget-object v9, v3, v7

    .line 505
    .line 506
    invoke-static {v9, v1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofDescription(Ljava/lang/Object;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/JavaConstant;

    .line 507
    .line 508
    .line 509
    move-result-object v9

    .line 510
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    add-int/lit8 v7, v7, 0x1

    .line 514
    .line 515
    goto :goto_b

    .line 516
    :cond_12
    sget-object v3, Lnet/bytebuddy/utility/JavaConstant$Simple;->CLASS_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;

    .line 517
    .line 518
    sget-object v7, Lnet/bytebuddy/utility/JavaConstant$Simple;->DYNAMIC_CONSTANT_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;

    .line 519
    .line 520
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->constantType(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v8

    .line 524
    invoke-interface {v3, v8}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v8

    .line 528
    invoke-static {v8}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    new-instance v15, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 533
    .line 534
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->constantName(Ljava/lang/Object;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v9

    .line 538
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 539
    .line 540
    .line 541
    move-result v10

    .line 542
    if-ne v10, v6, :cond_13

    .line 543
    .line 544
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    invoke-virtual {v8, v5, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    goto :goto_c

    .line 553
    :cond_13
    invoke-virtual {v8}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v8

    .line 557
    :goto_c
    invoke-interface {v1, v8}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    invoke-interface {v8}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    move-object v10, v8

    .line 566
    new-instance v8, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 567
    .line 568
    sget-object v11, Lnet/bytebuddy/utility/JavaConstant$Simple;->DIRECT_METHOD_HANDLE_DESC:Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;

    .line 569
    .line 570
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v12

    .line 574
    invoke-interface {v11, v12}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->refKind(Ljava/lang/Object;)I

    .line 575
    .line 576
    .line 577
    move-result v12

    .line 578
    invoke-static {v12}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;->of(I)Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 579
    .line 580
    .line 581
    move-result-object v12

    .line 582
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-interface {v11, v4}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->owner(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-interface {v3, v4}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfClassDesc;->descriptorString(Ljava/lang/Object;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    invoke-interface {v1, v3}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    invoke-interface {v3}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-interface {v7, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc;->bootstrapMethod(Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-interface {v11, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc;->methodName(Ljava/lang/Object;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v11

    .line 618
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-ne v0, v6, :cond_14

    .line 627
    .line 628
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    const/16 v2, 0x2e

    .line 637
    .line 638
    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    goto :goto_d

    .line 643
    :cond_14
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/Type;->getReturnType()Lnet/bytebuddy/jar/asm/Type;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getClassName()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    :goto_d
    invoke-interface {v1, v0}, Lnet/bytebuddy/pool/TypePool;->describe(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Resolution;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-interface {v0}, Lnet/bytebuddy/pool/TypePool$Resolution;->resolve()Lnet/bytebuddy/description/type/TypeDescription;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    move-object v1, v12

    .line 660
    move-object v12, v0

    .line 661
    move-object v0, v9

    .line 662
    move-object v9, v1

    .line 663
    move-object v1, v10

    .line 664
    move-object v10, v3

    .line 665
    invoke-direct/range {v8 .. v13}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 666
    .line 667
    .line 668
    invoke-direct {v15, v0, v1, v8, v14}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 669
    .line 670
    .line 671
    return-object v15

    .line 672
    :cond_15
    const-string v1, "Not a resolvable constant description or not expressible as a constant pool value: "

    .line 673
    .line 674
    invoke-static {v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    const/4 v0, 0x0

    .line 682
    return-object v0
.end method

.method public static ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "Not a constant: "

    .line 9
    .line 10
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    instance-of v0, p0, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;-><init>(Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p0, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;-><init>(Ljava/lang/Long;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;

    .line 30
    .line 31
    check-cast p0, Ljava/lang/Float;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;-><init>(Ljava/lang/Float;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    instance-of v0, p0, Ljava/lang/Double;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;

    .line 42
    .line 43
    check-cast p0, Ljava/lang/Double;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;-><init>(Ljava/lang/Double;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;

    .line 54
    .line 55
    check-cast p0, Ljava/lang/String;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    instance-of v0, p0, Ljava/lang/Class;

    .line 62
    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    check-cast p0, Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_5
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_6
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_TYPE:Lnet/bytebuddy/utility/JavaType;

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_7
    const/4 p0, 0x0

    .line 103
    return-object p0
.end method

.method public static wrap(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public static wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;
    .locals 1

    .line 33
    instance-of v0, p0, Lnet/bytebuddy/utility/JavaConstant;

    if-eqz v0, :cond_0

    .line 34
    check-cast p0, Lnet/bytebuddy/utility/JavaConstant;

    return-object p0

    .line 35
    :cond_0
    instance-of v0, p0, Lnet/bytebuddy/description/type/TypeDescription;

    if-eqz v0, :cond_1

    .line 36
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0

    .line 37
    :cond_1
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
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
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lnet/bytebuddy/utility/JavaConstant$Simple;

    .line 21
    .line 22
    iget-object p1, p1, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
