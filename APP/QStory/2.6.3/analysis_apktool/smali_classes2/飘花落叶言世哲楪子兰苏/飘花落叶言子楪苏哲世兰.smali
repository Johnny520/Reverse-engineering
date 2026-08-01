.class public L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;


# direct methods
.method public constructor <init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    iget-object p1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v0, Landroid/content/Intent;

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 8
    .line 9
    const-class v1, Ltop/suzhelan/qstory/ui/activity/SettingActivity;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
