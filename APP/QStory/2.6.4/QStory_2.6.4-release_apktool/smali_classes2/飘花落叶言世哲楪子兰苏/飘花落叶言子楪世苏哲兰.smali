.class public final L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroid/widget/ProgressBar;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const v0, 0x24130610

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const v2, 0x240c00f9

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const v0, 0x240902f8

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 30
    .line 31
    const v0, 0x240902f7

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/widget/ProgressBar;

    .line 39
    .line 40
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroid/widget/ProgressBar;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-double v0, p1

    .line 50
    const-wide v2, 0x3fea3d70a3d70a3dL    # 0.82

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-double/2addr v0, v2

    .line 56
    double-to-int p1, v0

    .line 57
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
