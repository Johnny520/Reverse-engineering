.class public final Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->resumeWith(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
