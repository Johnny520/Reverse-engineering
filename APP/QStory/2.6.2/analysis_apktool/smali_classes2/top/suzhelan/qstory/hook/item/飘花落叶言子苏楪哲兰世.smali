.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;
.super L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u5170\u4e16;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u696a\u5170\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u696a\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p1, p2}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1, p0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static 飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p3}, Llin/xposed/hook/util/qq/QQNTTroopTool;->getGroupName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide v3, -0x36a5b9e7051405a7L    # -2.3437029419443675E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p0, 0xa

    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-wide v2, -0x36a5b9ea051405a7L    # -2.3436988585559645E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-wide p0, -0x36a5695a051405a7L    # -2.3717707926974742E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    const-wide v2, -0x36a50696051405a7L    # -2.4061855901583903E45

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v2, v3, v1, p0, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世(JLjava/lang/StringBuilder;J)V

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p2, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 71
    .line 72
    .line 73
    const-wide p0, -0x36a5b9d0051405a7L    # -2.3437342479221243E45

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-wide p0, -0x36a51f0a051405a7L    # -2.39766491969069E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1, v1, p3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-wide p0, -0x36a51ef4051405a7L    # -2.397694864538979E45

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-wide p1, -0x36a57c83051405a7L    # -2.3650944526584854E45

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object p1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 18
    .line 19
    const/16 v0, 0x3778

    .line 20
    .line 21
    if-gt p1, v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/16 v0, 0x7ea

    .line 28
    .line 29
    const/4 v1, 0x7

    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-static {v0, v1, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 42
    .line 43
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;

    .line 44
    .line 45
    invoke-direct {p1, p0, v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;I)V

    .line 46
    .line 47
    .line 48
    const-wide v0, -0x36a59105051405a7L    # -2.3579485229531457E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    const-wide v0, -0x36a590c6051405a7L    # -2.3580342741096098E45

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 65
    .line 66
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    const-wide p0, -0x36a562a6051405a7L    # -2.3741064908640195E45

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    const-wide p0, -0x36a5f453051405a7L    # -2.3233458896256893E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5ba5c051405a7L    # -2.3435436897966485E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 6

    .line 1
    sget-object p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 9
    .line 10
    .line 11
    const-wide v0, -0x36a5f44a051405a7L    # -2.3233581397908985E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    filled-new-array {p1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪兰世哲([Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, L飘花落叶言苏楪哲子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏楪哲兰世()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-wide v0, -0x36a592ed051405a7L    # -2.357284291772916E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-wide p0, -0x36a5602f051405a7L    # -2.374965363558128E45

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    sget p1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-wide v0, -0x36a537a2051405a7L    # -2.389095248562153E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-wide v0, -0x36a56ff8051405a7L    # -2.369465039379218E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 98
    .line 99
    const-class v4, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 100
    .line 101
    const-class v5, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 102
    .line 103
    const-class v0, Ljava/lang/String;

    .line 104
    .line 105
    const-class v1, Ljava/lang/String;

    .line 106
    .line 107
    const-class v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 108
    .line 109
    const-class v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 110
    .line 111
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    array-length p0, p0

    .line 133
    add-int/lit8 p0, p0, -0x1

    .line 134
    .line 135
    aget-object p0, p1, p0

    .line 136
    .line 137
    const-wide v0, -0x36a592e4051405a7L    # -2.3572965419381252E45

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 8
    .line 9
    .line 10
    const-wide v2, -0x36a52339051405a7L    # -2.3962071500308007E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-class v3, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3, v2, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-wide v5, -0x36a59e9e051405a7L    # -2.3532104312761386E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 37
    .line 38
    const-wide v7, -0x36a534b0051405a7L    # -2.3901215401807866E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-static {v7, v2, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    const-wide v9, -0x36a532b1051405a7L    # -2.390817077338773E45

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const/4 v9, 0x0

    .line 75
    new-array v10, v9, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v0, v2, v10}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-wide v10, -0x36a5b59d051405a7L    # -2.3451974620998843E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v2, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/4 v10, 0x1

    .line 99
    if-eq v2, v10, :cond_0

    .line 100
    .line 101
    const/16 v11, 0x64

    .line 102
    .line 103
    if-eq v2, v11, :cond_0

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    iget-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v2}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-wide v11, -0x36a5ba38051405a7L    # -2.343592690457485E45

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iput-object v2, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 126
    .line 127
    :goto_0
    const-wide v11, -0x36a528c8051405a7L    # -2.3942702627982867E45

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Ljava/lang/String;

    .line 141
    .line 142
    const-wide v11, -0x36a56256051405a7L    # -2.3742153812214342E45

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-static {v3, v11, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    check-cast v11, Ljava/lang/String;

    .line 156
    .line 157
    const-wide v12, -0x36a5625d051405a7L    # -2.3742058533151605E45

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {v13, v12, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    check-cast v12, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    const-wide v12, -0x36a56240051405a7L    # -2.3742453260697233E45

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    const/4 v12, 0x0

    .line 194
    invoke-static {v12, v6, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    const-wide v13, -0x36a56249051405a7L    # -2.374233075904514E45

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-static {v3, v6, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Ljava/lang/String;

    .line 212
    .line 213
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 214
    .line 215
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 216
    .line 217
    .line 218
    const-wide v13, -0x36a53c3f051405a7L    # -2.3874877546608185E45

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    invoke-static {v3, v13, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    iput-object v13, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v13, Ljava/lang/CharSequence;

    .line 234
    .line 235
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_1

    .line 240
    .line 241
    const-wide v13, -0x36a53c2e051405a7L    # -2.387510893861769E45

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-static {v3, v13, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iput-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 255
    .line 256
    :cond_1
    sget-object v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget-object v0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 262
    .line 263
    if-ne v5, v10, :cond_2

    .line 264
    .line 265
    const-wide v13, -0x36a562ff051405a7L    # -2.3739853503413957E45

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    iget-object v13, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 278
    .line 279
    invoke-virtual {v13, v3, v10}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-nez v3, :cond_2

    .line 284
    .line 285
    const-wide v13, -0x36a5ba2b051405a7L    # -2.343610385140565E45

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    goto :goto_1

    .line 295
    :cond_2
    const/16 v3, 0x400

    .line 296
    .line 297
    if-ne v5, v3, :cond_3

    .line 298
    .line 299
    const-wide v13, -0x36a562e0051405a7L    # -2.374027545354894E45

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget-object v10, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 312
    .line 313
    invoke-virtual {v10, v3, v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-nez v3, :cond_3

    .line 318
    .line 319
    const-wide v13, -0x36a5ba13051405a7L    # -2.3436430522477894E45

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    goto :goto_1

    .line 329
    :cond_3
    move-object v3, v12

    .line 330
    :goto_1
    if-eqz v3, :cond_5

    .line 331
    .line 332
    const-wide v7, -0x36a5ba9a051405a7L    # -2.343459299769652E45

    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    iget-object v0, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 345
    .line 346
    invoke-virtual {v0, v2, v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_4

    .line 351
    .line 352
    const-wide v7, -0x36a5ba60051405a7L    # -2.3435382452787778E45

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget-object v2, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 369
    .line 370
    const-wide v9, -0x36a5ba78051405a7L    # -2.3435055781715534E45

    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    check-cast v2, Ljava/lang/String;

    .line 382
    .line 383
    iget-object v5, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v5, Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {v0, v1, v2, v5}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iget-object v2, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    check-cast v2, Ljava/lang/String;

    .line 411
    .line 412
    iget-object v3, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v3, Ljava/lang/String;

    .line 415
    .line 416
    invoke-static {v0, v1, v2, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    :cond_4
    return-void

    .line 420
    :cond_5
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 421
    .line 422
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 423
    .line 424
    new-instance v3, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

    .line 425
    .line 426
    move-object/from16 v9, p0

    .line 427
    .line 428
    invoke-direct {v3, v9}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v3}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲苏兰;

    .line 436
    .line 437
    .line 438
    move-result-object v13

    .line 439
    new-instance v0, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$pares$1;

    .line 440
    .line 441
    const/4 v10, 0x0

    .line 442
    move-object v3, v11

    .line 443
    move-wide v15, v7

    .line 444
    move-object v8, v1

    .line 445
    move v1, v5

    .line 446
    move-object v7, v9

    .line 447
    move-object v9, v6

    .line 448
    move-wide v5, v15

    .line 449
    invoke-direct/range {v0 .. v10}, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$pares$1;-><init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;JLtop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 450
    .line 451
    .line 452
    const/4 v1, 0x3

    .line 453
    invoke-static {v13, v12, v12, v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 454
    .line 455
    .line 456
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    instance-of v4, v3, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;

    .line 15
    .line 16
    iget v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;

    .line 29
    .line 30
    move-object/from16 v5, p0

    .line 31
    .line 32
    invoke-direct {v4, v5, v3}, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->result:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 38
    .line 39
    iget v6, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->label:I

    .line 40
    .line 41
    sget-object v7, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x0

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-ne v6, v9, :cond_1

    .line 49
    .line 50
    iget-object v0, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$16:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$15:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/util/Random;

    .line 57
    .line 58
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$14:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/List;

    .line 61
    .line 62
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$13:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, [Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$12:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$11:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v2, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$10:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$9:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$8:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$7:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$6:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$5:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$4:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 99
    .line 100
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$3:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 103
    .line 104
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$2:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v5, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$1:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v4, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v9, v1

    .line 120
    move-object v1, v0

    .line 121
    move-object v0, v5

    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_1
    const-wide v0, -0x36a57f60051405a7L    # -2.3640967447586732E45

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v10

    .line 137
    :cond_2
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-static/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-wide v11, -0x36a5baa9051405a7L    # -2.343438882827637E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    const-wide v11, -0x36a55630051405a7L    # -2.3784484938659307E45

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    const-wide v11, -0x36a53501051405a7L    # -2.3900112886939042E45

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-virtual {v3, v11}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    const-wide v12, -0x36a5623d051405a7L    # -2.3742494094581263E45

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-virtual {v11, v12}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    const-wide v13, -0x36a57ba1051405a7L    # -2.365402067918182E45

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    const-wide v15, -0x36a5b9de051405a7L    # -2.3437151921095767E45

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static/range {v15 .. v16}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    invoke-virtual {v11, v15}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQNTTroopTool;->getGroupName(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    move-wide/from16 p0, v13

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    if-eqz v6, :cond_4

    .line 226
    .line 227
    sget-object v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v1, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 233
    .line 234
    const-wide v2, -0x36a5ba9a051405a7L    # -2.343459299769652E45

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object v1, v1, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 247
    .line 248
    invoke-virtual {v1, v2, v13}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_3

    .line 253
    .line 254
    const-wide v1, -0x36a5b9c6051405a7L    # -2.343747859216801E45

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v3, v11, v12, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-static {v1, v11, v12, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_3
    return-object v7

    .line 281
    :cond_4
    const-wide v16, -0x36a56227051405a7L    # -2.3742793543064154E45

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-virtual {v3, v14}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    const-wide v16, -0x36a5622b051405a7L    # -2.3742739097885446E45

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    invoke-virtual {v3, v14}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-static/range {p0 .. p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v14, Ljava/math/BigDecimal;

    .line 314
    .line 315
    invoke-direct {v14, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    new-instance v3, Ljava/math/BigDecimal;

    .line 319
    .line 320
    const/16 v10, 0x64

    .line 321
    .line 322
    invoke-direct {v3, v10}, Ljava/math/BigDecimal;-><init>(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v14, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    sget-object v10, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 330
    .line 331
    invoke-virtual {v3, v8, v10}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const-wide v16, -0x36a57c83051405a7L    # -2.3650944526584854E45

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    new-instance v10, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const-wide v13, -0x36a56212051405a7L    # -2.3743079380252367E45

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    invoke-static {v13, v14, v10, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const-wide v13, -0x36a5b9ea051405a7L    # -2.3436988585559645E45

    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    const-wide v8, -0x36a50696051405a7L    # -2.4061855901583903E45

    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    invoke-static {v8, v9, v10, v13, v14}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世(JLjava/lang/StringBuilder;J)V

    .line 374
    .line 375
    .line 376
    invoke-static {v10, v11, v8, v9}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 377
    .line 378
    .line 379
    const-wide v13, -0x36a5695a051405a7L    # -2.3717707926974742E45

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    invoke-static {v13, v14, v10, v12}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const-wide v11, -0x36a5b9d0051405a7L    # -2.3437342479221243E45

    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    invoke-static {v8, v9, v10, v11, v12}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世(JLjava/lang/StringBuilder;J)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    const-wide v8, -0x36a51f0a051405a7L    # -2.39766491969069E45

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-wide v8, -0x36a51ef4051405a7L    # -2.397694864538979E45

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    const/4 v10, 0x1

    .line 437
    invoke-static {v10, v9}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    sget-object v11, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 442
    .line 443
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    sget-object v11, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 447
    .line 448
    const-wide v12, -0x36a562f5051405a7L    # -2.3739989616360725E45

    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    invoke-static {v12, v13}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    iget-object v11, v11, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 461
    .line 462
    invoke-virtual {v11, v12, v10}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    if-eqz v11, :cond_5

    .line 467
    .line 468
    invoke-static {v8}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 472
    .line 473
    .line 474
    move-result v11

    .line 475
    if-lez v11, :cond_9

    .line 476
    .line 477
    const-wide v11, -0x36a56230051405a7L    # -2.3742671041412062E45

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    invoke-virtual {v1, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    if-eqz v11, :cond_6

    .line 491
    .line 492
    invoke-static {v10, v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(ILjava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    :cond_6
    new-instance v10, Lkotlin/text/Regex;

    .line 497
    .line 498
    const-wide v11, -0x36a56232051405a7L    # -2.374264381882271E45

    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v11

    .line 507
    invoke-direct {v10, v11}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    const/4 v11, 0x0

    .line 511
    invoke-virtual {v10, v1, v11}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    new-array v10, v11, [Ljava/lang/String;

    .line 516
    .line 517
    invoke-interface {v1, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    check-cast v1, [Ljava/lang/String;

    .line 522
    .line 523
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏兰世哲楪([Ljava/lang/Object;)Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    new-instance v10, Ljava/util/Random;

    .line 528
    .line 529
    invoke-direct {v10}, Ljava/util/Random;-><init>()V

    .line 530
    .line 531
    .line 532
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 533
    .line 534
    .line 535
    move-result v11

    .line 536
    invoke-virtual {v10, v11}, Ljava/util/Random;->nextInt(I)I

    .line 537
    .line 538
    .line 539
    move-result v10

    .line 540
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, Ljava/lang/String;

    .line 545
    .line 546
    if-lez v2, :cond_8

    .line 547
    .line 548
    int-to-long v11, v2

    .line 549
    const/4 v13, 0x0

    .line 550
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$0:Ljava/lang/Object;

    .line 551
    .line 552
    iput-object v0, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$1:Ljava/lang/Object;

    .line 553
    .line 554
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$2:Ljava/lang/Object;

    .line 555
    .line 556
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$3:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$4:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$5:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$6:Ljava/lang/Object;

    .line 563
    .line 564
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$7:Ljava/lang/Object;

    .line 565
    .line 566
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$8:Ljava/lang/Object;

    .line 567
    .line 568
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$9:Ljava/lang/Object;

    .line 569
    .line 570
    iput-object v8, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$10:Ljava/lang/Object;

    .line 571
    .line 572
    iput-object v9, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$11:Ljava/lang/Object;

    .line 573
    .line 574
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$12:Ljava/lang/Object;

    .line 575
    .line 576
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$13:Ljava/lang/Object;

    .line 577
    .line 578
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$14:Ljava/lang/Object;

    .line 579
    .line 580
    iput-object v13, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$15:Ljava/lang/Object;

    .line 581
    .line 582
    iput-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$16:Ljava/lang/Object;

    .line 583
    .line 584
    iput v2, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$0:I

    .line 585
    .line 586
    iput v6, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$1:I

    .line 587
    .line 588
    iput v10, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$2:I

    .line 589
    .line 590
    const/4 v10, 0x1

    .line 591
    iput v10, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->label:I

    .line 592
    .line 593
    invoke-static {v11, v12, v4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    if-ne v2, v5, :cond_7

    .line 598
    .line 599
    return-object v5

    .line 600
    :cond_7
    move-object v2, v8

    .line 601
    :goto_1
    move-object v8, v2

    .line 602
    :cond_8
    const/4 v3, 0x2

    .line 603
    invoke-static {v3, v0}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-static {v0, v1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    :cond_9
    invoke-static {v9, v8}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    return-object v7
.end method

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance p0, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;)Z
    .locals 2

    .line 1
    const-wide v0, -0x36a58b74051405a7L    # -2.359888132444595E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p0, p1, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 p1, 0x1

    .line 16
    if-lt p0, p1, :cond_0

    .line 17
    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
