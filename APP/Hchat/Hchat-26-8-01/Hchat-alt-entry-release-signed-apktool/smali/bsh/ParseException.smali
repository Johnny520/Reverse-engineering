.class public Lbsh/ParseException;
.super Lbsh/EvalError;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L

.field private static sourceFile:Ljava/lang/String;


# instance fields
.field public currentToken:Lbsh/Token;

.field public expectedTokenSequences:[[I

.field public tokenImage:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    const-string v0, ""

    invoke-direct {p0, v0}, Lbsh/ParseException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/Token;[[I[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1, p2, p3}, Lbsh/ParseException;->initialise(Lbsh/Token;[[I[Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, v0, v1, v1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lbsh/ParseException;->currentToken:Lbsh/Token;

    .line 10
    .line 11
    iput-object p2, p0, Lbsh/ParseException;->expectedTokenSequences:[[I

    .line 12
    .line 13
    iput-object p3, p0, Lbsh/ParseException;->tokenImage:[Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, v0, v0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0, v0, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static add_escapes(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

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
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_7

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    if-eq v2, v3, :cond_6

    .line 20
    .line 21
    const/16 v3, 0xd

    .line 22
    .line 23
    if-eq v2, v3, :cond_5

    .line 24
    .line 25
    const/16 v3, 0x22

    .line 26
    .line 27
    if-eq v2, v3, :cond_4

    .line 28
    .line 29
    const/16 v3, 0x27

    .line 30
    .line 31
    if-eq v2, v3, :cond_3

    .line 32
    .line 33
    const/16 v3, 0x5c

    .line 34
    .line 35
    if-eq v2, v3, :cond_2

    .line 36
    .line 37
    packed-switch v2, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    if-lt v2, v3, :cond_1

    .line 47
    .line 48
    const/16 v3, 0x7e

    .line 49
    .line 50
    if-le v2, v3, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v4, "0000"

    .line 60
    .line 61
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/16 v4, 0x10

    .line 65
    .line 66
    invoke-static {v2, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/lit8 v3, v3, -0x4

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v3, "\\u"

    .line 92
    .line 93
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :pswitch_0
    const-string v2, "\\n"

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :pswitch_1
    const-string v2, "\\t"

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :pswitch_2
    const-string v2, "\\b"

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    const-string v2, "\\\\"

    .line 120
    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    const-string v2, "\\\'"

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    const-string v2, "\\\""

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    const-string v2, "\\r"

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_6
    const-string v2, "\\f"

    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0

    .line 157
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static initialise(Lbsh/Token;[[I[Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unable to parse code syntax. Encountered:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    :goto_0
    iget-object v1, v1, Lbsh/Token;->next:Lbsh/Token;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v2, " "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lbsh/Token;->image:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v2}, Lbsh/ParseException;->add_escapes(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v1, " at line "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lbsh/Token;->next:Lbsh/Token;

    .line 36
    .line 37
    iget v1, v1, Lbsh/Token;->beginLine:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", column "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lbsh/Token;->next:Lbsh/Token;

    .line 48
    .line 49
    iget p0, p0, Lbsh/Token;->beginColumn:I

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lbsh/ParseException;->sourceFile:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    const-string p0, " in: "

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lbsh/ParseException;->sourceFile:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_1
    sget-object p0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    array-length p0, p1

    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    const-string p0, "line.separator"

    .line 86
    .line 87
    const-string v1, "\n"

    .line 88
    .line 89
    invoke-static {p0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, "Exppected"

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    array-length p0, p1

    .line 102
    const/4 v1, 0x1

    .line 103
    if-le p0, v1, :cond_2

    .line 104
    .line 105
    const-string p0, " one of"

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_2
    const-string p0, ": "

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/4 p0, 0x0

    .line 116
    move v1, p0

    .line 117
    :goto_1
    array-length v2, p1

    .line 118
    if-ge v1, v2, :cond_4

    .line 119
    .line 120
    move v2, p0

    .line 121
    :goto_2
    aget-object v3, p1, v1

    .line 122
    .line 123
    array-length v4, v3

    .line 124
    if-ge v2, v4, :cond_3

    .line 125
    .line 126
    aget v3, v3, v2

    .line 127
    .line 128
    aget-object v3, p2, v3

    .line 129
    .line 130
    const/16 v4, 0x22

    .line 131
    .line 132
    const/16 v5, 0x20

    .line 133
    .line 134
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
.end method


# virtual methods
.method public getErrorLineNumber()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/ParseException;->currentToken:Lbsh/Token;

    .line 2
    .line 3
    iget-object v0, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 4
    .line 5
    iget v0, v0, Lbsh/Token;->beginLine:I

    .line 6
    .line 7
    return v0
.end method

.method public getErrorSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lbsh/ParseException;->sourceFile:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getErrorText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/ParseException;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/ParseException;->currentToken:Lbsh/Token;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/ParseException;->expectedTokenSequences:[[I

    .line 4
    .line 5
    iget-object v2, p0, Lbsh/ParseException;->tokenImage:[Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lbsh/ParseException;->initialise(Lbsh/Token;[[I[Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getMessage(Z)Ljava/lang/String;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lbsh/ParseException;->getMessage()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setErrorSourceFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p1, Lbsh/ParseException;->sourceFile:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/ParseException;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
