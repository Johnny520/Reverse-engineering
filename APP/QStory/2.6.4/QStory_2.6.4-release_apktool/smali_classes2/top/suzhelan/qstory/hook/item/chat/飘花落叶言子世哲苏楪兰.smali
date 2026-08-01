.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;

    .line 5
    .line 6
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;

    .line 4
    .line 5
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v2, 0x90f

    .line 11
    .line 12
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, v3, v2}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    :goto_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-wide v4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世苏哲:J

    .line 39
    .line 40
    sub-long v4, v2, v4

    .line 41
    .line 42
    iget-wide v6, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世哲苏:J

    .line 43
    .line 44
    cmp-long v0, v4, v6

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    iput-wide v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世苏哲:J

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    iput-wide v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪兰世苏哲:J

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/16 v2, 0x9b

    .line 62
    .line 63
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_1

    .line 77
    :catch_0
    const/16 v0, 0x7e3

    .line 78
    .line 79
    :try_start_1
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-class v2, Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v2, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_1
    if-nez v0, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5"

    .line 93
    .line 94
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-static {v3, v2, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/lang/Integer;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 112
    :cond_3
    const/4 v0, 0x1

    .line 113
    if-ne v1, v0, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    :try_start_2
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏兰哲世(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏兰楪;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catch_1
    :goto_2
    const/16 p0, 0x91e

    .line 121
    .line 122
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :catch_2
    move-exception p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 132
    .line 133
    .line 134
    :goto_3
    return-void
.end method
