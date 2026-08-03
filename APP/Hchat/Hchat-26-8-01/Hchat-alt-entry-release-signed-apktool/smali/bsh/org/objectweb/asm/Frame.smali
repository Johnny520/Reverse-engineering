.class Lbsh/org/objectweb/asm/Frame;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final APPEND_FRAME:I = 0xfc

.field private static final ARRAY_OF:I = 0x10000000

.field private static final BOOLEAN:I = 0x1000009

.field private static final BYTE:I = 0x100000a

.field private static final CHAR:I = 0x100000b

.field static final CHOP_FRAME:I = 0xf8

.field private static final CONSTANT_KIND:I = 0x1000000

.field private static final DIM_MASK:I = -0x10000000

.field private static final DIM_SHIFT:I = 0x1c

.field private static final DOUBLE:I = 0x1000003

.field private static final ELEMENT_OF:I = -0x10000000

.field private static final FLAGS_MASK:I = 0xf00000

.field private static final FLOAT:I = 0x1000002

.field static final FULL_FRAME:I = 0xff

.field private static final INTEGER:I = 0x1000001

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

.field private static final KIND_MASK:I = 0xf000000

.field private static final LOCAL_KIND:I = 0x4000000

.field private static final LONG:I = 0x1000004

.field private static final NULL:I = 0x1000005

.field private static final REFERENCE_KIND:I = 0x2000000

.field static final RESERVED:I = 0x80

.field static final SAME_FRAME:I = 0x0

.field static final SAME_FRAME_EXTENDED:I = 0xfb

.field static final SAME_LOCALS_1_STACK_ITEM_FRAME:I = 0x40

.field static final SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED:I = 0xf7

.field private static final SHORT:I = 0x100000c

.field private static final STACK_KIND:I = 0x5000000

.field private static final TOP:I = 0x1000000

.field private static final TOP_IF_LONG_OR_DOUBLE_FLAG:I = 0x100000

.field private static final UNINITIALIZED_KIND:I = 0x3000000

.field private static final UNINITIALIZED_THIS:I = 0x1000006

.field private static final VALUE_MASK:I = 0xfffff


# instance fields
.field private initializationCount:I

.field private initializations:[I

.field private inputLocals:[I

.field private inputStack:[I

.field private outputLocals:[I

.field private outputStack:[I

.field private outputStackStart:S

.field private outputStackTop:S

.field owner:Lbsh/org/objectweb/asm/Label;


# direct methods
.method public constructor <init>(Lbsh/org/objectweb/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/org/objectweb/asm/Frame;->owner:Lbsh/org/objectweb/asm/Label;

    .line 5
    .line 6
    return-void
.end method

.method private addInitializedType(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

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
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    iget v1, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

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
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 36
    .line 37
    iget v1, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 38
    .line 39
    add-int/lit8 v2, v1, 0x1

    .line 40
    .line 41
    iput v2, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 42
    .line 43
    aput p1, v0, v1

    .line 44
    .line 45
    return-void
.end method

.method public static getAbstractTypeFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I
    .locals 1

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
    const/high16 p1, 0x1000000

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
    invoke-static {p1}, Lbsh/org/objectweb/asm/Type;->getObjectType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Type;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, p1, v0}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_1
    check-cast p1, Lbsh/org/objectweb/asm/Label;

    .line 36
    .line 37
    iget p1, p1, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 38
    .line 39
    const-string v0, ""

    .line 40
    .line 41
    invoke-virtual {p0, v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addUninitializedType(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    const/high16 p1, 0x3000000

    .line 46
    .line 47
    or-int/2addr p0, p1

    .line 48
    return p0
.end method

.method private static getAbstractTypeFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;I)I
    .locals 17

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
    const/high16 v5, 0x2000000

    .line 14
    .line 15
    const/16 v6, 0x4c

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-eq v2, v6, :cond_b

    .line 19
    .line 20
    const v8, 0x1000001

    .line 21
    .line 22
    .line 23
    const/16 v9, 0x53

    .line 24
    .line 25
    if-eq v2, v9, :cond_a

    .line 26
    .line 27
    const/16 v10, 0x56

    .line 28
    .line 29
    if-eq v2, v10, :cond_9

    .line 30
    .line 31
    const/16 v10, 0x49

    .line 32
    .line 33
    if-eq v2, v10, :cond_a

    .line 34
    .line 35
    const v11, 0x1000004

    .line 36
    .line 37
    .line 38
    const/16 v12, 0x4a

    .line 39
    .line 40
    if-eq v2, v12, :cond_8

    .line 41
    .line 42
    const/16 v13, 0x5a

    .line 43
    .line 44
    if-eq v2, v13, :cond_a

    .line 45
    .line 46
    const v14, 0x1000003

    .line 47
    .line 48
    .line 49
    const/16 v15, 0x5b

    .line 50
    .line 51
    if-eq v2, v15, :cond_0

    .line 52
    .line 53
    packed-switch v2, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lj8/o;->o()V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    return v0

    .line 61
    :pswitch_0
    return v14

    .line 62
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 63
    .line 64
    const v16, 0x1000002

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v3, v15, :cond_1

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eq v3, v4, :cond_7

    .line 81
    .line 82
    if-eq v3, v6, :cond_6

    .line 83
    .line 84
    if-eq v3, v9, :cond_5

    .line 85
    .line 86
    if-eq v3, v13, :cond_4

    .line 87
    .line 88
    if-eq v3, v10, :cond_3

    .line 89
    .line 90
    if-eq v3, v12, :cond_2

    .line 91
    .line 92
    packed-switch v3, :pswitch_data_1

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lj8/o;->o()V

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    return v0

    .line 100
    :pswitch_1
    move v3, v14

    .line 101
    goto :goto_1

    .line 102
    :pswitch_2
    const v3, 0x100000b

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_3
    const v3, 0x100000a

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    move v3, v11

    .line 111
    goto :goto_1

    .line 112
    :cond_3
    move v3, v8

    .line 113
    goto :goto_1

    .line 114
    :cond_4
    const v3, 0x1000009

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const v3, 0x100000c

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 123
    .line 124
    invoke-static {v7, v3, v1}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    or-int v3, v0, v5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    move/from16 v3, v16

    .line 136
    .line 137
    :goto_1
    sub-int v2, v2, p2

    .line 138
    .line 139
    shl-int/lit8 v0, v2, 0x1c

    .line 140
    .line 141
    or-int/2addr v0, v3

    .line 142
    return v0

    .line 143
    :cond_8
    return v11

    .line 144
    :cond_9
    const/4 v0, 0x0

    .line 145
    return v0

    .line 146
    :cond_a
    :pswitch_4
    return v8

    .line 147
    :cond_b
    add-int/lit8 v2, p2, 0x1

    .line 148
    .line 149
    invoke-static {v7, v2, v1}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    or-int/2addr v0, v5

    .line 158
    return v0

    .line 159
    :cond_c
    const v16, 0x1000002

    .line 160
    .line 161
    .line 162
    return v16

    .line 163
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static getAbstractTypeFromInternalName(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)I
    .locals 1

    .line 1
    const/high16 v0, 0x2000000

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    or-int/2addr p0, v0

    .line 8
    return p0
.end method

.method private getInitializedType(Lbsh/org/objectweb/asm/SymbolTable;I)I
    .locals 8

    .line 1
    const v0, 0x1000006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x1000000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0x3000000

    .line 10
    .line 11
    if-ne v1, v2, :cond_5

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_5

    .line 17
    .line 18
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 19
    .line 20
    aget v2, v2, v1

    .line 21
    .line 22
    const/high16 v3, -0x10000000

    .line 23
    .line 24
    and-int/2addr v3, v2

    .line 25
    const/high16 v4, 0xf000000

    .line 26
    .line 27
    and-int/2addr v4, v2

    .line 28
    const v5, 0xfffff

    .line 29
    .line 30
    .line 31
    and-int v6, v2, v5

    .line 32
    .line 33
    const/high16 v7, 0x4000000

    .line 34
    .line 35
    if-ne v4, v7, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 38
    .line 39
    aget v2, v2, v6

    .line 40
    .line 41
    :goto_1
    add-int/2addr v2, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/high16 v7, 0x5000000

    .line 44
    .line 45
    if-ne v4, v7, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 48
    .line 49
    array-length v4, v2

    .line 50
    sub-int/2addr v4, v6

    .line 51
    aget v2, v2, v4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 55
    .line 56
    const/high16 v1, 0x2000000

    .line 57
    .line 58
    if-ne p2, v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    :goto_3
    or-int/2addr p1, v1

    .line 69
    return p1

    .line 70
    :cond_3
    and-int/2addr p2, v5

    .line 71
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->getType(I)Lbsh/org/objectweb/asm/Symbol;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iget-object p2, p2, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    return p2
.end method

.method private getLocal(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 2
    .line 3
    const/high16 v1, 0x4000000

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    array-length v2, v0

    .line 8
    if-lt p1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget v2, v0, p1

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    or-int/2addr v1, p1

    .line 16
    aput v1, v0, p1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    return v2

    .line 20
    :cond_2
    :goto_0
    or-int/2addr p1, v1

    .line 21
    return p1
.end method

.method private static merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z
    .locals 11

    .line 294
    aget v0, p2, p3

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const v2, 0xfffffff

    and-int/2addr v2, p1

    const v3, 0x1000005

    if-ne v2, v3, :cond_2

    if-ne v0, v3, :cond_1

    return v1

    :cond_1
    move p1, v3

    :cond_2
    const/4 v2, 0x1

    if-nez v0, :cond_3

    .line 295
    aput p1, p2, p3

    return v2

    :cond_3
    const/high16 v4, -0x10000000

    and-int v5, v0, v4

    const/high16 v6, 0x1000000

    const/high16 v7, 0xf000000

    const/high16 v8, 0x2000000

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
    const/high16 v3, -0x1000000

    and-int v9, p1, v3

    and-int/2addr v3, v0

    .line 296
    const-string v10, "java/lang/Object"

    if-ne v9, v3, :cond_a

    and-int v3, v0, v7

    if-ne v3, v8, :cond_9

    and-int v3, p1, v4

    or-int/2addr v3, v8

    const v4, 0xfffff

    and-int/2addr p1, v4

    and-int/2addr v4, v0

    .line 297
    invoke-virtual {p0, p1, v4}, Lbsh/org/objectweb/asm/SymbolTable;->addMergedType(II)I

    move-result p0

    or-int v6, v3, p0

    goto :goto_3

    :cond_9
    and-int/2addr p1, v4

    add-int/2addr p1, v4

    or-int/2addr p1, v8

    .line 298
    invoke-virtual {p0, v10}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

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

    .line 299
    :cond_d
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result p1

    or-int/2addr p1, v8

    invoke-virtual {p0, v10}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    move-result p0

    goto :goto_2

    :cond_e
    :goto_3
    if-eq v6, v0, :cond_f

    .line 300
    aput v6, p2, p3

    return v2

    :cond_f
    return v1
.end method

.method private pop()I
    .locals 2

    .line 43
    iget-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    if-lez v0, :cond_0

    .line 44
    iget-object v1, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    add-int/lit8 v0, v0, -0x1

    int-to-short v0, v0

    iput-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    aget v0, v1, v0

    return v0

    .line 45
    :cond_0
    iget-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    add-int/lit8 v0, v0, -0x1

    int-to-short v0, v0

    iput-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    neg-int v0, v0

    const/high16 v1, 0x5000000

    or-int/2addr v0, v1

    return v0
.end method

.method private pop(I)V
    .locals 2

    .line 39
    iget-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    if-lt v0, p1, :cond_0

    sub-int/2addr v0, p1

    int-to-short p1, v0

    .line 40
    iput-short p1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    return-void

    .line 41
    :cond_0
    iget-short v1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    sub-int/2addr p1, v0

    sub-int/2addr v1, p1

    int-to-short p1, v1

    iput-short p1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    const/4 p1, 0x0

    .line 42
    iput-short p1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

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
    invoke-static {p1}, Lbsh/org/objectweb/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    shr-int/2addr p1, v3

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

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
    invoke-direct {p0, v2}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    invoke-direct {p0, v3}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private push(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

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
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 12
    .line 13
    array-length v0, v0

    .line 14
    iget-short v1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

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
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 37
    .line 38
    iget-short v1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 39
    .line 40
    add-int/lit8 v2, v1, 0x1

    .line 41
    .line 42
    int-to-short v2, v2

    .line 43
    iput-short v2, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 44
    .line 45
    aput p1, v0, v1

    .line 46
    .line 47
    iget-short p1, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    .line 48
    .line 49
    add-int/2addr p1, v2

    .line 50
    int-to-short p1, p1

    .line 51
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->owner:Lbsh/org/objectweb/asm/Label;

    .line 52
    .line 53
    iget-short v1, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

    .line 54
    .line 55
    if-le p1, v1, :cond_2

    .line 56
    .line 57
    iput-short p1, v0, Lbsh/org/objectweb/asm/Label;->outputStackMax:S

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method private push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x28

    if-ne v1, v2, :cond_0

    const/16 v0, 0x29

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 61
    :cond_0
    invoke-static {p1, p2, v0}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_2

    .line 62
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    const p2, 0x1000004

    if-eq p1, p2, :cond_1

    const p2, 0x1000003

    if-ne p1, p2, :cond_2

    :cond_1
    const/high16 p1, 0x1000000

    .line 63
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    :cond_2
    return-void
.end method

.method public static putAbstractType(Lbsh/org/objectweb/asm/SymbolTable;ILbsh/org/objectweb/asm/ByteVector;)V
    .locals 7

    .line 1
    const/high16 v0, -0x10000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    shr-int/lit8 v0, v0, 0x1c

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    const/high16 v2, 0x2000000

    .line 8
    .line 9
    const/high16 v3, 0xf000000

    .line 10
    .line 11
    const v4, 0xfffff

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int v0, p1, v4

    .line 17
    .line 18
    and-int/2addr p1, v3

    .line 19
    const/high16 v3, 0x1000000

    .line 20
    .line 21
    if-eq p1, v3, :cond_2

    .line 22
    .line 23
    if-eq p1, v2, :cond_1

    .line 24
    .line 25
    const/high16 v1, 0x3000000

    .line 26
    .line 27
    if-ne p1, v1, :cond_0

    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->getType(I)Lbsh/org/objectweb/asm/Symbol;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-wide v0, p0, Lbsh/org/objectweb/asm/Symbol;->data:J

    .line 40
    .line 41
    long-to-int p0, v0

    .line 42
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_1
    invoke-virtual {p2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, v0}, Lbsh/org/objectweb/asm/SymbolTable;->getType(I)Lbsh/org/objectweb/asm/Symbol;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iget-object p2, p2, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget p0, p0, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    invoke-virtual {p2, v0}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    :goto_0
    add-int/lit8 v6, v0, -0x1

    .line 82
    .line 83
    if-lez v0, :cond_4

    .line 84
    .line 85
    const/16 v0, 0x5b

    .line 86
    .line 87
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    move v0, v6

    .line 91
    goto :goto_0

    .line 92
    :cond_4
    and-int v0, p1, v3

    .line 93
    .line 94
    if-ne v0, v2, :cond_5

    .line 95
    .line 96
    const/16 v0, 0x4c

    .line 97
    .line 98
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    and-int/2addr p1, v4

    .line 102
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->getType(I)Lbsh/org/objectweb/asm/Symbol;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/16 p1, 0x3b

    .line 112
    .line 113
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    and-int/2addr p1, v4

    .line 118
    const/4 v0, 0x1

    .line 119
    if-eq p1, v0, :cond_9

    .line 120
    .line 121
    const/4 v0, 0x2

    .line 122
    if-eq p1, v0, :cond_8

    .line 123
    .line 124
    const/4 v0, 0x3

    .line 125
    if-eq p1, v0, :cond_7

    .line 126
    .line 127
    const/4 v0, 0x4

    .line 128
    if-eq p1, v0, :cond_6

    .line 129
    .line 130
    packed-switch p1, :pswitch_data_0

    .line 131
    .line 132
    .line 133
    new-instance p0, Ljava/lang/AssertionError;

    .line 134
    .line 135
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :pswitch_0
    const/16 p1, 0x53

    .line 140
    .line 141
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_1
    const/16 p1, 0x43

    .line 146
    .line 147
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_2
    const/16 p1, 0x42

    .line 152
    .line 153
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :pswitch_3
    const/16 p1, 0x5a

    .line 158
    .line 159
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_6
    const/16 p1, 0x4a

    .line 164
    .line 165
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    const/16 p1, 0x44

    .line 170
    .line 171
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_8
    const/16 p1, 0x46

    .line 176
    .line 177
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_9
    const/16 p1, 0x49

    .line 182
    .line 183
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    :goto_1
    invoke-virtual {p2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByte(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-virtual {p0, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    iget p0, p0, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 199
    .line 200
    invoke-virtual {p1, p0}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    nop

    .line 205
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
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

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
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

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
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 35
    .line 36
    aput p2, v0, p1

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final accept(Lbsh/org/objectweb/asm/MethodWriter;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

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
    const v7, 0x1000003

    .line 10
    .line 11
    .line 12
    const v8, 0x1000004

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
    const/high16 v6, 0x1000000

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
    iget-object v2, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

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
    iget-object v4, p0, Lbsh/org/objectweb/asm/Frame;->owner:Lbsh/org/objectweb/asm/Label;

    .line 61
    .line 62
    iget v4, v4, Lbsh/org/objectweb/asm/Label;->bytecodeOffset:I

    .line 63
    .line 64
    invoke-virtual {p1, v4, v3, v5}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameStart(III)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    move v10, v1

    .line 69
    :goto_5
    add-int/lit8 v11, v3, -0x1

    .line 70
    .line 71
    if-lez v3, :cond_9

    .line 72
    .line 73
    aget v3, v0, v10

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
    move v12, v9

    .line 81
    goto :goto_7

    .line 82
    :cond_8
    :goto_6
    move v12, v6

    .line 83
    :goto_7
    add-int/2addr v10, v12

    .line 84
    add-int/lit8 v12, v4, 0x1

    .line 85
    .line 86
    invoke-virtual {p1, v4, v3}, Lbsh/org/objectweb/asm/MethodWriter;->visitAbstractType(II)V

    .line 87
    .line 88
    .line 89
    move v3, v11

    .line 90
    move v4, v12

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
    move v5, v9

    .line 104
    goto :goto_a

    .line 105
    :cond_b
    :goto_9
    move v5, v6

    .line 106
    :goto_a
    add-int/2addr v1, v5

    .line 107
    add-int/lit8 v5, v4, 0x1

    .line 108
    .line 109
    invoke-virtual {p1, v4, v3}, Lbsh/org/objectweb/asm/MethodWriter;->visitAbstractType(II)V

    .line 110
    .line 111
    .line 112
    move v4, v5

    .line 113
    move v5, v0

    .line 114
    goto :goto_8

    .line 115
    :cond_c
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/MethodWriter;->visitFrameEnd()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final copyFrom(Lbsh/org/objectweb/asm/Frame;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 2
    .line 3
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 4
    .line 5
    iget-object v0, p1, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    .line 11
    .line 12
    iget-object v0, p1, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 13
    .line 14
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 15
    .line 16
    iget-object v0, p1, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 17
    .line 18
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 19
    .line 20
    iget-short v0, p1, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 21
    .line 22
    iput-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 23
    .line 24
    iget v0, p1, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 25
    .line 26
    iput v0, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 27
    .line 28
    iget-object p1, p1, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 29
    .line 30
    iput-object p1, p0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 31
    .line 32
    return-void
.end method

.method public execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V
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
    const v5, 0x1000005

    .line 12
    .line 13
    .line 14
    const v6, 0x1000002

    .line 15
    .line 16
    .line 17
    const v8, 0x1000001

    .line 18
    .line 19
    .line 20
    const v9, 0x1000003

    .line 21
    .line 22
    .line 23
    const v10, 0x1000004

    .line 24
    .line 25
    .line 26
    const/high16 v11, 0x1000000

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
    const/high16 v13, 0x5000000

    .line 35
    .line 36
    const/high16 v14, 0x4000000

    .line 37
    .line 38
    const/high16 v15, 0xf000000

    .line 39
    .line 40
    const/high16 v16, 0x2000000

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
    invoke-static {}, Lj8/o;->o()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_0
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_1
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

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
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    or-int v1, v1, v16

    .line 93
    .line 94
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_2
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 99
    .line 100
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

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
    const-string v2, "["

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_1
    const/high16 v2, 0x12000000

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    or-int/2addr v1, v2

    .line 126
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_3
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 131
    .line 132
    .line 133
    packed-switch v2, :pswitch_data_5

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lj8/o;->o()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :pswitch_4
    const v1, 0x11000004

    .line 141
    .line 142
    .line 143
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_5
    const v1, 0x11000001

    .line 148
    .line 149
    .line 150
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_6
    const v1, 0x1100000c

    .line 155
    .line 156
    .line 157
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_7
    const v1, 0x1100000a

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_8
    const v1, 0x11000003

    .line 169
    .line 170
    .line 171
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_9
    const v1, 0x11000002

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_a
    const v1, 0x1100000b

    .line 183
    .line 184
    .line 185
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_b
    const v1, 0x11000009

    .line 190
    .line 191
    .line 192
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_c
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v4, v1, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addUninitializedType(Ljava/lang/String;I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const/high16 v2, 0x3000000

    .line 203
    .line 204
    or-int/2addr v1, v2

    .line 205
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :pswitch_d
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 210
    .line 211
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->pop(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 215
    .line 216
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_e
    iget-object v2, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 221
    .line 222
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->pop(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/16 v2, 0xb8

    .line 226
    .line 227
    if-eq v1, v2, :cond_2

    .line 228
    .line 229
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    const/16 v5, 0xb7

    .line 234
    .line 235
    if-ne v1, v5, :cond_2

    .line 236
    .line 237
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->name:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    const/16 v5, 0x3c

    .line 244
    .line 245
    if-ne v1, v5, :cond_2

    .line 246
    .line 247
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->addInitializedType(I)V

    .line 248
    .line 249
    .line 250
    :cond_2
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 251
    .line 252
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_f
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 257
    .line 258
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->pop(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_10
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 266
    .line 267
    .line 268
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 269
    .line 270
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :pswitch_11
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 275
    .line 276
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->pop(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_12
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 281
    .line 282
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :pswitch_13
    const-string v1, "JSR/RET are not supported with computeFrames option"

    .line 287
    .line 288
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :pswitch_14
    invoke-direct {v0, v15}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v0, v8}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_15
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v0, v8}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :pswitch_16
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 307
    .line 308
    .line 309
    invoke-direct {v0, v9}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :pswitch_17
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v0, v6}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_18
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 327
    .line 328
    .line 329
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_19
    invoke-direct {v0, v2, v8}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_1a
    invoke-direct {v0, v5}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 338
    .line 339
    .line 340
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_1b
    invoke-direct {v0, v15}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 348
    .line 349
    .line 350
    invoke-direct {v0, v9}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 351
    .line 352
    .line 353
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :pswitch_1c
    invoke-direct {v0, v15}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 361
    .line 362
    .line 363
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :pswitch_1d
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 376
    .line 377
    .line 378
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :pswitch_1e
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 402
    .line 403
    .line 404
    invoke-direct {v0, v4}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 405
    .line 406
    .line 407
    invoke-direct {v0, v3}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 408
    .line 409
    .line 410
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 411
    .line 412
    .line 413
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_1f
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 433
    .line 434
    .line 435
    invoke-direct {v0, v3}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 436
    .line 437
    .line 438
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 439
    .line 440
    .line 441
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :pswitch_20
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 454
    .line 455
    .line 456
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 457
    .line 458
    .line 459
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 460
    .line 461
    .line 462
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_21
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 479
    .line 480
    .line 481
    invoke-direct {v0, v3}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 482
    .line 483
    .line 484
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 485
    .line 486
    .line 487
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :pswitch_22
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 500
    .line 501
    .line 502
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 503
    .line 504
    .line 505
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_23
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 514
    .line 515
    .line 516
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_24
    invoke-direct {v0, v7}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :pswitch_25
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :pswitch_26
    invoke-direct {v0, v15}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :pswitch_27
    invoke-direct {v0, v5}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :pswitch_28
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    invoke-direct {v0, v2, v1}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 544
    .line 545
    .line 546
    add-int/lit8 v1, v2, 0x1

    .line 547
    .line 548
    invoke-direct {v0, v1, v11}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 549
    .line 550
    .line 551
    if-lez v2, :cond_a

    .line 552
    .line 553
    add-int/lit8 v1, v2, -0x1

    .line 554
    .line 555
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->getLocal(I)I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    if-eq v2, v10, :cond_5

    .line 560
    .line 561
    if-ne v2, v9, :cond_3

    .line 562
    .line 563
    goto :goto_0

    .line 564
    :cond_3
    and-int v3, v2, v15

    .line 565
    .line 566
    if-eq v3, v14, :cond_4

    .line 567
    .line 568
    if-ne v3, v13, :cond_a

    .line 569
    .line 570
    :cond_4
    or-int v2, v2, v17

    .line 571
    .line 572
    invoke-direct {v0, v1, v2}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :cond_5
    :goto_0
    invoke-direct {v0, v1, v11}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    :pswitch_29
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    invoke-direct {v0, v2, v1}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 585
    .line 586
    .line 587
    if-lez v2, :cond_a

    .line 588
    .line 589
    add-int/lit8 v1, v2, -0x1

    .line 590
    .line 591
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->getLocal(I)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-eq v2, v10, :cond_8

    .line 596
    .line 597
    if-ne v2, v9, :cond_6

    .line 598
    .line 599
    goto :goto_1

    .line 600
    :cond_6
    and-int v3, v2, v15

    .line 601
    .line 602
    if-eq v3, v14, :cond_7

    .line 603
    .line 604
    if-ne v3, v13, :cond_a

    .line 605
    .line 606
    :cond_7
    or-int v2, v2, v17

    .line 607
    .line 608
    invoke-direct {v0, v1, v2}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :cond_8
    :goto_1
    invoke-direct {v0, v1, v11}, Lbsh/org/objectweb/asm/Frame;->setLocal(II)V

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :pswitch_2a
    invoke-direct {v0, v12}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 617
    .line 618
    .line 619
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Frame;->pop()I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-ne v1, v5, :cond_9

    .line 624
    .line 625
    goto :goto_2

    .line 626
    :cond_9
    const/high16 v2, -0x10000000

    .line 627
    .line 628
    add-int/2addr v1, v2

    .line 629
    :goto_2
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :pswitch_2b
    invoke-direct {v0, v7}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 634
    .line 635
    .line 636
    invoke-direct {v0, v9}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 637
    .line 638
    .line 639
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_2c
    invoke-direct {v0, v7}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 644
    .line 645
    .line 646
    invoke-direct {v0, v6}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :pswitch_2d
    invoke-direct {v0, v7}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 651
    .line 652
    .line 653
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 654
    .line 655
    .line 656
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 657
    .line 658
    .line 659
    return-void

    .line 660
    :pswitch_2e
    invoke-direct {v0, v7}, Lbsh/org/objectweb/asm/Frame;->pop(I)V

    .line 661
    .line 662
    .line 663
    invoke-direct {v0, v8}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :pswitch_2f
    invoke-direct {v0, v2}, Lbsh/org/objectweb/asm/Frame;->getLocal(I)I

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :pswitch_30
    const/high16 v16, 0x2000000

    .line 676
    .line 677
    iget v1, v3, Lbsh/org/objectweb/asm/Symbol;->tag:I

    .line 678
    .line 679
    packed-switch v1, :pswitch_data_6

    .line 680
    .line 681
    .line 682
    packed-switch v1, :pswitch_data_7

    .line 683
    .line 684
    .line 685
    new-instance v1, Ljava/lang/AssertionError;

    .line 686
    .line 687
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 688
    .line 689
    .line 690
    throw v1

    .line 691
    :pswitch_31
    iget-object v1, v3, Lbsh/org/objectweb/asm/Symbol;->value:Ljava/lang/String;

    .line 692
    .line 693
    invoke-direct {v0, v4, v1}, Lbsh/org/objectweb/asm/Frame;->push(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    return-void

    .line 697
    :pswitch_32
    const-string v1, "java/lang/invoke/MethodType"

    .line 698
    .line 699
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    or-int v1, v1, v16

    .line 704
    .line 705
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_33
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 710
    .line 711
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    or-int v1, v1, v16

    .line 716
    .line 717
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 718
    .line 719
    .line 720
    return-void

    .line 721
    :pswitch_34
    const-string v1, "java/lang/String"

    .line 722
    .line 723
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    or-int v1, v1, v16

    .line 728
    .line 729
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :pswitch_35
    const-string v1, "java/lang/Class"

    .line 734
    .line 735
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    or-int v1, v1, v16

    .line 740
    .line 741
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 742
    .line 743
    .line 744
    return-void

    .line 745
    :pswitch_36
    invoke-direct {v0, v9}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 746
    .line 747
    .line 748
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 749
    .line 750
    .line 751
    return-void

    .line 752
    :pswitch_37
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 753
    .line 754
    .line 755
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_38
    invoke-direct {v0, v6}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :pswitch_39
    invoke-direct {v0, v8}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 764
    .line 765
    .line 766
    return-void

    .line 767
    :pswitch_3a
    invoke-direct {v0, v9}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 768
    .line 769
    .line 770
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :pswitch_3b
    invoke-direct {v0, v6}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 775
    .line 776
    .line 777
    return-void

    .line 778
    :pswitch_3c
    invoke-direct {v0, v10}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 779
    .line 780
    .line 781
    invoke-direct {v0, v11}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 782
    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_3d
    invoke-direct {v0, v8}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 786
    .line 787
    .line 788
    return-void

    .line 789
    :pswitch_3e
    invoke-direct {v0, v5}, Lbsh/org/objectweb/asm/Frame;->push(I)V

    .line 790
    .line 791
    .line 792
    :cond_a
    :pswitch_3f
    return-void

    .line 793
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
    .line 832
    .line 833
    .line 834
    .line 835
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_2f
    .end packed-switch

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
    .line 846
    .line 847
    .line 848
    .line 849
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
    .line 876
    .line 877
    .line 878
    .line 879
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
    :pswitch_data_4
    .packed-switch 0xc5
        :pswitch_0
        :pswitch_25
        :pswitch_25
    .end packed-switch

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

    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0xf
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch
.end method

.method public final getInputStackSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final merge(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/Frame;I)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 10
    .line 11
    array-length v4, v4

    .line 12
    iget-object v5, v0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 13
    .line 14
    array-length v5, v5

    .line 15
    iget-object v6, v2, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    new-array v6, v4, [I

    .line 21
    .line 22
    iput-object v6, v2, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 23
    .line 24
    move v6, v7

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v6, 0x0

    .line 27
    :goto_0
    const/4 v9, 0x0

    .line 28
    :goto_1
    const/high16 v10, 0x5000000

    .line 29
    .line 30
    const/high16 v11, 0x4000000

    .line 31
    .line 32
    const v15, 0x1000003

    .line 33
    .line 34
    .line 35
    const/high16 v16, 0xf000000

    .line 36
    .line 37
    const v12, 0x1000004

    .line 38
    .line 39
    .line 40
    const/high16 v17, 0x100000

    .line 41
    .line 42
    const v18, 0xfffff

    .line 43
    .line 44
    .line 45
    if-ge v9, v4, :cond_8

    .line 46
    .line 47
    const/high16 v19, -0x10000000

    .line 48
    .line 49
    iget-object v13, v0, Lbsh/org/objectweb/asm/Frame;->outputLocals:[I

    .line 50
    .line 51
    if-eqz v13, :cond_5

    .line 52
    .line 53
    array-length v14, v13

    .line 54
    if-ge v9, v14, :cond_5

    .line 55
    .line 56
    aget v13, v13, v9

    .line 57
    .line 58
    if-nez v13, :cond_1

    .line 59
    .line 60
    iget-object v10, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 61
    .line 62
    aget v14, v10, v9

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_1
    and-int v14, v13, v19

    .line 66
    .line 67
    and-int v8, v13, v16

    .line 68
    .line 69
    if-ne v8, v11, :cond_3

    .line 70
    .line 71
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 72
    .line 73
    and-int v10, v13, v18

    .line 74
    .line 75
    aget v8, v8, v10

    .line 76
    .line 77
    add-int/2addr v14, v8

    .line 78
    and-int v8, v13, v17

    .line 79
    .line 80
    if-eqz v8, :cond_6

    .line 81
    .line 82
    if-eq v14, v12, :cond_2

    .line 83
    .line 84
    if-ne v14, v15, :cond_6

    .line 85
    .line 86
    :cond_2
    :goto_2
    const/high16 v14, 0x1000000

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    if-ne v8, v10, :cond_4

    .line 90
    .line 91
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 92
    .line 93
    and-int v10, v13, v18

    .line 94
    .line 95
    sub-int v10, v5, v10

    .line 96
    .line 97
    aget v8, v8, v10

    .line 98
    .line 99
    add-int/2addr v14, v8

    .line 100
    and-int v8, v13, v17

    .line 101
    .line 102
    if-eqz v8, :cond_6

    .line 103
    .line 104
    if-eq v14, v12, :cond_2

    .line 105
    .line 106
    if-ne v14, v15, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move v14, v13

    .line 110
    goto :goto_3

    .line 111
    :cond_5
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 112
    .line 113
    aget v14, v8, v9

    .line 114
    .line 115
    :cond_6
    :goto_3
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 116
    .line 117
    if-eqz v8, :cond_7

    .line 118
    .line 119
    invoke-direct {v0, v1, v14}, Lbsh/org/objectweb/asm/Frame;->getInitializedType(Lbsh/org/objectweb/asm/SymbolTable;I)I

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    :cond_7
    iget-object v8, v2, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 124
    .line 125
    invoke-static {v1, v14, v8, v9}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    or-int/2addr v6, v8

    .line 130
    add-int/lit8 v9, v9, 0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_8
    const/high16 v19, -0x10000000

    .line 134
    .line 135
    if-lez v3, :cond_b

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    :goto_4
    if-ge v5, v4, :cond_9

    .line 139
    .line 140
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 141
    .line 142
    aget v8, v8, v5

    .line 143
    .line 144
    iget-object v9, v2, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 145
    .line 146
    invoke-static {v1, v8, v9, v5}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    or-int/2addr v6, v8

    .line 151
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_9
    iget-object v4, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 155
    .line 156
    if-nez v4, :cond_a

    .line 157
    .line 158
    new-array v4, v7, [I

    .line 159
    .line 160
    iput-object v4, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    move v7, v6

    .line 164
    :goto_5
    iget-object v2, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-static {v1, v3, v2, v4}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    or-int/2addr v1, v7

    .line 172
    return v1

    .line 173
    :cond_b
    const/4 v4, 0x0

    .line 174
    iget-object v3, v0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 175
    .line 176
    array-length v3, v3

    .line 177
    iget-short v8, v0, Lbsh/org/objectweb/asm/Frame;->outputStackStart:S

    .line 178
    .line 179
    add-int/2addr v3, v8

    .line 180
    iget-object v8, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 181
    .line 182
    if-nez v8, :cond_c

    .line 183
    .line 184
    iget-short v6, v0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 185
    .line 186
    add-int/2addr v6, v3

    .line 187
    new-array v6, v6, [I

    .line 188
    .line 189
    iput-object v6, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_c
    move v7, v6

    .line 193
    :goto_6
    move v6, v4

    .line 194
    :goto_7
    if-ge v6, v3, :cond_e

    .line 195
    .line 196
    iget-object v8, v0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 197
    .line 198
    aget v8, v8, v6

    .line 199
    .line 200
    iget-object v9, v0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 201
    .line 202
    if-eqz v9, :cond_d

    .line 203
    .line 204
    invoke-direct {v0, v1, v8}, Lbsh/org/objectweb/asm/Frame;->getInitializedType(Lbsh/org/objectweb/asm/SymbolTable;I)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    :cond_d
    iget-object v9, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 209
    .line 210
    invoke-static {v1, v8, v9, v6}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    or-int/2addr v7, v8

    .line 215
    add-int/lit8 v6, v6, 0x1

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_e
    move v8, v4

    .line 219
    :goto_8
    iget-short v4, v0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 220
    .line 221
    if-ge v8, v4, :cond_14

    .line 222
    .line 223
    iget-object v4, v0, Lbsh/org/objectweb/asm/Frame;->outputStack:[I

    .line 224
    .line 225
    aget v4, v4, v8

    .line 226
    .line 227
    and-int v6, v4, v19

    .line 228
    .line 229
    and-int v9, v4, v16

    .line 230
    .line 231
    if-ne v9, v11, :cond_11

    .line 232
    .line 233
    iget-object v9, v0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 234
    .line 235
    and-int v13, v4, v18

    .line 236
    .line 237
    aget v9, v9, v13

    .line 238
    .line 239
    add-int/2addr v6, v9

    .line 240
    and-int v4, v4, v17

    .line 241
    .line 242
    if-eqz v4, :cond_10

    .line 243
    .line 244
    if-eq v6, v12, :cond_f

    .line 245
    .line 246
    if-ne v6, v15, :cond_10

    .line 247
    .line 248
    :cond_f
    :goto_9
    const/high16 v4, 0x1000000

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_10
    move v4, v6

    .line 252
    goto :goto_a

    .line 253
    :cond_11
    if-ne v9, v10, :cond_12

    .line 254
    .line 255
    iget-object v9, v0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 256
    .line 257
    and-int v13, v4, v18

    .line 258
    .line 259
    sub-int v13, v5, v13

    .line 260
    .line 261
    aget v9, v9, v13

    .line 262
    .line 263
    add-int/2addr v6, v9

    .line 264
    and-int v4, v4, v17

    .line 265
    .line 266
    if-eqz v4, :cond_10

    .line 267
    .line 268
    if-eq v6, v12, :cond_f

    .line 269
    .line 270
    if-ne v6, v15, :cond_10

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_12
    :goto_a
    iget-object v6, v0, Lbsh/org/objectweb/asm/Frame;->initializations:[I

    .line 274
    .line 275
    if-eqz v6, :cond_13

    .line 276
    .line 277
    invoke-direct {v0, v1, v4}, Lbsh/org/objectweb/asm/Frame;->getInitializedType(Lbsh/org/objectweb/asm/SymbolTable;I)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    :cond_13
    iget-object v6, v2, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 282
    .line 283
    add-int v9, v3, v8

    .line 284
    .line 285
    invoke-static {v1, v4, v6, v9}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;I[II)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    or-int/2addr v7, v4

    .line 290
    add-int/lit8 v8, v8, 0x1

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_14
    return v7
.end method

.method public final setInputFrameFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;I[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/high16 v3, 0x1000000

    .line 5
    .line 6
    if-ge v1, p2, :cond_2

    .line 7
    .line 8
    iget-object v4, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 9
    .line 10
    add-int/lit8 v5, v2, 0x1

    .line 11
    .line 12
    aget-object v6, p3, v1

    .line 13
    .line 14
    invoke-static {p1, v6}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I

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
    sget-object v6, Lbsh/org/objectweb/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 23
    .line 24
    if-eq v4, v6, :cond_1

    .line 25
    .line 26
    sget-object v6, Lbsh/org/objectweb/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

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
    iget-object v4, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

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
    iget-object p2, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

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
    sget-object v2, Lbsh/org/objectweb/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 60
    .line 61
    if-eq v1, v2, :cond_4

    .line 62
    .line 63
    sget-object v2, Lbsh/org/objectweb/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

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
    iput-object p2, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

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
    iget-object v1, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

    .line 82
    .line 83
    add-int/lit8 v2, p3, 0x1

    .line 84
    .line 85
    aget-object v4, p5, p2

    .line 86
    .line 87
    invoke-static {p1, v4}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromApiFormat(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/Object;)I

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
    sget-object v4, Lbsh/org/objectweb/asm/Opcodes;->LONG:Ljava/lang/Integer;

    .line 96
    .line 97
    if-eq v1, v4, :cond_8

    .line 98
    .line 99
    sget-object v4, Lbsh/org/objectweb/asm/Opcodes;->DOUBLE:Ljava/lang/Integer;

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
    iget-object v1, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

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
    iput-short v0, p0, Lbsh/org/objectweb/asm/Frame;->outputStackTop:S

    .line 116
    .line 117
    iput v0, p0, Lbsh/org/objectweb/asm/Frame;->initializationCount:I

    .line 118
    .line 119
    return-void
.end method

.method public final setInputFrameFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;I)V
    .locals 8

    .line 1
    new-array v0, p4, [I

    .line 2
    .line 3
    iput-object v0, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    iput-object v2, p0, Lbsh/org/objectweb/asm/Frame;->inputStack:[I

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
    invoke-virtual {p1}, Lbsh/org/objectweb/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addType(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/high16 v3, 0x2000000

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
    const p2, 0x1000006

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
    invoke-static {p3}, Lbsh/org/objectweb/asm/Type;->getArgumentTypes(Ljava/lang/String;)[Lbsh/org/objectweb/asm/Type;

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
    const/high16 v3, 0x1000000

    .line 48
    .line 49
    if-ge v0, p3, :cond_4

    .line 50
    .line 51
    aget-object v4, p2, v0

    .line 52
    .line 53
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/Type;->getDescriptor()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {p1, v4, v1}, Lbsh/org/objectweb/asm/Frame;->getAbstractTypeFromDescriptor(Lbsh/org/objectweb/asm/SymbolTable;Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iget-object v5, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

    .line 62
    .line 63
    add-int/lit8 v6, v2, 0x1

    .line 64
    .line 65
    aput v4, v5, v2

    .line 66
    .line 67
    const v7, 0x1000004

    .line 68
    .line 69
    .line 70
    if-eq v4, v7, :cond_3

    .line 71
    .line 72
    const v7, 0x1000003

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
    iget-object p1, p0, Lbsh/org/objectweb/asm/Frame;->inputLocals:[I

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
