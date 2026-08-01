.class Lnet/bytebuddy/jar/asm/Frame;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field static final APPEND_FRAME:I = 0xfc

.field private static final ARRAY_OF:I = 0x4000000

.field private static final BOOLEAN:I = 0x400009

.field private static final BYTE:I = 0x40000a

.field private static final CHAR:I = 0x40000b

.field static final CHOP_FRAME:I = 0xf8

.field private static final CONSTANT_KIND:I = 0x400000

.field private static final DIM_MASK:I = -0x4000000

.field private static final DIM_SHIFT:I = 0x1a

.field private static final DIM_SIZE:I = 0x6

.field private static final DOUBLE:I = 0x400003

.field private static final ELEMENT_OF:I = -0x4000000

.field private static final FLAGS_SHIFT:I = 0x14

.field private static final FLAGS_SIZE:I = 0x2

.field private static final FLOAT:I = 0x400002

.field private static final FORWARD_UNINITIALIZED_KIND:I = 0x1000000

.field static final FULL_FRAME:I = 0xff

.field private static final INTEGER:I = 0x400001

.field private static final ITEM_ASM_BOOLEAN:I = 0x9

.field private static final ITEM_ASM_BYTE:I = 0xa

.field private static final ITEM_ASM_CHAR:I = 0xb

.field private static final ITEM_ASM_SHORT:I = 0xc

.field static final ITEM_DOUBLE:I = 0x3

.field static final ITEM_FLOAT:I = 0x2

.field static final ITEM_INTEGER:I = 0x1

.field static final ITEM_LONG:I = 0x4

.field static final ITEM_NULL:I = 0x5

.field static final ITEM_OBJECT:I = 0x7

.field static final ITEM_TOP:I = 0x0

.field static final ITEM_UNINITIALIZED:I = 0x8

.field static final ITEM_UNINITIALIZED_THIS:I = 0x6

.field private static final KIND_MASK:I = 0x3c00000

.field private static final KIND_SHIFT:I = 0x16

.field private static final KIND_SIZE:I = 0x4

.field private static final LOCAL_KIND:I = 0x1400000

.field private static final LONG:I = 0x400004

.field private static final NULL:I = 0x400005

.field private static final REFERENCE_KIND:I = 0x800000

.field static final RESERVED:I = 0x80

.field static final SAME_FRAME:I = 0x0

.field static final SAME_FRAME_EXTENDED:I = 0xfb

.field static final SAME_LOCALS_1_STACK_ITEM_FRAME:I = 0x40

.field static final SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED:I = 0xf7

.field private static final SHORT:I = 0x40000c

.field private static final STACK_KIND:I = 0x1800000

.field private static final TOP:I = 0x400000

.field private static final TOP_IF_LONG_OR_DOUBLE_FLAG:I = 0x100000

.field private static final UNINITIALIZED_KIND:I = 0xc00000

.field private static final UNINITIALIZED_THIS:I = 0x400006

.field private static final VALUE_MASK:I = 0xfffff

.field private static final VALUE_SIZE:I = 0x14


# instance fields
.field private initializationCount:I

.field private initializations:[I

.field private inputLocals:[I

.field private inputStack:[I

.field private outputLocals:[I

.field private outputStack:[I

.field private outputStackStart:S

.field private outputStackTop:S

.field owner:Lnet/bytebuddy/jar/asm/Label;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/Frame;->owner:Lnet/bytebuddy/jar/asm/Label;

    .line 5
    .line 6
    return-void
.end method

.method private addInitializedType(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    iget v1, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 14
    .line 15
    if-lt v1, v0, :cond_1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    mul-int/lit8 v2, v0, 0x2

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-array v1, v1, [I

    .line 26
    .line 27
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 36
    .line 37
    iget v1, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 38
    .line 39
    add-int/lit8 v2, v1, 0x1

    .line 40
    .line 41
    iput v2, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 42
    .line 43
    aput p1, v0, v1

    .line 44
    .line 45
    return-void
.end method

.method public static getAbstractTypeFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/Object;)I
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 p1, 0x400000

    .line 12
    .line 13
    or-int/2addr p0, p1

    .line 14
    return p0

    .line 15
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getObjectType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, p1, v0}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    check-cast p1, Lnet/bytebuddy/jar/asm/Label;

    .line 36
    .line 37
    iget-short v0, p1, Lnet/bytebuddy/jar/asm/Label;->flags:S

    .line 38
    .line 39
    and-int/lit8 v0, v0, 0x4

    .line 40
    .line 41
    const-string v1, ""

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget p1, p1, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 46
    .line 47
    invoke-virtual {p0, v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addUninitializedType(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/high16 p1, 0xc00000

    .line 52
    .line 53
    or-int/2addr p0, p1

    .line 54
    return p0

    .line 55
    :cond_2
    const/high16 v0, 0x1000000

    .line 56
    .line 57
    invoke-virtual {p0, v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addForwardUninitializedType(Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    or-int/2addr p0, v0

    .line 62
    return p0
.end method

.method private static getAbstractTypeFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;I)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v4, 0x46

    .line 10
    .line 11
    if-eq v2, v4, :cond_c

    .line 12
    .line 13
    const/16 v6, 0x4c

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    if-eq v2, v6, :cond_b

    .line 17
    .line 18
    const v8, 0x400001

    .line 19
    .line 20
    .line 21
    const/16 v9, 0x53

    .line 22
    .line 23
    if-eq v2, v9, :cond_a

    .line 24
    .line 25
    const/16 v10, 0x56

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    if-eq v2, v10, :cond_9

    .line 29
    .line 30
    const/16 v10, 0x49

    .line 31
    .line 32
    if-eq v2, v10, :cond_a

    .line 33
    .line 34
    const v12, 0x400004

    .line 35
    .line 36
    .line 37
    const/16 v13, 0x4a

    .line 38
    .line 39
    if-eq v2, v13, :cond_8

    .line 40
    .line 41
    const/16 v14, 0x5a

    .line 42
    .line 43
    if-eq v2, v14, :cond_a

    .line 44
    .line 45
    const v15, 0x400003

    .line 46
    .line 47
    .line 48
    const v16, 0x400002

    .line 49
    .line 50
    .line 51
    const/16 v3, 0x5b

    .line 52
    .line 53
    if-eq v2, v3, :cond_0

    .line 54
    .line 55
    packed-switch v2, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Frame;->stringConcat$1(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return v11

    .line 70
    :pswitch_0
    return v15

    .line 71
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 72
    .line 73
    const/high16 v17, 0x800000

    .line 74
    .line 75
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-ne v5, v3, :cond_1

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eq v3, v4, :cond_7

    .line 89
    .line 90
    if-eq v3, v6, :cond_6

    .line 91
    .line 92
    if-eq v3, v9, :cond_5

    .line 93
    .line 94
    if-eq v3, v14, :cond_4

    .line 95
    .line 96
    if-eq v3, v10, :cond_3

    .line 97
    .line 98
    if-eq v3, v13, :cond_2

    .line 99
    .line 100
    packed-switch v3, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Frame;->stringConcat$0(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return v11

    .line 115
    :pswitch_1
    move v3, v15

    .line 116
    goto :goto_1

    .line 117
    :pswitch_2
    const v3, 0x40000b

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_3
    const v3, 0x40000a

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    move v3, v12

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move v3, v8

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const v3, 0x400009

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_5
    const v3, 0x40000c

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 138
    .line 139
    invoke-static {v7, v3, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    or-int v3, v0, v17

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move/from16 v3, v16

    .line 151
    .line 152
    :goto_1
    sub-int v2, v2, p2

    .line 153
    .line 154
    shl-int/lit8 v0, v2, 0x1a

    .line 155
    .line 156
    or-int/2addr v0, v3

    .line 157
    return v0

    .line 158
    :cond_8
    return v12

    .line 159
    :cond_9
    return v11

    .line 160
    :cond_a
    :pswitch_4
    return v8

    .line 161
    :cond_b
    const/high16 v17, 0x800000

    .line 162
    .line 163
    add-int/lit8 v2, p2, 0x1

    .line 164
    .line 165
    invoke-static {v7, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰世哲(IILjava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    or-int v0, v0, v17

    .line 174
    .line 175
    return v0

    .line 176
    :cond_c
    const v16, 0x400002

    .line 177
    .line 178
    .line 179
    return v16

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static getAbstractTypeFromInternalName(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)I
    .locals 1

    .line 1
    const/high16 v0, 0x800000

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    or-int/2addr p0, v0

    .line 8
    return p0
.end method

.method private getConcreteOutputType(II)I
    .locals 8

    .line 1
    const/high16 v0, -0x4000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/high16 v1, 0x3c00000

    .line 5
    .line 6
    and-int/2addr v1, p1

    .line 7
    const/high16 v2, 0x1400000

    .line 8
    .line 9
    const/high16 v3, 0x400000

    .line 10
    .line 11
    const v4, 0x400003

    .line 12
    .line 13
    .line 14
    const v5, 0x400004

    .line 15
    .line 16
    .line 17
    const/high16 v6, 0x100000

    .line 18
    .line 19
    const v7, 0xfffff

    .line 20
    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 25
    .line 26
    and-int p2, p1, v7

    .line 27
    .line 28
    aget p0, p0, p2

    .line 29
    .line 30
    add-int/2addr v0, p0

    .line 31
    and-int p0, p1, v6

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    if-eq v0, v5, :cond_0

    .line 36
    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    return v3

    .line 40
    :cond_1
    return v0

    .line 41
    :cond_2
    const/high16 v2, 0x1800000

    .line 42
    .line 43
    if-ne v1, v2, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 46
    .line 47
    and-int v1, p1, v7

    .line 48
    .line 49
    sub-int/2addr p2, v1

    .line 50
    aget p0, p0, p2

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    and-int p0, p1, v6

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    if-eq v0, v5, :cond_3

    .line 58
    .line 59
    if-ne v0, v4, :cond_4

    .line 60
    .line 61
    :cond_3
    return v3

    .line 62
    :cond_4
    return v0

    .line 63
    :cond_5
    return p1
.end method

.method private getInitializedType(Lnet/bytebuddy/jar/asm/SymbolTable;I)I
    .locals 8

    .line 1
    const v0, 0x400006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x400000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0xc00000

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    const/high16 v2, 0x1000000

    .line 14
    .line 15
    if-ne v1, v2, :cond_5

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 23
    .line 24
    aget v2, v2, v1

    .line 25
    .line 26
    const/high16 v3, -0x4000000

    .line 27
    .line 28
    and-int/2addr v3, v2

    .line 29
    const/high16 v4, 0x3c00000

    .line 30
    .line 31
    and-int/2addr v4, v2

    .line 32
    const v5, 0xfffff

    .line 33
    .line 34
    .line 35
    and-int v6, v2, v5

    .line 36
    .line 37
    const/high16 v7, 0x1400000

    .line 38
    .line 39
    if-ne v4, v7, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 42
    .line 43
    aget v2, v2, v6

    .line 44
    .line 45
    :goto_1
    add-int/2addr v2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/high16 v7, 0x1800000

    .line 48
    .line 49
    if-ne v4, v7, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 52
    .line 53
    array-length v4, v2

    .line 54
    sub-int/2addr v4, v6

    .line 55
    aget v2, v2, v4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 59
    .line 60
    const/high16 p0, 0x800000

    .line 61
    .line 62
    if-ne p2, v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    :goto_3
    or-int/2addr p0, p1

    .line 73
    return p0

    .line 74
    :cond_3
    and-int/2addr p2, v5

    .line 75
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->getType(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    return p2
.end method

.method private getLocal(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 2
    .line 3
    const/high16 v0, 0x1400000

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    array-length v1, p0

    .line 8
    if-lt p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget v1, p0, p1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    or-int/2addr v0, p1

    .line 16
    aput v0, p0, p1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    :goto_0
    or-int p0, p1, v0

    .line 21
    .line 22
    return p0
.end method

.method private static merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z
    .locals 11

    .line 180
    aget v0, p2, p3

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const v2, 0x3ffffff

    and-int/2addr v2, p1

    const v3, 0x400005

    if-ne v2, v3, :cond_2

    if-ne v0, v3, :cond_1

    return v1

    :cond_1
    move p1, v3

    :cond_2
    const/4 v2, 0x1

    if-nez v0, :cond_3

    .line 181
    aput p1, p2, p3

    return v2

    :cond_3
    const/high16 v4, -0x4000000

    and-int v5, v0, v4

    const/high16 v6, 0x400000

    const/high16 v7, 0x3c00000

    const/high16 v8, 0x800000

    if-nez v5, :cond_7

    and-int v9, v0, v7

    if-ne v9, v8, :cond_4

    goto :goto_1

    :cond_4
    if-ne v0, v3, :cond_e

    and-int p0, p1, v4

    if-nez p0, :cond_6

    and-int p0, p1, v7

    if-ne p0, v8, :cond_5

    goto :goto_0

    :cond_5
    move p1, v6

    :cond_6
    :goto_0
    move v6, p1

    goto :goto_3

    :cond_7
    :goto_1
    if-ne p1, v3, :cond_8

    return v1

    :cond_8
    const/high16 v3, -0x400000

    and-int v9, p1, v3

    and-int/2addr v3, v0

    .line 182
    const-string v10, "java/lang/Object"

    if-ne v9, v3, :cond_a

    and-int v3, v0, v7

    if-ne v3, v8, :cond_9

    and-int v3, p1, v4

    or-int/2addr v3, v8

    const v4, 0xfffff

    and-int/2addr p1, v4

    and-int/2addr v4, v0

    .line 183
    invoke-virtual {p0, p1, v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addMergedType(II)I

    move-result p0

    or-int v6, v3, p0

    goto :goto_3

    :cond_9
    and-int/2addr p1, v4

    add-int/2addr p1, v4

    or-int/2addr p1, v8

    .line 184
    invoke-virtual {p0, v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    move-result p0

    :goto_2
    or-int v6, p1, p0

    goto :goto_3

    :cond_a
    and-int v3, p1, v4

    if-nez v3, :cond_b

    and-int v9, p1, v7

    if-ne v9, v8, :cond_e

    :cond_b
    if-eqz v3, :cond_c

    and-int/2addr p1, v7

    if-eq p1, v8, :cond_c

    add-int/2addr v3, v4

    :cond_c
    if-eqz v5, :cond_d

    and-int p1, v0, v7

    if-eq p1, v8, :cond_d

    add-int/2addr v5, v4

    .line 185
    :cond_d
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    or-int/2addr p1, v8

    invoke-virtual {p0, v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    move-result p0

    goto :goto_2

    :cond_e
    :goto_3
    if-eq v6, v0, :cond_f

    .line 186
    aput v6, p2, p3

    return v2

    :cond_f
    return v1
.end method

.method private pop()I
    .locals 2

    .line 43
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    if-lez v0, :cond_0

    .line 44
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    add-int/lit8 v0, v0, -0x1

    int-to-short v0, v0

    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    aget p0, v1, v0

    return p0

    .line 45
    :cond_0
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    add-int/lit8 v0, v0, -0x1

    int-to-short v0, v0

    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    neg-int p0, v0

    const/high16 v0, 0x1800000

    or-int/2addr p0, v0

    return p0
.end method

.method private pop(I)V
    .locals 2

    .line 39
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    if-lt v0, p1, :cond_0

    sub-int/2addr v0, p1

    int-to-short p1, v0

    .line 40
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    return-void

    .line 41
    :cond_0
    iget-short v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    sub-int/2addr p1, v0

    sub-int/2addr v1, p1

    int-to-short p1, v1

    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    const/4 p1, 0x0

    .line 42
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    return-void
.end method

.method private pop(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x28

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x2

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    shr-int/2addr p1, v3

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 p1, 0x4a

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/16 p1, 0x44

    .line 27
    .line 28
    if-ne v0, p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-direct {p0, v2}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    invoke-direct {p0, v3}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private push(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    iget-short v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 15
    .line 16
    if-lt v1, v0, :cond_1

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    mul-int/lit8 v2, v0, 0x2

    .line 21
    .line 22
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-array v1, v1, [I

    .line 27
    .line 28
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 37
    .line 38
    iget-short v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 39
    .line 40
    add-int/lit8 v2, v1, 0x1

    .line 41
    .line 42
    int-to-short v2, v2

    .line 43
    iput-short v2, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 44
    .line 45
    aput p1, v0, v1

    .line 46
    .line 47
    iget-short p1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    .line 48
    .line 49
    add-int/2addr p1, v2

    .line 50
    int-to-short p1, p1

    .line 51
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->owner:Lnet/bytebuddy/jar/asm/Label;

    .line 52
    .line 53
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 54
    .line 55
    if-le p1, v0, :cond_2

    .line 56
    .line 57
    iput-short p1, p0, Lnet/bytebuddy/jar/asm/Label;->outputStackMax:S

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method private push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x28

    if-ne v1, v2, :cond_0

    invoke-static {p2}, Lnet/bytebuddy/jar/asm/Type;->getReturnTypeOffset(Ljava/lang/String;)I

    move-result v0

    .line 61
    :cond_0
    invoke-static {p1, p2, v0}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_2

    .line 62
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    const p2, 0x400004

    if-eq p1, p2, :cond_1

    const p2, 0x400003

    if-ne p1, p2, :cond_2

    :cond_1
    const/high16 p1, 0x400000

    .line 63
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    :cond_2
    return-void
.end method

.method public static putAbstractType(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/ByteVector;)V
    .locals 7

    .line 1
    const/high16 v0, -0x4000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    shr-int/lit8 v0, v0, 0x1a

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    const/high16 v2, 0x800000

    .line 8
    .line 9
    const/high16 v3, 0x3c00000

    .line 10
    .line 11
    const v4, 0xfffff

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    and-int v0, p1, v4

    .line 17
    .line 18
    and-int/2addr p1, v3

    .line 19
    const/high16 v3, 0x400000

    .line 20
    .line 21
    if-eq p1, v3, :cond_3

    .line 22
    .line 23
    if-eq p1, v2, :cond_2

    .line 24
    .line 25
    const/high16 v1, 0xc00000

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    if-eq p1, v1, :cond_1

    .line 30
    .line 31
    const/high16 v1, 0x1000000

    .line 32
    .line 33
    if-ne p1, v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getForwardUninitializedLabel(I)Lnet/bytebuddy/jar/asm/Label;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/Label;->put(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p2, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getType(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget-wide v0, p0, Lnet/bytebuddy/jar/asm/Symbol;->data:J

    .line 59
    .line 60
    long-to-int p0, v0

    .line 61
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getType(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iget-object p2, p2, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-virtual {p2, v0}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    :goto_0
    add-int/lit8 v6, v0, -0x1

    .line 95
    .line 96
    if-lez v0, :cond_5

    .line 97
    .line 98
    const/16 v0, 0x5b

    .line 99
    .line 100
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move v0, v6

    .line 104
    goto :goto_0

    .line 105
    :cond_5
    and-int v0, p1, v3

    .line 106
    .line 107
    if-ne v0, v2, :cond_6

    .line 108
    .line 109
    const/16 v0, 0x4c

    .line 110
    .line 111
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    and-int/2addr p1, v4

    .line 115
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getType(I)Lnet/bytebuddy/jar/asm/Symbol;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const/16 p1, 0x3b

    .line 125
    .line 126
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    and-int/2addr p1, v4

    .line 131
    const/4 v0, 0x1

    .line 132
    if-eq p1, v0, :cond_a

    .line 133
    .line 134
    const/4 v0, 0x2

    .line 135
    if-eq p1, v0, :cond_9

    .line 136
    .line 137
    const/4 v0, 0x3

    .line 138
    if-eq p1, v0, :cond_8

    .line 139
    .line 140
    const/4 v0, 0x4

    .line 141
    if-eq p1, v0, :cond_7

    .line 142
    .line 143
    packed-switch p1, :pswitch_data_0

    .line 144
    .line 145
    .line 146
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_0
    const/16 p1, 0x53

    .line 151
    .line 152
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :pswitch_1
    const/16 p1, 0x43

    .line 157
    .line 158
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :pswitch_2
    const/16 p1, 0x42

    .line 163
    .line 164
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :pswitch_3
    const/16 p1, 0x5a

    .line 169
    .line 170
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_7
    const/16 p1, 0x4a

    .line 175
    .line 176
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_8
    const/16 p1, 0x44

    .line 181
    .line 182
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_9
    const/16 p1, 0x46

    .line 187
    .line 188
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_a
    const/16 p1, 0x49

    .line 193
    .line 194
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    :goto_1
    invoke-virtual {p2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putByte(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 210
    .line 211
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setLocal(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    if-lt p1, v0, :cond_1

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x1

    .line 17
    .line 18
    mul-int/lit8 v2, v0, 0x2

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    new-array v1, v1, [I

    .line 25
    .line 26
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 33
    .line 34
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 35
    .line 36
    aput p2, p0, p1

    .line 37
    .line 38
    return-void
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Invalid descriptor fragment: "

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    const-string v0, "Invalid descriptor: "

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic stringConcat$2(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "["

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final accept(Lnet/bytebuddy/jar/asm/MethodWriter;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    array-length v5, v0

    .line 8
    const/4 v6, 0x2

    .line 9
    const v7, 0x400003

    .line 10
    .line 11
    .line 12
    const v8, 0x400004

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    if-ge v2, v5, :cond_3

    .line 17
    .line 18
    aget v5, v0, v2

    .line 19
    .line 20
    if-eq v5, v8, :cond_1

    .line 21
    .line 22
    if-ne v5, v7, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v6, v9

    .line 26
    :cond_1
    :goto_1
    add-int/2addr v2, v6

    .line 27
    const/high16 v6, 0x400000

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v5, v4

    .line 43
    :goto_2
    array-length v10, v2

    .line 44
    if-ge v4, v10, :cond_6

    .line 45
    .line 46
    aget v10, v2, v4

    .line 47
    .line 48
    if-eq v10, v8, :cond_5

    .line 49
    .line 50
    if-ne v10, v7, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v10, v9

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_3
    move v10, v6

    .line 56
    :goto_4
    add-int/2addr v4, v10

    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->owner:Lnet/bytebuddy/jar/asm/Label;

    .line 61
    .line 62
    iget p0, p0, Lnet/bytebuddy/jar/asm/Label;->bytecodeOffset:I

    .line 63
    .line 64
    invoke-virtual {p1, p0, v3, v5}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameStart(III)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    move v4, v1

    .line 69
    :goto_5
    add-int/lit8 v10, v3, -0x1

    .line 70
    .line 71
    if-lez v3, :cond_9

    .line 72
    .line 73
    aget v3, v0, v4

    .line 74
    .line 75
    if-eq v3, v8, :cond_8

    .line 76
    .line 77
    if-ne v3, v7, :cond_7

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    move v11, v9

    .line 81
    goto :goto_7

    .line 82
    :cond_8
    :goto_6
    move v11, v6

    .line 83
    :goto_7
    add-int/2addr v4, v11

    .line 84
    add-int/lit8 v11, p0, 0x1

    .line 85
    .line 86
    invoke-virtual {p1, p0, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitAbstractType(II)V

    .line 87
    .line 88
    .line 89
    move v3, v10

    .line 90
    move p0, v11

    .line 91
    goto :goto_5

    .line 92
    :cond_9
    :goto_8
    add-int/lit8 v0, v5, -0x1

    .line 93
    .line 94
    if-lez v5, :cond_c

    .line 95
    .line 96
    aget v3, v2, v1

    .line 97
    .line 98
    if-eq v3, v8, :cond_b

    .line 99
    .line 100
    if-ne v3, v7, :cond_a

    .line 101
    .line 102
    goto :goto_9

    .line 103
    :cond_a
    move v4, v9

    .line 104
    goto :goto_a

    .line 105
    :cond_b
    :goto_9
    move v4, v6

    .line 106
    :goto_a
    add-int/2addr v1, v4

    .line 107
    add-int/lit8 v4, p0, 0x1

    .line 108
    .line 109
    invoke-virtual {p1, p0, v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitAbstractType(II)V

    .line 110
    .line 111
    .line 112
    move v5, v0

    .line 113
    move p0, v4

    .line 114
    goto :goto_8

    .line 115
    :cond_c
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/MethodWriter;->visitFrameEnd()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final copyFrom(Lnet/bytebuddy/jar/asm/Frame;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 2
    .line 3
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 4
    .line 5
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 6
    .line 7
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    .line 11
    .line 12
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 13
    .line 14
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 15
    .line 16
    iget-object v0, p1, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 17
    .line 18
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 19
    .line 20
    iget-short v0, p1, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 21
    .line 22
    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 23
    .line 24
    iget v0, p1, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 25
    .line 26
    iput v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 27
    .line 28
    iget-object p1, p1, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 29
    .line 30
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 31
    .line 32
    return-void
.end method

.method public execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x400005

    .line 12
    .line 13
    .line 14
    const v6, 0x400002

    .line 15
    .line 16
    .line 17
    const v8, 0x400001

    .line 18
    .line 19
    .line 20
    const v9, 0x400003

    .line 21
    .line 22
    .line 23
    const v10, 0x400004

    .line 24
    .line 25
    .line 26
    const/high16 v11, 0x400000

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v1, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    const/high16 v13, 0x1800000

    .line 35
    .line 36
    const/high16 v14, 0x1400000

    .line 37
    .line 38
    const/high16 v15, 0x3c00000

    .line 39
    .line 40
    const/high16 v16, 0x800000

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    const/high16 v17, 0x100000

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    packed-switch v1, :pswitch_data_2

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/16 v13, 0x5b

    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x4

    .line 54
    packed-switch v1, :pswitch_data_3

    .line 55
    .line 56
    .line 57
    packed-switch v1, :pswitch_data_4

    .line 58
    .line 59
    .line 60
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_0
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_1
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ne v2, v13, :cond_0

    .line 83
    .line 84
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    or-int v1, v1, v16

    .line 93
    .line 94
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_2
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-ne v2, v13, :cond_1

    .line 108
    .line 109
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Frame;->stringConcat$2(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    const/high16 v2, 0x4800000

    .line 118
    .line 119
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    or-int/2addr v1, v2

    .line 124
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 129
    .line 130
    .line 131
    packed-switch v2, :pswitch_data_5

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_4
    const v1, 0x4400004

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_5
    const v1, 0x4400001

    .line 146
    .line 147
    .line 148
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_6
    const v1, 0x440000c

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_7
    const v1, 0x440000a

    .line 160
    .line 161
    .line 162
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_8
    const v1, 0x4400003

    .line 167
    .line 168
    .line 169
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_9
    const v1, 0x4400002

    .line 174
    .line 175
    .line 176
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_a
    const v1, 0x440000b

    .line 181
    .line 182
    .line 183
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_b
    const v1, 0x4400009

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :pswitch_c
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v4, v1, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addUninitializedType(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const/high16 v2, 0xc00000

    .line 201
    .line 202
    or-int/2addr v1, v2

    .line 203
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_d
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->pop(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_e
    iget-object v2, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 219
    .line 220
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->pop(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const/16 v2, 0xb8

    .line 224
    .line 225
    if-eq v1, v2, :cond_2

    .line 226
    .line 227
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    const/16 v5, 0xb7

    .line 232
    .line 233
    if-ne v1, v5, :cond_2

    .line 234
    .line 235
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->name:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    const/16 v5, 0x3c

    .line 242
    .line 243
    if-ne v1, v5, :cond_2

    .line 244
    .line 245
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->addInitializedType(I)V

    .line 246
    .line 247
    .line 248
    :cond_2
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :pswitch_f
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 255
    .line 256
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->pop(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_10
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 267
    .line 268
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :pswitch_11
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 273
    .line 274
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->pop(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_12
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 279
    .line 280
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_13
    const-string v0, "JSR/RET are not supported with computeFrames option"

    .line 285
    .line 286
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_14
    invoke-direct {v0, v15}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_15
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 298
    .line 299
    .line 300
    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :pswitch_16
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 305
    .line 306
    .line 307
    invoke-direct {v0, v9}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 308
    .line 309
    .line 310
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_17
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 315
    .line 316
    .line 317
    invoke-direct {v0, v6}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :pswitch_18
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 322
    .line 323
    .line 324
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 325
    .line 326
    .line 327
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :pswitch_19
    invoke-direct {v0, v2, v8}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :pswitch_1a
    invoke-direct {v0, v5}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 336
    .line 337
    .line 338
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 339
    .line 340
    .line 341
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_1b
    invoke-direct {v0, v15}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 346
    .line 347
    .line 348
    invoke-direct {v0, v9}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 349
    .line 350
    .line 351
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_1c
    invoke-direct {v0, v15}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 356
    .line 357
    .line 358
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 359
    .line 360
    .line 361
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_1d
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 374
    .line 375
    .line 376
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :pswitch_1e
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 397
    .line 398
    .line 399
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 400
    .line 401
    .line 402
    invoke-direct {v0, v4}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 403
    .line 404
    .line 405
    invoke-direct {v0, v3}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 406
    .line 407
    .line 408
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 409
    .line 410
    .line 411
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_1f
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 428
    .line 429
    .line 430
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 431
    .line 432
    .line 433
    invoke-direct {v0, v3}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 434
    .line 435
    .line 436
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 437
    .line 438
    .line 439
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :pswitch_20
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 452
    .line 453
    .line 454
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 455
    .line 456
    .line 457
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 458
    .line 459
    .line 460
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_21
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 477
    .line 478
    .line 479
    invoke-direct {v0, v3}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 480
    .line 481
    .line 482
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 483
    .line 484
    .line 485
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_22
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 498
    .line 499
    .line 500
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 501
    .line 502
    .line 503
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :pswitch_23
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 512
    .line 513
    .line 514
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :pswitch_24
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :pswitch_25
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :pswitch_26
    invoke-direct {v0, v15}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :pswitch_27
    invoke-direct {v0, v5}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_28
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 535
    .line 536
    .line 537
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    invoke-direct {v0, v2, v1}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 542
    .line 543
    .line 544
    add-int/lit8 v1, v2, 0x1

    .line 545
    .line 546
    invoke-direct {v0, v1, v11}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 547
    .line 548
    .line 549
    if-lez v2, :cond_a

    .line 550
    .line 551
    add-int/lit8 v1, v2, -0x1

    .line 552
    .line 553
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->getLocal(I)I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    if-eq v2, v10, :cond_5

    .line 558
    .line 559
    if-ne v2, v9, :cond_3

    .line 560
    .line 561
    goto :goto_0

    .line 562
    :cond_3
    and-int v3, v2, v15

    .line 563
    .line 564
    if-eq v3, v14, :cond_4

    .line 565
    .line 566
    if-ne v3, v13, :cond_a

    .line 567
    .line 568
    :cond_4
    or-int v2, v2, v17

    .line 569
    .line 570
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :cond_5
    :goto_0
    invoke-direct {v0, v1, v11}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_29
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    invoke-direct {v0, v2, v1}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 583
    .line 584
    .line 585
    if-lez v2, :cond_a

    .line 586
    .line 587
    add-int/lit8 v1, v2, -0x1

    .line 588
    .line 589
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->getLocal(I)I

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    if-eq v2, v10, :cond_8

    .line 594
    .line 595
    if-ne v2, v9, :cond_6

    .line 596
    .line 597
    goto :goto_1

    .line 598
    :cond_6
    and-int v3, v2, v15

    .line 599
    .line 600
    if-eq v3, v14, :cond_7

    .line 601
    .line 602
    if-ne v3, v13, :cond_a

    .line 603
    .line 604
    :cond_7
    or-int v2, v2, v17

    .line 605
    .line 606
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :cond_8
    :goto_1
    invoke-direct {v0, v1, v11}, Lnet/bytebuddy/jar/asm/Frame;->setLocal(II)V

    .line 611
    .line 612
    .line 613
    return-void

    .line 614
    :pswitch_2a
    invoke-direct {v0, v12}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 615
    .line 616
    .line 617
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Frame;->pop()I

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    if-ne v1, v5, :cond_9

    .line 622
    .line 623
    goto :goto_2

    .line 624
    :cond_9
    const/high16 v2, -0x4000000

    .line 625
    .line 626
    add-int/2addr v1, v2

    .line 627
    :goto_2
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :pswitch_2b
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 632
    .line 633
    .line 634
    invoke-direct {v0, v9}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 635
    .line 636
    .line 637
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_2c
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 642
    .line 643
    .line 644
    invoke-direct {v0, v6}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :pswitch_2d
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 649
    .line 650
    .line 651
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 652
    .line 653
    .line 654
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_2e
    invoke-direct {v0, v7}, Lnet/bytebuddy/jar/asm/Frame;->pop(I)V

    .line 659
    .line 660
    .line 661
    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :pswitch_2f
    invoke-direct {v0, v2}, Lnet/bytebuddy/jar/asm/Frame;->getLocal(I)I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :pswitch_30
    const/high16 v16, 0x800000

    .line 674
    .line 675
    iget v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->tag:I

    .line 676
    .line 677
    packed-switch v1, :pswitch_data_6

    .line 678
    .line 679
    .line 680
    packed-switch v1, :pswitch_data_7

    .line 681
    .line 682
    .line 683
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_31
    iget-object v1, v3, Lnet/bytebuddy/jar/asm/Symbol;->value:Ljava/lang/String;

    .line 688
    .line 689
    invoke-direct {v0, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    return-void

    .line 693
    :pswitch_32
    const-string v1, "java/lang/invoke/MethodType"

    .line 694
    .line 695
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 696
    .line 697
    .line 698
    move-result v1

    .line 699
    or-int v1, v1, v16

    .line 700
    .line 701
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 702
    .line 703
    .line 704
    return-void

    .line 705
    :pswitch_33
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 706
    .line 707
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    or-int v1, v1, v16

    .line 712
    .line 713
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_34
    const-string v1, "java/lang/String"

    .line 718
    .line 719
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    or-int v1, v1, v16

    .line 724
    .line 725
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :pswitch_35
    const-string v1, "java/lang/Class"

    .line 730
    .line 731
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    or-int v1, v1, v16

    .line 736
    .line 737
    invoke-direct {v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 738
    .line 739
    .line 740
    return-void

    .line 741
    :pswitch_36
    invoke-direct {v0, v9}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 742
    .line 743
    .line 744
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 745
    .line 746
    .line 747
    return-void

    .line 748
    :pswitch_37
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 749
    .line 750
    .line 751
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :pswitch_38
    invoke-direct {v0, v6}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_39
    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :pswitch_3a
    invoke-direct {v0, v9}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 764
    .line 765
    .line 766
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 767
    .line 768
    .line 769
    return-void

    .line 770
    :pswitch_3b
    invoke-direct {v0, v6}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :pswitch_3c
    invoke-direct {v0, v10}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 775
    .line 776
    .line 777
    invoke-direct {v0, v11}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 778
    .line 779
    .line 780
    return-void

    .line 781
    :pswitch_3d
    invoke-direct {v0, v8}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 782
    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_3e
    invoke-direct {v0, v5}, Lnet/bytebuddy/jar/asm/Frame;->push(I)V

    .line 786
    .line 787
    .line 788
    :cond_a
    :pswitch_3f
    return-void

    .line 789
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_3a
        :pswitch_3a
        :pswitch_3d
        :pswitch_3d
        :pswitch_30
    .end packed-switch

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_2f
    .end packed-switch

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    :pswitch_data_2
    .packed-switch 0x2e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2e
        :pswitch_2e
        :pswitch_29
        :pswitch_28
        :pswitch_29
        :pswitch_28
        :pswitch_29
    .end packed-switch

    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    :pswitch_data_3
    .packed-switch 0x4f
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_2e
        :pswitch_2c
        :pswitch_2b
        :pswitch_15
        :pswitch_18
        :pswitch_16
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_14
        :pswitch_2e
        :pswitch_2e
        :pswitch_14
        :pswitch_14
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_3f
        :pswitch_13
        :pswitch_13
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_3f
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_15
        :pswitch_25
        :pswitch_1
        :pswitch_15
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    :pswitch_data_4
    .packed-switch 0xc5
        :pswitch_0
        :pswitch_25
        :pswitch_25
    .end packed-switch

    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    :pswitch_data_7
    .packed-switch 0xf
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch
.end method

.method public final getInputStackSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public final merge(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/Frame;I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    iget-object v2, p2, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-array v2, v0, [I

    .line 14
    .line 15
    iput-object v2, p2, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 16
    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    move v5, v4

    .line 21
    :goto_1
    if-ge v5, v0, :cond_4

    .line 22
    .line 23
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/Frame;->outputLocals:[I

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v5, v7, :cond_2

    .line 29
    .line 30
    aget v6, v6, v5

    .line 31
    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 35
    .line 36
    aget v6, v6, v5

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-direct {p0, v6, v1}, Lnet/bytebuddy/jar/asm/Frame;->getConcreteOutputType(II)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-object v6, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 45
    .line 46
    aget v6, v6, v5

    .line 47
    .line 48
    :goto_2
    iget-object v7, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 49
    .line 50
    if-eqz v7, :cond_3

    .line 51
    .line 52
    invoke-direct {p0, p1, v6}, Lnet/bytebuddy/jar/asm/Frame;->getInitializedType(Lnet/bytebuddy/jar/asm/SymbolTable;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    :cond_3
    iget-object v7, p2, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 57
    .line 58
    invoke-static {p1, v6, v7, v5}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    or-int/2addr v2, v6

    .line 63
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    if-lez p3, :cond_7

    .line 67
    .line 68
    move v1, v4

    .line 69
    :goto_3
    if-ge v1, v0, :cond_5

    .line 70
    .line 71
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 72
    .line 73
    aget v5, v5, v1

    .line 74
    .line 75
    iget-object v6, p2, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 76
    .line 77
    invoke-static {p1, v5, v6, v1}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    or-int/2addr v2, v5

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget-object p0, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 86
    .line 87
    if-nez p0, :cond_6

    .line 88
    .line 89
    new-array p0, v3, [I

    .line 90
    .line 91
    iput-object p0, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    move v3, v2

    .line 95
    :goto_4
    iget-object p0, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 96
    .line 97
    invoke-static {p1, p3, p0, v4}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    or-int/2addr p0, v3

    .line 102
    return p0

    .line 103
    :cond_7
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 104
    .line 105
    array-length p3, p3

    .line 106
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackStart:S

    .line 107
    .line 108
    add-int/2addr p3, v0

    .line 109
    iget-object v0, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 110
    .line 111
    if-nez v0, :cond_8

    .line 112
    .line 113
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 114
    .line 115
    add-int/2addr v0, p3

    .line 116
    new-array v0, v0, [I

    .line 117
    .line 118
    iput-object v0, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_8
    move v3, v2

    .line 122
    :goto_5
    move v0, v4

    .line 123
    :goto_6
    if-ge v0, p3, :cond_a

    .line 124
    .line 125
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 126
    .line 127
    aget v2, v2, v0

    .line 128
    .line 129
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 130
    .line 131
    if-eqz v5, :cond_9

    .line 132
    .line 133
    invoke-direct {p0, p1, v2}, Lnet/bytebuddy/jar/asm/Frame;->getInitializedType(Lnet/bytebuddy/jar/asm/SymbolTable;I)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    :cond_9
    iget-object v5, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 138
    .line 139
    invoke-static {p1, v2, v5, v0}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    or-int/2addr v3, v2

    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    :goto_7
    iget-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 148
    .line 149
    if-ge v4, v0, :cond_c

    .line 150
    .line 151
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStack:[I

    .line 152
    .line 153
    aget v0, v0, v4

    .line 154
    .line 155
    invoke-direct {p0, v0, v1}, Lnet/bytebuddy/jar/asm/Frame;->getConcreteOutputType(II)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->initializations:[I

    .line 160
    .line 161
    if-eqz v2, :cond_b

    .line 162
    .line 163
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/jar/asm/Frame;->getInitializedType(Lnet/bytebuddy/jar/asm/SymbolTable;I)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    :cond_b
    iget-object v2, p2, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 168
    .line 169
    add-int v5, p3, v4

    .line 170
    .line 171
    invoke-static {p1, v0, v2, v5}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;I[II)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    or-int/2addr v3, v0

    .line 176
    add-int/lit8 v4, v4, 0x1

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_c
    return v3
.end method

.method public final setInputFrameFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/high16 v3, 0x400000

    .line 5
    .line 6
    if-ge v1, p2, :cond_2

    .line 7
    .line 8
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 9
    .line 10
    add-int/lit8 v5, v2, 0x1

    .line 11
    .line 12
    aget-object v6, p3, v1

    .line 13
    .line 14
    invoke-static {p1, v6}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    aput v6, v4, v2

    .line 19
    .line 20
    aget-object v4, p3, v1

    .line 21
    .line 22
    sget-object v6, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 23
    .line 24
    if-eq v4, v6, :cond_1

    .line 25
    .line 26
    sget-object v6, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 27
    .line 28
    if-ne v4, v6, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v2, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_1
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x2

    .line 36
    .line 37
    aput v3, v4, v5

    .line 38
    .line 39
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_3
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 43
    .line 44
    array-length p3, p2

    .line 45
    if-ge v2, p3, :cond_3

    .line 46
    .line 47
    add-int/lit8 p3, v2, 0x1

    .line 48
    .line 49
    aput v3, p2, v2

    .line 50
    .line 51
    move v2, p3

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move p2, v0

    .line 54
    move p3, p2

    .line 55
    :goto_4
    if-ge p2, p4, :cond_6

    .line 56
    .line 57
    aget-object v1, p5, p2

    .line 58
    .line 59
    sget-object v2, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 60
    .line 61
    if-eq v1, v2, :cond_4

    .line 62
    .line 63
    sget-object v2, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 64
    .line 65
    if-ne v1, v2, :cond_5

    .line 66
    .line 67
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 68
    .line 69
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_6
    add-int/2addr p3, p4

    .line 73
    new-array p2, p3, [I

    .line 74
    .line 75
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 76
    .line 77
    move p2, v0

    .line 78
    move p3, p2

    .line 79
    :goto_5
    if-ge p2, p4, :cond_9

    .line 80
    .line 81
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 82
    .line 83
    add-int/lit8 v2, p3, 0x1

    .line 84
    .line 85
    aget-object v4, p5, p2

    .line 86
    .line 87
    invoke-static {p1, v4}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromApiFormat(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    aput v4, v1, p3

    .line 92
    .line 93
    aget-object v1, p5, p2

    .line 94
    .line 95
    sget-object v4, Lnet/bytebuddy/jar/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 96
    .line 97
    if-eq v1, v4, :cond_8

    .line 98
    .line 99
    sget-object v4, Lnet/bytebuddy/jar/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

    .line 100
    .line 101
    if-ne v1, v4, :cond_7

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_7
    move p3, v2

    .line 105
    goto :goto_7

    .line 106
    :cond_8
    :goto_6
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 107
    .line 108
    add-int/lit8 p3, p3, 0x2

    .line 109
    .line 110
    aput v3, v1, v2

    .line 111
    .line 112
    :goto_7
    add-int/lit8 p2, p2, 0x1

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_9
    iput-short v0, p0, Lnet/bytebuddy/jar/asm/Frame;->outputStackTop:S

    .line 116
    .line 117
    iput v0, p0, Lnet/bytebuddy/jar/asm/Frame;->initializationCount:I

    .line 118
    .line 119
    return-void
.end method

.method public final setInputFrameFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;I)V
    .locals 8

    .line 1
    new-array v0, p4, [I

    .line 2
    .line 3
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    iput-object v2, p0, Lnet/bytebuddy/jar/asm/Frame;->inputStack:[I

    .line 9
    .line 10
    and-int/lit8 v2, p2, 0x8

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    const/high16 v2, 0x40000

    .line 15
    .line 16
    and-int/2addr p2, v2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/high16 v3, 0x800000

    .line 29
    .line 30
    or-int/2addr p2, v3

    .line 31
    aput p2, v0, v1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const p2, 0x400006

    .line 35
    .line 36
    .line 37
    aput p2, v0, v1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v2, v1

    .line 41
    :goto_0
    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lnet/bytebuddy/jar/asm/Type;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    array-length p3, p2

    .line 46
    move v0, v1

    .line 47
    :goto_1
    const/high16 v3, 0x400000

    .line 48
    .line 49
    if-ge v0, p3, :cond_4

    .line 50
    .line 51
    aget-object v4, p2, v0

    .line 52
    .line 53
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {p1, v4, v1}, Lnet/bytebuddy/jar/asm/Frame;->getAbstractTypeFromDescriptor(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iget-object v5, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 62
    .line 63
    add-int/lit8 v6, v2, 0x1

    .line 64
    .line 65
    aput v4, v5, v2

    .line 66
    .line 67
    const v7, 0x400004

    .line 68
    .line 69
    .line 70
    if-eq v4, v7, :cond_3

    .line 71
    .line 72
    const v7, 0x400003

    .line 73
    .line 74
    .line 75
    if-ne v4, v7, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move v2, v6

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x2

    .line 81
    .line 82
    aput v3, v5, v6

    .line 83
    .line 84
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    :goto_4
    if-ge v2, p4, :cond_5

    .line 88
    .line 89
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/Frame;->inputLocals:[I

    .line 90
    .line 91
    add-int/lit8 p2, v2, 0x1

    .line 92
    .line 93
    aput v3, p1, v2

    .line 94
    .line 95
    move v2, p2

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    return-void
.end method
