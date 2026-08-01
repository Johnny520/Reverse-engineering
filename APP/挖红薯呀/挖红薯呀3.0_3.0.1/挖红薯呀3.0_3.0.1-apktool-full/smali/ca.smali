.class public final synthetic Lca;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lca;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lca;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lca;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lca;->h:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lca;->i:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lca;->d:I

    iput-object p1, p0, Lca;->e:Ljava/lang/Object;

    iput-object p2, p0, Lca;->f:Ljava/lang/Object;

    iput-object p3, p0, Lca;->g:Ljava/lang/Object;

    iput-object p4, p0, Lca;->h:Ljava/lang/Object;

    iput-object p5, p0, Lca;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lca;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lca;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lca;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lca;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lca;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lca;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Landroid/content/Context;

    .line 17
    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    check-cast v2, Lkf1;

    .line 23
    .line 24
    check-cast v1, Landroid/app/Activity;

    .line 25
    .line 26
    invoke-static {p0, v4, v3, v2, v1}, Lkf1;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    move-object v5, p0

    .line 31
    check-cast v5, Lhr;

    .line 32
    .line 33
    move-object v6, v3

    .line 34
    check-cast v6, Ly51;

    .line 35
    .line 36
    move-object v7, v4

    .line 37
    check-cast v7, Ly51;

    .line 38
    .line 39
    check-cast v2, Ltop/anjao2024/xp1whs/MainActivity;

    .line 40
    .line 41
    move-object v9, v1

    .line 42
    check-cast v9, Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p0, v6, Ly51;->c:Lsw;

    .line 52
    .line 53
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    iget-object p0, v7, Ly51;->c:Lsw;

    .line 71
    .line 72
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    invoke-virtual/range {v5 .. v11}, Lhr;->a(Ly51;Ly51;Landroid/view/Window;Landroid/view/View;ZZ)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_1
    check-cast p0, Ls71;

    .line 94
    .line 95
    check-cast v3, Lk50;

    .line 96
    .line 97
    move-object v6, v4

    .line 98
    check-cast v6, Ljava/lang/String;

    .line 99
    .line 100
    move-object v11, v2

    .line 101
    check-cast v11, Lym;

    .line 102
    .line 103
    move-object v10, v1

    .line 104
    check-cast v10, Ljv;

    .line 105
    .line 106
    const-string v0, "BackgroundTextMeasurement"

    .line 107
    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :try_start_0
    invoke-static {}, Lt21;->j()Ll21;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    instance-of v1, v0, Lnh0;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    if-eqz v1, :cond_0

    .line 119
    .line 120
    check-cast v0, Lnh0;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    move-object v0, v2

    .line 124
    :goto_0
    if-eqz v0, :cond_1

    .line 125
    .line 126
    invoke-virtual {v0, v2, v2}, Lnh0;->C(Lsw;Lsw;)Lnh0;

    .line 127
    .line 128
    .line 129
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    :try_start_1
    invoke-virtual {v1}, Ll21;->j()Ll21;

    .line 133
    .line 134
    .line 135
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :try_start_2
    invoke-static {p0, v3}, Lz60;->M(Ls71;Lk50;)Ls71;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    sget-object v8, Lhs;->d:Lhs;

    .line 141
    .line 142
    new-instance v5, Lc6;

    .line 143
    .line 144
    move-object v9, v8

    .line 145
    invoke-direct/range {v5 .. v11}, Lc6;-><init>(Ljava/lang/String;Ls71;Ljava/util/List;Ljava/util/List;Ljv;Lym;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5}, Lc6;->c()F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    :try_start_3
    invoke-static {v2}, Ll21;->q(Ll21;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 152
    .line 153
    .line 154
    :try_start_4
    invoke-virtual {v1}, Lnh0;->w()Lv50;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Lv50;->f()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lnh0;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 162
    .line 163
    .line 164
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    move-object p0, v0

    .line 170
    goto :goto_1

    .line 171
    :catchall_1
    move-exception v0

    .line 172
    move-object p0, v0

    .line 173
    :try_start_5
    invoke-static {v2}, Ll21;->q(Ll21;)V

    .line 174
    .line 175
    .line 176
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 177
    :goto_1
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 178
    :catchall_2
    move-exception v0

    .line 179
    move-object p0, v0

    .line 180
    :try_start_7
    invoke-virtual {v1}, Lnh0;->c()V

    .line 181
    .line 182
    .line 183
    throw p0

    .line 184
    :catchall_3
    move-exception v0

    .line 185
    move-object p0, v0

    .line 186
    goto :goto_2

    .line 187
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 190
    .line 191
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 195
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 196
    .line 197
    .line 198
    throw p0

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
