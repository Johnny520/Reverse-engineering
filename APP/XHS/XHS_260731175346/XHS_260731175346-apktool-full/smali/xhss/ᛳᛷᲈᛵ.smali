.class public abstract Lxhss/ᛳᛷᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

.field public static final ᲇᛴᲇᛵ:Lxhss/ᛴᛶᲀᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lxhss/ᲇᲀᲈᛲ;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᲇᲀᲈᛲ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    .line 9
    .line 10
    new-instance v9, Lxhss/ᲇᛳᲀᲀ;

    .line 11
    .line 12
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 16
    .line 17
    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 18
    .line 19
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    const-wide/16 v5, 0x2710

    .line 25
    .line 26
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lxhss/ᛳᛷᲈᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance v0, Lxhss/ᛴᛶᲀᛶ;

    .line 45
    .line 46
    invoke-direct {v0}, Lxhss/ᛴᛶᲀᛶ;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lxhss/ᛳᛷᲈᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᲀᛶ;

    .line 50
    .line 51
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lxhss/ᛳᛵᛴᲈ;
    .locals 8

    .line 1
    sget-object v0, Lxhss/ᛳᛷᲈᛵ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲀᲈᛲ;

    .line 2
    .line 3
    const-string v1, "getFontSync"

    .line 4
    .line 5
    invoke-static {v1}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p0}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/graphics/Typeface;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Lxhss/ᛳᛵᛴᲈ;-><init>(Landroid/graphics/Typeface;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    :try_start_1
    invoke-static {p1, p2}, Lxhss/ᛸᛸᛶᲀ;->ᛷᛵᛵᲈ(Landroid/content/Context;Ljava/util/List;)Lxhss/ᛱᲇᛴᲇ;

    .line 26
    .line 27
    .line 28
    move-result-object p2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    :try_start_2
    iget-object v1, p2, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/List;

    .line 32
    .line 33
    iget p2, p2, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    const/4 v3, -0x3

    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    if-eq p2, v2, :cond_1

    .line 41
    .line 42
    :goto_0
    move p2, v3

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const/4 p2, -0x2

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, [Lxhss/ᛵᛶᲈᛳ;

    .line 51
    .line 52
    if-eqz p2, :cond_7

    .line 53
    .line 54
    array-length v5, p2

    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    array-length v5, p2

    .line 59
    move v6, v4

    .line 60
    :goto_1
    if-ge v6, v5, :cond_6

    .line 61
    .line 62
    aget-object v7, p2, v6

    .line 63
    .line 64
    iget v7, v7, Lxhss/ᛵᛶᲈᛳ;->ᲇᛶᛴᲀ:I

    .line 65
    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    if-gez v7, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    move p2, v7

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_6
    move p2, v4

    .line 77
    goto :goto_3

    .line 78
    :cond_7
    :goto_2
    move p2, v2

    .line 79
    :goto_3
    if-eqz p2, :cond_8

    .line 80
    .line 81
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 82
    .line 83
    invoke-direct {p0, p2}, Lxhss/ᛳᛵᛴᲈ;-><init>(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    .line 85
    .line 86
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_8
    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-le p2, v2, :cond_9

    .line 95
    .line 96
    sget-object p2, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 97
    .line 98
    const-string p2, "TypefaceCompat.createFromFontInfoWithFallback"

    .line 99
    .line 100
    invoke-static {p2}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 101
    .line 102
    .line 103
    :try_start_4
    sget-object p2, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 104
    .line 105
    invoke-virtual {p2, p1, v1, p3}, Lxhss/ᛶᛵᲇᛸ;->ᛸᛴᛶᛳ(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;

    .line 106
    .line 107
    .line 108
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 115
    .line 116
    .line 117
    throw p0

    .line 118
    :cond_9
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, [Lxhss/ᛵᛶᲈᛳ;

    .line 123
    .line 124
    invoke-static {p1, p2, p3}, Lxhss/ᛱᲁᛶᲇ;->ᛷᛵᛵᲈ(Landroid/content/Context;[Lxhss/ᛵᛶᲈᛳ;I)Landroid/graphics/Typeface;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_4
    if-eqz p1, :cond_a

    .line 129
    .line 130
    invoke-virtual {v0, p0, p1}, Lxhss/ᲇᲀᲈᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 134
    .line 135
    invoke-direct {p0, p1}, Lxhss/ᛳᛵᛴᲈ;-><init>(Landroid/graphics/Typeface;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_a
    :try_start_6
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 143
    .line 144
    invoke-direct {p0, v3}, Lxhss/ᛳᛵᛴᲈ;-><init>(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 145
    .line 146
    .line 147
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 148
    .line 149
    .line 150
    return-object p0

    .line 151
    :catch_0
    :try_start_7
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 152
    .line 153
    const/4 p1, -0x1

    .line 154
    invoke-direct {p0, p1}, Lxhss/ᛳᛵᛴᲈ;-><init>(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :catchall_1
    move-exception p0

    .line 162
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 163
    .line 164
    .line 165
    throw p0
.end method

.method public static ᛷᛵᛵᲈ(Ljava/util/List;I)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lxhss/ᛷᛱᛲᲇ;

    .line 18
    .line 19
    iget-object v2, v2, Lxhss/ᛷᛱᛲᲇ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, "-"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    if-ge v1, v2, :cond_0

    .line 39
    .line 40
    const-string v2, ";"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
