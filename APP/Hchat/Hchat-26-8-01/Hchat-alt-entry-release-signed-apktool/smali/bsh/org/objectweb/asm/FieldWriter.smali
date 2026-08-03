.class final Lbsh/org/objectweb/asm/FieldWriter;
.super Lbsh/org/objectweb/asm/FieldVisitor;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final accessFlags:I

.field private constantValueIndex:I

.field private final descriptorIndex:I

.field private firstAttribute:Lbsh/org/objectweb/asm/Attribute;

.field private final nameIndex:I

.field private signatureIndex:I

.field private final symbolTable:Lbsh/org/objectweb/asm/SymbolTable;


# direct methods
.method public constructor <init>(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/high16 v0, 0x60000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/FieldVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 7
    .line 8
    iput p2, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lbsh/org/objectweb/asm/FieldWriter;->nameIndex:I

    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, p0, Lbsh/org/objectweb/asm/FieldWriter;->descriptorIndex:I

    .line 21
    .line 22
    if-eqz p5, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, Lbsh/org/objectweb/asm/FieldWriter;->signatureIndex:I

    .line 29
    .line 30
    :cond_0
    if-eqz p6, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p6}, Lbsh/org/objectweb/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 37
    .line 38
    iput p1, p0, Lbsh/org/objectweb/asm/FieldWriter;->constantValueIndex:I

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final collectAttributePrototypes(Lbsh/org/objectweb/asm/Attribute$Set;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/Attribute$Set;->addAttributes(Lbsh/org/objectweb/asm/Attribute;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public computeFieldInfoSize()I
    .locals 3

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->constantValueIndex:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 6
    .line 7
    const-string v1, "ConstantValue"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v0, 0x8

    .line 16
    .line 17
    :goto_0
    iget v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 18
    .line 19
    and-int/lit16 v1, v1, 0x1000

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 24
    .line 25
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v2, 0x31

    .line 30
    .line 31
    if-ge v1, v2, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 34
    .line 35
    const-string v2, "Synthetic"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x6

    .line 41
    .line 42
    :cond_1
    iget v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->signatureIndex:I

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 47
    .line 48
    const-string v2, "Signature"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x8

    .line 54
    .line 55
    :cond_2
    iget v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 56
    .line 57
    const/high16 v2, 0x20000

    .line 58
    .line 59
    and-int/2addr v1, v2

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 63
    .line 64
    const-string v2, "Deprecated"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x6

    .line 70
    .line 71
    :cond_3
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    iget-object v2, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    add-int/2addr v1, v0

    .line 82
    return v1

    .line 83
    :cond_4
    return v0
.end method

.method public putFieldInfo(Lbsh/org/objectweb/asm/ByteVector;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/SymbolTable;->getMajorVersion()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x31

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    const/16 v1, 0x1000

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move v4, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v4, v2

    .line 23
    :goto_1
    iget v5, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 24
    .line 25
    not-int v4, v4

    .line 26
    and-int/2addr v4, v5

    .line 27
    invoke-virtual {p1, v4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget v5, p0, Lbsh/org/objectweb/asm/FieldWriter;->nameIndex:I

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, p0, Lbsh/org/objectweb/asm/FieldWriter;->descriptorIndex:I

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 40
    .line 41
    .line 42
    iget v4, p0, Lbsh/org/objectweb/asm/FieldWriter;->constantValueIndex:I

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v3, v2

    .line 48
    :goto_2
    iget v4, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 49
    .line 50
    and-int/lit16 v5, v4, 0x1000

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    :cond_3
    iget v5, p0, Lbsh/org/objectweb/asm/FieldWriter;->signatureIndex:I

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    :cond_4
    const/high16 v5, 0x20000

    .line 65
    .line 66
    and-int/2addr v4, v5

    .line 67
    if-eqz v4, :cond_5

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    :cond_5
    iget-object v4, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 72
    .line 73
    if-eqz v4, :cond_6

    .line 74
    .line 75
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/Attribute;->getAttributeCount()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/2addr v3, v4

    .line 80
    :cond_6
    invoke-virtual {p1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 81
    .line 82
    .line 83
    iget v3, p0, Lbsh/org/objectweb/asm/FieldWriter;->constantValueIndex:I

    .line 84
    .line 85
    const/4 v4, 0x2

    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    iget-object v3, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 89
    .line 90
    const-string v6, "ConstantValue"

    .line 91
    .line 92
    invoke-virtual {v3, v6}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3, v4}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iget v6, p0, Lbsh/org/objectweb/asm/FieldWriter;->constantValueIndex:I

    .line 105
    .line 106
    invoke-virtual {v3, v6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 107
    .line 108
    .line 109
    :cond_7
    iget v3, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 110
    .line 111
    and-int/2addr v1, v3

    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 117
    .line 118
    const-string v1, "Synthetic"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 129
    .line 130
    .line 131
    :cond_8
    iget v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->signatureIndex:I

    .line 132
    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 136
    .line 137
    const-string v1, "Signature"

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0, v4}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->signatureIndex:I

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 154
    .line 155
    .line 156
    :cond_9
    iget v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->accessFlags:I

    .line 157
    .line 158
    and-int/2addr v0, v5

    .line 159
    if-eqz v0, :cond_a

    .line 160
    .line 161
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 162
    .line 163
    const-string v1, "Deprecated"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-virtual {p1, v0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0, v2}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 174
    .line 175
    .line 176
    :cond_a
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 177
    .line 178
    if-eqz v0, :cond_b

    .line 179
    .line 180
    iget-object v1, p0, Lbsh/org/objectweb/asm/FieldWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 181
    .line 182
    invoke-virtual {v0, v1, p1}, Lbsh/org/objectweb/asm/Attribute;->putAttributes(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/ByteVector;)V

    .line 183
    .line 184
    .line 185
    :cond_b
    return-void
.end method

.method public visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lbsh/org/objectweb/asm/FieldWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    return-void
.end method
