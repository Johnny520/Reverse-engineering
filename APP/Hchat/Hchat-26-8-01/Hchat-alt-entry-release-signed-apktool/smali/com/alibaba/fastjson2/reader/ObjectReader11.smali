.class public Lcom/alibaba/fastjson2/reader/ObjectReader11;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected final fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader10:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader7:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader8:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader9:Lcom/alibaba/fastjson2/reader/FieldReader;

.field final hashCode0:J

.field final hashCode0LCase:J

.field final hashCode1:J

.field final hashCode10:J

.field final hashCode10LCase:J

.field final hashCode1LCase:J

.field final hashCode2:J

.field final hashCode2LCase:J

.field final hashCode3:J

.field final hashCode3LCase:J

.field final hashCode4:J

.field final hashCode4LCase:J

.field final hashCode5:J

.field final hashCode5LCase:J

.field final hashCode6:J

.field final hashCode6LCase:J

.field final hashCode7:J

.field final hashCode7LCase:J

.field final hashCode8:J

.field final hashCode8LCase:J

.field final hashCode9:J

.field final hashCode9LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader10:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader3:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader4:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader5:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader6:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader7:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader8:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader9:Lcom/alibaba/fastjson2/reader/ObjectReader;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v10, 0x0

    .line 3
    const/4 v8, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-wide/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v7, p7

    .line 14
    .line 15
    move-object/from16 v11, p8

    .line 16
    .line 17
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    aget-object p1, p8, p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    aget-object v1, p8, v1

    .line 27
    .line 28
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    aget-object v2, p8, v2

    .line 32
    .line 33
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    aget-object v3, p8, v3

    .line 37
    .line 38
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 39
    .line 40
    const/4 v4, 0x4

    .line 41
    aget-object v4, p8, v4

    .line 42
    .line 43
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    const/4 v5, 0x5

    .line 46
    aget-object v5, p8, v5

    .line 47
    .line 48
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 49
    .line 50
    const/4 v6, 0x6

    .line 51
    aget-object v6, p8, v6

    .line 52
    .line 53
    iput-object v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 54
    .line 55
    const/4 v7, 0x7

    .line 56
    aget-object v7, p8, v7

    .line 57
    .line 58
    iput-object v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader7:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 59
    .line 60
    const/16 v8, 0x8

    .line 61
    .line 62
    aget-object v8, p8, v8

    .line 63
    .line 64
    iput-object v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader8:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 65
    .line 66
    const/16 v9, 0x9

    .line 67
    .line 68
    aget-object v9, p8, v9

    .line 69
    .line 70
    iput-object v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader9:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 71
    .line 72
    const/16 v10, 0xa

    .line 73
    .line 74
    aget-object v10, p8, v10

    .line 75
    .line 76
    iput-object v10, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader10:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 77
    .line 78
    iget-wide v11, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 79
    .line 80
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode0:J

    .line 81
    .line 82
    iget-wide v11, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 83
    .line 84
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode1:J

    .line 85
    .line 86
    iget-wide v11, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 87
    .line 88
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode2:J

    .line 89
    .line 90
    iget-wide v11, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 91
    .line 92
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode3:J

    .line 93
    .line 94
    iget-wide v11, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 95
    .line 96
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode4:J

    .line 97
    .line 98
    iget-wide v11, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 99
    .line 100
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode5:J

    .line 101
    .line 102
    iget-wide v11, v6, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 103
    .line 104
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode6:J

    .line 105
    .line 106
    iget-wide v11, v7, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 107
    .line 108
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode7:J

    .line 109
    .line 110
    iget-wide v11, v8, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 111
    .line 112
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode8:J

    .line 113
    .line 114
    iget-wide v11, v9, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 115
    .line 116
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode9:J

    .line 117
    .line 118
    iget-wide v11, v10, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 119
    .line 120
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode10:J

    .line 121
    .line 122
    iget-wide v11, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 123
    .line 124
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode0LCase:J

    .line 125
    .line 126
    iget-wide v11, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 127
    .line 128
    iput-wide v11, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode1LCase:J

    .line 129
    .line 130
    iget-wide v1, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 131
    .line 132
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode2LCase:J

    .line 133
    .line 134
    iget-wide v1, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 135
    .line 136
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode3LCase:J

    .line 137
    .line 138
    iget-wide v1, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 139
    .line 140
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode4LCase:J

    .line 141
    .line 142
    iget-wide v1, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 143
    .line 144
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode5LCase:J

    .line 145
    .line 146
    iget-wide v1, v6, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 147
    .line 148
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode6LCase:J

    .line 149
    .line 150
    iget-wide v1, v7, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 151
    .line 152
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode7LCase:J

    .line 153
    .line 154
    iget-wide v1, v8, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 155
    .line 156
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode8LCase:J

    .line 157
    .line 158
    iget-wide v1, v9, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 159
    .line 160
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode9LCase:J

    .line 161
    .line 162
    iget-wide v1, v10, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 163
    .line 164
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode10LCase:J

    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode2:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode3:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode4:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode5:J

    .line 47
    .line 48
    cmp-long v0, p1, v0

    .line 49
    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode6:J

    .line 56
    .line 57
    cmp-long v0, p1, v0

    .line 58
    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_6
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode7:J

    .line 65
    .line 66
    cmp-long v0, p1, v0

    .line 67
    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader7:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_7
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode8:J

    .line 74
    .line 75
    cmp-long v0, p1, v0

    .line 76
    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader8:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_8
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode9:J

    .line 83
    .line 84
    cmp-long v0, p1, v0

    .line 85
    .line 86
    if-nez v0, :cond_9

    .line 87
    .line 88
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader9:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_9
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode10:J

    .line 92
    .line 93
    cmp-long p1, p1, v0

    .line 94
    .line 95
    if-nez p1, :cond_a

    .line 96
    .line 97
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader10:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_a
    const/4 p1, 0x0

    .line 101
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode3LCase:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode4LCase:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode5LCase:J

    .line 47
    .line 48
    cmp-long v0, p1, v0

    .line 49
    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode6LCase:J

    .line 56
    .line 57
    cmp-long v0, p1, v0

    .line 58
    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_6
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode7LCase:J

    .line 65
    .line 66
    cmp-long v0, p1, v0

    .line 67
    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader7:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_7
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode8LCase:J

    .line 74
    .line 75
    cmp-long v0, p1, v0

    .line 76
    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader8:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_8
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode9LCase:J

    .line 83
    .line 84
    cmp-long v0, p1, v0

    .line 85
    .line 86
    if-nez v0, :cond_9

    .line 87
    .line 88
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader9:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_9
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->hashCode10LCase:J

    .line 92
    .line 93
    cmp-long p1, p1, v0

    .line 94
    .line 95
    if-nez p1, :cond_a

    .line 96
    .line 97
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader11;->fieldReader10:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_a
    const/4 p1, 0x0

    .line 101
    return-object p1
.end method
