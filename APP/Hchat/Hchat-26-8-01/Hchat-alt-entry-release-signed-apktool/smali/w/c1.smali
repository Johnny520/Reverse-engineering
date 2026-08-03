.class public final synthetic Lw/c1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lw/q0;

.field public final synthetic h:Lh0/d1;

.field public final synthetic i:Ln2/s;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lb5/k;

.field public final synthetic m:Lw/q1;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Lw/q0;Lh0/d1;Ln2/s;ZZLb5/k;Lw/q1;Lfg/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/c1;->g:Lw/q0;

    .line 5
    .line 6
    iput-object p2, p0, Lw/c1;->h:Lh0/d1;

    .line 7
    .line 8
    iput-object p3, p0, Lw/c1;->i:Ln2/s;

    .line 9
    .line 10
    iput-boolean p4, p0, Lw/c1;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lw/c1;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lw/c1;->l:Lb5/k;

    .line 15
    .line 16
    iput-object p7, p0, Lw/c1;->m:Lw/q1;

    .line 17
    .line 18
    iput-object p8, p0, Lw/c1;->n:Lfg/l;

    .line 19
    .line 20
    iput p9, p0, Lw/c1;->o:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ly0/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v2, 0x32c59664

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Li0/l;->a:Li0/e;

    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    new-instance v2, Lh0/j1;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    move-object v10, v2

    .line 41
    check-cast v10, Lh0/j1;

    .line 42
    .line 43
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    new-instance v2, Lw/f0;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    move-object v13, v2

    .line 58
    check-cast v13, Lw/f0;

    .line 59
    .line 60
    new-instance v16, Lw/b1;

    .line 61
    .line 62
    iget-object v5, v0, Lw/c1;->g:Lw/q0;

    .line 63
    .line 64
    iget-object v6, v0, Lw/c1;->h:Lh0/d1;

    .line 65
    .line 66
    iget-object v7, v0, Lw/c1;->i:Ln2/s;

    .line 67
    .line 68
    iget-boolean v8, v0, Lw/c1;->j:Z

    .line 69
    .line 70
    iget-boolean v9, v0, Lw/c1;->k:Z

    .line 71
    .line 72
    iget-object v11, v0, Lw/c1;->l:Lb5/k;

    .line 73
    .line 74
    iget-object v12, v0, Lw/c1;->m:Lw/q1;

    .line 75
    .line 76
    iget-object v14, v0, Lw/c1;->n:Lfg/l;

    .line 77
    .line 78
    iget v15, v0, Lw/c1;->o:I

    .line 79
    .line 80
    move-object/from16 v4, v16

    .line 81
    .line 82
    invoke-direct/range {v4 .. v15}, Lw/b1;-><init>(Lw/q0;Lh0/d1;Ln2/s;ZZLh0/j1;Lb5/k;Lw/q1;Lw/f0;Lfg/l;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    if-ne v5, v3, :cond_3

    .line 96
    .line 97
    :cond_2
    new-instance v14, Lp8/p;

    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const/16 v22, 0xe

    .line 102
    .line 103
    const/4 v15, 0x1

    .line 104
    const-class v17, Lw/b1;

    .line 105
    .line 106
    const-string v18, "process"

    .line 107
    .line 108
    const-string v19, "process-ZmokQxo(Landroid/view/KeyEvent;)Z"

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    move-object/from16 v16, v4

    .line 113
    .line 114
    invoke-direct/range {v14 .. v22}, Lp8/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v5, v14

    .line 121
    :cond_3
    check-cast v5, Lgg/j;

    .line 122
    .line 123
    check-cast v5, Lfg/l;

    .line 124
    .line 125
    invoke-static {v5}, Lq1/d;->d(Lfg/l;)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-virtual {v1, v3}, Li0/h0;->p(Z)V

    .line 131
    .line 132
    .line 133
    return-object v2
.end method
