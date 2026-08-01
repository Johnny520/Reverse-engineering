.class public final Lcom/lxj/xpopup/core/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;->dismiss()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
