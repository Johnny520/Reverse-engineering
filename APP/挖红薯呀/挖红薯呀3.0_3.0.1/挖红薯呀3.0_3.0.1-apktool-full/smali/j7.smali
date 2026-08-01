.class public final Lj7;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Liu;


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Liu;Lpk;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lj7;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lj7;->e:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Ls91;->P(Lpk;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lj7;->f:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, Le;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {p2, p1, v0, v1}, Le;-><init>(Ljava/lang/Object;Lik;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lj7;->g:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 26
    iput p4, p0, Lj7;->d:I

    iput-object p1, p0, Lj7;->e:Ljava/lang/Object;

    iput-object p2, p0, Lj7;->f:Ljava/lang/Object;

    iput-object p3, p0, Lj7;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Lik;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lj7;->d:I

    .line 2
    .line 3
    sget-object v1, Lzk;->d:Lzk;

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget-object v3, p0, Lj7;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lj7;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lj7;->e:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Lpk;

    .line 17
    .line 18
    check-cast v3, Le;

    .line 19
    .line 20
    invoke-static {v5, p1, v4, v3, p2}, Lkl;->D(Lpk;Ljava/lang/Object;Ljava/lang/Object;Lww;Lik;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-ne p0, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    :cond_0
    return-object v2

    .line 28
    :pswitch_0
    instance-of v0, p2, Lku;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lku;

    .line 34
    .line 35
    iget v6, v0, Lku;->k:I

    .line 36
    .line 37
    const/high16 v7, -0x80000000

    .line 38
    .line 39
    and-int v8, v6, v7

    .line 40
    .line 41
    if-eqz v8, :cond_1

    .line 42
    .line 43
    sub-int/2addr v6, v7

    .line 44
    iput v6, v0, Lku;->k:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v0, Lku;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lku;-><init>(Lj7;Lik;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object p2, v0, Lku;->i:Ljava/lang/Object;

    .line 53
    .line 54
    iget v6, v0, Lku;->k:I

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x3

    .line 58
    const/4 v9, 0x2

    .line 59
    const/4 v10, 0x1

    .line 60
    if-eqz v6, :cond_6

    .line 61
    .line 62
    if-eq v6, v10, :cond_2

    .line 63
    .line 64
    if-eq v6, v9, :cond_5

    .line 65
    .line 66
    if-ne v6, v8, :cond_4

    .line 67
    .line 68
    :cond_2
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    move-object v1, v2

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v1, v7

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    iget-object p1, v0, Lku;->h:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object p0, v0, Lku;->g:Lj7;

    .line 83
    .line 84
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    invoke-static {p2}, Lw60;->M(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    check-cast v5, Lvt0;

    .line 92
    .line 93
    iget-boolean p2, v5, Lvt0;->d:Z

    .line 94
    .line 95
    if-eqz p2, :cond_7

    .line 96
    .line 97
    check-cast v4, Liu;

    .line 98
    .line 99
    iput v10, v0, Lku;->k:I

    .line 100
    .line 101
    invoke-interface {v4, p1, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v1, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    check-cast v3, Lkt0;

    .line 109
    .line 110
    iput-object p0, v0, Lku;->g:Lj7;

    .line 111
    .line 112
    iput-object p1, v0, Lku;->h:Ljava/lang/Object;

    .line 113
    .line 114
    iput v9, v0, Lku;->k:I

    .line 115
    .line 116
    invoke-virtual {v3, p1, v0}, Lkt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-ne p2, v1, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-nez p2, :cond_3

    .line 130
    .line 131
    iget-object p2, p0, Lj7;->e:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p2, Lvt0;

    .line 134
    .line 135
    iput-boolean v10, p2, Lvt0;->d:Z

    .line 136
    .line 137
    iget-object p0, p0, Lj7;->f:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, Liu;

    .line 140
    .line 141
    iput-object v7, v0, Lku;->g:Lj7;

    .line 142
    .line 143
    iput-object v7, v0, Lku;->h:Ljava/lang/Object;

    .line 144
    .line 145
    iput v8, v0, Lku;->k:I

    .line 146
    .line 147
    invoke-interface {p0, p1, v0}, Liu;->f(Ljava/lang/Object;Lik;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-ne p0, v1, :cond_3

    .line 152
    .line 153
    :goto_2
    return-object v1

    .line 154
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    check-cast v4, Lb91;

    .line 161
    .line 162
    check-cast v5, Lps0;

    .line 163
    .line 164
    if-eqz p0, :cond_9

    .line 165
    .line 166
    check-cast v3, Loh0;

    .line 167
    .line 168
    invoke-interface {v3}, Lw31;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    check-cast p0, Lww;

    .line 173
    .line 174
    invoke-virtual {v4}, Lb91;->c()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object p2, v4, Lb91;->d:Lgp0;

    .line 179
    .line 180
    invoke-virtual {p2}, Lgp0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-interface {p0, p1, p2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    const/4 p0, 0x0

    .line 196
    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {v5, p0}, Lps0;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v2

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
