.class final Lcom/esotericsoftware/asm/Item;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field b:I

.field c:I

.field d:J

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:I

.field k:Lcom/esotericsoftware/asm/Item;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->a:I

    return-void
.end method

.method public constructor <init>(ILcom/esotericsoftware/asm/Item;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->a:I

    .line 5
    .line 6
    iget p1, p2, Lcom/esotericsoftware/asm/Item;->b:I

    .line 7
    .line 8
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->b:I

    .line 9
    .line 10
    iget p1, p2, Lcom/esotericsoftware/asm/Item;->c:I

    .line 11
    .line 12
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->c:I

    .line 13
    .line 14
    iget-wide v0, p2, Lcom/esotericsoftware/asm/Item;->d:J

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/esotericsoftware/asm/Item;->d:J

    .line 17
    .line 18
    iget-object p1, p2, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p2, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p1, p2, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 29
    .line 30
    iget p1, p2, Lcom/esotericsoftware/asm/Item;->j:I

    .line 31
    .line 32
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a(D)V
    .locals 2

    .line 161
    const/4 v0, 0x6

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/esotericsoftware/asm/Item;->d:J

    iget v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    double-to-int p1, p1

    add-int/2addr v0, p1

    const p1, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(F)V
    .locals 1

    .line 155
    const/4 v0, 0x4

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->c:I

    iget v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    float-to-int p1, p1

    add-int/2addr v0, p1

    const p1, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(I)V
    .locals 2

    .line 156
    const/4 v0, 0x3

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->c:I

    const v1, 0x7fffffff

    add-int/2addr v0, p1

    and-int p1, v0, v1

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(II)V
    .locals 1

    .line 157
    const/16 v0, 0x21

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->c:I

    iput p2, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 158
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->b:I

    iput-object p2, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    iput-object p3, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    iput-object p4, p0, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    const/4 v0, 0x1

    const v1, 0x7fffffff

    if-eq p1, v0, :cond_2

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/16 v0, 0x1e

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int/2addr p3, p2

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p3

    :goto_0
    add-int/2addr p2, p1

    and-int p1, p2, v1

    :goto_1
    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void

    :cond_0
    const/4 p3, 0x0

    iput p3, p0, Lcom/esotericsoftware/asm/Item;->c:I

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int/2addr p3, p2

    add-int/2addr p3, p1

    and-int p1, p3, v1

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    goto :goto_0
.end method

.method public a(J)V
    .locals 1

    .line 159
    const/4 v0, 0x5

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    iput-wide p1, p0, Lcom/esotericsoftware/asm/Item;->d:J

    long-to-int p1, p1

    add-int/2addr v0, p1

    const p1, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 160
    const/16 v0, 0x12

    iput v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    int-to-long v1, p3

    iput-wide v1, p0, Lcom/esotericsoftware/asm/Item;->d:J

    iput-object p1, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    iput-object p2, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    mul-int/2addr p1, p3

    iget-object p2, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int/2addr p2, p1

    add-int/2addr p2, v0

    const p1, 0x7fffffff

    and-int/2addr p1, p2

    iput p1, p0, Lcom/esotericsoftware/asm/Item;->j:I

    return-void
.end method

.method public a(Lcom/esotericsoftware/asm/Item;)Z
    .locals 8

    .line 1
    iget v0, p0, Lcom/esotericsoftware/asm/Item;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_8

    .line 5
    .line 6
    const/16 v2, 0xc

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eq v0, v2, :cond_6

    .line 10
    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    if-eq v0, v2, :cond_8

    .line 14
    .line 15
    const/16 v2, 0x12

    .line 16
    .line 17
    if-eq v0, v2, :cond_4

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    packed-switch v0, :pswitch_data_1

    .line 23
    .line 24
    .line 25
    iget-object v0, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p1, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->i:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    return v1

    .line 56
    :cond_0
    return v3

    .line 57
    :pswitch_0
    iget v0, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 58
    .line 59
    iget v2, p0, Lcom/esotericsoftware/asm/Item;->c:I

    .line 60
    .line 61
    if-ne v0, v2, :cond_1

    .line 62
    .line 63
    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    return v1

    .line 74
    :cond_1
    return v3

    .line 75
    :pswitch_1
    iget-wide v4, p1, Lcom/esotericsoftware/asm/Item;->d:J

    .line 76
    .line 77
    iget-wide p0, p0, Lcom/esotericsoftware/asm/Item;->d:J

    .line 78
    .line 79
    cmp-long p0, v4, p0

    .line 80
    .line 81
    if-nez p0, :cond_2

    .line 82
    .line 83
    return v1

    .line 84
    :cond_2
    return v3

    .line 85
    :pswitch_2
    iget p1, p1, Lcom/esotericsoftware/asm/Item;->c:I

    .line 86
    .line 87
    iget p0, p0, Lcom/esotericsoftware/asm/Item;->c:I

    .line 88
    .line 89
    if-ne p1, p0, :cond_3

    .line 90
    .line 91
    return v1

    .line 92
    :cond_3
    return v3

    .line 93
    :cond_4
    iget-wide v4, p1, Lcom/esotericsoftware/asm/Item;->d:J

    .line 94
    .line 95
    iget-wide v6, p0, Lcom/esotericsoftware/asm/Item;->d:J

    .line 96
    .line 97
    cmp-long v0, v4, v6

    .line 98
    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    iget-object v0, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 112
    .line 113
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    return v1

    .line 122
    :cond_5
    return v3

    .line 123
    :cond_6
    iget-object v0, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v2, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 134
    .line 135
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->h:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-eqz p0, :cond_7

    .line 142
    .line 143
    return v1

    .line 144
    :cond_7
    return v3

    .line 145
    :cond_8
    :pswitch_3
    iget-object p1, p1, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 146
    .line 147
    iget-object p0, p0, Lcom/esotericsoftware/asm/Item;->g:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    return p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :pswitch_data_1
    .packed-switch 0x1e
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
