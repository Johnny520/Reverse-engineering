.class final Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.suzhelan.qstory.hook.item.chat.DownloadEmotion$downloadEmotion$1"
    f = "DownloadEmotion.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $picMD5List:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $picUrlList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/app/Activity;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/app/Activity;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picUrlList:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picMD5List:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$activity:Landroid/app/Activity;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final invokeSuspend$lambda$0$1(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->invokeSuspend$lambda$0$1(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picUrlList:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picMD5List:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0, p2}, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/app/Activity;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 6
    .line 7
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->label:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_5

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picUrlList:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$picMD5List:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/DownloadEmotion$downloadEmotion$1;->$activity:Landroid/app/Activity;

    .line 22
    .line 23
    :try_start_0
    sget-object v3, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v3}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-wide v4, -0x36a5d482051405a7L    # -2.3344322891399735E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const-wide v6, -0x36a57fc1051405a7L    # -2.363964715200308E45

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const-wide v7, -0x36a57fb7051405a7L    # -2.3639783264949847E45

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v6, Ljava/lang/String;

    .line 82
    .line 83
    new-instance v7, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-static {v6}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    new-instance v8, Ljava/io/File;

    .line 113
    .line 114
    new-instance v9, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-wide v10, -0x36a5d469051405a7L    # -2.3344663173766656E45

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-direct {v8, v9, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_0

    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :catchall_0
    move-exception p0

    .line 152
    goto :goto_3

    .line 153
    :cond_0
    :goto_1
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v6, v7}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 165
    .line 166
    const/16 v1, 0xa

    .line 167
    .line 168
    invoke-static {v4, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_2

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Ljava/io/File;

    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    const/4 v1, 0x0

    .line 200
    new-array v1, v1, [Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, [Ljava/lang/String;

    .line 207
    .line 208
    new-instance v1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲兰苏世;

    .line 209
    .line 210
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-static {p0, p1, v2, v1}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    goto :goto_4

    .line 221
    :goto_3
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_4
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    if-eqz p1, :cond_3

    .line 230
    .line 231
    const-wide v1, -0x36a5d455051405a7L    # -2.3344935399660193E45

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    sget-object v1, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->ERROR:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 241
    .line 242
    invoke-static {p1, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 243
    .line 244
    .line 245
    :cond_3
    invoke-static {p0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_4

    .line 250
    .line 251
    check-cast p0, Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 252
    .line 253
    const-wide p0, -0x36a5d453051405a7L    # -2.3344962622249546E45

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    sget-object p1, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->SUCCESS:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 263
    .line 264
    const-wide/16 v1, 0x1f4

    .line 265
    .line 266
    invoke-static {p0, p1, v1, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;J)V

    .line 267
    .line 268
    .line 269
    :cond_4
    return-object v0

    .line 270
    :cond_5
    const-wide p0, -0x36a57f60051405a7L    # -2.3640967447586732E45

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v2
.end method
