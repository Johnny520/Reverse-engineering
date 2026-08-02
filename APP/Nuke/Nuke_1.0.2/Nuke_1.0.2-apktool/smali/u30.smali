.class public final Lu30;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V
    .locals 0

    .line 14
    iput p4, p0, Lu30;->l:I

    iput-object p1, p0, Lu30;->m:Ljava/lang/Object;

    iput-object p2, p0, Lu30;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    return-void
.end method

.method public constructor <init>(Lt00;Lhg2;Ldq1;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput v0, p0, Lu30;->l:I

    .line 3
    .line 4
    iput-object p2, p0, Lu30;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lu30;->n:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    invoke-direct {p0, p2, p1}, Ltw2;-><init>(ILt00;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lv30;Lt00;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lu30;->l:I

    .line 13
    iput-object p1, p0, Lu30;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ltw2;-><init>(ILt00;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lu30;->l:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    check-cast p1, Lj20;

    .line 6
    .line 7
    check-cast p2, Lt00;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lu30;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lu30;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lu30;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lu30;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_3
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lu30;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_4
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Lu30;

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_5
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lu30;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_6
    invoke-virtual {p0, p2, p1}, Lu30;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lu30;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Lu30;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 2

    .line 1
    iget v0, p0, Lu30;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lu30;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lu30;

    .line 9
    .line 10
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lxk1;

    .line 13
    .line 14
    check-cast v1, Lxk1;

    .line 15
    .line 16
    const/4 v0, 0x7

    .line 17
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 18
    .line 19
    .line 20
    return-object p2

    .line 21
    :pswitch_0
    new-instance p2, Lu30;

    .line 22
    .line 23
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lhg2;

    .line 26
    .line 27
    check-cast v1, Ldq1;

    .line 28
    .line 29
    invoke-direct {p2, p1, p0, v1}, Lu30;-><init>(Lt00;Lhg2;Ldq1;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :pswitch_1
    new-instance p2, Lu30;

    .line 34
    .line 35
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lvn1;

    .line 38
    .line 39
    check-cast v1, Ljava/lang/reflect/Field;

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 43
    .line 44
    .line 45
    return-object p2

    .line 46
    :pswitch_2
    new-instance p2, Lu30;

    .line 47
    .line 48
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Lqu0;

    .line 51
    .line 52
    check-cast v1, Lvn1;

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 56
    .line 57
    .line 58
    return-object p2

    .line 59
    :pswitch_3
    new-instance p2, Lu30;

    .line 60
    .line 61
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lru0;

    .line 64
    .line 65
    check-cast v1, Lvn1;

    .line 66
    .line 67
    const/4 v0, 0x3

    .line 68
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :pswitch_4
    new-instance p2, Lu30;

    .line 73
    .line 74
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lxk2;

    .line 77
    .line 78
    check-cast v1, Lyk2;

    .line 79
    .line 80
    const/4 v0, 0x2

    .line 81
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 82
    .line 83
    .line 84
    return-object p2

    .line 85
    :pswitch_5
    new-instance p2, Lu30;

    .line 86
    .line 87
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lb5;

    .line 90
    .line 91
    check-cast v1, Ljava/lang/String;

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    invoke-direct {p2, p0, v1, p1, v0}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :pswitch_6
    new-instance p0, Lu30;

    .line 99
    .line 100
    check-cast v1, Lv30;

    .line 101
    .line 102
    invoke-direct {p0, v1, p1}, Lu30;-><init>(Lv30;Lt00;)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Lu30;->m:Ljava/lang/Object;

    .line 106
    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lu30;->l:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lu30;->n:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, Lxk1;

    .line 15
    .line 16
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lxk1;

    .line 22
    .line 23
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ltq1;

    .line 36
    .line 37
    iget-object p1, p1, Ltq1;->a:Ljava/util/List;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcq1;

    .line 63
    .line 64
    iget-object v0, v0, Lcq1;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    :goto_0
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ltq1;

    .line 84
    .line 85
    iget-object p1, p1, Ltq1;->a:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {p1}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcq1;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    iget-object v6, p1, Lcq1;->a:Ljava/lang/String;

    .line 96
    .line 97
    :cond_3
    invoke-interface {p0, v6}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-object v2

    .line 101
    :pswitch_0
    check-cast v5, Ldq1;

    .line 102
    .line 103
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Lhg2;

    .line 109
    .line 110
    iget-object p1, p0, Lhg2;->a:Lfg2;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    if-eq p1, v4, :cond_5

    .line 119
    .line 120
    const/4 v0, 0x2

    .line 121
    if-eq p1, v0, :cond_5

    .line 122
    .line 123
    if-ne p1, v1, :cond_4

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-static {}, Lc80;->s()V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    :goto_2
    invoke-virtual {v5, p0}, Ldq1;->T(Lhg2;)Ljava/io/File;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    goto :goto_3

    .line 139
    :cond_6
    iget-object p0, p0, Lhg2;->b:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v5, p0}, Ldq1;->L(Ljava/lang/String;)Lig2;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_7

    .line 146
    .line 147
    move v3, v4

    .line 148
    :cond_7
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    :goto_4
    return-object v6

    .line 153
    :pswitch_1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    check-cast v5, Ljava/lang/reflect/Field;

    .line 157
    .line 158
    :try_start_0
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    goto :goto_5

    .line 166
    :catch_0
    move-exception v0

    .line 167
    move-object p0, v0

    .line 168
    move-object v4, p0

    .line 169
    const/4 v3, 0x0

    .line 170
    const/16 v5, 0xc

    .line 171
    .line 172
    const-string v0, "INTERNAL_ERROR"

    .line 173
    .line 174
    const-string v1, "The host member could not be invoked."

    .line 175
    .line 176
    const/4 v2, 0x0

    .line 177
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 178
    .line 179
    .line 180
    :goto_5
    return-object v6

    .line 181
    :catch_1
    move-exception v0

    .line 182
    move-object p0, v0

    .line 183
    new-instance v0, Lsd2;

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-nez p1, :cond_8

    .line 190
    .line 191
    move-object v5, p0

    .line 192
    goto :goto_6

    .line 193
    :cond_8
    move-object v5, p1

    .line 194
    :goto_6
    const/16 v6, 0xc

    .line 195
    .line 196
    const-string v1, "INTERNAL_ERROR"

    .line 197
    .line 198
    const-string v2, "The host member threw an exception."

    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    const/4 v4, 0x0

    .line 202
    invoke-direct/range {v0 .. v6}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :pswitch_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p0, Lqu0;

    .line 212
    .line 213
    iget-object p1, p0, Lqu0;->a:Ljava/lang/reflect/Constructor;

    .line 214
    .line 215
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 216
    .line 217
    .line 218
    :try_start_1
    iget-object p0, p0, Lqu0;->b:[Ljava/lang/Object;

    .line 219
    .line 220
    array-length v0, p0

    .line 221
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_2

    .line 229
    goto :goto_7

    .line 230
    :catch_2
    move-exception v0

    .line 231
    move-object p0, v0

    .line 232
    move-object v4, p0

    .line 233
    const/4 v3, 0x0

    .line 234
    const/16 v5, 0xc

    .line 235
    .line 236
    const-string v0, "INTERNAL_ERROR"

    .line 237
    .line 238
    const-string v1, "The host member could not be invoked."

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 242
    .line 243
    .line 244
    :goto_7
    return-object v6

    .line 245
    :catch_3
    move-exception v0

    .line 246
    move-object p0, v0

    .line 247
    new-instance v0, Lsd2;

    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-nez p1, :cond_9

    .line 254
    .line 255
    move-object v5, p0

    .line 256
    goto :goto_8

    .line 257
    :cond_9
    move-object v5, p1

    .line 258
    :goto_8
    const/16 v6, 0xc

    .line 259
    .line 260
    const-string v1, "INTERNAL_ERROR"

    .line 261
    .line 262
    const-string v2, "The host member threw an exception."

    .line 263
    .line 264
    const/4 v3, 0x0

    .line 265
    const/4 v4, 0x0

    .line 266
    invoke-direct/range {v0 .. v6}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :pswitch_3
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p0, Lru0;

    .line 276
    .line 277
    iget-object p1, p0, Lru0;->a:Ljava/lang/reflect/Method;

    .line 278
    .line 279
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 280
    .line 281
    .line 282
    :try_start_2
    iget-object p0, p0, Lru0;->b:[Ljava/lang/Object;

    .line 283
    .line 284
    array-length v0, p0

    .line 285
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-virtual {p1, v6, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_4

    .line 293
    goto :goto_9

    .line 294
    :catch_4
    move-exception v0

    .line 295
    move-object p0, v0

    .line 296
    move-object v4, p0

    .line 297
    const/4 v3, 0x0

    .line 298
    const/16 v5, 0xc

    .line 299
    .line 300
    const-string v0, "INTERNAL_ERROR"

    .line 301
    .line 302
    const-string v1, "The host member could not be invoked."

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 306
    .line 307
    .line 308
    :goto_9
    return-object v6

    .line 309
    :catch_5
    move-exception v0

    .line 310
    move-object p0, v0

    .line 311
    new-instance v0, Lsd2;

    .line 312
    .line 313
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    if-nez p1, :cond_a

    .line 318
    .line 319
    move-object v5, p0

    .line 320
    goto :goto_a

    .line 321
    :cond_a
    move-object v5, p1

    .line 322
    :goto_a
    const/16 v6, 0xc

    .line 323
    .line 324
    const-string v1, "INTERNAL_ERROR"

    .line 325
    .line 326
    const-string v2, "The host member threw an exception."

    .line 327
    .line 328
    const/4 v3, 0x0

    .line 329
    const/4 v4, 0x0

    .line 330
    invoke-direct/range {v0 .. v6}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 331
    .line 332
    .line 333
    throw v0

    .line 334
    :pswitch_4
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p0, Lxk2;

    .line 340
    .line 341
    iget-object p1, p0, Lxk2;->b:Lwk2;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-eqz p1, :cond_c

    .line 348
    .line 349
    if-ne p1, v4, :cond_b

    .line 350
    .line 351
    move v3, v4

    .line 352
    goto :goto_b

    .line 353
    :cond_b
    invoke-static {}, Lc80;->s()V

    .line 354
    .line 355
    .line 356
    move-object v2, v6

    .line 357
    goto :goto_c

    .line 358
    :cond_c
    :goto_b
    sget-object p1, Lup0;->i:Landroid/content/Context;

    .line 359
    .line 360
    if-eqz p1, :cond_d

    .line 361
    .line 362
    check-cast v5, Lyk2;

    .line 363
    .line 364
    iget-object v0, v5, Lyk2;->b:Ljava/lang/String;

    .line 365
    .line 366
    iget-object p0, p0, Lxk2;->a:Ljava/lang/String;

    .line 367
    .line 368
    new-instance v1, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v0, ": "

    .line 377
    .line 378
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-static {p1, p0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 393
    .line 394
    .line 395
    :goto_c
    return-object v2

    .line 396
    :cond_d
    const-string p0, "hostContext"

    .line 397
    .line 398
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v6

    .line 402
    :pswitch_5
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p0, Lb5;

    .line 408
    .line 409
    check-cast v5, Ljava/lang/String;

    .line 410
    .line 411
    iget-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast p1, Ljava/io/File;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    const-string v1, ".json"

    .line 427
    .line 428
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {p1, v0}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-nez v0, :cond_e

    .line 444
    .line 445
    new-instance v6, Ld41;

    .line 446
    .line 447
    sget-object p0, Lce0;->h:Lce0;

    .line 448
    .line 449
    invoke-direct {v6, p0}, Ld41;-><init>(Ljava/util/Map;)V

    .line 450
    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_e
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast p0, Lv31;

    .line 456
    .line 457
    invoke-static {p1}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    sget-object v0, Lo31;->a:Lo31;

    .line 465
    .line 466
    invoke-virtual {p0, v0, p1}, Lu21;->a(Lw41;Ljava/lang/String;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    check-cast p0, Lj31;

    .line 471
    .line 472
    instance-of p1, p0, Ld41;

    .line 473
    .line 474
    if-eqz p1, :cond_f

    .line 475
    .line 476
    check-cast p0, Ld41;

    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_f
    move-object p0, v6

    .line 480
    :goto_d
    if-eqz p0, :cond_10

    .line 481
    .line 482
    move-object v6, p0

    .line 483
    goto :goto_e

    .line 484
    :cond_10
    const-string p0, "Script config root must be a JSON object."

    .line 485
    .line 486
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :goto_e
    return-object v6

    .line 490
    :pswitch_6
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    iget-object p0, p0, Lu30;->m:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast p0, Lj20;

    .line 496
    .line 497
    check-cast v5, Lv30;

    .line 498
    .line 499
    iget-object p1, v5, Lv30;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 500
    .line 501
    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    check-cast p1, Lk21;

    .line 506
    .line 507
    iget-object v0, v5, Lv30;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 508
    .line 509
    new-instance v2, La2;

    .line 510
    .line 511
    const/16 v7, 0xd

    .line 512
    .line 513
    invoke-direct {v2, p1, v5, v6, v7}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 514
    .line 515
    .line 516
    invoke-static {p0, v6, v2, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    :cond_11
    invoke-virtual {v0, v6, p0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result p1

    .line 524
    if-eqz p1, :cond_12

    .line 525
    .line 526
    move v3, v4

    .line 527
    goto :goto_f

    .line 528
    :cond_12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    if-eqz p1, :cond_11

    .line 533
    .line 534
    :goto_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 535
    .line 536
    .line 537
    move-result-object p0

    .line 538
    return-object p0

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
