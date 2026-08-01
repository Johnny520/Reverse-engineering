.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Lzl1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljm1;


# instance fields
.field public final λ:I

.field public final μ:[Lvz1;

.field public final ν:Lр;

.field public final ξ:Lр;

.field public final ο:I

.field public final π:Llq0;

.field public final ρ:Z

.field public final σ:Z

.field public final τ:Ljava/util/BitSet;

.field public final υ:Luc0;

.field public final φ:I

.field public χ:Z

.field public final ψ:Z

.field public final ω:Ld1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lzl1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ρ:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 11
    .line 12
    new-instance v1, Luc0;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->υ:Luc0;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->φ:I

    .line 21
    .line 22
    new-instance v2, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lrk0;

    .line 28
    .line 29
    const/16 v3, 0x1c

    .line 30
    .line 31
    invoke-direct {v2, v3, p0}, Lrk0;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 36
    .line 37
    new-instance v3, Ld1;

    .line 38
    .line 39
    const/16 v4, 0x9

    .line 40
    .line 41
    invoke-direct {v3, v4, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ω:Ld1;

    .line 45
    .line 46
    invoke-static {p1, p2, p3, p4}, Lzl1;->Α(Landroid/content/Context;Landroid/util/AttributeSet;II)Las0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget p2, p1, Las0;->β:I

    .line 51
    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    if-ne p2, v2, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p0, "invalid orientation."

    .line 58
    .line 59
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0

    .line 64
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 65
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->β(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 69
    .line 70
    if-ne p2, p4, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 74
    .line 75
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 76
    .line 77
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ξ:Lр;

    .line 78
    .line 79
    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 80
    .line 81
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ξ:Lр;

    .line 82
    .line 83
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 84
    .line 85
    .line 86
    :goto_1
    iget p2, p1, Las0;->γ:I

    .line 87
    .line 88
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->β(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 92
    .line 93
    if-eq p2, p4, :cond_4

    .line 94
    .line 95
    invoke-virtual {v1}, Luc0;->β()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 99
    .line 100
    .line 101
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 102
    .line 103
    new-instance p2, Ljava/util/BitSet;

    .line 104
    .line 105
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 106
    .line 107
    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->τ:Ljava/util/BitSet;

    .line 111
    .line 112
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 113
    .line 114
    new-array p2, p2, [Lvz1;

    .line 115
    .line 116
    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 117
    .line 118
    move p2, v0

    .line 119
    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 120
    .line 121
    if-ge p2, p4, :cond_3

    .line 122
    .line 123
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 124
    .line 125
    new-instance v1, Lvz1;

    .line 126
    .line 127
    invoke-direct {v1, p0, p2}, Lvz1;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    .line 128
    .line 129
    .line 130
    aput-object v1, p4, p2

    .line 131
    .line 132
    add-int/lit8 p2, p2, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-boolean p1, p1, Las0;->δ:Z

    .line 139
    .line 140
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->β(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ρ:Z

    .line 144
    .line 145
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 146
    .line 147
    .line 148
    new-instance p1, Llq0;

    .line 149
    .line 150
    const/4 p2, 0x0

    .line 151
    invoke-direct {p1, p2}, Llq0;-><init>(I)V

    .line 152
    .line 153
    .line 154
    iput-boolean v2, p1, Llq0;->θ:Z

    .line 155
    .line 156
    iput v0, p1, Llq0;->ζ:I

    .line 157
    .line 158
    iput v0, p1, Llq0;->η:I

    .line 159
    .line 160
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->π:Llq0;

    .line 161
    .line 162
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 163
    .line 164
    invoke-static {p0, p1}, Lр;->ε(Lzl1;I)Lр;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 169
    .line 170
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 171
    .line 172
    sub-int/2addr v2, p1

    .line 173
    invoke-static {p0, v2}, Lр;->ε(Lzl1;I)Lр;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ξ:Lр;

    .line 178
    .line 179
    return-void
.end method


# virtual methods
.method public final Β(Lfm1;Lkm1;)I
    .locals 0

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 6
    .line 7
    invoke-virtual {p2}, Lkm1;->α()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, -0x1

    .line 17
    return p0
.end method

.method public final Δ()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->φ:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final Ε()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ρ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final Ζ(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lzl1;->Ζ(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 10
    .line 11
    aget-object v1, v1, v0

    .line 12
    .line 13
    iget v2, v1, Lvz1;->β:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    add-int/2addr v2, p1

    .line 20
    iput v2, v1, Lvz1;->β:I

    .line 21
    .line 22
    :cond_0
    iget v2, v1, Lvz1;->γ:I

    .line 23
    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    add-int/2addr v2, p1

    .line 27
    iput v2, v1, Lvz1;->γ:I

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method

.method public final Η(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lzl1;->Η(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 10
    .line 11
    aget-object v1, v1, v0

    .line 12
    .line 13
    iget v2, v1, Lvz1;->β:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    add-int/2addr v2, p1

    .line 20
    iput v2, v1, Lvz1;->β:I

    .line 21
    .line 22
    :cond_0
    iget v2, v1, Lvz1;->γ:I

    .line 23
    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    add-int/2addr v2, p1

    .line 27
    iput v2, v1, Lvz1;->γ:I

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method

.method public final Θ()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->υ:Luc0;

    .line 2
    .line 3
    invoke-virtual {v0}, Luc0;->β()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 12
    .line 13
    aget-object v1, v1, v0

    .line 14
    .line 15
    invoke-virtual {v1}, Lvz1;->β()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public final Ι(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ω:Ld1;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 16
    .line 17
    aget-object v1, v1, v0

    .line 18
    .line 19
    invoke-virtual {v1}, Lvz1;->β()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final Κ(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lzl1;->Κ(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-lez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lam1;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0

    .line 35
    :cond_1
    :goto_0
    return-void
.end method

.method public final Λ(Lfm1;Lkm1;Lэ;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lzl1;->Λ(Lfm1;Lkm1;Lэ;)V

    .line 2
    .line 3
    .line 4
    const-string p0, "androidx.recyclerview.widget.StaggeredGridLayoutManager"

    .line 5
    .line 6
    invoke-virtual {p3, p0}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Μ()Landroid/os/Parcelable;
    .locals 5

    .line 1
    new-instance v0, Luz1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ρ:Z

    .line 7
    .line 8
    iput-boolean v1, v0, Luz1;->μ:Z

    .line 9
    .line 10
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->χ:Z

    .line 11
    .line 12
    iput-boolean v1, v0, Luz1;->ν:Z

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Luz1;->ξ:Z

    .line 16
    .line 17
    iput v1, v0, Luz1;->ι:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, -0x1

    .line 24
    if-lez v2, :cond_6

    .line 25
    .line 26
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->χ:Z

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->е()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->д()V

    .line 35
    .line 36
    .line 37
    :goto_0
    iput v1, v0, Luz1;->ε:I

    .line 38
    .line 39
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :goto_1
    if-nez v2, :cond_5

    .line 54
    .line 55
    iput v3, v0, Luz1;->ζ:I

    .line 56
    .line 57
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 58
    .line 59
    iput v2, v0, Luz1;->η:I

    .line 60
    .line 61
    new-array v2, v2, [I

    .line 62
    .line 63
    iput-object v2, v0, Luz1;->θ:[I

    .line 64
    .line 65
    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 66
    .line 67
    if-ge v1, v2, :cond_4

    .line 68
    .line 69
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->χ:Z

    .line 70
    .line 71
    const/high16 v3, -0x80000000

    .line 72
    .line 73
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    aget-object v2, v4, v1

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lvz1;->γ(I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eq v2, v3, :cond_3

    .line 84
    .line 85
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 86
    .line 87
    invoke-virtual {v3}, Lр;->λ()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    :goto_3
    sub-int/2addr v2, v3

    .line 92
    goto :goto_4

    .line 93
    :cond_2
    aget-object v2, v4, v1

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Lvz1;->δ(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eq v2, v3, :cond_3

    .line 100
    .line 101
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 102
    .line 103
    invoke-virtual {v3}, Lр;->π()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    :goto_4
    iget-object v3, v0, Luz1;->θ:[I

    .line 109
    .line 110
    aput v2, v3, v1

    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    return-object v0

    .line 116
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Lam1;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    throw p0

    .line 127
    :cond_6
    iput v3, v0, Luz1;->ε:I

    .line 128
    .line 129
    iput v3, v0, Luz1;->ζ:I

    .line 130
    .line 131
    iput v1, v0, Luz1;->η:I

    .line 132
    .line 133
    return-object v0
.end method

.method public final Ν(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->а()Z

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final Τ(ILfm1;Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->й(ILfm1;Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final Υ(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Φ(ILfm1;Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->й(ILfm1;Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final Ψ(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    new-instance v0, Lds0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lds0;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, v0, Lds0;->α:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lzl1;->Ω(Lds0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final α(I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->д()V

    .line 14
    .line 15
    .line 16
    if-gez p1, :cond_1

    .line 17
    .line 18
    move p1, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 22
    .line 23
    if-eq p1, v0, :cond_3

    .line 24
    .line 25
    :cond_2
    const/4 v1, -0x1

    .line 26
    :cond_3
    :goto_1
    new-instance p1, Landroid/graphics/PointF;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 29
    .line 30
    .line 31
    if-nez v1, :cond_4

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_4
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    if-nez p0, :cond_5

    .line 39
    .line 40
    int-to-float p0, v1

    .line 41
    iput p0, p1, Landroid/graphics/PointF;->x:F

    .line 42
    .line 43
    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_5
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    int-to-float p0, v1

    .line 49
    iput p0, p1, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    return-object p1
.end method

.method public final β(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->β(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final γ()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final δ()Z
    .locals 1

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final ε(Lam1;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lsz1;

    .line 2
    .line 3
    return p0
.end method

.method public final η(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Lj81;->π(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final θ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ι(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Lj81;->ρ(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final κ(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Lj81;->π(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final λ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final μ(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Lj81;->ρ(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final ξ()Lam1;
    .locals 2

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, -0x2

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lsz1;

    .line 8
    .line 9
    invoke-direct {p0, v1, v0}, Lam1;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lsz1;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lam1;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final ο(Landroid/content/Context;Landroid/util/AttributeSet;)Lam1;
    .locals 0

    .line 1
    new-instance p0, Lsz1;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lam1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final π(Landroid/view/ViewGroup$LayoutParams;)Lam1;
    .locals 0

    .line 1
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lsz1;

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lam1;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lsz1;

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lam1;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final τ(Lfm1;Lkm1;)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 7
    .line 8
    invoke-virtual {p2}, Lkm1;->α()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final а()Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_11

    .line 7
    .line 8
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->φ:I

    .line 9
    .line 10
    if-eqz v0, :cond_11

    .line 11
    .line 12
    iget-boolean v0, p0, Lzl1;->ζ:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_a

    .line 17
    .line 18
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->е()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->д()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->д()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->е()V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v2, v0, -0x1

    .line 40
    .line 41
    new-instance v3, Ljava/util/BitSet;

    .line 42
    .line 43
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 49
    .line 50
    const/4 v5, 0x1

    .line 51
    invoke-virtual {v3, v1, v4, v5}, Ljava/util/BitSet;->set(IIZ)V

    .line 52
    .line 53
    .line 54
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ο:I

    .line 55
    .line 56
    const/4 v6, -0x1

    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    iget-object v4, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    const/4 v7, 0x1

    .line 66
    if-ne v4, v7, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v7, 0x0

    .line 70
    :goto_1
    if-eqz v7, :cond_3

    .line 71
    .line 72
    move v4, v5

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v4, v6

    .line 75
    :goto_2
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 76
    .line 77
    if-eqz v7, :cond_4

    .line 78
    .line 79
    move v0, v6

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move v2, v1

    .line 82
    :goto_3
    if-ge v2, v0, :cond_5

    .line 83
    .line 84
    move v6, v5

    .line 85
    :cond_5
    if-eq v2, v0, :cond_10

    .line 86
    .line 87
    invoke-virtual {p0, v2}, Lzl1;->ρ(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Lsz1;

    .line 96
    .line 97
    iget-object v9, v8, Lsz1;->γ:Lvz1;

    .line 98
    .line 99
    iget v9, v9, Lvz1;->δ:I

    .line 100
    .line 101
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->get(I)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_a

    .line 106
    .line 107
    iget-object v9, v8, Lsz1;->γ:Lvz1;

    .line 108
    .line 109
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 110
    .line 111
    const/high16 v11, -0x80000000

    .line 112
    .line 113
    if-eqz v10, :cond_7

    .line 114
    .line 115
    iget v10, v9, Lvz1;->γ:I

    .line 116
    .line 117
    if-eq v10, v11, :cond_6

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    invoke-virtual {v9}, Lvz1;->α()V

    .line 121
    .line 122
    .line 123
    iget v10, v9, Lvz1;->γ:I

    .line 124
    .line 125
    :goto_4
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 126
    .line 127
    invoke-virtual {v11}, Lр;->λ()I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-ge v10, v11, :cond_9

    .line 132
    .line 133
    iget-object v0, v9, Lvz1;->α:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    sub-int/2addr v2, v5

    .line 140
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Landroid/view/View;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lsz1;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    goto/16 :goto_9

    .line 156
    .line 157
    :cond_7
    iget v10, v9, Lvz1;->β:I

    .line 158
    .line 159
    iget-object v12, v9, Lvz1;->α:Ljava/util/ArrayList;

    .line 160
    .line 161
    if-eq v10, v11, :cond_8

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_8
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    check-cast v10, Landroid/view/View;

    .line 169
    .line 170
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    check-cast v11, Lsz1;

    .line 175
    .line 176
    iget-object v13, v9, Lvz1;->ε:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 177
    .line 178
    iget-object v13, v13, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 179
    .line 180
    invoke-virtual {v13, v10}, Lр;->ι(Landroid/view/View;)I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    iput v10, v9, Lvz1;->β:I

    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget v10, v9, Lvz1;->β:I

    .line 190
    .line 191
    :goto_5
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 192
    .line 193
    invoke-virtual {v9}, Lр;->π()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-le v10, v9, :cond_9

    .line 198
    .line 199
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Landroid/view/View;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Lsz1;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_9
    iget-object v9, v8, Lsz1;->γ:Lvz1;

    .line 216
    .line 217
    iget v9, v9, Lvz1;->δ:I

    .line 218
    .line 219
    invoke-virtual {v3, v9}, Ljava/util/BitSet;->clear(I)V

    .line 220
    .line 221
    .line 222
    :cond_a
    add-int/2addr v2, v6

    .line 223
    if-eq v2, v0, :cond_5

    .line 224
    .line 225
    invoke-virtual {p0, v2}, Lzl1;->ρ(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 230
    .line 231
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 232
    .line 233
    if-eqz v10, :cond_c

    .line 234
    .line 235
    invoke-virtual {v11, v7}, Lр;->θ(Landroid/view/View;)I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 240
    .line 241
    invoke-virtual {v11, v9}, Lр;->θ(Landroid/view/View;)I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    if-ge v10, v11, :cond_b

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_b
    if-ne v10, v11, :cond_5

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_c
    invoke-virtual {v11, v7}, Lр;->ι(Landroid/view/View;)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 256
    .line 257
    invoke-virtual {v11, v9}, Lр;->ι(Landroid/view/View;)I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    if-le v10, v11, :cond_d

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_d
    if-ne v10, v11, :cond_5

    .line 265
    .line 266
    :goto_6
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    check-cast v9, Lsz1;

    .line 271
    .line 272
    iget-object v8, v8, Lsz1;->γ:Lvz1;

    .line 273
    .line 274
    iget v8, v8, Lvz1;->δ:I

    .line 275
    .line 276
    iget-object v9, v9, Lsz1;->γ:Lvz1;

    .line 277
    .line 278
    iget v9, v9, Lvz1;->δ:I

    .line 279
    .line 280
    sub-int/2addr v8, v9

    .line 281
    if-gez v8, :cond_e

    .line 282
    .line 283
    move v8, v5

    .line 284
    goto :goto_7

    .line 285
    :cond_e
    move v8, v1

    .line 286
    :goto_7
    if-gez v4, :cond_f

    .line 287
    .line 288
    move v9, v5

    .line 289
    goto :goto_8

    .line 290
    :cond_f
    move v9, v1

    .line 291
    :goto_8
    if-eq v8, v9, :cond_5

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_10
    const/4 v7, 0x0

    .line 295
    :goto_9
    if-eqz v7, :cond_11

    .line 296
    .line 297
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->υ:Luc0;

    .line 298
    .line 299
    invoke-virtual {v0}, Luc0;->β()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 303
    .line 304
    .line 305
    return v5

    .line 306
    :cond_11
    :goto_a
    return v1
.end method

.method public final б(Lkm1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ψ:Z

    .line 9
    .line 10
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->г(Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->в(Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Lkm1;->α()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lam1;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final в(Z)Landroid/view/View;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 2
    .line 3
    invoke-virtual {v0}, Lр;->π()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 8
    .line 9
    invoke-virtual {v1}, Lр;->λ()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ltz v2, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lzl1;->ρ(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Lр;->ι(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, Lр;->θ(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-le v6, v0, :cond_3

    .line 39
    .line 40
    if-lt v5, v1, :cond_0

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_0
    if-le v6, v1, :cond_2

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-nez v3, :cond_3

    .line 49
    .line 50
    move-object v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_1
    return-object v4

    .line 53
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    return-object v3
.end method

.method public final г(Z)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 2
    .line 3
    invoke-virtual {v0}, Lр;->π()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 8
    .line 9
    invoke-virtual {v1}, Lр;->λ()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    :goto_0
    if-ge v4, v2, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lzl1;->ρ(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Lр;->ι(Landroid/view/View;)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 32
    .line 33
    invoke-virtual {v7, v5}, Lр;->θ(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-le v7, v0, :cond_3

    .line 38
    .line 39
    if-lt v6, v1, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    if-ge v6, v0, :cond_2

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    if-nez v3, :cond_3

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    :goto_1
    return-object v5

    .line 52
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    return-object v3
.end method

.method public final д()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lzl1;->ω(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public final е()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lzl1;->ω(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public final ж(Llq0;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Llq0;->θ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p1, Llq0;->ι:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget v0, p1, Llq0;->β:I

    .line 12
    .line 13
    iget v1, p1, Llq0;->ε:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    iget p1, p1, Llq0;->η:I

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->з(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget p1, p1, Llq0;->ζ:I

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->и(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    const/4 v0, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    if-ne v1, v2, :cond_6

    .line 35
    .line 36
    iget v1, p1, Llq0;->ζ:I

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 39
    .line 40
    aget-object v2, v2, v3

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lvz1;->δ(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 47
    .line 48
    if-ge v0, v3, :cond_4

    .line 49
    .line 50
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 51
    .line 52
    aget-object v3, v3, v0

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Lvz1;->δ(I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-le v3, v2, :cond_3

    .line 59
    .line 60
    move v2, v3

    .line 61
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr v1, v2

    .line 65
    iget v0, p1, Llq0;->η:I

    .line 66
    .line 67
    if-gez v1, :cond_5

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    iget p1, p1, Llq0;->β:I

    .line 71
    .line 72
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    sub-int/2addr v0, p1

    .line 77
    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->з(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    iget v1, p1, Llq0;->η:I

    .line 82
    .line 83
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 84
    .line 85
    aget-object v2, v2, v3

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lvz1;->γ(I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    :goto_2
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 92
    .line 93
    if-ge v0, v3, :cond_8

    .line 94
    .line 95
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 96
    .line 97
    aget-object v3, v3, v0

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lvz1;->γ(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-ge v3, v2, :cond_7

    .line 104
    .line 105
    move v2, v3

    .line 106
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_8
    iget v0, p1, Llq0;->η:I

    .line 110
    .line 111
    sub-int/2addr v2, v0

    .line 112
    iget v0, p1, Llq0;->ζ:I

    .line 113
    .line 114
    if-gez v2, :cond_9

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_9
    iget p1, p1, Llq0;->β:I

    .line 118
    .line 119
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    add-int/2addr v0, p1

    .line 124
    :goto_3
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->и(I)V

    .line 125
    .line 126
    .line 127
    :cond_a
    :goto_4
    return-void
.end method

.method public final з(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lр;->ι(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lt v2, p1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lр;->υ(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-lt p0, p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lsz1;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lsz1;->γ:Lvz1;

    .line 39
    .line 40
    iget-object p1, p1, Lvz1;->α:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-ne p1, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p0, p0, Lsz1;->γ:Lvz1;

    .line 50
    .line 51
    iget-object p0, p0, Lvz1;->α:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    sub-int/2addr p1, v1

    .line 58
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Landroid/view/View;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lsz1;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lsz1;->γ:Lvz1;

    .line 72
    .line 73
    throw p1

    .line 74
    :cond_1
    :goto_0
    return-void
.end method

.method public final и(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lр;->θ(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-gt v2, p1, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lр;->τ(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-gt p0, p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lsz1;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lsz1;->γ:Lvz1;

    .line 38
    .line 39
    iget-object p1, p1, Lvz1;->α:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/4 v1, 0x1

    .line 46
    if-ne p1, v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p0, p0, Lsz1;->γ:Lvz1;

    .line 50
    .line 51
    iget-object p1, p0, Lvz1;->α:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lsz1;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-object v1, v0, Lsz1;->γ:Lvz1;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    const/high16 p1, -0x80000000

    .line 75
    .line 76
    iput p1, p0, Lvz1;->γ:I

    .line 77
    .line 78
    :cond_1
    throw v1

    .line 79
    :cond_2
    :goto_0
    return-void
.end method

.method public final й(ILfm1;Lkm1;)I
    .locals 14

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1e

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_13

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    const/4 v2, -0x1

    .line 14
    if-lez p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->е()V

    .line 17
    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->д()V

    .line 22
    .line 23
    .line 24
    move v3, v2

    .line 25
    :goto_0
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->π:Llq0;

    .line 26
    .line 27
    iput-boolean v0, v4, Llq0;->θ:Z

    .line 28
    .line 29
    iput v1, v4, Llq0;->β:I

    .line 30
    .line 31
    iput v1, v4, Llq0;->γ:I

    .line 32
    .line 33
    iget-object v5, p0, Lzl1;->ε:Lds0;

    .line 34
    .line 35
    if-eqz v5, :cond_4

    .line 36
    .line 37
    iget-boolean v5, v5, Lds0;->ε:Z

    .line 38
    .line 39
    if-eqz v5, :cond_4

    .line 40
    .line 41
    move-object/from16 v5, p3

    .line 42
    .line 43
    iget v6, v5, Lkm1;->α:I

    .line 44
    .line 45
    if-eq v6, v2, :cond_5

    .line 46
    .line 47
    if-gez v6, :cond_2

    .line 48
    .line 49
    move v6, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 53
    .line 54
    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 55
    .line 56
    if-ne v7, v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v8}, Lр;->σ()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    move v7, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-virtual {v8}, Lр;->σ()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    move v7, v6

    .line 69
    move v6, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move-object/from16 v5, p3

    .line 72
    .line 73
    :cond_5
    move v6, v1

    .line 74
    move v7, v6

    .line 75
    :goto_2
    iget-object v8, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    iget-boolean v8, v8, Landroidx/recyclerview/widget/RecyclerView;->λ:Z

    .line 80
    .line 81
    if-eqz v8, :cond_6

    .line 82
    .line 83
    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 84
    .line 85
    invoke-virtual {v8}, Lр;->π()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    sub-int/2addr v8, v7

    .line 90
    iput v8, v4, Llq0;->ζ:I

    .line 91
    .line 92
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 93
    .line 94
    invoke-virtual {v7}, Lр;->λ()I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    add-int/2addr v7, v6

    .line 99
    iput v7, v4, Llq0;->η:I

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 103
    .line 104
    invoke-virtual {v8}, Lр;->κ()I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    add-int/2addr v8, v6

    .line 109
    iput v8, v4, Llq0;->η:I

    .line 110
    .line 111
    neg-int v6, v7

    .line 112
    iput v6, v4, Llq0;->ζ:I

    .line 113
    .line 114
    :goto_3
    iput-boolean v0, v4, Llq0;->θ:Z

    .line 115
    .line 116
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 117
    .line 118
    invoke-virtual {v6}, Lр;->ξ()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-nez v6, :cond_7

    .line 123
    .line 124
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 125
    .line 126
    invoke-virtual {v6}, Lр;->κ()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-nez v6, :cond_7

    .line 131
    .line 132
    move v6, v0

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    move v6, v1

    .line 135
    :goto_4
    iput-boolean v6, v4, Llq0;->ι:Z

    .line 136
    .line 137
    iput v3, v4, Llq0;->ε:I

    .line 138
    .line 139
    if-ne v3, v2, :cond_8

    .line 140
    .line 141
    move v3, v0

    .line 142
    goto :goto_5

    .line 143
    :cond_8
    move v3, v1

    .line 144
    :goto_5
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 145
    .line 146
    if-ne v6, v3, :cond_9

    .line 147
    .line 148
    move v3, v0

    .line 149
    goto :goto_6

    .line 150
    :cond_9
    move v3, v2

    .line 151
    :goto_6
    iput v3, v4, Llq0;->δ:I

    .line 152
    .line 153
    iput v3, v4, Llq0;->γ:I

    .line 154
    .line 155
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    iput v3, v4, Llq0;->β:I

    .line 160
    .line 161
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->τ:Ljava/util/BitSet;

    .line 162
    .line 163
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 164
    .line 165
    invoke-virtual {v3, v1, v6, v0}, Ljava/util/BitSet;->set(IIZ)V

    .line 166
    .line 167
    .line 168
    iget-boolean v3, v4, Llq0;->ι:Z

    .line 169
    .line 170
    const/high16 v6, -0x80000000

    .line 171
    .line 172
    if-eqz v3, :cond_b

    .line 173
    .line 174
    iget v3, v4, Llq0;->ε:I

    .line 175
    .line 176
    if-ne v3, v0, :cond_a

    .line 177
    .line 178
    const v3, 0x7fffffff

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_a
    move v3, v6

    .line 183
    goto :goto_7

    .line 184
    :cond_b
    iget v3, v4, Llq0;->ε:I

    .line 185
    .line 186
    if-ne v3, v0, :cond_c

    .line 187
    .line 188
    iget v3, v4, Llq0;->η:I

    .line 189
    .line 190
    iget v7, v4, Llq0;->β:I

    .line 191
    .line 192
    add-int/2addr v3, v7

    .line 193
    goto :goto_7

    .line 194
    :cond_c
    iget v3, v4, Llq0;->ζ:I

    .line 195
    .line 196
    iget v7, v4, Llq0;->β:I

    .line 197
    .line 198
    sub-int/2addr v3, v7

    .line 199
    :goto_7
    iget v7, v4, Llq0;->ε:I

    .line 200
    .line 201
    move v8, v1

    .line 202
    :goto_8
    iget v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 203
    .line 204
    if-ge v8, v9, :cond_12

    .line 205
    .line 206
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 207
    .line 208
    aget-object v9, v9, v8

    .line 209
    .line 210
    iget-object v9, v9, Lvz1;->α:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_d

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_d
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 220
    .line 221
    aget-object v9, v9, v8

    .line 222
    .line 223
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget v10, v9, Lvz1;->δ:I

    .line 227
    .line 228
    if-ne v7, v2, :cond_f

    .line 229
    .line 230
    iget v11, v9, Lvz1;->β:I

    .line 231
    .line 232
    if-eq v11, v6, :cond_e

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_e
    iget-object v11, v9, Lvz1;->α:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    check-cast v11, Landroid/view/View;

    .line 242
    .line 243
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    check-cast v12, Lsz1;

    .line 248
    .line 249
    iget-object v13, v9, Lvz1;->ε:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 250
    .line 251
    iget-object v13, v13, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 252
    .line 253
    invoke-virtual {v13, v11}, Lр;->ι(Landroid/view/View;)I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    iput v11, v9, Lvz1;->β:I

    .line 258
    .line 259
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget v11, v9, Lvz1;->β:I

    .line 263
    .line 264
    :goto_9
    if-gt v11, v3, :cond_11

    .line 265
    .line 266
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->τ:Ljava/util/BitSet;

    .line 267
    .line 268
    invoke-virtual {v9, v10, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 269
    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_f
    iget v11, v9, Lvz1;->γ:I

    .line 273
    .line 274
    if-eq v11, v6, :cond_10

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_10
    invoke-virtual {v9}, Lvz1;->α()V

    .line 278
    .line 279
    .line 280
    iget v11, v9, Lvz1;->γ:I

    .line 281
    .line 282
    :goto_a
    if-lt v11, v3, :cond_11

    .line 283
    .line 284
    iget-object v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->τ:Ljava/util/BitSet;

    .line 285
    .line 286
    invoke-virtual {v9, v10, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 287
    .line 288
    .line 289
    :cond_11
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_12
    iget-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 293
    .line 294
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 295
    .line 296
    if-eqz v3, :cond_13

    .line 297
    .line 298
    invoke-virtual {v6}, Lр;->λ()I

    .line 299
    .line 300
    .line 301
    goto :goto_c

    .line 302
    :cond_13
    invoke-virtual {v6}, Lр;->π()I

    .line 303
    .line 304
    .line 305
    :goto_c
    iget v3, v4, Llq0;->γ:I

    .line 306
    .line 307
    if-ltz v3, :cond_15

    .line 308
    .line 309
    invoke-virtual {v5}, Lkm1;->α()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-ge v3, v5, :cond_15

    .line 314
    .line 315
    iget-boolean v3, v4, Llq0;->ι:Z

    .line 316
    .line 317
    if-nez v3, :cond_14

    .line 318
    .line 319
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->τ:Ljava/util/BitSet;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/util/BitSet;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_14

    .line 326
    .line 327
    goto :goto_d

    .line 328
    :cond_14
    iget p0, v4, Llq0;->γ:I

    .line 329
    .line 330
    move-object/from16 v0, p2

    .line 331
    .line 332
    invoke-virtual {v0, p0}, Lfm1;->ε(I)V

    .line 333
    .line 334
    .line 335
    const/4 p0, 0x0

    .line 336
    throw p0

    .line 337
    :cond_15
    :goto_d
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ж(Llq0;)V

    .line 338
    .line 339
    .line 340
    iget v3, v4, Llq0;->ε:I

    .line 341
    .line 342
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 343
    .line 344
    if-ne v3, v2, :cond_18

    .line 345
    .line 346
    invoke-virtual {v5}, Lр;->π()I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 351
    .line 352
    aget-object v3, v3, v1

    .line 353
    .line 354
    invoke-virtual {v3, v2}, Lvz1;->δ(I)I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    :goto_e
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 359
    .line 360
    if-ge v0, v5, :cond_17

    .line 361
    .line 362
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 363
    .line 364
    aget-object v5, v5, v0

    .line 365
    .line 366
    invoke-virtual {v5, v2}, Lvz1;->δ(I)I

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-ge v5, v3, :cond_16

    .line 371
    .line 372
    move v3, v5

    .line 373
    :cond_16
    add-int/lit8 v0, v0, 0x1

    .line 374
    .line 375
    goto :goto_e

    .line 376
    :cond_17
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 377
    .line 378
    invoke-virtual {v0}, Lр;->π()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    sub-int/2addr v0, v3

    .line 383
    goto :goto_10

    .line 384
    :cond_18
    invoke-virtual {v5}, Lр;->λ()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 389
    .line 390
    aget-object v3, v3, v1

    .line 391
    .line 392
    invoke-virtual {v3, v2}, Lvz1;->γ(I)I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    :goto_f
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->λ:I

    .line 397
    .line 398
    if-ge v0, v5, :cond_1a

    .line 399
    .line 400
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->μ:[Lvz1;

    .line 401
    .line 402
    aget-object v5, v5, v0

    .line 403
    .line 404
    invoke-virtual {v5, v2}, Lvz1;->γ(I)I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-le v5, v3, :cond_19

    .line 409
    .line 410
    move v3, v5

    .line 411
    :cond_19
    add-int/lit8 v0, v0, 0x1

    .line 412
    .line 413
    goto :goto_f

    .line 414
    :cond_1a
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 415
    .line 416
    invoke-virtual {v0}, Lр;->λ()I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    sub-int v0, v3, v0

    .line 421
    .line 422
    :goto_10
    if-lez v0, :cond_1b

    .line 423
    .line 424
    iget v2, v4, Llq0;->β:I

    .line 425
    .line 426
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    goto :goto_11

    .line 431
    :cond_1b
    move v0, v1

    .line 432
    :goto_11
    iget v2, v4, Llq0;->β:I

    .line 433
    .line 434
    if-ge v2, v0, :cond_1c

    .line 435
    .line 436
    move v0, p1

    .line 437
    goto :goto_12

    .line 438
    :cond_1c
    if-gez p1, :cond_1d

    .line 439
    .line 440
    neg-int v0, v0

    .line 441
    :cond_1d
    :goto_12
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ν:Lр;

    .line 442
    .line 443
    neg-int v3, v0

    .line 444
    invoke-virtual {v2, v3}, Lр;->φ(I)V

    .line 445
    .line 446
    .line 447
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->σ:Z

    .line 448
    .line 449
    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->χ:Z

    .line 450
    .line 451
    iput v1, v4, Llq0;->β:I

    .line 452
    .line 453
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ж(Llq0;)V

    .line 454
    .line 455
    .line 456
    return v0

    .line 457
    :cond_1e
    :goto_13
    return v1
.end method
