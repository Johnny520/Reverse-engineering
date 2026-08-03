.class public final synthetic Lw/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ly0/o;

.field public final synthetic j:Z

.field public final synthetic k:Li2/n0;

.field public final synthetic l:Lw/p0;

.field public final synthetic m:Lw/o0;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:Lj8/o;

.field public final synthetic r:Lfg/l;

.field public final synthetic s:Lf1/s;

.field public final synthetic t:Lfg/q;

.field public final synthetic u:I

.field public final synthetic v:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;IIII)V
    .locals 1

    .line 1
    move/from16 v0, p18

    .line 2
    .line 3
    iput v0, p0, Lw/h;->g:I

    .line 4
    .line 5
    iput-object p1, p0, Lw/h;->x:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p2, p0, Lw/h;->h:Lfg/l;

    .line 8
    .line 9
    iput-object p3, p0, Lw/h;->i:Ly0/o;

    .line 10
    .line 11
    iput-boolean p4, p0, Lw/h;->j:Z

    .line 12
    .line 13
    iput-object p5, p0, Lw/h;->k:Li2/n0;

    .line 14
    .line 15
    iput-object p6, p0, Lw/h;->l:Lw/p0;

    .line 16
    .line 17
    iput-object p7, p0, Lw/h;->m:Lw/o0;

    .line 18
    .line 19
    iput-boolean p8, p0, Lw/h;->n:Z

    .line 20
    .line 21
    iput p9, p0, Lw/h;->o:I

    .line 22
    .line 23
    iput p10, p0, Lw/h;->p:I

    .line 24
    .line 25
    iput-object p11, p0, Lw/h;->q:Lj8/o;

    .line 26
    .line 27
    iput-object p12, p0, Lw/h;->r:Lfg/l;

    .line 28
    .line 29
    iput-object p13, p0, Lw/h;->s:Lf1/s;

    .line 30
    .line 31
    iput-object p14, p0, Lw/h;->t:Lfg/q;

    .line 32
    .line 33
    move/from16 p1, p15

    .line 34
    .line 35
    iput p1, p0, Lw/h;->u:I

    .line 36
    .line 37
    move/from16 p1, p16

    .line 38
    .line 39
    iput p1, p0, Lw/h;->v:I

    .line 40
    .line 41
    move/from16 p1, p17

    .line 42
    .line 43
    iput p1, p0, Lw/h;->w:I

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/h;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lw/h;->x:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Ln2/s;

    .line 12
    .line 13
    move-object/from16 v16, p1

    .line 14
    .line 15
    check-cast v16, Li0/h0;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v1, v0, Lw/h;->u:I

    .line 25
    .line 26
    or-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    invoke-static {v1}, Li0/r;->C(I)I

    .line 29
    .line 30
    .line 31
    move-result v17

    .line 32
    iget v1, v0, Lw/h;->v:I

    .line 33
    .line 34
    invoke-static {v1}, Li0/r;->C(I)I

    .line 35
    .line 36
    .line 37
    move-result v18

    .line 38
    iget-object v3, v0, Lw/h;->h:Lfg/l;

    .line 39
    .line 40
    iget-object v4, v0, Lw/h;->i:Ly0/o;

    .line 41
    .line 42
    iget-boolean v5, v0, Lw/h;->j:Z

    .line 43
    .line 44
    iget-object v6, v0, Lw/h;->k:Li2/n0;

    .line 45
    .line 46
    iget-object v7, v0, Lw/h;->l:Lw/p0;

    .line 47
    .line 48
    iget-object v8, v0, Lw/h;->m:Lw/o0;

    .line 49
    .line 50
    iget-boolean v9, v0, Lw/h;->n:Z

    .line 51
    .line 52
    iget v10, v0, Lw/h;->o:I

    .line 53
    .line 54
    iget v11, v0, Lw/h;->p:I

    .line 55
    .line 56
    iget-object v12, v0, Lw/h;->q:Lj8/o;

    .line 57
    .line 58
    iget-object v13, v0, Lw/h;->r:Lfg/l;

    .line 59
    .line 60
    iget-object v14, v0, Lw/h;->s:Lf1/s;

    .line 61
    .line 62
    iget-object v15, v0, Lw/h;->t:Lfg/q;

    .line 63
    .line 64
    iget v1, v0, Lw/h;->w:I

    .line 65
    .line 66
    move/from16 v19, v1

    .line 67
    .line 68
    invoke-static/range {v2 .. v19}, Lw/i;->b(Ln2/s;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 69
    .line 70
    .line 71
    :goto_0
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object v1

    .line 74
    :pswitch_0
    iget-object v1, v0, Lw/h;->x:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v2, v1

    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    move-object/from16 v16, p1

    .line 80
    .line 81
    check-cast v16, Li0/h0;

    .line 82
    .line 83
    move-object/from16 v1, p2

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget v1, v0, Lw/h;->u:I

    .line 91
    .line 92
    or-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    invoke-static {v1}, Li0/r;->C(I)I

    .line 95
    .line 96
    .line 97
    move-result v17

    .line 98
    iget v1, v0, Lw/h;->v:I

    .line 99
    .line 100
    invoke-static {v1}, Li0/r;->C(I)I

    .line 101
    .line 102
    .line 103
    move-result v18

    .line 104
    iget-object v3, v0, Lw/h;->h:Lfg/l;

    .line 105
    .line 106
    iget-object v4, v0, Lw/h;->i:Ly0/o;

    .line 107
    .line 108
    iget-boolean v5, v0, Lw/h;->j:Z

    .line 109
    .line 110
    iget-object v6, v0, Lw/h;->k:Li2/n0;

    .line 111
    .line 112
    iget-object v7, v0, Lw/h;->l:Lw/p0;

    .line 113
    .line 114
    iget-object v8, v0, Lw/h;->m:Lw/o0;

    .line 115
    .line 116
    iget-boolean v9, v0, Lw/h;->n:Z

    .line 117
    .line 118
    iget v10, v0, Lw/h;->o:I

    .line 119
    .line 120
    iget v11, v0, Lw/h;->p:I

    .line 121
    .line 122
    iget-object v12, v0, Lw/h;->q:Lj8/o;

    .line 123
    .line 124
    iget-object v13, v0, Lw/h;->r:Lfg/l;

    .line 125
    .line 126
    iget-object v14, v0, Lw/h;->s:Lf1/s;

    .line 127
    .line 128
    iget-object v15, v0, Lw/h;->t:Lfg/q;

    .line 129
    .line 130
    iget v1, v0, Lw/h;->w:I

    .line 131
    .line 132
    move/from16 v19, v1

    .line 133
    .line 134
    invoke-static/range {v2 .. v19}, Lw/i;->a(Ljava/lang/String;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
