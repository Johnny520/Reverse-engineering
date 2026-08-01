.class public final Lw6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lba;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Comparable;

.field public final d:Ljava/io/Serializable;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw6;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lw6;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lw6;->c:Ljava/lang/Comparable;

    .line 9
    .line 10
    if-nez p4, :cond_0

    .line 11
    .line 12
    new-instance p4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-object p4, p0, Lw6;->d:Ljava/io/Serializable;

    .line 18
    .line 19
    if-nez p5, :cond_1

    .line 20
    .line 21
    new-instance p5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iput-object p5, p0, Lw6;->e:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lx6;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6;->a:Ljava/lang/Object;

    iput-object p2, p0, Lw6;->b:Ljava/lang/Object;

    iput-object p3, p0, Lw6;->c:Ljava/lang/Comparable;

    iput-object p4, p0, Lw6;->d:Ljava/io/Serializable;

    iput-object p5, p0, Lw6;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz9;[Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;Ljava/util/HashSet;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6;->e:Ljava/lang/Object;

    iput-object p2, p0, Lw6;->a:Ljava/lang/Object;

    iput-object p3, p0, Lw6;->c:Ljava/lang/Comparable;

    iput-object p4, p0, Lw6;->b:Ljava/lang/Object;

    iput-object p5, p0, Lw6;->d:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lw6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz9;

    .line 4
    .line 5
    if-lez p2, :cond_7

    .line 6
    .line 7
    iget-object v1, p0, Lw6;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [Ljava/lang/String;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v2, :cond_1

    .line 15
    .line 16
    aget-object v5, v1, v4

    .line 17
    .line 18
    invoke-virtual {v0, v5, p2}, Lz9;->d(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p2, p0, Lw6;->c:Ljava/lang/Comparable;

    .line 30
    .line 31
    check-cast p2, Ljava/lang/String;

    .line 32
    .line 33
    const-string v1, "L"

    .line 34
    .line 35
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const-string v1, ";"

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x1

    .line 54
    sub-int/2addr v1, v2

    .line 55
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :cond_2
    const/16 v1, 0x2f

    .line 60
    .line 61
    const/16 v2, 0x2e

    .line 62
    .line 63
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {v0, p1}, Lz9;->a(Lz9;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0, p1}, Lz9;->b(Lz9;I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-static {v0, p1}, Lz9;->c(Lz9;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v0, p1}, Lz9;->f(I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-gez p1, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget v5, v0, Lz9;->f:I

    .line 87
    .line 88
    mul-int/lit8 p1, p1, 0xc

    .line 89
    .line 90
    add-int/2addr p1, v5

    .line 91
    add-int/lit8 p1, p1, 0x8

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Lz9;->o(I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-virtual {v0, p1}, Lz9;->o(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-lez v5, :cond_6

    .line 105
    .line 106
    const/16 v6, 0x40

    .line 107
    .line 108
    if-le v5, v6, :cond_5

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    new-array v6, v5, [Ljava/lang/String;

    .line 112
    .line 113
    :goto_1
    if-ge v3, v5, :cond_6

    .line 114
    .line 115
    add-int/lit8 v7, p1, 0x4

    .line 116
    .line 117
    mul-int/lit8 v8, v3, 0x2

    .line 118
    .line 119
    add-int/2addr v8, v7

    .line 120
    invoke-virtual {v0, v8}, Lz9;->n(I)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-virtual {v0, v7}, Lz9;->l(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    aput-object v7, v6, v3

    .line 129
    .line 130
    add-int/lit8 v3, v3, 0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, "#"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object v0, p0, Lw6;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Ljava/util/HashSet;

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_7

    .line 174
    .line 175
    iget-object p0, p0, Lw6;->d:Ljava/io/Serializable;

    .line 176
    .line 177
    check-cast p0, Ljava/util/HashSet;

    .line 178
    .line 179
    new-instance p1, Lca;

    .line 180
    .line 181
    invoke-direct {p1, p2, v1, v2, v4}, Lca;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_7
    :goto_3
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lw6;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    iget-object v1, p0, Lw6;->c:Ljava/lang/Comparable;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lw6;->d:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lw6;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lw6;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lx6;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lx6;->e:Z

    .line 28
    .line 29
    iput-boolean v0, p0, Lx6;->f:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lx6;->i:Z

    .line 32
    .line 33
    iget-object v0, p0, Lx6;->g:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, La7;->p(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string v0, "native handler invoked"

    .line 42
    .line 43
    iput-object v0, p0, Lx6;->g:Ljava/lang/String;

    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw6;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-object p0, p0, Lw6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz p0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ge v1, v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-lez v3, :cond_2

    .line 52
    .line 53
    const-string v3, " > "

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_5
    :goto_2
    const-string p0, ""

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_6
    iget-object p0, p0, Lw6;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/io/File;

    .line 75
    .line 76
    invoke-static {p0}, Lcom/mr/elaris/w;->h0(Ljava/io/File;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw6;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {p0}, Lw6;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lw6;->c:Ljava/lang/Comparable;

    .line 8
    .line 9
    check-cast p0, Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public f()Lw6;
    .locals 9

    .line 1
    iget-object v0, p0, Lw6;->d:Ljava/io/Serializable;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Lw6;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    sub-int/2addr v0, v1

    .line 30
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v6, v0

    .line 35
    check-cast v6, Landroid/net/Uri;

    .line 36
    .line 37
    new-instance v8, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v0, p0, Lw6;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-le v0, v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int/2addr v0, v1

    .line 57
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_1
    new-instance v3, Lw6;

    .line 61
    .line 62
    iget-object p0, p0, Lw6;->b:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v5, p0

    .line 65
    check-cast v5, Landroid/net/Uri;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct/range {v3 .. v8}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :cond_2
    iget-object p0, p0, Lw6;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/io/File;

    .line 75
    .line 76
    sget-object v0, Lcom/mr/elaris/w;->a:[Ljava/lang/String;

    .line 77
    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    :goto_0
    move-object v4, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-static {p0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    :cond_4
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    move-object v4, p0

    .line 116
    :goto_1
    if-nez v4, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    new-instance v3, Lw6;

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-direct/range {v3 .. v8}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 126
    .line 127
    .line 128
    move-object v2, v3

    .line 129
    :goto_2
    return-object v2
.end method
