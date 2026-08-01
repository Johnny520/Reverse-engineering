.class public final synthetic L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.ListResourcesRequest"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cursor"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "_meta"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "method"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final childSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 2
    .line 3
    invoke-static {p0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x3

    .line 8
    new-array v0, v0, [L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p0, v0, v1

    .line 12
    .line 13
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput-object p0, v0, v1

    .line 17
    .line 18
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    aput-object p0, v0, v1

    .line 22
    .line 23
    return-object v0
.end method

.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v0

    .line 14
    move v4, v1

    .line 15
    move-object v5, v2

    .line 16
    move-object v6, v5

    .line 17
    move-object v7, v6

    .line 18
    :goto_0
    if-eqz v3, :cond_4

    .line 19
    .line 20
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, -0x1

    .line 25
    if-eq v8, v9, :cond_3

    .line 26
    .line 27
    if-eqz v8, :cond_2

    .line 28
    .line 29
    if-eq v8, v0, :cond_1

    .line 30
    .line 31
    const/4 v9, 0x2

    .line 32
    if-ne v8, v9, :cond_0

    .line 33
    .line 34
    sget-object v8, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 35
    .line 36
    invoke-interface {p1, p0, v9, v8, v7}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 41
    .line 42
    or-int/lit8 v4, v4, 0x4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v8}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_1
    sget-object v8, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;

    .line 50
    .line 51
    invoke-interface {p1, p0, v0, v8, v6}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 56
    .line 57
    or-int/lit8 v4, v4, 0x2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    sget-object v8, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 61
    .line 62
    invoke-interface {p1, p0, v1, v8, v5}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/String;

    .line 67
    .line 68
    or-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    move v3, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;

    .line 77
    .line 78
    invoke-direct {p0, v4, v5, v6, v7}, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;-><init>(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 7
    .line 8
    iget-object v0, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 9
    .line 10
    iget-object p2, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子兰世楪苏哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    invoke-interface {p1, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_0
    sget-object v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-interface {p1, v1, v3, v2, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {p1, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 41
    .line 42
    invoke-static {v0, p2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_3

    .line 47
    .line 48
    :goto_1
    sget-object p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪哲兰苏;

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-interface {p1, v1, v2, p2, v0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-interface {p1, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    sget-object p2, Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;->ResourcesList:Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;

    .line 62
    .line 63
    if-eq p0, p2, :cond_5

    .line 64
    .line 65
    :goto_2
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 66
    .line 67
    const/4 v0, 0x2

    .line 68
    invoke-interface {p1, v1, v0, p2, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    invoke-interface {p1, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final typeParametersSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method
