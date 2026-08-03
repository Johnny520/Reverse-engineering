.class public final Lbsh/preprocess/DefaultArgsDesugar;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;,
        Lbsh/preprocess/DefaultArgsDesugar$MethodShape;,
        Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;
    }
.end annotation


# static fields
.field private static final CONTROL_KEYWORDS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final METHOD_MODIFIERS:Ljava/util/Set;
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
    .locals 14

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v12, "do"

    .line 4
    .line 5
    const-string v13, "try"

    .line 6
    .line 7
    const-string v1, "if"

    .line 8
    .line 9
    const-string v2, "for"

    .line 10
    .line 11
    const-string v3, "while"

    .line 12
    .line 13
    const-string v4, "switch"

    .line 14
    .line 15
    const-string v5, "catch"

    .line 16
    .line 17
    const-string v6, "synchronized"

    .line 18
    .line 19
    const-string v7, "new"

    .line 20
    .line 21
    const-string v8, "return"

    .line 22
    .line 23
    const-string v9, "throw"

    .line 24
    .line 25
    const-string v10, "assert"

    .line 26
    .line 27
    const-string v11, "case"

    .line 28
    .line 29
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lbsh/preprocess/DefaultArgsDesugar;->CONTROL_KEYWORDS:Ljava/util/Set;

    .line 41
    .line 42
    new-instance v0, Ljava/util/HashSet;

    .line 43
    .line 44
    const-string v9, "strictfp"

    .line 45
    .line 46
    const-string v10, "default"

    .line 47
    .line 48
    const-string v1, "public"

    .line 49
    .line 50
    const-string v2, "protected"

    .line 51
    .line 52
    const-string v3, "private"

    .line 53
    .line 54
    const-string v4, "static"

    .line 55
    .line 56
    const-string v5, "final"

    .line 57
    .line 58
    const-string v6, "synchronized"

    .line 59
    .line 60
    const-string v7, "native"

    .line 61
    .line 62
    const-string v8, "abstract"

    .line 63
    .line 64
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lbsh/preprocess/DefaultArgsDesugar;->METHOD_MODIFIERS:Ljava/util/Set;

    .line 76
    .line 77
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

.method private static buildBridgeArgs(Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;I)Ljava/lang/String;
    .locals 4

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
    const-string v2, ", "

    .line 8
    .line 9
    if-ge v1, p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramNames:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    iget-object v1, p0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge p1, v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-lez v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v1, p0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->defaultExpr:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method private static buildRewrittenMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;Ljava/util/Set;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

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
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/2addr v2, v1

    .line 12
    add-int/lit16 v2, v2, 0x80

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x28

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static {v2, v4, v3}, Lbsh/preprocess/DefaultArgsDesugar;->join(Ljava/util/List;II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v2, 0x29

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->shouldBridgeReturn(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    iget-object v3, p4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-int/lit8 v3, v3, -0x1

    .line 61
    .line 62
    :goto_0
    iget v5, p4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->requiredCount:I

    .line 63
    .line 64
    if-lt v3, v5, :cond_2

    .line 65
    .line 66
    iget-object v5, p4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p1, v5, v3}, Lbsh/preprocess/DefaultArgsDesugar;->methodSignatureKey(Ljava/lang/String;Ljava/util/List;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-interface {p5, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const/16 v6, 0xa

    .line 80
    .line 81
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v6, p4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v6, v4, v3}, Lbsh/preprocess/DefaultArgsDesugar;->join(Ljava/util/List;II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const/16 v6, 0x7b

    .line 106
    .line 107
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    if-eqz p3, :cond_1

    .line 111
    .line 112
    const-string v6, "return "

    .line 113
    .line 114
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-static {p4, v3}, Lbsh/preprocess/DefaultArgsDesugar;->buildBridgeArgs(Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v6, ");}"

    .line 131
    .line 132
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-interface {p5, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0
.end method

.method private static collectDeclaredMethodSignatures(Ljava/lang/String;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_3

    .line 12
    .line 13
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-le v3, v2, :cond_0

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/16 v4, 0x28

    .line 26
    .line 27
    if-eq v3, v4, :cond_2

    .line 28
    .line 29
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->tryParseMethodShape(Ljava/lang/String;I)Lbsh/preprocess/DefaultArgsDesugar$MethodShape;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    iget-object v2, v3, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->methodName:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, v3, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->parsed:Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;

    .line 41
    .line 42
    iget-object v4, v4, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-static {v2, v4, v5}, Lbsh/preprocess/DefaultArgsDesugar;->methodSignatureKey(Ljava/lang/String;Ljava/util/List;I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget v2, v3, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->declEndExclusive:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-object v0
.end method

.method private static extractParamName(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    :goto_0
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x5d

    .line 22
    .line 23
    if-ne v3, v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, v0, -0x1

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v4, 0x5b

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x2

    .line 36
    .line 37
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    if-gez v0, :cond_2

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 46
    .line 47
    :goto_1
    if-ltz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    add-int/2addr v0, v1

    .line 63
    if-lt v0, v3, :cond_4

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_4
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_5
    return-object v2
.end method

.method private static findDeclarationStart(Ljava/lang/String;I)I
    .locals 4

    .line 1
    :goto_0
    if-lez p1, :cond_6

    .line 2
    .line 3
    add-int/lit8 v0, p1, -0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x3b

    .line 10
    .line 11
    if-eq v0, v1, :cond_6

    .line 12
    .line 13
    const/16 v1, 0x7b

    .line 14
    .line 15
    if-eq v0, v1, :cond_6

    .line 16
    .line 17
    const/16 v1, 0x7d

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_5

    .line 22
    :cond_0
    const/16 v1, 0xd

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    if-eq v0, v2, :cond_2

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    :goto_2
    move v0, p1

    .line 35
    :goto_3
    if-lez v0, :cond_4

    .line 36
    .line 37
    add-int/lit8 v3, v0, -0x1

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eq v3, v2, :cond_4

    .line 44
    .line 45
    if-ne v3, v1, :cond_3

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    :goto_4
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_5
    const-string v1, "@"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    invoke-static {v0}, Lbsh/preprocess/DefaultArgsDesugar;->isModifierOnlyLine(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    :goto_5
    return p1
.end method

.method private static findMatching(Ljava/lang/String;ICC)I
    .locals 3

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
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

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
    if-ne v2, p2, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    if-ne v2, p3, :cond_2

    .line 27
    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const/4 p0, -0x1

    .line 37
    return p0
.end method

.method private static findMethodBodyStart(Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-lt p1, v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    const-string v0, "throws"

    .line 14
    .line 15
    invoke-static {p0, p1, v0}, Lbsh/preprocess/DefaultArgsDesugar;->startsWithWord(Ljava/lang/String;ILjava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipThrowsClause(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-gez p1, :cond_1

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-ge p1, v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/16 v0, 0x7b

    .line 43
    .line 44
    if-ne p0, v0, :cond_3

    .line 45
    .line 46
    return p1

    .line 47
    :cond_3
    return v1
.end method

.method private static findTopLevelAssign(Ljava/lang/String;)I
    .locals 14

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
    move v4, v3

    .line 9
    move v5, v4

    .line 10
    move v6, v5

    .line 11
    :goto_0
    if-ge v2, v0, :cond_e

    .line 12
    .line 13
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    if-le v7, v2, :cond_0

    .line 18
    .line 19
    move v2, v7

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/16 v8, 0x28

    .line 26
    .line 27
    if-ne v7, v8, :cond_1

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_1
    const/16 v8, 0x29

    .line 34
    .line 35
    if-ne v7, v8, :cond_2

    .line 36
    .line 37
    add-int/lit8 v3, v3, -0x1

    .line 38
    .line 39
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_2
    const/16 v8, 0x5b

    .line 46
    .line 47
    if-ne v7, v8, :cond_3

    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_3
    const/16 v8, 0x5d

    .line 54
    .line 55
    if-ne v7, v8, :cond_4

    .line 56
    .line 57
    add-int/lit8 v4, v4, -0x1

    .line 58
    .line 59
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/16 v8, 0x7b

    .line 65
    .line 66
    if-ne v7, v8, :cond_5

    .line 67
    .line 68
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v8, 0x7d

    .line 72
    .line 73
    if-ne v7, v8, :cond_6

    .line 74
    .line 75
    add-int/lit8 v5, v5, -0x1

    .line 76
    .line 77
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x3c

    .line 83
    .line 84
    if-ne v7, v8, :cond_7

    .line 85
    .line 86
    add-int/lit8 v6, v6, 0x1

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v9, 0x3e

    .line 90
    .line 91
    if-ne v7, v9, :cond_8

    .line 92
    .line 93
    add-int/lit8 v6, v6, -0x1

    .line 94
    .line 95
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    goto :goto_4

    .line 100
    :cond_8
    const/16 v10, 0x3d

    .line 101
    .line 102
    if-ne v7, v10, :cond_d

    .line 103
    .line 104
    if-nez v3, :cond_d

    .line 105
    .line 106
    if-nez v4, :cond_d

    .line 107
    .line 108
    if-nez v5, :cond_d

    .line 109
    .line 110
    if-nez v6, :cond_d

    .line 111
    .line 112
    if-lez v2, :cond_9

    .line 113
    .line 114
    add-int/lit8 v7, v2, -0x1

    .line 115
    .line 116
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    goto :goto_1

    .line 121
    :cond_9
    move v7, v1

    .line 122
    :goto_1
    add-int/lit8 v11, v2, 0x1

    .line 123
    .line 124
    if-ge v11, v0, :cond_a

    .line 125
    .line 126
    invoke-virtual {p0, v11}, Ljava/lang/String;->charAt(I)C

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    goto :goto_2

    .line 131
    :cond_a
    move v12, v1

    .line 132
    :goto_2
    if-eq v7, v10, :cond_c

    .line 133
    .line 134
    const/16 v13, 0x21

    .line 135
    .line 136
    if-eq v7, v13, :cond_c

    .line 137
    .line 138
    if-eq v7, v8, :cond_c

    .line 139
    .line 140
    if-eq v7, v9, :cond_c

    .line 141
    .line 142
    if-ne v12, v10, :cond_b

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_b
    return v2

    .line 146
    :cond_c
    :goto_3
    move v2, v11

    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_d
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_e
    const/4 p0, -0x1

    .line 154
    return p0
.end method

.method private static findTrailingNameIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x5d

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    add-int/lit8 v2, v0, -0x1

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    add-int/lit8 v0, v0, -0x2

    .line 32
    .line 33
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, -0x1

    .line 39
    if-gez v0, :cond_1

    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    add-int/lit8 v3, v0, 0x1

    .line 43
    .line 44
    :goto_1
    if-ltz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    add-int/2addr v0, v1

    .line 60
    if-lt v0, v3, :cond_3

    .line 61
    .line 62
    return v2

    .line 63
    :cond_3
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    return v0

    .line 74
    :cond_4
    return v2
.end method

.method private static isModifierOnlyLine(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-string v0, "//"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    const-string v0, "/*"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_5

    .line 17
    .line 18
    const-string v0, "*"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    const-string v0, "\\s+"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    array-length v0, p0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    array-length v0, p0

    .line 38
    move v2, v1

    .line 39
    :goto_0
    if-ge v2, v0, :cond_4

    .line 40
    .line 41
    aget-object v3, p0, v2

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v4, Lbsh/preprocess/DefaultArgsDesugar;->METHOD_MODIFIERS:Ljava/util/Set;

    .line 51
    .line 52
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    return v1

    .line 59
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_5
    :goto_2
    return v1
.end method

.method private static join(Ljava/util/List;II)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;II)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    if-lt p1, p2, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    move v1, p1

    .line 12
    :goto_0
    if-ge v1, p2, :cond_2

    .line 13
    .line 14
    if-le v1, p1, :cond_1

    .line 15
    .line 16
    const-string v2, ", "

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private static methodSignatureKey(Ljava/lang/String;Ljava/util/List;I)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/lang/String;"
        }
    .end annotation

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
    add-int/lit8 v1, v1, 0x20

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x28

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-ge p0, p2, :cond_1

    .line 22
    .line 23
    if-lez p0, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x2c

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Lbsh/preprocess/DefaultArgsDesugar;->signatureTypeKey(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    add-int/lit8 p0, p0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/16 p0, 0x29

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method private static normalizeTypeKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

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
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_4

    .line 16
    .line 17
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-le v3, v2, :cond_0

    .line 22
    .line 23
    move v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v4, 0x40

    .line 39
    .line 40
    if-ne v3, v4, :cond_2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->skipAnnotation(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v4, "final"

    .line 50
    .line 51
    invoke-static {p0, v2, v4}, Lbsh/preprocess/DefaultArgsDesugar;->startsWithWord(Ljava/lang/String;ILjava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method private static parseParams(Ljava/lang/String;)Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;
    .locals 9

    .line 1
    new-instance v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iput-boolean v2, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->trailingDefaults:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iput-boolean v2, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/16 v3, 0x2c

    .line 24
    .line 25
    invoke-static {p0, v3}, Lbsh/preprocess/DefaultArgsDesugar;->splitTopLevel(Ljava/lang/String;C)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    move v3, v1

    .line 30
    move v4, v3

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-ge v3, v5, :cond_8

    .line 36
    .line 37
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    iput-boolean v1, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    invoke-static {v5}, Lbsh/preprocess/DefaultArgsDesugar;->findTopLevelAssign(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-ltz v6, :cond_2

    .line 61
    .line 62
    invoke-virtual {v5, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v7, v5

    .line 68
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    if-ltz v6, :cond_3

    .line 73
    .line 74
    add-int/lit8 v6, v6, 0x1

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const/4 v5, 0x0

    .line 82
    :goto_2
    if-eqz v5, :cond_5

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    iput-boolean v1, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_4
    iput-boolean v2, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->hasDefault:Z

    .line 98
    .line 99
    move v4, v2

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    if-eqz v4, :cond_6

    .line 102
    .line 103
    iput-boolean v1, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->trailingDefaults:Z

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    iget v6, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->requiredCount:I

    .line 107
    .line 108
    add-int/2addr v6, v2

    .line 109
    iput v6, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->requiredCount:I

    .line 110
    .line 111
    :goto_3
    invoke-static {v7}, Lbsh/preprocess/DefaultArgsDesugar;->extractParamName(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-nez v6, :cond_7

    .line 116
    .line 117
    iput-boolean v1, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_7
    iget-object v8, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramDeclNoDefault:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v7, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->paramNames:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    iget-object v6, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->defaultExpr:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_8
    iput-boolean v2, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 139
    .line 140
    iget-boolean p0, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->hasDefault:Z

    .line 141
    .line 142
    if-nez p0, :cond_9

    .line 143
    .line 144
    iput-boolean v2, v0, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->trailingDefaults:Z

    .line 145
    .line 146
    :cond_9
    return-object v0
.end method

.method public static rewrite(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/16 v0, 0x3d

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_5

    .line 10
    .line 11
    const/16 v0, 0x28

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
    goto :goto_1

    .line 20
    :cond_0
    invoke-static {p0}, Lbsh/preprocess/DefaultArgsDesugar;->collectDeclaredMethodSignatures(Ljava/lang/String;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    add-int/lit16 v3, v3, 0x80

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    move v5, v4

    .line 41
    :goto_0
    if-ge v4, v3, :cond_4

    .line 42
    .line 43
    invoke-static {p0, v4}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-le v6, v4, :cond_1

    .line 48
    .line 49
    move v4, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eq v6, v0, :cond_3

    .line 56
    .line 57
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-static {p0, v4, v1}, Lbsh/preprocess/DefaultArgsDesugar;->tryRewriteMethod(Ljava/lang/String;ILjava/util/Set;)Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    iget v4, v6, Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;->declStart:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v4, v6, Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;->rewritten:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget v5, v6, Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;->declEndExclusive:I

    .line 77
    .line 78
    move v4, v5

    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-virtual {v2, p0, v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :cond_5
    :goto_1
    return-object p0
.end method

.method private static shouldBridgeReturn(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sub-int/2addr v0, p1

    .line 22
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    const-string p1, "\\s+"

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 p1, 0x0

    .line 44
    move v0, v1

    .line 45
    :goto_0
    array-length v2, p0

    .line 46
    if-ge v0, v2, :cond_4

    .line 47
    .line 48
    aget-object v2, p0, v0

    .line 49
    .line 50
    const-string v3, "@"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sget-object v3, Lbsh/preprocess/DefaultArgsDesugar;->METHOD_MODIFIERS:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move-object p1, v2

    .line 69
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    if-nez p1, :cond_5

    .line 73
    .line 74
    return v1

    .line 75
    :cond_5
    const-string p0, "void"

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    xor-int/lit8 p0, p0, 0x1

    .line 82
    .line 83
    return p0
.end method

.method private static signatureTypeKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lbsh/preprocess/DefaultArgsDesugar;->extractParamName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lbsh/preprocess/DefaultArgsDesugar;->normalizeTypeKey(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->findTrailingNameIndex(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Lbsh/preprocess/DefaultArgsDesugar;->normalizeTypeKey(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v1

    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lbsh/preprocess/DefaultArgsDesugar;->normalizeTypeKey(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method private static skipAnnotation(Ljava/lang/String;I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const/16 v2, 0x2e

    .line 18
    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ge p1, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/16 v2, 0x28

    .line 35
    .line 36
    if-ne v1, v2, :cond_3

    .line 37
    .line 38
    const/16 v1, 0x29

    .line 39
    .line 40
    invoke-static {p0, p1, v2, v1}, Lbsh/preprocess/DefaultArgsDesugar;->findMatching(Ljava/lang/String;ICC)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-gez p0, :cond_2

    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    add-int/lit8 p0, p0, 0x1

    .line 48
    .line 49
    return p0

    .line 50
    :cond_3
    return p1
.end method

.method private static skipLiteralOrComment(Ljava/lang/String;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz p1, :cond_e

    .line 6
    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_0
    const-string v1, "\"\"\""

    .line 12
    .line 13
    invoke-static {p0, p1, v1}, Lbsh/preprocess/DefaultArgsDesugar;->startsWith(Ljava/lang/String;ILjava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x3

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-gez p0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_1
    add-int/lit8 p0, p0, 0x3

    .line 30
    .line 31
    return p0

    .line 32
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/16 v2, 0x5c

    .line 37
    .line 38
    const/16 v3, 0x22

    .line 39
    .line 40
    if-ne v1, v3, :cond_5

    .line 41
    .line 42
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    :goto_1
    if-ge p1, v0, :cond_c

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-ne v1, v2, :cond_3

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    if-ne v1, v3, :cond_4

    .line 56
    .line 57
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    return p1

    .line 60
    :cond_4
    goto :goto_0

    .line 61
    :cond_5
    const/16 v3, 0x27

    .line 62
    .line 63
    if-ne v1, v3, :cond_8

    .line 64
    .line 65
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    :goto_3
    if-ge p1, v0, :cond_c

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-ne v1, v2, :cond_6

    .line 74
    .line 75
    add-int/lit8 p1, p1, 0x2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_6
    if-ne v1, v3, :cond_7

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    return p1

    .line 83
    :cond_7
    goto :goto_2

    .line 84
    :cond_8
    const/16 v2, 0x2f

    .line 85
    .line 86
    if-ne v1, v2, :cond_e

    .line 87
    .line 88
    add-int/lit8 v1, p1, 0x1

    .line 89
    .line 90
    if-ge v1, v0, :cond_e

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ne v1, v2, :cond_b

    .line 97
    .line 98
    add-int/lit8 p1, p1, 0x2

    .line 99
    .line 100
    :goto_4
    if-ge p1, v0, :cond_a

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/16 v2, 0xa

    .line 107
    .line 108
    if-eq v1, v2, :cond_a

    .line 109
    .line 110
    const/16 v2, 0xd

    .line 111
    .line 112
    if-ne v1, v2, :cond_9

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_9
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_a
    :goto_5
    return p1

    .line 119
    :cond_b
    const/16 v2, 0x2a

    .line 120
    .line 121
    if-ne v1, v2, :cond_e

    .line 122
    .line 123
    const-string v1, "*/"

    .line 124
    .line 125
    add-int/lit8 p1, p1, 0x2

    .line 126
    .line 127
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-gez p0, :cond_d

    .line 132
    .line 133
    :cond_c
    :goto_6
    return v0

    .line 134
    :cond_d
    add-int/lit8 p0, p0, 0x2

    .line 135
    .line 136
    return p0

    .line 137
    :cond_e
    :goto_7
    return p1
.end method

.method private static skipThrowsClause(Ljava/lang/String;I)I
    .locals 6

    .line 1
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "throws"

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Lbsh/preprocess/DefaultArgsDesugar;->startsWithWord(Ljava/lang/String;ILjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    add-int/lit8 p1, p1, 0x6

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    :goto_0
    move v2, v1

    .line 22
    :goto_1
    const/4 v3, -0x1

    .line 23
    if-ge p1, v0, :cond_8

    .line 24
    .line 25
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-lt p1, v0, :cond_1

    .line 30
    .line 31
    return v3

    .line 32
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/16 v5, 0x7b

    .line 37
    .line 38
    if-ne v4, v5, :cond_3

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    return v3

    .line 43
    :cond_2
    return p1

    .line 44
    :cond_3
    const/16 v5, 0x3b

    .line 45
    .line 46
    if-ne v4, v5, :cond_4

    .line 47
    .line 48
    return v3

    .line 49
    :cond_4
    if-eqz v2, :cond_7

    .line 50
    .line 51
    invoke-static {v4}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_5

    .line 56
    .line 57
    return v3

    .line 58
    :cond_5
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    if-ge p1, v0, :cond_6

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_5

    .line 71
    .line 72
    const/16 v3, 0x2e

    .line 73
    .line 74
    if-eq v2, v3, :cond_5

    .line 75
    .line 76
    const/16 v3, 0x24

    .line 77
    .line 78
    if-ne v2, v3, :cond_6

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    const/4 v2, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_7
    const/16 v2, 0x2c

    .line 84
    .line 85
    if-ne v4, v2, :cond_8

    .line 86
    .line 87
    add-int/lit8 p1, p1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    return v3
.end method

.method private static skipWsAndCommentsForward(Ljava/lang/String;I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    :goto_1
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-le v1, p1, :cond_1

    .line 27
    .line 28
    add-int/lit8 v2, p1, 0x1

    .line 29
    .line 30
    if-ge v2, v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0x2f

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    move p1, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return p1
.end method

.method private static skipWsBackward(Ljava/lang/String;I)I
    .locals 1

    .line 1
    :goto_0
    if-ltz p1, :cond_0

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
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return p1
.end method

.method private static splitTopLevel(Ljava/lang/String;C)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "C)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    move v4, v3

    .line 13
    move v5, v4

    .line 14
    move v6, v5

    .line 15
    move v7, v6

    .line 16
    move v8, v7

    .line 17
    :goto_0
    if-ge v3, v1, :cond_a

    .line 18
    .line 19
    invoke-static {p0, v3}, Lbsh/preprocess/DefaultArgsDesugar;->skipLiteralOrComment(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    if-le v9, v3, :cond_0

    .line 24
    .line 25
    move v3, v9

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    const/16 v10, 0x28

    .line 32
    .line 33
    if-ne v9, v10, :cond_1

    .line 34
    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v10, 0x29

    .line 39
    .line 40
    if-ne v9, v10, :cond_2

    .line 41
    .line 42
    add-int/lit8 v5, v5, -0x1

    .line 43
    .line 44
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/16 v10, 0x5b

    .line 50
    .line 51
    if-ne v9, v10, :cond_3

    .line 52
    .line 53
    add-int/lit8 v6, v6, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/16 v10, 0x5d

    .line 57
    .line 58
    if-ne v9, v10, :cond_4

    .line 59
    .line 60
    add-int/lit8 v6, v6, -0x1

    .line 61
    .line 62
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    const/16 v10, 0x7b

    .line 68
    .line 69
    if-ne v9, v10, :cond_5

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    const/16 v10, 0x7d

    .line 75
    .line 76
    if-ne v9, v10, :cond_6

    .line 77
    .line 78
    add-int/lit8 v7, v7, -0x1

    .line 79
    .line 80
    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    goto :goto_1

    .line 85
    :cond_6
    const/16 v10, 0x3c

    .line 86
    .line 87
    if-ne v9, v10, :cond_7

    .line 88
    .line 89
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    const/16 v10, 0x3e

    .line 93
    .line 94
    if-ne v9, v10, :cond_8

    .line 95
    .line 96
    add-int/lit8 v8, v8, -0x1

    .line 97
    .line 98
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    goto :goto_1

    .line 103
    :cond_8
    if-ne v9, p1, :cond_9

    .line 104
    .line 105
    if-nez v5, :cond_9

    .line 106
    .line 107
    if-nez v6, :cond_9

    .line 108
    .line 109
    if-nez v7, :cond_9

    .line 110
    .line 111
    if-nez v8, :cond_9

    .line 112
    .line 113
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 v4, v3, 0x1

    .line 121
    .line 122
    :cond_9
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_a
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    return-object v0
.end method

.method private static startsWith(Ljava/lang/String;ILjava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    add-int/2addr v1, p1

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt v1, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, p1, p2, v0, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    return v0
.end method

.method private static startsWithWord(Ljava/lang/String;ILjava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    add-int/2addr v1, p1

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0, p1, p2, v0, v1}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
    add-int/lit8 v1, p1, -0x1

    .line 28
    .line 29
    if-ltz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    add-int/2addr p2, p1

    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-ge p2, p1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return v0

    .line 65
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_5
    :goto_1
    return v0
.end method

.method private static tryParseMethodShape(Ljava/lang/String;I)Lbsh/preprocess/DefaultArgsDesugar$MethodShape;
    .locals 7

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    invoke-static {p0, v0}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    move v1, v0

    .line 10
    :goto_0
    if-lez v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v2, v1, -0x1

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-static {v2}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    if-lt v1, v0, :cond_1

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_a

    .line 45
    .line 46
    sget-object v3, Lbsh/preprocess/DefaultArgsDesugar;->CONTROL_KEYWORDS:Ljava/util/Set;

    .line 47
    .line 48
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    add-int/lit8 v3, v1, -0x1

    .line 56
    .line 57
    invoke-static {p0, v3}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsBackward(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-ltz v3, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/16 v4, 0x2e

    .line 68
    .line 69
    if-eq v3, v4, :cond_3

    .line 70
    .line 71
    const/16 v4, 0x3a

    .line 72
    .line 73
    if-eq v3, v4, :cond_3

    .line 74
    .line 75
    const/16 v4, 0x24

    .line 76
    .line 77
    if-ne v3, v4, :cond_4

    .line 78
    .line 79
    :cond_3
    return-object v2

    .line 80
    :cond_4
    const/16 v3, 0x28

    .line 81
    .line 82
    const/16 v4, 0x29

    .line 83
    .line 84
    invoke-static {p0, p1, v3, v4}, Lbsh/preprocess/DefaultArgsDesugar;->findMatching(Ljava/lang/String;ICC)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-gez v3, :cond_5

    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_5
    add-int/lit8 v4, v3, 0x1

    .line 92
    .line 93
    invoke-static {p0, v4}, Lbsh/preprocess/DefaultArgsDesugar;->skipWsAndCommentsForward(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-ge v5, v6, :cond_6

    .line 102
    .line 103
    const-string v6, "->"

    .line 104
    .line 105
    invoke-virtual {p0, v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_6

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_6
    invoke-static {p0, v4}, Lbsh/preprocess/DefaultArgsDesugar;->findMethodBodyStart(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-gez v4, :cond_7

    .line 117
    .line 118
    return-object v2

    .line 119
    :cond_7
    const/16 v5, 0x7b

    .line 120
    .line 121
    const/16 v6, 0x7d

    .line 122
    .line 123
    invoke-static {p0, v4, v5, v6}, Lbsh/preprocess/DefaultArgsDesugar;->findMatching(Ljava/lang/String;ICC)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-gez v4, :cond_8

    .line 128
    .line 129
    return-object v2

    .line 130
    :cond_8
    add-int/lit8 p1, p1, 0x1

    .line 131
    .line 132
    invoke-virtual {p0, p1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Lbsh/preprocess/DefaultArgsDesugar;->parseParams(Ljava/lang/String;)Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-boolean v3, p1, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 141
    .line 142
    if-nez v3, :cond_9

    .line 143
    .line 144
    return-object v2

    .line 145
    :cond_9
    invoke-static {p0, v1}, Lbsh/preprocess/DefaultArgsDesugar;->findDeclarationStart(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    new-instance v1, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;

    .line 150
    .line 151
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    invoke-direct {v1, p0, v4, v0, p1}, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;-><init>(IILjava/lang/String;Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :cond_a
    :goto_1
    return-object v2
.end method

.method private static tryRewriteMethod(Ljava/lang/String;ILjava/util/Set;)Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lbsh/preprocess/DefaultArgsDesugar;->tryParseMethodShape(Ljava/lang/String;I)Lbsh/preprocess/DefaultArgsDesugar$MethodShape;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v6, v0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->parsed:Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;

    .line 10
    .line 11
    iget-boolean v2, v6, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->valid:Z

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-boolean v2, v6, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->hasDefault:Z

    .line 16
    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    iget-boolean v2, v6, Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;->trailingDefaults:Z

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget v8, v0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->declStart:I

    .line 25
    .line 26
    const/16 v2, 0x28

    .line 27
    .line 28
    const/16 v3, 0x29

    .line 29
    .line 30
    invoke-static {p0, p1, v2, v3}, Lbsh/preprocess/DefaultArgsDesugar;->findMatching(Ljava/lang/String;ICC)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p0, v8, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    invoke-static {p0, v2}, Lbsh/preprocess/DefaultArgsDesugar;->findMethodBodyStart(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-gez v3, :cond_2

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/16 v1, 0x7b

    .line 52
    .line 53
    const/16 v2, 0x7d

    .line 54
    .line 55
    invoke-static {p0, v3, v1, v2}, Lbsh/preprocess/DefaultArgsDesugar;->findMatching(Ljava/lang/String;ICC)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v3, v0, Lbsh/preprocess/DefaultArgsDesugar$MethodShape;->methodName:Ljava/lang/String;

    .line 66
    .line 67
    move-object v2, p1

    .line 68
    move-object v7, p2

    .line 69
    invoke-static/range {v2 .. v7}, Lbsh/preprocess/DefaultArgsDesugar;->buildRewrittenMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbsh/preprocess/DefaultArgsDesugar$ParsedParams;Ljava/util/Set;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;

    .line 74
    .line 75
    invoke-direct {p1, v8, v1, p0}, Lbsh/preprocess/DefaultArgsDesugar$MethodRewrite;-><init>(IILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_3
    :goto_0
    return-object v1
.end method
