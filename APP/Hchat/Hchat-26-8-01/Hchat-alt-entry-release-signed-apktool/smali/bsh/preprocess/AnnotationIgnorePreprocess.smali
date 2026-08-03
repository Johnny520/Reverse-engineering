.class public final Lbsh/preprocess/AnnotationIgnorePreprocess;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final BSH_AT_OPERATORS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v21, "right_shift_assign"

    .line 4
    .line 5
    const-string v22, "right_unsigned_shift_assign"

    .line 6
    .line 7
    const-string v1, "gt"

    .line 8
    .line 9
    const-string v2, "lt"

    .line 10
    .line 11
    const-string v3, "lteq"

    .line 12
    .line 13
    const-string v4, "gteq"

    .line 14
    .line 15
    const-string v5, "or"

    .line 16
    .line 17
    const-string v6, "and"

    .line 18
    .line 19
    const-string v7, "bitwise_and"

    .line 20
    .line 21
    const-string v8, "bitwise_or"

    .line 22
    .line 23
    const-string v9, "bitwise_xor"

    .line 24
    .line 25
    const-string v10, "mod"

    .line 26
    .line 27
    const-string v11, "pow"

    .line 28
    .line 29
    const-string v12, "left_shift"

    .line 30
    .line 31
    const-string v13, "right_shift"

    .line 32
    .line 33
    const-string v14, "right_unsigned_shift"

    .line 34
    .line 35
    const-string v15, "and_assign"

    .line 36
    .line 37
    const-string v16, "or_assign"

    .line 38
    .line 39
    const-string v17, "xor_assign"

    .line 40
    .line 41
    const-string v18, "mod_assign"

    .line 42
    .line 43
    const-string v19, "pow_assign"

    .line 44
    .line 45
    const-string v20, "left_shift_assign"

    .line 46
    .line 47
    filled-new-array/range {v1 .. v22}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lbsh/preprocess/AnnotationIgnorePreprocess;->BSH_AT_OPERATORS:Ljava/util/Set;

    .line 59
    .line 60
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private static findMatchingParen(Ljava/lang/String;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge p1, v0, :cond_3

    .line 7
    .line 8
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-le v2, p1, :cond_0

    .line 13
    .line 14
    add-int/lit8 p1, v2, -0x1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x28

    .line 22
    .line 23
    if-ne v2, v3, :cond_1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v3, 0x29

    .line 29
    .line 30
    if-ne v2, v3, :cond_2

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/4 p0, -0x1

    .line 41
    return p0
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
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->isTripleQuote(Ljava/lang/String;I)Z

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

.method private static isAliasPart(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x5f

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

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

.method private static isInlineWhitespace(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
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

.method private static parseAnnotationEnd(Ljava/lang/String;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ge p1, v0, :cond_9

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    move v2, p1

    .line 23
    :goto_0
    if-ge v2, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v3, "interface"

    .line 43
    .line 44
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    return v1

    .line 51
    :cond_2
    if-ge v2, v0, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/16 v3, 0x2e

    .line 58
    .line 59
    if-ne p1, v3, :cond_5

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    if-ge v2, v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    if-ge v2, v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    :goto_2
    return v1

    .line 92
    :cond_5
    :goto_3
    if-ge v2, v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->isInlineWhitespace(C)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    if-ge v2, v0, :cond_8

    .line 108
    .line 109
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 v0, 0x28

    .line 114
    .line 115
    if-ne p1, v0, :cond_8

    .line 116
    .line 117
    invoke-static {p0, v2}, Lbsh/preprocess/AnnotationIgnorePreprocess;->findMatchingParen(Ljava/lang/String;I)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-gez p0, :cond_7

    .line 122
    .line 123
    return v1

    .line 124
    :cond_7
    add-int/lit8 p0, p0, 0x1

    .line 125
    .line 126
    return p0

    .line 127
    :cond_8
    return v2

    .line 128
    :cond_9
    :goto_4
    return v1
.end method

.method private static parseBshOperatorAlias(Ljava/lang/String;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ge p1, v0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Lbsh/preprocess/AnnotationIgnorePreprocess;->isAliasPart(C)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v2, p1

    .line 22
    :goto_0
    if-ge v2, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Lbsh/preprocess/AnnotationIgnorePreprocess;->isAliasPart(C)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v3, Lbsh/preprocess/AnnotationIgnorePreprocess;->BSH_AT_OPERATORS:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {v3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    if-ge v2, v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    return v1

    .line 63
    :cond_3
    return v2

    .line 64
    :cond_4
    :goto_1
    return v1
.end method

.method public static rewrite(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_b

    .line 2
    .line 3
    const/16 v0, 0x40

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    :cond_1
    :goto_0
    if-ge v3, v1, :cond_a

    .line 24
    .line 25
    invoke-static {p0, v3}, Lbsh/preprocess/AnnotationIgnorePreprocess;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-le v4, v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2, p0, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :goto_1
    move v3, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eq v4, v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {p0, v3}, Lbsh/preprocess/AnnotationIgnorePreprocess;->parseBshOperatorAlias(Ljava/lang/String;I)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-le v4, v3, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2, p0, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-static {p0, v3}, Lbsh/preprocess/AnnotationIgnorePreprocess;->parseAnnotationEnd(Ljava/lang/String;I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-le v4, v3, :cond_9

    .line 67
    .line 68
    :goto_3
    if-ge v3, v4, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/16 v6, 0xa

    .line 75
    .line 76
    if-eq v5, v6, :cond_5

    .line 77
    .line 78
    const/16 v6, 0xd

    .line 79
    .line 80
    if-ne v5, v6, :cond_6

    .line 81
    .line 82
    :cond_5
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_7
    move v3, v4

    .line 89
    :goto_4
    if-ge v3, v1, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/16 v5, 0x20

    .line 96
    .line 97
    if-eq v4, v5, :cond_8

    .line 98
    .line 99
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const/16 v5, 0x9

    .line 104
    .line 105
    if-ne v4, v5, :cond_1

    .line 106
    .line 107
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_9
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    :cond_b
    :goto_5
    return-object p0
.end method

.method private static skipLiteralOrComment(Ljava/lang/String;I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x22

    .line 14
    .line 15
    if-ne v1, v2, :cond_4

    .line 16
    .line 17
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->isTripleQuote(Ljava/lang/String;I)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x3

    .line 24
    .line 25
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->findTripleQuoteEnd(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-gez p0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 p0, p0, 0x3

    .line 33
    .line 34
    return p0

    .line 35
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->findNormalStringEnd(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-gez p0, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    return p0

    .line 47
    :cond_4
    const/16 v2, 0x27

    .line 48
    .line 49
    if-ne v1, v2, :cond_6

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->findCharLiteralEnd(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-gez p0, :cond_5

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    add-int/lit8 p0, p0, 0x1

    .line 61
    .line 62
    return p0

    .line 63
    :cond_6
    const/16 v2, 0x2f

    .line 64
    .line 65
    if-ne v1, v2, :cond_a

    .line 66
    .line 67
    add-int/lit8 v1, p1, 0x1

    .line 68
    .line 69
    if-ge v1, v0, :cond_a

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ne v1, v2, :cond_8

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x2

    .line 78
    .line 79
    :goto_0
    if-ge p1, v0, :cond_7

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/16 v2, 0xa

    .line 86
    .line 87
    if-eq v1, v2, :cond_7

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/16 v2, 0xd

    .line 94
    .line 95
    if-eq v1, v2, :cond_7

    .line 96
    .line 97
    add-int/lit8 p1, p1, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    return p1

    .line 101
    :cond_8
    const/16 v2, 0x2a

    .line 102
    .line 103
    if-ne v1, v2, :cond_a

    .line 104
    .line 105
    add-int/lit8 p1, p1, 0x2

    .line 106
    .line 107
    invoke-static {p0, p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->findBlockCommentEnd(Ljava/lang/String;I)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-gez p0, :cond_9

    .line 112
    .line 113
    :goto_1
    return v0

    .line 114
    :cond_9
    add-int/lit8 p0, p0, 0x2

    .line 115
    .line 116
    return p0

    .line 117
    :cond_a
    :goto_2
    return p1
.end method
