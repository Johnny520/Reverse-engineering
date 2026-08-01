.class final Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DirectBuffers"
.end annotation


# static fields
.field private static cleanMethod:Ljava/lang/reflect/Method;

.field private static cleanerMethod:Ljava/lang/reflect/Method;

.field private static directByteBufferConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "kryo"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x0

    .line 9
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sput-object v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->directByteBufferConstructor:Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v2

    .line 32
    sget-boolean v4, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    const-string v4, "No direct ByteBuffer constructor is available."

    .line 37
    .line 38
    invoke-static {v0, v4, v2}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sput-object v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->directByteBufferConstructor:Ljava/lang/reflect/Constructor;

    .line 42
    .line 43
    :goto_0
    :try_start_1
    const-class v2, Lsun/nio/ch/DirectBuffer;

    .line 44
    .line 45
    const-string v4, "cleaner"

    .line 46
    .line 47
    invoke-virtual {v2, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sput-object v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanerMethod:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanerMethod:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "clean"

    .line 63
    .line 64
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sput-object v1, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanMethod:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception v1

    .line 72
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    const-string v2, "No direct ByteBuffer clean method is available."

    .line 77
    .line 78
    invoke-static {v0, v2, v1}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    sput-object v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanerMethod:Ljava/lang/reflect/Method;

    .line 82
    .line 83
    :goto_1
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000()Ljava/lang/reflect/Constructor;
    .locals 1

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->directByteBufferConstructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanerMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    sget-object v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->cleanMethod:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object v0
.end method
