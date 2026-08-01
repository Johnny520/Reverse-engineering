.class public abstract L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x4aa

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/16 v0, 0x4ab

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1, v0, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const/16 v2, 0x4a9

    .line 21
    .line 22
    invoke-static {v1, v0, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_0
    sget v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世:I

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/16 v1, 0x4ac

    .line 61
    .line 62
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 67
    .line 68
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    iput-object v1, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    new-array v1, v1, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {v0, p0, v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x4a9

    .line 12
    .line 13
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    sget-object p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_0
    sget-object v2, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v3, v2, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;->contains(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    new-instance v0, Ljava/lang/Thread;

    .line 57
    .line 58
    new-instance v3, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v3, p0, v4}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    invoke-static {p0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;

    .line 91
    .line 92
    iget-boolean v3, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->IsAdmin:Z

    .line 93
    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    iget-object v2, v2, Llin/xposed/hook/javaplugin/bean/GroupMemberInfo;->UserUin:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    invoke-static {p0, v0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method
