.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世哲苏兰楪:Z

.field public final 飘花落叶言子世哲苏楪兰:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;)V
    .locals 14

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v13, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v7, p1

    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move-object/from16 v5, p3

    .line 8
    .line 9
    move/from16 v1, p4

    .line 10
    .line 11
    move-wide/from16 v2, p5

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v12, p8

    .line 16
    .line 17
    move-object/from16 v6, p9

    .line 18
    .line 19
    move-object/from16 v4, p10

    .line 20
    .line 21
    move-object/from16 v10, p11

    .line 22
    .line 23
    invoke-direct/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;-><init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "trim"

    .line 27
    .line 28
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 35
    .line 36
    iget-wide v1, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 37
    .line 38
    and-long v1, p5, v1

    .line 39
    .line 40
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    cmp-long p1, v1, v3

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 50
    :goto_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏楪兰:Z

    .line 51
    .line 52
    const-string p1, "upper"

    .line 53
    .line 54
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏兰楪:Z

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p2, Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    :goto_1
    if-eqz p2, :cond_3

    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏楪兰:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_2
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏兰楪:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p1

    .line 51
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, "set "

    .line 54
    .line 55
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 59
    .line 60
    const-string v0, " error"

    .line 61
    .line 62
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏楪兰:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏兰楪:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 31
    .line 32
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v1, "set "

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 49
    .line 50
    const-string v1, " error"

    .line 51
    .line 52
    invoke-static {v0, p0, v1, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪兰苏;->飘花落叶言子世哲苏楪兰:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object p1
.end method
