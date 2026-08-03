.class public final Ly1/g1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/p;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/p;II)V
    .locals 0

    .line 15
    iput p5, p0, Ly1/g1;->g:I

    iput-object p1, p0, Ly1/g1;->i:Ljava/lang/Object;

    iput-object p2, p0, Ly1/g1;->j:Ljava/lang/Object;

    iput-object p3, p0, Ly1/g1;->h:Lfg/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly1/x2;Ly1/f1;Lfg/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ly1/g1;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Ly1/g1;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/g1;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ly1/g1;->h:Lfg/p;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ly1/g1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li0/h0;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Ly1/g1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lfg/a;

    .line 16
    .line 17
    iget-object v0, p0, Ly1/g1;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ly2/u;

    .line 20
    .line 21
    iget-object v1, p0, Ly1/g1;->h:Lfg/p;

    .line 22
    .line 23
    check-cast v1, Ls0/d;

    .line 24
    .line 25
    const/16 v2, 0x181

    .line 26
    .line 27
    invoke-static {v2}, Li0/r;->C(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {p2, v0, v1, p1, v2}, Lx6/d;->a(Lfg/a;Ly2/u;Ls0/d;Li0/h0;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_0
    check-cast p1, Li0/h0;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object v0, p0, Ly1/g1;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ly1/x2;

    .line 48
    .line 49
    and-int/lit8 v1, p2, 0x3

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    const/4 v3, 0x1

    .line 53
    const/4 v4, 0x0

    .line 54
    if-eq v1, v2, :cond_0

    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v1, v4

    .line 59
    :goto_0
    and-int/2addr p2, v3

    .line 60
    invoke-virtual {p1, p2, v1}, Li0/h0;->S(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    iget-object p2, v0, Ly1/x2;->g:Ly1/t;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v3, 0x0

    .line 77
    sget-object v5, Li0/l;->a:Li0/e;

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    if-ne v2, v5, :cond_2

    .line 82
    .line 83
    :cond_1
    new-instance v2, Ly1/w2;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {v2, v0, v3, v1}, Ly1/w2;-><init>(Ly1/x2;Lwf/c;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    check-cast v2, Lfg/p;

    .line 93
    .line 94
    invoke-static {v2, p1, p2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    if-ne v2, v5, :cond_4

    .line 108
    .line 109
    :cond_3
    new-instance v2, Ly1/w2;

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-direct {v2, v0, v3, v1}, Ly1/w2;-><init>(Ly1/x2;Lwf/c;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    check-cast v2, Lfg/p;

    .line 119
    .line 120
    invoke-static {v2, p1, p2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Ly1/g1;->j:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ly1/f1;

    .line 126
    .line 127
    iget-object v1, p0, Ly1/g1;->h:Lfg/p;

    .line 128
    .line 129
    invoke-virtual {v0, p2, v1, p1, v4}, Ly1/f1;->a(Ly1/t;Lfg/p;Li0/h0;I)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    invoke-virtual {p1}, Li0/h0;->V()V

    .line 134
    .line 135
    .line 136
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 137
    .line 138
    return-object p1

    .line 139
    :pswitch_1
    check-cast p1, Li0/h0;

    .line 140
    .line 141
    check-cast p2, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 144
    .line 145
    .line 146
    iget-object p2, p0, Ly1/g1;->i:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p2, Lx1/r1;

    .line 149
    .line 150
    iget-object v0, p0, Ly1/g1;->j:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Ly1/p0;

    .line 153
    .line 154
    const/4 v1, 0x1

    .line 155
    invoke-static {v1}, Li0/r;->C(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    iget-object v2, p0, Ly1/g1;->h:Lfg/p;

    .line 160
    .line 161
    invoke-static {p2, v0, v2, p1, v1}, Ly1/h1;->a(Lx1/r1;Ly1/p0;Lfg/p;Li0/h0;I)V

    .line 162
    .line 163
    .line 164
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 165
    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
