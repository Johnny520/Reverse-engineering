.class public final Lo02;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Lkl1;

.field public m:Lp02;

.field public n:Ljava/lang/CharSequence;

.field public o:J

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/CharSequence;

.field public final synthetic s:J

.field public final synthetic t:Lp02;


# direct methods
.method public constructor <init>(JLt00;Lp02;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p5, p0, Lo02;->r:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-wide p1, p0, Lo02;->s:J

    .line 4
    .line 5
    iput-object p4, p0, Lo02;->t:Lp02;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ltw2;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lo02;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lo02;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lo02;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 6

    .line 1
    new-instance v0, Lo02;

    .line 2
    .line 3
    iget-wide v1, p0, Lo02;->s:J

    .line 4
    .line 5
    iget-object v4, p0, Lo02;->t:Lp02;

    .line 6
    .line 7
    iget-object v5, p0, Lo02;->r:Ljava/lang/CharSequence;

    .line 8
    .line 9
    move-object v3, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lo02;-><init>(JLt00;Lp02;Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, v0, Lo02;->q:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lo02;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eq v0, v2, :cond_1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-wide v0, p0, Lo02;->o:J

    .line 13
    .line 14
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    iget-wide v0, p0, Lo02;->o:J

    .line 26
    .line 27
    iget-object v2, p0, Lo02;->n:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v4, p0, Lo02;->m:Lp02;

    .line 30
    .line 31
    iget-object v5, p0, Lo02;->l:Lkl1;

    .line 32
    .line 33
    iget-object p0, p0, Lo02;->q:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Landroid/view/textclassifier/TextSelection;

    .line 36
    .line 37
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lo02;->q:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v8, p1

    .line 47
    check-cast v8, Landroid/view/textclassifier/TextClassifier;

    .line 48
    .line 49
    invoke-static {}, Lp90;->x()V

    .line 50
    .line 51
    .line 52
    iget-wide v4, p0, Lo02;->s:J

    .line 53
    .line 54
    invoke-static {v4, v5}, Lf13;->f(J)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-static {v4, v5}, Lf13;->e(J)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v4, p0, Lo02;->r:Ljava/lang/CharSequence;

    .line 63
    .line 64
    invoke-static {v4, p1, v0}, Lp90;->m(Ljava/lang/CharSequence;II)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v0, p0, Lo02;->t:Lp02;

    .line 69
    .line 70
    invoke-virtual {v0}, Lp02;->b()Landroid/os/LocaleList;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {p1, v5}, Lp90;->l(Landroid/view/textclassifier/TextSelection$Request$Builder;Landroid/os/LocaleList;)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v6, 0x1f

    .line 81
    .line 82
    if-lt v5, v6, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, Ll7;->v(Landroid/view/textclassifier/TextSelection$Request$Builder;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {p1}, Lp90;->n(Landroid/view/textclassifier/TextSelection$Request$Builder;)Landroid/view/textclassifier/TextSelection$Request;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v8, p1}, Lp90;->o(Landroid/view/textclassifier/TextClassifier;Landroid/view/textclassifier/TextSelection$Request;)Landroid/view/textclassifier/TextSelection;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionStartIndex()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionEndIndex()I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-static {v7, v9}, Lfg1;->i(II)J

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    sget-object v11, Lk20;->h:Lk20;

    .line 108
    .line 109
    if-lt v5, v6, :cond_5

    .line 110
    .line 111
    invoke-static {p1}, Ll7;->h(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    iget-object v5, v0, Lp02;->e:Lkl1;

    .line 118
    .line 119
    iput-object p1, p0, Lo02;->q:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v5, p0, Lo02;->l:Lkl1;

    .line 122
    .line 123
    iput-object v0, p0, Lo02;->m:Lp02;

    .line 124
    .line 125
    iput-object v4, p0, Lo02;->n:Ljava/lang/CharSequence;

    .line 126
    .line 127
    iput-wide v9, p0, Lo02;->o:J

    .line 128
    .line 129
    iput v2, p0, Lo02;->p:I

    .line 130
    .line 131
    invoke-virtual {v5, p0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v11, :cond_4

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    move-object p0, p1

    .line 139
    move-object v2, v4

    .line 140
    move-object v4, v0

    .line 141
    move-wide v0, v9

    .line 142
    :goto_0
    :try_start_0
    new-instance p1, Lny2;

    .line 143
    .line 144
    invoke-static {p0}, Ll7;->z(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-direct {p1, v2, v0, v1, p0}, Lny2;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    .line 152
    .line 153
    .line 154
    iget-object p0, v4, Lp02;->g:Lnx1;

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lnx1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    invoke-virtual {v5, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    throw p0

    .line 169
    :cond_5
    iput-wide v9, p0, Lo02;->o:J

    .line 170
    .line 171
    iput v1, p0, Lo02;->p:I

    .line 172
    .line 173
    iget-object v4, p0, Lo02;->t:Lp02;

    .line 174
    .line 175
    iget-object v5, p0, Lo02;->r:Ljava/lang/CharSequence;

    .line 176
    .line 177
    move-wide v6, v9

    .line 178
    move-object v9, p0

    .line 179
    invoke-static/range {v4 .. v9}, Lp02;->a(Lp02;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lu00;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, v11, :cond_6

    .line 184
    .line 185
    :goto_1
    return-object v11

    .line 186
    :cond_6
    move-wide v0, v6

    .line 187
    :goto_2
    new-instance p0, Lf13;

    .line 188
    .line 189
    invoke-direct {p0, v0, v1}, Lf13;-><init>(J)V

    .line 190
    .line 191
    .line 192
    return-object p0
.end method
