.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Member;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪苏世兰哲:[J

.field public final 飘花落叶言子楪苏世哲兰:[Ljava/lang/Enum;

.field public final 飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲兰世:[J


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Member;[Ljava/lang/Enum;[Ljava/lang/Enum;[J)V
    .locals 13

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    instance-of v3, v1, Ljava/lang/reflect/AccessibleObject;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Ljava/lang/reflect/AccessibleObject;

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Member;

    .line 24
    .line 25
    instance-of v3, v1, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    move-object v3, v1

    .line 31
    check-cast v3, Ljava/lang/reflect/Field;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v3, v1, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v3, v5

    .line 51
    :goto_0
    const/4 v6, 0x0

    .line 52
    if-eqz v3, :cond_8

    .line 53
    .line 54
    array-length v7, v2

    .line 55
    new-array v7, v7, [Ljava/lang/String;

    .line 56
    .line 57
    iput-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 58
    .line 59
    const-class v7, Ljava/lang/String;

    .line 60
    .line 61
    if-eq v3, v7, :cond_3

    .line 62
    .line 63
    array-length v8, v2

    .line 64
    new-array v8, v8, [J

    .line 65
    .line 66
    iput-object v8, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲兰世:[J

    .line 67
    .line 68
    :cond_3
    move v8, v6

    .line 69
    :goto_1
    array-length v9, v2

    .line 70
    if-ge v8, v9, :cond_8

    .line 71
    .line 72
    aget-object v9, v2, v8

    .line 73
    .line 74
    :try_start_0
    instance-of v10, v1, Ljava/lang/reflect/Field;

    .line 75
    .line 76
    if-eqz v10, :cond_4

    .line 77
    .line 78
    move-object v10, v1

    .line 79
    check-cast v10, Ljava/lang/reflect/Field;

    .line 80
    .line 81
    invoke-virtual {v10, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move-object v10, v1

    .line 87
    check-cast v10, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-virtual {v10, v9, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :goto_2
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 94
    .line 95
    if-ne v3, v7, :cond_5

    .line 96
    .line 97
    :try_start_1
    check-cast v9, Ljava/lang/String;

    .line 98
    .line 99
    aput-object v9, v10, v8

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_5
    if-nez v9, :cond_6

    .line 103
    .line 104
    move-object v11, v5

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    :goto_3
    aput-object v11, v10, v8

    .line 111
    .line 112
    instance-of v10, v9, Ljava/lang/Number;

    .line 113
    .line 114
    if-eqz v10, :cond_7

    .line 115
    .line 116
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲兰世:[J

    .line 117
    .line 118
    check-cast v9, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v11

    .line 124
    aput-wide v11, v10, v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    .line 126
    :catch_0
    :cond_7
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_8
    if-eqz p2, :cond_9

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-ne v1, v4, :cond_9

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    aget-object v5, v0, v6

    .line 142
    .line 143
    :cond_9
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 150
    .line 151
    .line 152
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

    .line 153
    .line 154
    move-object/from16 p1, p5

    .line 155
    .line 156
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Enum;

    .line 157
    .line 158
    move-object/from16 p1, p6

    .line 159
    .line 160
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世兰哲:[J

    .line 161
    .line 162
    return-void
.end method

.method public static 飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-class v0, Ljava/util/List;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-class p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, " parses error, JSONReader not forward when field type belongs to collection to avoid OOM"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 9
    .line 10
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 11
    .line 12
    if-eqz v5, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :try_start_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object v0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    goto :goto_0

    .line 31
    :catch_1
    move-exception v0

    .line 32
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v6, "create enum error, enumClass "

    .line 35
    .line 36
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v4, ", paramValue "

    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const-string v6, "parse enum error, class "

    .line 71
    .line 72
    iget-object v7, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Enum;

    .line 73
    .line 74
    iget-object v8, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Member;

    .line 78
    .line 79
    iget-object v11, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲兰世:[J

    .line 80
    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v10, :cond_2

    .line 88
    .line 89
    if-ltz v0, :cond_1

    .line 90
    .line 91
    array-length v5, v7

    .line 92
    if-ge v0, v5, :cond_1

    .line 93
    .line 94
    aget-object v0, v7, v0

    .line 95
    .line 96
    move-object v3, v0

    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "."

    .line 104
    .line 105
    const-string v4, "No enum ordinal "

    .line 106
    .line 107
    invoke-static {v0, v1, v2, v4}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v3

    .line 111
    :cond_2
    if-eqz v11, :cond_4

    .line 112
    .line 113
    :goto_1
    array-length v5, v11

    .line 114
    if-ge v9, v5, :cond_4

    .line 115
    .line 116
    aget-wide v12, v11, v9

    .line 117
    .line 118
    int-to-long v14, v0

    .line 119
    cmp-long v5, v12, v14

    .line 120
    .line 121
    if-nez v5, :cond_3

    .line 122
    .line 123
    aget-object v5, v8, v9

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    move-object v5, v3

    .line 130
    :goto_2
    if-nez v5, :cond_11

    .line 131
    .line 132
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 133
    .line 134
    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰楪哲(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_5

    .line 139
    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v4, ", "

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-interface {v10}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v4, " "

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object v3

    .line 186
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-nez v5, :cond_12

    .line 191
    .line 192
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 193
    .line 194
    if-eqz v5, :cond_9

    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-eqz v12, :cond_9

    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_3
    array-length v7, v5

    .line 207
    if-ge v9, v7, :cond_8

    .line 208
    .line 209
    aget-object v7, v5, v9

    .line 210
    .line 211
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-eqz v7, :cond_7

    .line 216
    .line 217
    aget-object v5, v8, v9

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    move-object v5, v3

    .line 224
    :goto_4
    if-nez v5, :cond_f

    .line 225
    .line 226
    if-eqz v10, :cond_f

    .line 227
    .line 228
    :try_start_1
    invoke-static {v4, v0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 229
    .line 230
    .line 231
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 232
    goto :goto_6

    .line 233
    :cond_9
    if-eqz v11, :cond_c

    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-eqz v5, :cond_c

    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    :goto_5
    array-length v5, v11

    .line 246
    if-ge v9, v5, :cond_b

    .line 247
    .line 248
    aget-wide v12, v11, v9

    .line 249
    .line 250
    int-to-long v14, v0

    .line 251
    cmp-long v5, v12, v14

    .line 252
    .line 253
    if-nez v5, :cond_a

    .line 254
    .line 255
    aget-object v0, v8, v9

    .line 256
    .line 257
    move-object v5, v0

    .line 258
    goto :goto_6

    .line 259
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_b
    move-object v5, v3

    .line 263
    goto :goto_6

    .line 264
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()J

    .line 265
    .line 266
    .line 267
    move-result-wide v8

    .line 268
    const-wide v10, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    cmp-long v5, v8, v10

    .line 274
    .line 275
    if-nez v5, :cond_d

    .line 276
    .line 277
    return-object v3

    .line 278
    :cond_d
    invoke-virtual {v0, v8, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    if-nez v5, :cond_e

    .line 283
    .line 284
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲()J

    .line 285
    .line 286
    .line 287
    move-result-wide v8

    .line 288
    invoke-virtual {v0, v8, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    move-object v5, v0

    .line 293
    :cond_e
    if-nez v5, :cond_f

    .line 294
    .line 295
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Z

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    if-eqz v8, :cond_f

    .line 304
    .line 305
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-ltz v0, :cond_f

    .line 310
    .line 311
    array-length v8, v7

    .line 312
    if-ge v0, v8, :cond_f

    .line 313
    .line 314
    aget-object v5, v7, v0

    .line 315
    .line 316
    :catch_2
    :cond_f
    :goto_6
    if-nez v5, :cond_11

    .line 317
    .line 318
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 319
    .line 320
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰楪哲(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_10

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_10
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    new-instance v2, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v4, ", value "

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return-object v3

    .line 363
    :cond_11
    :goto_7
    move-object v3, v5

    .line 364
    :cond_12
    :goto_8
    if-nez v3, :cond_13

    .line 365
    .line 366
    iget v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 367
    .line 368
    if-ne v0, v2, :cond_13

    .line 369
    .line 370
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)V

    .line 371
    .line 372
    .line 373
    :cond_13
    return-object v3
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v7, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    const/16 v2, -0x6e

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/Class;

    .line 11
    .line 12
    if-ne v8, v2, :cond_2

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move-wide v4, p4

    .line 18
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v10, v6

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    if-eq v2, p0, :cond_3

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    move-object v4, p3

    .line 29
    move-wide v5, p4

    .line 30
    move-object v1, v2

    .line 31
    move-object v2, p1

    .line 32
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰楪哲(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, "not support enumType : "

    .line 49
    .line 50
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v9

    .line 72
    :cond_2
    move-object v10, v6

    .line 73
    :cond_3
    :goto_0
    const/16 v2, -0x10

    .line 74
    .line 75
    if-lt v8, v2, :cond_6

    .line 76
    .line 77
    const/16 v2, 0x48

    .line 78
    .line 79
    if-gt v8, v2, :cond_6

    .line 80
    .line 81
    const/16 v2, 0x2f

    .line 82
    .line 83
    if-gt v8, v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    :goto_1
    if-ltz v8, :cond_5

    .line 94
    .line 95
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世哲兰:[Ljava/lang/Enum;

    .line 96
    .line 97
    array-length v2, v0

    .line 98
    if-ge v8, v2, :cond_5

    .line 99
    .line 100
    aget-object v0, v0, v8

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {v10}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "."

    .line 108
    .line 109
    const-string v2, "No enum ordinal "

    .line 110
    .line 111
    invoke-static {v8, v0, v1, v2}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v9

    .line 115
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    return-object v9

    .line 122
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-nez v2, :cond_8

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲()J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    move-object v0, v2

    .line 142
    :goto_2
    if-nez v0, :cond_9

    .line 143
    .line 144
    iget v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 145
    .line 146
    if-ne v1, v7, :cond_9

    .line 147
    .line 148
    invoke-static {p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Type;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲世兰(J)Ljava/lang/Enum;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Enum;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世兰哲:[J

    .line 8
    .line 9
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-gez p0, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    aget-object p0, v1, p0

    .line 17
    .line 18
    return-object p0
.end method
