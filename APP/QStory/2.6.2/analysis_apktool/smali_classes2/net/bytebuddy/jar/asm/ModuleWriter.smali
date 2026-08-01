.class final Lnet/bytebuddy/jar/asm/ModuleWriter;
.super Lnet/bytebuddy/jar/asm/ModuleVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final exports:Lnet/bytebuddy/jar/asm/ByteVector;

.field private exportsCount:I

.field private mainClassIndex:I

.field private final moduleFlags:I

.field private final moduleNameIndex:I

.field private final moduleVersionIndex:I

.field private final opens:Lnet/bytebuddy/jar/asm/ByteVector;

.field private opensCount:I

.field private packageCount:I

.field private final packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

.field private final provides:Lnet/bytebuddy/jar/asm/ByteVector;

.field private providesCount:I

.field private final requires:Lnet/bytebuddy/jar/asm/ByteVector;

.field private requiresCount:I

.field private final symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

.field private usesCount:I

.field private final usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/SymbolTable;III)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 7
    .line 8
    iput p2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleNameIndex:I

    .line 9
    .line 10
    iput p3, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleFlags:I

    .line 11
    .line 12
    iput p4, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleVersionIndex:I

    .line 13
    .line 14
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 15
    .line 16
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requires:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 22
    .line 23
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 27
    .line 28
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 36
    .line 37
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 41
    .line 42
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 43
    .line 44
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 48
    .line 49
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 50
    .line 51
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public computeAttributesSize()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    const-string v1, "Module"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requires:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 9
    .line 10
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x16

    .line 13
    .line 14
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 15
    .line 16
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 20
    .line 21
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 25
    .line 26
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 27
    .line 28
    add-int/2addr v0, v1

    .line 29
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 30
    .line 31
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 35
    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 39
    .line 40
    const-string v2, "ModulePackages"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 46
    .line 47
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x8

    .line 50
    .line 51
    add-int/2addr v0, v1

    .line 52
    :cond_0
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->mainClassIndex:I

    .line 53
    .line 54
    if-lez v1, :cond_1

    .line 55
    .line 56
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 57
    .line 58
    const-string v1, "ModuleMainClass"

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x8

    .line 64
    .line 65
    :cond_1
    return v0
.end method

.method public getAttributeCount()I
    .locals 3

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    add-int/2addr v0, v2

    .line 11
    iget p0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->mainClassIndex:I

    .line 12
    .line 13
    if-lez p0, :cond_1

    .line 14
    .line 15
    move v1, v2

    .line 16
    :cond_1
    add-int/2addr v0, v1

    .line 17
    return v0
.end method

.method public putAttributes(Lnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requires:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget v0, v0, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 8
    .line 9
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 13
    .line 14
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 28
    .line 29
    const-string v2, "Module"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleNameIndex:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleFlags:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->moduleVersionIndex:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requiresCount:I

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requires:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 68
    .line 69
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 70
    .line 71
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exportsCount:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 85
    .line 86
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 87
    .line 88
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opensCount:I

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 101
    .line 102
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 103
    .line 104
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 105
    .line 106
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesCount:I

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 117
    .line 118
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 119
    .line 120
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 121
    .line 122
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->providesCount:I

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 133
    .line 134
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 135
    .line 136
    iget v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 137
    .line 138
    invoke-virtual {v0, v2, v3, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 139
    .line 140
    .line 141
    iget v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 142
    .line 143
    const/4 v1, 0x2

    .line 144
    if-lez v0, :cond_0

    .line 145
    .line 146
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 147
    .line 148
    const-string v2, "ModulePackages"

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 159
    .line 160
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 161
    .line 162
    add-int/2addr v2, v1

    .line 163
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 174
    .line 175
    iget-object v4, v2, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 176
    .line 177
    iget v2, v2, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 178
    .line 179
    invoke-virtual {v0, v4, v3, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 180
    .line 181
    .line 182
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->mainClassIndex:I

    .line 183
    .line 184
    if-lez v0, :cond_1

    .line 185
    .line 186
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 187
    .line 188
    const-string v2, "ModuleMainClass"

    .line 189
    .line 190
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget p0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->mainClassIndex:I

    .line 203
    .line 204
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 205
    .line 206
    .line 207
    :cond_1
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public varargs visitExport(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantPackage(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    array-length v0, p3

    .line 28
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    array-length p1, p3

    .line 32
    :goto_0
    if-ge p2, p1, :cond_1

    .line 33
    .line 34
    aget-object v0, p3, p2

    .line 35
    .line 36
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exports:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v0, v0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exportsCount:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->exportsCount:I

    .line 57
    .line 58
    return-void
.end method

.method public visitMainClass(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->mainClassIndex:I

    .line 10
    .line 11
    return-void
.end method

.method public varargs visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantPackage(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    array-length v0, p3

    .line 28
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    array-length p1, p3

    .line 32
    :goto_0
    if-ge p2, p1, :cond_1

    .line 33
    .line 34
    aget-object v0, p3, p2

    .line 35
    .line 36
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opens:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v0, v0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 47
    .line 48
    .line 49
    add-int/lit8 p2, p2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opensCount:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->opensCount:I

    .line 57
    .line 58
    return-void
.end method

.method public visitPackage(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantPackage(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->packageCount:I

    .line 19
    .line 20
    return-void
.end method

.method public varargs visitProvide(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 15
    .line 16
    array-length v0, p2

    .line 17
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 18
    .line 19
    .line 20
    array-length p1, p2

    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-ge v0, p1, :cond_0

    .line 23
    .line 24
    aget-object v1, p2, v0

    .line 25
    .line 26
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->provides:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 27
    .line 28
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v1, v1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->providesCount:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->providesCount:I

    .line 47
    .line 48
    return-void
.end method

.method public visitRequire(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requires:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    :goto_0
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 30
    .line 31
    .line 32
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requiresCount:I

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->requiresCount:I

    .line 37
    .line 38
    return-void
.end method

.method public visitUse(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesIndex:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesCount:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, p0, Lnet/bytebuddy/jar/asm/ModuleWriter;->usesCount:I

    .line 19
    .line 20
    return-void
.end method
