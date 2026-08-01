.class public final synthetic L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget-object v1, v1, v2

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/16 v3, 0x6a

    .line 30
    .line 31
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, ""

    .line 36
    .line 37
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/16 v3, 0x6b

    .line 42
    .line 43
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {p1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4, v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iget p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 80
    .line 81
    sget-object v4, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicReference;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-eqz v5, :cond_0

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {p1}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_1

    .line 101
    .line 102
    invoke-static {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-class v5, Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 113
    .line 114
    filled-new-array {v7, v5, v6, v7}, [Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    iget-object v6, p1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 119
    .line 120
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 121
    .line 122
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    iput-object v5, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-virtual {p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/lang/reflect/Method;

    .line 138
    .line 139
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    filled-new-array {v0, v1, v3, p0}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p1, v2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_1
    const/16 p0, 0x66

    .line 152
    .line 153
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_1
    return-void

    .line 161
    :pswitch_0
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 162
    .line 163
    if-eqz v0, :cond_3

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_5

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Landroid/view/View;

    .line 187
    .line 188
    instance-of v1, v0, Landroid/widget/TextView;

    .line 189
    .line 190
    if-eqz v1, :cond_4

    .line 191
    .line 192
    check-cast v0, Landroid/widget/TextView;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 203
    .line 204
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_4

    .line 213
    .line 214
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iput p1, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 219
    .line 220
    :cond_5
    :goto_2
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
