.class final Lcom/android/dx/cf/direct/AttributeListParser;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

.field private final cf:Lcom/android/dx/cf/direct/DirectClassFile;

.field private final context:I

.field private endOffset:I

.field private final list:Lcom/android/dx/cf/iface/StdAttributeList;

.field private observer:Lcom/android/dx/cf/iface/ParseObserver;

.field private final offset:I


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/direct/AttributeFactory;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-object p1, p0, Lcom/android/dx/cf/direct/AttributeListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 18
    .line 19
    iput p2, p0, Lcom/android/dx/cf/direct/AttributeListParser;->context:I

    .line 20
    .line 21
    iput p3, p0, Lcom/android/dx/cf/direct/AttributeListParser;->offset:I

    .line 22
    .line 23
    iput-object p4, p0, Lcom/android/dx/cf/direct/AttributeListParser;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 24
    .line 25
    new-instance p1, Lcom/android/dx/cf/iface/StdAttributeList;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lcom/android/dx/cf/iface/StdAttributeList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/android/dx/cf/direct/AttributeListParser;->list:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/android/dx/cf/direct/AttributeListParser;->endOffset:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string p0, "attributeFactory == null"

    .line 37
    .line 38
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    const-string p0, "cf == null"

    .line 43
    .line 44
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method private parse()V
    .locals 11

    .line 1
    const-string v0, "]"

    .line 2
    .line 3
    const-string v1, "...while parsing attributes["

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/cf/direct/AttributeListParser;->list:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v3, p0, Lcom/android/dx/cf/direct/AttributeListParser;->offset:I

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    add-int/2addr v3, v4

    .line 15
    iget-object v5, p0, Lcom/android/dx/cf/direct/AttributeListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 16
    .line 17
    invoke-virtual {v5}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    iget v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->offset:I

    .line 26
    .line 27
    new-instance v8, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v9, "attributes_count: "

    .line 30
    .line 31
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v8, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v6, v5, v7, v4, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    move v6, v4

    .line 43
    :goto_0
    if-ge v6, v2, :cond_3

    .line 44
    .line 45
    :try_start_0
    iget-object v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 46
    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    new-instance v8, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v9, "\nattributes["

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v9, "]:\n"

    .line 63
    .line 64
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-interface {v7, v5, v3, v4, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    invoke-interface {v7, v8}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catch_0
    move-exception p0

    .line 82
    goto :goto_2

    .line 83
    :catch_1
    move-exception p0

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    :goto_1
    iget-object v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->attributeFactory:Lcom/android/dx/cf/direct/AttributeFactory;

    .line 86
    .line 87
    iget-object v8, p0, Lcom/android/dx/cf/direct/AttributeListParser;->cf:Lcom/android/dx/cf/direct/DirectClassFile;

    .line 88
    .line 89
    iget v9, p0, Lcom/android/dx/cf/direct/AttributeListParser;->context:I

    .line 90
    .line 91
    iget-object v10, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 92
    .line 93
    invoke-virtual {v7, v8, v9, v3, v10}, Lcom/android/dx/cf/direct/AttributeFactory;->parse(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-interface {v7}, Lcom/android/dx/cf/iface/Attribute;->byteLength()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    add-int/2addr v3, v8

    .line 102
    iget-object v8, p0, Lcom/android/dx/cf/direct/AttributeListParser;->list:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 103
    .line 104
    invoke-virtual {v8, v6, v7}, Lcom/android/dx/cf/iface/StdAttributeList;->set(ILcom/android/dx/cf/iface/Attribute;)V

    .line 105
    .line 106
    .line 107
    iget-object v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 108
    .line 109
    if-eqz v7, :cond_2

    .line 110
    .line 111
    const/4 v8, -0x1

    .line 112
    invoke-interface {v7, v8}, Lcom/android/dx/cf/iface/ParseObserver;->changeIndent(I)V

    .line 113
    .line 114
    .line 115
    iget-object v7, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 116
    .line 117
    new-instance v8, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v9, "end attributes["

    .line 123
    .line 124
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v9, "]\n"

    .line 131
    .line 132
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-interface {v7, v5, v3, v4, v8}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :goto_2
    new-instance v2, Lcom/android/dx/cf/iface/ParseException;

    .line 146
    .line 147
    invoke-direct {v2, p0}, Lcom/android/dx/cf/iface/ParseException;-><init>(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    new-instance p0, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v2, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :cond_3
    iput v3, p0, Lcom/android/dx/cf/direct/AttributeListParser;->endOffset:I

    .line 189
    .line 190
    return-void
.end method

.method private parseIfNecessary()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/direct/AttributeListParser;->endOffset:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AttributeListParser;->parse()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public getEndOffset()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AttributeListParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/android/dx/cf/direct/AttributeListParser;->endOffset:I

    .line 5
    .line 6
    return p0
.end method

.method public getList()Lcom/android/dx/cf/iface/StdAttributeList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/direct/AttributeListParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/AttributeListParser;->list:Lcom/android/dx/cf/iface/StdAttributeList;

    .line 5
    .line 6
    return-object p0
.end method

.method public setObserver(Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/direct/AttributeListParser;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    return-void
.end method
