.class public final Lcw1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lv41;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public final η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcw1;->ε:I

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
    new-instance p1, Lzz1;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v0, v1}, Lzz1;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Lkw0;

    .line 19
    .line 20
    const/16 v0, 0x10

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lkw0;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcw1;->η:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lk21;

    .line 32
    .line 33
    const/16 v0, 0x10

    .line 34
    .line 35
    new-array v0, v0, [Ljava/lang/ref/Reference;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcw1;->η:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lcw1;->ε:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation$Bounds;->getLowerBound()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    move-result-object v0

    .line 60
    iput-object v0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 61
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation$Bounds;->getUpperBound()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lnm0;->γ(Landroid/graphics/Insets;)Lnm0;

    move-result-object p1

    .line 62
    iput-object p1, p0, Lcw1;->η:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcw1;->ε:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw1;->η:Ljava/lang/Object;

    .line 64
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcw1;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 57
    iput p2, p0, Lcw1;->ε:I

    iput-object p1, p0, Lcw1;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lcw1;->η:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lyl1;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcw1;->ε:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 53
    new-instance p1, Lo82;

    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 55
    iput v0, p1, Lo82;->α:I

    .line 56
    iput-object p1, p0, Lcw1;->η:Ljava/lang/Object;

    return-void
.end method

.method public static δ(Landroid/content/Context;Landroid/net/Uri;)Lcw1;
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {p1, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance p1, Lcw1;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {p1, p0, v1, v0}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "Failed to build documentUri from a tree: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    const-string p0, "Could not get document ID from Uri: "

    .line 51
    .line 52
    invoke-static {p1, p0}, Lγ;->μ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcw1;->ε:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Bounds{lower="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lnm0;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lnm0;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "}"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public α()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/net/Uri;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string v2, "mime_type"

    .line 19
    .line 20
    invoke-static {v0, p0, v2}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v4, "flags"

    .line 25
    .line 26
    int-to-long v5, v3

    .line 27
    invoke-static {v0, p0, v4, v5, v6}, Lbd;->Μ(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    long-to-int p0, v4

    .line 32
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    and-int/lit8 v0, p0, 0x4

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const-string v0, "vnd.android.document/directory"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    and-int/lit8 v0, p0, 0x8

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    and-int/2addr p0, v1

    .line 64
    if-eqz p0, :cond_4

    .line 65
    .line 66
    :goto_0
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_4
    :goto_1
    return v3
.end method

.method public β(Ljava/lang/String;)Lcw1;
    .locals 11

    .line 1
    iget-object v0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-object p0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/net/Uri;

    .line 13
    .line 14
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, v0}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v8, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    :try_start_0
    const-string v0, "document_id"

    .line 30
    .line 31
    filled-new-array {v0}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 39
    .line 40
    .line 41
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    :goto_0
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {p0, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    move-object v10, v2

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :catch_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    :try_start_2
    invoke-static {v2}, Llz1;->χ(Landroid/database/Cursor;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catch_1
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    throw p0

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    goto :goto_5

    .line 78
    :catch_2
    move-exception v0

    .line 79
    move-object p0, v0

    .line 80
    move-object v2, v10

    .line 81
    :goto_1
    :try_start_3
    const-string v0, "DocumentFile"

    .line 82
    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v4, "Failed query: "

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    :try_start_4
    invoke-static {v2}, Llz1;->χ(Landroid/database/Cursor;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catch_3
    move-exception v0

    .line 110
    move-object p0, v0

    .line 111
    throw p0

    .line 112
    :catch_4
    :cond_1
    :goto_2
    new-array p0, v9, [Landroid/net/Uri;

    .line 113
    .line 114
    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, [Landroid/net/Uri;

    .line 119
    .line 120
    array-length v0, p0

    .line 121
    new-array v2, v0, [Lcw1;

    .line 122
    .line 123
    move v3, v9

    .line 124
    :goto_3
    array-length v4, p0

    .line 125
    if-ge v3, v4, :cond_2

    .line 126
    .line 127
    new-instance v4, Lcw1;

    .line 128
    .line 129
    aget-object v5, p0, v3

    .line 130
    .line 131
    const/4 v6, 0x1

    .line 132
    invoke-direct {v4, v1, v6, v5}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    aput-object v4, v2, v3

    .line 136
    .line 137
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    :goto_4
    if-ge v9, v0, :cond_4

    .line 141
    .line 142
    aget-object p0, v2, v9

    .line 143
    .line 144
    iget-object v1, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Landroid/content/Context;

    .line 147
    .line 148
    iget-object v3, p0, Lcw1;->η:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v3, Landroid/net/Uri;

    .line 151
    .line 152
    const-string v4, "_display_name"

    .line 153
    .line 154
    invoke-static {v1, v3, v4}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_3

    .line 163
    .line 164
    return-object p0

    .line 165
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_4
    return-object v10

    .line 169
    :goto_5
    if-eqz v10, :cond_5

    .line 170
    .line 171
    :try_start_5
    invoke-static {v10}, Llz1;->χ(Landroid/database/Cursor;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :catch_5
    move-exception v0

    .line 176
    move-object p0, v0

    .line 177
    throw p0

    .line 178
    :catch_6
    :cond_5
    :goto_6
    throw p0
.end method

.method public γ(IIII)Landroid/view/View;
    .locals 10

    .line 1
    iget-object v0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo82;

    .line 4
    .line 5
    iget-object p0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyl1;

    .line 8
    .line 9
    iget v1, p0, Lyl1;->α:I

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lyl1;->β:Lzl1;

    .line 15
    .line 16
    invoke-virtual {v1}, Lzl1;->ψ()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :pswitch_0
    iget-object v1, p0, Lyl1;->β:Lzl1;

    .line 22
    .line 23
    invoke-virtual {v1}, Lzl1;->φ()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    iget v2, p0, Lyl1;->α:I

    .line 28
    .line 29
    packed-switch v2, :pswitch_data_1

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lyl1;->β:Lzl1;

    .line 33
    .line 34
    iget v3, v2, Lzl1;->κ:I

    .line 35
    .line 36
    invoke-virtual {v2}, Lzl1;->υ()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :goto_1
    sub-int/2addr v3, v2

    .line 41
    goto :goto_2

    .line 42
    :pswitch_1
    iget-object v2, p0, Lyl1;->β:Lzl1;

    .line 43
    .line 44
    iget v3, v2, Lzl1;->ι:I

    .line 45
    .line 46
    invoke-virtual {v2}, Lzl1;->χ()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    goto :goto_1

    .line 51
    :goto_2
    if-le p2, p1, :cond_0

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    goto :goto_3

    .line 55
    :cond_0
    const/4 v2, -0x1

    .line 56
    :goto_3
    const/4 v4, 0x0

    .line 57
    :goto_4
    if-eq p1, p2, :cond_3

    .line 58
    .line 59
    iget v5, p0, Lyl1;->α:I

    .line 60
    .line 61
    packed-switch v5, :pswitch_data_2

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lyl1;->β:Lzl1;

    .line 65
    .line 66
    invoke-virtual {v5, p1}, Lzl1;->ρ(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    goto :goto_5

    .line 71
    :pswitch_2
    iget-object v5, p0, Lyl1;->β:Lzl1;

    .line 72
    .line 73
    invoke-virtual {v5, p1}, Lzl1;->ρ(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :goto_5
    iget v6, p0, Lyl1;->α:I

    .line 78
    .line 79
    packed-switch v6, :pswitch_data_3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Lam1;

    .line 87
    .line 88
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Lam1;

    .line 97
    .line 98
    iget-object v8, v8, Lam1;->α:Landroid/graphics/Rect;

    .line 99
    .line 100
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 101
    .line 102
    sub-int/2addr v7, v8

    .line 103
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 104
    .line 105
    :goto_6
    sub-int/2addr v7, v6

    .line 106
    goto :goto_7

    .line 107
    :pswitch_3
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    check-cast v6, Lam1;

    .line 112
    .line 113
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lam1;

    .line 122
    .line 123
    iget-object v8, v8, Lam1;->α:Landroid/graphics/Rect;

    .line 124
    .line 125
    iget v8, v8, Landroid/graphics/Rect;->left:I

    .line 126
    .line 127
    sub-int/2addr v7, v8

    .line 128
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :goto_7
    iget v6, p0, Lyl1;->α:I

    .line 132
    .line 133
    packed-switch v6, :pswitch_data_4

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Lam1;

    .line 141
    .line 142
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Lam1;

    .line 151
    .line 152
    iget-object v9, v9, Lam1;->α:Landroid/graphics/Rect;

    .line 153
    .line 154
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 155
    .line 156
    add-int/2addr v8, v9

    .line 157
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 158
    .line 159
    :goto_8
    add-int/2addr v8, v6

    .line 160
    goto :goto_9

    .line 161
    :pswitch_4
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, Lam1;

    .line 166
    .line 167
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    check-cast v9, Lam1;

    .line 176
    .line 177
    iget-object v9, v9, Lam1;->α:Landroid/graphics/Rect;

    .line 178
    .line 179
    iget v9, v9, Landroid/graphics/Rect;->right:I

    .line 180
    .line 181
    add-int/2addr v8, v9

    .line 182
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :goto_9
    iput v1, v0, Lo82;->β:I

    .line 186
    .line 187
    iput v3, v0, Lo82;->γ:I

    .line 188
    .line 189
    iput v7, v0, Lo82;->δ:I

    .line 190
    .line 191
    iput v8, v0, Lo82;->ε:I

    .line 192
    .line 193
    if-eqz p3, :cond_1

    .line 194
    .line 195
    iput p3, v0, Lo82;->α:I

    .line 196
    .line 197
    invoke-virtual {v0}, Lo82;->α()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_1

    .line 202
    .line 203
    return-object v5

    .line 204
    :cond_1
    if-eqz p4, :cond_2

    .line 205
    .line 206
    iput p4, v0, Lo82;->α:I

    .line 207
    .line 208
    invoke-virtual {v0}, Lo82;->α()Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_2

    .line 213
    .line 214
    move-object v4, v5

    .line 215
    :cond_2
    add-int/2addr p1, v2

    .line 216
    goto/16 :goto_4

    .line 217
    .line 218
    :cond_3
    return-object v4

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method

.method public ε()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object p0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/net/Uri;

    .line 8
    .line 9
    const-string v1, "mime_type"

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "vnd.android.document/directory"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public η(Landroid/view/View;Loc2;)Loc2;
    .locals 5

    .line 1
    iget-object v0, p0, Lcw1;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lb92;->δ(Landroid/view/View;Loc2;)Loc2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p1, Loc2;->α:Llc2;

    .line 10
    .line 11
    invoke-virtual {p2}, Llc2;->ο()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p0, p0, Lcw1;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-virtual {p1}, Loc2;->β()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Landroid/graphics/Rect;->left:I

    .line 27
    .line 28
    invoke-virtual {p1}, Loc2;->δ()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iput p2, p0, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    invoke-virtual {p1}, Loc2;->γ()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    invoke-virtual {p1}, Loc2;->α()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_0
    if-ge v1, p2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2, p1}, Lb92;->β(Landroid/view/View;Loc2;)Loc2;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Loc2;->β()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget v4, p0, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iput v3, p0, Landroid/graphics/Rect;->left:I

    .line 72
    .line 73
    invoke-virtual {v2}, Loc2;->δ()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    iget v4, p0, Landroid/graphics/Rect;->top:I

    .line 78
    .line 79
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    iput v3, p0, Landroid/graphics/Rect;->top:I

    .line 84
    .line 85
    invoke-virtual {v2}, Loc2;->γ()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    iget v4, p0, Landroid/graphics/Rect;->right:I

    .line 90
    .line 91
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iput v3, p0, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    invoke-virtual {v2}, Loc2;->α()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iget v3, p0, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    iput v2, p0, Landroid/graphics/Rect;->bottom:I

    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 113
    .line 114
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 115
    .line 116
    iget v1, p0, Landroid/graphics/Rect;->right:I

    .line 117
    .line 118
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 119
    .line 120
    invoke-virtual {p1, p2, v0, v1, p0}, Loc2;->ζ(IIII)Loc2;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method
