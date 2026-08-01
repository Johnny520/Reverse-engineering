.class final Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
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
    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 35
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世楪兰:Landroid/view/MotionEvent;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iput-wide v1, v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世兰楪:J

    .line 26
    .line 27
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventOnLayout$1;->this$0:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲兰世楪苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
