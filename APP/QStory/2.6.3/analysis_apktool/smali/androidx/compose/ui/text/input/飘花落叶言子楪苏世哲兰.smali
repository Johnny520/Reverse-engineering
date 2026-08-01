.class public final synthetic Landroidx/compose/ui/text/input/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    const-string p0, " > "

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "   "

    .line 11
    .line 12
    :goto_0
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    const/16 v1, 0x29

    .line 15
    .line 16
    const-string v2, ", newCursorPosition="

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "CommitTextCommand(text.length="

    .line 23
    .line 24
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    iget-object v3, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 30
    .line 31
    iget-object v3, v3, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget p1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 44
    .line 45
    :goto_1
    invoke-static {v0, p1, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "SetComposingTextCommand(text.length="

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;

    .line 63
    .line 64
    iget-object v3, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 65
    .line 66
    iget-object v3, v3, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰世哲苏;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰世哲苏;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰世哲苏;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲兰苏;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰苏哲;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰苏哲;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪世兰苏哲;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 119
    .line 120
    invoke-virtual {p1}, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto :goto_2

    .line 125
    :cond_6
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪苏哲世兰;

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    const-string p1, "FinishComposingTextCommand()"

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    instance-of v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪世哲苏兰;

    .line 133
    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    const-string p1, "DeleteAllCommand()"

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {p1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-nez p1, :cond_9

    .line 154
    .line 155
    const-string p1, "{anonymous EditCommand}"

    .line 156
    .line 157
    :cond_9
    const-string v0, "Unknown EditCommand: "

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0
.end method
