.class public Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;
.super Lorg/apache/commons/lang3/builder/RecursiveToStringStyle;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final INDENT:I = 0x2

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private spaces:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/RecursiveToStringStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private resetIndent()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 16
    .line 17
    invoke-direct {p0, v1}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setArrayStart(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, ","

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v2, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setArraySeparator(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget v2, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 74
    .line 75
    add-int/lit8 v2, v2, -0x2

    .line 76
    .line 77
    invoke-direct {p0, v2}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v2, "}"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setArrayEnd(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "["

    .line 99
    .line 100
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget v2, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 111
    .line 112
    invoke-direct {p0, v2}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setContentStart(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget v1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 139
    .line 140
    invoke-direct {p0, v1}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setFieldSeparator(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    iget v1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 167
    .line 168
    add-int/lit8 v1, v1, -0x2

    .line 169
    .line 170
    invoke-direct {p0, v1}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spacer(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v1, "]"

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/ToStringStyle;->setContentEnd(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method private spacer(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget p0, Lorg/apache/commons/lang3/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 9
    .line 10
    new-array p1, p1, [C

    .line 11
    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([CC)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/apache/commons/lang3/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-class v0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/builder/RecursiveToStringStyle;->accept(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget p2, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 36
    .line 37
    add-int/lit8 p2, p2, 0x2

    .line 38
    .line 39
    iput p2, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 40
    .line 41
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    invoke-direct {p2, p3, p0}, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lorg/apache/commons/lang3/builder/飘花落叶言子楪世哲苏兰;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 54
    .line 55
    .line 56
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, -0x2

    .line 59
    .line 60
    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 61
    .line 62
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/RecursiveToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[B)V
    .locals 1

    .line 70
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 71
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 72
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[B)V

    .line 73
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 74
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[C)V
    .locals 1

    .line 75
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 76
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 77
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[C)V

    .line 78
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 79
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[D)V
    .locals 1

    .line 80
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 81
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 82
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[D)V

    .line 83
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 84
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[F)V
    .locals 1

    .line 85
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 86
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 87
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[F)V

    .line 88
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 89
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[I)V
    .locals 1

    .line 90
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 91
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 92
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[I)V

    .line 93
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 94
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[J)V
    .locals 1

    .line 95
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 96
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 97
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[J)V

    .line 98
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 99
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 105
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 106
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 107
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 109
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[S)V
    .locals 1

    .line 110
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 111
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 112
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[S)V

    .line 113
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 114
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[Z)V
    .locals 1

    .line 100
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 101
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 102
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->appendDetail(Ljava/lang/StringBuffer;Ljava/lang/String;[Z)V

    .line 103
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 104
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    return-void
.end method

.method public reflectionAppendArrayDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/lang3/builder/ToStringStyle;->reflectionAppendArrayDetail(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, -0x2

    .line 16
    .line 17
    iput p1, p0, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->spaces:I

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/apache/commons/lang3/builder/MultilineRecursiveToStringStyle;->resetIndent()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
