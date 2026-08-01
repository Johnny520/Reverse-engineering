.class public final enum Lorg/apache/commons/io/FileSystem;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/io/FileSystem;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/io/FileSystem;

.field private static final CURRENT:Lorg/apache/commons/io/FileSystem;

.field public static final enum GENERIC:Lorg/apache/commons/io/FileSystem;

.field private static final IS_OS_LINUX:Z

.field private static final IS_OS_MAC:Z

.field private static final IS_OS_WINDOWS:Z

.field public static final enum LINUX:Lorg/apache/commons/io/FileSystem;

.field public static final enum MAC_OSX:Lorg/apache/commons/io/FileSystem;

.field private static final OS_NAME_WINDOWS_PREFIX:Ljava/lang/String; = "Windows"

.field public static final enum WINDOWS:Lorg/apache/commons/io/FileSystem;


# instance fields
.field private final blockSize:I

.field private final casePreserving:Z

.field private final caseSensitive:Z

.field private final illegalFileNameChars:[I

.field private final maxFileNameLength:I

.field private final maxPathLength:I

.field private final nameSeparator:C

.field private final nameSeparatorOther:C

.field private final reservedFileNames:[Ljava/lang/String;

.field private final reservedFileNamesExtensions:Z

.field private final supportsDriveLetter:Z


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/io/FileSystem;
    .locals 4

    .line 1
    sget-object v0, Lorg/apache/commons/io/FileSystem;->GENERIC:Lorg/apache/commons/io/FileSystem;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/io/FileSystem;->MAC_OSX:Lorg/apache/commons/io/FileSystem;

    .line 6
    .line 7
    sget-object v3, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lorg/apache/commons/io/FileSystem;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 39

    .line 1
    new-instance v0, Lorg/apache/commons/io/FileSystem;

    .line 2
    .line 3
    const/4 v13, 0x0

    .line 4
    filled-new-array {v13}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    new-array v9, v13, [Ljava/lang/String;

    .line 9
    .line 10
    const/4 v11, 0x0

    .line 11
    const/16 v12, 0x2f

    .line 12
    .line 13
    const-string v1, "GENERIC"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/16 v3, 0x1000

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const v6, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const v7, 0x7fffffff

    .line 24
    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    invoke-direct/range {v0 .. v12}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IIZZII[I[Ljava/lang/String;ZZC)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lorg/apache/commons/io/FileSystem;->GENERIC:Lorg/apache/commons/io/FileSystem;

    .line 31
    .line 32
    new-instance v14, Lorg/apache/commons/io/FileSystem;

    .line 33
    .line 34
    const/16 v0, 0x2f

    .line 35
    .line 36
    filled-new-array {v13, v0}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v22

    .line 40
    new-array v1, v13, [Ljava/lang/String;

    .line 41
    .line 42
    const/16 v25, 0x0

    .line 43
    .line 44
    const/16 v26, 0x2f

    .line 45
    .line 46
    const-string v15, "LINUX"

    .line 47
    .line 48
    const/16 v16, 0x1

    .line 49
    .line 50
    const/16 v17, 0x2000

    .line 51
    .line 52
    const/16 v18, 0x1

    .line 53
    .line 54
    const/16 v19, 0x1

    .line 55
    .line 56
    const/16 v20, 0xff

    .line 57
    .line 58
    const/16 v21, 0x1000

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    move-object/from16 v23, v1

    .line 63
    .line 64
    invoke-direct/range {v14 .. v26}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IIZZII[I[Ljava/lang/String;ZZC)V

    .line 65
    .line 66
    .line 67
    sput-object v14, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    .line 68
    .line 69
    new-instance v15, Lorg/apache/commons/io/FileSystem;

    .line 70
    .line 71
    const/16 v1, 0x3a

    .line 72
    .line 73
    filled-new-array {v13, v0, v1}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v23

    .line 77
    new-array v0, v13, [Ljava/lang/String;

    .line 78
    .line 79
    const/16 v26, 0x0

    .line 80
    .line 81
    const/16 v27, 0x2f

    .line 82
    .line 83
    const-string v16, "MAC_OSX"

    .line 84
    .line 85
    const/16 v17, 0x2

    .line 86
    .line 87
    const/16 v18, 0x1000

    .line 88
    .line 89
    const/16 v20, 0x1

    .line 90
    .line 91
    const/16 v21, 0xff

    .line 92
    .line 93
    const/16 v22, 0x400

    .line 94
    .line 95
    move-object/from16 v24, v0

    .line 96
    .line 97
    invoke-direct/range {v15 .. v27}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IIZZII[I[Ljava/lang/String;ZZC)V

    .line 98
    .line 99
    .line 100
    sput-object v15, Lorg/apache/commons/io/FileSystem;->MAC_OSX:Lorg/apache/commons/io/FileSystem;

    .line 101
    .line 102
    new-instance v0, Lorg/apache/commons/io/FileSystem;

    .line 103
    .line 104
    const/16 v1, 0x29

    .line 105
    .line 106
    new-array v8, v1, [I

    .line 107
    .line 108
    fill-array-data v8, :array_0

    .line 109
    .line 110
    .line 111
    const-string v37, "NUL"

    .line 112
    .line 113
    const-string v38, "PRN"

    .line 114
    .line 115
    const-string v9, "AUX"

    .line 116
    .line 117
    const-string v10, "COM1"

    .line 118
    .line 119
    const-string v11, "COM2"

    .line 120
    .line 121
    const-string v12, "COM3"

    .line 122
    .line 123
    const-string v13, "COM4"

    .line 124
    .line 125
    const-string v14, "COM5"

    .line 126
    .line 127
    const-string v15, "COM6"

    .line 128
    .line 129
    const-string v16, "COM7"

    .line 130
    .line 131
    const-string v17, "COM8"

    .line 132
    .line 133
    const-string v18, "COM9"

    .line 134
    .line 135
    const-string v19, "COM\u00b2"

    .line 136
    .line 137
    const-string v20, "COM\u00b3"

    .line 138
    .line 139
    const-string v21, "COM\u00b9"

    .line 140
    .line 141
    const-string v22, "CON"

    .line 142
    .line 143
    const-string v23, "CONIN$"

    .line 144
    .line 145
    const-string v24, "CONOUT$"

    .line 146
    .line 147
    const-string v25, "LPT1"

    .line 148
    .line 149
    const-string v26, "LPT2"

    .line 150
    .line 151
    const-string v27, "LPT3"

    .line 152
    .line 153
    const-string v28, "LPT4"

    .line 154
    .line 155
    const-string v29, "LPT5"

    .line 156
    .line 157
    const-string v30, "LPT6"

    .line 158
    .line 159
    const-string v31, "LPT7"

    .line 160
    .line 161
    const-string v32, "LPT8"

    .line 162
    .line 163
    const-string v33, "LPT9"

    .line 164
    .line 165
    const-string v34, "LPT\u00b2"

    .line 166
    .line 167
    const-string v35, "LPT\u00b3"

    .line 168
    .line 169
    const-string v36, "LPT\u00b9"

    .line 170
    .line 171
    filled-new-array/range {v9 .. v38}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    const/4 v11, 0x1

    .line 176
    const/16 v12, 0x5c

    .line 177
    .line 178
    const-string v1, "WINDOWS"

    .line 179
    .line 180
    const/4 v2, 0x3

    .line 181
    const/4 v5, 0x1

    .line 182
    const/16 v6, 0xff

    .line 183
    .line 184
    const/16 v7, 0x7d00

    .line 185
    .line 186
    const/4 v10, 0x1

    .line 187
    invoke-direct/range {v0 .. v12}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IIZZII[I[Ljava/lang/String;ZZC)V

    .line 188
    .line 189
    .line 190
    sput-object v0, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    .line 191
    .line 192
    invoke-static {}, Lorg/apache/commons/io/FileSystem;->$values()[Lorg/apache/commons/io/FileSystem;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sput-object v0, Lorg/apache/commons/io/FileSystem;->$VALUES:[Lorg/apache/commons/io/FileSystem;

    .line 197
    .line 198
    const-string v0, "Linux"

    .line 199
    .line 200
    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_LINUX:Z

    .line 205
    .line 206
    const-string v0, "Mac"

    .line 207
    .line 208
    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_MAC:Z

    .line 213
    .line 214
    const-string v0, "Windows"

    .line 215
    .line 216
    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_WINDOWS:Z

    .line 221
    .line 222
    invoke-static {}, Lorg/apache/commons/io/FileSystem;->current()Lorg/apache/commons/io/FileSystem;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sput-object v0, Lorg/apache/commons/io/FileSystem;->CURRENT:Lorg/apache/commons/io/FileSystem;

    .line 227
    .line 228
    return-void

    .line 229
    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x22
        0x2a
        0x2f
        0x3a
        0x3c
        0x3e
        0x3f
        0x5c
        0x7c
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;IIZZII[I[Ljava/lang/String;ZZC)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZII[I[",
            "Ljava/lang/String;",
            "ZZC)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lorg/apache/commons/io/FileSystem;->blockSize:I

    .line 5
    .line 6
    iput p6, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    .line 7
    .line 8
    iput p7, p0, Lorg/apache/commons/io/FileSystem;->maxPathLength:I

    .line 9
    .line 10
    const-string p1, "illegalFileNameChars"

    .line 11
    .line 12
    invoke-static {p8, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object p8, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 16
    .line 17
    const-string p1, "reservedFileNames"

    .line 18
    .line 19
    invoke-static {p9, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iput-object p9, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p10, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNamesExtensions:Z

    .line 25
    .line 26
    iput-boolean p4, p0, Lorg/apache/commons/io/FileSystem;->caseSensitive:Z

    .line 27
    .line 28
    iput-boolean p5, p0, Lorg/apache/commons/io/FileSystem;->casePreserving:Z

    .line 29
    .line 30
    iput-boolean p11, p0, Lorg/apache/commons/io/FileSystem;->supportsDriveLetter:Z

    .line 31
    .line 32
    iput-char p12, p0, Lorg/apache/commons/io/FileSystem;->nameSeparator:C

    .line 33
    .line 34
    sget-object p1, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 35
    .line 36
    const/16 p1, 0x5c

    .line 37
    .line 38
    const/16 p2, 0x2f

    .line 39
    .line 40
    if-ne p12, p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-ne p12, p1, :cond_1

    .line 44
    .line 45
    move p1, p2

    .line 46
    :goto_0
    iput-char p1, p0, Lorg/apache/commons/io/FileSystem;->nameSeparatorOther:C

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-static {p12}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0
.end method

.method private static current()Lorg/apache/commons/io/FileSystem;
    .locals 1

    .line 1
    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_LINUX:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_MAC:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lorg/apache/commons/io/FileSystem;->MAC_OSX:Lorg/apache/commons/io/FileSystem;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_WINDOWS:Z

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    sget-object v0, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    sget-object v0, Lorg/apache/commons/io/FileSystem;->GENERIC:Lorg/apache/commons/io/FileSystem;

    .line 23
    .line 24
    return-object v0
.end method

.method public static getCurrent()Lorg/apache/commons/io/FileSystem;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/FileSystem;->CURRENT:Lorg/apache/commons/io/FileSystem;

    .line 2
    .line 3
    return-object v0
.end method

.method private static getOsMatchesName(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "os.name"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getSystemProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0}, Lorg/apache/commons/io/FileSystem;->isOsNameMatch(Ljava/lang/String;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static getSystemProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Caught a SecurityException reading the system property \'"

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, "\'; the SystemUtils property value will default to null."

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method private static indexOf(Ljava/lang/CharSequence;II)I
    .locals 8

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-gez p2, :cond_1

    .line 18
    .line 19
    move p2, v1

    .line 20
    :cond_1
    const/high16 v2, 0x10000

    .line 21
    .line 22
    const/4 v3, -0x1

    .line 23
    if-ge p1, v2, :cond_4

    .line 24
    .line 25
    :goto_0
    if-ge p2, v0, :cond_3

    .line 26
    .line 27
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, p1, :cond_2

    .line 32
    .line 33
    return p2

    .line 34
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return v3

    .line 38
    :cond_4
    const v2, 0x10ffff

    .line 39
    .line 40
    .line 41
    if-gt p1, v2, :cond_6

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Character;->toChars(I)[C

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    const/4 v2, 0x1

    .line 48
    add-int/lit8 v4, v0, -0x1

    .line 49
    .line 50
    if-ge p2, v4, :cond_6

    .line 51
    .line 52
    invoke-interface {p0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    add-int/lit8 v5, p2, 0x1

    .line 57
    .line 58
    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    aget-char v7, p1, v1

    .line 63
    .line 64
    if-ne v4, v7, :cond_5

    .line 65
    .line 66
    aget-char v2, p1, v2

    .line 67
    .line 68
    if-ne v6, v2, :cond_5

    .line 69
    .line 70
    return p2

    .line 71
    :cond_5
    move p2, v5

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    return v3
.end method

.method private isIllegalFileNameChar(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 2
    .line 3
    invoke-static {p0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

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

.method private static isOsNameMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private synthetic lambda$toLegalFileName$0(CI)I
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    return p2
.end method

.method private static replace(Ljava/lang/String;CC)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/io/FileSystem;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/io/FileSystem;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/io/FileSystem;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/io/FileSystem;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/FileSystem;->$VALUES:[Lorg/apache/commons/io/FileSystem;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/io/FileSystem;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/io/FileSystem;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lorg/apache/commons/io/FileSystem;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/FileSystem;CI)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/FileSystem;->lambda$toLegalFileName$0(CI)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public getBlockSize()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/io/FileSystem;->blockSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getIllegalFileNameChars()[C
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [C

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge v1, v3, :cond_0

    .line 11
    .line 12
    aget v2, v2, v1

    .line 13
    .line 14
    int-to-char v2, v2

    .line 15
    aput-char v2, v0, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0
.end method

.method public getIllegalFileNameCodePoints()[I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 2
    .line 3
    invoke-virtual {p0}, [I->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [I

    .line 8
    .line 9
    return-object p0
.end method

.method public getMaxFileNameLength()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxPathLength()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/io/FileSystem;->maxPathLength:I

    .line 2
    .line 3
    return p0
.end method

.method public getNameSeparator()C
    .locals 0

    .line 1
    iget-char p0, p0, Lorg/apache/commons/io/FileSystem;->nameSeparator:C

    .line 2
    .line 3
    return p0
.end method

.method public getReservedFileNames()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public isCasePreserving()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/io/FileSystem;->casePreserving:Z

    .line 2
    .line 3
    return p0
.end method

.method public isCaseSensitive()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/io/FileSystem;->caseSensitive:Z

    .line 2
    .line 3
    return p0
.end method

.method public isLegalFileName(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    .line 14
    .line 15
    if-le v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/FileSystem;->isReservedFileName(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->chars()Ljava/util/stream/IntStream;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲苏兰;

    .line 30
    .line 31
    invoke-direct {v0, p0}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲苏兰;-><init>(Lorg/apache/commons/io/FileSystem;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/stream/IntStream;->noneMatch(Ljava/util/function/IntPredicate;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public isReservedFileName(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNamesExtensions:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/FileSystem;->trimExtension(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iget-object p0, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0, p1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-ltz p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public normalizeSeparators(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-char v0, p0, Lorg/apache/commons/io/FileSystem;->nameSeparatorOther:C

    .line 2
    .line 3
    iget-char p0, p0, Lorg/apache/commons/io/FileSystem;->nameSeparator:C

    .line 4
    .line 5
    invoke-static {p1, v0, p0}, Lorg/apache/commons/io/FileSystem;->replace(Ljava/lang/String;CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public supportsDriveLetter()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/io/FileSystem;->supportsDriveLetter:Z

    .line 2
    .line 3
    return p0
.end method

.method public toLegalFileName(Ljava/lang/String;C)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const-string p2, "\\0"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    filled-new-array {p2, v0, p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p2, "The replacement character \'%s\' cannot be one of the %s illegal characters: %s"

    .line 33
    .line 34
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v1, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    if-le v0, v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->chars()Ljava/util/stream/IntStream;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世苏兰哲;

    .line 60
    .line 61
    invoke-direct {v0, p0, p2}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世苏兰哲;-><init>(Lorg/apache/commons/io/FileSystem;C)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0}, Ljava/util/stream/IntStream;->map(Ljava/util/function/IntUnaryOperator;)Ljava/util/stream/IntStream;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Ljava/util/stream/IntStream;->toArray()[I

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance p1, Ljava/lang/String;

    .line 73
    .line 74
    array-length p2, p0

    .line 75
    invoke-direct {p1, p0, v2, p2}, Ljava/lang/String;-><init>([III)V

    .line 76
    .line 77
    .line 78
    return-object p1
.end method

.method public trimExtension(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const/16 p0, 0x2e

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, p0, v0}, Lorg/apache/commons/io/FileSystem;->indexOf(Ljava/lang/CharSequence;II)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-gez p0, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-interface {p1, v0, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
