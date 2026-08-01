.class public abstract synthetic Lxhss/ᛴᛸᛲᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final synthetic ᛷᛵᛵᲈ:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxhss/ᛴᛸᛲᛳ;->ᛷᛵᛵᲈ:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
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
    .end array-data
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Double;
    .locals 6

    .line 1
    const-string v0, "; at path "

    .line 2
    .line 3
    const-string v1, "JSON forbids NaN and infinities: "

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-virtual {v3}, Ljava/lang/Double;->isInfinite()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Double;->isNaN()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    iget v4, p1, Lxhss/ᛴᛷᛸᛷ;->ᛶᲇᲈᛸ:I

    .line 26
    .line 27
    if-ne v4, v2, :cond_2

    .line 28
    .line 29
    :cond_1
    return-object v3

    .line 30
    :cond_2
    new-instance v4, Lxhss/ᲈᲇᲁᲈ;

    .line 31
    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :goto_1
    new-instance v3, Lxhss/ᛵᛲᛲᲇ;

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v4, "Cannot parse "

    .line 67
    .line 68
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v3, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw v3
.end method

.method public static synthetic ᛱᛳᲁᲈ(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p0, "null"

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    const-string p0, "END_DOCUMENT"

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    const-string p0, "NULL"

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    const-string p0, "BOOLEAN"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    const-string p0, "NUMBER"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    const-string p0, "STRING"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    const-string p0, "NAME"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    const-string p0, "END_OBJECT"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    const-string p0, "BEGIN_OBJECT"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_8
    const-string p0, "END_ARRAY"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_9
    const-string p0, "BEGIN_ARRAY"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic ᛲᛴᲀᲈ(I)[I
    .locals 3

    .line 1
    new-array v0, p0, [I

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛴᛸᛲᛳ;->ᛷᛵᛵᲈ:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static ᛳᛶᛷᲀ(JJLxhss/ᲁᛶᛷ;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p4, p0}, Lxhss/ᲁᛶᛷ;->ᛱᲈᛳᛴ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static ᛳᲁᲇᛸ([C)I
    .locals 10

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-char v4, p0, v2

    .line 8
    .line 9
    const/4 v5, 0x7

    .line 10
    invoke-static {v5}, Lxhss/ᛴᛸᛲᛳ;->ᛲᛴᲀᲈ(I)[I

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    array-length v6, v5

    .line 15
    move v7, v1

    .line 16
    :goto_1
    if-ge v7, v6, :cond_1

    .line 17
    .line 18
    aget v8, v5, v7

    .line 19
    .line 20
    invoke-static {v8}, Lxhss/ᛴᛸᛲᛳ;->ᲀᲇᛳᲁ(I)C

    .line 21
    .line 22
    .line 23
    move-result v9

    .line 24
    if-ne v9, v4, :cond_0

    .line 25
    .line 26
    invoke-static {v8}, Lxhss/ᛴᛸᛲᛳ;->ᲇᛶᛴᲀ(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v1

    .line 35
    :goto_2
    or-int/2addr v3, v4

    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return v3
.end method

.method public static ᛳᲈᲈᛲ(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static ᛴᲈᛱᛴ(J)Lxhss/ᲁᛶᛷ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᲁᛶᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static ᛷᛴᛷᛱ(Ljava/lang/String;)Ljava/lang/String;
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
    if-ge v2, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_2

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    add-int/2addr v2, v3

    .line 66
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    :goto_1
    return-object p0
.end method

.method public static ᛷᛵᛵᲈ(ILxhss/ᛴᛷᛸᛷ;)Ljava/lang/Number;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_3

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :try_start_0
    invoke-static {p0}, Lxhss/ᲈᲀᲀᛱ;->ᛲᛴᲇᛲ(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object p0

    .line 19
    :catch_0
    move-exception v1

    .line 20
    new-instance v2, Lxhss/ᛵᛲᛲᲇ;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v3, "Cannot parse "

    .line 29
    .line 30
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "; at path "

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v2, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const/16 v0, 0x2e

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-ltz v0, :cond_1

    .line 63
    .line 64
    invoke-static {p0, p1}, Lxhss/ᛴᛸᛲᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Double;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    :try_start_1
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    goto :goto_0

    .line 78
    :catch_1
    invoke-static {p0, p1}, Lxhss/ᛴᛸᛲᛳ;->ᛱᛱᛲᲇ(Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Double;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_0
    return-object p0

    .line 83
    :cond_2
    new-instance p0, Lxhss/ᛴᛷᛴᲇ;

    .line 84
    .line 85
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛲᛴᲀᲈ()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p0, p1}, Lxhss/ᛴᛷᛴᲇ;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_3
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛴᲈᛱᛴ()D

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static ᛷᲁᲁ(Ljava/lang/Long;Lcom/tencent/mmkv/MMKV;Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, p2, v0, v1}, Lcom/tencent/mmkv/MMKV;->getLong(Ljava/lang/String;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static ᛸᛲᛷᛱ(J)Lxhss/ᛶᲈᛷᲁ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛶᲈᛷᲁ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛶᲈᛷᲁ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static ᛸᛲᲀᛵ(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛱᛱᛲᲇ()Lcom/tencent/mmkv/MMKV;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static ᛸᛴᛶᛳ(JLjava/lang/String;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p3, p4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static ᛸᛷᲈᲈ(Lxhss/ᛲᲁᲁᲁ;J)Lcom/tencent/mmkv/MMKV;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lxhss/ᛲᲁᲁᲁ;->ᛷᛵᛵᲈ()Lcom/tencent/mmkv/MMKV;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static synthetic ᲀᛷᲁᲀ(I)I
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    add-int/lit8 p0, p0, -0x1

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    throw p0
.end method

.method public static synthetic ᲀᲇᛳᲁ(I)C
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0

    .line 6
    :pswitch_0
    const/16 p0, 0x55

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/16 p0, 0x75

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_2
    const/16 p0, 0x73

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_3
    const/16 p0, 0x6d

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_4
    const/16 p0, 0x78

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_5
    const/16 p0, 0x69

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_6
    const/16 p0, 0x64

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic ᲁᛲᛴᛴ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static ᲁᛴᲇᛲ(JJLxhss/ᲁᛶᛷ;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p4, p0}, Lxhss/ᲁᛶᛷ;->ᛵᛲᲁᛶ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

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
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static synthetic ᲇᛶᛴᲀ(I)I
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0

    .line 6
    :pswitch_0
    const/16 p0, 0x100

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_1
    const/16 p0, 0x40

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_2
    const/16 p0, 0x20

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_3
    const/16 p0, 0x8

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_4
    const/4 p0, 0x4

    .line 19
    return p0

    .line 20
    :pswitch_5
    const/4 p0, 0x2

    .line 21
    return p0

    .line 22
    :pswitch_6
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ᲇᛸᛳᲁ(JJLxhss/ᲁᛶᛷ;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p4, p0}, Lxhss/ᲁᛶᛷ;->ᛱᲈᛳᛴ(Lxhss/ᲁᛶᛷ;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static ᲈᛲᛵᲁ(Ljava/lang/StringBuilder;Ljava/lang/String;C)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static ᲈᛳᲀ(Ljava/lang/Integer;Lcom/tencent/mmkv/MMKV;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1, p2, p0}, Lcom/tencent/mmkv/MMKV;->getInt(Ljava/lang/String;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
