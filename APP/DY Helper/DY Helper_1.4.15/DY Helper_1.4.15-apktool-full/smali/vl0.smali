.class public final Lvl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public final ε:Lrk1;

.field public final ζ:Ljava/util/zip/Inflater;

.field public η:I

.field public θ:Z


# direct methods
.method public constructor <init>(Lrk1;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvl0;->ε:Lrk1;

    .line 5
    .line 6
    iput-object p2, p0, Lvl0;->ζ:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lvl0;->θ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lvl0;->ζ:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lvl0;->θ:Z

    .line 13
    .line 14
    iget-object p0, p0, Lvl0;->ε:Lrk1;

    .line 15
    .line 16
    invoke-virtual {p0}, Lrk1;->close()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lvl0;->ε:Lrk1;

    .line 2
    .line 3
    iget-object p0, p0, Lrk1;->ε:Lrx1;

    .line 4
    .line 5
    invoke-interface {p0}, Lrx1;->α()Lm42;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final β(JLsc;)J
    .locals 7

    .line 1
    iget-object p1, p0, Lvl0;->ζ:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-boolean p2, p0, Lvl0;->θ:Z

    .line 7
    .line 8
    if-nez p2, :cond_9

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    :try_start_0
    invoke-virtual {p3, p2}, Lsc;->υ(I)Lrr1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget v0, p2, Lrr1;->γ:I

    .line 16
    .line 17
    rsub-int v0, v0, 0x2000

    .line 18
    .line 19
    int-to-long v0, v0

    .line 20
    const-wide/16 v2, 0x2000

    .line 21
    .line 22
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    long-to-int v0, v0

    .line 27
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 28
    .line 29
    .line 30
    move-result v1
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget-object v2, p0, Lvl0;->ε:Lrk1;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lrk1;->δ()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v1, v2, Lrk1;->ζ:Lsc;

    .line 44
    .line 45
    iget-object v1, v1, Lsc;->ε:Lrr1;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget v3, v1, Lrr1;->γ:I

    .line 51
    .line 52
    iget v4, v1, Lrr1;->β:I

    .line 53
    .line 54
    sub-int/2addr v3, v4

    .line 55
    iput v3, p0, Lvl0;->η:I

    .line 56
    .line 57
    iget-object v1, v1, Lrr1;->α:[B

    .line 58
    .line 59
    invoke-virtual {p1, v1, v4, v3}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 60
    .line 61
    .line 62
    :goto_1
    iget-object v1, p2, Lrr1;->α:[B

    .line 63
    .line 64
    iget v3, p2, Lrr1;->γ:I

    .line 65
    .line 66
    invoke-virtual {p1, v1, v3, v0}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v1, p0, Lvl0;->η:I

    .line 71
    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v1, v3

    .line 80
    iget v3, p0, Lvl0;->η:I

    .line 81
    .line 82
    sub-int/2addr v3, v1

    .line 83
    iput v3, p0, Lvl0;->η:I

    .line 84
    .line 85
    int-to-long v3, v1

    .line 86
    invoke-virtual {v2, v3, v4}, Lrk1;->skip(J)V

    .line 87
    .line 88
    .line 89
    :goto_2
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    if-lez v0, :cond_3

    .line 92
    .line 93
    iget v1, p2, Lrr1;->γ:I

    .line 94
    .line 95
    add-int/2addr v1, v0

    .line 96
    iput v1, p2, Lrr1;->γ:I

    .line 97
    .line 98
    iget-wide v5, p3, Lsc;->ζ:J

    .line 99
    .line 100
    int-to-long v0, v0

    .line 101
    add-long/2addr v5, v0

    .line 102
    iput-wide v5, p3, Lsc;->ζ:J

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    iget v0, p2, Lrr1;->β:I

    .line 106
    .line 107
    iget v1, p2, Lrr1;->γ:I

    .line 108
    .line 109
    if-ne v0, v1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p2}, Lrr1;->α()Lrr1;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p3, Lsc;->ε:Lrr1;

    .line 116
    .line 117
    invoke-static {p2}, Ltr1;->α(Lrr1;)V
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 118
    .line 119
    .line 120
    :cond_4
    move-wide v0, v3

    .line 121
    :goto_3
    cmp-long p2, v0, v3

    .line 122
    .line 123
    if-lez p2, :cond_5

    .line 124
    .line 125
    return-wide v0

    .line 126
    :cond_5
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->finished()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_8

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    invoke-virtual {v2}, Lrk1;->δ()Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-nez p2, :cond_7

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_7
    new-instance p0, Ljava/io/EOFException;

    .line 148
    .line 149
    const-string p1, "source exhausted prematurely"

    .line 150
    .line 151
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p0

    .line 155
    :cond_8
    :goto_4
    const-wide/16 p0, -0x1

    .line 156
    .line 157
    return-wide p0

    .line 158
    :catch_0
    move-exception p0

    .line 159
    new-instance p1, Ljava/io/IOException;

    .line 160
    .line 161
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_9
    const-string p0, "closed"

    .line 166
    .line 167
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-wide/16 p0, 0x0

    .line 171
    .line 172
    return-wide p0
.end method
