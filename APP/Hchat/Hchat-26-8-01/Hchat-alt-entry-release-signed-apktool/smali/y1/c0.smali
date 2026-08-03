.class public final Ly1/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/translation/ViewTranslationCallback;


# static fields
.field public static final a:Ly1/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly1/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly1/c0;->a:Ly1/c0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClearTranslation(Landroid/view/View;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ly1/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Ly1/t;->getContentCaptureManager$ui()La1/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, La1/b;->g:La1/b;

    .line 14
    .line 15
    iput-object v0, p1, La1/i;->l:La1/b;

    .line 16
    .line 17
    invoke-virtual {p1}, La1/i;->h()Lf/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p1, Lf/k;->c:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lf/k;->a:[J

    .line 24
    .line 25
    array-length v1, p1

    .line 26
    add-int/lit8 v1, v1, -0x2

    .line 27
    .line 28
    if-ltz v1, :cond_5

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    move v3, v2

    .line 32
    :goto_0
    aget-wide v4, p1, v3

    .line 33
    .line 34
    not-long v6, v4

    .line 35
    const/4 v8, 0x7

    .line 36
    shl-long/2addr v6, v8

    .line 37
    and-long/2addr v6, v4

    .line 38
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v6, v8

    .line 44
    cmp-long v6, v6, v8

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    sub-int v6, v3, v1

    .line 49
    .line 50
    not-int v6, v6

    .line 51
    ushr-int/lit8 v6, v6, 0x1f

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v6, v6, 0x8

    .line 56
    .line 57
    move v8, v2

    .line 58
    :goto_1
    if-ge v8, v6, :cond_3

    .line 59
    .line 60
    const-wide/16 v9, 0xff

    .line 61
    .line 62
    and-long/2addr v9, v4

    .line 63
    const-wide/16 v11, 0x80

    .line 64
    .line 65
    cmp-long v9, v9, v11

    .line 66
    .line 67
    if-gez v9, :cond_2

    .line 68
    .line 69
    shl-int/lit8 v9, v3, 0x3

    .line 70
    .line 71
    add-int/2addr v9, v8

    .line 72
    aget-object v9, v0, v9

    .line 73
    .line 74
    check-cast v9, Lf2/r;

    .line 75
    .line 76
    iget-object v9, v9, Lf2/r;->a:Lf2/q;

    .line 77
    .line 78
    iget-object v9, v9, Lf2/q;->d:Lf2/m;

    .line 79
    .line 80
    iget-object v9, v9, Lf2/m;->g:Lf/k0;

    .line 81
    .line 82
    sget-object v10, Lf2/u;->D:Lf2/x;

    .line 83
    .line 84
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const/4 v11, 0x0

    .line 89
    if-nez v10, :cond_0

    .line 90
    .line 91
    move-object v10, v11

    .line 92
    :cond_0
    if-eqz v10, :cond_2

    .line 93
    .line 94
    sget-object v10, Lf2/l;->n:Lf2/x;

    .line 95
    .line 96
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-nez v9, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    move-object v11, v9

    .line 104
    :goto_2
    check-cast v11, Lf2/a;

    .line 105
    .line 106
    if-eqz v11, :cond_2

    .line 107
    .line 108
    iget-object v9, v11, Lf2/a;->b:Lsf/b;

    .line 109
    .line 110
    check-cast v9, Lfg/a;

    .line 111
    .line 112
    if-eqz v9, :cond_2

    .line 113
    .line 114
    invoke-interface {v9}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    check-cast v9, Ljava/lang/Boolean;

    .line 119
    .line 120
    :cond_2
    shr-long/2addr v4, v7

    .line 121
    add-int/lit8 v8, v8, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    if-ne v6, v7, :cond_5

    .line 125
    .line 126
    :cond_4
    if-eq v3, v1, :cond_5

    .line 127
    .line 128
    add-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    const/4 p1, 0x1

    .line 132
    return p1
.end method

.method public final onHideTranslation(Landroid/view/View;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ly1/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Ly1/t;->getContentCaptureManager$ui()La1/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, La1/b;->g:La1/b;

    .line 14
    .line 15
    iput-object v0, p1, La1/i;->l:La1/b;

    .line 16
    .line 17
    invoke-virtual {p1}, La1/i;->h()Lf/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p1, Lf/k;->c:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lf/k;->a:[J

    .line 24
    .line 25
    array-length v1, p1

    .line 26
    add-int/lit8 v1, v1, -0x2

    .line 27
    .line 28
    if-ltz v1, :cond_5

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    move v3, v2

    .line 32
    :goto_0
    aget-wide v4, p1, v3

    .line 33
    .line 34
    not-long v6, v4

    .line 35
    const/4 v8, 0x7

    .line 36
    shl-long/2addr v6, v8

    .line 37
    and-long/2addr v6, v4

    .line 38
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v6, v8

    .line 44
    cmp-long v6, v6, v8

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    sub-int v6, v3, v1

    .line 49
    .line 50
    not-int v6, v6

    .line 51
    ushr-int/lit8 v6, v6, 0x1f

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v6, v6, 0x8

    .line 56
    .line 57
    move v8, v2

    .line 58
    :goto_1
    if-ge v8, v6, :cond_3

    .line 59
    .line 60
    const-wide/16 v9, 0xff

    .line 61
    .line 62
    and-long/2addr v9, v4

    .line 63
    const-wide/16 v11, 0x80

    .line 64
    .line 65
    cmp-long v9, v9, v11

    .line 66
    .line 67
    if-gez v9, :cond_2

    .line 68
    .line 69
    shl-int/lit8 v9, v3, 0x3

    .line 70
    .line 71
    add-int/2addr v9, v8

    .line 72
    aget-object v9, v0, v9

    .line 73
    .line 74
    check-cast v9, Lf2/r;

    .line 75
    .line 76
    iget-object v9, v9, Lf2/r;->a:Lf2/q;

    .line 77
    .line 78
    iget-object v9, v9, Lf2/q;->d:Lf2/m;

    .line 79
    .line 80
    iget-object v9, v9, Lf2/m;->g:Lf/k0;

    .line 81
    .line 82
    sget-object v10, Lf2/u;->D:Lf2/x;

    .line 83
    .line 84
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const/4 v11, 0x0

    .line 89
    if-nez v10, :cond_0

    .line 90
    .line 91
    move-object v10, v11

    .line 92
    :cond_0
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-static {v10, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_2

    .line 99
    .line 100
    sget-object v10, Lf2/l;->m:Lf2/x;

    .line 101
    .line 102
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-nez v9, :cond_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    move-object v11, v9

    .line 110
    :goto_2
    check-cast v11, Lf2/a;

    .line 111
    .line 112
    if-eqz v11, :cond_2

    .line 113
    .line 114
    iget-object v9, v11, Lf2/a;->b:Lsf/b;

    .line 115
    .line 116
    check-cast v9, Lfg/l;

    .line 117
    .line 118
    if-eqz v9, :cond_2

    .line 119
    .line 120
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-interface {v9, v10}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    check-cast v9, Ljava/lang/Boolean;

    .line 127
    .line 128
    :cond_2
    shr-long/2addr v4, v7

    .line 129
    add-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    if-ne v6, v7, :cond_5

    .line 133
    .line 134
    :cond_4
    if-eq v3, v1, :cond_5

    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    const/4 p1, 0x1

    .line 140
    return p1
.end method

.method public final onShowTranslation(Landroid/view/View;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Ly1/t;

    .line 5
    .line 6
    invoke-virtual {p1}, Ly1/t;->getContentCaptureManager$ui()La1/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, La1/b;->h:La1/b;

    .line 14
    .line 15
    iput-object v0, p1, La1/i;->l:La1/b;

    .line 16
    .line 17
    invoke-virtual {p1}, La1/i;->h()Lf/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p1, Lf/k;->c:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lf/k;->a:[J

    .line 24
    .line 25
    array-length v1, p1

    .line 26
    add-int/lit8 v1, v1, -0x2

    .line 27
    .line 28
    if-ltz v1, :cond_5

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    move v3, v2

    .line 32
    :goto_0
    aget-wide v4, p1, v3

    .line 33
    .line 34
    not-long v6, v4

    .line 35
    const/4 v8, 0x7

    .line 36
    shl-long/2addr v6, v8

    .line 37
    and-long/2addr v6, v4

    .line 38
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v6, v8

    .line 44
    cmp-long v6, v6, v8

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    sub-int v6, v3, v1

    .line 49
    .line 50
    not-int v6, v6

    .line 51
    ushr-int/lit8 v6, v6, 0x1f

    .line 52
    .line 53
    const/16 v7, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v6, v6, 0x8

    .line 56
    .line 57
    move v8, v2

    .line 58
    :goto_1
    if-ge v8, v6, :cond_3

    .line 59
    .line 60
    const-wide/16 v9, 0xff

    .line 61
    .line 62
    and-long/2addr v9, v4

    .line 63
    const-wide/16 v11, 0x80

    .line 64
    .line 65
    cmp-long v9, v9, v11

    .line 66
    .line 67
    if-gez v9, :cond_2

    .line 68
    .line 69
    shl-int/lit8 v9, v3, 0x3

    .line 70
    .line 71
    add-int/2addr v9, v8

    .line 72
    aget-object v9, v0, v9

    .line 73
    .line 74
    check-cast v9, Lf2/r;

    .line 75
    .line 76
    iget-object v9, v9, Lf2/r;->a:Lf2/q;

    .line 77
    .line 78
    iget-object v9, v9, Lf2/q;->d:Lf2/m;

    .line 79
    .line 80
    iget-object v9, v9, Lf2/m;->g:Lf/k0;

    .line 81
    .line 82
    sget-object v10, Lf2/u;->D:Lf2/x;

    .line 83
    .line 84
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const/4 v11, 0x0

    .line 89
    if-nez v10, :cond_0

    .line 90
    .line 91
    move-object v10, v11

    .line 92
    :cond_0
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-static {v10, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_2

    .line 99
    .line 100
    sget-object v10, Lf2/l;->m:Lf2/x;

    .line 101
    .line 102
    invoke-virtual {v9, v10}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-nez v9, :cond_1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    move-object v11, v9

    .line 110
    :goto_2
    check-cast v11, Lf2/a;

    .line 111
    .line 112
    if-eqz v11, :cond_2

    .line 113
    .line 114
    iget-object v9, v11, Lf2/a;->b:Lsf/b;

    .line 115
    .line 116
    check-cast v9, Lfg/l;

    .line 117
    .line 118
    if-eqz v9, :cond_2

    .line 119
    .line 120
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-interface {v9, v10}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    check-cast v9, Ljava/lang/Boolean;

    .line 127
    .line 128
    :cond_2
    shr-long/2addr v4, v7

    .line 129
    add-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    if-ne v6, v7, :cond_5

    .line 133
    .line 134
    :cond_4
    if-eq v3, v1, :cond_5

    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    const/4 p1, 0x1

    .line 140
    return p1
.end method
