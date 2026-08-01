.class final enum Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$4;
.super Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    .locals 1

    .line 1
    const-class p0, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 2
    .line 3
    invoke-interface {p2, p0}, Lnet/bytebuddy/utility/AsmClassReader;->unwrap(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 8
    .line 9
    new-instance p2, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;

    .line 14
    .line 15
    invoke-direct {p0, p1, p3}, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;-><init>(ILnet/bytebuddy/pool/TypePool;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1, p3}, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;ILnet/bytebuddy/pool/TypePool;)V

    .line 22
    .line 23
    .line 24
    move-object p0, v0

    .line 25
    :goto_0
    invoke-direct {p2, p0}, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method
