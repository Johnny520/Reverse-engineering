.class public final Lyyds/ᲈᛷᲇᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛶᛵᲈ;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

.field public ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

.field public ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛸᛶ;

.field public ᲀᛲᛳᲀ:Landroid/content/Context;

.field public ᲇᲇᲇᛱ:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public ᲇᲈᛵᛷ:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛷᲇᲁ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lyyds/ᲈᛷᲇᲁ;->ᲇᲈᛵᛷ:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lyyds/ᲈᛷᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 2
    .line 3
    iget-object p2, p0, Lyyds/ᲈᛷᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Lyyds/ᛲᲁᛱᲀ;->ᛵᛸᛸᛷ(I)Lyyds/ᛵᛷᛸᲈ;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p0, p3}, Lyyds/ᛴᛴᛵᛸ;->ᛶᛳᛶᛵ(Landroid/view/MenuItem;Lyyds/ᛳᛶᛵᲈ;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᛱᲈᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛵᛷᛸᲈ;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛲᛴᛳᛲ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛷᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛲᲁᛱᲀ;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛴᛴᛵᛸ;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛷᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lyyds/ᲇᛲᛸᛶ;->ᛵᛸᛸᛷ(Lyyds/ᛴᛴᛵᛸ;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᛵᛱᛴᛲ;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lyyds/ᛴᛴᛵᛸ;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lyyds/ᛴᛴᛵᛸ;->ᲀᛲᛳᲀ:Landroid/content/Context;

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
    new-instance v0, Lyyds/ᲁᲇᛵᛱ;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lyyds/ᲁᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛴᛵᛸ;

    .line 17
    .line 18
    new-instance v2, Lyyds/ᛸᛴᛷᛵ;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lyyds/ᛸᛴᛷᛵ;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lyyds/ᲈᛷᲇᲁ;

    .line 24
    .line 25
    iget-object v4, v2, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lyyds/ᛲᲈᲀᛵ;

    .line 28
    .line 29
    iget-object v5, v4, Lyyds/ᛲᲈᲀᛵ;->ᛲᲈᲁ:Landroid/view/ContextThemeWrapper;

    .line 30
    .line 31
    invoke-direct {v3, v5}, Lyyds/ᲈᛷᲇᲁ;-><init>(Landroid/content/ContextWrapper;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, v0, Lyyds/ᲁᲇᛵᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛷᲇᲁ;

    .line 35
    .line 36
    iput-object v0, v3, Lyyds/ᲈᛷᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 37
    .line 38
    invoke-virtual {p1, v3, v1}, Lyyds/ᛴᛴᛵᛸ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛶᛵᲈ;Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lyyds/ᲁᲇᛵᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛷᲇᲁ;

    .line 42
    .line 43
    iget-object v3, v1, Lyyds/ᲈᛷᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    new-instance v3, Lyyds/ᛲᲁᛱᲀ;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Lyyds/ᛲᲁᛱᲀ;-><init>(Lyyds/ᲈᛷᲇᲁ;)V

    .line 50
    .line 51
    .line 52
    iput-object v3, v1, Lyyds/ᲈᛷᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

    .line 53
    .line 54
    :cond_1
    iput-object v3, v4, Lyyds/ᛲᲈᲀᛵ;->ᛶᛷᛲᲁ:Landroid/widget/ListAdapter;

    .line 55
    .line 56
    iput-object v0, v4, Lyyds/ᛲᲈᲀᛵ;->ᛱᲈᲁ:Landroid/content/DialogInterface$OnClickListener;

    .line 57
    .line 58
    iget-object v1, p1, Lyyds/ᛴᛴᛵᛸ;->ᛶᛳᛶᛵ:Landroid/view/View;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iput-object v1, v4, Lyyds/ᛲᲈᲀᛵ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v1, p1, Lyyds/ᛴᛴᛵᛸ;->ᲇᛱᛲ:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    iput-object v1, v4, Lyyds/ᛲᲈᲀᛵ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    iget-object v1, p1, Lyyds/ᛴᛴᛵᛸ;->ᛳᲁᲁᲇ:Ljava/lang/CharSequence;

    .line 70
    .line 71
    iput-object v1, v4, Lyyds/ᛲᲈᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/CharSequence;

    .line 72
    .line 73
    :goto_0
    iput-object v0, v4, Lyyds/ᛲᲈᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛵᛱ;

    .line 74
    .line 75
    invoke-virtual {v2}, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ()Lyyds/ᛱᲀᛱᲁ;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, v0, Lyyds/ᲁᲇᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲀᛱᲁ;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v0, Lyyds/ᲁᲇᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲀᛱᲁ;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/16 v2, 0x3eb

    .line 95
    .line 96
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 97
    .line 98
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 99
    .line 100
    const/high16 v3, 0x20000

    .line 101
    .line 102
    or-int/2addr v2, v3

    .line 103
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 104
    .line 105
    iget-object v0, v0, Lyyds/ᲁᲇᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᲀᛱᲁ;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lyyds/ᲈᛷᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 111
    .line 112
    if-eqz p0, :cond_3

    .line 113
    .line 114
    invoke-interface {p0, p1}, Lyyds/ᲇᛲᛸᛶ;->ᲀᛲᛳᲀ(Lyyds/ᛴᛴᛵᛸ;)Z

    .line 115
    .line 116
    .line 117
    :cond_3
    const/4 p0, 0x1

    .line 118
    return p0
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᛵᛷᛸᲈ;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛷᲇᲁ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lyyds/ᲈᛷᲇᲁ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᲈᛷᲇᲁ;->ᲇᲈᛵᛷ:Landroid/view/LayoutInflater;

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
    iput-object p1, p0, Lyyds/ᲈᛷᲇᲁ;->ᲇᲈᛵᛷ:Landroid/view/LayoutInflater;

    .line 16
    .line 17
    :cond_0
    iput-object p2, p0, Lyyds/ᲈᛷᲇᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛴᛵᛸ;

    .line 18
    .line 19
    iget-object p0, p0, Lyyds/ᲈᛷᲇᲁ;->ᛱᲈᲁ:Lyyds/ᛲᲁᛱᲀ;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lyyds/ᛲᲁᛱᲀ;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᲇᛲᛸᛶ;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
