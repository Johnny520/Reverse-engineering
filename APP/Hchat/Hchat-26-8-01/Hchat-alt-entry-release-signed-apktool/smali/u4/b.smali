.class public final Lu4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lz4/h;


# instance fields
.field public final a:I

.field public final b:Lh4/u;

.field public final c:Lz4/g;

.field public final d:I


# direct methods
.method public constructor <init>(ILh4/u;Lz4/g;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_9

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p2}, Lz4/j;->k()V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    .line 9
    iget-object v0, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v0, v0

    .line 12
    if-eqz v0, :cond_8

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x2

    .line 15
    .line 16
    :goto_0
    const/4 v2, 0x1

    .line 17
    if-ltz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lu4/i;

    .line 24
    .line 25
    iget-object v3, v3, Lu4/i;->g:Lu4/r;

    .line 26
    .line 27
    iget v3, v3, Lu4/r;->e:I

    .line 28
    .line 29
    if-ne v3, v2, :cond_0

    .line 30
    .line 31
    add-int/lit8 v1, v1, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p1, "insns["

    .line 35
    .line 36
    const-string p2, "] is a branch or can throw"

    .line 37
    .line 38
    invoke-static {v1, p1, p2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    throw p1

    .line 47
    :cond_1
    sub-int/2addr v0, v2

    .line 48
    invoke-virtual {p2, v0}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lu4/i;

    .line 53
    .line 54
    iget-object v0, v0, Lu4/i;->g:Lu4/r;

    .line 55
    .line 56
    iget v0, v0, Lu4/r;->e:I

    .line 57
    .line 58
    if-eq v0, v2, :cond_7

    .line 59
    .line 60
    :try_start_1
    invoke-virtual {p3}, Lz4/j;->k()V
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    const/4 v0, -0x1

    .line 64
    if-lt p4, v0, :cond_6

    .line 65
    .line 66
    if-ltz p4, :cond_5

    .line 67
    .line 68
    invoke-virtual {p3, p4}, Lz4/g;->m(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-ltz v1, :cond_2

    .line 73
    .line 74
    move v0, v1

    .line 75
    :cond_2
    if-ltz v0, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v2, 0x0

    .line 79
    :goto_1
    if-eqz v2, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    new-instance p2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v0, "primarySuccessor "

    .line 87
    .line 88
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p4, " not in successors "

    .line 95
    .line 96
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_5
    :goto_2
    iput p1, p0, Lu4/b;->a:I

    .line 111
    .line 112
    iput-object p2, p0, Lu4/b;->b:Lh4/u;

    .line 113
    .line 114
    iput-object p3, p0, Lu4/b;->c:Lz4/g;

    .line 115
    .line 116
    iput p4, p0, Lu4/b;->d:I

    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    const-string p1, "primarySuccessor < -1"

    .line 120
    .line 121
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    throw p1

    .line 126
    :catch_0
    const-string p1, "successors == null"

    .line 127
    .line 128
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    throw p1

    .line 133
    :cond_7
    const-string p1, "insns does not end with a branch or throwing instruction"

    .line 134
    .line 135
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    throw p1

    .line 140
    :cond_8
    const-string p1, "insns.size() == 0"

    .line 141
    .line 142
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p1, 0x0

    .line 146
    throw p1

    .line 147
    :catch_1
    const-string p1, "insns == null"

    .line 148
    .line 149
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    throw p1

    .line 154
    :cond_9
    const-string p1, "label < 0"

    .line 155
    .line 156
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/4 p1, 0x0

    .line 160
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lu4/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lu4/b;->a:I

    .line 9
    .line 10
    invoke-static {v1}, La/a;->X0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7d

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
