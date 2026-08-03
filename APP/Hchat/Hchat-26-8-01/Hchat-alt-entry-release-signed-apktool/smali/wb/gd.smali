.class public final synthetic Lwb/gd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/gd;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/gd;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/gd;->i:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/gd;->j:Ljava/util/List;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/gd;->k:Lfg/p;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/gd;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/gd;->m:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 20
    iput p7, p0, Lwb/gd;->g:I

    iput-object p1, p0, Lwb/gd;->i:Ljava/util/List;

    iput-object p2, p0, Lwb/gd;->h:Ljava/util/ArrayList;

    iput-object p3, p0, Lwb/gd;->j:Ljava/util/List;

    iput-object p4, p0, Lwb/gd;->k:Lfg/p;

    iput-object p5, p0, Lwb/gd;->l:Li0/a1;

    iput-object p6, p0, Lwb/gd;->m:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/gd;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v2, Lwb/hf;

    .line 37
    .line 38
    const/4 v9, 0x2

    .line 39
    iget-object v3, p0, Lwb/gd;->i:Ljava/util/List;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/gd;->h:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/gd;->j:Ljava/util/List;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/gd;->k:Lfg/p;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/gd;->l:Li0/a1;

    .line 48
    .line 49
    iget-object v8, p0, Lwb/gd;->m:Li0/a1;

    .line 50
    .line 51
    invoke-direct/range {v2 .. v9}, Lwb/hf;-><init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 52
    .line 53
    .line 54
    const p1, -0x592eb10a

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/16 p3, 0x30

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_0
    const/16 v0, 0x10

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    if-eq p1, v0, :cond_2

    .line 78
    .line 79
    move p1, v1

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    :goto_2
    and-int/2addr p3, v1

    .line 83
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    new-instance v2, Lwb/hf;

    .line 90
    .line 91
    iget-object v3, p0, Lwb/gd;->h:Ljava/util/ArrayList;

    .line 92
    .line 93
    iget-object v4, p0, Lwb/gd;->i:Ljava/util/List;

    .line 94
    .line 95
    iget-object v5, p0, Lwb/gd;->j:Ljava/util/List;

    .line 96
    .line 97
    iget-object v6, p0, Lwb/gd;->k:Lfg/p;

    .line 98
    .line 99
    iget-object v7, p0, Lwb/gd;->l:Li0/a1;

    .line 100
    .line 101
    iget-object v8, p0, Lwb/gd;->m:Li0/a1;

    .line 102
    .line 103
    invoke-direct/range {v2 .. v8}, Lwb/hf;-><init>(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;)V

    .line 104
    .line 105
    .line 106
    const p1, -0xa27cb80

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const/16 p3, 0x30

    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 121
    .line 122
    .line 123
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_1
    const/16 v0, 0x10

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    if-eq p1, v0, :cond_4

    .line 130
    .line 131
    move p1, v1

    .line 132
    goto :goto_4

    .line 133
    :cond_4
    const/4 p1, 0x0

    .line 134
    :goto_4
    and-int/2addr p3, v1

    .line 135
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    new-instance v2, Lwb/hf;

    .line 142
    .line 143
    const/4 v9, 0x0

    .line 144
    iget-object v3, p0, Lwb/gd;->i:Ljava/util/List;

    .line 145
    .line 146
    iget-object v4, p0, Lwb/gd;->h:Ljava/util/ArrayList;

    .line 147
    .line 148
    iget-object v5, p0, Lwb/gd;->j:Ljava/util/List;

    .line 149
    .line 150
    iget-object v6, p0, Lwb/gd;->k:Lfg/p;

    .line 151
    .line 152
    iget-object v7, p0, Lwb/gd;->l:Li0/a1;

    .line 153
    .line 154
    iget-object v8, p0, Lwb/gd;->m:Li0/a1;

    .line 155
    .line 156
    invoke-direct/range {v2 .. v9}, Lwb/hf;-><init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Lfg/p;Li0/a1;Li0/a1;I)V

    .line 157
    .line 158
    .line 159
    const p1, -0x1dceab83

    .line 160
    .line 161
    .line 162
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const/16 p3, 0x30

    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 174
    .line 175
    .line 176
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 177
    .line 178
    return-object p1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
