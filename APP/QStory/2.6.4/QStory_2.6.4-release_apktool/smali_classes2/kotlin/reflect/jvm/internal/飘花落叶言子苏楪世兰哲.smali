.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/List;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

.field public final 飘花落叶言子楪苏世兰哲:Z

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/List;

.field public final 飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/SignatureKind;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 17
    .line 18
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 23
    .line 24
    iput-object p5, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 25
    .line 26
    iput-object p6, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/List;

    .line 27
    .line 28
    iput-object p7, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 29
    .line 30
    iput-boolean p8, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 31
    .line 32
    iput-object p9, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 33
    .line 34
    sget-object p0, Lkotlin/reflect/jvm/internal/SignatureKind;->FIELD_IN_JAVA_CLASS:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 35
    .line 36
    const/16 p3, 0x27

    .line 37
    .line 38
    if-ne p1, p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p7, "Inconsistent combination of EquatableCallableSignature values. kind: "

    .line 62
    .line 63
    invoke-direct {p0, p7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    invoke-interface {p6}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p5

    .line 81
    const-string p6, ", kotlinParameterTypes.isEmpty(): "

    .line 82
    .line 83
    invoke-virtual {p0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, ",typeParameters.isEmpty(): "

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, ", javaParameterTypesIfFunction.isEmpty(): "

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, ".For member: \'"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_1
    :goto_0
    invoke-interface {p6}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-interface {p7}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-ne p0, p1, :cond_2

    .line 139
    .line 140
    return-void

    .line 141
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string p1, "javaParameterTypesIfFunction.size ("

    .line 144
    .line 145
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p6}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p1, ") and javaGenericParameterTypesIfFunction.size ("

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-interface {p7}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p1, ") must be equal. For member: \'"

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-static {p0, p2, p3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    const/4 p0, 0x0

    .line 180
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_d

    .line 8
    .line 9
    :cond_0
    instance-of v2, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    :goto_0
    const/16 v16, 0x0

    .line 14
    .line 15
    goto/16 :goto_8

    .line 16
    .line 17
    :cond_1
    check-cast v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;

    .line 18
    .line 19
    iget-object v2, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 20
    .line 21
    iget-object v4, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/List;

    .line 22
    .line 23
    iget-object v5, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v7, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    iget-object v8, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 30
    .line 31
    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    iget-object v9, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v7, :cond_1e

    .line 38
    .line 39
    iget-object v7, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 40
    .line 41
    iget-object v10, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 42
    .line 43
    if-eq v10, v7, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-boolean v7, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 47
    .line 48
    iget-boolean v11, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 49
    .line 50
    if-eq v7, v11, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    iget-object v7, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    if-eq v11, v12, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    sget-object v11, Lkotlin/reflect/jvm/internal/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/飘花落叶言子世兰哲苏楪;

    .line 67
    .line 68
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/4 v11, 0x0

    .line 73
    if-eqz v8, :cond_11

    .line 74
    .line 75
    sget-object v8, Lkotlin/reflect/jvm/internal/SignatureKind;->FUNCTION:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 76
    .line 77
    if-ne v10, v8, :cond_11

    .line 78
    .line 79
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v8, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v2, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eq v8, v10, :cond_6

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-ne v8, v10, :cond_10

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const/4 v10, 0x0

    .line 118
    :goto_1
    if-ge v10, v8, :cond_1d

    .line 119
    .line 120
    iget-object v12, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    check-cast v12, Ljava/lang/reflect/Type;

    .line 127
    .line 128
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    check-cast v13, Ljava/lang/Class;

    .line 133
    .line 134
    iget-object v14, v1, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v14, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    check-cast v14, Ljava/lang/reflect/Type;

    .line 141
    .line 142
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    check-cast v15, Ljava/lang/Class;

    .line 147
    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    instance-of v3, v12, Ljava/lang/reflect/TypeVariable;

    .line 151
    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    check-cast v12, Ljava/lang/reflect/TypeVariable;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    move-object v12, v11

    .line 158
    :goto_2
    if-eqz v12, :cond_8

    .line 159
    .line 160
    invoke-interface {v12}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    goto :goto_3

    .line 165
    :cond_8
    move-object v3, v11

    .line 166
    :goto_3
    instance-of v3, v3, Ljava/lang/Class;

    .line 167
    .line 168
    instance-of v12, v14, Ljava/lang/reflect/TypeVariable;

    .line 169
    .line 170
    if-eqz v12, :cond_9

    .line 171
    .line 172
    check-cast v14, Ljava/lang/reflect/TypeVariable;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    move-object v14, v11

    .line 176
    :goto_4
    if-eqz v14, :cond_a

    .line 177
    .line 178
    invoke-interface {v14}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    goto :goto_5

    .line 183
    :cond_a
    move-object v12, v11

    .line 184
    :goto_5
    instance-of v12, v12, Ljava/lang/Class;

    .line 185
    .line 186
    if-nez v3, :cond_c

    .line 187
    .line 188
    if-eqz v12, :cond_b

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_b
    invoke-static {v13, v15}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_e

    .line 196
    .line 197
    goto/16 :goto_8

    .line 198
    .line 199
    :cond_c
    :goto_6
    invoke-virtual {v13}, Ljava/lang/Class;->isPrimitive()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eq v3, v12, :cond_d

    .line 208
    .line 209
    goto/16 :goto_8

    .line 210
    .line 211
    :cond_d
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 216
    .line 217
    invoke-static {v3, v9}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Ljava/lang/String;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    check-cast v12, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 226
    .line 227
    invoke-static {v12, v5}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Ljava/lang/String;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 228
    .line 229
    .line 230
    move-result-object v12

    .line 231
    invoke-static {v3, v12}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 232
    .line 233
    .line 234
    move-result v13

    .line 235
    if-eqz v13, :cond_f

    .line 236
    .line 237
    invoke-static {v12, v3}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_f

    .line 242
    .line 243
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_f
    return v16

    .line 247
    :cond_10
    const/16 v16, 0x0

    .line 248
    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v1, "javaParameterTypesIfFunction.size ("

    .line 252
    .line 253
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v1, ") and kotlinParameterTypes.size ("

    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v1, ") must be equal for member \'"

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const/16 v1, 0x27

    .line 281
    .line 282
    invoke-static {v0, v9, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return v16

    .line 290
    :cond_11
    const/16 v16, 0x0

    .line 291
    .line 292
    invoke-static {v9, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-nez v1, :cond_12

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_12
    iget-object v0, v0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 300
    .line 301
    invoke-static {v0, v2}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/util/List;Ljava/util/List;)Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    if-nez v1, :cond_13

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_13
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    move/from16 v4, v16

    .line 313
    .line 314
    :goto_7
    if-ge v4, v3, :cond_1a

    .line 315
    .line 316
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    check-cast v8, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;

    .line 321
    .line 322
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v10

    .line 326
    check-cast v10, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;

    .line 327
    .line 328
    invoke-virtual {v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;->getUpperBounds()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    invoke-virtual {v10}, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;->getUpperBounds()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    if-eq v12, v13, :cond_14

    .line 345
    .line 346
    :goto_8
    return v16

    .line 347
    :cond_14
    invoke-virtual {v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;->getUpperBounds()Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    new-instance v12, Ljava/util/ArrayList;

    .line 352
    .line 353
    const/16 v13, 0xa

    .line 354
    .line 355
    invoke-static {v8, v13}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v13

    .line 370
    if-eqz v13, :cond_16

    .line 371
    .line 372
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    check-cast v13, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 377
    .line 378
    sget-object v14, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;

    .line 379
    .line 380
    sget-object v14, Lkotlin/reflect/KVariance;->INVARIANT:Lkotlin/reflect/KVariance;

    .line 381
    .line 382
    invoke-virtual {v1, v13, v14}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/KVariance;)Lkotlin/reflect/飘花落叶言子世楪哲兰苏;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    iget-object v13, v13, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 387
    .line 388
    if-eqz v13, :cond_15

    .line 389
    .line 390
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_15
    invoke-static {v9}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    throw v11

    .line 398
    :cond_16
    new-instance v8, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰世哲;

    .line 399
    .line 400
    invoke-direct {v8, v9}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰世哲;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-static {v12, v8}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰世楪苏(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    invoke-virtual {v10}, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;->getUpperBounds()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    new-instance v12, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰世哲;

    .line 412
    .line 413
    invoke-direct {v12, v5}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰世哲;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v10, v12}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰世楪苏(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    invoke-static {v8, v10}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世苏哲楪(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    if-eqz v10, :cond_17

    .line 429
    .line 430
    goto :goto_b

    .line 431
    :cond_17
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    if-eqz v10, :cond_19

    .line 440
    .line 441
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v10

    .line 445
    check-cast v10, Lkotlin/Pair;

    .line 446
    .line 447
    invoke-virtual {v10}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    check-cast v12, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 452
    .line 453
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v10

    .line 457
    check-cast v10, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 458
    .line 459
    invoke-static {v12, v10}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 460
    .line 461
    .line 462
    move-result v13

    .line 463
    if-eqz v13, :cond_18

    .line 464
    .line 465
    invoke-static {v10, v12}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    if-eqz v10, :cond_18

    .line 470
    .line 471
    goto :goto_a

    .line 472
    :cond_18
    return v16

    .line 473
    :cond_19
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 474
    .line 475
    goto/16 :goto_7

    .line 476
    .line 477
    :cond_1a
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    move/from16 v2, v16

    .line 482
    .line 483
    :goto_c
    if-ge v2, v0, :cond_1d

    .line 484
    .line 485
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    check-cast v3, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 490
    .line 491
    sget-object v4, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;

    .line 492
    .line 493
    sget-object v4, Lkotlin/reflect/KVariance;->INVARIANT:Lkotlin/reflect/KVariance;

    .line 494
    .line 495
    invoke-virtual {v1, v3, v4}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/KVariance;)Lkotlin/reflect/飘花落叶言子世楪哲兰苏;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    iget-object v3, v3, Lkotlin/reflect/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 500
    .line 501
    if-eqz v3, :cond_1c

    .line 502
    .line 503
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    check-cast v4, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 508
    .line 509
    invoke-static {v3, v4}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    if-eqz v5, :cond_1b

    .line 514
    .line 515
    invoke-static {v4, v3}, Lkotlin/reflect/full/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lkotlin/reflect/飘花落叶言子世楪苏兰哲;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)Z

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    if-eqz v3, :cond_1b

    .line 520
    .line 521
    add-int/lit8 v2, v2, 0x1

    .line 522
    .line 523
    goto :goto_c

    .line 524
    :cond_1b
    return v16

    .line 525
    :cond_1c
    invoke-static {v9}, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    throw v11

    .line 529
    :cond_1d
    :goto_d
    const/4 v0, 0x1

    .line 530
    return v0

    .line 531
    :cond_1e
    const/16 v16, 0x0

    .line 532
    .line 533
    const-string v0, "Equality modes must be the same for member \'"

    .line 534
    .line 535
    const-string v1, "\'. Please recreate signatures on inheritance"

    .line 536
    .line 537
    invoke-static {v0, v9, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    return v16
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    sget-object v1, Lkotlin/reflect/jvm/internal/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/飘花落叶言子世兰哲苏楪;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lkotlin/reflect/jvm/internal/SignatureKind;->FUNCTION:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 16
    .line 17
    if-ne v3, v0, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    iget-boolean v4, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 23
    .line 24
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-ne v0, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 41
    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    const-string p0, ""

    .line 45
    .line 46
    :cond_1
    filled-new-array {v3, v0, v1, p0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_2
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 70
    .line 71
    filled-new-array {v3, v0, v1, p0}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    :cond_3
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 81
    .line 82
    .line 83
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "EquatableCallableSignature(kind="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/SignatureKind;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", name="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", jvmNameIfFunction="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", typeParameters="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", kotlinParameterTypes="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", javaParameterTypesIfFunction="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", javaGenericParameterTypesIfFunction="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", isStatic="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", equalityMode="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏哲世兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 p0, 0x29

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
