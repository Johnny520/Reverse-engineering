.class public final Lm/g3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Li/m;


# instance fields
.field public final a:Li/n1;

.field public b:J

.field public c:Li/m;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li/m;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm/g3;->f:Li/m;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Li/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li/d;->j:Li/m1;

    .line 5
    .line 6
    invoke-interface {p1, v0}, Li/k;->a(Li/m1;)Li/n1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lm/g3;->a:Li/n1;

    .line 11
    .line 12
    const-wide/high16 v0, -0x8000000000000000L

    .line 13
    .line 14
    iput-wide v0, p0, Lm/g3;->b:J

    .line 15
    .line 16
    sget-object p1, Lm/g3;->f:Li/m;

    .line 17
    .line 18
    iput-object p1, p0, Lm/g3;->c:Li/m;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lb0/s;Lab/e;Lyf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Lm/f3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lm/f3;

    .line 7
    .line 8
    iget v1, v0, Lm/f3;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm/f3;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/f3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lm/f3;-><init>(Lm/g3;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lm/f3;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/f3;->l:I

    .line 28
    .line 29
    sget-object v2, Lm/g3;->f:Li/m;

    .line 30
    .line 31
    const-wide/high16 v3, -0x8000000000000000L

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    sget-object v9, Lxf/a;->g:Lxf/a;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    if-eq v1, v8, :cond_2

    .line 42
    .line 43
    if-ne v1, v6, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lm/f3;->g:Lsf/b;

    .line 46
    .line 47
    check-cast p1, Lfg/a;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    return-object p1

    .line 64
    :cond_2
    iget p1, v0, Lm/f3;->i:F

    .line 65
    .line 66
    iget-object p2, v0, Lm/f3;->h:Lfg/a;

    .line 67
    .line 68
    iget-object v1, v0, Lm/f3;->g:Lsf/b;

    .line 69
    .line 70
    check-cast v1, Lfg/l;

    .line 71
    .line 72
    :try_start_1
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    move-object p3, p2

    .line 76
    move-object p2, v1

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-static {p3}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-boolean p3, p0, Lm/g3;->d:Z

    .line 82
    .line 83
    if-eqz p3, :cond_4

    .line 84
    .line 85
    const-string p3, "animateToZero called while previous animation is running"

    .line 86
    .line 87
    invoke-static {p3}, Lo/b;->c(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    sget-object v1, Ly0/b;->v:Ly0/b;

    .line 95
    .line 96
    invoke-interface {p3, v1}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    check-cast p3, Ly0/p;

    .line 101
    .line 102
    if-eqz p3, :cond_5

    .line 103
    .line 104
    invoke-interface {p3}, Ly0/p;->i()F

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 110
    .line 111
    :goto_1
    iput-boolean v8, p0, Lm/g3;->d:Z

    .line 112
    .line 113
    move-object v11, p2

    .line 114
    move-object p2, p1

    .line 115
    move p1, p3

    .line 116
    move-object p3, v11

    .line 117
    :cond_6
    :try_start_2
    iget v1, p0, Lm/g3;->e:F

    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    const v10, 0x3c23d70a    # 0.01f

    .line 124
    .line 125
    .line 126
    cmpg-float v1, v1, v10

    .line 127
    .line 128
    if-gez v1, :cond_7

    .line 129
    .line 130
    :goto_2
    move-object p1, p3

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    new-instance v1, Lm/e3;

    .line 133
    .line 134
    const/4 v10, 0x0

    .line 135
    invoke-direct {v1, p0, p1, p2, v10}, Lm/e3;-><init>(Ljava/lang/Object;FLjava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    iput-object p2, v0, Lm/f3;->g:Lsf/b;

    .line 139
    .line 140
    iput-object p3, v0, Lm/f3;->h:Lfg/a;

    .line 141
    .line 142
    iput p1, v0, Lm/f3;->i:F

    .line 143
    .line 144
    iput v8, v0, Lm/f3;->l:I

    .line 145
    .line 146
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v10}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v10, v1, v0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-ne v1, v9, :cond_8

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_8
    :goto_3
    invoke-interface {p3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    cmpg-float v1, p1, v5

    .line 165
    .line 166
    if-nez v1, :cond_6

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_4
    iget p3, p0, Lm/g3;->e:F

    .line 170
    .line 171
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    cmpg-float p3, p3, v5

    .line 176
    .line 177
    if-nez p3, :cond_9

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_9
    new-instance p3, Lm/b;

    .line 181
    .line 182
    const/4 v1, 0x3

    .line 183
    invoke-direct {p3, p0, v1, p2}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iput-object p1, v0, Lm/f3;->g:Lsf/b;

    .line 187
    .line 188
    const/4 p2, 0x0

    .line 189
    iput-object p2, v0, Lm/f3;->h:Lfg/a;

    .line 190
    .line 191
    iput v6, v0, Lm/f3;->l:I

    .line 192
    .line 193
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-static {p2}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-virtual {p2, p3, v0}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-ne p2, v9, :cond_a

    .line 206
    .line 207
    :goto_5
    return-object v9

    .line 208
    :cond_a
    :goto_6
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    .line 210
    .line 211
    :goto_7
    iput-wide v3, p0, Lm/g3;->b:J

    .line 212
    .line 213
    iput-object v2, p0, Lm/g3;->c:Li/m;

    .line 214
    .line 215
    iput-boolean v7, p0, Lm/g3;->d:Z

    .line 216
    .line 217
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 218
    .line 219
    return-object p1

    .line 220
    :goto_8
    iput-wide v3, p0, Lm/g3;->b:J

    .line 221
    .line 222
    iput-object v2, p0, Lm/g3;->c:Li/m;

    .line 223
    .line 224
    iput-boolean v7, p0, Lm/g3;->d:Z

    .line 225
    .line 226
    throw p1
.end method
