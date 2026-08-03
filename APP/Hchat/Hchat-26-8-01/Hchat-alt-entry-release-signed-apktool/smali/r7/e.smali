.class public final Lr7/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/g;


# instance fields
.field public final g:Lr7/b;

.field public final h:I

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lr7/b;II)V
    .locals 0

    .line 1
    iput p3, p0, Lr7/e;->i:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr7/e;->g:Lr7/b;

    .line 7
    .line 8
    iput p2, p0, Lr7/e;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, Lr7/e;

    .line 20
    .line 21
    iget v2, p0, Lr7/e;->h:I

    .line 22
    .line 23
    iget v3, p1, Lr7/e;->h:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lr7/e;->g:Lr7/b;

    .line 28
    .line 29
    iget-object p1, p1, Lr7/e;->g:Lr7/b;

    .line 30
    .line 31
    if-ne v2, p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    :goto_0
    return v1
.end method

.method public get()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/e;->g:Lr7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lr7/b;->k:[B

    .line 4
    .line 5
    iget v1, p0, Lr7/e;->h:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lr7/e;->h:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lr7/e;->g:Lr7/b;

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public k(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/e;->g:Lr7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lr7/b;->k:[B

    .line 4
    .line 5
    iget v1, p0, Lr7/e;->h:I

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    .line 1
    iget v0, p0, Lr7/e;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr7/e;->g:Lr7/b;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lr7/p;

    .line 10
    .line 11
    iget-object v1, v1, Lr7/b;->k:[B

    .line 12
    .line 13
    iget v2, p0, Lr7/e;->h:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    aget-byte v1, v1, v3

    .line 18
    .line 19
    if-eqz v1, :cond_9

    .line 20
    .line 21
    check-cast v0, Lr7/p;

    .line 22
    .line 23
    iget-object v0, v0, Lr7/b;->k:[B

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x3

    .line 26
    .line 27
    aget-byte v0, v0, v2

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    and-int/lit16 v2, v0, 0xff

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-static {v3}, Lt3/c;->c(I)[I

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    array-length v4, v3

    .line 42
    const/4 v5, 0x0

    .line 43
    move v6, v5

    .line 44
    move v7, v6

    .line 45
    :goto_0
    const/16 v8, 0x7c

    .line 46
    .line 47
    if-ge v5, v4, :cond_6

    .line 48
    .line 49
    aget v9, v3, v5

    .line 50
    .line 51
    const/4 v10, 0x1

    .line 52
    if-eq v9, v10, :cond_1

    .line 53
    .line 54
    const/4 v10, 0x2

    .line 55
    if-ne v9, v10, :cond_0

    .line 56
    .line 57
    const/16 v10, 0x20

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    throw v0

    .line 62
    :cond_1
    const/16 v10, 0x40

    .line 63
    .line 64
    :goto_1
    and-int/lit16 v11, v10, 0xff

    .line 65
    .line 66
    and-int/2addr v10, v0

    .line 67
    and-int/lit16 v10, v10, 0xff

    .line 68
    .line 69
    if-eq v10, v11, :cond_2

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_2
    if-eqz v7, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_3
    const/4 v7, 0x1

    .line 78
    if-eq v9, v7, :cond_5

    .line 79
    .line 80
    const/4 v7, 0x2

    .line 81
    if-eq v9, v7, :cond_4

    .line 82
    .line 83
    const-string v7, "null"

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    const-string v7, "SPEC_STAGED_API"

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const-string v7, "SPEC_PUBLIC"

    .line 90
    .line 91
    :goto_2
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    or-int/2addr v6, v11

    .line 95
    const/4 v7, 0x1

    .line 96
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    if-eq v6, v2, :cond_8

    .line 100
    .line 101
    if-eqz v7, :cond_7

    .line 102
    .line 103
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_7
    int-to-byte v0, v2

    .line 107
    invoke-static {v0}, Ly7/a;->n(B)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    goto :goto_4

    .line 119
    :cond_9
    check-cast v0, Lr7/p;

    .line 120
    .line 121
    iget-object v0, v0, Lr7/b;->k:[B

    .line 122
    .line 123
    invoke-static {v0, v2}, Lk7/a;->s([BI)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_a

    .line 128
    .line 129
    const/16 v1, 0x8

    .line 130
    .line 131
    invoke-static {v0, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    goto :goto_4

    .line 136
    :cond_a
    const-string v0, ""

    .line 137
    .line 138
    :goto_4
    return-object v0

    .line 139
    :pswitch_0
    iget-object v0, p0, Lr7/e;->g:Lr7/b;

    .line 140
    .line 141
    iget-object v0, v0, Lr7/b;->k:[B

    .line 142
    .line 143
    array-length v0, v0

    .line 144
    iget v1, p0, Lr7/e;->h:I

    .line 145
    .line 146
    sub-int/2addr v0, v1

    .line 147
    const/4 v1, 0x4

    .line 148
    if-ge v0, v1, :cond_b

    .line 149
    .line 150
    const-string v0, "NULL"

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_b
    invoke-virtual {p0}, Lr7/e;->get()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_5
    return-object v0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
