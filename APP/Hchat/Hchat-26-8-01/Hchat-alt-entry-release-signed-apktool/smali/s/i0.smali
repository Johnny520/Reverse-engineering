.class public final synthetic Ls/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lba/n;ILfg/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ls/i0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls/i0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ls/i0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Ls/i0;->h:I

    .line 12
    .line 13
    iput-object p4, p0, Ls/i0;->l:Lsf/b;

    .line 14
    .line 15
    iput p5, p0, Ls/i0;->i:I

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILs/j0;Ls0/d;I)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Ls/i0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/i0;->j:Ljava/lang/Object;

    iput p2, p0, Ls/i0;->h:I

    iput-object p3, p0, Ls/i0;->k:Ljava/lang/Object;

    iput-object p4, p0, Ls/i0;->l:Lsf/b;

    iput p5, p0, Ls/i0;->i:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lsf/b;III)V
    .locals 0

    .line 19
    iput p6, p0, Ls/i0;->g:I

    iput-object p1, p0, Ls/i0;->j:Ljava/lang/Object;

    iput-object p2, p0, Ls/i0;->k:Ljava/lang/Object;

    iput-object p3, p0, Ls/i0;->l:Lsf/b;

    iput p4, p0, Ls/i0;->h:I

    iput p5, p0, Ls/i0;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ls/i0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls/i0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Ls/i0;->k:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Ls/i0;->l:Lsf/b;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lfg/a;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Ls/i0;->h:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Li0/r;->C(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v6, p0, Ls/i0;->i:I

    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    iget-object v0, p0, Ls/i0;->j:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    check-cast v1, Landroid/content/Context;

    .line 49
    .line 50
    iget-object v0, p0, Ls/i0;->k:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Lba/n;

    .line 54
    .line 55
    iget-object v0, p0, Ls/i0;->l:Lsf/b;

    .line 56
    .line 57
    move-object v4, v0

    .line 58
    check-cast v4, Lfg/a;

    .line 59
    .line 60
    move-object v5, p1

    .line 61
    check-cast v5, Li0/h0;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget p1, p0, Ls/i0;->i:I

    .line 69
    .line 70
    or-int/lit8 p1, p1, 0x1

    .line 71
    .line 72
    invoke-static {p1}, Li0/r;->C(I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    iget v3, p0, Ls/i0;->h:I

    .line 77
    .line 78
    invoke-static/range {v1 .. v6}, Lwb/ho;->e2(Landroid/content/Context;Lba/n;ILfg/a;Li0/h0;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_1
    iget-object v0, p0, Ls/i0;->j:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    check-cast v1, Lwb/y2;

    .line 86
    .line 87
    iget-object v0, p0, Ls/i0;->k:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, v0

    .line 90
    check-cast v6, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v0, p0, Ls/i0;->l:Lsf/b;

    .line 93
    .line 94
    move-object v4, v0

    .line 95
    check-cast v4, Lfg/l;

    .line 96
    .line 97
    move-object v5, p1

    .line 98
    check-cast v5, Li0/h0;

    .line 99
    .line 100
    check-cast p2, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget p1, p0, Ls/i0;->h:I

    .line 106
    .line 107
    or-int/lit8 p1, p1, 0x1

    .line 108
    .line 109
    invoke-static {p1}, Li0/r;->C(I)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    iget v3, p0, Ls/i0;->i:I

    .line 114
    .line 115
    invoke-virtual/range {v1 .. v6}, Lwb/y2;->c(IILfg/l;Li0/h0;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_2
    iget-object v0, p0, Ls/i0;->k:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v3, v0

    .line 122
    check-cast v3, Ls/j0;

    .line 123
    .line 124
    iget-object v0, p0, Ls/i0;->l:Lsf/b;

    .line 125
    .line 126
    move-object v4, v0

    .line 127
    check-cast v4, Ls0/d;

    .line 128
    .line 129
    move-object v5, p1

    .line 130
    check-cast v5, Li0/h0;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget p1, p0, Ls/i0;->i:I

    .line 138
    .line 139
    or-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    invoke-static {p1}, Li0/r;->C(I)I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    iget-object v1, p0, Ls/i0;->j:Ljava/lang/Object;

    .line 146
    .line 147
    iget v2, p0, Ls/i0;->h:I

    .line 148
    .line 149
    invoke-static/range {v1 .. v6}, Ls/o;->b(Ljava/lang/Object;ILs/j0;Ls0/d;Li0/h0;I)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
