.class public final synthetic L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.PromptReference"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "name"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "type"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    sput-object v1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final childSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 2

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 3
    .line 4
    sget-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    return-object p0
.end method

.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

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
    :goto_0
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    const/4 v8, -0x1

    .line 24
    if-eq v7, v8, :cond_2

    .line 25
    .line 26
    if-eqz v7, :cond_1

    .line 27
    .line 28
    if-ne v7, v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, p0, v0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    or-int/lit8 v4, v4, 0x2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v7}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    invoke-interface {p1, p0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    or-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v3, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子哲兰世;

    .line 54
    .line 55
    invoke-direct {p0, v4, v5, v6}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子哲兰世;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子哲兰世;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子世兰哲;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p2, p2, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {p1, p0, v1, v0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世兰哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "ref/prompt"

    .line 28
    .line 29
    invoke-static {p2, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    :goto_0
    const/4 v0, 0x1

    .line 36
    invoke-interface {p1, p0, v0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世兰哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 40
    .line 41
    .line 42
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
