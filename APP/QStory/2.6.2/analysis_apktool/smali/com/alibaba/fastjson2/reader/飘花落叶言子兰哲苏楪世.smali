.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public 飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;-><init>(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)V
    .locals 2

    .line 1
    const-class v0, Ljava/util/Optional;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    array-length v0, p1

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    aget-object p1, p1, v0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    if-nez p4, :cond_3

    .line 13
    .line 14
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-static {p2, p5, p4, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p4, 0x0

    .line 28
    :goto_0
    if-nez p4, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 38
    .line 39
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    move-object v3, p3

    .line 47
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_2
    if-nez p0, :cond_4

    .line 52
    .line 53
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_4
    invoke-static {p0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    if-nez p4, :cond_3

    .line 13
    .line 14
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz p4, :cond_1

    .line 17
    .line 18
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世哲兰苏:Ljava/util/Locale;

    .line 21
    .line 22
    invoke-static {p2, p5, p4, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p4, 0x0

    .line 28
    :goto_0
    if-nez p4, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 38
    .line 39
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    move-object v3, p3

    .line 47
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_2
    if-nez p0, :cond_4

    .line 52
    .line 53
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_4
    invoke-static {p0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
