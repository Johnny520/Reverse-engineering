.class final enum Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$5;
.super Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/utility/AsmClassWriter$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 3

    .line 1
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;->access$200()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;->access$200()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p2, p0}, Lnet/bytebuddy/utility/AsmClassReader;->unwrap(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    new-instance p0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;

    .line 20
    .line 21
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->access$300()Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    sget-object v0, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;->GET_SUPER_CLASS:Ljava/lang/reflect/Method;

    .line 26
    .line 27
    new-instance v1, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;

    .line 28
    .line 29
    invoke-direct {v1, p3}, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;-><init>(Lnet/bytebuddy/pool/TypePool;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, p1, v0, v1}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;->make(ILjava/lang/reflect/Method;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    new-instance p2, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;

    .line 41
    .line 42
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->access$300()Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;->GET_SUPER_CLASS:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    new-instance v2, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;

    .line 49
    .line 50
    invoke-direct {v2, p3}, Lnet/bytebuddy/utility/AsmClassWriter$SuperClassResolvingJdkClassWriter;-><init>(Lnet/bytebuddy/pool/TypePool;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p0, p1, v1, v2}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;->make(Ljava/lang/Object;ILjava/lang/reflect/Method;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {p2, p0}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 58
    .line 59
    .line 60
    return-object p2
.end method
