.class public final synthetic L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.PromptMessage"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "role"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "content"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final childSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;->飘花落叶言子楪世哲苏兰:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    invoke-interface {p0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    sget-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;

    .line 17
    .line 18
    aput-object v1, v0, p0

    .line 19
    .line 20
    return-object v0
.end method

.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;->飘花落叶言子楪世哲苏兰:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v1

    .line 16
    move v5, v2

    .line 17
    move-object v6, v3

    .line 18
    move-object v7, v6

    .line 19
    :goto_0
    if-eqz v4, :cond_3

    .line 20
    .line 21
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    const/4 v9, -0x1

    .line 26
    if-eq v8, v9, :cond_2

    .line 27
    .line 28
    if-eqz v8, :cond_1

    .line 29
    .line 30
    if-ne v8, v1, :cond_0

    .line 31
    .line 32
    sget-object v8, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;

    .line 33
    .line 34
    invoke-interface {p1, p0, v1, v8, v7}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏子哲;

    .line 39
    .line 40
    or-int/lit8 v5, v5, 0x2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v8}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_1
    aget-object v8, v0, v2

    .line 48
    .line 49
    invoke-interface {v8}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 54
    .line 55
    invoke-interface {p1, p0, v2, v8, v6}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 60
    .line 61
    or-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;

    .line 70
    .line 71
    invoke-direct {p0, v5, v6, v7}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;-><init>(ILio/modelcontextprotocol/kotlin/sdk/Role;L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏子哲;)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世哲兰子苏;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;->飘花落叶言子楪世哲苏兰:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    iget-object v2, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;->飘花落叶言子楪世苏哲兰:Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 24
    .line 25
    invoke-interface {p1, p0, v1, v0, v2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏哲子;

    .line 29
    .line 30
    iget-object p2, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰子苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪世兰苏子哲;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-interface {p1, p0, v1, v0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 37
    .line 38
    .line 39
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
