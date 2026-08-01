.class public final Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;",
        "",
        "<init>",
        "()V",
        "resolveAssetUrl",
        "",
        "path",
        "online-sticker-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;->INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerUrlResolver;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final resolveAssetUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, "https://sticker.suzhelan.top/api/v1/"

    .line 2
    .line 3
    if-eqz p0, :cond_9

    .line 4
    .line 5
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    const-string v1, "http://"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p0, v1, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_8

    .line 21
    .line 22
    const-string v1, "https://"

    .line 23
    .line 24
    invoke-static {p0, v1, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    new-instance v1, Ljava/net/URI;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Ljava/net/URI;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-direct/range {v3 .. v10}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    new-array v3, v1, [C

    .line 70
    .line 71
    const/16 v4, 0x2f

    .line 72
    .line 73
    aput-char v4, v3, v2

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    const/4 v5, -0x1

    .line 80
    add-int/2addr v4, v5

    .line 81
    if-ltz v4, :cond_6

    .line 82
    .line 83
    :goto_0
    add-int/lit8 v6, v4, -0x1

    .line 84
    .line 85
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    move v8, v2

    .line 90
    :goto_1
    if-ge v8, v1, :cond_3

    .line 91
    .line 92
    aget-char v9, v3, v8

    .line 93
    .line 94
    if-ne v7, v9, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move v8, v5

    .line 101
    :goto_2
    if-ltz v8, :cond_5

    .line 102
    .line 103
    if-gez v6, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    move v4, v6

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    add-int/2addr v4, v1

    .line 109
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    :goto_3
    const-string v0, ""

    .line 115
    .line 116
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v1, "/"

    .line 121
    .line 122
    invoke-static {p0, v1, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_7

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :goto_5
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :cond_8
    :goto_6
    return-object p0

    .line 138
    :cond_9
    :goto_7
    return-object v0
.end method
