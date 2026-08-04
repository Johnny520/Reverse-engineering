.class public final Lyyds/ᛷᲇᲈᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᲇᛶᲀ;


# static fields
.field public static final ᛲᛲᲈᲈ:[Ljava/lang/String;


# instance fields
.field public final ᛱᲈᲁ:I

.field public final ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᛴᛷᛷ;

.field public final ᛶᛷᛲᲁ:I

.field public volatile ᛷᛲᲈᛱ:Z

.field public volatile ᛷᛵᲇᲀ:Lyyds/ᛳᲇᛶᲀ;

.field public final ᛷᲈᲈᲁ:Ljava/lang/Class;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public final ᲇᲇᲇᛱ:Landroid/net/Uri;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛷ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "_data"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᛷᲇᲈᲇ;->ᛲᛲᲈᲈ:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lyyds/ᛴᛷᛷ;Lyyds/ᛴᛷᛷ;Landroid/net/Uri;IILyyds/ᛴᛳᲀᲈ;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lyyds/ᛷᲇᲈᲇ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lyyds/ᛷᲇᲈᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛷ;

    .line 11
    .line 12
    iput-object p3, p0, Lyyds/ᛷᲇᲈᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛷᛷ;

    .line 13
    .line 14
    iput-object p4, p0, Lyyds/ᛷᲇᲈᲇ;->ᲇᲇᲇᛱ:Landroid/net/Uri;

    .line 15
    .line 16
    iput p5, p0, Lyyds/ᛷᲇᲈᲇ;->ᛶᛷᛲᲁ:I

    .line 17
    .line 18
    iput p6, p0, Lyyds/ᛷᲇᲈᲇ;->ᛱᲈᲁ:I

    .line 19
    .line 20
    iput-object p7, p0, Lyyds/ᛷᲇᲈᲇ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

    .line 21
    .line 22
    iput-object p8, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᲈᲈᲁ:Ljava/lang/Class;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᛲᲈᛱ:Z

    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᛵᲇᲀ:Lyyds/ᛳᲇᛶᲀ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lyyds/ᛳᲇᛶᲀ;->cancel()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᲈᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᛵᲇᲀ:Lyyds/ᛳᲇᛶᲀ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛳᲇᛶᲀ;
    .locals 12

    .line 1
    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v2, p0, Lyyds/ᛷᲇᲈᲇ;->ᲇᲇᲇᛱ:Landroid/net/Uri;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    iget-object v8, p0, Lyyds/ᛷᲇᲈᲇ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

    .line 9
    .line 10
    iget v9, p0, Lyyds/ᛷᲇᲈᲇ;->ᛱᲈᲁ:I

    .line 11
    .line 12
    iget v10, p0, Lyyds/ᛷᲇᲈᲇ;->ᛶᛷᛲᲁ:I

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    const-string v0, "Failed to media store entry for: "

    .line 17
    .line 18
    const-string v11, "File path was empty in media store for: "

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p0, Lyyds/ᛷᲇᲈᲇ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v3, Lyyds/ᛷᲇᲈᲇ;->ᛲᛲᲈᲈ:[Ljava/lang/String;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 32
    .line 33
    .line 34
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-string v0, "_data"

    .line 44
    .line 45
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    new-instance v2, Ljava/io/File;

    .line 60
    .line 61
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛷᛷ;

    .line 68
    .line 69
    invoke-interface {p0, v2, v10, v9, v8}, Lyyds/ᛴᛷᛷ;->ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    move-object v7, v1

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    :try_start_2
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-direct {p0, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_1
    new-instance p0, Ljava/io/FileNotFoundException;

    .line 97
    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {p0, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move-object p0, v0

    .line 116
    :goto_0
    if-eqz v7, :cond_2

    .line 117
    .line 118
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 119
    .line 120
    .line 121
    :cond_2
    throw p0

    .line 122
    :cond_3
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛷᛷ;

    .line 123
    .line 124
    invoke-interface {p0, v2, v10, v9, v8}, Lyyds/ᛴᛷᛷ;->ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_1
    if-eqz p0, :cond_4

    .line 129
    .line 130
    iget-object p0, p0, Lyyds/ᛵᲁᛴᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛳᲇᛶᲀ;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_4
    return-object v7
.end method

.method public final ᲇᲇᲇᛱ()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᛲᲀᲈ;Lyyds/ᛲᛳᛴ;)V
    .locals 2

    .line 1
    const-string v0, "Failed to build fetcher for: "

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛷᲇᲈᲇ;->ᲀᛲᛳᲀ()Lyyds/ᛳᲇᛶᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛷᲇᲈᲇ;->ᲇᲇᲇᛱ:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, p1}, Lyyds/ᛲᛳᛴ;->ᲀᛲᛳᲀ(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-object v1, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᛵᲇᲀ:Lyyds/ᛳᲇᛶᲀ;

    .line 35
    .line 36
    iget-boolean v0, p0, Lyyds/ᛷᲇᲈᲇ;->ᛷᛲᲈᛱ:Z

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lyyds/ᛷᲇᲈᲇ;->cancel()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-interface {v1, p1, p2}, Lyyds/ᛳᲇᛶᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛲᛲᲀᲈ;Lyyds/ᛲᛳᛴ;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_0
    invoke-interface {p2, p0}, Lyyds/ᛲᛳᛴ;->ᲀᛲᛳᲀ(Ljava/lang/Exception;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
