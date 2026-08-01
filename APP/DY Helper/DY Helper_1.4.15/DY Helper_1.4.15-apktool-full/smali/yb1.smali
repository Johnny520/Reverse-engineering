.class public final synthetic Lyb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:J

.field public final synthetic θ:Ljava/io/Serializable;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Lm80;


# direct methods
.method public synthetic constructor <init>(JLandroid/app/Activity;Lod;Lmb1;Lmb1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyb1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lyb1;->η:J

    .line 8
    .line 9
    iput-object p3, p0, Lyb1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p4, p0, Lyb1;->θ:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p5, p0, Lyb1;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p6, p0, Lyb1;->κ:Lm80;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lqm1;Landroid/app/Activity;Landroid/app/AlertDialog;JLp70;)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput v0, p0, Lyb1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyb1;->θ:Ljava/io/Serializable;

    iput-object p2, p0, Lyb1;->ζ:Landroid/app/Activity;

    iput-object p3, p0, Lyb1;->ι:Ljava/lang/Object;

    iput-wide p4, p0, Lyb1;->η:J

    iput-object p6, p0, Lyb1;->κ:Lm80;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyb1;->ε:I

    .line 4
    .line 5
    iget-object v2, v0, Lyb1;->κ:Lm80;

    .line 6
    .line 7
    iget-object v3, v0, Lyb1;->ι:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lyb1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v5, v0, Lyb1;->θ:Ljava/io/Serializable;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Lqm1;

    .line 17
    .line 18
    check-cast v3, Landroid/app/AlertDialog;

    .line 19
    .line 20
    check-cast v2, Lp70;

    .line 21
    .line 22
    iget-boolean v1, v5, Lqm1;->ε:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v3}, Landroid/app/Dialog;->isShowing()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget-object v1, Lbv1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    iget-wide v0, v0, Lyb1;->η:J

    .line 48
    .line 49
    cmp-long v0, v3, v0

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-interface {v2}, Lp70;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    :pswitch_0
    iget-wide v6, v0, Lyb1;->η:J

    .line 59
    .line 60
    move-object v9, v5

    .line 61
    check-cast v9, Lod;

    .line 62
    .line 63
    check-cast v3, Lmb1;

    .line 64
    .line 65
    check-cast v2, Lmb1;

    .line 66
    .line 67
    sget-object v0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v4}, Ldd1;->ζ(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    new-instance v14, Lac1;

    .line 74
    .line 75
    invoke-direct {v14, v6, v7, v4, v3}, Lac1;-><init>(JLandroid/app/Activity;Lmb1;)V

    .line 76
    .line 77
    .line 78
    const/16 v15, 0x38

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    invoke-static/range {v8 .. v15}, Ljc1;->ε(Ljava/lang/ClassLoader;Lod;ZLjava/util/LinkedHashSet;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Lac1;I)Ldc1;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    new-instance v1, Leo1;

    .line 91
    .line 92
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object v0, v1

    .line 96
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "r7ce9b41b1577bc7d"

    .line 101
    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    const-string v0, "\u8425\u5730\u540e\u53f0\u4efb\u52a1\u7ebf\u7a0b\u5f02\u5e38"

    .line 106
    .line 107
    invoke-static {v3, v0, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    new-instance v8, Ldc1;

    .line 111
    .line 112
    sget-object v0, Ljc1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    const/16 v17, 0x13c

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v10, 0x0

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v12, 0x0

    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x1

    .line 127
    invoke-direct/range {v8 .. v17}, Ldc1;-><init>(IIIIIIIZI)V

    .line 128
    .line 129
    .line 130
    move-object v0, v8

    .line 131
    :goto_2
    move-object v9, v0

    .line 132
    check-cast v9, Ldc1;

    .line 133
    .line 134
    sget-object v0, Ljc1;->γ:La;

    .line 135
    .line 136
    invoke-virtual {v0, v6, v7, v9}, La;->α(JLdc1;)V

    .line 137
    .line 138
    .line 139
    :try_start_1
    new-instance v5, Lzb1;

    .line 140
    .line 141
    const/4 v10, 0x1

    .line 142
    move-object v8, v2

    .line 143
    invoke-direct/range {v5 .. v10}, Lzb1;-><init>(JLa80;Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    new-instance v1, Leo1;

    .line 154
    .line 155
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object v0, v1

    .line 159
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    const-string v1, "\u8425\u5730\u540e\u53f0\u4efb\u52a1\u7ed3\u679c\u56de\u8c03\u5931\u8d25"

    .line 166
    .line 167
    invoke-static {v3, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    return-void

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
