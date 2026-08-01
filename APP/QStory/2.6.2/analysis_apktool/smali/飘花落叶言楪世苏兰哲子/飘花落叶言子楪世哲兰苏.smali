.class public final L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/view/View;


# direct methods
.method public constructor <init>(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDraw()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰()Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
