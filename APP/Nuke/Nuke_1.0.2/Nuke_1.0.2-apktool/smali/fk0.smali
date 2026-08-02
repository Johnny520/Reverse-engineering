.class public final Lfk0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzj0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lhq;

.field public final synthetic j:Ltw2;


# direct methods
.method public synthetic constructor <init>(Lhq;Ltw2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfk0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lfk0;->i:Lhq;

    .line 4
    .line 5
    iput-object p2, p0, Lfk0;->j:Ltw2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lak0;Lt00;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lfk0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    sget-object v2, Lk20;->h:Lk20;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, Lfk0;->j:Ltw2;

    .line 9
    .line 10
    iget-object v5, p0, Lfk0;->i:Lhq;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, Ly62;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast v5, Lmq;

    .line 21
    .line 22
    new-instance v0, Lzc;

    .line 23
    .line 24
    check-cast v4, Lg62;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v4, v3}, Lzc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, v0, p2}, Lmq;->a(Lak0;Lt00;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-ne p0, v2, :cond_0

    .line 34
    .line 35
    move-object v1, p0

    .line 36
    :cond_0
    return-object v1

    .line 37
    :pswitch_0
    check-cast v4, Lxw;

    .line 38
    .line 39
    instance-of v0, p2, Lek0;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    move-object v0, p2

    .line 44
    check-cast v0, Lek0;

    .line 45
    .line 46
    iget v6, v0, Lek0;->l:I

    .line 47
    .line 48
    const/high16 v7, -0x80000000

    .line 49
    .line 50
    and-int v8, v6, v7

    .line 51
    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    sub-int/2addr v6, v7

    .line 55
    iput v6, v0, Lek0;->l:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v0, Lek0;

    .line 59
    .line 60
    invoke-direct {v0, p0, p2}, Lek0;-><init>(Lfk0;Lt00;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object p0, v0, Lek0;->k:Ljava/lang/Object;

    .line 64
    .line 65
    iget p2, v0, Lek0;->l:I

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x3

    .line 69
    const/4 v8, 0x2

    .line 70
    if-eqz p2, :cond_5

    .line 71
    .line 72
    if-eq p2, v3, :cond_4

    .line 73
    .line 74
    if-eq p2, v8, :cond_3

    .line 75
    .line 76
    if-ne p2, v7, :cond_2

    .line 77
    .line 78
    iget-object p1, v0, Lek0;->o:Ljava/io/Serializable;

    .line 79
    .line 80
    check-cast p1, Lub2;

    .line 81
    .line 82
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object v1, v6

    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_3
    iget-object p1, v0, Lek0;->o:Ljava/io/Serializable;

    .line 97
    .line 98
    check-cast p1, Ljava/lang/Throwable;

    .line 99
    .line 100
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_4
    iget p1, v0, Lek0;->p:I

    .line 105
    .line 106
    iget-object p2, v0, Lek0;->n:Lak0;

    .line 107
    .line 108
    :try_start_1
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    .line 110
    .line 111
    move p0, p1

    .line 112
    move-object p1, p2

    .line 113
    goto :goto_1

    .line 114
    :catchall_1
    move-exception p0

    .line 115
    move v9, p1

    .line 116
    move-object p1, p0

    .line 117
    move p0, v9

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    :try_start_2
    check-cast v5, Lgq;

    .line 124
    .line 125
    iput-object p1, v0, Lek0;->n:Lak0;

    .line 126
    .line 127
    iput p0, v0, Lek0;->p:I

    .line 128
    .line 129
    iput v3, v0, Lek0;->l:I

    .line 130
    .line 131
    invoke-virtual {v5, p1, v0}, Lgq;->a(Lak0;Lt00;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 135
    if-ne p2, v2, :cond_6

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_6
    :goto_1
    new-instance p2, Lub2;

    .line 139
    .line 140
    iget-object v3, v0, Lu00;->i:La20;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-direct {p2, p1, v3}, Lub2;-><init>(Lak0;La20;)V

    .line 146
    .line 147
    .line 148
    :try_start_3
    iput-object v6, v0, Lek0;->n:Lak0;

    .line 149
    .line 150
    iput-object p2, v0, Lek0;->o:Ljava/io/Serializable;

    .line 151
    .line 152
    iput p0, v0, Lek0;->p:I

    .line 153
    .line 154
    iput v7, v0, Lek0;->l:I

    .line 155
    .line 156
    invoke-virtual {v4, p2, v6, v0}, Lxw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 157
    .line 158
    .line 159
    if-ne v1, v2, :cond_7

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_7
    move-object p1, p2

    .line 163
    :goto_2
    invoke-virtual {p1}, Lu00;->s()V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :catchall_2
    move-exception p0

    .line 168
    move-object p1, p2

    .line 169
    :goto_3
    invoke-virtual {p1}, Lu00;->s()V

    .line 170
    .line 171
    .line 172
    throw p0

    .line 173
    :catchall_3
    move-exception p1

    .line 174
    :goto_4
    new-instance p2, Li23;

    .line 175
    .line 176
    invoke-direct {p2, p1}, Li23;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    iput-object v6, v0, Lek0;->n:Lak0;

    .line 180
    .line 181
    iput-object p1, v0, Lek0;->o:Ljava/io/Serializable;

    .line 182
    .line 183
    iput p0, v0, Lek0;->p:I

    .line 184
    .line 185
    iput v8, v0, Lek0;->l:I

    .line 186
    .line 187
    invoke-static {p2, v4, p1, v0}, Lop0;->e(Li23;Lxw;Ljava/lang/Throwable;Lu00;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-ne p0, v2, :cond_8

    .line 192
    .line 193
    :goto_5
    move-object v1, v2

    .line 194
    :goto_6
    return-object v1

    .line 195
    :cond_8
    :goto_7
    throw p1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
