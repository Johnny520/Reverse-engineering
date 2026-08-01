.class public final Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;
.implements Landroidx/compose/ui/node/飘花落叶言子楪兰苏哲世;
.implements Landroidx/compose/ui/node/飘花落叶言子苏世哲兰楪;
.implements Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:Z

.field public final 飘花落叶言子世苏哲兰楪:I

.field public 飘花落叶言子世苏哲楪兰:Z

.field public 飘花落叶言子世苏楪兰哲:Z

.field public final 飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p3, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世楪兰哲苏:Z

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 23
    .line 24
    iput p1, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世苏哲兰楪:I

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic 飘花落叶言子兰楪哲苏世(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Z
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪哲世苏(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public final 飘花落叶言子兰楪世哲苏()Landroidx/compose/ui/layout/飘花落叶言子楪苏世兰哲;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_e

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 26
    .line 27
    iget v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    const v3, 0x800020

    .line 30
    .line 31
    .line 32
    and-int/2addr v2, v3

    .line 33
    if-eqz v2, :cond_c

    .line 34
    .line 35
    :goto_1
    if-eqz v0, :cond_c

    .line 36
    .line 37
    iget v2, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 38
    .line 39
    and-int v4, v2, v3

    .line 40
    .line 41
    if-eqz v4, :cond_b

    .line 42
    .line 43
    const/high16 v4, 0x800000

    .line 44
    .line 45
    and-int/2addr v4, v2

    .line 46
    if-eqz v4, :cond_5

    .line 47
    .line 48
    instance-of p0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;

    .line 49
    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    instance-of p0, v0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 54
    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    check-cast v0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 58
    .line 59
    iget-object p0, v0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 60
    .line 61
    move-object v0, v1

    .line 62
    :goto_2
    if-eqz p0, :cond_4

    .line 63
    .line 64
    instance-of v2, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    move-object v0, p0

    .line 69
    :cond_2
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move-object v0, v1

    .line 73
    :cond_4
    :goto_3
    check-cast v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;

    .line 74
    .line 75
    if-eqz v0, :cond_e

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_5
    and-int/lit8 v2, v2, 0x20

    .line 79
    .line 80
    if-eqz v2, :cond_b

    .line 81
    .line 82
    instance-of v2, v0, Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    move-object v4, v0

    .line 87
    goto :goto_5

    .line 88
    :cond_6
    instance-of v2, v0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 89
    .line 90
    if-eqz v2, :cond_8

    .line 91
    .line 92
    move-object v2, v0

    .line 93
    check-cast v2, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 94
    .line 95
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 96
    .line 97
    move-object v4, v1

    .line 98
    :goto_4
    if-eqz v2, :cond_9

    .line 99
    .line 100
    instance-of v5, v2, Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;

    .line 101
    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    move-object v4, v2

    .line 105
    :cond_7
    iget-object v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_8
    move-object v4, v1

    .line 109
    :cond_9
    :goto_5
    check-cast v4, Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;

    .line 110
    .line 111
    if-eqz v4, :cond_b

    .line 112
    .line 113
    invoke-interface {v4}, Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;->飘花落叶言子世兰哲楪苏()Landroidx/compose/ui/modifier/飘花落叶言子楪世苏哲兰;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget-object v5, Landroidx/compose/ui/layout/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/modifier/飘花落叶言子楪世哲兰苏;

    .line 118
    .line 119
    invoke-virtual {v2, v5}, Landroidx/compose/ui/modifier/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/modifier/飘花落叶言子楪世哲兰苏;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_a

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_a
    invoke-interface {v4}, Landroidx/compose/ui/modifier/飘花落叶言子楪世哲苏兰;->飘花落叶言子世兰哲楪苏()Landroidx/compose/ui/modifier/飘花落叶言子楪世苏哲兰;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    const-string v0, ""

    .line 136
    .line 137
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p0

    .line 141
    :cond_b
    :goto_6
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_c
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-eqz p0, :cond_d

    .line 149
    .line 150
    iget-object v0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 151
    .line 152
    if-eqz v0, :cond_d

    .line 153
    .line 154
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_d
    move-object v0, v1

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_e
    return-object v1
.end method

.method public final 飘花落叶言子兰楪世苏哲(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子哲兰苏世楪()Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1, p0, v2, v3}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-virtual {v0, p0, p1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(J)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-interface {p1, p0, v0}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;Z)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide p0, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 46
    .line 47
    invoke-static {p0, p1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {v2, v3, p0, p1}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(JJ)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final 飘花落叶言子兰楪哲世苏(I)Z
    .locals 1

    .line 1
    const-string v0, "FocusTransactions:requestFocus"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子哲兰苏世楪()Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子哲兰世苏楪(I)Z

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    :try_start_1
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusTargetNode$requestFocus$1$1;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;IL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Z

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method public final 飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    if-ne p0, v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    iget-boolean v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 35
    .line 36
    if-eqz v1, :cond_e

    .line 37
    .line 38
    iget-object v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 39
    .line 40
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    const-string v1, "visitAncestors called on an unattached node"

    .line 45
    .line 46
    invoke-static {v1}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 52
    .line 53
    invoke-static {v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    if-eqz v0, :cond_e

    .line 58
    .line 59
    iget-object v2, v0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 60
    .line 61
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 62
    .line 63
    iget v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 64
    .line 65
    and-int/lit16 v2, v2, 0x400

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    if-eqz v2, :cond_c

    .line 69
    .line 70
    :goto_1
    if-eqz v1, :cond_c

    .line 71
    .line 72
    iget v2, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 73
    .line 74
    and-int/lit16 v2, v2, 0x400

    .line 75
    .line 76
    if-eqz v2, :cond_b

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    move-object v4, v3

    .line 80
    :goto_2
    if-eqz v2, :cond_b

    .line 81
    .line 82
    instance-of v5, v2, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    check-cast v2, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 87
    .line 88
    if-ne p0, v2, :cond_a

    .line 89
    .line 90
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_4
    iget v5, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 94
    .line 95
    and-int/lit16 v5, v5, 0x400

    .line 96
    .line 97
    if-eqz v5, :cond_a

    .line 98
    .line 99
    instance-of v5, v2, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 100
    .line 101
    if-eqz v5, :cond_a

    .line 102
    .line 103
    move-object v5, v2

    .line 104
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 105
    .line 106
    iget-object v5, v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    move v7, v6

    .line 110
    :goto_3
    const/4 v8, 0x1

    .line 111
    if-eqz v5, :cond_9

    .line 112
    .line 113
    iget v9, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 114
    .line 115
    and-int/lit16 v9, v9, 0x400

    .line 116
    .line 117
    if-eqz v9, :cond_8

    .line 118
    .line 119
    add-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    if-ne v7, v8, :cond_5

    .line 122
    .line 123
    move-object v2, v5

    .line 124
    goto :goto_4

    .line 125
    :cond_5
    if-nez v4, :cond_6

    .line 126
    .line 127
    new-instance v4, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 128
    .line 129
    const/16 v8, 0x10

    .line 130
    .line 131
    new-array v8, v8, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 132
    .line 133
    invoke-direct {v4, v6, v8}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    if-eqz v2, :cond_7

    .line 137
    .line 138
    invoke-virtual {v4, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    move-object v2, v3

    .line 142
    :cond_7
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    :goto_4
    iget-object v5, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_9
    if-ne v7, v8, :cond_a

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_a
    invoke-static {v4}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_2

    .line 156
    :cond_b
    iget-object v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_c
    invoke-virtual {v0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz v0, :cond_d

    .line 164
    .line 165
    iget-object v1, v0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 166
    .line 167
    if-eqz v1, :cond_d

    .line 168
    .line 169
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_d
    move-object v1, v3

    .line 173
    goto :goto_0

    .line 174
    :cond_e
    sget-object p0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 175
    .line 176
    return-object p0
.end method

.method public final 飘花落叶言子兰楪苏哲世()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    if-eq v0, p0, :cond_2

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 31
    .line 32
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v2, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;

    .line 36
    .line 37
    invoke-direct {v2, v0, p0}, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v2}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;

    .line 48
    .line 49
    invoke-interface {v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1, v1}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(IZZ)Z

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    return-void

    .line 73
    :cond_3
    const-string p0, "focusProperties"

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public final 飘花落叶言子哲世兰楪苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子哲兰世苏楪(I)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Landroidx/compose/ui/focus/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:[I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p1, v0, :cond_3

    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    if-eq p1, p0, :cond_2

    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    if-eq p1, p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    if-ne p1, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    return v0

    .line 34
    :cond_3
    invoke-static {p0}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public final 飘花落叶言子哲兰苏世楪()Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;
    .locals 11

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Z

    .line 8
    .line 9
    sget-object v2, Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 10
    .line 11
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 16
    .line 17
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 18
    .line 19
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 20
    .line 21
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 24
    .line 25
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰:Landroidx/compose/ui/focus/飘花落叶言子楪兰世哲苏;

    .line 26
    .line 27
    sget-object v2, Landroidx/compose/ui/focus/FocusPropertiesImpl$onEnter$1;->INSTANCE:Landroidx/compose/ui/focus/FocusPropertiesImpl$onEnter$1;

    .line 28
    .line 29
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    sget-object v2, Landroidx/compose/ui/focus/FocusPropertiesImpl$onExit$1;->INSTANCE:Landroidx/compose/ui/focus/FocusPropertiesImpl$onExit$1;

    .line 32
    .line 33
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    sget-object v2, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 36
    .line 37
    iput-object v2, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iget v3, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世苏哲兰楪:I

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-ne v3, v1, :cond_0

    .line 44
    .line 45
    move v3, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    if-nez v3, :cond_2

    .line 48
    .line 49
    sget-object v3, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲世苏兰:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 50
    .line 51
    invoke-static {p0, v3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, L飘花落叶言子世兰苏楪哲/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    check-cast v3, L飘花落叶言子世兰苏楪哲/飘花落叶言子楪世哲苏兰;

    .line 58
    .line 59
    iget-object v3, v3, L飘花落叶言子世兰苏楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 60
    .line 61
    check-cast v3, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 62
    .line 63
    invoke-virtual {v3}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, L飘花落叶言子世兰苏楪哲/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    iget v3, v3, L飘花落叶言子世兰苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 70
    .line 71
    if-ne v3, v1, :cond_1

    .line 72
    .line 73
    move v3, v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move v3, v4

    .line 76
    :goto_0
    xor-int/2addr v3, v1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 v5, 0x2

    .line 79
    if-ne v3, v5, :cond_10

    .line 80
    .line 81
    move v3, v4

    .line 82
    :goto_1
    iput-boolean v3, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Z

    .line 83
    .line 84
    iget-object v3, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 85
    .line 86
    iget-boolean v5, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 87
    .line 88
    if-nez v5, :cond_3

    .line 89
    .line 90
    const-string v5, "visitAncestors called on an unattached node"

    .line 91
    .line 92
    invoke-static {v5}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    iget-object v5, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 96
    .line 97
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_2
    if-eqz p0, :cond_f

    .line 102
    .line 103
    iget-object v6, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 104
    .line 105
    iget-object v6, v6, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 106
    .line 107
    iget v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 108
    .line 109
    and-int/lit16 v6, v6, 0xc00

    .line 110
    .line 111
    if-eqz v6, :cond_d

    .line 112
    .line 113
    :goto_3
    if-eqz v5, :cond_d

    .line 114
    .line 115
    iget v6, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 116
    .line 117
    and-int/lit16 v7, v6, 0xc00

    .line 118
    .line 119
    if-eqz v7, :cond_c

    .line 120
    .line 121
    if-eq v5, v3, :cond_4

    .line 122
    .line 123
    and-int/lit16 v7, v6, 0x400

    .line 124
    .line 125
    if-eqz v7, :cond_4

    .line 126
    .line 127
    goto/16 :goto_8

    .line 128
    .line 129
    :cond_4
    and-int/lit16 v6, v6, 0x800

    .line 130
    .line 131
    if-eqz v6, :cond_c

    .line 132
    .line 133
    move-object v7, v2

    .line 134
    move-object v6, v5

    .line 135
    :goto_4
    if-eqz v6, :cond_c

    .line 136
    .line 137
    instance-of v8, v6, Landroidx/compose/ui/focus/飘花落叶言子楪兰世苏哲;

    .line 138
    .line 139
    if-eqz v8, :cond_5

    .line 140
    .line 141
    check-cast v6, Landroidx/compose/ui/focus/飘花落叶言子楪兰世苏哲;

    .line 142
    .line 143
    invoke-interface {v6, v0}, Landroidx/compose/ui/focus/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰(Landroidx/compose/ui/focus/飘花落叶言子楪哲兰世苏;)V

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_5
    iget v8, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 148
    .line 149
    and-int/lit16 v8, v8, 0x800

    .line 150
    .line 151
    if-eqz v8, :cond_b

    .line 152
    .line 153
    instance-of v8, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 154
    .line 155
    if-eqz v8, :cond_b

    .line 156
    .line 157
    move-object v8, v6

    .line 158
    check-cast v8, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 159
    .line 160
    iget-object v8, v8, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 161
    .line 162
    move v9, v4

    .line 163
    :goto_5
    if-eqz v8, :cond_a

    .line 164
    .line 165
    iget v10, v8, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 166
    .line 167
    and-int/lit16 v10, v10, 0x800

    .line 168
    .line 169
    if-eqz v10, :cond_9

    .line 170
    .line 171
    add-int/lit8 v9, v9, 0x1

    .line 172
    .line 173
    if-ne v9, v1, :cond_6

    .line 174
    .line 175
    move-object v6, v8

    .line 176
    goto :goto_6

    .line 177
    :cond_6
    if-nez v7, :cond_7

    .line 178
    .line 179
    new-instance v7, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 180
    .line 181
    const/16 v10, 0x10

    .line 182
    .line 183
    new-array v10, v10, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 184
    .line 185
    invoke-direct {v7, v4, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_7
    if-eqz v6, :cond_8

    .line 189
    .line 190
    invoke-virtual {v7, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    move-object v6, v2

    .line 194
    :cond_8
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_9
    :goto_6
    iget-object v8, v8, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_a
    if-ne v9, v1, :cond_b

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_b
    :goto_7
    invoke-static {v7}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    goto :goto_4

    .line 208
    :cond_c
    iget-object v5, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-eqz p0, :cond_e

    .line 216
    .line 217
    iget-object v5, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 218
    .line 219
    if-eqz v5, :cond_e

    .line 220
    .line 221
    iget-object v5, v5, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_e
    move-object v5, v2

    .line 225
    goto :goto_2

    .line 226
    :cond_f
    :goto_8
    return-object v0

    .line 227
    :cond_10
    const-string p0, "Unknown Focusability"

    .line 228
    .line 229
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-object v2
.end method

.method public final 飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/focus/FocusStateImpl;Landroidx/compose/ui/focus/FocusStateImpl;)V
    .locals 11

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世苏楪哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v2, p1, p2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 31
    .line 32
    iget-boolean v2, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 33
    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-string v2, "visitAncestors called on an unattached node"

    .line 37
    .line 38
    invoke-static {v2}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 42
    .line 43
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_0
    if-eqz p0, :cond_e

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 50
    .line 51
    iget-object v3, v3, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 52
    .line 53
    iget v3, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 54
    .line 55
    and-int/lit16 v3, v3, 0x1400

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_c

    .line 59
    .line 60
    :goto_1
    if-eqz v2, :cond_c

    .line 61
    .line 62
    iget v3, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 63
    .line 64
    and-int/lit16 v5, v3, 0x1400

    .line 65
    .line 66
    if-eqz v5, :cond_b

    .line 67
    .line 68
    if-eq v2, p1, :cond_2

    .line 69
    .line 70
    and-int/lit16 v5, v3, 0x400

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_2
    and-int/lit16 v3, v3, 0x1000

    .line 77
    .line 78
    if-eqz v3, :cond_b

    .line 79
    .line 80
    move-object v3, v2

    .line 81
    move-object v5, v4

    .line 82
    :goto_2
    if-eqz v3, :cond_b

    .line 83
    .line 84
    instance-of v6, v3, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    check-cast v3, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eq v1, v6, :cond_3

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_3
    invoke-interface {v3, p2}, Landroidx/compose/ui/focus/飘花落叶言子楪世兰哲苏;->飘花落叶言子哲楪苏兰世(Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_4
    iget v6, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 102
    .line 103
    and-int/lit16 v6, v6, 0x1000

    .line 104
    .line 105
    if-eqz v6, :cond_a

    .line 106
    .line 107
    instance-of v6, v3, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 108
    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    move-object v6, v3

    .line 112
    check-cast v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 113
    .line 114
    iget-object v6, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    move v8, v7

    .line 118
    :goto_3
    const/4 v9, 0x1

    .line 119
    if-eqz v6, :cond_9

    .line 120
    .line 121
    iget v10, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 122
    .line 123
    and-int/lit16 v10, v10, 0x1000

    .line 124
    .line 125
    if-eqz v10, :cond_8

    .line 126
    .line 127
    add-int/lit8 v8, v8, 0x1

    .line 128
    .line 129
    if-ne v8, v9, :cond_5

    .line 130
    .line 131
    move-object v3, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    if-nez v5, :cond_6

    .line 134
    .line 135
    new-instance v5, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 136
    .line 137
    const/16 v9, 0x10

    .line 138
    .line 139
    new-array v9, v9, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 140
    .line 141
    invoke-direct {v5, v7, v9}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    if-eqz v3, :cond_7

    .line 145
    .line 146
    invoke-virtual {v5, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object v3, v4

    .line 150
    :cond_7
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    :goto_4
    iget-object v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    if-ne v8, v9, :cond_a

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_a
    :goto_5
    invoke-static {v5}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    goto :goto_2

    .line 164
    :cond_b
    iget-object v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_c
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    if-eqz p0, :cond_d

    .line 172
    .line 173
    iget-object v2, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 174
    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_d
    move-object v2, v4

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_e
    :goto_6
    return-void
.end method

.method public final 飘花落叶言子哲苏世兰楪()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusStateImpl;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    check-cast p0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, v0, v1, v1}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(IZZ)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子哲苏世楪兰()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0}, Landroidx/compose/ui/focus/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    iget-boolean p0, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世楪兰哲苏:Z

    .line 47
    .line 48
    if-ne p0, v1, :cond_4

    .line 49
    .line 50
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 51
    .line 52
    iget-object p0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子世苏楪哲兰()Z

    .line 55
    .line 56
    .line 57
    iget-object p0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 74
    .line 75
    const/16 v2, 0x8

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual {v0, v2, v1, v3}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(IZZ)Z

    .line 79
    .line 80
    .line 81
    iget-boolean p0, p0, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子世楪兰哲苏:Z

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    iget-object p0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子世苏楪哲兰()Z

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-object p0, v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 93
    .line 94
    .line 95
    :cond_4
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子苏世兰楪哲()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏哲世()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
