.class public final Lve2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lug;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljw0;


# direct methods
.method public synthetic constructor <init>(Ljw0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lve2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lve2;->b:Ljw0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lve2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "url"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Lve2;->b:Ljw0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v7, Lk20;->h:Lk20;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/high16 v9, -0x80000000

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Lwe2;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Lwe2;

    .line 26
    .line 27
    iget v10, v0, Lwe2;->m:I

    .line 28
    .line 29
    and-int v11, v10, v9

    .line 30
    .line 31
    if-eqz v11, :cond_0

    .line 32
    .line 33
    sub-int/2addr v10, v9

    .line 34
    iput v10, v0, Lwe2;->m:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lwe2;

    .line 38
    .line 39
    check-cast p2, Lu00;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, Lwe2;-><init>(Lve2;Lu00;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p0, v0, Lwe2;->k:Ljava/lang/Object;

    .line 45
    .line 46
    iget p2, v0, Lwe2;->m:I

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    if-ne p2, v8, :cond_1

    .line 51
    .line 52
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v6}, Ls;->l(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    :try_start_1
    invoke-static {p0, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    aget-object p0, p1, v3

    .line 68
    .line 69
    invoke-static {v2, p0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    aget-object p2, p1, v8

    .line 74
    .line 75
    const-string v2, "destination"

    .line 76
    .line 77
    invoke-static {v2, p2}, Li51;->y(Ljava/lang/String;Ljava/lang/Object;)Lhg2;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    aget-object p1, p1, v1

    .line 82
    .line 83
    iput v8, v0, Lwe2;->m:I

    .line 84
    .line 85
    invoke-virtual {v4, p0, p2, p1, v0}, Ljw0;->d(Ljava/lang/String;Lhg2;Ljava/lang/Object;Lu00;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v7, :cond_3

    .line 90
    .line 91
    move-object v5, v7

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    :goto_1
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 94
    .line 95
    .line 96
    move-result-object v5
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    :goto_2
    return-object v5

    .line 104
    :catch_0
    move-exception p0

    .line 105
    throw p0

    .line 106
    :pswitch_0
    instance-of v0, p2, Lue2;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    move-object v0, p2

    .line 111
    check-cast v0, Lue2;

    .line 112
    .line 113
    iget v10, v0, Lue2;->m:I

    .line 114
    .line 115
    and-int v11, v10, v9

    .line 116
    .line 117
    if-eqz v11, :cond_4

    .line 118
    .line 119
    sub-int/2addr v10, v9

    .line 120
    iput v10, v0, Lue2;->m:I

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    new-instance v0, Lue2;

    .line 124
    .line 125
    check-cast p2, Lu00;

    .line 126
    .line 127
    invoke-direct {v0, p0, p2}, Lue2;-><init>(Lve2;Lu00;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    iget-object p0, v0, Lue2;->k:Ljava/lang/Object;

    .line 131
    .line 132
    iget p2, v0, Lue2;->m:I

    .line 133
    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    if-ne p2, v8, :cond_5

    .line 137
    .line 138
    :try_start_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    invoke-static {v6}, Ls;->l(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :try_start_3
    invoke-static {v1, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    aget-object p0, p1, v3

    .line 153
    .line 154
    invoke-static {v2, p0}, Lsp0;->g0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    aget-object p1, p1, v8

    .line 159
    .line 160
    iput v8, v0, Lue2;->m:I

    .line 161
    .line 162
    invoke-virtual {v4, p0, p1, v0}, Ljw0;->f(Ljava/lang/String;Ljava/lang/Object;Lu00;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v7, :cond_7

    .line 167
    .line 168
    move-object v5, v7

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    :goto_4
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 171
    .line 172
    .line 173
    move-result-object v5
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    goto :goto_5

    .line 175
    :catchall_1
    move-exception p0

    .line 176
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    :goto_5
    return-object v5

    .line 181
    :catch_1
    move-exception p0

    .line 182
    throw p0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
