.class public Ltop/linl/dexparser/DexParser;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public dexClassDefList:[Ltop/linl/dexparser/bean/ids/DexClassDef;

.field public dexData:[B

.field public dexDexProtoIdsList:[Ltop/linl/dexparser/bean/ids/DexProtoId;

.field public dexFieldIdsList:[Ltop/linl/dexparser/bean/ids/DexFieldId;

.field public dexHeader:Ltop/linl/dexparser/bean/DexHeader;

.field public dexMap:Ltop/linl/dexparser/bean/DexMap;

.field public dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

.field private dexName:Ljava/lang/String;

.field public dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

.field public dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

.field private reader:Ltop/linl/dexparser/util/ByteReader;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Ltop/linl/dexparser/DexParser;->setDexName(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, Ltop/linl/dexparser/util/ByteReader;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Ltop/linl/dexparser/util/ByteReader;-><init>([B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 15
    .line 16
    new-instance p1, Ltop/linl/dexparser/bean/DexHeader;

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ltop/linl/dexparser/bean/DexHeader;-><init>(Ltop/linl/dexparser/util/ByteReader;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ltop/linl/dexparser/DexParser;->dexHeader:Ltop/linl/dexparser/bean/DexHeader;

    .line 22
    .line 23
    iget p2, p1, Ltop/linl/dexparser/bean/DexHeader;->string_ids_size:I

    .line 24
    .line 25
    new-array p2, p2, [Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 26
    .line 27
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 28
    .line 29
    iget p2, p1, Ltop/linl/dexparser/bean/DexHeader;->type_ids_size:I

    .line 30
    .line 31
    new-array p2, p2, [Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 32
    .line 33
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 34
    .line 35
    iget p2, p1, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_size:I

    .line 36
    .line 37
    new-array p2, p2, [Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 38
    .line 39
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->dexDexProtoIdsList:[Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 40
    .line 41
    iget p2, p1, Ltop/linl/dexparser/bean/DexHeader;->field_ids_size:I

    .line 42
    .line 43
    new-array p2, p2, [Ltop/linl/dexparser/bean/ids/DexFieldId;

    .line 44
    .line 45
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->dexFieldIdsList:[Ltop/linl/dexparser/bean/ids/DexFieldId;

    .line 46
    .line 47
    iget p2, p1, Ltop/linl/dexparser/bean/DexHeader;->method_ids_size:I

    .line 48
    .line 49
    new-array p2, p2, [Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 50
    .line 51
    iput-object p2, p0, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 52
    .line 53
    iget p1, p1, Ltop/linl/dexparser/bean/DexHeader;->class_defs_size:I

    .line 54
    .line 55
    new-array p1, p1, [Ltop/linl/dexparser/bean/ids/DexClassDef;

    .line 56
    .line 57
    iput-object p1, p0, Ltop/linl/dexparser/DexParser;->dexClassDefList:[Ltop/linl/dexparser/bean/ids/DexClassDef;

    .line 58
    .line 59
    return-void
.end method

.method public static SplitHexInt(I)[I
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    const/16 v2, 0x100

    .line 6
    .line 7
    if-ge p0, v2, :cond_0

    .line 8
    .line 9
    aput p0, v0, v1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    div-int/lit16 v3, p0, 0x100

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput v3, v0, v4

    .line 16
    .line 17
    rem-int/2addr p0, v2

    .line 18
    aput p0, v0, v1

    .line 19
    .line 20
    return-object v0
.end method

.method public static isCommonlyUsedClass(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Ljava"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "Landroid"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "Lkotlin"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "Lcom/android"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "Lcom/google"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "Lcom/microsoft"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const-string v0, "Ldalvik"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 p0, 0x0

    .line 59
    return p0

    .line 60
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 61
    return p0
.end method

.method private paresMethodInstructionSet(Ltop/linl/dexparser/bean/ids/DexMethodId;I)V
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ltop/linl/dexparser/util/ByteReader;

    .line 6
    .line 7
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ltop/linl/dexparser/util/ByteReader;-><init>([B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x4

    .line 45
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    :goto_0
    if-ge v3, v2, :cond_8

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v4}, Ltop/linl/dexparser/DexParser;->SplitHexInt(I)[I

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const/4 v5, 0x1

    .line 76
    aget v4, v4, v5

    .line 77
    .line 78
    const/16 v6, 0x1a

    .line 79
    .line 80
    if-ne v4, v6, :cond_3

    .line 81
    .line 82
    invoke-virtual {v0, p2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    iget-object v6, p0, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 93
    .line 94
    array-length v6, v6

    .line 95
    if-le v4, v6, :cond_1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-nez v6, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->initUsedStringList()V

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const/16 v6, 0x1b

    .line 120
    .line 121
    if-ne v4, v6, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    add-int/lit8 v3, v3, 0x2

    .line 132
    .line 133
    iget-object v6, p0, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 134
    .line 135
    array-length v6, v6

    .line 136
    if-lt v4, v6, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    if-gez v4, :cond_5

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-nez v6, :cond_6

    .line 147
    .line 148
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->initUsedStringList()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-virtual {p1}, Ltop/linl/dexparser/bean/ids/DexMethodId;->getUsedStringList()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_1
    add-int/2addr v3, v5

    .line 163
    goto :goto_0

    .line 164
    :cond_8
    :goto_2
    return-void
.end method

.method private parseClassData(I)V
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_8

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ltop/linl/dexparser/util/ByteReader;

    .line 6
    .line 7
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ltop/linl/dexparser/util/ByteReader;-><init>([B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, -0x1

    .line 33
    move v6, v4

    .line 34
    move v7, v5

    .line 35
    :goto_0
    if-ge v6, p1, :cond_2

    .line 36
    .line 37
    if-ne v7, v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    add-int/2addr v8, v7

    .line 49
    move v7, v8

    .line 50
    :goto_1
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 51
    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move p1, v4

    .line 57
    move v6, v5

    .line 58
    :goto_2
    if-ge p1, v1, :cond_4

    .line 59
    .line 60
    if-ne v6, v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    add-int/2addr v7, v6

    .line 72
    move v6, v7

    .line 73
    :goto_3
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 74
    .line 75
    .line 76
    add-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move p1, v4

    .line 80
    move v1, v5

    .line 81
    :goto_4
    if-ge p1, v2, :cond_6

    .line 82
    .line 83
    if-ne v1, v5, :cond_5

    .line 84
    .line 85
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    goto :goto_5

    .line 90
    :cond_5
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    add-int/2addr v6, v1

    .line 95
    move v1, v6

    .line 96
    :goto_5
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-object v7, p0, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 104
    .line 105
    aget-object v7, v7, v1

    .line 106
    .line 107
    invoke-direct {p0, v7, v6}, Ltop/linl/dexparser/DexParser;->paresMethodInstructionSet(Ltop/linl/dexparser/bean/ids/DexMethodId;I)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 p1, p1, 0x1

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    move p1, v5

    .line 114
    :goto_6
    if-ge v4, v3, :cond_8

    .line 115
    .line 116
    if-ne p1, v5, :cond_7

    .line 117
    .line 118
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    goto :goto_7

    .line 123
    :cond_7
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/2addr v1, p1

    .line 128
    move p1, v1

    .line 129
    :goto_7
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ltop/linl/dexparser/util/ByteReader;->readUnsignedLeb128()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 137
    .line 138
    aget-object v2, v2, p1

    .line 139
    .line 140
    invoke-direct {p0, v2, v1}, Ltop/linl/dexparser/DexParser;->paresMethodInstructionSet(Ltop/linl/dexparser/bean/ids/DexMethodId;I)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    :goto_8
    return-void
.end method

.method private parseClassDef()V
    .locals 5

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 64
    .line 65
    .line 66
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v2}, Ltop/linl/dexparser/DexParser;->parseClassData(I)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method private parseField()V
    .locals 7

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget v3, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    iget v3, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-virtual {v3, v4}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-short v3, v3

    .line 32
    iget-object v5, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    int-to-short v4, v4

    .line 43
    iget-object v5, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 44
    .line 45
    invoke-virtual {v5, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-static {v5}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    new-instance v6, Ltop/linl/dexparser/bean/ids/DexFieldId;

    .line 54
    .line 55
    invoke-direct {v6, v3, v4, v5}, Ltop/linl/dexparser/bean/ids/DexFieldId;-><init>(SSI)V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Ltop/linl/dexparser/DexParser;->dexFieldIdsList:[Ltop/linl/dexparser/bean/ids/DexFieldId;

    .line 59
    .line 60
    aput-object v6, v3, v2

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-void
.end method

.method private parseMap()V
    .locals 8

    .line 1
    new-instance v0, Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/linl/dexparser/bean/DexMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 7
    .line 8
    new-instance v0, Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ltop/linl/dexparser/util/ByteReader;-><init>([B)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexHeader:Ltop/linl/dexparser/bean/DexHeader;

    .line 16
    .line 17
    iget v1, v1, Ltop/linl/dexparser/bean/DexHeader;->map_off:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    invoke-virtual {v0, v4}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v5}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v0, v4}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v6}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget-object v7, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 67
    .line 68
    invoke-virtual {v7, v5, v4, v6}, Ltop/linl/dexparser/bean/DexMap;->addItem(III)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    return-void
.end method

.method private parseMethod()V
    .locals 6

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-short v2, v2

    .line 32
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-short v3, v3

    .line 43
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 44
    .line 45
    const/4 v5, 0x4

    .line 46
    invoke-virtual {v4, v5}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    new-instance v5, Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 55
    .line 56
    invoke-direct {v5, v2, v3, v4}, Ltop/linl/dexparser/bean/ids/DexMethodId;-><init>(SSI)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->dexMethodIdsList:[Ltop/linl/dexparser/bean/ids/DexMethodId;

    .line 60
    .line 61
    aput-object v5, v2, v1

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    return-void
.end method

.method private parseProto()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexHeader:Ltop/linl/dexparser/bean/DexHeader;

    .line 3
    .line 4
    iget v1, v1, Ltop/linl/dexparser/bean/DexHeader;->proto_ids_size:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v3, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    new-instance v4, Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 40
    .line 41
    invoke-direct {v4, v1, v3, v2}, Ltop/linl/dexparser/bean/ids/DexProtoId;-><init>(III)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexDexProtoIdsList:[Ltop/linl/dexparser/bean/ids/DexProtoId;

    .line 45
    .line 46
    aput-object v4, v1, v0

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method private parseStringConstantPools()V
    .locals 8

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget v3, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    iget v4, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 18
    .line 19
    if-ge v3, v4, :cond_1

    .line 20
    .line 21
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 22
    .line 23
    const/4 v5, 0x4

    .line 24
    invoke-virtual {v4, v5}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget-object v5, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 33
    .line 34
    invoke-static {v5, v4}, Ltop/linl/dexparser/util/ConversionUtils;->readULeb128([BI)I

    .line 35
    .line 36
    .line 37
    move v5, v2

    .line 38
    :goto_1
    iget-object v6, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 39
    .line 40
    add-int/2addr v5, v1

    .line 41
    add-int v7, v5, v4

    .line 42
    .line 43
    add-int/2addr v7, v1

    .line 44
    aget-byte v6, v6, v7

    .line 45
    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v6, Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 50
    .line 51
    invoke-direct {v6, v4, v5}, Ltop/linl/dexparser/bean/ids/DexStringId;-><init>(II)V

    .line 52
    .line 53
    .line 54
    iget-object v4, p0, Ltop/linl/dexparser/DexParser;->dexStringIdsList:[Ltop/linl/dexparser/bean/ids/DexStringId;

    .line 55
    .line 56
    aput-object v6, v4, v3

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
.end method

.method private parseType()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexHeader:Ltop/linl/dexparser/bean/DexHeader;

    .line 3
    .line 4
    iget v1, v1, Ltop/linl/dexparser/bean/DexHeader;->type_ids_size:I

    .line 5
    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Ltop/linl/dexparser/bean/ids/DexTypeId;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->dexTypeIdsList:[Ltop/linl/dexparser/bean/ids/DexTypeId;

    .line 25
    .line 26
    aput-object v2, v1, v0

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public closeDexData()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public getDexName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/DexParser;->dexName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public parseCallSite()V
    .locals 4

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 9
    .line 10
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->byteToUnsignedInt([B)I

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public parseMethodHandle()V
    .locals 4

    .line 1
    iget-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ltop/linl/dexparser/bean/DexMap;->findItem(I)Ltop/linl/dexparser/bean/DexMap$Item;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 10
    .line 11
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->offset:I

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ltop/linl/dexparser/util/ByteReader;->setStartPosition(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget v2, v0, Ltop/linl/dexparser/bean/DexMap$Item;->size:I

    .line 18
    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ltop/linl/dexparser/util/ByteReader;->read(I)[B

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Ltop/linl/dexparser/util/ConversionUtils;->bytesToUnsignedShort([B)I

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-void
.end method

.method public setDexData([B)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/linl/dexparser/DexParser;->dexData:[B

    .line 2
    .line 3
    return-void
.end method

.method public setDexName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/linl/dexparser/DexParser;->dexName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public startParse()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseMap()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseStringConstantPools()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseType()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseProto()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseField()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseMethod()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ltop/linl/dexparser/DexParser;->parseClassDef()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Ltop/linl/dexparser/DexParser;->dexHeader:Ltop/linl/dexparser/bean/DexHeader;

    .line 24
    .line 25
    iput-object v0, p0, Ltop/linl/dexparser/DexParser;->dexMap:Ltop/linl/dexparser/bean/DexMap;

    .line 26
    .line 27
    iput-object v0, p0, Ltop/linl/dexparser/DexParser;->reader:Ltop/linl/dexparser/util/ByteReader;

    .line 28
    .line 29
    return-void
.end method
