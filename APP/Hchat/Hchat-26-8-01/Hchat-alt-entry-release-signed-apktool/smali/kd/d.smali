.class public abstract Lkd/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 55

    .line 1
    const-string v0, "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "("

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "\\.)*"

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lkd/d;->b:Ljava/util/regex/Pattern;

    .line 44
    .line 45
    new-instance v0, Ljava/util/HashSet;

    .line 46
    .line 47
    const-string v53, "volatile"

    .line 48
    .line 49
    const-string v54, "while"

    .line 50
    .line 51
    const-string v1, "_"

    .line 52
    .line 53
    const-string v2, "abstract"

    .line 54
    .line 55
    const-string v3, "assert"

    .line 56
    .line 57
    const-string v4, "boolean"

    .line 58
    .line 59
    const-string v5, "break"

    .line 60
    .line 61
    const-string v6, "byte"

    .line 62
    .line 63
    const-string v7, "case"

    .line 64
    .line 65
    const-string v8, "catch"

    .line 66
    .line 67
    const-string v9, "char"

    .line 68
    .line 69
    const-string v10, "class"

    .line 70
    .line 71
    const-string v11, "const"

    .line 72
    .line 73
    const-string v12, "continue"

    .line 74
    .line 75
    const-string v13, "default"

    .line 76
    .line 77
    const-string v14, "do"

    .line 78
    .line 79
    const-string v15, "double"

    .line 80
    .line 81
    const-string v16, "else"

    .line 82
    .line 83
    const-string v17, "enum"

    .line 84
    .line 85
    const-string v18, "extends"

    .line 86
    .line 87
    const-string v19, "false"

    .line 88
    .line 89
    const-string v20, "final"

    .line 90
    .line 91
    const-string v21, "finally"

    .line 92
    .line 93
    const-string v22, "float"

    .line 94
    .line 95
    const-string v23, "for"

    .line 96
    .line 97
    const-string v24, "goto"

    .line 98
    .line 99
    const-string v25, "if"

    .line 100
    .line 101
    const-string v26, "implements"

    .line 102
    .line 103
    const-string v27, "import"

    .line 104
    .line 105
    const-string v28, "instanceof"

    .line 106
    .line 107
    const-string v29, "int"

    .line 108
    .line 109
    const-string v30, "interface"

    .line 110
    .line 111
    const-string v31, "long"

    .line 112
    .line 113
    const-string v32, "native"

    .line 114
    .line 115
    const-string v33, "new"

    .line 116
    .line 117
    const-string v34, "null"

    .line 118
    .line 119
    const-string v35, "package"

    .line 120
    .line 121
    const-string v36, "private"

    .line 122
    .line 123
    const-string v37, "protected"

    .line 124
    .line 125
    const-string v38, "public"

    .line 126
    .line 127
    const-string v39, "return"

    .line 128
    .line 129
    const-string v40, "short"

    .line 130
    .line 131
    const-string v41, "static"

    .line 132
    .line 133
    const-string v42, "strictfp"

    .line 134
    .line 135
    const-string v43, "super"

    .line 136
    .line 137
    const-string v44, "switch"

    .line 138
    .line 139
    const-string v45, "synchronized"

    .line 140
    .line 141
    const-string v46, "this"

    .line 142
    .line 143
    const-string v47, "throw"

    .line 144
    .line 145
    const-string v48, "throws"

    .line 146
    .line 147
    const-string v49, "transient"

    .line 148
    .line 149
    const-string v50, "true"

    .line 150
    .line 151
    const-string v51, "try"

    .line 152
    .line 153
    const-string v52, "void"

    .line 154
    .line 155
    filled-new-array/range {v1 .. v54}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    sput-object v0, Lkd/d;->c:Ljava/util/HashSet;

    .line 167
    .line 168
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 5

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
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v3}, Lkd/d;->b(I)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/2addr v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public static b(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x7e

    .line 6
    .line 7
    if-gt p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lkd/d;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-object v0, Lxe/q;->b:Lxe/q;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lkd/d;->c:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lkd/d;->a(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lkd/c;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v0, v1, v2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0}, Lxe/q;->j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
