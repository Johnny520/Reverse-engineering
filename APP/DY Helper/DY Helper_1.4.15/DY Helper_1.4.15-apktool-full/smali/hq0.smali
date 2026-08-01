.class public final Lhq0;
.super Lvp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Lkq0;

.field public final synthetic β:Le80;


# direct methods
.method public constructor <init>(Lkq0;Le80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhq0;->α:Lkq0;

    .line 5
    .line 6
    iput-object p2, p0, Lhq0;->β:Le80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ε(Lrx0;Ljava/util/List;J)Lqx0;
    .locals 6

    .line 1
    iget-object v2, p0, Lhq0;->α:Lkq0;

    .line 2
    .line 3
    iget-object p2, v2, Lkq0;->λ:Lfq0;

    .line 4
    .line 5
    invoke-interface {p1}, Lrx0;->getLayoutDirection()Lnp0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, Lfq0;->ε:Lnp0;

    .line 10
    .line 11
    invoke-interface {p1}, Lyr;->β()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, Lfq0;->ζ:F

    .line 16
    .line 17
    invoke-interface {p1}, Lyr;->θ()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, Lfq0;->η:F

    .line 22
    .line 23
    invoke-interface {p1}, Lrx0;->ν()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, Lhq0;->β:Le80;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lkq0;->ε:Lyp0;

    .line 33
    .line 34
    iget-object p1, p1, Lyp0;->μ:Lyp0;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v0, v2, Lkq0;->θ:I

    .line 39
    .line 40
    iget-object p1, v2, Lkq0;->μ:Lcq0;

    .line 41
    .line 42
    new-instance p2, Lyo;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, Lyo;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1, p2}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    move-object v1, p0

    .line 52
    check-cast v1, Lqx0;

    .line 53
    .line 54
    iget v3, v2, Lkq0;->θ:I

    .line 55
    .line 56
    new-instance v0, Lgq0;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, Lgq0;-><init>(Lqx0;Lkq0;ILqx0;I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v0, v2, Lkq0;->η:I

    .line 65
    .line 66
    new-instance p1, Lyo;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, Lyo;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, p2, p1}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, Lqx0;

    .line 77
    .line 78
    iget v3, v2, Lkq0;->η:I

    .line 79
    .line 80
    new-instance v0, Lgq0;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, Lgq0;-><init>(Lqx0;Lkq0;ILqx0;I)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
