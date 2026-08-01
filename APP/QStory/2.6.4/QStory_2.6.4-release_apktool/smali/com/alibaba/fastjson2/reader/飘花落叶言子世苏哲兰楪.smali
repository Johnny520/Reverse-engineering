.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Field;)V
    .locals 15

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual/range {p11 .. p11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v12, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object/from16 v12, p2

    .line 10
    .line 11
    :goto_0
    const/4 v11, 0x0

    .line 12
    const/4 v14, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-object/from16 v8, p1

    .line 15
    .line 16
    move-object/from16 v6, p3

    .line 17
    .line 18
    move/from16 v2, p4

    .line 19
    .line 20
    move-wide/from16 v3, p5

    .line 21
    .line 22
    move-object/from16 v9, p7

    .line 23
    .line 24
    move-object/from16 v13, p8

    .line 25
    .line 26
    move-object/from16 v7, p9

    .line 27
    .line 28
    move-object/from16 v5, p10

    .line 29
    .line 30
    move-object/from16 v10, p11

    .line 31
    .line 32
    invoke-direct/range {v1 .. v14}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;-><init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public 飘花落叶言子世楪兰哲苏(Ljava/lang/Object;F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    float-to-double v1, p2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲苏兰(D)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putFloat(Ljava/lang/Object;JF)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "set "

    .line 39
    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, " error"

    .line 46
    .line 47
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public 飘花落叶言子世楪兰苏哲(Ljava/lang/Object;D)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲苏兰(D)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 11
    .line 12
    cmp-long v0, v4, v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 17
    .line 18
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 23
    .line 24
    move-object v3, p1

    .line 25
    move-wide v6, p2

    .line 26
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    move-object v3, p1

    .line 31
    move-wide v6, p2

    .line 32
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {p1, v3, v6, v7}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string p3, "set "

    .line 43
    .line 44
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 48
    .line 49
    const-string p3, " error"

    .line 50
    .line 51
    invoke-static {p2, p0, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final 飘花落叶言子世楪哲兰苏(Ljava/lang/Object;C)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-long v1, p2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putChar(Ljava/lang/Object;JC)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setChar(Ljava/lang/Object;C)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "set "

    .line 39
    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, " error"

    .line 46
    .line 47
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final 飘花落叶言子世楪哲苏兰(Ljava/lang/Object;B)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-long v1, p2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setByte(Ljava/lang/Object;B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "set "

    .line 39
    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, " error"

    .line 46
    .line 47
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public 飘花落叶言子世苏哲楪兰(Ljava/lang/Object;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 15
    .line 16
    cmp-long v0, v2, v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 27
    .line 28
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putBoolean(Ljava/lang/Object;JZ)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, "set "

    .line 42
    .line 43
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 47
    .line 48
    const-string v0, " error"

    .line 49
    .line 50
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public 飘花落叶言子世苏楪兰哲(Ljava/lang/Object;S)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-long v1, p2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setShort(Ljava/lang/Object;S)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "set "

    .line 39
    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, " error"

    .line 46
    .line 47
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public 飘花落叶言子世苏楪哲兰(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-long v1, p2

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 12
    .line 13
    cmp-long v0, v2, v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2, v3, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v0, "set "

    .line 39
    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, " error"

    .line 46
    .line 47
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "set "

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 15
    .line 16
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 17
    .line 18
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 19
    .line 20
    and-long/2addr v2, v4

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-eqz v2, :cond_10

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_a

    .line 35
    .line 36
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne v2, v3, :cond_2

    .line 39
    .line 40
    instance-of v2, p2, Ljava/lang/Number;

    .line 41
    .line 42
    if-eqz v2, :cond_9

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世苏楪哲兰(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    if-ne v2, v3, :cond_3

    .line 57
    .line 58
    instance-of v2, p2, Ljava/lang/Number;

    .line 59
    .line 60
    if-eqz v2, :cond_9

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne v2, v3, :cond_4

    .line 75
    .line 76
    instance-of v2, p2, Ljava/lang/Number;

    .line 77
    .line 78
    if-eqz v2, :cond_9

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;F)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-ne v2, v3, :cond_5

    .line 93
    .line 94
    instance-of v2, p2, Ljava/lang/Number;

    .line 95
    .line 96
    if-eqz v2, :cond_9

    .line 97
    .line 98
    check-cast p2, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;D)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    if-ne v2, v3, :cond_6

    .line 111
    .line 112
    instance-of v2, p2, Ljava/lang/Number;

    .line 113
    .line 114
    if-eqz v2, :cond_9

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世苏楪兰哲(Ljava/lang/Object;S)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_6
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    if-ne v2, v3, :cond_7

    .line 129
    .line 130
    instance-of v2, p2, Ljava/lang/Number;

    .line 131
    .line 132
    if-eqz v2, :cond_9

    .line 133
    .line 134
    check-cast p2, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_7
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    if-ne v2, v3, :cond_8

    .line 147
    .line 148
    instance-of v2, p2, Ljava/lang/Character;

    .line 149
    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    check-cast p2, Ljava/lang/Character;

    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;C)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_8
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 163
    .line 164
    if-ne v2, v3, :cond_9

    .line 165
    .line 166
    instance-of v2, p2, Ljava/lang/Boolean;

    .line 167
    .line 168
    if-eqz v2, :cond_9

    .line 169
    .line 170
    check-cast p2, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲兰楪;->飘花落叶言子世苏哲楪兰(Ljava/lang/Object;Z)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_9
    const-string p0, " error, type not support "

    .line 181
    .line 182
    invoke-static {v1, v0, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_a
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 195
    .line 196
    if-eq v3, v2, :cond_b

    .line 197
    .line 198
    const-class v4, Ljava/util/Map;

    .line 199
    .line 200
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    if-eqz v5, :cond_b

    .line 205
    .line 206
    instance-of v5, p2, Ljava/util/Map;

    .line 207
    .line 208
    if-eqz v5, :cond_b

    .line 209
    .line 210
    if-eq v2, v4, :cond_b

    .line 211
    .line 212
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast p2, Ljava/util/Map;

    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    new-array v3, v3, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 224
    .line 225
    invoke-interface {v2, p2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    goto :goto_1

    .line 230
    :cond_b
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_10

    .line 235
    .line 236
    instance-of v4, p2, Ljava/lang/String;

    .line 237
    .line 238
    if-eqz v4, :cond_f

    .line 239
    .line 240
    move-object v4, p2

    .line 241
    check-cast v4, Ljava/lang/String;

    .line 242
    .line 243
    const-class v5, Ljava/time/LocalDate;

    .line 244
    .line 245
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 246
    .line 247
    if-ne v2, v5, :cond_d

    .line 248
    .line 249
    if-eqz v6, :cond_c

    .line 250
    .line 251
    invoke-static {v6}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-static {v4, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    goto :goto_0

    .line 260
    :cond_c
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Ljava/time/LocalDate;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    goto :goto_0

    .line 265
    :cond_d
    const-class v5, Ljava/util/Date;

    .line 266
    .line 267
    if-ne v2, v5, :cond_f

    .line 268
    .line 269
    if-eqz v6, :cond_e

    .line 270
    .line 271
    sget-object p2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 272
    .line 273
    invoke-static {v4, v6, p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    goto :goto_0

    .line 278
    :cond_e
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/util/Date;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    :cond_f
    :goto_0
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-nez v2, :cond_10

    .line 287
    .line 288
    invoke-static {p2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    :cond_10
    :goto_1
    const-wide/16 v2, -0x1

    .line 293
    .line 294
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 295
    .line 296
    cmp-long v2, v4, v2

    .line 297
    .line 298
    if-eqz v2, :cond_11

    .line 299
    .line 300
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 301
    .line 302
    invoke-virtual {p0, p1, v4, v5, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_11
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 307
    .line 308
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :catch_0
    move-exception p0

    .line 313
    const-string p1, " error"

    .line 314
    .line 315
    invoke-static {v1, v0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世哲兰苏(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 11
    .line 12
    cmp-long v0, v4, v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 17
    .line 18
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 23
    .line 24
    move-object v3, p1

    .line 25
    move-wide v6, p2

    .line 26
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    move-object v3, p1

    .line 31
    move-wide v6, p2

    .line 32
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {p1, v3, v6, v7}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    new-instance p2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string p3, "set "

    .line 43
    .line 44
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 48
    .line 49
    const-string p3, " error"

    .line 50
    .line 51
    invoke-static {p2, p0, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
