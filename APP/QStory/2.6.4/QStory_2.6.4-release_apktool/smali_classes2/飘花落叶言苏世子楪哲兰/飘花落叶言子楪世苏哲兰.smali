.class public final L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪苏兰世哲:I


# instance fields
.field public final synthetic 飘花落叶言子楪苏哲世兰:I

.field public final 飘花落叶言子楪苏哲兰世:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 3
    .line 4
    invoke-direct {p0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)V
    .locals 0

    .line 15
    iput p2, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    invoke-direct {p0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;-><init>()V

    iput-object p1, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public 飘花落叶言子世楪苏兰哲(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 18
    .line 19
    iget-object v2, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    iget-object v1, v1, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 1

    .line 1
    iget p3, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const p1, 0x240c0067

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    const-string p1, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 28
    .line 29
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    const-string p1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 33
    .line 34
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    new-instance p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    const p3, 0x240c0074

    .line 40
    .line 41
    .line 42
    invoke-direct {p1, p3, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(ILandroid/view/ViewGroup;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 46
    .line 47
    new-instance p3, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 48
    .line 49
    const/16 v0, 0x12

    .line 50
    .line 51
    invoke-direct {p3, p1, v0, p0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_1
    invoke-static {p1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const p1, 0x240c0063

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, p0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 7

    .line 1
    iget p2, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    const-string v0, "Check failed."

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    check-cast p3, Ljava/io/File;

    .line 11
    .line 12
    if-eqz p3, :cond_7

    .line 13
    .line 14
    const p2, 0x24090381

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, p2, v0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    array-length v1, p2

    .line 32
    move v2, v0

    .line 33
    move v3, v2

    .line 34
    :goto_0
    if-ge v2, v1, :cond_2

    .line 35
    .line 36
    aget-object v4, p2, v2

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const-string v6, "config.json"

    .line 49
    .line 50
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v5, ".bak"

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_0

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move v3, v0

    .line 77
    :cond_2
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    array-length v2, p2

    .line 89
    :goto_1
    if-ge v0, v2, :cond_4

    .line 90
    .line 91
    aget-object v4, p2, v0

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-wide/16 v0, 0x0

    .line 110
    .line 111
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_5

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/io/File;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    add-long/2addr v0, v4

    .line 128
    goto :goto_2

    .line 129
    :cond_5
    long-to-int v0, v0

    .line 130
    :cond_6
    invoke-static {v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, " \u4e2a\u6587\u4ef6 \u00b7 "

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    const v0, 0x24090380

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    const p2, 0x240903a0

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Landroid/widget/TextView;

    .line 168
    .line 169
    new-instance p2, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 170
    .line 171
    const/16 v0, 0x14

    .line 172
    .line 173
    invoke-direct {p2, p0, v0, p3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_3
    return-void

    .line 184
    :pswitch_0
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 185
    .line 186
    check-cast p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;

    .line 187
    .line 188
    const-string p2, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 189
    .line 190
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    if-nez p3, :cond_8

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_8
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 197
    .line 198
    const v0, 0x240903a7

    .line 199
    .line 200
    .line 201
    iget-object v1, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupName:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    const v0, 0x240903a8

    .line 207
    .line 208
    .line 209
    iget-object v1, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const/16 v1, 0xbe1

    .line 220
    .line 221
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const/16 v1, 0x2f

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string p2, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5"

    .line 240
    .line 241
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    const v0, 0x240901bb

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Landroid/widget/ImageView;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v1, p2}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 274
    .line 275
    .line 276
    const p2, 0x240900d4

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Landroid/widget/CheckBox;

    .line 284
    .line 285
    iget-object p0, p0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 288
    .line 289
    iget-object p2, p3, Llin/xposed/hook/javaplugin/bean/GroupInfo;->GroupUin:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-static {p0, p2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 302
    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_1
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 306
    .line 307
    check-cast p3, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;

    .line 308
    .line 309
    if-eqz p3, :cond_a

    .line 310
    .line 311
    const p2, 0x24090244

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    check-cast p2, Landroid/widget/TextView;

    .line 319
    .line 320
    const v0, 0x2409010d

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Landroid/widget/TextView;

    .line 328
    .line 329
    const v1, 0x240900fe

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Landroid/widget/TextView;

    .line 337
    .line 338
    const v2, 0x24090080

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, v2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    check-cast v2, Landroid/widget/ImageView;

    .line 346
    .line 347
    invoke-static {v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {p3}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    new-instance v5, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    const-string v6, "https://q.qlogo.cn/g?b=qq&nk="

    .line 358
    .line 359
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v4, "&s=100"

    .line 366
    .line 367
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v3, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p3}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    .line 387
    .line 388
    sget p2, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 389
    .line 390
    invoke-virtual {p3}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {p2}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 402
    .line 403
    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-virtual {p2, v3}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    invoke-virtual {p2, v2}, Ljava/time/ZonedDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p2

    .line 419
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p3}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p3}, L飘花落叶言苏世子哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p2

    .line 436
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 437
    .line 438
    .line 439
    move-result p2

    .line 440
    const/16 v0, 0x20

    .line 441
    .line 442
    if-le p2, v0, :cond_9

    .line 443
    .line 444
    new-instance p2, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 445
    .line 446
    invoke-direct {p2, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世苏哲兰;Landroid/widget/TextView;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 450
    .line 451
    .line 452
    :cond_9
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 453
    .line 454
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 455
    .line 456
    const/16 v1, 0xd

    .line 457
    .line 458
    invoke-direct {v0, p0, v1, p3}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 462
    .line 463
    .line 464
    iget-object p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 465
    .line 466
    new-instance v0, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰苏哲;

    .line 467
    .line 468
    const/4 v1, 0x3

    .line 469
    invoke-direct {v0, p0, p1, p3, v1}, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰苏哲;-><init>(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 473
    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_a
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    :goto_5
    return-void

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
