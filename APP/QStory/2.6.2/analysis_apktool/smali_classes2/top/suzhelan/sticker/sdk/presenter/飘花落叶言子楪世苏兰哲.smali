.class public final Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Ljava/util/Set;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/Set;

.field public static final 飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroidx/compose/ui/text/font/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Landroidx/compose/ui/text/font/飘花落叶言子楪哲世兰苏;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    sget-object v1, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    const-string v5, "webp"

    .line 24
    .line 25
    const-string v6, "bmp"

    .line 26
    .line 27
    const-string v1, "jpg"

    .line 28
    .line 29
    const-string v2, "jpeg"

    .line 30
    .line 31
    const-string v3, "png"

    .line 32
    .line 33
    const-string v4, "gif"

    .line 34
    .line 35
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏兰哲楪世([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 44
    .line 45
    const-string v0, "config.json"

    .line 46
    .line 47
    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 52
    .line 53
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/io/File;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_4

    .line 8
    :cond_0
    const/16 v0, 0x1000

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_4

    .line 16
    .line 17
    aget-object v4, p0, v3

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    new-instance v6, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v5, "/"

    .line 41
    .line 42
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v4, v5, p2}, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/io/File;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    sget-object v5, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_3

    .line 64
    .line 65
    new-instance v5, Ljava/util/zip/ZipEntry;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {p1, v6}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-direct {v5, v6}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v5}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Ljava/io/FileInputStream;

    .line 82
    .line 83
    invoke-direct {v5, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    :try_start_0
    invoke-virtual {v5, v0}, Ljava/io/FileInputStream;->read([B)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/4 v6, -0x1

    .line 91
    if-eq v4, v6, :cond_2

    .line 92
    .line 93
    invoke-virtual {p2, v0, v2, v4}, Ljava/util/zip/ZipOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :catchall_1
    move-exception p1

    .line 108
    invoke-static {v5, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    :goto_4
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltop/suzhelan/qstory/ui/components/飘花落叶言子楪世哲苏兰;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;

    .line 5
    .line 6
    const/4 v10, 0x0

    .line 7
    move-object v1, p0

    .line 8
    move-object v3, p1

    .line 9
    move-object v6, p2

    .line 10
    move-object v7, p3

    .line 11
    move-object v4, p4

    .line 12
    move-object/from16 v5, p5

    .line 13
    .line 14
    move-object/from16 v8, p6

    .line 15
    .line 16
    move-object/from16 v2, p7

    .line 17
    .line 18
    move-object/from16 v9, p8

    .line 19
    .line 20
    invoke-direct/range {v0 .. v10}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    sget-object p1, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-static {p1, p2, p2, v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏兰世哲楪(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v5, Landroidx/compose/foundation/飘花落叶言子楪哲苏兰世;

    .line 12
    .line 13
    const/16 v0, 0x1b

    .line 14
    .line 15
    invoke-direct {v5, p0, v0}, Landroidx/compose/foundation/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    const/16 v6, 0x1e

    .line 19
    .line 20
    const-string v2, "&"

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "&timestamp="

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, "&nonce="

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string p1, "HmacSHA256"

    .line 57
    .line 58
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 63
    .line 64
    sget-object v1, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 65
    .line 66
    const-string v2, "UHa6q8eD7T4qzqpksbXX"

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v2, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance p1, Lio/ktor/util/飘花落叶言子楪世哲苏兰;

    .line 96
    .line 97
    const/16 p2, 0x18

    .line 98
    .line 99
    invoke-direct {p1, p2}, Lio/ktor/util/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 100
    .line 101
    .line 102
    const/16 p2, 0x1e

    .line 103
    .line 104
    invoke-static {p0, p1, p2}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏哲楪兰世([BL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 10

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 p1, 0x0

    .line 33
    if-eqz p0, :cond_e

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    array-length v1, p0

    .line 41
    const/4 v2, 0x0

    .line 42
    move v3, v2

    .line 43
    :goto_1
    if-ge v3, v1, :cond_3

    .line 44
    .line 45
    aget-object v4, p0, v3

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    sget-object v5, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/Set;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_d

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object v1, v0

    .line 86
    check-cast v1, Ljava/io/File;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, Lkotlin/io/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏兰世楪哲(Ljava/io/File;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v4, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 105
    .line 106
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const/4 v4, 0x1

    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_5
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    .line 116
    .line 117
    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 121
    .line 122
    const/16 v5, 0x2000

    .line 123
    .line 124
    invoke-direct {v1, v3, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    .line 126
    .line 127
    const/16 v3, 0xc

    .line 128
    .line 129
    :try_start_1
    new-array v5, v3, [B

    .line 130
    .line 131
    invoke-virtual {v1, v5}, Ljava/io/InputStream;->read([B)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    const/4 v7, 0x3

    .line 136
    if-ge v6, v7, :cond_7

    .line 137
    .line 138
    :cond_6
    move v4, v2

    .line 139
    goto :goto_3

    .line 140
    :cond_7
    aget-byte v7, v5, v2

    .line 141
    .line 142
    const/4 v8, -0x1

    .line 143
    if-ne v7, v8, :cond_8

    .line 144
    .line 145
    aget-byte v8, v5, v4

    .line 146
    .line 147
    const/16 v9, -0x28

    .line 148
    .line 149
    if-eq v8, v9, :cond_c

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_0
    move-exception v3

    .line 153
    goto :goto_4

    .line 154
    :cond_8
    :goto_2
    const/16 v8, -0x77

    .line 155
    .line 156
    if-ne v7, v8, :cond_9

    .line 157
    .line 158
    aget-byte v8, v5, v4

    .line 159
    .line 160
    const/16 v9, 0x50

    .line 161
    .line 162
    if-eq v8, v9, :cond_c

    .line 163
    .line 164
    :cond_9
    const/16 v8, 0x47

    .line 165
    .line 166
    if-ne v7, v8, :cond_a

    .line 167
    .line 168
    aget-byte v8, v5, v4

    .line 169
    .line 170
    const/16 v9, 0x49

    .line 171
    .line 172
    if-ne v8, v9, :cond_a

    .line 173
    .line 174
    const/4 v8, 0x2

    .line 175
    aget-byte v8, v5, v8

    .line 176
    .line 177
    const/16 v9, 0x46

    .line 178
    .line 179
    if-eq v8, v9, :cond_c

    .line 180
    .line 181
    :cond_a
    const/16 v8, 0x42

    .line 182
    .line 183
    if-ne v7, v8, :cond_b

    .line 184
    .line 185
    aget-byte v7, v5, v4

    .line 186
    .line 187
    const/16 v8, 0x4d

    .line 188
    .line 189
    if-eq v7, v8, :cond_c

    .line 190
    .line 191
    :cond_b
    if-lt v6, v3, :cond_6

    .line 192
    .line 193
    new-instance v3, Ljava/lang/String;

    .line 194
    .line 195
    sget-object v6, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 196
    .line 197
    const/4 v7, 0x4

    .line 198
    invoke-direct {v3, v5, v2, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 199
    .line 200
    .line 201
    const-string v8, "RIFF"

    .line 202
    .line 203
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_6

    .line 208
    .line 209
    new-instance v3, Ljava/lang/String;

    .line 210
    .line 211
    const/16 v8, 0x8

    .line 212
    .line 213
    invoke-direct {v3, v5, v8, v7, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 214
    .line 215
    .line 216
    const-string v5, "WEBP"

    .line 217
    .line 218
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    if-eqz v3, :cond_6

    .line 223
    .line 224
    :cond_c
    :goto_3
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :goto_4
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 229
    :catchall_1
    move-exception v4

    .line 230
    :try_start_4
    invoke-static {v1, v3}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 234
    :catch_0
    move v4, v2

    .line 235
    :goto_5
    if-eqz v4, :cond_4

    .line 236
    .line 237
    move-object p1, v0

    .line 238
    :cond_d
    check-cast p1, Ljava/io/File;

    .line 239
    .line 240
    :cond_e
    return-object p1
.end method
