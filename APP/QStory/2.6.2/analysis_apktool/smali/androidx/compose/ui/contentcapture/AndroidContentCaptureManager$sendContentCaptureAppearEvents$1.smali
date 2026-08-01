.class final Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "index",
        "Landroidx/compose/ui/semantics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
        "child",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(ILandroidx/compose/ui/semantics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $oldNode:Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;

.field final synthetic this$0:Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->$oldNode:Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->this$0:Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->invoke(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->$oldNode:Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/ui/platform/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    iget v1, p2, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/collection/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->this$0:Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(ILandroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$sendContentCaptureAppearEvents$1;->this$0:Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/compose/ui/contentcapture/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 21
    .line 22
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
