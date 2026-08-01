.class public Llin/xposed/hook/view/main/itemview/base/DefaultItemView;
.super Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public leftText:Landroid/widget/TextView;

.field public tipsText:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Llin/xposed/hook/view/main/itemview/base/DefaultItemView;->onCreate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 2
    .line 3
    const v1, 0x24090083

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object v0, p0, Llin/xposed/hook/view/main/itemview/base/DefaultItemView;->leftText:Landroid/widget/TextView;

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 15
    .line 16
    const v1, 0x24090084

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v0, p0, Llin/xposed/hook/view/main/itemview/base/DefaultItemView;->tipsText:Landroid/widget/TextView;

    .line 26
    .line 27
    return-void
.end method
