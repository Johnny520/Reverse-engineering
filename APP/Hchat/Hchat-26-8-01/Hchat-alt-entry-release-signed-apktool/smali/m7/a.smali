.class public final Lm7/a;
.super Lm7/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public n:I


# virtual methods
.method public final V(I)Ljava/lang/Integer;
    .locals 2

    .line 1
    const-string v0, "manifest"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lm7/j;->X(I)Lm7/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lv7/j0;->T()Lv7/k0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lv7/k0;->n:Lv7/k0;

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lv7/j0;->O()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final W(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "manifest"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lm7/j;->X(I)Lm7/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lv7/j0;->T()Lv7/k0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lv7/k0;->u:Lv7/k0;

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lv7/j0;->S()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final X()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "manifest"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    const-string v2, "package"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lm7/j;->W(Ljava/lang/String;)Lm7/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Lv7/j0;->T()Lv7/k0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lv7/k0;->u:Lv7/k0;

    .line 24
    .line 25
    if-eq v2, v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v0}, Lv7/j0;->S()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_2
    :goto_0
    return-object v1
.end method

.method public final Y()I
    .locals 4

    .line 1
    iget v0, p0, Lm7/a;->n:I

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    const-string v0, "manifest"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "application"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const v2, 0x1010002

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lm7/j;->X(I)Lm7/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v0}, Lv7/j0;->T()Lv7/k0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lv7/k0;->i:Lv7/k0;

    .line 39
    .line 40
    if-eq v2, v3, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v0}, Lv7/j0;->O()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_3
    :goto_1
    shr-int/lit8 v0, v1, 0x18

    .line 48
    .line 49
    and-int/lit16 v0, v0, 0xff

    .line 50
    .line 51
    iput v0, p0, Lm7/a;->n:I

    .line 52
    .line 53
    :cond_4
    iget v0, p0, Lm7/a;->n:I

    .line 54
    .line 55
    return v0
.end method

.method public final Z()Ljava/lang/Boolean;
    .locals 3

    .line 1
    const-string v0, "manifest"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lm7/i;->O(Ljava/lang/String;)Lm7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v1, "coreApp"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lm7/j;->W(Ljava/lang/String;)Lm7/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0}, Lv7/j0;->T()Lv7/k0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lv7/k0;->p:Lv7/k0;

    .line 24
    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    return-object v0

    .line 29
    :cond_2
    invoke-virtual {v0}, Lv7/j0;->O()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    const/4 v0, 0x0

    .line 38
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lm7/i;->S()Lm7/i;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lm7/r;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lm7/r;-><init>(Lm7/i;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-class v1, Lm7/a;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "{package="

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lm7/a;->X()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", versionCode="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const v1, 0x101021b

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lm7/a;->V(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", versionName="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const v1, 0x101021c

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lm7/a;->W(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", compileSdkVersion="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const v1, 0x1010572

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lm7/a;->V(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", compileSdkVersionCodename="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const v1, 0x1010573

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lm7/a;->W(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, "manifest"

    .line 102
    .line 103
    const-string v2, "uses-permission"

    .line 104
    .line 105
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p0, v1}, Lm7/i;->P([Ljava/lang/String;)Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, Lcom/alibaba/fastjson2/writer/b;

    .line 114
    .line 115
    const/16 v3, 0x1d

    .line 116
    .line 117
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-nez v3, :cond_1

    .line 125
    .line 126
    sget-object v1, Lz7/h;->g:Lz7/h;

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    new-instance v3, Lz7/g;

    .line 130
    .line 131
    invoke-direct {v3, v1, v2}, Lz7/g;-><init>(Ljava/util/Iterator;Ljava/util/function/Function;)V

    .line 132
    .line 133
    .line 134
    move-object v1, v3

    .line 135
    :goto_0
    invoke-static {v1}, Lbe/h;->b0(Ljava/util/Iterator;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, ", PERMISSIONS["

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const/4 v2, 0x0

    .line 149
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_3

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Ljava/lang/String;

    .line 160
    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    const-string v2, ", "

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const/4 v2, 0x1

    .line 172
    goto :goto_1

    .line 173
    :cond_3
    const-string v1, "]}"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0
.end method
