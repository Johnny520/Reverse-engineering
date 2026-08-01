.class public final Lwv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lyr;

.field public final synthetic ζ:F

.field public final synthetic η:Lwa0;


# direct methods
.method public constructor <init>(Lyr;FLwa0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwv;->ε:Lyr;

    .line 5
    .line 6
    iput p2, p0, Lwv;->ζ:F

    .line 7
    .line 8
    iput-object p3, p0, Lwv;->η:Lwa0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lcw;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lm6;->ω()Lyr;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lwv;->ε:Lyr;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lm6;->Σ(Lyr;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    iget v1, p0, Lwv;->ζ:F

    .line 24
    .line 25
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lm6;->Ζ()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-virtual {v2}, Lm6;->υ()Lde;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-interface {v5}, Lde;->θ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_1
    iget-object v5, v2, Lm6;->ζ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Ln;

    .line 43
    .line 44
    const-wide/16 v6, 0x0

    .line 45
    .line 46
    invoke-virtual {v5, v1, v1, v6, v7}, Ln;->Ε(FFJ)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lwv;->η:Lwa0;

    .line 50
    .line 51
    invoke-static {p1, p0}, Lln0;->φ(Lcw;Lwa0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    .line 54
    :try_start_2
    invoke-virtual {v2}, Lm6;->υ()Lde;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p0}, Lde;->ζ()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3, v4}, Lm6;->Υ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0, v0}, Lm6;->Σ(Lyr;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Ls62;->α:Ls62;

    .line 72
    .line 73
    return-object p0

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto :goto_0

    .line 76
    :catchall_1
    move-exception p0

    .line 77
    :try_start_3
    invoke-virtual {v2}, Lm6;->υ()Lde;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v1}, Lde;->ζ()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3, v4}, Lm6;->Υ(J)V

    .line 85
    .line 86
    .line 87
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    :goto_0
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v0}, Lm6;->Σ(Lyr;)V

    .line 93
    .line 94
    .line 95
    throw p0
.end method
