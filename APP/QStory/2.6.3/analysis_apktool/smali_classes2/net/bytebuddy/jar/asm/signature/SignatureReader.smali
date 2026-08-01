.class public Lnet/bytebuddy/jar/asm/signature/SignatureReader;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final signatureValue:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->signatureValue:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I
    .locals 9

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/16 v1, 0x46

    .line 8
    .line 9
    if-eq p1, v1, :cond_d

    .line 10
    .line 11
    const/16 v1, 0x4c

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/16 v3, 0x3b

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq p1, v1, :cond_2

    .line 18
    .line 19
    const/16 v1, 0x56

    .line 20
    .line 21
    if-eq p1, v1, :cond_d

    .line 22
    .line 23
    const/16 v1, 0x49

    .line 24
    .line 25
    if-eq p1, v1, :cond_d

    .line 26
    .line 27
    const/16 v1, 0x4a

    .line 28
    .line 29
    if-eq p1, v1, :cond_d

    .line 30
    .line 31
    const/16 v1, 0x53

    .line 32
    .line 33
    if-eq p1, v1, :cond_d

    .line 34
    .line 35
    const/16 v1, 0x54

    .line 36
    .line 37
    if-eq p1, v1, :cond_1

    .line 38
    .line 39
    const/16 v1, 0x5a

    .line 40
    .line 41
    if-eq p1, v1, :cond_d

    .line 42
    .line 43
    const/16 v1, 0x5b

    .line 44
    .line 45
    if-eq p1, v1, :cond_0

    .line 46
    .line 47
    packed-switch p1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 51
    .line 52
    .line 53
    return v2

    .line 54
    :cond_0
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitArrayType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p0, v0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_1
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->indexOf(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p2, p0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeVariable(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    add-int/2addr p1, v4

    .line 75
    return p1

    .line 76
    :cond_2
    move p1, v0

    .line 77
    move v1, v2

    .line 78
    move v5, v1

    .line 79
    :goto_0
    add-int/lit8 v6, v0, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    const/16 v8, 0x2e

    .line 86
    .line 87
    if-eq v7, v8, :cond_9

    .line 88
    .line 89
    if-ne v7, v3, :cond_3

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    const/16 v8, 0x3c

    .line 93
    .line 94
    if-ne v7, v8, :cond_8

    .line 95
    .line 96
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v5, :cond_4

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInnerClassType(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-virtual {p2, v0}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitClassType(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    move v0, v6

    .line 110
    :goto_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const/16 v6, 0x3e

    .line 115
    .line 116
    if-eq v1, v6, :cond_7

    .line 117
    .line 118
    const/16 v6, 0x2a

    .line 119
    .line 120
    if-eq v1, v6, :cond_6

    .line 121
    .line 122
    const/16 v6, 0x2b

    .line 123
    .line 124
    if-eq v1, v6, :cond_5

    .line 125
    .line 126
    const/16 v6, 0x2d

    .line 127
    .line 128
    if-eq v1, v6, :cond_5

    .line 129
    .line 130
    const/16 v1, 0x3d

    .line 131
    .line 132
    invoke-virtual {p2, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {p0, v0, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 142
    .line 143
    invoke-virtual {p2, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument(C)Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {p0, v0, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 153
    .line 154
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitTypeArgument()V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    move v1, v4

    .line 159
    goto :goto_0

    .line 160
    :cond_8
    move v0, v6

    .line 161
    goto :goto_0

    .line 162
    :cond_9
    :goto_3
    if-nez v1, :cond_b

    .line 163
    .line 164
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-eqz v5, :cond_a

    .line 169
    .line 170
    invoke-virtual {p2, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInnerClassType(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_a
    invoke-virtual {p2, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitClassType(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    :goto_4
    if-ne v7, v3, :cond_c

    .line 178
    .line 179
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitEnd()V

    .line 180
    .line 181
    .line 182
    return v6

    .line 183
    :cond_c
    move v1, v2

    .line 184
    move v5, v4

    .line 185
    move p1, v6

    .line 186
    move v0, p1

    .line 187
    goto :goto_0

    .line 188
    :cond_d
    :pswitch_0
    invoke-virtual {p2, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitBaseType(C)V

    .line 189
    .line 190
    .line 191
    return v0

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V
    .locals 5

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->signatureValue:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x3c

    .line 13
    .line 14
    if-ne v2, v3, :cond_4

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    :cond_0
    const/16 v2, 0x3a

    .line 18
    .line 19
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitFormalTypeParameter(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/16 v4, 0x4c

    .line 39
    .line 40
    if-eq v1, v4, :cond_1

    .line 41
    .line 42
    const/16 v4, 0x5b

    .line 43
    .line 44
    if-eq v1, v4, :cond_1

    .line 45
    .line 46
    const/16 v4, 0x54

    .line 47
    .line 48
    if-ne v1, v4, :cond_2

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitClassBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {p0, v3, v1}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_2
    :goto_0
    add-int/lit8 v1, v3, 0x1

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-ne v3, v2, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInterfaceBound()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {p0, v1, v3}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/16 v2, 0x3e

    .line 76
    .line 77
    if-ne v3, v2, :cond_0

    .line 78
    .line 79
    :cond_4
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/16 v3, 0x28

    .line 84
    .line 85
    if-ne v2, v3, :cond_6

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/16 v3, 0x29

    .line 94
    .line 95
    if-eq v2, v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitParameterType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {p0, v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    goto :goto_1

    .line 106
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitReturnType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {p0, v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    :goto_2
    if-ge v1, v0, :cond_7

    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitExceptionType()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {p0, v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_2

    .line 129
    :cond_6
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitSuperclass()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {p0, v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :goto_3
    if-ge v1, v0, :cond_7

    .line 138
    .line 139
    invoke-virtual {p1}, Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;->visitInterface()Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {p0, v1, v2}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    goto :goto_3

    .line 148
    :cond_7
    return-void
.end method

.method public acceptType(Lnet/bytebuddy/jar/asm/signature/SignatureVisitor;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->signatureValue:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p0, v0, p1}, Lnet/bytebuddy/jar/asm/signature/SignatureReader;->parseType(Ljava/lang/String;ILnet/bytebuddy/jar/asm/signature/SignatureVisitor;)I

    .line 5
    .line 6
    .line 7
    return-void
.end method
