.class public final Lyk1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Luk1;

.field public final β:Ljava/util/ArrayList;

.field public final γ:I

.field public final δ:Lzz;

.field public final ε:Li5;

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public ι:I


# direct methods
.method public constructor <init>(Luk1;Ljava/util/ArrayList;ILzz;Li5;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyk1;->α:Luk1;

    .line 5
    .line 6
    iput-object p2, p0, Lyk1;->β:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput p3, p0, Lyk1;->γ:I

    .line 9
    .line 10
    iput-object p4, p0, Lyk1;->δ:Lzz;

    .line 11
    .line 12
    iput-object p5, p0, Lyk1;->ε:Li5;

    .line 13
    .line 14
    iput p6, p0, Lyk1;->ζ:I

    .line 15
    .line 16
    iput p7, p0, Lyk1;->η:I

    .line 17
    .line 18
    iput p8, p0, Lyk1;->θ:I

    .line 19
    .line 20
    return-void
.end method

.method public static α(Lyk1;ILzz;Li5;I)Lyk1;
    .locals 9

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lyk1;->γ:I

    .line 6
    .line 7
    :cond_0
    move v3, p1

    .line 8
    and-int/lit8 p1, p4, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lyk1;->δ:Lzz;

    .line 13
    .line 14
    :cond_1
    move-object v4, p2

    .line 15
    and-int/lit8 p1, p4, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p3, p0, Lyk1;->ε:Li5;

    .line 20
    .line 21
    :cond_2
    move-object v5, p3

    .line 22
    iget v6, p0, Lyk1;->ζ:I

    .line 23
    .line 24
    iget v7, p0, Lyk1;->η:I

    .line 25
    .line 26
    iget v8, p0, Lyk1;->θ:I

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lyk1;

    .line 32
    .line 33
    iget-object v1, p0, Lyk1;->α:Luk1;

    .line 34
    .line 35
    iget-object v2, p0, Lyk1;->β:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lyk1;-><init>(Luk1;Ljava/util/ArrayList;ILzz;Li5;III)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method


# virtual methods
.method public final β(Li5;)Lzn1;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyk1;->β:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget v2, p0, Lyk1;->γ:I

    .line 11
    .line 12
    if-ge v2, v1, :cond_6

    .line 13
    .line 14
    iget v1, p0, Lyk1;->ι:I

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    add-int/2addr v1, v3

    .line 18
    iput v1, p0, Lyk1;->ι:I

    .line 19
    .line 20
    const-string v1, " must call proceed() exactly once"

    .line 21
    .line 22
    iget-object v4, p0, Lyk1;->δ:Lzz;

    .line 23
    .line 24
    const-string v5, "network interceptor "

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    iget-object v6, v4, Lzz;->γ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v6, Lc00;

    .line 31
    .line 32
    invoke-interface {v6}, Lc00;->β()Lal1;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iget-object v7, p1, Li5;->β:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v7, Log0;

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v6, v6, Lal1;->ι:Lp;

    .line 47
    .line 48
    iget-object v6, v6, Lp;->θ:Log0;

    .line 49
    .line 50
    iget v8, v7, Log0;->ε:I

    .line 51
    .line 52
    iget v9, v6, Log0;->ε:I

    .line 53
    .line 54
    if-ne v8, v9, :cond_1

    .line 55
    .line 56
    iget-object v7, v7, Log0;->δ:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v6, v6, Log0;->δ:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v7, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    iget v6, p0, Lyk1;->ι:I

    .line 67
    .line 68
    if-ne v6, v3, :cond_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    sub-int/2addr v2, v3

    .line 72
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v5, p0, v1}, Lγ;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x0

    .line 80
    return-object p0

    .line 81
    :cond_1
    sub-int/2addr v2, v3

    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string p1, " must retain the same host and port"

    .line 87
    .line 88
    invoke-static {v5, p0, p1}, Lγ;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    :goto_1
    add-int/lit8 v6, v2, 0x1

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const/16 v8, 0x3a

    .line 96
    .line 97
    invoke-static {p0, v6, v7, p1, v8}, Lyk1;->α(Lyk1;ILzz;Li5;I)Lyk1;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ljn0;

    .line 106
    .line 107
    invoke-interface {p1, p0}, Ljn0;->α(Lyk1;)Lzn1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_5

    .line 112
    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-ge v6, v0, :cond_4

    .line 120
    .line 121
    iget p0, p0, Lyk1;->ι:I

    .line 122
    .line 123
    if-ne p0, v3, :cond_3

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_3
    invoke-static {v5, p1, v1}, Lγ;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    :goto_2
    return-object v2

    .line 131
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 132
    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v1, "interceptor "

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string p1, " returned null"

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_6
    const-string p0, "Check failed."

    .line 157
    .line 158
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0
.end method
