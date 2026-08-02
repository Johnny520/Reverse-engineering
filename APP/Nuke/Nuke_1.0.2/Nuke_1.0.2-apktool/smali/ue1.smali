.class public final Lue1;
.super Lq43;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lq43;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcu;Lue1;Lue1;Lgs1;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lue1;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lue1;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lue1;->c:Lq43;

    .line 10
    .line 11
    iput-object p4, p0, Lue1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lir0;Lq43;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lue1;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lue1;->b:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lue1;->c:Lq43;

    .line 17
    iput-object p3, p0, Lue1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ll41;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lue1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lue1;->c:Lq43;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ll41;->I()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ll41;->E()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    iget-object v2, p0, Lue1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lgs1;

    .line 30
    .line 31
    invoke-interface {v2}, Lgs1;->a()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/util/Map;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    const-string v4, "duplicate key: "

    .line 39
    .line 40
    if-ne v0, v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Ll41;->b()V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {p1}, Ll41;->p()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ll41;->b()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lue1;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lue1;

    .line 57
    .line 58
    iget-object v0, v0, Lue1;->c:Lq43;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lue1;->c:Lq43;

    .line 65
    .line 66
    check-cast v1, Lue1;

    .line 67
    .line 68
    iget-object v1, v1, Lue1;->c:Lq43;

    .line 69
    .line 70
    invoke-virtual {v1, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {p1}, Ll41;->h()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    new-instance p0, Lt31;

    .line 85
    .line 86
    new-instance p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :cond_2
    invoke-virtual {p1}, Ll41;->h()V

    .line 103
    .line 104
    .line 105
    :goto_1
    move-object p0, v2

    .line 106
    goto :goto_4

    .line 107
    :cond_3
    invoke-virtual {p1}, Ll41;->c()V

    .line 108
    .line 109
    .line 110
    :goto_2
    invoke-virtual {p1}, Ll41;->p()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    sget-object v0, Leb;->i:Leb;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget v0, p1, Ll41;->n:I

    .line 122
    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    invoke-virtual {p1}, Ll41;->g()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    :cond_4
    const/16 v3, 0xd

    .line 130
    .line 131
    if-ne v0, v3, :cond_5

    .line 132
    .line 133
    iput v1, p1, Ll41;->n:I

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    const/16 v3, 0xc

    .line 137
    .line 138
    if-ne v0, v3, :cond_6

    .line 139
    .line 140
    const/16 v0, 0x8

    .line 141
    .line 142
    iput v0, p1, Ll41;->n:I

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    const/16 v3, 0xe

    .line 146
    .line 147
    if-ne v0, v3, :cond_8

    .line 148
    .line 149
    const/16 v0, 0xa

    .line 150
    .line 151
    iput v0, p1, Ll41;->n:I

    .line 152
    .line 153
    :goto_3
    iget-object v0, p0, Lue1;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lue1;

    .line 156
    .line 157
    iget-object v0, v0, Lue1;->c:Lq43;

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object v3, p0, Lue1;->c:Lq43;

    .line 164
    .line 165
    check-cast v3, Lue1;

    .line 166
    .line 167
    iget-object v3, v3, Lue1;->c:Lq43;

    .line 168
    .line 169
    invoke-virtual {v3, p1}, Lq43;->b(Ll41;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-nez v3, :cond_7

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_7
    new-instance p0, Lt31;

    .line 181
    .line 182
    new-instance p1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0

    .line 198
    :cond_8
    const-string p0, "a name"

    .line 199
    .line 200
    invoke-virtual {p1, p0}, Ll41;->R(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    throw p0

    .line 205
    :cond_9
    invoke-virtual {p1}, Ll41;->j()V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :goto_4
    return-object p0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lo41;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lue1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lue1;->c:Lq43;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lue1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/reflect/Type;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    instance-of v2, v0, Ljava/lang/Class;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    instance-of v2, v0, Ljava/lang/reflect/TypeVariable;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v2, v0

    .line 28
    :goto_0
    if-eq v2, v0, :cond_6

    .line 29
    .line 30
    iget-object p0, p0, Lue1;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lir0;

    .line 33
    .line 34
    new-instance v0, Lj63;

    .line 35
    .line 36
    invoke-direct {v0, v2}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lir0;->c(Lj63;)Lq43;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    instance-of v0, p0, Lj72;

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    move-object v0, v1

    .line 49
    :goto_1
    instance-of v2, v0, Lep2;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    move-object v2, v0

    .line 54
    check-cast v2, Lep2;

    .line 55
    .line 56
    invoke-virtual {v2}, Lep2;->d()Lq43;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-ne v2, v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v0, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_2
    instance-of v0, v0, Lj72;

    .line 66
    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object v1, p0

    .line 71
    :cond_6
    :goto_4
    invoke-virtual {v1, p1, p2}, Lq43;->c(Lo41;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    check-cast p2, Ljava/util/Map;

    .line 76
    .line 77
    check-cast v1, Lue1;

    .line 78
    .line 79
    if-nez p2, :cond_7

    .line 80
    .line 81
    invoke-virtual {p1}, Lo41;->p()Lo41;

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_7
    invoke-virtual {p1}, Lo41;->e()V

    .line 86
    .line 87
    .line 88
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_8

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Ljava/util/Map$Entry;

    .line 107
    .line 108
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p1, v0}, Lo41;->k(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {v1, p1, p2}, Lue1;->c(Lo41;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    invoke-virtual {p1}, Lo41;->j()V

    .line 128
    .line 129
    .line 130
    :goto_6
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
