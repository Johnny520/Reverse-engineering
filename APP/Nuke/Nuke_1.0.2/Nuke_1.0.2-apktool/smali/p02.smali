.class public final Lp02;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:La20;

.field public final b:Landroid/content/Context;

.field public final c:Lrm2;

.field public final d:Lkc1;

.field public final e:Lkl1;

.field public f:Landroid/view/textclassifier/TextClassifier;

.field public final g:Lnx1;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La20;Landroid/content/Context;Lrm2;Lkc1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp02;->a:La20;

    .line 5
    .line 6
    iput-object p2, p0, Lp02;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lp02;->c:Lrm2;

    .line 9
    .line 10
    iput-object p4, p0, Lp02;->d:Lkc1;

    .line 11
    .line 12
    new-instance p1, Lkl1;

    .line 13
    .line 14
    invoke-direct {p1}, Lkl1;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lp02;->e:Lkl1;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lp02;->g:Lnx1;

    .line 25
    .line 26
    new-instance p1, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lp02;->h:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public static final a(Lp02;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lu00;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    iget-object v2, v0, Lp02;->e:Lkl1;

    .line 6
    .line 7
    iget-object v3, v0, Lp02;->g:Lnx1;

    .line 8
    .line 9
    instance-of v4, v1, Ln02;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Ln02;

    .line 15
    .line 16
    iget v5, v4, Ln02;->q:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Ln02;->q:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Ln02;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1}, Ln02;-><init>(Lp02;Lu00;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v4, Ln02;->o:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Ln02;->q:I

    .line 36
    .line 37
    sget-object v6, La83;->a:La83;

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    sget-object v10, Lk20;->h:Lk20;

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    if-eq v5, v8, :cond_2

    .line 47
    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    iget-wide v7, v4, Ln02;->n:J

    .line 51
    .line 52
    iget-object v2, v4, Ln02;->m:Lkl1;

    .line 53
    .line 54
    iget-object v0, v4, Ln02;->l:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroid/view/textclassifier/TextClassification;

    .line 57
    .line 58
    iget-object v4, v4, Ln02;->k:Ljava/lang/CharSequence;

    .line 59
    .line 60
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v9

    .line 71
    :cond_2
    iget-wide v11, v4, Ln02;->n:J

    .line 72
    .line 73
    iget-object v5, v4, Ln02;->m:Lkl1;

    .line 74
    .line 75
    iget-object v13, v4, Ln02;->l:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v13, Landroid/view/textclassifier/TextClassifier;

    .line 78
    .line 79
    iget-object v14, v4, Ln02;->k:Ljava/lang/CharSequence;

    .line 80
    .line 81
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {v1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v1, p1

    .line 89
    .line 90
    iput-object v1, v4, Ln02;->k:Ljava/lang/CharSequence;

    .line 91
    .line 92
    move-object/from16 v5, p4

    .line 93
    .line 94
    iput-object v5, v4, Ln02;->l:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v4, Ln02;->m:Lkl1;

    .line 97
    .line 98
    move-wide/from16 v11, p2

    .line 99
    .line 100
    iput-wide v11, v4, Ln02;->n:J

    .line 101
    .line 102
    iput v8, v4, Ln02;->q:I

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    if-ne v13, v10, :cond_4

    .line 109
    .line 110
    move-object v15, v10

    .line 111
    goto :goto_4

    .line 112
    :cond_4
    move-object v14, v1

    .line 113
    move-object v13, v5

    .line 114
    move-object v5, v2

    .line 115
    :goto_1
    :try_start_0
    invoke-virtual {v3}, Lnx1;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lny2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    :try_start_1
    sget-object v15, Lr02;->a:Ltu2;

    .line 124
    .line 125
    move-object v15, v10

    .line 126
    iget-wide v9, v1, Lny2;->b:J

    .line 127
    .line 128
    invoke-static {v11, v12, v9, v10}, Lf13;->b(JJ)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_5

    .line 133
    .line 134
    iget-object v1, v1, Lny2;->a:Ljava/lang/CharSequence;

    .line 135
    .line 136
    invoke-static {v14, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    move v1, v8

    .line 143
    goto :goto_2

    .line 144
    :cond_5
    const/4 v1, 0x0

    .line 145
    :goto_2
    if-ne v1, v8, :cond_6

    .line 146
    .line 147
    const/4 v1, 0x0

    .line 148
    invoke-virtual {v5, v1}, Lkl1;->f(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-object v6

    .line 152
    :cond_6
    const/4 v1, 0x0

    .line 153
    goto :goto_3

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    const/4 v1, 0x0

    .line 156
    goto :goto_6

    .line 157
    :cond_7
    move-object v15, v10

    .line 158
    move-object v1, v9

    .line 159
    :goto_3
    invoke-virtual {v5, v1}, Lkl1;->f(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {}, Lp90;->q()V

    .line 163
    .line 164
    .line 165
    invoke-static {v11, v12}, Lf13;->f(J)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-static {v11, v12}, Lf13;->e(J)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-static {v14, v1, v5}, Lp90;->f(Ljava/lang/CharSequence;II)Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v0}, Lp02;->b()Landroid/os/LocaleList;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v1, v0}, Lp90;->e(Landroid/view/textclassifier/TextClassification$Request$Builder;Landroid/os/LocaleList;)Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0}, Lp90;->g(Landroid/view/textclassifier/TextClassification$Request$Builder;)Landroid/view/textclassifier/TextClassification$Request;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v13, v0}, Lp90;->h(Landroid/view/textclassifier/TextClassifier;Landroid/view/textclassifier/TextClassification$Request;)Landroid/view/textclassifier/TextClassification;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v14, v4, Ln02;->k:Ljava/lang/CharSequence;

    .line 194
    .line 195
    iput-object v0, v4, Ln02;->l:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v2, v4, Ln02;->m:Lkl1;

    .line 198
    .line 199
    iput-wide v11, v4, Ln02;->n:J

    .line 200
    .line 201
    iput v7, v4, Ln02;->q:I

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    if-ne v1, v15, :cond_8

    .line 208
    .line 209
    :goto_4
    return-object v15

    .line 210
    :cond_8
    move-wide v7, v11

    .line 211
    move-object v4, v14

    .line 212
    :goto_5
    :try_start_2
    new-instance v1, Lny2;

    .line 213
    .line 214
    invoke-direct {v1, v4, v7, v8, v0}, Lny2;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v1}, Lnx1;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 218
    .line 219
    .line 220
    const/4 v1, 0x0

    .line 221
    invoke-virtual {v2, v1}, Lkl1;->f(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-object v6

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    const/4 v1, 0x0

    .line 227
    invoke-virtual {v2, v1}, Lkl1;->f(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :catchall_2
    move-exception v0

    .line 232
    move-object v1, v9

    .line 233
    :goto_6
    invoke-virtual {v5, v1}, Lkl1;->f(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    throw v0
.end method


# virtual methods
.method public final b()Landroid/os/LocaleList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lp02;->d:Lkc1;

    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-static {p0, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lkc1;->h:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljc1;

    .line 34
    .line 35
    iget-object v2, v2, Ljc1;->a:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-array p0, v0, [Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Ljava/util/Locale;

    .line 48
    .line 49
    array-length v0, p0

    .line 50
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, [Ljava/util/Locale;

    .line 55
    .line 56
    new-instance v0, Landroid/os/LocaleList;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    new-instance p0, Landroid/os/LocaleList;

    .line 63
    .line 64
    sget-object v1, Ld02;->a:Lb5;

    .line 65
    .line 66
    invoke-virtual {v1}, Lb5;->r()Lkc1;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, Lkc1;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljc1;

    .line 77
    .line 78
    iget-object v0, v0, Ljc1;->a:Ljava/util/Locale;

    .line 79
    .line 80
    filled-new-array {v0}, [Ljava/util/Locale;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p0, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method
