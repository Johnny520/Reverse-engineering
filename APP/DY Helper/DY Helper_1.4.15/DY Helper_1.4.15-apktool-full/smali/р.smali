.class public abstract Lр;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Ljava/lang/Object;

.field public β:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Lр;->β:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lр;->α:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/β;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lр;->β:Ljava/lang/Object;

    return-void
.end method

.method public static ε(Lzl1;I)Lр;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Ll81;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, p0, v0}, Ll81;-><init>(Lzl1;I)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p0, "invalid orientation"

    .line 14
    .line 15
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :cond_1
    new-instance p1, Ll81;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, p0, v0}, Ll81;-><init>(Lzl1;I)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method


# virtual methods
.method public γ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lр;->β:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroidx/appcompat/app/β;

    .line 10
    .line 11
    iget-object v1, v1, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public abstract δ()Landroid/content/IntentFilter;
.end method

.method public abstract ζ(I)[I
.end method

.method public abstract η()I
.end method

.method public abstract θ(Landroid/view/View;)I
.end method

.method public abstract ι(Landroid/view/View;)I
.end method

.method public abstract κ()I
.end method

.method public abstract λ()I
.end method

.method public abstract μ()I
.end method

.method public ν(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lt12;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lt12;

    .line 6
    .line 7
    iget-object v0, p0, Lр;->β:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lfw1;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lfw1;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lfw1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lр;->β:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lр;->β:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lfw1;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lfw1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/MenuItem;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Landroidx/appcompat/view/menu/α;

    .line 34
    .line 35
    iget-object v1, p0, Lр;->α:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Landroidx/appcompat/view/menu/α;-><init>(Landroid/content/Context;Lt12;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lfw1;

    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Lfw1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method

.method public abstract ξ()I
.end method

.method public ο(II)[I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, [I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aput p1, p0, v0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput p2, p0, p1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public abstract π()I
.end method

.method public ρ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "text"

    .line 9
    .line 10
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public abstract σ()I
.end method

.method public abstract τ(Landroid/view/View;)I
.end method

.method public abstract υ(Landroid/view/View;)I
.end method

.method public abstract φ(I)V
.end method

.method public abstract χ()V
.end method

.method public abstract ψ(I)[I
.end method

.method public ω()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lр;->γ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lр;->δ()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lр;->α:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lf5;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lf5;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lf5;-><init>(Lр;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lр;->α:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lр;->β:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Landroidx/appcompat/app/β;

    .line 31
    .line 32
    iget-object v1, v1, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 33
    .line 34
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lf5;

    .line 37
    .line 38
    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    return-void
.end method
