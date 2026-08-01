.class public final L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;)V
    .locals 7

    .line 183
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 185
    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    .line 186
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 187
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 188
    invoke-direct/range {v0 .. v5}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 17
    .line 18
    iput-object p2, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 19
    .line 20
    iput-object p3, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 21
    .line 22
    iput-object p5, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 p2, 0xa

    .line 27
    .line 28
    invoke-static {p5, p2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result p5

    .line 43
    if-eqz p5, :cond_0

    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    check-cast p5, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 52
    .line 53
    .line 54
    move-result-object p5

    .line 55
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput-object p1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object p1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 62
    .line 63
    new-instance p3, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-static {p1, p2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result p5

    .line 80
    if-eqz p5, :cond_2

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    check-cast p5, Ljava/lang/reflect/Method;

    .line 87
    .line 88
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p5

    .line 92
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/structure/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/Map;

    .line 96
    .line 97
    invoke-interface {v0, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/Class;

    .line 102
    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    move-object p5, v0

    .line 107
    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    iput-object p3, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 112
    .line 113
    iget-object p1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 114
    .line 115
    new-instance p3, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-static {p1, p2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_3

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    check-cast p2, Ljava/lang/reflect/Method;

    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_3
    iput-object p3, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 149
    .line 150
    iget-object p1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 151
    .line 152
    sget-object p2, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;->POSITIONAL_CALL:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 153
    .line 154
    if-ne p1, p2, :cond_5

    .line 155
    .line 156
    sget-object p1, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;->JAVA:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;

    .line 157
    .line 158
    if-ne p4, p1, :cond_5

    .line 159
    .line 160
    iget-object p0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 161
    .line 162
    const-string p1, "value"

    .line 163
    .line 164
    invoke-static {p0, p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世兰楪哲(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_4

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_4
    const-string p0, "Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."

    .line 176
    .line 177
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const/4 p0, 0x0

    .line 181
    throw p0

    .line 182
    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    array-length v4, v1

    .line 15
    if-ne v3, v4, :cond_d

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    array-length v3, v1

    .line 20
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    array-length v3, v1

    .line 24
    const/4 v4, 0x0

    .line 25
    move v6, v4

    .line 26
    move v7, v6

    .line 27
    :goto_0
    iget-object v8, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-ge v6, v3, :cond_c

    .line 30
    .line 31
    aget-object v9, v1, v6

    .line 32
    .line 33
    add-int/lit8 v10, v7, 0x1

    .line 34
    .line 35
    iget-object v11, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 36
    .line 37
    if-nez v9, :cond_0

    .line 38
    .line 39
    iget-object v12, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 40
    .line 41
    sget-object v13, Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;->CALL_BY_NAME:Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;

    .line 42
    .line 43
    if-ne v12, v13, :cond_0

    .line 44
    .line 45
    iget-object v9, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    :goto_1
    const/16 v17, 0x0

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_0
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    check-cast v12, Ljava/lang/Class;

    .line 59
    .line 60
    instance-of v13, v9, Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v13, :cond_1

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    instance-of v13, v9, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 67
    .line 68
    if-eqz v13, :cond_3

    .line 69
    .line 70
    check-cast v9, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 71
    .line 72
    invoke-static {v9}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    :cond_2
    const/16 v17, 0x0

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    instance-of v13, v9, [Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz v13, :cond_2

    .line 82
    .line 83
    move-object v13, v9

    .line 84
    check-cast v13, [Ljava/lang/Object;

    .line 85
    .line 86
    instance-of v14, v13, [Ljava/lang/Class;

    .line 87
    .line 88
    if-eqz v14, :cond_4

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    instance-of v14, v13, [Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 94
    .line 95
    if-eqz v14, :cond_6

    .line 96
    .line 97
    check-cast v9, [Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 98
    .line 99
    new-instance v13, Ljava/util/ArrayList;

    .line 100
    .line 101
    array-length v14, v9

    .line 102
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    array-length v14, v9

    .line 106
    move v15, v4

    .line 107
    :goto_2
    if-ge v15, v14, :cond_5

    .line 108
    .line 109
    aget-object v16, v9, v15

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    invoke-static/range {v16 .. v16}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 v15, v15, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    const/16 v17, 0x0

    .line 124
    .line 125
    new-array v5, v4, [Ljava/lang/Class;

    .line 126
    .line 127
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    const/16 v17, 0x0

    .line 133
    .line 134
    move-object v9, v13

    .line 135
    :goto_3
    invoke-virtual {v12, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_7

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    :goto_4
    move-object/from16 v9, v17

    .line 143
    .line 144
    :goto_5
    if-nez v9, :cond_b

    .line 145
    .line 146
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Ljava/lang/Class;

    .line 157
    .line 158
    const-class v2, Ljava/lang/Class;

    .line 159
    .line 160
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_8

    .line 165
    .line 166
    const-class v1, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 167
    .line 168
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto :goto_6

    .line 175
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v3, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    const-class v1, [Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 192
    .line 193
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 194
    .line 195
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 201
    .line 202
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    :goto_6
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    sget-object v3, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 211
    .line 212
    const-class v4, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-interface {v4}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v2, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_a

    .line 227
    .line 228
    new-instance v2, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const/16 v4, 0x3c

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const/16 v1, 0x3e

    .line 268
    .line 269
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_7

    .line 277
    :cond_a
    invoke-interface {v1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :goto_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 282
    .line 283
    new-instance v3, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v4, "Argument #"

    .line 286
    .line 287
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const/16 v4, 0x20

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v0, " is not of the required type "

    .line 302
    .line 303
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v2

    .line 317
    :cond_b
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    add-int/lit8 v6, v6, 0x1

    .line 321
    .line 322
    move v7, v10

    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :cond_c
    invoke-static {v8, v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世兰苏楪(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子世苏哲兰楪(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iget-object v2, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 334
    .line 335
    iget-object v0, v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 336
    .line 337
    invoke-static {v0, v1, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    return-object v0

    .line 342
    :cond_d
    const/16 v17, 0x0

    .line 343
    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v3, "Callable expects "

    .line 347
    .line 348
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v2, " arguments, but "

    .line 359
    .line 360
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    array-length v1, v1

    .line 364
    const-string v2, " were provided."

    .line 365
    .line 366
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v17
.end method

.method public final getParameterTypes()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge 飘花落叶言子楪世苏兰哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final bridge synthetic 飘花落叶言子楪世苏哲兰()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
