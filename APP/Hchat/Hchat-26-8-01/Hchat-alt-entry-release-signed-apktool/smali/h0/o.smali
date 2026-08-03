.class public final Lh0/o;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:Lyg/b;

.field public i:Lh0/p;

.field public j:Ljava/lang/CharSequence;

.field public k:J

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/CharSequence;

.field public final synthetic o:J

.field public final synthetic p:Lh0/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;JLh0/p;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh0/o;->n:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-wide p2, p0, Lh0/o;->o:J

    .line 4
    .line 5
    iput-object p4, p0, Lh0/o;->p:Lh0/p;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lh0/o;

    .line 2
    .line 3
    iget-wide v2, p0, Lh0/o;->o:J

    .line 4
    .line 5
    iget-object v4, p0, Lh0/o;->p:Lh0/p;

    .line 6
    .line 7
    iget-object v1, p0, Lh0/o;->n:Ljava/lang/CharSequence;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lh0/o;-><init>(Ljava/lang/CharSequence;JLh0/p;Lwf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lh0/o;->m:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lh0/o;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lh0/o;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lh0/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lh0/o;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lh0/o;->k:J

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    iget-wide v0, p0, Lh0/o;->k:J

    .line 26
    .line 27
    iget-object v2, p0, Lh0/o;->j:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v3, p0, Lh0/o;->i:Lh0/p;

    .line 30
    .line 31
    iget-object v4, p0, Lh0/o;->h:Lyg/b;

    .line 32
    .line 33
    iget-object v5, p0, Lh0/o;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Landroid/view/textclassifier/TextSelection;

    .line 36
    .line 37
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lh0/o;->m:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, Landroid/view/textclassifier/TextClassifier;

    .line 48
    .line 49
    invoke-static {}, Lb0/b0;->z()V

    .line 50
    .line 51
    .line 52
    iget-wide v3, p0, Lh0/o;->o:J

    .line 53
    .line 54
    invoke-static {v3, v4}, Li2/m0;->f(J)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-static {v3, v4}, Li2/m0;->e(J)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v3, p0, Lh0/o;->n:Ljava/lang/CharSequence;

    .line 63
    .line 64
    invoke-static {v3, p1, v0}, Lb0/b0;->n(Ljava/lang/CharSequence;II)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v0, p0, Lh0/o;->p:Lh0/p;

    .line 69
    .line 70
    invoke-virtual {v0}, Lh0/p;->b()Landroid/os/LocaleList;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {p1, v4}, Lb0/b0;->m(Landroid/view/textclassifier/TextSelection$Request$Builder;Landroid/os/LocaleList;)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v5, 0x1f

    .line 81
    .line 82
    if-lt v4, v5, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, La1/c;->C(Landroid/view/textclassifier/TextSelection$Request$Builder;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {p1}, Lb0/b0;->o(Landroid/view/textclassifier/TextSelection$Request$Builder;)Landroid/view/textclassifier/TextSelection$Request;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v7, p1}, Lb0/b0;->p(Landroid/view/textclassifier/TextClassifier;Landroid/view/textclassifier/TextSelection$Request;)Landroid/view/textclassifier/TextSelection;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionStartIndex()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-virtual {p1}, Landroid/view/textclassifier/TextSelection;->getSelectionEndIndex()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-static {v6, v8}, Li2/e0;->b(II)J

    .line 104
    .line 105
    .line 106
    move-result-wide v8

    .line 107
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 108
    .line 109
    if-lt v4, v5, :cond_5

    .line 110
    .line 111
    invoke-static {p1}, La1/c;->m(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    iget-object v4, v0, Lh0/p;->e:Lyg/b;

    .line 118
    .line 119
    iput-object p1, p0, Lh0/o;->m:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v4, p0, Lh0/o;->h:Lyg/b;

    .line 122
    .line 123
    iput-object v0, p0, Lh0/o;->i:Lh0/p;

    .line 124
    .line 125
    iput-object v3, p0, Lh0/o;->j:Ljava/lang/CharSequence;

    .line 126
    .line 127
    iput-wide v8, p0, Lh0/o;->k:J

    .line 128
    .line 129
    iput v2, p0, Lh0/o;->l:I

    .line 130
    .line 131
    invoke-virtual {v4, p0}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-ne v1, v10, :cond_4

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    move-object v5, p1

    .line 139
    move-object v2, v3

    .line 140
    move-object v3, v0

    .line 141
    move-wide v0, v8

    .line 142
    :goto_0
    const/4 p1, 0x0

    .line 143
    :try_start_0
    new-instance v6, Lh0/r0;

    .line 144
    .line 145
    invoke-static {v5}, La1/c;->m(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-direct {v6, v2, v0, v1, v5}, Lh0/r0;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)V

    .line 153
    .line 154
    .line 155
    iget-object v2, v3, Lh0/p;->g:Li0/j1;

    .line 156
    .line 157
    invoke-virtual {v2, v6}, Li0/j1;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, p1}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    invoke-virtual {v4, p1}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_5
    iput-wide v8, p0, Lh0/o;->k:J

    .line 170
    .line 171
    iput v1, p0, Lh0/o;->l:I

    .line 172
    .line 173
    iget-object v3, p0, Lh0/o;->p:Lh0/p;

    .line 174
    .line 175
    iget-object v4, p0, Lh0/o;->n:Ljava/lang/CharSequence;

    .line 176
    .line 177
    move-wide v5, v8

    .line 178
    move-object v8, p0

    .line 179
    invoke-static/range {v3 .. v8}, Lh0/p;->a(Lh0/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lyf/c;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-ne p1, v10, :cond_6

    .line 184
    .line 185
    :goto_1
    return-object v10

    .line 186
    :cond_6
    move-wide v0, v5

    .line 187
    :goto_2
    new-instance p1, Li2/m0;

    .line 188
    .line 189
    invoke-direct {p1, v0, v1}, Li2/m0;-><init>(J)V

    .line 190
    .line 191
    .line 192
    return-object p1
.end method
