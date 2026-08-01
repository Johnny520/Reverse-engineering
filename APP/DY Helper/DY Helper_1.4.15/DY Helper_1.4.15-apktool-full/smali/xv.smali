.class public final Lxv;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lxv;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxv;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lxv;->η:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lxv;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, Lxv;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lzz;

    .line 11
    .line 12
    iget-object v1, p1, Lzz;->β:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lxv;->η:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lae;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    iget-object p1, p1, Lzz;->γ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    sget-object p0, Ls62;->α:Ls62;

    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p0, v0

    .line 32
    monitor-exit v1

    .line 33
    throw p0

    .line 34
    :pswitch_0
    move-object v5, p1

    .line 35
    check-cast v5, Lyw1;

    .line 36
    .line 37
    sget-object p1, Lax1;->γ:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_1
    sget-wide v3, Lax1;->ε:J

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    int-to-long v0, v0

    .line 44
    add-long/2addr v0, v3

    .line 45
    sput-wide v0, Lax1;->ε:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    monitor-exit p1

    .line 48
    iget-object p1, p0, Lxv;->ζ:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v6, p1

    .line 51
    check-cast v6, La80;

    .line 52
    .line 53
    iget-object p0, p0, Lxv;->η:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v7, p0

    .line 56
    check-cast v7, La80;

    .line 57
    .line 58
    new-instance v2, Lf21;

    .line 59
    .line 60
    invoke-direct/range {v2 .. v7}, Lf21;-><init>(JLyw1;La80;La80;)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    monitor-exit p1

    .line 67
    throw p0

    .line 68
    :pswitch_1
    check-cast p1, Lcw;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lm6;->ω()Lyr;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v2, p0, Lxv;->ζ:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lyr;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lm6;->Σ(Lyr;)V

    .line 90
    .line 91
    .line 92
    :try_start_2
    iget-object p0, p0, Lxv;->η:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Law;

    .line 95
    .line 96
    iget-object v0, p0, Law;->Ε:Lvv;

    .line 97
    .line 98
    invoke-virtual {p0, p1, v0}, Law;->З(Lcw;Lvv;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0, v1}, Lm6;->Σ(Lyr;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Ls62;->α:Ls62;

    .line 109
    .line 110
    return-object p0

    .line 111
    :catchall_2
    move-exception v0

    .line 112
    move-object p0, v0

    .line 113
    invoke-interface {p1}, Lcw;->Β()Lm6;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1, v1}, Lm6;->Σ(Lyr;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
