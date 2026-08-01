.class public final Landroidx/appcompat/widget/飘花落叶言子哲世苏兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    const/4 p1, -0x1

    .line 2
    if-eq p3, p1, :cond_0

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->setListSelectionHidden(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    .line 1
    return-void
.end method
