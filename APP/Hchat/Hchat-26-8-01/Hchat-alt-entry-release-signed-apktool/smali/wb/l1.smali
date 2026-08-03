.class public final synthetic Lwb/l1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lwb/l1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/l1;->i:Lfg/l;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/l1;->h:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lfg/l;I)V
    .locals 0

    .line 12
    iput p3, p0, Lwb/l1;->g:I

    iput-object p1, p0, Lwb/l1;->h:Ljava/util/List;

    iput-object p2, p0, Lwb/l1;->i:Lfg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/l1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/l1;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lfb/t0;

    .line 29
    .line 30
    iget-object v2, v2, Lfb/t0;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    check-cast v1, Lfb/t0;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lwb/l1;->i:Lfg/l;

    .line 45
    .line 46
    invoke-interface {p1, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget-object v0, p0, Lwb/l1;->h:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {p1, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lwb/dq;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object p1, p1, Lwb/dq;->b:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v0, p0, Lwb/l1;->i:Lfg/l;

    .line 71
    .line 72
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    iget-object v0, p0, Lwb/l1;->h:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lwb/s4;

    .line 91
    .line 92
    iget-object p1, p1, Lwb/s4;->a:Lwb/t4;

    .line 93
    .line 94
    iget-object v0, p0, Lwb/l1;->i:Lfg/l;

    .line 95
    .line 96
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget-object v0, p0, Lwb/l1;->h:Ljava/util/List;

    .line 109
    .line 110
    invoke-static {p1, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lwb/bp;

    .line 115
    .line 116
    if-eqz p1, :cond_4

    .line 117
    .line 118
    iget p1, p1, Lwb/bp;->b:I

    .line 119
    .line 120
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object v0, p0, Lwb/l1;->i:Lfg/l;

    .line 125
    .line 126
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    :cond_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 130
    .line 131
    return-object p1

    .line 132
    :pswitch_3
    check-cast p1, Lr/h;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v0, Lwb/p0;->o3:Ls0/d;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    const/4 v2, 0x3

    .line 141
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lwb/r1;

    .line 145
    .line 146
    const/4 v3, 0x2

    .line 147
    iget-object v4, p0, Lwb/l1;->h:Ljava/util/List;

    .line 148
    .line 149
    iget-object v5, p0, Lwb/l1;->i:Lfg/l;

    .line 150
    .line 151
    invoke-direct {v0, v4, v5, v3}, Lwb/r1;-><init>(Ljava/util/List;Lfg/l;I)V

    .line 152
    .line 153
    .line 154
    new-instance v3, Ls0/d;

    .line 155
    .line 156
    const v4, 0x1336ae23

    .line 157
    .line 158
    .line 159
    const/4 v5, 0x1

    .line 160
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :pswitch_4
    check-cast p1, Lr/h;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lwb/p0;->n3:Ls0/d;

    .line 173
    .line 174
    const/4 v1, 0x0

    .line 175
    const/4 v2, 0x3

    .line 176
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 177
    .line 178
    .line 179
    new-instance v0, Lwb/r1;

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    iget-object v4, p0, Lwb/l1;->h:Ljava/util/List;

    .line 183
    .line 184
    iget-object v5, p0, Lwb/l1;->i:Lfg/l;

    .line 185
    .line 186
    invoke-direct {v0, v4, v5, v3}, Lwb/r1;-><init>(Ljava/util/List;Lfg/l;I)V

    .line 187
    .line 188
    .line 189
    new-instance v3, Ls0/d;

    .line 190
    .line 191
    const v4, 0x76fa6ba0

    .line 192
    .line 193
    .line 194
    const/4 v5, 0x1

    .line 195
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
