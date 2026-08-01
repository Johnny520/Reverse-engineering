.class public final Lsl1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Let;


# instance fields
.field public final synthetic ε:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public δ(F)Z
    .locals 4

    .line 1
    iget-object p0, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    float-to-int p1, p1

    .line 13
    move v0, p1

    .line 14
    move p1, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 17
    .line 18
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    float-to-int p1, p1

    .line 25
    move v0, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move p1, v1

    .line 28
    move v0, p1

    .line 29
    :goto_0
    if-nez p1, :cond_2

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 38
    .line 39
    iget-object v3, v2, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    iget-object v2, v2, Lnm1;->η:Landroid/widget/OverScroller;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    iget-object v2, v2, Lzl1;->ε:Lds0;

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    invoke-virtual {v2}, Lds0;->δ()V

    .line 58
    .line 59
    .line 60
    :cond_3
    const v2, 0x7fffffff

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->π(IIII)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method

.method public λ()F
    .locals 1

    .line 1
    iget-object p0, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lzl1;->δ()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ω:F

    .line 12
    .line 13
    :goto_0
    neg-float p0, p0

    .line 14
    return p0

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 16
    .line 17
    invoke-virtual {v0}, Lzl1;->γ()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Ψ:F

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public μ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->б:Lnm1;

    .line 8
    .line 9
    iget-object v1, v0, Lnm1;->λ:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lnm1;->η:Landroid/widget/OverScroller;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->ο:Lzl1;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lzl1;->ε:Lds0;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lds0;->δ()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
