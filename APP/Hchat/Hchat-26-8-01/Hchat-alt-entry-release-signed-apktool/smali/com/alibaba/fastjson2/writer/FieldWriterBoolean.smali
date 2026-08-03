.class abstract Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;
.super Lcom/alibaba/fastjson2/writer/FieldWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final utf16Value0:[C

.field final utf16Value1:[C

.field final utf16ValueFalse:[C

.field final utf16ValueTrue:[C

.field final utf8Value0:[B

.field final utf8Value1:[B

.field final utf8ValueFalse:[B

.field final utf8ValueTrue:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 4

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 6
    .line 7
    array-length p3, p2

    .line 8
    add-int/lit8 p3, p3, 0x4

    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 15
    .line 16
    array-length p4, p3

    .line 17
    const/16 p5, 0x74

    .line 18
    .line 19
    aput-byte p5, p2, p4

    .line 20
    .line 21
    array-length p4, p3

    .line 22
    add-int/lit8 p4, p4, 0x1

    .line 23
    .line 24
    const/16 p6, 0x72

    .line 25
    .line 26
    aput-byte p6, p2, p4

    .line 27
    .line 28
    array-length p4, p3

    .line 29
    add-int/lit8 p4, p4, 0x2

    .line 30
    .line 31
    const/16 p7, 0x75

    .line 32
    .line 33
    aput-byte p7, p2, p4

    .line 34
    .line 35
    array-length p4, p3

    .line 36
    add-int/lit8 p4, p4, 0x3

    .line 37
    .line 38
    const/16 p8, 0x65

    .line 39
    .line 40
    aput-byte p8, p2, p4

    .line 41
    .line 42
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8ValueTrue:[B

    .line 43
    .line 44
    array-length p2, p3

    .line 45
    add-int/lit8 p2, p2, 0x5

    .line 46
    .line 47
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 52
    .line 53
    array-length p4, p3

    .line 54
    const/16 p9, 0x66

    .line 55
    .line 56
    aput-byte p9, p2, p4

    .line 57
    .line 58
    array-length p4, p3

    .line 59
    add-int/lit8 p4, p4, 0x1

    .line 60
    .line 61
    const/16 p10, 0x61

    .line 62
    .line 63
    aput-byte p10, p2, p4

    .line 64
    .line 65
    array-length p4, p3

    .line 66
    add-int/lit8 p4, p4, 0x2

    .line 67
    .line 68
    const/16 v0, 0x6c

    .line 69
    .line 70
    aput-byte v0, p2, p4

    .line 71
    .line 72
    array-length p4, p3

    .line 73
    add-int/lit8 p4, p4, 0x3

    .line 74
    .line 75
    const/16 v1, 0x73

    .line 76
    .line 77
    aput-byte v1, p2, p4

    .line 78
    .line 79
    array-length p4, p3

    .line 80
    add-int/lit8 p4, p4, 0x4

    .line 81
    .line 82
    aput-byte p8, p2, p4

    .line 83
    .line 84
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8ValueFalse:[B

    .line 85
    .line 86
    array-length p2, p3

    .line 87
    add-int/lit8 p2, p2, 0x1

    .line 88
    .line 89
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 94
    .line 95
    array-length p4, p3

    .line 96
    const/16 v2, 0x31

    .line 97
    .line 98
    aput-byte v2, p2, p4

    .line 99
    .line 100
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8Value1:[B

    .line 101
    .line 102
    array-length p2, p3

    .line 103
    add-int/lit8 p2, p2, 0x1

    .line 104
    .line 105
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF8:[B

    .line 110
    .line 111
    array-length p3, p3

    .line 112
    const/16 p4, 0x30

    .line 113
    .line 114
    aput-byte p4, p2, p3

    .line 115
    .line 116
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8Value0:[B

    .line 117
    .line 118
    iget-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 119
    .line 120
    array-length p3, p2

    .line 121
    add-int/lit8 p3, p3, 0x4

    .line 122
    .line 123
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 128
    .line 129
    array-length v3, p3

    .line 130
    aput-char p5, p2, v3

    .line 131
    .line 132
    array-length p5, p3

    .line 133
    add-int/lit8 p5, p5, 0x1

    .line 134
    .line 135
    aput-char p6, p2, p5

    .line 136
    .line 137
    array-length p5, p3

    .line 138
    add-int/lit8 p5, p5, 0x2

    .line 139
    .line 140
    aput-char p7, p2, p5

    .line 141
    .line 142
    array-length p5, p3

    .line 143
    add-int/lit8 p5, p5, 0x3

    .line 144
    .line 145
    aput-char p8, p2, p5

    .line 146
    .line 147
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16ValueTrue:[C

    .line 148
    .line 149
    array-length p2, p3

    .line 150
    add-int/lit8 p2, p2, 0x5

    .line 151
    .line 152
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 157
    .line 158
    array-length p5, p3

    .line 159
    aput-char p9, p2, p5

    .line 160
    .line 161
    array-length p5, p3

    .line 162
    add-int/lit8 p5, p5, 0x1

    .line 163
    .line 164
    aput-char p10, p2, p5

    .line 165
    .line 166
    array-length p5, p3

    .line 167
    add-int/lit8 p5, p5, 0x2

    .line 168
    .line 169
    aput-char v0, p2, p5

    .line 170
    .line 171
    array-length p5, p3

    .line 172
    add-int/lit8 p5, p5, 0x3

    .line 173
    .line 174
    aput-char v1, p2, p5

    .line 175
    .line 176
    array-length p5, p3

    .line 177
    add-int/lit8 p5, p5, 0x4

    .line 178
    .line 179
    aput-char p8, p2, p5

    .line 180
    .line 181
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16ValueFalse:[C

    .line 182
    .line 183
    array-length p2, p3

    .line 184
    add-int/lit8 p2, p2, 0x1

    .line 185
    .line 186
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 191
    .line 192
    array-length p5, p3

    .line 193
    aput-char v2, p2, p5

    .line 194
    .line 195
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16Value1:[C

    .line 196
    .line 197
    array-length p2, p3

    .line 198
    add-int/lit8 p2, p2, 0x1

    .line 199
    .line 200
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->nameWithColonUTF16:[C

    .line 205
    .line 206
    array-length p3, p3

    .line 207
    aput-char p4, p2, p3

    .line 208
    .line 209
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16Value0:[C

    .line 210
    .line 211
    return-void
.end method


# virtual methods
.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 0

    .line 1
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolean;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolean;

    .line 2
    .line 3
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    or-long/2addr v4, v6

    .line 20
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 25
    .line 26
    iget-wide v8, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 27
    .line 28
    or-long/2addr v6, v8

    .line 29
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide v8, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    or-long/2addr v6, v8

    .line 34
    and-long/2addr v6, v4

    .line 35
    cmp-long v6, v6, v2

    .line 36
    .line 37
    if-nez v6, :cond_0

    .line 38
    .line 39
    return v0

    .line 40
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 41
    .line 42
    .line 43
    iget-wide v6, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 44
    .line 45
    and-long/2addr v4, v6

    .line 46
    cmp-long p2, v4, v2

    .line 47
    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeBooleanNull()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return v1

    .line 58
    :cond_2
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 59
    .line 60
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-ne v4, v5, :cond_3

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 71
    .line 72
    invoke-virtual {p1, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 77
    .line 78
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 79
    .line 80
    and-long/2addr v4, v6

    .line 81
    cmp-long v2, v4, v2

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    return v0

    .line 86
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->writeBool(Lcom/alibaba/fastjson2/JSONWriter;Z)V

    .line 91
    .line 92
    .line 93
    return v1

    .line 94
    :catch_0
    move-exception p2

    .line 95
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isIgnoreErrorGetter()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    return v0

    .line 102
    :cond_4
    throw p2
.end method

.method public final writeBool(Lcom/alibaba/fastjson2/JSONWriter;Z)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    and-long/2addr v2, v0

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 19
    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    const-string p2, "true"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p2, "false"

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-boolean v2, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf8:Z

    .line 33
    .line 34
    if-eqz v2, :cond_5

    .line 35
    .line 36
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 37
    .line 38
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 39
    .line 40
    and-long/2addr v0, v2

    .line 41
    cmp-long v0, v0, v4

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8Value1:[B

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8Value0:[B

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    if-eqz p2, :cond_4

    .line 54
    .line 55
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8ValueTrue:[B

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf8ValueFalse:[B

    .line 59
    .line 60
    :goto_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([B)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    iget-boolean v2, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf16:Z

    .line 65
    .line 66
    if-eqz v2, :cond_9

    .line 67
    .line 68
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 69
    .line 70
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 71
    .line 72
    and-long/2addr v0, v2

    .line 73
    cmp-long v0, v0, v4

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    if-eqz p2, :cond_6

    .line 78
    .line 79
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16Value1:[C

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16Value0:[C

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_7
    if-eqz p2, :cond_8

    .line 86
    .line 87
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16ValueTrue:[C

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_8
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolean;->utf16ValueFalse:[C

    .line 91
    .line 92
    :goto_2
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([C)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_9
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
