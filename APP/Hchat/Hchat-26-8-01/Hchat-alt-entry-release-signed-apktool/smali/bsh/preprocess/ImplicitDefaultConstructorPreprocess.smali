.class public final Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;
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

.method private static findCharEnd(Ljava/lang/String;II)I
    .locals 3

    .line 1
    :goto_0
    const/4 v0, -0x1

    .line 2
    if-ge p1, p2, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/16 v2, 0x5c

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/16 v2, 0x27

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    return p1

    .line 20
    :cond_1
    const/16 v2, 0xa

    .line 21
    .line 22
    if-eq v1, v2, :cond_3

    .line 23
    .line 24
    const/16 v2, 0xd

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    :goto_2
    return v0
.end method

.method private static findClassBodyStart(Ljava/lang/String;II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge p1, p2, :cond_9

    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-le v3, p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 p1, v3, -0x1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x28

    .line 20
    .line 21
    if-eq v3, v4, :cond_7

    .line 22
    .line 23
    const/16 v4, 0x29

    .line 24
    .line 25
    if-eq v3, v4, :cond_6

    .line 26
    .line 27
    const/16 v4, 0x3c

    .line 28
    .line 29
    if-eq v3, v4, :cond_5

    .line 30
    .line 31
    const/16 v4, 0x3e

    .line 32
    .line 33
    if-eq v3, v4, :cond_4

    .line 34
    .line 35
    const/16 v4, 0x5b

    .line 36
    .line 37
    if-eq v3, v4, :cond_3

    .line 38
    .line 39
    const/16 v4, 0x5d

    .line 40
    .line 41
    if-eq v3, v4, :cond_2

    .line 42
    .line 43
    const/16 v4, 0x7b

    .line 44
    .line 45
    if-eq v3, v4, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-nez v1, :cond_8

    .line 49
    .line 50
    if-nez v0, :cond_8

    .line 51
    .line 52
    if-nez v2, :cond_8

    .line 53
    .line 54
    return p1

    .line 55
    :cond_2
    if-lez v2, :cond_8

    .line 56
    .line 57
    add-int/lit8 v2, v2, -0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    if-lez v1, :cond_8

    .line 64
    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_6
    if-lez v0, :cond_8

    .line 72
    .line 73
    add-int/lit8 v0, v0, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    :cond_8
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    const/4 p0, -0x1

    .line 82
    return p0
.end method

.method private static findMatching(Ljava/lang/String;IICC)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge p1, p2, :cond_3

    .line 3
    .line 4
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-le v1, p1, :cond_0

    .line 9
    .line 10
    add-int/lit8 p1, v1, -0x1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v1, p3, :cond_1

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    if-ne v1, p4, :cond_2

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    return p1

    .line 29
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    const/4 p0, -0x1

    .line 33
    return p0
.end method

.method private static findStringEnd(Ljava/lang/String;II)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x5c

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/16 v1, 0x22

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 p0, -0x1

    .line 23
    return p0
.end method

.method private static findTripleQuoteEnd(Ljava/lang/String;II)I
    .locals 3

    .line 1
    :goto_0
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x22

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, -0x1

    .line 32
    return p0
.end method

.method private static hasTopLevelConstructor(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v2, v0, :cond_7

    .line 9
    .line 10
    invoke-static {p0, v2, v0}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-le v4, v2, :cond_1

    .line 15
    .line 16
    :cond_0
    move v2, v4

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v5, 0x7b

    .line 23
    .line 24
    if-ne v4, v5, :cond_3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    const/16 v6, 0x7d

    .line 32
    .line 33
    if-ne v4, v6, :cond_4

    .line 34
    .line 35
    if-lez v3, :cond_2

    .line 36
    .line 37
    add-int/lit8 v3, v3, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    if-nez v3, :cond_2

    .line 41
    .line 42
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    add-int/lit8 v4, v2, 0x1

    .line 49
    .line 50
    :goto_2
    if-ge v4, v0, :cond_5

    .line 51
    .line 52
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v6}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_5

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    invoke-virtual {p0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    invoke-static {p0, v4, v0}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipWsAndCommentsForward(Ljava/lang/String;II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ge v2, v0, :cond_0

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/16 v7, 0x28

    .line 86
    .line 87
    if-ne v6, v7, :cond_0

    .line 88
    .line 89
    const/16 v6, 0x29

    .line 90
    .line 91
    invoke-static {p0, v2, v0, v7, v6}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findMatching(Ljava/lang/String;IICC)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-ltz v2, :cond_0

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    invoke-static {p0, v2, v0}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipWsAndCommentsForward(Ljava/lang/String;II)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const-string v6, "throws"

    .line 104
    .line 105
    invoke-static {p0, v2, v0, v6}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->isKeywordAt(Ljava/lang/String;IILjava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x6

    .line 112
    .line 113
    invoke-static {p0, v2, v0}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipThrowsClause(Ljava/lang/String;II)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    :cond_6
    invoke-static {p0, v2, v0}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipWsAndCommentsForward(Ljava/lang/String;II)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ge v2, v0, :cond_0

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-ne v2, v5, :cond_0

    .line 128
    .line 129
    const/4 p0, 0x1

    .line 130
    return p0

    .line 131
    :cond_7
    return v1
.end method

.method private static isKeywordAt(Ljava/lang/String;IILjava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz p1, :cond_5

    .line 7
    .line 8
    add-int v2, p1, v0

    .line 9
    .line 10
    if-le v2, p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p3, v1, v0}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p3, 0x1

    .line 21
    if-lez p1, :cond_3

    .line 22
    .line 23
    sub-int/2addr p1, p3

    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const/16 v0, 0x2e

    .line 35
    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    const/16 v0, 0x24

    .line 39
    .line 40
    if-ne p1, v0, :cond_3

    .line 41
    .line 42
    :cond_2
    return v1

    .line 43
    :cond_3
    if-ge v2, p2, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    return v1

    .line 56
    :cond_4
    return p3

    .line 57
    :cond_5
    :goto_0
    return v1
.end method

.method private static isTripleQuote(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    return p2

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static rewrite(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "class"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p0, v0, v1}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->rewriteSegment(Ljava/lang/String;II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    :goto_0
    return-object p0
.end method

.method private static rewriteSegment(Ljava/lang/String;II)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    sub-int v1, p2, p1

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x40

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    move v1, p1

    .line 11
    :goto_0
    if-ge p1, p2, :cond_8

    .line 12
    .line 13
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-le v2, p1, :cond_0

    .line 18
    .line 19
    move p1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v2, "class"

    .line 22
    .line 23
    invoke-static {p0, p1, p2, v2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->isKeywordAt(Ljava/lang/String;IILjava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    add-int/lit8 v2, p1, 0x5

    .line 33
    .line 34
    invoke-static {p0, v2, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipWsAndCommentsForward(Ljava/lang/String;II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, p2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    add-int/lit8 p1, v2, 0x1

    .line 52
    .line 53
    :goto_2
    if-ge p1, p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findClassBodyStart(Ljava/lang/String;II)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-gez v3, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/16 v4, 0x7b

    .line 80
    .line 81
    const/16 v5, 0x7d

    .line 82
    .line 83
    invoke-static {p0, v3, p2, v4, v5}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findMatching(Ljava/lang/String;IICC)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-gez v4, :cond_6

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/4 v6, 0x0

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-static {p1, v6, v7}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->rewriteSegment(Ljava/lang/String;II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {p1, v2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->hasTopLevelConstructor(Ljava/lang/String;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-virtual {v0, p0, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    const/16 p1, 0x20

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string p1, "(){}"

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_7
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    add-int/lit8 v1, v4, 0x1

    .line 134
    .line 135
    move p1, v1

    .line 136
    goto :goto_0

    .line 137
    :cond_8
    invoke-virtual {v0, p0, v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method

.method private static skipLiteralOrComment(Ljava/lang/String;II)I
    .locals 4

    .line 1
    if-lt p1, p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x22

    .line 10
    .line 11
    if-ne v0, v1, :cond_4

    .line 12
    .line 13
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->isTripleQuote(Ljava/lang/String;II)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x3

    .line 20
    .line 21
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findTripleQuoteEnd(Ljava/lang/String;II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-gez p0, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    add-int/lit8 p0, p0, 0x3

    .line 29
    .line 30
    return p0

    .line 31
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findStringEnd(Ljava/lang/String;II)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-gez p0, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 41
    .line 42
    return p0

    .line 43
    :cond_4
    const/16 v1, 0x27

    .line 44
    .line 45
    if-ne v0, v1, :cond_6

    .line 46
    .line 47
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->findCharEnd(Ljava/lang/String;II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-gez p0, :cond_5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_5
    add-int/lit8 p0, p0, 0x1

    .line 57
    .line 58
    return p0

    .line 59
    :cond_6
    const/16 v1, 0x2f

    .line 60
    .line 61
    if-ne v0, v1, :cond_b

    .line 62
    .line 63
    add-int/lit8 v0, p1, 0x1

    .line 64
    .line 65
    if-ge v0, p2, :cond_b

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-ne v0, v1, :cond_8

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x2

    .line 74
    .line 75
    :goto_0
    if-ge p1, p2, :cond_7

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    if-eq v0, v1, :cond_7

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/16 v1, 0xd

    .line 90
    .line 91
    if-eq v0, v1, :cond_7

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_7
    return p1

    .line 97
    :cond_8
    const/16 v2, 0x2a

    .line 98
    .line 99
    if-ne v0, v2, :cond_b

    .line 100
    .line 101
    add-int/lit8 p1, p1, 0x2

    .line 102
    .line 103
    :goto_1
    add-int/lit8 v0, p1, 0x1

    .line 104
    .line 105
    if-ge v0, p2, :cond_a

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ne v3, v2, :cond_9

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ne v3, v1, :cond_9

    .line 118
    .line 119
    add-int/lit8 p1, p1, 0x2

    .line 120
    .line 121
    return p1

    .line 122
    :cond_9
    move p1, v0

    .line 123
    goto :goto_1

    .line 124
    :cond_a
    :goto_2
    return p2

    .line 125
    :cond_b
    :goto_3
    return p1
.end method

.method private static skipThrowsClause(Ljava/lang/String;II)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge p1, p2, :cond_9

    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-le v3, p1, :cond_0

    .line 11
    .line 12
    move p1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x28

    .line 19
    .line 20
    if-eq v3, v4, :cond_7

    .line 21
    .line 22
    const/16 v4, 0x29

    .line 23
    .line 24
    if-eq v3, v4, :cond_6

    .line 25
    .line 26
    const/16 v4, 0x3b

    .line 27
    .line 28
    if-eq v3, v4, :cond_5

    .line 29
    .line 30
    const/16 v4, 0x3c

    .line 31
    .line 32
    if-eq v3, v4, :cond_4

    .line 33
    .line 34
    const/16 v4, 0x3e

    .line 35
    .line 36
    if-eq v3, v4, :cond_3

    .line 37
    .line 38
    const/16 v4, 0x5b

    .line 39
    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x5d

    .line 43
    .line 44
    if-eq v3, v4, :cond_1

    .line 45
    .line 46
    const/16 v4, 0x7b

    .line 47
    .line 48
    if-eq v3, v4, :cond_5

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-lez v2, :cond_8

    .line 52
    .line 53
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    if-lez v1, :cond_8

    .line 60
    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    if-nez v1, :cond_8

    .line 68
    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    if-nez v2, :cond_8

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_6
    if-lez v0, :cond_8

    .line 75
    .line 76
    add-int/lit8 v0, v0, -0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    :cond_8
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_9
    :goto_2
    return p1
.end method

.method private static skipWsAndCommentsForward(Ljava/lang/String;II)I
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0, p1, p2}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->skipLiteralOrComment(Ljava/lang/String;II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-le v0, p1, :cond_1

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return p1
.end method
