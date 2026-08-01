.class public abstract L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子苏兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Kt$"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v1, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰苏楪(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v1, "$"

    .line 22
    .line 23
    invoke-static {v0, v1, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰苏楪(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    :goto_0
    const-string v1, "kotlin-logging-to-android-native"

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 42
    .line 43
    const/4 v2, 0x5

    .line 44
    invoke-direct {v1, v0, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-static {v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v1, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-direct {v1, v0, v2}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    :goto_1
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 62
    .line 63
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 64
    .line 65
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;-><init>(Ljava/util/Map;)V

    .line 70
    .line 71
    .line 72
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 73
    .line 74
    return-void
.end method
