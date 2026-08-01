.class public Lnet/bytebuddy/dynamic/scaffold/ClassWriterStrategy$FrameComputingClassWriter;
.super Lnet/bytebuddy/utility/AsmClassWriter$FrameComputingClassWriter;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
