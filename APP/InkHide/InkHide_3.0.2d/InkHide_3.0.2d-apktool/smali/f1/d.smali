.class public final Lf1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/lang/String;

.field public final e:LE0/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LF0/a;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LE0/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, LE0/f;-><init>(LM0/a;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lf1/d;->e:LE0/f;

    .line 22
    .line 23
    const/4 v0, 0x6

    .line 24
    const-string v1, "->"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p1, v1, v2, v2, v0}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v1, v0, 0x1

    .line 32
    .line 33
    const-string v3, "("

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    invoke-static {p1, v3, v1, v2, v4}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/lit8 v3, v1, 0x1

    .line 41
    .line 42
    const-string v5, ")"

    .line 43
    .line 44
    invoke-static {p1, v5, v3, v2, v4}, LU0/i;->p0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, -0x1

    .line 49
    if-eq v0, v6, :cond_4

    .line 50
    .line 51
    if-eq v1, v6, :cond_4

    .line 52
    .line 53
    if-eq v5, v6, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v7, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 60
    .line 61
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v6}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iput-object v6, p0, Lf1/d;->a:Ljava/lang/String;

    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x2

    .line 71
    .line 72
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lf1/d;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_0
    move v3, v2

    .line 94
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-ge v2, v6, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    const/16 v8, 0x5b

    .line 105
    .line 106
    if-ne v6, v8, :cond_0

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_0
    const/16 v8, 0x4c

    .line 112
    .line 113
    if-ne v6, v8, :cond_1

    .line 114
    .line 115
    const/16 v6, 0x3b

    .line 116
    .line 117
    invoke-static {v0, v6, v2, v4}, LU0/i;->o0(Ljava/lang/CharSequence;CII)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_2
    if-ne v3, v2, :cond_3

    .line 139
    .line 140
    iput-object v1, p0, Lf1/d;->c:Ljava/util/ArrayList;

    .line 141
    .line 142
    add-int/lit8 v5, v5, 0x1

    .line 143
    .line 144
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v0, "(this as java.lang.String).substring(startIndex)"

    .line 149
    .line 150
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {p1}, Le1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, Lf1/d;->d:Ljava/lang/String;

    .line 158
    .line 159
    return-void

    .line 160
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string v1, "Unknown signString: "

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_4
    new-instance v0, Ljava/lang/IllegalAccessError;

    .line 173
    .line 174
    const-string v1, "not method descriptor: "

    .line 175
    .line 176
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-direct {v0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lf1/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lf1/d;

    .line 10
    .line 11
    iget-object v0, p1, Lf1/d;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lf1/d;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lf1/d;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lf1/d;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lf1/d;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v1, p1, Lf1/d;->c:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lf1/d;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lf1/d;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    :goto_0
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 54
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lf1/d;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v0, p0, Lf1/d;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    iget-object v1, p0, Lf1/d;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lf1/d;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Le1/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "->"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lf1/d;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lf1/d;->e:LE0/f;

    .line 26
    .line 27
    invoke-virtual {v1}, LE0/f;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 41
    .line 42
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
