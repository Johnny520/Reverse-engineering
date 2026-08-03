.class public final Lhb/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Lk8/t;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 47
    invoke-static {p4, p5, p6, p10, p12}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-wide p1, p0, Lhb/t;->a:J

    .line 50
    iput p3, p0, Lhb/t;->b:I

    .line 51
    iput-object p4, p0, Lhb/t;->c:Ljava/lang/String;

    .line 52
    iput-object p5, p0, Lhb/t;->d:Ljava/lang/String;

    .line 53
    iput-object p6, p0, Lhb/t;->e:Ljava/lang/String;

    .line 54
    iput-wide p7, p0, Lhb/t;->f:J

    .line 55
    iput-object p9, p0, Lhb/t;->g:Lk8/t;

    .line 56
    iput-object p10, p0, Lhb/t;->h:Ljava/lang/String;

    .line 57
    iput p11, p0, Lhb/t;->i:I

    .line 58
    iput-object p12, p0, Lhb/t;->j:Ljava/lang/String;

    .line 59
    iput-object p13, p0, Lhb/t;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;I)V
    .locals 16

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x200

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    move-object v14, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v14, p12

    .line 12
    .line 13
    :goto_0
    and-int/lit16 v0, v0, 0x400

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move-object v15, v0

    .line 19
    :goto_1
    move-object/from16 v2, p0

    .line 20
    .line 21
    move-wide/from16 v3, p1

    .line 22
    .line 23
    move/from16 v5, p3

    .line 24
    .line 25
    move-object/from16 v6, p4

    .line 26
    .line 27
    move-object/from16 v7, p5

    .line 28
    .line 29
    move-object/from16 v8, p6

    .line 30
    .line 31
    move-wide/from16 v9, p7

    .line 32
    .line 33
    move-object/from16 v11, p9

    .line 34
    .line 35
    move-object/from16 v12, p10

    .line 36
    .line 37
    move/from16 v13, p11

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move-object/from16 v15, p13

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-direct/range {v2 .. v15}, Lhb/t;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLk8/t;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget v0, p0, Lhb/t;->b:I

    .line 2
    .line 3
    const v1, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    const/16 v1, 0x31

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Lhb/t;->g:Lk8/t;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-nez v0, :cond_2

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object v0, p0, Lhb/t;->d:Ljava/lang/String;

    .line 31
    .line 32
    :cond_3
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const-string v1, "type"

    .line 38
    .line 39
    invoke-static {v0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x6

    .line 55
    if-ne v0, v1, :cond_5

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :cond_5
    :goto_1
    const/4 v0, 0x0

    .line 60
    return v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget v0, p0, Lhb/t;->b:I

    .line 2
    .line 3
    const v1, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    const/16 v1, 0x31

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    iget-object v0, p0, Lhb/t;->g:Lk8/t;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lk8/t;->c:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-nez v0, :cond_2

    .line 22
    .line 23
    const-string v0, ""

    .line 24
    .line 25
    :cond_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lhb/t;->d:Ljava/lang/String;

    .line 32
    .line 33
    :cond_3
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ll8/d;->h(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lhb/t;->b:I

    .line 2
    .line 3
    const v1, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_5

    .line 12
    .line 13
    const/16 v1, 0x22

    .line 14
    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/16 v1, 0x3e

    .line 18
    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/16 v1, 0x2a

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x2b

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    const-string v0, "\u6d88\u606f"

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    invoke-virtual {p0}, Lhb/t;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string v0, "\u6587\u4ef6"

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lhb/t;->b()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const-string v0, "\u89c6\u9891\u53f7"

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    const-string v0, "\u5361\u7247"

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    const-string v0, "\u4f4d\u7f6e"

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_2
    const-string v0, "\u8868\u60c5"

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    const-string v0, "\u540d\u7247"

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    const-string v0, "\u89c6\u9891"

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_4
    const-string v0, "\u8bed\u97f3"

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_5
    const-string v0, "\u56fe\u7247"

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_6
    const-string v0, "\u6587\u672c"

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhb/t;

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
    check-cast p1, Lhb/t;

    .line 12
    .line 13
    iget-wide v3, p0, Lhb/t;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lhb/t;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget v1, p0, Lhb/t;->b:I

    .line 23
    .line 24
    iget v3, p1, Lhb/t;->b:I

    .line 25
    .line 26
    if-eq v1, v3, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object v1, p0, Lhb/t;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lhb/t;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-object v1, p0, Lhb/t;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lhb/t;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, Lhb/t;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p1, Lhb/t;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-wide v3, p0, Lhb/t;->f:J

    .line 63
    .line 64
    iget-wide v5, p1, Lhb/t;->f:J

    .line 65
    .line 66
    cmp-long v1, v3, v5

    .line 67
    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lhb/t;->g:Lk8/t;

    .line 72
    .line 73
    iget-object v3, p1, Lhb/t;->g:Lk8/t;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object v1, p0, Lhb/t;->h:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, p1, Lhb/t;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget v1, p0, Lhb/t;->i:I

    .line 94
    .line 95
    iget v3, p1, Lhb/t;->i:I

    .line 96
    .line 97
    if-eq v1, v3, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-object v1, p0, Lhb/t;->j:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, p1, Lhb/t;->j:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget-object v1, p0, Lhb/t;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object p1, p1, Lhb/t;->k:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_c

    .line 120
    .line 121
    return v2

    .line 122
    :cond_c
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lhb/t;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lhb/t;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lhb/t;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lhb/t;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lhb/t;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, Lhb/t;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x0

    .line 41
    iget-object v3, p0, Lhb/t;->g:Lk8/t;

    .line 42
    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    move v3, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v3}, Lk8/t;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_0
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v3, p0, Lhb/t;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget v3, p0, Lhb/t;->i:I

    .line 60
    .line 61
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v3, p0, Lhb/t;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, Leh/a;->g(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v1, p0, Lhb/t;->k:Ljava/lang/Object;

    .line 72
    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    :goto_1
    add-int/2addr v0, v2

    .line 81
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SelectedMessageSnapshot(msgId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lhb/t;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", type="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lhb/t;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", sourceTalker="

    .line 24
    .line 25
    const-string v2, ", content="

    .line 26
    .line 27
    iget-object v3, p0, Lhb/t;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lhb/t;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1, v3, v2, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", imagePath="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lhb/t;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", createTime="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-wide v1, p0, Lhb/t;->f:J

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", retransmit="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lhb/t;->g:Lk8/t;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", voicePath="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lhb/t;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", voiceDurationMillis="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v1, p0, Lhb/t;->i:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", voiceFileName="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lhb/t;->j:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", nativeMessage="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lhb/t;->k:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ")"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0
.end method
