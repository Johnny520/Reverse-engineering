.class final enum Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$1;
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
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->access$100()Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->IMPLICIT:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ASM_FIRST:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->access$100()Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([BZ)Lnet/bytebuddy/utility/AsmClassReader;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
