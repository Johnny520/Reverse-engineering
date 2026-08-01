.class final Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1"
    f = "ByteChannelUtils.kt"
    l = {
        0x16,
        0x18,
        0x1a,
        0x1f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contentLength:Ljava/lang/Long;

.field final synthetic $listener:Lio/ktor/client/content/飘花落叶言子楪世苏哲兰;

.field final synthetic $this_observable:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

.field I$0:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/client/content/飘花落叶言子楪世苏哲兰;Ljava/lang/Long;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lio/ktor/client/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Ljava/lang/Long;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$this_observable:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$contentLength:Ljava/lang/Long;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
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
    new-instance v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$this_observable:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$contentLength:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, p0, p2}, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;-><init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/client/content/飘花落叶言子楪世苏哲兰;Ljava/lang/Long;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->label:I

    .line 6
    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x3

    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v2, :cond_7

    .line 13
    .line 14
    if-eq v2, v8, :cond_5

    .line 15
    .line 16
    if-eq v2, v7, :cond_3

    .line 17
    .line 18
    if-eq v2, v6, :cond_1

    .line 19
    .line 20
    if-ne v2, v5, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v9

    .line 43
    :cond_1
    iget-wide v10, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 44
    .line 45
    iget-object v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, [B

    .line 48
    .line 49
    iget-object v12, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v13, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v13, Ljava/lang/Long;

    .line 54
    .line 55
    iget-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 56
    .line 57
    if-nez v14, :cond_2

    .line 58
    .line 59
    iget-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    iget-object v15, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v15, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 66
    .line 67
    const-wide/16 v16, 0x0

    .line 68
    .line 69
    iget-object v3, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 72
    .line 73
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move-object v4, v12

    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :catchall_1
    move-exception v0

    .line 80
    move-object v1, v12

    .line 81
    :goto_0
    move-object v2, v15

    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_2
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 85
    .line 86
    .line 87
    return-object v9

    .line 88
    :cond_3
    iget v1, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->I$0:I

    .line 89
    .line 90
    iget-wide v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 91
    .line 92
    iget-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, [B

    .line 95
    .line 96
    iget-object v5, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v7, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Ljava/lang/Long;

    .line 101
    .line 102
    iget-object v8, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 107
    .line 108
    .line 109
    return-object v9

    .line 110
    :cond_4
    iget-object v8, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    iget-object v10, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v10, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 117
    .line 118
    iget-object v11, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 121
    .line 122
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 123
    .line 124
    .line 125
    move-object v15, v5

    .line 126
    move-object v5, v4

    .line 127
    move-object v4, v15

    .line 128
    move-object v15, v10

    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :catchall_2
    move-exception v0

    .line 132
    move-object v1, v5

    .line 133
    move-object v2, v10

    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :cond_5
    const-wide/16 v16, 0x0

    .line 137
    .line 138
    iget-wide v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 139
    .line 140
    iget-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v4, [B

    .line 143
    .line 144
    iget-object v10, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 145
    .line 146
    iget-object v11, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v11, Ljava/lang/Long;

    .line 149
    .line 150
    iget-object v12, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 151
    .line 152
    if-nez v12, :cond_6

    .line 153
    .line 154
    iget-object v12, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v12, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 157
    .line 158
    iget-object v13, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v13, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 161
    .line 162
    iget-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v14, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 165
    .line 166
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 167
    .line 168
    .line 169
    move-object v15, v13

    .line 170
    move-object v13, v11

    .line 171
    move-object/from16 v18, v12

    .line 172
    .line 173
    move-object/from16 v12, p1

    .line 174
    .line 175
    move-wide/from16 v19, v2

    .line 176
    .line 177
    move-object v2, v4

    .line 178
    move-object v4, v10

    .line 179
    move-object v3, v14

    .line 180
    move-wide/from16 v10, v19

    .line 181
    .line 182
    move-object/from16 v14, v18

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catchall_3
    move-exception v0

    .line 186
    move-object v1, v10

    .line 187
    move-object v2, v13

    .line 188
    goto/16 :goto_7

    .line 189
    .line 190
    :cond_6
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 191
    .line 192
    .line 193
    return-object v9

    .line 194
    :cond_7
    const-wide/16 v16, 0x0

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v3, v2

    .line 202
    check-cast v3, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 203
    .line 204
    sget-object v2, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/飘花落叶言子楪世兰苏哲;

    .line 205
    .line 206
    iget-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$this_observable:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 207
    .line 208
    iget-object v13, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->$contentLength:Ljava/lang/Long;

    .line 209
    .line 210
    invoke-virtual {v2}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    :try_start_4
    move-object v10, v4

    .line 215
    check-cast v10, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 216
    .line 217
    move-object v15, v2

    .line 218
    move-object v2, v10

    .line 219
    move-wide/from16 v10, v16

    .line 220
    .line 221
    :cond_8
    :goto_1
    :try_start_5
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    if-nez v12, :cond_b

    .line 226
    .line 227
    iput-object v3, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 228
    .line 229
    iput-object v15, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v13, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 240
    .line 241
    iput-wide v10, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 242
    .line 243
    iput v8, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->label:I

    .line 244
    .line 245
    array-length v12, v2

    .line 246
    invoke-static {v14, v2, v12, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;[BILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    if-ne v12, v1, :cond_9

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_9
    :goto_2
    check-cast v12, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    if-lez v12, :cond_8

    .line 260
    .line 261
    iget-object v5, v3, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 262
    .line 263
    iput-object v3, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v15, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v14, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v13, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 272
    .line 273
    iput-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 276
    .line 277
    iput-wide v10, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 278
    .line 279
    iput v12, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->I$0:I

    .line 280
    .line 281
    iput v7, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->label:I

    .line 282
    .line 283
    const/4 v7, 0x0

    .line 284
    invoke-static {v5, v2, v7, v12, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;[BIILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    if-ne v5, v1, :cond_a

    .line 289
    .line 290
    :goto_3
    return-object v1

    .line 291
    :cond_a
    move-object v5, v2

    .line 292
    move v1, v12

    .line 293
    move-object v7, v13

    .line 294
    move-object v8, v14

    .line 295
    move-wide/from16 v18, v10

    .line 296
    .line 297
    move-object v11, v3

    .line 298
    move-wide/from16 v2, v18

    .line 299
    .line 300
    :goto_4
    int-to-long v12, v1

    .line 301
    add-long/2addr v2, v12

    .line 302
    iput-object v11, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 303
    .line 304
    iput-object v15, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object v8, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v7, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 313
    .line 314
    iput-object v5, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 315
    .line 316
    iput-wide v2, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->J$0:J

    .line 317
    .line 318
    iput v6, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->label:I

    .line 319
    .line 320
    throw v9

    .line 321
    :catchall_4
    move-exception v0

    .line 322
    move-object v1, v4

    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :cond_b
    invoke-interface {v14}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v2, v3, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 330
    .line 331
    invoke-static {v2, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    if-nez v1, :cond_d

    .line 335
    .line 336
    cmp-long v1, v10, v16

    .line 337
    .line 338
    if-eqz v1, :cond_c

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_c
    iput-object v15, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$0:Ljava/lang/Object;

    .line 342
    .line 343
    iput-object v4, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$1:Ljava/lang/Object;

    .line 344
    .line 345
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$2:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$3:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$4:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$5:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v9, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->L$6:Ljava/lang/Object;

    .line 354
    .line 355
    iput v5, v0, Lio/ktor/client/utils/ByteChannelUtilsKt$observable$1;->label:I

    .line 356
    .line 357
    throw v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 358
    :cond_d
    :goto_5
    move-object v1, v4

    .line 359
    move-object v2, v15

    .line 360
    :goto_6
    invoke-interface {v2, v1}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 364
    .line 365
    return-object v0

    .line 366
    :catchall_5
    move-exception v0

    .line 367
    move-object v1, v4

    .line 368
    :goto_7
    invoke-interface {v2, v1}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    throw v0
.end method
