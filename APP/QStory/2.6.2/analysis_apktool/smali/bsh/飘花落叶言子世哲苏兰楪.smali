.class public final Lbsh/飘花落叶言子世哲苏兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:[C

.field public 飘花落叶言子楪哲世兰苏:[C

.field public 飘花落叶言子楪哲世苏兰:Z

.field public 飘花落叶言子楪哲苏世兰:I

.field public 飘花落叶言子楪哲苏兰世:Ljava/io/Reader;

.field public 飘花落叶言子楪苏世兰哲:[I

.field public 飘花落叶言子楪苏世哲兰:I

.field public 飘花落叶言子楪苏兰世哲:I

.field public 飘花落叶言子楪苏兰哲世:Z

.field public 飘花落叶言子楪苏哲世兰:[I

.field public 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰(II)V

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏世兰:I

    .line 10
    .line 11
    const/16 v0, 0x1000

    .line 12
    .line 13
    new-array v0, v0, [C

    .line 14
    .line 15
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世兰苏:[C

    .line 16
    .line 17
    iput-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏兰世:Ljava/io/Reader;

    .line 18
    .line 19
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(C)I
    .locals 3

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    packed-switch p0, :pswitch_data_1

    .line 5
    .line 6
    .line 7
    packed-switch p0, :pswitch_data_2

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/IOException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Invalid hex char \'"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, "\' (="

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ") provided!"

    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :pswitch_0
    const/16 p0, 0xf

    .line 44
    .line 45
    return p0

    .line 46
    :pswitch_1
    const/16 p0, 0xe

    .line 47
    .line 48
    return p0

    .line 49
    :pswitch_2
    const/16 p0, 0xd

    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_3
    const/16 p0, 0xc

    .line 53
    .line 54
    return p0

    .line 55
    :pswitch_4
    const/16 p0, 0xb

    .line 56
    .line 57
    return p0

    .line 58
    :pswitch_5
    const/16 p0, 0xa

    .line 59
    .line 60
    return p0

    .line 61
    :pswitch_6
    const/16 p0, 0x9

    .line 62
    .line 63
    return p0

    .line 64
    :pswitch_7
    const/16 p0, 0x8

    .line 65
    .line 66
    return p0

    .line 67
    :pswitch_8
    const/4 p0, 0x7

    .line 68
    return p0

    .line 69
    :pswitch_9
    const/4 p0, 0x6

    .line 70
    return p0

    .line 71
    :pswitch_a
    const/4 p0, 0x5

    .line 72
    return p0

    .line 73
    :pswitch_b
    const/4 p0, 0x4

    .line 74
    return p0

    .line 75
    :pswitch_c
    const/4 p0, 0x3

    .line 76
    return p0

    .line 77
    :pswitch_d
    const/4 p0, 0x2

    .line 78
    return p0

    .line 79
    :pswitch_e
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :pswitch_f
    const/4 p0, 0x0

    .line 82
    return p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(C)V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 6
    .line 7
    iget-boolean v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰:Z

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-boolean v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰:Z

    .line 15
    .line 16
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 17
    .line 18
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰哲世:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iput-boolean v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰哲世:Z

    .line 29
    .line 30
    if-ne p1, v2, :cond_1

    .line 31
    .line 32
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 36
    .line 37
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 41
    .line 42
    :cond_2
    :goto_0
    const/16 v0, 0x9

    .line 43
    .line 44
    if-eq p1, v0, :cond_5

    .line 45
    .line 46
    if-eq p1, v2, :cond_4

    .line 47
    .line 48
    const/16 v0, 0xd

    .line 49
    .line 50
    if-eq p1, v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰哲世:Z

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰:Z

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    iget p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 60
    .line 61
    sub-int/2addr p1, v1

    .line 62
    rem-int/lit8 v0, p1, 0x1

    .line 63
    .line 64
    sub-int/2addr v1, v0

    .line 65
    add-int/2addr v1, p1

    .line 66
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 67
    .line 68
    :goto_1
    iget p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 69
    .line 70
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 71
    .line 72
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 73
    .line 74
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 75
    .line 76
    aput p1, v1, v2

    .line 77
    .line 78
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 79
    .line 80
    aput v0, p0, v2

    .line 81
    .line 82
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 4

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    div-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 6
    .line 7
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 8
    .line 9
    if-ne v2, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-gez v3, :cond_0

    .line 13
    .line 14
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-le v3, v1, :cond_1

    .line 20
    .line 21
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 22
    .line 23
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 24
    .line 25
    iput v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲(Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    if-le v2, v3, :cond_3

    .line 33
    .line 34
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_3
    sub-int v0, v3, v2

    .line 38
    .line 39
    if-ge v0, v1, :cond_4

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    iput v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 47
    .line 48
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    iget-object v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/String;

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-direct {p0, v2, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 19
    .line 20
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    sub-int/2addr v3, v1

    .line 23
    invoke-direct {v0, v2, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 29
    .line 30
    iget p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 31
    .line 32
    add-int/lit8 p0, p0, 0x1

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {v1, v2, v3, p0}, Ljava/lang/String;-><init>([CII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)V
    .locals 8

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    new-array v2, v1, [C

    .line 6
    .line 7
    new-array v3, v1, [I

    .line 8
    .line 9
    new-array v4, v1, [I

    .line 10
    .line 11
    iget v5, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 12
    .line 13
    sub-int/2addr v0, v5

    .line 14
    iget-object v6, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {v6, v5, v2, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 23
    .line 24
    iget v5, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 25
    .line 26
    invoke-static {p1, v7, v2, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 30
    .line 31
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 32
    .line 33
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 34
    .line 35
    invoke-static {p1, v2, v3, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 39
    .line 40
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 41
    .line 42
    invoke-static {p1, v7, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 46
    .line 47
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 48
    .line 49
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 50
    .line 51
    invoke-static {p1, v2, v4, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 55
    .line 56
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 57
    .line 58
    invoke-static {p1, v7, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iput-object v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 62
    .line 63
    iget p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 64
    .line 65
    add-int/2addr p1, v0

    .line 66
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {v6, v5, v2, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 73
    .line 74
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 75
    .line 76
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 77
    .line 78
    invoke-static {p1, v2, v3, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    iput-object v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 82
    .line 83
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 84
    .line 85
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 86
    .line 87
    invoke-static {p1, v2, v4, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    .line 89
    .line 90
    iput-object v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 91
    .line 92
    iget p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 93
    .line 94
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 95
    .line 96
    sub-int/2addr p1, v0

    .line 97
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 98
    .line 99
    :goto_0
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 100
    .line 101
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 102
    .line 103
    iput v7, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 104
    .line 105
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-gt p1, v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:I

    .line 6
    .line 7
    add-int/2addr v1, p1

    .line 8
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:I

    .line 9
    .line 10
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    sub-int/2addr v1, p1

    .line 13
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    const-string v0, "Cannot back "

    .line 22
    .line 23
    const-string v1, " chars which is larger than the internal buffer size ("

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 30
    .line 31
    const-string v0, ")"

    .line 32
    .line 33
    invoke-static {p1, v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()C
    .locals 5

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏世兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏世兰:I

    .line 6
    .line 7
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 8
    .line 9
    if-lt v0, v1, :cond_3

    .line 10
    .line 11
    const/16 v0, 0x1000

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne v1, v0, :cond_0

    .line 15
    .line 16
    iput v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 17
    .line 18
    iput v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏世兰:I

    .line 19
    .line 20
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世兰苏:[C

    .line 21
    .line 22
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 23
    .line 24
    rsub-int v3, v1, 0x1000

    .line 25
    .line 26
    iget-object v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏兰世:Ljava/io/Reader;

    .line 27
    .line 28
    invoke-virtual {v4, v0, v1, v3}, Ljava/io/Reader;->read([CII)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, -0x1

    .line 33
    if-eq v0, v1, :cond_1

    .line 34
    .line 35
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 36
    .line 37
    add-int/2addr v1, v0

    .line 38
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏兰世:Ljava/io/Reader;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 46
    .line 47
    .line 48
    new-instance v0, Ljava/io/IOException;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_0
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    add-int/lit8 v1, v1, -0x1

    .line 59
    .line 60
    iput v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 67
    .line 68
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 69
    .line 70
    iget-object v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 71
    .line 72
    aput v2, v4, v1

    .line 73
    .line 74
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 75
    .line 76
    aput v3, p0, v1

    .line 77
    .line 78
    :goto_1
    throw v0

    .line 79
    :cond_3
    :goto_2
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世兰苏:[C

    .line 80
    .line 81
    iget p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲苏世兰:I

    .line 82
    .line 83
    aget-char p0, v0, p0

    .line 84
    .line 85
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(II)V
    .locals 1

    .line 1
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    iput p2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰哲世:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲世苏兰:Z

    .line 11
    .line 12
    iget-object p2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 13
    .line 14
    const/16 v0, 0x1000

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    array-length p2, p2

    .line 19
    if-eq v0, p2, :cond_1

    .line 20
    .line 21
    :cond_0
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 22
    .line 23
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 24
    .line 25
    new-array p2, v0, [C

    .line 26
    .line 27
    iput-object p2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 28
    .line 29
    new-array p2, v0, [I

    .line 30
    .line 31
    iput-object p2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲:[I

    .line 32
    .line 33
    new-array p2, v0, [I

    .line 34
    .line 35
    iput-object p2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲世兰:[I

    .line 36
    .line 37
    :cond_1
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世哲兰:I

    .line 38
    .line 39
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:I

    .line 40
    .line 41
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:I

    .line 42
    .line 43
    const/4 p1, -0x1

    .line 44
    iput p1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰()C
    .locals 10

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏:I

    .line 8
    .line 9
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 13
    .line 14
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 22
    .line 23
    iget p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 24
    .line 25
    aget-char p0, v0, p0

    .line 26
    .line 27
    return p0

    .line 28
    :cond_1
    iget v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 32
    .line 33
    iget v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 34
    .line 35
    if-ne v0, v2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲()V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 45
    .line 46
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 47
    .line 48
    aput-char v0, v2, v3

    .line 49
    .line 50
    const/16 v2, 0x5c

    .line 51
    .line 52
    if-eq v0, v2, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 55
    .line 56
    .line 57
    return v0

    .line 58
    :cond_3
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 59
    .line 60
    .line 61
    move v0, v1

    .line 62
    :goto_0
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 63
    .line 64
    add-int/2addr v3, v1

    .line 65
    iput v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 66
    .line 67
    iget v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏:I

    .line 68
    .line 69
    if-ne v3, v4, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲()V

    .line 72
    .line 73
    .line 74
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iget-object v4, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 79
    .line 80
    iget v5, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 81
    .line 82
    aput-char v3, v4, v5

    .line 83
    .line 84
    if-eq v3, v2, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0, v3}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 87
    .line 88
    .line 89
    const/16 v4, 0x75

    .line 90
    .line 91
    if-ne v3, v4, :cond_8

    .line 92
    .line 93
    and-int/lit8 v3, v0, 0x1

    .line 94
    .line 95
    if-ne v3, v1, :cond_8

    .line 96
    .line 97
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 98
    .line 99
    sub-int/2addr v3, v1

    .line 100
    iput v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 101
    .line 102
    if-gez v3, :cond_5

    .line 103
    .line 104
    iget v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:I

    .line 105
    .line 106
    sub-int/2addr v3, v1

    .line 107
    iput v3, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 108
    .line 109
    :cond_5
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-ne v3, v4, :cond_6

    .line 114
    .line 115
    invoke-virtual {p0, v3}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲()C

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-static {v3}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(C)I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    shl-int/lit8 v7, v7, 0xc

    .line 136
    .line 137
    invoke-static {v4}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(C)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    shl-int/lit8 v8, v8, 0x8

    .line 142
    .line 143
    or-int/2addr v7, v8

    .line 144
    invoke-static {v5}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(C)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    shl-int/lit8 v8, v8, 0x4

    .line 149
    .line 150
    or-int/2addr v7, v8

    .line 151
    invoke-static {v6}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲兰苏(C)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    or-int/2addr v7, v8

    .line 156
    int-to-char v7, v7

    .line 157
    iget-object v8, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:[C

    .line 158
    .line 159
    iget v9, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 160
    .line 161
    aput-char v7, v8, v9

    .line 162
    .line 163
    invoke-virtual {p0, v3}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v4}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v5}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v6}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 173
    .line 174
    .line 175
    if-ne v0, v1, :cond_7

    .line 176
    .line 177
    return v7

    .line 178
    :cond_7
    sub-int/2addr v0, v1

    .line 179
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(I)V

    .line 180
    .line 181
    .line 182
    return v2

    .line 183
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v1, "Invalid escape character at line "

    .line 186
    .line 187
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget v1, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏哲兰世:I

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v1, " column "

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget p0, p0, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰世哲:I

    .line 201
    .line 202
    const-string v1, "."

    .line 203
    .line 204
    invoke-static {v0, v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const/4 p0, 0x0

    .line 212
    return p0

    .line 213
    :cond_8
    :try_start_2
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_9
    invoke-virtual {p0, v3}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰哲苏(C)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v0, v0, 0x1

    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :catch_1
    if-le v0, v1, :cond_a

    .line 225
    .line 226
    sub-int/2addr v0, v1

    .line 227
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰(I)V

    .line 228
    .line 229
    .line 230
    :cond_a
    return v2
.end method
