.class public final Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世哲苏兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;

    .line 5
    .line 6
    new-instance p1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 14
    .line 15
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;Ljava/io/File;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    array-length v0, p0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    aget-object v1, p0, v0

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    aget-object p0, p0, v0

    .line 25
    .line 26
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "_temp"

    .line 37
    .line 38
    invoke-static {v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_9

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v1, v0

    .line 31
    check-cast v1, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;

    .line 32
    .line 33
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getTitle()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_8

    .line 43
    .line 44
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getDescription()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v4, 0x1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-ne v2, v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getNickname()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-ne v2, v4, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getUin()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ne v2, v4, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getAuthor()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-ne v2, v4, :cond_5

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {v1}, Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;->getTags()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_1

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2, p2, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_7

    .line 131
    .line 132
    :cond_8
    :goto_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_9
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 3

    .line 1
    new-instance v0, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$getTags$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$getTags$1;-><init>(Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    invoke-static {p0, v1, v1, v0, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$getStickers$1;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v3, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move-object v4, p3

    .line 17
    move-object v5, p4

    .line 18
    invoke-direct/range {v0 .. v6}, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$getStickers$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x3

    .line 22
    iget-object p1, v3, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-static {p1, p2, p2, v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;Ljava/lang/String;L飘花落叶言苏世哲兰子楪/飘花落叶言子楪哲苏兰世;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    iget-object v1, p0, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$downloadAndInstall$1;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v4, p0

    .line 21
    move-object v3, p1

    .line 22
    move-object v2, p2

    .line 23
    move-object v5, p3

    .line 24
    invoke-direct/range {v1 .. v6}, Ltop/suzhelan/sticker/sdk/presenter/StickerPresenter$downloadAndInstall$1;-><init>(Ljava/lang/String;Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x2

    .line 28
    iget-object p1, v4, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {p1, v0, p2, v1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 32
    .line 33
    .line 34
    return-void
.end method
