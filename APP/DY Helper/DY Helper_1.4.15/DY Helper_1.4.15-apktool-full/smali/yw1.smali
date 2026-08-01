.class public final Lyw1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Iterable;
.implements Llo0;


# static fields
.field public static final ι:Lyw1;


# instance fields
.field public final ε:J

.field public final ζ:J

.field public final η:J

.field public final θ:[J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lyw1;

    .line 2
    .line 3
    const-wide/16 v5, 0x0

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    invoke-direct/range {v0 .. v7}, Lyw1;-><init>(JJJ[J)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyw1;->ι:Lyw1;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(JJJ[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lyw1;->ε:J

    .line 5
    .line 6
    iput-wide p3, p0, Lyw1;->ζ:J

    .line 7
    .line 8
    iput-wide p5, p0, Lyw1;->η:J

    .line 9
    .line 10
    iput-object p7, p0, Lyw1;->θ:[J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lxw1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lxw1;-><init>(Lyw1;Lop;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Le81;->ι(Le80;)Lts1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " ["

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-static {p0, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v2, ""

    .line 63
    .line 64
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v4, 0x0

    .line 72
    move v5, v4

    .line 73
    :goto_1
    if-ge v4, v3, :cond_5

    .line 74
    .line 75
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/4 v7, 0x1

    .line 80
    add-int/2addr v5, v7

    .line 81
    if-le v5, v7, :cond_1

    .line 82
    .line 83
    const-string v8, ", "

    .line 84
    .line 85
    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 86
    .line 87
    .line 88
    :cond_1
    if-nez v6, :cond_2

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    instance-of v7, v6, Ljava/lang/CharSequence;

    .line 92
    .line 93
    :goto_2
    if-eqz v7, :cond_3

    .line 94
    .line 95
    check-cast v6, Ljava/lang/CharSequence;

    .line 96
    .line 97
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    instance-of v7, v6, Ljava/lang/Character;

    .line 102
    .line 103
    if-eqz v7, :cond_4

    .line 104
    .line 105
    check-cast v6, Ljava/lang/Character;

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 120
    .line 121
    .line 122
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const/16 p0, 0x5d

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0
.end method

.method public final α(Lyw1;)Lyw1;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lyw1;->ι:Lyw1;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    if-ne v0, v2, :cond_1

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_1
    iget-wide v2, v1, Lyw1;->η:J

    .line 14
    .line 15
    iget-wide v4, v1, Lyw1;->η:J

    .line 16
    .line 17
    iget-object v6, v1, Lyw1;->θ:[J

    .line 18
    .line 19
    iget-wide v7, v1, Lyw1;->ζ:J

    .line 20
    .line 21
    iget-wide v9, v1, Lyw1;->ε:J

    .line 22
    .line 23
    iget-wide v11, v0, Lyw1;->η:J

    .line 24
    .line 25
    cmp-long v1, v2, v11

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, v0, Lyw1;->θ:[J

    .line 30
    .line 31
    if-ne v6, v1, :cond_2

    .line 32
    .line 33
    move-wide/from16 v16, v11

    .line 34
    .line 35
    new-instance v11, Lyw1;

    .line 36
    .line 37
    iget-wide v2, v0, Lyw1;->ε:J

    .line 38
    .line 39
    not-long v4, v9

    .line 40
    and-long v12, v2, v4

    .line 41
    .line 42
    iget-wide v2, v0, Lyw1;->ζ:J

    .line 43
    .line 44
    not-long v4, v7

    .line 45
    and-long v14, v2, v4

    .line 46
    .line 47
    move-object/from16 v18, v1

    .line 48
    .line 49
    invoke-direct/range {v11 .. v18}, Lyw1;-><init>(JJJ[J)V

    .line 50
    .line 51
    .line 52
    return-object v11

    .line 53
    :cond_2
    const/4 v1, 0x0

    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    array-length v2, v6

    .line 57
    move v3, v1

    .line 58
    :goto_0
    if-ge v3, v2, :cond_3

    .line 59
    .line 60
    aget-wide v11, v6, v3

    .line 61
    .line 62
    invoke-virtual {v0, v11, v12}, Lyw1;->β(J)Lyw1;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const-wide/16 v2, 0x0

    .line 70
    .line 71
    cmp-long v6, v7, v2

    .line 72
    .line 73
    const-wide/16 v11, 0x1

    .line 74
    .line 75
    const/16 v13, 0x40

    .line 76
    .line 77
    if-eqz v6, :cond_5

    .line 78
    .line 79
    move v6, v1

    .line 80
    :goto_1
    if-ge v6, v13, :cond_5

    .line 81
    .line 82
    shl-long v14, v11, v6

    .line 83
    .line 84
    and-long/2addr v14, v7

    .line 85
    cmp-long v14, v14, v2

    .line 86
    .line 87
    if-eqz v14, :cond_4

    .line 88
    .line 89
    int-to-long v14, v6

    .line 90
    add-long/2addr v14, v4

    .line 91
    invoke-virtual {v0, v14, v15}, Lyw1;->β(J)Lyw1;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    cmp-long v6, v9, v2

    .line 99
    .line 100
    if-eqz v6, :cond_7

    .line 101
    .line 102
    :goto_2
    if-ge v1, v13, :cond_7

    .line 103
    .line 104
    shl-long v6, v11, v1

    .line 105
    .line 106
    and-long/2addr v6, v9

    .line 107
    cmp-long v6, v6, v2

    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    int-to-long v6, v1

    .line 112
    add-long/2addr v6, v4

    .line 113
    int-to-long v14, v13

    .line 114
    add-long/2addr v6, v14

    .line 115
    invoke-virtual {v0, v6, v7}, Lyw1;->β(J)Lyw1;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    return-object v0
.end method

.method public final β(J)Lyw1;
    .locals 13

    .line 1
    iget-wide v0, p0, Lyw1;->η:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    int-to-long v3, v2

    .line 7
    invoke-static {v0, v1, v3, v4}, Lln0;->π(JJ)I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    const-wide/16 v8, 0x1

    .line 14
    .line 15
    const/16 v10, 0x40

    .line 16
    .line 17
    if-ltz v5, :cond_0

    .line 18
    .line 19
    int-to-long v11, v10

    .line 20
    invoke-static {v0, v1, v11, v12}, Lln0;->π(JJ)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-gez v5, :cond_0

    .line 25
    .line 26
    long-to-int p1, v0

    .line 27
    shl-long p1, v8, p1

    .line 28
    .line 29
    iget-wide v0, p0, Lyw1;->ζ:J

    .line 30
    .line 31
    and-long v2, v0, p1

    .line 32
    .line 33
    cmp-long v2, v2, v6

    .line 34
    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    new-instance v3, Lyw1;

    .line 38
    .line 39
    not-long p1, p1

    .line 40
    and-long v6, v0, p1

    .line 41
    .line 42
    iget-wide v8, p0, Lyw1;->η:J

    .line 43
    .line 44
    iget-object v10, p0, Lyw1;->θ:[J

    .line 45
    .line 46
    iget-wide v4, p0, Lyw1;->ε:J

    .line 47
    .line 48
    invoke-direct/range {v3 .. v10}, Lyw1;-><init>(JJJ[J)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_0
    int-to-long v11, v10

    .line 53
    invoke-static {v0, v1, v11, v12}, Lln0;->π(JJ)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ltz v5, :cond_1

    .line 58
    .line 59
    const/16 v5, 0x80

    .line 60
    .line 61
    int-to-long v11, v5

    .line 62
    invoke-static {v0, v1, v11, v12}, Lln0;->π(JJ)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-gez v5, :cond_1

    .line 67
    .line 68
    long-to-int p1, v0

    .line 69
    sub-int/2addr p1, v10

    .line 70
    shl-long p1, v8, p1

    .line 71
    .line 72
    iget-wide v0, p0, Lyw1;->ε:J

    .line 73
    .line 74
    and-long v2, v0, p1

    .line 75
    .line 76
    cmp-long v2, v2, v6

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    new-instance v3, Lyw1;

    .line 81
    .line 82
    not-long p1, p1

    .line 83
    and-long v4, v0, p1

    .line 84
    .line 85
    iget-wide v8, p0, Lyw1;->η:J

    .line 86
    .line 87
    iget-object v10, p0, Lyw1;->θ:[J

    .line 88
    .line 89
    iget-wide v6, p0, Lyw1;->ζ:J

    .line 90
    .line 91
    invoke-direct/range {v3 .. v10}, Lyw1;-><init>(JJJ[J)V

    .line 92
    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_1
    invoke-static {v0, v1, v3, v4}, Lln0;->π(JJ)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-gez v0, :cond_5

    .line 100
    .line 101
    iget-object v0, p0, Lyw1;->θ:[J

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-static {p1, p2, v0}, Li81;->ζ(J[J)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-ltz p1, :cond_5

    .line 110
    .line 111
    new-instance v3, Lyw1;

    .line 112
    .line 113
    array-length p2, v0

    .line 114
    add-int/lit8 v1, p2, -0x1

    .line 115
    .line 116
    if-nez v1, :cond_2

    .line 117
    .line 118
    const/4 p1, 0x0

    .line 119
    move-object v10, p1

    .line 120
    goto :goto_0

    .line 121
    :cond_2
    new-array v4, v1, [J

    .line 122
    .line 123
    if-lez p1, :cond_3

    .line 124
    .line 125
    invoke-static {v0, v4, v2, v2, p1}, Lg7;->Ν([J[JIII)V

    .line 126
    .line 127
    .line 128
    :cond_3
    if-ge p1, v1, :cond_4

    .line 129
    .line 130
    add-int/lit8 v1, p1, 0x1

    .line 131
    .line 132
    invoke-static {v0, v4, p1, v1, p2}, Lg7;->Ν([J[JIII)V

    .line 133
    .line 134
    .line 135
    :cond_4
    move-object v10, v4

    .line 136
    :goto_0
    iget-wide v4, p0, Lyw1;->ε:J

    .line 137
    .line 138
    iget-wide v6, p0, Lyw1;->ζ:J

    .line 139
    .line 140
    iget-wide v8, p0, Lyw1;->η:J

    .line 141
    .line 142
    invoke-direct/range {v3 .. v10}, Lyw1;-><init>(JJJ[J)V

    .line 143
    .line 144
    .line 145
    return-object v3

    .line 146
    :cond_5
    return-object p0
.end method

.method public final γ(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-wide v3, v0, Lyw1;->η:J

    .line 6
    .line 7
    sub-long v3, v1, v3

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    int-to-long v6, v5

    .line 11
    invoke-static {v3, v4, v6, v7}, Lln0;->π(JJ)I

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    const-wide/16 v11, 0x1

    .line 16
    .line 17
    const/4 v13, 0x1

    .line 18
    const/16 v14, 0x40

    .line 19
    .line 20
    const-wide/16 v15, 0x0

    .line 21
    .line 22
    if-ltz v8, :cond_1

    .line 23
    .line 24
    int-to-long v9, v14

    .line 25
    invoke-static {v3, v4, v9, v10}, Lln0;->π(JJ)I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-gez v8, :cond_1

    .line 30
    .line 31
    long-to-int v1, v3

    .line 32
    shl-long v1, v11, v1

    .line 33
    .line 34
    iget-wide v3, v0, Lyw1;->ζ:J

    .line 35
    .line 36
    and-long v0, v1, v3

    .line 37
    .line 38
    cmp-long v0, v0, v15

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return v13

    .line 43
    :cond_0
    return v5

    .line 44
    :cond_1
    int-to-long v8, v14

    .line 45
    invoke-static {v3, v4, v8, v9}, Lln0;->π(JJ)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-ltz v8, :cond_3

    .line 50
    .line 51
    const/16 v8, 0x80

    .line 52
    .line 53
    int-to-long v8, v8

    .line 54
    invoke-static {v3, v4, v8, v9}, Lln0;->π(JJ)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-gez v8, :cond_3

    .line 59
    .line 60
    long-to-int v1, v3

    .line 61
    sub-int/2addr v1, v14

    .line 62
    shl-long v1, v11, v1

    .line 63
    .line 64
    iget-wide v3, v0, Lyw1;->ε:J

    .line 65
    .line 66
    and-long v0, v1, v3

    .line 67
    .line 68
    cmp-long v0, v0, v15

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    return v13

    .line 73
    :cond_2
    return v5

    .line 74
    :cond_3
    invoke-static {v3, v4, v6, v7}, Lln0;->π(JJ)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-lez v3, :cond_4

    .line 79
    .line 80
    return v5

    .line 81
    :cond_4
    iget-object v0, v0, Lyw1;->θ:[J

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-static {v1, v2, v0}, Li81;->ζ(J[J)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-ltz v0, :cond_5

    .line 90
    .line 91
    return v13

    .line 92
    :cond_5
    return v5
.end method

.method public final δ(Lyw1;)Lyw1;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lyw1;->ι:Lyw1;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    if-ne v0, v2, :cond_1

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_1
    iget-wide v2, v1, Lyw1;->η:J

    .line 14
    .line 15
    iget-wide v4, v1, Lyw1;->η:J

    .line 16
    .line 17
    iget-object v6, v1, Lyw1;->θ:[J

    .line 18
    .line 19
    iget-wide v7, v1, Lyw1;->ζ:J

    .line 20
    .line 21
    iget-wide v9, v1, Lyw1;->ε:J

    .line 22
    .line 23
    iget-wide v11, v0, Lyw1;->η:J

    .line 24
    .line 25
    cmp-long v2, v2, v11

    .line 26
    .line 27
    iget-wide v13, v0, Lyw1;->ζ:J

    .line 28
    .line 29
    move v3, v2

    .line 30
    iget-wide v1, v0, Lyw1;->ε:J

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    iget-object v3, v0, Lyw1;->θ:[J

    .line 35
    .line 36
    if-ne v6, v3, :cond_2

    .line 37
    .line 38
    move-wide/from16 v16, v11

    .line 39
    .line 40
    new-instance v11, Lyw1;

    .line 41
    .line 42
    move-wide v14, v13

    .line 43
    or-long v12, v1, v9

    .line 44
    .line 45
    or-long/2addr v14, v7

    .line 46
    move-object/from16 v18, v3

    .line 47
    .line 48
    invoke-direct/range {v11 .. v18}, Lyw1;-><init>(JJJ[J)V

    .line 49
    .line 50
    .line 51
    return-object v11

    .line 52
    :cond_2
    move-wide v14, v13

    .line 53
    const/16 v3, 0x40

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    const-wide/16 v16, 0x0

    .line 57
    .line 58
    const-wide/16 v18, 0x1

    .line 59
    .line 60
    iget-object v11, v0, Lyw1;->θ:[J

    .line 61
    .line 62
    if-nez v11, :cond_9

    .line 63
    .line 64
    if-eqz v11, :cond_3

    .line 65
    .line 66
    array-length v4, v11

    .line 67
    move-object/from16 v5, p1

    .line 68
    .line 69
    move v6, v13

    .line 70
    :goto_0
    if-ge v6, v4, :cond_4

    .line 71
    .line 72
    aget-wide v7, v11, v6

    .line 73
    .line 74
    invoke-virtual {v5, v7, v8}, Lyw1;->ε(J)Lyw1;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move-object/from16 v5, p1

    .line 82
    .line 83
    :cond_4
    cmp-long v4, v14, v16

    .line 84
    .line 85
    iget-wide v6, v0, Lyw1;->η:J

    .line 86
    .line 87
    if-eqz v4, :cond_6

    .line 88
    .line 89
    move v0, v13

    .line 90
    :goto_1
    if-ge v0, v3, :cond_6

    .line 91
    .line 92
    shl-long v8, v18, v0

    .line 93
    .line 94
    and-long/2addr v8, v14

    .line 95
    cmp-long v4, v8, v16

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    int-to-long v8, v0

    .line 100
    add-long/2addr v8, v6

    .line 101
    invoke-virtual {v5, v8, v9}, Lyw1;->ε(J)Lyw1;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    move-object v5, v4

    .line 106
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    cmp-long v0, v1, v16

    .line 110
    .line 111
    if-eqz v0, :cond_8

    .line 112
    .line 113
    :goto_2
    if-ge v13, v3, :cond_8

    .line 114
    .line 115
    shl-long v8, v18, v13

    .line 116
    .line 117
    and-long/2addr v8, v1

    .line 118
    cmp-long v0, v8, v16

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    int-to-long v8, v13

    .line 123
    add-long/2addr v8, v6

    .line 124
    int-to-long v10, v3

    .line 125
    add-long/2addr v8, v10

    .line 126
    invoke-virtual {v5, v8, v9}, Lyw1;->ε(J)Lyw1;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    move-object v5, v0

    .line 131
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    return-object v5

    .line 135
    :cond_9
    if-eqz v6, :cond_a

    .line 136
    .line 137
    array-length v1, v6

    .line 138
    move v2, v13

    .line 139
    :goto_3
    if-ge v2, v1, :cond_a

    .line 140
    .line 141
    aget-wide v11, v6, v2

    .line 142
    .line 143
    invoke-virtual {v0, v11, v12}, Lyw1;->ε(J)Lyw1;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_a
    cmp-long v1, v7, v16

    .line 151
    .line 152
    if-eqz v1, :cond_c

    .line 153
    .line 154
    move v1, v13

    .line 155
    :goto_4
    if-ge v1, v3, :cond_c

    .line 156
    .line 157
    shl-long v11, v18, v1

    .line 158
    .line 159
    and-long/2addr v11, v7

    .line 160
    cmp-long v2, v11, v16

    .line 161
    .line 162
    if-eqz v2, :cond_b

    .line 163
    .line 164
    int-to-long v11, v1

    .line 165
    add-long/2addr v11, v4

    .line 166
    invoke-virtual {v0, v11, v12}, Lyw1;->ε(J)Lyw1;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :cond_b
    add-int/lit8 v1, v1, 0x1

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_c
    cmp-long v1, v9, v16

    .line 174
    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    :goto_5
    if-ge v13, v3, :cond_e

    .line 178
    .line 179
    shl-long v1, v18, v13

    .line 180
    .line 181
    and-long/2addr v1, v9

    .line 182
    cmp-long v1, v1, v16

    .line 183
    .line 184
    if-eqz v1, :cond_d

    .line 185
    .line 186
    int-to-long v1, v13

    .line 187
    add-long/2addr v1, v4

    .line 188
    int-to-long v6, v3

    .line 189
    add-long/2addr v1, v6

    .line 190
    invoke-virtual {v0, v1, v2}, Lyw1;->ε(J)Lyw1;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_e
    return-object v0
.end method

.method public final ε(J)Lyw1;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-wide v3, v0, Lyw1;->η:J

    .line 6
    .line 7
    sub-long v5, v1, v3

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    int-to-long v8, v7

    .line 11
    invoke-static {v5, v6, v8, v9}, Lln0;->π(JJ)I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    iget-wide v11, v0, Lyw1;->ζ:J

    .line 16
    .line 17
    const/16 v15, 0x40

    .line 18
    .line 19
    const-wide/16 v16, 0x0

    .line 20
    .line 21
    const-wide/16 v18, 0x1

    .line 22
    .line 23
    if-ltz v10, :cond_0

    .line 24
    .line 25
    int-to-long v13, v15

    .line 26
    invoke-static {v5, v6, v13, v14}, Lln0;->π(JJ)I

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    if-gez v10, :cond_0

    .line 31
    .line 32
    long-to-int v1, v5

    .line 33
    shl-long v1, v18, v1

    .line 34
    .line 35
    and-long v3, v11, v1

    .line 36
    .line 37
    cmp-long v3, v3, v16

    .line 38
    .line 39
    if-nez v3, :cond_14

    .line 40
    .line 41
    new-instance v13, Lyw1;

    .line 42
    .line 43
    or-long v16, v11, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lyw1;->η:J

    .line 46
    .line 47
    iget-object v3, v0, Lyw1;->θ:[J

    .line 48
    .line 49
    iget-wide v14, v0, Lyw1;->ε:J

    .line 50
    .line 51
    move-wide/from16 v18, v1

    .line 52
    .line 53
    move-object/from16 v20, v3

    .line 54
    .line 55
    invoke-direct/range {v13 .. v20}, Lyw1;-><init>(JJJ[J)V

    .line 56
    .line 57
    .line 58
    return-object v13

    .line 59
    :cond_0
    int-to-long v13, v15

    .line 60
    invoke-static {v5, v6, v13, v14}, Lln0;->π(JJ)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    move-wide/from16 v21, v8

    .line 65
    .line 66
    iget-wide v7, v0, Lyw1;->ε:J

    .line 67
    .line 68
    const/16 v9, 0x80

    .line 69
    .line 70
    move-wide/from16 v23, v3

    .line 71
    .line 72
    if-ltz v10, :cond_1

    .line 73
    .line 74
    int-to-long v3, v9

    .line 75
    invoke-static {v5, v6, v3, v4}, Lln0;->π(JJ)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-gez v3, :cond_1

    .line 80
    .line 81
    long-to-int v1, v5

    .line 82
    sub-int/2addr v1, v15

    .line 83
    shl-long v1, v18, v1

    .line 84
    .line 85
    and-long v3, v7, v1

    .line 86
    .line 87
    cmp-long v3, v3, v16

    .line 88
    .line 89
    if-nez v3, :cond_14

    .line 90
    .line 91
    new-instance v9, Lyw1;

    .line 92
    .line 93
    or-long v10, v7, v1

    .line 94
    .line 95
    iget-wide v14, v0, Lyw1;->η:J

    .line 96
    .line 97
    iget-object v1, v0, Lyw1;->θ:[J

    .line 98
    .line 99
    iget-wide v12, v0, Lyw1;->ζ:J

    .line 100
    .line 101
    move-object/from16 v16, v1

    .line 102
    .line 103
    invoke-direct/range {v9 .. v16}, Lyw1;-><init>(JJJ[J)V

    .line 104
    .line 105
    .line 106
    return-object v9

    .line 107
    :cond_1
    int-to-long v3, v9

    .line 108
    invoke-static {v5, v6, v3, v4}, Lln0;->π(JJ)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    iget-object v6, v0, Lyw1;->θ:[J

    .line 113
    .line 114
    const/4 v9, 0x1

    .line 115
    if-ltz v5, :cond_12

    .line 116
    .line 117
    invoke-virtual/range {p0 .. p2}, Lyw1;->γ(J)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_14

    .line 122
    .line 123
    int-to-long v9, v9

    .line 124
    add-long v25, v1, v9

    .line 125
    .line 126
    div-long v25, v25, v13

    .line 127
    .line 128
    move-wide/from16 v27, v3

    .line 129
    .line 130
    mul-long v3, v25, v13

    .line 131
    .line 132
    move-wide/from16 v25, v7

    .line 133
    .line 134
    move-wide/from16 v7, v21

    .line 135
    .line 136
    invoke-static {v3, v4, v7, v8}, Lln0;->π(JJ)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-gez v0, :cond_2

    .line 141
    .line 142
    const-wide v3, 0x7fffffffffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    sub-long v3, v3, v27

    .line 148
    .line 149
    add-long/2addr v3, v9

    .line 150
    :cond_2
    move-wide/from16 v7, v23

    .line 151
    .line 152
    move-wide/from16 v22, v25

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    :goto_0
    invoke-static {v7, v8, v3, v4}, Lln0;->π(JJ)I

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-gez v9, :cond_d

    .line 160
    .line 161
    cmp-long v9, v11, v16

    .line 162
    .line 163
    if-eqz v9, :cond_a

    .line 164
    .line 165
    if-nez v5, :cond_8

    .line 166
    .line 167
    new-instance v5, Ly21;

    .line 168
    .line 169
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    if-eqz v6, :cond_7

    .line 173
    .line 174
    array-length v9, v6

    .line 175
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    new-instance v10, Lq11;

    .line 180
    .line 181
    const/16 p0, 0x0

    .line 182
    .line 183
    array-length v0, v9

    .line 184
    invoke-direct {v10, v0}, Lq11;-><init>(I)V

    .line 185
    .line 186
    .line 187
    iget v0, v10, Lq11;->β:I

    .line 188
    .line 189
    if-ltz v0, :cond_6

    .line 190
    .line 191
    array-length v15, v9

    .line 192
    if-nez v15, :cond_3

    .line 193
    .line 194
    move-wide/from16 v24, v3

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_3
    array-length v15, v9

    .line 198
    add-int/2addr v15, v0

    .line 199
    move-wide/from16 v24, v3

    .line 200
    .line 201
    iget-object v3, v10, Lq11;->α:[J

    .line 202
    .line 203
    array-length v4, v3

    .line 204
    if-ge v4, v15, :cond_4

    .line 205
    .line 206
    array-length v4, v3

    .line 207
    mul-int/lit8 v4, v4, 0x3

    .line 208
    .line 209
    div-int/lit8 v4, v4, 0x2

    .line 210
    .line 211
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    iput-object v3, v10, Lq11;->α:[J

    .line 220
    .line 221
    :cond_4
    iget-object v3, v10, Lq11;->α:[J

    .line 222
    .line 223
    iget v4, v10, Lq11;->β:I

    .line 224
    .line 225
    if-eq v0, v4, :cond_5

    .line 226
    .line 227
    array-length v15, v9

    .line 228
    add-int/2addr v15, v0

    .line 229
    invoke-static {v3, v3, v15, v0, v4}, Lg7;->Ν([J[JIII)V

    .line 230
    .line 231
    .line 232
    :cond_5
    array-length v4, v9

    .line 233
    const/4 v15, 0x0

    .line 234
    invoke-static {v9, v3, v0, v15, v4}, Lg7;->Ν([J[JIII)V

    .line 235
    .line 236
    .line 237
    iget v0, v10, Lq11;->β:I

    .line 238
    .line 239
    array-length v3, v9

    .line 240
    add-int/2addr v0, v3

    .line 241
    iput v0, v10, Lq11;->β:I

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_6
    const-string v0, ""

    .line 245
    .line 246
    invoke-static {v0}, Lγ;->η(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p0

    .line 250
    :cond_7
    move-wide/from16 v24, v3

    .line 251
    .line 252
    const/16 p0, 0x0

    .line 253
    .line 254
    new-instance v10, Lq11;

    .line 255
    .line 256
    const/16 v0, 0x10

    .line 257
    .line 258
    invoke-direct {v10, v0}, Lq11;-><init>(I)V

    .line 259
    .line 260
    .line 261
    :goto_1
    iput-object v10, v5, Ly21;->ε:Ljava/lang/Object;

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_8
    move-wide/from16 v24, v3

    .line 265
    .line 266
    const/16 p0, 0x0

    .line 267
    .line 268
    :goto_2
    const/4 v0, 0x0

    .line 269
    const/16 v3, 0x40

    .line 270
    .line 271
    :goto_3
    if-ge v0, v3, :cond_b

    .line 272
    .line 273
    shl-long v9, v18, v0

    .line 274
    .line 275
    and-long/2addr v9, v11

    .line 276
    cmp-long v4, v9, v16

    .line 277
    .line 278
    if-eqz v4, :cond_9

    .line 279
    .line 280
    int-to-long v9, v0

    .line 281
    add-long/2addr v9, v7

    .line 282
    iget-object v4, v5, Ly21;->ε:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v4, Lq11;

    .line 285
    .line 286
    invoke-virtual {v4, v9, v10}, Lq11;->α(J)V

    .line 287
    .line 288
    .line 289
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_a
    move-wide/from16 v24, v3

    .line 293
    .line 294
    move v3, v15

    .line 295
    const/16 p0, 0x0

    .line 296
    .line 297
    :cond_b
    cmp-long v0, v22, v16

    .line 298
    .line 299
    if-nez v0, :cond_c

    .line 300
    .line 301
    move-wide/from16 v26, v24

    .line 302
    .line 303
    move-wide/from16 v24, v16

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_c
    add-long/2addr v7, v13

    .line 307
    move v15, v3

    .line 308
    move-wide/from16 v11, v22

    .line 309
    .line 310
    move-wide/from16 v3, v24

    .line 311
    .line 312
    move-wide/from16 v22, v16

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :cond_d
    const/16 p0, 0x0

    .line 317
    .line 318
    move-wide/from16 v26, v7

    .line 319
    .line 320
    move-wide/from16 v24, v11

    .line 321
    .line 322
    :goto_4
    new-instance v21, Lyw1;

    .line 323
    .line 324
    if-eqz v5, :cond_11

    .line 325
    .line 326
    iget-object v0, v5, Ly21;->ε:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Lq11;

    .line 329
    .line 330
    iget v3, v0, Lq11;->β:I

    .line 331
    .line 332
    if-nez v3, :cond_e

    .line 333
    .line 334
    move-object/from16 v0, p0

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_e
    new-array v4, v3, [J

    .line 338
    .line 339
    iget-object v0, v0, Lq11;->α:[J

    .line 340
    .line 341
    const/4 v7, 0x0

    .line 342
    :goto_5
    if-ge v7, v3, :cond_f

    .line 343
    .line 344
    aget-wide v8, v0, v7

    .line 345
    .line 346
    aput-wide v8, v4, v7

    .line 347
    .line 348
    add-int/lit8 v7, v7, 0x1

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_f
    move-object v0, v4

    .line 352
    :goto_6
    if-nez v0, :cond_10

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_10
    move-object/from16 v28, v0

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_11
    :goto_7
    move-object/from16 v28, v6

    .line 359
    .line 360
    :goto_8
    invoke-direct/range {v21 .. v28}, Lyw1;-><init>(JJJ[J)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v0, v21

    .line 364
    .line 365
    invoke-virtual {v0, v1, v2}, Lyw1;->ε(J)Lyw1;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0

    .line 370
    :cond_12
    if-nez v6, :cond_13

    .line 371
    .line 372
    move-wide v2, v1

    .line 373
    new-instance v1, Lyw1;

    .line 374
    .line 375
    new-array v8, v9, [J

    .line 376
    .line 377
    const/16 v20, 0x0

    .line 378
    .line 379
    aput-wide v2, v8, v20

    .line 380
    .line 381
    iget-wide v2, v0, Lyw1;->ε:J

    .line 382
    .line 383
    iget-wide v4, v0, Lyw1;->ζ:J

    .line 384
    .line 385
    iget-wide v6, v0, Lyw1;->η:J

    .line 386
    .line 387
    invoke-direct/range {v1 .. v8}, Lyw1;-><init>(JJJ[J)V

    .line 388
    .line 389
    .line 390
    return-object v1

    .line 391
    :cond_13
    move-wide v2, v1

    .line 392
    invoke-static {v2, v3, v6}, Li81;->ζ(J[J)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-gez v1, :cond_14

    .line 397
    .line 398
    add-int/2addr v1, v9

    .line 399
    neg-int v1, v1

    .line 400
    array-length v4, v6

    .line 401
    add-int/lit8 v5, v4, 0x1

    .line 402
    .line 403
    new-array v14, v5, [J

    .line 404
    .line 405
    const/4 v15, 0x0

    .line 406
    invoke-static {v6, v14, v15, v15, v1}, Lg7;->Ν([J[JIII)V

    .line 407
    .line 408
    .line 409
    add-int/lit8 v5, v1, 0x1

    .line 410
    .line 411
    invoke-static {v6, v14, v5, v1, v4}, Lg7;->Ν([J[JIII)V

    .line 412
    .line 413
    .line 414
    aput-wide v2, v14, v1

    .line 415
    .line 416
    new-instance v7, Lyw1;

    .line 417
    .line 418
    iget-wide v10, v0, Lyw1;->ζ:J

    .line 419
    .line 420
    iget-wide v12, v0, Lyw1;->η:J

    .line 421
    .line 422
    iget-wide v8, v0, Lyw1;->ε:J

    .line 423
    .line 424
    invoke-direct/range {v7 .. v14}, Lyw1;-><init>(JJJ[J)V

    .line 425
    .line 426
    .line 427
    return-object v7

    .line 428
    :cond_14
    return-object v0
.end method
