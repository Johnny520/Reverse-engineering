.class public final Lxhss/ᛵᛱᛴᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final synthetic ᲇᛸᛳᲁ:I


# instance fields
.field public final ᛱᛱᛲᲇ:Z

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛴᛷᛱ:Z

.field public final ᛷᛵᛵᲈ:Z

.field public final ᛷᲁᲁ:Z

.field public final ᛸᛲᲀᛵ:I

.field public final ᛸᛴᛶᛳ:I

.field public ᛸᛶᲈᛶ:Ljava/lang/String;

.field public final ᛸᛷᲈᲈ:Z

.field public final ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:Z

.field public final ᲈᛳᲀ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᛱᛲᛳᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    const v0, 0x7fffffff

    .line 4
    .line 5
    .line 6
    sget-object v1, Lxhss/ᛶᛲᛲᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛲᲁ;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lxhss/ᛷᛸᲀᲀ;->ᛳᛸᛵᲀ(ILxhss/ᛶᛲᛲᲁ;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3, v1}, Lxhss/ᛱᛲᛳᲀ;->ᛱᛱᛲᲇ(JLxhss/ᛶᛲᛲᲁ;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v2, v0, v2

    .line 19
    .line 20
    if-ltz v2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v2, "maxStale < 0: "

    .line 24
    .line 25
    invoke-static {v2, v0, v1}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᛵᛵᲈ:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lxhss/ᛵᛱᛴᲁ;->ᛱᛱᛲᲇ:Z

    .line 7
    .line 8
    iput p3, p0, Lxhss/ᛵᛱᛴᲁ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    iput p4, p0, Lxhss/ᛵᛱᛴᲁ;->ᲇᛴᲇᛵ:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᛴᛷᛱ:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lxhss/ᛵᛱᛴᲁ;->ᲇᛶᛴᲀ:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lxhss/ᛵᛱᛴᲁ;->ᲀᲇᛳᲁ:Z

    .line 17
    .line 18
    iput p8, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛴᛶᛳ:I

    .line 19
    .line 20
    iput p9, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛲᲀᛵ:I

    .line 21
    .line 22
    iput-boolean p10, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛷᲈᲈ:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lxhss/ᛵᛱᛴᲁ;->ᲈᛳᲀ:Z

    .line 25
    .line 26
    iput-boolean p12, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᲁᲁ:Z

    .line 27
    .line 28
    iput-object p13, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛶᲈᛶ:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛶᲈᛶ:Ljava/lang/String;

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
    iget-boolean v1, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᛵᛵᲈ:Z

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
    iget-boolean v1, p0, Lxhss/ᛵᛱᛴᲁ;->ᛱᛱᛲᲇ:Z

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
    iget v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᛳᲁᲇᛸ:I

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
    iget v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᲇᛴᲇᛵ:I

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
    iget-boolean v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᛴᛷᛱ:Z

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
    iget-boolean v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᲇᛶᛴᲀ:Z

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
    iget-boolean v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᲀᲇᛳᲁ:Z

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
    iget v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛴᛶᛳ:I

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
    iget v3, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛲᲀᛵ:I

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
    iget-boolean v1, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛷᲈᲈ:Z

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
    iget-boolean v1, p0, Lxhss/ᛵᛱᛴᲁ;->ᲈᛳᲀ:Z

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
    iget-boolean v1, p0, Lxhss/ᛵᛱᛴᲁ;->ᛷᲁᲁ:Z

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
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Lxhss/ᛵᛱᛴᲁ;->ᛸᛶᲈᛶ:Ljava/lang/String;

    .line 172
    .line 173
    :cond_d
    return-object v0
.end method
