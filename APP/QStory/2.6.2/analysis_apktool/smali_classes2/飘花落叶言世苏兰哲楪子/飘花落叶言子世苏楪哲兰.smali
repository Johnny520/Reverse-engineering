.class public final L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    sget-object v0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲世苏兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 12
    .line 13
    const-string v2, "kotlinx.serialization.json.JsonPrimitive"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;[L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲苏世()L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Unexpected JSON element, expected JsonPrimitive, had "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰(Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-interface {p0}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲兰世;->飘花落叶言子世兰苏楪哲()L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    iget-boolean p0, p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {v0, p0}, Lkotlinx/serialization/json/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏世兰(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    move-object v8, p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    const/4 p0, 0x0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    new-instance v3, Lkotlinx/serialization/json/JsonDecodingException;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v9, 0x0

    .line 61
    invoke-static {v5, v7, v9, v0, v8}, Lkotlinx/serialization/json/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const/4 v6, -0x1

    .line 66
    invoke-direct/range {v3 .. v9}, Lkotlinx/serialization/json/JsonDecodingException;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v3

    .line 70
    :cond_1
    check-cast p1, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪兰哲苏;

    .line 71
    .line 72
    return-object p1
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪兰哲苏;

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
    instance-of p0, p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲苏世;

    .line 14
    .line 15
    sget-object p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;->INSTANCE:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰哲世苏;

    .line 16
    .line 17
    invoke-interface {p1, p0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲楪苏兰(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object p0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰苏世哲;

    .line 22
    .line 23
    check-cast p2, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世哲苏;

    .line 24
    .line 25
    invoke-interface {p1, p0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲楪苏兰(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
