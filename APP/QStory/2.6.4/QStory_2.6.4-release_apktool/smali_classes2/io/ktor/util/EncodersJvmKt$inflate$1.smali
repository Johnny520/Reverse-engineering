.class final Lio/ktor/util/EncodersJvmKt$inflate$1;
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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.util.EncodersJvmKt$inflate$1"
    f = "EncodersJvm.kt"
    l = {
        0x4e,
        0x5f,
        0x60,
        0x6a,
        0x71,
        0x77,
        0x83
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $gzip:Z

.field final synthetic $source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

.field B$0:B

.field B$1:B

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field S$0:S

.field label:I


# direct methods
.method public constructor <init>(ZLio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/util/EncodersJvmKt$inflate$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$gzip:Z

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance v0, Lio/ktor/util/EncodersJvmKt$inflate$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$gzip:Z

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, Lio/ktor/util/EncodersJvmKt$inflate$1;-><init>(ZLio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lio/ktor/util/EncodersJvmKt$inflate$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/util/EncodersJvmKt$inflate$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/util/EncodersJvmKt$inflate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lio/ktor/util/EncodersJvmKt$inflate$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v6, 0x8

    .line 10
    .line 11
    packed-switch v2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v4

    .line 20
    :pswitch_0
    iget v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->I$0:I

    .line 21
    .line 22
    iget-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$6:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 25
    .line 26
    iget-object v4, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Lkotlin/jvm/internal/Ref$IntRef;

    .line 29
    .line 30
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, Ljava/util/zip/CRC32;

    .line 33
    .line 34
    iget-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v8, Ljava/util/zip/Inflater;

    .line 37
    .line 38
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    iget-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v10, Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iget-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v11, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 49
    .line 50
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    move-object v5, v4

    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    goto/16 :goto_c

    .line 57
    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_e

    .line 60
    .line 61
    :pswitch_1
    iget v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->I$0:I

    .line 62
    .line 63
    iget-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$6:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 66
    .line 67
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    .line 70
    .line 71
    iget-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Ljava/util/zip/CRC32;

    .line 74
    .line 75
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ljava/util/zip/Inflater;

    .line 78
    .line 79
    iget-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    iget-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    iget-object v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 90
    .line 91
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    move-object/from16 v5, p1

    .line 95
    .line 96
    move-object v15, v4

    .line 97
    goto/16 :goto_9

    .line 98
    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object v8, v9

    .line 101
    move-object v9, v10

    .line 102
    move-object v10, v11

    .line 103
    goto/16 :goto_e

    .line 104
    .line 105
    :pswitch_2
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lkotlin/jvm/internal/Ref$IntRef;

    .line 108
    .line 109
    iget-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ljava/util/zip/CRC32;

    .line 112
    .line 113
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v8, v7

    .line 116
    check-cast v8, Ljava/util/zip/Inflater;

    .line 117
    .line 118
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v9, v7

    .line 121
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v10, v7

    .line 126
    check-cast v10, Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 131
    .line 132
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    move-object v15, v4

    .line 136
    move-object/from16 v4, p1

    .line 137
    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :pswitch_3
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, Ljava/util/zip/CRC32;

    .line 143
    .line 144
    iget-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Ljava/util/zip/Inflater;

    .line 147
    .line 148
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    iget-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 155
    .line 156
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v9, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 159
    .line 160
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object v15, v4

    .line 164
    goto/16 :goto_4

    .line 165
    .line 166
    :pswitch_4
    iget-byte v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$1:B

    .line 167
    .line 168
    iget-byte v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$0:B

    .line 169
    .line 170
    iget-short v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->S$0:S

    .line 171
    .line 172
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v9, Ljava/util/zip/CRC32;

    .line 175
    .line 176
    iget-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v10, Ljava/util/zip/Inflater;

    .line 179
    .line 180
    iget-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 183
    .line 184
    iget-object v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v12, Ljava/nio/ByteBuffer;

    .line 187
    .line 188
    iget-object v13, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 191
    .line 192
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move/from16 v17, v3

    .line 196
    .line 197
    move-object v15, v4

    .line 198
    goto/16 :goto_2

    .line 199
    .line 200
    :pswitch_5
    iget-byte v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$1:B

    .line 201
    .line 202
    iget-byte v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$0:B

    .line 203
    .line 204
    iget-short v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->S$0:S

    .line 205
    .line 206
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v9, Ljava/util/zip/CRC32;

    .line 209
    .line 210
    iget-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v10, Ljava/util/zip/Inflater;

    .line 213
    .line 214
    iget-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 217
    .line 218
    iget-object v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v12, Ljava/nio/ByteBuffer;

    .line 221
    .line 222
    iget-object v13, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v13, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 225
    .line 226
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    move v14, v2

    .line 230
    move-object v15, v4

    .line 231
    move-object/from16 v2, p1

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_6
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, Ljava/util/zip/CRC32;

    .line 238
    .line 239
    iget-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v7, Ljava/util/zip/Inflater;

    .line 242
    .line 243
    iget-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    iget-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 250
    .line 251
    iget-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 254
    .line 255
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object v11, v2

    .line 259
    move-object/from16 v2, p1

    .line 260
    .line 261
    goto :goto_0

    .line 262
    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 266
    .line 267
    move-object v10, v2

    .line 268
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 269
    .line 270
    sget-object v2, Lio/ktor/util/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 271
    .line 272
    invoke-virtual {v2}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪哲兰()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    move-object v9, v7

    .line 277
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 278
    .line 279
    invoke-virtual {v2}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪哲兰()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object v8, v2

    .line 284
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 285
    .line 286
    new-instance v7, Ljava/util/zip/Inflater;

    .line 287
    .line 288
    const/4 v2, 0x1

    .line 289
    invoke-direct {v7, v2}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 290
    .line 291
    .line 292
    new-instance v11, Ljava/util/zip/CRC32;

    .line 293
    .line 294
    invoke-direct {v11}, Ljava/util/zip/CRC32;-><init>()V

    .line 295
    .line 296
    .line 297
    iget-boolean v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$gzip:Z

    .line 298
    .line 299
    if-eqz v12, :cond_9

    .line 300
    .line 301
    iget-object v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 302
    .line 303
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 312
    .line 313
    iput v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 314
    .line 315
    const/16 v2, 0xa

    .line 316
    .line 317
    invoke-static {v12, v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-ne v2, v1, :cond_0

    .line 322
    .line 323
    goto/16 :goto_b

    .line 324
    .line 325
    :cond_0
    :goto_0
    check-cast v2, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-interface {v2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->readShort()S

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    const v13, 0xff00

    .line 342
    .line 343
    .line 344
    and-int/2addr v13, v12

    .line 345
    ushr-int/2addr v13, v6

    .line 346
    and-int/lit16 v12, v12, 0xff

    .line 347
    .line 348
    shl-int/2addr v12, v6

    .line 349
    or-int/2addr v12, v13

    .line 350
    int-to-short v12, v12

    .line 351
    invoke-interface {v2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    .line 352
    .line 353
    .line 354
    move-result v13

    .line 355
    invoke-interface {v2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    move-object v15, v4

    .line 360
    const-wide v4, 0x7fffffffffffffffL

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    invoke-static {v2, v4, v5}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;J)J

    .line 366
    .line 367
    .line 368
    and-int/lit8 v2, v14, 0x4

    .line 369
    .line 370
    if-eqz v2, :cond_3

    .line 371
    .line 372
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 373
    .line 374
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 377
    .line 378
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 383
    .line 384
    iput-short v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->S$0:S

    .line 385
    .line 386
    iput-byte v13, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$0:B

    .line 387
    .line 388
    iput-byte v14, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$1:B

    .line 389
    .line 390
    iput v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 391
    .line 392
    invoke-static {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    if-ne v2, v1, :cond_1

    .line 397
    .line 398
    goto/16 :goto_b

    .line 399
    .line 400
    :cond_1
    move-object/from16 v18, v10

    .line 401
    .line 402
    move-object v10, v7

    .line 403
    move v7, v13

    .line 404
    move-object/from16 v13, v18

    .line 405
    .line 406
    move-object/from16 v18, v11

    .line 407
    .line 408
    move-object v11, v8

    .line 409
    move v8, v12

    .line 410
    move-object v12, v9

    .line 411
    move-object/from16 v9, v18

    .line 412
    .line 413
    :goto_1
    check-cast v2, Ljava/lang/Number;

    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    int-to-long v4, v2

    .line 420
    iget-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 421
    .line 422
    iput-object v13, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v12, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 425
    .line 426
    iput-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 429
    .line 430
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 431
    .line 432
    iput-short v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->S$0:S

    .line 433
    .line 434
    iput-byte v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$0:B

    .line 435
    .line 436
    iput-byte v14, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->B$1:B

    .line 437
    .line 438
    move/from16 v17, v3

    .line 439
    .line 440
    const/4 v3, 0x3

    .line 441
    iput v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 442
    .line 443
    invoke-static {v2, v4, v5, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    if-ne v2, v1, :cond_2

    .line 448
    .line 449
    goto/16 :goto_b

    .line 450
    .line 451
    :cond_2
    move v2, v14

    .line 452
    :goto_2
    move-object v3, v12

    .line 453
    move v12, v8

    .line 454
    move-object v8, v3

    .line 455
    move v14, v2

    .line 456
    move-object v2, v9

    .line 457
    move-object v3, v10

    .line 458
    move-object v9, v13

    .line 459
    move v13, v7

    .line 460
    move-object v7, v11

    .line 461
    goto :goto_3

    .line 462
    :cond_3
    move/from16 v17, v3

    .line 463
    .line 464
    move-object v3, v7

    .line 465
    move-object v7, v8

    .line 466
    move-object v8, v9

    .line 467
    move-object v9, v10

    .line 468
    move-object v2, v11

    .line 469
    :goto_3
    const/16 v4, -0x74e1

    .line 470
    .line 471
    if-ne v12, v4, :cond_8

    .line 472
    .line 473
    if-ne v13, v6, :cond_7

    .line 474
    .line 475
    and-int/lit8 v4, v14, 0x8

    .line 476
    .line 477
    if-nez v4, :cond_6

    .line 478
    .line 479
    and-int/lit8 v4, v14, 0x10

    .line 480
    .line 481
    if-nez v4, :cond_5

    .line 482
    .line 483
    and-int/lit8 v4, v14, 0x2

    .line 484
    .line 485
    if-eqz v4, :cond_4

    .line 486
    .line 487
    iget-object v4, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 488
    .line 489
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 490
    .line 491
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 492
    .line 493
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 494
    .line 495
    iput-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 496
    .line 497
    iput-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 498
    .line 499
    const/4 v5, 0x4

    .line 500
    iput v5, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 501
    .line 502
    const-wide/16 v10, 0x2

    .line 503
    .line 504
    invoke-static {v4, v10, v11, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    if-ne v4, v1, :cond_4

    .line 509
    .line 510
    goto/16 :goto_b

    .line 511
    .line 512
    :cond_4
    :goto_4
    move-object v11, v2

    .line 513
    move-object v2, v8

    .line 514
    move-object v10, v9

    .line 515
    move-object v8, v3

    .line 516
    move-object v9, v7

    .line 517
    goto :goto_5

    .line 518
    :cond_5
    const-string v0, "Gzip file comment not supported"

    .line 519
    .line 520
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    return-object v15

    .line 524
    :cond_6
    const-string v0, "Gzip file name not supported"

    .line 525
    .line 526
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    return-object v15

    .line 530
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 531
    .line 532
    const-string v1, "Deflater method unsupported: "

    .line 533
    .line 534
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    const/16 v1, 0x2e

    .line 541
    .line 542
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v1

    .line 559
    :cond_8
    const-string v0, "GZIP magic invalid: "

    .line 560
    .line 561
    invoke-static {v12, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v15

    .line 569
    :cond_9
    move-object v15, v4

    .line 570
    move-object v2, v9

    .line 571
    move-object v9, v8

    .line 572
    move-object v8, v7

    .line 573
    :goto_5
    :try_start_3
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 574
    .line 575
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 576
    .line 577
    .line 578
    move-object v7, v10

    .line 579
    move-object v10, v2

    .line 580
    move-object v2, v3

    .line 581
    move-object v3, v11

    .line 582
    :cond_a
    :goto_6
    :try_start_4
    iget-object v4, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 583
    .line 584
    invoke-interface {v4}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 585
    .line 586
    .line 587
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 588
    iget-object v5, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$source:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 589
    .line 590
    if-nez v4, :cond_e

    .line 591
    .line 592
    :try_start_5
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 593
    .line 594
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 595
    .line 596
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 597
    .line 598
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 599
    .line 600
    iput-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 601
    .line 602
    iput-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 603
    .line 604
    iput-object v15, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$6:Ljava/lang/Object;

    .line 605
    .line 606
    const/4 v4, 0x5

    .line 607
    iput v4, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 608
    .line 609
    invoke-static {v5, v10, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    if-ne v4, v1, :cond_b

    .line 614
    .line 615
    goto/16 :goto_b

    .line 616
    .line 617
    :cond_b
    :goto_7
    check-cast v4, Ljava/lang/Number;

    .line 618
    .line 619
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    if-lez v4, :cond_a

    .line 624
    .line 625
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    .line 637
    .line 638
    .line 639
    move-result v11

    .line 640
    invoke-virtual {v8, v4, v5, v11}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 641
    .line 642
    .line 643
    :goto_8
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    if-nez v4, :cond_d

    .line 648
    .line 649
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->finished()Z

    .line 650
    .line 651
    .line 652
    move-result v4

    .line 653
    if-nez v4, :cond_d

    .line 654
    .line 655
    iget v4, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 656
    .line 657
    iget-object v5, v7, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 658
    .line 659
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 660
    .line 661
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 662
    .line 663
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 664
    .line 665
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 666
    .line 667
    iput-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 668
    .line 669
    iput-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 670
    .line 671
    iput-object v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$6:Ljava/lang/Object;

    .line 672
    .line 673
    iput v4, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->I$0:I

    .line 674
    .line 675
    const/4 v11, 0x6

    .line 676
    iput v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 677
    .line 678
    invoke-static {v8, v5, v9, v3, v0}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/zip/Inflater;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Ljava/util/zip/CRC32;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 682
    if-ne v5, v1, :cond_c

    .line 683
    .line 684
    goto/16 :goto_b

    .line 685
    .line 686
    :cond_c
    move-object v12, v7

    .line 687
    move-object v11, v10

    .line 688
    move-object v7, v2

    .line 689
    move-object v10, v9

    .line 690
    move v2, v4

    .line 691
    move-object v9, v8

    .line 692
    move-object v8, v3

    .line 693
    move-object v3, v7

    .line 694
    :goto_9
    :try_start_6
    check-cast v5, Ljava/lang/Number;

    .line 695
    .line 696
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    add-int/2addr v2, v4

    .line 701
    iput v2, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 702
    .line 703
    invoke-virtual {v11}, Ljava/nio/Buffer;->limit()I

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 708
    .line 709
    .line 710
    move-result v3

    .line 711
    sub-int/2addr v2, v3

    .line 712
    invoke-virtual {v11, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 713
    .line 714
    .line 715
    move-object v2, v7

    .line 716
    move-object v3, v8

    .line 717
    move-object v8, v9

    .line 718
    move-object v9, v10

    .line 719
    move-object v10, v11

    .line 720
    move-object v7, v12

    .line 721
    goto :goto_8

    .line 722
    :cond_d
    :try_start_7
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 723
    .line 724
    .line 725
    goto/16 :goto_6

    .line 726
    .line 727
    :cond_e
    invoke-interface {v5}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    if-nez v4, :cond_16

    .line 732
    .line 733
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 734
    .line 735
    .line 736
    move-object v11, v7

    .line 737
    move-object v7, v3

    .line 738
    move-object v3, v2

    .line 739
    :goto_a
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->finished()Z

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    if-nez v2, :cond_10

    .line 744
    .line 745
    iget v2, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 746
    .line 747
    iget-object v4, v11, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 748
    .line 749
    iput-object v11, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$0:Ljava/lang/Object;

    .line 750
    .line 751
    iput-object v10, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$1:Ljava/lang/Object;

    .line 752
    .line 753
    iput-object v9, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$2:Ljava/lang/Object;

    .line 754
    .line 755
    iput-object v8, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$3:Ljava/lang/Object;

    .line 756
    .line 757
    iput-object v7, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$4:Ljava/lang/Object;

    .line 758
    .line 759
    iput-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$5:Ljava/lang/Object;

    .line 760
    .line 761
    iput-object v3, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->L$6:Ljava/lang/Object;

    .line 762
    .line 763
    iput v2, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->I$0:I

    .line 764
    .line 765
    const/4 v5, 0x7

    .line 766
    iput v5, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->label:I

    .line 767
    .line 768
    invoke-static {v8, v4, v9, v7, v0}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/zip/Inflater;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Ljava/util/zip/CRC32;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    if-ne v4, v1, :cond_f

    .line 773
    .line 774
    :goto_b
    return-object v1

    .line 775
    :cond_f
    move-object v5, v3

    .line 776
    :goto_c
    check-cast v4, Ljava/lang/Number;

    .line 777
    .line 778
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    add-int/2addr v2, v4

    .line 783
    iput v2, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 784
    .line 785
    invoke-virtual {v10}, Ljava/nio/Buffer;->limit()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    sub-int/2addr v2, v3

    .line 794
    invoke-virtual {v10, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 795
    .line 796
    .line 797
    move-object v3, v5

    .line 798
    goto :goto_a

    .line 799
    :cond_10
    iget-boolean v0, v0, Lio/ktor/util/EncodersJvmKt$inflate$1;->$gzip:Z

    .line 800
    .line 801
    if-eqz v0, :cond_14

    .line 802
    .line 803
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    .line 804
    .line 805
    .line 806
    move-result v0

    .line 807
    if-ne v0, v6, :cond_13

    .line 808
    .line 809
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 810
    .line 811
    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 823
    .line 824
    .line 825
    move-result v1

    .line 826
    const/16 v16, 0x4

    .line 827
    .line 828
    add-int/lit8 v1, v1, 0x4

    .line 829
    .line 830
    invoke-virtual {v10, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    invoke-virtual {v7}, Ljava/util/zip/CRC32;->getValue()J

    .line 835
    .line 836
    .line 837
    move-result-wide v4

    .line 838
    long-to-int v2, v4

    .line 839
    if-ne v2, v0, :cond_12

    .line 840
    .line 841
    iget v0, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 842
    .line 843
    if-ne v0, v1, :cond_11

    .line 844
    .line 845
    goto :goto_d

    .line 846
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 847
    .line 848
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 849
    .line 850
    .line 851
    const-string v2, "Gzip size invalid. Expected "

    .line 852
    .line 853
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 857
    .line 858
    .line 859
    const-string v1, ", actual "

    .line 860
    .line 861
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    iget v1, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 865
    .line 866
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    throw v1

    .line 883
    :cond_12
    const-string v0, "Gzip checksum invalid."

    .line 884
    .line 885
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 886
    .line 887
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    throw v1

    .line 891
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 892
    .line 893
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 894
    .line 895
    .line 896
    const-string v1, "Expected 8 bytes in the trailer. Actual: "

    .line 897
    .line 898
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    const-string v1, " $"

    .line 909
    .line 910
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 918
    .line 919
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    throw v1

    .line 927
    :cond_14
    invoke-virtual {v10}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 928
    .line 929
    .line 930
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 931
    if-nez v0, :cond_15

    .line 932
    .line 933
    :goto_d
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->end()V

    .line 934
    .line 935
    .line 936
    sget-object v0, Lio/ktor/util/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 937
    .line 938
    invoke-virtual {v0, v10}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v0, v9}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 945
    .line 946
    return-object v0

    .line 947
    :cond_15
    :try_start_8
    const-string v0, "Check failed."

    .line 948
    .line 949
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 950
    .line 951
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    throw v1

    .line 955
    :cond_16
    throw v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 956
    :catchall_2
    move-exception v0

    .line 957
    move-object v10, v2

    .line 958
    :goto_e
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 959
    :catchall_3
    move-exception v0

    .line 960
    invoke-virtual {v8}, Ljava/util/zip/Inflater;->end()V

    .line 961
    .line 962
    .line 963
    sget-object v1, Lio/ktor/util/cio/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 964
    .line 965
    invoke-virtual {v1, v10}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1, v9}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    throw v0

    .line 972
    nop

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
