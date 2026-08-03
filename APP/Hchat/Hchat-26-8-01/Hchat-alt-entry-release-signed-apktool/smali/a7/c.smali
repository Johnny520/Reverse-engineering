.class public La7/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final g:Ljava/lang/String;

.field public final h:Lc7/f;

.field public i:Z

.field public j:Z

.field public k:Ll7/l;

.field public l:Lc7/e;

.field public m:Lm7/a;

.field public n:Lc7/e;

.field public o:I

.field public p:Lc7/a;

.field public final q:Lz7/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc7/f;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, La7/c;->i:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, La7/c;->j:Z

    .line 9
    .line 10
    iput-object p1, p0, La7/c;->g:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La7/c;->h:Lc7/f;

    .line 13
    .line 14
    new-instance p1, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lc7/f;->c()[Lc7/e;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    array-length v2, p2

    .line 29
    move v3, v1

    .line 30
    :goto_0
    if-ge v3, v2, :cond_5

    .line 31
    .line 32
    aget-object v4, p2, v3

    .line 33
    .line 34
    iget v5, v4, Lc7/e;->c:I

    .line 35
    .line 36
    const/16 v6, 0x8

    .line 37
    .line 38
    if-eq v5, v6, :cond_4

    .line 39
    .line 40
    invoke-virtual {v4}, Lc7/e;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x0

    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    sget-char v5, Ljava/io/File;->separatorChar:C

    .line 53
    .line 54
    const/16 v7, 0x2f

    .line 55
    .line 56
    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_1
    const-string v5, "/"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move-object v6, v4

    .line 85
    :goto_2
    if-nez v6, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {p1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    new-instance p1, Lz7/c;

    .line 95
    .line 96
    invoke-direct {p1, v1}, Lz7/c;-><init>(I)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, La7/c;->q:Lz7/c;

    .line 100
    .line 101
    new-instance p1, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public static l(Ll7/l;)Z
    .locals 2

    .line 1
    instance-of v0, p0, Lt7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Lt7/a;

    .line 6
    .line 7
    const-string v0, "android"

    .line 8
    .line 9
    invoke-virtual {p0}, Lt7/a;->b0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget v0, p0, Lt7/a;->v:I

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Ll7/l;->Z()Ll7/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ll7/f;->U()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lt7/a;->v:I

    .line 35
    .line 36
    :cond_1
    iget v0, p0, Lt7/a;->v:I

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x1

    .line 39
    if-ne v0, p0, :cond_2

    .line 40
    .line 41
    return p0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return p0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, La7/c;->m:Lm7/a;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v1}, Lm7/f;->i()Ll7/f;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v2}, Ll7/f;->Y()Ll7/l;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v2, v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {v1}, Lm7/a;->Y()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, v0, Ll7/l;->p:Lj7/b;

    .line 29
    .line 30
    iget-object v3, v3, Lo7/b;->k:Lz7/c;

    .line 31
    .line 32
    invoke-static {v3, v2}, Lj7/b;->k0(Lz7/c;I)Ll7/f;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Ll7/l;->Z()Ll7/f;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :cond_3
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget-object v0, v1, Lm7/q;->k:Lk7/c;

    .line 45
    .line 46
    check-cast v0, Lm7/g;

    .line 47
    .line 48
    iput-object v2, v0, Lm7/g;->r:Ll7/f;

    .line 49
    .line 50
    :cond_4
    iput-object p0, v1, Lm7/f;->m:La7/c;

    .line 51
    .line 52
    iget-boolean v0, p0, La7/c;->j:Z

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 58
    .line 59
    if-eqz v0, :cond_8

    .line 60
    .line 61
    instance-of v1, v0, Lt7/a;

    .line 62
    .line 63
    if-nez v1, :cond_8

    .line 64
    .line 65
    invoke-static {v0}, La7/c;->l(Ll7/l;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    iget-object v1, p0, La7/c;->m:Lm7/a;

    .line 73
    .line 74
    if-eqz v1, :cond_8

    .line 75
    .line 76
    iget-object v1, v0, Ll7/l;->q:Lz7/c;

    .line 77
    .line 78
    iget v1, v1, Lz7/c;->i:I

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_7
    const/4 v1, 0x0

    .line 84
    :try_start_0
    invoke-virtual {p0, v0, v1}, La7/c;->k(Ll7/l;Ljava/lang/Integer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    :catch_0
    :cond_8
    :goto_0
    return-void
.end method

.method public final b()Ljava/lang/Integer;
    .locals 6

    .line 1
    iget-object v0, p0, La7/c;->m:Lm7/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, La7/c;->h:Lc7/f;

    .line 7
    .line 8
    const-string v2, "AndroidManifest.xml"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-object v1

    .line 18
    :cond_1
    :goto_0
    invoke-virtual {p0}, La7/c;->c()Lm7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v2, 0x1010572

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lm7/a;->V(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Lv7/k0;->n:Lv7/k0;

    .line 30
    .line 31
    const-string v4, "manifest"

    .line 32
    .line 33
    if-nez v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    :cond_2
    :goto_1
    move-object v2, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    const-string v5, "platformBuildVersionCode"

    .line 44
    .line 45
    invoke-virtual {v2, v5}, Lm7/j;->W(Ljava/lang/String;)Lm7/c;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v2}, Lv7/j0;->T()Lv7/k0;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eq v5, v3, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    invoke-virtual {v2}, Lv7/j0;->O()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_5
    :goto_2
    invoke-virtual {v0, v4}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_6
    const-string v4, "uses-sdk"

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_7
    const v4, 0x1010270

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v4}, Lm7/j;->X(I)Lm7/c;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_9

    .line 90
    .line 91
    invoke-virtual {v0}, Lv7/j0;->T()Lv7/k0;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-eq v4, v3, :cond_8

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_8
    invoke-virtual {v0}, Lv7/j0;->O()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_9
    :goto_3
    if-nez v2, :cond_a

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_a
    if-eqz v1, :cond_b

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-le v0, v3, :cond_b

    .line 120
    .line 121
    :goto_4
    return-object v1

    .line 122
    :cond_b
    return-object v2
.end method

.method public final c()Lm7/a;
    .locals 6

    .line 1
    iget-object v0, p0, La7/c;->m:Lm7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "AndroidManifest.xml"

    .line 7
    .line 8
    iget-object v1, p0, La7/c;->h:Lc7/f;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-object v2, p0, La7/c;->n:Lc7/e;

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    instance-of v2, v0, Lc7/d;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    iput-object v0, p0, La7/c;->n:Lc7/e;

    .line 27
    .line 28
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Lc7/e;->b()Ljava/io/InputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Lm7/a;

    .line 33
    .line 34
    invoke-direct {v3}, Lm7/f;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v4, v3, Lm7/q;->k:Lk7/c;

    .line 38
    .line 39
    check-cast v4, Lm7/g;

    .line 40
    .line 41
    iget-object v4, v4, Lm7/g;->o:Lu7/a;

    .line 42
    .line 43
    iget-object v4, v4, Ll7/a;->m:Lp7/a;

    .line 44
    .line 45
    check-cast v4, Lp7/i;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-virtual {v4, v5}, Lp7/i;->T(Z)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lq7/b;

    .line 52
    .line 53
    invoke-direct {v4, v2}, Lq7/b;-><init>(Ljava/io/InputStream;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Lk7/a;->G(Lq7/b;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 60
    .line 61
    .line 62
    iput-object v3, p0, La7/c;->m:Lm7/a;

    .line 63
    .line 64
    new-instance v2, Lc7/d;

    .line 65
    .line 66
    iget-object v4, v0, Lc7/e;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v2, v4, v3}, Lc7/d;-><init>(Ljava/lang/String;Lk7/a;)V

    .line 69
    .line 70
    .line 71
    if-eq v0, v2, :cond_3

    .line 72
    .line 73
    iget v4, v0, Lc7/e;->d:I

    .line 74
    .line 75
    iput v4, v2, Lc7/e;->d:I

    .line 76
    .line 77
    iget v4, v0, Lc7/e;->c:I

    .line 78
    .line 79
    iput v4, v2, Lc7/e;->c:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lc7/e;->a()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, v2, Lc7/e;->b:Ljava/lang/String;

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v1, v2}, Lc7/f;->a(Lc7/d;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, La7/c;->a()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v3}, La7/c;->q(Lm7/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, La7/c;->m:Lm7/a;

    .line 97
    .line 98
    return-object v0

    .line 99
    :catch_0
    move-exception v0

    .line 100
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw v1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, La7/c;->p:Lc7/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lc7/a;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public e()Ll7/l;
    .locals 1

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ll7/l;
    .locals 4

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-boolean v0, p0, La7/c;->j:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, La7/c;->q:Lz7/c;

    .line 12
    .line 13
    iget v0, v0, Lz7/c;->i:I

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iput-boolean v1, p0, La7/c;->j:Z

    .line 19
    .line 20
    :cond_2
    :goto_0
    iget-boolean v0, p0, La7/c;->j:Z

    .line 21
    .line 22
    if-nez v0, :cond_6

    .line 23
    .line 24
    invoke-virtual {p0}, La7/c;->c()Lm7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {v0}, Lm7/a;->Z()Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_6

    .line 36
    .line 37
    const-string v2, "android"

    .line 38
    .line 39
    invoke-virtual {v0}, Lm7/a;->X()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {v0}, Lm7/a;->Y()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eq v0, v1, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iput-boolean v1, p0, La7/c;->j:Z

    .line 58
    .line 59
    :cond_6
    :goto_1
    iget-boolean v0, p0, La7/c;->j:Z

    .line 60
    .line 61
    xor-int/2addr v0, v1

    .line 62
    invoke-virtual {p0, v0}, La7/c;->h(Z)Ll7/l;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0
.end method

.method public final h(Z)Ll7/l;
    .locals 4

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    invoke-virtual {p0}, La7/c;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0}, La7/c;->o()Ll7/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La7/c;->k:Ll7/l;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p0, La7/c;->i:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, La7/c;->b()Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, v0, p1}, La7/c;->k(Ll7/l;Ljava/lang/Integer;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_0
    iget-object p1, p0, La7/c;->k:Ll7/l;

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v1, p0, La7/c;->q:Lz7/c;

    .line 41
    .line 42
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ll7/l;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Ll7/l;->U(Ll7/l;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_3

    .line 65
    .line 66
    iget-object v3, p1, Ll7/l;->q:Lz7/c;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Lz7/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :goto_2
    invoke-virtual {p0}, La7/c;->a()V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :goto_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_5
    return-object v0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, La7/c;->k:Ll7/l;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La7/c;->h:Lc7/f;

    .line 6
    .line 7
    const-string v1, "resources.arsc"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public final k(Ll7/l;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, La7/c;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_19

    .line 4
    .line 5
    if-eqz p1, :cond_19

    .line 6
    .line 7
    invoke-static {p1}, La7/c;->l(Ll7/l;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_f

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lz7/c;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lz7/c;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La7/c;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0, v1}, La7/c;->h(Z)Ll7/l;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, Ll7/l;->q:Lz7/c;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Lz7/c;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_6

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ll7/l;

    .line 52
    .line 53
    instance-of v3, v2, Lt7/a;

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    check-cast v2, Lt7/a;

    .line 59
    .line 60
    invoke-static {v2}, La7/c;->l(Ll7/l;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    if-eqz p2, :cond_5

    .line 68
    .line 69
    invoke-virtual {v2}, Lt7/a;->c0()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {p2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    :cond_5
    iget-object v0, v2, Ll7/l;->r:La7/c;

    .line 84
    .line 85
    check-cast v0, La7/d;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    const/4 v0, 0x0

    .line 89
    :goto_2
    if-eqz v0, :cond_7

    .line 90
    .line 91
    goto/16 :goto_f

    .line 92
    .line 93
    :cond_7
    if-nez p2, :cond_e

    .line 94
    .line 95
    const-class v0, La7/a;

    .line 96
    .line 97
    monitor-enter v0

    .line 98
    :try_start_0
    sget-object p2, La7/a;->a:Lb7/a;

    .line 99
    .line 100
    if-nez p2, :cond_8

    .line 101
    .line 102
    sget-object p2, Lb7/a;->c:Lb7/a;

    .line 103
    .line 104
    sput-object p2, La7/a;->a:Lb7/a;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_8

    .line 109
    :cond_8
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    const-class v2, La7/a;

    .line 111
    .line 112
    monitor-enter v2

    .line 113
    :try_start_1
    invoke-virtual {p2}, Lb7/a;->b()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_b

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-nez v1, :cond_a

    .line 144
    .line 145
    :goto_5
    move v1, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_a
    if-le v3, v1, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_b
    invoke-virtual {p2}, Lb7/a;->a()La7/d;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_c

    .line 155
    .line 156
    invoke-virtual {v0}, La7/d;->u()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-ne v1, v3, :cond_c

    .line 161
    .line 162
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 163
    goto/16 :goto_c

    .line 164
    .line 165
    :catchall_1
    move-exception p1

    .line 166
    goto :goto_7

    .line 167
    :cond_c
    :try_start_2
    invoke-virtual {p2, v1}, Lb7/a;->c(I)La7/d;

    .line 168
    .line 169
    .line 170
    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 171
    if-nez v0, :cond_d

    .line 172
    .line 173
    :try_start_3
    monitor-enter p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    :try_start_4
    iput-object v1, p2, Lb7/a;->a:La7/d;

    .line 175
    .line 176
    monitor-exit p2

    .line 177
    goto :goto_6

    .line 178
    :catchall_2
    move-exception p1

    .line 179
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 180
    :try_start_5
    throw p1

    .line 181
    :cond_d
    :goto_6
    monitor-exit v2

    .line 182
    move-object v0, v1

    .line 183
    goto/16 :goto_c

    .line 184
    .line 185
    :catch_0
    move-exception p1

    .line 186
    new-instance p2, Ljava/lang/RuntimeException;

    .line 187
    .line 188
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p2

    .line 192
    :goto_7
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 193
    throw p1

    .line 194
    :goto_8
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 195
    throw p1

    .line 196
    :cond_e
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    const-class v0, La7/a;

    .line 201
    .line 202
    monitor-enter v0

    .line 203
    :try_start_7
    sget-object v1, La7/a;->a:Lb7/a;

    .line 204
    .line 205
    if-nez v1, :cond_f

    .line 206
    .line 207
    sget-object v1, Lb7/a;->c:Lb7/a;

    .line 208
    .line 209
    sput-object v1, La7/a;->a:Lb7/a;

    .line 210
    .line 211
    goto :goto_9

    .line 212
    :catchall_3
    move-exception p1

    .line 213
    goto/16 :goto_e

    .line 214
    .line 215
    :cond_f
    :goto_9
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 216
    invoke-virtual {v1}, Lb7/a;->b()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v0, Ljava/util/HashMap;

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_10

    .line 231
    .line 232
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    goto :goto_b

    .line 237
    :cond_10
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    const/4 v2, 0x0

    .line 246
    move v3, v2

    .line 247
    move v4, v3

    .line 248
    :cond_11
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-eqz v5, :cond_16

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    check-cast v5, Ljava/lang/Integer;

    .line 259
    .line 260
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v3, :cond_12

    .line 265
    .line 266
    mul-int/lit8 v2, p2, 0x2

    .line 267
    .line 268
    add-int/lit16 v4, v2, 0x3e8

    .line 269
    .line 270
    move v2, v5

    .line 271
    move v3, v2

    .line 272
    goto :goto_a

    .line 273
    :cond_12
    if-le v5, v3, :cond_13

    .line 274
    .line 275
    move v3, v5

    .line 276
    :cond_13
    sub-int v6, v5, p2

    .line 277
    .line 278
    if-gez v6, :cond_14

    .line 279
    .line 280
    neg-int v6, v6

    .line 281
    :cond_14
    if-lt v6, v4, :cond_15

    .line 282
    .line 283
    if-ne v6, v4, :cond_11

    .line 284
    .line 285
    if-le v5, v2, :cond_11

    .line 286
    .line 287
    :cond_15
    move v2, v5

    .line 288
    move v4, v6

    .line 289
    goto :goto_a

    .line 290
    :cond_16
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    :goto_b
    const-class v2, La7/a;

    .line 295
    .line 296
    monitor-enter v2

    .line 297
    :try_start_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result p2

    .line 301
    invoke-virtual {v1}, Lb7/a;->a()La7/d;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-eqz v0, :cond_17

    .line 306
    .line 307
    invoke-virtual {v0}, La7/d;->u()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-ne p2, v3, :cond_17

    .line 312
    .line 313
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 314
    goto :goto_c

    .line 315
    :catchall_4
    move-exception p1

    .line 316
    goto :goto_d

    .line 317
    :cond_17
    :try_start_9
    invoke-virtual {v1, p2}, Lb7/a;->c(I)La7/d;

    .line 318
    .line 319
    .line 320
    move-result-object p2
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 321
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 322
    move-object v0, p2

    .line 323
    :goto_c
    invoke-virtual {v0}, La7/d;->t()Lt7/a;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    if-eqz p2, :cond_18

    .line 328
    .line 329
    invoke-virtual {p1, p2}, Ll7/l;->U(Ll7/l;)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_18

    .line 334
    .line 335
    iget-object p1, p1, Ll7/l;->q:Lz7/c;

    .line 336
    .line 337
    invoke-virtual {p1, p2}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_18
    invoke-virtual {v0}, La7/d;->s()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    iget-object p1, v0, La7/d;->t:Ljava/lang/String;

    .line 344
    .line 345
    if-nez p1, :cond_19

    .line 346
    .line 347
    invoke-virtual {v0}, La7/d;->w()V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :catch_1
    move-exception p1

    .line 352
    :try_start_b
    new-instance p2, Ljava/lang/RuntimeException;

    .line 353
    .line 354
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    throw p2

    .line 358
    :goto_d
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 359
    throw p1

    .line 360
    :goto_e
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 361
    throw p1

    .line 362
    :cond_19
    :goto_f
    return-void
.end method

.method public final m(Ljava/lang/String;)Lm7/f;
    .locals 6

    .line 1
    iget-object v0, p0, La7/c;->h:Lc7/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    instance-of p1, v0, Lc7/d;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move-object p1, v0

    .line 15
    check-cast p1, Lc7/d;

    .line 16
    .line 17
    iget-object p1, p1, Lc7/d;->e:Lk7/a;

    .line 18
    .line 19
    instance-of v2, p1, Lk7/e;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v2, p1

    .line 24
    check-cast v2, Lk7/e;

    .line 25
    .line 26
    invoke-interface {v2}, Lk7/e;->c()V

    .line 27
    .line 28
    .line 29
    :cond_0
    instance-of v2, p1, Lm7/f;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast p1, Lm7/f;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p1, v1

    .line 37
    :goto_0
    if-nez p1, :cond_2

    .line 38
    .line 39
    new-instance p1, Lm7/f;

    .line 40
    .line 41
    invoke-direct {p1}, Lm7/f;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lc7/e;->b()Ljava/io/InputStream;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, Lq7/b;

    .line 49
    .line 50
    invoke-direct {v3, v2}, Lq7/b;-><init>(Ljava/io/InputStream;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v3}, Lk7/a;->G(Lq7/b;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iput-object p0, p1, Lm7/f;->m:La7/c;

    .line 57
    .line 58
    invoke-virtual {p1}, Lm7/f;->i()Ll7/f;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v2, :cond_7

    .line 63
    .line 64
    invoke-virtual {v0}, Lc7/e;->a()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0}, La7/c;->g()Ll7/l;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v2, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v3, v2, Ll7/l;->p:Lj7/b;

    .line 76
    .line 77
    iget-object v4, v3, Lo7/b;->k:Lz7/c;

    .line 78
    .line 79
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, 0x1

    .line 84
    if-ne v4, v5, :cond_4

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-virtual {v3, v0}, Lo7/b;->Q(I)Lk7/a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v1, v0

    .line 92
    check-cast v1, Ll7/f;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v3, v2, Ll7/l;->o:Lu7/b;

    .line 96
    .line 97
    new-instance v4, Ll7/d;

    .line 98
    .line 99
    invoke-virtual {v3}, Lu7/c;->U()V

    .line 100
    .line 101
    .line 102
    iget-object v3, v3, Lu7/c;->r:Lf1/h;

    .line 103
    .line 104
    invoke-virtual {v3, v0}, Lf1/h;->o(Ljava/lang/String;)Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v3, 0x3

    .line 109
    invoke-direct {v4, v0, v3}, Ll7/d;-><init>(Ljava/util/Iterator;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lz7/m;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    invoke-virtual {v4}, Lz7/m;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :goto_1
    check-cast v1, Ll7/f;

    .line 124
    .line 125
    if-nez v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {v2}, Ll7/l;->Z()Ll7/f;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_6
    :goto_2
    iget-object v0, p1, Lm7/q;->k:Lk7/c;

    .line 132
    .line 133
    check-cast v0, Lm7/g;

    .line 134
    .line 135
    iput-object v1, v0, Lm7/g;->r:Ll7/f;

    .line 136
    .line 137
    :cond_7
    return-object p1

    .line 138
    :cond_8
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 139
    .line 140
    const-string v1, "No such file in apk: "

    .line 141
    .line 142
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
.end method

.method public o()Ll7/l;
    .locals 5

    .line 1
    iget-object v0, p0, La7/c;->h:Lc7/f;

    .line 2
    .line 3
    const-string v1, "resources.arsc"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc7/f;->b(Ljava/lang/String;)Lc7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    instance-of v2, v1, Lc7/d;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Lc7/d;

    .line 17
    .line 18
    iget-object v2, v2, Lc7/d;->e:Lk7/a;

    .line 19
    .line 20
    instance-of v3, v2, Lk7/e;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Lk7/e;

    .line 26
    .line 27
    invoke-interface {v3}, Lk7/e;->c()V

    .line 28
    .line 29
    .line 30
    :cond_0
    check-cast v2, Ll7/l;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v3, p0, La7/c;->l:Lc7/e;

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    iput-object v1, p0, La7/c;->l:Lc7/e;

    .line 40
    .line 41
    :cond_2
    invoke-virtual {v1}, Lc7/e;->b()Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, Ll7/l;

    .line 46
    .line 47
    invoke-direct {v3}, Ll7/l;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v4, Lq7/b;

    .line 51
    .line 52
    invoke-direct {v4, v2}, Lq7/b;-><init>(Ljava/io/InputStream;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Lk7/a;->G(Lq7/b;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 59
    .line 60
    .line 61
    move-object v2, v3

    .line 62
    :goto_0
    new-instance v3, Lc7/d;

    .line 63
    .line 64
    iget-object v4, v1, Lc7/e;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v3, v4, v2}, Lc7/d;-><init>(Ljava/lang/String;Lk7/a;)V

    .line 67
    .line 68
    .line 69
    if-eq v1, v3, :cond_3

    .line 70
    .line 71
    iget v4, v1, Lc7/e;->d:I

    .line 72
    .line 73
    iput v4, v3, Lc7/e;->d:I

    .line 74
    .line 75
    iget v4, v1, Lc7/e;->c:I

    .line 76
    .line 77
    iput v4, v3, Lc7/e;->c:I

    .line 78
    .line 79
    invoke-virtual {v1}, Lc7/e;->a()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v3, Lc7/e;->b:Ljava/lang/String;

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0, v3}, Lc7/f;->a(Lc7/d;)V

    .line 86
    .line 87
    .line 88
    iput-object p0, v2, Ll7/l;->r:La7/c;

    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_4
    const-string v0, "Entry not found: resources.arsc"

    .line 92
    .line 93
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    return-object v0
.end method

.method public final q(Lm7/a;)V
    .locals 4

    .line 1
    iget v0, p0, La7/c;->o:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    const-string v0, "manifest"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const-string v2, "split"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lm7/j;->W(Ljava/lang/String;)Lm7/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lm7/a;->Z()Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_3
    const-string v1, "activity"

    .line 43
    .line 44
    const-string v2, "application"

    .line 45
    .line 46
    filled-new-array {v0, v2, v1}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p1, v1}, Lm7/i;->P([Ljava/lang/String;)Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v3, "activity-alias"

    .line 55
    .line 56
    filled-new-array {v0, v2, v3}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Lm7/i;->P([Ljava/lang/String;)Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    move-object v1, p1

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    new-instance v0, Lz7/f;

    .line 80
    .line 81
    invoke-direct {v0, v1, p1}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 82
    .line 83
    .line 84
    move-object v1, v0

    .line 85
    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lm7/j;

    .line 96
    .line 97
    const-string v0, "intent-filter"

    .line 98
    .line 99
    const-string v2, "action"

    .line 100
    .line 101
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Lm7/i;->P([Ljava/lang/String;)Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Lm7/j;

    .line 120
    .line 121
    const v3, 0x1010003

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v3}, Lm7/j;->X(I)Lm7/c;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-nez v2, :cond_8

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_8
    const-string v3, "android.intent.action.MAIN"

    .line 132
    .line 133
    invoke-virtual {v2}, Lv7/j0;->S()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    const/4 p1, 0x0

    .line 145
    :goto_3
    if-eqz p1, :cond_a

    .line 146
    .line 147
    const/4 p1, 0x1

    .line 148
    goto :goto_4

    .line 149
    :cond_a
    const/4 p1, 0x0

    .line 150
    :goto_4
    if-eqz p1, :cond_b

    .line 151
    .line 152
    iput p1, p0, La7/c;->o:I

    .line 153
    .line 154
    :cond_b
    :goto_5
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La7/c;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
