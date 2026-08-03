.class public final synthetic Lsh/k0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ls0/d;

.field public final synthetic i:Lfg/p;

.field public final synthetic j:Lfg/p;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:I

.field public final synthetic m:Lfg/p;

.field public final synthetic n:I

.field public final synthetic o:Lfg/p;

.field public final synthetic p:Ls0/d;

.field public final synthetic q:Lp/r1;


# direct methods
.method public synthetic constructor <init>(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lp/r1;Ls0/d;I)V
    .locals 0

    .line 1
    const/4 p11, 0x0

    .line 2
    iput p11, p0, Lsh/k0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsh/k0;->h:Ls0/d;

    .line 8
    .line 9
    iput-object p2, p0, Lsh/k0;->i:Lfg/p;

    .line 10
    .line 11
    iput-object p3, p0, Lsh/k0;->j:Lfg/p;

    .line 12
    .line 13
    iput-object p4, p0, Lsh/k0;->k:Lfg/p;

    .line 14
    .line 15
    iput p5, p0, Lsh/k0;->l:I

    .line 16
    .line 17
    iput-object p6, p0, Lsh/k0;->m:Lfg/p;

    .line 18
    .line 19
    iput p7, p0, Lsh/k0;->n:I

    .line 20
    .line 21
    iput-object p8, p0, Lsh/k0;->o:Lfg/p;

    .line 22
    .line 23
    iput-object p9, p0, Lsh/k0;->q:Lp/r1;

    .line 24
    .line 25
    iput-object p10, p0, Lsh/k0;->p:Ls0/d;

    .line 26
    .line 27
    return-void
.end method

.method public synthetic constructor <init>(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lsh/e0;Ls0/d;)V
    .locals 1

    .line 28
    const/4 v0, 0x1

    iput v0, p0, Lsh/k0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/k0;->h:Ls0/d;

    iput-object p2, p0, Lsh/k0;->i:Lfg/p;

    iput-object p3, p0, Lsh/k0;->j:Lfg/p;

    iput-object p4, p0, Lsh/k0;->k:Lfg/p;

    iput p5, p0, Lsh/k0;->l:I

    iput-object p6, p0, Lsh/k0;->m:Lfg/p;

    iput p7, p0, Lsh/k0;->n:I

    iput-object p8, p0, Lsh/k0;->o:Lfg/p;

    iput-object p9, p0, Lsh/k0;->q:Lp/r1;

    iput-object p10, p0, Lsh/k0;->p:Ls0/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lsh/k0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/k0;->q:Lp/r1;

    .line 7
    .line 8
    move-object v9, v0

    .line 9
    check-cast v9, Lsh/e0;

    .line 10
    .line 11
    move-object v11, p1

    .line 12
    check-cast v11, Li0/h0;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    and-int/lit8 p2, p1, 0x3

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p2, v0, :cond_0

    .line 25
    .line 26
    move p2, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x0

    .line 29
    :goto_0
    and-int/2addr p1, v1

    .line 30
    invoke-virtual {v11, p1, p2}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/4 v12, 0x0

    .line 37
    iget-object v1, p0, Lsh/k0;->h:Ls0/d;

    .line 38
    .line 39
    iget-object v2, p0, Lsh/k0;->i:Lfg/p;

    .line 40
    .line 41
    iget-object v3, p0, Lsh/k0;->j:Lfg/p;

    .line 42
    .line 43
    iget-object v4, p0, Lsh/k0;->k:Lfg/p;

    .line 44
    .line 45
    iget v5, p0, Lsh/k0;->l:I

    .line 46
    .line 47
    iget-object v6, p0, Lsh/k0;->m:Lfg/p;

    .line 48
    .line 49
    iget v7, p0, Lsh/k0;->n:I

    .line 50
    .line 51
    iget-object v8, p0, Lsh/k0;->o:Lfg/p;

    .line 52
    .line 53
    iget-object v10, p0, Lsh/k0;->p:Ls0/d;

    .line 54
    .line 55
    invoke-static/range {v1 .. v12}, Lsh/p0;->b(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lp/r1;Ls0/d;Li0/h0;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    move-object v10, p1

    .line 66
    check-cast v10, Li0/h0;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-static {p1}, Li0/r;->C(I)I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    iget-object v0, p0, Lsh/k0;->h:Ls0/d;

    .line 79
    .line 80
    iget-object v1, p0, Lsh/k0;->i:Lfg/p;

    .line 81
    .line 82
    iget-object v2, p0, Lsh/k0;->j:Lfg/p;

    .line 83
    .line 84
    iget-object v3, p0, Lsh/k0;->k:Lfg/p;

    .line 85
    .line 86
    iget v4, p0, Lsh/k0;->l:I

    .line 87
    .line 88
    iget-object v5, p0, Lsh/k0;->m:Lfg/p;

    .line 89
    .line 90
    iget v6, p0, Lsh/k0;->n:I

    .line 91
    .line 92
    iget-object v7, p0, Lsh/k0;->o:Lfg/p;

    .line 93
    .line 94
    iget-object v8, p0, Lsh/k0;->q:Lp/r1;

    .line 95
    .line 96
    iget-object v9, p0, Lsh/k0;->p:Ls0/d;

    .line 97
    .line 98
    invoke-static/range {v0 .. v11}, Lsh/p0;->b(Ls0/d;Lfg/p;Lfg/p;Lfg/p;ILfg/p;ILfg/p;Lp/r1;Ls0/d;Li0/h0;I)V

    .line 99
    .line 100
    .line 101
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    return-object p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
