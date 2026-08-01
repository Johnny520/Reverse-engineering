.class public final Lh60;
.super Ldo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public η:I

.field public synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Lup;

.field public final synthetic κ:Ldo1;


# direct methods
.method public constructor <init>(Lup;Le80;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh60;->ι:Lup;

    .line 2
    .line 3
    check-cast p2, Ldo1;

    .line 4
    .line 5
    iput-object p2, p0, Lh60;->κ:Ldo1;

    .line 6
    .line 7
    invoke-direct {p0, p3}, Ldo1;-><init>(Lop;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ld22;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lh60;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lh60;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lh60;->κ(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lh60;

    .line 2
    .line 3
    iget-object v1, p0, Lh60;->ι:Lup;

    .line 4
    .line 5
    iget-object p0, p0, Lh60;->κ:Ldo1;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lh60;-><init>(Lup;Le80;Lop;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lh60;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lh60;->η:I

    .line 2
    .line 3
    sget-object v1, Lwh1;->η:Lwh1;

    .line 4
    .line 5
    iget-object v2, p0, Lh60;->ι:Lup;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    sget-object v6, Lcq;->ε:Lcq;

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    if-eq v0, v5, :cond_3

    .line 15
    .line 16
    if-eq v0, v4, :cond_1

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lh60;->θ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ld22;

    .line 23
    .line 24
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    iget-object v0, p0, Lh60;->θ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ld22;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    move-object p1, v0

    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    iget-object v0, p0, Lh60;->θ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ld22;

    .line 49
    .line 50
    :try_start_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lh60;->θ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ld22;

    .line 60
    .line 61
    :goto_1
    invoke-static {v2}, Lyh;->Υ(Lup;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    :try_start_2
    iget-object v0, p0, Lh60;->κ:Ldo1;

    .line 68
    .line 69
    iput-object p1, p0, Lh60;->θ:Ljava/lang/Object;

    .line 70
    .line 71
    iput v5, p0, Lh60;->η:I

    .line 72
    .line 73
    invoke-interface {v0, p1, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 77
    if-ne v0, v6, :cond_5

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move-object v0, p1

    .line 81
    :goto_2
    :try_start_3
    iput-object v0, p0, Lh60;->θ:Ljava/lang/Object;

    .line 82
    .line 83
    iput v4, p0, Lh60;->η:I

    .line 84
    .line 85
    invoke-static {v0, v1, p0}, Lpd2;->η(Ld22;Lwh1;Lq8;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 89
    if-ne p1, v6, :cond_2

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :catch_1
    move-exception v0

    .line 93
    move-object v8, v0

    .line 94
    move-object v0, p1

    .line 95
    move-object p1, v8

    .line 96
    :goto_3
    invoke-static {v2}, Lyh;->Υ(Lup;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_6

    .line 101
    .line 102
    iput-object v0, p0, Lh60;->θ:Ljava/lang/Object;

    .line 103
    .line 104
    iput v3, p0, Lh60;->η:I

    .line 105
    .line 106
    invoke-static {v0, v1, p0}, Lpd2;->η(Ld22;Lwh1;Lq8;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v6, :cond_2

    .line 111
    .line 112
    :goto_4
    return-object v6

    .line 113
    :cond_6
    throw p1

    .line 114
    :cond_7
    sget-object p0, Ls62;->α:Ls62;

    .line 115
    .line 116
    return-object p0
.end method
