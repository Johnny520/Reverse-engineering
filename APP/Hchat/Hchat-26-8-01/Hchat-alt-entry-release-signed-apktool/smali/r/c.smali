.class public final synthetic Lr/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr/z;

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Le9/c;Lr/z;ZLfg/a;Lfg/l;Lfg/a;Lfg/l;Lfg/l;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr/c;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr/c;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lr/c;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lr/c;->h:Lr/z;

    .line 12
    .line 13
    iput-boolean p4, p0, Lr/c;->i:Z

    .line 14
    .line 15
    iput-object p5, p0, Lr/c;->o:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lr/c;->j:Lfg/l;

    .line 18
    .line 19
    iput-object p7, p0, Lr/c;->p:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lr/c;->q:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p9, p0, Lr/c;->r:Ljava/lang/Object;

    .line 24
    .line 25
    iput p10, p0, Lr/c;->k:I

    .line 26
    .line 27
    iput p11, p0, Lr/c;->l:I

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;II)V
    .locals 1

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lr/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/c;->m:Ljava/lang/Object;

    iput-object p2, p0, Lr/c;->h:Lr/z;

    iput-object p3, p0, Lr/c;->n:Ljava/lang/Object;

    iput-object p4, p0, Lr/c;->o:Ljava/lang/Object;

    iput-object p5, p0, Lr/c;->p:Ljava/lang/Object;

    iput-object p6, p0, Lr/c;->q:Ljava/lang/Object;

    iput-boolean p7, p0, Lr/c;->i:Z

    iput-object p8, p0, Lr/c;->r:Ljava/lang/Object;

    iput-object p9, p0, Lr/c;->j:Lfg/l;

    iput p10, p0, Lr/c;->k:I

    iput p11, p0, Lr/c;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lr/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/c;->m:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v0, p0, Lr/c;->n:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Le9/c;

    .line 15
    .line 16
    iget-object v0, p0, Lr/c;->o:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Lfg/a;

    .line 20
    .line 21
    iget-object v0, p0, Lr/c;->p:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v7, v0

    .line 24
    check-cast v7, Lfg/a;

    .line 25
    .line 26
    iget-object v0, p0, Lr/c;->q:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v8, v0

    .line 29
    check-cast v8, Lfg/l;

    .line 30
    .line 31
    iget-object v0, p0, Lr/c;->r:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v9, v0

    .line 34
    check-cast v9, Lfg/l;

    .line 35
    .line 36
    move-object v10, p1

    .line 37
    check-cast v10, Li0/h0;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget p1, p0, Lr/c;->k:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, Li0/r;->C(I)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    iget-object v3, p0, Lr/c;->h:Lr/z;

    .line 53
    .line 54
    iget-boolean v4, p0, Lr/c;->i:Z

    .line 55
    .line 56
    iget-object v6, p0, Lr/c;->j:Lfg/l;

    .line 57
    .line 58
    iget v12, p0, Lr/c;->l:I

    .line 59
    .line 60
    invoke-static/range {v1 .. v12}, Lwb/ho;->n0(Landroid/content/Context;Le9/c;Lr/z;ZLfg/a;Lfg/l;Lfg/a;Lfg/l;Lfg/l;Li0/h0;II)V

    .line 61
    .line 62
    .line 63
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    iget-object v0, p0, Lr/c;->m:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v1, v0

    .line 69
    check-cast v1, Ly0/o;

    .line 70
    .line 71
    iget-object v0, p0, Lr/c;->n:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v3, v0

    .line 74
    check-cast v3, Lp/x0;

    .line 75
    .line 76
    iget-object v0, p0, Lr/c;->o:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v4, v0

    .line 79
    check-cast v4, Lp/i;

    .line 80
    .line 81
    iget-object v0, p0, Lr/c;->p:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v5, v0

    .line 84
    check-cast v5, Ly0/e;

    .line 85
    .line 86
    iget-object v0, p0, Lr/c;->q:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v6, v0

    .line 89
    check-cast v6, Lm/p;

    .line 90
    .line 91
    iget-object v0, p0, Lr/c;->r:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v8, v0

    .line 94
    check-cast v8, Lk/k1;

    .line 95
    .line 96
    move-object v10, p1

    .line 97
    check-cast v10, Li0/h0;

    .line 98
    .line 99
    check-cast p2, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget p1, p0, Lr/c;->k:I

    .line 105
    .line 106
    or-int/lit8 p1, p1, 0x1

    .line 107
    .line 108
    invoke-static {p1}, Li0/r;->C(I)I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    iget-object v2, p0, Lr/c;->h:Lr/z;

    .line 113
    .line 114
    iget-boolean v7, p0, Lr/c;->i:Z

    .line 115
    .line 116
    iget-object v9, p0, Lr/c;->j:Lfg/l;

    .line 117
    .line 118
    iget v12, p0, Lr/c;->l:I

    .line 119
    .line 120
    invoke-static/range {v1 .. v12}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
