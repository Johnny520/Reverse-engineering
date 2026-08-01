.class public final synthetic L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.InitializedNotification"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "method"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final childSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    new-array p0, p0, [L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 3
    .line 4
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    return-object p0
.end method

.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

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
    :goto_0
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const/4 v7, -0x1

    .line 23
    if-eq v6, v7, :cond_1

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    sget-object v4, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v4, v5}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v5, v4

    .line 34
    check-cast v5, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 35
    .line 36
    move v4, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v6}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    move v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪苏世兰;

    .line 48
    .line 49
    invoke-direct {p0, v4, v5}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪苏世兰;-><init>(IL飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 7
    .line 8
    sget-object p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪世苏兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;->NotificationsInitialized:Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    :goto_0
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子世苏兰;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-interface {p1, p2, v1, v0, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲兰楪苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 32
    .line 33
    .line 34
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
