.class public final Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/Set;


# direct methods
.method public constructor <init>([Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 12
    .line 13
    array-length v1, p1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 25
    .line 26
    array-length v0, p1

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    if-ge v1, v0, :cond_0

    .line 29
    .line 30
    aget-object v2, p1, v1

    .line 31
    .line 32
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 60
    .line 61
    :try_start_0
    iget-object v1, v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPackage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/protobuf/Descriptors$DescriptorValidationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_0
    move-exception p0

    .line 72
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    throw p0

    .line 77
    :cond_1
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;Z)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
    .locals 9

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0, p3}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    const/16 v1, 0x2e

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, -0x1

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    move-object v3, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-ne v5, v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, p1, p3}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v0, p1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    add-int/lit8 v6, v5, 0x1

    .line 57
    .line 58
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    sget-object v8, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->AGGREGATES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 69
    .line 70
    invoke-virtual {p0, v7, v8}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    if-eqz v7, :cond_8

    .line 75
    .line 76
    if-eq v1, v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {p0, v0, p3}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    sget-object v6, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->TYPES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 98
    .line 99
    if-ne p3, v6, :cond_4

    .line 100
    .line 101
    instance-of v6, v7, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 102
    .line 103
    if-nez v6, :cond_4

    .line 104
    .line 105
    instance-of v6, v7, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 106
    .line 107
    if-eqz v6, :cond_8

    .line 108
    .line 109
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    move-object v1, v7

    .line 114
    :goto_2
    if-nez v1, :cond_7

    .line 115
    .line 116
    iget-boolean v1, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏兰哲:Z

    .line 117
    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->TYPES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 121
    .line 122
    if-ne p3, v1, :cond_6

    .line 123
    .line 124
    sget-object p2, Lcom/google/protobuf/飘花落叶言楪世子哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/logging/Logger;

    .line 125
    .line 126
    new-instance p3, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v1, "The descriptor for type \""

    .line 129
    .line 130
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p1, "\" cannot be found and a placeholder is created for it"

    .line 137
    .line 138
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p2, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    if-eqz p4, :cond_5

    .line 149
    .line 150
    new-instance p1, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 151
    .line 152
    invoke-direct {p1, v0}, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    new-instance p1, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 157
    .line 158
    invoke-direct {p1, v0}, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-interface {p0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_6
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 172
    .line 173
    const-string p3, "\""

    .line 174
    .line 175
    const-string p4, "\" is not defined."

    .line 176
    .line 177
    invoke-static {p3, p1, p4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const/4 p3, 0x0

    .line 182
    invoke-direct {p0, p2, p1, p3}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :cond_7
    return-object v1

    .line 187
    :cond_8
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_1
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲世苏:[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;)Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->ALL_SYMBOLS:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 12
    .line 13
    if-eq p2, v1, :cond_2

    .line 14
    .line 15
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->TYPES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 16
    .line 17
    if-ne p2, v1, :cond_1

    .line 18
    .line 19
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :cond_0
    return-object v0

    .line 28
    :cond_1
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->AGGREGATES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 29
    .line 30
    if-ne p2, v1, :cond_3

    .line 31
    .line 32
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子兰苏世哲;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    :cond_2
    return-object v0

    .line 49
    :cond_3
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_8

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰哲苏世:Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->ALL_SYMBOLS:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 80
    .line 81
    if-eq p2, v1, :cond_7

    .line 82
    .line 83
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->TYPES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 84
    .line 85
    if-ne p2, v1, :cond_6

    .line 86
    .line 87
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    :cond_5
    return-object v0

    .line 96
    :cond_6
    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;->AGGREGATES_ONLY:Lcom/google/protobuf/Descriptors$FileDescriptorTables$SearchFilter;

    .line 97
    .line 98
    if-ne p2, v1, :cond_4

    .line 99
    .line 100
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 101
    .line 102
    if-nez v1, :cond_7

    .line 103
    .line 104
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子哲苏世兰;

    .line 105
    .line 106
    if-nez v1, :cond_7

    .line 107
    .line 108
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪子兰苏世哲;

    .line 109
    .line 110
    if-nez v1, :cond_7

    .line 111
    .line 112
    instance-of v1, v0, Lcom/google/protobuf/飘花落叶言楪世子苏兰哲;

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    :cond_7
    return-object v0

    .line 117
    :cond_8
    const/4 p0, 0x0

    .line 118
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_8

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v3, v1

    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const-string v5, "\""

    .line 19
    .line 20
    if-ge v3, v4, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v6, 0x61

    .line 27
    .line 28
    if-gt v6, v4, :cond_0

    .line 29
    .line 30
    const/16 v6, 0x7a

    .line 31
    .line 32
    if-le v4, v6, :cond_3

    .line 33
    .line 34
    :cond_0
    const/16 v6, 0x41

    .line 35
    .line 36
    if-gt v6, v4, :cond_1

    .line 37
    .line 38
    const/16 v6, 0x5a

    .line 39
    .line 40
    if-le v4, v6, :cond_3

    .line 41
    .line 42
    :cond_1
    const/16 v6, 0x5f

    .line 43
    .line 44
    if-eq v4, v6, :cond_3

    .line 45
    .line 46
    const/16 v6, 0x30

    .line 47
    .line 48
    if-gt v6, v4, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x39

    .line 51
    .line 52
    if-gt v4, v6, :cond_2

    .line 53
    .line 54
    if-lez v3, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 58
    .line 59
    const-string v1, "\" is not a valid identifier."

    .line 60
    .line 61
    invoke-static {v5, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p0, p1, v0, v2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 66
    .line 67
    .line 68
    throw p0

    .line 69
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 83
    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    invoke-virtual {p0, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    const-string v6, "\"."

    .line 98
    .line 99
    if-ne p0, v4, :cond_6

    .line 100
    .line 101
    const/16 p0, 0x2e

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    const/4 v3, -0x1

    .line 108
    if-ne p0, v3, :cond_5

    .line 109
    .line 110
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 111
    .line 112
    const-string v1, "\" is already defined."

    .line 113
    .line 114
    invoke-static {v5, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-direct {p0, p1, v0, v2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_5
    new-instance v3, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 123
    .line 124
    add-int/lit8 v4, p0, 0x1

    .line 125
    .line 126
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, "\" is already defined in \""

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {v3, p1, p0, v2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 158
    .line 159
    .line 160
    throw v3

    .line 161
    :cond_6
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 162
    .line 163
    const-string v1, "\" is already defined in file \""

    .line 164
    .line 165
    invoke-static {v5, v0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget-object v1, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-direct {p0, p1, v0, v2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :cond_7
    return-void

    .line 194
    :cond_8
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 195
    .line 196
    const-string v0, "Missing name."

    .line 197
    .line 198
    invoke-direct {p0, p1, v0, v2}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 199
    .line 200
    .line 201
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, p1, v1}, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    new-instance v1, Lcom/google/protobuf/飘花落叶言楪子兰苏世哲;

    .line 27
    .line 28
    invoke-direct {v1, v0, p2, p1}, Lcom/google/protobuf/飘花落叶言楪子兰苏世哲;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言楪子兰苏哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {p0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    instance-of p0, v1, Lcom/google/protobuf/飘花落叶言楪子兰苏世哲;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Lcom/google/protobuf/Descriptors$DescriptorValidationException;

    .line 50
    .line 51
    const-string p2, "\""

    .line 52
    .line 53
    const-string v2, "\" is already defined (as something other than a package) in file \""

    .line 54
    .line 55
    invoke-static {p2, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰哲世苏;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "\"."

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, p1, p2, v0}, Lcom/google/protobuf/Descriptors$DescriptorValidationException;-><init>(Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;Ljava/lang/String;Lcom/google/protobuf/飘花落叶言楪子苏兰哲世;)V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_2
    :goto_1
    return-void
.end method
