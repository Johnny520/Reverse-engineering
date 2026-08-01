.class final enum Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration$1;
.super Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;-><init>(Ljava/lang/String;IZLnet/bytebuddy/implementation/Implementation$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public generate(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 0
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

    .line 1
    move-object p0, p1

    .line 2
    move p1, p2

    .line 3
    move p2, p5

    .line 4
    move-object p5, p4

    .line 5
    move p4, p3

    .line 6
    move-object p3, p6

    .line 7
    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
