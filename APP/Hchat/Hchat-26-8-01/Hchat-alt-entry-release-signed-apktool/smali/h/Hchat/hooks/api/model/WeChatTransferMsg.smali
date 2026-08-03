.class public final Lh/Hchat/hooks/api/model/WeChatTransferMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final description:Ljava/lang/String;

.field public final fee:J

.field public final invalidTime:J

.field public final payer:Ljava/lang/String;

.field public final payerUsername:Ljava/lang/String;

.field public final rawXml:Ljava/lang/String;

.field public final receiver:Ljava/lang/String;

.field public final transId:Ljava/lang/String;

.field public final transactionId:Ljava/lang/String;

.field public final transferId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p9}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p5, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 19
    .line 20
    iput-wide p7, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 21
    .line 22
    iput-object p9, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p10, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transferId:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payerUsername:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic copy$default(Lh/Hchat/hooks/api/model/WeChatTransferMsg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatTransferMsg;
    .locals 0

    .line 1
    and-int/lit8 p12, p11, 0x1

    .line 2
    .line 3
    if-eqz p12, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p12, p11, 0x2

    .line 8
    .line 9
    if-eqz p12, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p12, p11, 0x4

    .line 14
    .line 15
    if-eqz p12, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p12, p11, 0x8

    .line 20
    .line 21
    if-eqz p12, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p12, p11, 0x10

    .line 26
    .line 27
    if-eqz p12, :cond_4

    .line 28
    .line 29
    iget-wide p5, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p12, p11, 0x20

    .line 32
    .line 33
    if-eqz p12, :cond_5

    .line 34
    .line 35
    iget-wide p7, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p12, p11, 0x40

    .line 38
    .line 39
    if-eqz p12, :cond_6

    .line 40
    .line 41
    iget-object p9, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p11, p11, 0x80

    .line 44
    .line 45
    if-eqz p11, :cond_7

    .line 46
    .line 47
    iget-object p10, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 48
    .line 49
    :cond_7
    move-object p11, p9

    .line 50
    move-object p12, p10

    .line 51
    move-wide p9, p7

    .line 52
    move-wide p7, p5

    .line 53
    move-object p5, p3

    .line 54
    move-object p6, p4

    .line 55
    move-object p3, p1

    .line 56
    move-object p4, p2

    .line 57
    move-object p2, p0

    .line 58
    invoke-virtual/range {p2 .. p12}, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component6()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatTransferMsg;
    .locals 11

    .line 1
    move-object/from16 v9, p9

    .line 2
    .line 3
    invoke-static {p1, p2, p3, p4, v9}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v4, p4

    .line 15
    move-wide/from16 v5, p5

    .line 16
    .line 17
    move-wide/from16 v7, p7

    .line 18
    .line 19
    move-object/from16 v10, p10

    .line 20
    .line 21
    invoke-direct/range {v0 .. v10}, Lh/Hchat/hooks/api/model/WeChatTransferMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;

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
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 12
    .line 13
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

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
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 58
    .line 59
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 60
    .line 61
    cmp-long v1, v3, v5

    .line 62
    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 67
    .line 68
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 69
    .line 70
    cmp-long v1, v3, v5

    .line 71
    .line 72
    if-eqz v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 87
    .line 88
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFee()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getInvalidTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getPayer()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPayerUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payerUsername:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRawXml()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReceiver()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransactionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransferId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transferId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v0

    .line 53
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transactionId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->transId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->payer:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->receiver:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v4, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->invalidTime:J

    .line 10
    .line 11
    iget-wide v6, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->fee:J

    .line 12
    .line 13
    iget-object v8, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v9, p0, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->rawXml:Ljava/lang/String;

    .line 16
    .line 17
    const-string v10, ", transId="

    .line 18
    .line 19
    const-string v11, ", payer="

    .line 20
    .line 21
    const-string v12, "WeChatTransferMsg(transactionId="

    .line 22
    .line 23
    invoke-static {v12, v0, v10, v1, v11}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, ", receiver="

    .line 28
    .line 29
    const-string v10, ", invalidTime="

    .line 30
    .line 31
    invoke-static {v0, v2, v1, v3, v10}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", fee="

    .line 38
    .line 39
    const-string v2, ", description="

    .line 40
    .line 41
    invoke-static {v0, v1, v6, v7, v2}, Lj8/b;->s(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v1, ", rawXml="

    .line 45
    .line 46
    const-string v2, ")"

    .line 47
    .line 48
    invoke-static {v0, v8, v1, v9, v2}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
