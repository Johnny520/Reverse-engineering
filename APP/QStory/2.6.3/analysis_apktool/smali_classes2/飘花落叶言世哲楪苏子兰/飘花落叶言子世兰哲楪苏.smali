.class public L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

.field public 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x123

    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪苏哲兰世(L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-direct {v1, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const v3, 0x240c00f1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x240902ed

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/widget/EditText;

    .line 33
    .line 34
    iput-object v1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰世苏:Landroid/widget/EditText;

    .line 35
    .line 36
    const v1, 0x240902ec

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/widget/Button;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    new-instance p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 14
    .line 15
    const/16 v1, 0x193a

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v1, 0x13a4

    .line 20
    .line 21
    const-class v2, Ljava/lang/Object;

    .line 22
    .line 23
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5"

    .line 24
    .line 25
    if-le v0, v1, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x9e

    .line 28
    .line 29
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 44
    .line 45
    const-class v1, Landroid/view/View;

    .line 46
    .line 47
    filled-new-array {v2, v1}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/16 v0, 0x9f

    .line 59
    .line 60
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 75
    .line 76
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_0
    new-instance v1, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 87
    .line 88
    const/16 v2, 0x12

    .line 89
    .line 90
    invoke-direct {v1, p1, v2}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_1
    const/16 p0, 0xa0

    .line 98
    .line 99
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const/16 v0, 0xa1

    .line 108
    .line 109
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/16 v1, 0xa2

    .line 114
    .line 115
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const/16 v1, 0xa3

    .line 124
    .line 125
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v3, v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 138
    .line 139
    iput-object p0, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-virtual {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 150
    .line 151
    const-class v4, Ljava/util/List;

    .line 152
    .line 153
    iput-object v4, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const/4 v3, 0x0

    .line 160
    :goto_1
    const/4 v5, 0x2

    .line 161
    if-ge v3, v5, :cond_2

    .line 162
    .line 163
    aget-object v5, v0, v3

    .line 164
    .line 165
    invoke-static {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    iget-object v7, v5, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 174
    .line 175
    iput-object v6, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v4, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 178
    .line 179
    invoke-virtual {v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object v6, p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v6, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲楪苏;

    .line 186
    .line 187
    new-instance v7, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;

    .line 188
    .line 189
    const/4 v8, 0x6

    .line 190
    invoke-direct {v7, p1, v2, p0, v8}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v5, v7}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 194
    .line 195
    .line 196
    add-int/lit8 v3, v3, 0x1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_2
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/lang/Thread;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x124

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
