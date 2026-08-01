.class final synthetic Landroidx/compose/ui/platform/AndroidComposeView$contentCaptureManager$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;

    .line 6
    .line 7
    const-string v4, "getContentCaptureSessionCompat"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/compose/ui/contentcapture/飘花落叶言子楪世兰苏哲;
    .locals 2

    .line 1
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1e

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Landroidx/core/os/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/16 v1, 0x1d

    .line 17
    .line 18
    if-lt v0, v1, :cond_2

    .line 19
    .line 20
    invoke-static {p0}, Landroidx/core/os/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v1, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    invoke-direct {v1, v0, p0}, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 35
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView$contentCaptureManager$1;->invoke()Landroidx/compose/ui/contentcapture/飘花落叶言子楪世兰苏哲;

    move-result-object p0

    return-object p0
.end method
