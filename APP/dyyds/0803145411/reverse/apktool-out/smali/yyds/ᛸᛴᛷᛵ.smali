.class public final Lyyds/ᛸᛴᛷᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(CI)V
    .locals 0

    .line 40
    iput p2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    iput p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    packed-switch p1, :pswitch_data_0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 42
    iput p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 43
    iput-object p2, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void

    .line 44
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p2, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 35
    invoke-static {p1, v0}, Lyyds/ᛱᲀᛱᲁ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)I

    move-result v0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v1, Lyyds/ᛲᲈᲀᛵ;

    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 38
    invoke-static {p1, v0}, Lyyds/ᛱᲀᛱᲁ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)I

    move-result v3

    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v2}, Lyyds/ᛲᲈᲀᛵ;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 39
    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    return-void
.end method

.method public constructor <init>(Lyyds/ᛷᛲᛴᛸ;I)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 31
    iput-object p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 32
    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput p2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    return-void
.end method

.method public constructor <init>(Lyyds/ᛷᲁᲀᲁ;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 47
    iput p2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    return-void
.end method

.method public static ᲇᲈᛵᛷ(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, ":memory:"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-gt v3, v0, :cond_5

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    move v5, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v5, v0

    .line 25
    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    invoke-static {v5, v6}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-gtz v5, :cond_1

    .line 36
    .line 37
    move v5, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v5, v2

    .line 40
    :goto_2
    if-nez v4, :cond_3

    .line 41
    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    move v4, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    if-nez v5, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    :goto_3
    add-int/2addr v0, v1

    .line 56
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const-string v0, "deleting the database file: "

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "SupportSQLite"

    .line 78
    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catch_0
    move-exception p0

    .line 92
    const-string v0, "delete failed: "

    .line 93
    .line 94
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [C

    .line 16
    .line 17
    iget p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public ᛲᛴᛳᛲ(ILyyds/ᛲᛳᛶᲈ;)V
    .locals 7

    .line 1
    :goto_0
    shr-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Lyyds/ᛲᛳᛶᲈ;

    .line 8
    .line 9
    aget-object v2, v1, v0

    .line 10
    .line 11
    iget-wide v3, v2, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 12
    .line 13
    iget-wide v5, p2, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 14
    .line 15
    sub-long/2addr v5, v3

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    cmp-long v3, v3, v5

    .line 19
    .line 20
    if-gez v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    if-nez v3, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iput p1, v2, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 27
    .line 28
    aput-object v2, v1, p1

    .line 29
    .line 30
    move p1, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_1
    iget-object p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, [Lyyds/ᛲᛳᛶᲈ;

    .line 35
    .line 36
    aput-object p2, p0, p1

    .line 37
    .line 38
    iput p1, p2, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 39
    .line 40
    return-void
.end method

.method public ᛲᲈᲁ(Lyyds/ᛳᛷᲀᛴ;)V
    .locals 4

    .line 1
    :goto_0
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    move v1, v0

    .line 5
    :goto_1
    iget v2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Lyyds/ᛳᛷᲀᛴ;

    .line 10
    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    aget-object v2, v3, v1

    .line 14
    .line 15
    iget-object v2, v2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p1, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    array-length v1, v3

    .line 34
    if-lt v2, v1, :cond_2

    .line 35
    .line 36
    array-length v1, v3

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    new-array v1, v1, [Lyyds/ᛳᛷᲀᛴ;

    .line 40
    .line 41
    invoke-static {v3, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v3, v1

    .line 47
    :cond_2
    iget v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 48
    .line 49
    add-int/lit8 v1, v0, 0x1

    .line 50
    .line 51
    iput v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 52
    .line 53
    aput-object p1, v3, v0

    .line 54
    .line 55
    :goto_2
    iget-object p1, p1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lyyds/ᛳᛷᲀᛴ;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-void
.end method

.method public ᛵᛸᛸᛷ(C)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    iget-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [C

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-gt v2, v0, :cond_0

    .line 13
    .line 14
    array-length v0, v1

    .line 15
    mul-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    new-array v0, v0, [C

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    :cond_0
    iget p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 30
    .line 31
    aput-char p1, v1, p0

    .line 32
    .line 33
    return-void
.end method

.method public ᛶᛷᛲᲁ(Lyyds/ᛲᛳᛶᲈ;)V
    .locals 12

    .line 1
    iget v0, p1, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_a

    .line 5
    .line 6
    iget v2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 7
    .line 8
    iget-object v3, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [Lyyds/ᛲᛳᛶᲈ;

    .line 11
    .line 12
    aget-object v4, v3, v2

    .line 13
    .line 14
    iput v1, p1, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v5, v3, v2

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    sub-int/2addr v2, v5

    .line 21
    iput v2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 22
    .line 23
    if-ne p1, v4, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-wide v6, p1, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 27
    .line 28
    iget-wide v8, v4, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 29
    .line 30
    sub-long/2addr v8, v6

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long p1, v6, v8

    .line 34
    .line 35
    if-gez p1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-nez p1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v1, v5

    .line 43
    :goto_0
    if-nez v1, :cond_3

    .line 44
    .line 45
    aput-object v4, v3, v0

    .line 46
    .line 47
    iput v0, v4, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    if-gez v1, :cond_9

    .line 51
    .line 52
    :goto_1
    shl-int/lit8 p1, v0, 0x1

    .line 53
    .line 54
    add-int/lit8 v1, p1, 0x1

    .line 55
    .line 56
    iget v2, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 57
    .line 58
    if-gt v1, v2, :cond_5

    .line 59
    .line 60
    iget-object v2, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, [Lyyds/ᛲᛳᛶᲈ;

    .line 63
    .line 64
    aget-object p1, v2, p1

    .line 65
    .line 66
    aget-object v1, v2, v1

    .line 67
    .line 68
    iget-wide v8, p1, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 69
    .line 70
    iget-wide v10, v1, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 71
    .line 72
    sub-long/2addr v10, v8

    .line 73
    cmp-long v3, v6, v10

    .line 74
    .line 75
    if-gez v3, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object p1, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    if-gt p1, v2, :cond_8

    .line 81
    .line 82
    iget-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v2, v1

    .line 85
    check-cast v2, [Lyyds/ᛲᛳᛶᲈ;

    .line 86
    .line 87
    aget-object p1, v2, p1

    .line 88
    .line 89
    :goto_2
    iget-wide v8, v4, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 90
    .line 91
    iget-wide v10, p1, Lyyds/ᛲᛳᛶᲈ;->ᛶᛷᛲᲁ:J

    .line 92
    .line 93
    sub-long/2addr v10, v8

    .line 94
    cmp-long v1, v6, v10

    .line 95
    .line 96
    if-gez v1, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    if-nez v1, :cond_7

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_7
    iget v1, p1, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 103
    .line 104
    iput v0, p1, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 105
    .line 106
    aput-object p1, v2, v0

    .line 107
    .line 108
    move v0, v1

    .line 109
    goto :goto_1

    .line 110
    :cond_8
    :goto_3
    iget-object p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, [Lyyds/ᛲᛳᛶᲈ;

    .line 113
    .line 114
    aput-object v4, p0, v0

    .line 115
    .line 116
    iput v0, v4, Lyyds/ᛲᛳᛶᲈ;->ᲇᲇᲇᛱ:I

    .line 117
    .line 118
    return-void

    .line 119
    :cond_9
    invoke-virtual {p0, v0, v4}, Lyyds/ᛸᛴᛷᛵ;->ᛲᛴᛳᛲ(ILyyds/ᛲᛳᛶᲈ;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    const-string p0, "Failed requirement."

    .line 124
    .line 125
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public ᲀᛲᛳᲀ()Lyyds/ᛱᲀᛱᲁ;
    .locals 9

    .line 1
    new-instance v0, Lyyds/ᛱᲀᛱᲁ;

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lyyds/ᛲᲈᲀᛵ;

    .line 6
    .line 7
    iget-object v2, v1, Lyyds/ᛲᲈᲀᛵ;->ᛲᲈᲁ:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 10
    .line 11
    invoke-direct {v0, v2, p0}, Lyyds/ᛱᲀᛱᲁ;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᛲᛴᛳᛲ:Landroid/view/View;

    .line 15
    .line 16
    iget-object v3, v0, Lyyds/ᛱᲀᛱᲁ;->ᛱᲈᲁ:Lyyds/ᲁᛵᛷᛸ;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iput-object p0, v3, Lyyds/ᲁᛵᛷᛸ;->ᛱᛳᲇ:Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᲇᲈᛵᛷ:Ljava/lang/CharSequence;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    iput-object p0, v3, Lyyds/ᲁᛵᛷᛸ;->ᲇᲈᛵᛷ:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v4, v3, Lyyds/ᲁᛵᛷᛸ;->ᛷᛵᲇᲀ:Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    iput-object p0, v3, Lyyds/ᲁᛵᛷᛸ;->ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-object v4, v3, Lyyds/ᲁᛵᛷᛸ;->ᛷᛲᲈᛱ:Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v3, Lyyds/ᲁᛵᛷᛸ;->ᛷᛲᲈᛱ:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᛶᛷᛲᲁ:Landroid/widget/ListAdapter;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz p0, :cond_7

    .line 60
    .line 61
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᛵᛸᛸᛷ:Landroid/view/LayoutInflater;

    .line 62
    .line 63
    iget v6, v3, Lyyds/ᲁᛵᛷᛸ;->ᛵᛶᛲᲀ:I

    .line 64
    .line 65
    invoke-virtual {p0, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 70
    .line 71
    iget-boolean v6, v1, Lyyds/ᛲᲈᲀᛵ;->ᛲᛳᛶᲁ:Z

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget v6, v3, Lyyds/ᲁᛵᛷᛸ;->ᲀᛲᛲᲇ:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget v6, v3, Lyyds/ᲁᛵᛷᛸ;->ᛳᛸᛴᛶ:I

    .line 79
    .line 80
    :goto_1
    iget-object v7, v1, Lyyds/ᛲᲈᲀᛵ;->ᛶᛷᛲᲁ:Landroid/widget/ListAdapter;

    .line 81
    .line 82
    if-eqz v7, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    new-instance v7, Lyyds/ᛲᛳᛲᛲ;

    .line 86
    .line 87
    const v8, 0x1020014

    .line 88
    .line 89
    .line 90
    invoke-direct {v7, v2, v6, v8, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    iput-object v7, v3, Lyyds/ᲁᛵᛷᛸ;->ᛳᲁᲁᲇ:Landroid/widget/ListAdapter;

    .line 94
    .line 95
    iget v2, v1, Lyyds/ᛲᲈᲀᛵ;->ᛷᲈᲈᲁ:I

    .line 96
    .line 97
    iput v2, v3, Lyyds/ᲁᛵᛷᛸ;->ᲇᛱᛲ:I

    .line 98
    .line 99
    iget-object v2, v1, Lyyds/ᛲᲈᲀᛵ;->ᛱᲈᲁ:Landroid/content/DialogInterface$OnClickListener;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    new-instance v2, Lyyds/ᲈᲁᛴᛴ;

    .line 104
    .line 105
    invoke-direct {v2, v1, v3}, Lyyds/ᲈᲁᛴᛴ;-><init>(Lyyds/ᛲᲈᲀᛵ;Lyyds/ᲁᛵᛷᛸ;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-boolean v2, v1, Lyyds/ᛲᲈᲀᛵ;->ᛲᛳᛶᲁ:Z

    .line 112
    .line 113
    if-eqz v2, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 116
    .line 117
    .line 118
    :cond_6
    iput-object p0, v3, Lyyds/ᲁᛵᛷᛸ;->ᛲᛴᛳᛲ:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 119
    .line 120
    :cond_7
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 130
    .line 131
    .line 132
    iget-object p0, v1, Lyyds/ᛲᲈᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛵᛱ;

    .line 133
    .line 134
    if-eqz p0, :cond_8

    .line 135
    .line 136
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    return-object v0
.end method

.method public ᲇᲇᲇᛱ(Lyyds/ᛳᛴᲀᛷ;II)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛷᛲᛴᛸ;

    .line 4
    .line 5
    new-instance v0, Lyyds/ᛷᛳᲇᛲ;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lyyds/ᛷᛳᲇᛲ;-><init>(Lyyds/ᛳᛴᲀᛷ;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p2, p3}, Lyyds/ᛷᛲᛴᛸ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛵᛷ;II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
