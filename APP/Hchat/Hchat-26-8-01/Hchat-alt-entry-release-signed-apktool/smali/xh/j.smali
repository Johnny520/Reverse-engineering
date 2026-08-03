.class public final synthetic Lxh/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ls0/d;

.field public final synthetic j:Lsh/y;

.field public final synthetic k:Lsh/g0;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:F

.field public final synthetic o:Ls0/d;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;II)V
    .locals 0

    .line 1
    iput p10, p0, Lxh/j;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, Lxh/j;->h:Z

    .line 7
    .line 8
    iput-object p2, p0, Lxh/j;->i:Ls0/d;

    .line 9
    .line 10
    iput-object p3, p0, Lxh/j;->j:Lsh/y;

    .line 11
    .line 12
    iput-object p4, p0, Lxh/j;->k:Lsh/g0;

    .line 13
    .line 14
    iput-object p5, p0, Lxh/j;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p6, p0, Lxh/j;->m:Lfg/a;

    .line 17
    .line 18
    iput p7, p0, Lxh/j;->n:F

    .line 19
    .line 20
    iput-object p8, p0, Lxh/j;->o:Ls0/d;

    .line 21
    .line 22
    iput p9, p0, Lxh/j;->p:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lxh/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v9, p1

    .line 7
    check-cast v9, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lxh/j;->p:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    iget-boolean v1, p0, Lxh/j;->h:Z

    .line 23
    .line 24
    iget-object v2, p0, Lxh/j;->i:Ls0/d;

    .line 25
    .line 26
    iget-object v3, p0, Lxh/j;->j:Lsh/y;

    .line 27
    .line 28
    iget-object v4, p0, Lxh/j;->k:Lsh/g0;

    .line 29
    .line 30
    iget-object v5, p0, Lxh/j;->l:Lfg/a;

    .line 31
    .line 32
    iget-object v6, p0, Lxh/j;->m:Lfg/a;

    .line 33
    .line 34
    iget v7, p0, Lxh/j;->n:F

    .line 35
    .line 36
    iget-object v8, p0, Lxh/j;->o:Ls0/d;

    .line 37
    .line 38
    invoke-static/range {v1 .. v10}, Lig/a;->a(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    move-object v8, p1

    .line 45
    check-cast v8, Li0/h0;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget p1, p0, Lxh/j;->p:I

    .line 53
    .line 54
    or-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, Li0/r;->C(I)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    iget-boolean v0, p0, Lxh/j;->h:Z

    .line 61
    .line 62
    iget-object v1, p0, Lxh/j;->i:Ls0/d;

    .line 63
    .line 64
    iget-object v2, p0, Lxh/j;->j:Lsh/y;

    .line 65
    .line 66
    iget-object v3, p0, Lxh/j;->k:Lsh/g0;

    .line 67
    .line 68
    iget-object v4, p0, Lxh/j;->l:Lfg/a;

    .line 69
    .line 70
    iget-object v5, p0, Lxh/j;->m:Lfg/a;

    .line 71
    .line 72
    iget v6, p0, Lxh/j;->n:F

    .line 73
    .line 74
    iget-object v7, p0, Lxh/j;->o:Ls0/d;

    .line 75
    .line 76
    invoke-static/range {v0 .. v9}, Lig/a;->a(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_1
    move-object v8, p1

    .line 81
    check-cast v8, Li0/h0;

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget p1, p0, Lxh/j;->p:I

    .line 89
    .line 90
    or-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-static {p1}, Li0/r;->C(I)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    iget-boolean v0, p0, Lxh/j;->h:Z

    .line 97
    .line 98
    iget-object v1, p0, Lxh/j;->i:Ls0/d;

    .line 99
    .line 100
    iget-object v2, p0, Lxh/j;->j:Lsh/y;

    .line 101
    .line 102
    iget-object v3, p0, Lxh/j;->k:Lsh/g0;

    .line 103
    .line 104
    iget-object v4, p0, Lxh/j;->l:Lfg/a;

    .line 105
    .line 106
    iget-object v5, p0, Lxh/j;->m:Lfg/a;

    .line 107
    .line 108
    iget v6, p0, Lxh/j;->n:F

    .line 109
    .line 110
    iget-object v7, p0, Lxh/j;->o:Ls0/d;

    .line 111
    .line 112
    invoke-static/range {v0 .. v9}, Lig/a;->a(ZLs0/d;Lsh/y;Lsh/g0;Lfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
