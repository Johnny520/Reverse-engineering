.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;
.super L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u54f2\u5170\u4e16;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u4e16\u54f2\u5170\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<init>",
        "()V",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;-><init>()V

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
    .locals 4

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
    const/16 v3, 0x822

    .line 16
    .line 17
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 p0, 0xa

    .line 28
    .line 29
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 p0, 0x823

    .line 40
    .line 41
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c"

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 p1, 0x453

    .line 61
    .line 62
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const/16 p0, 0x824

    .line 80
    .line 81
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p0, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 92
    .line 93
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 104
    .line 105
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const/16 p1, 0x4f4

    .line 117
    .line 118
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const/16 v0, 0x4cd

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget p1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 15
    .line 16
    const/16 v0, 0x38cc

    .line 17
    .line 18
    if-gt p1, v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/16 v0, 0x7ea

    .line 25
    .line 26
    const/4 v1, 0x7

    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v0, v1, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 39
    .line 40
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;

    .line 41
    .line 42
    invoke-direct {p1, p0, v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;I)V

    .line 43
    .line 44
    .line 45
    const/16 v0, 0x683

    .line 46
    .line 47
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x687

    .line 51
    .line 52
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const/16 p0, 0x40d

    .line 67
    .line 68
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    const/16 p0, 0xac4

    .line 77
    .line 78
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x81a

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
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
    sget-object p0, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 p1, 0xac6

    .line 12
    .line 13
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    filled-new-array {p1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世楪兰哲([Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏世楪哲兰()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/16 p1, 0x676

    .line 29
    .line 30
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const/16 p0, 0x42c

    .line 40
    .line 41
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 46
    .line 47
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/16 p1, 0x1a2

    .line 56
    .line 57
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-virtual {p0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const/16 p1, 0x42d

    .line 77
    .line 78
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 83
    .line 84
    const-class v4, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 85
    .line 86
    const-class v5, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 87
    .line 88
    const-class v0, Ljava/lang/String;

    .line 89
    .line 90
    const-class v1, Ljava/lang/String;

    .line 91
    .line 92
    const-class v2, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 93
    .line 94
    const-class v3, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏世哲兰;

    .line 95
    .line 96
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    array-length p0, p0

    .line 118
    add-int/lit8 p0, p0, -0x1

    .line 119
    .line 120
    aget-object p0, p1, p0

    .line 121
    .line 122
    const/16 p1, 0x675

    .line 123
    .line 124
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

    .line 1
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 7
    .line 8
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, v0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v2, 0x6a1

    .line 19
    .line 20
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 27
    .line 28
    const/16 v0, 0x1d2

    .line 29
    .line 30
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {v3, v0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v0, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    const/16 v0, 0x1ee

    .line 53
    .line 54
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v3, 0x0

    .line 59
    new-array v7, v3, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {p1, v0, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/16 v7, 0x7b8

    .line 66
    .line 67
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast v0, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v7, 0x1

    .line 80
    if-eq v0, v7, :cond_0

    .line 81
    .line 82
    const/16 v8, 0x64

    .line 83
    .line 84
    if-eq v0, v8, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/16 v8, 0x81b

    .line 96
    .line 97
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 104
    .line 105
    :goto_0
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 106
    .line 107
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v1, v0, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ljava/lang/String;

    .line 116
    .line 117
    const-string v8, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 118
    .line 119
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v1, v8, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    check-cast v8, Ljava/lang/String;

    .line 128
    .line 129
    const/16 v9, 0x410

    .line 130
    .line 131
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-static {v10, v9, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast v9, Ljava/lang/Number;

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    const/16 v9, 0x411

    .line 154
    .line 155
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    const/4 v11, 0x0

    .line 160
    invoke-static {v11, v9, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    const-string v9, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 165
    .line 166
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-static {v1, v9, p2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    check-cast p2, Ljava/lang/String;

    .line 175
    .line 176
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 177
    .line 178
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 179
    .line 180
    .line 181
    const/16 v10, 0x238

    .line 182
    .line 183
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-static {v1, v10, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    iput-object v10, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v10, Ljava/lang/CharSequence;

    .line 194
    .line 195
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    if-eqz v10, :cond_1

    .line 200
    .line 201
    const/16 v10, 0x239

    .line 202
    .line 203
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-static {v1, v10, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    iput-object p1, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 212
    .line 213
    :cond_1
    sget-object p1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object p1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 219
    .line 220
    if-ne v2, v7, :cond_2

    .line 221
    .line 222
    const/16 v1, 0x409

    .line 223
    .line 224
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {p1, v1, v7}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_2

    .line 233
    .line 234
    const/16 v1, 0x81c

    .line 235
    .line 236
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    goto :goto_1

    .line 241
    :cond_2
    const/16 v1, 0x400

    .line 242
    .line 243
    if-ne v2, v1, :cond_3

    .line 244
    .line 245
    const/16 v1, 0x40a

    .line 246
    .line 247
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {p1, v1, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-nez v1, :cond_3

    .line 256
    .line 257
    const/16 v1, 0x81d

    .line 258
    .line 259
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    goto :goto_1

    .line 264
    :cond_3
    move-object v1, v11

    .line 265
    :goto_1
    if-eqz v1, :cond_5

    .line 266
    .line 267
    const/16 p0, 0x816

    .line 268
    .line 269
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p1, p0, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    if-eqz p0, :cond_4

    .line 278
    .line 279
    new-instance p0, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    const/16 p1, 0x818

    .line 285
    .line 286
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object v0, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 304
    .line 305
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 306
    .line 307
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    check-cast v0, Ljava/lang/String;

    .line 314
    .line 315
    iget-object v3, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {p0, p2, v0, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    new-instance p0, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-static {p0, v1, p1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    iget-object p1, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 336
    .line 337
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    check-cast p1, Ljava/lang/String;

    .line 344
    .line 345
    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Ljava/lang/String;

    .line 348
    .line 349
    invoke-static {p0, p2, p1, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_4
    return-void

    .line 353
    :cond_5
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 354
    .line 355
    sget-object p1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;

    .line 356
    .line 357
    new-instance v1, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;

    .line 358
    .line 359
    invoke-direct {v1, p0}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-static {p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    move v1, v2

    .line 371
    move-object v2, v0

    .line 372
    new-instance v0, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$pares$1;

    .line 373
    .line 374
    const/4 v10, 0x0

    .line 375
    move-object v7, p0

    .line 376
    move-object v3, v8

    .line 377
    move-object v8, p2

    .line 378
    invoke-direct/range {v0 .. v10}, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$pares$1;-><init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;JLtop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 379
    .line 380
    .line 381
    const/4 p0, 0x3

    .line 382
    invoke-static {p1, v11, v11, v0, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 383
    .line 384
    .line 385
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 17

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
    move-object v10, v1

    .line 120
    move-object v1, v0

    .line 121
    move-object v0, v5

    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_1
    const/16 v0, 0x4d1

    .line 125
    .line 126
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v10

    .line 134
    :cond_2
    invoke-static {v3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    const/16 v6, 0x815

    .line 142
    .line 143
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    const-string v6, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 150
    .line 151
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    const/16 v11, 0x1cd

    .line 160
    .line 161
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v3, v11}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    const/16 v12, 0x412

    .line 170
    .line 171
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v11, v12}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    const/16 v13, 0x4fd

    .line 180
    .line 181
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const-string v14, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 188
    .line 189
    invoke-static {v14}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v11, v14}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQNTTroopTool;->getGroupName(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    const/4 v15, 0x0

    .line 202
    if-eqz v6, :cond_4

    .line 203
    .line 204
    sget-object v1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sget-object v1, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 210
    .line 211
    const/16 v2, 0x816

    .line 212
    .line 213
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v2, v15}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_3

    .line 222
    .line 223
    const/16 v1, 0x825

    .line 224
    .line 225
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v2, v11, v12, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v2}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v1, v11, v12, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :cond_3
    return-object v7

    .line 247
    :cond_4
    const/16 v16, 0x413

    .line 248
    .line 249
    move/from16 p0, v13

    .line 250
    .line 251
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    const-string v13, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 260
    .line 261
    invoke-static {v13}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v13

    .line 265
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static/range {p0 .. p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v13, Ljava/math/BigDecimal;

    .line 276
    .line 277
    invoke-direct {v13, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    new-instance v3, Ljava/math/BigDecimal;

    .line 281
    .line 282
    const/16 v10, 0x64

    .line 283
    .line 284
    invoke-direct {v3, v10}, Ljava/math/BigDecimal;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    sget-object v10, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 292
    .line 293
    invoke-virtual {v3, v8, v10}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {v3}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    const/16 v10, 0x4f4

    .line 302
    .line 303
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    new-instance v13, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const/16 v16, 0x414

    .line 315
    .line 316
    move/from16 p1, v10

    .line 317
    .line 318
    invoke-static/range {v16 .. v16}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string v3, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c"

    .line 329
    .line 330
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const/16 v10, 0x823

    .line 338
    .line 339
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const/16 v10, 0x453

    .line 357
    .line 358
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const/16 v3, 0x824

    .line 376
    .line 377
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 388
    .line 389
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 400
    .line 401
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    invoke-static/range {p1 .. p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    invoke-static {v9, v10}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    sget-object v11, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏子楪兰/飘花落叶言子苏楪世哲兰;

    .line 424
    .line 425
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    sget-object v11, L飘花落叶言苏哲子楪世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 429
    .line 430
    const/16 v12, 0x408

    .line 431
    .line 432
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v12

    .line 436
    invoke-virtual {v11, v12, v9}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    if-eqz v11, :cond_5

    .line 441
    .line 442
    invoke-static {v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    if-lez v11, :cond_9

    .line 450
    .line 451
    const-string v11, "\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 452
    .line 453
    invoke-static {v11}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v11

    .line 457
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    if-eqz v11, :cond_6

    .line 465
    .line 466
    invoke-static {v9, v1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏楪世兰(ILjava/lang/String;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    :cond_6
    new-instance v11, Lkotlin/text/Regex;

    .line 471
    .line 472
    const-string v12, "\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 473
    .line 474
    invoke-static {v12}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v12

    .line 478
    invoke-direct {v11, v12}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v11, v1, v15}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    new-array v11, v15, [Ljava/lang/String;

    .line 486
    .line 487
    invoke-interface {v1, v11}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    check-cast v1, [Ljava/lang/String;

    .line 492
    .line 493
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏哲兰世楪([Ljava/lang/Object;)Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    new-instance v11, Ljava/util/Random;

    .line 498
    .line 499
    invoke-direct {v11}, Ljava/util/Random;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 503
    .line 504
    .line 505
    move-result v12

    .line 506
    invoke-virtual {v11, v12}, Ljava/util/Random;->nextInt(I)I

    .line 507
    .line 508
    .line 509
    move-result v11

    .line 510
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    check-cast v1, Ljava/lang/String;

    .line 515
    .line 516
    if-lez v2, :cond_8

    .line 517
    .line 518
    int-to-long v12, v2

    .line 519
    const/4 v14, 0x0

    .line 520
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$0:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v0, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$1:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$2:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$3:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$4:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$5:Ljava/lang/Object;

    .line 531
    .line 532
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$6:Ljava/lang/Object;

    .line 533
    .line 534
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$7:Ljava/lang/Object;

    .line 535
    .line 536
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$8:Ljava/lang/Object;

    .line 537
    .line 538
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$9:Ljava/lang/Object;

    .line 539
    .line 540
    iput-object v3, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$10:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v10, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$11:Ljava/lang/Object;

    .line 543
    .line 544
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$12:Ljava/lang/Object;

    .line 545
    .line 546
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$13:Ljava/lang/Object;

    .line 547
    .line 548
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$14:Ljava/lang/Object;

    .line 549
    .line 550
    iput-object v14, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$15:Ljava/lang/Object;

    .line 551
    .line 552
    iput-object v1, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->L$16:Ljava/lang/Object;

    .line 553
    .line 554
    iput v2, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$0:I

    .line 555
    .line 556
    iput v6, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$1:I

    .line 557
    .line 558
    iput v11, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->I$2:I

    .line 559
    .line 560
    iput v9, v4, Ltop/suzhelan/qstory/hook/item/NewAutoGrabHb$onGrabSuccess$1;->label:I

    .line 561
    .line 562
    invoke-static {v12, v13, v4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世兰苏(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    if-ne v2, v5, :cond_7

    .line 567
    .line 568
    return-object v5

    .line 569
    :cond_7
    move-object v2, v3

    .line 570
    :goto_1
    move-object v3, v2

    .line 571
    :cond_8
    invoke-static {v8, v0}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0, v1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    :cond_9
    invoke-static {v10, v3}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendText(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
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

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5"

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 p1, 0x1

    .line 13
    if-lt p0, p1, :cond_0

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method
