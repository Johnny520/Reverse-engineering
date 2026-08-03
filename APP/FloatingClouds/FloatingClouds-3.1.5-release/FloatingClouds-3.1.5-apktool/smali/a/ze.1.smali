.class public La/ze;
.super La/ye;
.source "SourceFile"


# direct methods
.method public static C(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x30

    if-ge v2, v4, :cond_1

    const/4 v4, -0x1

    goto :goto_0

    :cond_1
    if-ne v2, v4, :cond_2

    move v4, v1

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    const v5, -0x7fffffff

    if-gez v4, :cond_6

    if-ne v0, v3, :cond_3

    goto :goto_3

    :cond_3
    const/16 v4, 0x2b

    if-eq v2, v4, :cond_5

    const/16 v4, 0x2d

    if-eq v2, v4, :cond_4

    goto :goto_3

    :cond_4
    const/high16 v5, -0x80000000

    move v2, v3

    goto :goto_1

    :cond_5
    move v2, v1

    goto :goto_1

    :cond_6
    move v2, v1

    move v3, v2

    :goto_1
    const v4, -0x38e38e3

    move v6, v4

    :goto_2
    if-ge v3, v0, :cond_b

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xa

    invoke-static {v7, v8}, Ljava/lang/Character;->digit(II)I

    move-result v7

    if-gez v7, :cond_7

    goto :goto_3

    :cond_7
    if-ge v1, v6, :cond_8

    if-ne v6, v4, :cond_9

    div-int/lit8 v6, v5, 0xa

    if-ge v1, v6, :cond_8

    goto :goto_3

    :cond_8
    mul-int/lit8 v1, v1, 0xa

    add-int v8, v5, v7

    if-ge v1, v8, :cond_a

    :cond_9
    :goto_3
    const/4 p0, 0x0

    return-object p0

    :cond_a
    sub-int/2addr v1, v7

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_b
    if-eqz v2, :cond_c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_c
    neg-int p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
