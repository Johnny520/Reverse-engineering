.class final Landroidx/compose/ui/platform/AndroidComposeView$textInputSession$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "it",
        "Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u54f2\u5170\u696a;",
        "invoke",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)Landroidx/compose/ui/platform/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u54f2\u5170\u696a;",
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
.field final synthetic this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView$textInputSession$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView$textInputSession$2;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getTextInputService()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1, p1}, Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;-><init>(Landroid/view/View;Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲苏世;Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView$textInputSession$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/compose/ui/platform/飘花落叶言子世苏哲兰楪;

    move-result-object p0

    return-object p0
.end method
