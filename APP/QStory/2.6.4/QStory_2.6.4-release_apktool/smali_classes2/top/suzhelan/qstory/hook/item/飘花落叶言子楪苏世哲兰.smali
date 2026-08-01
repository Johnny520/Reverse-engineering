.class public Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世哲兰;
.super L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;


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


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    sget p1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/16 v0, 0x2204

    .line 4
    .line 5
    if-gt p1, v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/16 v0, 0x7ea

    .line 12
    .line 13
    const/4 v1, 0x7

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, v1, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    new-instance p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    const-string v0, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5"

    .line 32
    .line 33
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v1, 0x40e

    .line 38
    .line 39
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {p1, v0, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    :cond_0
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;I)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    const/16 v0, 0x683

    .line 57
    .line 58
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    const/16 v0, 0x687

    .line 62
    .line 63
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 67
    .line 68
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    const/16 p1, 0x97

    .line 77
    .line 78
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const/16 v0, 0x40f

    .line 87
    .line 88
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const/16 v1, 0x9a

    .line 93
    .line 94
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iget-object v4, v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 107
    .line 108
    iput-object p1, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v4, v1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 119
    .line 120
    const-class v5, Ljava/util/List;

    .line 121
    .line 122
    iput-object v5, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-static {v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object v4, v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 137
    .line 138
    iput-object v1, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v5, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v1, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲苏兰;

    .line 147
    .line 148
    invoke-direct {v1, p0, v3, p1, v2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_1
    const/16 p0, 0x40d

    .line 156
    .line 157
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_2
    const/16 p0, 0x40c

    .line 166
    .line 167
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x40b

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

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1, v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    const/16 v2, 0x1d2

    .line 16
    .line 17
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v3, v2, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const/16 v4, 0x1ee

    .line 34
    .line 35
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x0

    .line 40
    new-array v5, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {p1, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const/16 v4, 0x64

    .line 53
    .line 54
    if-eq p1, v4, :cond_0

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    if-ne p1, v4, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-static {v0}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_1
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 64
    .line 65
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v1, p1, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 76
    .line 77
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v1, v4, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Ljava/lang/String;

    .line 86
    .line 87
    const/16 v5, 0x410

    .line 88
    .line 89
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v6, v5, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Ljava/lang/Integer;

    .line 100
    .line 101
    const/16 v6, 0x411

    .line 102
    .line 103
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    const/4 v7, 0x0

    .line 108
    invoke-static {v7, v6, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    const-string v6, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 113
    .line 114
    invoke-static {v6}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v1, v6, p2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, Ljava/lang/String;

    .line 123
    .line 124
    new-instance v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;

    .line 125
    .line 126
    invoke-direct {v1}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    new-instance v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;

    .line 133
    .line 134
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    iput-object v7, v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 142
    .line 143
    iput-object v4, v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 144
    .line 145
    iput-object p1, v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    iput v7, v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 152
    .line 153
    iput-object v0, v6, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 156
    .line 157
    invoke-direct {v7}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    iput v5, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 165
    .line 166
    iput-object p1, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 167
    .line 168
    iput-object v4, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 169
    .line 170
    iput-object p2, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 171
    .line 172
    iput-object v0, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, v7, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 179
    .line 180
    new-instance p1, Ljava/lang/Thread;

    .line 181
    .line 182
    new-instance p2, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世兰苏哲;

    .line 183
    .line 184
    invoke-direct {p2, p0, v1, v6, v7}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世兰苏哲;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世哲兰;L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏兰哲;L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;)V

    .line 185
    .line 186
    .line 187
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x1

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
