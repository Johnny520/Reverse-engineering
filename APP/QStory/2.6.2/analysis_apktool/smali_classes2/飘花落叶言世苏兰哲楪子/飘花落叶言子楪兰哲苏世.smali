.class public final L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    const-string v1, "kotlinx.serialization.json.JsonNull"

    .line 12
    .line 13
    sget-object v2, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪苏世兰哲;

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;[L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世哲楪兰苏()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;->INSTANCE:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lkotlinx/serialization/json/JsonDecodingException;

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    const/4 p1, 0x0

    .line 17
    const-string v2, "Expected \'null\' literal"

    .line 18
    .line 19
    invoke-static {v2, p1, p1, p0, p1}, Lkotlinx/serialization/json/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v3, -0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-direct/range {v0 .. v6}, Lkotlinx/serialization/json/JsonDecodingException;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
