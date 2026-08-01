.class public final L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/google/gson/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/List;

.field public final 飘花落叶言子楪兰世苏哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;


# direct methods
.method public constructor <init>(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lcom/google/gson/飘花落叶言子楪世苏哲兰;Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    iput-object p4, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    iput-object p5, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Class "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " declares multiple JSON fields named \'"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "\'; conflict is caused by fields "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " and "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "\nSee "

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "duplicate-fields"

    .line 55
    .line 56
    const-string p1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljava/lang/reflect/Member;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    :cond_0
    sget-object v0, Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;

    .line 16
    .line 17
    invoke-virtual {v0, p0, p1}, Lcom/google/gson/internal/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 p0, 0x1

    .line 25
    invoke-static {p1, p0}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 30
    .line 31
    const-string v0, " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Field;Z)Z
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x88

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    and-int/2addr v0, v1

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :goto_0
    move p0, v1

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p0, p0, Lcom/google/gson/internal/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_5

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0

    .line 65
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 66
    :goto_3
    xor-int/2addr p0, v1

    .line 67
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;ZZ)L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    move/from16 v2, p4

    .line 27
    .line 28
    move-object v10, v7

    .line 29
    :goto_0
    iget-object v11, v1, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 30
    .line 31
    const-class v1, Ljava/lang/Object;

    .line 32
    .line 33
    if-eq v10, v1, :cond_19

    .line 34
    .line 35
    invoke-virtual {v10}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    const/4 v13, 0x1

    .line 40
    const/4 v14, 0x0

    .line 41
    if-eq v10, v7, :cond_3

    .line 42
    .line 43
    array-length v1, v12

    .line 44
    if-lez v1, :cond_3

    .line 45
    .line 46
    iget-object v1, v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/util/List;)Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v2, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->BLOCK_ALL:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 53
    .line 54
    if-eq v1, v2, :cond_2

    .line 55
    .line 56
    sget-object v2, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->BLOCK_INACCESSIBLE:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 57
    .line 58
    if-ne v1, v2, :cond_1

    .line 59
    .line 60
    move v1, v13

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move v1, v14

    .line 63
    :goto_1
    move/from16 v18, v1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    new-instance v0, Lcom/google/gson/JsonIOException;

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, "ReflectionAccessFilter does not permit using reflection for "

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v2, " (supertype of "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v2, "). Register a TypeAdapter for this type or adjust the access filter."

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :cond_3
    move/from16 v18, v2

    .line 100
    .line 101
    :goto_2
    array-length v15, v12

    .line 102
    move v1, v14

    .line 103
    :goto_3
    if-ge v1, v15, :cond_18

    .line 104
    .line 105
    aget-object v2, v12, v1

    .line 106
    .line 107
    invoke-virtual {v0, v2, v13}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Field;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v24

    .line 111
    invoke-virtual {v0, v2, v14}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Field;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v24, :cond_4

    .line 116
    .line 117
    if-nez v3, :cond_4

    .line 118
    .line 119
    move-object/from16 v3, p1

    .line 120
    .line 121
    move/from16 v27, v1

    .line 122
    .line 123
    move/from16 p2, v13

    .line 124
    .line 125
    move v2, v15

    .line 126
    goto/16 :goto_11

    .line 127
    .line 128
    :cond_4
    const-class v4, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;

    .line 129
    .line 130
    const/16 v25, 0x0

    .line 131
    .line 132
    if-eqz p5, :cond_9

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_5

    .line 143
    .line 144
    move/from16 v26, v14

    .line 145
    .line 146
    :goto_4
    move-object/from16 v19, v25

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_5
    sget-object v5, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 150
    .line 151
    invoke-virtual {v5, v10, v2}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    if-nez v18, :cond_6

    .line 156
    .line 157
    invoke-static {v5}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/AccessibleObject;)V

    .line 158
    .line 159
    .line 160
    :cond_6
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-eqz v6, :cond_8

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    invoke-static {v5, v14}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 178
    .line 179
    const-string v2, "@SerializedName on "

    .line 180
    .line 181
    const-string v3, " is not supported"

    .line 182
    .line 183
    invoke-static {v2, v0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {v1, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v1

    .line 191
    :cond_8
    :goto_5
    move/from16 v26, v3

    .line 192
    .line 193
    move-object/from16 v19, v5

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    move/from16 v26, v3

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :goto_6
    if-nez v18, :cond_a

    .line 200
    .line 201
    if-nez v19, :cond_a

    .line 202
    .line 203
    invoke-static {v2}, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/AccessibleObject;)V

    .line 204
    .line 205
    .line 206
    :cond_a
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    new-instance v5, Ljava/util/HashMap;

    .line 211
    .line 212
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-static {v11, v10, v3, v5}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;

    .line 224
    .line 225
    if-nez v4, :cond_b

    .line 226
    .line 227
    iget-object v4, v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/google/gson/飘花落叶言子楪世苏哲兰;

    .line 228
    .line 229
    invoke-interface {v4, v2}, Lcom/google/gson/飘花落叶言子楪世苏哲兰;->translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-interface {v4, v2}, Lcom/google/gson/飘花落叶言子楪世苏哲兰;->alternateNames(Ljava/lang/reflect/Field;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    goto :goto_7

    .line 238
    :cond_b
    invoke-interface {v4}, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->value()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-interface {v4}, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏兰哲;->alternate()[Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    :goto_7
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_c

    .line 255
    .line 256
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    move/from16 p2, v13

    .line 261
    .line 262
    move-object v13, v4

    .line 263
    goto :goto_8

    .line 264
    :cond_c
    new-instance v6, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    move/from16 p2, v13

    .line 271
    .line 272
    add-int/lit8 v13, v16, 0x1

    .line 273
    .line 274
    invoke-direct {v6, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 281
    .line 282
    .line 283
    move-object v13, v6

    .line 284
    :goto_8
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    move-object/from16 v16, v4

    .line 289
    .line 290
    check-cast v16, Ljava/lang/String;

    .line 291
    .line 292
    new-instance v4, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;

    .line 293
    .line 294
    invoke-direct {v4, v3}, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Type;)V

    .line 295
    .line 296
    .line 297
    iget-object v3, v4, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 298
    .line 299
    if-eqz v3, :cond_d

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_d

    .line 306
    .line 307
    move/from16 v22, p2

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_d
    move/from16 v22, v14

    .line 311
    .line 312
    :goto_9
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    if-eqz v5, :cond_e

    .line 321
    .line 322
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_e

    .line 327
    .line 328
    move/from16 v23, p2

    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_e
    move/from16 v23, v14

    .line 332
    .line 333
    :goto_a
    const-class v3, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;

    .line 334
    .line 335
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    move-object v5, v3

    .line 340
    check-cast v5, L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;

    .line 341
    .line 342
    if-eqz v5, :cond_f

    .line 343
    .line 344
    move-object/from16 v17, v2

    .line 345
    .line 346
    iget-object v2, v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 347
    .line 348
    const/4 v6, 0x0

    .line 349
    move v3, v1

    .line 350
    iget-object v1, v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;

    .line 351
    .line 352
    move/from16 v27, v3

    .line 353
    .line 354
    move-object/from16 v3, p1

    .line 355
    .line 356
    invoke-virtual/range {v1 .. v6}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;L飘花落叶言楪哲子世兰苏/飘花落叶言子楪世苏哲兰;Z)Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    goto :goto_b

    .line 361
    :cond_f
    move-object/from16 v3, p1

    .line 362
    .line 363
    move/from16 v27, v1

    .line 364
    .line 365
    move-object/from16 v17, v2

    .line 366
    .line 367
    move-object/from16 v1, v25

    .line 368
    .line 369
    :goto_b
    if-eqz v1, :cond_10

    .line 370
    .line 371
    move/from16 v2, p2

    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_10
    move v2, v14

    .line 375
    :goto_c
    if-nez v1, :cond_11

    .line 376
    .line 377
    invoke-virtual {v3, v4}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏兰世;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :cond_11
    if-eqz v24, :cond_13

    .line 382
    .line 383
    if-eqz v2, :cond_12

    .line 384
    .line 385
    move-object v2, v1

    .line 386
    goto :goto_d

    .line 387
    :cond_12
    new-instance v2, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏世兰;

    .line 388
    .line 389
    iget-object v4, v4, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 390
    .line 391
    invoke-direct {v2, v3, v1, v4}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪哲苏世兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;Lcom/google/gson/飘花落叶言子楪哲苏兰世;Ljava/lang/reflect/Type;)V

    .line 392
    .line 393
    .line 394
    :goto_d
    move-object/from16 v20, v2

    .line 395
    .line 396
    :goto_e
    move v2, v15

    .line 397
    goto :goto_f

    .line 398
    :cond_13
    move-object/from16 v20, v1

    .line 399
    .line 400
    goto :goto_e

    .line 401
    :goto_f
    new-instance v15, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;

    .line 402
    .line 403
    move-object/from16 v21, v1

    .line 404
    .line 405
    invoke-direct/range {v15 .. v23}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Lcom/google/gson/飘花落叶言子楪哲苏兰世;Lcom/google/gson/飘花落叶言子楪哲苏兰世;ZZ)V

    .line 406
    .line 407
    .line 408
    move-object/from16 v4, v16

    .line 409
    .line 410
    move-object/from16 v1, v17

    .line 411
    .line 412
    if-eqz v26, :cond_15

    .line 413
    .line 414
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v6

    .line 422
    if-eqz v6, :cond_15

    .line 423
    .line 424
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    check-cast v6, Ljava/lang/String;

    .line 429
    .line 430
    invoke-interface {v8, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v13

    .line 434
    check-cast v13, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;

    .line 435
    .line 436
    if-nez v13, :cond_14

    .line 437
    .line 438
    goto :goto_10

    .line 439
    :cond_14
    iget-object v0, v13, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Field;

    .line 440
    .line 441
    invoke-static {v7, v6, v0, v1}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 442
    .line 443
    .line 444
    throw v25

    .line 445
    :cond_15
    if-eqz v24, :cond_17

    .line 446
    .line 447
    invoke-interface {v9, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    check-cast v5, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;

    .line 452
    .line 453
    if-nez v5, :cond_16

    .line 454
    .line 455
    goto :goto_11

    .line 456
    :cond_16
    iget-object v0, v5, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Field;

    .line 457
    .line 458
    invoke-static {v7, v4, v0, v1}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 459
    .line 460
    .line 461
    throw v25

    .line 462
    :cond_17
    :goto_11
    add-int/lit8 v1, v27, 0x1

    .line 463
    .line 464
    move/from16 v13, p2

    .line 465
    .line 466
    move v15, v2

    .line 467
    goto/16 :goto_3

    .line 468
    .line 469
    :cond_18
    move-object/from16 v3, p1

    .line 470
    .line 471
    invoke-virtual {v10}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    new-instance v2, Ljava/util/HashMap;

    .line 476
    .line 477
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 478
    .line 479
    .line 480
    invoke-static {v11, v10, v1, v2}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    new-instance v2, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;

    .line 485
    .line 486
    invoke-direct {v2, v1}, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Type;)V

    .line 487
    .line 488
    .line 489
    iget-object v10, v2, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 490
    .line 491
    move-object v1, v2

    .line 492
    move/from16 v2, v18

    .line 493
    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_19
    new-instance v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;

    .line 497
    .line 498
    new-instance v1, Ljava/util/ArrayList;

    .line 499
    .line 500
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 505
    .line 506
    .line 507
    invoke-direct {v0, v8, v1}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 508
    .line 509
    .line 510
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;)Lcom/google/gson/飘花落叶言子楪哲苏兰世;
    .locals 7

    .line 1
    iget-object v3, p2, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Class;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Class;->isLocalClass()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    :cond_1
    new-instance p0, Lcom/google/gson/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    invoke-direct {p0, p1}, Lcom/google/gson/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    iget-object v0, p0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/util/List;)Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->BLOCK_ALL:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 51
    .line 52
    if-eq v0, v1, :cond_5

    .line 53
    .line 54
    sget-object v1, Lcom/google/gson/ReflectionAccessFilter$FilterResult;->BLOCK_INACCESSIBLE:Lcom/google/gson/ReflectionAccessFilter$FilterResult;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    if-ne v0, v1, :cond_3

    .line 58
    .line 59
    move v4, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    move v4, v0

    .line 63
    :goto_0
    sget-object v0, L飘花落叶言楪哲子兰世苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    invoke-virtual {v0, v3}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    new-instance v6, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏哲兰;

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    move-object v0, p0

    .line 75
    move-object v1, p1

    .line 76
    move-object v2, p2

    .line 77
    invoke-virtual/range {v0 .. v5}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;ZZ)L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v6, v3, p0, v4}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Class;L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;Z)V

    .line 82
    .line 83
    .line 84
    return-object v6

    .line 85
    :cond_4
    move-object v0, p0

    .line 86
    move-object v1, p1

    .line 87
    move p0, v2

    .line 88
    move-object v2, p2

    .line 89
    iget-object p1, v0, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 90
    .line 91
    invoke-virtual {p1, v2, p0}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;Z)Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance p1, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲世苏;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    invoke-virtual/range {v0 .. v5}, L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Lcom/google/gson/飘花落叶言子楪苏世哲兰;L飘花落叶言楪哲世子苏兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Class;ZZ)L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-direct {p1, p0, p2}, L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲世苏;-><init>(Lcom/google/gson/internal/飘花落叶言子楪苏兰哲世;L飘花落叶言楪哲子苏世兰/飘花落叶言子楪兰哲苏世;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_5
    new-instance p0, Lcom/google/gson/JsonIOException;

    .line 107
    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string p2, "ReflectionAccessFilter does not permit using reflection for "

    .line 111
    .line 112
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p2, ". Register a TypeAdapter for this type or adjust the access filter."

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {p0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p0
.end method
