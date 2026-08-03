.class final enum Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$2;
.super Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;-><init>(Ljava/lang/String;IZLnet/bytebuddy/implementation/Implementation$1;)V

    return-void
.end method


# virtual methods
.method public generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 6
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p8    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v1, -0x1

    move-object v0, p1

    move v2, p7

    move-object v3, p8

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method
