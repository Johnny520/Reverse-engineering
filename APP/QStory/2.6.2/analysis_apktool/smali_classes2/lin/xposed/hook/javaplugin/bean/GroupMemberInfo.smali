.class public Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public IsAdmin:Z

.field public IsOwner:Z

.field public Join_Time:J

.field public Last_AvtivityTime:J

.field public NickName:Ljava/lang/String;

.field public UserLevel:I

.field public UserName:Ljava/lang/String;

.field public UserUin:Ljava/lang/String;

.field public sourceInfo:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a53a66051405a7L    # -2.388131568899033E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x27

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-wide v2, -0x36a53a58051405a7L    # -2.3881506247115805E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserName:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-wide v2, -0x36a53a4d051405a7L    # -2.388165597135725E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->NickName:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-wide v1, -0x36a53a32051405a7L    # -2.3882023476313525E45

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget v1, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserLevel:I

    .line 81
    .line 82
    const-wide v2, -0x36a53a27051405a7L    # -2.388217320055497E45

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/StringBuilder;IJ)V

    .line 88
    .line 89
    .line 90
    iget-wide v1, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Join_Time:J

    .line 91
    .line 92
    const-wide v3, -0x36a53a14051405a7L    # -2.388243181515383E45

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1, v2, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/StringBuilder;JJ)V

    .line 98
    .line 99
    .line 100
    iget-wide v1, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->Last_AvtivityTime:J

    .line 101
    .line 102
    const-wide v3, -0x36a53a01051405a7L    # -2.388269042975269E45

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1, v2, v3, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲兰苏(Ljava/lang/StringBuilder;JJ)V

    .line 108
    .line 109
    .line 110
    iget-boolean v1, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsOwner:Z

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-wide v1, -0x36a539f4051405a7L    # -2.388286737658349E45

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-boolean p0, p0, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z

    .line 128
    .line 129
    const/16 v1, 0x7d

    .line 130
    .line 131
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0
.end method
