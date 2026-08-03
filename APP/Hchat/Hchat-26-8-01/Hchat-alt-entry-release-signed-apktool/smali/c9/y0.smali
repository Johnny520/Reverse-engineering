.class public final synthetic Lc9/y0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lc9/y0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/y0;->h:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/y0;->i:Lfg/l;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/y0;->j:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lfg/l;I)V
    .locals 0

    .line 14
    iput p4, p0, Lc9/y0;->g:I

    iput-object p1, p0, Lc9/y0;->h:Ljava/util/List;

    iput-object p2, p0, Lc9/y0;->j:Ljava/lang/String;

    iput-object p3, p0, Lc9/y0;->i:Lfg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lc9/y0;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/h;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lwb/sr;

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lwb/sr;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc9/y0;->h:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    new-instance v3, Lwb/nv;

    .line 25
    .line 26
    invoke-direct {v3, v0, v1}, Lwb/nv;-><init>(Lwb/sr;Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lwb/nv;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lwb/nv;-><init>(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Lwb/ov;

    .line 35
    .line 36
    iget-object v5, p0, Lc9/y0;->j:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v6, p0, Lc9/y0;->i:Lfg/l;

    .line 39
    .line 40
    invoke-direct {v4, v1, v5, v6}, Lwb/ov;-><init>(Ljava/util/List;Ljava/lang/String;Lfg/l;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Ls0/d;

    .line 44
    .line 45
    const v5, 0x2fd4df92

    .line 46
    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    invoke-direct {v1, v5, v4, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p1, Lr/h;->a:Lac/k;

    .line 53
    .line 54
    new-instance v4, Lb5/c;

    .line 55
    .line 56
    invoke-direct {v4, v3, v0, v1}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2, v4}, Lac/k;->b(ILb5/c;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lc9/y0;->h:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lfb/t0;

    .line 85
    .line 86
    iget-object v2, v1, Lfb/t0;->a:Ljava/lang/String;

    .line 87
    .line 88
    new-instance v3, Lc9/h0;

    .line 89
    .line 90
    const/16 v4, 0x1b

    .line 91
    .line 92
    iget-object v5, p0, Lc9/y0;->i:Lfg/l;

    .line 93
    .line 94
    iget-object v6, p0, Lc9/y0;->j:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v3, v5, v1, v6, v4}, Lc9/h0;-><init>(Lfg/l;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Ls0/d;

    .line 100
    .line 101
    const v4, 0x2580df45

    .line 102
    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-direct {v1, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 106
    .line 107
    .line 108
    const/4 v3, 0x2

    .line 109
    invoke-static {p1, v2, v1, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v0, Lc9/g0;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    iget-object v2, p0, Lc9/y0;->i:Lfg/l;

    .line 123
    .line 124
    iget-object v3, p0, Lc9/y0;->j:Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {v0, v1, v2, v3}, Lc9/g0;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v1, Ls0/d;

    .line 130
    .line 131
    const v4, 0x49caee55

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x1

    .line 135
    invoke-direct {v1, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 136
    .line 137
    .line 138
    const-string v0, "root"

    .line 139
    .line 140
    const/4 v4, 0x2

    .line 141
    invoke-static {p1, v0, v1, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lc9/y0;->h:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_2

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lc9/c1;

    .line 161
    .line 162
    iget-object v6, v1, Lc9/c1;->a:Ljava/lang/String;

    .line 163
    .line 164
    if-eqz v6, :cond_1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_1
    const-string v6, "__wechat_home__"

    .line 168
    .line 169
    :goto_2
    new-instance v7, Lc9/h0;

    .line 170
    .line 171
    const/4 v8, 0x0

    .line 172
    invoke-direct {v7, v1, v3, v2, v8}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 173
    .line 174
    .line 175
    new-instance v1, Ls0/d;

    .line 176
    .line 177
    const v8, -0x44f15e73

    .line 178
    .line 179
    .line 180
    invoke-direct {v1, v8, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1, v6, v1, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 188
    .line 189
    return-object p1

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
