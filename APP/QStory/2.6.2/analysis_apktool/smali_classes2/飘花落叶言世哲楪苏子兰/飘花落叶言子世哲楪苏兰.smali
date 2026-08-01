.class public L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Landroid/os/Bundle;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x5

    .line 14
    if-lt v0, v2, :cond_5

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    if-le v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const-wide v2, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v2, v1

    .line 38
    :goto_0
    if-ge v2, v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/16 v4, 0x30

    .line 45
    .line 46
    if-lt v3, v4, :cond_5

    .line 47
    .line 48
    const/16 v4, 0x39

    .line 49
    .line 50
    if-le v3, v4, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_5
    :goto_1
    return v1
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const-wide v1, -0x36a50182051405a7L    # -2.407955058466379E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const-class v3, Landroid/os/Bundle;

    .line 12
    .line 13
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-wide v5, -0x36a50093051405a7L    # -2.4082803684091556E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-wide v7, -0x36a51fb7051405a7L    # -2.3974294442927807E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {p1, v4, v5, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v5, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 48
    .line 49
    invoke-direct {v5, p0, v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3, v5}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    new-array v0, v0, [Ljava/lang/Class;

    .line 60
    .line 61
    invoke-static {p1, v4, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    const-wide v7, -0x36a51f83051405a7L    # -2.3975002230251002E45

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {p1, v4, v5, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v5, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 101
    .line 102
    const/4 v6, 0x2

    .line 103
    invoke-direct {v5, p0, v6}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v3, v5}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-array v0, v0, [Ljava/lang/Class;

    .line 114
    .line 115
    invoke-static {p1, v4, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 120
    .line 121
    const/4 v1, 0x3

    .line 122
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪苏兰;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method
