.class public final L飘花落叶言子哲世苏兰楪/飘花落叶言子楪世苏哲兰;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;)V
    .locals 0

    .line 1
    iput-object p2, p0, L飘花落叶言子哲世苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 6
    .line 7
    new-instance v1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    const/16 v2, 0xd

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0xe

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iget-object v1, p0, L飘花落叶言子哲世苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/appcompat/widget/飘花落叶言子世楪哲兰苏;

    .line 24
    .line 25
    and-int/lit8 v2, p2, 0x1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    :try_start_0
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 34
    .line 35
    iget-object v2, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 45
    .line 46
    iget-object v2, v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 49
    .line 50
    new-instance v5, Landroid/os/Bundle;

    .line 51
    .line 52
    if-nez p3, :cond_1

    .line 53
    .line 54
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-direct {v5, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    const-string v6, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 62
    .line 63
    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catch_0
    move-exception v0

    .line 68
    const-string v1, "InputConnectionCompat"

    .line 69
    .line 70
    const-string v2, "Can\'t insert content from IME; requestPermission() failed"

    .line 71
    .line 72
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_2
    move-object v5, p3

    .line 77
    :goto_2
    new-instance v2, Landroid/content/ClipData;

    .line 78
    .line 79
    iget-object v6, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 82
    .line 83
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 86
    .line 87
    iget-object v6, v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v6, Landroid/view/inputmethod/InputContentInfo;

    .line 90
    .line 91
    invoke-virtual {v6}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    new-instance v7, Landroid/content/ClipData$Item;

    .line 96
    .line 97
    iget-object v8, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Landroid/view/inputmethod/InputContentInfo;

    .line 100
    .line 101
    invoke-virtual {v8}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-direct {v7, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, v6, v7}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 109
    .line 110
    .line 111
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    const/16 v7, 0x1f

    .line 114
    .line 115
    const/4 v8, 0x2

    .line 116
    if-lt v6, v7, :cond_3

    .line 117
    .line 118
    new-instance v6, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 119
    .line 120
    invoke-direct {v6, v2, v8}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;-><init>(Landroid/content/ClipData;I)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    new-instance v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;

    .line 125
    .line 126
    invoke-direct {v6}, Landroidx/core/view/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v2, v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/content/ClipData;

    .line 130
    .line 131
    iput v8, v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 132
    .line 133
    :goto_3
    iget-object v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v6, v0}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/net/Uri;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v6, v5}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->setExtras(Landroid/os/Bundle;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v6}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->build()Landroidx/core/view/飘花落叶言子楪苏世兰哲;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v1, v0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏兰世哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪苏世兰哲;)Landroidx/core/view/飘花落叶言子楪苏世兰哲;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-nez v0, :cond_4

    .line 156
    .line 157
    move v4, v3

    .line 158
    :cond_4
    :goto_4
    if-eqz v4, :cond_5

    .line 159
    .line 160
    return v3

    .line 161
    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    return p0
.end method
