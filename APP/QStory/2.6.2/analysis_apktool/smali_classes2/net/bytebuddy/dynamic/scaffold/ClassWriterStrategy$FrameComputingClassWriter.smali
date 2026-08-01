.class public Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$FrameComputingClassWriter;
.super Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FrameComputingClassWriter"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>(ILnet/bytebuddy/pool/TypePool;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;-><init>(ILnet/bytebuddy/pool/TypePool;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassReader;ILnet/bytebuddy/pool/TypePool;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;ILnet/bytebuddy/pool/TypePool;)V

    return-void
.end method
