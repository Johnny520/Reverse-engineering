.class public final Lfd;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic ξ:I


# instance fields
.field public final α:Z

.field public final β:Z

.field public final γ:I

.field public final δ:I

.field public final ε:Z

.field public final ζ:Z

.field public final η:Z

.field public final θ:I

.field public final ι:I

.field public final κ:Z

.field public final λ:Z

.field public final μ:Z

.field public ν:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget v0, Luw;->η:I

    .line 2
    .line 3
    sget-object v0, Lax;->θ:Lax;

    .line 4
    .line 5
    invoke-virtual {v0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const v4, 0x7fffffff

    .line 15
    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    int-to-long v4, v4

    .line 20
    invoke-virtual {v1, v4, v5, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    shl-long/2addr v0, v3

    .line 25
    sget v4, Lzw;->α:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    int-to-long v4, v4

    .line 29
    const-wide v6, -0x112e0be82L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v0, v6, v4

    .line 35
    .line 36
    if-gtz v0, :cond_1

    .line 37
    .line 38
    const-wide v6, 0x112e0be82L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v0, v4, v6

    .line 44
    .line 45
    if-gtz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v4, v5, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    shl-long/2addr v0, v3

    .line 52
    sget v4, Lzw;->α:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 56
    .line 57
    invoke-virtual {v0, v4, v5, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    const-wide v8, -0x3fffffffffffffffL    # -2.0000000000000004

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const-wide v10, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static/range {v6 .. v11}, Lj81;->ξ(JJJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    shl-long/2addr v0, v3

    .line 76
    const-wide/16 v4, 0x1

    .line 77
    .line 78
    add-long/2addr v0, v4

    .line 79
    sget v4, Lzw;->α:I

    .line 80
    .line 81
    :goto_0
    sget-wide v4, Luw;->ε:J

    .line 82
    .line 83
    cmp-long v4, v0, v4

    .line 84
    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    const-wide v0, 0x7fffffffffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    sget-wide v4, Luw;->ζ:J

    .line 94
    .line 95
    cmp-long v4, v0, v4

    .line 96
    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    const-wide/high16 v0, -0x8000000000000000L

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    shr-long v4, v0, v3

    .line 103
    .line 104
    long-to-int v0, v0

    .line 105
    and-int/2addr v0, v3

    .line 106
    if-nez v0, :cond_4

    .line 107
    .line 108
    sget-object v0, Lax;->ζ:Lax;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    sget-object v0, Lax;->η:Lax;

    .line 112
    .line 113
    :goto_1
    iget-object v0, v0, Lax;->ε:Ljava/util/concurrent/TimeUnit;

    .line 114
    .line 115
    invoke-virtual {v2, v4, v5, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    :goto_2
    const-wide/16 v2, 0x0

    .line 120
    .line 121
    cmp-long v2, v0, v2

    .line 122
    .line 123
    if-ltz v2, :cond_5

    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    const-string v2, "maxStale < 0: "

    .line 127
    .line 128
    invoke-static {v0, v1, v2}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lfd;->α:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lfd;->β:Z

    .line 7
    .line 8
    iput p3, p0, Lfd;->γ:I

    .line 9
    .line 10
    iput p4, p0, Lfd;->δ:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lfd;->ε:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lfd;->ζ:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lfd;->η:Z

    .line 17
    .line 18
    iput p8, p0, Lfd;->θ:I

    .line 19
    .line 20
    iput p9, p0, Lfd;->ι:I

    .line 21
    .line 22
    iput-boolean p10, p0, Lfd;->κ:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lfd;->λ:Z

    .line 25
    .line 26
    iput-boolean p12, p0, Lfd;->μ:Z

    .line 27
    .line 28
    iput-object p13, p0, Lfd;->ν:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lfd;->ν:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-boolean v1, p0, Lfd;->α:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "no-cache, "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-boolean v1, p0, Lfd;->β:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const-string v1, "no-store, "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    const-string v1, ", "

    .line 29
    .line 30
    const/4 v2, -0x1

    .line 31
    iget v3, p0, Lfd;->γ:I

    .line 32
    .line 33
    if-eq v3, v2, :cond_2

    .line 34
    .line 35
    const-string v4, "max-age="

    .line 36
    .line 37
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_2
    iget v3, p0, Lfd;->δ:I

    .line 47
    .line 48
    if-eq v3, v2, :cond_3

    .line 49
    .line 50
    const-string v4, "s-maxage="

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-boolean v3, p0, Lfd;->ε:Z

    .line 62
    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    const-string v3, "private, "

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-boolean v3, p0, Lfd;->ζ:Z

    .line 71
    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    const-string v3, "public, "

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-boolean v3, p0, Lfd;->η:Z

    .line 80
    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const-string v3, "must-revalidate, "

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :cond_6
    iget v3, p0, Lfd;->θ:I

    .line 89
    .line 90
    if-eq v3, v2, :cond_7

    .line 91
    .line 92
    const-string v4, "max-stale="

    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :cond_7
    iget v3, p0, Lfd;->ι:I

    .line 104
    .line 105
    if-eq v3, v2, :cond_8

    .line 106
    .line 107
    const-string v2, "min-fresh="

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_8
    iget-boolean v1, p0, Lfd;->κ:Z

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    const-string v1, "only-if-cached, "

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_9
    iget-boolean v1, p0, Lfd;->λ:Z

    .line 128
    .line 129
    if-eqz v1, :cond_a

    .line 130
    .line 131
    const-string v1, "no-transform, "

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    :cond_a
    iget-boolean v1, p0, Lfd;->μ:Z

    .line 137
    .line 138
    if-eqz v1, :cond_b

    .line 139
    .line 140
    const-string v1, "immutable, "

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_c

    .line 150
    .line 151
    const-string p0, ""

    .line 152
    .line 153
    return-object p0

    .line 154
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    add-int/lit8 v1, v1, -0x2

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iput-object v0, p0, Lfd;->ν:Ljava/lang/String;

    .line 176
    .line 177
    :cond_d
    return-object v0
.end method
