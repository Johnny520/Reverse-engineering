.class public final synthetic Lwb/bt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Lfg/l;

.field public final synthetic p:Lfg/l;

.field public final synthetic q:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;ZZZJLjava/lang/String;ZLfg/l;Lfg/l;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/bt;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/bt;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/bt;->i:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/bt;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/bt;->k:Z

    .line 13
    .line 14
    iput-wide p6, p0, Lwb/bt;->l:J

    .line 15
    .line 16
    iput-object p8, p0, Lwb/bt;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p9, p0, Lwb/bt;->n:Z

    .line 19
    .line 20
    iput-object p10, p0, Lwb/bt;->o:Lfg/l;

    .line 21
    .line 22
    iput-object p11, p0, Lwb/bt;->p:Lfg/l;

    .line 23
    .line 24
    iput-object p12, p0, Lwb/bt;->q:Li0/a1;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/h;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v6, v0, Lwb/bt;->g:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Lwb/p0;->j5:Ls0/d;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v1, v4, v2, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 23
    .line 24
    .line 25
    move-object v2, v0

    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    iget-object v2, v0, Lwb/bt;->h:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v15

    .line 34
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x2

    .line 39
    iget-boolean v11, v0, Lwb/bt;->j:Z

    .line 40
    .line 41
    iget-wide v7, v0, Lwb/bt;->l:J

    .line 42
    .line 43
    iget-object v9, v0, Lwb/bt;->m:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lwb/ut;

    .line 53
    .line 54
    iget v5, v2, Lwb/ut;->a:I

    .line 55
    .line 56
    iget-object v2, v2, Lwb/ut;->b:Lfb/c;

    .line 57
    .line 58
    iget-object v10, v2, Lfb/c;->c:Ljava/lang/String;

    .line 59
    .line 60
    move v12, v3

    .line 61
    move-object v3, v2

    .line 62
    new-instance v2, Lwb/pr;

    .line 63
    .line 64
    move v13, v4

    .line 65
    iget-boolean v4, v0, Lwb/bt;->k:Z

    .line 66
    .line 67
    move-object v14, v10

    .line 68
    iget-boolean v10, v0, Lwb/bt;->n:Z

    .line 69
    .line 70
    move/from16 v16, v12

    .line 71
    .line 72
    iget-object v12, v0, Lwb/bt;->o:Lfg/l;

    .line 73
    .line 74
    move/from16 v17, v13

    .line 75
    .line 76
    iget-object v13, v0, Lwb/bt;->p:Lfg/l;

    .line 77
    .line 78
    move-object/from16 v18, v14

    .line 79
    .line 80
    iget-object v14, v0, Lwb/bt;->q:Li0/a1;

    .line 81
    .line 82
    move-object/from16 p1, v15

    .line 83
    .line 84
    move/from16 v0, v17

    .line 85
    .line 86
    move-object/from16 v15, v18

    .line 87
    .line 88
    invoke-direct/range {v2 .. v14}, Lwb/pr;-><init>(Lfb/c;ZILjava/util/List;JLjava/lang/String;ZZLfg/l;Lfg/l;Li0/a1;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Ls0/d;

    .line 92
    .line 93
    const v4, 0x651df010

    .line 94
    .line 95
    .line 96
    invoke-direct {v3, v4, v2, v0}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 97
    .line 98
    .line 99
    const/4 v12, 0x2

    .line 100
    invoke-static {v1, v15, v3, v12}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 101
    .line 102
    .line 103
    move-object/from16 v0, p0

    .line 104
    .line 105
    move-object/from16 v15, p1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    move-object v2, v0

    .line 109
    move v12, v3

    .line 110
    move v0, v4

    .line 111
    iget-boolean v3, v2, Lwb/bt;->i:Z

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    if-nez v11, :cond_2

    .line 116
    .line 117
    new-instance v3, Lwb/qr;

    .line 118
    .line 119
    invoke-direct {v3, v7, v8, v9}, Lwb/qr;-><init>(JLjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    new-instance v4, Ls0/d;

    .line 123
    .line 124
    const v5, 0xd4af3c3

    .line 125
    .line 126
    .line 127
    invoke-direct {v4, v5, v3, v0}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 128
    .line 129
    .line 130
    const-string v0, "agent-context-compaction"

    .line 131
    .line 132
    invoke-static {v1, v0, v4, v12}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 133
    .line 134
    .line 135
    :cond_2
    const-string v0, "agent-message-tail"

    .line 136
    .line 137
    sget-object v3, Lwb/p0;->k5:Ls0/d;

    .line 138
    .line 139
    invoke-static {v1, v0, v3, v12}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 140
    .line 141
    .line 142
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 143
    .line 144
    return-object v0
.end method
