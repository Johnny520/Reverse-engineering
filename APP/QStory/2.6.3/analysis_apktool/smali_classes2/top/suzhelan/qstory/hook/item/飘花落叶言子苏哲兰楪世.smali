.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 16
    .line 17
    iget-object v0, v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    instance-of v3, v0, Ljava/lang/String;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v4

    .line 41
    :goto_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    instance-of v3, p1, Ljava/lang/ClassLoader;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    move-object v4, p1

    .line 50
    check-cast v4, Ljava/lang/ClassLoader;

    .line 51
    .line 52
    :cond_2
    const/16 p1, 0x760

    .line 53
    .line 54
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {v0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_7

    .line 63
    .line 64
    if-eqz v4, :cond_7

    .line 65
    .line 66
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 67
    .line 68
    iget-boolean p1, p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪哲兰世苏:Z

    .line 69
    .line 70
    if-nez p1, :cond_7

    .line 71
    .line 72
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 73
    .line 74
    iput-boolean v1, p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪哲兰世苏:Z

    .line 75
    .line 76
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 77
    .line 78
    const/16 p1, 0x804

    .line 79
    .line 80
    :try_start_0
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1, v4}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/16 v0, 0x613

    .line 96
    .line 97
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    array-length v0, p1

    .line 104
    move v3, v2

    .line 105
    :goto_1
    if-ge v3, v0, :cond_7

    .line 106
    .line 107
    aget-object v4, p1, v3

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const/16 v7, 0x805

    .line 122
    .line 123
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_6

    .line 132
    .line 133
    array-length v6, v5

    .line 134
    const/4 v7, 0x2

    .line 135
    if-ne v6, v7, :cond_6

    .line 136
    .line 137
    aget-object v6, v5, v2

    .line 138
    .line 139
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_4

    .line 146
    .line 147
    aget-object v6, v5, v2

    .line 148
    .line 149
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_6

    .line 154
    .line 155
    :cond_4
    aget-object v6, v5, v1

    .line 156
    .line 157
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-nez v6, :cond_5

    .line 164
    .line 165
    aget-object v5, v5, v1

    .line 166
    .line 167
    invoke-static {v5, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_6

    .line 172
    .line 173
    :cond_5
    new-instance v5, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;

    .line 174
    .line 175
    invoke-direct {v5, p0, v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v4, v5}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    .line 180
    .line 181
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :catch_0
    :cond_7
    :goto_2
    return-void

    .line 185
    :pswitch_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 186
    .line 187
    iget-object p0, p0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-nez p0, :cond_8

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    if-nez p0, :cond_9

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_9
    const/16 p1, 0x801

    .line 204
    .line 205
    :try_start_1
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {p0, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catch_1
    :try_start_2
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-wide/16 v0, 0x0

    .line 218
    .line 219
    invoke-static {p0, p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->setLongField(Ljava/lang/Object;Ljava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 220
    .line 221
    .line 222
    :catch_2
    :goto_3
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
