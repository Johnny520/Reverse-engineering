.class public final Lbsh/preprocess/KtStringTemplate;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static escapeForDoubleQuoted(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_4

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0xc

    .line 24
    .line 25
    if-eq v2, v3, :cond_3

    .line 26
    .line 27
    const/16 v3, 0xd

    .line 28
    .line 29
    if-eq v2, v3, :cond_2

    .line 30
    .line 31
    const/16 v3, 0x22

    .line 32
    .line 33
    if-eq v2, v3, :cond_1

    .line 34
    .line 35
    const/16 v3, 0x5c

    .line 36
    .line 37
    if-eq v2, v3, :cond_0

    .line 38
    .line 39
    packed-switch v2, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :pswitch_0
    const-string v2, "\\n"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_1
    const-string v2, "\\t"

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_2
    const-string v2, "\\b"

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    const-string v2, "\\\\"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const-string v2, "\\\""

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const-string v2, "\\r"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const-string v2, "\\f"

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static findBlockCommentEnd(Ljava/lang/String;I)I
    .locals 3

    .line 1
    :goto_0
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x2a

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x2f

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    return p1

    .line 26
    :cond_0
    move p1, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, -0x1

    .line 29
    return p0
.end method

.method private static findCharLiteralEnd(Ljava/lang/String;I)I
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ge p1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v2, 0x5c

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v2, 0x27

    .line 20
    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    return p1

    .line 24
    :cond_1
    const/16 v2, 0xa

    .line 25
    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    const/16 v2, 0xd

    .line 29
    .line 30
    if-ne v0, v2, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_2
    return v1
.end method

.method private static findNormalStringEnd(Ljava/lang/String;I)I
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge p1, v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x5c

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/16 v1, 0x22

    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 p0, -0x1

    .line 27
    return p0
.end method

.method private static findTemplateExprEnd(Ljava/lang/String;I)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    :cond_0
    :goto_0
    const/4 v2, -0x1

    .line 7
    if-ge p1, v0, :cond_9

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x22

    .line 14
    .line 15
    if-ne v3, v4, :cond_2

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->findNormalStringEnd(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-gez p1, :cond_1

    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v4, 0x27

    .line 30
    .line 31
    if-ne v3, v4, :cond_3

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->findCharLiteralEnd(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-gez p1, :cond_1

    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    const/16 v4, 0x2f

    .line 43
    .line 44
    if-ne v3, v4, :cond_7

    .line 45
    .line 46
    add-int/lit8 v5, p1, 0x1

    .line 47
    .line 48
    if-ge v5, v0, :cond_7

    .line 49
    .line 50
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-ne v5, v4, :cond_5

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    :goto_2
    if-ge p1, v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/16 v3, 0xa

    .line 65
    .line 66
    if-eq v2, v3, :cond_0

    .line 67
    .line 68
    const/16 v3, 0xd

    .line 69
    .line 70
    if-ne v2, v3, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    const/16 v4, 0x2a

    .line 77
    .line 78
    if-ne v5, v4, :cond_7

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x2

    .line 81
    .line 82
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->findBlockCommentEnd(Ljava/lang/String;I)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-gez p1, :cond_6

    .line 87
    .line 88
    return v2

    .line 89
    :cond_6
    add-int/lit8 p1, p1, 0x2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    const/16 v2, 0x7b

    .line 93
    .line 94
    if-ne v3, v2, :cond_8

    .line 95
    .line 96
    add-int/lit8 v1, v1, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_8
    const/16 v2, 0x7d

    .line 100
    .line 101
    if-ne v3, v2, :cond_1

    .line 102
    .line 103
    add-int/lit8 v1, v1, -0x1

    .line 104
    .line 105
    if-nez v1, :cond_1

    .line 106
    .line 107
    return p1

    .line 108
    :cond_9
    return v2
.end method

.method private static findTripleQuoteEnd(Ljava/lang/String;I)I
    .locals 2

    .line 1
    :goto_0
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->isTripleQuote(Ljava/lang/String;I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, -0x1

    .line 20
    return p0
.end method

.method private static isEscapedDollar(Ljava/lang/String;I)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    sub-int/2addr p1, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/16 v4, 0x5c

    .line 12
    .line 13
    if-ne v3, v4, :cond_0

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    add-int/lit8 p1, p1, -0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    and-int/lit8 p0, v2, 0x1

    .line 21
    .line 22
    if-ne p0, v0, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return v1
.end method

.method private static isIdentifierPart(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private static isIdentifierStart(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private static isTripleQuote(Ljava/lang/String;I)Z
    .locals 3

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    add-int/2addr p1, v1

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ne p1, v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ne p0, v2, :cond_0

    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method private static joinWithPlus(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    const-string v2, " + "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private static quoteString(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p0, v0}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lbsh/preprocess/KtStringTemplate;->escapeForDoubleQuoted(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1, p0, v0}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static rewrite(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    if-eqz p0, :cond_d

    .line 2
    .line 3
    const/16 v0, 0x24

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_d

    .line 10
    .line 11
    const/16 v0, 0x22

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    add-int/lit8 v3, v1, 0x20

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    move v4, v3

    .line 34
    :goto_0
    if-ge v4, v1, :cond_c

    .line 35
    .line 36
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ne v5, v0, :cond_4

    .line 41
    .line 42
    invoke-static {p0, v4}, Lbsh/preprocess/KtStringTemplate;->isTripleQuote(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    add-int/lit8 v5, v4, 0x3

    .line 49
    .line 50
    invoke-static {p0, v5}, Lbsh/preprocess/KtStringTemplate;->findTripleQuoteEnd(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-gez v6, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_1
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const/4 v5, 0x1

    .line 66
    invoke-static {v4, v5}, Lbsh/preprocess/KtStringTemplate;->rewriteStringLiteral(Ljava/lang/String;Z)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v6, 0x3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    add-int/lit8 v5, v4, 0x1

    .line 77
    .line 78
    invoke-static {p0, v5}, Lbsh/preprocess/KtStringTemplate;->findNormalStringEnd(Ljava/lang/String;I)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-gez v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_3
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4, v3}, Lbsh/preprocess/KtStringTemplate;->rewriteStringLiteral(Ljava/lang/String;Z)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    add-int/lit8 v4, v6, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    const/16 v6, 0x27

    .line 104
    .line 105
    if-ne v5, v6, :cond_6

    .line 106
    .line 107
    add-int/lit8 v5, v4, 0x1

    .line 108
    .line 109
    invoke-static {p0, v5}, Lbsh/preprocess/KtStringTemplate;->findCharLiteralEnd(Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-gez v5, :cond_5

    .line 114
    .line 115
    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    invoke-virtual {v2, p0, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    :goto_1
    move v4, v5

    .line 125
    goto :goto_0

    .line 126
    :cond_6
    const/16 v6, 0x2f

    .line 127
    .line 128
    if-ne v5, v6, :cond_b

    .line 129
    .line 130
    add-int/lit8 v7, v4, 0x1

    .line 131
    .line 132
    if-ge v7, v1, :cond_b

    .line 133
    .line 134
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-ne v7, v6, :cond_9

    .line 139
    .line 140
    add-int/lit8 v5, v4, 0x2

    .line 141
    .line 142
    :goto_2
    if-ge v5, v1, :cond_8

    .line 143
    .line 144
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    const/16 v7, 0xa

    .line 149
    .line 150
    if-eq v6, v7, :cond_8

    .line 151
    .line 152
    const/16 v7, 0xd

    .line 153
    .line 154
    if-ne v6, v7, :cond_7

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    :goto_3
    invoke-virtual {v2, p0, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_9
    const/16 v6, 0x2a

    .line 165
    .line 166
    if-ne v7, v6, :cond_b

    .line 167
    .line 168
    add-int/lit8 v5, v4, 0x2

    .line 169
    .line 170
    invoke-static {p0, v5}, Lbsh/preprocess/KtStringTemplate;->findBlockCommentEnd(Ljava/lang/String;I)I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-gez v5, :cond_a

    .line 175
    .line 176
    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_a
    add-int/lit8 v5, v5, 0x2

    .line 181
    .line 182
    invoke-virtual {v2, p0, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_b
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    add-int/lit8 v4, v4, 0x1

    .line 190
    .line 191
    goto/16 :goto_0

    .line 192
    .line 193
    :cond_c
    :goto_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    :cond_d
    :goto_5
    return-object p0
.end method

.method private static rewriteStringLiteral(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 12

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gez v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->quoteString(Ljava/lang/String;Z)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    move v5, v4

    .line 26
    :goto_0
    const-string v6, ")"

    .line 27
    .line 28
    if-ge v3, v1, :cond_a

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eq v7, v0, :cond_1

    .line 35
    .line 36
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-nez p1, :cond_2

    .line 40
    .line 41
    invoke-static {p0, v3}, Lbsh/preprocess/KtStringTemplate;->isEscapedDollar(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    add-int/lit8 v7, v3, 0x1

    .line 49
    .line 50
    if-lt v7, v1, :cond_4

    .line 51
    .line 52
    :cond_3
    :goto_2
    move v3, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_4
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    const/16 v9, 0x7b

    .line 59
    .line 60
    const-string v10, "String.valueOf("

    .line 61
    .line 62
    const/4 v11, 0x1

    .line 63
    if-ne v8, v9, :cond_7

    .line 64
    .line 65
    add-int/lit8 v8, v3, 0x2

    .line 66
    .line 67
    invoke-static {p0, v8}, Lbsh/preprocess/KtStringTemplate;->findTemplateExprEnd(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-gez v9, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_6

    .line 83
    .line 84
    invoke-static {v3, p1}, Lbsh/preprocess/KtStringTemplate;->quoteString(Ljava/lang/String;Z)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_6
    invoke-virtual {p0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    new-instance v4, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    add-int/lit8 v5, v9, 0x1

    .line 118
    .line 119
    move v3, v5

    .line 120
    :goto_3
    move v4, v11

    .line 121
    goto :goto_0

    .line 122
    :cond_7
    invoke-static {v8}, Lbsh/preprocess/KtStringTemplate;->isIdentifierStart(C)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_3

    .line 127
    .line 128
    add-int/lit8 v4, v3, 0x2

    .line 129
    .line 130
    :goto_4
    if-ge v4, v1, :cond_8

    .line 131
    .line 132
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    invoke-static {v8}, Lbsh/preprocess/KtStringTemplate;->isIdentifierPart(C)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_8

    .line 141
    .line 142
    add-int/lit8 v4, v4, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-nez v5, :cond_9

    .line 154
    .line 155
    invoke-static {v3, p1}, Lbsh/preprocess/KtStringTemplate;->quoteString(Ljava/lang/String;Z)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move v3, v4

    .line 185
    move v5, v3

    .line 186
    goto :goto_3

    .line 187
    :cond_a
    if-nez v4, :cond_b

    .line 188
    .line 189
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->quoteString(Ljava/lang/String;Z)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    return-object p0

    .line 194
    :cond_b
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_c

    .line 203
    .line 204
    invoke-static {p0, p1}, Lbsh/preprocess/KtStringTemplate;->quoteString(Ljava/lang/String;Z)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    if-eqz p0, :cond_d

    .line 216
    .line 217
    const-string p0, "\"\""

    .line 218
    .line 219
    return-object p0

    .line 220
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string p1, "("

    .line 223
    .line 224
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v2}, Lbsh/preprocess/KtStringTemplate;->joinWithPlus(Ljava/util/List;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-static {p0, p1, v6}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    return-object p0
.end method
