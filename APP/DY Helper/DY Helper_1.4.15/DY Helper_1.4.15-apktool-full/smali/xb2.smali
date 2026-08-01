.class public final Lxb2;
.super Landroid/view/WindowInsetsAnimation$Callback;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lwb2;

.field public β:Ljava/util/List;

.field public γ:Ljava/util/ArrayList;

.field public final δ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lwb2;)V
    .locals 1

    .line 1
    iget v0, p1, Lwb2;->ε:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/view/WindowInsetsAnimation$Callback;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxb2;->δ:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object p1, p0, Lxb2;->α:Lwb2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final onEnd(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxb2;->α:Lwb2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxb2;->α(Landroid/view/WindowInsetsAnimation;)Lyb2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lwb2;->α(Lyb2;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxb2;->δ:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onPrepare(Landroid/view/WindowInsetsAnimation;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxb2;->α:Lwb2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxb2;->α(Landroid/view/WindowInsetsAnimation;)Lyb2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Lwb2;->β(Lyb2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onProgress(Landroid/view/WindowInsets;Ljava/util/List;)Landroid/view/WindowInsets;
    .locals 4

    .line 1
    iget-object v0, p0, Lxb2;->γ:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxb2;->γ:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lxb2;->β:Ljava/util/List;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    :goto_1
    if-ltz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/view/WindowInsetsAnimation;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lxb2;->α(Landroid/view/WindowInsetsAnimation;)Lyb2;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1}, Landroid/view/WindowInsetsAnimation;->getFraction()F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget-object v3, v2, Lyb2;->α:Ly21;

    .line 49
    .line 50
    iget-object v3, v3, Ly21;->ε:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Landroid/view/WindowInsetsAnimation;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Landroid/view/WindowInsetsAnimation;->setFraction(F)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lxb2;->γ:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v0, v0, -0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 p2, 0x0

    .line 66
    invoke-static {p2, p1}, Loc2;->θ(Landroid/view/View;Landroid/view/WindowInsets;)Loc2;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object p2, p0, Lxb2;->β:Ljava/util/List;

    .line 71
    .line 72
    iget-object p0, p0, Lxb2;->α:Lwb2;

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lwb2;->γ(Loc2;Ljava/util/List;)Loc2;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Loc2;->η()Landroid/view/WindowInsets;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method

.method public final onStart(Landroid/view/WindowInsetsAnimation;Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxb2;->α(Landroid/view/WindowInsetsAnimation;)Lyb2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lcw1;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lcw1;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxb2;->α:Lwb2;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lwb2;->δ(Lyb2;Lcw1;)Lcw1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p1, Landroid/view/WindowInsetsAnimation$Bounds;

    .line 20
    .line 21
    iget-object p2, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Lnm0;

    .line 24
    .line 25
    invoke-virtual {p2}, Lnm0;->δ()Landroid/graphics/Insets;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget-object p0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lnm0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lnm0;->δ()Landroid/graphics/Insets;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p2, p0}, Landroid/view/WindowInsetsAnimation$Bounds;-><init>(Landroid/graphics/Insets;Landroid/graphics/Insets;)V

    .line 38
    .line 39
    .line 40
    return-object p1
.end method

.method public final α(Landroid/view/WindowInsetsAnimation;)Lyb2;
    .locals 6

    .line 1
    iget-object p0, p0, Lxb2;->δ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lyb2;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lyb2;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/view/WindowInsetsAnimation;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/view/WindowInsetsAnimation;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ly21;

    .line 26
    .line 27
    invoke-direct {v1, p1}, Ly21;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lyb2;->α:Ly21;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v0
.end method
