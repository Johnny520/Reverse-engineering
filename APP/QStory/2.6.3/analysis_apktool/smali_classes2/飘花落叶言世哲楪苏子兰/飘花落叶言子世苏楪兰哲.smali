.class public L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Landroid/os/Bundle;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 7
    .line 8
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
    const-string v2, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 22
    .line 23
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, v1

    .line 35
    :goto_0
    if-ge v2, v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v4, 0x30

    .line 42
    .line 43
    if-lt v3, v4, :cond_5

    .line 44
    .line 45
    const/16 v4, 0x39

    .line 46
    .line 47
    if-le v3, v4, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_5
    :goto_1
    return v1
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/16 v1, 0x3e

    .line 7
    .line 8
    const-class v2, Landroid/os/Bundle;

    .line 9
    .line 10
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    const/16 v4, 0x49

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0xd8

    .line 17
    .line 18
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {p1, v3, v4, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v4, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;

    .line 39
    .line 40
    invoke-direct {v4, p0, v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2, v4}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-array v0, v0, [Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {p1, v3, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const/16 p1, 0xd9

    .line 67
    .line 68
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {p1, v3, v4, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v4, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;

    .line 89
    .line 90
    const/4 v5, 0x2

    .line 91
    invoke-direct {v4, p0, v5}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v2, v4}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-array v0, v0, [Ljava/lang/Class;

    .line 102
    .line 103
    invoke-static {p1, v3, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;

    .line 108
    .line 109
    const/4 v1, 0x3

    .line 110
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世楪兰苏哲;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏楪兰哲;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
