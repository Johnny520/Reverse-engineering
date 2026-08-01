.class public Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final config:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    const-wide v1, -0x36a54232051405a7L    # -2.3854147544815362E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->config:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    return-void
.end method

.method public static calculateMD5(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide v0, -0x36a506c9051405a7L    # -2.4061161725555384E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x1000

    .line 20
    .line 21
    :try_start_1
    new-array v2, v2, [B

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, -0x1

    .line 28
    const/4 v5, 0x0

    .line 29
    if-eq v3, v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2, v5, v3}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    array-length v1, p0

    .line 55
    :goto_1
    if-ge v5, v1, :cond_2

    .line 56
    .line 57
    aget-byte v2, p0, v5

    .line 58
    .line 59
    const-wide v3, -0x36a54225051405a7L    # -2.385432449164616E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_2
    move-exception v1

    .line 98
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    :goto_4
    if-eqz p0, :cond_3

    .line 103
    .line 104
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :catchall_3
    move-exception p0

    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_5
    throw v0
.end method

.method private compareFileMD5()Z
    .locals 3

    .line 1
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-wide v0, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/io/File;

    .line 19
    .line 20
    const-wide v1, -0x36a54222051405a7L    # -2.385436532553019E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance p0, Ljava/io/File;

    .line 33
    .line 34
    const-wide v1, -0x36a5422f051405a7L    # -2.3854188378699392E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_0
    sget-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const v1, 0x24110001

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->calculateMD5(Ljava/io/InputStream;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Ljava/io/FileInputStream;

    .line 72
    .line 73
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->calculateMD5(Ljava/io/InputStream;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method private initDescFile(Landroid/content/Context;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/high16 p1, 0x24110000

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p2, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/File;Ljava/io/InputStream;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private initInfoFile(Ljava/io/File;)V
    .locals 4

    .line 1
    new-instance p0, Ljava/util/Properties;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/Properties;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-wide v1, -0x36a545cc051405a7L    # -2.3841597931123317E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-wide v2, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide v1, -0x36a52843051405a7L    # -2.3944512930174886E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-wide v2, -0x36a54222051405a7L    # -2.385436532553019E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {p0, v1, v2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-wide v1, -0x36a52317051405a7L    # -2.396253428432702E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p0, v1, v0}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const-wide v0, -0x36a545ce051405a7L    # -2.3841570708533964E45

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-wide v1, -0x36a54211051405a7L    # -2.3854596717539697E45

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    const-wide v0, -0x36a545b5051405a7L    # -2.3841910990900885E45

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-wide v1, -0x36a5421e051405a7L    # -2.38544197707089E45

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p0, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const-wide v0, -0x36a545bd051405a7L    # -2.384180210054347E45

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-wide v1, -0x36a5421a051405a7L    # -2.3854474215887606E45

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {p0, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    const-wide v0, -0x36a54346051405a7L    # -2.3850390827484555E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-wide v1, -0x36a5265f051405a7L    # -2.3951100796798475E45

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {p0, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    const-wide v0, -0x36a545ba051405a7L    # -2.38418429344275E45

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-wide v1, -0x36a5420c051405a7L    # -2.385466477401308E45

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {p0, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    new-instance v0, Ljava/io/FileWriter;

    .line 175
    .line 176
    invoke-direct {v0, p1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 177
    .line 178
    .line 179
    const/4 p1, 0x0

    .line 180
    invoke-virtual {p0, v0, p1}, Ljava/util/Properties;->store(Ljava/io/Writer;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method private initMainJavaFile(Landroid/content/Context;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const p1, 0x24110001

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p2, p0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/File;Ljava/io/InputStream;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public createDemoPlugin(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->compareFileMD5()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopAllPlugin()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-wide v1, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/io/File;

    .line 29
    .line 30
    const-wide v2, -0x36a54222051405a7L    # -2.385436532553019E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance v0, Ljava/io/File;

    .line 52
    .line 53
    const-wide v2, -0x36a545da051405a7L    # -2.3841407372997842E45

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Ljava/io/File;

    .line 66
    .line 67
    const-wide v3, -0x36a5422f051405a7L    # -2.3854188378699392E45

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Ljava/io/File;

    .line 80
    .line 81
    const-wide v4, -0x36a545a7051405a7L    # -2.384210154902636E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->initInfoFile(Ljava/io/File;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p1, v2}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->initMainJavaFile(Landroid/content/Context;Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, p1, v3}, Llin/xposed/hook/javaplugin/util/PluginDemoBuildUtil;->initDescFile(Landroid/content/Context;Ljava/io/File;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method
