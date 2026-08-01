.class final Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
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
        0x4,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1"
    f = "StickerUploader.kt"
    l = {
        0x43,
        0x4d,
        0x56,
        0x89,
        0x95
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $author:Ljava/lang/String;

.field final synthetic $coverFileName:Ljava/lang/String;

.field final synthetic $description:Ljava/lang/String;

.field final synthetic $dirPath:Ljava/lang/String;

.field final synthetic $nickname:Ljava/lang/String;

.field final synthetic $onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $tags:Ljava/lang/String;

.field final synthetic $title:Ljava/lang/String;

.field final synthetic $uin:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$14:Ljava/lang/Object;

.field L$15:Ljava/lang/Object;

.field L$16:Ljava/lang/Object;

.field L$17:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$dirPath:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$coverFileName:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$title:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$uin:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$nickname:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$tags:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$description:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$author:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p9, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 11
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
    new-instance v0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$dirPath:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$coverFileName:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$title:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$uin:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$nickname:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$tags:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$description:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$author:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 20
    .line 21
    move-object v10, p2

    .line 22
    invoke-direct/range {v0 .. v10}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const-string v2, "text/plain"

    .line 6
    .line 7
    const-string v3, "upload_"

    .line 8
    .line 9
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 10
    .line 11
    iget v5, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 12
    .line 13
    const/4 v6, 0x5

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x1

    .line 18
    sget-object v11, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    if-eqz v5, :cond_5

    .line 22
    .line 23
    if-eq v5, v10, :cond_3

    .line 24
    .line 25
    if-eq v5, v9, :cond_4

    .line 26
    .line 27
    if-eq v5, v8, :cond_2

    .line 28
    .line 29
    if-eq v5, v7, :cond_1

    .line 30
    .line 31
    if-ne v5, v6, :cond_0

    .line 32
    .line 33
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Exception;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_10

    .line 41
    .line 42
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v12

    .line 48
    :cond_1
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$17:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ltop/suzhelan/sticker/sdk/net/StickerResult;

    .line 51
    .line 52
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$16:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 55
    .line 56
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$15:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 59
    .line 60
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$14:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 63
    .line 64
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$13:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 67
    .line 68
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$12:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 71
    .line 72
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$11:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 75
    .line 76
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$10:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;

    .line 79
    .line 80
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$9:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 83
    .line 84
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$8:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;

    .line 87
    .line 88
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$7:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;

    .line 91
    .line 92
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$6:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$5:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$4:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$3:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/util/Map;

    .line 107
    .line 108
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/io/File;

    .line 111
    .line 112
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v2, v0

    .line 115
    check-cast v2, Ljava/io/File;

    .line 116
    .line 117
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ljava/io/File;

    .line 120
    .line 121
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto/16 :goto_b

    .line 125
    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto/16 :goto_c

    .line 128
    .line 129
    :cond_2
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ljava/io/File;

    .line 132
    .line 133
    :goto_0
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ljava/io/File;

    .line 136
    .line 137
    :cond_3
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Ljava/io/File;

    .line 140
    .line 141
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 142
    .line 143
    .line 144
    return-object v11

    .line 145
    :catch_0
    move-exception v0

    .line 146
    goto/16 :goto_e

    .line 147
    .line 148
    :cond_4
    iget-object v0, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/lang/Exception;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :try_start_2
    const-string v5, "\u538b\u7f29\u4e2d..."

    .line 157
    .line 158
    invoke-static {v5}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 159
    .line 160
    .line 161
    new-instance v5, Ljava/io/File;

    .line 162
    .line 163
    iget-object v13, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$dirPath:Ljava/lang/String;

    .line 164
    .line 165
    invoke-direct {v5, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-eqz v13, :cond_18

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-nez v13, :cond_6

    .line 179
    .line 180
    goto/16 :goto_d

    .line 181
    .line 182
    :cond_6
    new-instance v10, Ljava/io/File;

    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v14

    .line 192
    new-instance v6, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v3, ".zip"

    .line 201
    .line 202
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-direct {v10, v13, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 210
    .line 211
    .line 212
    :try_start_3
    sget-object v3, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/internal/飘花落叶言子楪世哲兰苏;

    .line 213
    .line 214
    new-instance v3, Ljava/util/zip/ZipOutputStream;

    .line 215
    .line 216
    new-instance v6, Ljava/io/BufferedOutputStream;

    .line 217
    .line 218
    new-instance v13, Ljava/io/FileOutputStream;

    .line 219
    .line 220
    invoke-direct {v13, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v6, v13}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v3, v6}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 227
    .line 228
    .line 229
    :try_start_4
    invoke-static {v5, v0, v3}, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/io/File;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 230
    .line 231
    .line 232
    :try_start_5
    invoke-virtual {v3}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 233
    .line 234
    .line 235
    :try_start_6
    const-string v3, "\u9009\u53d6\u5c01\u9762..."

    .line 236
    .line 237
    invoke-static {v3}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 238
    .line 239
    .line 240
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$coverFileName:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v5, v3}, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    if-nez v3, :cond_7

    .line 247
    .line 248
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 252
    .line 253
    sget-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 254
    .line 255
    new-instance v2, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$3;

    .line 256
    .line 257
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 258
    .line 259
    invoke-direct {v2, v3, v12}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$3;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 260
    .line 261
    .line 262
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 267
    .line 268
    iput v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 269
    .line 270
    invoke-static {v0, v2, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 274
    if-ne v0, v4, :cond_19

    .line 275
    .line 276
    goto/16 :goto_f

    .line 277
    .line 278
    :cond_7
    :try_start_7
    const-string v5, "\u6784\u5efa\u53c2\u6570..."

    .line 279
    .line 280
    invoke-static {v5}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 281
    .line 282
    .line 283
    const-string v5, "title"

    .line 284
    .line 285
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$title:Ljava/lang/String;

    .line 286
    .line 287
    new-instance v8, Lkotlin/Pair;

    .line 288
    .line 289
    invoke-direct {v8, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    filled-new-array {v8}, [Lkotlin/Pair;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-static {v5}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲兰楪苏([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$uin:Ljava/lang/String;

    .line 301
    .line 302
    if-eqz v6, :cond_9

    .line 303
    .line 304
    invoke-static {v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-eqz v6, :cond_8

    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_8
    const-string v6, "uin"

    .line 312
    .line 313
    iget-object v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$uin:Ljava/lang/String;

    .line 314
    .line 315
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto :goto_1

    .line 319
    :catchall_1
    move-exception v0

    .line 320
    move-object v2, v10

    .line 321
    goto/16 :goto_c

    .line 322
    .line 323
    :cond_9
    :goto_1
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$nickname:Ljava/lang/String;

    .line 324
    .line 325
    if-eqz v6, :cond_b

    .line 326
    .line 327
    invoke-static {v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-eqz v6, :cond_a

    .line 332
    .line 333
    goto :goto_2

    .line 334
    :cond_a
    const-string v6, "nickname"

    .line 335
    .line 336
    iget-object v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$nickname:Ljava/lang/String;

    .line 337
    .line 338
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    :cond_b
    :goto_2
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$tags:Ljava/lang/String;

    .line 342
    .line 343
    if-eqz v6, :cond_d

    .line 344
    .line 345
    invoke-static {v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-eqz v6, :cond_c

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_c
    const-string v6, "tags"

    .line 353
    .line 354
    iget-object v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$tags:Ljava/lang/String;

    .line 355
    .line 356
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    :cond_d
    :goto_3
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$description:Ljava/lang/String;

    .line 360
    .line 361
    if-eqz v6, :cond_f

    .line 362
    .line 363
    invoke-static {v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-eqz v6, :cond_e

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_e
    const-string v6, "description"

    .line 371
    .line 372
    iget-object v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$description:Ljava/lang/String;

    .line 373
    .line 374
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    :cond_f
    :goto_4
    iget-object v6, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$author:Ljava/lang/String;

    .line 378
    .line 379
    if-eqz v6, :cond_11

    .line 380
    .line 381
    invoke-static {v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_10

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_10
    const-string v6, "author"

    .line 389
    .line 390
    iget-object v8, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$author:Ljava/lang/String;

    .line 391
    .line 392
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    :cond_11
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 396
    .line 397
    .line 398
    move-result-wide v8

    .line 399
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    const-string v9, "-"

    .line 415
    .line 416
    invoke-static {v8, v9, v0}, Lkotlin/text/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲楪兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v5, v6, v0}, Ltop/suzhelan/sticker/sdk/presenter/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v17

    .line 424
    sget v5, L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:I

    .line 425
    .line 426
    sget-object v5, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 427
    .line 428
    const-string v5, "application/zip"

    .line 429
    .line 430
    invoke-static {v5}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    new-instance v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;

    .line 435
    .line 436
    invoke-direct {v8, v5, v10}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;Ljava/io/File;)V

    .line 437
    .line 438
    .line 439
    const-string v5, "archive"

    .line 440
    .line 441
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    invoke-static {v5, v9, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;

    .line 446
    .line 447
    .line 448
    move-result-object v20

    .line 449
    const-string v5, "image/*"

    .line 450
    .line 451
    invoke-static {v5}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    new-instance v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;

    .line 456
    .line 457
    invoke-direct {v8, v5, v3}, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;-><init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;Ljava/io/File;)V

    .line 458
    .line 459
    .line 460
    const-string v5, "cover"

    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-static {v5, v3, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;

    .line 467
    .line 468
    .line 469
    move-result-object v21

    .line 470
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$title:Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-static {v3, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 477
    .line 478
    .line 479
    move-result-object v22

    .line 480
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$tags:Ljava/lang/String;

    .line 481
    .line 482
    if-eqz v3, :cond_12

    .line 483
    .line 484
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    invoke-static {v3, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    move-object/from16 v23, v3

    .line 493
    .line 494
    goto :goto_6

    .line 495
    :cond_12
    move-object/from16 v23, v12

    .line 496
    .line 497
    :goto_6
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$uin:Ljava/lang/String;

    .line 498
    .line 499
    if-eqz v3, :cond_13

    .line 500
    .line 501
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-static {v3, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    move-object/from16 v24, v3

    .line 510
    .line 511
    goto :goto_7

    .line 512
    :cond_13
    move-object/from16 v24, v12

    .line 513
    .line 514
    :goto_7
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$nickname:Ljava/lang/String;

    .line 515
    .line 516
    if-eqz v3, :cond_14

    .line 517
    .line 518
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-static {v3, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    move-object/from16 v25, v3

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_14
    move-object/from16 v25, v12

    .line 530
    .line 531
    :goto_8
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$description:Ljava/lang/String;

    .line 532
    .line 533
    if-eqz v3, :cond_15

    .line 534
    .line 535
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-static {v3, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    move-object/from16 v26, v3

    .line 544
    .line 545
    goto :goto_9

    .line 546
    :cond_15
    move-object/from16 v26, v12

    .line 547
    .line 548
    :goto_9
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$author:Ljava/lang/String;

    .line 549
    .line 550
    if-eqz v3, :cond_16

    .line 551
    .line 552
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-static {v3, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏楪兰哲;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    move-object/from16 v27, v2

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_16
    move-object/from16 v27, v12

    .line 564
    .line 565
    :goto_a
    const-string v2, "\u4e0a\u4f20\u4e2d..."

    .line 566
    .line 567
    invoke-static {v2}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 568
    .line 569
    .line 570
    invoke-static {}, Ltop/suzhelan/sticker/sdk/net/StickerClientKt;->getStickerApiService()Ltop/suzhelan/sticker/sdk/net/StickerApiService;

    .line 571
    .line 572
    .line 573
    move-result-object v16

    .line 574
    move-object/from16 v19, v0

    .line 575
    .line 576
    move-object/from16 v18, v6

    .line 577
    .line 578
    invoke-interface/range {v16 .. v27}, Ltop/suzhelan/sticker/sdk/net/StickerApiService;->uploadSticker(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲苏世;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-interface {v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    iget-object v0, v0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v0, Ltop/suzhelan/sticker/sdk/net/StickerResult;

    .line 589
    .line 590
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 591
    .line 592
    sget-object v2, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 593
    .line 594
    new-instance v3, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$4;

    .line 595
    .line 596
    iget-object v5, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 597
    .line 598
    invoke-direct {v3, v0, v5, v12}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$4;-><init>(Ltop/suzhelan/sticker/sdk/net/StickerResult;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 599
    .line 600
    .line 601
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 602
    .line 603
    iput-object v10, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 604
    .line 605
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 606
    .line 607
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$3:Ljava/lang/Object;

    .line 608
    .line 609
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$4:Ljava/lang/Object;

    .line 610
    .line 611
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$5:Ljava/lang/Object;

    .line 612
    .line 613
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$6:Ljava/lang/Object;

    .line 614
    .line 615
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$7:Ljava/lang/Object;

    .line 616
    .line 617
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$8:Ljava/lang/Object;

    .line 618
    .line 619
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$9:Ljava/lang/Object;

    .line 620
    .line 621
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$10:Ljava/lang/Object;

    .line 622
    .line 623
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$11:Ljava/lang/Object;

    .line 624
    .line 625
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$12:Ljava/lang/Object;

    .line 626
    .line 627
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$13:Ljava/lang/Object;

    .line 628
    .line 629
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$14:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$15:Ljava/lang/Object;

    .line 632
    .line 633
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$16:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$17:Ljava/lang/Object;

    .line 636
    .line 637
    iput v7, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 638
    .line 639
    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 643
    if-ne v0, v4, :cond_17

    .line 644
    .line 645
    goto/16 :goto_f

    .line 646
    .line 647
    :cond_17
    move-object v2, v10

    .line 648
    :goto_b
    :try_start_8
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 649
    .line 650
    .line 651
    return-object v11

    .line 652
    :goto_c
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 653
    .line 654
    .line 655
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 656
    :catchall_2
    move-exception v0

    .line 657
    move-object v2, v0

    .line 658
    :try_start_9
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 659
    :catchall_3
    move-exception v0

    .line 660
    :try_start_a
    invoke-static {v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 661
    .line 662
    .line 663
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 664
    :catch_1
    move-exception v0

    .line 665
    :try_start_b
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    .line 666
    .line 667
    .line 668
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 669
    .line 670
    sget-object v2, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 671
    .line 672
    new-instance v3, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$2;

    .line 673
    .line 674
    iget-object v5, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 675
    .line 676
    invoke-direct {v3, v5, v0, v12}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$2;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Ljava/lang/Exception;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 677
    .line 678
    .line 679
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 680
    .line 681
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 682
    .line 683
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 684
    .line 685
    iput v9, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 686
    .line 687
    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    if-ne v0, v4, :cond_19

    .line 692
    .line 693
    goto :goto_f

    .line 694
    :cond_18
    :goto_d
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 695
    .line 696
    sget-object v0, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 697
    .line 698
    new-instance v2, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$1;

    .line 699
    .line 700
    iget-object v3, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 701
    .line 702
    invoke-direct {v2, v3, v12}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$1;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 703
    .line 704
    .line 705
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 706
    .line 707
    iput v10, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 708
    .line 709
    invoke-static {v0, v2, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 713
    if-ne v0, v4, :cond_19

    .line 714
    .line 715
    goto :goto_f

    .line 716
    :goto_e
    const-string v2, "StickerUploader"

    .line 717
    .line 718
    const-string v3, "upload error"

    .line 719
    .line 720
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 721
    .line 722
    .line 723
    sget-object v2, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 724
    .line 725
    sget-object v2, Lkotlinx/coroutines/internal/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲兰子楪/飘花落叶言子楪世哲兰苏;

    .line 726
    .line 727
    new-instance v3, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$5;

    .line 728
    .line 729
    iget-object v5, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->$onEnd:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 730
    .line 731
    invoke-direct {v3, v5, v0, v12}, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1$5;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Ljava/lang/Exception;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 732
    .line 733
    .line 734
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$0:Ljava/lang/Object;

    .line 735
    .line 736
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$1:Ljava/lang/Object;

    .line 737
    .line 738
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$2:Ljava/lang/Object;

    .line 739
    .line 740
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$3:Ljava/lang/Object;

    .line 741
    .line 742
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$4:Ljava/lang/Object;

    .line 743
    .line 744
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$5:Ljava/lang/Object;

    .line 745
    .line 746
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$6:Ljava/lang/Object;

    .line 747
    .line 748
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$7:Ljava/lang/Object;

    .line 749
    .line 750
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$8:Ljava/lang/Object;

    .line 751
    .line 752
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$9:Ljava/lang/Object;

    .line 753
    .line 754
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$10:Ljava/lang/Object;

    .line 755
    .line 756
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$11:Ljava/lang/Object;

    .line 757
    .line 758
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$12:Ljava/lang/Object;

    .line 759
    .line 760
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$13:Ljava/lang/Object;

    .line 761
    .line 762
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$14:Ljava/lang/Object;

    .line 763
    .line 764
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$15:Ljava/lang/Object;

    .line 765
    .line 766
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$16:Ljava/lang/Object;

    .line 767
    .line 768
    iput-object v12, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->L$17:Ljava/lang/Object;

    .line 769
    .line 770
    const/4 v5, 0x5

    .line 771
    iput v5, v1, Ltop/suzhelan/sticker/sdk/presenter/StickerUploader$upload$1;->label:I

    .line 772
    .line 773
    invoke-static {v2, v3, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    if-ne v0, v4, :cond_19

    .line 778
    .line 779
    :goto_f
    return-object v4

    .line 780
    :cond_19
    :goto_10
    return-object v11
.end method
