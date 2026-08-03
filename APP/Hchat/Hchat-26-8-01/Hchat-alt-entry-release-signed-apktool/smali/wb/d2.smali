.class public final Lwb/d2;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/d2;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/d2;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/d2;->j:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/d2;->k:Li0/a1;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 7

    .line 1
    iget p1, p0, Lwb/d2;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/d2;

    .line 7
    .line 8
    iget-object v3, p0, Lwb/d2;->k:Li0/a1;

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    iget-object v1, p0, Lwb/d2;->i:Ljava/util/List;

    .line 12
    .line 13
    iget-object v2, p0, Lwb/d2;->j:Li0/a1;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lwb/d2;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v1, Lwb/d2;

    .line 22
    .line 23
    iget-object v4, p0, Lwb/d2;->k:Li0/a1;

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    iget-object v2, p0, Lwb/d2;->i:Ljava/util/List;

    .line 27
    .line 28
    iget-object v3, p0, Lwb/d2;->j:Li0/a1;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, Lwb/d2;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v5, p2

    .line 35
    new-instance v1, Lwb/d2;

    .line 36
    .line 37
    iget-object v4, p0, Lwb/d2;->k:Li0/a1;

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    iget-object v2, p0, Lwb/d2;->i:Ljava/util/List;

    .line 41
    .line 42
    iget-object v3, p0, Lwb/d2;->j:Li0/a1;

    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, Lwb/d2;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_2
    move-object v5, p2

    .line 49
    new-instance v1, Lwb/d2;

    .line 50
    .line 51
    iget-object v4, p0, Lwb/d2;->k:Li0/a1;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    iget-object v2, p0, Lwb/d2;->i:Ljava/util/List;

    .line 55
    .line 56
    iget-object v3, p0, Lwb/d2;->j:Li0/a1;

    .line 57
    .line 58
    invoke-direct/range {v1 .. v6}, Lwb/d2;-><init>(Ljava/util/List;Li0/a1;Li0/a1;Lwf/c;I)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/d2;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/d2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/d2;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lwb/d2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lwb/d2;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lwb/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lwb/d2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lwb/d2;

    .line 39
    .line 40
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lwb/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lwb/d2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lwb/d2;

    .line 51
    .line 52
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lwb/d2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/d2;->h:I

    .line 2
    .line 3
    sget-object v1, Lwb/t0;->l:Lwb/t0;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    iget-object v4, p0, Lwb/d2;->i:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lwb/d2;->j:Li0/a1;

    .line 12
    .line 13
    iget-object v6, p0, Lwb/d2;->k:Li0/a1;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lwb/iv;

    .line 26
    .line 27
    sget-object v0, Lwb/iv;->m:Lwb/iv;

    .line 28
    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-static {v4}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    if-nez p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v2, p1

    .line 53
    :goto_0
    invoke-interface {v6, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v3

    .line 57
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/String;

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-object v3

    .line 72
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Lwb/ho;->a:Log/k;

    .line 76
    .line 77
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lwb/t0;

    .line 82
    .line 83
    if-ne p1, v1, :cond_5

    .line 84
    .line 85
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_6

    .line 108
    .line 109
    :cond_3
    invoke-static {v4}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    if-nez p1, :cond_4

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    move-object v2, p1

    .line 119
    :goto_1
    invoke-interface {v6, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_6

    .line 134
    .line 135
    invoke-interface {v6, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    :goto_2
    return-object v3

    .line 139
    :pswitch_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object p1, Lwb/h2;->a:Lwb/h2;

    .line 143
    .line 144
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Lwb/t0;

    .line 149
    .line 150
    if-ne p1, v1, :cond_9

    .line 151
    .line 152
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-nez p1, :cond_7

    .line 163
    .line 164
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Ljava/lang/String;

    .line 169
    .line 170
    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-nez p1, :cond_a

    .line 175
    .line 176
    :cond_7
    invoke-static {v4}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Ljava/lang/String;

    .line 181
    .line 182
    if-nez p1, :cond_8

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    move-object v2, p1

    .line 186
    :goto_3
    invoke-interface {v6, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_a

    .line 201
    .line 202
    invoke-interface {v6, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_a
    :goto_4
    return-object v3

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
