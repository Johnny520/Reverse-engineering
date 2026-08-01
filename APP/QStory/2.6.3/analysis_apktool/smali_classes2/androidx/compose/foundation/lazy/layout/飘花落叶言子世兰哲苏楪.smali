.class public final synthetic Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/runtime/飘花落叶言子哲楪兰苏世;
.implements Landroidx/core/os/飘花落叶言子楪世兰苏哲;
.implements Landroidx/core/view/飘花落叶言子世楪苏兰哲;
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;
.implements L飘花落叶言楪世兰子哲苏/飘花落叶言子楪世哲兰苏;
.implements L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lorg/apache/commons/io/filefilter/SizeFileFilter;

    .line 11
    .line 12
    check-cast v1, Ljava/nio/file/Path;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lorg/apache/commons/io/filefilter/SizeFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/SizeFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, Lorg/apache/commons/io/filefilter/HiddenFileFilter;

    .line 20
    .line 21
    check-cast v1, Ljava/nio/file/Path;

    .line 22
    .line 23
    invoke-static {p0, v1}, Lorg/apache/commons/io/filefilter/HiddenFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/HiddenFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    check-cast p0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;

    .line 29
    .line 30
    check-cast v1, Ljava/nio/file/Path;

    .line 31
    .line 32
    invoke-static {p0, v1}, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/EmptyFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_2
    check-cast p0, Lorg/apache/commons/io/filefilter/AgeFileFilter;

    .line 38
    .line 39
    check-cast v1, Ljava/nio/file/Path;

    .line 40
    .line 41
    invoke-static {p0, v1}, Lorg/apache/commons/io/filefilter/AgeFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/AgeFileFilter;Ljava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/animation/Animator;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-static {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "Animator from operation "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " has been canceled."

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string v0, "FragmentManager"

    .line 39
    .line 40
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public 飘花落叶言子楪世哲苏兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Landroid/view/View;I)V
    .locals 4

    .line 1
    iget-object p2, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 8
    .line 9
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c"

    .line 10
    .line 11
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const/16 v0, 0x50d

    .line 15
    .line 16
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object p3, p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p3}, Llin/xposed/hook/util/qq/CreateElement;->createEmojiElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const/16 v0, 0x11a

    .line 37
    .line 38
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/16 v1, 0xb2

    .line 43
    .line 44
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, v0, p3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 57
    .line 58
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const/16 v2, 0x16c

    .line 63
    .line 64
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u545c"

    .line 72
    .line 73
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {v0, v1, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0x8d

    .line 86
    .line 87
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v0, v1, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-static {p3, v0}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 112
    .line 113
    .line 114
    sget-object p3, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 115
    .line 116
    iget-object p1, p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰()Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    sget-object p3, Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;->RECENT_USAGE:Ltop/suzhelan/qstory/hook/item/stickerpanel/StickerPanelSettingsConfig$SortMode;

    .line 134
    .line 135
    if-ne p1, p3, :cond_1

    .line 136
    .line 137
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-eqz p3, :cond_0

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {p2, p1}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p2, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 152
    .line 153
    if-eqz p1, :cond_1

    .line 154
    .line 155
    new-instance p3, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;

    .line 156
    .line 157
    invoke-direct {p3, p2, v2}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :catch_0
    move-exception p1

    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const/16 p3, 0xaa6

    .line 171
    .line 172
    invoke-static {p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_1
    :goto_0
    sget-object p1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    if-nez p1, :cond_2

    .line 203
    .line 204
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪()V

    .line 205
    .line 206
    .line 207
    :cond_2
    return-void
.end method

.method public 飘花落叶言子楪世苏兰哲()Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世兰哲()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲苏世兰:J

    .line 17
    .line 18
    iget-wide v3, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:J

    .line 19
    .line 20
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iput-wide v1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:J

    .line 25
    .line 26
    iget-wide v3, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲世兰苏:J

    .line 27
    .line 28
    iget-wide v5, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 29
    .line 30
    add-long/2addr v1, v5

    .line 31
    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪苏世哲兰(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    xor-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    iput-boolean p0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 38
    .line 39
    :cond_0
    iget-boolean p0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Z

    .line 40
    .line 41
    return p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪兰苏;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    const/16 v3, 0x9

    .line 23
    .line 24
    invoke-direct {v2, v0, p1, p0, v3}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    const-wide/16 p0, 0xc8

    .line 28
    .line 29
    invoke-virtual {v1, v2, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public 飘花落叶言子苏哲楪兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    iget-boolean v0, p1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p2

    .line 14
    :cond_0
    new-instance v0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method
