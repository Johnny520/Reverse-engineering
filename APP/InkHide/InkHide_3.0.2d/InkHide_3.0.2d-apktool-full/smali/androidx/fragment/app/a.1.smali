.class public final Landroidx/fragment/app/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/CharSequence;

.field public k:I

.field public l:Ljava/lang/CharSequence;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/ArrayList;

.field public o:Z

.field public final p:Landroidx/fragment/app/z;

.field public q:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/z;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/z;->B()Landroidx/fragment/app/v;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/o;->e:Le/i;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Landroidx/fragment/app/a;->o:Z

    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    iput v0, p0, Landroidx/fragment/app/a;->q:I

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(ILandroidx/fragment/app/l;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_8

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_8

    .line 32
    .line 33
    :cond_0
    const-string v0, " now "

    .line 34
    .line 35
    const-string v1, ": was "

    .line 36
    .line 37
    if-eqz p3, :cond_3

    .line 38
    .line 39
    iget-object v2, p2, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "Can\'t change tag of fragment "

    .line 55
    .line 56
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object p2, p2, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    :goto_0
    iput-object p3, p2, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 85
    .line 86
    :cond_3
    if-eqz p1, :cond_7

    .line 87
    .line 88
    const/4 v2, -0x1

    .line 89
    if-eq p1, v2, :cond_6

    .line 90
    .line 91
    iget p3, p2, Landroidx/fragment/app/l;->w:I

    .line 92
    .line 93
    if-eqz p3, :cond_5

    .line 94
    .line 95
    if-ne p3, p1, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v3, "Can\'t change container ID of fragment "

    .line 103
    .line 104
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget p2, p2, Landroidx/fragment/app/l;->w:I

    .line 114
    .line 115
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p3

    .line 132
    :cond_5
    :goto_1
    iput p1, p2, Landroidx/fragment/app/l;->w:I

    .line 133
    .line 134
    iput p1, p2, Landroidx/fragment/app/l;->x:I

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v1, "Can\'t add fragment "

    .line 142
    .line 143
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p2, " with tag "

    .line 150
    .line 151
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string p2, " to container view with no id"

    .line 158
    .line 159
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_7
    :goto_2
    new-instance p1, Landroidx/fragment/app/G;

    .line 171
    .line 172
    const/4 p3, 0x1

    .line 173
    invoke-direct {p1, p3, p2}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p1}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/G;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p0, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    .line 180
    .line 181
    iput-object p1, p2, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 182
    .line 183
    return-void

    .line 184
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 185
    .line 186
    new-instance p2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string p3, "Fragment "

    .line 189
    .line 190
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string p3, " must be a public static class to be  properly recreated from instance state."

    .line 201
    .line 202
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1
.end method

.method public final b(Landroidx/fragment/app/G;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/fragment/app/a;->b:I

    .line 7
    .line 8
    iput v0, p1, Landroidx/fragment/app/G;->c:I

    .line 9
    .line 10
    iget v0, p0, Landroidx/fragment/app/a;->c:I

    .line 11
    .line 12
    iput v0, p1, Landroidx/fragment/app/G;->d:I

    .line 13
    .line 14
    iget v0, p0, Landroidx/fragment/app/a;->d:I

    .line 15
    .line 16
    iput v0, p1, Landroidx/fragment/app/G;->e:I

    .line 17
    .line 18
    iget v0, p0, Landroidx/fragment/app/a;->e:I

    .line 19
    .line 20
    iput v0, p1, Landroidx/fragment/app/G;->f:I

    .line 21
    .line 22
    return-void
.end method

.method public final c(I)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/a;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "FragmentManager"

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Bump nesting in "

    .line 18
    .line 19
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, " by "

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x0

    .line 47
    :goto_0
    if-ge v4, v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Landroidx/fragment/app/G;

    .line 54
    .line 55
    iget-object v6, v5, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 56
    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    iget v7, v6, Landroidx/fragment/app/l;->r:I

    .line 60
    .line 61
    add-int/2addr v7, p1

    .line 62
    iput v7, v6, Landroidx/fragment/app/l;->r:I

    .line 63
    .line 64
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    new-instance v6, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v7, "Bump nesting of "

    .line 73
    .line 74
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v7, v5, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v7, " to "

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v5, v5, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 88
    .line 89
    iget v5, v5, Landroidx/fragment/app/l;->r:I

    .line 90
    .line 91
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    :goto_1
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_8

    .line 3
    .line 4
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "mName="

    .line 8
    .line 9
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, " mIndex="

    .line 18
    .line 19
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Landroidx/fragment/app/a;->q:I

    .line 23
    .line 24
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 25
    .line 26
    .line 27
    const-string v1, " mCommitted="

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 33
    .line 34
    .line 35
    iget v1, p0, Landroidx/fragment/app/a;->f:I

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "mTransition=#"

    .line 43
    .line 44
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget v1, p0, Landroidx/fragment/app/a;->f:I

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget v1, p0, Landroidx/fragment/app/a;->b:I

    .line 57
    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/a;->c:I

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "mEnterAnim=#"

    .line 68
    .line 69
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget v1, p0, Landroidx/fragment/app/a;->b:I

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, " mExitAnim=#"

    .line 82
    .line 83
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget v1, p0, Landroidx/fragment/app/a;->c:I

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget v1, p0, Landroidx/fragment/app/a;->d:I

    .line 96
    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    iget v1, p0, Landroidx/fragment/app/a;->e:I

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v1, "mPopEnterAnim=#"

    .line 107
    .line 108
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget v1, p0, Landroidx/fragment/app/a;->d:I

    .line 112
    .line 113
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v1, " mPopExitAnim=#"

    .line 121
    .line 122
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget v1, p0, Landroidx/fragment/app/a;->e:I

    .line 126
    .line 127
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    iget v1, p0, Landroidx/fragment/app/a;->i:I

    .line 135
    .line 136
    if-nez v1, :cond_5

    .line 137
    .line 138
    iget-object v1, p0, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    .line 139
    .line 140
    if-eqz v1, :cond_6

    .line 141
    .line 142
    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v1, "mBreadCrumbTitleRes=#"

    .line 146
    .line 147
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget v1, p0, Landroidx/fragment/app/a;->i:I

    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v1, " mBreadCrumbTitleText="

    .line 160
    .line 161
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    .line 165
    .line 166
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    iget v1, p0, Landroidx/fragment/app/a;->k:I

    .line 170
    .line 171
    if-nez v1, :cond_7

    .line 172
    .line 173
    iget-object v1, p0, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    .line 174
    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-string v1, "mBreadCrumbShortTitleRes=#"

    .line 181
    .line 182
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget v1, p0, Landroidx/fragment/app/a;->k:I

    .line 186
    .line 187
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v1, " mBreadCrumbShortTitleText="

    .line 195
    .line 196
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    .line 200
    .line 201
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_8
    iget-object v1, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_d

    .line 211
    .line 212
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string v2, "Operations:"

    .line 216
    .line 217
    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    :goto_0
    if-ge v0, v2, :cond_d

    .line 225
    .line 226
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    check-cast v3, Landroidx/fragment/app/G;

    .line 231
    .line 232
    iget v4, v3, Landroidx/fragment/app/G;->a:I

    .line 233
    .line 234
    packed-switch v4, :pswitch_data_0

    .line 235
    .line 236
    .line 237
    new-instance v4, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v5, "cmd="

    .line 240
    .line 241
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget v5, v3, Landroidx/fragment/app/G;->a:I

    .line 245
    .line 246
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    goto :goto_1

    .line 254
    :pswitch_0
    const-string v4, "OP_SET_MAX_LIFECYCLE"

    .line 255
    .line 256
    goto :goto_1

    .line 257
    :pswitch_1
    const-string v4, "UNSET_PRIMARY_NAV"

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :pswitch_2
    const-string v4, "SET_PRIMARY_NAV"

    .line 261
    .line 262
    goto :goto_1

    .line 263
    :pswitch_3
    const-string v4, "ATTACH"

    .line 264
    .line 265
    goto :goto_1

    .line 266
    :pswitch_4
    const-string v4, "DETACH"

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :pswitch_5
    const-string v4, "SHOW"

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :pswitch_6
    const-string v4, "HIDE"

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :pswitch_7
    const-string v4, "REMOVE"

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :pswitch_8
    const-string v4, "REPLACE"

    .line 279
    .line 280
    goto :goto_1

    .line 281
    :pswitch_9
    const-string v4, "ADD"

    .line 282
    .line 283
    goto :goto_1

    .line 284
    :pswitch_a
    const-string v4, "NULL"

    .line 285
    .line 286
    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    const-string v5, "  Op #"

    .line 290
    .line 291
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 295
    .line 296
    .line 297
    const-string v5, ": "

    .line 298
    .line 299
    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string v4, " "

    .line 306
    .line 307
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    iget-object v4, v3, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 311
    .line 312
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    if-eqz p3, :cond_c

    .line 316
    .line 317
    iget v4, v3, Landroidx/fragment/app/G;->c:I

    .line 318
    .line 319
    if-nez v4, :cond_9

    .line 320
    .line 321
    iget v4, v3, Landroidx/fragment/app/G;->d:I

    .line 322
    .line 323
    if-eqz v4, :cond_a

    .line 324
    .line 325
    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const-string v4, "enterAnim=#"

    .line 329
    .line 330
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget v4, v3, Landroidx/fragment/app/G;->c:I

    .line 334
    .line 335
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    const-string v4, " exitAnim=#"

    .line 343
    .line 344
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget v4, v3, Landroidx/fragment/app/G;->d:I

    .line 348
    .line 349
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :cond_a
    iget v4, v3, Landroidx/fragment/app/G;->e:I

    .line 357
    .line 358
    if-nez v4, :cond_b

    .line 359
    .line 360
    iget v4, v3, Landroidx/fragment/app/G;->f:I

    .line 361
    .line 362
    if-eqz v4, :cond_c

    .line 363
    .line 364
    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const-string v4, "popEnterAnim=#"

    .line 368
    .line 369
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget v4, v3, Landroidx/fragment/app/G;->e:I

    .line 373
    .line 374
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const-string v4, " popExitAnim=#"

    .line 382
    .line 383
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    iget v3, v3, Landroidx/fragment/app/G;->f:I

    .line 387
    .line 388
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_d
    return-void

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Run: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Landroidx/fragment/app/a;->g:Z

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    .line 40
    .line 41
    iget-object p2, p1, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    new-instance p2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p2, p1, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 51
    .line 52
    :cond_1
    iget-object p1, p1, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "BackStackEntry{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v1, p0, Landroidx/fragment/app/a;->q:I

    .line 25
    .line 26
    if-ltz v1, :cond_0

    .line 27
    .line 28
    const-string v1, " #"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v1, p0, Landroidx/fragment/app/a;->q:I

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const-string v1, " "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string v1, "}"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
