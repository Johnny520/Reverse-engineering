.class public final L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:Landroid/widget/ProgressBar;

.field public 飘花落叶言子楪兰苏世哲:J

.field public final 飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

.field public final 飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
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
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 9
    .line 10
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, p0, v2}, Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const v1, 0x240c00db

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p1, v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const v0, 0x24090243

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/widget/TextView;

    .line 41
    .line 42
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/TextView;

    .line 43
    .line 44
    const v0, 0x24090242

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/TextView;

    .line 52
    .line 53
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroid/widget/TextView;

    .line 54
    .line 55
    const v0, 0x24090240

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/widget/ProgressBar;

    .line 63
    .line 64
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Landroid/widget/ProgressBar;

    .line 65
    .line 66
    const v0, 0x24090241

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Landroid/widget/TextView;

    .line 74
    .line 75
    iput-object v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/widget/TextView;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    int-to-double v0, p1

    .line 85
    const-wide v2, 0x3fe999999999999aL    # 0.8

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    mul-double/2addr v0, v2

    .line 91
    double-to-int p1, v0

    .line 92
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 93
    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 6
    .line 7
    return-void
.end method

.method public final show()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 9
    .line 10
    new-instance v0, Ljava/lang/Thread;

    .line 11
    .line 12
    new-instance v1, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
