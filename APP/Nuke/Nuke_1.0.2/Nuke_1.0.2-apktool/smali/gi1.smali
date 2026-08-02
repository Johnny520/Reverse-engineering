.class public final Lgi1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lfi1;


# instance fields
.field public final h:Landroid/content/Context;

.field public i:Ls00;

.field public final j:Ljx1;

.field public k:Lzt2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgi1;->h:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Ljx1;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljx1;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lgi1;->j:Ljx1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final k(La20;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->f0(Ly10;La20;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final o(Lz10;)Ly10;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->u(Ly10;Lz10;)Ly10;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final r(Lmn0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u(Lz10;)La20;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxe1;->W(Ly10;Lz10;)La20;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final v()F
    .locals 11

    .line 1
    iget-object v0, p0, Lgi1;->k:Lzt2;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v6, p0, Lgi1;->h:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v9, Lwf3;->a:Lrk1;

    .line 8
    .line 9
    monitor-enter v9

    .line 10
    :try_start_0
    invoke-virtual {v9, v6}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v10, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v0, "animator_duration_scale"

    .line 22
    .line 23
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v0, -0x1

    .line 28
    const/4 v1, 0x6

    .line 29
    invoke-static {v0, v1, v10}, Lfg1;->a(IILhn;)Ljn;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lse;->A(Landroid/os/Looper;)Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v4, Lvf3;

    .line 42
    .line 43
    invoke-direct {v4, v5, v0}, Lvf3;-><init>(Ljn;Landroid/os/Handler;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lvi2;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x3

    .line 50
    invoke-direct/range {v1 .. v8}, Lvi2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lyb2;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lyb2;-><init>(Lmn0;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Ls00;

    .line 59
    .line 60
    new-instance v2, Lmw2;

    .line 61
    .line 62
    invoke-direct {v2, v10}, Lm21;-><init>(Lk21;)V

    .line 63
    .line 64
    .line 65
    sget-object v3, Lo90;->a:Lc60;

    .line 66
    .line 67
    sget-object v3, Lie1;->a:Lvr0;

    .line 68
    .line 69
    invoke-static {v2, v3}, Lxe1;->f0(Ly10;La20;)La20;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {v1, v2}, Ls00;-><init>(La20;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lfu2;

    .line 77
    .line 78
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "animator_duration_scale"

    .line 86
    .line 87
    const/high16 v5, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-static {v3, v4, v5}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v0, v1, v2, v3}, Lp40;->U(Lyb2;Ls00;Lfu2;Ljava/lang/Float;)Lm52;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v9, v6, v0}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    move-object p0, v0

    .line 107
    goto :goto_1

    .line 108
    :cond_0
    :goto_0
    check-cast v0, Lhu2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    monitor-exit v9

    .line 111
    invoke-interface {v0}, Lhu2;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Ljava/lang/Number;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget-object v2, p0, Lgi1;->j:Ljx1;

    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ljx1;->h(F)V

    .line 124
    .line 125
    .line 126
    iget-object v1, p0, Lgi1;->i:Ls00;

    .line 127
    .line 128
    if-eqz v1, :cond_1

    .line 129
    .line 130
    new-instance v2, La2;

    .line 131
    .line 132
    const/16 v3, 0xf

    .line 133
    .line 134
    invoke-direct {v2, v0, p0, v10, v3}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 135
    .line 136
    .line 137
    const/4 v0, 0x3

    .line 138
    invoke-static {v1, v10, v2, v0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lgi1;->k:Lzt2;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_1
    const-string p0, "MotionDurationScale scale factor requested before recomposer loop start"

    .line 146
    .line 147
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const/4 p0, 0x0

    .line 151
    return p0

    .line 152
    :goto_1
    monitor-exit v9

    .line 153
    throw p0

    .line 154
    :cond_2
    :goto_2
    iget-object p0, p0, Lgi1;->j:Ljx1;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljx1;->g()F

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    return p0
.end method
