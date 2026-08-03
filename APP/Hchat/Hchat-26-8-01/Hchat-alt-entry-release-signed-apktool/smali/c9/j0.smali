.class public final synthetic Lc9/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly0/o;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc9/j1;Ljava/lang/String;Ljava/lang/String;Lfg/l;Ly0/o;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc9/j0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/j0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/j0;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/j0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lc9/j0;->i:Lfg/l;

    .line 14
    .line 15
    iput-object p5, p0, Lc9/j0;->h:Ly0/o;

    .line 16
    .line 17
    iput p6, p0, Lc9/j0;->j:I

    .line 18
    .line 19
    iput p7, p0, Lc9/j0;->k:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Li2/g;Ly0/o;Li2/n0;Lfg/l;ILjava/util/Map;I)V
    .locals 1

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Lc9/j0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/j0;->l:Ljava/lang/Object;

    iput-object p2, p0, Lc9/j0;->h:Ly0/o;

    iput-object p3, p0, Lc9/j0;->m:Ljava/lang/Object;

    iput-object p4, p0, Lc9/j0;->i:Lfg/l;

    iput p5, p0, Lc9/j0;->j:I

    iput-object p6, p0, Lc9/j0;->n:Ljava/lang/Object;

    iput p7, p0, Lc9/j0;->k:I

    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Ljava/lang/String;Ljava/lang/String;IILy0/o;Lfg/l;I)V
    .locals 0

    .line 23
    const/4 p8, 0x2

    iput p8, p0, Lc9/j0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/j0;->l:Ljava/lang/Object;

    iput-object p2, p0, Lc9/j0;->m:Ljava/lang/Object;

    iput-object p3, p0, Lc9/j0;->n:Ljava/lang/Object;

    iput p4, p0, Lc9/j0;->j:I

    iput p5, p0, Lc9/j0;->k:I

    iput-object p6, p0, Lc9/j0;->h:Ly0/o;

    iput-object p7, p0, Lc9/j0;->i:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lc9/j0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/j0;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Lc9/j0;->m:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lc9/j0;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    move-object v8, p1

    .line 22
    check-cast v8, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const p1, 0x180d87

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Li0/r;->C(I)I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    iget v4, p0, Lc9/j0;->j:I

    .line 37
    .line 38
    iget v5, p0, Lc9/j0;->k:I

    .line 39
    .line 40
    iget-object v6, p0, Lc9/j0;->h:Ly0/o;

    .line 41
    .line 42
    iget-object v7, p0, Lc9/j0;->i:Lfg/l;

    .line 43
    .line 44
    invoke-virtual/range {v1 .. v9}, Lwb/y2;->j(Ljava/lang/String;Ljava/lang/String;IILy0/o;Lfg/l;Li0/h0;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_0
    iget-object v0, p0, Lc9/j0;->l:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v1, v0

    .line 53
    check-cast v1, Li2/g;

    .line 54
    .line 55
    iget-object v0, p0, Lc9/j0;->m:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Li2/n0;

    .line 59
    .line 60
    iget-object v0, p0, Lc9/j0;->n:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v6, v0

    .line 63
    check-cast v6, Ljava/util/Map;

    .line 64
    .line 65
    move-object v7, p1

    .line 66
    check-cast v7, Li0/h0;

    .line 67
    .line 68
    check-cast p2, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget p1, p0, Lc9/j0;->k:I

    .line 74
    .line 75
    or-int/lit8 p1, p1, 0x1

    .line 76
    .line 77
    invoke-static {p1}, Li0/r;->C(I)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    iget-object v2, p0, Lc9/j0;->h:Ly0/o;

    .line 82
    .line 83
    iget-object v4, p0, Lc9/j0;->i:Lfg/l;

    .line 84
    .line 85
    iget v5, p0, Lc9/j0;->j:I

    .line 86
    .line 87
    invoke-static/range {v1 .. v8}, Lw/s;->a(Li2/g;Ly0/o;Li2/n0;Lfg/l;ILjava/util/Map;Li0/h0;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_1
    iget-object v0, p0, Lc9/j0;->l:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v1, v0

    .line 94
    check-cast v1, Lc9/j1;

    .line 95
    .line 96
    iget-object v0, p0, Lc9/j0;->m:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v6, v0

    .line 99
    check-cast v6, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v0, p0, Lc9/j0;->n:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v7, v0

    .line 104
    check-cast v7, Ljava/lang/String;

    .line 105
    .line 106
    move-object v5, p1

    .line 107
    check-cast v5, Li0/h0;

    .line 108
    .line 109
    check-cast p2, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget p1, p0, Lc9/j0;->j:I

    .line 115
    .line 116
    or-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    invoke-static {p1}, Li0/r;->C(I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    iget v3, p0, Lc9/j0;->k:I

    .line 123
    .line 124
    iget-object v4, p0, Lc9/j0;->i:Lfg/l;

    .line 125
    .line 126
    iget-object v8, p0, Lc9/j0;->h:Ly0/o;

    .line 127
    .line 128
    invoke-virtual/range {v1 .. v8}, Lc9/j1;->g(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
