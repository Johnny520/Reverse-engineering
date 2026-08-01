.class public final L飘花落叶言子哲世苏兰楪/飘花落叶言子楪世苏哲兰;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    new-instance v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    new-instance v1, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, L飘花落叶言子哲世苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 16
    .line 17
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Landroidx/appcompat/widget/飘花落叶言子世楪哲兰苏;

    .line 20
    .line 21
    and-int/lit8 v2, p2, 0x1

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    :try_start_0
    iget-object v2, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 30
    .line 31
    iget-object v2, v2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 41
    .line 42
    iget-object v2, v2, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 45
    .line 46
    new-instance v5, Landroid/os/Bundle;

    .line 47
    .line 48
    if-nez p3, :cond_1

    .line 49
    .line 50
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-direct {v5, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    const-string v6, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 58
    .line 59
    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :catch_0
    move-exception v0

    .line 64
    const-string v1, "InputConnectionCompat"

    .line 65
    .line 66
    const-string v2, "Can\'t insert content from IME; requestPermission() failed"

    .line 67
    .line 68
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_2
    move-object v5, p3

    .line 73
    :goto_2
    new-instance v2, Landroid/content/ClipData;

    .line 74
    .line 75
    iget-object v6, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v6, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 78
    .line 79
    iget-object v0, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 82
    .line 83
    iget-object v6, v6, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v6, Landroid/view/inputmethod/InputContentInfo;

    .line 86
    .line 87
    invoke-virtual {v6}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    new-instance v7, Landroid/content/ClipData$Item;

    .line 92
    .line 93
    iget-object v8, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v8, Landroid/view/inputmethod/InputContentInfo;

    .line 96
    .line 97
    invoke-virtual {v8}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-direct {v7, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v2, v6, v7}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 105
    .line 106
    .line 107
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 108
    .line 109
    const/16 v7, 0x1f

    .line 110
    .line 111
    const/4 v8, 0x2

    .line 112
    if-lt v6, v7, :cond_3

    .line 113
    .line 114
    new-instance v6, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 115
    .line 116
    invoke-direct {v6, v2, v8}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;-><init>(Landroid/content/ClipData;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    new-instance v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;

    .line 121
    .line 122
    invoke-direct {v6}, Landroidx/core/view/飘花落叶言子楪世哲兰苏;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v2, v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/content/ClipData;

    .line 126
    .line 127
    iput v8, v6, Landroidx/core/view/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 128
    .line 129
    :goto_3
    iget-object v0, v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v6, v0}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/net/Uri;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v6, v5}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->setExtras(Landroid/os/Bundle;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v6}, Landroidx/core/view/飘花落叶言子楪世哲苏兰;->build()Landroidx/core/view/飘花落叶言子楪苏世兰哲;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v1, v0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏兰世哲(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪苏世兰哲;)Landroidx/core/view/飘花落叶言子楪苏世兰哲;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-nez v0, :cond_4

    .line 152
    .line 153
    move v4, v3

    .line 154
    :cond_4
    :goto_4
    if-eqz v4, :cond_5

    .line 155
    .line 156
    return v3

    .line 157
    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    return p0
.end method
