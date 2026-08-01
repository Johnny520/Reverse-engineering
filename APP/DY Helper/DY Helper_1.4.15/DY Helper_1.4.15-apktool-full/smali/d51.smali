.class public final Ld51;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/Runnable;

.field public final β:Lw6;

.field public γ:Lu60;

.field public final δ:Landroid/window/OnBackInvokedCallback;

.field public ε:Landroid/window/OnBackInvokedDispatcher;

.field public ζ:Z

.field public η:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld51;->α:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lw6;

    .line 7
    .line 8
    invoke-direct {p1}, Lw6;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ld51;->β:Lw6;

    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    if-lt p1, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Lw41;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v0}, Lw41;-><init>(Ld51;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lw41;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, v1}, Lw41;-><init>(Ld51;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lx41;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, Lx41;-><init>(Ld51;I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lx41;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, p0, v3}, Lx41;-><init>(Ld51;I)V

    .line 45
    .line 46
    .line 47
    sget-object v3, La51;->α:La51;

    .line 48
    .line 49
    invoke-virtual {v3, p1, v0, v1, v2}, La51;->α(La80;La80;Lp70;Lp70;)Landroid/window/OnBackInvokedCallback;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Lx41;

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    invoke-direct {p1, p0, v0}, Lx41;-><init>(Ld51;I)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Ly41;->α:Ly41;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ly41;->α(Lp70;)Landroid/window/OnBackInvokedCallback;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    iput-object p1, p0, Ld51;->δ:Landroid/window/OnBackInvokedCallback;

    .line 67
    .line 68
    :cond_1
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld51;->β:Lw6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw6;->α()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, Lu60;

    .line 24
    .line 25
    iget-boolean v3, v3, Lu60;->α:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v2

    .line 31
    :goto_0
    check-cast v1, Lu60;

    .line 32
    .line 33
    iput-object v2, p0, Ld51;->γ:Lu60;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object p0, v1, Lu60;->δ:Lb70;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-virtual {p0, v0}, Lb70;->ω(Z)Z

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lb70;->θ:Lu60;

    .line 44
    .line 45
    iget-boolean v0, v0, Lu60;->α:Z

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Lb70;->Ξ()Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object p0, p0, Lb70;->η:Ld51;

    .line 54
    .line 55
    invoke-virtual {p0}, Ld51;->α()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    iget-object p0, p0, Ld51;->α:Ljava/lang/Runnable;

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final β(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Ld51;->ε:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Ld51;->δ:Landroid/window/OnBackInvokedCallback;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    sget-object v3, Ly41;->α:Ly41;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v4, p0, Ld51;->ζ:Z

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v0, v2, v1}, Ly41;->β(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Ld51;->ζ:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-boolean p1, p0, Ld51;->ζ:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v0, v1}, Ly41;->γ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, p0, Ld51;->ζ:Z

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final γ()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ld51;->η:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ld51;->β:Lw6;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lu60;

    .line 30
    .line 31
    iget-boolean v3, v3, Lu60;->α:Z

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :cond_2
    :goto_0
    iput-boolean v1, p0, Ld51;->η:Z

    .line 37
    .line 38
    if-eq v1, v0, :cond_3

    .line 39
    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v2, 0x21

    .line 43
    .line 44
    if-lt v0, v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ld51;->β(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method
