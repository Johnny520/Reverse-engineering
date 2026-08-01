.class public Lcom/android/dx/cf/direct/AttributeFactory;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final CTX_CLASS:I = 0x0

.field public static final CTX_CODE:I = 0x3

.field public static final CTX_COUNT:I = 0x4

.field public static final CTX_FIELD:I = 0x1

.field public static final CTX_METHOD:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final parse(Lcom/android/dx/cf/direct/DirectClassFile;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 11

    .line 1
    move-object v6, p4

    .line 2
    const-string v0, "length: "

    .line 3
    .line 4
    const-string v1, "name: "

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    if-ltz p2, :cond_2

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    if-ge p2, v4, :cond_2

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-virtual {v5, p3}, Lcom/android/dx/util/ByteArray;->getUnsignedShort(I)I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    add-int/lit8 v9, p3, 0x2

    .line 27
    .line 28
    invoke-virtual {v5, v9}, Lcom/android/dx/util/ByteArray;->getInt(I)I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    invoke-interface {v7, v8}, Lcom/android/dx/rop/cst/ConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    check-cast v7, Lcom/android/dx/rop/cst/CstString;
    :try_end_0
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    .line 37
    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x2

    .line 57
    invoke-interface {p4, v5, p3, v3, v1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v10}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p4, v5, v9, v4, v0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object v3, v7

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    add-int/lit8 v4, p3, 0x6

    .line 88
    .line 89
    move-object v0, p0

    .line 90
    move-object v1, p1

    .line 91
    move v2, p2

    .line 92
    move v5, v10

    .line 93
    invoke-virtual/range {v0 .. v6}, Lcom/android/dx/cf/direct/AttributeFactory;->parse0(Lcom/android/dx/cf/direct/DirectClassFile;ILjava/lang/String;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_1
    .catch Lcom/android/dx/cf/iface/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    return-object v0

    .line 98
    :catch_1
    move-exception v0

    .line 99
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v2, "...while parsing "

    .line 102
    .line 103
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v3, " "

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    goto :goto_2

    .line 130
    :cond_1
    const-string v2, ""

    .line 131
    .line 132
    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v2, "attribute at offset "

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-static {p3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_2
    const-string v0, "bad context"

    .line 156
    .line 157
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :cond_3
    const-string v0, "cf == null"

    .line 162
    .line 163
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v3
.end method

.method public parse0(Lcom/android/dx/cf/direct/DirectClassFile;ILjava/lang/String;IILcom/android/dx/cf/iface/ParseObserver;)Lcom/android/dx/cf/iface/Attribute;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBytes()Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    move-object p1, p3

    .line 10
    move p3, p4

    .line 11
    move p4, p5

    .line 12
    move-object p5, p0

    .line 13
    new-instance p0, Lcom/android/dx/cf/attrib/RawAttribute;

    .line 14
    .line 15
    invoke-direct/range {p0 .. p5}, Lcom/android/dx/cf/attrib/RawAttribute;-><init>(Ljava/lang/String;Lcom/android/dx/util/ByteArray;IILcom/android/dx/rop/cst/ConstantPool;)V

    .line 16
    .line 17
    .line 18
    if-eqz p6, :cond_0

    .line 19
    .line 20
    const-string p1, "attribute data"

    .line 21
    .line 22
    invoke-interface {p6, p2, p3, p4, p1}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p0
.end method
