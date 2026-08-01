.class final enum Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$5;
.super Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
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
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/utility/AsmClassReader$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public make([BZ)Lnet/bytebuddy/utility/AsmClassReader;
    .locals 1

    .line 1
    new-instance p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;

    .line 2
    .line 3
    sget-object p2, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader;->NO_ATTRIBUTES:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 6
    .line 7
    invoke-interface {p2, p1, v0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->make([B[Lnet/bytebuddy/jar/asm/Attribute;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method
