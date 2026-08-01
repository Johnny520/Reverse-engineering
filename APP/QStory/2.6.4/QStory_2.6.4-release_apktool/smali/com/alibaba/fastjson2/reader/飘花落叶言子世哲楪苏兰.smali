.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世哲楪兰苏:Z

.field public final 飘花落叶言子世哲楪苏兰:Ljava/util/function/BiConsumer;

.field public final 飘花落叶言子世哲苏楪兰:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V
    .locals 13

    .line 1
    const/4 v12, 0x0

    .line 2
    move-object v3, p2

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move/from16 v4, p3

    .line 7
    .line 8
    move-wide/from16 v5, p4

    .line 9
    .line 10
    move-object/from16 v7, p6

    .line 11
    .line 12
    move-object/from16 v8, p7

    .line 13
    .line 14
    move-object/from16 v9, p8

    .line 15
    .line 16
    move-object/from16 v10, p9

    .line 17
    .line 18
    move-object/from16 v11, p10

    .line 19
    .line 20
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 21
    .line 22
    .line 23
    move-object/from16 p1, p11

    .line 24
    .line 25
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪苏兰:Ljava/util/function/BiConsumer;

    .line 26
    .line 27
    const-string p1, "trim"

    .line 28
    .line 29
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->TrimString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 36
    .line 37
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 38
    .line 39
    and-long p1, p4, p1

    .line 40
    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    cmp-long p1, p1, v1

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 51
    :goto_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪兰苏:Z

    .line 52
    .line 53
    const-string p1, "upper"

    .line 54
    .line 55
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲苏楪兰:Z

    .line 60
    .line 61
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
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪兰苏:Z

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
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲苏楪兰:Z

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪苏兰:Ljava/util/function/BiConsumer;

    .line 41
    .line 42
    invoke-interface {v0, p1, p2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception p1

    .line 47
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪兰苏:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲苏楪兰:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪苏兰:Ljava/util/function/BiConsumer;

    .line 31
    .line 32
    invoke-interface {p0, p2, p1}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Ljava/util/function/BiConsumer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲楪苏兰;->飘花落叶言子世哲楪苏兰:Ljava/util/function/BiConsumer;

    .line 2
    .line 3
    return-object p0
.end method
