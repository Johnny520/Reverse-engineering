.class public Lyyds/ᛴᛲᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛶᛶᛲᲇ;
.implements Lyyds/ᛷᛲᲇᛵ;
.implements Lyyds/ᲈᛱᛸᛴ;
.implements Lyyds/ᲈᲁᛸᲀ;
.implements Lyyds/ᛷᲈᛶᛷ;
.implements Lyyds/ᛴᛲᛱᛶ;
.implements Lyyds/ᛲᲈᲈᲈ;
.implements Lyyds/ᛱᛵᲇᲈ;
.implements Lyyds/ᲀᛸᛶᛲ;
.implements Lyyds/ᛶᲇᲀᲀ;


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

.field public static final ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

.field public static final ᛶᛷᛲᲁ:Lyyds/ᛴᛲᛷᛸ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛴᛲᛷᛸ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛴᛲᛷᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛲᛷᛸ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛴᛲᛷᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 16
    .line 17
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lyyds/ᛴᛲᛷᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

    .line 24
    .line 25
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lyyds/ᛴᛲᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 32
    .line 33
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lyyds/ᛴᛲᛷᛸ;->ᛱᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 14
    iput p1, p0, Lyyds/ᛴᛲᛷᛸ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᲇᲀᛲ;)V
    .locals 0

    .line 1
    const/16 p1, 0x10

    .line 2
    .line 3
    iput p1, p0, Lyyds/ᛴᛲᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static ᛵᛶᛲᲀ(J)Ljava/lang/String;
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-wide p0, -0xcc90e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-wide v0, -0xcc94e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-wide v1, -0xcc96e68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-wide v2, -0xcc99e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-wide v3, -0xcc9ce68a836eL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-wide v4, -0xcc9fe68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    long-to-double v1, p0

    .line 67
    const/4 v3, 0x0

    .line 68
    :goto_0
    const-wide/high16 v4, 0x4090000000000000L    # 1024.0

    .line 69
    .line 70
    cmpl-double v6, v1, v4

    .line 71
    .line 72
    if-ltz v6, :cond_1

    .line 73
    .line 74
    const/4 v6, 0x4

    .line 75
    if-ge v3, v6, :cond_1

    .line 76
    .line 77
    div-double/2addr v1, v4

    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    if-nez v3, :cond_2

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-wide p0, -0xcca2e68a836eL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-wide v4, -0xcca5e68a836eL

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    aget-object v0, v0, v3

    .line 126
    .line 127
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/4 v1, 0x2

    .line 132
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {p0, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-wide v0, -0xccade68a836eL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    return-object p0
.end method

.method public static ᲀᛲᛲᲇ(Ljava/lang/String;)Lyyds/ᛵᲈᲀᛳ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛵᲈᲀᛳ;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lyyds/ᛵᲈᲀᛳ;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lyyds/ᛵᲈᲀᛳ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public onScrollLimit(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public onScrollProgress(IIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛴᛲᛷᛸ;->ᲀᛲᛳᲀ:I

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
    const-string p0, "{}"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ᛱᛳᲇ(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᛱᲈᲁ(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public ᛲᛲᲈᲈ(Lyyds/ᛳᛷᲀᛴ;)Lyyds/ᛴᛷᛷ;
    .locals 3

    .line 1
    iget p0, p0, Lyyds/ᛴᛲᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-class v1, Ljava/io/InputStream;

    .line 5
    .line 6
    sparse-switch p0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p0, Lyyds/ᲇᛱᛶᛶ;

    .line 10
    .line 11
    const-class v0, Lyyds/ᛳᲁᲈᛵ;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Lyyds/ᲇᛱᛶᛶ;-><init>(Lyyds/ᛴᛷᛷ;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_0
    new-instance p0, Lyyds/ᲈᛱᛸᲀ;

    .line 22
    .line 23
    const-class v2, Landroid/net/Uri;

    .line 24
    .line 25
    invoke-virtual {p1, v2, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛲᲈᛱ(Ljava/lang/Class;Ljava/lang/Class;)Lyyds/ᛴᛷᛷ;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1, v0}, Lyyds/ᲈᛱᛸᲀ;-><init>(Lyyds/ᛴᛷᛷ;I)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_1
    new-instance p0, Lyyds/ᛲᲁᛴᛳ;

    .line 34
    .line 35
    new-instance p1, Lyyds/ᛲᲁᲈ;

    .line 36
    .line 37
    const/16 v1, 0x9

    .line 38
    .line 39
    invoke-direct {p1, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, p1}, Lyyds/ᛲᲁᛴᛳ;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public ᛲᛳᛶᲁ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛲᛴᛳᛲ([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛳᛸᛴᛶ(Landroid/content/Context;Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/app/Dialog;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget v5, v0, Lyyds/ᛴᛲᛷᛸ;->ᲀᛲᛳᲀ:I

    .line 12
    .line 13
    sget-object v6, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/high16 v8, -0x80000000

    .line 17
    .line 18
    sget-object v9, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 19
    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v5, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    instance-of v5, v4, Lyyds/ᛱᛸᛳᲁ;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    move-object v5, v4

    .line 30
    check-cast v5, Lyyds/ᛱᛸᛳᲁ;

    .line 31
    .line 32
    iget v12, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 33
    .line 34
    and-int v13, v12, v8

    .line 35
    .line 36
    if-eqz v13, :cond_0

    .line 37
    .line 38
    sub-int/2addr v12, v8

    .line 39
    iput v12, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v5, Lyyds/ᛱᛸᛳᲁ;

    .line 43
    .line 44
    invoke-direct {v5, v0, v4}, Lyyds/ᛱᛸᛳᲁ;-><init>(Lyyds/ᛴᛲᛷᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v0, v5, Lyyds/ᛱᛸᛳᲁ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 48
    .line 49
    iget v4, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 50
    .line 51
    const/4 v8, 0x3

    .line 52
    if-eqz v4, :cond_5

    .line 53
    .line 54
    if-eq v4, v7, :cond_4

    .line 55
    .line 56
    if-eq v4, v10, :cond_1

    .line 57
    .line 58
    if-ne v4, v8, :cond_3

    .line 59
    .line 60
    :cond_1
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    move-object v6, v9

    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_3
    const-wide v0, -0x84d2e68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object v6, v11

    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_4
    iget-object v1, v5, Lyyds/ᛱᛸᛳᲁ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 82
    .line 83
    iget-object v2, v5, Lyyds/ᛱᛸᛳᲁ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v19, v2

    .line 89
    .line 90
    move-object v2, v1

    .line 91
    move-object/from16 v1, v19

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 103
    .line 104
    .line 105
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 106
    .line 107
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 108
    .line 109
    new-instance v4, Lyyds/ᲇᛴᛴᲇ;

    .line 110
    .line 111
    invoke-direct {v4, v3, v11, v8}, Lyyds/ᲇᛴᛴᲇ;-><init>(Landroid/app/Dialog;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v5, Lyyds/ᛱᛸᛳᲁ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 115
    .line 116
    iput-object v2, v5, Lyyds/ᛱᛸᛳᲁ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 117
    .line 118
    iput v7, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 119
    .line 120
    invoke-static {v0, v4, v5}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-ne v0, v6, :cond_6

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_6
    :goto_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const-wide v12, -0x84a0e68a836eL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    instance-of v3, v2, Ljava/util/List;

    .line 158
    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    check-cast v2, Ljava/util/List;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    move-object v2, v11

    .line 165
    :goto_2
    if-eqz v2, :cond_b

    .line 166
    .line 167
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    :catch_0
    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_b

    .line 176
    .line 177
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 181
    if-eqz v3, :cond_8

    .line 182
    .line 183
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-wide v12, -0x84b3e68a836eL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    invoke-virtual {v4, v12}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    const-wide v13, -0x84bbe68a836eL

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v13, v14}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    instance-of v13, v4, Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v13, :cond_9

    .line 230
    .line 231
    check-cast v4, Ljava/lang/String;

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_9
    move-object v4, v11

    .line 235
    :goto_4
    invoke-virtual {v12, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    instance-of v12, v3, Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v12, :cond_a

    .line 242
    .line 243
    check-cast v3, Ljava/lang/String;

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    move-object v3, v11

    .line 247
    :goto_5
    if-eqz v4, :cond_8

    .line 248
    .line 249
    if-eqz v3, :cond_8

    .line 250
    .line 251
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :catch_1
    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_c

    .line 277
    .line 278
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    check-cast v3, Ljava/util/Map$Entry;

    .line 283
    .line 284
    new-instance v4, Lyyds/ᛶᛱᲇᛶ;

    .line 285
    .line 286
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    check-cast v7, Ljava/lang/String;

    .line 291
    .line 292
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    check-cast v3, Ljava/lang/String;

    .line 297
    .line 298
    invoke-direct {v4, v7, v3}, Lyyds/ᛶᛱᲇᛶ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_c
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 306
    .line 307
    new-instance v3, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-wide v12, -0x84c4e68a836eL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    invoke-static {v12, v13}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-virtual {v0, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_d

    .line 336
    .line 337
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 338
    .line 339
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 340
    .line 341
    new-instance v1, Lyyds/ᛱᲈᲈᲀ;

    .line 342
    .line 343
    invoke-direct {v1, v10, v11, v8}, Lyyds/ᛱᲈᲈᲀ;-><init>(ILyyds/ᛲᛱᛶᛸ;I)V

    .line 344
    .line 345
    .line 346
    iput-object v11, v5, Lyyds/ᛱᛸᛳᲁ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 347
    .line 348
    iput-object v11, v5, Lyyds/ᛱᛸᛳᲁ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 349
    .line 350
    iput v10, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 351
    .line 352
    invoke-static {v0, v1, v5}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-ne v0, v6, :cond_2

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_d
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 360
    .line 361
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 362
    .line 363
    new-instance v3, Lyyds/ᲇᲈᲈᛶ;

    .line 364
    .line 365
    invoke-direct {v3, v1, v2, v11, v8}, Lyyds/ᲇᲈᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 366
    .line 367
    .line 368
    iput-object v11, v5, Lyyds/ᛱᛸᛳᲁ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 369
    .line 370
    iput-object v11, v5, Lyyds/ᛱᛸᛳᲁ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 371
    .line 372
    iput v8, v5, Lyyds/ᛱᛸᛳᲁ;->ᛷᲈᲈᲁ:I

    .line 373
    .line 374
    invoke-static {v0, v3, v5}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    if-ne v0, v6, :cond_2

    .line 379
    .line 380
    :goto_7
    return-object v6

    .line 381
    :pswitch_0
    instance-of v5, v4, Lyyds/ᛱᲇᲁᛶ;

    .line 382
    .line 383
    if-eqz v5, :cond_e

    .line 384
    .line 385
    move-object v5, v4

    .line 386
    check-cast v5, Lyyds/ᛱᲇᲁᛶ;

    .line 387
    .line 388
    iget v12, v5, Lyyds/ᛱᲇᲁᛶ;->ᛷᲈᲈᲁ:I

    .line 389
    .line 390
    and-int v13, v12, v8

    .line 391
    .line 392
    if-eqz v13, :cond_e

    .line 393
    .line 394
    sub-int/2addr v12, v8

    .line 395
    iput v12, v5, Lyyds/ᛱᲇᲁᛶ;->ᛷᲈᲈᲁ:I

    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_e
    new-instance v5, Lyyds/ᛱᲇᲁᛶ;

    .line 399
    .line 400
    invoke-direct {v5, v0, v4}, Lyyds/ᛱᲇᲁᛶ;-><init>(Lyyds/ᛴᛲᛷᛸ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 401
    .line 402
    .line 403
    :goto_8
    iget-object v0, v5, Lyyds/ᛱᲇᲁᛶ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 404
    .line 405
    iget v4, v5, Lyyds/ᛱᲇᲁᛶ;->ᛷᲈᲈᲁ:I

    .line 406
    .line 407
    if-eqz v4, :cond_11

    .line 408
    .line 409
    if-eq v4, v7, :cond_10

    .line 410
    .line 411
    if-ne v4, v10, :cond_f

    .line 412
    .line 413
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_a

    .line 417
    .line 418
    :cond_f
    const-wide v0, -0xaf87e68a836eL

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    move-object v6, v11

    .line 431
    goto :goto_b

    .line 432
    :cond_10
    iget-object v1, v5, Lyyds/ᛱᲇᲁᛶ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 433
    .line 434
    iget-object v2, v5, Lyyds/ᛱᲇᲁᛶ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 435
    .line 436
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    move-object v15, v1

    .line 440
    move-object v13, v2

    .line 441
    goto :goto_9

    .line 442
    :cond_11
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 446
    .line 447
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 448
    .line 449
    new-instance v4, Lyyds/ᲇᛴᛴᲇ;

    .line 450
    .line 451
    invoke-direct {v4, v3, v11, v10}, Lyyds/ᲇᛴᛴᲇ;-><init>(Landroid/app/Dialog;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 452
    .line 453
    .line 454
    iput-object v1, v5, Lyyds/ᛱᲇᲁᛶ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 455
    .line 456
    iput-object v2, v5, Lyyds/ᛱᲇᲁᛶ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 457
    .line 458
    iput v7, v5, Lyyds/ᛱᲇᲁᛶ;->ᛷᲈᲈᲁ:I

    .line 459
    .line 460
    invoke-static {v0, v4, v5}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-ne v0, v6, :cond_12

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :cond_12
    move-object v13, v1

    .line 468
    move-object v15, v2

    .line 469
    :goto_9
    new-instance v0, Landroid/widget/LinearLayout;

    .line 470
    .line 471
    invoke-direct {v0, v13}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    const/high16 v2, 0x41800000    # 16.0f

    .line 486
    .line 487
    invoke-static {v7, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    float-to-int v1, v1

    .line 492
    const/4 v2, 0x0

    .line 493
    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 494
    .line 495
    .line 496
    new-instance v14, Landroid/widget/ScrollView;

    .line 497
    .line 498
    invoke-direct {v14, v13}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v14, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 502
    .line 503
    .line 504
    sget-object v1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 505
    .line 506
    sget-object v1, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 507
    .line 508
    new-instance v12, Lyyds/ᛵᛱᛱᛵ;

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const/16 v18, 0x1

    .line 513
    .line 514
    move-object/from16 v16, v0

    .line 515
    .line 516
    invoke-direct/range {v12 .. v18}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 517
    .line 518
    .line 519
    iput-object v11, v5, Lyyds/ᛱᲇᲁᛶ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 520
    .line 521
    iput-object v11, v5, Lyyds/ᛱᲇᲁᛶ;->ᛶᛷᛲᲁ:Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 522
    .line 523
    iput v10, v5, Lyyds/ᛱᲇᲁᛶ;->ᛷᲈᲈᲁ:I

    .line 524
    .line 525
    invoke-static {v1, v12, v5}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    if-ne v0, v6, :cond_13

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_13
    :goto_a
    move-object v6, v9

    .line 533
    :goto_b
    return-object v6

    .line 534
    nop

    .line 535
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ᛳᲁᲁᲇ(Landroid/media/MediaExtractor;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Landroid/media/MediaExtractor;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᛵᛸᛸᛷ(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, "com.google.android.gms.org.conscrypt."

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public declared-synchronized ᛶᛳᛶᛵ(Ljava/lang/String;)Lyyds/ᛵᲈᲀᛳ;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lyyds/ᛵᲈᲀᛳ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lyyds/ᛵᲈᲀᛳ;

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    const-string v1, "SSL_"

    .line 13
    .line 14
    const-string v2, "TLS_"

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x4

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, p1

    .line 48
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lyyds/ᛵᲈᲀᛳ;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    new-instance v1, Lyyds/ᛵᲈᲀᛳ;

    .line 57
    .line 58
    invoke-direct {v1, p1}, Lyyds/ᛵᲈᲀᛳ;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_3
    monitor-exit p0

    .line 68
    return-object v1

    .line 69
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
.end method

.method public ᛶᛷᛲᲁ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public ᛷᛲᲈᛱ(Ljava/io/File;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/high16 p0, 0x10000000

    .line 2
    .line 3
    invoke-static {p1, p0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public ᛷᛵᲇᲀ()V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛷᲈᲈᲁ(Ljava/lang/String;)Z
    .locals 9

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eq v2, p1, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v2}, Lyyds/ᲀᛳᛳᛱ;->ᛷᲈᲈᲁ(C)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_1b

    .line 29
    .line 30
    invoke-static {v2}, Lyyds/ᲀᛳᛳᛱ;->ᛷᛲᲈᛱ(C)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_3
    move v2, v1

    .line 39
    :goto_0
    if-ge v2, v0, :cond_7

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/16 v4, 0x7d

    .line 46
    .line 47
    if-eq v3, v4, :cond_6

    .line 48
    .line 49
    const/16 v4, 0x5d

    .line 50
    .line 51
    if-eq v3, v4, :cond_6

    .line 52
    .line 53
    const/16 v4, 0x2c

    .line 54
    .line 55
    if-eq v3, v4, :cond_6

    .line 56
    .line 57
    const/16 v4, 0x3a

    .line 58
    .line 59
    if-ne v3, v4, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-static {v3}, Lyyds/ᲀᛳᛳᛱ;->ᛷᛲᲈᛱ(C)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    :goto_1
    return v1

    .line 73
    :cond_7
    invoke-static {p1}, Lyyds/ᲀᛳᛳᛱ;->ᛱᲈᲁ(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    return v1

    .line 80
    :cond_8
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/16 v3, 0x2d

    .line 85
    .line 86
    const/16 v4, 0x39

    .line 87
    .line 88
    const/16 v5, 0x30

    .line 89
    .line 90
    if-lt v2, v5, :cond_9

    .line 91
    .line 92
    if-le v2, v4, :cond_a

    .line 93
    .line 94
    :cond_9
    if-ne v2, v3, :cond_1a

    .line 95
    .line 96
    :cond_a
    move v6, v1

    .line 97
    :goto_2
    if-ge v6, v0, :cond_c

    .line 98
    .line 99
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-lt v2, v5, :cond_c

    .line 104
    .line 105
    if-le v2, v4, :cond_b

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_b
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_c
    :goto_3
    if-ne v6, v0, :cond_d

    .line 112
    .line 113
    return v1

    .line 114
    :cond_d
    const/16 v7, 0x2e

    .line 115
    .line 116
    if-ne v2, v7, :cond_f

    .line 117
    .line 118
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    :cond_f
    if-ge v6, v0, :cond_10

    .line 121
    .line 122
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-lt v2, v5, :cond_10

    .line 127
    .line 128
    if-le v2, v4, :cond_e

    .line 129
    .line 130
    :cond_10
    if-ne v6, v0, :cond_11

    .line 131
    .line 132
    return v1

    .line 133
    :cond_11
    const/16 v7, 0x45

    .line 134
    .line 135
    if-eq v2, v7, :cond_12

    .line 136
    .line 137
    const/16 v7, 0x65

    .line 138
    .line 139
    if-ne v2, v7, :cond_16

    .line 140
    .line 141
    :cond_12
    add-int/lit8 v2, v6, 0x1

    .line 142
    .line 143
    if-ne v2, v0, :cond_13

    .line 144
    .line 145
    return p0

    .line 146
    :cond_13
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    const/16 v8, 0x2b

    .line 151
    .line 152
    if-eq v7, v8, :cond_15

    .line 153
    .line 154
    if-ne v7, v3, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    move v6, v2

    .line 158
    goto :goto_5

    .line 159
    :cond_15
    :goto_4
    add-int/lit8 v6, v6, 0x2

    .line 160
    .line 161
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 162
    .line 163
    .line 164
    :cond_16
    :goto_5
    if-ne v6, v0, :cond_17

    .line 165
    .line 166
    return p0

    .line 167
    :cond_17
    :goto_6
    if-ge v6, v0, :cond_19

    .line 168
    .line 169
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-lt v2, v5, :cond_19

    .line 174
    .line 175
    if-le v2, v4, :cond_18

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_18
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_19
    :goto_7
    if-ne v6, v0, :cond_1a

    .line 182
    .line 183
    return v1

    .line 184
    :cond_1a
    return p0

    .line 185
    :cond_1b
    :goto_8
    return v1
.end method

.method public ᲀᛲᛳᲀ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲇᛱᛲ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ᲇᲇᲇᛱ(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public ᲇᲈᛵᛷ(Ljavax/net/ssl/SSLSocket;)Lyyds/ᛴᛶᲀᲀ;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object p1, p0

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "OpenSSLSocketImpl"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "No OpenSSLSocketImpl superclass of socket of type "

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p0, Lyyds/ᛳᲀᲇᛸ;

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lyyds/ᛳᲀᲇᛸ;-><init>(Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    return-object p0
.end method
