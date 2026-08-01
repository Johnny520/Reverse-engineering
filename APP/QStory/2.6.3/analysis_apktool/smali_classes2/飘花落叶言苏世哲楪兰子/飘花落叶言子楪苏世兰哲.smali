.class public final L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲苏世兰;


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field public static final 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    const/16 v0, 0x9c0

    .line 9
    .line 10
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, 0x9c1

    .line 17
    .line 18
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v0, 0x9c2

    .line 25
    .line 26
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子苏楪世哲兰(ILjava/util/List;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏兰楪世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, p1

    .line 18
    :goto_0
    const-string v0, ""

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    move-object p0, v0

    .line 23
    :cond_1
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-static {v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏兰楪世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_2
    if-nez p1, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move-object v0, p1

    .line 41
    :goto_1
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/4 v1, 0x1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    const/4 p1, 0x0

    .line 56
    goto :goto_3

    .line 57
    :cond_5
    :goto_2
    move p1, v1

    .line 58
    :goto_3
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5"

    .line 59
    .line 60
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    new-instance v2, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世苏兰;

    .line 64
    .line 65
    invoke-direct {v2}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世苏兰;-><init>()V

    .line 66
    .line 67
    .line 68
    const/16 v3, 0x8f7

    .line 69
    .line 70
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    const-string v3, "\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5~\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u545c\u55b5\u55b5\u545c\u55b5"

    .line 74
    .line 75
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2, p0, v3}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string p0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u545c\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 83
    .line 84
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v2, v0, p0}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 92
    .line 93
    iget-object v0, v2, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-direct {p0, v0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;-><init>(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    xor-int/2addr p1, v1

    .line 103
    invoke-static {p0, p2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子苏世兰楪哲(Ljava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;Z)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
