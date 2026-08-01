.class public final Lvv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Lwa0;

.field public final β:Ljava/util/ArrayList;

.field public γ:Lwa0;

.field public δ:I

.field public final ε:Lt91;

.field public ζ:I

.field public final η:[Ljava/lang/String;

.field public final θ:[I

.field public final ι:[I

.field public final κ:[Lin;

.field public final synthetic λ:Law;


# direct methods
.method public constructor <init>(Law;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvv;->λ:Law;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lvv;->β:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput p1, p0, Lvv;->δ:I

    .line 15
    .line 16
    new-instance v0, Lt91;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Lt91;-><init>(F)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lvv;->ε:Lt91;

    .line 23
    .line 24
    iput p1, p0, Lvv;->ζ:I

    .line 25
    .line 26
    const-string p1, ""

    .line 27
    .line 28
    filled-new-array {p1, p1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lvv;->η:[Ljava/lang/String;

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    filled-new-array {p1, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lvv;->θ:[I

    .line 40
    .line 41
    filled-new-array {p1, p1}, [I

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lvv;->ι:[I

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    new-array p1, p1, [Lin;

    .line 49
    .line 50
    iput-object p1, p0, Lvv;->κ:[Lin;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final α(I)Lwa0;
    .locals 3

    .line 1
    iget-object v0, p0, Lvv;->λ:Law;

    .line 2
    .line 3
    invoke-static {v0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    iget-object v1, p0, Lvv;->β:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-gt v2, p1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lua0;->β()Lwa0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lwa0;

    .line 32
    .line 33
    return-object p0
.end method

.method public final β()V
    .locals 5

    .line 1
    iget-object v0, p0, Lvv;->λ:Law;

    .line 2
    .line 3
    invoke-static {v0}, Lh62;->ч(Lur;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Lua0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lvv;->α:Lwa0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lua0;->α(Lwa0;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Lvv;->α:Lwa0;

    .line 20
    .line 21
    iget-object v2, p0, Lvv;->β:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lwa0;

    .line 38
    .line 39
    invoke-interface {v0, v4}, Lua0;->α(Lwa0;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lvv;->γ:Lwa0;

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-interface {v0, v2}, Lua0;->α(Lwa0;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-object v1, p0, Lvv;->γ:Lwa0;

    .line 54
    .line 55
    iget-object v0, p0, Lvv;->κ:[Lin;

    .line 56
    .line 57
    invoke-static {v1, v0}, Lg7;->Χ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lvv;->η:[Ljava/lang/String;

    .line 61
    .line 62
    const-string v1, ""

    .line 63
    .line 64
    invoke-static {v1, v0}, Lg7;->Χ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lvv;->θ:[I

    .line 68
    .line 69
    invoke-static {v0}, Lg7;->Ψ([I)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lvv;->ι:[I

    .line 73
    .line 74
    invoke-static {p0}, Lg7;->Ψ([I)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
