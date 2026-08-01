.class public Lnet/bytebuddy/jar/asm/ClassReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field static final EXPAND_ASM_INSNS:I = 0x100

.field public static final EXPAND_FRAMES:I = 0x8

.field private static final INPUT_STREAM_DATA_CHUNK_SIZE:I = 0x1000

.field private static final MAX_BUFFER_SIZE:I = 0x100000

.field public static final SKIP_CODE:I = 0x1

.field public static final SKIP_DEBUG:I = 0x2

.field public static final SKIP_FRAMES:I = 0x4


# instance fields
.field public final b:[B
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
    .end annotation
.end field

.field private final bootstrapMethodOffsets:[I

.field final classFileBuffer:[B

.field private final constantDynamicValues:[Lnet/bytebuddy/jar/asm/ConstantDynamic;

.field private final constantUtf8Values:[Ljava/lang/String;

.field private final cpInfoOffsets:[I

.field public final header:I

.field private final maxStringLength:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 127
    invoke-static {p1, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readStream(Ljava/io/InputStream;Z)[B

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x2e

    const/16 v1, 0x2f

    .line 128
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnet/bytebuddy/jar/asm/ClassReader;->stringConcat$1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/ClassLoader;->getSystemResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const/4 v0, 0x1

    .line 129
    invoke-static {p1, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readStream(Ljava/io/InputStream;Z)[B

    move-result-object p1

    .line 130
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 126
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 0

    const/4 p3, 0x1

    .line 125
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([BIZ)V

    return-void
.end method

.method public constructor <init>([BIZ)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->b:[B

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    add-int/lit8 p3, p2, 0x6

    .line 11
    .line 12
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x46

    .line 17
    .line 18
    if-gt v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->stringConcat$0(S)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    add-int/lit8 p3, p2, 0x8

    .line 35
    .line 36
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    new-array v0, p3, [I

    .line 41
    .line 42
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 43
    .line 44
    new-array v0, p3, [Ljava/lang/String;

    .line 45
    .line 46
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->constantUtf8Values:[Ljava/lang/String;

    .line 47
    .line 48
    add-int/lit8 p2, p2, 0xa

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    const/4 v1, 0x1

    .line 52
    move v2, v0

    .line 53
    move v3, v2

    .line 54
    move v4, v1

    .line 55
    :goto_1
    if-ge v4, p3, :cond_3

    .line 56
    .line 57
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 58
    .line 59
    add-int/lit8 v6, v4, 0x1

    .line 60
    .line 61
    add-int/lit8 v7, p2, 0x1

    .line 62
    .line 63
    aput v7, v5, v4

    .line 64
    .line 65
    aget-byte v5, p1, p2

    .line 66
    .line 67
    const/4 v8, 0x3

    .line 68
    const/4 v9, 0x5

    .line 69
    packed-switch v5, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    :pswitch_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    throw p0

    .line 77
    :pswitch_1
    move v3, v1

    .line 78
    :goto_2
    :pswitch_2
    move v4, v6

    .line 79
    move v8, v9

    .line 80
    goto :goto_3

    .line 81
    :pswitch_3
    move v2, v1

    .line 82
    move v3, v2

    .line 83
    goto :goto_2

    .line 84
    :pswitch_4
    const/4 v8, 0x4

    .line 85
    :cond_2
    :pswitch_5
    move v4, v6

    .line 86
    goto :goto_3

    .line 87
    :pswitch_6
    add-int/lit8 v4, v4, 0x2

    .line 88
    .line 89
    const/16 v8, 0x9

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :pswitch_7
    invoke-virtual {p0, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    add-int/2addr v8, v4

    .line 97
    if-le v8, v0, :cond_2

    .line 98
    .line 99
    move v4, v6

    .line 100
    move v0, v8

    .line 101
    :goto_3
    add-int/2addr p2, v8

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iput v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 104
    .line 105
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    new-array p2, p3, [Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_4
    move-object p2, p1

    .line 114
    :goto_4
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/ClassReader;->constantDynamicValues:[Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readBootstrapMethodsAttribute(I)[I

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :cond_5
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->bootstrapMethodOffsets:[I

    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_1
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method private static computeBufferSize(Ljava/io/InputStream;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x100

    .line 6
    .line 7
    if-ge p0, v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x1000

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/high16 v0, 0x100000

    .line 13
    .line 14
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private computeImplicitFrame(Lnet/bytebuddy/jar/asm/Context;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/Context;->currentMethodDescriptor:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p1, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 6
    .line 7
    and-int/lit8 v2, v2, 0x8

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    const-string v2, "<init>"

    .line 14
    .line 15
    iget-object v5, p1, Lnet/bytebuddy/jar/asm/Context;->currentMethodName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->UNINITIALIZED_THIS:Ljava/lang/Integer;

    .line 24
    .line 25
    aput-object p0, v1, v4

    .line 26
    .line 27
    :goto_0
    move v4, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget v2, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x2

    .line 32
    .line 33
    iget-object v5, p1, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 34
    .line 35
    invoke-virtual {p0, v2, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    aput-object p0, v1, v4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    move p0, v3

    .line 43
    :goto_2
    add-int/lit8 v2, p0, 0x1

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/16 v6, 0x46

    .line 50
    .line 51
    if-eq v5, v6, :cond_9

    .line 52
    .line 53
    const/16 v6, 0x3b

    .line 54
    .line 55
    const/16 v7, 0x4c

    .line 56
    .line 57
    if-eq v5, v7, :cond_7

    .line 58
    .line 59
    const/16 v8, 0x53

    .line 60
    .line 61
    if-eq v5, v8, :cond_6

    .line 62
    .line 63
    const/16 v8, 0x49

    .line 64
    .line 65
    if-eq v5, v8, :cond_6

    .line 66
    .line 67
    const/16 v8, 0x4a

    .line 68
    .line 69
    if-eq v5, v8, :cond_5

    .line 70
    .line 71
    const/16 v8, 0x5a

    .line 72
    .line 73
    if-eq v5, v8, :cond_6

    .line 74
    .line 75
    const/16 v8, 0x5b

    .line 76
    .line 77
    if-eq v5, v8, :cond_2

    .line 78
    .line 79
    packed-switch v5, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    iput v4, p1, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_0
    add-int/lit8 p0, v4, 0x1

    .line 86
    .line 87
    sget-object v5, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 88
    .line 89
    aput-object v5, v1, v4

    .line 90
    .line 91
    :goto_3
    move v4, p0

    .line 92
    move p0, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-ne v5, v8, :cond_3

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-ne v5, v7, :cond_4

    .line 108
    .line 109
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eq v5, v6, :cond_4

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_4
    add-int/lit8 v5, v4, 0x1

    .line 119
    .line 120
    add-int/2addr v2, v3

    .line 121
    invoke-virtual {v0, p0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    aput-object p0, v1, v4

    .line 126
    .line 127
    move p0, v2

    .line 128
    move v4, v5

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    add-int/lit8 p0, v4, 0x1

    .line 131
    .line 132
    sget-object v5, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 133
    .line 134
    aput-object v5, v1, v4

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    :pswitch_1
    add-int/lit8 p0, v4, 0x1

    .line 138
    .line 139
    sget-object v5, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 140
    .line 141
    aput-object v5, v1, v4

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    move p0, v2

    .line 145
    :goto_6
    invoke-virtual {v0, p0}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eq v5, v6, :cond_8

    .line 150
    .line 151
    add-int/lit8 p0, p0, 0x1

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_8
    add-int/lit8 v5, v4, 0x1

    .line 155
    .line 156
    add-int/lit8 v6, p0, 0x1

    .line 157
    .line 158
    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    aput-object p0, v1, v4

    .line 163
    .line 164
    move v4, v5

    .line 165
    move p0, v6

    .line 166
    goto :goto_2

    .line 167
    :cond_9
    add-int/lit8 p0, v4, 0x1

    .line 168
    .line 169
    sget-object v5, Lnet/bytebuddy/jar/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    .line 170
    .line 171
    aput-object v5, v1, v4

    .line 172
    .line 173
    goto :goto_3

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private createDebugLabel(I[Lnet/bytebuddy/jar/asm/Label;)V
    .locals 1

    .line 1
    aget-object v0, p2, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    int-to-short p1, p1

    .line 14
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 6
    .line 7
    and-int/lit8 p1, p1, -0x2

    .line 8
    .line 9
    int-to-short p1, p1

    .line 10
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 11
    .line 12
    return-object p0
.end method

.method private getTypeAnnotationBytecodeOffset([II)I
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-ge p2, v0, :cond_1

    .line 5
    .line 6
    aget v0, p1, p2

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x43

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    aget p1, p1, p2

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 27
    return p0
.end method

.method private readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    sub-int/2addr v0, p3

    .line 5
    if-gt p4, v0, :cond_2

    .line 6
    .line 7
    array-length v0, p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    aget-object v2, p1, v1

    .line 12
    .line 13
    iget-object v3, v2, Lnet/bytebuddy/jar/asm/Attribute;->type:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move-object v3, p0

    .line 22
    move v4, p3

    .line 23
    move v5, p4

    .line 24
    move-object v6, p5

    .line 25
    move v7, p6

    .line 26
    move-object/from16 v8, p7

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v8}, Lnet/bytebuddy/jar/asm/Attribute;->read(Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v0, Lnet/bytebuddy/jar/asm/Attribute;

    .line 37
    .line 38
    invoke-direct {v0, p2}, Lnet/bytebuddy/jar/asm/Attribute;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v5, -0x1

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    move-object v1, p0

    .line 45
    move v2, p3

    .line 46
    move v3, p4

    .line 47
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/Attribute;->read(Lnet/bytebuddy/jar/asm/ClassReader;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method private readBootstrapMethodsAttribute(I)[I
    .locals 6

    .line 1
    new-array p1, p1, [C

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->getFirstAttributeOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v1, v0, -0x2

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    :goto_0
    if-lez v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    add-int/lit8 v3, v0, 0x2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    add-int/lit8 v4, v0, 0x6

    .line 26
    .line 27
    const-string v5, "BootstrapMethods"

    .line 28
    .line 29
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    new-array v1, p1, [I

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x8

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_1
    if-ge v2, p1, :cond_0

    .line 45
    .line 46
    aput v0, v1, v2

    .line 47
    .line 48
    add-int/lit8 v3, v0, 0x2

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    mul-int/lit8 v3, v3, 0x2

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x4

    .line 57
    .line 58
    add-int/2addr v0, v3

    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    return-object v1

    .line 63
    :cond_1
    add-int v0, v4, v3

    .line 64
    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return-object p0
.end method

.method private readCode(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;I)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v6, p3

    .line 8
    .line 9
    iget-object v10, v0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 10
    .line 11
    iget-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 12
    .line 13
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    add-int/lit8 v1, v6, 0x2

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    add-int/lit8 v1, v6, 0x4

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v13

    .line 29
    add-int/lit8 v14, v6, 0x8

    .line 30
    .line 31
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 32
    .line 33
    array-length v1, v1

    .line 34
    sub-int/2addr v1, v14

    .line 35
    if-gt v13, v1, :cond_40

    .line 36
    .line 37
    add-int v15, v14, v13

    .line 38
    .line 39
    add-int/lit8 v1, v13, 0x1

    .line 40
    .line 41
    new-array v7, v1, [Lnet/bytebuddy/jar/asm/Label;

    .line 42
    .line 43
    iput-object v7, v9, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 44
    .line 45
    move v1, v14

    .line 46
    :goto_0
    const/16 v2, 0x84

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-ge v1, v15, :cond_3

    .line 50
    .line 51
    sub-int v16, v1, v14

    .line 52
    .line 53
    const/16 v17, 0x8

    .line 54
    .line 55
    aget-byte v4, v10, v1

    .line 56
    .line 57
    and-int/lit16 v4, v4, 0xff

    .line 58
    .line 59
    packed-switch v4, :pswitch_data_0

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_0
    add-int/lit8 v2, v1, 0x1

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int v2, v2, v16

    .line 73
    .line 74
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 75
    .line 76
    .line 77
    :goto_1
    :pswitch_1
    add-int/lit8 v1, v1, 0x3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_2
    add-int/lit8 v2, v1, 0x1

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    add-int v2, v2, v16

    .line 87
    .line 88
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 89
    .line 90
    .line 91
    :pswitch_3
    add-int/lit8 v1, v1, 0x5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    :pswitch_4
    add-int/lit8 v1, v1, 0x4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_5
    add-int/lit8 v3, v1, 0x1

    .line 98
    .line 99
    aget-byte v3, v10, v3

    .line 100
    .line 101
    and-int/lit16 v3, v3, 0xff

    .line 102
    .line 103
    if-eq v3, v2, :cond_1

    .line 104
    .line 105
    const/16 v2, 0xa9

    .line 106
    .line 107
    if-eq v3, v2, :cond_0

    .line 108
    .line 109
    packed-switch v3, :pswitch_data_1

    .line 110
    .line 111
    .line 112
    packed-switch v3, :pswitch_data_2

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_1
    add-int/lit8 v1, v1, 0x6

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_6
    and-int/lit8 v2, v16, 0x3

    .line 123
    .line 124
    rsub-int/lit8 v2, v2, 0x4

    .line 125
    .line 126
    add-int/2addr v2, v1

    .line 127
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int v1, v1, v16

    .line 132
    .line 133
    invoke-direct {v0, v1, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 134
    .line 135
    .line 136
    add-int/lit8 v1, v2, 0x4

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    add-int/lit8 v2, v2, 0x8

    .line 143
    .line 144
    :goto_2
    add-int/lit8 v3, v1, -0x1

    .line 145
    .line 146
    if-lez v1, :cond_2

    .line 147
    .line 148
    add-int/lit8 v1, v2, 0x4

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int v1, v1, v16

    .line 155
    .line 156
    invoke-direct {v0, v1, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 157
    .line 158
    .line 159
    add-int/lit8 v2, v2, 0x8

    .line 160
    .line 161
    move v1, v3

    .line 162
    goto :goto_2

    .line 163
    :cond_2
    move v1, v2

    .line 164
    goto :goto_0

    .line 165
    :pswitch_7
    and-int/lit8 v2, v16, 0x3

    .line 166
    .line 167
    rsub-int/lit8 v2, v2, 0x4

    .line 168
    .line 169
    add-int/2addr v2, v1

    .line 170
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    add-int v1, v1, v16

    .line 175
    .line 176
    invoke-direct {v0, v1, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 177
    .line 178
    .line 179
    add-int/lit8 v1, v2, 0x8

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    add-int/lit8 v4, v2, 0x4

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    sub-int/2addr v1, v4

    .line 192
    add-int/2addr v1, v3

    .line 193
    add-int/lit8 v2, v2, 0xc

    .line 194
    .line 195
    :goto_3
    add-int/lit8 v3, v1, -0x1

    .line 196
    .line 197
    if-lez v1, :cond_2

    .line 198
    .line 199
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    add-int v1, v1, v16

    .line 204
    .line 205
    invoke-direct {v0, v1, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 206
    .line 207
    .line 208
    add-int/lit8 v2, v2, 0x4

    .line 209
    .line 210
    move v1, v3

    .line 211
    goto :goto_3

    .line 212
    :pswitch_8
    add-int/lit8 v2, v1, 0x1

    .line 213
    .line 214
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    add-int v2, v2, v16

    .line 219
    .line 220
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 221
    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_9
    add-int/lit8 v1, v1, 0x2

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :pswitch_a
    add-int/lit8 v1, v1, 0x1

    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_3
    const/16 v17, 0x8

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    add-int/lit8 v1, v1, 0x2

    .line 240
    .line 241
    :goto_4
    add-int/lit8 v16, v4, -0x1

    .line 242
    .line 243
    if-lez v4, :cond_4

    .line 244
    .line 245
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    invoke-direct {v0, v4, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    add-int/lit8 v2, v1, 0x2

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    add-int/lit8 v3, v1, 0x4

    .line 264
    .line 265
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    invoke-direct {v0, v3, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    iget-object v6, v0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 274
    .line 275
    move-object/from16 v20, v6

    .line 276
    .line 277
    add-int/lit8 v6, v1, 0x6

    .line 278
    .line 279
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    aget v6, v20, v6

    .line 284
    .line 285
    invoke-virtual {v0, v6, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    add-int/lit8 v1, v1, 0x8

    .line 290
    .line 291
    invoke-virtual {v8, v4, v2, v3, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchBlock(Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    move/from16 v6, p3

    .line 295
    .line 296
    move/from16 v4, v16

    .line 297
    .line 298
    const/16 v2, 0x84

    .line 299
    .line 300
    const/4 v3, 0x1

    .line 301
    goto :goto_4

    .line 302
    :cond_4
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    add-int/lit8 v1, v1, 0x2

    .line 307
    .line 308
    const/4 v6, 0x0

    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    const/16 v23, 0x0

    .line 316
    .line 317
    const/16 v24, 0x1

    .line 318
    .line 319
    const/16 v25, 0x0

    .line 320
    .line 321
    const/16 v26, 0x0

    .line 322
    .line 323
    :goto_5
    add-int/lit8 v20, v2, -0x1

    .line 324
    .line 325
    if-lez v2, :cond_e

    .line 326
    .line 327
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    add-int/lit8 v3, v1, 0x2

    .line 332
    .line 333
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    move/from16 v27, v3

    .line 338
    .line 339
    add-int/lit8 v3, v1, 0x6

    .line 340
    .line 341
    const-string v4, "LocalVariableTable"

    .line 342
    .line 343
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_7

    .line 348
    .line 349
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 350
    .line 351
    and-int/lit8 v2, v2, 0x2

    .line 352
    .line 353
    if-nez v2, :cond_6

    .line 354
    .line 355
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    add-int/lit8 v1, v1, 0x8

    .line 360
    .line 361
    :goto_6
    add-int/lit8 v4, v2, -0x1

    .line 362
    .line 363
    if-lez v2, :cond_5

    .line 364
    .line 365
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createDebugLabel(I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 370
    .line 371
    .line 372
    move/from16 v25, v1

    .line 373
    .line 374
    add-int/lit8 v1, v25, 0x2

    .line 375
    .line 376
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    add-int/2addr v1, v2

    .line 381
    invoke-direct {v0, v1, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createDebugLabel(I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 382
    .line 383
    .line 384
    add-int/lit8 v1, v25, 0xa

    .line 385
    .line 386
    move v2, v4

    .line 387
    goto :goto_6

    .line 388
    :cond_5
    move/from16 v25, v3

    .line 389
    .line 390
    :cond_6
    :goto_7
    move-object/from16 v29, v6

    .line 391
    .line 392
    move/from16 v8, v17

    .line 393
    .line 394
    const/16 v19, 0x1

    .line 395
    .line 396
    :goto_8
    move-object v6, v0

    .line 397
    move-object v0, v7

    .line 398
    goto/16 :goto_a

    .line 399
    .line 400
    :cond_7
    const-string v4, "LocalVariableTypeTable"

    .line 401
    .line 402
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    if-eqz v4, :cond_8

    .line 407
    .line 408
    move/from16 v26, v3

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_8
    const-string v4, "LineNumberTable"

    .line 412
    .line 413
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-eqz v4, :cond_9

    .line 418
    .line 419
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 420
    .line 421
    and-int/lit8 v2, v2, 0x2

    .line 422
    .line 423
    if-nez v2, :cond_6

    .line 424
    .line 425
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    add-int/lit8 v1, v1, 0x8

    .line 430
    .line 431
    :goto_9
    add-int/lit8 v4, v2, -0x1

    .line 432
    .line 433
    if-lez v2, :cond_6

    .line 434
    .line 435
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    move/from16 v28, v1

    .line 440
    .line 441
    add-int/lit8 v1, v28, 0x2

    .line 442
    .line 443
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    add-int/lit8 v28, v28, 0x4

    .line 448
    .line 449
    invoke-direct {v0, v2, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->createDebugLabel(I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 450
    .line 451
    .line 452
    aget-object v2, v7, v2

    .line 453
    .line 454
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/Label;->addLineNumber(I)V

    .line 455
    .line 456
    .line 457
    move v2, v4

    .line 458
    move/from16 v1, v28

    .line 459
    .line 460
    goto :goto_9

    .line 461
    :cond_9
    const-string v4, "RuntimeVisibleTypeAnnotations"

    .line 462
    .line 463
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-eqz v4, :cond_a

    .line 468
    .line 469
    const/4 v4, 0x1

    .line 470
    invoke-direct {v0, v8, v9, v3, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)[I

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    move-object v6, v0

    .line 475
    move-object/from16 v29, v1

    .line 476
    .line 477
    move/from16 v19, v4

    .line 478
    .line 479
    move-object v0, v7

    .line 480
    move/from16 v8, v17

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_a
    const-string v4, "RuntimeInvisibleTypeAnnotations"

    .line 484
    .line 485
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    if-eqz v4, :cond_b

    .line 490
    .line 491
    const/4 v4, 0x0

    .line 492
    invoke-direct {v0, v8, v9, v3, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)[I

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    move-object/from16 v21, v1

    .line 497
    .line 498
    goto :goto_7

    .line 499
    :cond_b
    const-string v4, "StackMapTable"

    .line 500
    .line 501
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    if-eqz v4, :cond_c

    .line 506
    .line 507
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 508
    .line 509
    and-int/lit8 v2, v2, 0x4

    .line 510
    .line 511
    if-nez v2, :cond_6

    .line 512
    .line 513
    add-int/lit8 v1, v1, 0x8

    .line 514
    .line 515
    add-int v2, v3, v27

    .line 516
    .line 517
    move/from16 v16, v1

    .line 518
    .line 519
    move/from16 v22, v2

    .line 520
    .line 521
    goto/16 :goto_7

    .line 522
    .line 523
    :cond_c
    const-string v4, "StackMap"

    .line 524
    .line 525
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    if-eqz v4, :cond_d

    .line 530
    .line 531
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 532
    .line 533
    and-int/lit8 v2, v2, 0x4

    .line 534
    .line 535
    if-nez v2, :cond_6

    .line 536
    .line 537
    add-int/lit8 v1, v1, 0x8

    .line 538
    .line 539
    add-int v2, v3, v27

    .line 540
    .line 541
    move/from16 v16, v1

    .line 542
    .line 543
    move/from16 v22, v2

    .line 544
    .line 545
    move-object/from16 v29, v6

    .line 546
    .line 547
    move/from16 v8, v17

    .line 548
    .line 549
    const/16 v19, 0x1

    .line 550
    .line 551
    const/16 v24, 0x0

    .line 552
    .line 553
    goto/16 :goto_8

    .line 554
    .line 555
    :cond_d
    iget-object v1, v9, Lnet/bytebuddy/jar/asm/Context;->attributePrototypes:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 556
    .line 557
    move-object/from16 v29, v6

    .line 558
    .line 559
    move/from16 v8, v17

    .line 560
    .line 561
    move/from16 v4, v27

    .line 562
    .line 563
    const/16 v19, 0x1

    .line 564
    .line 565
    move/from16 v6, p3

    .line 566
    .line 567
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    move-object v6, v0

    .line 572
    move-object v0, v7

    .line 573
    move-object/from16 v7, v23

    .line 574
    .line 575
    iput-object v7, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 576
    .line 577
    move-object/from16 v23, v1

    .line 578
    .line 579
    :goto_a
    add-int v1, v3, v27

    .line 580
    .line 581
    move-object v7, v0

    .line 582
    move-object v0, v6

    .line 583
    move/from16 v17, v8

    .line 584
    .line 585
    move/from16 v2, v20

    .line 586
    .line 587
    move-object/from16 v6, v29

    .line 588
    .line 589
    move-object/from16 v8, p1

    .line 590
    .line 591
    goto/16 :goto_5

    .line 592
    .line 593
    :cond_e
    move-object/from16 v29, v6

    .line 594
    .line 595
    move/from16 v8, v17

    .line 596
    .line 597
    const/16 v19, 0x1

    .line 598
    .line 599
    move-object v6, v0

    .line 600
    move-object v0, v7

    .line 601
    move-object/from16 v7, v23

    .line 602
    .line 603
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 604
    .line 605
    and-int/2addr v1, v8

    .line 606
    if-eqz v1, :cond_f

    .line 607
    .line 608
    move/from16 v3, v19

    .line 609
    .line 610
    goto :goto_b

    .line 611
    :cond_f
    const/4 v3, 0x0

    .line 612
    :goto_b
    const/4 v1, -0x1

    .line 613
    if-eqz v16, :cond_14

    .line 614
    .line 615
    iput v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameOffset:I

    .line 616
    .line 617
    const/4 v4, 0x0

    .line 618
    iput v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 619
    .line 620
    iput v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 621
    .line 622
    iput v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 623
    .line 624
    new-array v2, v12, [Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 627
    .line 628
    iput v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 629
    .line 630
    new-array v2, v11, [Ljava/lang/Object;

    .line 631
    .line 632
    iput-object v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 633
    .line 634
    if-eqz v3, :cond_10

    .line 635
    .line 636
    invoke-direct {v6, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->computeImplicitFrame(Lnet/bytebuddy/jar/asm/Context;)V

    .line 637
    .line 638
    .line 639
    :cond_10
    move/from16 v2, v16

    .line 640
    .line 641
    :goto_c
    move/from16 v4, v22

    .line 642
    .line 643
    add-int/lit8 v1, v4, -0x2

    .line 644
    .line 645
    if-ge v2, v1, :cond_13

    .line 646
    .line 647
    aget-byte v1, v10, v2

    .line 648
    .line 649
    if-ne v1, v8, :cond_11

    .line 650
    .line 651
    add-int/lit8 v1, v2, 0x1

    .line 652
    .line 653
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-ltz v1, :cond_11

    .line 658
    .line 659
    if-ge v1, v13, :cond_11

    .line 660
    .line 661
    add-int v17, v14, v1

    .line 662
    .line 663
    move/from16 v18, v8

    .line 664
    .line 665
    aget-byte v8, v10, v17

    .line 666
    .line 667
    and-int/lit16 v8, v8, 0xff

    .line 668
    .line 669
    move/from16 v17, v2

    .line 670
    .line 671
    const/16 v2, 0xbb

    .line 672
    .line 673
    if-ne v8, v2, :cond_12

    .line 674
    .line 675
    invoke-direct {v6, v1, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 676
    .line 677
    .line 678
    goto :goto_d

    .line 679
    :cond_11
    move/from16 v17, v2

    .line 680
    .line 681
    move/from16 v18, v8

    .line 682
    .line 683
    :cond_12
    :goto_d
    add-int/lit8 v2, v17, 0x1

    .line 684
    .line 685
    move/from16 v22, v4

    .line 686
    .line 687
    move/from16 v8, v18

    .line 688
    .line 689
    const/4 v1, -0x1

    .line 690
    goto :goto_c

    .line 691
    :cond_13
    :goto_e
    move/from16 v18, v8

    .line 692
    .line 693
    goto :goto_f

    .line 694
    :cond_14
    move/from16 v4, v22

    .line 695
    .line 696
    goto :goto_e

    .line 697
    :goto_f
    if-eqz v3, :cond_15

    .line 698
    .line 699
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 700
    .line 701
    and-int/lit16 v1, v1, 0x100

    .line 702
    .line 703
    if-eqz v1, :cond_15

    .line 704
    .line 705
    move/from16 v22, v4

    .line 706
    .line 707
    const/4 v4, 0x0

    .line 708
    move-object v1, v5

    .line 709
    const/4 v5, 0x0

    .line 710
    move-object v2, v1

    .line 711
    const/4 v1, -0x1

    .line 712
    move v8, v3

    .line 713
    const/4 v3, 0x0

    .line 714
    move-object/from16 v17, v7

    .line 715
    .line 716
    move-object/from16 v20, v10

    .line 717
    .line 718
    move/from16 v7, v22

    .line 719
    .line 720
    move v10, v8

    .line 721
    move/from16 v22, v13

    .line 722
    .line 723
    const/4 v13, -0x1

    .line 724
    move-object v8, v2

    .line 725
    move v2, v12

    .line 726
    move-object v12, v0

    .line 727
    move-object/from16 v0, p1

    .line 728
    .line 729
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :goto_10
    move-object/from16 v1, v29

    .line 733
    .line 734
    const/4 v4, 0x0

    .line 735
    goto :goto_11

    .line 736
    :cond_15
    move-object v8, v5

    .line 737
    move-object/from16 v17, v7

    .line 738
    .line 739
    move-object/from16 v20, v10

    .line 740
    .line 741
    move v2, v12

    .line 742
    move/from16 v22, v13

    .line 743
    .line 744
    const/4 v13, -0x1

    .line 745
    move-object v12, v0

    .line 746
    move v10, v3

    .line 747
    move v7, v4

    .line 748
    move-object/from16 v0, p1

    .line 749
    .line 750
    goto :goto_10

    .line 751
    :goto_11
    invoke-direct {v6, v1, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->getTypeAnnotationBytecodeOffset([II)I

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    move-object/from16 v5, v21

    .line 756
    .line 757
    invoke-direct {v6, v5, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->getTypeAnnotationBytecodeOffset([II)I

    .line 758
    .line 759
    .line 760
    move-result v21

    .line 761
    iget v4, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 762
    .line 763
    and-int/lit16 v4, v4, 0x100

    .line 764
    .line 765
    if-nez v4, :cond_16

    .line 766
    .line 767
    const/16 v4, 0x21

    .line 768
    .line 769
    move/from16 v23, v4

    .line 770
    .line 771
    goto :goto_12

    .line 772
    :cond_16
    const/16 v23, 0x0

    .line 773
    .line 774
    :goto_12
    move/from16 v4, v16

    .line 775
    .line 776
    move/from16 v16, v3

    .line 777
    .line 778
    move v3, v4

    .line 779
    move v13, v14

    .line 780
    move/from16 v28, v21

    .line 781
    .line 782
    const/4 v4, 0x0

    .line 783
    const/16 v21, 0x0

    .line 784
    .line 785
    const/16 v27, 0x0

    .line 786
    .line 787
    :goto_13
    if-ge v13, v15, :cond_32

    .line 788
    .line 789
    move/from16 v29, v13

    .line 790
    .line 791
    sub-int v13, v29, v14

    .line 792
    .line 793
    invoke-virtual {v6, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readBytecodeInstructionOffset(I)V

    .line 794
    .line 795
    .line 796
    move-object/from16 v31, v1

    .line 797
    .line 798
    aget-object v1, v12, v13

    .line 799
    .line 800
    move/from16 v32, v2

    .line 801
    .line 802
    if-eqz v1, :cond_18

    .line 803
    .line 804
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 805
    .line 806
    and-int/lit8 v2, v2, 0x2

    .line 807
    .line 808
    if-nez v2, :cond_17

    .line 809
    .line 810
    move/from16 v2, v19

    .line 811
    .line 812
    goto :goto_14

    .line 813
    :cond_17
    const/4 v2, 0x0

    .line 814
    :goto_14
    invoke-virtual {v1, v0, v2}, Lnet/bytebuddy/jar/asm/Label;->accept(Lnet/bytebuddy/jar/asm/MethodVisitor;Z)V

    .line 815
    .line 816
    .line 817
    :cond_18
    :goto_15
    if-eqz v3, :cond_1f

    .line 818
    .line 819
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameOffset:I

    .line 820
    .line 821
    const/4 v2, -0x1

    .line 822
    if-eq v1, v13, :cond_1a

    .line 823
    .line 824
    if-ne v1, v2, :cond_19

    .line 825
    .line 826
    goto :goto_17

    .line 827
    :cond_19
    move/from16 v34, v2

    .line 828
    .line 829
    :goto_16
    move-object/from16 v35, v5

    .line 830
    .line 831
    move/from16 v36, v14

    .line 832
    .line 833
    move/from16 v14, v24

    .line 834
    .line 835
    move/from16 v24, v15

    .line 836
    .line 837
    move-object/from16 v15, v31

    .line 838
    .line 839
    move/from16 v31, v11

    .line 840
    .line 841
    move v11, v3

    .line 842
    goto/16 :goto_1c

    .line 843
    .line 844
    :cond_1a
    :goto_17
    if-eq v1, v2, :cond_1d

    .line 845
    .line 846
    if-eqz v24, :cond_1b

    .line 847
    .line 848
    if-eqz v10, :cond_1c

    .line 849
    .line 850
    :cond_1b
    move/from16 v34, v2

    .line 851
    .line 852
    move-object/from16 v35, v5

    .line 853
    .line 854
    move/from16 v36, v14

    .line 855
    .line 856
    move/from16 v14, v24

    .line 857
    .line 858
    move/from16 v24, v15

    .line 859
    .line 860
    move-object/from16 v15, v31

    .line 861
    .line 862
    move/from16 v31, v11

    .line 863
    .line 864
    move v11, v3

    .line 865
    goto :goto_18

    .line 866
    :cond_1c
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 867
    .line 868
    move v4, v2

    .line 869
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 870
    .line 871
    move/from16 v33, v3

    .line 872
    .line 873
    iget-object v3, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 874
    .line 875
    move/from16 v34, v4

    .line 876
    .line 877
    iget v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 878
    .line 879
    move-object/from16 v35, v5

    .line 880
    .line 881
    iget-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 882
    .line 883
    move/from16 v36, v14

    .line 884
    .line 885
    move/from16 v14, v24

    .line 886
    .line 887
    move/from16 v24, v15

    .line 888
    .line 889
    move-object/from16 v15, v31

    .line 890
    .line 891
    move/from16 v31, v11

    .line 892
    .line 893
    move/from16 v11, v33

    .line 894
    .line 895
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    goto :goto_19

    .line 899
    :goto_18
    iget v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 900
    .line 901
    iget-object v3, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 902
    .line 903
    iget v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 904
    .line 905
    iget-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 906
    .line 907
    const/4 v1, -0x1

    .line 908
    move-object/from16 v0, p1

    .line 909
    .line 910
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    :goto_19
    const/4 v4, 0x0

    .line 914
    goto :goto_1a

    .line 915
    :cond_1d
    move/from16 v34, v2

    .line 916
    .line 917
    move-object/from16 v35, v5

    .line 918
    .line 919
    move/from16 v36, v14

    .line 920
    .line 921
    move/from16 v14, v24

    .line 922
    .line 923
    move/from16 v24, v15

    .line 924
    .line 925
    move-object/from16 v15, v31

    .line 926
    .line 927
    move/from16 v31, v11

    .line 928
    .line 929
    move v11, v3

    .line 930
    :goto_1a
    if-ge v11, v7, :cond_1e

    .line 931
    .line 932
    invoke-direct {v6, v11, v14, v10, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readStackMapFrame(IZZLnet/bytebuddy/jar/asm/Context;)I

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    move-object/from16 v0, p1

    .line 937
    .line 938
    move/from16 v11, v31

    .line 939
    .line 940
    move-object/from16 v5, v35

    .line 941
    .line 942
    :goto_1b
    move-object/from16 v31, v15

    .line 943
    .line 944
    move/from16 v15, v24

    .line 945
    .line 946
    move/from16 v24, v14

    .line 947
    .line 948
    move/from16 v14, v36

    .line 949
    .line 950
    goto/16 :goto_15

    .line 951
    .line 952
    :cond_1e
    move-object/from16 v0, p1

    .line 953
    .line 954
    move/from16 v11, v31

    .line 955
    .line 956
    move-object/from16 v5, v35

    .line 957
    .line 958
    const/4 v3, 0x0

    .line 959
    goto :goto_1b

    .line 960
    :cond_1f
    const/16 v34, -0x1

    .line 961
    .line 962
    goto/16 :goto_16

    .line 963
    .line 964
    :goto_1c
    if-eqz v4, :cond_21

    .line 965
    .line 966
    iget v0, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 967
    .line 968
    and-int/lit8 v0, v0, 0x8

    .line 969
    .line 970
    if-eqz v0, :cond_20

    .line 971
    .line 972
    const/4 v4, 0x0

    .line 973
    const/4 v5, 0x0

    .line 974
    const/16 v1, 0x100

    .line 975
    .line 976
    const/4 v2, 0x0

    .line 977
    const/4 v3, 0x0

    .line 978
    move-object/from16 v0, p1

    .line 979
    .line 980
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    goto :goto_1d

    .line 984
    :cond_20
    move-object/from16 v0, p1

    .line 985
    .line 986
    :goto_1d
    const/16 v33, 0x0

    .line 987
    .line 988
    goto :goto_1e

    .line 989
    :cond_21
    move-object/from16 v0, p1

    .line 990
    .line 991
    move/from16 v33, v4

    .line 992
    .line 993
    :goto_1e
    aget-byte v1, v20, v29

    .line 994
    .line 995
    and-int/lit16 v1, v1, 0xff

    .line 996
    .line 997
    const/16 v2, 0xc8

    .line 998
    .line 999
    packed-switch v1, :pswitch_data_3

    .line 1000
    .line 1001
    .line 1002
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 1003
    .line 1004
    .line 1005
    return-void

    .line 1006
    :pswitch_b
    add-int/lit8 v1, v29, 0x1

    .line 1007
    .line 1008
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    add-int/2addr v1, v13

    .line 1013
    aget-object v1, v12, v1

    .line 1014
    .line 1015
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1016
    .line 1017
    .line 1018
    add-int/lit8 v1, v29, 0x5

    .line 1019
    .line 1020
    move/from16 p3, v7

    .line 1021
    .line 1022
    move/from16 v37, v10

    .line 1023
    .line 1024
    move/from16 v2, v16

    .line 1025
    .line 1026
    move/from16 v4, v19

    .line 1027
    .line 1028
    :goto_1f
    move/from16 v3, v21

    .line 1029
    .line 1030
    :goto_20
    const/16 v30, 0x84

    .line 1031
    .line 1032
    goto/16 :goto_32

    .line 1033
    .line 1034
    :pswitch_c
    const/16 v3, 0xda

    .line 1035
    .line 1036
    if-ge v1, v3, :cond_22

    .line 1037
    .line 1038
    add-int/lit8 v1, v1, -0x31

    .line 1039
    .line 1040
    goto :goto_21

    .line 1041
    :cond_22
    add-int/lit8 v1, v1, -0x14

    .line 1042
    .line 1043
    :goto_21
    add-int/lit8 v3, v29, 0x1

    .line 1044
    .line 1045
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1046
    .line 1047
    .line 1048
    move-result v3

    .line 1049
    add-int/2addr v3, v13

    .line 1050
    aget-object v3, v12, v3

    .line 1051
    .line 1052
    const/16 v4, 0xa7

    .line 1053
    .line 1054
    if-eq v1, v4, :cond_25

    .line 1055
    .line 1056
    const/16 v5, 0xa8

    .line 1057
    .line 1058
    if-ne v1, v5, :cond_23

    .line 1059
    .line 1060
    goto :goto_23

    .line 1061
    :cond_23
    if-ge v1, v4, :cond_24

    .line 1062
    .line 1063
    add-int/lit8 v1, v1, 0x1

    .line 1064
    .line 1065
    xor-int/lit8 v1, v1, 0x1

    .line 1066
    .line 1067
    add-int/lit8 v1, v1, -0x1

    .line 1068
    .line 1069
    goto :goto_22

    .line 1070
    :cond_24
    xor-int/lit8 v1, v1, 0x1

    .line 1071
    .line 1072
    :goto_22
    add-int/lit8 v4, v13, 0x3

    .line 1073
    .line 1074
    invoke-direct {v6, v4, v12}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    invoke-virtual {v0, v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v0, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1082
    .line 1083
    .line 1084
    move/from16 v3, v19

    .line 1085
    .line 1086
    goto :goto_24

    .line 1087
    :cond_25
    :goto_23
    add-int/lit8 v1, v1, 0x21

    .line 1088
    .line 1089
    invoke-virtual {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1090
    .line 1091
    .line 1092
    move/from16 v3, v33

    .line 1093
    .line 1094
    :goto_24
    add-int/lit8 v1, v29, 0x3

    .line 1095
    .line 1096
    move v4, v3

    .line 1097
    move/from16 p3, v7

    .line 1098
    .line 1099
    move/from16 v37, v10

    .line 1100
    .line 1101
    move/from16 v2, v16

    .line 1102
    .line 1103
    goto :goto_1f

    .line 1104
    :pswitch_d
    sub-int v1, v1, v23

    .line 1105
    .line 1106
    add-int/lit8 v2, v29, 0x1

    .line 1107
    .line 1108
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1109
    .line 1110
    .line 1111
    move-result v2

    .line 1112
    add-int/2addr v2, v13

    .line 1113
    aget-object v2, v12, v2

    .line 1114
    .line 1115
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1116
    .line 1117
    .line 1118
    add-int/lit8 v1, v29, 0x5

    .line 1119
    .line 1120
    :goto_25
    move/from16 p3, v7

    .line 1121
    .line 1122
    move/from16 v37, v10

    .line 1123
    .line 1124
    :goto_26
    move/from16 v2, v16

    .line 1125
    .line 1126
    move/from16 v3, v21

    .line 1127
    .line 1128
    move/from16 v4, v33

    .line 1129
    .line 1130
    goto :goto_20

    .line 1131
    :pswitch_e
    add-int/lit8 v1, v29, 0x1

    .line 1132
    .line 1133
    invoke-virtual {v6, v1, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    add-int/lit8 v2, v29, 0x3

    .line 1138
    .line 1139
    aget-byte v2, v20, v2

    .line 1140
    .line 1141
    and-int/lit16 v2, v2, 0xff

    .line 1142
    .line 1143
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMultiANewArrayInsn(Ljava/lang/String;I)V

    .line 1144
    .line 1145
    .line 1146
    add-int/lit8 v1, v29, 0x4

    .line 1147
    .line 1148
    goto :goto_25

    .line 1149
    :pswitch_f
    add-int/lit8 v1, v29, 0x1

    .line 1150
    .line 1151
    aget-byte v1, v20, v1

    .line 1152
    .line 1153
    and-int/lit16 v1, v1, 0xff

    .line 1154
    .line 1155
    const/16 v2, 0x84

    .line 1156
    .line 1157
    if-ne v1, v2, :cond_26

    .line 1158
    .line 1159
    add-int/lit8 v1, v29, 0x2

    .line 1160
    .line 1161
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1162
    .line 1163
    .line 1164
    move-result v1

    .line 1165
    add-int/lit8 v3, v29, 0x4

    .line 1166
    .line 1167
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 1168
    .line 1169
    .line 1170
    move-result v3

    .line 1171
    invoke-virtual {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 1172
    .line 1173
    .line 1174
    add-int/lit8 v1, v29, 0x6

    .line 1175
    .line 1176
    :goto_27
    move/from16 v30, v2

    .line 1177
    .line 1178
    move/from16 p3, v7

    .line 1179
    .line 1180
    move/from16 v37, v10

    .line 1181
    .line 1182
    :goto_28
    move/from16 v2, v16

    .line 1183
    .line 1184
    move/from16 v3, v21

    .line 1185
    .line 1186
    move/from16 v4, v33

    .line 1187
    .line 1188
    goto/16 :goto_32

    .line 1189
    .line 1190
    :cond_26
    add-int/lit8 v3, v29, 0x2

    .line 1191
    .line 1192
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1193
    .line 1194
    .line 1195
    move-result v3

    .line 1196
    invoke-virtual {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1197
    .line 1198
    .line 1199
    add-int/lit8 v1, v29, 0x4

    .line 1200
    .line 1201
    goto :goto_27

    .line 1202
    :pswitch_10
    const/16 v2, 0x84

    .line 1203
    .line 1204
    add-int/lit8 v3, v29, 0x1

    .line 1205
    .line 1206
    invoke-virtual {v6, v3, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    invoke-virtual {v0, v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    add-int/lit8 v1, v29, 0x3

    .line 1214
    .line 1215
    goto :goto_27

    .line 1216
    :pswitch_11
    const/16 v2, 0x84

    .line 1217
    .line 1218
    iget-object v1, v6, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 1219
    .line 1220
    add-int/lit8 v3, v29, 0x1

    .line 1221
    .line 1222
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1223
    .line 1224
    .line 1225
    move-result v3

    .line 1226
    aget v1, v1, v3

    .line 1227
    .line 1228
    iget-object v3, v6, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 1229
    .line 1230
    add-int/lit8 v4, v1, 0x2

    .line 1231
    .line 1232
    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1233
    .line 1234
    .line 1235
    move-result v4

    .line 1236
    aget v3, v3, v4

    .line 1237
    .line 1238
    invoke-virtual {v6, v3, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v4

    .line 1242
    add-int/lit8 v3, v3, 0x2

    .line 1243
    .line 1244
    invoke-virtual {v6, v3, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v3

    .line 1248
    iget-object v5, v6, Lnet/bytebuddy/jar/asm/ClassReader;->bootstrapMethodOffsets:[I

    .line 1249
    .line 1250
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1251
    .line 1252
    .line 1253
    move-result v1

    .line 1254
    aget v1, v5, v1

    .line 1255
    .line 1256
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1257
    .line 1258
    .line 1259
    move-result v5

    .line 1260
    invoke-virtual {v6, v5, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v5

    .line 1264
    check-cast v5, Lnet/bytebuddy/jar/asm/Handle;

    .line 1265
    .line 1266
    add-int/lit8 v2, v1, 0x2

    .line 1267
    .line 1268
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    move/from16 p3, v1

    .line 1273
    .line 1274
    new-array v1, v2, [Ljava/lang/Object;

    .line 1275
    .line 1276
    add-int/lit8 v37, p3, 0x4

    .line 1277
    .line 1278
    move/from16 p3, v37

    .line 1279
    .line 1280
    move/from16 v37, v10

    .line 1281
    .line 1282
    move/from16 v10, p3

    .line 1283
    .line 1284
    move/from16 p3, v7

    .line 1285
    .line 1286
    const/4 v7, 0x0

    .line 1287
    :goto_29
    if-ge v7, v2, :cond_27

    .line 1288
    .line 1289
    move/from16 v38, v2

    .line 1290
    .line 1291
    invoke-virtual {v6, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1292
    .line 1293
    .line 1294
    move-result v2

    .line 1295
    invoke-virtual {v6, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    aput-object v2, v1, v7

    .line 1300
    .line 1301
    add-int/lit8 v10, v10, 0x2

    .line 1302
    .line 1303
    add-int/lit8 v7, v7, 0x1

    .line 1304
    .line 1305
    move/from16 v2, v38

    .line 1306
    .line 1307
    goto :goto_29

    .line 1308
    :cond_27
    invoke-virtual {v0, v4, v3, v5, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 1309
    .line 1310
    .line 1311
    add-int/lit8 v1, v29, 0x5

    .line 1312
    .line 1313
    goto/16 :goto_26

    .line 1314
    .line 1315
    :pswitch_12
    move/from16 p3, v7

    .line 1316
    .line 1317
    move/from16 v37, v10

    .line 1318
    .line 1319
    iget-object v2, v6, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 1320
    .line 1321
    add-int/lit8 v3, v29, 0x1

    .line 1322
    .line 1323
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1324
    .line 1325
    .line 1326
    move-result v3

    .line 1327
    aget v2, v2, v3

    .line 1328
    .line 1329
    iget-object v3, v6, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 1330
    .line 1331
    add-int/lit8 v4, v2, 0x2

    .line 1332
    .line 1333
    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1334
    .line 1335
    .line 1336
    move-result v4

    .line 1337
    aget v3, v3, v4

    .line 1338
    .line 1339
    move v4, v2

    .line 1340
    invoke-virtual {v6, v4, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v2

    .line 1344
    move v5, v3

    .line 1345
    invoke-virtual {v6, v5, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v3

    .line 1349
    add-int/lit8 v5, v5, 0x2

    .line 1350
    .line 1351
    invoke-virtual {v6, v5, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v5

    .line 1355
    const/16 v7, 0xb6

    .line 1356
    .line 1357
    if-ge v1, v7, :cond_28

    .line 1358
    .line 1359
    invoke-virtual {v0, v1, v2, v3, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1360
    .line 1361
    .line 1362
    const/16 v30, 0x84

    .line 1363
    .line 1364
    goto :goto_2c

    .line 1365
    :cond_28
    add-int/lit8 v4, v4, -0x1

    .line 1366
    .line 1367
    aget-byte v4, v20, v4

    .line 1368
    .line 1369
    const/16 v7, 0xb

    .line 1370
    .line 1371
    if-ne v4, v7, :cond_29

    .line 1372
    .line 1373
    move-object v4, v5

    .line 1374
    move/from16 v5, v19

    .line 1375
    .line 1376
    :goto_2a
    const/16 v30, 0x84

    .line 1377
    .line 1378
    goto :goto_2b

    .line 1379
    :cond_29
    move-object v4, v5

    .line 1380
    const/4 v5, 0x0

    .line 1381
    goto :goto_2a

    .line 1382
    :goto_2b
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1383
    .line 1384
    .line 1385
    :goto_2c
    const/16 v2, 0xb9

    .line 1386
    .line 1387
    if-ne v1, v2, :cond_2a

    .line 1388
    .line 1389
    add-int/lit8 v1, v29, 0x5

    .line 1390
    .line 1391
    goto/16 :goto_28

    .line 1392
    .line 1393
    :cond_2a
    :goto_2d
    add-int/lit8 v1, v29, 0x3

    .line 1394
    .line 1395
    goto/16 :goto_28

    .line 1396
    .line 1397
    :pswitch_13
    move/from16 p3, v7

    .line 1398
    .line 1399
    move/from16 v37, v10

    .line 1400
    .line 1401
    const/16 v30, 0x84

    .line 1402
    .line 1403
    and-int/lit8 v1, v13, 0x3

    .line 1404
    .line 1405
    rsub-int/lit8 v1, v1, 0x4

    .line 1406
    .line 1407
    add-int v1, v1, v29

    .line 1408
    .line 1409
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1410
    .line 1411
    .line 1412
    move-result v2

    .line 1413
    add-int/2addr v2, v13

    .line 1414
    aget-object v2, v12, v2

    .line 1415
    .line 1416
    add-int/lit8 v3, v1, 0x4

    .line 1417
    .line 1418
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1419
    .line 1420
    .line 1421
    move-result v3

    .line 1422
    add-int/lit8 v1, v1, 0x8

    .line 1423
    .line 1424
    new-array v4, v3, [I

    .line 1425
    .line 1426
    new-array v5, v3, [Lnet/bytebuddy/jar/asm/Label;

    .line 1427
    .line 1428
    const/4 v7, 0x0

    .line 1429
    :goto_2e
    if-ge v7, v3, :cond_2b

    .line 1430
    .line 1431
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1432
    .line 1433
    .line 1434
    move-result v10

    .line 1435
    aput v10, v4, v7

    .line 1436
    .line 1437
    add-int/lit8 v10, v1, 0x4

    .line 1438
    .line 1439
    invoke-virtual {v6, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1440
    .line 1441
    .line 1442
    move-result v10

    .line 1443
    add-int/2addr v10, v13

    .line 1444
    aget-object v10, v12, v10

    .line 1445
    .line 1446
    aput-object v10, v5, v7

    .line 1447
    .line 1448
    add-int/lit8 v1, v1, 0x8

    .line 1449
    .line 1450
    add-int/lit8 v7, v7, 0x1

    .line 1451
    .line 1452
    goto :goto_2e

    .line 1453
    :cond_2b
    invoke-virtual {v0, v2, v4, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLookupSwitchInsn(Lnet/bytebuddy/jar/asm/Label;[I[Lnet/bytebuddy/jar/asm/Label;)V

    .line 1454
    .line 1455
    .line 1456
    goto/16 :goto_28

    .line 1457
    .line 1458
    :pswitch_14
    move/from16 p3, v7

    .line 1459
    .line 1460
    move/from16 v37, v10

    .line 1461
    .line 1462
    const/16 v30, 0x84

    .line 1463
    .line 1464
    and-int/lit8 v1, v13, 0x3

    .line 1465
    .line 1466
    rsub-int/lit8 v1, v1, 0x4

    .line 1467
    .line 1468
    add-int v1, v1, v29

    .line 1469
    .line 1470
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1471
    .line 1472
    .line 1473
    move-result v2

    .line 1474
    add-int/2addr v2, v13

    .line 1475
    aget-object v2, v12, v2

    .line 1476
    .line 1477
    add-int/lit8 v3, v1, 0x4

    .line 1478
    .line 1479
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1480
    .line 1481
    .line 1482
    move-result v3

    .line 1483
    add-int/lit8 v4, v1, 0x8

    .line 1484
    .line 1485
    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1486
    .line 1487
    .line 1488
    move-result v4

    .line 1489
    add-int/lit8 v1, v1, 0xc

    .line 1490
    .line 1491
    sub-int v5, v4, v3

    .line 1492
    .line 1493
    add-int/lit8 v5, v5, 0x1

    .line 1494
    .line 1495
    new-array v7, v5, [Lnet/bytebuddy/jar/asm/Label;

    .line 1496
    .line 1497
    const/4 v10, 0x0

    .line 1498
    :goto_2f
    if-ge v10, v5, :cond_2c

    .line 1499
    .line 1500
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 1501
    .line 1502
    .line 1503
    move-result v29

    .line 1504
    add-int v29, v29, v13

    .line 1505
    .line 1506
    aget-object v29, v12, v29

    .line 1507
    .line 1508
    aput-object v29, v7, v10

    .line 1509
    .line 1510
    add-int/lit8 v1, v1, 0x4

    .line 1511
    .line 1512
    add-int/lit8 v10, v10, 0x1

    .line 1513
    .line 1514
    goto :goto_2f

    .line 1515
    :cond_2c
    invoke-virtual {v0, v3, v4, v2, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTableSwitchInsn(IILnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;)V

    .line 1516
    .line 1517
    .line 1518
    goto/16 :goto_28

    .line 1519
    .line 1520
    :pswitch_15
    move/from16 p3, v7

    .line 1521
    .line 1522
    move/from16 v37, v10

    .line 1523
    .line 1524
    const/16 v30, 0x84

    .line 1525
    .line 1526
    add-int/lit8 v2, v29, 0x1

    .line 1527
    .line 1528
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 1529
    .line 1530
    .line 1531
    move-result v2

    .line 1532
    add-int/2addr v2, v13

    .line 1533
    aget-object v2, v12, v2

    .line 1534
    .line 1535
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 1536
    .line 1537
    .line 1538
    goto/16 :goto_2d

    .line 1539
    .line 1540
    :pswitch_16
    move/from16 p3, v7

    .line 1541
    .line 1542
    move/from16 v37, v10

    .line 1543
    .line 1544
    const/16 v30, 0x84

    .line 1545
    .line 1546
    add-int/lit8 v1, v29, 0x1

    .line 1547
    .line 1548
    aget-byte v1, v20, v1

    .line 1549
    .line 1550
    and-int/lit16 v1, v1, 0xff

    .line 1551
    .line 1552
    add-int/lit8 v2, v29, 0x2

    .line 1553
    .line 1554
    aget-byte v2, v20, v2

    .line 1555
    .line 1556
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 1557
    .line 1558
    .line 1559
    goto/16 :goto_2d

    .line 1560
    .line 1561
    :pswitch_17
    move/from16 p3, v7

    .line 1562
    .line 1563
    move/from16 v37, v10

    .line 1564
    .line 1565
    const/16 v30, 0x84

    .line 1566
    .line 1567
    add-int/lit8 v1, v1, -0x3b

    .line 1568
    .line 1569
    shr-int/lit8 v2, v1, 0x2

    .line 1570
    .line 1571
    add-int/lit8 v2, v2, 0x36

    .line 1572
    .line 1573
    and-int/lit8 v1, v1, 0x3

    .line 1574
    .line 1575
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1576
    .line 1577
    .line 1578
    :goto_30
    add-int/lit8 v1, v29, 0x1

    .line 1579
    .line 1580
    goto/16 :goto_28

    .line 1581
    .line 1582
    :pswitch_18
    move/from16 p3, v7

    .line 1583
    .line 1584
    move/from16 v37, v10

    .line 1585
    .line 1586
    const/16 v30, 0x84

    .line 1587
    .line 1588
    add-int/lit8 v1, v1, -0x1a

    .line 1589
    .line 1590
    shr-int/lit8 v2, v1, 0x2

    .line 1591
    .line 1592
    add-int/lit8 v2, v2, 0x15

    .line 1593
    .line 1594
    and-int/lit8 v1, v1, 0x3

    .line 1595
    .line 1596
    invoke-virtual {v0, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1597
    .line 1598
    .line 1599
    goto :goto_30

    .line 1600
    :pswitch_19
    move/from16 p3, v7

    .line 1601
    .line 1602
    move/from16 v37, v10

    .line 1603
    .line 1604
    const/16 v30, 0x84

    .line 1605
    .line 1606
    add-int/lit8 v2, v29, 0x1

    .line 1607
    .line 1608
    aget-byte v2, v20, v2

    .line 1609
    .line 1610
    and-int/lit16 v2, v2, 0xff

    .line 1611
    .line 1612
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1613
    .line 1614
    .line 1615
    :goto_31
    add-int/lit8 v1, v29, 0x2

    .line 1616
    .line 1617
    goto/16 :goto_28

    .line 1618
    .line 1619
    :pswitch_1a
    move/from16 p3, v7

    .line 1620
    .line 1621
    move/from16 v37, v10

    .line 1622
    .line 1623
    const/16 v30, 0x84

    .line 1624
    .line 1625
    add-int/lit8 v1, v29, 0x1

    .line 1626
    .line 1627
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1628
    .line 1629
    .line 1630
    move-result v1

    .line 1631
    invoke-virtual {v6, v1, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v1

    .line 1635
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1636
    .line 1637
    .line 1638
    goto/16 :goto_2d

    .line 1639
    .line 1640
    :pswitch_1b
    move/from16 p3, v7

    .line 1641
    .line 1642
    move/from16 v37, v10

    .line 1643
    .line 1644
    const/16 v30, 0x84

    .line 1645
    .line 1646
    add-int/lit8 v1, v29, 0x1

    .line 1647
    .line 1648
    aget-byte v1, v20, v1

    .line 1649
    .line 1650
    and-int/lit16 v1, v1, 0xff

    .line 1651
    .line 1652
    invoke-virtual {v6, v1, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v1

    .line 1656
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1657
    .line 1658
    .line 1659
    goto :goto_31

    .line 1660
    :pswitch_1c
    move/from16 p3, v7

    .line 1661
    .line 1662
    move/from16 v37, v10

    .line 1663
    .line 1664
    const/16 v30, 0x84

    .line 1665
    .line 1666
    add-int/lit8 v2, v29, 0x1

    .line 1667
    .line 1668
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readShort(I)S

    .line 1669
    .line 1670
    .line 1671
    move-result v2

    .line 1672
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 1673
    .line 1674
    .line 1675
    goto/16 :goto_2d

    .line 1676
    .line 1677
    :pswitch_1d
    move/from16 p3, v7

    .line 1678
    .line 1679
    move/from16 v37, v10

    .line 1680
    .line 1681
    const/16 v30, 0x84

    .line 1682
    .line 1683
    add-int/lit8 v2, v29, 0x1

    .line 1684
    .line 1685
    aget-byte v2, v20, v2

    .line 1686
    .line 1687
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIntInsn(II)V

    .line 1688
    .line 1689
    .line 1690
    goto :goto_31

    .line 1691
    :pswitch_1e
    move/from16 p3, v7

    .line 1692
    .line 1693
    move/from16 v37, v10

    .line 1694
    .line 1695
    const/16 v30, 0x84

    .line 1696
    .line 1697
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 1698
    .line 1699
    .line 1700
    goto :goto_30

    .line 1701
    :goto_32
    if-eqz v15, :cond_2e

    .line 1702
    .line 1703
    array-length v5, v15

    .line 1704
    if-ge v3, v5, :cond_2e

    .line 1705
    .line 1706
    if-gt v2, v13, :cond_2e

    .line 1707
    .line 1708
    if-ne v2, v13, :cond_2d

    .line 1709
    .line 1710
    aget v2, v15, v3

    .line 1711
    .line 1712
    invoke-direct {v6, v9, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 1713
    .line 1714
    .line 1715
    move-result v2

    .line 1716
    invoke-virtual {v6, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v5

    .line 1720
    add-int/lit8 v2, v2, 0x2

    .line 1721
    .line 1722
    iget v7, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 1723
    .line 1724
    iget-object v10, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 1725
    .line 1726
    move/from16 v16, v1

    .line 1727
    .line 1728
    move/from16 v1, v19

    .line 1729
    .line 1730
    invoke-virtual {v0, v7, v10, v5, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsnAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v5

    .line 1734
    invoke-direct {v6, v5, v2, v1, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 1735
    .line 1736
    .line 1737
    goto :goto_33

    .line 1738
    :cond_2d
    move/from16 v16, v1

    .line 1739
    .line 1740
    :goto_33
    add-int/lit8 v3, v3, 0x1

    .line 1741
    .line 1742
    invoke-direct {v6, v15, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->getTypeAnnotationBytecodeOffset([II)I

    .line 1743
    .line 1744
    .line 1745
    move-result v2

    .line 1746
    move/from16 v1, v16

    .line 1747
    .line 1748
    const/16 v19, 0x1

    .line 1749
    .line 1750
    goto :goto_32

    .line 1751
    :cond_2e
    move/from16 v16, v1

    .line 1752
    .line 1753
    move/from16 v1, v27

    .line 1754
    .line 1755
    move/from16 v5, v28

    .line 1756
    .line 1757
    :goto_34
    if-eqz v35, :cond_31

    .line 1758
    .line 1759
    move-object/from16 v10, v35

    .line 1760
    .line 1761
    array-length v7, v10

    .line 1762
    if-ge v1, v7, :cond_30

    .line 1763
    .line 1764
    if-gt v5, v13, :cond_30

    .line 1765
    .line 1766
    if-ne v5, v13, :cond_2f

    .line 1767
    .line 1768
    aget v5, v10, v1

    .line 1769
    .line 1770
    invoke-direct {v6, v9, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 1771
    .line 1772
    .line 1773
    move-result v5

    .line 1774
    invoke-virtual {v6, v5, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v7

    .line 1778
    add-int/lit8 v5, v5, 0x2

    .line 1779
    .line 1780
    move/from16 v21, v1

    .line 1781
    .line 1782
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 1783
    .line 1784
    move/from16 v27, v2

    .line 1785
    .line 1786
    iget-object v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 1787
    .line 1788
    move/from16 v33, v11

    .line 1789
    .line 1790
    const/4 v11, 0x0

    .line 1791
    invoke-virtual {v0, v1, v2, v7, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsnAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v1

    .line 1795
    const/4 v2, 0x1

    .line 1796
    invoke-direct {v6, v1, v5, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 1797
    .line 1798
    .line 1799
    goto :goto_35

    .line 1800
    :cond_2f
    move/from16 v21, v1

    .line 1801
    .line 1802
    move/from16 v27, v2

    .line 1803
    .line 1804
    move/from16 v33, v11

    .line 1805
    .line 1806
    const/4 v11, 0x0

    .line 1807
    :goto_35
    add-int/lit8 v1, v21, 0x1

    .line 1808
    .line 1809
    invoke-direct {v6, v10, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->getTypeAnnotationBytecodeOffset([II)I

    .line 1810
    .line 1811
    .line 1812
    move-result v5

    .line 1813
    move-object/from16 v35, v10

    .line 1814
    .line 1815
    move/from16 v2, v27

    .line 1816
    .line 1817
    move/from16 v11, v33

    .line 1818
    .line 1819
    goto :goto_34

    .line 1820
    :cond_30
    move/from16 v21, v1

    .line 1821
    .line 1822
    move/from16 v27, v2

    .line 1823
    .line 1824
    move/from16 v33, v11

    .line 1825
    .line 1826
    :goto_36
    const/4 v11, 0x0

    .line 1827
    goto :goto_37

    .line 1828
    :cond_31
    move/from16 v21, v1

    .line 1829
    .line 1830
    move/from16 v27, v2

    .line 1831
    .line 1832
    move/from16 v33, v11

    .line 1833
    .line 1834
    move-object/from16 v10, v35

    .line 1835
    .line 1836
    goto :goto_36

    .line 1837
    :goto_37
    move/from16 v7, p3

    .line 1838
    .line 1839
    move/from16 v28, v5

    .line 1840
    .line 1841
    move-object v5, v10

    .line 1842
    move-object v1, v15

    .line 1843
    move/from16 v13, v16

    .line 1844
    .line 1845
    move/from16 v15, v24

    .line 1846
    .line 1847
    move/from16 v16, v27

    .line 1848
    .line 1849
    move/from16 v11, v31

    .line 1850
    .line 1851
    move/from16 v2, v32

    .line 1852
    .line 1853
    move/from16 v10, v37

    .line 1854
    .line 1855
    const/16 v19, 0x1

    .line 1856
    .line 1857
    move/from16 v24, v14

    .line 1858
    .line 1859
    move/from16 v27, v21

    .line 1860
    .line 1861
    move/from16 v14, v36

    .line 1862
    .line 1863
    move/from16 v21, v3

    .line 1864
    .line 1865
    move/from16 v3, v33

    .line 1866
    .line 1867
    goto/16 :goto_13

    .line 1868
    .line 1869
    :cond_32
    move-object v15, v1

    .line 1870
    move/from16 v32, v2

    .line 1871
    .line 1872
    move-object v10, v5

    .line 1873
    move/from16 v31, v11

    .line 1874
    .line 1875
    const/4 v11, 0x0

    .line 1876
    aget-object v1, v12, v22

    .line 1877
    .line 1878
    if-eqz v1, :cond_33

    .line 1879
    .line 1880
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 1881
    .line 1882
    .line 1883
    :cond_33
    move/from16 v4, v25

    .line 1884
    .line 1885
    if-eqz v4, :cond_38

    .line 1886
    .line 1887
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 1888
    .line 1889
    and-int/lit8 v1, v1, 0x2

    .line 1890
    .line 1891
    if-nez v1, :cond_38

    .line 1892
    .line 1893
    move/from16 v1, v26

    .line 1894
    .line 1895
    if-eqz v1, :cond_35

    .line 1896
    .line 1897
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1898
    .line 1899
    .line 1900
    move-result v2

    .line 1901
    mul-int/lit8 v2, v2, 0x3

    .line 1902
    .line 1903
    new-array v3, v2, [I

    .line 1904
    .line 1905
    add-int/lit8 v26, v1, 0x2

    .line 1906
    .line 1907
    move/from16 v1, v26

    .line 1908
    .line 1909
    :goto_38
    if-lez v2, :cond_34

    .line 1910
    .line 1911
    add-int/lit8 v5, v2, -0x1

    .line 1912
    .line 1913
    add-int/lit8 v7, v1, 0x6

    .line 1914
    .line 1915
    aput v7, v3, v5

    .line 1916
    .line 1917
    add-int/lit8 v5, v2, -0x2

    .line 1918
    .line 1919
    add-int/lit8 v7, v1, 0x8

    .line 1920
    .line 1921
    invoke-virtual {v6, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1922
    .line 1923
    .line 1924
    move-result v7

    .line 1925
    aput v7, v3, v5

    .line 1926
    .line 1927
    add-int/lit8 v2, v2, -0x3

    .line 1928
    .line 1929
    invoke-virtual {v6, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1930
    .line 1931
    .line 1932
    move-result v5

    .line 1933
    aput v5, v3, v2

    .line 1934
    .line 1935
    add-int/lit8 v1, v1, 0xa

    .line 1936
    .line 1937
    goto :goto_38

    .line 1938
    :cond_34
    move-object v7, v3

    .line 1939
    goto :goto_39

    .line 1940
    :cond_35
    const/4 v7, 0x0

    .line 1941
    :goto_39
    invoke-virtual {v6, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1942
    .line 1943
    .line 1944
    move-result v1

    .line 1945
    add-int/lit8 v25, v4, 0x2

    .line 1946
    .line 1947
    move/from16 v2, v25

    .line 1948
    .line 1949
    :goto_3a
    add-int/lit8 v13, v1, -0x1

    .line 1950
    .line 1951
    if-lez v1, :cond_38

    .line 1952
    .line 1953
    invoke-virtual {v6, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1954
    .line 1955
    .line 1956
    move-result v1

    .line 1957
    add-int/lit8 v3, v2, 0x2

    .line 1958
    .line 1959
    invoke-virtual {v6, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1960
    .line 1961
    .line 1962
    move-result v3

    .line 1963
    add-int/lit8 v4, v2, 0x4

    .line 1964
    .line 1965
    invoke-virtual {v6, v4, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v4

    .line 1969
    add-int/lit8 v5, v2, 0x6

    .line 1970
    .line 1971
    invoke-virtual {v6, v5, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v5

    .line 1975
    add-int/lit8 v14, v2, 0x8

    .line 1976
    .line 1977
    invoke-virtual {v6, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 1978
    .line 1979
    .line 1980
    move-result v14

    .line 1981
    add-int/lit8 v16, v2, 0xa

    .line 1982
    .line 1983
    if-eqz v7, :cond_37

    .line 1984
    .line 1985
    move v2, v11

    .line 1986
    :goto_3b
    array-length v11, v7

    .line 1987
    if-ge v2, v11, :cond_37

    .line 1988
    .line 1989
    aget v11, v7, v2

    .line 1990
    .line 1991
    if-ne v11, v1, :cond_36

    .line 1992
    .line 1993
    add-int/lit8 v11, v2, 0x1

    .line 1994
    .line 1995
    aget v11, v7, v11

    .line 1996
    .line 1997
    if-ne v11, v14, :cond_36

    .line 1998
    .line 1999
    add-int/lit8 v2, v2, 0x2

    .line 2000
    .line 2001
    aget v2, v7, v2

    .line 2002
    .line 2003
    invoke-virtual {v6, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v2

    .line 2007
    move v11, v3

    .line 2008
    move-object v3, v2

    .line 2009
    move v2, v11

    .line 2010
    :goto_3c
    move v11, v1

    .line 2011
    move-object v1, v4

    .line 2012
    goto :goto_3d

    .line 2013
    :cond_36
    add-int/lit8 v2, v2, 0x3

    .line 2014
    .line 2015
    goto :goto_3b

    .line 2016
    :cond_37
    move v2, v3

    .line 2017
    const/4 v3, 0x0

    .line 2018
    goto :goto_3c

    .line 2019
    :goto_3d
    aget-object v4, v12, v11

    .line 2020
    .line 2021
    add-int/2addr v2, v11

    .line 2022
    aget-object v2, v12, v2

    .line 2023
    .line 2024
    move-object v11, v5

    .line 2025
    move-object v5, v2

    .line 2026
    move-object v2, v11

    .line 2027
    move-object v11, v6

    .line 2028
    move v6, v14

    .line 2029
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;I)V

    .line 2030
    .line 2031
    .line 2032
    move-object/from16 v0, p1

    .line 2033
    .line 2034
    move-object v6, v11

    .line 2035
    move v1, v13

    .line 2036
    move/from16 v2, v16

    .line 2037
    .line 2038
    const/4 v11, 0x0

    .line 2039
    goto :goto_3a

    .line 2040
    :cond_38
    move-object v11, v6

    .line 2041
    const/16 v12, 0x41

    .line 2042
    .line 2043
    const/16 v13, 0x40

    .line 2044
    .line 2045
    if-eqz v15, :cond_3b

    .line 2046
    .line 2047
    array-length v14, v15

    .line 2048
    const/4 v0, 0x0

    .line 2049
    :goto_3e
    if-ge v0, v14, :cond_3b

    .line 2050
    .line 2051
    aget v1, v15, v0

    .line 2052
    .line 2053
    invoke-virtual {v11, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 2054
    .line 2055
    .line 2056
    move-result v2

    .line 2057
    if-eq v2, v13, :cond_3a

    .line 2058
    .line 2059
    if-ne v2, v12, :cond_39

    .line 2060
    .line 2061
    goto :goto_3f

    .line 2062
    :cond_39
    move/from16 v16, v0

    .line 2063
    .line 2064
    goto :goto_40

    .line 2065
    :cond_3a
    :goto_3f
    invoke-direct {v11, v9, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 2066
    .line 2067
    .line 2068
    move-result v1

    .line 2069
    invoke-virtual {v11, v1, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v6

    .line 2073
    add-int/lit8 v1, v1, 0x2

    .line 2074
    .line 2075
    move v2, v1

    .line 2076
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 2077
    .line 2078
    move v3, v2

    .line 2079
    iget-object v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 2080
    .line 2081
    move v4, v3

    .line 2082
    iget-object v3, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeStarts:[Lnet/bytebuddy/jar/asm/Label;

    .line 2083
    .line 2084
    move v5, v4

    .line 2085
    iget-object v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeEnds:[Lnet/bytebuddy/jar/asm/Label;

    .line 2086
    .line 2087
    move v7, v5

    .line 2088
    iget-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeIndices:[I

    .line 2089
    .line 2090
    move/from16 v16, v7

    .line 2091
    .line 2092
    const/4 v7, 0x1

    .line 2093
    move/from16 v12, v16

    .line 2094
    .line 2095
    move/from16 v16, v0

    .line 2096
    .line 2097
    move-object/from16 v0, p1

    .line 2098
    .line 2099
    invoke-virtual/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLocalVariableAnnotation(ILnet/bytebuddy/jar/asm/TypePath;[Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;[ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v1

    .line 2103
    const/4 v2, 0x1

    .line 2104
    invoke-direct {v11, v1, v12, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 2105
    .line 2106
    .line 2107
    :goto_40
    add-int/lit8 v0, v16, 0x1

    .line 2108
    .line 2109
    const/16 v12, 0x41

    .line 2110
    .line 2111
    goto :goto_3e

    .line 2112
    :cond_3b
    if-eqz v10, :cond_3e

    .line 2113
    .line 2114
    array-length v12, v10

    .line 2115
    const/4 v14, 0x0

    .line 2116
    :goto_41
    if-ge v14, v12, :cond_3e

    .line 2117
    .line 2118
    aget v0, v10, v14

    .line 2119
    .line 2120
    invoke-virtual {v11, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 2121
    .line 2122
    .line 2123
    move-result v1

    .line 2124
    const/16 v15, 0x41

    .line 2125
    .line 2126
    if-eq v1, v13, :cond_3d

    .line 2127
    .line 2128
    if-ne v1, v15, :cond_3c

    .line 2129
    .line 2130
    goto :goto_42

    .line 2131
    :cond_3c
    move-object/from16 v0, p1

    .line 2132
    .line 2133
    const/4 v2, 0x1

    .line 2134
    goto :goto_43

    .line 2135
    :cond_3d
    :goto_42
    invoke-direct {v11, v9, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 2136
    .line 2137
    .line 2138
    move-result v0

    .line 2139
    invoke-virtual {v11, v0, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v6

    .line 2143
    add-int/lit8 v0, v0, 0x2

    .line 2144
    .line 2145
    iget v1, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 2146
    .line 2147
    iget-object v2, v9, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 2148
    .line 2149
    iget-object v3, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeStarts:[Lnet/bytebuddy/jar/asm/Label;

    .line 2150
    .line 2151
    iget-object v4, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeEnds:[Lnet/bytebuddy/jar/asm/Label;

    .line 2152
    .line 2153
    iget-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeIndices:[I

    .line 2154
    .line 2155
    const/4 v7, 0x0

    .line 2156
    move v13, v0

    .line 2157
    move-object/from16 v0, p1

    .line 2158
    .line 2159
    invoke-virtual/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLocalVariableAnnotation(ILnet/bytebuddy/jar/asm/TypePath;[Lnet/bytebuddy/jar/asm/Label;[Lnet/bytebuddy/jar/asm/Label;[ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v1

    .line 2163
    const/4 v2, 0x1

    .line 2164
    invoke-direct {v11, v1, v13, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 2165
    .line 2166
    .line 2167
    :goto_43
    add-int/lit8 v14, v14, 0x1

    .line 2168
    .line 2169
    const/16 v13, 0x40

    .line 2170
    .line 2171
    goto :goto_41

    .line 2172
    :cond_3e
    move-object/from16 v0, p1

    .line 2173
    .line 2174
    move-object/from16 v1, v17

    .line 2175
    .line 2176
    :goto_44
    if-eqz v1, :cond_3f

    .line 2177
    .line 2178
    iget-object v2, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2179
    .line 2180
    const/4 v3, 0x0

    .line 2181
    iput-object v3, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2182
    .line 2183
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 2184
    .line 2185
    .line 2186
    move-object v1, v2

    .line 2187
    goto :goto_44

    .line 2188
    :cond_3f
    move/from16 v1, v31

    .line 2189
    .line 2190
    move/from16 v2, v32

    .line 2191
    .line 2192
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 2193
    .line 2194
    .line 2195
    return-void

    .line 2196
    :cond_40
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 2197
    .line 2198
    .line 2199
    return-void

    .line 2200
    nop

    .line 2201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_1
        :pswitch_9
        :pswitch_1
        :pswitch_1
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_7
        :pswitch_6
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_9
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_1
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_8
        :pswitch_8
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    :pswitch_data_2
    .packed-switch 0x36
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_16
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_19
        :pswitch_14
        :pswitch_13
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_1d
        :pswitch_10
        :pswitch_1e
        :pswitch_1e
        :pswitch_10
        :pswitch_10
        :pswitch_1e
        :pswitch_1e
        :pswitch_f
        :pswitch_e
        :pswitch_15
        :pswitch_15
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private readConstantDynamic(I[C)Lnet/bytebuddy/jar/asm/ConstantDynamic;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->constantDynamicValues:[Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 9
    .line 10
    aget v1, v0, p1

    .line 11
    .line 12
    add-int/lit8 v2, v1, 0x2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    aget v0, v0, v2

    .line 19
    .line 20
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    add-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/ClassReader;->bootstrapMethodOffsets:[I

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    aget v1, v3, v1

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {p0, v3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lnet/bytebuddy/jar/asm/Handle;

    .line 47
    .line 48
    add-int/lit8 v4, v1, 0x2

    .line 49
    .line 50
    invoke-virtual {p0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    new-array v5, v4, [Ljava/lang/Object;

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x4

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    :goto_0
    if-ge v6, v4, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-virtual {p0, v7, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    aput-object v7, v5, v6

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->constantDynamicValues:[Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 77
    .line 78
    new-instance p2, Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 79
    .line 80
    invoke-direct {p2, v2, v0, v3, v5}, Lnet/bytebuddy/jar/asm/ConstantDynamic;-><init>(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    aput-object p2, p0, p1

    .line 84
    .line 85
    return-object p2
.end method

.method private readElementValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;ILjava/lang/String;[C)I
    .locals 10

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    const/16 v1, 0x65

    .line 4
    .line 5
    const/16 v2, 0x5b

    .line 6
    .line 7
    const/16 v3, 0x40

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-nez p1, :cond_3

    .line 12
    .line 13
    aget-byte p1, v0, p2

    .line 14
    .line 15
    and-int/lit16 p1, p1, 0xff

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    if-eq p1, v3, :cond_2

    .line 19
    .line 20
    if-eq p1, v2, :cond_1

    .line 21
    .line 22
    if-eq p1, v1, :cond_0

    .line 23
    .line 24
    add-int/lit8 p2, p2, 0x3

    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    add-int/lit8 p2, p2, 0x5

    .line 28
    .line 29
    return p2

    .line 30
    :cond_1
    add-int/2addr p2, v5

    .line 31
    invoke-direct {p0, p3, p2, v4, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_2
    add-int/lit8 p2, p2, 0x3

    .line 37
    .line 38
    invoke-direct {p0, p3, p2, v5, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :cond_3
    add-int/lit8 v6, p2, 0x1

    .line 44
    .line 45
    aget-byte v0, v0, p2

    .line 46
    .line 47
    and-int/lit16 v0, v0, 0xff

    .line 48
    .line 49
    if-eq v0, v3, :cond_1b

    .line 50
    .line 51
    const/16 v3, 0x46

    .line 52
    .line 53
    if-eq v0, v3, :cond_1a

    .line 54
    .line 55
    const/16 v7, 0x53

    .line 56
    .line 57
    if-eq v0, v7, :cond_19

    .line 58
    .line 59
    const/16 v8, 0x63

    .line 60
    .line 61
    if-eq v0, v8, :cond_18

    .line 62
    .line 63
    if-eq v0, v1, :cond_17

    .line 64
    .line 65
    const/16 v1, 0x73

    .line 66
    .line 67
    if-eq v0, v1, :cond_16

    .line 68
    .line 69
    const/16 v1, 0x49

    .line 70
    .line 71
    if-eq v0, v1, :cond_1a

    .line 72
    .line 73
    const/16 v8, 0x4a

    .line 74
    .line 75
    if-eq v0, v8, :cond_1a

    .line 76
    .line 77
    const/16 v9, 0x5a

    .line 78
    .line 79
    if-eq v0, v9, :cond_14

    .line 80
    .line 81
    if-eq v0, v2, :cond_4

    .line 82
    .line 83
    packed-switch v0, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 87
    .line 88
    .line 89
    return v4

    .line 90
    :pswitch_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 91
    .line 92
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    aget p4, p4, v0

    .line 97
    .line 98
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    int-to-char p0, p0

    .line 103
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 p2, p2, 0x3

    .line 111
    .line 112
    return p2

    .line 113
    :pswitch_1
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 114
    .line 115
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    aget p4, p4, v0

    .line 120
    .line 121
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    int-to-byte p0, p0

    .line 126
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 p2, p2, 0x3

    .line 134
    .line 135
    return p2

    .line 136
    :cond_4
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    add-int/lit8 v2, p2, 0x3

    .line 141
    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    add-int/2addr p2, v5

    .line 149
    invoke-direct {p0, p1, p2, v4, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    return p0

    .line 154
    :cond_5
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 155
    .line 156
    aget-byte v6, v6, v2

    .line 157
    .line 158
    and-int/lit16 v6, v6, 0xff

    .line 159
    .line 160
    if-eq v6, v3, :cond_12

    .line 161
    .line 162
    if-eq v6, v7, :cond_10

    .line 163
    .line 164
    if-eq v6, v9, :cond_d

    .line 165
    .line 166
    if-eq v6, v1, :cond_b

    .line 167
    .line 168
    if-eq v6, v8, :cond_9

    .line 169
    .line 170
    packed-switch v6, :pswitch_data_1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    add-int/2addr p2, v5

    .line 178
    invoke-direct {p0, p1, p2, v4, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :pswitch_2
    new-array p2, v0, [D

    .line 184
    .line 185
    :goto_0
    if-ge v4, v0, :cond_6

    .line 186
    .line 187
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 188
    .line 189
    add-int/lit8 v1, v2, 0x1

    .line 190
    .line 191
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    aget p4, p4, v1

    .line 196
    .line 197
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readLong(I)J

    .line 198
    .line 199
    .line 200
    move-result-wide v5

    .line 201
    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 202
    .line 203
    .line 204
    move-result-wide v5

    .line 205
    aput-wide v5, p2, v4

    .line 206
    .line 207
    add-int/lit8 v2, v2, 0x3

    .line 208
    .line 209
    add-int/lit8 v4, v4, 0x1

    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_6
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return v2

    .line 216
    :pswitch_3
    new-array p2, v0, [C

    .line 217
    .line 218
    :goto_1
    if-ge v4, v0, :cond_7

    .line 219
    .line 220
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 221
    .line 222
    add-int/lit8 v1, v2, 0x1

    .line 223
    .line 224
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    aget p4, p4, v1

    .line 229
    .line 230
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 231
    .line 232
    .line 233
    move-result p4

    .line 234
    int-to-char p4, p4

    .line 235
    aput-char p4, p2, v4

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x3

    .line 238
    .line 239
    add-int/lit8 v4, v4, 0x1

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_7
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return v2

    .line 246
    :pswitch_4
    new-array p2, v0, [B

    .line 247
    .line 248
    :goto_2
    if-ge v4, v0, :cond_8

    .line 249
    .line 250
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 251
    .line 252
    add-int/lit8 v1, v2, 0x1

    .line 253
    .line 254
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    aget p4, p4, v1

    .line 259
    .line 260
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 261
    .line 262
    .line 263
    move-result p4

    .line 264
    int-to-byte p4, p4

    .line 265
    aput-byte p4, p2, v4

    .line 266
    .line 267
    add-int/lit8 v2, v2, 0x3

    .line 268
    .line 269
    add-int/lit8 v4, v4, 0x1

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_8
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    return v2

    .line 276
    :cond_9
    new-array p2, v0, [J

    .line 277
    .line 278
    :goto_3
    if-ge v4, v0, :cond_a

    .line 279
    .line 280
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 281
    .line 282
    add-int/lit8 v1, v2, 0x1

    .line 283
    .line 284
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    aget p4, p4, v1

    .line 289
    .line 290
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readLong(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v5

    .line 294
    aput-wide v5, p2, v4

    .line 295
    .line 296
    add-int/lit8 v2, v2, 0x3

    .line 297
    .line 298
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_a
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    return v2

    .line 305
    :cond_b
    new-array p2, v0, [I

    .line 306
    .line 307
    :goto_4
    if-ge v4, v0, :cond_c

    .line 308
    .line 309
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 310
    .line 311
    add-int/lit8 v1, v2, 0x1

    .line 312
    .line 313
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    aget p4, p4, v1

    .line 318
    .line 319
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 320
    .line 321
    .line 322
    move-result p4

    .line 323
    aput p4, p2, v4

    .line 324
    .line 325
    add-int/lit8 v2, v2, 0x3

    .line 326
    .line 327
    add-int/lit8 v4, v4, 0x1

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_c
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    return v2

    .line 334
    :cond_d
    new-array p2, v0, [Z

    .line 335
    .line 336
    move p4, v4

    .line 337
    :goto_5
    if-ge p4, v0, :cond_f

    .line 338
    .line 339
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 340
    .line 341
    add-int/lit8 v3, v2, 0x1

    .line 342
    .line 343
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    aget v1, v1, v3

    .line 348
    .line 349
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_e

    .line 354
    .line 355
    move v1, v5

    .line 356
    goto :goto_6

    .line 357
    :cond_e
    move v1, v4

    .line 358
    :goto_6
    aput-boolean v1, p2, p4

    .line 359
    .line 360
    add-int/lit8 v2, v2, 0x3

    .line 361
    .line 362
    add-int/lit8 p4, p4, 0x1

    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_f
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    return v2

    .line 369
    :cond_10
    new-array p2, v0, [S

    .line 370
    .line 371
    :goto_7
    if-ge v4, v0, :cond_11

    .line 372
    .line 373
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 374
    .line 375
    add-int/lit8 v1, v2, 0x1

    .line 376
    .line 377
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    aget p4, p4, v1

    .line 382
    .line 383
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 384
    .line 385
    .line 386
    move-result p4

    .line 387
    int-to-short p4, p4

    .line 388
    aput-short p4, p2, v4

    .line 389
    .line 390
    add-int/lit8 v2, v2, 0x3

    .line 391
    .line 392
    add-int/lit8 v4, v4, 0x1

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_11
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    return v2

    .line 399
    :cond_12
    new-array p2, v0, [F

    .line 400
    .line 401
    :goto_8
    if-ge v4, v0, :cond_13

    .line 402
    .line 403
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 404
    .line 405
    add-int/lit8 v1, v2, 0x1

    .line 406
    .line 407
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    aget p4, p4, v1

    .line 412
    .line 413
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 414
    .line 415
    .line 416
    move-result p4

    .line 417
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 418
    .line 419
    .line 420
    move-result p4

    .line 421
    aput p4, p2, v4

    .line 422
    .line 423
    add-int/lit8 v2, v2, 0x3

    .line 424
    .line 425
    add-int/lit8 v4, v4, 0x1

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_13
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return v2

    .line 432
    :cond_14
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 433
    .line 434
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    aget p4, p4, v0

    .line 439
    .line 440
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 441
    .line 442
    .line 443
    move-result p0

    .line 444
    if-nez p0, :cond_15

    .line 445
    .line 446
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 450
    .line 451
    :goto_9
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    add-int/lit8 p2, p2, 0x3

    .line 455
    .line 456
    return p2

    .line 457
    :cond_16
    invoke-virtual {p0, v6, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 p2, p2, 0x3

    .line 465
    .line 466
    return p2

    .line 467
    :cond_17
    invoke-virtual {p0, v6, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    add-int/lit8 v1, p2, 0x3

    .line 472
    .line 473
    invoke-virtual {p0, v1, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    invoke-virtual {p1, p3, v0, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    add-int/lit8 p2, p2, 0x5

    .line 481
    .line 482
    return p2

    .line 483
    :cond_18
    invoke-virtual {p0, v6, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    add-int/lit8 p2, p2, 0x3

    .line 495
    .line 496
    return p2

    .line 497
    :cond_19
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 498
    .line 499
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    aget p4, p4, v0

    .line 504
    .line 505
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    int-to-short p0, p0

    .line 510
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    add-int/lit8 p2, p2, 0x3

    .line 518
    .line 519
    return p2

    .line 520
    :cond_1a
    :pswitch_5
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    invoke-virtual {p0, v0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-virtual {p1, p3, p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    add-int/lit8 p2, p2, 0x3

    .line 532
    .line 533
    return p2

    .line 534
    :cond_1b
    invoke-virtual {p0, v6, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {p1, p3, v0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    add-int/lit8 p2, p2, 0x3

    .line 543
    .line 544
    invoke-direct {p0, p1, p2, v5, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    return p0

    .line 549
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 p2, p2, 0x2

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    :goto_0
    add-int/lit8 p3, v0, -0x1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p2, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    add-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    invoke-direct {p0, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;ILjava/lang/String;[C)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    move v0, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :goto_1
    add-int/lit8 p3, v0, -0x1

    .line 26
    .line 27
    if-lez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, p2, v0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;ILjava/lang/String;[C)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    move v0, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    .line 39
    .line 40
    .line 41
    :cond_2
    return p2
.end method

.method private readField(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    iget-object v5, v8, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/lit8 v3, v1, 0x2

    .line 14
    .line 15
    invoke-virtual {v0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    add-int/lit8 v3, v1, 0x4

    .line 20
    .line 21
    invoke-virtual {v0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v12

    .line 25
    add-int/lit8 v3, v1, 0x6

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v1, v1, 0x8

    .line 32
    .line 33
    move v10, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v13, 0x0

    .line 39
    const/4 v14, 0x0

    .line 40
    const/4 v15, 0x0

    .line 41
    :goto_0
    add-int/lit8 v16, v3, -0x1

    .line 42
    .line 43
    if-lez v3, :cond_9

    .line 44
    .line 45
    move v3, v2

    .line 46
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    add-int/lit8 v9, v1, 0x2

    .line 51
    .line 52
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    add-int/lit8 v1, v1, 0x6

    .line 57
    .line 58
    move/from16 v17, v3

    .line 59
    .line 60
    const-string v3, "ConstantValue"

    .line 61
    .line 62
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    invoke-virtual {v0, v2, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readConst(I[C)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move-object v14, v2

    .line 81
    :goto_1
    move v3, v1

    .line 82
    :goto_2
    move v1, v4

    .line 83
    :goto_3
    move v4, v9

    .line 84
    move/from16 v2, v17

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_1
    const-string v3, "Signature"

    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const-string v3, "Deprecated"

    .line 102
    .line 103
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    const/high16 v2, 0x20000

    .line 110
    .line 111
    or-int/2addr v2, v10

    .line 112
    :goto_4
    move v3, v1

    .line 113
    move v10, v2

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const-string v3, "Synthetic"

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    or-int/lit16 v2, v10, 0x1000

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_4
    const-string v3, "RuntimeVisibleAnnotations"

    .line 127
    .line 128
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    move v2, v1

    .line 135
    move v3, v2

    .line 136
    move v1, v4

    .line 137
    move v4, v9

    .line 138
    goto :goto_5

    .line 139
    :cond_5
    const-string v3, "RuntimeVisibleTypeAnnotations"

    .line 140
    .line 141
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    move v3, v1

    .line 148
    move v6, v3

    .line 149
    goto :goto_2

    .line 150
    :cond_6
    const-string v3, "RuntimeInvisibleAnnotations"

    .line 151
    .line 152
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eqz v3, :cond_7

    .line 157
    .line 158
    move v3, v1

    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v3, "RuntimeInvisibleTypeAnnotations"

    .line 161
    .line 162
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_8

    .line 167
    .line 168
    move v3, v1

    .line 169
    move v7, v3

    .line 170
    goto :goto_2

    .line 171
    :cond_8
    move v3, v1

    .line 172
    iget-object v1, v8, Lnet/bytebuddy/jar/asm/Context;->attributePrototypes:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 173
    .line 174
    move/from16 v18, v6

    .line 175
    .line 176
    const/4 v6, -0x1

    .line 177
    move/from16 v19, v7

    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    move v8, v9

    .line 181
    move v9, v4

    .line 182
    move v4, v8

    .line 183
    move/from16 v8, v18

    .line 184
    .line 185
    move/from16 v20, v19

    .line 186
    .line 187
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iput-object v15, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 192
    .line 193
    move-object v15, v1

    .line 194
    move v6, v8

    .line 195
    move v1, v9

    .line 196
    move/from16 v2, v17

    .line 197
    .line 198
    move/from16 v7, v20

    .line 199
    .line 200
    :goto_5
    add-int/2addr v3, v4

    .line 201
    move-object/from16 v8, p2

    .line 202
    .line 203
    move v4, v1

    .line 204
    move v1, v3

    .line 205
    move/from16 v3, v16

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_9
    move-object/from16 v9, p1

    .line 210
    .line 211
    move v3, v2

    .line 212
    move v2, v4

    .line 213
    move v8, v6

    .line 214
    move/from16 v20, v7

    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-virtual/range {v9 .. v14}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    if-nez v6, :cond_a

    .line 222
    .line 223
    return v1

    .line 224
    :cond_a
    const/4 v7, 0x1

    .line 225
    if-eqz v3, :cond_b

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    add-int/lit8 v3, v3, 0x2

    .line 232
    .line 233
    :goto_6
    add-int/lit8 v10, v9, -0x1

    .line 234
    .line 235
    if-lez v9, :cond_b

    .line 236
    .line 237
    invoke-virtual {v0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    add-int/lit8 v3, v3, 0x2

    .line 242
    .line 243
    invoke-virtual {v6, v9, v7}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-direct {v0, v9, v3, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    move v9, v10

    .line 252
    goto :goto_6

    .line 253
    :cond_b
    if-eqz v2, :cond_c

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    add-int/lit8 v2, v2, 0x2

    .line 260
    .line 261
    :goto_7
    add-int/lit8 v9, v3, -0x1

    .line 262
    .line 263
    if-lez v3, :cond_c

    .line 264
    .line 265
    invoke-virtual {v0, v2, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    add-int/lit8 v2, v2, 0x2

    .line 270
    .line 271
    invoke-virtual {v6, v3, v4}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-direct {v0, v3, v2, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    move v3, v9

    .line 280
    goto :goto_7

    .line 281
    :cond_c
    if-eqz v8, :cond_d

    .line 282
    .line 283
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    add-int/lit8 v3, v8, 0x2

    .line 288
    .line 289
    :goto_8
    add-int/lit8 v8, v2, -0x1

    .line 290
    .line 291
    if-lez v2, :cond_d

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    invoke-direct {v0, v2, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-virtual {v0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    add-int/lit8 v3, v3, 0x2

    .line 304
    .line 305
    iget v10, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 306
    .line 307
    iget-object v11, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 308
    .line 309
    invoke-virtual {v6, v10, v11, v9, v7}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-direct {v0, v9, v3, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    move v2, v8

    .line 318
    goto :goto_8

    .line 319
    :cond_d
    move-object/from16 v2, p2

    .line 320
    .line 321
    move/from16 v9, v20

    .line 322
    .line 323
    if-eqz v9, :cond_e

    .line 324
    .line 325
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    add-int/lit8 v8, v9, 0x2

    .line 330
    .line 331
    :goto_9
    add-int/lit8 v9, v3, -0x1

    .line 332
    .line 333
    if-lez v3, :cond_e

    .line 334
    .line 335
    invoke-direct {v0, v2, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    invoke-virtual {v0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    add-int/lit8 v3, v3, 0x2

    .line 344
    .line 345
    iget v10, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 346
    .line 347
    iget-object v11, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 348
    .line 349
    invoke-virtual {v6, v10, v11, v8, v4}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-direct {v0, v8, v3, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 354
    .line 355
    .line 356
    move-result v8

    .line 357
    move v3, v9

    .line 358
    goto :goto_9

    .line 359
    :cond_e
    :goto_a
    if-eqz v15, :cond_f

    .line 360
    .line 361
    iget-object v0, v15, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    iput-object v2, v15, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 365
    .line 366
    invoke-virtual {v6, v15}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 367
    .line 368
    .line 369
    move-object v15, v0

    .line 370
    goto :goto_a

    .line 371
    :cond_f
    invoke-virtual {v6}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitEnd()V

    .line 372
    .line 373
    .line 374
    return v1
.end method

.method private readMethod(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v9, p3

    .line 6
    .line 7
    iget-object v5, v8, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 8
    .line 9
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 14
    .line 15
    add-int/lit8 v1, v9, 0x2

    .line 16
    .line 17
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodName:Ljava/lang/String;

    .line 22
    .line 23
    add-int/lit8 v10, v9, 0x4

    .line 24
    .line 25
    invoke-virtual {v0, v10, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodDescriptor:Ljava/lang/String;

    .line 30
    .line 31
    add-int/lit8 v1, v9, 0x6

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v2, v9, 0x8

    .line 38
    .line 39
    move v7, v2

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v13, 0x0

    .line 46
    const/4 v14, 0x0

    .line 47
    const/4 v15, 0x0

    .line 48
    const/16 v19, 0x0

    .line 49
    .line 50
    const/16 v20, 0x0

    .line 51
    .line 52
    const/16 v21, 0x0

    .line 53
    .line 54
    const/16 v22, 0x0

    .line 55
    .line 56
    const/16 v23, 0x0

    .line 57
    .line 58
    const/16 v24, 0x0

    .line 59
    .line 60
    :goto_0
    add-int/lit8 v16, v1, -0x1

    .line 61
    .line 62
    const/high16 v25, 0x20000

    .line 63
    .line 64
    if-lez v1, :cond_f

    .line 65
    .line 66
    move v1, v2

    .line 67
    invoke-virtual {v0, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/16 v26, 0x1

    .line 72
    .line 73
    add-int/lit8 v12, v7, 0x2

    .line 74
    .line 75
    invoke-virtual {v0, v12}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    move/from16 v17, v3

    .line 80
    .line 81
    add-int/lit8 v3, v7, 0x6

    .line 82
    .line 83
    move/from16 v18, v1

    .line 84
    .line 85
    const-string v1, "Code"

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    iget v1, v8, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 94
    .line 95
    and-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    if-nez v1, :cond_0

    .line 98
    .line 99
    move/from16 v24, v3

    .line 100
    .line 101
    :cond_0
    :goto_1
    move/from16 v28, v4

    .line 102
    .line 103
    :goto_2
    move-object v2, v5

    .line 104
    move v4, v12

    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :cond_1
    const-string v1, "Exceptions"

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    new-array v2, v1, [Ljava/lang/String;

    .line 120
    .line 121
    add-int/lit8 v7, v7, 0x8

    .line 122
    .line 123
    move-object/from16 v19, v2

    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    :goto_3
    if-ge v2, v1, :cond_2

    .line 127
    .line 128
    invoke-virtual {v0, v7, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v21

    .line 132
    aput-object v21, v19, v2

    .line 133
    .line 134
    add-int/lit8 v7, v7, 0x2

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_2
    move/from16 v21, v3

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    const-string v1, "Signature"

    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    invoke-virtual {v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    goto :goto_1

    .line 155
    :cond_4
    const-string v1, "Deprecated"

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    iget v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 164
    .line 165
    or-int v1, v1, v25

    .line 166
    .line 167
    iput v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    const-string v1, "RuntimeVisibleAnnotations"

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    move/from16 v18, v3

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    const-string v1, "RuntimeVisibleTypeAnnotations"

    .line 182
    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_7

    .line 188
    .line 189
    move/from16 v28, v3

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    const-string v1, "AnnotationDefault"

    .line 193
    .line 194
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    move v15, v3

    .line 201
    goto :goto_1

    .line 202
    :cond_8
    const-string v1, "Synthetic"

    .line 203
    .line 204
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_9

    .line 209
    .line 210
    iget v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 211
    .line 212
    or-int/lit16 v1, v1, 0x1000

    .line 213
    .line 214
    iput v1, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 215
    .line 216
    move/from16 v28, v4

    .line 217
    .line 218
    move-object v2, v5

    .line 219
    move v4, v12

    .line 220
    move/from16 v20, v26

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_9
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_a

    .line 230
    .line 231
    move/from16 v17, v3

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_a
    const-string v1, "RuntimeInvisibleTypeAnnotations"

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_b

    .line 242
    .line 243
    move v6, v3

    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :cond_b
    const-string v1, "RuntimeVisibleParameterAnnotations"

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    move/from16 v22, v3

    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :cond_c
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_d

    .line 265
    .line 266
    move/from16 v23, v3

    .line 267
    .line 268
    goto/16 :goto_1

    .line 269
    .line 270
    :cond_d
    const-string v1, "MethodParameters"

    .line 271
    .line 272
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_e

    .line 277
    .line 278
    move v14, v3

    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_e
    iget-object v1, v8, Lnet/bytebuddy/jar/asm/Context;->attributePrototypes:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 282
    .line 283
    move v7, v6

    .line 284
    const/4 v6, -0x1

    .line 285
    move/from16 v25, v7

    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    move/from16 v28, v4

    .line 289
    .line 290
    move v4, v12

    .line 291
    move/from16 v27, v17

    .line 292
    .line 293
    move/from16 v12, v18

    .line 294
    .line 295
    move/from16 v29, v25

    .line 296
    .line 297
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    move-object v2, v5

    .line 302
    iput-object v11, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 303
    .line 304
    move-object v11, v1

    .line 305
    move/from16 v6, v29

    .line 306
    .line 307
    :goto_4
    add-int v7, v3, v4

    .line 308
    .line 309
    move-object v5, v2

    .line 310
    move/from16 v1, v16

    .line 311
    .line 312
    move/from16 v3, v17

    .line 313
    .line 314
    move/from16 v2, v18

    .line 315
    .line 316
    move/from16 v4, v28

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_f
    move v12, v2

    .line 321
    move/from16 v27, v3

    .line 322
    .line 323
    move/from16 v28, v4

    .line 324
    .line 325
    move-object v2, v5

    .line 326
    move/from16 v29, v6

    .line 327
    .line 328
    move v1, v15

    .line 329
    const/16 v26, 0x1

    .line 330
    .line 331
    iget v15, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 332
    .line 333
    iget-object v3, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodName:Ljava/lang/String;

    .line 334
    .line 335
    iget-object v4, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodDescriptor:Ljava/lang/String;

    .line 336
    .line 337
    if-nez v13, :cond_10

    .line 338
    .line 339
    const/16 v18, 0x0

    .line 340
    .line 341
    :goto_5
    move-object/from16 v16, v3

    .line 342
    .line 343
    move-object/from16 v17, v4

    .line 344
    .line 345
    move v3, v1

    .line 346
    move v1, v14

    .line 347
    move-object/from16 v14, p1

    .line 348
    .line 349
    goto :goto_6

    .line 350
    :cond_10
    invoke-virtual {v0, v13, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUtf(I[C)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    move-object/from16 v18, v5

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :goto_6
    invoke-virtual/range {v14 .. v19}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 358
    .line 359
    .line 360
    move-result-object v14

    .line 361
    if-nez v14, :cond_11

    .line 362
    .line 363
    return v7

    .line 364
    :cond_11
    instance-of v4, v14, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 365
    .line 366
    if-eqz v4, :cond_13

    .line 367
    .line 368
    move-object v4, v14

    .line 369
    check-cast v4, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 370
    .line 371
    iget v5, v8, Lnet/bytebuddy/jar/asm/Context;->currentMethodAccessFlags:I

    .line 372
    .line 373
    and-int v5, v5, v25

    .line 374
    .line 375
    move v15, v3

    .line 376
    if-eqz v5, :cond_12

    .line 377
    .line 378
    move/from16 v3, v26

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_12
    const/4 v3, 0x0

    .line 382
    :goto_7
    invoke-virtual {v0, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    move v6, v1

    .line 387
    move-object v1, v0

    .line 388
    move-object v0, v4

    .line 389
    move v4, v5

    .line 390
    move v5, v13

    .line 391
    move v13, v6

    .line 392
    move-object v10, v2

    .line 393
    move/from16 v2, v20

    .line 394
    .line 395
    move/from16 v6, v21

    .line 396
    .line 397
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/MethodWriter;->canCopyMethodAttributes(Lnet/bytebuddy/jar/asm/ClassReader;ZZIII)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    move-object/from16 v30, v1

    .line 402
    .line 403
    move-object v1, v0

    .line 404
    move-object/from16 v0, v30

    .line 405
    .line 406
    if-eqz v2, :cond_14

    .line 407
    .line 408
    sub-int v0, v7, v9

    .line 409
    .line 410
    invoke-virtual {v1, v9, v0}, Lnet/bytebuddy/jar/asm/MethodWriter;->setMethodAttributesSource(II)V

    .line 411
    .line 412
    .line 413
    return v7

    .line 414
    :cond_13
    move v13, v1

    .line 415
    move-object v10, v2

    .line 416
    move v15, v3

    .line 417
    :cond_14
    if-eqz v13, :cond_15

    .line 418
    .line 419
    iget v1, v8, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 420
    .line 421
    and-int/lit8 v1, v1, 0x2

    .line 422
    .line 423
    if-nez v1, :cond_15

    .line 424
    .line 425
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    add-int/lit8 v2, v13, 0x1

    .line 430
    .line 431
    :goto_8
    add-int/lit8 v3, v1, -0x1

    .line 432
    .line 433
    if-lez v1, :cond_15

    .line 434
    .line 435
    invoke-virtual {v0, v2, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    add-int/lit8 v4, v2, 0x2

    .line 440
    .line 441
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    invoke-virtual {v14, v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitParameter(Ljava/lang/String;I)V

    .line 446
    .line 447
    .line 448
    add-int/lit8 v2, v2, 0x4

    .line 449
    .line 450
    move v1, v3

    .line 451
    goto :goto_8

    .line 452
    :cond_15
    if-eqz v15, :cond_16

    .line 453
    .line 454
    invoke-virtual {v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAnnotationDefault()Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    const/4 v2, 0x0

    .line 459
    invoke-direct {v0, v1, v15, v2, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValue(Lnet/bytebuddy/jar/asm/AnnotationVisitor;ILjava/lang/String;[C)I

    .line 460
    .line 461
    .line 462
    if-eqz v1, :cond_16

    .line 463
    .line 464
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    .line 465
    .line 466
    .line 467
    :cond_16
    if-eqz v12, :cond_17

    .line 468
    .line 469
    invoke-virtual {v0, v12}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    add-int/lit8 v2, v12, 0x2

    .line 474
    .line 475
    :goto_9
    add-int/lit8 v3, v1, -0x1

    .line 476
    .line 477
    if-lez v1, :cond_17

    .line 478
    .line 479
    invoke-virtual {v0, v2, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    add-int/lit8 v2, v2, 0x2

    .line 484
    .line 485
    move/from16 v4, v26

    .line 486
    .line 487
    invoke-virtual {v14, v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-direct {v0, v1, v2, v4, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    move v1, v3

    .line 496
    goto :goto_9

    .line 497
    :cond_17
    move/from16 v1, v27

    .line 498
    .line 499
    if-eqz v1, :cond_18

    .line 500
    .line 501
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    add-int/lit8 v3, v1, 0x2

    .line 506
    .line 507
    :goto_a
    add-int/lit8 v1, v2, -0x1

    .line 508
    .line 509
    if-lez v2, :cond_18

    .line 510
    .line 511
    invoke-virtual {v0, v3, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    add-int/lit8 v3, v3, 0x2

    .line 516
    .line 517
    const/4 v4, 0x0

    .line 518
    invoke-virtual {v14, v2, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/4 v4, 0x1

    .line 523
    invoke-direct {v0, v2, v3, v4, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    move v2, v1

    .line 528
    goto :goto_a

    .line 529
    :cond_18
    move/from16 v1, v28

    .line 530
    .line 531
    if-eqz v1, :cond_19

    .line 532
    .line 533
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    add-int/lit8 v4, v1, 0x2

    .line 538
    .line 539
    :goto_b
    add-int/lit8 v1, v2, -0x1

    .line 540
    .line 541
    if-lez v2, :cond_19

    .line 542
    .line 543
    invoke-direct {v0, v8, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    invoke-virtual {v0, v2, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    add-int/lit8 v2, v2, 0x2

    .line 552
    .line 553
    iget v4, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 554
    .line 555
    iget-object v5, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 556
    .line 557
    const/4 v6, 0x1

    .line 558
    invoke-virtual {v14, v4, v5, v3, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-direct {v0, v3, v2, v6, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    move v2, v1

    .line 567
    goto :goto_b

    .line 568
    :cond_19
    move/from16 v6, v29

    .line 569
    .line 570
    if-eqz v6, :cond_1a

    .line 571
    .line 572
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    add-int/lit8 v6, v6, 0x2

    .line 577
    .line 578
    :goto_c
    add-int/lit8 v2, v1, -0x1

    .line 579
    .line 580
    if-lez v1, :cond_1a

    .line 581
    .line 582
    invoke-direct {v0, v8, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    invoke-virtual {v0, v1, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    add-int/lit8 v1, v1, 0x2

    .line 591
    .line 592
    iget v4, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 593
    .line 594
    iget-object v5, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 595
    .line 596
    const/4 v6, 0x0

    .line 597
    invoke-virtual {v14, v4, v5, v3, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    const/4 v4, 0x1

    .line 602
    invoke-direct {v0, v3, v1, v4, v10}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    move v6, v1

    .line 607
    move v1, v2

    .line 608
    goto :goto_c

    .line 609
    :cond_1a
    const/4 v4, 0x1

    .line 610
    const/4 v6, 0x0

    .line 611
    move/from16 v1, v22

    .line 612
    .line 613
    if-eqz v1, :cond_1b

    .line 614
    .line 615
    invoke-direct {v0, v14, v8, v1, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readParameterAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)V

    .line 616
    .line 617
    .line 618
    :cond_1b
    move/from16 v1, v23

    .line 619
    .line 620
    if-eqz v1, :cond_1c

    .line 621
    .line 622
    invoke-direct {v0, v14, v8, v1, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readParameterAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)V

    .line 623
    .line 624
    .line 625
    :cond_1c
    :goto_d
    if-eqz v11, :cond_1d

    .line 626
    .line 627
    iget-object v1, v11, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 628
    .line 629
    const/4 v2, 0x0

    .line 630
    iput-object v2, v11, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 631
    .line 632
    invoke-virtual {v14, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 633
    .line 634
    .line 635
    move-object v11, v1

    .line 636
    goto :goto_d

    .line 637
    :cond_1d
    move/from16 v11, v24

    .line 638
    .line 639
    if-eqz v11, :cond_1e

    .line 640
    .line 641
    invoke-virtual {v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 642
    .line 643
    .line 644
    invoke-direct {v0, v14, v8, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readCode(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;I)V

    .line 645
    .line 646
    .line 647
    :cond_1e
    invoke-virtual {v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitEnd()V

    .line 648
    .line 649
    .line 650
    return v7
.end method

.method private readModuleAttributes(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;IILjava/lang/String;)V
    .locals 7

    .line 1
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 2
    .line 3
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readModule(I[C)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    add-int/lit8 v1, p3, 0x2

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/lit8 v2, p3, 0x4

    .line 14
    .line 15
    invoke-virtual {p0, v2, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    add-int/lit8 v3, p3, 0x6

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, v2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    if-eqz p5, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p5}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitMainClass(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    if-eqz p4, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 36
    .line 37
    .line 38
    move-result p5

    .line 39
    add-int/lit8 p4, p4, 0x2

    .line 40
    .line 41
    :goto_0
    add-int/lit8 v0, p5, -0x1

    .line 42
    .line 43
    if-lez p5, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, p4, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readPackage(I[C)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    invoke-virtual {p1, p5}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitPackage(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 p4, p4, 0x2

    .line 53
    .line 54
    move p5, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    add-int/lit8 p3, p3, 0x8

    .line 61
    .line 62
    :goto_1
    add-int/lit8 p5, p4, -0x1

    .line 63
    .line 64
    if-lez p4, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readModule(I[C)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    add-int/lit8 v0, p3, 0x2

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    add-int/lit8 v1, p3, 0x4

    .line 77
    .line 78
    invoke-virtual {p0, v1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    add-int/lit8 p3, p3, 0x6

    .line 83
    .line 84
    invoke-virtual {p1, p4, v0, v1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitRequire(Ljava/lang/String;ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    move p4, p5

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    add-int/lit8 p3, p3, 0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p5, p4, -0x1

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    const/4 v1, 0x0

    .line 99
    if-lez p4, :cond_5

    .line 100
    .line 101
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readPackage(I[C)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    add-int/lit8 v2, p3, 0x2

    .line 106
    .line 107
    invoke-virtual {p0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    add-int/lit8 v3, p3, 0x4

    .line 112
    .line 113
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    add-int/lit8 p3, p3, 0x6

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    new-array v0, v3, [Ljava/lang/String;

    .line 122
    .line 123
    :goto_3
    if-ge v1, v3, :cond_4

    .line 124
    .line 125
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readModule(I[C)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    aput-object v4, v0, v1

    .line 130
    .line 131
    add-int/lit8 p3, p3, 0x2

    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    invoke-virtual {p1, p4, v2, v0}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitExport(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    move p4, p5

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 142
    .line 143
    .line 144
    move-result p4

    .line 145
    add-int/lit8 p3, p3, 0x2

    .line 146
    .line 147
    :goto_4
    add-int/lit8 p5, p4, -0x1

    .line 148
    .line 149
    if-lez p4, :cond_8

    .line 150
    .line 151
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readPackage(I[C)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    add-int/lit8 v2, p3, 0x2

    .line 156
    .line 157
    invoke-virtual {p0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    add-int/lit8 v3, p3, 0x4

    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    add-int/lit8 p3, p3, 0x6

    .line 168
    .line 169
    if-eqz v3, :cond_6

    .line 170
    .line 171
    new-array v4, v3, [Ljava/lang/String;

    .line 172
    .line 173
    move v5, v1

    .line 174
    :goto_5
    if-ge v5, v3, :cond_7

    .line 175
    .line 176
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readModule(I[C)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    aput-object v6, v4, v5

    .line 181
    .line 182
    add-int/lit8 p3, p3, 0x2

    .line 183
    .line 184
    add-int/lit8 v5, v5, 0x1

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_6
    move-object v4, v0

    .line 188
    :cond_7
    invoke-virtual {p1, p4, v2, v4}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitOpen(Ljava/lang/String;I[Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    move p4, p5

    .line 192
    goto :goto_4

    .line 193
    :cond_8
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 194
    .line 195
    .line 196
    move-result p4

    .line 197
    add-int/lit8 p3, p3, 0x2

    .line 198
    .line 199
    :goto_6
    add-int/lit8 p5, p4, -0x1

    .line 200
    .line 201
    if-lez p4, :cond_9

    .line 202
    .line 203
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p4

    .line 207
    invoke-virtual {p1, p4}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitUse(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    add-int/lit8 p3, p3, 0x2

    .line 211
    .line 212
    move p4, p5

    .line 213
    goto :goto_6

    .line 214
    :cond_9
    invoke-virtual {p0, p3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 215
    .line 216
    .line 217
    move-result p4

    .line 218
    add-int/lit8 p3, p3, 0x2

    .line 219
    .line 220
    :goto_7
    add-int/lit8 p5, p4, -0x1

    .line 221
    .line 222
    if-lez p4, :cond_b

    .line 223
    .line 224
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p4

    .line 228
    add-int/lit8 v0, p3, 0x2

    .line 229
    .line 230
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    add-int/lit8 p3, p3, 0x4

    .line 235
    .line 236
    new-array v2, v0, [Ljava/lang/String;

    .line 237
    .line 238
    move v3, v1

    .line 239
    :goto_8
    if-ge v3, v0, :cond_a

    .line 240
    .line 241
    invoke-virtual {p0, p3, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    aput-object v4, v2, v3

    .line 246
    .line 247
    add-int/lit8 p3, p3, 0x2

    .line 248
    .line 249
    add-int/lit8 v3, v3, 0x1

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_a
    invoke-virtual {p1, p4, v2}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitProvide(Ljava/lang/String;[Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    move p4, p5

    .line 256
    goto :goto_7

    .line 257
    :cond_b
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/ModuleVisitor;->visitEnd()V

    .line 258
    .line 259
    .line 260
    return-void
.end method

.method private readParameterAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    add-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    aget-byte p3, v0, p3

    .line 6
    .line 7
    and-int/lit16 p3, p3, 0xff

    .line 8
    .line 9
    invoke-virtual {p1, p3, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAnnotableParameterCount(IZ)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    :goto_1
    add-int/lit8 v3, v2, -0x1

    .line 24
    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    add-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    invoke-virtual {p1, v0, v2, p4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitParameterAnnotation(ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {p0, v2, v1, v4, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    move v2, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method private readRecordComponent(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    iget-object v5, v8, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 8
    .line 9
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    add-int/lit8 v2, v1, 0x2

    .line 14
    .line 15
    invoke-virtual {v0, v2, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v10

    .line 19
    add-int/lit8 v2, v1, 0x4

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/lit8 v1, v1, 0x6

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    :goto_0
    add-int/lit8 v16, v2, -0x1

    .line 34
    .line 35
    if-lez v2, :cond_5

    .line 36
    .line 37
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    add-int/lit8 v7, v1, 0x2

    .line 42
    .line 43
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    add-int/lit8 v1, v1, 0x6

    .line 48
    .line 49
    const-string v11, "Signature"

    .line 50
    .line 51
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-eqz v11, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    move v2, v3

    .line 62
    move v3, v1

    .line 63
    move v1, v2

    .line 64
    :goto_1
    move-object v2, v4

    .line 65
    move v4, v7

    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_0
    const-string v11, "RuntimeVisibleAnnotations"

    .line 69
    .line 70
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    if-eqz v11, :cond_1

    .line 75
    .line 76
    move v14, v1

    .line 77
    move-object v2, v4

    .line 78
    move v4, v7

    .line 79
    move v1, v3

    .line 80
    move v3, v14

    .line 81
    goto :goto_2

    .line 82
    :cond_1
    const-string v11, "RuntimeVisibleTypeAnnotations"

    .line 83
    .line 84
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_2

    .line 89
    .line 90
    move v3, v1

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    const-string v11, "RuntimeInvisibleAnnotations"

    .line 93
    .line 94
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    if-eqz v11, :cond_3

    .line 99
    .line 100
    move v15, v1

    .line 101
    move-object v2, v4

    .line 102
    move v4, v7

    .line 103
    move v1, v3

    .line 104
    move v3, v15

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const-string v11, "RuntimeInvisibleTypeAnnotations"

    .line 107
    .line 108
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_4

    .line 113
    .line 114
    move v6, v1

    .line 115
    move-object v2, v4

    .line 116
    move v4, v7

    .line 117
    move v1, v3

    .line 118
    move v3, v6

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move v11, v3

    .line 121
    move v3, v1

    .line 122
    iget-object v1, v8, Lnet/bytebuddy/jar/asm/Context;->attributePrototypes:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 123
    .line 124
    move/from16 v17, v6

    .line 125
    .line 126
    const/4 v6, -0x1

    .line 127
    move-object/from16 v18, v4

    .line 128
    .line 129
    move v4, v7

    .line 130
    const/4 v7, 0x0

    .line 131
    move/from16 v19, v17

    .line 132
    .line 133
    move-object/from16 v12, v18

    .line 134
    .line 135
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iput-object v12, v1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 140
    .line 141
    move-object v2, v1

    .line 142
    move v1, v11

    .line 143
    move/from16 v6, v19

    .line 144
    .line 145
    :goto_2
    add-int/2addr v3, v4

    .line 146
    move v4, v3

    .line 147
    move v3, v1

    .line 148
    move v1, v4

    .line 149
    move-object v4, v2

    .line 150
    move/from16 v2, v16

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_5
    move-object/from16 v2, p1

    .line 154
    .line 155
    move v11, v3

    .line 156
    move-object v12, v4

    .line 157
    move/from16 v19, v6

    .line 158
    .line 159
    invoke-virtual {v2, v9, v10, v13}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-nez v2, :cond_6

    .line 164
    .line 165
    return v1

    .line 166
    :cond_6
    const/4 v3, 0x1

    .line 167
    if-eqz v14, :cond_7

    .line 168
    .line 169
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    add-int/lit8 v14, v14, 0x2

    .line 174
    .line 175
    :goto_3
    add-int/lit8 v6, v4, -0x1

    .line 176
    .line 177
    if-lez v4, :cond_7

    .line 178
    .line 179
    invoke-virtual {v0, v14, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    add-int/lit8 v14, v14, 0x2

    .line 184
    .line 185
    invoke-virtual {v2, v4, v3}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-direct {v0, v4, v14, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    move v4, v6

    .line 194
    goto :goto_3

    .line 195
    :cond_7
    if-eqz v15, :cond_8

    .line 196
    .line 197
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    add-int/lit8 v15, v15, 0x2

    .line 202
    .line 203
    :goto_4
    add-int/lit8 v6, v4, -0x1

    .line 204
    .line 205
    if-lez v4, :cond_8

    .line 206
    .line 207
    invoke-virtual {v0, v15, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    add-int/lit8 v15, v15, 0x2

    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    invoke-virtual {v2, v4, v7}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-direct {v0, v4, v15, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    move v4, v6

    .line 223
    goto :goto_4

    .line 224
    :cond_8
    if-eqz v11, :cond_9

    .line 225
    .line 226
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    add-int/lit8 v6, v11, 0x2

    .line 231
    .line 232
    :goto_5
    add-int/lit8 v7, v4, -0x1

    .line 233
    .line 234
    if-lez v4, :cond_9

    .line 235
    .line 236
    invoke-direct {v0, v8, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    add-int/lit8 v4, v4, 0x2

    .line 245
    .line 246
    iget v9, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 247
    .line 248
    iget-object v10, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 249
    .line 250
    invoke-virtual {v2, v9, v10, v6, v3}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-direct {v0, v6, v4, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    move v4, v7

    .line 259
    goto :goto_5

    .line 260
    :cond_9
    move/from16 v6, v19

    .line 261
    .line 262
    if-eqz v6, :cond_a

    .line 263
    .line 264
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    add-int/lit8 v6, v6, 0x2

    .line 269
    .line 270
    :goto_6
    add-int/lit8 v7, v4, -0x1

    .line 271
    .line 272
    if-lez v4, :cond_a

    .line 273
    .line 274
    invoke-direct {v0, v8, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    add-int/lit8 v4, v4, 0x2

    .line 283
    .line 284
    iget v9, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 285
    .line 286
    iget-object v10, v8, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 287
    .line 288
    const/4 v11, 0x0

    .line 289
    invoke-virtual {v2, v9, v10, v6, v11}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-direct {v0, v6, v4, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    move v4, v7

    .line 298
    goto :goto_6

    .line 299
    :cond_a
    move-object v4, v12

    .line 300
    :goto_7
    if-eqz v4, :cond_b

    .line 301
    .line 302
    iget-object v0, v4, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 303
    .line 304
    const/4 v3, 0x0

    .line 305
    iput-object v3, v4, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 308
    .line 309
    .line 310
    move-object v4, v0

    .line 311
    goto :goto_7

    .line 312
    :cond_b
    invoke-virtual {v2}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitEnd()V

    .line 313
    .line 314
    .line 315
    return v1
.end method

.method private readStackMapFrame(IZZLnet/bytebuddy/jar/asm/Context;)I
    .locals 11

    .line 1
    iget-object v4, p4, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 2
    .line 3
    iget-object v5, p4, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    const/16 v0, 0xff

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x1

    .line 12
    .line 13
    aget-byte p1, p2, p1

    .line 14
    .line 15
    and-int/2addr p1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p2, -0x1

    .line 18
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameOffset:I

    .line 19
    .line 20
    move v1, p1

    .line 21
    move p1, v0

    .line 22
    :goto_0
    const/4 p2, 0x0

    .line 23
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    const/16 v3, 0x40

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-ge p1, v3, :cond_1

    .line 30
    .line 31
    iput v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 32
    .line 33
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_1
    const/16 v3, 0x80

    .line 39
    .line 40
    const/4 v7, 0x4

    .line 41
    if-ge p1, v3, :cond_2

    .line 42
    .line 43
    add-int/lit8 p1, p1, -0x40

    .line 44
    .line 45
    iget-object v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    move-object v0, p0

    .line 49
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iput v7, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 54
    .line 55
    iput v6, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 56
    .line 57
    goto/16 :goto_7

    .line 58
    .line 59
    :cond_2
    const/16 v3, 0xf7

    .line 60
    .line 61
    if-lt p1, v3, :cond_b

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    move v9, v1

    .line 68
    add-int/lit8 v1, v9, 0x2

    .line 69
    .line 70
    if-ne p1, v3, :cond_4

    .line 71
    .line 72
    iget-object v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    move-object v0, p0

    .line 76
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iput v7, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 81
    .line 82
    iput v6, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 83
    .line 84
    :cond_3
    :goto_1
    move p1, v8

    .line 85
    goto/16 :goto_7

    .line 86
    .line 87
    :cond_4
    const/16 v3, 0xf8

    .line 88
    .line 89
    const/4 v7, 0x2

    .line 90
    const/16 v10, 0xfb

    .line 91
    .line 92
    if-lt p1, v3, :cond_5

    .line 93
    .line 94
    if-ge p1, v10, :cond_5

    .line 95
    .line 96
    iput v7, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 97
    .line 98
    rsub-int p1, p1, 0xfb

    .line 99
    .line 100
    iput p1, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 101
    .line 102
    iget p3, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 103
    .line 104
    sub-int/2addr p3, p1

    .line 105
    iput p3, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 106
    .line 107
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    if-ne p1, v10, :cond_6

    .line 111
    .line 112
    iput v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 113
    .line 114
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 115
    .line 116
    :goto_2
    move-object v0, p0

    .line 117
    goto :goto_1

    .line 118
    :cond_6
    if-ge p1, v0, :cond_9

    .line 119
    .line 120
    if-eqz p3, :cond_7

    .line 121
    .line 122
    iget p3, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    move p3, p2

    .line 126
    :goto_3
    add-int/lit16 p1, p1, -0xfb

    .line 127
    .line 128
    move v3, p3

    .line 129
    move p3, p1

    .line 130
    :goto_4
    if-lez p3, :cond_8

    .line 131
    .line 132
    iget-object v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 133
    .line 134
    add-int/lit8 v7, v3, 0x1

    .line 135
    .line 136
    move-object v0, p0

    .line 137
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/lit8 p3, p3, -0x1

    .line 142
    .line 143
    move v3, v7

    .line 144
    goto :goto_4

    .line 145
    :cond_8
    move-object v0, p0

    .line 146
    iput v6, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 147
    .line 148
    iput p1, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 149
    .line 150
    iget p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 151
    .line 152
    add-int/2addr p0, p1

    .line 153
    iput p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 154
    .line 155
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_9
    move-object v0, p0

    .line 159
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    add-int/lit8 v1, v9, 0x4

    .line 164
    .line 165
    iput p2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameType:I

    .line 166
    .line 167
    iput p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCountDelta:I

    .line 168
    .line 169
    iput p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalCount:I

    .line 170
    .line 171
    move v3, p2

    .line 172
    :goto_5
    if-ge v3, p0, :cond_a

    .line 173
    .line 174
    iget-object v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameLocalTypes:[Ljava/lang/Object;

    .line 175
    .line 176
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_a
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    add-int/2addr v1, v7

    .line 188
    iput p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackCount:I

    .line 189
    .line 190
    move v3, p2

    .line 191
    :goto_6
    if-ge v3, p0, :cond_3

    .line 192
    .line 193
    iget-object v2, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameStackTypes:[Ljava/lang/Object;

    .line 194
    .line 195
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    add-int/lit8 v3, v3, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :goto_7
    iget p0, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameOffset:I

    .line 203
    .line 204
    add-int/2addr p1, v6

    .line 205
    add-int/2addr p1, p0

    .line 206
    iput p1, p4, Lnet/bytebuddy/jar/asm/Context;->currentFrameOffset:I

    .line 207
    .line 208
    invoke-direct {v0, p1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 209
    .line 210
    .line 211
    return v1

    .line 212
    :cond_b
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 213
    .line 214
    .line 215
    return p2
.end method

.method private static readStream(Ljava/io/InputStream;Z)[B
    .locals 7

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/ClassReader;->computeBufferSize(Ljava/io/InputStream;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :try_start_1
    new-array v2, v0, [B

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    invoke-virtual {p0, v2, v3, v0}, Ljava/io/InputStream;->read([BII)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, -0x1

    .line 21
    if-eq v5, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, v4, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne v4, v0, :cond_2

    .line 36
    .line 37
    :try_start_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 38
    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-object v2

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    :try_start_4
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 58
    .line 59
    .line 60
    :cond_3
    return-object v0

    .line 61
    :goto_1
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 62
    .line 63
    .line 64
    :catchall_2
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 65
    :goto_2
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 68
    .line 69
    .line 70
    :cond_4
    throw v0

    .line 71
    :cond_5
    const-string p0, "Class not found"

    .line 72
    .line 73
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method private readStringish(I[C)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I
    .locals 9

    .line 1
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x18

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    const/high16 v3, -0x1000000

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    packed-switch v1, :pswitch_data_1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :pswitch_0
    const v1, -0xffff01

    .line 26
    .line 27
    .line 28
    and-int/2addr v0, v1

    .line 29
    add-int/lit8 p2, p2, 0x4

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :pswitch_1
    and-int/2addr v0, v3

    .line 33
    :goto_0
    add-int/lit8 p2, p2, 0x3

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :pswitch_2
    and-int/2addr v0, v3

    .line 37
    add-int/lit8 v1, p2, 0x1

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 p2, p2, 0x3

    .line 44
    .line 45
    new-array v3, v1, [Lnet/bytebuddy/jar/asm/Label;

    .line 46
    .line 47
    iput-object v3, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeStarts:[Lnet/bytebuddy/jar/asm/Label;

    .line 48
    .line 49
    new-array v3, v1, [Lnet/bytebuddy/jar/asm/Label;

    .line 50
    .line 51
    iput-object v3, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeEnds:[Lnet/bytebuddy/jar/asm/Label;

    .line 52
    .line 53
    new-array v3, v1, [I

    .line 54
    .line 55
    iput-object v3, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeIndices:[I

    .line 56
    .line 57
    :goto_1
    if-ge v4, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    add-int/lit8 v5, p2, 0x2

    .line 64
    .line 65
    invoke-virtual {p0, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/lit8 v6, p2, 0x4

    .line 70
    .line 71
    invoke-virtual {p0, v6}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/lit8 p2, p2, 0x6

    .line 76
    .line 77
    iget-object v7, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeStarts:[Lnet/bytebuddy/jar/asm/Label;

    .line 78
    .line 79
    iget-object v8, p1, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 80
    .line 81
    invoke-direct {p0, v3, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    aput-object v8, v7, v4

    .line 86
    .line 87
    iget-object v7, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeEnds:[Lnet/bytebuddy/jar/asm/Label;

    .line 88
    .line 89
    add-int/2addr v3, v5

    .line 90
    iget-object v5, p1, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 91
    .line 92
    invoke-direct {p0, v3, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    aput-object v3, v7, v4

    .line 97
    .line 98
    iget-object v3, p1, Lnet/bytebuddy/jar/asm/Context;->currentLocalVariableAnnotationRangeIndices:[I

    .line 99
    .line 100
    aput v6, v3, v4

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_3
    and-int/2addr v0, v3

    .line 106
    add-int/2addr p2, v2

    .line 107
    goto :goto_2

    .line 108
    :pswitch_4
    and-int/lit16 v0, v0, -0x100

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    :pswitch_5
    const/high16 v1, -0x10000

    .line 112
    .line 113
    and-int/2addr v0, v1

    .line 114
    add-int/lit8 p2, p2, 0x2

    .line 115
    .line 116
    :cond_1
    :goto_2
    iput v0, p1, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 117
    .line 118
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    goto :goto_3

    .line 126
    :cond_2
    new-instance v1, Lnet/bytebuddy/jar/asm/TypePath;

    .line 127
    .line 128
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 129
    .line 130
    invoke-direct {v1, p0, p2}, Lnet/bytebuddy/jar/asm/TypePath;-><init>([BI)V

    .line 131
    .line 132
    .line 133
    move-object p0, v1

    .line 134
    :goto_3
    iput-object p0, p1, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 135
    .line 136
    add-int/2addr p2, v2

    .line 137
    mul-int/lit8 v0, v0, 0x2

    .line 138
    .line 139
    add-int/2addr v0, p2

    .line 140
    return v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_2
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private readTypeAnnotations(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/jar/asm/Context;IZ)[I
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    new-array v4, v3, [I

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    add-int/2addr v1, v5

    .line 15
    const/4 v6, 0x0

    .line 16
    :goto_0
    if-ge v6, v3, :cond_4

    .line 17
    .line 18
    aput v1, v4, v6

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    ushr-int/lit8 v8, v7, 0x18

    .line 25
    .line 26
    const/16 v9, 0x17

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-eq v8, v9, :cond_0

    .line 30
    .line 31
    packed-switch v8, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    packed-switch v8, :pswitch_data_1

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 38
    .line 39
    .line 40
    return-object v10

    .line 41
    :pswitch_0
    add-int/lit8 v1, v1, 0x4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_1
    add-int/lit8 v9, v1, 0x1

    .line 45
    .line 46
    invoke-virtual {p0, v9}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    add-int/lit8 v1, v1, 0x3

    .line 51
    .line 52
    :goto_1
    add-int/lit8 v11, v9, -0x1

    .line 53
    .line 54
    if-lez v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    add-int/lit8 v12, v1, 0x2

    .line 61
    .line 62
    invoke-virtual {p0, v12}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    add-int/lit8 v1, v1, 0x6

    .line 67
    .line 68
    iget-object v13, v0, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 69
    .line 70
    invoke-direct {p0, v9, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 71
    .line 72
    .line 73
    add-int/2addr v9, v12

    .line 74
    iget-object v12, v0, Lnet/bytebuddy/jar/asm/Context;->currentMethodLabels:[Lnet/bytebuddy/jar/asm/Label;

    .line 75
    .line 76
    invoke-direct {p0, v9, v12}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 77
    .line 78
    .line 79
    move v9, v11

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    :pswitch_2
    add-int/lit8 v1, v1, 0x3

    .line 82
    .line 83
    :cond_1
    :goto_2
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    const/16 v11, 0x42

    .line 88
    .line 89
    const/4 v12, 0x1

    .line 90
    if-ne v8, v11, :cond_3

    .line 91
    .line 92
    if-nez v9, :cond_2

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_2
    new-instance v10, Lnet/bytebuddy/jar/asm/TypePath;

    .line 96
    .line 97
    iget-object v8, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 98
    .line 99
    invoke-direct {v10, v8, v1}, Lnet/bytebuddy/jar/asm/TypePath;-><init>([BI)V

    .line 100
    .line 101
    .line 102
    :goto_3
    invoke-static {v9, v5, v12, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-virtual {p0, v1, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    add-int/2addr v1, v5

    .line 111
    and-int/lit16 v7, v7, -0x100

    .line 112
    .line 113
    move/from16 v11, p4

    .line 114
    .line 115
    invoke-virtual {p1, v7, v10, v8, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTryCatchAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-direct {p0, v7, v1, v12, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    goto :goto_4

    .line 124
    :cond_3
    move/from16 v11, p4

    .line 125
    .line 126
    const/4 v7, 0x3

    .line 127
    invoke-static {v9, v5, v7, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-direct {p0, v10, v1, v12, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    return-object v4

    .line 139
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    :pswitch_data_1
    .packed-switch 0x40
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private readUtf(II[C)Ljava/lang/String;
    .locals 6

    .line 1
    add-int/2addr p2, p1

    .line 2
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    if-ge p1, p2, :cond_2

    .line 7
    .line 8
    add-int/lit8 v2, p1, 0x1

    .line 9
    .line 10
    aget-byte v3, p0, p1

    .line 11
    .line 12
    and-int/lit16 v4, v3, 0x80

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    add-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    and-int/lit8 v3, v3, 0x7f

    .line 19
    .line 20
    int-to-char v3, v3

    .line 21
    aput-char v3, p3, v1

    .line 22
    .line 23
    move v1, p1

    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    and-int/lit16 v4, v3, 0xe0

    .line 27
    .line 28
    const/16 v5, 0xc0

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    add-int/lit8 v4, v1, 0x1

    .line 33
    .line 34
    and-int/lit8 v3, v3, 0x1f

    .line 35
    .line 36
    shl-int/lit8 v3, v3, 0x6

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x2

    .line 39
    .line 40
    aget-byte v2, p0, v2

    .line 41
    .line 42
    and-int/lit8 v2, v2, 0x3f

    .line 43
    .line 44
    add-int/2addr v3, v2

    .line 45
    int-to-char v2, v3

    .line 46
    aput-char v2, p3, v1

    .line 47
    .line 48
    :goto_1
    move v1, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    add-int/lit8 v4, v1, 0x1

    .line 51
    .line 52
    and-int/lit8 v3, v3, 0xf

    .line 53
    .line 54
    shl-int/lit8 v3, v3, 0xc

    .line 55
    .line 56
    add-int/lit8 v5, p1, 0x2

    .line 57
    .line 58
    aget-byte v2, p0, v2

    .line 59
    .line 60
    and-int/lit8 v2, v2, 0x3f

    .line 61
    .line 62
    shl-int/lit8 v2, v2, 0x6

    .line 63
    .line 64
    add-int/2addr v3, v2

    .line 65
    add-int/lit8 p1, p1, 0x3

    .line 66
    .line 67
    aget-byte v2, p0, v5

    .line 68
    .line 69
    and-int/lit8 v2, v2, 0x3f

    .line 70
    .line 71
    add-int/2addr v3, v2

    .line 72
    int-to-char v2, v3

    .line 73
    aput-char v2, p3, v1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {p0, p3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method private readVerificationTypeInfo(I[Ljava/lang/Object;I[C[Lnet/bytebuddy/jar/asm/Label;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    aget-byte v0, v0, p1

    .line 6
    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :pswitch_0
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    invoke-direct {p0, p4, p5}, Lnet/bytebuddy/jar/asm/ClassReader;->createLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aput-object p0, p2, p3

    .line 26
    .line 27
    :goto_0
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    return p1

    .line 30
    :pswitch_1
    invoke-virtual {p0, v1, p4}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    aput-object p0, p2, p3

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_2
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->UNINITIALIZED_THIS:Ljava/lang/Integer;

    .line 38
    .line 39
    aput-object p0, p2, p3

    .line 40
    .line 41
    return v1

    .line 42
    :pswitch_3
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->NULL:Ljava/lang/Integer;

    .line 43
    .line 44
    aput-object p0, p2, p3

    .line 45
    .line 46
    return v1

    .line 47
    :pswitch_4
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 48
    .line 49
    aput-object p0, p2, p3

    .line 50
    .line 51
    return v1

    .line 52
    :pswitch_5
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 53
    .line 54
    aput-object p0, p2, p3

    .line 55
    .line 56
    return v1

    .line 57
    :pswitch_6
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->FLOAT:Ljava/lang/Integer;

    .line 58
    .line 59
    aput-object p0, p2, p3

    .line 60
    .line 61
    return v1

    .line 62
    :pswitch_7
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->INTEGER:Ljava/lang/Integer;

    .line 63
    .line 64
    aput-object p0, p2, p3

    .line 65
    .line 66
    return v1

    .line 67
    :pswitch_8
    sget-object p0, Lnet/bytebuddy/jar/asm/Opcodes;->TOP:Ljava/lang/Integer;

    .line 68
    .line 69
    aput-object p0, p2, p3

    .line 70
    .line 71
    return v1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static synthetic stringConcat$0(S)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Unsupported class file major version "

    .line 2
    .line 3
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic stringConcat$1(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ".class"

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V
    .locals 1

    const/4 v0, 0x0

    .line 912
    new-array v0, v0, [Lnet/bytebuddy/jar/asm/Attribute;

    invoke-virtual {p0, p1, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;[Lnet/bytebuddy/jar/asm/Attribute;I)V

    return-void
.end method

.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;[Lnet/bytebuddy/jar/asm/Attribute;I)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v8, p3

    .line 4
    .line 5
    new-instance v9, Lnet/bytebuddy/jar/asm/Context;

    .line 6
    .line 7
    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Context;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p2

    .line 11
    .line 12
    iput-object v1, v9, Lnet/bytebuddy/jar/asm/Context;->attributePrototypes:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 13
    .line 14
    iput v8, v9, Lnet/bytebuddy/jar/asm/Context;->parsingOptions:I

    .line 15
    .line 16
    iget v2, v0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 17
    .line 18
    new-array v5, v2, [C

    .line 19
    .line 20
    iput-object v5, v9, Lnet/bytebuddy/jar/asm/Context;->charBuffer:[C

    .line 21
    .line 22
    iget v2, v0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/lit8 v4, v2, 0x2

    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v10

    .line 34
    add-int/lit8 v4, v2, 0x4

    .line 35
    .line 36
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    add-int/lit8 v4, v2, 0x6

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    new-array v12, v4, [Ljava/lang/String;

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x8

    .line 49
    .line 50
    move v14, v2

    .line 51
    const/4 v2, 0x0

    .line 52
    :goto_0
    if-ge v2, v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v14, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    aput-object v6, v12, v2

    .line 59
    .line 60
    add-int/lit8 v14, v14, 0x2

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/ClassReader;->getFirstAttributeOffset()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/lit8 v4, v2, -0x2

    .line 70
    .line 71
    invoke-virtual {v0, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    move/from16 v16, v4

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const/16 v19, 0x0

    .line 87
    .line 88
    const/16 v20, 0x0

    .line 89
    .line 90
    const/16 v21, 0x0

    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const/16 v23, 0x0

    .line 95
    .line 96
    const/16 v24, 0x0

    .line 97
    .line 98
    const/16 v25, 0x0

    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const/16 v27, 0x0

    .line 103
    .line 104
    const/16 v28, 0x0

    .line 105
    .line 106
    :goto_1
    if-lez v16, :cond_15

    .line 107
    .line 108
    move v1, v2

    .line 109
    invoke-virtual {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move/from16 v29, v1

    .line 114
    .line 115
    add-int/lit8 v1, v29, 0x2

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    move-object/from16 v30, v4

    .line 122
    .line 123
    add-int/lit8 v4, v29, 0x6

    .line 124
    .line 125
    move-object/from16 v29, v6

    .line 126
    .line 127
    const-string v6, "SourceFile"

    .line 128
    .line 129
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_1

    .line 134
    .line 135
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v8, v2

    .line 140
    move v2, v3

    .line 141
    move v3, v4

    .line 142
    move-object/from16 v30, v10

    .line 143
    .line 144
    move-object/from16 v6, v29

    .line 145
    .line 146
    move v4, v1

    .line 147
    move-object/from16 v29, v9

    .line 148
    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_1
    const-string v6, "InnerClasses"

    .line 152
    .line 153
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_2

    .line 158
    .line 159
    move v2, v3

    .line 160
    move v3, v4

    .line 161
    move/from16 v27, v3

    .line 162
    .line 163
    :goto_2
    move-object/from16 v6, v29

    .line 164
    .line 165
    move-object/from16 v8, v30

    .line 166
    .line 167
    move v4, v1

    .line 168
    move-object/from16 v29, v9

    .line 169
    .line 170
    :goto_3
    move-object/from16 v30, v10

    .line 171
    .line 172
    goto/16 :goto_7

    .line 173
    .line 174
    :cond_2
    const-string v6, "EnclosingMethod"

    .line 175
    .line 176
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_3

    .line 181
    .line 182
    move v2, v3

    .line 183
    move v3, v4

    .line 184
    move v15, v3

    .line 185
    goto :goto_2

    .line 186
    :cond_3
    const-string v6, "NestHost"

    .line 187
    .line 188
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_4

    .line 193
    .line 194
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    :goto_4
    move v2, v3

    .line 199
    :goto_5
    move v3, v4

    .line 200
    goto :goto_2

    .line 201
    :cond_4
    const-string v6, "NestMembers"

    .line 202
    .line 203
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-eqz v6, :cond_5

    .line 208
    .line 209
    move v2, v3

    .line 210
    move v3, v4

    .line 211
    move/from16 v24, v3

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    const-string v6, "PermittedSubclasses"

    .line 215
    .line 216
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_6

    .line 221
    .line 222
    move v2, v3

    .line 223
    move v3, v4

    .line 224
    move/from16 v26, v3

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_6
    const-string v6, "Signature"

    .line 228
    .line 229
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_7

    .line 234
    .line 235
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v17

    .line 239
    goto :goto_4

    .line 240
    :cond_7
    const-string v6, "RuntimeVisibleAnnotations"

    .line 241
    .line 242
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-eqz v6, :cond_8

    .line 247
    .line 248
    move v2, v3

    .line 249
    move v3, v4

    .line 250
    move v13, v3

    .line 251
    goto :goto_2

    .line 252
    :cond_8
    const-string v6, "RuntimeVisibleTypeAnnotations"

    .line 253
    .line 254
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_9

    .line 259
    .line 260
    move v2, v3

    .line 261
    move v3, v4

    .line 262
    move/from16 v22, v3

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_9
    const-string v6, "Deprecated"

    .line 266
    .line 267
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_a

    .line 272
    .line 273
    const/high16 v2, 0x20000

    .line 274
    .line 275
    or-int/2addr v2, v3

    .line 276
    goto :goto_5

    .line 277
    :cond_a
    const-string v6, "Synthetic"

    .line 278
    .line 279
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    if-eqz v6, :cond_b

    .line 284
    .line 285
    or-int/lit16 v2, v3, 0x1000

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_b
    const-string v6, "SourceDebugExtension"

    .line 289
    .line 290
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-eqz v6, :cond_d

    .line 295
    .line 296
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 297
    .line 298
    array-length v2, v2

    .line 299
    sub-int/2addr v2, v4

    .line 300
    if-gt v1, v2, :cond_c

    .line 301
    .line 302
    new-array v2, v1, [C

    .line 303
    .line 304
    invoke-direct {v0, v4, v1, v2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUtf(II[C)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    move v2, v3

    .line 309
    move v3, v4

    .line 310
    move-object/from16 v29, v9

    .line 311
    .line 312
    move-object/from16 v8, v30

    .line 313
    .line 314
    move v4, v1

    .line 315
    goto/16 :goto_3

    .line 316
    .line 317
    :cond_c
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_d
    const-string v6, "RuntimeInvisibleAnnotations"

    .line 322
    .line 323
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    if-eqz v6, :cond_e

    .line 328
    .line 329
    move v2, v3

    .line 330
    move v3, v4

    .line 331
    move/from16 v21, v3

    .line 332
    .line 333
    goto/16 :goto_2

    .line 334
    .line 335
    :cond_e
    const-string v6, "RuntimeInvisibleTypeAnnotations"

    .line 336
    .line 337
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    if-eqz v6, :cond_f

    .line 342
    .line 343
    move v2, v3

    .line 344
    move v3, v4

    .line 345
    move/from16 v23, v3

    .line 346
    .line 347
    goto/16 :goto_2

    .line 348
    .line 349
    :cond_f
    const-string v6, "Record"

    .line 350
    .line 351
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_10

    .line 356
    .line 357
    const/high16 v2, 0x10000

    .line 358
    .line 359
    or-int/2addr v2, v3

    .line 360
    move v3, v4

    .line 361
    move/from16 v28, v3

    .line 362
    .line 363
    goto/16 :goto_2

    .line 364
    .line 365
    :cond_10
    const-string v6, "Module"

    .line 366
    .line 367
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_11

    .line 372
    .line 373
    move v2, v3

    .line 374
    move v3, v4

    .line 375
    move/from16 v18, v3

    .line 376
    .line 377
    goto/16 :goto_2

    .line 378
    .line 379
    :cond_11
    const-string v6, "ModuleMainClass"

    .line 380
    .line 381
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_12

    .line 386
    .line 387
    invoke-virtual {v0, v4, v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v20

    .line 391
    goto/16 :goto_4

    .line 392
    .line 393
    :cond_12
    const-string v6, "ModulePackages"

    .line 394
    .line 395
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    if-eqz v6, :cond_13

    .line 400
    .line 401
    move v2, v3

    .line 402
    move v3, v4

    .line 403
    move/from16 v19, v3

    .line 404
    .line 405
    goto/16 :goto_2

    .line 406
    .line 407
    :cond_13
    const-string v6, "BootstrapMethods"

    .line 408
    .line 409
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    if-nez v6, :cond_14

    .line 414
    .line 415
    const/4 v6, -0x1

    .line 416
    move-object/from16 v31, v7

    .line 417
    .line 418
    const/4 v7, 0x0

    .line 419
    move-object/from16 v8, v29

    .line 420
    .line 421
    move-object/from16 v29, v9

    .line 422
    .line 423
    move-object v9, v8

    .line 424
    move-object/from16 v8, v30

    .line 425
    .line 426
    move-object/from16 v30, v10

    .line 427
    .line 428
    move-object/from16 v10, v31

    .line 429
    .line 430
    move/from16 v31, v3

    .line 431
    .line 432
    move v3, v4

    .line 433
    move v4, v1

    .line 434
    move-object/from16 v1, p2

    .line 435
    .line 436
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/ClassReader;->readAttribute([Lnet/bytebuddy/jar/asm/Attribute;Ljava/lang/String;II[CI[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Attribute;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    move-object/from16 v7, v25

    .line 441
    .line 442
    iput-object v7, v2, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 443
    .line 444
    move-object/from16 v25, v2

    .line 445
    .line 446
    :goto_6
    move-object v6, v9

    .line 447
    move-object v7, v10

    .line 448
    move/from16 v2, v31

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_14
    move-object/from16 v8, v29

    .line 452
    .line 453
    move-object/from16 v29, v9

    .line 454
    .line 455
    move-object v9, v8

    .line 456
    move/from16 v31, v3

    .line 457
    .line 458
    move v3, v4

    .line 459
    move-object/from16 v8, v30

    .line 460
    .line 461
    move v4, v1

    .line 462
    move-object/from16 v30, v10

    .line 463
    .line 464
    move-object v10, v7

    .line 465
    move-object/from16 v7, v25

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :goto_7
    add-int v1, v3, v4

    .line 469
    .line 470
    add-int/lit8 v16, v16, -0x1

    .line 471
    .line 472
    move v3, v2

    .line 473
    move-object v4, v8

    .line 474
    move-object/from16 v9, v29

    .line 475
    .line 476
    move-object/from16 v10, v30

    .line 477
    .line 478
    move/from16 v8, p3

    .line 479
    .line 480
    move v2, v1

    .line 481
    move-object/from16 v1, p2

    .line 482
    .line 483
    goto/16 :goto_1

    .line 484
    .line 485
    :cond_15
    move/from16 v31, v3

    .line 486
    .line 487
    move-object v8, v4

    .line 488
    move-object/from16 v29, v9

    .line 489
    .line 490
    move-object/from16 v30, v10

    .line 491
    .line 492
    move-object v9, v6

    .line 493
    move-object v10, v7

    .line 494
    move-object/from16 v7, v25

    .line 495
    .line 496
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 497
    .line 498
    const/4 v2, 0x1

    .line 499
    aget v1, v1, v2

    .line 500
    .line 501
    add-int/lit8 v1, v1, -0x7

    .line 502
    .line 503
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    move-object v0, v11

    .line 508
    move-object v11, v5

    .line 509
    move-object v5, v0

    .line 510
    move-object/from16 v0, p1

    .line 511
    .line 512
    move-object v6, v12

    .line 513
    move-object/from16 v4, v17

    .line 514
    .line 515
    move-object/from16 v3, v30

    .line 516
    .line 517
    move v12, v2

    .line 518
    move/from16 v2, v31

    .line 519
    .line 520
    invoke-virtual/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    and-int/lit8 v1, p3, 0x2

    .line 524
    .line 525
    if-nez v1, :cond_17

    .line 526
    .line 527
    if-nez v8, :cond_16

    .line 528
    .line 529
    if-eqz v9, :cond_17

    .line 530
    .line 531
    :cond_16
    invoke-virtual {v0, v8, v9}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    :cond_17
    move-object v1, v0

    .line 535
    if-eqz v18, :cond_18

    .line 536
    .line 537
    move/from16 v3, v18

    .line 538
    .line 539
    move/from16 v4, v19

    .line 540
    .line 541
    move-object/from16 v5, v20

    .line 542
    .line 543
    move-object/from16 v2, v29

    .line 544
    .line 545
    move-object/from16 v0, p0

    .line 546
    .line 547
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/ClassReader;->readModuleAttributes(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;IILjava/lang/String;)V

    .line 548
    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_18
    move-object/from16 v2, v29

    .line 552
    .line 553
    move-object/from16 v0, p0

    .line 554
    .line 555
    :goto_8
    if-eqz v10, :cond_19

    .line 556
    .line 557
    invoke-virtual {v1, v10}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    :cond_19
    if-eqz v15, :cond_1c

    .line 561
    .line 562
    invoke-virtual {v0, v15, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    add-int/lit8 v15, v15, 0x2

    .line 567
    .line 568
    invoke-virtual {v0, v15}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-nez v4, :cond_1a

    .line 573
    .line 574
    const/4 v5, 0x0

    .line 575
    goto :goto_9

    .line 576
    :cond_1a
    iget-object v5, v0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 577
    .line 578
    aget v5, v5, v4

    .line 579
    .line 580
    invoke-virtual {v0, v5, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    :goto_9
    if-nez v4, :cond_1b

    .line 585
    .line 586
    const/4 v4, 0x0

    .line 587
    goto :goto_a

    .line 588
    :cond_1b
    iget-object v6, v0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 589
    .line 590
    aget v4, v6, v4

    .line 591
    .line 592
    add-int/lit8 v4, v4, 0x2

    .line 593
    .line 594
    invoke-virtual {v0, v4, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    :goto_a
    invoke-virtual {v1, v3, v5, v4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    :cond_1c
    if-eqz v13, :cond_1d

    .line 602
    .line 603
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    add-int/lit8 v13, v13, 0x2

    .line 608
    .line 609
    :goto_b
    add-int/lit8 v4, v3, -0x1

    .line 610
    .line 611
    if-lez v3, :cond_1d

    .line 612
    .line 613
    invoke-virtual {v0, v13, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    add-int/lit8 v13, v13, 0x2

    .line 618
    .line 619
    invoke-virtual {v1, v3, v12}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    invoke-direct {v0, v3, v13, v12, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    move v3, v4

    .line 628
    goto :goto_b

    .line 629
    :cond_1d
    move/from16 v13, v21

    .line 630
    .line 631
    if-eqz v13, :cond_1e

    .line 632
    .line 633
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    add-int/lit8 v21, v13, 0x2

    .line 638
    .line 639
    move/from16 v4, v21

    .line 640
    .line 641
    :goto_c
    add-int/lit8 v5, v3, -0x1

    .line 642
    .line 643
    if-lez v3, :cond_1e

    .line 644
    .line 645
    invoke-virtual {v0, v4, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    add-int/lit8 v4, v4, 0x2

    .line 650
    .line 651
    const/4 v6, 0x0

    .line 652
    invoke-virtual {v1, v3, v6}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    invoke-direct {v0, v3, v4, v12, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 657
    .line 658
    .line 659
    move-result v4

    .line 660
    move v3, v5

    .line 661
    goto :goto_c

    .line 662
    :cond_1e
    move/from16 v13, v22

    .line 663
    .line 664
    if-eqz v13, :cond_1f

    .line 665
    .line 666
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    add-int/lit8 v22, v13, 0x2

    .line 671
    .line 672
    move/from16 v4, v22

    .line 673
    .line 674
    :goto_d
    add-int/lit8 v5, v3, -0x1

    .line 675
    .line 676
    if-lez v3, :cond_1f

    .line 677
    .line 678
    invoke-direct {v0, v2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    invoke-virtual {v0, v3, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    add-int/lit8 v3, v3, 0x2

    .line 687
    .line 688
    iget v6, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 689
    .line 690
    iget-object v8, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 691
    .line 692
    invoke-virtual {v1, v6, v8, v4, v12}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    invoke-direct {v0, v4, v3, v12, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    move v3, v5

    .line 701
    goto :goto_d

    .line 702
    :cond_1f
    move/from16 v13, v23

    .line 703
    .line 704
    if-eqz v13, :cond_20

    .line 705
    .line 706
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    add-int/lit8 v23, v13, 0x2

    .line 711
    .line 712
    move/from16 v4, v23

    .line 713
    .line 714
    :goto_e
    add-int/lit8 v5, v3, -0x1

    .line 715
    .line 716
    if-lez v3, :cond_20

    .line 717
    .line 718
    invoke-direct {v0, v2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readTypeAnnotationTarget(Lnet/bytebuddy/jar/asm/Context;I)I

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    invoke-virtual {v0, v3, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    add-int/lit8 v3, v3, 0x2

    .line 727
    .line 728
    iget v6, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTarget:I

    .line 729
    .line 730
    iget-object v8, v2, Lnet/bytebuddy/jar/asm/Context;->currentTypeAnnotationTargetPath:Lnet/bytebuddy/jar/asm/TypePath;

    .line 731
    .line 732
    const/4 v9, 0x0

    .line 733
    invoke-virtual {v1, v6, v8, v4, v9}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    invoke-direct {v0, v4, v3, v12, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readElementValues(Lnet/bytebuddy/jar/asm/AnnotationVisitor;IZ[C)I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    move v3, v5

    .line 742
    goto :goto_e

    .line 743
    :cond_20
    :goto_f
    if-eqz v7, :cond_21

    .line 744
    .line 745
    iget-object v3, v7, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 746
    .line 747
    const/4 v4, 0x0

    .line 748
    iput-object v4, v7, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 749
    .line 750
    invoke-virtual {v1, v7}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 751
    .line 752
    .line 753
    move-object v7, v3

    .line 754
    goto :goto_f

    .line 755
    :cond_21
    move/from16 v13, v24

    .line 756
    .line 757
    if-eqz v13, :cond_22

    .line 758
    .line 759
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    add-int/lit8 v24, v13, 0x2

    .line 764
    .line 765
    move/from16 v4, v24

    .line 766
    .line 767
    :goto_10
    add-int/lit8 v5, v3, -0x1

    .line 768
    .line 769
    if-lez v3, :cond_22

    .line 770
    .line 771
    invoke-virtual {v0, v4, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    add-int/lit8 v4, v4, 0x2

    .line 779
    .line 780
    move v3, v5

    .line 781
    goto :goto_10

    .line 782
    :cond_22
    move/from16 v13, v26

    .line 783
    .line 784
    if-eqz v13, :cond_23

    .line 785
    .line 786
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    add-int/lit8 v26, v13, 0x2

    .line 791
    .line 792
    move/from16 v4, v26

    .line 793
    .line 794
    :goto_11
    add-int/lit8 v5, v3, -0x1

    .line 795
    .line 796
    if-lez v3, :cond_23

    .line 797
    .line 798
    invoke-virtual {v0, v4, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    add-int/lit8 v4, v4, 0x2

    .line 806
    .line 807
    move v3, v5

    .line 808
    goto :goto_11

    .line 809
    :cond_23
    move/from16 v13, v27

    .line 810
    .line 811
    if-eqz v13, :cond_24

    .line 812
    .line 813
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    add-int/lit8 v27, v13, 0x2

    .line 818
    .line 819
    move/from16 v4, v27

    .line 820
    .line 821
    :goto_12
    add-int/lit8 v5, v3, -0x1

    .line 822
    .line 823
    if-lez v3, :cond_24

    .line 824
    .line 825
    invoke-virtual {v0, v4, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    add-int/lit8 v6, v4, 0x2

    .line 830
    .line 831
    invoke-virtual {v0, v6, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v6

    .line 835
    add-int/lit8 v7, v4, 0x4

    .line 836
    .line 837
    invoke-virtual {v0, v7, v11}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    add-int/lit8 v8, v4, 0x6

    .line 842
    .line 843
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 844
    .line 845
    .line 846
    move-result v8

    .line 847
    invoke-virtual {v1, v3, v6, v7, v8}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 848
    .line 849
    .line 850
    add-int/lit8 v4, v4, 0x8

    .line 851
    .line 852
    move v3, v5

    .line 853
    goto :goto_12

    .line 854
    :cond_24
    move/from16 v13, v28

    .line 855
    .line 856
    if-eqz v13, :cond_25

    .line 857
    .line 858
    invoke-virtual {v0, v13}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    add-int/lit8 v28, v13, 0x2

    .line 863
    .line 864
    move/from16 v4, v28

    .line 865
    .line 866
    :goto_13
    add-int/lit8 v5, v3, -0x1

    .line 867
    .line 868
    if-lez v3, :cond_25

    .line 869
    .line 870
    invoke-direct {v0, v1, v2, v4}, Lnet/bytebuddy/jar/asm/ClassReader;->readRecordComponent(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I

    .line 871
    .line 872
    .line 873
    move-result v4

    .line 874
    move v3, v5

    .line 875
    goto :goto_13

    .line 876
    :cond_25
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    add-int/lit8 v14, v14, 0x2

    .line 881
    .line 882
    :goto_14
    add-int/lit8 v4, v3, -0x1

    .line 883
    .line 884
    if-lez v3, :cond_26

    .line 885
    .line 886
    invoke-direct {v0, v1, v2, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readField(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I

    .line 887
    .line 888
    .line 889
    move-result v14

    .line 890
    move v3, v4

    .line 891
    goto :goto_14

    .line 892
    :cond_26
    invoke-virtual {v0, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    add-int/lit8 v14, v14, 0x2

    .line 897
    .line 898
    :goto_15
    add-int/lit8 v4, v3, -0x1

    .line 899
    .line 900
    if-lez v3, :cond_27

    .line 901
    .line 902
    invoke-direct {v0, v1, v2, v14}, Lnet/bytebuddy/jar/asm/ClassReader;->readMethod(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/jar/asm/Context;I)I

    .line 903
    .line 904
    .line 905
    move-result v14

    .line 906
    move v3, v4

    .line 907
    goto :goto_15

    .line 908
    :cond_27
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    .line 909
    .line 910
    .line 911
    return-void
.end method

.method public getAccess()I
    .locals 1

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final getFirstAttributeOffset()I
    .locals 4

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x6

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, v1, -0x1

    .line 21
    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    add-int/lit8 v1, v0, 0x6

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v0, v0, 0x8

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v3, v1, -0x1

    .line 33
    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    add-int/lit8 v1, v0, 0x2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/lit8 v1, v1, 0x6

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    move v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move v1, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    add-int/lit8 v0, v0, 0x2

    .line 54
    .line 55
    :goto_2
    add-int/lit8 v2, v1, -0x1

    .line 56
    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v1, v0, 0x6

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    add-int/lit8 v0, v0, 0x8

    .line 66
    .line 67
    :goto_3
    add-int/lit8 v3, v1, -0x1

    .line 68
    .line 69
    if-lez v1, :cond_2

    .line 70
    .line 71
    add-int/lit8 v1, v0, 0x2

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v1, v1, 0x6

    .line 78
    .line 79
    add-int/2addr v0, v1

    .line 80
    move v1, v3

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    move v1, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    add-int/lit8 v0, v0, 0x2

    .line 85
    .line 86
    return v0
.end method

.method public getInterfaces()[Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [Ljava/lang/String;

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    iget v3, p0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 14
    .line 15
    new-array v3, v3, [C

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    if-ge v4, v1, :cond_0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v2
.end method

.method public getItem(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 2
    .line 3
    aget p0, p0, p1

    .line 4
    .line 5
    return p0
.end method

.method public getItemCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public getMaxStringLength()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuperName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->header:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iget v1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->maxStringLength:I

    .line 6
    .line 7
    new-array v1, v1, [C

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public readByte(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    aget-byte p0, p0, p1

    .line 4
    .line 5
    and-int/lit16 p0, p0, 0xff

    .line 6
    .line 7
    return p0
.end method

.method public readBytecodeInstructionOffset(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public readBytes(II)[B
    .locals 2

    .line 1
    new-array v0, p2, [B

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public readClass(I[C)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readStringish(I[C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public readConst(I[C)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 6
    .line 7
    add-int/lit8 v2, v0, -0x1

    .line 8
    .line 9
    aget-byte v1, v1, v2

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    packed-switch v1, :pswitch_data_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readConstantDynamic(I[C)Lnet/bytebuddy/jar/asm/ConstantDynamic;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_1
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_2
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readByte(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    add-int/2addr v0, v2

    .line 44
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    aget p1, p1, v0

    .line 49
    .line 50
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    .line 51
    .line 52
    add-int/lit8 v3, p1, 0x2

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    aget v0, v0, v3

    .line 59
    .line 60
    move v3, v2

    .line 61
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readClass(I[C)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move v4, v3

    .line 66
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    add-int/lit8 v0, v0, 0x2

    .line 71
    .line 72
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 77
    .line 78
    sub-int/2addr p1, v4

    .line 79
    aget-byte p0, p0, p1

    .line 80
    .line 81
    const/16 p1, 0xb

    .line 82
    .line 83
    if-ne p0, p1, :cond_0

    .line 84
    .line 85
    move v5, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const/4 p0, 0x0

    .line 88
    move v5, p0

    .line 89
    :goto_0
    new-instance v0, Lnet/bytebuddy/jar/asm/Handle;

    .line 90
    .line 91
    move-object v4, p2

    .line 92
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/Handle;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_3
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_4
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUTF8(I[C)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_5
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readLong(I)J

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 115
    .line 116
    .line 117
    move-result-wide p0

    .line 118
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :pswitch_6
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readLong(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide p0

    .line 127
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :pswitch_7
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :pswitch_8
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public readInt(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x18

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x1

    .line 10
    .line 11
    aget-byte v1, p0, v1

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0xff

    .line 14
    .line 15
    shl-int/lit8 v1, v1, 0x10

    .line 16
    .line 17
    or-int/2addr v0, v1

    .line 18
    add-int/lit8 v1, p1, 0x2

    .line 19
    .line 20
    aget-byte v1, p0, v1

    .line 21
    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    shl-int/lit8 v1, v1, 0x8

    .line 25
    .line 26
    or-int/2addr v0, v1

    .line 27
    add-int/lit8 p1, p1, 0x3

    .line 28
    .line 29
    aget-byte p0, p0, p1

    .line 30
    .line 31
    and-int/lit16 p0, p0, 0xff

    .line 32
    .line 33
    or-int/2addr p0, v0

    .line 34
    return p0
.end method

.method public readLabel(I[Lnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/jar/asm/Label;
    .locals 0

    .line 1
    aget-object p0, p2, p1

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    aput-object p0, p2, p1

    .line 11
    .line 12
    :cond_0
    aget-object p0, p2, p1

    .line 13
    .line 14
    return-object p0
.end method

.method public readLong(I)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 p1, p1, 0x4

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readInt(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    int-to-long p0, p0

    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, v2

    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, v2

    .line 22
    or-long/2addr p0, v0

    .line 23
    return-wide p0
.end method

.method public readModule(I[C)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readStringish(I[C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public readPackage(I[C)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readStringish(I[C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public readShort(I)S
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    int-to-short p0, p0

    .line 17
    return p0
.end method

.method public readUTF8(I[C)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v0, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUtf(I[C)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public readUnsignedShort(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->classFileBuffer:[B

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x8

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    aget-byte p0, p0, p1

    .line 12
    .line 13
    and-int/lit16 p0, p0, 0xff

    .line 14
    .line 15
    or-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final readUtf(I[C)Ljava/lang/String;
    .locals 3

    .line 82
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassReader;->constantUtf8Values:[Ljava/lang/String;

    aget-object v1, v0, p1

    if-eqz v1, :cond_0

    return-object v1

    .line 83
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassReader;->cpInfoOffsets:[I

    aget v1, v1, p1

    add-int/lit8 v2, v1, 0x2

    .line 84
    invoke-virtual {p0, v1}, Lnet/bytebuddy/jar/asm/ClassReader;->readUnsignedShort(I)I

    move-result v1

    invoke-direct {p0, v2, v1, p2}, Lnet/bytebuddy/jar/asm/ClassReader;->readUtf(II[C)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, p1

    return-object p0
.end method
