.class final Lcom/esotericsoftware/asm/Frame;
.super Ljava/lang/Object;


# static fields
.field static final a:[I


# instance fields
.field b:Lcom/esotericsoftware/asm/Label;

.field c:[I

.field d:[I

.field private e:[I

.field private f:[I

.field private g:I

.field private h:I

.field private i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/esotericsoftware/asm/Frame;->_clinit_()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xca

    .line 5
    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    const-string v3, "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE"

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/lit8 v3, v3, -0x45

    .line 18
    .line 19
    aput v3, v1, v2

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sput-object v1, Lcom/esotericsoftware/asm/Frame;->a:[I

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic _clinit_()V
    .locals 0

    .line 1
    return-void
.end method

.method private a()I
    .locals 2

    .line 784
    iget v0, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    aget p0, v1, v0

    return p0

    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    iget v0, p0, Lcom/esotericsoftware/asm/Label;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/esotericsoftware/asm/Label;->f:I

    neg-int p0, v0

    const/high16 v0, 0x3000000

    or-int/2addr p0, v0

    return p0
.end method

.method private a(I)I
    .locals 2

    .line 781
    iget-object p0, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    const/high16 v0, 0x2000000

    if-eqz p0, :cond_2

    array-length v1, p0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    aget v1, p0, p1

    if-nez v1, :cond_1

    or-int/2addr v0, p1

    aput v0, p0, p1

    return v0

    :cond_1
    return v1

    :cond_2
    :goto_0
    or-int p0, p1, v0

    return p0
.end method

.method private a(Lcom/esotericsoftware/asm/ClassWriter;I)I
    .locals 6

    .line 782
    const v0, 0x1000006

    const/high16 v1, 0x1700000

    if-ne p2, v0, :cond_0

    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->I:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    move-result p1

    or-int/2addr p1, v1

    goto :goto_1

    :cond_0
    const/high16 v0, -0x100000

    and-int/2addr v0, p2

    const/high16 v2, 0x1800000

    if-ne v0, v2, :cond_4

    iget-object v0, p1, Lcom/esotericsoftware/asm/ClassWriter;->H:[Lcom/esotericsoftware/asm/Item;

    const v2, 0xfffff

    and-int/2addr v2, p2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    goto :goto_0

    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget v1, p0, Lcom/esotericsoftware/asm/Frame;->h:I

    if-ge v0, v1, :cond_4

    iget-object v1, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    aget v1, v1, v0

    const/high16 v2, -0x10000000

    and-int/2addr v2, v1

    const/high16 v3, 0xf000000

    and-int/2addr v3, v1

    const/high16 v4, 0x2000000

    const v5, 0x7fffff

    if-ne v3, v4, :cond_1

    iget-object v3, p0, Lcom/esotericsoftware/asm/Frame;->c:[I

    and-int/2addr v1, v5

    aget v1, v3, v1

    :goto_3
    add-int/2addr v1, v2

    goto :goto_4

    :cond_1
    const/high16 v4, 0x3000000

    if-ne v3, v4, :cond_2

    iget-object v3, p0, Lcom/esotericsoftware/asm/Frame;->d:[I

    array-length v4, v3

    and-int/2addr v1, v5

    sub-int/2addr v4, v1

    aget v1, v3, v4

    goto :goto_3

    :cond_2
    :goto_4
    if-ne p2, v1, :cond_3

    return p1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return p2
.end method

.method private a(II)V
    .locals 4

    .line 783
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    if-nez v0, :cond_0

    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    array-length v0, v0

    if-lt p1, v0, :cond_1

    add-int/lit8 v1, p1, 0x1

    mul-int/lit8 v2, v0, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [I

    iget-object v2, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    :cond_1
    iget-object p0, p0, Lcom/esotericsoftware/asm/Frame;->e:[I

    aput p2, p0, p1

    return-void
.end method

.method private a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V
    .locals 0

    .line 786
    invoke-static {p1, p2}, Lcom/esotericsoftware/asm/Frame;->b(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    const p2, 0x1000004

    if-eq p1, p2, :cond_0

    const p2, 0x1000003

    if-ne p1, p2, :cond_1

    :cond_0
    const/high16 p1, 0x1000000

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 787
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x28

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lcom/esotericsoftware/asm/Type;->getArgumentsAndReturnSizes(Ljava/lang/String;)I

    move-result p1

    shr-int/2addr p1, v3

    sub-int/2addr p1, v2

    invoke-direct {p0, p1}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    return-void

    :cond_0
    const/16 p1, 0x4a

    if-eq v0, p1, :cond_2

    const/16 p1, 0x44

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v2}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    return-void

    :cond_2
    :goto_0
    invoke-direct {p0, v3}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    return-void
.end method

.method private static a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z
    .locals 11

    .line 788
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

    aput p1, p2, p3

    return v2

    :cond_3
    const/high16 v4, 0xff00000

    and-int v5, v0, v4

    const/high16 v6, 0x1000000

    const/high16 v7, 0x1700000

    const/high16 v8, -0x10000000

    if-eq v5, v7, :cond_7

    and-int v9, v0, v8

    if-eqz v9, :cond_4

    goto :goto_1

    :cond_4
    if-ne v0, v3, :cond_10

    and-int p0, p1, v4

    if-eq p0, v7, :cond_6

    and-int p0, p1, v8

    if-eqz p0, :cond_5

    goto :goto_0

    :cond_5
    move p1, v6

    :cond_6
    :goto_0
    move v6, p1

    goto :goto_5

    :cond_7
    :goto_1
    if-ne p1, v3, :cond_8

    return v1

    :cond_8
    const/high16 v3, -0x100000

    and-int v9, p1, v3

    and-int/2addr v3, v0

    const-string v10, "java/lang/Object"

    if-ne v9, v3, :cond_a

    if-ne v5, v7, :cond_9

    and-int v3, p1, v8

    or-int/2addr v3, v7

    const v4, 0xfffff

    and-int/2addr p1, v4

    and-int/2addr v4, v0

    invoke-virtual {p0, p1, v4}, Lcom/esotericsoftware/asm/ClassWriter;->a(II)I

    move-result p0

    or-int v6, v3, p0

    goto :goto_5

    :cond_9
    and-int p1, v0, v8

    add-int/2addr p1, v8

    :goto_2
    or-int/2addr p1, v7

    invoke-virtual {p0, v10}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    move-result p0

    or-int v6, p1, p0

    goto :goto_5

    :cond_a
    and-int v3, p1, v4

    if-eq v3, v7, :cond_b

    and-int v4, p1, v8

    if-eqz v4, :cond_10

    :cond_b
    and-int/2addr p1, v8

    if-eqz p1, :cond_d

    if-ne v3, v7, :cond_c

    goto :goto_3

    :cond_c
    move v3, v8

    goto :goto_4

    :cond_d
    :goto_3
    move v3, v1

    :goto_4
    add-int/2addr v3, p1

    and-int p1, v0, v8

    if-eqz p1, :cond_e

    if-ne v5, v7, :cond_f

    :cond_e
    move v8, v1

    :cond_f
    add-int/2addr v8, p1

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_2

    :cond_10
    :goto_5
    if-eq v0, v6, :cond_11

    aput v6, p2, p3

    return v2

    :cond_11
    return v1
.end method

.method private static b(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)I
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x28

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x29

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v0

    .line 20
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const v3, 0x1000002

    .line 25
    .line 26
    .line 27
    const/16 v4, 0x46

    .line 28
    .line 29
    if-eq v2, v4, :cond_b

    .line 30
    .line 31
    const/16 v5, 0x4c

    .line 32
    .line 33
    const/high16 v6, 0x1700000

    .line 34
    .line 35
    if-eq v2, v5, :cond_a

    .line 36
    .line 37
    const v5, 0x1000001

    .line 38
    .line 39
    .line 40
    const/16 v7, 0x53

    .line 41
    .line 42
    if-eq v2, v7, :cond_9

    .line 43
    .line 44
    const/16 v8, 0x56

    .line 45
    .line 46
    if-eq v2, v8, :cond_8

    .line 47
    .line 48
    const/16 v0, 0x5a

    .line 49
    .line 50
    if-eq v2, v0, :cond_9

    .line 51
    .line 52
    const/16 v8, 0x49

    .line 53
    .line 54
    if-eq v2, v8, :cond_9

    .line 55
    .line 56
    const v9, 0x1000004

    .line 57
    .line 58
    .line 59
    const/16 v10, 0x4a

    .line 60
    .line 61
    if-eq v2, v10, :cond_7

    .line 62
    .line 63
    const v11, 0x1000003

    .line 64
    .line 65
    .line 66
    packed-switch v2, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    add-int/lit8 v2, v1, 0x1

    .line 70
    .line 71
    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const/16 v13, 0x5b

    .line 76
    .line 77
    if-ne v12, v13, :cond_1

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-eq v12, v4, :cond_6

    .line 87
    .line 88
    if-eq v12, v7, :cond_5

    .line 89
    .line 90
    if-eq v12, v0, :cond_4

    .line 91
    .line 92
    if-eq v12, v8, :cond_3

    .line 93
    .line 94
    if-eq v12, v10, :cond_2

    .line 95
    .line 96
    packed-switch v12, :pswitch_data_1

    .line 97
    .line 98
    .line 99
    add-int/lit8 v0, v2, 0x1

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-int/lit8 v3, v3, -0x1

    .line 106
    .line 107
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    or-int v3, p0, v6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :pswitch_0
    move v3, v11

    .line 119
    goto :goto_2

    .line 120
    :pswitch_1
    const v3, 0x100000b

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :pswitch_2
    const v3, 0x100000a

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    move v3, v9

    .line 129
    goto :goto_2

    .line 130
    :cond_3
    move v3, v5

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const v3, 0x1000009

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const v3, 0x100000c

    .line 137
    .line 138
    .line 139
    :cond_6
    :goto_2
    sub-int/2addr v2, v1

    .line 140
    shl-int/lit8 p0, v2, 0x1c

    .line 141
    .line 142
    or-int/2addr p0, v3

    .line 143
    return p0

    .line 144
    :pswitch_3
    return v11

    .line 145
    :cond_7
    return v9

    .line 146
    :cond_8
    return v0

    .line 147
    :cond_9
    :pswitch_4
    return v5

    .line 148
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    add-int/lit8 v0, v0, -0x1

    .line 155
    .line 156
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    or-int/2addr p0, v6

    .line 165
    return p0

    .line 166
    :cond_b
    return v3

    .line 167
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private b(I)V
    .locals 4

    .line 167
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    if-nez v0, :cond_0

    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    array-length v0, v0

    iget v1, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    if-lt v1, v0, :cond_1

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v0, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [I

    iget-object v2, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->f:[I

    iget v1, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    aput p1, v0, v1

    iget-object p0, p0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    iget p1, p0, Lcom/esotericsoftware/asm/Label;->f:I

    add-int/2addr p1, v2

    iget v0, p0, Lcom/esotericsoftware/asm/Label;->g:I

    if-le p1, v0, :cond_2

    iput p1, p0, Lcom/esotericsoftware/asm/Label;->g:I

    :cond_2
    return-void
.end method

.method private c(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    .line 2
    .line 3
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr v0, p1

    .line 6
    iput v0, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    .line 10
    .line 11
    iget v2, v1, Lcom/esotericsoftware/asm/Label;->f:I

    .line 12
    .line 13
    sub-int/2addr p1, v0

    .line 14
    sub-int/2addr v2, p1

    .line 15
    iput v2, v1, Lcom/esotericsoftware/asm/Label;->f:I

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lcom/esotericsoftware/asm/Frame;->g:I

    .line 19
    .line 20
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

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
    iput-object v0, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    iget v1, p0, Lcom/esotericsoftware/asm/Frame;->h:I

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
    iget-object v2, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/esotericsoftware/asm/Frame;->i:[I

    .line 36
    .line 37
    iget v1, p0, Lcom/esotericsoftware/asm/Frame;->h:I

    .line 38
    .line 39
    add-int/lit8 v2, v1, 0x1

    .line 40
    .line 41
    iput v2, p0, Lcom/esotericsoftware/asm/Frame;->h:I

    .line 42
    .line 43
    aput p1, v0, v1

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public a(IILcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Item;)V
    .locals 17

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
    const/16 v5, 0xc6

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eq v1, v5, :cond_9

    .line 15
    .line 16
    const/16 v5, 0xc7

    .line 17
    .line 18
    if-eq v1, v5, :cond_9

    .line 19
    .line 20
    const v5, 0x1000002

    .line 21
    .line 22
    .line 23
    const v8, 0x1000003

    .line 24
    .line 25
    .line 26
    const v9, 0x1000001

    .line 27
    .line 28
    .line 29
    const v10, 0x1000004

    .line 30
    .line 31
    .line 32
    const/high16 v11, 0x1000000

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    packed-switch v1, :pswitch_data_1

    .line 38
    .line 39
    .line 40
    const/high16 v12, 0x800000

    .line 41
    .line 42
    const/high16 v13, 0xf000000

    .line 43
    .line 44
    const/4 v14, 0x2

    .line 45
    packed-switch v1, :pswitch_data_2

    .line 46
    .line 47
    .line 48
    const/4 v12, 0x3

    .line 49
    const/16 v13, 0x5b

    .line 50
    .line 51
    const/4 v15, 0x0

    .line 52
    const/high16 v16, 0x1700000

    .line 53
    .line 54
    const/4 v7, 0x4

    .line 55
    packed-switch v1, :pswitch_data_3

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ne v2, v13, :cond_0

    .line 77
    .line 78
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    or-int v1, v1, v16

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ne v2, v13, :cond_1

    .line 102
    .line 103
    const-string v2, "["

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_1
    const/high16 v2, 0x11700000

    .line 114
    .line 115
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    or-int/2addr v1, v2

    .line 120
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_2
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 125
    .line 126
    .line 127
    packed-switch v2, :pswitch_data_4

    .line 128
    .line 129
    .line 130
    const v1, 0x11000004

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_3
    const v1, 0x11000001

    .line 138
    .line 139
    .line 140
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_4
    const v1, 0x1100000c

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_5
    const v1, 0x1100000a

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_6
    const v1, 0x11000003

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_7
    const v1, 0x11000002

    .line 166
    .line 167
    .line 168
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_8
    const v1, 0x1100000b

    .line 173
    .line 174
    .line 175
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_9
    const v1, 0x11000009

    .line 180
    .line 181
    .line 182
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_a
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v3, v1, v2}, Lcom/esotericsoftware/asm/ClassWriter;->a(Ljava/lang/String;I)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    const/high16 v2, 0x1800000

    .line 193
    .line 194
    or-int/2addr v1, v2

    .line 195
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_b
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 200
    .line 201
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->a(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_c
    iget-object v2, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 211
    .line 212
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->a(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/16 v2, 0xb8

    .line 216
    .line 217
    if-eq v1, v2, :cond_2

    .line 218
    .line 219
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    const/16 v5, 0xb7

    .line 224
    .line 225
    if-ne v1, v5, :cond_2

    .line 226
    .line 227
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    const/16 v5, 0x3c

    .line 234
    .line 235
    if-ne v1, v5, :cond_2

    .line 236
    .line 237
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->d(I)V

    .line 238
    .line 239
    .line 240
    :cond_2
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 241
    .line 242
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_d
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 247
    .line 248
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->a(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_e
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 256
    .line 257
    .line 258
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 259
    .line 260
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :pswitch_f
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 265
    .line 266
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->a(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_10
    iget-object v1, v4, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 271
    .line 272
    invoke-direct {v0, v3, v1}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :pswitch_11
    const-string v0, "JSR/RET are not supported with computeFrames option"

    .line 277
    .line 278
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_12
    invoke-direct {v0, v7}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :pswitch_13
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 290
    .line 291
    .line 292
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :pswitch_14
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 297
    .line 298
    .line 299
    invoke-direct {v0, v8}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :pswitch_15
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 307
    .line 308
    .line 309
    invoke-direct {v0, v5}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :pswitch_16
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 314
    .line 315
    .line 316
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_17
    invoke-direct {v0, v2, v9}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_18
    invoke-direct {v0, v12}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 328
    .line 329
    .line 330
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_19
    invoke-direct {v0, v7}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 338
    .line 339
    .line 340
    invoke-direct {v0, v8}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_1a
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 348
    .line 349
    .line 350
    invoke-direct {v0, v5}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_1b
    invoke-direct {v0, v7}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 355
    .line 356
    .line 357
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :pswitch_1c
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 365
    .line 366
    .line 367
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_1d
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :pswitch_1e
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 403
    .line 404
    .line 405
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 406
    .line 407
    .line 408
    invoke-direct {v0, v4}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 409
    .line 410
    .line 411
    invoke-direct {v0, v3}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 412
    .line 413
    .line 414
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 415
    .line 416
    .line 417
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :pswitch_1f
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 434
    .line 435
    .line 436
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 437
    .line 438
    .line 439
    invoke-direct {v0, v3}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 440
    .line 441
    .line 442
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 443
    .line 444
    .line 445
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_20
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 458
    .line 459
    .line 460
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 461
    .line 462
    .line 463
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 464
    .line 465
    .line 466
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 467
    .line 468
    .line 469
    return-void

    .line 470
    :pswitch_21
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 483
    .line 484
    .line 485
    invoke-direct {v0, v3}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 486
    .line 487
    .line 488
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 489
    .line 490
    .line 491
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :pswitch_22
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 504
    .line 505
    .line 506
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 507
    .line 508
    .line 509
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :pswitch_23
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 518
    .line 519
    .line 520
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :pswitch_24
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :pswitch_25
    invoke-direct {v0, v7}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :pswitch_26
    invoke-direct {v0, v12}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :pswitch_27
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    invoke-direct {v0, v2, v1}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 544
    .line 545
    .line 546
    add-int/lit8 v1, v2, 0x1

    .line 547
    .line 548
    invoke-direct {v0, v1, v11}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 549
    .line 550
    .line 551
    if-lez v2, :cond_8

    .line 552
    .line 553
    add-int/lit8 v1, v2, -0x1

    .line 554
    .line 555
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->a(I)I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    if-eq v2, v10, :cond_4

    .line 560
    .line 561
    if-ne v2, v8, :cond_3

    .line 562
    .line 563
    goto :goto_0

    .line 564
    :cond_3
    and-int v3, v2, v13

    .line 565
    .line 566
    if-eq v3, v11, :cond_8

    .line 567
    .line 568
    or-int/2addr v2, v12

    .line 569
    invoke-direct {v0, v1, v2}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :cond_4
    :goto_0
    invoke-direct {v0, v1, v11}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 574
    .line 575
    .line 576
    return-void

    .line 577
    :pswitch_28
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    invoke-direct {v0, v2, v1}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 582
    .line 583
    .line 584
    if-lez v2, :cond_8

    .line 585
    .line 586
    add-int/lit8 v1, v2, -0x1

    .line 587
    .line 588
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->a(I)I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    if-eq v2, v10, :cond_6

    .line 593
    .line 594
    if-ne v2, v8, :cond_5

    .line 595
    .line 596
    goto :goto_1

    .line 597
    :cond_5
    and-int v3, v2, v13

    .line 598
    .line 599
    if-eq v3, v11, :cond_8

    .line 600
    .line 601
    or-int/2addr v2, v12

    .line 602
    invoke-direct {v0, v1, v2}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    :cond_6
    :goto_1
    invoke-direct {v0, v1, v11}, Lcom/esotericsoftware/asm/Frame;->a(II)V

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :pswitch_29
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 611
    .line 612
    .line 613
    invoke-direct {v0}, Lcom/esotericsoftware/asm/Frame;->a()I

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    const/high16 v2, -0x10000000

    .line 618
    .line 619
    add-int/2addr v1, v2

    .line 620
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_2a
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 625
    .line 626
    .line 627
    invoke-direct {v0, v8}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 628
    .line 629
    .line 630
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    :pswitch_2b
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 635
    .line 636
    .line 637
    invoke-direct {v0, v5}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_2c
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 642
    .line 643
    .line 644
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 645
    .line 646
    .line 647
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :pswitch_2d
    invoke-direct {v0, v14}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 652
    .line 653
    .line 654
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_2e
    invoke-direct {v0, v2}, Lcom/esotericsoftware/asm/Frame;->a(I)I

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :pswitch_2f
    const/high16 v16, 0x1700000

    .line 667
    .line 668
    iget v1, v4, Lcom/esotericsoftware/asm/Item;->b:I

    .line 669
    .line 670
    const/16 v2, 0x10

    .line 671
    .line 672
    if-eq v1, v2, :cond_7

    .line 673
    .line 674
    packed-switch v1, :pswitch_data_5

    .line 675
    .line 676
    .line 677
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 678
    .line 679
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    or-int v1, v1, v16

    .line 684
    .line 685
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 686
    .line 687
    .line 688
    return-void

    .line 689
    :pswitch_30
    const-string v1, "java/lang/String"

    .line 690
    .line 691
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    or-int v1, v1, v16

    .line 696
    .line 697
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 698
    .line 699
    .line 700
    return-void

    .line 701
    :pswitch_31
    const-string v1, "java/lang/Class"

    .line 702
    .line 703
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    or-int v1, v1, v16

    .line 708
    .line 709
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :pswitch_32
    invoke-direct {v0, v8}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 714
    .line 715
    .line 716
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 717
    .line 718
    .line 719
    return-void

    .line 720
    :pswitch_33
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 721
    .line 722
    .line 723
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 724
    .line 725
    .line 726
    return-void

    .line 727
    :pswitch_34
    invoke-direct {v0, v5}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :pswitch_35
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 732
    .line 733
    .line 734
    return-void

    .line 735
    :cond_7
    const-string v1, "java/lang/invoke/MethodType"

    .line 736
    .line 737
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    or-int v1, v1, v16

    .line 742
    .line 743
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 744
    .line 745
    .line 746
    return-void

    .line 747
    :pswitch_36
    invoke-direct {v0, v8}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 748
    .line 749
    .line 750
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 751
    .line 752
    .line 753
    return-void

    .line 754
    :pswitch_37
    invoke-direct {v0, v5}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 755
    .line 756
    .line 757
    return-void

    .line 758
    :pswitch_38
    invoke-direct {v0, v10}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 759
    .line 760
    .line 761
    invoke-direct {v0, v11}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :pswitch_39
    invoke-direct {v0, v9}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :pswitch_3a
    const v1, 0x1000005

    .line 770
    .line 771
    .line 772
    invoke-direct {v0, v1}, Lcom/esotericsoftware/asm/Frame;->b(I)V

    .line 773
    .line 774
    .line 775
    :cond_8
    :pswitch_3b
    return-void

    .line 776
    :cond_9
    :pswitch_3c
    invoke-direct {v0, v6}, Lcom/esotericsoftware/asm/Frame;->c(I)V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    nop

    .line 781
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_39
        :pswitch_38
        :pswitch_38
        :pswitch_37
        :pswitch_37
        :pswitch_37
        :pswitch_36
        :pswitch_36
        :pswitch_39
        :pswitch_39
        :pswitch_2f
    .end packed-switch

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
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
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_2e
    .end packed-switch

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
    .line 836
    .line 837
    :pswitch_data_2
    .packed-switch 0x2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_2d
        :pswitch_2d
        :pswitch_2d
        :pswitch_28
        :pswitch_27
        :pswitch_28
        :pswitch_27
        :pswitch_28
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x4f
        :pswitch_26
        :pswitch_25
        :pswitch_26
        :pswitch_25
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_3c
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_1c
        :pswitch_18
        :pswitch_1c
        :pswitch_18
        :pswitch_1c
        :pswitch_18
        :pswitch_1c
        :pswitch_1b
        :pswitch_1c
        :pswitch_1b
        :pswitch_1c
        :pswitch_1b
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_1c
        :pswitch_1a
        :pswitch_2a
        :pswitch_13
        :pswitch_16
        :pswitch_14
        :pswitch_1c
        :pswitch_2c
        :pswitch_1a
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_12
        :pswitch_1c
        :pswitch_1c
        :pswitch_12
        :pswitch_12
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_3b
        :pswitch_11
        :pswitch_11
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_24
        :pswitch_3c
        :pswitch_24
        :pswitch_3c
        :pswitch_3b
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_2
        :pswitch_1
        :pswitch_13
        :pswitch_3c
        :pswitch_0
        :pswitch_13
        :pswitch_3c
        :pswitch_3c
    .end packed-switch

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
    :pswitch_data_4
    .packed-switch 0x4
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
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
    .packed-switch 0x3
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch
.end method

.method public a(Lcom/esotericsoftware/asm/ClassWriter;I[Lcom/esotericsoftware/asm/Type;I)V
    .locals 6

    .line 785
    new-array v0, p4, [I

    iput-object v0, p0, Lcom/esotericsoftware/asm/Frame;->c:[I

    const/4 v1, 0x0

    new-array v2, v1, [I

    iput-object v2, p0, Lcom/esotericsoftware/asm/Frame;->d:[I

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_1

    const/high16 v2, 0x80000

    and-int/2addr p2, v2

    const/4 v2, 0x1

    if-nez p2, :cond_0

    iget-object p2, p1, Lcom/esotericsoftware/asm/ClassWriter;->I:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/esotericsoftware/asm/ClassWriter;->c(Ljava/lang/String;)I

    move-result p2

    const/high16 v3, 0x1700000

    or-int/2addr p2, v3

    aput p2, v0, v1

    goto :goto_0

    :cond_0
    const p2, 0x1000006

    aput p2, v0, v1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    array-length p2, p3

    const/high16 v0, 0x1000000

    if-ge v1, p2, :cond_4

    aget-object p2, p3, v1

    invoke-virtual {p2}, Lcom/esotericsoftware/asm/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/esotericsoftware/asm/Frame;->b(Lcom/esotericsoftware/asm/ClassWriter;Ljava/lang/String;)I

    move-result p2

    iget-object v3, p0, Lcom/esotericsoftware/asm/Frame;->c:[I

    add-int/lit8 v4, v2, 0x1

    aput p2, v3, v2

    const v5, 0x1000004

    if-eq p2, v5, :cond_3

    const v5, 0x1000003

    if-ne p2, v5, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x2

    aput v0, v3, v4

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_3
    if-ge v2, p4, :cond_5

    iget-object p1, p0, Lcom/esotericsoftware/asm/Frame;->c:[I

    add-int/lit8 p2, v2, 0x1

    aput v0, p1, v2

    move v2, p2

    goto :goto_3

    :cond_5
    return-void
.end method

.method public a(Lcom/esotericsoftware/asm/ClassWriter;Lcom/esotericsoftware/asm/Frame;I)Z
    .locals 20

    .line 789
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    iget-object v4, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    array-length v4, v4

    iget-object v5, v0, Lcom/esotericsoftware/asm/Frame;->d:[I

    array-length v5, v5

    iget-object v6, v2, Lcom/esotericsoftware/asm/Frame;->c:[I

    const/4 v7, 0x1

    if-nez v6, :cond_0

    new-array v6, v4, [I

    iput-object v6, v2, Lcom/esotericsoftware/asm/Frame;->c:[I

    move v6, v7

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x0

    :goto_1
    const v10, 0x1000003

    const v11, 0x1000004

    const/high16 v13, 0x2000000

    const v16, 0x7fffff

    const/high16 v17, 0x800000

    const/high16 v12, 0x1000000

    const/high16 v18, 0xf000000

    if-ge v9, v4, :cond_8

    iget-object v14, v0, Lcom/esotericsoftware/asm/Frame;->e:[I

    if-eqz v14, :cond_5

    const/high16 v19, -0x10000000

    array-length v15, v14

    if-ge v9, v15, :cond_5

    aget v14, v14, v9

    if-nez v14, :cond_1

    iget-object v10, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    aget v12, v10, v9

    goto :goto_4

    :cond_1
    and-int v15, v14, v19

    and-int v8, v14, v18

    if-ne v8, v12, :cond_2

    move v12, v14

    goto :goto_4

    :cond_2
    if-ne v8, v13, :cond_3

    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    and-int v13, v14, v16

    aget v8, v8, v13

    :goto_2
    add-int/2addr v15, v8

    goto :goto_3

    :cond_3
    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->d:[I

    and-int v13, v14, v16

    sub-int v13, v5, v13

    aget v8, v8, v13

    goto :goto_2

    :goto_3
    and-int v8, v14, v17

    if-eqz v8, :cond_4

    if-eq v15, v11, :cond_6

    if-ne v15, v10, :cond_4

    goto :goto_4

    :cond_4
    move v12, v15

    goto :goto_4

    :cond_5
    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    aget v12, v8, v9

    :cond_6
    :goto_4
    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->i:[I

    if-eqz v8, :cond_7

    invoke-direct {v0, v1, v12}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I)I

    move-result v12

    :cond_7
    iget-object v8, v2, Lcom/esotericsoftware/asm/Frame;->c:[I

    invoke-static {v1, v12, v8, v9}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z

    move-result v8

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_8
    const/high16 v19, -0x10000000

    if-lez v3, :cond_b

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_9

    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    aget v8, v8, v5

    iget-object v9, v2, Lcom/esotericsoftware/asm/Frame;->c:[I

    invoke-static {v1, v8, v9, v5}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z

    move-result v8

    or-int/2addr v6, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_9
    iget-object v0, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    if-nez v0, :cond_a

    new-array v0, v7, [I

    iput-object v0, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    goto :goto_6

    :cond_a
    move v7, v6

    :goto_6
    iget-object v0, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    const/4 v4, 0x0

    invoke-static {v1, v3, v0, v4}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z

    move-result v0

    or-int/2addr v0, v7

    return v0

    :cond_b
    const/4 v4, 0x0

    iget-object v3, v0, Lcom/esotericsoftware/asm/Frame;->d:[I

    array-length v3, v3

    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->b:Lcom/esotericsoftware/asm/Label;

    iget v8, v8, Lcom/esotericsoftware/asm/Label;->f:I

    add-int/2addr v3, v8

    iget-object v8, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    if-nez v8, :cond_c

    iget v6, v0, Lcom/esotericsoftware/asm/Frame;->g:I

    add-int/2addr v6, v3

    new-array v6, v6, [I

    iput-object v6, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    goto :goto_7

    :cond_c
    move v7, v6

    :goto_7
    move v6, v4

    :goto_8
    if-ge v6, v3, :cond_e

    iget-object v8, v0, Lcom/esotericsoftware/asm/Frame;->d:[I

    aget v8, v8, v6

    iget-object v9, v0, Lcom/esotericsoftware/asm/Frame;->i:[I

    if-eqz v9, :cond_d

    invoke-direct {v0, v1, v8}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I)I

    move-result v8

    :cond_d
    iget-object v9, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    invoke-static {v1, v8, v9, v6}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z

    move-result v8

    or-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_e
    move v8, v4

    :goto_9
    iget v4, v0, Lcom/esotericsoftware/asm/Frame;->g:I

    if-ge v8, v4, :cond_14

    iget-object v4, v0, Lcom/esotericsoftware/asm/Frame;->f:[I

    aget v4, v4, v8

    and-int v6, v4, v19

    and-int v9, v4, v18

    if-ne v9, v12, :cond_f

    goto :goto_c

    :cond_f
    if-ne v9, v13, :cond_10

    iget-object v9, v0, Lcom/esotericsoftware/asm/Frame;->c:[I

    and-int v14, v4, v16

    aget v9, v9, v14

    :goto_a
    add-int/2addr v6, v9

    goto :goto_b

    :cond_10
    iget-object v9, v0, Lcom/esotericsoftware/asm/Frame;->d:[I

    and-int v14, v4, v16

    sub-int v14, v5, v14

    aget v9, v9, v14

    goto :goto_a

    :goto_b
    and-int v4, v4, v17

    if-eqz v4, :cond_12

    if-eq v6, v11, :cond_11

    if-ne v6, v10, :cond_12

    :cond_11
    move v4, v12

    goto :goto_c

    :cond_12
    move v4, v6

    :goto_c
    iget-object v6, v0, Lcom/esotericsoftware/asm/Frame;->i:[I

    if-eqz v6, :cond_13

    invoke-direct {v0, v1, v4}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I)I

    move-result v4

    :cond_13
    iget-object v6, v2, Lcom/esotericsoftware/asm/Frame;->d:[I

    add-int v9, v3, v8

    invoke-static {v1, v4, v6, v9}, Lcom/esotericsoftware/asm/Frame;->a(Lcom/esotericsoftware/asm/ClassWriter;I[II)Z

    move-result v4

    or-int/2addr v7, v4

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_14
    return v7
.end method
