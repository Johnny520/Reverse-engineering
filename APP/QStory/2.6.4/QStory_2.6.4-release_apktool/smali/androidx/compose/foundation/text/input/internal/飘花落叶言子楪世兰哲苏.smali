.class public abstract Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏世兰哲;


# direct methods
.method public static final 飘花落叶言子楪世兰哲苏(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;FF)Z
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 4
    .line 5
    cmpg-float v1, p1, v1

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    cmpg-float p1, v0, p1

    .line 10
    .line 11
    if-gtz p1, :cond_0

    .line 12
    .line 13
    iget p1, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 14
    .line 15
    iget p0, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 16
    .line 17
    cmpg-float p0, p2, p0

    .line 18
    .line 19
    if-gtz p0, :cond_0

    .line 20
    .line 21
    cmpg-float p0, p1, p2

    .line 22
    .line 23
    if-gtz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroid/graphics/PointF;)J
    .locals 6

    .line 1
    iget v0, p0, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v2, p0

    .line 15
    const/16 p0, 0x20

    .line 16
    .line 17
    shl-long/2addr v0, p0

    .line 18
    const-wide v4, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v2, v4

    .line 24
    or-long/2addr v0, v2

    .line 25
    return-wide v0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;)Landroid/view/inputmethod/ExtractedText;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/inputmethod/ExtractedText;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    iget-object v1, v1, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v1, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->partialStartOffset:I

    .line 23
    .line 24
    iget-wide v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 25
    .line 26
    invoke-static {v1, v2}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(J)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iput v3, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    .line 31
    .line 32
    invoke-static {v1, v2}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(J)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    .line 37
    .line 38
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-static {p0, v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世兰楪苏(Ljava/lang/CharSequence;C)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    xor-int/lit8 p0, p0, 0x1

    .line 49
    .line 50
    iput p0, v0, Landroid/view/inputmethod/ExtractedText;->flags:I

    .line 51
    .line 52
    return-object v0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v3}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IZ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sub-int/2addr p1, v2

    .line 29
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eq v0, p0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eq v0, p0, :cond_2

    .line 45
    .line 46
    :goto_1
    return v2

    .line 47
    :cond_2
    return v3
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J
    .locals 2

    .line 1
    invoke-static {p0, p1, p3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    sget-wide p0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 12
    .line 13
    return-wide p0

    .line 14
    :cond_0
    invoke-static {p0, p2, p3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-static {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(J)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    sget-wide p0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 25
    .line 26
    return-wide p0

    .line 27
    :cond_1
    const/16 p2, 0x20

    .line 28
    .line 29
    shr-long p2, v0, p2

    .line 30
    .line 31
    long-to-int p2, p2

    .line 32
    invoke-static {p2, p2}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    const-wide v0, 0xffffffffL

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr p0, v0

    .line 42
    long-to-int p0, p0

    .line 43
    invoke-static {p0, p0}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p2, p0}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    return-wide p0
.end method

.method public static 飘花落叶言子楪哲世兰苏(JLandroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;ZLandroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)V
    .locals 6

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_7

    .line 7
    .line 8
    sget p3, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 9
    .line 10
    const/16 p3, 0x20

    .line 11
    .line 12
    shr-long v2, p0, p3

    .line 13
    .line 14
    long-to-int p3, v2

    .line 15
    and-long v2, p0, v0

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    const/16 v3, 0xa

    .line 19
    .line 20
    if-lez p3, :cond_0

    .line 21
    .line 22
    invoke-static {p2, p3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v3

    .line 28
    :goto_0
    iget-object v5, p2, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v2, v5, :cond_1

    .line 35
    .line 36
    invoke-static {p2, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    :cond_1
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(I)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(I)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    :cond_2
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    sub-int/2addr p3, p0

    .line 63
    if-eqz p3, :cond_3

    .line 64
    .line 65
    invoke-static {p2, p3}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(I)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    :cond_3
    invoke-static {p3, v2}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(I)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_5

    .line 91
    .line 92
    invoke-static {v4}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世(I)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    :cond_5
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    add-int/2addr v2, p0

    .line 103
    iget-object p0, p2, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eq v2, p0, :cond_6

    .line 110
    .line 111
    invoke-static {p2, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-static {v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(I)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_5

    .line 120
    .line 121
    :cond_6
    invoke-static {p3, v2}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 122
    .line 123
    .line 124
    move-result-wide p0

    .line 125
    :cond_7
    :goto_1
    new-instance p2, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 126
    .line 127
    and-long/2addr v0, p0

    .line 128
    long-to-int p3, v0

    .line 129
    invoke-direct {p2, p3, p3}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;-><init>(II)V

    .line 130
    .line 131
    .line 132
    invoke-static {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲(J)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    new-instance p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;

    .line 137
    .line 138
    const/4 p3, 0x0

    .line 139
    invoke-direct {p1, p0, p3}, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;-><init>(II)V

    .line 140
    .line 141
    .line 142
    const/4 p0, 0x2

    .line 143
    new-array p0, p0, [Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 144
    .line 145
    aput-object p2, p0, p3

    .line 146
    .line 147
    const/4 p2, 0x1

    .line 148
    aput-object p1, p0, p2

    .line 149
    .line 150
    new-instance p1, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;

    .line 151
    .line 152
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰世苏哲;-><init>([Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4, p1}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世哲苏兰;Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪兰苏哲世;-><init>(Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世哲苏兰;Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;JLandroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)I
    .locals 4

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p3}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪苏世哲兰()F

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p3, 0x0

    .line 9
    :goto_0
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr v0, p1

    .line 15
    long-to-int v0, v0

    .line 16
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(F)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sub-float/2addr v3, p3

    .line 33
    cmpg-float v2, v2, v3

    .line 34
    .line 35
    if-ltz v2, :cond_3

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0, v1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(I)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-float/2addr v2, p3

    .line 46
    cmpl-float v0, v0, v2

    .line 47
    .line 48
    if-lez v0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/16 v0, 0x20

    .line 52
    .line 53
    shr-long/2addr p1, v0

    .line 54
    long-to-int p1, p1

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    neg-float v0, p3

    .line 60
    cmpg-float p2, p2, v0

    .line 61
    .line 62
    if-ltz p2, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget p0, p0, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 69
    .line 70
    add-float/2addr p0, p3

    .line 71
    cmpl-float p0, p1, p0

    .line 72
    .line 73
    if-lez p0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    return v1

    .line 77
    :cond_3
    :goto_1
    const/4 p0, -0x1

    .line 78
    return p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;)I
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏(Landroid/view/inputmethod/HandwritingGesture;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x3

    .line 8
    return p0

    .line 9
    :cond_0
    new-instance v0, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪苏兰世哲;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x5

    .line 19
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(I)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0xa0

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(I)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;I)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    invoke-interface {p0, v1, v2}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲苏楪兰(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-virtual {p1, v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(J)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Landroidx/compose/ui/text/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子世苏兰楪哲;

    .line 35
    .line 36
    invoke-virtual {v0, p0, p2, p1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;ILandroidx/compose/ui/text/飘花落叶言子世苏兰楪哲;)J

    .line 37
    .line 38
    .line 39
    move-result-wide p0

    .line 40
    return-wide p0

    .line 41
    :cond_2
    :goto_1
    sget-wide p0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 42
    .line 43
    return-wide p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(I)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x17

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x16

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x1e

    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x18

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x15

    .line 30
    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method


# virtual methods
.method public abstract 飘花落叶言子楪哲苏世兰()Landroid/view/inputmethod/InputMethodManager;
.end method
