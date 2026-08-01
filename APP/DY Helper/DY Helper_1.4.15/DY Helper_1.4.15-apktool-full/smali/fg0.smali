.class public final Lfg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public final ε:Lad;

.field public ζ:I

.field public η:I

.field public θ:I

.field public ι:I

.field public κ:I


# direct methods
.method public constructor <init>(Lad;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfg0;->ε:Lad;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lfg0;->ε:Lad;

    .line 2
    .line 3
    invoke-interface {p0}, Lrx1;->α()Lm42;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final β(JLsc;)J
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget p1, p0, Lfg0;->ι:I

    .line 5
    .line 6
    iget-object p2, p0, Lfg0;->ε:Lad;

    .line 7
    .line 8
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    if-nez p1, :cond_4

    .line 11
    .line 12
    iget p1, p0, Lfg0;->κ:I

    .line 13
    .line 14
    int-to-long v2, p1

    .line 15
    invoke-interface {p2, v2, v3}, Lad;->skip(J)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lfg0;->κ:I

    .line 20
    .line 21
    iget p1, p0, Lfg0;->η:I

    .line 22
    .line 23
    and-int/lit8 p1, p1, 0x4

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget p1, p0, Lfg0;->θ:I

    .line 29
    .line 30
    invoke-static {p2}, Lsd2;->μ(Lad;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lfg0;->ι:I

    .line 35
    .line 36
    iput v0, p0, Lfg0;->ζ:I

    .line 37
    .line 38
    invoke-interface {p2}, Lad;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    invoke-interface {p2}, Lad;->readByte()B

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit16 v1, v1, 0xff

    .line 49
    .line 50
    iput v1, p0, Lfg0;->η:I

    .line 51
    .line 52
    sget-object v1, Lgg0;->θ:Ljava/util/logging/Logger;

    .line 53
    .line 54
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    sget-object v2, Lvf0;->α:Ldd;

    .line 63
    .line 64
    iget v2, p0, Lfg0;->θ:I

    .line 65
    .line 66
    iget v3, p0, Lfg0;->ζ:I

    .line 67
    .line 68
    iget v4, p0, Lfg0;->η:I

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-static {v5, v2, v3, v0, v4}, Lvf0;->β(ZIIII)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-interface {p2}, Lad;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const v1, 0x7fffffff

    .line 83
    .line 84
    .line 85
    and-int/2addr p2, v1

    .line 86
    iput p2, p0, Lfg0;->θ:I

    .line 87
    .line 88
    const/16 v1, 0x9

    .line 89
    .line 90
    const-wide/16 v2, 0x0

    .line 91
    .line 92
    if-ne v0, v1, :cond_3

    .line 93
    .line 94
    if-ne p2, p1, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const-string p0, "TYPE_CONTINUATION streamId changed"

    .line 98
    .line 99
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-wide v2

    .line 103
    :cond_3
    const-string p0, " != TYPE_CONTINUATION"

    .line 104
    .line 105
    invoke-static {p0, v0}, Llz1;->λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-wide v2

    .line 113
    :cond_4
    int-to-long v2, p1

    .line 114
    const-wide/16 v4, 0x2000

    .line 115
    .line 116
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    invoke-interface {p2, v2, v3, p3}, Lrx1;->β(JLsc;)J

    .line 121
    .line 122
    .line 123
    move-result-wide p1

    .line 124
    cmp-long p3, p1, v0

    .line 125
    .line 126
    if-nez p3, :cond_5

    .line 127
    .line 128
    :goto_1
    return-wide v0

    .line 129
    :cond_5
    iget p3, p0, Lfg0;->ι:I

    .line 130
    .line 131
    long-to-int v0, p1

    .line 132
    sub-int/2addr p3, v0

    .line 133
    iput p3, p0, Lfg0;->ι:I

    .line 134
    .line 135
    return-wide p1
.end method
