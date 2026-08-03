.class public final synthetic Lwb/ir;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Li0/j1;

.field public final synthetic n:Li0/j1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lwb/yt;

.field public final synthetic r:Li0/j1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;

.field public final synthetic x:Li0/a1;

.field public final synthetic y:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Li0/j1;Li0/j1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ir;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ir;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ir;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ir;->j:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ir;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ir;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ir;->m:Li0/j1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ir;->n:Li0/j1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/ir;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/ir;->p:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ir;->q:Lwb/yt;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/ir;->r:Li0/j1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/ir;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/ir;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/ir;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/ir;->v:Li0/a1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/ir;->w:Li0/a1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/ir;->x:Li0/a1;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/ir;->y:Li0/a1;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v5, v1, Lwb/ir;->g:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v1, Lwb/ir;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v7, v1, Lwb/ir;->i:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v1, Lwb/ir;->j:Ljava/util/List;

    .line 10
    .line 11
    iget-object v3, v1, Lwb/ir;->k:Ljava/lang/String;

    .line 12
    .line 13
    :try_start_0
    invoke-static {v5, v0, v7, v2}, Lr9/e0;->x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v13

    .line 17
    invoke-static {v13}, Lwb/y2;->G0(Ljava/util/List;)Lfb/y;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v9

    .line 25
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v3, "\u65b0\u5bf9\u8bdd"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_3

    .line 36
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v2, " \u5206\u652f"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v2, 0x20

    .line 54
    .line 55
    invoke-static {v2, v0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    iget-object v0, v1, Lwb/ir;->l:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v14, :cond_2

    .line 62
    .line 63
    :try_start_1
    iget-object v2, v14, Lfb/y;->b:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    move-object v2, v0

    .line 74
    :cond_1
    if-eqz v2, :cond_2

    .line 75
    .line 76
    move-object v15, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move-object v15, v0

    .line 79
    :goto_1
    invoke-static {v5, v13}, Lr9/e0;->f0(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    new-instance v6, Lfb/d1;

    .line 84
    .line 85
    const v17, 0xf800

    .line 86
    .line 87
    .line 88
    move-wide v11, v9

    .line 89
    invoke-direct/range {v6 .. v17}, Lfb/d1;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lfb/g1;->a:Lfb/g1;

    .line 93
    .line 94
    invoke-static {v5, v6}, Lfb/g1;->n(Landroid/content/Context;Lfb/d1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    :goto_2
    move-object v3, v6

    .line 98
    goto :goto_4

    .line 99
    :goto_3
    new-instance v6, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :goto_4
    new-instance v0, Landroid/os/Handler;

    .line 106
    .line 107
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 112
    .line 113
    .line 114
    new-instance v2, Lwb/ct;

    .line 115
    .line 116
    iget-object v4, v1, Lwb/ir;->m:Li0/j1;

    .line 117
    .line 118
    iget-object v6, v1, Lwb/ir;->n:Li0/j1;

    .line 119
    .line 120
    iget-object v7, v1, Lwb/ir;->o:Li0/a1;

    .line 121
    .line 122
    iget-object v8, v1, Lwb/ir;->p:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v9, v1, Lwb/ir;->q:Lwb/yt;

    .line 125
    .line 126
    iget-object v10, v1, Lwb/ir;->r:Li0/j1;

    .line 127
    .line 128
    iget-object v11, v1, Lwb/ir;->s:Li0/a1;

    .line 129
    .line 130
    iget-object v12, v1, Lwb/ir;->t:Li0/a1;

    .line 131
    .line 132
    iget-object v13, v1, Lwb/ir;->u:Li0/a1;

    .line 133
    .line 134
    iget-object v14, v1, Lwb/ir;->v:Li0/a1;

    .line 135
    .line 136
    iget-object v15, v1, Lwb/ir;->w:Li0/a1;

    .line 137
    .line 138
    move-object/from16 v16, v2

    .line 139
    .line 140
    iget-object v2, v1, Lwb/ir;->x:Li0/a1;

    .line 141
    .line 142
    move-object/from16 v17, v2

    .line 143
    .line 144
    iget-object v2, v1, Lwb/ir;->y:Li0/a1;

    .line 145
    .line 146
    move-object/from16 v18, v17

    .line 147
    .line 148
    move-object/from16 v17, v2

    .line 149
    .line 150
    move-object/from16 v2, v16

    .line 151
    .line 152
    move-object/from16 v16, v18

    .line 153
    .line 154
    invoke-direct/range {v2 .. v17}, Lwb/ct;-><init>(Ljava/lang/Object;Li0/j1;Landroid/content/Context;Li0/j1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/j1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 158
    .line 159
    .line 160
    return-void
.end method
