.class public final synthetic L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;


# static fields
.field private static final descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    new-instance v1, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 9
    .line 10
    const-string v2, "top.sacz.xphelper.dexkit.cache.DexKitCacheJson.ClassInfo"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ClassName"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    sput-object v1, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
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
    sget-object v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏兰楪哲世;

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
    sget-object p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

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
    invoke-interface {p1, p0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    move v4, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v6}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    move v3, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    invoke-direct {p0, v4, v5}, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世哲苏兰;-><init>(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->descriptor:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget-object p2, p2, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世兰哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
