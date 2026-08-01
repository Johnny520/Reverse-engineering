.class public abstract L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const-class v1, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    const-string v1, "MutableOriginConnectionPointKey"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lio/ktor/util/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;)L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏哲兰楪;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->getAttributes()Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏哲兰楪;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
