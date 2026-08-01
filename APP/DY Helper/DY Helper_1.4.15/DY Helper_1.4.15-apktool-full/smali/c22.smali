.class public final Lc22;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public ι:I

.field public final synthetic κ:J

.field public final synthetic λ:Ld22;


# direct methods
.method public constructor <init>(JLd22;Lop;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lc22;->κ:J

    .line 2
    .line 3
    iput-object p3, p0, Lc22;->λ:Ld22;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Ly12;-><init>(ILop;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbq;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lc22;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lc22;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lc22;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    new-instance p2, Lc22;

    .line 2
    .line 3
    iget-wide v0, p0, Lc22;->κ:J

    .line 4
    .line 5
    iget-object p0, p0, Lc22;->λ:Ld22;

    .line 6
    .line 7
    invoke-direct {p2, v0, v1, p0, p1}, Lc22;-><init>(JLd22;Lop;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lc22;->ι:I

    .line 2
    .line 3
    const-wide/16 v1, 0x8

    .line 4
    .line 5
    iget-wide v3, p0, Lc22;->κ:J

    .line 6
    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    sget-object v7, Lcq;->ε:Lcq;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v6, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sub-long v8, v3, v1

    .line 36
    .line 37
    iput v6, p0, Lc22;->ι:I

    .line 38
    .line 39
    invoke-static {v8, v9, p0}, Ljx0;->τ(JLpp;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v7, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_0
    iput v5, p0, Lc22;->ι:I

    .line 47
    .line 48
    invoke-static {v1, v2, p0}, Ljx0;->τ(JLpp;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v7, :cond_4

    .line 53
    .line 54
    :goto_1
    return-object v7

    .line 55
    :cond_4
    :goto_2
    iget-object p0, p0, Lc22;->λ:Ld22;

    .line 56
    .line 57
    iget-object p0, p0, Ld22;->η:Lae;

    .line 58
    .line 59
    if-eqz p0, :cond_5

    .line 60
    .line 61
    new-instance p1, Lxh1;

    .line 62
    .line 63
    invoke-direct {p1, v3, v4}, Lxh1;-><init>(J)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Leo1;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lae;->ζ(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    sget-object p0, Ls62;->α:Ls62;

    .line 75
    .line 76
    return-object p0
.end method
