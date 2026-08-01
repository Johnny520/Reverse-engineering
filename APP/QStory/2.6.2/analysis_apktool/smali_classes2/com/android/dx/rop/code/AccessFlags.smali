.class public final Lcom/android/dx/rop/code/AccessFlags;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final ACC_ABSTRACT:I = 0x400

.field public static final ACC_ANNOTATION:I = 0x2000

.field public static final ACC_BRIDGE:I = 0x40

.field public static final ACC_CONSTRUCTOR:I = 0x10000

.field public static final ACC_DECLARED_SYNCHRONIZED:I = 0x20000

.field public static final ACC_ENUM:I = 0x4000

.field public static final ACC_FINAL:I = 0x10

.field public static final ACC_INTERFACE:I = 0x200

.field public static final ACC_NATIVE:I = 0x100

.field public static final ACC_PRIVATE:I = 0x2

.field public static final ACC_PROTECTED:I = 0x4

.field public static final ACC_PUBLIC:I = 0x1

.field public static final ACC_STATIC:I = 0x8

.field public static final ACC_STRICT:I = 0x800

.field public static final ACC_SUPER:I = 0x20

.field public static final ACC_SYNCHRONIZED:I = 0x20

.field public static final ACC_SYNTHETIC:I = 0x1000

.field public static final ACC_TRANSIENT:I = 0x80

.field public static final ACC_VARARGS:I = 0x80

.field public static final ACC_VOLATILE:I = 0x40

.field public static final CLASS_FLAGS:I = 0x7631

.field private static final CONV_CLASS:I = 0x1

.field private static final CONV_FIELD:I = 0x2

.field private static final CONV_METHOD:I = 0x3

.field public static final FIELD_FLAGS:I = 0x50df

.field public static final INNER_CLASS_FLAGS:I = 0x761f

.field public static final METHOD_FLAGS:I = 0x31dff


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

.method public static classString(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x7631

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lcom/android/dx/rop/code/AccessFlags;->humanHelper(III)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static fieldString(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x50df

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {p0, v0, v1}, Lcom/android/dx/rop/code/AccessFlags;->humanHelper(III)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static humanHelper(III)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    not-int v1, p1

    .line 9
    and-int/2addr v1, p0

    .line 10
    and-int/2addr p0, p1

    .line 11
    and-int/lit8 p1, p0, 0x1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p1, "|public"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 p1, p0, 0x2

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const-string p1, "|private"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_1
    and-int/lit8 p1, p0, 0x4

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const-string p1, "|protected"

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_2
    and-int/lit8 p1, p0, 0x8

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    const-string p1, "|static"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_3
    and-int/lit8 p1, p0, 0x10

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    const-string p1, "|final"

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_4
    and-int/lit8 p1, p0, 0x20

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    if-ne p2, v2, :cond_5

    .line 62
    .line 63
    const-string p1, "|super"

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    const-string p1, "|synchronized"

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_0
    and-int/lit8 p1, p0, 0x40

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    if-eqz p1, :cond_8

    .line 78
    .line 79
    if-ne p2, v3, :cond_7

    .line 80
    .line 81
    const-string p1, "|bridge"

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_7
    const-string p1, "|volatile"

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :cond_8
    :goto_1
    and-int/lit16 p1, p0, 0x80

    .line 93
    .line 94
    if-eqz p1, :cond_a

    .line 95
    .line 96
    if-ne p2, v3, :cond_9

    .line 97
    .line 98
    const-string p1, "|varargs"

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_9
    const-string p1, "|transient"

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_a
    :goto_2
    and-int/lit16 p1, p0, 0x100

    .line 110
    .line 111
    if-eqz p1, :cond_b

    .line 112
    .line 113
    const-string p1, "|native"

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_b
    and-int/lit16 p1, p0, 0x200

    .line 119
    .line 120
    if-eqz p1, :cond_c

    .line 121
    .line 122
    const-string p1, "|interface"

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_c
    and-int/lit16 p1, p0, 0x400

    .line 128
    .line 129
    if-eqz p1, :cond_d

    .line 130
    .line 131
    const-string p1, "|abstract"

    .line 132
    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    :cond_d
    and-int/lit16 p1, p0, 0x800

    .line 137
    .line 138
    if-eqz p1, :cond_e

    .line 139
    .line 140
    const-string p1, "|strictfp"

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_e
    and-int/lit16 p1, p0, 0x1000

    .line 146
    .line 147
    if-eqz p1, :cond_f

    .line 148
    .line 149
    const-string p1, "|synthetic"

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    :cond_f
    and-int/lit16 p1, p0, 0x2000

    .line 155
    .line 156
    if-eqz p1, :cond_10

    .line 157
    .line 158
    const-string p1, "|annotation"

    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    :cond_10
    and-int/lit16 p1, p0, 0x4000

    .line 164
    .line 165
    if-eqz p1, :cond_11

    .line 166
    .line 167
    const-string p1, "|enum"

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    :cond_11
    const/high16 p1, 0x10000

    .line 173
    .line 174
    and-int/2addr p1, p0

    .line 175
    if-eqz p1, :cond_12

    .line 176
    .line 177
    const-string p1, "|constructor"

    .line 178
    .line 179
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :cond_12
    const/high16 p1, 0x20000

    .line 183
    .line 184
    and-int/2addr p0, p1

    .line 185
    if-eqz p0, :cond_13

    .line 186
    .line 187
    const-string p0, "|declared_synchronized"

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :cond_13
    if-nez v1, :cond_14

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-nez p0, :cond_15

    .line 199
    .line 200
    :cond_14
    const/16 p0, 0x7c

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    :cond_15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0
.end method

.method public static innerClassString(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x761f

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p0, v0, v1}, Lcom/android/dx/rop/code/AccessFlags;->humanHelper(III)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public static isAbstract(I)Z
    .locals 0

    .line 1
    and-int/lit16 p0, p0, 0x400

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isAnnotation(I)Z
    .locals 0

    .line 1
    and-int/lit16 p0, p0, 0x2000

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isConstructor(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x10000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public static isDeclaredSynchronized(I)Z
    .locals 1

    .line 1
    const/high16 v0, 0x20000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public static isEnum(I)Z
    .locals 0

    .line 1
    and-int/lit16 p0, p0, 0x4000

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isInterface(I)Z
    .locals 0

    .line 1
    and-int/lit16 p0, p0, 0x200

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isNative(I)Z
    .locals 0

    .line 1
    and-int/lit16 p0, p0, 0x100

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isPrivate(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x2

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isProtected(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x4

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isPublic(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p0, v0

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static isStatic(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x8

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static isSynchronized(I)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x20

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static methodString(I)Ljava/lang/String;
    .locals 2

    .line 1
    const v0, 0x31dff

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    invoke-static {p0, v0, v1}, Lcom/android/dx/rop/code/AccessFlags;->humanHelper(III)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
