.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "LambdaMetafactoryFactory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

.field public static final enum ALTERNATIVE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

.field private static final LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

.field public static final enum REGULAR:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;


# instance fields
.field private final localVariableLength:I

.field private final stackSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const-string v2, "REGULAR"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x6

    .line 9
    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$1;-><init>(Ljava/lang/String;III)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->REGULAR:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 13
    .line 14
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    const-string v5, "ALTERNATIVE"

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    invoke-direct {v1, v5, v6, v4, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$2;-><init>(Ljava/lang/String;III)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->ALTERNATIVE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    new-array v2, v2, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 28
    .line 29
    aput-object v0, v2, v3

    .line 30
    .line 31
    aput-object v1, v2, v6

    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 34
    .line 35
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->resolve()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    .line 40
    .line 41
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->stackSize:I

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->localVariableLength:I

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILnet/bytebuddy/agent/builder/AgentBuilder$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;-><init>(Ljava/lang/String;III)V

    return-void
.end method

.method private static resolve()Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
    .locals 11

    .line 1
    const-string v0, "[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;"

    .line 2
    .line 3
    const-class v1, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    const-string v4, "java.lang.invoke.MethodHandles$Lookup"

    .line 8
    .line 9
    invoke-static {v4, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const-string v5, "defineHiddenClass"

    .line 14
    .line 15
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    filled-new-array {v1, v6, v7}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    const-string v5, "defineHiddenClassWithClassData"

    .line 29
    .line 30
    const-class v7, Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    filled-new-array {v1, v7, v6, v0}, [Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v4, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingMethodHandleLookup;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :catch_0
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v4, v0

    .line 51
    move v5, v3

    .line 52
    :goto_0
    if-ge v5, v4, :cond_0

    .line 53
    .line 54
    aget-object v6, v0, v5

    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v6}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->getType()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    const/16 v8, 0x2f

    .line 61
    .line 62
    const/16 v9, 0x2e

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v7, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    const-string v8, "defineAnonymousClass"

    .line 73
    .line 74
    const-class v9, Ljava/lang/Class;

    .line 75
    .line 76
    const-class v10, [Ljava/lang/Object;

    .line 77
    .line 78
    filled-new-array {v9, v1, v10}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 83
    .line 84
    .line 85
    return-object v6

    .line 86
    :catch_1
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$Unavailable;->INSTANCE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$Unavailable;

    .line 90
    .line 91
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    const-string v5, "()Ljava/lang/ClassLoader;"

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/16 v2, 0xb8

    .line 10
    .line 11
    const-string v3, "java/lang/ClassLoader"

    .line 12
    .line 13
    const-string v4, "getSystemClassLoader"

    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const-string v2, "net.bytebuddy.agent.builder.LambdaFactory"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-string v5, "(Ljava/lang/String;)Ljava/lang/Class;"

    .line 26
    .line 27
    const/16 v2, 0xb6

    .line 28
    .line 29
    const-string v3, "java/lang/ClassLoader"

    .line 30
    .line 31
    const-string v4, "loadClass"

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    const-string v2, "make"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/16 v7, 0x10

    .line 42
    .line 43
    const/16 v8, 0x9

    .line 44
    .line 45
    invoke-virtual {v1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 46
    .line 47
    .line 48
    const-string v2, "java/lang/Class"

    .line 49
    .line 50
    const/16 v9, 0xbd

    .line 51
    .line 52
    invoke-virtual {v1, v9, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/16 v10, 0x59

    .line 56
    .line 57
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 58
    .line 59
    .line 60
    const/4 v11, 0x3

    .line 61
    invoke-virtual {v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 62
    .line 63
    .line 64
    const-string v2, "Ljava/lang/Object;"

    .line 65
    .line 66
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/16 v12, 0x53

    .line 74
    .line 75
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 79
    .line 80
    .line 81
    const/4 v13, 0x4

    .line 82
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 83
    .line 84
    .line 85
    const-string v3, "Ljava/lang/String;"

    .line 86
    .line 87
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 98
    .line 99
    .line 100
    const/4 v14, 0x5

    .line 101
    invoke-virtual {v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 115
    .line 116
    .line 117
    const/4 v15, 0x6

    .line 118
    invoke-virtual {v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x7

    .line 135
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 149
    .line 150
    .line 151
    const/16 v4, 0x8

    .line 152
    .line 153
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v7, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 170
    .line 171
    .line 172
    const-string v2, "TYPE"

    .line 173
    .line 174
    const-string v5, "Ljava/lang/Class;"

    .line 175
    .line 176
    const/16 v6, 0xb2

    .line 177
    .line 178
    const-string v15, "java/lang/Boolean"

    .line 179
    .line 180
    invoke-virtual {v1, v6, v15, v2, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v7, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 190
    .line 191
    .line 192
    const-string v2, "Ljava/util/List;"

    .line 193
    .line 194
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v7, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 218
    .line 219
    .line 220
    const-string v5, "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;"

    .line 221
    .line 222
    move v2, v6

    .line 223
    const/4 v6, 0x0

    .line 224
    move v15, v2

    .line 225
    const/16 v2, 0xb6

    .line 226
    .line 227
    move/from16 v16, v3

    .line 228
    .line 229
    const-string v3, "java/lang/Class"

    .line 230
    .line 231
    move/from16 v17, v4

    .line 232
    .line 233
    const-string v4, "getDeclaredMethod"

    .line 234
    .line 235
    move/from16 v15, v16

    .line 236
    .line 237
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 238
    .line 239
    .line 240
    const/4 v2, 0x1

    .line 241
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 245
    .line 246
    .line 247
    const-string v3, "java/lang/Object"

    .line 248
    .line 249
    invoke-virtual {v1, v9, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 256
    .line 257
    .line 258
    const/16 v4, 0x19

    .line 259
    .line 260
    const/4 v5, 0x0

    .line 261
    invoke-virtual {v1, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v4, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 283
    .line 284
    .line 285
    const/4 v2, 0x2

    .line 286
    invoke-virtual {v1, v4, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 293
    .line 294
    .line 295
    const/4 v6, 0x6

    .line 296
    invoke-virtual {v1, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v4, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v4, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 318
    .line 319
    .line 320
    const/16 v13, 0x8

    .line 321
    .line 322
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v4, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 332
    .line 333
    .line 334
    const/4 v6, 0x6

    .line 335
    invoke-virtual {v1, v7, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 336
    .line 337
    .line 338
    const/16 v14, 0x15

    .line 339
    .line 340
    invoke-virtual {v1, v14, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 341
    .line 342
    .line 343
    move v6, v5

    .line 344
    const-string v5, "(Z)Ljava/lang/Boolean;"

    .line 345
    .line 346
    move v14, v6

    .line 347
    const/4 v6, 0x0

    .line 348
    move/from16 v16, v2

    .line 349
    .line 350
    const/16 v2, 0xb8

    .line 351
    .line 352
    move-object/from16 v17, v3

    .line 353
    .line 354
    const-string v3, "java/lang/Boolean"

    .line 355
    .line 356
    move/from16 v18, v4

    .line 357
    .line 358
    const-string v4, "valueOf"

    .line 359
    .line 360
    move/from16 v11, v16

    .line 361
    .line 362
    move-object/from16 v14, v17

    .line 363
    .line 364
    move/from16 v9, v18

    .line 365
    .line 366
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v7, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v7, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v9, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 394
    .line 395
    .line 396
    const-string v5, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;"

    .line 397
    .line 398
    const/16 v2, 0xb6

    .line 399
    .line 400
    const-string v3, "java/lang/reflect/Method"

    .line 401
    .line 402
    const-string v4, "invoke"

    .line 403
    .line 404
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 405
    .line 406
    .line 407
    const/16 v2, 0xc0

    .line 408
    .line 409
    const-string v3, "[B"

    .line 410
    .line 411
    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 412
    .line 413
    .line 414
    const/16 v2, 0x3a

    .line 415
    .line 416
    invoke-virtual {v1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 417
    .line 418
    .line 419
    sget-object v7, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->LOADER:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;

    .line 420
    .line 421
    invoke-interface {v7, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v9, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 425
    .line 426
    .line 427
    const-string v5, "()I"

    .line 428
    .line 429
    const/16 v2, 0xb6

    .line 430
    .line 431
    const-string v3, "java/lang/invoke/MethodType"

    .line 432
    .line 433
    const-string v4, "parameterCount"

    .line 434
    .line 435
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 436
    .line 437
    .line 438
    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    .line 439
    .line 440
    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 441
    .line 442
    .line 443
    const/16 v2, 0x9a

    .line 444
    .line 445
    invoke-virtual {v1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 446
    .line 447
    .line 448
    const/16 v12, 0xbb

    .line 449
    .line 450
    const-string v13, "java/lang/invoke/ConstantCallSite"

    .line 451
    .line 452
    invoke-virtual {v1, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, v9, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 459
    .line 460
    .line 461
    const-string v5, "()Ljava/lang/Class;"

    .line 462
    .line 463
    const/16 v2, 0xb6

    .line 464
    .line 465
    const-string v3, "java/lang/invoke/MethodType"

    .line 466
    .line 467
    const-string v4, "returnType"

    .line 468
    .line 469
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 470
    .line 471
    .line 472
    const/16 v15, 0xa

    .line 473
    .line 474
    invoke-virtual {v1, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 475
    .line 476
    .line 477
    const-string v5, "()[Ljava/lang/reflect/Constructor;"

    .line 478
    .line 479
    const-string v3, "java/lang/Class"

    .line 480
    .line 481
    const-string v4, "getDeclaredConstructors"

    .line 482
    .line 483
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 484
    .line 485
    .line 486
    const/4 v2, 0x3

    .line 487
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 488
    .line 489
    .line 490
    const/16 v3, 0x32

    .line 491
    .line 492
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 496
    .line 497
    .line 498
    const/16 v2, 0xbd

    .line 499
    .line 500
    invoke-virtual {v1, v2, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 501
    .line 502
    .line 503
    const-string v5, "([Ljava/lang/Object;)Ljava/lang/Object;"

    .line 504
    .line 505
    const/16 v2, 0xb6

    .line 506
    .line 507
    const-string v3, "java/lang/reflect/Constructor"

    .line 508
    .line 509
    const-string v4, "newInstance"

    .line 510
    .line 511
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 512
    .line 513
    .line 514
    const-string v5, "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;"

    .line 515
    .line 516
    const/16 v2, 0xb8

    .line 517
    .line 518
    const-string v3, "java/lang/invoke/MethodHandles"

    .line 519
    .line 520
    const-string v4, "constant"

    .line 521
    .line 522
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 523
    .line 524
    .line 525
    const-string v5, "(Ljava/lang/invoke/MethodHandle;)V"

    .line 526
    .line 527
    const/16 v2, 0xb7

    .line 528
    .line 529
    const-string v3, "java/lang/invoke/ConstantCallSite"

    .line 530
    .line 531
    const-string v4, "<init>"

    .line 532
    .line 533
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 534
    .line 535
    .line 536
    new-instance v14, Lnet/bytebuddy/jar/asm/Label;

    .line 537
    .line 538
    invoke-direct {v14}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 539
    .line 540
    .line 541
    const/16 v2, 0xa7

    .line 542
    .line 543
    invoke-virtual {v1, v2, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 547
    .line 548
    .line 549
    sget-object v25, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 550
    .line 551
    const-string v28, "[B"

    .line 552
    .line 553
    const-string v29, "java/lang/Class"

    .line 554
    .line 555
    const-string v19, "java/lang/invoke/MethodHandles$Lookup"

    .line 556
    .line 557
    const-string v20, "java/lang/String"

    .line 558
    .line 559
    const-string v21, "java/lang/invoke/MethodType"

    .line 560
    .line 561
    const-string v22, "java/lang/invoke/MethodType"

    .line 562
    .line 563
    const-string v23, "java/lang/invoke/MethodHandle"

    .line 564
    .line 565
    const-string v24, "java/lang/invoke/MethodType"

    .line 566
    .line 567
    const-string v26, "java/util/List"

    .line 568
    .line 569
    const-string v27, "java/util/List"

    .line 570
    .line 571
    filled-new-array/range {v19 .. v29}, [Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    const/4 v5, 0x0

    .line 576
    const/4 v6, 0x0

    .line 577
    new-array v6, v6, [Ljava/lang/Object;

    .line 578
    .line 579
    const/4 v2, 0x0

    .line 580
    const/16 v3, 0xb

    .line 581
    .line 582
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1, v12, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 589
    .line 590
    .line 591
    const-string v2, "IMPL_LOOKUP"

    .line 592
    .line 593
    const-string v3, "Ljava/lang/invoke/MethodHandles$Lookup;"

    .line 594
    .line 595
    const-string v4, "java/lang/invoke/MethodHandles$Lookup"

    .line 596
    .line 597
    const/16 v5, 0xb2

    .line 598
    .line 599
    invoke-virtual {v1, v5, v4, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v9, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 603
    .line 604
    .line 605
    const-string v2, "get$Lambda"

    .line 606
    .line 607
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1, v9, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 611
    .line 612
    .line 613
    const-string v5, "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;"

    .line 614
    .line 615
    const/4 v6, 0x0

    .line 616
    const/16 v2, 0xb6

    .line 617
    .line 618
    const-string v3, "java/lang/invoke/MethodHandles$Lookup"

    .line 619
    .line 620
    const-string v4, "findStatic"

    .line 621
    .line 622
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 623
    .line 624
    .line 625
    const-string v5, "(Ljava/lang/invoke/MethodHandle;)V"

    .line 626
    .line 627
    const/16 v2, 0xb7

    .line 628
    .line 629
    const-string v3, "java/lang/invoke/ConstantCallSite"

    .line 630
    .line 631
    const-string v4, "<init>"

    .line 632
    .line 633
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 637
    .line 638
    .line 639
    const-string v2, "java/lang/invoke/CallSite"

    .line 640
    .line 641
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v6

    .line 645
    const/4 v2, 0x4

    .line 646
    const/4 v3, 0x0

    .line 647
    const/4 v4, 0x0

    .line 648
    const/4 v5, 0x1

    .line 649
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    const/16 v2, 0xb0

    .line 653
    .line 654
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 655
    .line 656
    .line 657
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 658
    .line 659
    iget v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->stackSize:I

    .line 660
    .line 661
    invoke-interface {v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->getStackSize()I

    .line 662
    .line 663
    .line 664
    move-result v3

    .line 665
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    iget v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory;->localVariableLength:I

    .line 670
    .line 671
    invoke-interface {v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;->getLocalVariableLength()I

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    invoke-direct {v1, v2, v0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 680
    .line 681
    .line 682
    return-object v1
.end method

.method public abstract onDispatch(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method
