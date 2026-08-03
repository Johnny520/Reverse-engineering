.class public final Li2/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li2/f0;

.field public final b:Li2/u;

.field public final c:Li2/x;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Li2/n0;

    .line 2
    .line 3
    const-wide/16 v9, 0x0

    .line 4
    .line 5
    const v11, 0xffffff

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    invoke-direct/range {v0 .. v11}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(JJLm2/k;JIJI)V
    .locals 24

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, Lf1/w;->g:J

    .line 8
    .line 9
    move-wide v4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v4, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-wide v1, Lu2/o;->c:J

    .line 18
    .line 19
    move-wide v6, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v6, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    move-object v8, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v8, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit16 v1, v0, 0x80

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    sget-wide v9, Lu2/o;->c:J

    .line 37
    .line 38
    move-wide v13, v9

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move-wide/from16 v13, p6

    .line 41
    .line 42
    :goto_3
    sget-wide v18, Lf1/w;->g:J

    .line 43
    .line 44
    const v1, 0x8000

    .line 45
    .line 46
    .line 47
    and-int/2addr v1, v0

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move/from16 v1, p8

    .line 53
    .line 54
    :goto_4
    const/high16 v3, 0x20000

    .line 55
    .line 56
    and-int/2addr v0, v3

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    sget-wide v9, Lu2/o;->c:J

    .line 60
    .line 61
    move-wide/from16 v22, v9

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_5
    move-wide/from16 v22, p9

    .line 65
    .line 66
    :goto_5
    new-instance v3, Li2/f0;

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v12, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    const/16 v20, 0x0

    .line 78
    .line 79
    const/16 v21, 0x0

    .line 80
    .line 81
    invoke-direct/range {v3 .. v21}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Li2/u;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    move-object/from16 p1, v0

    .line 92
    .line 93
    move/from16 p2, v1

    .line 94
    .line 95
    move-object/from16 p7, v2

    .line 96
    .line 97
    move/from16 p3, v4

    .line 98
    .line 99
    move-object/from16 p6, v5

    .line 100
    .line 101
    move-object/from16 p8, v6

    .line 102
    .line 103
    move/from16 p9, v7

    .line 104
    .line 105
    move/from16 p10, v8

    .line 106
    .line 107
    move-object/from16 p11, v9

    .line 108
    .line 109
    move-wide/from16 p4, v22

    .line 110
    .line 111
    invoke-direct/range {p1 .. p11}, Li2/u;-><init>(IIJLt2/q;Li2/w;Lt2/i;IILt2/s;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    move-object/from16 v2, p0

    .line 116
    .line 117
    invoke-direct {v2, v3, v0, v1}, Li2/n0;-><init>(Li2/f0;Li2/u;Li2/x;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Li2/f0;Li2/u;)V
    .locals 2

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    iget-object v0, p2, Li2/u;->e:Li2/w;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 123
    :cond_0
    new-instance v1, Li2/x;

    invoke-direct {v1, v0}, Li2/x;-><init>(Li2/w;)V

    move-object v0, v1

    .line 124
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Li2/n0;-><init>(Li2/f0;Li2/u;Li2/x;)V

    return-void
.end method

.method public constructor <init>(Li2/f0;Li2/u;Li2/x;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Li2/n0;->a:Li2/f0;

    .line 127
    iput-object p2, p0, Li2/n0;->b:Li2/u;

    .line 128
    iput-object p3, p0, Li2/n0;->c:Li2/x;

    return-void
.end method

.method public static c(Li2/n0;JJLm2/k;Lm2/p;JIJI)Li2/n0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p12

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v2, Lu2/o;->c:J

    .line 10
    .line 11
    move-wide v9, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v9, p3

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x4

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    move-object v11, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v11, p5

    .line 23
    .line 24
    :goto_1
    and-int/lit8 v2, v1, 0x20

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    move-object v14, v3

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v14, p6

    .line 31
    .line 32
    :goto_2
    and-int/lit16 v2, v1, 0x80

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    sget-wide v4, Lu2/o;->c:J

    .line 37
    .line 38
    move-wide/from16 v16, v4

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-wide/from16 v16, p7

    .line 42
    .line 43
    :goto_3
    sget-wide v21, Lf1/w;->g:J

    .line 44
    .line 45
    const v2, 0x8000

    .line 46
    .line 47
    .line 48
    and-int/2addr v2, v1

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move/from16 v2, p9

    .line 54
    .line 55
    :goto_4
    const/high16 v4, 0x20000

    .line 56
    .line 57
    and-int/2addr v1, v4

    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    sget-wide v4, Lu2/o;->c:J

    .line 61
    .line 62
    move-wide/from16 v26, v4

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move-wide/from16 v26, p10

    .line 66
    .line 67
    :goto_5
    iget-object v4, v0, Li2/n0;->a:Li2/f0;

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v15, 0x0

    .line 75
    const/16 v18, 0x0

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/16 v20, 0x0

    .line 80
    .line 81
    const/16 v23, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    const/16 v25, 0x0

    .line 86
    .line 87
    move-wide/from16 v5, p1

    .line 88
    .line 89
    invoke-static/range {v4 .. v25}, Li2/g0;->a(Li2/f0;JLf1/s;FJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;Lh1/c;)Li2/f0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v4, v0, Li2/n0;->b:Li2/u;

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    move/from16 p2, v2

    .line 101
    .line 102
    move-object/from16 p7, v3

    .line 103
    .line 104
    move-object/from16 p1, v4

    .line 105
    .line 106
    move/from16 p3, v5

    .line 107
    .line 108
    move-object/from16 p6, v6

    .line 109
    .line 110
    move-object/from16 p8, v7

    .line 111
    .line 112
    move/from16 p9, v8

    .line 113
    .line 114
    move/from16 p10, v9

    .line 115
    .line 116
    move-object/from16 p11, v10

    .line 117
    .line 118
    move-wide/from16 p4, v26

    .line 119
    .line 120
    invoke-static/range {p1 .. p11}, Li2/v;->a(Li2/u;IIJLt2/q;Li2/w;Lt2/i;IILt2/s;)Li2/u;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v3, v0, Li2/n0;->a:Li2/f0;

    .line 125
    .line 126
    if-ne v3, v1, :cond_6

    .line 127
    .line 128
    iget-object v3, v0, Li2/n0;->b:Li2/u;

    .line 129
    .line 130
    if-ne v3, v2, :cond_6

    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_6
    new-instance v0, Li2/n0;

    .line 134
    .line 135
    invoke-direct {v0, v1, v2}, Li2/n0;-><init>(Li2/f0;Li2/u;)V

    .line 136
    .line 137
    .line 138
    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, Li2/n0;->a:Li2/f0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/f0;->a:Lt2/o;

    .line 4
    .line 5
    invoke-interface {v0}, Lt2/o;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final b(Li2/n0;)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Li2/n0;->b:Li2/u;

    .line 4
    .line 5
    iget-object v1, p1, Li2/n0;->b:Li2/u;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Li2/n0;->a:Li2/f0;

    .line 14
    .line 15
    iget-object p1, p1, Li2/n0;->a:Li2/f0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Li2/f0;->a(Li2/f0;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Li2/n0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Li2/n0;

    .line 12
    .line 13
    iget-object v1, p1, Li2/n0;->a:Li2/f0;

    .line 14
    .line 15
    iget-object v3, p0, Li2/n0;->a:Li2/f0;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Li2/n0;->b:Li2/u;

    .line 25
    .line 26
    iget-object v3, p1, Li2/n0;->b:Li2/u;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Li2/n0;->c:Li2/x;

    .line 36
    .line 37
    iget-object p1, p1, Li2/n0;->c:Li2/x;

    .line 38
    .line 39
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/n0;->a:Li2/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li2/f0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Li2/n0;->b:Li2/u;

    .line 10
    .line 11
    invoke-virtual {v1}, Li2/u;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Li2/n0;->c:Li2/x;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Li2/x;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, v0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Li2/n0;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Lf1/w;->i(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", brush="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Li2/n0;->a:Li2/f0;

    .line 25
    .line 26
    iget-object v2, v1, Li2/f0;->a:Lt2/o;

    .line 27
    .line 28
    invoke-interface {v2}, Lt2/o;->c()Lf1/s;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", alpha="

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, Li2/f0;->a:Lt2/o;

    .line 41
    .line 42
    invoke-interface {v2}, Lt2/o;->a()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", fontSize="

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Li2/f0;->b:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Lu2/o;->d(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, ", fontWeight="

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, Li2/f0;->c:Lm2/k;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, ", fontStyle="

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, Li2/f0;->d:Lm2/i;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, ", fontSynthesis="

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, Li2/f0;->e:Lm2/j;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, ", fontFamily="

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, Li2/f0;->f:Lm2/p;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, ", fontFeatureSettings="

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, Li2/f0;->g:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ", letterSpacing="

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-wide v2, v1, Li2/f0;->h:J

    .line 119
    .line 120
    invoke-static {v2, v3}, Lu2/o;->d(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v2, ", baselineShift="

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, Li2/f0;->i:Lt2/a;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, ", textGeometricTransform="

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, Li2/f0;->j:Lt2/p;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v2, ", localeList="

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v2, v1, Li2/f0;->k:Lp2/b;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v2, ", background="

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-wide v2, v1, Li2/f0;->l:J

    .line 163
    .line 164
    invoke-static {v2, v3}, Lf1/w;->i(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v2, ", textDecoration="

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-object v2, v1, Li2/f0;->m:Lt2/l;

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v2, ", shadow="

    .line 182
    .line 183
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-object v2, v1, Li2/f0;->n:Lf1/q0;

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v2, ", drawStyle="

    .line 192
    .line 193
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    iget-object v1, v1, Li2/f0;->o:Lh1/c;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, ", textAlign="

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Li2/n0;->b:Li2/u;

    .line 207
    .line 208
    iget v2, v1, Li2/u;->a:I

    .line 209
    .line 210
    invoke-static {v2}, Lt2/k;->a(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v2, ", textDirection="

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget v2, v1, Li2/u;->b:I

    .line 223
    .line 224
    invoke-static {v2}, Lt2/m;->a(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v2, ", lineHeight="

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    iget-wide v2, v1, Li2/u;->c:J

    .line 237
    .line 238
    invoke-static {v2, v3}, Lu2/o;->d(J)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v2, ", textIndent="

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    iget-object v2, v1, Li2/u;->d:Lt2/q;

    .line 251
    .line 252
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v2, ", platformStyle="

    .line 256
    .line 257
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-object v2, p0, Li2/n0;->c:Li2/x;

    .line 261
    .line 262
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v2, ", lineHeightStyle="

    .line 266
    .line 267
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    iget-object v2, v1, Li2/u;->f:Lt2/i;

    .line 271
    .line 272
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v2, ", lineBreak="

    .line 276
    .line 277
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    iget v2, v1, Li2/u;->g:I

    .line 281
    .line 282
    invoke-static {v2}, Lt2/e;->a(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v2, ", hyphens="

    .line 290
    .line 291
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    iget v2, v1, Li2/u;->h:I

    .line 295
    .line 296
    invoke-static {v2}, Lt2/d;->a(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string v2, ", textMotion="

    .line 304
    .line 305
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    iget-object v1, v1, Li2/u;->i:Lt2/s;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const/16 v1, 0x29

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    return-object v0
.end method
