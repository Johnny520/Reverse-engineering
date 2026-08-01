.class public abstract L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世兰楪哲苏:Z

.field public final synthetic 飘花落叶言子世兰楪苏哲:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 1
    const/4 v1, 0x0

    .line 2
    iput v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:I

    .line 3
    .line 4
    const/4 v6, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-wide v3, p3

    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    move-object/from16 v10, p9

    .line 18
    .line 19
    move-object/from16 v11, p10

    .line 20
    .line 21
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 25
    .line 26
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 27
    .line 28
    and-long/2addr v1, p3

    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    cmp-long v1, v1, v3

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "string"

    .line 36
    .line 37
    move-object/from16 v5, p5

    .line 38
    .line 39
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 49
    :goto_1
    iput-boolean v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:Z

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 12

    const/4 v1, 0x1

    iput v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:I

    const/4 v6, 0x0

    move-object/from16 v9, p7

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 52
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 53
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v1, p3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:Z

    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p2, p0, :cond_0

    .line 14
    .line 15
    sget-object p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰哲世:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏世楪兰;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public 飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;J)V
    .locals 6

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    iget-wide v2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 6
    .line 7
    or-long/2addr v0, v2

    .line 8
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 9
    .line 10
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 11
    .line 12
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteLongAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 13
    .line 14
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 15
    .line 16
    or-long/2addr v2, v4

    .line 17
    and-long/2addr v0, v2

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v1

    .line 29
    :goto_0
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 30
    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-boolean p0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:Z

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 39
    .line 40
    const-wide v3, -0x1fffffffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long p0, p2, v3

    .line 46
    .line 47
    if-ltz p0, :cond_1

    .line 48
    .line 49
    const-wide v3, 0x1fffffffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    cmp-long p0, p2, v3

    .line 55
    .line 56
    if-gtz p0, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 60
    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    move v1, v2

    .line 64
    :cond_2
    :goto_1
    move v0, v1

    .line 65
    :cond_3
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Long;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰苏世(Ljava/lang/Long;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/Integer;

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世苏子哲兰()V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲苏世兰(Ljava/lang/Integer;)V

    .line 35
    .line 36
    .line 37
    :goto_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪苏世兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    iget-object p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 17
    .line 18
    iget-wide v3, p2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    iget-wide v5, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 21
    .line 22
    or-long/2addr v3, v5

    .line 23
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 24
    .line 25
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 26
    .line 27
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 28
    .line 29
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 30
    .line 31
    or-long/2addr v5, v7

    .line 32
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 33
    .line 34
    iget-wide v7, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 35
    .line 36
    or-long/2addr v5, v7

    .line 37
    and-long/2addr v3, v5

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    cmp-long p2, v3, v5

    .line 41
    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世苏子哲兰()V

    .line 49
    .line 50
    .line 51
    :goto_0
    move v1, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-virtual {p0, p1, v0, v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;J)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏哲楪兰()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    :goto_1
    return v1

    .line 69
    :cond_2
    throw p0

    .line 70
    :pswitch_0
    :try_start_1
    invoke-virtual {p0, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p0, p1, p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;I)V

    .line 88
    .line 89
    .line 90
    move v1, v2

    .line 91
    goto :goto_2

    .line 92
    :catch_1
    move-exception p0

    .line 93
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世苏哲楪兰()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    :goto_2
    return v1

    .line 100
    :cond_4
    throw p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
