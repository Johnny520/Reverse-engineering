.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪兰苏哲世:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪哲兰世苏:I

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x298382

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    new-instance v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    const/16 v1, 0x885

    .line 12
    .line 13
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/ArrayList;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const/16 p1, 0x887

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-class v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    const/16 p1, 0x888

    .line 21
    .line 22
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-class v2, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;

    .line 27
    .line 28
    invoke-virtual {v1, v2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v3, v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget v3, v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v3, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    iget-object v2, v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget v2, v0, L飘花落叶言苏楪世子哲兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:I

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    new-instance p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 120
    .line 121
    const/4 v0, 0x0

    .line 122
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    const/16 v0, 0x583

    .line 126
    .line 127
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    sput-object p1, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 131
    .line 132
    const/16 p1, 0x614

    .line 133
    .line 134
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p1}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const/16 v0, 0x615

    .line 143
    .line 144
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-class v1, Ljava/lang/String;

    .line 153
    .line 154
    const-class v2, [B

    .line 155
    .line 156
    filled-new-array {v1, v2, v0}, [Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1, v0}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 161
    .line 162
    .line 163
    const/16 v0, 0x616

    .line 164
    .line 165
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p1, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p1}, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Ljava/lang/reflect/Method;

    .line 176
    .line 177
    new-instance v0, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 178
    .line 179
    const/4 v1, 0x7

    .line 180
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;)V

    .line 184
    .line 185
    .line 186
    sget-object p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/HashMap;

    .line 187
    .line 188
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;

    .line 189
    .line 190
    const/4 v0, 0x1

    .line 191
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪苏哲;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V

    .line 192
    .line 193
    .line 194
    invoke-static {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x886

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

.method public final 飘花落叶言子楪苏哲兰世(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQAIOTool;->getContentId(Landroid/view/ViewGroup;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x778

    .line 14
    .line 15
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    filled-new-array {v4, v4}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, -0x2

    .line 33
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    filled-new-array {v5, v5}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-static {v5, v4, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/view/ViewGroup$LayoutParams;

    .line 46
    .line 47
    const/16 v4, 0x77a

    .line 48
    .line 49
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v3, v4, v5}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/16 v4, 0x77b

    .line 61
    .line 62
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v3, v4, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x77c

    .line 74
    .line 75
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v3, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const/16 v4, 0x889

    .line 97
    .line 98
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u545c\u545c\u545c\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c\u55b5"

    .line 109
    .line 110
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 125
    .line 126
    invoke-virtual {v1, p0}, Landroid/view/View;->setId(I)V

    .line 127
    .line 128
    .line 129
    const/16 p0, 0x11

    .line 130
    .line 131
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setGravity(I)V

    .line 132
    .line 133
    .line 134
    const/high16 p0, 0x41600000    # 14.0f

    .line 135
    .line 136
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 137
    .line 138
    .line 139
    const p0, 0x24060001

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, p0}, Landroid/content/Context;->getColor(I)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 147
    .line 148
    .line 149
    const/4 p0, 0x0

    .line 150
    invoke-virtual {v1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
