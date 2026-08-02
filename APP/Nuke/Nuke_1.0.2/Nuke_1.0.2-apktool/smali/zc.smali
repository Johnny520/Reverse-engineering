.class public final Lzc;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lak0;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lak0;La20;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lzc;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lzc;->i:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p2}, Lfg1;->R(La20;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lzc;->j:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p2, La2;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0x1c

    .line 19
    .line 20
    invoke-direct {p2, p1, v0, v1}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lzc;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 26
    iput p4, p0, Lzc;->h:I

    iput-object p1, p0, Lzc;->i:Ljava/lang/Object;

    iput-object p2, p0, Lzc;->j:Ljava/lang/Object;

    iput-object p3, p0, Lzc;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lzc;->h:I

    .line 2
    .line 3
    sget-object v1, Lk20;->h:Lk20;

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, p0, Lzc;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lzc;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, Lzc;->i:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, La20;

    .line 17
    .line 18
    check-cast v3, La2;

    .line 19
    .line 20
    invoke-static {v5, p1, v4, v3, p2}, Lgf1;->c0(La20;Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lt00;)Ljava/lang/Object;

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
    check-cast v4, Lak0;

    .line 29
    .line 30
    check-cast v5, Ly62;

    .line 31
    .line 32
    instance-of v0, p2, Lgk0;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, Lgk0;

    .line 38
    .line 39
    iget v6, v0, Lgk0;->n:I

    .line 40
    .line 41
    const/high16 v7, -0x80000000

    .line 42
    .line 43
    and-int v8, v6, v7

    .line 44
    .line 45
    if-eqz v8, :cond_1

    .line 46
    .line 47
    sub-int/2addr v6, v7

    .line 48
    iput v6, v0, Lgk0;->n:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v0, Lgk0;

    .line 52
    .line 53
    invoke-direct {v0, p0, p2}, Lgk0;-><init>(Lzc;Lt00;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p0, v0, Lgk0;->l:Ljava/lang/Object;

    .line 57
    .line 58
    iget p2, v0, Lgk0;->n:I

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x3

    .line 62
    const/4 v8, 0x2

    .line 63
    const/4 v9, 0x1

    .line 64
    if-eqz p2, :cond_6

    .line 65
    .line 66
    if-eq p2, v9, :cond_2

    .line 67
    .line 68
    if-eq p2, v8, :cond_5

    .line 69
    .line 70
    if-ne p2, v7, :cond_4

    .line 71
    .line 72
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    move-object v1, v2

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v6

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object p1, v0, Lgk0;->k:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-boolean p0, v5, Ly62;->h:Z

    .line 94
    .line 95
    if-eqz p0, :cond_7

    .line 96
    .line 97
    iput-object v6, v0, Lgk0;->k:Ljava/lang/Object;

    .line 98
    .line 99
    iput v9, v0, Lgk0;->n:I

    .line 100
    .line 101
    invoke-interface {v4, p1, v0}, Lak0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

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
    check-cast v3, Lg62;

    .line 109
    .line 110
    iput-object p1, v0, Lgk0;->k:Ljava/lang/Object;

    .line 111
    .line 112
    iput v8, v0, Lgk0;->n:I

    .line 113
    .line 114
    invoke-virtual {v3, p1, v0}, Lg62;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, v1, :cond_8

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_8
    :goto_1
    check-cast p0, Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_3

    .line 128
    .line 129
    iput-boolean v9, v5, Ly62;->h:Z

    .line 130
    .line 131
    iput-object v6, v0, Lgk0;->k:Ljava/lang/Object;

    .line 132
    .line 133
    iput v7, v0, Lgk0;->n:I

    .line 134
    .line 135
    invoke-interface {v4, p1, v0}, Lak0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v1, :cond_3

    .line 140
    .line 141
    :goto_2
    return-object v1

    .line 142
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    check-cast v4, Ly33;

    .line 149
    .line 150
    check-cast v5, Ln32;

    .line 151
    .line 152
    if-eqz p0, :cond_9

    .line 153
    .line 154
    check-cast v3, Lxk1;

    .line 155
    .line 156
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Lmn0;

    .line 161
    .line 162
    invoke-virtual {v4}, Ly33;->c()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iget-object p2, v4, Ly33;->d:Lnx1;

    .line 167
    .line 168
    invoke-virtual {p2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-interface {p0, p1, p2}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    goto :goto_3

    .line 183
    :cond_9
    const/4 p0, 0x0

    .line 184
    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {v5, p0}, Ln32;->setValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    return-object v2

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
