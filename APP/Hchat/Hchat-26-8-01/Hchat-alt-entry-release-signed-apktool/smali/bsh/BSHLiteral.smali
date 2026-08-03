.class public final Lbsh/BSHLiteral;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static volatile internStrings:Z = true

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getEscapeChar(C)C
    .locals 1

    .line 1
    const/16 v0, 0x62

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0x66

    .line 6
    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x6e

    .line 10
    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x72

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x74

    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    const/16 p1, 0x9

    .line 23
    .line 24
    return p1

    .line 25
    :cond_1
    const/16 p1, 0xd

    .line 26
    .line 27
    return p1

    .line 28
    :cond_2
    const/16 p1, 0xa

    .line 29
    .line 30
    return p1

    .line 31
    :cond_3
    const/16 p1, 0xc

    .line 32
    .line 33
    return p1

    .line 34
    :cond_4
    const/16 p1, 0x8

    .line 35
    .line 36
    return p1
.end method


# virtual methods
.method public bridge synthetic add(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->add(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public charSetup(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-gt v0, v1, :cond_3

    .line 10
    .line 11
    const/16 v1, 0x5c

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-le v0, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-char v0, v0

    .line 51
    const/16 v1, 0xff

    .line 52
    .line 53
    if-ge v1, v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lbsh/BSHLiteral;->stringSetup(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-direct {p0, v0}, Lbsh/BSHLiteral;->getEscapeChar(C)C

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    :cond_2
    new-instance v1, Lbsh/Primitive;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lbsh/Primitive;-><init>(C)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lbsh/BSHLiteral;->value:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    invoke-virtual {p0, p1}, Lbsh/BSHLiteral;->stringSetup(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Lbsh/BSHLiteral;->stringSetup(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public bridge synthetic dump(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->dump(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lbsh/BSHLiteral;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic getId()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getLineNumber()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getLineNumber()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getSourceFile()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getText()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic hasNext()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic hasPrevious()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtAddChild(Lbsh/Node;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/SimpleNode;->jjtAddChild(Lbsh/Node;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtClose()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtClose()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtGetChild(I)Lbsh/Node;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic jjtGetChildren()[Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic jjtGetNumChildren()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtGetParent()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetParent()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic jjtOpen()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtOpen()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtSetParent(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtSetParent(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic next()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->next()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic nextIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->nextIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic previous()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previous()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic previousIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previousIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic set(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->set(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSourceFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->setSourceFile(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public stringSetup(Ljava/lang/String;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_4

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v4, 0x5c

    .line 18
    .line 19
    if-ne v3, v4, :cond_3

    .line 20
    .line 21
    add-int/lit8 v3, v2, 0x1

    .line 22
    .line 23
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/16 v6, 0x8

    .line 42
    .line 43
    if-ge v5, v6, :cond_2

    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    add-int/lit8 v5, v1, -0x1

    .line 48
    .line 49
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    move v5, v3

    .line 54
    :goto_1
    if-ge v5, v2, :cond_0

    .line 55
    .line 56
    add-int/lit8 v7, v5, 0x1

    .line 57
    .line 58
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_0

    .line 67
    .line 68
    invoke-static {v8}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-ge v8, v6, :cond_0

    .line 77
    .line 78
    move v5, v7

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    add-int/lit8 v2, v5, 0x1

    .line 81
    .line 82
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    const/4 v8, 0x3

    .line 91
    if-ne v7, v8, :cond_1

    .line 92
    .line 93
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-le v4, v8, :cond_1

    .line 102
    .line 103
    add-int/lit8 v2, v5, -0x1

    .line 104
    .line 105
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {v3, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-char v3, v3

    .line 114
    goto :goto_2

    .line 115
    :cond_1
    invoke-static {v2, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    int-to-char v2, v2

    .line 120
    move v3, v2

    .line 121
    move v2, v5

    .line 122
    goto :goto_2

    .line 123
    :cond_2
    invoke-direct {p0, v4}, Lbsh/BSHLiteral;->getEscapeChar(C)C

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move v10, v3

    .line 128
    move v3, v2

    .line 129
    move v2, v10

    .line 130
    :cond_3
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    sget-boolean v0, Lbsh/BSHLiteral;->internStrings:Z

    .line 141
    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :cond_5
    iput-object p1, p0, Lbsh/BSHLiteral;->value:Ljava/lang/Object;

    .line 149
    .line 150
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbsh/BSHLiteral;->value:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public bridge synthetic toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 28
    invoke-super {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
