.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/function/ToIntFunction;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    const-string v1, "getMinimumDaysInFirstWeek"

    .line 6
    .line 7
    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/ToIntFunction;

    .line 16
    .line 17
    const-string v1, "getZone"

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "getID"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception p0

    .line 47
    const-string p1, "getMethod error"

    .line 48
    .line 49
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 8
    .line 9
    invoke-interface {p4, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/ToIntFunction;

    .line 16
    .line 17
    invoke-interface {p0, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x4

    .line 25
    if-eq p0, p2, :cond_0

    .line 26
    .line 27
    const-string p2, "minimumDaysInFirstWeek"

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const-string p0, "zoneId"

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 2
    .line 3
    invoke-interface {p3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object p4, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 8
    .line 9
    invoke-interface {p4, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/util/function/ToIntFunction;

    .line 16
    .line 17
    invoke-interface {p0, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏兰楪世哲()V

    .line 22
    .line 23
    .line 24
    const-string p2, "minimumDaysInFirstWeek"

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 30
    .line 31
    .line 32
    const-string p0, "zoneId"

    .line 33
    .line 34
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世哲楪(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
