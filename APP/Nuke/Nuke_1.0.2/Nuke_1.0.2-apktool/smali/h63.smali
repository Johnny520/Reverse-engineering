.class public final Lh63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lbt;

.field public final b:Ljava/util/List;

.field public final c:I


# direct methods
.method public constructor <init>(Lbt;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh63;->a:Lbt;

    .line 8
    .line 9
    iput-object p2, p0, Lh63;->b:Ljava/util/List;

    .line 10
    .line 11
    iput p3, p0, Lh63;->c:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lh63;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lh63;

    .line 6
    .line 7
    iget-object v0, p1, Lh63;->a:Lbt;

    .line 8
    .line 9
    iget-object v1, p0, Lh63;->a:Lbt;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lh63;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p1, Lh63;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget p0, p0, Lh63;->c:I

    .line 28
    .line 29
    iget p1, p1, Lh63;->c:I

    .line 30
    .line 31
    if-ne p0, p1, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lh63;->a:Lbt;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbt;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lh63;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget p0, p0, Lh63;->c:I

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lh63;->a:Lbt;

    .line 2
    .line 3
    invoke-static {v0}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    const-class v1, [Z

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const-string v0, "kotlin.BooleanArray"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-class v1, [C

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string v0, "kotlin.CharArray"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-class v1, [B

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    const-string v0, "kotlin.ByteArray"

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-class v1, [S

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    const-string v0, "kotlin.ShortArray"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-class v1, [I

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    const-string v0, "kotlin.IntArray"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const-class v1, [F

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    const-string v0, "kotlin.FloatArray"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const-class v1, [J

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    const-string v0, "kotlin.LongArray"

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    const-class v1, [D

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    const-string v0, "kotlin.DoubleArray"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_7
    const-string v0, "kotlin.Array"

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_0
    iget-object v1, p0, Lh63;->b:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const-string v2, ""

    .line 115
    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    move-object v1, v2

    .line 119
    goto :goto_1

    .line 120
    :cond_9
    new-instance v7, Lkx2;

    .line 121
    .line 122
    invoke-direct {v7, p0}, Lkx2;-><init>(Lh63;)V

    .line 123
    .line 124
    .line 125
    const/16 v8, 0x18

    .line 126
    .line 127
    iget-object v3, p0, Lh63;->b:Ljava/util/List;

    .line 128
    .line 129
    const-string v4, ", "

    .line 130
    .line 131
    const-string v5, "<"

    .line 132
    .line 133
    const-string v6, ">"

    .line 134
    .line 135
    invoke-static/range {v3 .. v8}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :goto_1
    iget p0, p0, Lh63;->c:I

    .line 140
    .line 141
    and-int/lit8 p0, p0, 0x1

    .line 142
    .line 143
    if-eqz p0, :cond_a

    .line 144
    .line 145
    const-string v2, "?"

    .line 146
    .line 147
    :cond_a
    new-instance p0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const-string v0, " (Kotlin reflection is not available)"

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0
.end method
