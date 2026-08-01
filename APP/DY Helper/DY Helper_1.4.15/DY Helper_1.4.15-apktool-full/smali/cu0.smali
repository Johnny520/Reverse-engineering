.class public final Lcu0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Luz0;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public ε:Landroid/content/Context;

.field public ζ:Landroid/view/LayoutInflater;

.field public η:Liz0;

.field public θ:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public ι:Ltz0;

.field public κ:Lbu0;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcu0;->ε:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcu0;->ζ:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcu0;->η:Liz0;

    .line 2
    .line 3
    iget-object p2, p0, Lcu0;->κ:Lbu0;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Lbu0;->β(I)Llz0;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p0, p3}, Liz0;->ρ(Landroid/view/MenuItem;Luz0;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final α(Liz0;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcu0;->ι:Ltz0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ltz0;->α(Liz0;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final γ(Llz0;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ε(Ltz0;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ζ(Llz0;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final η()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcu0;->κ:Lbu0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbu0;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final ι(Landroid/content/Context;Liz0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcu0;->ε:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcu0;->ε:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p0, Lcu0;->ζ:Landroid/view/LayoutInflater;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcu0;->ζ:Landroid/view/LayoutInflater;

    .line 16
    .line 17
    :cond_0
    iput-object p2, p0, Lcu0;->η:Liz0;

    .line 18
    .line 19
    iget-object p0, p0, Lcu0;->κ:Lbu0;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lbu0;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final κ(Lb12;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Liz0;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Liz0;->α:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    new-instance v0, Ljz0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Ljz0;->ε:Lb12;

    .line 17
    .line 18
    new-instance v2, Lv;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lv;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lcu0;

    .line 24
    .line 25
    iget-object v4, v2, Lv;->β:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lr;

    .line 28
    .line 29
    iget-object v5, v4, Lr;->α:Landroid/view/ContextThemeWrapper;

    .line 30
    .line 31
    invoke-direct {v3, v5}, Lcu0;-><init>(Landroid/content/ContextWrapper;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, v0, Ljz0;->η:Lcu0;

    .line 35
    .line 36
    iput-object v0, v3, Lcu0;->ι:Ltz0;

    .line 37
    .line 38
    invoke-virtual {p1, v3, v1}, Liz0;->β(Luz0;Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Ljz0;->η:Lcu0;

    .line 42
    .line 43
    iget-object v3, v1, Lcu0;->κ:Lbu0;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    new-instance v3, Lbu0;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Lbu0;-><init>(Lcu0;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v1, Lcu0;->κ:Lbu0;

    .line 53
    .line 54
    :cond_1
    iget-object v1, v1, Lcu0;->κ:Lbu0;

    .line 55
    .line 56
    iput-object v1, v4, Lr;->η:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v0, v4, Lr;->θ:Landroid/content/DialogInterface$OnClickListener;

    .line 59
    .line 60
    iget-object v1, p1, Liz0;->ο:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    iput-object v1, v4, Lr;->ε:Landroid/view/View;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v1, p1, Liz0;->ξ:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    iput-object v1, v4, Lr;->γ:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    iget-object v1, p1, Liz0;->ν:Ljava/lang/CharSequence;

    .line 72
    .line 73
    iput-object v1, v4, Lr;->δ:Ljava/lang/CharSequence;

    .line 74
    .line 75
    :goto_0
    iput-object v0, v4, Lr;->ζ:Ljz0;

    .line 76
    .line 77
    invoke-virtual {v2}, Lv;->γ()Lw;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, v0, Ljz0;->ζ:Lw;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Ljz0;->ζ:Lw;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/16 v2, 0x3eb

    .line 97
    .line 98
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 99
    .line 100
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 101
    .line 102
    const/high16 v3, 0x20000

    .line 103
    .line 104
    or-int/2addr v2, v3

    .line 105
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 106
    .line 107
    iget-object v0, v0, Ljz0;->ζ:Lw;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, Lcu0;->ι:Ltz0;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-interface {p0, p1}, Ltz0;->λ(Liz0;)Z

    .line 117
    .line 118
    .line 119
    :cond_3
    const/4 p0, 0x1

    .line 120
    return p0
.end method

.method public final λ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
